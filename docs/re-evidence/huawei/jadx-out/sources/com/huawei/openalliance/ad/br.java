package com.huawei.openalliance.ad;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.openalliance.ad.analysis.BaseAnalysisInfo;
import com.huawei.openalliance.ad.db.bean.ContentRecord;

/* JADX INFO: loaded from: classes12.dex */
public class br extends com.huawei.openalliance.ad.analysis.c {
    public void b(ContentRecord contentRecord, BaseAnalysisInfo baseAnalysisInfo) {
        if (contentRecord == null || baseAnalysisInfo == null) {
            return;
        }
        hw.a("EngineAnalysisUtil", "reportCommonExceptionEvent: %s", com.huawei.openalliance.ad.utils.bk.b(baseAnalysisInfo));
        a(contentRecord, (rc) new pc(this.f18255a, sw.a(this.f18255a, contentRecord.f())), baseAnalysisInfo, false, false);
    }

    public void a(String str, Bundle bundle, ContentRecord contentRecord, rc rcVar) {
        if (TextUtils.isEmpty(str) || bundle == null || contentRecord == null || rcVar == null) {
            hw.b("EngineAnalysisUtil", "param or ad or analysisType is null");
            return;
        }
        gr grVar = new gr(bundle);
        String strD = grVar.d("analysis_info");
        boolean zA = grVar.a("is_report_now", false);
        boolean zA2 = grVar.a("is_check_discard", false);
        BaseAnalysisInfo baseAnalysisInfo = (BaseAnalysisInfo) com.huawei.openalliance.ad.utils.bk.b(strD, BaseAnalysisInfo.class, new Class[0]);
        if (baseAnalysisInfo == null) {
            hw.b("EngineAnalysisUtil", "engineInfo is null");
            return;
        }
        baseAnalysisInfo.ak(str);
        hw.b("EngineAnalysisUtil", "start report analysis, analysisType: %s", str);
        a(contentRecord, rcVar, baseAnalysisInfo, zA, zA2);
    }

    public void a(Bundle bundle, ContentRecord contentRecord, rc rcVar) {
        if (bundle == null || contentRecord == null) {
            hw.b("EngineAnalysisUtil", "param or ad is null");
        } else {
            a(new gr(bundle).d("analysisType"), bundle, contentRecord, rcVar);
        }
    }

    public com.huawei.openalliance.ad.analysis.b a(ContentRecord contentRecord, BaseAnalysisInfo baseAnalysisInfo) {
        if (baseAnalysisInfo == null || contentRecord == null) {
            return null;
        }
        com.huawei.openalliance.ad.analysis.b bVarF = f(contentRecord);
        a(bVarF, baseAnalysisInfo);
        return bVarF;
    }

    public com.huawei.openalliance.ad.analysis.b a(BaseAnalysisInfo baseAnalysisInfo) {
        if (baseAnalysisInfo == null) {
            return null;
        }
        com.huawei.openalliance.ad.analysis.b bVarA = a(true);
        a(bVarA, baseAnalysisInfo);
        return bVarA;
    }

    private void a(ContentRecord contentRecord, rc rcVar, BaseAnalysisInfo baseAnalysisInfo, boolean z, boolean z2) {
        com.huawei.openalliance.ad.analysis.b bVarA = a(contentRecord, baseAnalysisInfo);
        if (bVarA == null) {
            hw.c("EngineAnalysisUtil", "onAnalysis, info is null.");
            return;
        }
        if (hw.a()) {
            hw.a("EngineAnalysisUtil", "onAnalysis, info: %s", com.huawei.openalliance.ad.utils.bk.b(bVarA));
        }
        rcVar.b(bVarA, z, z2);
    }

    public br(Context context) {
        super(context);
    }
}
