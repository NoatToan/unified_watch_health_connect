package com.xiaomi.infra.galaxy.fds.android.auth;

import com.alipay.sdk.m.n.a;
import com.xiaomi.account.openauth.AuthorizeActivityBase;
import com.xiaomi.infra.galaxy.fds.android.util.Args;
import kotlin.text.Typography;
import org.apache.http.client.methods.HttpRequestBase;

/* JADX INFO: loaded from: classes22.dex */
public class SSOCredential implements GalaxyFDSCredential {
    private final String a = "SSO";
    private final String b = AuthorizeActivityBase.KEY_SERVICETOKEN;
    private final String c = "appId";
    private final String d;
    private final String e;

    @Deprecated
    public SSOCredential(String str) {
        Args.notNull(str, "Service token");
        Args.notEmpty(str, "Service token");
        this.d = str;
        this.e = null;
    }

    @Override // com.xiaomi.infra.galaxy.fds.android.auth.GalaxyFDSCredential
    public void addHeader(HttpRequestBase httpRequestBase) {
        httpRequestBase.addHeader("Authorization", "SSO");
    }

    @Override // com.xiaomi.infra.galaxy.fds.android.auth.GalaxyFDSCredential
    public String addParam(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (str.indexOf(63) == -1) {
            sb.append('?');
        } else {
            sb.append(Typography.amp);
        }
        sb.append(AuthorizeActivityBase.KEY_SERVICETOKEN);
        sb.append(a.h);
        sb.append(this.d);
        if (this.e != null) {
            sb.append(Typography.amp);
            sb.append("appId");
            sb.append(a.h);
            sb.append(this.e);
        }
        return sb.toString();
    }

    public SSOCredential(String str, String str2) {
        Args.notNull(str, "Service token");
        Args.notEmpty(str, "Service token");
        Args.notNull(str2, "App id");
        Args.notEmpty(str2, "App id");
        this.d = str;
        this.e = str2;
    }
}
