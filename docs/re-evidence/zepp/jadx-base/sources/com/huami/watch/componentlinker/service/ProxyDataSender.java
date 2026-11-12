package com.huami.watch.componentlinker.service;

import com.huami.watch.transport.DataBundle;

/* JADX INFO: loaded from: classes16.dex */
public interface ProxyDataSender {
    void sendBundle(DataBundle dataBundle, String str);

    void sendCmd(String str, String str2);

    void sendData(byte[] bArr, String str);
}
