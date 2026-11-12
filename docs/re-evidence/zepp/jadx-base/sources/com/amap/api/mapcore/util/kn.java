package com.amap.api.mapcore.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.autonavi.amap.mapcore.Inner_3dMap_locationListener;
import com.autonavi.amap.mapcore.Inner_3dMap_locationOption;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class kn extends Handler {
    public km a;

    public kn() {
        this.a = null;
    }

    public kn(Looper looper, km kmVar) {
        super(looper);
        this.a = null;
        this.a = kmVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1001:
                try {
                    this.a.a((Inner_3dMap_locationOption) message.obj);
                    return;
                } catch (Throwable th) {
                    ke.a(th, "ClientActionHandler", "ACTION_SET_OPTION");
                    return;
                }
            case 1002:
                try {
                    Inner_3dMap_locationListener inner_3dMap_locationListener = (Inner_3dMap_locationListener) message.obj;
                    km kmVar = this.a;
                    try {
                        if (inner_3dMap_locationListener == null) {
                            throw new IllegalArgumentException("listener参数不能为null");
                        }
                        if (kmVar.b == null) {
                            kmVar.b = new ArrayList<>();
                        }
                        if (kmVar.b.contains(inner_3dMap_locationListener)) {
                            return;
                        }
                        kmVar.b.add(inner_3dMap_locationListener);
                        return;
                    } catch (Throwable th2) {
                        ke.a(th2, "MapLocationManager", "doSetLocationListener");
                        return;
                    }
                } catch (Throwable th3) {
                    ke.a(th3, "ClientActionHandler", "ACTION_SET_LISTENER");
                    return;
                }
            case 1003:
                try {
                    this.a.a((Inner_3dMap_locationListener) message.obj);
                    return;
                } catch (Throwable th4) {
                    ke.a(th4, "ClientActionHandler", "ACTION_REMOVE_LISTENER");
                    return;
                }
            case 1004:
                try {
                    this.a.a();
                    return;
                } catch (Throwable th5) {
                    ke.a(th5, "ClientActionHandler", "ACTION_START_LOCATION");
                    return;
                }
            case 1005:
                try {
                    this.a.b();
                    return;
                } catch (Throwable th6) {
                    ke.a(th6, "ClientActionHandler", "ACTION_GET_LOCATION");
                    return;
                }
            case 1006:
                try {
                    this.a.c();
                    return;
                } catch (Throwable th7) {
                    ke.a(th7, "ClientActionHandler", "ACTION_STOP_LOCATION");
                    return;
                }
            case 1007:
                try {
                    this.a.d();
                    return;
                } catch (Throwable th8) {
                    ke.a(th8, "ClientActionHandler", "ACTION_DESTROY");
                    return;
                }
            default:
                return;
        }
    }
}
