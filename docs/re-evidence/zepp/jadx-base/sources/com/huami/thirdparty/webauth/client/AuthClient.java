package com.huami.thirdparty.webauth.client;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.reflect.TypeToken;
import com.huami.http.ConverterKt;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.thirdparty.webauth.Api;
import com.huami.thirdparty.webauth.AuthSourceImpl;
import com.huami.thirdparty.webauth.Param;
import com.huami.thirdparty.webauth.ParamKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b'\u0010(J0\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J*\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u000b\u0018\u00012\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\u0002H&J\b\u0010\u001a\u001a\u00020\u0002H&J\b\u0010\u001b\u001a\u00020\u0002H&J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u0002H\u0016J\b\u0010\u001e\u001a\u00020\u0002H&J\u0014\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H&J\u0014\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H&J\u0014\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H\u0016J\u0006\u0010\"\u001a\u00020\u0002R\"\u0010\u0012\u001a\u00020\u00118\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%\"\u0004\b\u0013\u0010&¨\u0006)"}, d2 = {"Lcom/huami/thirdparty/webauth/client/AuthClient;", "", "", "url", "", "params", "", "encode", "a", GoogleApiAvailabilityLight.a, "c", "User", "Lcom/huami/thirdparty/webauth/AuthSourceImpl;", "authSource", "accessToken", "queryUser", "(Lcom/huami/thirdparty/webauth/AuthSourceImpl;Ljava/lang/String;)Ljava/lang/Object;", "Lcom/huami/thirdparty/webauth/Param;", "param", "setParam", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "getTitle", "getDefaultTitle", "getUserUrl", "getName", "getHost", "getUrl", "getRedirectHost", "getRedirectUrl", "getWebsite", "sourceParams", "redirectParamsEncode", "redirectParams", "buildThirdBindUrl", "Lcom/huami/thirdparty/webauth/Param;", "getParam", "()Lcom/huami/thirdparty/webauth/Param;", "(Lcom/huami/thirdparty/webauth/Param;)V", "<init>", "()V", "webauth_release"}, k = 1, mv = {1, 4, 1})
public abstract class AuthClient {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private Param param = ParamKt.param(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/huami/thirdparty/webauth/Param$Builder;", "", "a", "(Lcom/huami/thirdparty/webauth/Param$Builder;)V"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function1<Param.Builder, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final void a(@NotNull Param.Builder builder) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Param.Builder builder) {
            a(builder);
            return Unit.INSTANCE;
        }
    }

    private final String a(String url, Map<String, String> params, boolean encode) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder(url);
        String str = encode ? "%3F" : "?";
        String str2 = encode ? "%26" : com.alipay.sdk.m.s.a.l;
        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (StringsKt__StringsKt.contains$default((CharSequence) sb, (CharSequence) "?", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) sb, (CharSequence) "%3f", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) sb, (CharSequence) "%3F", false, 2, (Object) null)) {
                sb.append(str2);
            } else {
                sb.append(str);
            }
            String key = entry.getKey();
            if (encode) {
                key = URLEncoder.encode(key, "UTF-8");
            }
            String value = entry.getValue();
            if (encode) {
                value = URLEncoder.encode(value, "UTF-8");
            }
            sb.append(key + (encode ? "%3D" : SearchCriteria.EQ) + value);
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String b(AuthClient authClient, String str, Map map, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addQueryParams");
        }
        if ((i & 2) != 0) {
            map = r.emptyMap();
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return authClient.a(str, map, z);
    }

    private final String c() {
        return b(this, URLEncoder.encode(b(this, getRedirectHost() + Api.ACCESS_URL + getRedirectUrl(), redirectParamsEncode(), false, 4, null), "UTF-8"), redirectParams(), false, 4, null);
    }

    private final String d() {
        return b(this, getHost() + getUrl(), sourceParams(), false, 4, null);
    }

    @NotNull
    public final String buildThirdBindUrl() {
        return d() + "&redirect_uri=" + c();
    }

    @NotNull
    public String getDefaultTitle(@NotNull Context context) {
        return "";
    }

    @NotNull
    public abstract String getHost();

    @NotNull
    public abstract String getName();

    @NotNull
    public final Param getParam() {
        return this.param;
    }

    @NotNull
    public String getRedirectHost() {
        return Api.INSTANCE.getREDIRECT_HOST();
    }

    @NotNull
    public String getRedirectUrl() {
        return "";
    }

    @NotNull
    public final String getTitle(@NotNull Context context) {
        return this.param.getTitle().length() == 0 ? getDefaultTitle(context) : this.param.getTitle();
    }

    @NotNull
    public abstract String getUrl();

    @NotNull
    public String getUserUrl() {
        return "";
    }

    @NotNull
    public abstract String getWebsite();

    public final /* synthetic */ <User> User queryUser(AuthSourceImpl authSource, String accessToken) {
        Object objM3845constructorimpl;
        String userUrl = getUserUrl();
        try {
            HMLog.info(AuthSourceImpl.TAG, AuthSourceImpl.AnonymousClass1.INSTANCE);
            Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(authSource, userUrl, null, q.mapOf(TuplesKt.to("Authorization", "Bearer " + accessToken)), 2, null);
            try {
                Result.Companion companion = Result.Companion;
                ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
                if (responseHttpGet$default.isSuccessful()) {
                    ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
                    ResponseBody responseBodyBody = responseHttpGet$default.body();
                    if (responseBodyBody == null) {
                        Intrinsics.throwNpe();
                    }
                    Intrinsics.needClassReification();
                    objM3845constructorimpl = converter.convert(responseBodyBody, new TypeToken<User>() { // from class: com.huami.thirdparty.webauth.client.AuthClient$queryUser$$inlined$queryUser$1
                    }.getType());
                } else {
                    objM3845constructorimpl = Result.m3845constructorimpl(null);
                    if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                        return null;
                    }
                }
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            return (User) objM3845constructorimpl;
        } catch (Exception e) {
            HMLog.error$default(AuthSourceImpl.TAG, null, e, AuthSourceImpl.AnonymousClass2.INSTANCE, 2, null);
            return null;
        }
    }

    @NotNull
    public Map<String, String> redirectParams() {
        return r.emptyMap();
    }

    @NotNull
    public abstract Map<String, String> redirectParamsEncode();

    /* JADX INFO: renamed from: setParam, reason: collision with other method in class */
    public final void m3391setParam(@NotNull Param param) {
        this.param = param;
    }

    @NotNull
    public abstract Map<String, String> sourceParams();

    @NotNull
    public final AuthClient setParam(@NotNull Param param) {
        this.param = param;
        return this;
    }
}
