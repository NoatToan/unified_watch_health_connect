package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;
import health.compact.a.utils.StringUtils;

/* JADX INFO: loaded from: classes11.dex */
public class mou implements IRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient String f42092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient String f42093c;
    private transient String d;

    public mou(String str, String str2, String str3) {
        this.f42093c = str;
        this.f42092b = str2;
        this.d = str3;
    }

    public String d() {
        return this.f42092b;
    }

    public String e() {
        return this.d;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        if (StringUtils.g(d()) && StringUtils.g(this.f42093c)) {
            LogUtil.e("HttpProxyCommonReq", "grsHostKey is empty");
            return "";
        }
        String strSubstring = this.f42093c;
        if (StringUtils.g(strSubstring)) {
            strSubstring = GRSManager.c(BaseApplication.b()).getUrl(d());
        }
        if (StringUtils.g(strSubstring)) {
            LogUtil.e("HttpProxyCommonReq", "getUrl host is empty");
            return "";
        }
        String strE = e();
        if (StringUtils.g(strE)) {
            LogUtil.e("HttpProxyCommonReq", "getUrl path is empty");
            return "";
        }
        if (strSubstring.endsWith("/")) {
            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
        }
        if (!strE.startsWith("/")) {
            strE = "/" + strE;
        }
        return strSubstring + strE;
    }
}
