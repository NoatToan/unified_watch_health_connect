package defpackage;

import com.huawei.hwcloudjs.a;
import com.huawei.wisesecurity.kfs.ha.message.BaseReportMsgBuilder;
import io.jsonwebtoken.Header;

/* JADX INFO: loaded from: classes20.dex */
public class yqt extends BaseReportMsgBuilder {
    @Override // com.huawei.wisesecurity.kfs.ha.message.ReportMsgBuilder
    public String getEventId() {
        return "applyCredential";
    }

    public yqt e(String str) {
        this.linkedHashMap.put(Header.CONTENT_TYPE, str);
        return this;
    }

    public yqt d(String str) {
        this.linkedHashMap.put("credentialPackageName", str);
        return this;
    }

    public yqt b() {
        this.linkedHashMap.put("flavor", a.d);
        return this;
    }
}
