package com.xiaomi.digitalkey.ccc.terminal;

import com.miui.tsmclient.entity.CarKeyCardInfo;
import com.tsmclient.smartcard.terminal.IScTerminal;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class DKFTerminal implements IDKFTerminal {
    private IScTerminal mTerminal = new CarKeyCardInfo().getTerminal();

    @Override // com.xiaomi.digitalkey.ccc.terminal.IDKFTerminal
    public void close() throws InterruptedException, IOException {
        this.mTerminal.close();
    }

    @Override // com.xiaomi.digitalkey.ccc.terminal.IDKFTerminal
    public void open() throws InterruptedException, IOException {
        this.mTerminal.open();
    }

    @Override // com.xiaomi.digitalkey.ccc.terminal.IDKFTerminal
    public byte[] transmit(byte[] bArr) throws InterruptedException, IOException {
        return this.mTerminal.transmit(bArr).toBytes();
    }
}
