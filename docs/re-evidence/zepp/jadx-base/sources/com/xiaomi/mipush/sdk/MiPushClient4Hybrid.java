package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.push.BuildConfig;
import com.xiaomi.push.ad;
import com.xiaomi.push.bg;
import com.xiaomi.push.cz;
import com.xiaomi.push.df;
import com.xiaomi.push.di;
import com.xiaomi.push.dj;
import com.xiaomi.push.dl;
import com.xiaomi.push.dt;
import com.xiaomi.push.du;
import com.xiaomi.push.dv;
import com.xiaomi.push.ea;
import com.xiaomi.push.eb;
import com.xiaomi.push.ee;
import com.xiaomi.push.service.aw;
import com.xiaomi.push.service.bj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class MiPushClient4Hybrid {
    private static Map<String, a.C1043a> a = new HashMap();
    private static Map<String, Long> b = new HashMap();
    private static MiPushCallback c;

    public static class MiPushCallback {
        public void onCommandResult(String str, MiPushCommandMessage miPushCommandMessage) {
        }

        public void onReceiveRegisterResult(String str, MiPushCommandMessage miPushCommandMessage) {
        }

        public void onReceiveUnregisterResult(String str, MiPushCommandMessage miPushCommandMessage) {
        }
    }

    private static void a(Context context, String str) {
        context.getSharedPreferences("mipush_extra", 0).edit().putLong("last_pull_notification_" + str, System.currentTimeMillis()).commit();
    }

    private static short b(MiPushMessage miPushMessage, boolean z) {
        String str = miPushMessage.getExtra() == null ? "" : miPushMessage.getExtra().get(Constants.EXTRA_KEY_HYBRID_DEVICE_STATUS);
        int iIntValue = TextUtils.isEmpty(str) ? 0 : Integer.valueOf(str).intValue();
        if (!z) {
            iIntValue = (iIntValue & (-4)) + com.xiaomi.channel.commonutils.android.a.b.NOT_ALLOWED.a();
        }
        return (short) iIntValue;
    }

    private static boolean c(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        StringBuilder sb = new StringBuilder();
        sb.append("last_pull_notification_");
        sb.append(str);
        return Math.abs(System.currentTimeMillis() - sharedPreferences.getLong(sb.toString(), -1L)) > 300000;
    }

    public static boolean isRegistered(Context context, String str) {
        return a.m3457a(context).a(str) != null;
    }

    public static void onReceiveRegisterResult(Context context, dv dvVar) {
        a.C1043a c1043a;
        String strC = dvVar.c();
        if (dvVar.a() == 0 && (c1043a = a.get(strC)) != null) {
            c1043a.a(dvVar.e, dvVar.f);
            a.m3457a(context).a(strC, c1043a);
        }
        ArrayList arrayList = null;
        if (!TextUtils.isEmpty(dvVar.e)) {
            arrayList = new ArrayList();
            arrayList.add(dvVar.e);
        }
        MiPushCommandMessage miPushCommandMessageGenerateCommandMessage = PushMessageHelper.generateCommandMessage(bg.COMMAND_REGISTER.f48a, arrayList, dvVar.f143a, dvVar.d, null);
        MiPushCallback miPushCallback = c;
        if (miPushCallback != null) {
            miPushCallback.onReceiveRegisterResult(strC, miPushCommandMessageGenerateCommandMessage);
        }
    }

    public static void onReceiveUnregisterResult(Context context, eb ebVar) {
        MiPushCommandMessage miPushCommandMessageGenerateCommandMessage = PushMessageHelper.generateCommandMessage(bg.COMMAND_UNREGISTER.f48a, null, ebVar.a, ebVar.d, null);
        String strA = ebVar.a();
        MiPushCallback miPushCallback = c;
        if (miPushCallback != null) {
            miPushCallback.onReceiveUnregisterResult(strA, miPushCommandMessageGenerateCommandMessage);
        }
    }

    public static void registerPush(Context context, String str, String str2, String str3) {
        if (a.m3457a(context).m3462a(str2, str3, str)) {
            ArrayList arrayList = new ArrayList();
            a.C1043a c1043aA = a.m3457a(context).a(str);
            if (c1043aA != null) {
                arrayList.add(c1043aA.c);
                MiPushCommandMessage miPushCommandMessageGenerateCommandMessage = PushMessageHelper.generateCommandMessage(bg.COMMAND_REGISTER.f48a, arrayList, 0L, null, null);
                MiPushCallback miPushCallback = c;
                if (miPushCallback != null) {
                    miPushCallback.onReceiveRegisterResult(str, miPushCommandMessageGenerateCommandMessage);
                }
            }
            if (c(context, str)) {
                dt dtVar = new dt();
                dtVar.b(str2);
                dtVar.c(df.PullOfflineMessage.f77a);
                dtVar.a(aw.a());
                dtVar.a(false);
                ag.a(context).a(dtVar, cz.Notification, false, true, null, false, str, str2);
                com.xiaomi.channel.commonutils.logger.b.b("MiPushClient4Hybrid pull offline pass through message");
                a(context, str);
                return;
            }
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis - (b.get(str) != null ? b.get(str).longValue() : 0L)) < 5000) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("MiPushClient4Hybrid  Could not send register message within 5s repeatedly.");
            return;
        }
        b.put(str, Long.valueOf(jCurrentTimeMillis));
        String strA = ad.a(6);
        a.C1043a c1043a = new a.C1043a(context);
        c1043a.c(str2, str3, strA);
        a.put(str, c1043a);
        du duVar = new du();
        duVar.a(aw.a());
        duVar.b(str2);
        duVar.e(str3);
        duVar.d(str);
        duVar.f(strA);
        duVar.c(com.xiaomi.channel.commonutils.android.a.m3417a(context, context.getPackageName()));
        duVar.b(com.xiaomi.channel.commonutils.android.a.a(context, context.getPackageName()));
        duVar.h(BuildConfig.VERSION_NAME);
        duVar.a(BuildConfig.VERSION_CODE);
        duVar.a(dj.Init);
        int iA = com.xiaomi.channel.commonutils.android.c.a();
        if (iA >= 0) {
            duVar.c(iA);
        }
        dt dtVar2 = new dt();
        dtVar2.c(df.HybridRegister.f77a);
        dtVar2.b(a.m3457a(context).m3458a());
        dtVar2.d(context.getPackageName());
        dtVar2.a(ee.a(duVar));
        dtVar2.a(aw.a());
        ag.a(context).a(dtVar2, cz.Notification, (di) null);
    }

    public static void removeDuplicateCache(Context context, MiPushMessage miPushMessage) {
        String messageId = miPushMessage.getExtra() != null ? miPushMessage.getExtra().get("jobkey") : null;
        if (TextUtils.isEmpty(messageId)) {
            messageId = miPushMessage.getMessageId();
        }
        ae.a(context, messageId);
    }

    public static void reportMessageArrived(Context context, MiPushMessage miPushMessage, boolean z) {
        if (miPushMessage == null || miPushMessage.getExtra() == null) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("do not ack message, message is null");
            return;
        }
        try {
            dl dlVar = new dl();
            dlVar.b(a.m3457a(context).m3458a());
            dlVar.a(miPushMessage.getMessageId());
            dlVar.a(Long.valueOf(miPushMessage.getExtra().get(Constants.EXTRA_KEY_HYBRID_MESSAGE_TS)).longValue());
            dlVar.a(b(miPushMessage, z));
            if (!TextUtils.isEmpty(miPushMessage.getTopic())) {
                dlVar.c(miPushMessage.getTopic());
            }
            ag.a(context).a(dlVar, cz.AckMessage, false, bj.a(PushMessageHelper.generateMessage(miPushMessage)));
            com.xiaomi.channel.commonutils.logger.b.b("MiPushClient4Hybrid ack mina message, messageId is " + miPushMessage.getMessageId());
        } catch (Throwable th) {
            try {
                com.xiaomi.channel.commonutils.logger.b.a(th);
            } finally {
                miPushMessage.getExtra().remove(Constants.EXTRA_KEY_HYBRID_MESSAGE_TS);
                miPushMessage.getExtra().remove(Constants.EXTRA_KEY_HYBRID_DEVICE_STATUS);
            }
        }
    }

    public static void reportMessageClicked(Context context, MiPushMessage miPushMessage) {
        MiPushClient.reportMessageClicked(context, miPushMessage);
    }

    public static void setCallback(MiPushCallback miPushCallback) {
        c = miPushCallback;
    }

    public static void unregisterPush(Context context, String str) {
        b.remove(str);
        a.C1043a c1043aA = a.m3457a(context).a(str);
        if (c1043aA == null) {
            return;
        }
        ea eaVar = new ea();
        eaVar.a(aw.a());
        eaVar.d(str);
        eaVar.b(c1043aA.f33a);
        eaVar.c(c1043aA.c);
        eaVar.e(c1043aA.b);
        dt dtVar = new dt();
        dtVar.c(df.HybridUnregister.f77a);
        dtVar.b(a.m3457a(context).m3458a());
        dtVar.d(context.getPackageName());
        dtVar.a(ee.a(eaVar));
        dtVar.a(aw.a());
        ag.a(context).a(dtVar, cz.Notification, (di) null);
        a.m3457a(context).b(str);
    }

    public static void uploadClearMessageData(Context context, LinkedList<? extends Object> linkedList) {
        com.xiaomi.push.service.ag.a(context, linkedList);
    }
}
