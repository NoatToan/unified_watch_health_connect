package com.huami.ai.speech.simplify.register;

import android.app.Application;
import com.huami.ai.helper.DeviceSpeechSupportFuncKt;
import com.huami.ai.helper.SpeechKeeper;
import com.huami.ai.speech.api.KoinHelperKt;
import com.huami.ai.speech.simplify.alexa.language.AlexaLanguageRepo;
import com.huami.ai.speech.simplify.alexa.language.AlexaLanguageUtilsKt;
import com.huami.ai.speech.simplify.inject.AccessCheck;
import com.huami.ai.uitls.DeviceUtilsKt;
import com.huami.bluetooth.profile.channel.module.voice.AiVoiceModule;
import com.huami.bluetooth.profile.channel.module.voice.VoiceModule;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import java.lang.reflect.GenericDeclaration;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelicateCoroutinesApi;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0014\u0010\b\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\u0006J\u0006\u0010\u000e\u001a\u00020\u0006R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/ai/speech/simplify/register/SpeechRegister;", "", "Landroid/app/Application;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "c", "a", "b", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "initSpeech", "syncAlexaLanguage", "clearSavedSpeechInfo", "Lcom/huami/ai/speech/simplify/register/DeviceVoiceCallback;", "Lcom/huami/ai/speech/simplify/register/DeviceVoiceCallback;", "voiceCallback", "<init>", "()V", "speech-simplify_release"}, k = 1, mv = {1, 5, 1})
@DelicateCoroutinesApi
public final class SpeechRegister {

