package com.huami.third.wechat;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.loc.z;
import kotlin.Metadata;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b!\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0019\u0010\u0017\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u001a\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00028B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0016R\u0016\u0010\u001c\u001a\u00020\u00028B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0016R\u0013\u0010\u001e\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0016R\u0013\u0010 \u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0016¨\u0006#"}, d2 = {"Lcom/huami/third/wechat/Api;", "", "", "a", "Ljava/lang/String;", "HOST_STAGING", "b", "HOST_PRODUCT", "c", "USER", GoogleApiAvailabilityLight.a, "QR_CODE", "e", "SPORTS_HOST_STAGING", "f", "SPORTS_HOST_PRODUCT", "g", "CHECK_DEVICE_SUPPORT", "h", "BIND_DEVICE_TICKET", "i", "getURL_QR", "()Ljava/lang/String;", "URL_QR", z.j, "getURL_USER", "URL_USER", HTTP.HOST, "SPORTS_HOST", "getURL_CHECK_DEVICE_SUPPORT", "URL_CHECK_DEVICE_SUPPORT", "getURL_BIND_DEVICE_TICKET", "URL_BIND_DEVICE_TICKET", "<init>", "()V", "wechat_release"}, k = 1, mv = {1, 5, 1})
public final class Api {

    @NotNull
    public static final Api INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String HOST_STAGING = "https://api-watch-staging.huami.com";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String HOST_PRODUCT = "https://weixin.amazfit.com";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String USER = "/v1/info/users.json";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String QR_CODE = "/v1/bind/qrcode.json";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final String SPORTS_HOST_STAGING = "https://thirdparty-staging-cn2.huami.com";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final String SPORTS_HOST_PRODUCT = "https://thirdparty-prod-cn2.huami.com";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final String CHECK_DEVICE_SUPPORT = "/wechat/iot/sport/checkSupport";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private static final String BIND_DEVICE_TICKET = "/wechat/iot/sport/getTicket";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private static final String URL_QR;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private static final String URL_USER;

    static {
        Api api = new Api();
        INSTANCE = api;
        URL_QR = api.a() + QR_CODE;
        URL_USER = api.a() + USER;
    }

    private Api() {
    }

    private final String a() {
        return !HMServerDef.isProductUrl() ? HOST_STAGING : HOST_PRODUCT;
    }

    private final String b() {
        return !HMServerDef.isProductUrl() ? SPORTS_HOST_STAGING : SPORTS_HOST_PRODUCT;
    }

    @NotNull
    public final String getURL_BIND_DEVICE_TICKET() {
        return b() + BIND_DEVICE_TICKET;
    }

    @NotNull
    public final String getURL_CHECK_DEVICE_SUPPORT() {
        return b() + CHECK_DEVICE_SUPPORT;
    }

    @NotNull
    public final String getURL_QR() {
        return URL_QR;
    }

    @NotNull
    public final String getURL_USER() {
        return URL_USER;
    }
}
