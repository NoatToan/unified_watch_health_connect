package defpackage;

import android.content.Context;
import com.huawei.wisesecurity.kfs.ha.message.ReportMsgBuilder;
import com.huawei.wisesecurity.ucs.common.report.BaseReporter;
import com.huawei.wisesecurity.ucs.common.report.ReportOption;
import com.huawei.wisesecurity.ucs.credential.outer.HACapability;
import com.huawei.wisesecurity.ucs_credential.o;

/* JADX INFO: loaded from: classes20.dex */
public class yrn extends BaseReporter implements HACapability {
    public static yog e;

    @Override // com.huawei.wisesecurity.ucs.credential.outer.HACapability
    public void onEvent(Context context, String str, ReportMsgBuilder reportMsgBuilder) {
        synchronized (yrn.class) {
            if (e == null) {
                e = getInstance(context, HACapability.UCS_CREDENTIAL_HA_SERVICE_TAG, "Credential");
            }
            yog yogVar = e;
            if (yogVar != null) {
                setOobeCheck(yogVar);
                e.a(context, reportMsgBuilder);
            }
        }
    }

    @Override // com.huawei.wisesecurity.ucs.common.report.BaseReporter
    public String getReporterTag() {
        return HACapability.UCS_CREDENTIAL_HA_SERVICE_TAG;
    }

    @Override // com.huawei.wisesecurity.ucs.common.report.BaseReporter
    public String getLogTag() {
        return "Credential";
    }

    public yrn(o oVar, ReportOption reportOption) {
        super(oVar.b(), reportOption);
    }
}
