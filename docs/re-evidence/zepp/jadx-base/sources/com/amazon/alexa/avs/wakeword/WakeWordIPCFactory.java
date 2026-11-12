package com.amazon.alexa.avs.wakeword;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class WakeWordIPCFactory {
    public WakeWordIPC createWakeWordIPC(WakeWordDetectedHandler wakeWordDetectedHandler, int i) throws IOException {
        return new WakeWordIpcSocket(wakeWordDetectedHandler, i);
    }
}
