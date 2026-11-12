package com.amazon.alexa.avs.wakeword;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class WakeWordIPC {
    private WakeWordDetectedHandler handler;

    public enum IPCCommand {
        IPC_DISCONNECT(1),
        IPC_WAKE_WORD_DETECTED(2),
        IPC_PAUSE_WAKE_WORD_ENGINE(3),
        IPC_RESUME_WAKE_WORD_ENGINE(4),
        IPC_CONFIRM(5);

        private final int value;

        IPCCommand(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public WakeWordIPC(WakeWordDetectedHandler wakeWordDetectedHandler) {
        this.handler = null;
        this.handler = wakeWordDetectedHandler;
    }

    public abstract void init();

    public abstract void sendCommand(IPCCommand iPCCommand) throws IOException;

    public void wakeWordDetected() {
        WakeWordDetectedHandler wakeWordDetectedHandler = this.handler;
        if (wakeWordDetectedHandler != null) {
            wakeWordDetectedHandler.onWakeWordDetected();
        }
    }
}
