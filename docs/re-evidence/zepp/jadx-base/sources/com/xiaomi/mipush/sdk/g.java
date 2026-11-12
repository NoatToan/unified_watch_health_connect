package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.huami.message.api.WebConst;
import com.xiaomi.push.BuildConfig;
import com.xiaomi.push.dq;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class g {
    private static HashMap<String, String> a = new HashMap<>();

    public static int a() {
        Integer num = (Integer) com.xiaomi.push.z.a("com.xiaomi.assemble.control.AssembleConstants", "ASSEMBLE_VERSION_CODE");
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static MiPushMessage a(String str) {
        MiPushMessage miPushMessage = new MiPushMessage();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has(WebConst.QueryParam.MESSAGE_ID)) {
                    miPushMessage.setMessageId(jSONObject.getString(WebConst.QueryParam.MESSAGE_ID));
                }
                if (jSONObject.has("description")) {
                    miPushMessage.setDescription(jSONObject.getString("description"));
                }
                if (jSONObject.has("title")) {
                    miPushMessage.setTitle(jSONObject.getString("title"));
                }
                if (jSONObject.has("content")) {
                    miPushMessage.setContent(jSONObject.getString("content"));
                }
                if (jSONObject.has("passThrough")) {
                    miPushMessage.setPassThrough(jSONObject.getInt("passThrough"));
                }
                if (jSONObject.has("notifyType")) {
                    miPushMessage.setNotifyType(jSONObject.getInt("notifyType"));
                }
                if (jSONObject.has(WebConst.QueryParam.MESSAGE_TYPE)) {
                    miPushMessage.setMessageType(jSONObject.getInt(WebConst.QueryParam.MESSAGE_TYPE));
                }
                if (jSONObject.has("alias")) {
                    miPushMessage.setAlias(jSONObject.getString("alias"));
                }
                if (jSONObject.has("topic")) {
                    miPushMessage.setTopic(jSONObject.getString("topic"));
                }
                if (jSONObject.has("user_account")) {
                    miPushMessage.setUserAccount(jSONObject.getString("user_account"));
                }
                if (jSONObject.has("notifyId")) {
                    miPushMessage.setNotifyId(jSONObject.getInt("notifyId"));
                }
                if (jSONObject.has("category")) {
                    miPushMessage.setCategory(jSONObject.getString("category"));
                }
                if (jSONObject.has("isNotified")) {
                    miPushMessage.setNotified(jSONObject.getBoolean("isNotified"));
                }
                if (jSONObject.has("extra")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("extra");
                    Iterator<String> itKeys = jSONObject2.keys();
                    HashMap map = new HashMap();
                    while (itKeys != null && itKeys.hasNext()) {
                        String next = itKeys.next();
                        map.put(next, jSONObject2.getString(next));
                    }
                    if (map.size() > 0) {
                        miPushMessage.setExtra(map);
                    }
                }
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.d(e.toString());
            }
        }
        return miPushMessage;
    }

    public static PushMessageReceiver a(Context context) {
        ResolveInfo next;
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setPackage(context.getPackageName());
        try {
            List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 32);
            if (listQueryBroadcastReceivers != null) {
                Iterator<ResolveInfo> it2 = listQueryBroadcastReceivers.iterator();
                while (it2.hasNext()) {
                    next = it2.next();
                    ActivityInfo activityInfo = next.activityInfo;
                    if (activityInfo == null || !activityInfo.packageName.equals(context.getPackageName())) {
                    }
                }
                next = null;
            } else {
                next = null;
            }
            if (next != null) {
                return (PushMessageReceiver) com.xiaomi.channel.commonutils.android.k.a(context, next.activityInfo.name).newInstance();
            }
            return null;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.d(e.toString());
            return null;
        }
    }

    public static synchronized String a(Context context, String str) {
        String str2;
        str2 = a.get(str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        return str2;
    }

    public static String a(c cVar) {
        int i = a0.a[cVar.ordinal()];
        if (i == 1) {
            return "hms_push_token";
        }
        if (i == 2) {
            return "fcm_push_token_v2";
        }
        if (i == 3) {
            return "cos_push_token";
        }
        if (i != 4) {
            return null;
        }
        return "ftos_push_token";
    }

    public static HashMap<String, String> a(Context context, c cVar) {
        com.xiaomi.channel.commonutils.android.l.a aVarA;
        int iA;
        HashMap<String, String> map = new HashMap<>();
        String strA = a(cVar);
        if (TextUtils.isEmpty(strA)) {
            return map;
        }
        int i = a0.a[cVar.ordinal()];
        String string = null;
        ApplicationInfo applicationInfo = null;
        if (i != 1) {
            if (i == 2) {
                aVarA = new com.xiaomi.channel.commonutils.android.l.a(":", Constants.WAVE_SEPARATOR).a("brand", y.FCM.name()).a("token", a(context, strA)).a("package_name", context.getPackageName());
                iA = a();
                if (iA == 0) {
                    iA = BuildConfig.VERSION_CODE;
                }
            } else if (i == 3) {
                string = "brand:" + y.OPPO.name() + Constants.WAVE_SEPARATOR + "token:" + a(context, strA) + Constants.WAVE_SEPARATOR + "package_name:" + context.getPackageName();
            } else if (i == 4) {
                aVarA = new com.xiaomi.channel.commonutils.android.l.a(":", Constants.WAVE_SEPARATOR).a("brand", y.VIVO.name()).a("token", a(context, strA)).a("package_name", context.getPackageName());
                iA = a();
                if (iA != 0) {
                }
                string = aVarA.toString();
            }
            aVarA.a("version", Integer.valueOf(iA));
            string = aVarA.toString();
        } else {
            try {
                applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.d(e.toString());
            }
            string = "brand:" + l.a(context).name() + Constants.WAVE_SEPARATOR + "token:" + a(context, strA) + Constants.WAVE_SEPARATOR + "package_name:" + context.getPackageName() + Constants.WAVE_SEPARATOR + "app_id:" + (applicationInfo != null ? applicationInfo.metaData.getInt(Constants.HUAWEI_HMS_CLIENT_APPID) : -1);
        }
        map.put(Constants.ASSEMBLE_PUSH_REG_INFO, string);
        return map;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m3477a(Context context, c cVar) {
        String strA = a(cVar);
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        com.xiaomi.channel.commonutils.android.i.a(context.getSharedPreferences("mipush_extra", 0).edit().putString(strA, ""));
    }

    public static void a(Context context, c cVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iC = c(context, cVar, str);
        if (iC == 0) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("ASSEMBLE_PUSH : do not need to send token");
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.m3434a("ASSEMBLE_PUSH : send token upload, check:" + iC);
        f(cVar, str);
        am amVarA = j.a(cVar);
        if (amVarA == null) {
            return;
        }
        ag.a(context).a((String) null, amVarA, cVar);
    }

    public static void a(Intent intent) {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null || !extras.containsKey("pushMsg")) {
            return;
        }
        intent.putExtra(PushMessageHelper.KEY_MESSAGE, a(extras.getString("pushMsg")));
    }

    public static void a(String str, int i) {
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m3478a(Context context) {
        if (context == null) {
            return false;
        }
        return com.xiaomi.push.y.m3842a(context);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m3479a(Context context, c cVar) {
        j.m3482a(cVar);
        return true;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m3480a(c cVar) {
        return cVar == c.ASSEMBLE_PUSH_FTOS || cVar == c.ASSEMBLE_PUSH_FCM;
    }

    public static boolean a(dq dqVar, c cVar) {
        if (dqVar == null || dqVar.m3701a() == null || dqVar.m3701a().m3671a() == null) {
            return false;
        }
        return (cVar == c.ASSEMBLE_PUSH_FCM ? "FCM" : "").equalsIgnoreCase(dqVar.m3701a().m3671a().get("assemble_push_type"));
    }

    public static byte[] a(Context context, dq dqVar, c cVar) {
        if (a(dqVar, cVar)) {
            return com.xiaomi.push.ac.m3488a(d(context, cVar));
        }
        return null;
    }

    public static String b(c cVar) {
        return a(cVar) + "_version";
    }

    public static void b(Context context) {
        d.a(context).register();
    }

    public static void b(Context context, c cVar, String str) {
        com.xiaomi.push.o.a(context).a(new z(str, context, cVar));
    }

    private static int c(Context context, c cVar, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        String strA = a(cVar);
        String string = sharedPreferences.getString(strA, "");
        String strC = a.m3457a(context).c();
        String string2 = sharedPreferences.getString("last_check_token", "");
        if (TextUtils.isEmpty(strA)) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("ASSEMBLE_PUSH : can not find the key of token used in sp file");
            return 0;
        }
        if (TextUtils.isEmpty(string)) {
            return 1;
        }
        if (!string.equals(str)) {
            return 2;
        }
        if (!TextUtils.equals(strC, string2)) {
            return 3;
        }
        if (m3480a(cVar)) {
            if (a() != sharedPreferences.getInt(b(cVar), 0)) {
                return 4;
            }
        }
        return 0;
    }

    public static void c(Context context) {
        d.a(context).unregister();
    }

    public static String d(Context context, c cVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        String strA = a(cVar);
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return sharedPreferences.getString(strA, "");
    }

    public static void e(Context context) {
        boolean z = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        String strA = a(c.ASSEMBLE_PUSH_HUAWEI);
        String strA2 = a(c.ASSEMBLE_PUSH_FCM);
        if (!TextUtils.isEmpty(sharedPreferences.getString(strA, "")) && TextUtils.isEmpty(sharedPreferences.getString(strA2, ""))) {
            z = true;
        }
        if (z) {
            ag.a(context).q(2, strA);
        }
    }

    private static synchronized void f(c cVar, String str) {
        String strA = a(cVar);
        if (TextUtils.isEmpty(strA)) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("ASSEMBLE_PUSH : can not find the key of token used in sp file");
        } else if (TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("ASSEMBLE_PUSH : token is null");
        } else {
            a.put(strA, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void h(Context context, c cVar, String str) {
        String strA = a(cVar);
        if (TextUtils.isEmpty(strA)) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("ASSEMBLE_PUSH : can not find the key of token used in sp file");
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_extra", 0).edit();
        editorEdit.putString(strA, str).putString("last_check_token", a.m3457a(context).c());
        if (m3480a(cVar)) {
            editorEdit.putInt(b(cVar), a());
        }
        com.xiaomi.channel.commonutils.android.i.a(editorEdit);
        com.xiaomi.channel.commonutils.logger.b.m3434a("ASSEMBLE_PUSH : update sp file success!  " + str);
    }
}
