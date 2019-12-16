# Minecraft Server

Please report any planned changes as an issue and use the appropriate lists in the Projects tab to track their progress. In addition; use only the master branch for updates that are intended to be pushed to the live server, use the staging branch for testing or as a "waiting" line for updates intended for the master branch, do NOT push staging to master if you are unsure about any changes, in the event of an immediate update contact the Administrator.

Please remember to follow these steps

- git clone -b staging https://github.com/M1tchX/MinecraftServer
  After you have made your changes.
- "git add {files changed}" or in the event of mass changes use "git add *" please reserve the use of "git add *" to mass uploads.
If uploading large file please use git-lfs https://git-lfs.github.com/

- git commit -m "your message here"
  Please upload a meaningful message
  
  - git push -b staging
  
  
  If any issues occur, make a copy of your local repository and run git pull

