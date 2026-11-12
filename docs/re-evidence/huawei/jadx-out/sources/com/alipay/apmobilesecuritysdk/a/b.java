package com.alipay.apmobilesecuritysdk.a;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.d.e;
import com.alipay.apmobilesecuritysdk.e.c;
import com.alipay.apmobilesecuritysdk.e.d;
import com.alipay.apmobilesecuritysdk.e.h;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import com.huawei.openalliance.ad.constant.OsType;
import defpackage.kj;
import defpackage.ml;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class b {
    private static void a(Context context, ml mlVar, Map<String, String> map) {
        String str;
        String str2;
        String str3;
        com.alipay.apmobilesecuritysdk.e.b bVarE;
        com.alipay.apmobilesecuritysdk.e.b bVarD;
        String str4 = "";
        String strE = kj.e(map, "appName", "");
        String strE2 = kj.e(map, "sessionId", "");
        String strE3 = kj.e(map, "rpcVersion", "");
        String strA = a.a(context, strE);
        String securityToken = UmidSdkWrapper.getSecurityToken(context);
        String strD = h.d(context);
        if (kj.e(strE2)) {
            mlVar.d = strE2;
        } else {
            mlVar.d = strA;
        }
        mlVar.f41852a = securityToken;
        mlVar.e = strD;
        mlVar.f41853b = OsType.ANDROID;
        c cVarD = d.d(context);
        if (cVarD != null) {
            str2 = cVarD.f2031a;
            str = cVarD.f2033c;
        } else {
            str = "";
            str2 = str;
        }
        if (kj.c(str2) && (bVarD = com.alipay.apmobilesecuritysdk.e.a.d(context)) != null) {
            str2 = bVarD.f2028a;
            str = bVarD.f2030c;
        }
        c cVarE = d.e(context);
        if (cVarE != null) {
            str4 = cVarE.f2031a;
            str3 = cVarE.f2033c;
        } else {
            str3 = "";
        }
        if (kj.c(str4) && (bVarE = com.alipay.apmobilesecuritysdk.e.a.e(context)) != null) {
            str4 = bVarE.f2028a;
            str3 = bVarE.f2030c;
        }
        mlVar.h = str2;
        mlVar.i = str4;
        mlVar.j = strE3;
        if (kj.c(str2)) {
            mlVar.f41854c = str4;
            mlVar.f = str3;
        } else {
            mlVar.f41854c = str2;
            mlVar.f = str;
        }
    }

    public static ml a(Context context, Map<String, String> map) {
        ml mlVar = new ml();
        a(context, mlVar, map);
        mlVar.g = e.a(context, map);
        return mlVar;
    }
}
