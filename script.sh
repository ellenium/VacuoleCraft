apt-get install openjdk-8-jre-headless -y;
curl -o mcserver.jar https://s3.amazonaws.com/Minecraft.Download/versions/1.11.2/minecraft_server.1.11.2.jar;
echo "eula=TRUE" > eula.txt; java -jar mcserver.jar
