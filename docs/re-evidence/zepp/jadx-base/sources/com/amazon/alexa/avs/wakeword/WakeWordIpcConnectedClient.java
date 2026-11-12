package com.amazon.alexa.avs.wakeword;

import com.amazon.alexa.avs.log.Logger;
import com.amazon.alexa.avs.log.LoggerFactory;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/* JADX INFO: loaded from: classes2.dex */
public class WakeWordIpcConnectedClient implements Runnable {
    private static final Logger log = LoggerFactory.getLogger(WakeWordIpcSocket.class);
    private Socket clientSocket;
    private DataInputStream input;
    private DataOutputStream output;
    private WakeWordIpcSocket wakeWordIPCSocket;
    private Thread connectionThread = null;
    private volatile boolean running = true;

    public WakeWordIpcConnectedClient(Socket socket, WakeWordIpcSocket wakeWordIpcSocket) throws IOException {
        this.wakeWordIPCSocket = null;
        this.clientSocket = null;
        this.input = null;
        this.output = null;
        this.wakeWordIPCSocket = wakeWordIpcSocket;
        this.clientSocket = socket;
        this.input = new DataInputStream(socket.getInputStream());
        this.output = new DataOutputStream(socket.getOutputStream());
    }

    public void init() {
        if (this.connectionThread == null) {
            Thread thread = new Thread(this);
            this.connectionThread = thread;
            thread.start();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (this.running) {
            try {
                int i = this.input.readInt();
                if (WakeWordIPC.IPCCommand.IPC_DISCONNECT.getValue() == i) {
                    terminate();
                } else if (WakeWordIPC.IPCCommand.IPC_WAKE_WORD_DETECTED.getValue() == i) {
                    log.info("Received wake word detected");
                    this.wakeWordIPCSocket.processWakeWordDetected();
                }
            } catch (Exception e) {
                log.warn("Could not read/process the command received:", e);
                terminate();
            }
        }
    }

    public void send(WakeWordIPC.IPCCommand iPCCommand) throws IOException {
        this.output.writeInt(iPCCommand.getValue());
    }

    public void terminate() {
        log.info("Terminating/Disconneting a Wake Word Agent, Bye!");
        this.running = false;
        this.wakeWordIPCSocket.unregisterClient(this);
        try {
            DataInputStream dataInputStream = this.input;
            if (dataInputStream != null) {
                dataInputStream.close();
                Socket socket = this.clientSocket;
                if (socket != null) {
                    socket.close();
                }
            }
        } catch (IOException e) {
            log.warn("Could not close streams and socket:", e);
        }
    }
}
