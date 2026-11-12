package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.e.f;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import defpackage.kj;
import defpackage.ky;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class c {
    public static Map<String, String> a(Context context) {
        ky kyVarC = ky.c(APSecuritySdk.getInstance(context));
        HashMap map = new HashMap();
        f fVarA = com.alipay.apmobilesecuritysdk.e.e.a(context);
        String strD = kyVarC.d(context);
        String strO = kyVarC.o(context);
        if (fVarA != null) {
            if (kj.c(strD)) {
                strD = fVarA.b();
            }
            if (kj.c(strO)) {
                strO = fVarA.e();
            }
        }
        com.alipay.apmobilesecuritysdk.e.e.a(context, new f("", strD, "", "", strO));
        map.put("AD1", "");
        map.put("AD2", strD);
        map.put("AD3", kyVarC.f(context));
        map.put("AD5", kyVarC.j(context));
        map.put("AD6", kyVarC.g(context));
        map.put("AD7", kyVarC.h(context));
        map.put("AD9", kyVarC.m(context));
        map.put("AD10", strO);
        map.put("AD11", kyVarC.a());
        map.put("AD12", kyVarC.b());
        map.put("AD13", kyVarC.e());
        map.put("AD14", kyVarC.j());
        map.put("AD15", kyVarC.i());
        map.put("AD16", kyVarC.f());
        map.put("AD17", "");
        map.put("AD19", kyVarC.n(context));
        map.put("AD20", kyVarC.h());
        map.put("AD22", "");
        map.put("AD24", kj.i(kyVarC.i(context)));
        map.put("AD26", kyVarC.e(context));
        map.put("AD27", kyVarC.k());
        map.put("AD28", kyVarC.p());
        map.put("AD29", kyVarC.q());
        map.put("AD30", kyVarC.t());
        map.put("AD31", kyVarC.r());
        map.put("AD32", kyVarC.n());
        map.put("AD33", kyVarC.m());
        map.put("AD34", kyVarC.p(context));
        map.put("AD35", kyVarC.r(context));
        map.put("AD36", kyVarC.k(context));
        map.put("AD37", kyVarC.l());
        map.put("AD38", kyVarC.o());
        map.put("AD39", kyVarC.b(context));
        map.put("AD40", kyVarC.c(context));
        map.put("AD41", kyVarC.c());
        map.put("AD42", kyVarC.d());
        return map;
    }
}
