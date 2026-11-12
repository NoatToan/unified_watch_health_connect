package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.component.Constants;
import defpackage.fbs;
import defpackage.gv5;
import defpackage.hds;
import defpackage.hht;
import defpackage.iht;
import defpackage.k8s;
import defpackage.lzs;
import defpackage.obs;
import defpackage.qcs;
import defpackage.x9s;
import defpackage.y0t;
import defpackage.yes;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static n0 f14248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f14249b;

    public interface a {
        void a();
    }

    public static int a(Context context) {
        return context.getSharedPreferences("mipush_account", 0).getInt("enc_req_fail_count", 0);
    }

    public static synchronized n0 b(Context context) {
        try {
            n0 n0Var = f14248a;
            if (n0Var != null) {
                return n0Var;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_account", 0);
            String string = sharedPreferences.getString("uuid", null);
            String string2 = sharedPreferences.getString("token", null);
            String string3 = sharedPreferences.getString("security", null);
            String string4 = sharedPreferences.getString(com.xiaomi.onetrack.b.g.d, null);
            String string5 = sharedPreferences.getString("app_token", null);
            String string6 = sharedPreferences.getString("package_name", null);
            String string7 = sharedPreferences.getString("device_id", null);
            int i = sharedPreferences.getInt("env_type", 1);
            if (!TextUtils.isEmpty(string7) && lzs.m(string7)) {
                string7 = lzs.z(context);
                sharedPreferences.edit().putString("device_id", string7).commit();
            }
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
                return null;
            }
            String strZ = lzs.z(context);
            if (!"com.xiaomi.xmsf".equals(context.getPackageName()) && !TextUtils.isEmpty(strZ) && !TextUtils.isEmpty(string7) && !string7.equals(strZ)) {
                x9s.o("read_phone_state permission changes.");
            }
            n0 n0Var2 = new n0(string, string2, string3, string4, string5, string6, i);
            f14248a = n0Var2;
            return n0Var2;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0318  */
    /* JADX WARN: Code duplicated, block: B:13:0x0046  */
    public static synchronized n0 c(Context context, String str, String str2, String str3) {
        String strSubstring;
        PackageInfo packageInfo;
        boolean z;
        fbs fbsVarC;
        try {
            TreeMap treeMap = new TreeMap();
            treeMap.put("devid", lzs.h(context, false));
            n0 n0Var = f14248a;
            if (n0Var == null || TextUtils.isEmpty(n0Var.f14246a)) {
                strSubstring = null;
            } else {
                treeMap.put("uuid", f14248a.f14246a);
                int iLastIndexOf = f14248a.f14246a.lastIndexOf("/");
                if (iLastIndexOf != -1) {
                    strSubstring = f14248a.f14246a.substring(iLastIndexOf + 1);
                } else {
                    strSubstring = null;
                }
            }
            k8s.a(context).d(treeMap);
            String str4 = k(context) ? "1000271" : str2;
            String str5 = k(context) ? "420100086271" : str3;
            String str6 = k(context) ? "com.xiaomi.xmsf" : str;
            treeMap.put("appid", str4);
            treeMap.put("apptoken", str5);
            try {
                packageInfo = context.getPackageManager().getPackageInfo(str6, 16384);
            } catch (Exception e) {
                x9s.s(e);
                packageInfo = null;
            }
            treeMap.put("appversion", packageInfo != null ? String.valueOf(packageInfo.versionCode) : "0");
            treeMap.put("sdkversion", Integer.toString(50708));
            treeMap.put("packagename", str6);
            treeMap.put("model", Build.MODEL);
            treeMap.put("board", Build.BOARD);
            if (!y0t.t()) {
                String strT = lzs.t(context);
                String str7 = TextUtils.isEmpty(strT) ? "" : "" + qcs.b(strT);
                String strX = lzs.x(context);
                if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(strX)) {
                    str7 = str7 + "," + strX;
                }
                if (!TextUtils.isEmpty(str7)) {
                    treeMap.put("imei_md5", str7);
                }
            }
            treeMap.put(CommonConstants.KEY_OS, Build.VERSION.RELEASE + "-" + Build.VERSION.INCREMENTAL);
            int iC = lzs.c();
            if (iC >= 0) {
                treeMap.put("space_id", Integer.toString(iC));
            }
            treeMap.put(CommonConstants.KEY_BRAND, Build.BRAND + "");
            treeMap.put("ram", lzs.e());
            treeMap.put("rom", lzs.o());
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : treeMap.entrySet()) {
                try {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                } catch (JSONException e2) {
                    x9s.D("failed to add data in json format: k=" + ((String) entry.getKey()) + ",v=" + ((String) entry.getValue()) + ". " + e2);
                }
            }
            String strA = hds.a(jSONObject.toString());
            TreeMap treeMap2 = new TreeMap();
            treeMap2.put(Constants.KEY_REQUEST_DATA, strA);
            treeMap2.put("keyPairVer", "1");
            if (a(context) >= 2 || TextUtils.isEmpty(strA)) {
                z = false;
            } else {
                x9s.o("r.data = " + strA);
                z = true;
            }
            String strE = e(context, z);
            if (TextUtils.isEmpty(strE)) {
                return null;
            }
            if (z) {
                treeMap = treeMap2;
            }
            try {
                fbsVarC = obs.c(context, strE, treeMap);
            } catch (IOException e3) {
                x9s.D("device registration request failed. " + e3);
                fbsVarC = null;
            }
            if (fbsVarC != null && fbsVarC.f17637a == 200) {
                String strA2 = fbsVarC.a();
                if (!TextUtils.isEmpty(strA2)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(strA2);
                        try {
                            if (jSONObject2.getInt("code") == 0) {
                                JSONObject jSONObject3 = jSONObject2.getJSONObject("data");
                                String string = jSONObject3.getString("ssecurity");
                                String string2 = jSONObject3.getString("token");
                                String string3 = jSONObject3.getString("userId");
                                if (TextUtils.isEmpty(strSubstring)) {
                                    strSubstring = "an" + qcs.a(6);
                                }
                                n0 n0Var2 = new n0(string3 + "@xiaomi.com/" + strSubstring, string2, string, str4, str5, str6, hht.a());
                                i(context, n0Var2);
                                f14248a = n0Var2;
                                h(context, 0);
                                x9s.o("device registration is successful. " + string3);
                                return n0Var2;
                            }
                            iht.a(context, jSONObject2.getInt("code"), jSONObject2.optString("description"));
                            x9s.o("device registration resp: " + strA2);
                        } catch (JSONException e4) {
                            e = e4;
                            x9s.D("failed to parse respone json data. " + e);
                        } catch (Throwable th) {
                            th = th;
                            x9s.D("unknow throwable. " + th);
                        }
                    } catch (JSONException e5) {
                        e = e5;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    x9s.D("failed to parse respone json data. " + e);
                }
            }
            if (z && obs.w(context)) {
                h(context, a(context) + 1);
            }
            x9s.o("fail to register push account. meet error.");
            return null;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public static String d(Context context) {
        n0 n0VarB = b(context);
        if (n0VarB != null && !TextUtils.isEmpty(n0VarB.f14246a)) {
            String[] strArrSplit = n0VarB.f14246a.split(gv5.CONNECT_VALUE_STR);
            if (strArrSplit.length > 0) {
                return strArrSplit[0];
            }
        }
        return null;
    }

    public static String e(Context context, boolean z) {
        String strB = yes.a(context).b();
        String str = z ? "/pass/v2/register/encrypt" : "/pass/v2/register";
        if (hht.d()) {
            return "http://10.38.162.35:9085" + str;
        }
        if (!com.xiaomi.push.m.China.name().equals(strB)) {
            return null;
        }
        return "https://cn.register.xmpush.xiaomi.com" + str;
    }

    public static void f() {
        a aVar = f14249b;
        if (aVar != null) {
            aVar.a();
        }
    }

    public static void g(Context context) {
        context.getSharedPreferences("mipush_account", 0).edit().clear().commit();
        f14248a = null;
        f();
    }

    public static void h(Context context, int i) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_account", 0).edit();
        editorEdit.putInt("enc_req_fail_count", i);
        editorEdit.commit();
    }

    public static void i(Context context, n0 n0Var) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_account", 0).edit();
        editorEdit.putString("uuid", n0Var.f14246a);
        editorEdit.putString("security", n0Var.c);
        editorEdit.putString("token", n0Var.f14247b);
        editorEdit.putString(com.xiaomi.onetrack.b.g.d, n0Var.d);
        editorEdit.putString("package_name", n0Var.f);
        editorEdit.putString("app_token", n0Var.e);
        editorEdit.putString("device_id", lzs.z(context));
        editorEdit.putInt("env_type", n0Var.g);
        editorEdit.commit();
        f();
    }

    public static void j(a aVar) {
        f14249b = aVar;
    }

    public static boolean k(Context context) {
        return context.getPackageName().equals("com.xiaomi.xmsf");
    }
}
