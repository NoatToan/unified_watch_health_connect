package com.huami.ai.speech.simplify.register.state;

import android.app.Application;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.HMLoginManager;
import com.huami.ai.helper.SpeechKeeper;
import com.huami.ai.helper.VoiceConfigFuncKt;
import com.huami.ai.notify.DialogState;
import com.huami.ai.notify.EngineExceptionNotify;
import com.huami.ai.speech.alexa.AlexaEngine;
import com.huami.ai.speech.alexa.GeoLocation;
import com.huami.ai.speech.api.KoinHelperKt;
import com.huami.ai.speech.api.engine.Engine;
import com.huami.ai.speech.api.scpoe.SpeechScope;
import com.huami.ai.speech.simplify.R;
import com.huami.ai.speech.simplify.alexa.language.AlexaLanguageRepo;
import com.huami.ai.speech.simplify.engine.EngineNotOAuth;
import com.huami.ai.speech.simplify.engine.EngineRegionNotSupport;
import com.huami.ai.speech.simplify.engine.SpeechEngineFactoryImpl;
import com.huami.ai.speech.simplify.inject.AccessCheck;
import com.huami.ai.speech.simplify.inject.SwitchConfig;
import com.huami.ai.speech.simplify.inject.module.LoadModuleKt;
import com.huami.ai.speech.simplify.register.DeviceVoiceCallback;
import com.huami.ai.speech.xiaoai.XiaoAiEngine;
import com.huami.ai.speech.xiaoai.guide.GuideEntity;
import com.huami.ai.speech.xiaoai.guide.SpeakGuideKt;
import com.huami.ai.uitls.DeviceUtilsKt;
import com.huami.bluetooth.profile.channel.module.voice.VoiceConfig;
import com.huami.bluetooth.profile.channel.module.voice.command.ErrorCommand;
import com.huami.bluetooth.profile.channel.module.voice.command.ReadyCommand;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelicateCoroutinesApi;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 42\u00020\u00012\u00020\u0002:\u00014B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b2\u00103J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u0005H\u0002J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\n\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0002J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001f\u0010\u001e\u001a\u0004\u0018\u00010\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\"\u001a\u0004\u0018\u00010\u001f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b \u0010!R\u001f\u0010&\u001a\u0004\u0018\u00010#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b\f\u0010%R\u001f\u0010*\u001a\u0004\u0018\u00010'8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b(\u0010)R\u001d\u0010.\u001a\u00020+8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b,\u0010-R\u001d\u00101\u001a\u00020/8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u001b\u001a\u0004\b\u0017\u00100¨\u00068²\u0006\u0016\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u000106058\n@\nX\u008a\u0084\u0002"}, d2 = {"Lcom/huami/ai/speech/simplify/register/state/IdleState;", "Lcom/huami/ai/speech/simplify/register/state/SpeechState;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "config", "", "l", GoogleApiAvailabilityLight.b, "", "", "h", "Ljava/lang/Exception;", "e", hl.k, "m", "b", "c", "startSession", "", "byteArray", "onAudioData", "onStopSession", "Lcom/huami/ai/speech/simplify/register/DeviceVoiceCallback;", "a", "Lcom/huami/ai/speech/simplify/register/DeviceVoiceCallback;", "voiceCallback", "Lcom/huami/ai/speech/api/scpoe/SpeechScope;", "Lkotlin/Lazy;", "i", "()Lcom/huami/ai/speech/api/scpoe/SpeechScope;", "speechScope", "Lcom/huami/ai/notify/EngineExceptionNotify;", "f", "()Lcom/huami/ai/notify/EngineExceptionNotify;", "engineExceptionNotify", "Lcom/huami/ai/notify/DialogState;", GoogleApiAvailabilityLight.a, "()Lcom/huami/ai/notify/DialogState;", "dialogState", "Lcom/huami/ai/speech/simplify/inject/SwitchConfig;", z.j, "()Lcom/huami/ai/speech/simplify/inject/SwitchConfig;", "switchConfig", "Lcom/huami/ai/speech/alexa/GeoLocation;", "g", "()Lcom/huami/ai/speech/alexa/GeoLocation;", "geoLocation", "Lcom/huami/ai/speech/simplify/inject/AccessCheck;", "()Lcom/huami/ai/speech/simplify/inject/AccessCheck;", "accessCheck", "<init>", "(Lcom/huami/ai/speech/simplify/register/DeviceVoiceCallback;)V", "Companion", "Lkotlin/Function0;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "deviceFun", "speech-simplify_release"}, k = 1, mv = {1, 5, 1})
@DelicateCoroutinesApi
public final class IdleState implements SpeechState, KoinComponent {

