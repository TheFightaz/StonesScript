#=========================================#
#=====SK/PL WYKONANY PRZEZ THEFIGHTAZ=====#
#==========ZAKAZ KOPIOWANIA!==============#
#=========COPYRIGHT 2021©=================#
#=========================================#



#OPTIONS FOR CRAFTING / DO NOT TOUCH
options:
    C1: stone       #NEED X1 STONE TO CRAFT / CRAFT 1 IN CRAFTING
    C2: stone       #NEED X1 STONE TO CRAFT / CRAFT 2 IN CRAFTING
    C3: stone       #NEED X1 STONE TO CRAFT / CRAFT 3 IN CRAFTING
    C4: redstone        #NEED X1 REDSTONE TO CRAFT / CRAFT 4 IN CRAFTING
    C5: piston      #NEED X1 PISTON TO CRAFT / CRAFT 5 IN CRAFTING
    C6: redstone        #NEED X1 REDSTONE TO CRAFT / CRAFT 6 IN CRAFTING
    C7: stone       #NEED X1 STONE TO CRAFT / CRAFT 7 IN CRAFTING
    C8: stone       #NEED X1 STONE TO CRAFT / CRAFT 8 IN CRAFTING
    C9: stone       #NEED X1 STONE TO CRAFT / CRAFT 9 IN CRAFTING
        #ALL CRAFTING ITEMS GIVE 1 STONE BREAKER NAMED "STONIARKA"

 #CRAFTING SLOTS
    # # # # # # #  # # # # # # #
    #        |        |        #
    # craft1 | craft2 | craft3 #
    #________|________|________#
    #        |        |        #
    # craft4 | craft5 | craft6 #
    #________|________|________#
    #        |        |        #
    # craft7 | craft8 | craft9 #
    #        |        |        #
    # # # # # # #  # # # # # # #

#OPTIONS FOR SHORTCOUTS / DO NOT TOUCH!
    tag: &4&lTheFightaz&6&lStoniarki&f&l|        #TAG FOR GUI 
    stn: &a&lStoniarka &8[&cLV&7.&c1&8]     #NAME OF STONE BREAKER LV1
    stn2: &a&lStoniarka &8[&cLV&7.&c2&8]     #NAME OF STONE BREAKER LV2
    stn3: &a&lStoniarka &8[&cLV&7.&c3&8]     #NAME OF STONE BREAKER LV3
    stn4: &a&lStoniarka &8[&cLV&7.&c4&8]     #NAME OF STONE BREAKER LV4
    l1: &c» &a| &7Postaw na ziemi!      #FIRST LORE
    l2: &c» &a| &7Dostępny drop znajdziesz      #SECOND LORE
    l3: &c» &a| &7Pod komendą &a/stoniarka       #THIRD LORE

#OPTIONS FOR UPGRADE PRICES - NEED TO EDIT BY OWNER (PL: EDYTUJ TO SOBIE POD SIEBIE, CENY USTALASZ TY ZMIENIAJĄC TYLKO "10")
    CenaLV2: 10
    CenaLV3: 10
    CenaLV4: 10

#OPTIONS FOR DROP FROM STONE BREAKER (PL: EDYTUJ TO POD SIEBIE, WSZĘDZIE GDZIE JEST 10.0 USTAW SZANSE JAKĄ CHCESZ, LICZYSZ TO W PROCENTACH)
        #LEVEL 1
    dropZelazoLV1: 10.0%
    dropZlotoLV1: 10.0%
    dropLapisLV1: 10.0%
    dropRedstoneLV1: 10.0%
    dropDiamentLV1: 10.0%
    dropEmeraldLV1: 10.0%
        #LEVEL 2
    dropZelazoLV2: 10.0%
    dropZlotoLV2: 10.0%
    dropLapisLV2: 10.0%
    dropRedstoneLV2: 10.0%
    dropDiamentLV2: 10.0%
    dropEmeraldLV2: 10.0%
        #LEVEL 3
    dropZelazoLV3: 10.0%
    dropZlotoLV3: 10.0%
    dropLapisLV3: 10.0%
    dropRedstoneLV3: 10.0%
    dropDiamentLV3: 10.0%
    dropEmeraldLV3: 10.0%
        #LEVEL 4 
    dropZelazoLV4: 10.0%
    dropZlotoLV4: 10.0%
    dropLapisLV4: 10.0%
    dropRedstoneLV4: 10.0%
    dropDiamentLV4: 10.0%
    dropEmeraldLV4: 10.0%
