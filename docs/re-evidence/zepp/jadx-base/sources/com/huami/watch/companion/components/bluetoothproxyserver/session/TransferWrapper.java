package com.huami.watch.companion.components.bluetoothproxyserver.session;

import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public class TransferWrapper {
    private static TransferWrapper b;
    public a a;

    public interface a {
        int receiveData(byte[] bArr) throws IOException;

        void release();

        void sendData(byte[] bArr) throws IOException;
    }

    private TransferWrapper(a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("null params");
        }
        this.a = aVar;
    }

    public static TransferWrapper getInstance() {
        return b;
    }

    public static void initialize(a aVar) {
        b = new TransferWrapper(aVar);
    }

    public int receiveData(byte[] bArr) throws IOException {
        return this.a.receiveData(bArr);
    }

    public void release() {
        this.a.release();
    }

    public void sendData(byte[] bArr) throws IOException {
        this.a.sendData(bArr);
    }
}
