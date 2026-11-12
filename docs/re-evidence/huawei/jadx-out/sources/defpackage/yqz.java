package defpackage;

import com.huawei.hwcloudjs.a;
import com.huawei.wisesecurity.kfs.ha.message.BaseReportMsgBuilder;
import io.jsonwebtoken.Header;

/* JADX INFO: loaded from: classes20.dex */
public class yqz extends BaseReportMsgBuilder {
    @Override // com.huawei.wisesecurity.kfs.ha.message.ReportMsgBuilder
    public String getEventId() {
        return "credentialFromString";
    }

    public yqz e(String str) {
        this.linkedHashMap.put(Header.CONTENT_TYPE, str);
        return this;
    }

    public yqz c(String str) {
        this.linkedHashMap.put("credentialAppName", str);
        return this;
    }

    public yqz c(int i) {
        this.linkedHashMap.put("akSkVersion", String.valueOf(i));
        return this;
    }

    public yqz d() {
        this.linkedHashMap.put("flavor", a.d);
        return this;
    }
}