#OPTIONS FOR DESCROPTION / NEED TO EDIT (PL: EDYTUJ TO TAK SAMO JAK WYZEJ, ZMIENIA TO OPIS W GUI / MUSI BYC OSOBNO, BO ZNAK "%" NIE LAPIE W GUI)
        #LEVEL 1
    dropZelazoLV1_opis: 10.0
    dropZlotoLV1_opis: 10.0
    dropLapisLV1_opis: 10.0
    dropRedstoneLV1_opis: 10.0
    dropDiamentLV1_opis: 10.0
    dropEmeraldLV1_opis: 10.0
        #LEVEL 2
    dropZelazoLV2_opis: 10.0
    dropZlotoLV2_opis: 10.0
    dropLapisLV2_opis: 10.0
    dropRedstoneLV2_opis: 10.0
    dropDiamentLV2_opis: 10.0
    dropEmeraldLV2_opis: 10.0
        #LEVEL 3
    dropZelazoLV3_opis: 10.0
    dropZlotoLV3_opis: 10.0
    dropLapisLV3_opis: 10.0
    dropRedstoneLV3_opis: 10.0
    dropDiamentLV3_opis: 10.0
    dropEmeraldLV3_opis: 10.0
        #LEVEL 4 
    dropZelazoLV4_opis: 10.0
    dropZlotoLV4_opis: 10.0
    dropLapisLV4_opis: 10.0
    dropRedstoneLV4_opis: 10.0
    dropDiamentLV4_opis: 10.0
    dropEmeraldLV4_opis: 10.0

#OPTIONS FOR STONE BREAKER CALLED "STONIARKA"
    stone: stone        #BLOCK WHICH SPAWN ABOVE END STONE
    sc: 2       #SECCONDS PER SPAWN STONE ABOVE END STONE

#VARIABLES FOR SCRIPT / DO NOT TOUCH
variables:
    stnGetLV2.%player% = "&cNie"
    stnGetLV3.%player% = "&cNie"
    stnGetLV4.%player% = "&cNie"

#NEW SCHEMATIC RECIPE ON SCRIPT LOAD
on load:
    register new shapeless recipe for end stone named "{@stn}" with lore "{@l1}" and "{@l2}" and "{@l3}" using {@C1}, {@C2}, {@C3}, {@C4}, {@C5}, {@C6}, {@C7}, {@C8}, {@C9}

#GUI COMMANDS
command /stoniarka:
    trigger:
        open chest inventory named "{@tag} &8| &cStoniarki" with 3 rows to player
        wait 2 tick
        set slot (integers between 0 to 10) and 12,14 and (integers between 16 to 27) of player's current inventory to red stained glass pane
        set slot 11 of player's current inventory to end stone named "&7Crafting &cStoniarek" with lore "&c» &a| &7Kliknij zeby zobaczyc" and "&c» &a| &7crafting &6Stoniarek"
        set slot 13 of player's current inventory to redstone named "&7Drop ze &cStoniarek" with lore "&c» &a| &7Kliknij i zobacz" and "&c» &a| &7aktualny drop ze &cStoniarek"
        set slot 15 of player's current inventory to diamond named "&7Ulepszenia &cStoniarek" with lore "&c» &a| &7Kliknij i zobacz" and "&c» &a| &7dostępne ulepszenia &cStoniarek"
#CRAFTING GUI
on inventory click:
    if clicked inventory is not player's inventory:
        if name of player's current inventory is "{@tag} &8| &cStoniarki":
            clicked slot is 11:
                open chest inventory named "{@tag} &8| &cCrafting Stoniarek" with 5 rows to player
                wait 2 tick
                set slot (integers between 0 to 9) and 13, 17, 18, 26, 27, 31, 35 and (integers between 36 to 44) of player's current inventory to red stained glass pane named "" with lore ""  #RED GLASS OUTSIDE GUI
                set slot 22 of player's current inventory to ("MHF_ArrowRight" parsed as offline player)'s skull named "&b&l---->"
                set slot (integers between 10 to 12) of player's current inventory to stone named "&aX1"
                set slot 19 and 21 of player's current inventory to redstone named "&cX1"
                set slot 20 of player's current inventory to piston named "&6X1"
                set slot (integers between 28 to 30) of player's current inventory to stone named "&aX1"
                set slot (integers between 14 to 16) of player's current inventory to lime stained glass pane
                set slot 23 and 25 of player's current inventory to lime stained glass pane
                set slot (integers between 32 to 34) of player's current inventory to lime stained glass pane
                set slot 24 of player's current inventory to end stone named "{@stn}" with lore "{@l1}" and "{@l2}" and "{@l3}"
                set slot 44 of player's current inventory to ("MHF_ArrowRight" parsed as offline player)'s skull named "&cPowrót" with lore "&c» &a| &7Kliknij aby powrócic!"
