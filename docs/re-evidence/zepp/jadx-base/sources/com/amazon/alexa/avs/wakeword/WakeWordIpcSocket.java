package com.amazon.alexa.avs.wakeword;

import com.amazon.alexa.avs.log.Logger;
import com.amazon.alexa.avs.log.LoggerFactory;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class WakeWordIpcSocket extends WakeWordIPC implements Runnable {
    private static final Logger log = LoggerFactory.getLogger(WakeWordIpcSocket.class);
    private final Set<WakeWordIpcConnectedClient> connectedClients;
    private Thread ipcThread;
    private ServerSocket serverSocket;

    public WakeWordIpcSocket(WakeWordDetectedHandler wakeWordDetectedHandler, int i) throws IOException {
        super(wakeWordDetectedHandler);
        this.connectedClients = new HashSet();
        this.serverSocket = null;
        this.ipcThread = null;
        this.serverSocket = new ServerSocket(i, 0, InetAddress.getByName(null));
    }

    @Override // com.amazon.alexa.avs.wakeword.WakeWordIPC
    public void init() {
        if (this.ipcThread == null) {
            Thread thread = new Thread(this);
            this.ipcThread = thread;
            thread.start();
        }
    }

    public void processWakeWordDetected() {
        log.info("Wake Word Detected ......");
        new Thread() { // from class: com.amazon.alexa.avs.wakeword.WakeWordIpcSocket.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                WakeWordIpcSocket.this.wakeWordDetected();
            }
        }.start();
    }

    public synchronized void registerClient(WakeWordIpcConnectedClient wakeWordIpcConnectedClient) {
        this.connectedClients.add(wakeWordIpcConnectedClient);
        log.info("New IPC client was accepted, current of current clients is " + this.connectedClients.size());
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                WakeWordIpcConnectedClient wakeWordIpcConnectedClient = new WakeWordIpcConnectedClient(this.serverSocket.accept(), this);
                wakeWordIpcConnectedClient.init();
                registerClient(wakeWordIpcConnectedClient);
            } catch (Exception e) {
                log.warn("Could not accept/connect IPC client", e);
            }
        }
    }

    @Override // com.amazon.alexa.avs.wakeword.WakeWordIPC
    public synchronized void sendCommand(WakeWordIPC.IPCCommand iPCCommand) throws IOException {
        log.debug("Sending command " + iPCCommand + " to all connected clients");
        Iterator<WakeWordIpcConnectedClient> it2 = this.connectedClients.iterator();
        while (it2.hasNext()) {
            it2.next().send(iPCCommand);
        }
    }

    public synchronized void unregisterClient(WakeWordIpcConnectedClient wakeWordIpcConnectedClient) {
        this.connectedClients.remove(wakeWordIpcConnectedClient);
        log.info("IPC client was removed, current of current clients is " + this.connectedClients.size());
    }
}
