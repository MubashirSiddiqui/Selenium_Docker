# Selenium_Docker
Configuring  Selenium in a docker 

# Download Selenium image from DockerHub
https://hub.docker.com/r/selenium/standalone-chrome

# Docker Pull Command
docker pull selenium/standalone-chrome

# How to run this image
1. Start a Standalone Chrome
  docker run -d -p 4444:4444 -p 7900:7900 --shm-size="2g" selenium/standalone-chrome:latest

2. Point your WebDriver tests to http://localhost:4444⁠

3. Test are running not showing anywhere on screen. To see the testing steps, Download the VNC viewer and follow the steps:
   - File > New Connection
   - VNC Server: Localhost:7900
   - Name: VNCTestViewer
     
