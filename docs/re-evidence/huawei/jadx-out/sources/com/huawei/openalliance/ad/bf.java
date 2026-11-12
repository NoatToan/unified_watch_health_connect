package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.openalliance.ad.constant.RewardKeys;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.db.bean.EventRecord;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class bf extends bc {
    @Override // com.huawei.openalliance.ad.bc
    protected String b() {
        return "JsbReportCommonEvent";
    }

    @Override // com.huawei.openalliance.ad.j, com.huawei.openalliance.ad.g
    public void a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        String str2;
        int i;
        hw.a("JsbReportCommonEvent", "start");
        ContentRecord contentRecordB = b(context, str);
        JSONObject jSONObject = new JSONObject(str);
        boolean zOptBoolean = jSONObject.optBoolean(JsbMapKeyNames.CHECK_CONTENT, true);
        boolean zOptBoolean2 = jSONObject.optBoolean(JsbMapKeyNames.REPORT_NOW, false);
        boolean zOptBoolean3 = jSONObject.optBoolean(JsbMapKeyNames.CHECK_DISCARD, false);
        if (zOptBoolean) {
            if (contentRecordB == null) {
                hw.b("JsbReportCommonEvent", "ad not exist");
                str2 = this.f19295a;
                i = 3002;
            } else if (!a(context, contentRecordB)) {
                hw.b("JsbReportCommonEvent", "ad is not in whitelist");
                str2 = this.f19295a;
                i = 3004;
            }
            a(remoteCallResultCallback, str2, i, null, true);
        }
        hw.b("JsbReportCommonEvent", "no check ContentRecord");
        EventRecord eventRecord = (EventRecord) com.huawei.openalliance.ad.utils.bk.b(jSONObject.getString(RewardKeys.EVENT_RECORD), EventRecord.class, new Class[0]);
        if (eventRecord == null) {
            hw.c("JsbReportCommonEvent", "reportEvent, eventRecord is null.");
            str2 = this.f19295a;
            i = 3001;
        } else {
            pc pcVar = new pc(context, sw.a(context, eventRecord.m()));
            pcVar.a(contentRecordB);
            bs bsVar = new bs(context);
            hw.b("JsbReportCommonEvent", "start report event");
            bsVar.a(eventRecord, contentRecordB, zOptBoolean2, zOptBoolean3, pcVar);
            str2 = this.f19295a;
            i = 1000;
        }
        a(remoteCallResultCallback, str2, i, null, true);
    }

    public bf() {
        super("pps.common.report");
    }
}
