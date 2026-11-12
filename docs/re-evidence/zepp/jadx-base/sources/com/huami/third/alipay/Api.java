package com.huami.third.alipay;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/huami/third/alipay/Api;", "", "", "URL_ALIPAY_AUTH", "Ljava/lang/String;", "URL_UNBIND_ALIPAY", "URL_ALIPAY_USER_INFO", "<init>", "()V", "alipay_release"}, k = 1, mv = {1, 4, 1})
public final class Api {

    @NotNull
    public static final Api INSTANCE = new Api();

    @NotNull
    public static final String URL_ALIPAY_AUTH = "v1/thirdParties/auth.json";

    @NotNull
    public static final String URL_ALIPAY_USER_INFO = "huami.partner.getAppToken.json";

    @NotNull
    public static final String URL_UNBIND_ALIPAY = "huami.partner.bindThirdApp.json";

    private Api() {
    }
}
