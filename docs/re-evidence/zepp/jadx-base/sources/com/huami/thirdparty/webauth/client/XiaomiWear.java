package com.huami.thirdparty.webauth.client;

import android.content.Context;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.thirdparty.webauth.Api;
import com.huami.thirdparty.webauth.ExtensionKt;
import com.huami.tools.analytics.DbUtils;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000bH\u0016J\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000bH\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000bH\u0016R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\t\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/huami/thirdparty/webauth/client/XiaomiWear;", "Lcom/huami/thirdparty/webauth/client/AuthClient;", "", "getName", "getHost", "getUrl", "getWebsite", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "getDefaultTitle", "getRedirectHost", "", "sourceParams", "redirectParamsEncode", "redirectParams", "b", "Ljava/lang/String;", HTTP.HOST, "c", "PATH", "Lkotlin/Function0;", GoogleApiAvailabilityLight.a, "Lkotlin/jvm/functions/Function0;", "getCurrentRedirectHost", "()Lkotlin/jvm/functions/Function0;", "setCurrentRedirectHost", "(Lkotlin/jvm/functions/Function0;)V", "currentRedirectHost", "e", "()Ljava/lang/String;", "setDefaultTitle", "(Ljava/lang/String;)V", "defaultTitle", "<init>", "()V", "webauth_release"}, k = 1, mv = {1, 4, 1})
public final class XiaomiWear extends AuthClient {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final String HOST = "https://account.xiaomi.com/";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final String PATH = "oauth2/authorize";

    @NotNull
    public static final XiaomiWear INSTANCE = new XiaomiWear();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static Function0<String> currentRedirectHost = a.a;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static String defaultTitle = "";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return Api.INSTANCE.getREDIRECT_HOST();
        }
    }

    private XiaomiWear() {
    }

    @NotNull
    public final Function0<String> getCurrentRedirectHost() {
        return currentRedirectHost;
    }

    @NotNull
    public final String getDefaultTitle() {
        return defaultTitle;
    }

    @Override // com.huami.thirdparty.webauth.client.AuthClient
    @NotNull
    public String getHost() {
        return HOST;
    }

    @Override // com.huami.thirdparty.webauth.client.AuthClient
    @NotNull
    public String getName() {
        return "huami-mifit-miwear";
    }

    @Override // com.huami.thirdparty.webauth.client.AuthClient
    @NotNull
    public String getRedirectHost() {
        return currentRedirectHost.invoke();
    }

    @Override // com.huami.thirdparty.webauth.client.AuthClient
    @NotNull
    public String getUrl() {
        return PATH;
    }

    @Override // com.huami.thirdparty.webauth.client.AuthClient
    @NotNull
    public String getWebsite() {
        return HOST;
    }

    @Override // com.huami.thirdparty.webauth.client.AuthClient
    @NotNull
    public Map<String, String> redirectParams() {
        return r.hashMapOf(TuplesKt.to("state", ExtensionKt.jsonObject(TuplesKt.to("userId", getParam().getUid()))));
    }

    @Override // com.huami.thirdparty.webauth.client.AuthClient
    @NotNull
    public Map<String, String> redirectParamsEncode() {
        return r.hashMapOf(TuplesKt.to("name", getName()), TuplesKt.to("countryCode", getParam().getCountryCode()), TuplesKt.to("region", getParam().getRegion()));
    }

    public final void setCurrentRedirectHost(@NotNull Function0<String> function0) {
        currentRedirectHost = function0;
    }

    public final void setDefaultTitle(@NotNull String str) {
        defaultTitle = str;
    }

    @Override // com.huami.thirdparty.webauth.client.AuthClient
    @NotNull
    public Map<String, String> sourceParams() {
        return r.mapOf(TuplesKt.to("skip_confirm", "false"), TuplesKt.to("client_id", getParam().getClientId()), TuplesKt.to("pt", "1"), TuplesKt.to("scope", "1+12004"), TuplesKt.to(ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE, "code"));
    }

    @Override // com.huami.thirdparty.webauth.client.AuthClient
    @NotNull
    public String getDefaultTitle(@NotNull Context context) {
        return defaultTitle;
    }
}
