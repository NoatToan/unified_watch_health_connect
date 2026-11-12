package defpackage;

import com.huawei.hwcloudjs.a;
import com.huawei.wisesecurity.kfs.ha.message.BaseReportMsgBuilder;

/* JADX INFO: loaded from: classes20.dex */
public class yrm extends BaseReportMsgBuilder {
    @Override // com.huawei.wisesecurity.kfs.ha.message.ReportMsgBuilder
    public String getEventId() {
        return "crypto";
    }

    public yrm e() {
        this.linkedHashMap.put("flavor", a.d);
        return this;
    }
}
