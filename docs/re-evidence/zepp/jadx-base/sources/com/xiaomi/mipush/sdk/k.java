package com.xiaomi.mipush.sdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.hm.health.sleep.eventbus.SlpHMDeviceSyncDataEventObserver;
import java.util.HashMap;

/* JADX INFO: loaded from: classes22.dex */
class k extends Handler {
    public final /* synthetic */ ag a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ag agVar, Looper looper) {
        super(looper);
        this.a = agVar;
    }

    @Override // android.os.Handler
    public void dispatchMessage(Message message) {
        ag agVar;
        HashMap<String, String> mapA;
        ag agVar2;
        if (message.what != 19) {
            return;
        }
        String str = (String) message.obj;
        int i = message.arg1;
        synchronized (x.class) {
            if (x.a(this.a.b).m3485a(str)) {
                if (x.a(this.a.b).a(str) < 10) {
                    am amVar = am.DISABLE_PUSH;
                    if (amVar.ordinal() == i && SlpHMDeviceSyncDataEventObserver.SYNCING.equals(x.a(this.a.b).a(amVar))) {
                        agVar2 = this.a;
                    } else {
                        amVar = am.ENABLE_PUSH;
                        if (amVar.ordinal() == i && SlpHMDeviceSyncDataEventObserver.SYNCING.equals(x.a(this.a.b).a(amVar))) {
                            agVar2 = this.a;
                        } else {
                            am amVar2 = am.UPLOAD_HUAWEI_TOKEN;
                            if (amVar2.ordinal() == i && SlpHMDeviceSyncDataEventObserver.SYNCING.equals(x.a(this.a.b).a(amVar2))) {
                                agVar = this.a;
                                mapA = g.a(agVar.b, c.ASSEMBLE_PUSH_HUAWEI);
                            } else {
                                amVar2 = am.UPLOAD_FCM_TOKEN;
                                if (amVar2.ordinal() == i && SlpHMDeviceSyncDataEventObserver.SYNCING.equals(x.a(this.a.b).a(amVar2))) {
                                    agVar = this.a;
                                    mapA = g.a(agVar.b, c.ASSEMBLE_PUSH_FCM);
                                } else {
                                    amVar2 = am.UPLOAD_COS_TOKEN;
                                    if (amVar2.ordinal() == i && SlpHMDeviceSyncDataEventObserver.SYNCING.equals(x.a(this.a.b).a(amVar2))) {
                                        agVar = this.a;
                                        mapA = g.a(agVar.b, c.ASSEMBLE_PUSH_COS);
                                    } else {
                                        amVar2 = am.UPLOAD_FTOS_TOKEN;
                                        if (amVar2.ordinal() == i && SlpHMDeviceSyncDataEventObserver.SYNCING.equals(x.a(this.a.b).a(amVar2))) {
                                            agVar = this.a;
                                            mapA = g.a(agVar.b, c.ASSEMBLE_PUSH_FTOS);
                                        }
                                    }
                                }
                            }
                            agVar.t(str, amVar2, false, mapA);
                        }
                        x.a(this.a.b).b(str);
                    }
                    agVar2.t(str, amVar, true, null);
                    x.a(this.a.b).b(str);
                } else {
                    x.a(this.a.b).c(str);
                }
            }
        }
    }
}
