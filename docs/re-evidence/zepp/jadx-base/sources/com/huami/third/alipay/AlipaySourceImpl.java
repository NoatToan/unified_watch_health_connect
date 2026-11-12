package com.huami.third.alipay;

import android.app.Activity;
import com.alipay.sdk.app.AuthTask;
import com.google.gson.reflect.TypeToken;
import com.huami.http.ConverterKt;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.network.hmnetwork.webapi.HMWebParameter;
import com.huami.passport.Configs;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.bind.HMUnbindBaseLogic;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J(\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J(\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J0\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/third/alipay/AlipaySourceImpl;", "Lcom/huami/third/alipay/AlipaySource;", "Lcom/huami/http/HttpKit;", "", "authString", "Landroid/app/Activity;", "activity", "Lcom/huami/third/alipay/AuthResult;", "auth", "host", "userId", "appId", "Lcom/huami/third/alipay/ApiResult;", "Lcom/huami/third/alipay/AuthInfo;", "getAuthInfo", "Lcom/huami/third/alipay/UserInfo;", "getUserInfo", Configs.Params.AUTHCODE, "Lcom/huami/third/alipay/UploadResult;", "uploadAuthCode", "nickName", "", HMUnbindBaseLogic.TAG, "<init>", "()V", "Companion", "alipay_release"}, k = 1, mv = {1, 4, 1})
public final class AlipaySourceImpl implements AlipaySource, HttpKit {

    @NotNull
    public static final String RES_9_K = "9000";

    @NotNull
    public static final String RES_OK = "200";
    private static final String a = "AlipaySourceImpl";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "获取Alipay授权信息";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ ApiResult a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ApiResult apiResult) {
            super(0);
            this.a = apiResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "data = null,msg = " + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "获取Alipay授权信息失败";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "获取Alipay用户信息";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ ApiResult a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ApiResult apiResult) {
            super(0);
            this.a = apiResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "data = null,msg = " + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "获取Alipay用户信息失败";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "解除Alipay授权";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "解除Alipay授权失败";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class i extends Lambda implements Function0<String> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "上传Alipay授权码";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ ApiResult a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ApiResult apiResult) {
            super(0);
            this.a = apiResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "data = null,msg = " + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class k extends Lambda implements Function0<String> {
        public static final k a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "上传Alipay授权码失败";
        }
    }

    @Override // com.huami.third.alipay.AlipaySource
    @Nullable
    public AuthResult auth(@NotNull String authString, @NotNull Activity activity) {
        Map<String, String> mapAuthV2 = new AuthTask(activity).authV2(authString, true);
        AuthResult authResult = new AuthResult();
        authResult.parse(mapAuthV2, true);
        return authResult;
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.third.alipay.AlipaySource
    @Nullable
    public ApiResult<AuthInfo> getAuthInfo(@NotNull String host, @NotNull String userId, @NotNull String appId) {
        Object objM3845constructorimpl;
        try {
            HMLog.info(a, a.a);
            Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, host + Api.URL_ALIPAY_AUTH, r.mapOf(TuplesKt.to("userid", userId), TuplesKt.to("appId", appId)), null, 4, null);
            try {
                Result.Companion companion = Result.Companion;
                ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
                if (responseHttpGet$default.isSuccessful()) {
                    ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
                    ResponseBody responseBodyBody = responseHttpGet$default.body();
                    if (responseBodyBody == null) {
                        Intrinsics.throwNpe();
                    }
                    objM3845constructorimpl = converter.convert(responseBodyBody, new TypeToken<ApiResult<AuthInfo>>() { // from class: com.huami.third.alipay.AlipaySourceImpl$getAuthInfo$$inlined$deserialize$1
                    }.getType());
                } else {
                    objM3845constructorimpl = Result.m3845constructorimpl(null);
                    if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                        objM3845constructorimpl = null;
                    }
                }
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            ApiResult<AuthInfo> apiResult = (ApiResult) objM3845constructorimpl;
            if (apiResult == null) {
                return null;
            }
            if (apiResult.getData() == null) {
                HMLog.error$default(a, null, null, new b(apiResult), 6, null);
            }
            return apiResult;
        } catch (Exception e2) {
            HMLog.error$default(a, null, e2, c.a, 2, null);
            return null;
        }
    }

    @Override // com.huami.third.alipay.AlipaySource
    @Nullable
    public ApiResult<UserInfo> getUserInfo(@NotNull String host, @NotNull String userId, @NotNull String appId) {
        Object objM3845constructorimpl;
        try {
            HMLog.info(a, d.a);
            String str = host + Api.URL_ALIPAY_USER_INFO;
            FormBody.Builder builder = new FormBody.Builder();
            builder.add(HMWebParameter.PARAM_THIRD_APP_ID, appId);
            builder.add("userid", userId);
            Unit unit = Unit.INSTANCE;
            Response responseHttpPost$default = HttpKitKtxKt.httpPost$default(this, str, builder.build(), null, null, 12, null);
            try {
                Result.Companion companion = Result.Companion;
                ConverterKt.checkToken(responseHttpPost$default, ConverterKt.responseToJsonStr(responseHttpPost$default));
                if (responseHttpPost$default.isSuccessful()) {
                    ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
                    ResponseBody responseBodyBody = responseHttpPost$default.body();
                    if (responseBodyBody == null) {
                        Intrinsics.throwNpe();
                    }
                    objM3845constructorimpl = converter.convert(responseBodyBody, new TypeToken<ApiResult<UserInfo>>() { // from class: com.huami.third.alipay.AlipaySourceImpl$getUserInfo$$inlined$deserialize$1
                    }.getType());
                } else {
                    objM3845constructorimpl = Result.m3845constructorimpl(null);
                    if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                        objM3845constructorimpl = null;
                    }
                }
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            ApiResult<UserInfo> apiResult = (ApiResult) objM3845constructorimpl;
            if (apiResult == null) {
                return null;
            }
            if (apiResult.getData() == null) {
                HMLog.error$default(a, null, null, new e(apiResult), 6, null);
            }
            return apiResult;
        } catch (Exception e2) {
            HMLog.error$default(a, null, e2, f.a, 2, null);
            return null;
        }
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }

    @Override // com.huami.third.alipay.AlipaySource
    public boolean unbind(@NotNull String host, @NotNull String userId, @NotNull String appId, @NotNull String nickName) {
        try {
            HMLog.info(a, g.a);
            String str = host + Api.URL_UNBIND_ALIPAY;
            FormBody.Builder builder = new FormBody.Builder();
            builder.add(HMWebParameter.PARAM_THIRD_APP_ID, appId);
            builder.add(HMWebParameter.PARAM_PARTNER_THIRD_APP_UID, userId);
            builder.add("nick_name", nickName);
            builder.add(HMUnbindBaseLogic.TAG, "1");
            builder.add("userid", userId);
            Unit unit = Unit.INSTANCE;
            return HttpKitKtxKt.httpPost$default(this, str, builder.build(), null, null, 12, null).isSuccessful();
        } catch (Exception e2) {
            HMLog.error$default(a, null, e2, h.a, 2, null);
            return false;
        }
    }

    @Override // com.huami.third.alipay.AlipaySource
    @Nullable
    public ApiResult<UploadResult> uploadAuthCode(@NotNull String host, @NotNull String userId, @NotNull String appId, @NotNull String authCode) {
        Object objM3845constructorimpl;
        try {
            HMLog.info(a, i.a);
            String str = host + Api.URL_ALIPAY_AUTH;
            FormBody.Builder builder = new FormBody.Builder();
            builder.add("appId", appId);
            builder.add(Configs.Params.AUTHCODE, authCode);
            builder.add("userid", userId);
            Unit unit = Unit.INSTANCE;
            Response responseHttpPost$default = HttpKitKtxKt.httpPost$default(this, str, builder.build(), null, null, 12, null);
            try {
                Result.Companion companion = Result.Companion;
                ConverterKt.checkToken(responseHttpPost$default, ConverterKt.responseToJsonStr(responseHttpPost$default));
                if (responseHttpPost$default.isSuccessful()) {
                    ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
                    ResponseBody responseBodyBody = responseHttpPost$default.body();
                    if (responseBodyBody == null) {
                        Intrinsics.throwNpe();
                    }
                    objM3845constructorimpl = converter.convert(responseBodyBody, new TypeToken<ApiResult<UploadResult>>() { // from class: com.huami.third.alipay.AlipaySourceImpl$uploadAuthCode$$inlined$deserialize$1
                    }.getType());
                } else {
                    objM3845constructorimpl = Result.m3845constructorimpl(null);
                    if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                        objM3845constructorimpl = null;
                    }
                }
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            ApiResult<UploadResult> apiResult = (ApiResult) objM3845constructorimpl;
            if (apiResult == null) {
                return null;
            }
            if (apiResult.getData() == null) {
                HMLog.error$default(a, null, null, new j(apiResult), 6, null);
            }
            return apiResult;
        } catch (Exception e2) {
            HMLog.error$default(a, null, e2, k.a, 2, null);
            return null;
        }
    }
}
