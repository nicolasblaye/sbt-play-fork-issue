# sbt-play-fork-issue
Use of external java lib does not work well with sbt 1.x and play 2.6.x.

- I thought it came from sbt/play fork option thus the name of the repo but it seems that it does not...
- I tested this program with a basic `Main` and it works
- I tested with sbt 0.13.16 and play 2.6.15 and it worked

A quick fix is to setup the opt in the env with `SBT_OPTS`.

# To run the project

Install turbojpeg from the following url (mac only)

https://downloads.sourceforge.net/project/libjpeg-turbo/1.5.1/libjpeg-turbo-1.5.1.dmg?r=https%3A%2F%2Fsourceforge.net%2Fprojects%2Flibjpeg-turbo%2Ffiles%2F1.5.1%2F&ts=1499438017&use_mirror=vorboss

Or try running 
`brew install jpeg-turbo`

For non mac user:
https://libjpeg-turbo.org/Documentation/OfficialBinaries 
