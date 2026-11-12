package com.huami.account.api;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.reflect.TypeToken;
import com.huami.account.api.entity.ProfileDefaultFields;
import com.huami.http.ConverterKt;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.network.base.util.HMHttpUtils;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/huami/account/api/UserSettingsApi;", "Lcom/huami/http/HttpKit;", "", "settingName", "getSingleUserSettings", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isAdult", "Lcom/huami/account/api/entity/ProfileDefaultFields;", "getDefaultProfileFields", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Ljava/lang/String;", "APPS_S_SETTINGS", "b", "PARAM_SETTING_NAME", "c", "PARAM_MODE", GoogleApiAvailabilityLight.a, "PARAM_MODE_SINGLE", "e", "SETTING_KEY_DEFAULT_PROFILE", "f", "SETTING_KEY_DEFAULT_MINOR_PROFILE", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class UserSettingsApi implements HttpKit {

    @NotNull
    public static final UserSettingsApi INSTANCE = new UserSettingsApi();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String APPS_S_SETTINGS = "apps/%s/settings";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String PARAM_SETTING_NAME = "settingName";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String PARAM_MODE = "mode";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String PARAM_MODE_SINGLE = "SINGLE";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final String SETTING_KEY_DEFAULT_PROFILE = "huami.default.user.profile";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final String SETTING_KEY_DEFAULT_MINOR_PROFILE = "huami.default.user.profile.minor";

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.account.api.UserSettingsApi", f = "UserSettingsApi.kt", i = {0, 1}, l = {53, 53}, m = "getDefaultProfileFields", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return UserSettingsApi.this.getDefaultProfileFields(false, this);
        }
    }

    /* JADX INFO: renamed from: com.huami.account.api.UserSettingsApi$getSingleUserSettings$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.account.api.UserSettingsApi$getSingleUserSettings$2", f = "UserSettingsApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.c, continuation);
            anonymousClass2.b = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super String> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM3845constructorimpl;
            Object objM3845constructorimpl2;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String url = HMServerDef.getUrl(String.format("apps/%s/settings", Arrays.copyOf(new Object[]{HMAppConfig.getPackageName()}, 1)));
            Map mapMapOf = r.mapOf(TuplesKt.to("settingName", this.c), TuplesKt.to("mode", "SINGLE"));
            try {
                Result.Companion companion = Result.Companion;
                Response responseHttpGet = HttpKitKtxKt.httpGet(UserSettingsApi.INSTANCE, url, mapMapOf, HMWebUtil.getSystemHeader());
                try {
                    ConverterKt.checkToken(responseHttpGet, ConverterKt.responseToJsonStr(responseHttpGet));
                    if (responseHttpGet.isSuccessful()) {
                        ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
                        ResponseBody responseBodyBody = responseHttpGet.body();
                        if (responseBodyBody == null) {
                            Intrinsics.throwNpe();
                        }
                        objM3845constructorimpl2 = converter.convert(responseBodyBody, new TypeToken<Map<String, ? extends String>>() { // from class: com.huami.account.api.UserSettingsApi$getSingleUserSettings$2$invokeSuspend$lambda-0$$inlined$deserialize$1
                        }.getType());
                    } else {
                        objM3845constructorimpl2 = Result.m3845constructorimpl(null);
                        if (Result.m3850isFailureimpl(objM3845constructorimpl2)) {
                            objM3845constructorimpl2 = null;
                        }
                    }
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(th));
                }
                objM3845constructorimpl = Result.m3845constructorimpl((Map) objM3845constructorimpl2);
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                objM3845constructorimpl = null;
            }
            Map map = (Map) objM3845constructorimpl;
            if (map == null) {
                return null;
            }
            return (String) map.get(this.c);
        }
    }

    private UserSettingsApi() {
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getDefaultProfileFields(boolean z, @NotNull Continuation<? super ProfileDefaultFields> continuation) {
        a aVar;
        String str;
        Object objM3845constructorimpl;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.d = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object singleUserSettings = aVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(singleUserSettings);
            aVar.a = this;
            if (z) {
                aVar.d = 1;
                singleUserSettings = getSingleUserSettings(SETTING_KEY_DEFAULT_PROFILE, aVar);
                if (singleUserSettings == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = (String) singleUserSettings;
            } else {
                aVar.d = 2;
                singleUserSettings = getSingleUserSettings(SETTING_KEY_DEFAULT_MINOR_PROFILE, aVar);
                if (singleUserSettings == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = (String) singleUserSettings;
            }
        } else if (i2 == 1) {
            ResultKt.throwOnFailure(singleUserSettings);
            str = (String) singleUserSettings;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(singleUserSettings);
            str = (String) singleUserSettings;
        }
        if (str == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl((ProfileDefaultFields) HMHttpUtils.getGson().fromJson(str, ProfileDefaultFields.class));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            return null;
        }
        return objM3845constructorimpl;
    }

    @Nullable
    public final Object getSingleUserSettings(@NotNull String str, @NotNull Continuation<? super String> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(str, null), continuation);
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }
}