#UPGRADE GUI
on inventory click:
    if clicked inventory is not player's inventory:
        if name of player's current inventory is "{@tag} &8| &cStoniarki":
            clicked slot is 15:
                open chest inventory named "{@tag} &8| &aUlepszenia &cStoniarek" with 1 rows to player
                wait 2 tick
                set slot (integers between 0 to 1) and 3,5 and 7 of player's current inventory to red stained glass pane
                set slot 2 of player's current inventory to end stone named "{@stn2}" with lore "&c» &a| &7Kliknij aby zakupić!" and "&c» &a| &7Otrzymasz ulepszenie do &cstoniarki" and "" and "&c» &a| &7Koszt &c» &a{@CenaLV2}" and "" and "&c» &a| &7Zyskasz:" and "&c» &a| &7Zelazo &b» &a{@dropZelazoLV2_opis}&c%%" and "&c» &a| &7Złoto &b» &a{@dropZlotoLV2_opis}&c%%" and "&c» &a| &7Lapis &b» &a{@dropLapisLV2_opis}&c%%" and "&c» &a| &7Redstone &b» &a{@dropRedstoneLV2_opis}&c%%" and "&c» &a| &7Diament &b» &a{@dropDiamentLV2_opis}&c%%" and "&c» &a| &7Emerald &b» &a{@dropEmeraldLV2_opis}&c%%" and "" and "&c» &a| &7Posiadane &b» %{stnGetLV2.%player%}%"
                set slot 4 of player's current inventory to end stone named "{@stn3}" with lore "&c» &a| &7Kliknij aby zakupić!" and "&c» &a| &7Otrzymasz ulepszenie do &cstoniarki" and "" and "&c» &a| &7Koszt &c» &a{@CenaLV3}" and "" and "&c» &a| &7Zyskasz:" and "&c» &a| &7Zelazo &b» &a{@dropZelazoLV3_opis}&c%%" and "&c» &a| &7Złoto &b» &a{@dropZlotoLV3_opis}&c%%" and "&c» &a| &7Lapis &b» &a{@dropLapisLV3_opis}&c%%" and "&c» &a| &7Redstone &b» &a{@dropRedstoneLV3_opis}&c%%" and "&c» &a| &7Diament &b» &a{@dropDiamentLV3_opis}&c%%" and "&c» &a| &7Emerald &b» &a{@dropEmeraldLV3_opis}&c%%" and "" and "&c» &a| &7Posiadane &b» %{stnGetLV3.%player%}%"
                set slot 6 of player's current inventory to end stone named "{@stn4}" with lore "&c» &a| &7Kliknij aby zakupić!" and "&c» &a| &7Otrzymasz ulepszenie do &cstoniarki" and "" and "&c» &a| &7Koszt &c» &a{@CenaLV4}" and "" and "&c» &a| &7Zyskasz:" and "&c» &a| &7Zelazo &b» &a{@dropZelazoLV4_opis}&c%%" and "&c» &a| &7Złoto &b» &a{@dropZlotoLV4_opis}&c%%" and "&c» &a| &7Lapis &b» &a{@dropLapisLV4_opis}&c%%" and "&c» &a| &7Redstone &b» &a{@dropRedstoneLV4_opis}&c%%" and "&c» &a| &7Diament &b» &a{@dropDiamentLV4_opis}&c%%" and "&c» &a| &7Emerald &b» &a{@dropEmeraldLV4_opis}&c%%" and "" and "&c» &a| &7Posiadane &b» %{stnGetLV4.%player%}%"
                set slot 8 of player's current inventory to ("MHF_ArrowRight" parsed as offline player)'s skull named "&cPowrót" with lore "&c» &a| &7Kliknij aby powrócic!"
#DROP GUI LV1
on inventory click:
    if clicked inventory is not player's inventory:
        if name of player's current inventory is "{@tag} &8| &cStoniarki":
            clicked slot is 13:
                if {stnGetLV2.%player%} is "&cNie":
                    if {stnGetLV3.%player%} is "&cNie":
                        if {stnGetLV4.%player%} is "&cNie":
                            open chest inventory named "{@tag} &8| &cDrop ze &cStoniarek" with 1 rows to player
                            wait 2 tick
                            set slot 6 and 7 of player's current inventory to red stained glass pane
                            set slot 0 of player's current inventory to iron ingot named "&7Zelazo" with lore "&c» &a| &7Szansa &c» &a{@dropZelazoLV1_opis}&c%%"
                            set slot 1 of player's current inventory to gold ingot named "&7Zloto" with lore "&c» &a| &7Szansa &c» &a{@dropZlotoLV1_opis}&c%%"
                            set slot 2 of player's current inventory to lapis lazuli named "&7Lapis" with lore "&c» &a| &7Szansa &c» &a{@dropLapisLV1_opis}&c%%"
                            set slot 3 of player's current inventory to redstone named "&7Redstone" with lore "&c» &a| &7Szansa &c» &a{@dropRedstoneLV1_opis}&c%%"
                            set slot 4 of player's current inventory to diamond named "&7Diament" with lore "&c» &a| &7Szansa &c» &a{@dropDiamentLV1_opis}&c%%"
                            set slot 5 of player's current inventory to emerald named "&7Emerald" with lore "&c» &a| &7Szansa &c» &a{@dropEmeraldLV1_opis}&c%%"
                            set slot 8 of player's current inventory to ("MHF_ArrowRight" parsed as offline player)'s skull named "&cPowrót" with lore "&c» &a| &7Kliknij aby powrócic!"
