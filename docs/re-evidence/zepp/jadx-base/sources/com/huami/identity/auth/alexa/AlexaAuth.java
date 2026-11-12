package com.huami.identity.auth.alexa;

import android.content.Context;
import android.os.Bundle;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleObserver;
import androidx.p008lifecycle.OnLifecycleEvent;
import com.amazon.identity.auth.device.api.Listener;
import com.amazon.identity.auth.device.api.authorization.AuthCancellation;
import com.amazon.identity.auth.device.api.authorization.AuthorizationManager;
import com.amazon.identity.auth.device.api.authorization.AuthorizeListener;
import com.amazon.identity.auth.device.api.authorization.AuthorizeRequest;
import com.amazon.identity.auth.device.api.authorization.AuthorizeResult;
import com.amazon.identity.auth.device.api.authorization.ScopeFactory;
import com.amazon.identity.auth.device.api.workflow.RequestContext;
import com.amazon.identity.auth.device.authorization.InternalAuthManager;
import com.amazon.identity.auth.device.endpoint.OauthCodeForTokenRequest;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.gson.Gson;
import com.huami.privacy.PrivacyProvider;
import com.huami.privacy.plugin.AndroidId;
import com.huami.privacy.plugin.PrivacyPlugin;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b&\u0010'J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0007J\u001b\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\b\u0010\u0018\u001a\u00020\rH\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001cR\u001d\u0010\"\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lcom/huami/identity/auth/alexa/AlexaAuth;", "Lcom/huami/identity/auth/alexa/AuthApi;", "Landroidx/lifecycle/LifecycleObserver;", "Lcom/amazon/identity/auth/device/api/authorization/AuthorizeResult;", "result", "Lcom/huami/identity/auth/alexa/Token;", GoogleApiAvailabilityLight.a, "e", "Lokhttp3/RequestBody;", "requestBody", "c", "Lokhttp3/OkHttpClient;", "a", "", "onResume", "Landroid/os/Bundle;", "data", "Lcom/huami/identity/auth/alexa/AuthStatus;", "signIn", "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signOut", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getAccessToken", "forceRefreshToken", "", "isLogin", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/amazon/identity/auth/device/api/workflow/RequestContext;", "b", "Lkotlin/Lazy;", "()Lcom/amazon/identity/auth/device/api/workflow/RequestContext;", "requestContext", "Lcom/amazon/identity/auth/device/api/authorization/AuthorizeListener;", "Lcom/amazon/identity/auth/device/api/authorization/AuthorizeListener;", "historyListener", "<init>", "(Landroid/content/Context;)V", "Companion", "auth-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class AlexaAuth implements AuthApi, LifecycleObserver {

    @NotNull
    public static final String KEY_DEVICE_SERIAL_NUMBER = "deviceSerialNumber";

    @NotNull
    public static final String KEY_PRODUCT_ID = "productID";
    private static final long d = 60;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy requestContext = LazyKt__LazyJVMKt.lazy(new d());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private AuthorizeListener historyListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "alexa还未授权，不需要强制刷新token";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "本地存储的accessToken为null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "token过期，需要refresh";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/amazon/identity/auth/device/api/workflow/RequestContext;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<RequestContext> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RequestContext getA() {
            RequestContext requestContextCreate = RequestContext.create(AlexaAuth.this.context);
            requestContextCreate.registerListener(new LogAuthListener());
            return requestContextCreate;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("请求token的Json：", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ Response a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Response response) {
            super(0);
            this.a = response;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("使用AuthCode，换取token的请求失败。", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("请求Token发生异常：", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "使用授权的AuthCode，来获取token";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "AuthCode为空，无法获取token";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "ClientId为空，无法获取token";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public static final k a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "刷新Token请求";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "使用RefreshToken换token的时候，获取到的refreshToken为null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public static final m a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "没有获取到存储的ClientID，兼容老的授权方式，获取的ClientID";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public static final n a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "调用alexa sign in";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.ObjectRef<String> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Ref.ObjectRef<String> objectRef) {
            super(0);
            this.a = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("Alexa授权使用的设备SN:", this.a.element);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("调用Alexa授权发生错误：", this.a);
        }
    }

    public AlexaAuth(@NotNull Context context) {
        this.context = context;
    }

    private final OkHttpClient a() {
        return new OkHttpClient.Builder().callTimeout(60L, TimeUnit.SECONDS).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RequestContext b() {
        return (RequestContext) this.requestContext.getValue();
    }

    private final Token c(RequestBody requestBody) {
        Object objM3845constructorimpl;
        Request requestBuild = new Request.Builder().url(ConstantsKt.LWA_ENDPOINT).post(requestBody).build();
        try {
            Result.Companion companion = Result.Companion;
            Response responseExecute = FirebasePerfOkHttpClient.execute(a().newCall(requestBuild));
            if (!responseExecute.isSuccessful()) {
                HMLog.error$default("speech", null, null, new f(responseExecute), 6, null);
                objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
                Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                if (thM3848exceptionOrNullimpl != null) {
                    HMLog.error$default("speech", null, null, new g(thM3848exceptionOrNullimpl), 6, null);
                }
                return null;
            }
            ResponseBody responseBodyBody = responseExecute.body();
            String strString = responseBodyBody == null ? null : responseBodyBody.string();
            HMLog.info("speech", new e(strString));
            if (strString == null || strString.length() == 0) {
                return null;
            }
            Token token = (Token) new Gson().fromJson(strString, Token.class);
            AlexaAuthKeeper.INSTANCE.saveToken$auth_alexa_release(token);
            return token;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Token d(AuthorizeResult result) {
        HMLog.info("speech", h.a);
        String authorizationCode = result.getAuthorizationCode();
        if (authorizationCode == null || authorizationCode.length() == 0) {
            HMLog.error$default("speech", null, null, i.a, 6, null);
            return null;
        }
        String clientId = result.getClientId();
        if (clientId == null || clientId.length() == 0) {
            HMLog.error$default("speech", null, null, j.a, 6, null);
            return null;
        }
        AlexaAuthKeeper.Companion companion = AlexaAuthKeeper.INSTANCE;
        companion.save$auth_alexa_release("clientId", result.getClientId());
        companion.save$auth_alexa_release(AlexaAuthKeeper.KEY_REDIRECT_URL, result.getRedirectURI());
        return c(new FormBody.Builder().add("grant_type", OauthCodeForTokenRequest.AUTHORIZATION_CODE_GRANT).add("code", result.getAuthorizationCode()).add("redirect_uri", result.getRedirectURI()).add("client_id", result.getClientId()).add(ConstantsKt.ARG_CODE_VERIFIER, com.huami.identity.auth.alexa.a.f().e()).build());
    }

    private final Token e() {
        HMLog.info("speech", k.a);
        AlexaAuthKeeper.Companion companion = AlexaAuthKeeper.INSTANCE;
        String string$auth_alexa_release = companion.getString$auth_alexa_release("clientId");
        if (string$auth_alexa_release == null || string$auth_alexa_release.length() == 0) {
            string$auth_alexa_release = InternalAuthManager.getInstance(this.context).getClientId();
            HMLog.info("speech", m.a);
        }
        String string$auth_alexa_release2 = companion.getString$auth_alexa_release(AlexaAuthKeeper.KEY_REFRESH_TOKEN);
        if (string$auth_alexa_release2 == null || string$auth_alexa_release2.length() == 0) {
            HMLog.error$default("speech", null, null, l.a, 6, null);
            return null;
        }
        FormBody.Builder builderAdd = new FormBody.Builder().add("grant_type", "refresh_token").add("refresh_token", string$auth_alexa_release2);
        if (!(string$auth_alexa_release == null || string$auth_alexa_release.length() == 0)) {
            builderAdd.add("client_id", string$auth_alexa_release);
        }
        return c(builderAdd.build());
    }

    @Override // com.huami.identity.auth.alexa.AuthApi
    public void forceRefreshToken() {
        if (isLogin()) {
            e();
        } else {
            HMLog.info("speech", a.a);
        }
    }

    @Override // com.huami.identity.auth.alexa.AuthApi
    @Nullable
    public Object getAccessToken(@NotNull Continuation<? super String> continuation) {
        AlexaAuthKeeper.Companion companion = AlexaAuthKeeper.INSTANCE;
        String string$auth_alexa_release = companion.getString$auth_alexa_release(AlexaAuthKeeper.KEY_ACCESS_TOKEN);
        if (string$auth_alexa_release == null || string$auth_alexa_release.length() == 0) {
            HMLog.info("speech", b.a);
            return null;
        }
        if (companion.getLong$auth_alexa_release(AlexaAuthKeeper.KEY_DEADLINE_TIME) >= System.currentTimeMillis()) {
            return string$auth_alexa_release;
        }
        HMLog.info("speech", c.a);
        Token tokenE = e();
        if (tokenE == null) {
            return null;
        }
        return tokenE.getAccessToken();
    }

    @Override // com.huami.identity.auth.alexa.AuthApi
    public boolean isLogin() {
        String string$auth_alexa_release = AlexaAuthKeeper.INSTANCE.getString$auth_alexa_release(AlexaAuthKeeper.KEY_ACCESS_TOKEN);
        return !(string$auth_alexa_release == null || string$auth_alexa_release.length() == 0);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        b().onResume();
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v9, types: [T, java.lang.String] */
    @Override // com.huami.identity.auth.alexa.AuthApi
    @Nullable
    public Object signIn(@NotNull Bundle bundle, @NotNull Continuation<? super AuthStatus> continuation) throws Exception {
        Object objM3845constructorimpl;
        Object next;
        HMLog.info("speech", n.a);
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        AuthorizeListener authorizeListener = new AuthorizeListener() { // from class: com.huami.identity.auth.alexa.AlexaAuth$signIn$3$listener$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ AuthCancellation a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(AuthCancellation authCancellation) {
                    super(0);
                    this.a = authCancellation;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return Intrinsics.stringPlus("signIn onCancel: ", this.a);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ com.amazon.identity.auth.device.AuthError a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(com.amazon.identity.auth.device.AuthError authError) {
                    super(0);
                    this.a = authError;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return Intrinsics.stringPlus("signIn onError: ", this.a);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function0<String> {
                public final /* synthetic */ AuthorizeResult a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(AuthorizeResult authorizeResult) {
                    super(0);
                    this.a = authorizeResult;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return Intrinsics.stringPlus("signIn onSuccess: ", UtilsKt.getInfo(this.a));
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class d extends Lambda implements Function0<String> {
                public static final d a = new d();

                public d() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "授权失败，没有获取到AuthCode";
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class e extends Lambda implements Function0<String> {
                public final /* synthetic */ Token a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(Token token) {
                    super(0);
                    this.a = token;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return Intrinsics.stringPlus("token:", this.a);
                }
            }

            private final void a() {
                this.a.b().unregisterListener(this);
                this.a.historyListener = null;
            }

            @Override // com.amazon.identity.auth.device.api.authorization.AuthorizeListener, com.amazon.identity.auth.device.interactive.InteractiveListener, com.amazon.identity.auth.device.api.CancellableListener
            public void onCancel(@Nullable AuthCancellation authCancellation) {
                String description;
                AuthCancellation.Cause cause;
                String strName;
                a();
                HMLog.debug$default(null, new a(authCancellation), 1, null);
                String str = "FAILED_AUTHENTICATION";
                if (authCancellation != null && (cause = authCancellation.getCause()) != null && (strName = cause.name()) != null) {
                    str = strName;
                }
                String str2 = "因为onCancel回调执行导致的授权失败";
                if (authCancellation != null && (description = authCancellation.getDescription()) != null) {
                    str2 = description;
                }
                Continuation<AuthStatus> continuation2 = safeContinuation;
                try {
                    Result.Companion companion = Result.Companion;
                    continuation2.resumeWith(Result.m3845constructorimpl(new AuthError(-1, new CancelError(str, str2))));
                    Result.m3845constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    Result.m3845constructorimpl(ResultKt.createFailure(th));
                }
            }

            @Override // com.amazon.identity.auth.device.api.authorization.AuthorizeListener, com.amazon.identity.auth.device.interactive.InteractiveListener, com.amazon.identity.auth.device.api.CancellableListener, com.amazon.identity.auth.device.api.Listener
            public void onError(@NotNull com.amazon.identity.auth.device.AuthError authError) {
                a();
                HMLog.error$default("speech", null, null, new b(authError), 6, null);
                Continuation<AuthStatus> continuation2 = safeContinuation;
                try {
                    Result.Companion companion = Result.Companion;
                    continuation2.resumeWith(Result.m3845constructorimpl(new AuthError(authError.getType().value(), authError)));
                    Result.m3845constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    Result.m3845constructorimpl(ResultKt.createFailure(th));
                }
            }

            @Override // com.amazon.identity.auth.device.api.authorization.AuthorizeListener, com.amazon.identity.auth.device.interactive.InteractiveListener, com.amazon.identity.auth.device.api.CancellableListener, com.amazon.identity.auth.device.api.Listener
            public void onSuccess(@Nullable AuthorizeResult result) {
                a();
                HMLog.info("speech", new c(result));
                String authorizationCode = result == null ? null : result.getAuthorizationCode();
                if (authorizationCode == null || authorizationCode.length() == 0) {
                    HMLog.error$default("speech", null, null, d.a, 6, null);
                    Continuation<AuthStatus> continuation2 = safeContinuation;
                    try {
                        Result.Companion companion = Result.Companion;
                        continuation2.resumeWith(Result.m3845constructorimpl(new AuthError(0, new Throwable("虽然回调了授权成功，但是未获取到AuthCode"))));
                        Result.m3845constructorimpl(Unit.INSTANCE);
                        return;
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        Result.m3845constructorimpl(ResultKt.createFailure(th));
                        return;
                    }
                }
                Token tokenD = this.a.d(result);
                HMLog.info("speech", new e(tokenD));
                if (tokenD == null) {
                    Continuation<AuthStatus> continuation3 = safeContinuation;
                    try {
                        Result.Companion companion3 = Result.Companion;
                        continuation3.resumeWith(Result.m3845constructorimpl(new AuthError(0, new Exception("通过AuthCode换取token失败！"))));
                        Result.m3845constructorimpl(Unit.INSTANCE);
                        return;
                    } catch (Throwable th2) {
                        Result.Companion companion4 = Result.Companion;
                        Result.m3845constructorimpl(ResultKt.createFailure(th2));
                        return;
                    }
                }
                Continuation<AuthStatus> continuation4 = safeContinuation;
                try {
                    Result.Companion companion5 = Result.Companion;
                    continuation4.resumeWith(Result.m3845constructorimpl(new AuthSuccess(tokenD)));
                    Result.m3845constructorimpl(Unit.INSTANCE);
                } catch (Throwable th3) {
                    Result.Companion companion6 = Result.Companion;
                    Result.m3845constructorimpl(ResultKt.createFailure(th3));
                }
            }
        };
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? string = bundle.getString(KEY_DEVICE_SERIAL_NUMBER);
        objectRef.element = string;
        CharSequence charSequence = (CharSequence) string;
        if (charSequence == null || charSequence.length() == 0) {
            PrivacyProvider privacyProvider = PrivacyProvider.INSTANCE;
            if ("alexa授权需要sn".length() == 0) {
                throw new Exception("请填写此隐私信息的使用目的");
            }
            Iterator<T> it2 = privacyProvider.getPlugins().iterator();
            do {
                if (!it2.hasNext()) {
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                next = it2.next();
            } while (!Intrinsics.areEqual(((PrivacyPlugin) next).getClass(), AndroidId.class));
            Objects.requireNonNull(next, "null cannot be cast to non-null type com.huami.privacy.plugin.AndroidId");
            objectRef.element = ((AndroidId) next).getValue();
        }
        String string2 = bundle.getString("productID");
        jSONObject2.put(KEY_DEVICE_SERIAL_NUMBER, objectRef.element);
        HMLog.info("speech", new o(objectRef));
        jSONObject.put("productInstanceAttributes", jSONObject2);
        jSONObject.put("productID", string2);
        AuthorizeListener authorizeListener2 = this.historyListener;
        if (authorizeListener2 != null) {
            Boxing.boxBoolean(b().unregisterListener(authorizeListener2));
        }
        b().registerListener(authorizeListener);
        Unit unit = Unit.INSTANCE;
        this.historyListener = authorizeListener;
        try {
            Result.Companion companion = Result.Companion;
            AuthorizationManager.authorize(new AuthorizeRequest.Builder(b()).addScopes(ScopeFactory.scopeNamed("alexa:voice_service:pre_auth"), ScopeFactory.scopeNamed("alexa:all", jSONObject)).forGrantType(AuthorizeRequest.GrantType.AUTHORIZATION_CODE).withProofKeyParameters(com.huami.identity.auth.alexa.a.f().b(com.huami.identity.auth.alexa.a.f().e(), ConstantsKt.SHA_256), ConstantsKt.SHA_256).shouldReturnUserData(false).build());
            objM3845constructorimpl = Result.m3845constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.info("speech", new p(thM3848exceptionOrNullimpl));
        }
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Override // com.huami.identity.auth.alexa.AuthApi
    @Nullable
    public Object signOut(@NotNull Continuation<? super AuthStatus> continuation) {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        AuthorizationManager.signOut(this.context.getApplicationContext(), new Listener<Void, com.amazon.identity.auth.device.AuthError>() { // from class: com.huami.identity.auth.alexa.AlexaAuth$signOut$2$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ com.amazon.identity.auth.device.AuthError a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(com.amazon.identity.auth.device.AuthError authError) {
                    super(0);
                    this.a = authError;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return Intrinsics.stringPlus("登出失败：", this.a);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ Void a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(Void r1) {
                    super(0);
                    this.a = r1;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return Intrinsics.stringPlus("signOut onSuccess: ", this.a);
                }
            }

            @Override // com.amazon.identity.auth.device.api.Listener
            public void onError(@NotNull com.amazon.identity.auth.device.AuthError authError) {
                HMLog.info("speech", new a(authError));
                Continuation<AuthStatus> continuation2 = safeContinuation;
                AuthError authError2 = new AuthError(authError.getType().value(), authError);
                Result.Companion companion = Result.Companion;
                continuation2.resumeWith(Result.m3845constructorimpl(authError2));
            }

            @Override // com.amazon.identity.auth.device.api.Listener
            public void onSuccess(@Nullable Void response) {
                HMLog.info("speech", new b(response));
                AlexaAuthKeeper.INSTANCE.clear$auth_alexa_release();
                Continuation<AuthStatus> continuation2 = safeContinuation;
                AuthSuccess authSuccess = new AuthSuccess(null);
                Result.Companion companion = Result.Companion;
                continuation2.resumeWith(Result.m3845constructorimpl(authSuccess));
            }
        });
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
