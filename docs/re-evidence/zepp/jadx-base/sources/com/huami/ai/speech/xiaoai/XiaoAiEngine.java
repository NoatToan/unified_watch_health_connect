package com.huami.ai.speech.xiaoai;

import android.content.Context;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ai.helper.AudioSaveKt;
import com.huami.ai.helper.DebugMode;
import com.huami.ai.helper.SpeechDevice;
import com.huami.ai.helper.TimeZone;
import com.huami.ai.helper.VoiceConfigFuncKt;
import com.huami.ai.helper.VoiceConfigGot;
import com.huami.ai.skill.AudioChannel;
import com.huami.ai.skill.WeatherSkill;
import com.huami.ai.speech.api.KoinHelperKt;
import com.huami.ai.speech.api.engine.Engine;
import com.huami.ai.speech.api.engine.VoiceCodeType;
import com.huami.ai.speech.xiaoai.auth.OAuthCapabilityImpl;
import com.huami.ai.speech.xiaoai.auth.XiaoMiToken;
import com.huami.ai.speech.xiaoai.capability.ErrorCapabilityImpl;
import com.huami.ai.speech.xiaoai.capability.SpeechSynthesizerCapabilityImpl;
import com.huami.ai.speech.xiaoai.capability.instruction.InstructionCapabilityImpl;
import com.huami.ai.speech.xiaoai.event.RecognizerEventIdKeeper;
import com.huami.ai.speech.xiaoai.interceptor.AddDescriptionWeatherInstructionInterceptorImpl;
import com.huami.ai.speech.xiaoai.interceptor.CombineTTSTextInterceptor;
import com.huami.ai.speech.xiaoai.interceptor.InterceptorChain;
import com.huami.ai.speech.xiaoai.interceptor.PlayInfoTitleLanguageInterceptor;
import com.huami.ai.speech.xiaoai.interceptor.ReminderTitleInterceptor;
import com.huami.ai.speech.xiaoai.interceptor.TemplatePlayInfoInterceptor;
import com.huami.ai.speech.xiaoai.koin.TranslateNotSupportLanguage;
import com.huami.ai.speech.xiaoai.utils.BaseTypeUtilKt;
import com.huami.ai.speech.xiaoai.utils.CheckInstructionKt;
import com.huami.ai.uitls.VoiceConfigExtKt;
import com.huami.ai.unsupport.check.LanguageCheck;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.mediac.Command;
import com.huami.watch.notification.TransportUri;
import com.loc.z;
import com.xiaomi.ai.api.Settings;
import com.xiaomi.ai.api.SpeechRecognizer;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.api.common.Event;
import com.xiaomi.ai.core.AivsConfig;
import com.xiaomi.ai.log.Logger;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.io.File;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010&\u001a\u00020$\u0012\u0006\u0010*\u001a\u00020'\u0012\b\b\u0002\u0010,\u001a\u00020\u0014¢\u0006\u0004\bA\u0010BJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J \u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\b\u0010\u0010\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u000eH\u0002J\b\u0010\u0012\u001a\u00020\u000eH\u0002J+\u0010\u0019\u001a\u00020\u000e2!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u000e0\u0013H\u0016J\b\u0010\u001a\u001a\u00020\u000eH\u0016J \u0010 \u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0016J\b\u0010!\u001a\u00020\u000eH\u0016J\b\u0010\"\u001a\u00020\u000eH\u0016J\b\u0010#\u001a\u00020\u000eH\u0016R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010+R\u0016\u0010-\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010+R\u001f\u00103\u001a\u0004\u0018\u00010.8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001d\u00106\u001a\u0002048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00100\u001a\u0004\b/\u00105R\u001d\u0010:\u001a\u0002078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00100\u001a\u0004\b8\u00109R\u0016\u0010=\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010<R\u0018\u0010@\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010?¨\u0006E²\u0006\u0010\u0010D\u001a\u0004\u0018\u00010C8\n@\nX\u008a\u0084\u0002"}, d2 = {"Lcom/huami/ai/speech/xiaoai/XiaoAiEngine;", "Lcom/huami/ai/speech/api/engine/Engine;", "Lorg/koin/core/component/KoinComponent;", "", "capabilityVersion", "Lcom/xiaomi/ai/api/Settings$ClientInfo;", GoogleApiAvailabilityLight.a, "", "clientId", "clientSecret", "clientOauthRedirectUrl", "Lcom/xiaomi/ai/core/AivsConfig;", "c", "aivsConfig", "", z.j, "h", "i", "a", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "success", TransportUri.ACTION_BLOCK, PointCategory.INIT, "start", "", "byte", "", SessionDescription.p, "offset", "putData", "interrupt", Command.STOP, "destroy", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/ai/speech/xiaoai/ClientParams;", "b", "Lcom/huami/ai/speech/xiaoai/ClientParams;", "clientParams", "Z", "productEnv", "isJarvisDemo", "Lcom/xiaomi/ai/android/core/Engine;", "e", "Lkotlin/Lazy;", "f", "()Lcom/xiaomi/ai/android/core/Engine;", "xiaoAiEngine", "Lcom/huami/ai/helper/TimeZone;", "()Lcom/huami/ai/helper/TimeZone;", "tz", "Lcom/huami/ai/speech/xiaoai/auth/XiaoMiToken;", "g", "()Lcom/huami/ai/speech/xiaoai/auth/XiaoMiToken;", "xiaoMiToken", "Lcom/huami/ai/speech/xiaoai/event/RecognizerEventIdKeeper;", "Lcom/huami/ai/speech/xiaoai/event/RecognizerEventIdKeeper;", "speechStartRequestKeeper", "Ljava/io/File;", "Ljava/io/File;", "audioSaveFile", "<init>", "(Landroid/content/Context;Lcom/huami/ai/speech/xiaoai/ClientParams;Z)V", "Lcom/huami/ai/speech/xiaoai/interceptor/InterceptorChain;", "interceptorChain", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class XiaoAiEngine implements Engine, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ClientParams clientParams;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean productEnv;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isJarvisDemo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy xiaoAiEngine;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy tz;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy xiaoMiToken;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private RecognizerEventIdKeeper speechStartRequestKeeper;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private File audioSaveFile;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VoiceCodeType.values().length];
            iArr[VoiceCodeType.OPUS_32K.ordinal()] = 1;
            iArr[VoiceCodeType.PCM_16K.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/parameter/ParametersHolder;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ParametersHolder> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final ParametersHolder getA() {
            return ParametersHolderKt.parametersOf(VoiceConfigFuncKt.checkAndReturnValidatedConfig(XiaoAiEngine.this.clientParams.getDeviceInfo().getVoiceConfig()));
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
            return " mi ai on evn preview!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("voice type:", XiaoAiEngine.this.clientParams.getDeviceInfo().getVoiceType());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("Recognizer event id:", XiaoAiEngine.this.speechStartRequestKeeper.getStartRequestId());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Boolean bool) {
            super(0);
            this.a = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("xiao ai engine start success :", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/parameter/ParametersHolder;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<ParametersHolder> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final ParametersHolder getA() {
            XiaoAiEngine xiaoAiEngine = XiaoAiEngine.this;
            XiaoAiEngine xiaoAiEngine2 = XiaoAiEngine.this;
            return ParametersHolderKt.parametersOf(XiaoAiEngine.this.context, xiaoAiEngine.c(xiaoAiEngine.clientParams.getClientID(), XiaoAiEngine.this.clientParams.getClientSecret(), XiaoAiEngine.this.clientParams.getClientOauthRedirectUrl()), xiaoAiEngine2.d(xiaoAiEngine2.clientParams.getCapabilityVersion()), Integer.valueOf(XiaoAiEngine.this.clientParams.getAuthType()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public XiaoAiEngine(@NotNull Context context, @NotNull ClientParams clientParams, boolean z) {
        this.context = context;
        this.clientParams = clientParams;
        this.productEnv = z;
        boolean zAreEqual = Intrinsics.areEqual(context.getPackageName(), "com.huami.ai.jarvis");
        this.isJarvisDemo = zAreEqual;
        Koin koin = KoinHelperKt.getKoin();
        final f fVar = new f();
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Scope rootScope = koin.getScopeRegistry().getRootScope();
        final Qualifier qualifier = null;
        this.xiaoAiEngine = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<com.xiaomi.ai.android.core.Engine>() { // from class: com.huami.ai.speech.xiaoai.XiaoAiEngine$special$$inlined$injectOrNull$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.xiaomi.ai.android.core.Engine, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke */
            public final com.xiaomi.ai.android.core.Engine getA() {
                return rootScope.getOrNull(Reflection.getOrCreateKotlinClass(com.xiaomi.ai.android.core.Engine.class), qualifier, fVar);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr = 0 == true ? 1 : 0;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        this.tz = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<TimeZone>() { // from class: com.huami.ai.speech.xiaoai.XiaoAiEngine$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.helper.TimeZone, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final TimeZone getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(TimeZone.class), objArr, objArr2);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr3 = 0 == true ? 1 : 0;
        final Object[] objArr4 = 0 == true ? 1 : 0;
        this.xiaoMiToken = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<XiaoMiToken>() { // from class: com.huami.ai.speech.xiaoai.XiaoAiEngine$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.speech.xiaoai.auth.XiaoMiToken, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final XiaoMiToken getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(XiaoMiToken.class), objArr3, objArr4);
            }
        });
        this.speechStartRequestKeeper = new RecognizerEventIdKeeper("");
        i();
        if (zAreEqual) {
            return;
        }
        a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void a() {
        VoiceConfigExtKt.printString(this.clientParams.getDeviceInfo().getVoiceConfig());
        boolean z = this instanceof KoinScopeComponent;
        final Qualifier qualifier = null;
        Object[] objArr = 0;
        (z ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(VoiceConfigGot.class), null, new a());
        Koin koin = KoinHelperKt.getKoin();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Scope rootScope = koin.getScopeRegistry().getRootScope();
        final Object[] objArr2 = objArr == true ? 1 : 0;
        InterceptorChain interceptorChainB = b(LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<InterceptorChain>() { // from class: com.huami.ai.speech.xiaoai.XiaoAiEngine$addInterceptor$$inlined$injectOrNull$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.ai.speech.xiaoai.interceptor.InterceptorChain, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke */
            public final InterceptorChain getA() {
                return rootScope.getOrNull(Reflection.getOrCreateKotlinClass(InterceptorChain.class), qualifier, objArr2);
            }
        }));
        if (interceptorChainB == null) {
            return;
        }
        interceptorChainB.addInterceptor(new TemplatePlayInfoInterceptor());
        interceptorChainB.addInterceptor(new CombineTTSTextInterceptor(CollectionsKt__CollectionsKt.arrayListOf(CheckInstructionKt.getCheckAlertInstruction(), CheckInstructionKt.getCheckCustomInstruction(), CheckInstructionKt.getCheckAudioPlayInstruction(), CheckInstructionKt.getCheckPlaybackControllerOfUnSupport(), CheckInstructionKt.getCheckSpeakerInstruction(), CheckInstructionKt.getCheckBrightnessControllerInstruction(), CheckInstructionKt.getCheckSetReminderInstruction(), CheckInstructionKt.getCheckWeatherInstruction())));
        interceptorChainB.addInterceptor(new AddDescriptionWeatherInstructionInterceptorImpl((WeatherSkill) (z ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(WeatherSkill.class), null, null)));
        interceptorChainB.addInterceptor(new ReminderTitleInterceptor((SpeechDevice) (z ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(SpeechDevice.class), null, null), 0, 2, null));
        List<Function1<Integer, Boolean>> listUnSupportCheck = ((TranslateNotSupportLanguage) (z ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(TranslateNotSupportLanguage.class), null, null)).unSupportCheck();
        if (listUnSupportCheck == null || listUnSupportCheck.isEmpty()) {
            return;
        }
        interceptorChainB.addInterceptor(new PlayInfoTitleLanguageInterceptor((LanguageCheck) (z ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(LanguageCheck.class), null, null), listUnSupportCheck));
    }

    private static final InterceptorChain b(Lazy<? extends InterceptorChain> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AivsConfig c(String clientId, String clientSecret, String clientOauthRedirectUrl) {
        AivsConfig aivsConfig = new AivsConfig();
        aivsConfig.putString(AivsConfig.Auth.CLIENT_ID, clientId);
        aivsConfig.putString(AivsConfig.Auth.OAuth.REDIRECT_URL, clientOauthRedirectUrl);
        aivsConfig.putString(AivsConfig.Auth.OAuth.CLIENT_SECRET, clientSecret);
        String mItoDID = this.clientParams.getDeviceInfo().getMItoDID();
        aivsConfig.putBoolean(AivsConfig.Auth.OAuth.ENABLE_UPLOAD_MIOT_DID, mItoDID != null && mItoDID.length() > 0);
        aivsConfig.putBoolean(AivsConfig.Auth.SUPPORT_MULTIPLY_CLIENT_ID, true);
        aivsConfig.putInt(AivsConfig.Auth.REQ_TOKEN_MODE, 1);
        aivsConfig.putBoolean(AivsConfig.Asr.ENABLE_NEW_VAD, true);
        j(aivsConfig);
        if (!this.productEnv) {
            aivsConfig.putInt(AivsConfig.ENV, 1);
            HMLog.warn$default("speech", null, b.a, 2, null);
        }
        aivsConfig.putBoolean(AivsConfig.Tts.ENABLE_INTERNAL_PLAYER, this.isJarvisDemo);
        aivsConfig.putBoolean(AivsConfig.Track.ENABLE, false);
        String deviceName = this.clientParams.getDeviceInfo().getDeviceName();
        if (deviceName != null) {
            aivsConfig.putString(AivsConfig.Connection.USER_AGENT, deviceName);
        }
        return aivsConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Settings.ClientInfo d(long capabilityVersion) {
        Settings.ClientInfo clientInfo = new Settings.ClientInfo();
        clientInfo.setTimeZone(e().getTimeZone());
        String deviceID = this.clientParams.getDeviceInfo().getDeviceID();
        if (deviceID != null) {
            clientInfo.setDeviceId(deviceID);
        }
        String mItoDID = this.clientParams.getDeviceInfo().getMItoDID();
        if (mItoDID != null) {
            clientInfo.setMiotDid(mItoDID);
        }
        clientInfo.setCapabilitiesVersion(capabilityVersion);
        Location location = this.clientParams.getLocation();
        if (location != null) {
            clientInfo.setLongitude(location.getLongitude());
            clientInfo.setLatitude(location.getLatitude());
        }
        Integer pid = this.clientParams.getDeviceInfo().getPid();
        if (pid != null) {
            clientInfo.setPid(BaseTypeUtilKt.toHexadecimalString(pid.intValue()));
        }
        Integer vid = this.clientParams.getDeviceInfo().getVid();
        if (vid != null) {
            clientInfo.setVid(BaseTypeUtilKt.toHexadecimalString(vid.intValue()));
        }
        return clientInfo;
    }

    private final TimeZone e() {
        return (TimeZone) this.tz.getValue();
    }

    private final com.xiaomi.ai.android.core.Engine f() {
        return (com.xiaomi.ai.android.core.Engine) this.xiaoAiEngine.getValue();
    }

    private final XiaoMiToken g() {
        return (XiaoMiToken) this.xiaoMiToken.getValue();
    }

    private final void h() {
        if (this.clientParams.getAuthType() != 1) {
            throw new IllegalArgumentException("不支持的授权方式");
        }
        OAuthCapabilityImpl oAuthCapabilityImpl = new OAuthCapabilityImpl(g());
        com.xiaomi.ai.android.core.Engine engineF = f();
        if (engineF == null) {
            return;
        }
        engineF.registerCapability(oAuthCapabilityImpl);
    }

    private final void i() {
        if (DebugMode.INSTANCE.getDebug()) {
            Logger.setLogLevel(3);
        }
    }

    private final void j(AivsConfig aivsConfig) {
        HMLog.info("speech", new c());
        int i = WhenMappings.$EnumSwitchMapping$0[this.clientParams.getDeviceInfo().getVoiceType().ordinal()];
        if (i == 1) {
            aivsConfig.putString(AivsConfig.Asr.CODEC, AivsConfig.Asr.CODEC_OPUS);
            aivsConfig.putInt(AivsConfig.Asr.OPUS_BITRATE, 32000);
        } else {
            if (i != 2) {
                return;
            }
            aivsConfig.putString(AivsConfig.Asr.CODEC, AivsConfig.Asr.CODEC_OPUS);
            aivsConfig.putBoolean(AivsConfig.Asr.ENCODED_BY_CLIENT, false);
        }
    }

    @Override // com.huami.ai.speech.api.engine.Engine
    public void destroy() {
        com.xiaomi.ai.android.core.Engine engineF = f();
        if (engineF == null) {
            return;
        }
        engineF.release();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huami.ai.speech.api.engine.Engine
    public void init(@NotNull Function1<? super Boolean, Unit> block) {
        com.xiaomi.ai.android.core.Engine engineF = f();
        if (engineF != null) {
            h();
            if (VoiceConfigFuncKt.needTTSAudio(this.clientParams.getDeviceInfo().getVoiceConfig())) {
                engineF.registerCapability(new SpeechSynthesizerCapabilityImpl((AudioChannel) (this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(AudioChannel.class), null, null)));
            }
            engineF.registerCapability(new InstructionCapabilityImpl(engineF, this.speechStartRequestKeeper));
            engineF.registerCapability(new ErrorCapabilityImpl());
        }
        com.xiaomi.ai.android.core.Engine engineF2 = f();
        block.invoke(Boolean.valueOf(engineF2 == null ? false : engineF2.start()));
    }

    @Override // com.huami.ai.speech.api.engine.Engine
    public void interrupt() {
        com.xiaomi.ai.android.core.Engine engineF = f();
        if (engineF == null) {
            return;
        }
        engineF.interrupt();
    }

    @Override // com.huami.ai.speech.api.engine.Engine
    public void putData(@NotNull byte[] bArr, int length, int offset) throws Throwable {
        com.xiaomi.ai.android.core.Engine engineF = f();
        if (engineF != null) {
            engineF.postData(bArr, offset, length, false);
        }
        File file = this.audioSaveFile;
        if (file == null) {
            return;
        }
        AudioSaveKt.saveAudio(file, bArr);
    }

    @Override // com.huami.ai.speech.api.engine.Engine
    public void start() {
        Event eventBuildEvent = APIUtils.buildEvent(new SpeechRecognizer.Recognize());
        com.xiaomi.ai.android.core.Engine engineF = f();
        Boolean boolValueOf = engineF == null ? null : Boolean.valueOf(engineF.postEvent(eventBuildEvent));
        this.speechStartRequestKeeper.setStartRequestId(eventBuildEvent.getId());
        HMLog.info("speech", new d());
        HMLog.info("speech", new e(boolValueOf));
        if (DebugMode.INSTANCE.getDebug()) {
            this.audioSaveFile = AudioSaveKt.getMiAiAudioFile(this.context);
        }
    }

    @Override // com.huami.ai.speech.api.engine.Engine
    public void stop() {
        com.xiaomi.ai.android.core.Engine engineF = f();
        if (engineF == null) {
            return;
        }
        engineF.postData(null, 0, 0, true);
    }

    public /* synthetic */ XiaoAiEngine(Context context, ClientParams clientParams, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, clientParams, (i & 4) != 0 ? true : z);
    }
}