#DROP GUI LV2
on inventory click:
    if clicked inventory is not player's inventory:
        if name of player's current inventory is "{@tag} &8| &cStoniarki":
            clicked slot is 13:
                if {stnGetLV2.%player%} is "&aTak":
                    open chest inventory named "{@tag} &8| &cDrop ze &cStoniarek" with 1 rows to player
                    wait 2 tick
                    set slot 6 and 7 of player's current inventory to red stained glass pane
                    set slot 0 of player's current inventory to iron ingot named "&7Zelazo" with lore "&c» &a| &7Szansa &c» &a{@dropZelazoLV2_opis}&c%%"
                    set slot 1 of player's current inventory to gold ingot named "&7Zloto" with lore "&c» &a| &7Szansa &c» &a{@dropZlotoLV2_opis}&c%%"
                    set slot 2 of player's current inventory to lapis lazuli named "&7Lapis" with lore "&c» &a| &7Szansa &c» &a{@dropLapisLV2_opis}&c%%"
                    set slot 3 of player's current inventory to redstone named "&7Redstone" with lore "&c» &a| &7Szansa &c» &a{@dropRedstoneLV2_opis}&c%%"
                    set slot 4 of player's current inventory to diamond named "&7Diament" with lore "&c» &a| &7Szansa &c» &a{@dropDiamentLV2_opis}&c%%"
                    set slot 5 of player's current inventory to emerald named "&7Emerald" with lore "&c» &a| &7Szansa &c» &a{@dropEmeraldLV2_opis}&c%%"
                    set slot 8 of player's current inventory to ("MHF_ArrowRight" parsed as offline player)'s skull named "&cPowrót" with lore "&c» &a| &7Kliknij aby powrócic!"
#DROP GUI LV3
on inventory click:
    if clicked inventory is not player's inventory:
        if name of player's current inventory is "{@tag} &8| &cStoniarki":
            clicked slot is 13:
                if {stnGetLV2.%player%} is "&aTak":
                    if {stnGetLV3.%player%} is "&aTak":
                        open chest inventory named "{@tag} &8| &cDrop ze &cStoniarek" with 1 rows to player
                        wait 2 tick
                        set slot 6 and 7 of player's current inventory to red stained glass pane
                        set slot 0 of player's current inventory to iron ingot named "&7Zelazo" with lore "&c» &a| &7Szansa &c» &a{@dropZelazoLV3_opis}&c%%"
                        set slot 1 of player's current inventory to gold ingot named "&7Zloto" with lore "&c» &a| &7Szansa &c» &a{@dropZlotoLV3_opis}&c%%"
                        set slot 2 of player's current inventory to lapis lazuli named "&7Lapis" with lore "&c» &a| &7Szansa &c» &a{@dropLapisLV3_opis}&c%%"
                        set slot 3 of player's current inventory to redstone named "&7Redstone" with lore "&c» &a| &7Szansa &c» &a{@dropRedstoneLV3_opis}&c%%"
                        set slot 4 of player's current inventory to diamond named "&7Diament" with lore "&c» &a| &7Szansa &c» &a{@dropDiamentLV3_opis}&c%%"
                        set slot 5 of player's current inventory to emerald named "&7Emerald" with lore "&c» &a| &7Szansa &c» &a{@dropEmeraldLV3_opis}&c%%"
                        set slot 8 of player's current inventory to ("MHF_ArrowRight" parsed as offline player)'s skull named "&cPowrót" with lore "&c» &a| &7Kliknij aby powrócic!"
