package com.xiaomi.digitalkey.ccc.terminal;

import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public interface IDKFTerminal {
    void close() throws InterruptedException, IOException;

    void open() throws InterruptedException, IOException;

    byte[] transmit(byte[] bArr) throws InterruptedException, IOException;
}
