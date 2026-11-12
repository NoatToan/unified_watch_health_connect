package com.huami.watch.componentlinker.service;

import com.huami.watch.transport.DataBundle;

/* JADX INFO: loaded from: classes16.dex */
public interface CmdDataReceiver {
    void onCmdDataReceive(String str, DataBundle dataBundle);

    void onCmdDataReceive(String str, byte[] bArr);

    void setSender(ProxyDataSender proxyDataSender);
}