#DROP GUI LV4
on inventory click:
    if clicked inventory is not player's inventory:
        if name of player's current inventory is "{@tag} &8| &cStoniarki":
            clicked slot is 13:
                if {stnGetLV2.%player%} is "&aTak":
                    if {stnGetLV3.%player%} is "&aTak":
                        if {stnGetLV4.%player%} is "&aTak":
                            open chest inventory named "{@tag} &8| &cDrop ze &cStoniarek" with 1 rows to player
                            wait 2 tick
                            set slot 6 and 7 of player's current inventory to red stained glass pane
                            set slot 0 of player's current inventory to iron ingot named "&7Zelazo" with lore "&c» &a| &7Szansa &c» &a{@dropZelazoLV4_opis}&c%%"
                            set slot 1 of player's current inventory to gold ingot named "&7Zloto" with lore "&c» &a| &7Szansa &c» &a{@dropZlotoLV4_opis}&c%%"
                            set slot 2 of player's current inventory to lapis lazuli named "&7Lapis" with lore "&c» &a| &7Szansa &c» &a{@dropLapisLV4_opis}&c%%"
                            set slot 3 of player's current inventory to redstone named "&7Redstone" with lore "&c» &a| &7Szansa &c» &a{@dropRedstoneLV4_opis}&c%%"
                            set slot 4 of player's current inventory to diamond named "&7Diament" with lore "&c» &a| &7Szansa &c» &a{@dropDiamentLV4_opis}&c%%"
                            set slot 5 of player's current inventory to emerald named "&7Emerald" with lore "&c» &a| &7Szansa &c» &a{@dropEmeraldLV4_opis}&c%%"
                            set slot 8 of player's current inventory to ("MHF_ArrowRight" parsed as offline player)'s skull named "&cPowrót" with lore "&c» &a| &7Kliknij aby powrócic!"

#UPGRADE GUI FUNCTION ON CLICK
on inventory click:
    if clicked inventory is not player's inventory:
        if name of player's current inventory is "{@tag} &8| &aUlepszenia &cStoniarek":
            clicked slot is 2:
                if {stnGetLV2.%player%} is "&cNie":
                    if player's balance is more or equal to {@CenaLV2}:
                        remove {@CenaLV2} from player's balance
                        set {stnGetLV2.%player%} to "&aTak"
                        send "{@tag} &aPomyślnie zakupiłeś/aś ulepszenie {@stn2}"
                        close player's inventory
                    else:
                        send "{@tag} &cNie posiadasz wystarczająco gotówki!"
                        close player's inventory
                        cancel event
                else:
                    send "{@tag} &cPosiadasz już to ulepszenie!"
                    close player's inventory
                    cancel event

on inventory click:
    if clicked inventory is not player's inventory:
        if name of player's current inventory is "{@tag} &8| &aUlepszenia &cStoniarek":
            clicked slot is 4:
                if {stnGetLV3.%player%} is "&cNie":
                    if {stnGetLV2.%player%} is "&aTak":
                        if player's balance is more or equal to {@CenaLV3}:
                            remove {@CenaLV3} from player's balance
                            set {stnGetLV3.%player%} to "&aTak"
                            send "{@tag} &aPomyślnie zakupiłeś/aś ulepszenie {@stn3}"
                            close player's inventory
                        else:
                            send "{@tag} &cNie posiadasz wystarczająco gotówki!"
                            close player's inventory
                            cancel event
                    else:
                        send "{@tag} &cZakup poprzednie ulepszenie!"
                        close player's inventory
                        cancel event
                else:
                    send "{@tag} &cPosiadasz już to ulepszenie!"
                    close player's inventory
                    cancel event

on inventory click:
    if clicked inventory is not player's inventory:
        if name of player's current inventory is "{@tag} &8| &aUlepszenia &cStoniarek":
            clicked slot is 6:
                if {stnGetLV4.%player%} is "&cNie":
                    if {stnGetLV2.%player%} is "&aTak":
                        if {stnGetLV3.%player%} is "&aTak":
                            if player's balance is more or equal to {@CenaLV4}:
                                remove {@CenaLV4} from player's balance
                                set {stnGetLV4.%player%} to "&aTak"
                                send "{@tag} &aPomyślnie zakupiłeś/aś ulepszenie {@stn4}"
                                close player's inventory
                            else:
                                send "{@tag} &cNie posiadasz wystarczająco gotówki!"
                                close player's inventory
                                cancel event
                        else:
                            send "{@tag} &cZakup poprzednie ulepszenie!"
                            close player's inventory
                            cancel event
                    else:
                        send "{@tag} &cZakup poprzednie ulepszenie!"
                        close player's inventory
                        cancel event
                else:
                    send "{@tag} &cPosiadasz już to ulepszenie!"
                    close player's inventory
                    cancel event

#BACK FROM GUI SLOT
on inventory click:
    if clicked inventory is not player's inventory:
        if name of player's current inventory is "{@tag} &8| &cCrafting Stoniarek":
            clicked slot is 44:
                close player's inventory
                wait 2 tick
                execute player command "stoniarka"
on inventory click:
    if clicked inventory is not player's inventory:
        if name of player's current inventory is "{@tag} &8| &cDrop ze &cStoniarek":
            clicked slot is 8:
                close player's inventory
                wait 2 tick
                execute player command "stoniarka"
