package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.inner.AdEventReport;
import com.huawei.openalliance.ad.constant.ClickDestination;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class bd extends bc {
    @Override // com.huawei.openalliance.ad.bc
    protected String b() {
        return "JsbReportClickEvent";
    }

    @Override // com.huawei.openalliance.ad.j, com.huawei.openalliance.ad.g
    public void a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        String str2;
        int i;
        hw.a("JsbReportClickEvent", "start");
        ContentRecord contentRecordB = b(context, str);
        if (contentRecordB == null) {
            hw.b("JsbReportClickEvent", "ad not exist");
            str2 = this.f19295a;
            i = 3002;
        } else if (a(context, contentRecordB)) {
            rc rcVarD = d(context, str);
            boolean z = false;
            AdEventReport adEventReport = (AdEventReport) com.huawei.openalliance.ad.utils.bk.a(str, AdEventReport.class, new Class[0]);
            if (rcVarD != null) {
                int i2 = adEventReport.i();
                int iJ = adEventReport.j();
                String strK = !TextUtils.isEmpty(adEventReport.k()) ? adEventReport.k() : ClickDestination.JS_SDK_INTERFACE;
                int iIntValue = adEventReport.d() != null ? adEventReport.d().intValue() : 13;
                String strM = adEventReport.m();
                com.huawei.openalliance.ad.processor.eventbeans.b.a aVar = new com.huawei.openalliance.ad.processor.eventbeans.b.a();
                JSONObject jSONObject = new JSONObject(str);
                MaterialClickInfo materialClickInfoF = f(str);
                Integer numD = d(str);
                if (materialClickInfoF.k() == null && materialClickInfoF.l() == null) {
                    z = true;
                }
                if (numD != null && 13 == numD.intValue() && z) {
                    materialClickInfoF.h(1);
                }
                aVar.a(i2).b(iJ).b(strK).a(Integer.valueOf(iIntValue)).c(strM).a(materialClickInfoF).a(jSONObject.optString("versionCode")).a(h(jSONObject.optString("versionCode"))).d(com.huawei.openalliance.ad.utils.b.a(context));
                rcVarD.a(aVar.a());
            }
            str2 = this.f19295a;
            i = 1000;
        } else {
            hw.b("JsbReportClickEvent", "ad is not in whitelist");
            str2 = this.f19295a;
            i = 3004;
        }
        a(remoteCallResultCallback, str2, i, null, true);
    }

    public bd() {
        super("pps.event.click");
    }
}
