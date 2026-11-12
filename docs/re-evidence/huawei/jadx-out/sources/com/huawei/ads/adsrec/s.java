package com.huawei.ads.adsrec;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.ads.adsrec.recall.IAdRequestDelegate;
import com.huawei.openplatform.abl.log.HiAdLog;
import defpackage.axi;
import defpackage.axm;
import defpackage.ayc;
import defpackage.aym;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class s implements g0 {
    private Context e;

    @Override // com.huawei.ads.adsrec.g0
    public <T> axi a(ayc aycVar, T t) {
        HiAdLog.i("CloudRecallTask", "recall");
        if (!(t instanceof IAdRequestDelegate)) {
            HiAdLog.i("CloudRecallTask", "not delegate");
            return null;
        }
        try {
            String strRequestAd = ((IAdRequestDelegate) t).requestAd();
            if (strRequestAd == null) {
                return null;
            }
            axi axiVar = new axi(aycVar.e(), new JSONObject(strRequestAd));
            a(axiVar, aycVar);
            return axiVar;
        } catch (Throwable th) {
            HiAdLog.w("CloudRecallTask", "delegate recall err: " + th.getClass().getSimpleName());
            return null;
        }
    }

    @Override // com.huawei.ads.adsrec.g0
    public <T> axi a(ayc aycVar, axi axiVar) {
        a(axiVar, aycVar);
        return axiVar;
    }

    private void d(axi axiVar, ayc aycVar) {
        List<axm> listI = axiVar.i();
        aym aymVarB = aym.b(this.e);
        if (listI != null) {
            for (axm axmVar : listI) {
                JSONObject jSONObjectE = axmVar.e();
                if (jSONObjectE != null) {
                    String strOptString = jSONObjectE.optString("configMap");
                    if (!TextUtils.isEmpty(strOptString)) {
                        try {
                            aymVarB.a(axmVar.j(), new JSONObject(strOptString), aycVar);
                        } catch (Throwable unused) {
                            HiAdLog.w("CloudRecallTask", "save cfgs json err");
                        }
                    }
                }
            }
        }
    }

    private void c(axi axiVar) {
        new e(this.e).c(axiVar.i());
    }

    private void a(axi axiVar, ayc aycVar) {
        d(axiVar, aycVar);
        d(axiVar);
        c(axiVar);
    }

    private void d(axi axiVar) {
        new e(this.e).a(axiVar.a());
    }

    public s(Context context) {
        this.e = context.getApplicationContext();
    }
}
