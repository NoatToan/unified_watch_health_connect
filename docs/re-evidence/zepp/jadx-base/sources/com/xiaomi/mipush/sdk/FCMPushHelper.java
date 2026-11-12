package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import com.huami.device.feature.notification.utils.PkgNameConstants;
import com.xiaomi.push.cz;
import com.xiaomi.push.dq;
import com.xiaomi.push.dx;
import com.xiaomi.push.ee;
import com.xiaomi.push.service.bd;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class FCMPushHelper {
    private static Map<String, String> a(Context context) {
        HashMap map = new HashMap();
        map.put("actionType", String.valueOf(cz.AckMessage.a()));
        map.put("deviceStatus", String.valueOf((int) ee.a(context, context.getPackageName())));
        map.put("isMIUI", String.valueOf(com.xiaomi.channel.commonutils.android.f.m3426a()));
        map.put("mat", Long.toString(System.currentTimeMillis()));
        return map;
    }

    private static void b(Context context, dq dqVar) {
        try {
            MiPushMessage miPushMessageGenerateMessage = PushMessageHelper.generateMessage((dx) aa.a(context, dqVar), dqVar.m3701a(), false);
            PushMessageReceiver pushMessageReceiverA = g.a(context);
            if (pushMessageReceiverA != null) {
                pushMessageReceiverA.onNotificationMessageArrived(context, miPushMessageGenerateMessage);
            }
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.b.a("fcm broadcast notification come error ", th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0089  */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    private static void c(Context context, byte[] bArr) {
        String str;
        boolean zM3472a = ag.a(context).m3472a();
        boolean z = true;
        boolean z2 = !PkgNameConstants.XMSF.equals(context.getPackageName());
        boolean zD = d(context);
        boolean z3 = false;
        if (zM3472a && z2 && zD) {
            bArr = com.xiaomi.push.service.m.a(bArr, a.m3457a(context).d());
            if (bArr == null) {
                str = "fcm message encrypt failed";
            } else {
                String strEncodeToString = Base64.encodeToString(bArr, 2);
                if (TextUtils.isEmpty(strEncodeToString)) {
                    com.xiaomi.channel.commonutils.logger.b.m3434a("fcm message buf base64 encode failed");
                    z = false;
                } else {
                    Intent intent = new Intent(bd.n);
                    intent.setPackage(PkgNameConstants.XMSF);
                    intent.setClassName(PkgNameConstants.XMSF, "com.xiaomi.push.service.XMPushService");
                    intent.putExtra("ext_fcm_container_buffer", strEncodeToString);
                    intent.putExtra("mipush_app_package", context.getPackageName());
                    context.startService(intent);
                    com.xiaomi.channel.commonutils.logger.b.m3434a("fcm message reroute to xmsf");
                }
                z3 = z;
            }
            if (z3) {
            }
            com.xiaomi.channel.commonutils.logger.b.b("fcm message post local");
            com.xiaomi.push.service.ag.a(context, com.xiaomi.push.service.v.a(bArr), bArr);
        }
        str = String.format("xmsf can not receive fcm msg - shouldUseMIUIPush=%s;isNotXmsf=%s;xmsfSupport=%s", Boolean.valueOf(zM3472a), Boolean.valueOf(z2), Boolean.valueOf(zD));
        com.xiaomi.channel.commonutils.logger.b.m3434a(str);
        if (z3) {
            com.xiaomi.channel.commonutils.logger.b.b("fcm message post local");
            com.xiaomi.push.service.ag.a(context, com.xiaomi.push.service.v.a(bArr), bArr);
        }
    }

    public static void clearToken(Context context) {
        g.m3477a(context, c.ASSEMBLE_PUSH_FCM);
    }

    public static void convertMessage(Intent intent) {
        g.a(intent);
    }

    private static boolean d(Context context) {
        return ((long) com.xiaomi.channel.commonutils.android.f.b(context)) >= 50002000 && e(context);
    }

    private static boolean e(Context context) {
        return context.getSharedPreferences("mipush_extra", 0).getBoolean("is_xmsf_sup_decrypt", false);
    }

    public static String getSenderId(Context context) {
        return context.getSharedPreferences("mipush_extra", 0).getString("fcm_sender_id", "");
    }

    public static boolean isFCMSwitchOpen(Context context) {
        return g.m3479a(context, c.ASSEMBLE_PUSH_FCM) && MiPushClient.getOpenFCMPush(context);
    }

    public static void notifyFCMNotificationCome(Context context, Map<String, String> map) {
        PushMessageReceiver pushMessageReceiverA;
        String str = map.get("pushMsg");
        if (TextUtils.isEmpty(str) || (pushMessageReceiverA = g.a(context)) == null) {
            return;
        }
        pushMessageReceiverA.onNotificationMessageArrived(context, g.a(str));
    }

    public static Map<String, String> notifyFCMPassThoughMessageCome(Context context, Map<String, String> map) {
        PushMessageReceiver pushMessageReceiverA;
        String str = map.get("pushMsg");
        if (!TextUtils.isEmpty(str) && (pushMessageReceiverA = g.a(context)) != null) {
            pushMessageReceiverA.onReceivePassThroughMessage(context, g.a(str));
        }
        String str2 = map.get("mipushContainer");
        if (TextUtils.isEmpty(str2)) {
            return new HashMap();
        }
        try {
            byte[] bArrDecode = Base64.decode(str2, 2);
            b(context, com.xiaomi.push.service.v.a(bArrDecode));
            c(context, bArrDecode);
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.b.a("fcm notify notification error ", th);
        }
        return a(context);
    }

    public static void persistIfXmsfSupDecrypt(Context context) {
        context.getSharedPreferences("mipush_extra", 0).edit().putBoolean("is_xmsf_sup_decrypt", ((long) com.xiaomi.channel.commonutils.android.f.b(context)) >= 50002000).apply();
    }

    public static void reportFCMMessageDelete() {
    }

    public static void saveSenderId(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        context.getSharedPreferences("mipush_extra", 0).edit().putString("fcm_sender_id", str).apply();
    }

    public static void uploadToken(Context context, String str) {
        g.a(context, c.ASSEMBLE_PUSH_FCM, str);
    }
}