on inventory click:
    if clicked inventory is not player's inventory:
        if name of player's current inventory is "{@tag} &8| &aUlepszenia &cStoniarek":
            clicked slot is 8:
                close player's inventory
                wait 2 tick
                execute player command "stoniarka"
#GUI BLOCK / DO NOT TOUCH
on inventory click:
    if clicked inventory is not player's inventory:
        if name of player's current inventory is "{@tag} &8| &cCrafting Stoniarek":
            cancel event
on inventory click:
    if clicked inventory is not player's inventory:
        if name of player's current inventory is "{@tag} &8| &cStoniarki":
            cancel event
on inventory click:
    if clicked inventory is not player's inventory:
        if name of player's current inventory is "{@tag} &8| &aUlepszenia &cStoniarek":
            cancel event
on inventory click:
    if clicked inventory is not player's inventory:
        if name of player's current inventory is "{@tag} &8| &cDrop ze &cStoniarek":
            cancel event
#STONE BREAKER FUNCTION / DO NOT TOUCH
on place:
    if event-block is end stone named "{@stn}" with lore "{@l1}" and "{@l2}" and "{@l3}":
        send "{@tag} &7Postawiłeś/aś {@stn}!" to player
        set {stoniarka.%event-block%} to true
        loop all blocks in radius 30 of player:
            if {stoniarka.%event-block%} is true:
                set block 1 above to {@stone}
                wait {@sc} seconds
            else:
                set block 1 above to air
                stop

on break:
    if event-block is end stone named "{@stn}" with lore "{@l1}" and "{@l2}" and "{@l3}":
        {stoniarka.%event-block%} is true:
            if player's tool is gold pickaxe:
                set {stoniarka.%event-block%} to false
                send "{@tag} &aPomyślnie usnąłeś/aś &cStoniarke!"
                drop 1 end stone named "{@stn}" with lore "{@l1}" and "{@l2}" and "{@l3}"
            else:
                send "{@tag} &7nie posiadasz odpowiedniego kilofa! &8(&6Złoty kilof&8)"
                cancel event

#MOST OF LINES - DROP CONFIG / DO NOT TOUCH !!!!!!
on break stone:
    chance of 100%:
        drop 1 exp
        stop
on break stone:
    if {stnGetLV2.%player%} is "&cNie":
        if {stnGetLV3.%player%} is "&cNie":
            if {stnGetLV4.%player%} is "&cNie":
                chance of {@dropZelazoLV1}:
                    give a random number between 1 and 2 of iron ingot to the player
                    stop
                chance of {@dropZlotoLV1}:
                    give a random number between 1 and 2 of gold ingot to the player
                    stop
                chance of {@dropLapisLV1}:
                    give a random number between 1 and 2 of lapis lazuli to the player
                    stop
                chance of {@dropRedstoneLV1}:
                    give a random number between 1 and 2 of redstone to the player
                    stop
                chance of {@dropDiamentLV1}:
                    give a random number between 1 and 2 of diamond to the player
                    stop 
                chance of {@dropEmeraldLV1}:
                    give a random number between 1 and 2 of emerald to the player
                    stop
                if player's tool is any pickaxe of fortune 1:
                    chance of {@dropZelazoLV1}:
                        give a random number between 1 and 2 of iron ingot to the player
                        stop
                    chance of {@dropZlotoLV1}:
                        give a random number between 1 and 2 of gold ingot to the player
                        stop
                    chance of {@dropLapisLV1}:
                        give a random number between 1 and 2 of lapis lazuli to the player
                        stop
                    chance of {@dropRedstoneLV1}:
                        give a random number between 1 and 2 of redstone to the player
                        stop
                    chance of {@dropDiamentLV1}:
                        give a random number between 1 and 2 of diamond to the player
                        stop 
                    chance of {@dropEmeraldLV1}:
                        give a random number between 1 and 2 of emerald to the player
                        stop
                if player's tool is any pickaxe of fortune 2:
                    chance of {@dropZelazoLV1}:
                        give a random number between 2 and 4 of iron ingot to the player
                        stop
                    chance of {@dropZlotoLV1}:
                        give a random number between 2 and 4 of gold ingot to the player
                        stop
                    chance of {@dropLapisLV1}:
                        give a random number between 2 and 4 of lapis lazuli to the player
                        stop
                    chance of {@dropRedstoneLV1}:
                        give a random number between 2 and 4 of redstone to the player
                        stop
                    chance of {@dropDiamentLV1}:
                        give a random number between 2 and 3 of diamond to the player
                        stop 
                    chance of {@dropEmeraldLV1}:
                        give a random number between 2 and 3 of emerald to the player
                        stop
                if player's tool is any pickaxe of fortune 3:
                    chance of {@dropZelazoLV1}:
                        give a random number between 4 and 6 of iron ingot to the player
                        stop
                    chance of {@dropZlotoLV1}:
                        give a random number between 4 and 6 of gold ingot to the player
                        stop
                    chance of {@dropLapisLV1}:
                        give a random number between 3 and 5 of lapis lazuli to the player
                        stop
                    chance of {@dropRedstoneLV1}:
                        give a random number between 2 and 6 of redstone to the player
                        stop
                    chance of {@dropDiamentLV1}:
                        give a random number between 2 and 4 of diamond to the player
                        stop 
                    chance of {@dropEmeraldLV1}:
                        give a random number between 2 and 3 of emerald to the player
                        stop
                    