    @NotNull
    public static final SpeechRegister INSTANCE = new SpeechRegister();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private static DeviceVoiceCallback voiceCallback;

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
            return "没有获取到VoiceModule Class";
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
            return "调用getChannelModule(module)，获得了null的VoiceModule";
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
            return "调用旧的DeviceVoiceCallback的destroy方法";
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
            return "设置新的DeviceVoiceCallback";
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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "获取到小爱的VoiceModule";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "获取到Alexa的VoiceModule";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "获取到MiLi设备，并注册语音回调";
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
            return "device connect,begin set voice callback";
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
            return "add speech entrance";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("add voice callback error:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.simplify.register.SpeechRegister$syncAlexaLanguage$1", f = "SpeechRegister.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ AlexaLanguageRepo b;
        public final /* synthetic */ String c;

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
                return "syncAlexaLanguage,获取到的device为null";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(boolean z) {
                super(0);
                this.a = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return Intrinsics.stringPlus("绑定设备时，设置alexa语言：", Boolean.valueOf(this.a));
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
                return "绑定设备时，保存Alexa语言到本地！";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(AlexaLanguageRepo alexaLanguageRepo, String str, Continuation<? super k> continuation) {
            super(2, continuation);
            this.b = alexaLanguageRepo;
            this.c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new k(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMBaseDevice hMBaseDevice = (HMBaseDevice) ((Function0) KoinHelperKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Function0.class), null, null)).getA();
                if (hMBaseDevice == null) {
                    HMLog.warn$default("speech", null, a.a, 2, null);
                    return Unit.INSTANCE;
                }
                List<String> listDeviceSupportLanguages = this.b.deviceSupportLanguages();
                if (listDeviceSupportLanguages == null) {
                    return Unit.INSTANCE;
                }
                if (!listDeviceSupportLanguages.contains(this.c)) {
                    return Unit.INSTANCE;
                }
                String str = this.c;
                this.a = 1;
                obj = DeviceUtilsKt.setDeviceAlexaLanguage(hMBaseDevice, str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AlexaLanguageRepo alexaLanguageRepo = this.b;
            String str2 = this.c;
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            HMLog.info("speech", new b(zBooleanValue));
            if (zBooleanValue) {
                alexaLanguageRepo.updateLanguageCache(str2);
                HMLog.info("speech", c.a);
            }
            return Unit.INSTANCE;
        }
    }

    private SpeechRegister() {
    }

    private final void a(HMBaseDevice hMBaseDevice, Application application) {
        GenericDeclaration genericDeclaration;
        int i2;
        if (DeviceSpeechSupportFuncKt.featureSupportMIAI(hMBaseDevice)) {
            i2 = 17;
            genericDeclaration = AiVoiceModule.class;
            HMLog.info("speech", e.a);
        } else if (DeviceSpeechSupportFuncKt.featureSupportAlexa(hMBaseDevice)) {
            i2 = 16;
            genericDeclaration = VoiceModule.class;
            HMLog.info("speech", f.a);
        } else {
            genericDeclaration = null;
            i2 = 0;
        }
        if (genericDeclaration == null) {
            HMLog.info("speech", a.a);
            return;
        }
        VoiceModule voiceModule = (VoiceModule) hMBaseDevice.getChannelModule(genericDeclaration);
        if (voiceModule == null) {
            HMLog.error$default("speech", null, null, b.a, 6, null);
            return;
        }
        HMLog.info("speech", c.a);
        DeviceVoiceCallback deviceVoiceCallback = voiceCallback;
        if (deviceVoiceCallback != null) {
            deviceVoiceCallback.destroy();
        }
        HMLog.info("speech", d.a);
        DeviceVoiceCallback deviceVoiceCallback2 = new DeviceVoiceCallback(hMBaseDevice, i2, application);
        voiceCallback = deviceVoiceCallback2;
        Objects.requireNonNull(deviceVoiceCallback2, "null cannot be cast to non-null type com.huami.ai.speech.simplify.register.DeviceVoiceCallback");
        voiceModule.setCallback(deviceVoiceCallback2);
    }

    private final void b() {
        AccessCheck accessCheck = (AccessCheck) KoinHelperKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AccessCheck.class), null, null);
        if (accessCheck.isDeviceSupportAlexa() && accessCheck.isLoginCountrySupportAlexa()) {
            SpeechKeeper.INSTANCE.saveSupportAlexaMultilingualLocal(Boolean.valueOf(AlexaLanguageUtilsKt.supportAlexaMultilingualFromDevice()));
        }
    }

    private final void c(Application context, HMBaseDevice device) {
        HMLog.info("speech", h.a);
        try {
            HMLog.info("speech", i.a);
            a(device, context);
        } catch (Exception e2) {
            HMLog.error$default("speech", null, null, new j(e2), 6, null);
        }
    }

    public final void clearSavedSpeechInfo() {
        AlexaLanguageUtilsKt.clearSavedAlexaLanguage();
        SpeechKeeper.INSTANCE.saveSupportAlexaMultilingualLocal(null);
    }

    public final void initSpeech(@NotNull Application context, @NotNull HMDeviceSource deviceSource) {
        Function0 function0;
        HMBaseDevice hMBaseDevice;
        if (deviceSource.getType() == HMDeviceType.WATCH || (function0 = (Function0) KoinHelperKt.getKoin().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(Function0.class), null, null)) == null || (hMBaseDevice = (HMBaseDevice) function0.getA()) == null) {
            return;
        }
        SpeechRegister speechRegister = INSTANCE;
        speechRegister.b();
        speechRegister.c(context, hMBaseDevice);
        HMLog.info("speech", g.a);
    }

    public final void syncAlexaLanguage() {
        if (AlexaLanguageUtilsKt.supportAlexaMultilingualFromDevice()) {
            AlexaLanguageRepo alexaLanguageRepo = (AlexaLanguageRepo) KoinHelperKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AlexaLanguageRepo.class), null, null);
            alexaLanguageRepo.cleanCache();
            kotlinx.coroutines.e.f(GlobalScope.INSTANCE, null, null, new k(alexaLanguageRepo, alexaLanguageRepo.currentAlexaLanguage(), null), 3, null);
        }
    }
}
