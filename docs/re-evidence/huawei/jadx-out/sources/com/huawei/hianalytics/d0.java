package com.huawei.hianalytics;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import com.huawei.hianalytics.core.common.EnvUtils;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.framework.config.DeviceAttributeCollector;
import com.huawei.hianalytics.framework.config.EvtHeaderAttributeCollector;
import com.huawei.hianalytics.framework.config.ICollectorConfig;
import com.huawei.hianalytics.framework.config.RomAttributeCollector;
import com.huawei.openalliance.ad.constant.OsType;
import com.huawei.operation.utils.Constants;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements ICollectorConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f11484b = k.b().a();

    public d0(String str) {
        this.f11483a = str;
    }

    @Override // com.huawei.hianalytics.framework.config.ICollectorConfig
    public final long getAbsTime() {
        if (!h.d.f11541a) {
            return 0L;
        }
        long jA = k.b().a().u;
        if (jA == 0) {
            jA = c2.a("global_v2", "public_key_abs_time", 0L);
            k.b().a().u = jA;
        }
        if (Math.abs(jA) > 604800000) {
            return jA;
        }
        return 0L;
    }

    @Override // com.huawei.hianalytics.framework.config.ICollectorConfig
    public final String getAppId() {
        String str = this.f11483a;
        k.b().getClass();
        q0 q0Var = (q0) k.f11563b.get(str);
        String str2 = q0Var != null ? q0Var.f11602c : "";
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        l0 l0Var = this.f11484b;
        return TextUtils.isEmpty(l0Var.g) ? l0Var.f : l0Var.g;
    }

    @Override // com.huawei.hianalytics.framework.config.ICollectorConfig
    public final String getCollectUrl(String str) {
        x xVarA = g1.a(this.f11483a, str);
        return xVarA != null ? xVarA.e : "";
    }

    @Override // com.huawei.hianalytics.framework.config.ICollectorConfig
    public final DeviceAttributeCollector getDeviceAttribute(String str) {
        return new k0(this.f11483a, str);
    }

    @Override // com.huawei.hianalytics.framework.config.ICollectorConfig
    public final EvtHeaderAttributeCollector getEvtCustomHeader(String str, JSONObject jSONObject) {
        return new n0(jSONObject);
    }

    @Override // com.huawei.hianalytics.framework.config.ICollectorConfig
    public final Map getHttpHeader(String str) {
        HashMap map = new HashMap();
        x xVarA = g1.a(this.f11483a, str);
        Map map2 = xVarA != null ? xVarA.m : null;
        if (map2 != null) {
            map.putAll(map2);
        }
        return map;
    }

    @Override // com.huawei.hianalytics.framework.config.ICollectorConfig
    public final int getMetricPolicy(String str) {
        x xVarA = g1.a(this.f11483a, str);
        if (xVarA == null) {
            return 1;
        }
        return xVarA.s;
    }

    @Override // com.huawei.hianalytics.framework.config.ICollectorConfig
    public final String getPkgName() {
        return k.b().a().f;
    }

    @Override // com.huawei.hianalytics.framework.config.ICollectorConfig
    public final RomAttributeCollector getRomAttribute(String str, String str2) {
        Pair pair;
        Locale locale;
        x xVarA;
        v0 v0Var = new v0();
        l0 l0Var = this.f11484b;
        int i = l0Var.x;
        int i2 = l0Var.y;
        if (i2 == 0 || i == 0) {
            DisplayMetrics displayMetrics = EnvUtils.getAppContext().getResources().getDisplayMetrics();
            i = displayMetrics.heightPixels;
            i2 = displayMetrics.widthPixels;
            l0 l0Var2 = this.f11484b;
            l0Var2.x = i;
            l0Var2.y = i2;
        }
        q qVarA = q.a();
        String str3 = this.f11483a;
        qVarA.getClass();
        k.b().getClass();
        ConcurrentHashMap concurrentHashMap = k.f11563b;
        q0 q0Var = (q0) concurrentHashMap.get(str3);
        String string = "";
        if ((q0Var == null || (xVarA = q0Var.a(str)) == null) ? false : xVarA.f11724b) {
            String str4 = k.b().a().l;
            String str5 = k.b().a().m;
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str5)) {
                Context context = qVarA.f11599a;
                if (Build.VERSION.SDK_INT > 28 || t.a(context, "android.permission.READ_PHONE_STATE")) {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    if (telephonyManager != null && telephonyManager.getSimState() == 5) {
                        String networkOperator = telephonyManager.getNetworkOperator();
                        pair = (TextUtils.isEmpty(networkOperator) || TextUtils.equals(networkOperator, Constants.NULL) || networkOperator.length() <= 3) ? new Pair("", "") : new Pair(networkOperator.substring(0, 3), networkOperator.substring(3));
                    } else {
                        pair = new Pair("", "");
                    }
                } else {
                    HiLog.w("DeviceIdUtils", "pair value is empty");
                    pair = new Pair("", "");
                }
                k.b().a().l = (String) pair.first;
                k.b().a().m = (String) pair.second;
            } else {
                pair = new Pair(str4, str5);
            }
        } else {
            pair = new Pair("", "");
        }
        String str6 = this.f11483a;
        k.b().getClass();
        q0 q0Var2 = (q0) concurrentHashMap.get(str6);
        String str7 = q0Var2 != null ? q0Var2.g : "";
        if (TextUtils.isEmpty(str7)) {
            v0Var.i = "";
        } else {
            v0Var.i = str7;
        }
        String strA = t.a("com.huawei.android.os.SystemPropertiesEx", "ro.huawei.build.display.id");
        if (TextUtils.isEmpty(strA)) {
            strA = Build.DISPLAY;
        }
        v0Var.f11613a = strA;
        if (TextUtils.isEmpty(str2)) {
            str2 = this.f11484b.i;
        }
        v0Var.e = str2;
        l0 l0Var3 = this.f11484b;
        String str8 = l0Var3.f11573a;
        if (str8 == null) {
            v0Var.f11614b = "";
        } else {
            v0Var.f11614b = str8;
        }
        v0Var.h = "hianalytics";
        v0Var.f = "3.2.14.504";
        v0Var.f11615c = Build.MODEL;
        v0Var.d = l0Var3.f;
        q qVarA2 = q.a();
        String str9 = this.f11483a;
        Context context2 = qVarA2.f11599a;
        String strA2 = ("oper".equals(str) || "maint".equals(str)) ? p0.a(context2, str9, str) : "";
        v0Var.g = strA2;
        x xVarA2 = g1.a(this.f11483a, str);
        String str10 = xVarA2 != null ? xVarA2.g : "";
        if (TextUtils.isEmpty(str10)) {
            v0Var.l = "";
        } else {
            v0Var.l = str10;
        }
        v0Var.s = (String) pair.first;
        v0Var.t = (String) pair.second;
        String str11 = this.f11483a;
        k.b().getClass();
        q0 q0Var3 = (q0) concurrentHashMap.get(str11);
        String str12 = q0Var3 != null ? q0Var3.d : "";
        if (TextUtils.isEmpty(str12)) {
            v0Var.j = "";
        } else {
            v0Var.j = str12;
        }
        String str13 = this.f11483a;
        k.b().getClass();
        q0 q0Var4 = (q0) concurrentHashMap.get(str13);
        String str14 = q0Var4 != null ? q0Var4.e : "";
        if (TextUtils.isEmpty(str14)) {
            v0Var.k = "";
        } else {
            v0Var.k = str14;
        }
        v0Var.n = Build.VERSION.RELEASE;
        v0Var.p = i;
        v0Var.q = i2;
        Configuration configuration = EnvUtils.getAppContext().getResources().getConfiguration();
        if (configuration != null && (locale = configuration.locale) != null) {
            string = locale.toString();
        }
        v0Var.r = string;
        if (TextUtils.isEmpty(this.f11484b.z)) {
            v0Var.m = OsType.ANDROID;
            return v0Var;
        }
        v0Var.o = this.f11484b.z;
        v0Var.m = "harmony";
        return v0Var;
    }

    @Override // com.huawei.hianalytics.framework.config.ICollectorConfig
    public final boolean getShortLinkEnabled(String str) {
        x xVarA = g1.a(this.f11483a, str);
        if (xVarA == null) {
            return false;
        }
        return xVarA.w;
    }

    @Override // com.huawei.hianalytics.framework.config.ICollectorConfig
    public final String getUdid() {
        return s.a();
    }

    @Override // com.huawei.hianalytics.framework.config.ICollectorConfig
    public final boolean isEnableSession(String str) {
        x xVarA = g1.a(this.f11483a, str);
        if (xVarA != null) {
            return xVarA.f11725c;
        }
        return false;
    }

    @Override // com.huawei.hianalytics.framework.config.ICollectorConfig
    public final boolean isLocalEncrypted(String str) {
        x xVarA = g1.a(this.f11483a, str);
        if (xVarA == null) {
            return true;
        }
        Boolean bool = xVarA.p;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean bool2 = xVarA.q;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        return true;
    }

    @Override // com.huawei.hianalytics.framework.config.ICollectorConfig
    public final boolean isUploadEncrypted(String str) {
        x xVarA = g1.a(this.f11483a, str);
        if (xVarA == null) {
            return true;
        }
        Boolean bool = xVarA.p;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean bool2 = xVarA.r;
        return bool2 != null ? bool2.booleanValue() : !TextUtils.equals(str, "maint");
    }

    @Override // com.huawei.hianalytics.framework.config.ICollectorConfig
    public final void requestConfig() {
        h.d.a();
    }
}
