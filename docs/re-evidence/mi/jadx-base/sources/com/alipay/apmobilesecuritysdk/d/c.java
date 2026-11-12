package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.e.f;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.passport.sim.SIMInfo;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static Map<String, String> a(Context context) {
        com.alipay.security.mobile.module.b.b bVarA = com.alipay.security.mobile.module.b.b.a();
        HashMap map = new HashMap();
        f fVarA = com.alipay.apmobilesecuritysdk.e.e.a(context);
        String strB = com.alipay.security.mobile.module.b.b.b(context);
        String strE = com.alipay.security.mobile.module.b.b.e(context);
        String strW = com.alipay.security.mobile.module.b.b.w(context);
        String strA = com.alipay.security.mobile.module.b.b.A(context);
        if (fVarA != null) {
            if (com.alipay.security.mobile.module.a.a.d(strB)) {
                strB = fVarA.a();
            }
            if (com.alipay.security.mobile.module.a.a.d(strE)) {
                strE = fVarA.b();
            }
            if (com.alipay.security.mobile.module.a.a.d(strW)) {
                strW = fVarA.c();
            }
            if (com.alipay.security.mobile.module.a.a.d(strA)) {
                strA = fVarA.e();
            }
        }
        f fVar = new f(strB, strE, strW, "", strA);
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(OneTrack.Param.IMEI_MD5, fVar.a());
                jSONObject.put(SIMInfo.SIM_INFO_TYPE_IMSI, fVar.b());
                jSONObject.put("mac", fVar.c());
                jSONObject.put("bluetoothmac", fVar.d());
                jSONObject.put("gsi", fVar.e());
                String string = jSONObject.toString();
                com.alipay.apmobilesecuritysdk.f.a.a("device_feature_file_name", "device_feature_file_key", string);
                com.alipay.apmobilesecuritysdk.f.a.a(context, "device_feature_prefs_name", "device_feature_prefs_key", string);
            } catch (Exception e) {
                com.alipay.apmobilesecuritysdk.c.a.a(e);
            }
        }
        map.put("AD1", strB);
        map.put("AD2", strE);
        map.put("AD3", com.alipay.security.mobile.module.b.b.m(context));
        map.put("AD5", com.alipay.security.mobile.module.b.b.q(context));
        map.put("AD6", com.alipay.security.mobile.module.b.b.s(context));
        map.put("AD7", com.alipay.security.mobile.module.b.b.u(context));
        map.put("AD8", strW);
        map.put("AD9", com.alipay.security.mobile.module.b.b.y(context));
        map.put("AD10", strA);
        map.put("AD11", com.alipay.security.mobile.module.b.b.h());
        map.put("AD12", bVarA.j());
        map.put("AD13", com.alipay.security.mobile.module.b.b.l());
        map.put("AD14", com.alipay.security.mobile.module.b.b.p());
        map.put("AD15", com.alipay.security.mobile.module.b.b.r());
        map.put("AD16", com.alipay.security.mobile.module.b.b.t());
        map.put("AD17", "");
        map.put("AD19", com.alipay.security.mobile.module.b.b.C(context));
        map.put("AD20", com.alipay.security.mobile.module.b.b.v());
        map.put("AD22", "");
        map.put("AD23", com.alipay.security.mobile.module.b.b.G(context));
        map.put("AD24", com.alipay.security.mobile.module.a.a.l(com.alipay.security.mobile.module.b.b.o(context)));
        map.put("AD26", com.alipay.security.mobile.module.b.b.k(context));
        map.put("AD27", com.alipay.security.mobile.module.b.b.F());
        map.put("AD28", com.alipay.security.mobile.module.b.b.J());
        map.put("AD29", com.alipay.security.mobile.module.b.b.N());
        map.put("AD30", com.alipay.security.mobile.module.b.b.H());
        map.put("AD31", com.alipay.security.mobile.module.b.b.L());
        map.put("AD32", com.alipay.security.mobile.module.b.b.B());
        map.put("AD33", com.alipay.security.mobile.module.b.b.D());
        map.put("AD34", com.alipay.security.mobile.module.b.b.K(context));
        map.put("AD35", com.alipay.security.mobile.module.b.b.M(context));
        map.put("AD36", com.alipay.security.mobile.module.b.b.I(context));
        map.put("AD37", com.alipay.security.mobile.module.b.b.z());
        map.put("AD38", com.alipay.security.mobile.module.b.b.x());
        map.put("AD39", com.alipay.security.mobile.module.b.b.g(context));
        map.put("AD40", com.alipay.security.mobile.module.b.b.i(context));
        map.put("AD41", com.alipay.security.mobile.module.b.b.d());
        map.put("AD42", com.alipay.security.mobile.module.b.b.f());
        map.put("AL3", com.alipay.security.mobile.module.b.b.E(context));
        return map;
    }
}