on break stone:
    if {stnGetLV2.%player%} is "&aTak":
        chance of {@dropZelazoLV2}:
            give a random number between 2 and 3 of iron ingot to the player
            stop
        chance of {@dropZlotoLV2}:
            give a random number between 2 and 3 of gold ingot to the player
            stop
        chance of {@dropLapisLV2}:
            give a random number between 2 and 3 of lapis lazuli to the player
            stop
        chance of {@dropRedstoneLV2}:
            give a random number between 2 and 3 of redstone to the player
            stop
        chance of {@dropDiamentLV2}:
            give a random number between 2 and 3 of diamond to the player
            stop 
        chance of {@dropEmeraldLV2}:
            give a random number between 2 and 3 of emerald to the player
            stop
        if player's tool is any pickaxe of fortune 1:
            chance of {@dropZelazoLV2}:
                give a random number between 3 and 4 of iron ingot to the player
                stop
            chance of {@dropZlotoLV2}:
                give a random number between 3 and 4 of gold ingot to the player
                stop
            chance of {@dropLapisLV2}:
                give a random number between 3 and 4 of lapis lazuli to the player
                stop
            chance of {@dropRedstoneLV2}:
                give a random number between 3 and 4 of redstone to the player
                stop
            chance of {@dropDiamentLV2}:
                give a random number between 2 and 3 of diamond to the player
                stop 
            chance of {@dropEmeraldLV2}:
                give a random number between 2 and 3 of emerald to the player
                stop
        if player's tool is any pickaxe of fortune 2:
            chance of {@dropZelazoLV2}:
                give a random number between 4 and 5 of iron ingot to the player
                stop
            chance of {@dropZlotoLV2}:
                give a random number between 4 and 5 of gold ingot to the player
                stop
            chance of {@dropLapisLV2}:
                give a random number between 4 and 5 of lapis lazuli to the player
                stop
            chance of {@dropRedstoneLV2}:
                give a random number between 4 and 5 of redstone to the player
                stop
            chance of {@dropDiamentLV2}:
                give a random number between 2 and 3 of diamond to the player
                stop 
            chance of {@dropEmeraldLV2}:
                give a random number between 2 and 3 of emerald to the player
                stop
        if player's tool is any pickaxe of fortune 3:
            chance of {@dropZelazoLV2}:
                give a random number between 4 and 6 of iron ingot to the player
                stop
            chance of {@dropZlotoLV2}:
                give a random number between 4 and 6 of gold ingot to the player
                stop
            chance of {@dropLapisLV2}:
                give a random number between 3 and 5 of lapis lazuli to the player
                stop
            chance of {@dropRedstoneLV2}:
                give a random number between 2 and 6 of redstone to the player
                stop
            chance of {@dropDiamentLV2}:
                give a random number between 3 and 4 of diamond to the player
                stop 
            chance of {@dropEmeraldLV2}:
                give a random number between 3 and 4 of emerald to the player
                stop

