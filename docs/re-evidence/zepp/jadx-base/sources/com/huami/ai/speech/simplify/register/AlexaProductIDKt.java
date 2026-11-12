package com.huami.ai.speech.simplify.register;

import androidx.annotation.WorkerThread;
import com.google.gson.reflect.TypeToken;
import com.huami.ai.speech.api.KoinHelperKt;
import com.huami.ai.speech.simplify.inject.SwitchConfig;
import com.huami.ai.speech.simplify.register.config.AlexaSetting;
import com.huami.ai.speech.simplify.register.config.SpeechAuthSetting;
import com.huami.http.ConverterKt;
import com.huami.http.HttpError;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0003\"\u0016\u0010\b\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "source", "", "getProductIdByDeviceSource", "(Ljava/lang/Integer;)Ljava/lang/String;", "getBetaIdByDeviceSource", "Lcom/huami/ai/speech/simplify/register/config/SpeechAuthSetting;", "a", "URL_APP_SETTINGS", "Ljava/lang/String;", "speech-simplify_release"}, k = 2, mv = {1, 5, 1})
public final class AlexaProductIDKt {

    @NotNull
    public static final String URL_APP_SETTINGS = "/device/setting/device.voice.assistant.config?deviceSource=";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("获取到的Alexa Beta ID:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("获取到的Alexa Product ID:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ Throwable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, Throwable th) {
            super(0);
            this.a = i;
            this.b = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "请求source(" + this.a + ")的alexa id失败。错误消息:" + this.b;
        }
    }

    @WorkerThread
    private static final SpeechAuthSetting a(int i) {
        Object objM3845constructorimpl;
        String strStringPlus = Intrinsics.stringPlus(URL_APP_SETTINGS, Integer.valueOf(i));
        try {
            Result.Companion companion = Result.Companion;
            Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(new HttpKit() { // from class: com.huami.ai.speech.simplify.register.AlexaProductIDKt$getSpeechConfig$1$httpKit$1
                @Override // com.huami.http.HttpKit
                @NotNull
                public HttpUrl baseUrl() {
                    return HttpKit.DefaultImpls.baseUrl(this);
                }

                @Override // com.huami.http.HttpKit
                @NotNull
                public OkHttpClient okHttpClient() {
                    return HttpKit.DefaultImpls.okHttpClient(this);
                }
            }, strStringPlus, null, null, 6, null);
            ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
            if (!responseHttpGet$default.isSuccessful()) {
                throw new HttpError(responseHttpGet$default);
            }
            ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
            ResponseBody responseBodyBody = responseHttpGet$default.body();
            if (responseBodyBody == null) {
                Intrinsics.throwNpe();
            }
            objM3845constructorimpl = Result.m3845constructorimpl((SpeechAuthSetting) converter.convert(responseBodyBody, new TypeToken<SpeechAuthSetting>() { // from class: com.huami.ai.speech.simplify.register.AlexaProductIDKt$getSpeechConfig$lambda-2$$inlined$deserializeOrThrow$1
            }.getType()));
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.info("speech", new c(i, thM3848exceptionOrNullimpl));
            }
            if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                objM3845constructorimpl = null;
            }
            return (SpeechAuthSetting) objM3845constructorimpl;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
    }

    @WorkerThread
    @Nullable
    public static final String getBetaIdByDeviceSource(@Nullable Integer num) {
        AlexaSetting alexaSetting;
        String betaId = null;
        if (num == null) {
            return ((SwitchConfig) KoinHelperKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(SwitchConfig.class), null, null)).getAppProductId();
        }
        SpeechAuthSetting speechAuthSettingA = a(num.intValue());
        if (speechAuthSettingA != null && (alexaSetting = speechAuthSettingA.getAlexaSetting()) != null) {
            betaId = alexaSetting.getBetaId();
        }
        HMLog.info("speech", new a(betaId));
        return betaId;
    }

    @WorkerThread
    @Nullable
    public static final String getProductIdByDeviceSource(@Nullable Integer num) {
        AlexaSetting alexaSetting;
        String prodId = null;
        if (num == null) {
            return ((SwitchConfig) KoinHelperKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(SwitchConfig.class), null, null)).getAppProductId();
        }
        SpeechAuthSetting speechAuthSettingA = a(num.intValue());
        if (speechAuthSettingA != null && (alexaSetting = speechAuthSettingA.getAlexaSetting()) != null) {
            prodId = alexaSetting.getProdId();
        }
        HMLog.info("speech", new b(prodId));
        return prodId;
    }
}
