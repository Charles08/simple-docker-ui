# Native Docker UI using Electron

** Note: This is a prototype and a work in progress**

## Known limitations/bugs

- Work witn errors with Unix sockets : unix:///var/run/docker.sock
- Docker TLS is not supported yet.


## Development

### Download Node.js & Electron dependencies
````
cd electron
npm install
bower install
```

### Compile Scala.js

```
export SBT_OPTS="-Xmx1G"
sbt electron/fullOptJS
```

### Run the Electron UI
```
cd electron
npm start
```

### Package the native app

```
cd electron
npm run-script package-mac
npm run-script dmg
```

###Package Native app for Windows

```
cd electron
npm run-script package-exe
npm run-script create-installer-win
```