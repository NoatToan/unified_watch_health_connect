package com.tsmclient.smartcard.terminal.external;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public interface IChannel {
    void close() throws InterruptedException, IOException;

    void open() throws InterruptedException, IOException;

    byte[] transceive(byte[] bArr) throws InterruptedException, IOException;
}
