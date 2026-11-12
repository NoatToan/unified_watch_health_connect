package com.huami.thirdparty.webauth;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004¨\u0006\u0015"}, d2 = {"Lcom/huami/thirdparty/webauth/Api;", "", "", "a", "Ljava/lang/String;", "REDIRECT_HOST_PRODUCT", "b", "REDIRECT_HOST_STAGING", "c", "getREDIRECT_HOST", "()Ljava/lang/String;", "setREDIRECT_HOST", "(Ljava/lang/String;)V", "REDIRECT_HOST", "ACCESS_URL", "REFRESH_URL", "REVOKE_URL", "BINDINFO_URL", "SHARE_REQUEST_URL", "<init>", "()V", "webauth_release"}, k = 1, mv = {1, 4, 1})
public final class Api {

    @NotNull
    public static final String ACCESS_URL = "oauth2/access_token";

    @NotNull
    public static final String BINDINFO_URL = "thirdParties/oauth2/list";

    @NotNull
    public static final Api INSTANCE = new Api();

    @NotNull
    public static final String REFRESH_URL = "oauth2/refresh_token";

    @NotNull
    public static final String REVOKE_URL = "oauth2/revoke";

    @NotNull
    public static final String SHARE_REQUEST_URL = "v2/sport/ShareSportData";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String REDIRECT_HOST_PRODUCT = "https://thirdparty-us-v2.huami.com/";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final String REDIRECT_HOST_STAGING = "https://api-thirdpart-staging-us.huami.com/";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static String REDIRECT_HOST;

    static {
        REDIRECT_HOST = !Config.INSTANCE.getDebug() ? REDIRECT_HOST_PRODUCT : REDIRECT_HOST_STAGING;
    }

    private Api() {
    }

    @NotNull
    public final String getREDIRECT_HOST() {
        return REDIRECT_HOST;
    }

    public final void setREDIRECT_HOST(@NotNull String str) {
        REDIRECT_HOST = str;
    }
}
