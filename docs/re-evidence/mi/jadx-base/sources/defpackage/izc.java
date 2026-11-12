package defpackage;

import com.xiaomi.wearable.spp.SppDataReceiver;

/* JADX INFO: loaded from: classes2.dex */
public interface izc {
    void close();

    void connect(boolean z, g7o g7oVar);

    void destroy();

    void disconnect();

    long getLastConnectTime();

    int getVersion();

    String getVersionName();

    void registerStatusChangeListener(h7o h7oVar);

    void removeStatusChangeListener(h7o h7oVar);

    void sendData(byte[] bArr, j7o j7oVar);

    void setDataReceiver(SppDataReceiver sppDataReceiver);
}
