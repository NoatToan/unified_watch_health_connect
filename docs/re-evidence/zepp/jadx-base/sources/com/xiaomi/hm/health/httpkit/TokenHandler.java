package com.xiaomi.hm.health.httpkit;

import android.text.TextUtils;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.HMLoginManager;
import com.huami.account.HMLogoutManager;
import com.huami.account.api.model.HMWebAccess;
import com.huami.mifit.sportlib.core.GPSDataController;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMRestfulCodeUtil;
import com.huami.network.hmnetwork.webapi.WebResponse;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/hm/health/httpkit/TokenHandler;", "", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class TokenHandler {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int a = 1000;

    @NotNull
    private static final String b = "code";

    @NotNull
    private static final String c = "0108";

    @NotNull
    private static final String d = "HTTP_KIT_Response";

    @NotNull
    private static final String e = "mutimelong";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\tH\u0002J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J\u0016\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0004R\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/httpkit/TokenHandler$Companion;", "", "Lokhttp3/Response;", AbstractJSONTokenResponse.RESPONSE, "", "json", "", "f", "e", "", "b", "", "mutexTime", "c", "a", "url", GoogleApiAvailabilityLight.a, "bodyJson", "needCancelBeforeResponse", "CODE", "Ljava/lang/String;", "MUTEX_CODE", "MUTEX_TIME_LONG", "", "RADIX", LogUtil.I, "TAG", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "fresh token if invalid";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Throwable th) {
                super(0);
                this.a = th;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return this.a.toString();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public final /* synthetic */ StackTraceElement a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(StackTraceElement stackTraceElement) {
                super(0);
                this.a = stackTraceElement;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return this.a.toString();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function0<String> {
            public final /* synthetic */ Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Throwable th) {
                super(0);
                this.a = th;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return this.a.toString();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function0<String> {
            public static final e a = new e();

            public e() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "fresh token if invalid";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function0<String> {
            public final /* synthetic */ Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(Throwable th) {
                super(0);
                this.a = th;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return this.a.toString();
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a() {
            HMLogoutManager.logout(4);
        }

        private final void b() {
            HMLogoutManager.logout(2);
        }

        private final void c(long mutexTime) {
            HMLogoutManager.mutex(mutexTime);
        }

        private final boolean d(String url) {
            return HMLoginManager.isUserValid() && (TextUtils.isEmpty(url) || !HMServerDef.isThirdUrl(url)) && !GPSDataController.getInstance().isRunning();
        }

        private final boolean e(String json) {
            Object objM3845constructorimpl;
            Object objM3845constructorimpl2;
            int i = 0;
            try {
                Result.Companion companion = Result.Companion;
                WebResponse webResponse = WebResponse.parse(json);
                int i2 = webResponse.code;
                if (i2 == 0) {
                    if (HMLoginManager.isHuamiSDKLogin()) {
                        HMWebAccess.setHadFreshToken(false);
                        HMLog.info(TokenHandler.d, a.a);
                    } else {
                        b();
                    }
                    return true;
                }
                if (i2 == -1) {
                    try {
                        c(new JSONObject(webResponse.data).getLong(HMLogoutManager.PARAM_LOGIN_TIME) * ((long) 1000));
                        objM3845constructorimpl2 = Result.m3845constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(th));
                    }
                    if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl2) != null) {
                        b();
                    }
                    return true;
                }
                objM3845constructorimpl = Result.m3845constructorimpl(Boolean.FALSE);
                Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                if (thM3848exceptionOrNullimpl != null) {
                    HMLog.info(TokenHandler.d, new b(thM3848exceptionOrNullimpl));
                    StackTraceElement[] stackTrace = thM3848exceptionOrNullimpl.getStackTrace();
                    int length = stackTrace.length;
                    while (i < length) {
                        StackTraceElement stackTraceElement = stackTrace[i];
                        i++;
                        HMLog.info(TokenHandler.d, new c(stackTraceElement));
                    }
                }
                Boolean bool = Boolean.FALSE;
                if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                    objM3845constructorimpl = bool;
                }
                return ((Boolean) objM3845constructorimpl).booleanValue();
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th2));
            }
        }

        private final boolean f(Response response, String json) {
            Object objM3845constructorimpl;
            try {
                Result.Companion companion = Result.Companion;
                if (!HMRestfulCodeUtil.isAuthInvalid(response.code())) {
                    return false;
                }
                try {
                    JSONObject jSONObject = new JSONObject(WebResponse.parse(json).data);
                    String string = jSONObject.getString("code");
                    if (Intrinsics.areEqual("0108", string)) {
                        c(jSONObject.getLong(TokenHandler.e));
                        return true;
                    }
                    if (!Intrinsics.areEqual(HMWebAccess.AUTH_SERVER_ERROR_DISABLE_APP_LOGIN, string) && !Intrinsics.areEqual(HMWebAccess.AUTH_SERVER_ERROR_ACCOUNT_DISABLE, string)) {
                        objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
                        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                        if (thM3848exceptionOrNullimpl != null) {
                            HMLog.info(TokenHandler.d, new d(thM3848exceptionOrNullimpl));
                        }
                        HMWebAccess.setHadFreshToken(false);
                        HMLog.info(TokenHandler.d, e.a);
                        return true;
                    }
                    a();
                    return true;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                }
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.Companion;
                Object objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(th2));
                Throwable thM3848exceptionOrNullimpl2 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl2);
                if (thM3848exceptionOrNullimpl2 != null) {
                    HMLog.info(TokenHandler.d, new f(thM3848exceptionOrNullimpl2));
                }
                Boolean bool = Boolean.FALSE;
                if (Result.m3850isFailureimpl(objM3845constructorimpl2)) {
                    objM3845constructorimpl2 = bool;
                }
                return ((Boolean) objM3845constructorimpl2).booleanValue();
            }
        }

        public final boolean needCancelBeforeResponse(@NotNull Response response, @NotNull String bodyJson) {
            String string = response.request().url().toString();
            if (!d(string)) {
                return false;
            }
            if (StringsKt__StringsKt.contains$default((CharSequence) string, (CharSequence) HMServerDef.RESPONSE_FORMAT, false, 2, (Object) null)) {
                return response.isSuccessful() && e(bodyJson);
            }
            return f(response, bodyJson);
        }
    }
}
