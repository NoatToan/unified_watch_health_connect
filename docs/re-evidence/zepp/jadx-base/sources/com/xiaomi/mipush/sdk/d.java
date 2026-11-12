package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.service.at;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class d implements AbstractPushManager {
    private static volatile d e;
    private Context a;
    private PushConfiguration b;
    private boolean c = false;
    private Map<c, AbstractPushManager> d = new HashMap();

    private d(Context context) {
        this.a = context.getApplicationContext();
    }

    public static d a(Context context) {
        if (e == null) {
            synchronized (d.class) {
                if (e == null) {
                    e = new d(context);
                }
            }
        }
        return e;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x008e  */
    /* JADX WARN: Code duplicated, block: B:35:0x012b  */
    /* JADX WARN: Code duplicated, block: B:50:0x01b2  */
    private void b() {
        c cVar;
        AbstractPushManager abstractPushManagerA;
        c cVar2;
        AbstractPushManager abstractPushManagerA2;
        c cVar3;
        AbstractPushManager abstractPushManagerA3;
        AbstractPushManager abstractPushManagerA4;
        PushConfiguration pushConfiguration = this.b;
        if (pushConfiguration != null) {
            if (pushConfiguration.getOpenHmsPush()) {
                StringBuilder sb = new StringBuilder();
                sb.append("ASSEMBLE_PUSH : ");
                sb.append(" HW user switch : " + this.b.getOpenHmsPush() + " HW online switch : " + g.m3479a(this.a, c.ASSEMBLE_PUSH_HUAWEI) + " HW isSupport : " + y.HUAWEI.equals(l.a(this.a)));
                com.xiaomi.channel.commonutils.logger.b.m3434a(sb.toString());
            }
            if (this.b.getOpenHmsPush()) {
                Context context = this.a;
                c cVar4 = c.ASSEMBLE_PUSH_HUAWEI;
                if (g.m3479a(context, cVar4) && y.HUAWEI.equals(l.a(this.a))) {
                    if (!m3476a(cVar4)) {
                        a(cVar4, ac.a(this.a, cVar4));
                    }
                    com.xiaomi.channel.commonutils.logger.b.c("hw manager add to list");
                } else {
                    cVar = c.ASSEMBLE_PUSH_HUAWEI;
                    if (m3476a(cVar) && (abstractPushManagerA = a(cVar)) != null) {
                        m3475a(cVar);
                        abstractPushManagerA.unregister();
                    }
                }
            } else {
                cVar = c.ASSEMBLE_PUSH_HUAWEI;
                if (m3476a(cVar)) {
                    m3475a(cVar);
                    abstractPushManagerA.unregister();
                }
            }
            if (this.b.getOpenFCMPush()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ASSEMBLE_PUSH : ");
                sb2.append(" FCM user switch : " + this.b.getOpenFCMPush() + " FCM online switch : " + g.m3479a(this.a, c.ASSEMBLE_PUSH_FCM) + " FCM isSupport : " + l.m3483a(this.a));
                com.xiaomi.channel.commonutils.logger.b.m3434a(sb2.toString());
            }
            if (this.b.getOpenFCMPush()) {
                Context context2 = this.a;
                c cVar5 = c.ASSEMBLE_PUSH_FCM;
                if (g.m3479a(context2, cVar5) && l.m3483a(this.a)) {
                    if (!m3476a(cVar5)) {
                        a(cVar5, ac.a(this.a, cVar5));
                    }
                    FCMPushHelper.saveSenderId(this.a, this.b.getFCMSenderId());
                    com.xiaomi.channel.commonutils.logger.b.c("fcm manager add to list");
                } else {
                    cVar2 = c.ASSEMBLE_PUSH_FCM;
                    if (m3476a(cVar2) && (abstractPushManagerA2 = a(cVar2)) != null) {
                        m3475a(cVar2);
                        abstractPushManagerA2.unregister();
                    }
                }
            } else {
                cVar2 = c.ASSEMBLE_PUSH_FCM;
                if (m3476a(cVar2)) {
                    m3475a(cVar2);
                    abstractPushManagerA2.unregister();
                }
            }
            if (this.b.getOpenCOSPush()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("ASSEMBLE_PUSH : ");
                sb3.append(" COS user switch : " + this.b.getOpenCOSPush() + " COS online switch : " + g.m3479a(this.a, c.ASSEMBLE_PUSH_COS) + " COS isSupport : " + l.b(this.a));
                com.xiaomi.channel.commonutils.logger.b.m3434a(sb3.toString());
            }
            if (this.b.getOpenCOSPush()) {
                Context context3 = this.a;
                c cVar6 = c.ASSEMBLE_PUSH_COS;
                if (g.m3479a(context3, cVar6) && l.b(this.a)) {
                    a(cVar6, ac.a(this.a, cVar6));
                } else {
                    cVar3 = c.ASSEMBLE_PUSH_COS;
                    if (m3476a(cVar3) && (abstractPushManagerA3 = a(cVar3)) != null) {
                        m3475a(cVar3);
                        abstractPushManagerA3.unregister();
                    }
                }
            } else {
                cVar3 = c.ASSEMBLE_PUSH_COS;
                if (m3476a(cVar3)) {
                    m3475a(cVar3);
                    abstractPushManagerA3.unregister();
                }
            }
            if (this.b.getOpenFTOSPush()) {
                Context context4 = this.a;
                c cVar7 = c.ASSEMBLE_PUSH_FTOS;
                if (g.m3479a(context4, cVar7) && l.c(this.a)) {
                    a(cVar7, ac.a(this.a, cVar7));
                    return;
                }
            }
            c cVar8 = c.ASSEMBLE_PUSH_FTOS;
            if (!m3476a(cVar8) || (abstractPushManagerA4 = a(cVar8)) == null) {
                return;
            }
            m3475a(cVar8);
            abstractPushManagerA4.unregister();
        }
    }

    public AbstractPushManager a(c cVar) {
        return this.d.get(cVar);
    }

    public void a(PushConfiguration pushConfiguration) {
        this.b = pushConfiguration;
        this.c = true;
        if (pushConfiguration.getOpenHmsPush() || this.b.getOpenFCMPush() || this.b.getOpenCOSPush() || this.b.getOpenFTOSPush()) {
            at.a(this.a).a(new u(this, 101, "assemblePush"));
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3475a(c cVar) {
        this.d.remove(cVar);
    }

    public void a(c cVar, AbstractPushManager abstractPushManager) {
        if (abstractPushManager != null) {
            if (this.d.containsKey(cVar)) {
                this.d.remove(cVar);
            }
            this.d.put(cVar, abstractPushManager);
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3476a(c cVar) {
        return this.d.containsKey(cVar);
    }

    public boolean b(c cVar) {
        int i = v.a[cVar.ordinal()];
        boolean openCOSPush = false;
        if (i == 1) {
            PushConfiguration pushConfiguration = this.b;
            if (pushConfiguration != null) {
                return pushConfiguration.getOpenHmsPush();
            }
            return false;
        }
        if (i == 2) {
            PushConfiguration pushConfiguration2 = this.b;
            if (pushConfiguration2 != null) {
                return pushConfiguration2.getOpenFCMPush();
            }
            return false;
        }
        if (i == 3) {
            PushConfiguration pushConfiguration3 = this.b;
            if (pushConfiguration3 != null) {
                openCOSPush = pushConfiguration3.getOpenCOSPush();
            }
        } else if (i != 4) {
            return false;
        }
        PushConfiguration pushConfiguration4 = this.b;
        return pushConfiguration4 != null ? pushConfiguration4.getOpenFTOSPush() : openCOSPush;
    }

    @Override // com.xiaomi.mipush.sdk.AbstractPushManager
    public void register() {
        com.xiaomi.channel.commonutils.logger.b.m3434a("ASSEMBLE_PUSH : assemble push register");
        if (this.d.size() <= 0) {
            b();
        }
        if (this.d.size() > 0) {
            for (AbstractPushManager abstractPushManager : this.d.values()) {
                if (abstractPushManager != null) {
                    abstractPushManager.register();
                }
            }
            g.e(this.a);
        }
    }

    @Override // com.xiaomi.mipush.sdk.AbstractPushManager
    public void unregister() {
        com.xiaomi.channel.commonutils.logger.b.m3434a("ASSEMBLE_PUSH : assemble push unregister");
        for (AbstractPushManager abstractPushManager : this.d.values()) {
            if (abstractPushManager != null) {
                abstractPushManager.unregister();
            }
        }
        this.d.clear();
    }
}
