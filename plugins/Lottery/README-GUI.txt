First of all, thank you for using Lottery! If you like the Plugin I would really appreciate it if you'd leave a Review on Spigot :).

But Now, the thing this file is for: The NEW GUI System! It's not very easy to understand on the first look so I will explain EVERYTHING needed here.


Lets start!

First of all, the "MainInventory" section at the top of the gui.yml.
Here you can enter the EXACT name of the main Inventory that should open if you type "lottery gui". In the default config it's just "MainInventory" and it's already configured.

Okay Inventory section.
You can create an Inventory very easily by just doing it as in the default config.
All parameters you can use in the Inventory section are:
"Name"
"Size"
and Items which I will explain now.


Items.
In this section you can specify the Items that should be put in the Inventory.
This section is more complicated so I hope I get everything right here..

Lets start with the parameters:
"ItemType" - This is the minecraft item name (like "dirt" or "stone" or "cobblestone").
Note that the ItemType is different since 1.13! But the Plugin will automaticly check your Server version and generate the right
compatible gui config for you. But if you change server version, you may have to edit the ItemType!

"ItemData" - This parameter can ONLY be used on servers below 1.13. This will set the items "durability" data.
Example: ItemType is "stone" and ItemData is 1 (has to be an Integer value, not a string!!!!!!) then the item will be granite.

"Type" - This is an Enum parameter!
Available are: 
- INFO - use this if the item has no other function then showing text
- INVENTORYOPEN - use this if you wan't to open another inventory when you click on the item
- COMMANDPLAYER - use this if you wan't to let the player execute commands
- COMMANDCONSOLE - use this if you wan't to let the console execute commands

"InventoryToOpen" - This is the parameter you have to specify if you used "INVENTORYOPEN" as "Type".

"Name" - The Name of the Item

"Slot" - The Slot of the item in the Inventory (starts with 0)

"Commands" - This is a list and will be used for COMMANDPLAYER and COMMANDCONSOLE
Example:
Commands:
- help
- test
- list
- blablabla....

"Lore" - Similar to the "Commands". Also a list. Will add a lore to the Item.


Okay, the last thing is the variables you can use in EVERY string you use.


%draw% - Shows the current draw string configured
%ptickets% - Shows the amount of tickets the player bought
%gtickets% - Shows the total amount of tickets sold
%pot% - Shows the amount that is in the pot
%winner% - Shows the last winner of the Lottery
%player% - Shows the players name (more useful for commands)

The variables can also be used in SOME other message (reminder for now)
