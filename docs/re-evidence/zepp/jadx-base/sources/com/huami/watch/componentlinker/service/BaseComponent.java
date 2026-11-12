package com.huami.watch.componentlinker.service;

import android.content.Context;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes16.dex */
public class BaseComponent {
    private static final String c = "BaseComponent";
    private String a;
    private ProxyDataSender b;
    public Context mContext;

    public BaseComponent(String str, Context context) {
        this.a = null;
        this.a = str;
        this.mContext = context;
    }

    public String getName() {
        return this.a;
    }

    public void handleCmdBundle(DataBundle dataBundle) {
        Log.d(c, "handleCmdBundle :" + dataBundle, new Object[0]);
    }

    public void handleData(byte[] bArr) {
        if (bArr == null) {
            Log.d(c, "on data receive, byte length: 0 (null)", new Object[0]);
            return;
        }
        Log.d(c, "on data receive, byte length: " + bArr.length, new Object[0]);
    }

    public void handleFile(File file) {
    }

    public void onChannelChanged(boolean z) {
        Log.d(c, "onChannelChanged :" + z, new Object[0]);
    }

    public void sendBundleData(DataBundle dataBundle) {
        Log.d(c, "send data back to proxy, data" + dataBundle, new Object[0]);
        ProxyDataSender proxyDataSender = this.b;
        if (proxyDataSender != null) {
            proxyDataSender.sendBundle(dataBundle, this.a);
        } else {
            Log.e(c, "no sender set!", new Object[0]);
        }
    }

    public void sendCmd(String str) {
        Log.d(c, "send cmd back to proxy:" + str, new Object[0]);
        ProxyDataSender proxyDataSender = this.b;
        if (proxyDataSender != null) {
            proxyDataSender.sendCmd(str, this.a);
        } else {
            Log.e(c, "no sender set!", new Object[0]);
        }
    }

    public void sendData(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("send data back to proxy, data lenght:");
        sb.append(bArr == null ? 0 : bArr.length);
        Log.d(c, sb.toString(), new Object[0]);
        ProxyDataSender proxyDataSender = this.b;
        if (proxyDataSender != null) {
            proxyDataSender.sendData(bArr, this.a);
        } else {
            Log.e(c, "no sender set!", new Object[0]);
        }
    }

    public void setSender(ProxyDataSender proxyDataSender) {
        this.b = proxyDataSender;
    }
}
