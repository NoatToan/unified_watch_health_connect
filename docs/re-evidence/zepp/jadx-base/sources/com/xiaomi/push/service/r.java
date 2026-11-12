package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.huami.device.feature.notification.utils.PkgNameConstants;
import com.huami.passport.Configs;
import com.xiaomi.channel.commonutils.android.Region;
import com.xiaomi.market.sdk.Constants;
import com.xiaomi.push.BuildConfig;
import com.xiaomi.push.ad;
import com.xiaomi.push.bu;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import org.cybergarage.upnp.device.ST;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class r {
    private static q a;
    private static a b;

    public interface a {
        void a();
    }

    public static synchronized q a(Context context) {
        q qVar = a;
        if (qVar != null) {
            return qVar;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_account", 0);
        String string = sharedPreferences.getString(ST.UUID_DEVICE, null);
        String string2 = sharedPreferences.getString("token", null);
        String string3 = sharedPreferences.getString("security", null);
        String string4 = sharedPreferences.getString("app_id", null);
        String string5 = sharedPreferences.getString(Configs.Params.APP_TOKEN, null);
        String string6 = sharedPreferences.getString("package_name", null);
        String string7 = sharedPreferences.getString("device_id", null);
        int i = sharedPreferences.getInt("env_type", 1);
        if (!TextUtils.isEmpty(string7) && com.xiaomi.channel.commonutils.android.c.a(string7)) {
            string7 = com.xiaomi.channel.commonutils.android.c.d(context);
            sharedPreferences.edit().putString("device_id", string7).commit();
        }
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
            return null;
        }
        String strD = com.xiaomi.channel.commonutils.android.c.d(context);
        if (!PkgNameConstants.XMSF.equals(context.getPackageName()) && !TextUtils.isEmpty(strD) && !TextUtils.isEmpty(string7) && !string7.equals(strD)) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("read_phone_state permission changes.");
        }
        q qVar2 = new q(string, string2, string3, string4, string5, string6, i);
        a = qVar2;
        return qVar2;
    }

    /* JADX WARN: Code duplicated, block: B:91:0x0280  */
    public static synchronized q a(Context context, String str, String str2, String str3) {
        PackageInfo packageInfo;
        boolean z;
        com.xiaomi.push.w wVarA;
        String str4;
        int iLastIndexOf;
        TreeMap treeMap = new TreeMap();
        treeMap.put("devid", com.xiaomi.channel.commonutils.android.c.a(context));
        q qVar = a;
        String strSubstring = (qVar == null || TextUtils.isEmpty(qVar.f209a) || (iLastIndexOf = a.f209a.lastIndexOf(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE)) == -1) ? null : a.f209a.substring(iLastIndexOf + 1);
        String strB = com.xiaomi.channel.commonutils.android.c.b(context);
        if (!TextUtils.isEmpty(strB)) {
            treeMap.put("gaid", strB);
        }
        String str5 = e(context) ? "1000271" : str2;
        String str6 = e(context) ? "420100086271" : str3;
        String str7 = e(context) ? PkgNameConstants.XMSF : str;
        treeMap.put("appid", str5);
        treeMap.put("apptoken", str6);
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str7, 16384);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            packageInfo = null;
        }
        treeMap.put("appversion", packageInfo != null ? String.valueOf(packageInfo.versionCode) : "0");
        treeMap.put("sdkversion", Integer.toString(BuildConfig.VERSION_CODE));
        treeMap.put("packagename", str7);
        treeMap.put("model", Build.MODEL);
        treeMap.put(Constants.JSON_VERSION, Build.VERSION.RELEASE + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER + Build.VERSION.INCREMENTAL);
        int iA = com.xiaomi.channel.commonutils.android.c.a();
        if (iA >= 0) {
            treeMap.put("space_id", Integer.toString(iA));
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : treeMap.entrySet()) {
            try {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            } catch (JSONException e2) {
                com.xiaomi.channel.commonutils.logger.b.d("failed to add data in json format: k=" + ((String) entry.getKey()) + ",v=" + ((String) entry.getValue()) + ". " + e2);
            }
        }
        String strA = bk.a(jSONObject.toString());
        TreeMap treeMap2 = new TreeMap();
        treeMap2.put("requestData", strA);
        treeMap2.put("keyPairVer", "1");
        if (b(context) >= 2 || TextUtils.isEmpty(strA)) {
            z = false;
        } else {
            com.xiaomi.channel.commonutils.logger.b.m3434a("r.data = " + strA);
            z = true;
        }
        String strC = c(context, z);
        if (z) {
            treeMap = treeMap2;
        }
        try {
            wVarA = com.xiaomi.push.y.a(context, strC, treeMap);
        } catch (IOException e3) {
            com.xiaomi.channel.commonutils.logger.b.d("device registration request failed. " + e3);
            wVarA = null;
        }
        if (wVarA == null || wVarA.a != 200) {
            z = z;
        } else {
            String strA2 = wVarA.a();
            if (TextUtils.isEmpty(strA2)) {
                z = z;
            } else {
                try {
                    JSONObject jSONObject2 = new JSONObject(strA2);
                    try {
                        if (jSONObject2.getInt("code") == 0) {
                            JSONObject jSONObject3 = jSONObject2.getJSONObject("data");
                            String string = jSONObject3.getString("ssecurity");
                            String string2 = jSONObject3.getString("token");
                            String string3 = jSONObject3.getString("userId");
                            if (TextUtils.isEmpty(strSubstring)) {
                                strSubstring = com.alipay.sdk.m.s.a.s + ad.a(6);
                            }
                            q qVar2 = new q(string3 + "@xiaomi.com/" + strSubstring, string2, string, str5, str6, str7, com.xiaomi.push.j.a());
                            a(context, qVar2);
                            a = qVar2;
                            d(context, 0);
                            com.xiaomi.channel.commonutils.logger.b.m3434a("device registration is successful. " + string3);
                            return qVar2;
                        }
                        z = z;
                        u.a(context, jSONObject2.getInt("code"), jSONObject2.optString("description"));
                        com.xiaomi.channel.commonutils.logger.b.m3434a("device registration resp: " + strA2);
                    } catch (JSONException e4) {
                        e = e4;
                        str4 = "failed to parse respone json data. " + e;
                        com.xiaomi.channel.commonutils.logger.b.d(str4);
                    } catch (Throwable th) {
                        th = th;
                        str4 = "unknow throwable. " + th;
                        com.xiaomi.channel.commonutils.logger.b.d(str4);
                    }
                } catch (JSONException e5) {
                    e = e5;
                } catch (Throwable th2) {
                    th = th2;
                }
                str4 = "failed to parse respone json data. " + e;
                com.xiaomi.channel.commonutils.logger.b.d(str4);
            }
        }
        if (z && com.xiaomi.push.y.b(context)) {
            d(context, b(context) + 1);
        }
        com.xiaomi.channel.commonutils.logger.b.m3434a("fail to register push account. meet error.");
        return null;
    }

    public static void a() {
        a aVar = b;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m3836a(Context context) {
        context.getSharedPreferences("mipush_account", 0).edit().clear().commit();
        a = null;
        a();
    }

    public static void a(Context context, q qVar) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_account", 0).edit();
        editorEdit.putString(ST.UUID_DEVICE, qVar.f209a);
        editorEdit.putString("security", qVar.c);
        editorEdit.putString("token", qVar.b);
        editorEdit.putString("app_id", qVar.d);
        editorEdit.putString("package_name", qVar.f);
        editorEdit.putString(Configs.Params.APP_TOKEN, qVar.e);
        editorEdit.putString("device_id", com.xiaomi.channel.commonutils.android.c.d(context));
        editorEdit.putInt("env_type", qVar.a);
        editorEdit.commit();
        a();
    }

    public static void a(a aVar) {
        b = aVar;
    }

    private static int b(Context context) {
        return context.getSharedPreferences("mipush_account", 0).getInt("enc_req_fail_count", 0);
    }

    private static String c(Context context, boolean z) {
        StringBuilder sb;
        String str;
        String strA = com.xiaomi.push.service.a.a(context).a();
        String str2 = z ? "/pass/v2/register/encrypt" : "/pass/v2/register";
        if (com.xiaomi.push.j.b()) {
            sb = new StringBuilder();
            sb.append("http://");
            sb.append(bu.a);
            str = ":9085";
        } else if (Region.Global.name().equals(strA)) {
            sb = new StringBuilder();
            str = "https://register.xmpush.global.xiaomi.com";
        } else if (Region.Europe.name().equals(strA)) {
            sb = new StringBuilder();
            str = "https://fr.register.xmpush.global.xiaomi.com";
        } else if (Region.Russia.name().equals(strA)) {
            sb = new StringBuilder();
            str = "https://ru.register.xmpush.global.xiaomi.com";
        } else if (Region.India.name().equals(strA)) {
            sb = new StringBuilder();
            str = "https://idmb.register.xmpush.global.xiaomi.com";
        } else {
            sb = new StringBuilder();
            sb.append("https://");
            com.xiaomi.push.j.m3789a();
            str = "";
        }
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    private static void d(Context context, int i) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_account", 0).edit();
        editorEdit.putInt("enc_req_fail_count", i);
        editorEdit.commit();
    }

    private static boolean e(Context context) {
        return context.getPackageName().equals(PkgNameConstants.XMSF);
    }
}
