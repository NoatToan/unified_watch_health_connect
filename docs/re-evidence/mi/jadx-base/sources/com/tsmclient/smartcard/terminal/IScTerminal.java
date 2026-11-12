package com.tsmclient.smartcard.terminal;

import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.terminal.response.ScResponse;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface IScTerminal {
    boolean activateCard(String str);

    void checkNfcEEStatus() throws InterruptedException, IOException;

    void close();

    boolean deactivateCard(String str);

    String getCIN() throws InterruptedException, IOException;

    String getCPLC() throws InterruptedException, IOException;

    Map<String, ByteArray> getCardActivationState(String str) throws InterruptedException;

    void getSEInfo() throws InterruptedException, IOException;

    String getSeid() throws InterruptedException, IOException;

    String getSignedSpiPK() throws InterruptedException, IOException;

    String getTerminalCategory();

    TerminalType getTerminalType();

    boolean isAppletExist(String str) throws InterruptedException, IOException;

    boolean isInterruptible();

    void open() throws InterruptedException, IOException;

    void setInterruptible(boolean z);

    ScResponse transmit(byte[] bArr) throws InterruptedException, IOException;
}
