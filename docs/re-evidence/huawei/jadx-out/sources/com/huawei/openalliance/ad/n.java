package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.analysis.BaseAnalysisInfo;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class n extends j {
    @Override // com.huawei.openalliance.ad.j, com.huawei.openalliance.ad.g
    public void a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        hw.a("JsbCommonAnalysis", "start");
        ContentRecord contentRecordB = b(context, str);
        JSONObject jSONObject = new JSONObject(str);
        boolean zOptBoolean = jSONObject.optBoolean(JsbMapKeyNames.CHECK_CONTENT, true);
        int iOptInt = jSONObject.optInt("adType", -1);
        String strOptString = jSONObject.optString("slotid", "");
        boolean zOptBoolean2 = jSONObject.optBoolean(JsbMapKeyNames.REPORT_NOW, false);
        boolean zOptBoolean3 = jSONObject.optBoolean(JsbMapKeyNames.CHECK_DISCARD, false);
        if (!zOptBoolean) {
            hw.b("JsbCommonAnalysis", "no check ContentRecord");
        } else if (contentRecordB == null) {
            hw.b("JsbCommonAnalysis", "ad not exist");
            a(remoteCallResultCallback, this.f19295a, 3002, null, true);
            return;
        } else if (!a(context, contentRecordB)) {
            hw.b("JsbCommonAnalysis", "ad is not in whitelist");
            a(remoteCallResultCallback, this.f19295a, 3004, null, true);
            return;
        }
        BaseAnalysisInfo baseAnalysisInfo = (BaseAnalysisInfo) com.huawei.openalliance.ad.utils.bk.b(jSONObject.getString("analysis_info"), BaseAnalysisInfo.class, new Class[0]);
        br brVar = new br(context);
        com.huawei.openalliance.ad.analysis.b bVarA = contentRecordB != null ? brVar.a(contentRecordB, baseAnalysisInfo) : brVar.a(baseAnalysisInfo);
        if (bVarA == null) {
            hw.c("JsbCommonAnalysis", "onAnalysis, info is null.");
            a(remoteCallResultCallback, this.f19295a, 3001, null, true);
            return;
        }
        hw.b("JsbCommonAnalysis", "onAnalysis, type: %s", bVarA.aN());
        if (hw.a()) {
            hw.a("JsbCommonAnalysis", "onAnalysis, info: %s", com.huawei.openalliance.ad.utils.bk.b(bVarA));
        }
        if (contentRecordB == null) {
            bVarA.a(iOptInt);
            bVarA.o(strOptString);
        }
        pc pcVar = new pc(context, sw.a(context, iOptInt));
        pcVar.a(contentRecordB);
        pcVar.b(bVarA, zOptBoolean2, zOptBoolean3);
        b(remoteCallResultCallback, true);
    }

    public n() {
        super("pps.common.analysis");
    }
}
