package com.tsmclient.smartcard.terminal.external;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public interface IApduExecutor {
    ResponseList execute(IChannel iChannel, CommandList commandList) throws InterruptedException, IOException;
}