on break stone:
    if {stnGetLV3.%player%} is "&aTak":
        chance of {@dropZelazoLV3}:
            give a random number between 2 and 4 of iron ingot to the player
            stop
        chance of {@dropZlotoLV3}:
            give a random number between 2 and 4 of gold ingot to the player
            stop
        chance of {@dropLapisLV3}:
            give a random number between 2 and 4 of lapis lazuli to the player
            stop
        chance of {@dropRedstoneLV3}:
            give a random number between 2 and 4 of redstone to the player
            stop
        chance of {@dropDiamentLV3}:
            give a random number between 2 and 4 of diamond to the player
            stop 
        chance of {@dropEmeraldLV3}:
            give a random number between 2 and 4 of emerald to the player
            stop
        if player's tool is any pickaxe of fortune 1:
            chance of {@dropZelazoLV3}:
                give a random number between 3 and 4 of iron ingot to the player
                stop
            chance of {@dropZlotoLV3}:
                give a random number between 3 and 4 of gold ingot to the player
                stop
            chance of {@dropLapisLV3}:
                give a random number between 3 and 4 of lapis lazuli to the player
                stop
            chance of {@dropRedstoneLV3}:
                give a random number between 3 and 4 of redstone to the player
                stop
            chance of {@dropDiamentLV3}:
                give a random number between 2 and 3 of diamond to the player
                stop 
            chance of {@dropEmeraldLV3}:
                give a random number between 2 and 3 of emerald to the player
                stop
        if player's tool is any pickaxe of fortune 2:
            chance of {@dropZelazoLV3}:
                give a random number between 3 and 4 of iron ingot to the player
                stop
            chance of {@dropZlotoLV3}:
                give a random number between 3 and 4 of gold ingot to the player
                stop
            chance of {@dropLapisLV3}:
                give a random number between 3 and 4 of lapis lazuli to the player
                stop
            chance of {@dropRedstoneLV3}:
                give a random number between 3 and 4 of redstone to the player
                stop
            chance of {@dropDiamentLV3}:
                give a random number between 2 and 3 of diamond to the player
                stop 
            chance of {@dropEmeraldLV3}:
                give a random number between 2 and 3 of emerald to the player
                stop
        if player's tool is any pickaxe of fortune 3:
            chance of {@dropZelazoLV3}:
                give a random number between 4 and 6 of iron ingot to the player
                stop
            chance of {@dropZlotoLV3}:
                give a random number between 4 and 6 of gold ingot to the player
                stop
            chance of {@dropLapisLV3}:
                give a random number between 3 and 5 of lapis lazuli to the player
                stop
            chance of {@dropRedstoneLV3}:
                give a random number between 3 and 6 of redstone to the player
                stop
            chance of {@dropDiamentLV3}:
                give a random number between 4 and 6 of diamond to the player
                stop 
            chance of {@dropEmeraldLV3}:
                give a random number between 4 and 5 of emerald to the player
                stop
on break stone:
    if {stnGetLV4.%player%} is "&aTak":
        chance of {@dropZelazoLV4}:
            give a random number between 3 and 5 of iron ingot to the player
            stop
        chance of {@dropZlotoLV4}:
            give a random number between 3 and 5 of gold ingot to the player
            stop
        chance of {@dropLapisLV4}:
            give a random number between 3 and 5 of lapis lazuli to the player
            stop
        chance of {@dropRedstoneLV4}:
            give a random number between 3 and 5 of redstone to the player
            stop
        chance of {@dropDiamentLV4}:
            give a random number between 3 and 5 of diamond to the player
            stop 
        chance of {@dropEmeraldLV4}:
            give a random number between 3 and 5 of emerald to the player
            stop
        if player's tool is any pickaxe of fortune 1:
            chance of {@dropZelazoLV4}:
                give a random number between 3 and 4 of iron ingot to the player
                stop
            chance of {@dropZlotoLV4}:
                give a random number between 3 and 4 of gold ingot to the player
                stop
            chance of {@dropLapisLV4}:
                give a random number between 3 and 4 of lapis lazuli to the player
                stop
            chance of {@dropRedstoneLV4}:
                give a random number between 3 and 4 of redstone to the player
                stop
            chance of {@dropDiamentLV4}:
                give a random number between 6 and 7 of diamond to the player
                stop 
            chance of {@dropEmeraldLV4}:
                give a random number between 4 and 5 of emerald to the player
                stop
        if player's tool is any pickaxe of fortune 2:
            chance of {@dropZelazoLV4}:
                give a random number between 3 and 4 of iron ingot to the player
                stop
            chance of {@dropZlotoLV4}:
                give a random number between 3 and 4 of gold ingot to the player
                stop
            chance of {@dropLapisLV4}:
                give a random number between 3 and 4 of lapis lazuli to the player
                stop
            chance of {@dropRedstoneLV4}:
                give a random number between 3 and 4 of redstone to the player
                stop
            chance of {@dropDiamentLV4}:
                give a random number between 6 and 7 of diamond to the player
                stop 
            chance of {@dropEmeraldLV4}:
                give a random number between 4 and 5 of emerald to the player
                stop
        if player's tool is any pickaxe of fortune 3:
            chance of {@dropZelazoLV4}:
                give a random number between 5 and 6 of iron ingot to the player
                stop
            chance of {@dropZlotoLV4}:
                give a random number between 5 and 6 of gold ingot to the player
                stop
            chance of {@dropLapisLV4}:
                give a random number between 5 and 7 of lapis lazuli to the player
                stop
            chance of {@dropRedstoneLV4}:
                give a random number between 5 and 7 of redstone to the player
                stop
            chance of {@dropDiamentLV4}:
                give a random number between 8 and 9 of diamond to the player
                stop 
            chance of {@dropEmeraldLV4}:
                give a random number between 6 and 7 of emerald to the player
                stop
command /tests:
    trigger:
        set {stnGetLV2.%player%} to "&cNie"
        set {stnGetLV3.%player%} to "&cNie"
        set {stnGetLV4.%player%} to "&cNie"