    @NotNull
    private static final String h = "como";

    @NotNull
    private static final String i = "ness";
    private static final int j = 10;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final DeviceVoiceCallback voiceCallback;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy speechScope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy engineExceptionNotify;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy dialogState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy switchConfig;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy geoLocation;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy accessCheck;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            iArr[HMDeviceSource.MILI_COMO_L.ordinal()] = 1;
            iArr[HMDeviceSource.MILI_COMO.ordinal()] = 2;
            iArr[HMDeviceSource.MILI_NESS_L.ordinal()] = 3;
            iArr[HMDeviceSource.MILI_NESS.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("发送地区不支持的错误的指令:", Boolean.valueOf(this.a));
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
        public final String invoke() {
            return "发送了网络错误的指令：" + this.a + ",因为捕获到了IOException";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("engine init error:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.simplify.register.state.IdleState$initEngine$1", f = "IdleState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ VoiceConfig c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Boolean, Unit> {
            public final /* synthetic */ IdleState a;
            public final /* synthetic */ VoiceConfig b;

            /* JADX INFO: renamed from: com.huami.ai.speech.simplify.register.state.IdleState$d$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0280a extends Lambda implements Function0<String> {
                public static final C0280a a = new C0280a();

                public C0280a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "Send session ready";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(IdleState idleState, VoiceConfig voiceConfig) {
                super(1);
                this.a = idleState;
                this.b = voiceConfig;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                List listH;
                if (z) {
                    this.a.voiceCallback.setState(new InitState(this.a.voiceCallback));
                    DialogState dialogStateE = this.a.e();
                    if (dialogStateE != null) {
                        dialogStateE.set(0);
                    }
                    Engine engine = this.a.voiceCallback.getEngine();
                    if (!(engine instanceof AlexaEngine)) {
                        if (engine instanceof XiaoAiEngine) {
                            listH = this.a.h(this.b);
                        }
                        DeviceUtilsKt.sendCommand$default(this.a.voiceCallback.getBaseDevice(), new ReadyCommand(listH), null, 2, null);
                        HMLog.info("speech", C0280a.a);
                    }
                    this.a.n(this.b);
                    listH = null;
                    DeviceUtilsKt.sendCommand$default(this.a.voiceCallback.getBaseDevice(), new ReadyCommand(listH), null, 2, null);
                    HMLog.info("speech", C0280a.a);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(VoiceConfig voiceConfig, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = voiceConfig;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return IdleState.this.new d(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Boolean boolBoxBoolean;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                DeviceVoiceCallback deviceVoiceCallback = IdleState.this.voiceCallback;
                Application context = IdleState.this.voiceCallback.getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String();
                VoiceConfig voiceConfig = this.c;
                GeoLocation geoLocationG = IdleState.this.g();
                SwitchConfig switchConfigJ = IdleState.this.j();
                boolean zBooleanValue = true;
                if (switchConfigJ != null && (boolBoxBoolean = Boxing.boxBoolean(switchConfigJ.getProductEnv())) != null) {
                    zBooleanValue = boolBoxBoolean.booleanValue();
                }
                deviceVoiceCallback.setEngine(new SpeechEngineFactoryImpl(context, voiceConfig, geoLocationG, zBooleanValue, IdleState.this.a()).speechEngine(IdleState.this.voiceCallback.getFeature(), IdleState.this.c()));
                Engine engine = IdleState.this.voiceCallback.getEngine();
                if (engine != null) {
                    engine.init(new a(IdleState.this, this.c));
                }
            } catch (Exception e) {
                IdleState.this.k(e);
            }
            return Unit.INSTANCE;
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
            return "Idle state, onAudioData";
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
        public final String invoke() {
            return "Idle state, Do nothing!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.simplify.register.state.IdleState$requestMiAiGuide$1", f = "IdleState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Throwable th) {
                super(0);
                this.a = th;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return Intrinsics.stringPlus("speech guide request fail.", this.a);
            }
        }

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return IdleState.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM3845constructorimpl;
            Scope rootScope;
            KClass<?> orCreateKotlinClass;
            Unit unit;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            IdleState idleState = IdleState.this;
            try {
                Result.Companion companion = Result.Companion;
                if (idleState instanceof KoinScopeComponent) {
                    rootScope = ((KoinScopeComponent) idleState).getScope();
                    orCreateKotlinClass = Reflection.getOrCreateKotlinClass(com.xiaomi.ai.android.core.Engine.class);
                } else {
                    rootScope = idleState.getKoin().getScopeRegistry().getRootScope();
                    orCreateKotlinClass = Reflection.getOrCreateKotlinClass(com.xiaomi.ai.android.core.Engine.class);
                }
                List speakGuide$default = SpeakGuideKt.getSpeakGuide$default((com.xiaomi.ai.android.core.Engine) rootScope.get(orCreateKotlinClass, null, null), idleState.voiceCallback.getBaseDevice().getMDeviceSource().name(), idleState.voiceCallback.getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String(), Long.toString(HMLoginManager.getValidUid(), kotlin.text.a.checkRadix(10)), idleState.voiceCallback.getBaseDevice().getDeviceInfo().getSerialNumber(), false, 16, null);
                if (speakGuide$default == null) {
                    unit = null;
                } else {
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(speakGuide$default, 10));
                    Iterator it2 = speakGuide$default.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((GuideEntity) it2.next()).getQuery());
                    }
                    SpeechKeeper.INSTANCE.saveGuide(arrayList);
                    unit = Unit.INSTANCE;
                }
                objM3845constructorimpl = Result.m3845constructorimpl(unit);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.warn$default(null, null, new a(thM3848exceptionOrNullimpl), 3, null);
            }
            return Unit.INSTANCE;
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
        public final String invoke() {
            return "Start Session Config中没有读取到Alexa语言";
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
        public final String invoke() {
            return "Start Session Config中读取到了Alexa语言，并且读取到的语言和当前缓存的语言不同，更新缓存并存储到本地。";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IdleState(@NotNull DeviceVoiceCallback deviceVoiceCallback) {
        this.voiceCallback = deviceVoiceCallback;
        Koin koin = KoinHelperKt.getKoin();
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Scope rootScope = koin.getScopeRegistry().getRootScope();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.speechScope = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<SpeechScope>() { // from class: com.huami.ai.speech.simplify.register.state.IdleState$special$$inlined$injectOrNull$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.ai.speech.api.scpoe.SpeechScope, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final SpeechScope invoke() {
                return rootScope.getOrNull(Reflection.getOrCreateKotlinClass(SpeechScope.class), qualifier, objArr);
            }
        });
        Koin koin2 = KoinHelperKt.getKoin();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Scope rootScope2 = koin2.getScopeRegistry().getRootScope();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.engineExceptionNotify = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<EngineExceptionNotify>() { // from class: com.huami.ai.speech.simplify.register.state.IdleState$special$$inlined$injectOrNull$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.ai.notify.EngineExceptionNotify, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final EngineExceptionNotify invoke() {
                return rootScope2.getOrNull(Reflection.getOrCreateKotlinClass(EngineExceptionNotify.class), objArr2, objArr3);
            }
        });
        Koin koin3 = KoinHelperKt.getKoin();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Scope rootScope3 = koin3.getScopeRegistry().getRootScope();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.dialogState = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<DialogState>() { // from class: com.huami.ai.speech.simplify.register.state.IdleState$special$$inlined$injectOrNull$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.ai.notify.DialogState, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final DialogState invoke() {
                return rootScope3.getOrNull(Reflection.getOrCreateKotlinClass(DialogState.class), objArr4, objArr5);
            }
        });
        Koin koin4 = KoinHelperKt.getKoin();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode4 = koinPlatformTools.defaultLazyMode();
        final Scope rootScope4 = koin4.getScopeRegistry().getRootScope();
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.switchConfig = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode4, (Function0) new Function0<SwitchConfig>() { // from class: com.huami.ai.speech.simplify.register.state.IdleState$special$$inlined$injectOrNull$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.ai.speech.simplify.inject.SwitchConfig, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final SwitchConfig invoke() {
                return rootScope4.getOrNull(Reflection.getOrCreateKotlinClass(SwitchConfig.class), objArr6, objArr7);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode5 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr8 = 0 == true ? 1 : 0;
        final Object[] objArr9 = 0 == true ? 1 : 0;
        this.geoLocation = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode5, (Function0) new Function0<GeoLocation>() { // from class: com.huami.ai.speech.simplify.register.state.IdleState$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.speech.alexa.GeoLocation, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GeoLocation invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(GeoLocation.class), objArr8, objArr9);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode6 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr10 = 0 == true ? 1 : 0;
        final Object[] objArr11 = 0 == true ? 1 : 0;
        this.accessCheck = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode6, (Function0) new Function0<AccessCheck>() { // from class: com.huami.ai.speech.simplify.register.state.IdleState$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.speech.simplify.inject.AccessCheck, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AccessCheck invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(AccessCheck.class), objArr10, objArr11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccessCheck a() {
        return (AccessCheck) this.accessCheck.getValue();
    }

    private final List<String> b() {
        return ArraysKt___ArraysJvmKt.asList(this.voiceCallback.getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String().getResources().getStringArray(R.array.mi_ai_guide));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final String c() {
        Koin koin = KoinHelperKt.getKoin();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Scope rootScope = koin.getScopeRegistry().getRootScope();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        HMBaseDevice hMBaseDeviceInvoke = d(LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<Function0<? extends HMBaseDevice>>() { // from class: com.huami.ai.speech.simplify.register.state.IdleState$getDeviceName$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.jvm.functions.Function0<? extends com.xiaomi.hm.health.bt.device.HMBaseDevice>] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Function0<? extends HMBaseDevice> invoke() {
                return rootScope.get(Reflection.getOrCreateKotlinClass(Function0.class), qualifier, objArr);
            }
        })).invoke();
        HMDeviceSource mDeviceSource = hMBaseDeviceInvoke == null ? null : hMBaseDeviceInvoke.getMDeviceSource();
        if (mDeviceSource == null) {
            return null;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[mDeviceSource.ordinal()];
        if (i2 == 1 || i2 == 2) {
            return h;
        }
        if (i2 == 3 || i2 == 4) {
            return i;
        }
        return null;
    }

    private static final Function0<HMBaseDevice> d(Lazy<? extends Function0<? extends HMBaseDevice>> lazy) {
        return (Function0) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialogState e() {
        return (DialogState) this.dialogState.getValue();
    }

    private final EngineExceptionNotify f() {
        return (EngineExceptionNotify) this.engineExceptionNotify.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GeoLocation g() {
        return (GeoLocation) this.geoLocation.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<String> h(VoiceConfig config) {
        if (!VoiceConfigFuncKt.needGuide(config)) {
            return null;
        }
        m();
        List<String> listSpeechGuide = SpeechKeeper.INSTANCE.speechGuide();
        return listSpeechGuide == null ? b() : listSpeechGuide;
    }

    private final SpeechScope i() {
        return (SpeechScope) this.speechScope.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SwitchConfig j() {
        return (SwitchConfig) this.switchConfig.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(Exception e2) {
        if (e2 instanceof EngineRegionNotSupport) {
            HMLog.info("speech", new a(DeviceUtilsKt.sendCommand$default(this.voiceCallback.getBaseDevice(), new ErrorCommand(10, ""), null, 2, null)));
            return;
        }
        if (e2 instanceof EngineNotOAuth) {
            EngineExceptionNotify engineExceptionNotifyF = f();
            if (engineExceptionNotifyF == null) {
                return;
            }
            engineExceptionNotifyF.engineException(18);
            return;
        }
        if (e2 instanceof IOException) {
            HMLog.info("speech", new b(DeviceUtilsKt.sendCommand$default(this.voiceCallback.getBaseDevice(), new ErrorCommand(4, ""), null, 2, null)));
        } else {
            HMLog.warn$default("speech", null, new c(e2), 2, null);
        }
    }

    private final void l(VoiceConfig config) {
        SpeechScope speechScopeI = i();
        if (speechScopeI == null) {
            return;
        }
        kotlinx.coroutines.e.f(speechScopeI, null, null, new d(config, null), 3, null);
    }

    private final void m() {
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, null, null, new g(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void n(VoiceConfig config) {
        String strAlexaLanguage = VoiceConfigFuncKt.alexaLanguage(config);
        if (strAlexaLanguage == null || strAlexaLanguage.length() == 0) {
            HMLog.info("speech", h.a);
            return;
        }
        AlexaLanguageRepo alexaLanguageRepo = (AlexaLanguageRepo) (this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(AlexaLanguageRepo.class), null, null);
        if (Intrinsics.areEqual(alexaLanguageRepo.currentAlexaLanguage(), strAlexaLanguage)) {
            return;
        }
        alexaLanguageRepo.updateLanguageCache(strAlexaLanguage);
        HMLog.info("speech", i.a);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.ai.speech.simplify.register.state.SpeechState
    public void onAudioData(@NotNull byte[] byteArray) {
        HMLog.info("speech", e.a);
    }

    @Override // com.huami.ai.speech.simplify.register.state.SpeechState
    public void onStopSession() {
        HMLog.info("speech", f.a);
    }

    @Override // com.huami.ai.speech.simplify.register.state.SpeechState
    public void startSession(@NotNull VoiceConfig config) {
        LoadModuleKt.loadModule(this.voiceCallback.getFeature());
        DialogState dialogStateE = e();
        if (dialogStateE != null) {
            dialogStateE.addObserver(this.voiceCallback.getDialogStateObserver());
        }
        l(config);
        DeviceVoiceCallback deviceVoiceCallback = this.voiceCallback;
        deviceVoiceCallback.setState(new StartingState(deviceVoiceCallback));
    }
}
