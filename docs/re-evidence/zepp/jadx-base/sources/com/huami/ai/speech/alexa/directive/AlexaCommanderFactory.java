package com.huami.ai.speech.alexa.directive;

import com.amap.api.mapcore.util.hl;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.huami.ai.helper.Locales;
import com.huami.ai.helper.VoiceConfigFuncKt;
import com.huami.ai.helper.VoiceConfigGot;
import com.huami.ai.notify.VoiceCaptureNotify;
import com.huami.ai.skill.AlertSkill;
import com.huami.ai.skill.ArticleSkill;
import com.huami.ai.skill.AudioChannel;
import com.huami.ai.skill.AudioPlaySkill;
import com.huami.ai.skill.CaptionChannel;
import com.huami.ai.skill.ListTemplateSkill;
import com.huami.ai.skill.WeatherSkill;
import com.huami.ai.speech.alexa.AlexaWebApi;
import com.huami.ai.speech.alexa.GeoLocation;
import com.huami.ai.speech.alexa.alarm.AlarmRestApi;
import com.huami.ai.speech.alexa.capability.alerts.AlertsCommander;
import com.huami.ai.speech.alexa.capability.alerts.AlertsDirectiveImpl;
import com.huami.ai.speech.alexa.capability.alerts.AlertsEventImpl;
import com.huami.ai.speech.alexa.capability.audioplayer.AudioPlayerCommander;
import com.huami.ai.speech.alexa.capability.audioplayer.AudioPlayerDirectiveImpl;
import com.huami.ai.speech.alexa.capability.recognizer.InitiatorWrapper;
import com.huami.ai.speech.alexa.capability.recognizer.SpeechRecognizerCommander;
import com.huami.ai.speech.alexa.capability.recognizer.SpeechRecognizerDirectiveImpl;
import com.huami.ai.speech.alexa.capability.recognizer.SpeechRecognizerEventImpl;
import com.huami.ai.speech.alexa.capability.synthesizer.SpeechSynthesizerCommander;
import com.huami.ai.speech.alexa.capability.synthesizer.SpeechSynthesizerDirectiveImpl;
import com.huami.ai.speech.alexa.capability.synthesizer.SpeechSynthesizerEvent;
import com.huami.ai.speech.alexa.capability.templateruntime.TemplateRuntimeCommander;
import com.huami.ai.speech.alexa.capability.templateruntime.TemplateRuntimeDirectiveImpl;
import com.huami.ai.speech.alexa.uitls.WebTvvCaptionChannel;
import com.huami.ai.speech.api.Commander;
import com.huami.ai.speech.api.KoinHelperKt;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bK\u0010LJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0002R\u001d\u0010\u000f\u001a\u00020\n8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0014\u001a\u0004\u0018\u00010\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001c\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0011\u0010\u001bR\u001d\u0010!\u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\f\u001a\u0004\b\u001f\u0010 R\u001d\u0010%\u001a\u00020\"8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b#\u0010$R\u001d\u0010*\u001a\u00020&8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\f\u001a\u0004\b(\u0010)R\u001d\u0010-\u001a\u00020+8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\f\u001a\u0004\b'\u0010,R\u001f\u00100\u001a\u0004\u0018\u00010.8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\f\u001a\u0004\b\u001e\u0010/R\u001d\u00105\u001a\u0002018B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\f\u001a\u0004\b3\u00104R\u001d\u00109\u001a\u0002068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\f\u001a\u0004\b2\u00108R\u001d\u0010>\u001a\u00020:8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\f\u001a\u0004\b<\u0010=R\u001d\u0010A\u001a\u00020?8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\f\u001a\u0004\b7\u0010@R\u001d\u0010D\u001a\u00020B8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\f\u001a\u0004\b\u0016\u0010CR\u001d\u0010G\u001a\u00020E8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\f\u001a\u0004\b\u000b\u0010FR\u001d\u0010J\u001a\u00020H8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b;\u0010I¨\u0006M"}, d2 = {"Lcom/huami/ai/speech/alexa/directive/AlexaCommanderFactory;", "Lorg/koin/core/component/KoinComponent;", "", "name", "", DTransferConstants.SEARCH_KEY, "type", "Lcom/huami/ai/speech/api/Commander;", "", "createByType", "Lcom/huami/ai/skill/CaptionChannel;", "a", "Lkotlin/Lazy;", "f", "()Lcom/huami/ai/skill/CaptionChannel;", "captionChannel", "Lcom/huami/ai/skill/AudioChannel;", "b", GoogleApiAvailabilityLight.a, "()Lcom/huami/ai/skill/AudioChannel;", "audioChannel", "Lcom/huami/ai/speech/alexa/AlexaWebApi;", "c", b.r, "()Lcom/huami/ai/speech/alexa/AlexaWebApi;", "webApi", "Lcom/huami/ai/skill/AlertSkill;", "()Lcom/huami/ai/skill/AlertSkill;", "alertSkill", "Lcom/huami/ai/notify/VoiceCaptureNotify;", "e", "m", "()Lcom/huami/ai/notify/VoiceCaptureNotify;", "voiceCaptureNotify", "Lcom/huami/ai/speech/alexa/capability/recognizer/InitiatorWrapper;", "i", "()Lcom/huami/ai/speech/alexa/capability/recognizer/InitiatorWrapper;", "initiatorWrapper", "Lcom/google/gson/Gson;", "g", "h", "()Lcom/google/gson/Gson;", "gson", "Lcom/huami/ai/speech/alexa/GeoLocation;", "()Lcom/huami/ai/speech/alexa/GeoLocation;", "geoLocation", "Lcom/huami/ai/skill/AudioPlaySkill;", "()Lcom/huami/ai/skill/AudioPlaySkill;", "audioPlaySkill", "Lcom/huami/ai/skill/WeatherSkill;", z.j, "o", "()Lcom/huami/ai/skill/WeatherSkill;", "weatherSkill", "Lcom/huami/ai/skill/ListTemplateSkill;", hl.k, "()Lcom/huami/ai/skill/ListTemplateSkill;", "listTemplateSkill", "Lcom/huami/ai/helper/VoiceConfigGot;", "l", GoogleApiAvailabilityLight.b, "()Lcom/huami/ai/helper/VoiceConfigGot;", "voiceConfigGot", "Lcom/huami/ai/helper/Locales;", "()Lcom/huami/ai/helper/Locales;", "locales", "Lcom/huami/ai/skill/ArticleSkill;", "()Lcom/huami/ai/skill/ArticleSkill;", "articleSkill", "Lcom/huami/ai/speech/alexa/alarm/AlarmRestApi;", "()Lcom/huami/ai/speech/alexa/alarm/AlarmRestApi;", "alarmRestApi", "Lcom/huami/ai/speech/alexa/capability/synthesizer/SpeechSynthesizerEvent;", "()Lcom/huami/ai/speech/alexa/capability/synthesizer/SpeechSynthesizerEvent;", "speechSynthesizerEvent", "<init>", "()V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class AlexaCommanderFactory implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy captionChannel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy audioChannel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy webApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy alertSkill;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy voiceCaptureNotify;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy initiatorWrapper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy gson;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy geoLocation;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy audioPlaySkill;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy weatherSkill;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy listTemplateSkill;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy voiceConfigGot;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final Lazy locales;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final Lazy articleSkill;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final Lazy alarmRestApi;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final Lazy speechSynthesizerEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public AlexaCommanderFactory() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.captionChannel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<CaptionChannel>() { // from class: com.huami.ai.speech.alexa.directive.AlexaCommanderFactory$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.skill.CaptionChannel, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CaptionChannel invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(CaptionChannel.class), qualifier, objArr);
            }
        });
        Koin koin = KoinHelperKt.getKoin();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Scope rootScope = koin.getScopeRegistry().getRootScope();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.audioChannel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<AudioChannel>() { // from class: com.huami.ai.speech.alexa.directive.AlexaCommanderFactory$special$$inlined$injectOrNull$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.ai.skill.AudioChannel, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final AudioChannel invoke() {
                return rootScope.getOrNull(Reflection.getOrCreateKotlinClass(AudioChannel.class), objArr2, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.webApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<AlexaWebApi>() { // from class: com.huami.ai.speech.alexa.directive.AlexaCommanderFactory$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.speech.alexa.AlexaWebApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AlexaWebApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(AlexaWebApi.class), objArr4, objArr5);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode4 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.alertSkill = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode4, (Function0) new Function0<AlertSkill>() { // from class: com.huami.ai.speech.alexa.directive.AlexaCommanderFactory$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.skill.AlertSkill, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AlertSkill invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(AlertSkill.class), objArr6, objArr7);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode5 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr8 = 0 == true ? 1 : 0;
        final Object[] objArr9 = 0 == true ? 1 : 0;
        this.voiceCaptureNotify = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode5, (Function0) new Function0<VoiceCaptureNotify>() { // from class: com.huami.ai.speech.alexa.directive.AlexaCommanderFactory$special$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.notify.VoiceCaptureNotify, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final VoiceCaptureNotify invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(VoiceCaptureNotify.class), objArr8, objArr9);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode6 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr10 = 0 == true ? 1 : 0;
        final Object[] objArr11 = 0 == true ? 1 : 0;
        this.initiatorWrapper = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode6, (Function0) new Function0<InitiatorWrapper>() { // from class: com.huami.ai.speech.alexa.directive.AlexaCommanderFactory$special$$inlined$inject$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.speech.alexa.capability.recognizer.InitiatorWrapper, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final InitiatorWrapper invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(InitiatorWrapper.class), objArr10, objArr11);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode7 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr12 = 0 == true ? 1 : 0;
        final Object[] objArr13 = 0 == true ? 1 : 0;
        this.gson = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode7, (Function0) new Function0<Gson>() { // from class: com.huami.ai.speech.alexa.directive.AlexaCommanderFactory$special$$inlined$inject$default$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.google.gson.Gson, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Gson invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(Gson.class), objArr12, objArr13);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode8 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr14 = 0 == true ? 1 : 0;
        final Object[] objArr15 = 0 == true ? 1 : 0;
        this.geoLocation = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode8, (Function0) new Function0<GeoLocation>() { // from class: com.huami.ai.speech.alexa.directive.AlexaCommanderFactory$special$$inlined$inject$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.speech.alexa.GeoLocation, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GeoLocation invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(GeoLocation.class), objArr14, objArr15);
            }
        });
        Koin koin2 = KoinHelperKt.getKoin();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode9 = koinPlatformTools.defaultLazyMode();
        final Scope rootScope2 = koin2.getScopeRegistry().getRootScope();
        final Object[] objArr16 = 0 == true ? 1 : 0;
        final Object[] objArr17 = 0 == true ? 1 : 0;
        this.audioPlaySkill = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode9, (Function0) new Function0<AudioPlaySkill>() { // from class: com.huami.ai.speech.alexa.directive.AlexaCommanderFactory$special$$inlined$injectOrNull$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.ai.skill.AudioPlaySkill, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final AudioPlaySkill invoke() {
                return rootScope2.getOrNull(Reflection.getOrCreateKotlinClass(AudioPlaySkill.class), objArr16, objArr17);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode10 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr18 = 0 == true ? 1 : 0;
        final Object[] objArr19 = 0 == true ? 1 : 0;
        this.weatherSkill = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode10, (Function0) new Function0<WeatherSkill>() { // from class: com.huami.ai.speech.alexa.directive.AlexaCommanderFactory$special$$inlined$inject$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.skill.WeatherSkill, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final WeatherSkill invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(WeatherSkill.class), objArr18, objArr19);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode11 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr20 = 0 == true ? 1 : 0;
        final Object[] objArr21 = 0 == true ? 1 : 0;
        this.listTemplateSkill = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode11, (Function0) new Function0<ListTemplateSkill>() { // from class: com.huami.ai.speech.alexa.directive.AlexaCommanderFactory$special$$inlined$inject$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.skill.ListTemplateSkill, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ListTemplateSkill invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(ListTemplateSkill.class), objArr20, objArr21);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode12 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr22 = 0 == true ? 1 : 0;
        final Object[] objArr23 = 0 == true ? 1 : 0;
        this.voiceConfigGot = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode12, (Function0) new Function0<VoiceConfigGot>() { // from class: com.huami.ai.speech.alexa.directive.AlexaCommanderFactory$special$$inlined$inject$default$10
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.helper.VoiceConfigGot, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final VoiceConfigGot invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(VoiceConfigGot.class), objArr22, objArr23);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode13 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr24 = 0 == true ? 1 : 0;
        final Object[] objArr25 = 0 == true ? 1 : 0;
        this.locales = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode13, (Function0) new Function0<Locales>() { // from class: com.huami.ai.speech.alexa.directive.AlexaCommanderFactory$special$$inlined$inject$default$11
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.helper.Locales, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Locales invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(Locales.class), objArr24, objArr25);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode14 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr26 = 0 == true ? 1 : 0;
        final Object[] objArr27 = 0 == true ? 1 : 0;
        this.articleSkill = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode14, (Function0) new Function0<ArticleSkill>() { // from class: com.huami.ai.speech.alexa.directive.AlexaCommanderFactory$special$$inlined$inject$default$12
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.skill.ArticleSkill, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ArticleSkill invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(ArticleSkill.class), objArr26, objArr27);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode15 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr28 = 0 == true ? 1 : 0;
        final Object[] objArr29 = 0 == true ? 1 : 0;
        this.alarmRestApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode15, (Function0) new Function0<AlarmRestApi>() { // from class: com.huami.ai.speech.alexa.directive.AlexaCommanderFactory$special$$inlined$inject$default$13
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.speech.alexa.alarm.AlarmRestApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AlarmRestApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(AlarmRestApi.class), objArr28, objArr29);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode16 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr30 = 0 == true ? 1 : 0;
        final Object[] objArr31 = 0 == true ? 1 : 0;
        this.speechSynthesizerEvent = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode16, (Function0) new Function0<SpeechSynthesizerEvent>() { // from class: com.huami.ai.speech.alexa.directive.AlexaCommanderFactory$special$$inlined$inject$default$14
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.speech.alexa.capability.synthesizer.SpeechSynthesizerEvent, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SpeechSynthesizerEvent invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(SpeechSynthesizerEvent.class), objArr30, objArr31);
            }
        });
    }

    private final AlarmRestApi a() {
        return (AlarmRestApi) this.alarmRestApi.getValue();
    }

    private final AlertSkill b() {
        return (AlertSkill) this.alertSkill.getValue();
    }

    private final ArticleSkill c() {
        return (ArticleSkill) this.articleSkill.getValue();
    }

    private final AudioChannel d() {
        return (AudioChannel) this.audioChannel.getValue();
    }

    private final AudioPlaySkill e() {
        return (AudioPlaySkill) this.audioPlaySkill.getValue();
    }

    private final CaptionChannel f() {
        return (CaptionChannel) this.captionChannel.getValue();
    }

    private final GeoLocation g() {
        return (GeoLocation) this.geoLocation.getValue();
    }

    private final Gson h() {
        return (Gson) this.gson.getValue();
    }

    private final InitiatorWrapper i() {
        return (InitiatorWrapper) this.initiatorWrapper.getValue();
    }

    private final ListTemplateSkill j() {
        return (ListTemplateSkill) this.listTemplateSkill.getValue();
    }

    private final Locales k() {
        return (Locales) this.locales.getValue();
    }

    private final SpeechSynthesizerEvent l() {
        return (SpeechSynthesizerEvent) this.speechSynthesizerEvent.getValue();
    }

    private final VoiceCaptureNotify m() {
        return (VoiceCaptureNotify) this.voiceCaptureNotify.getValue();
    }

    private final VoiceConfigGot n() {
        return (VoiceConfigGot) this.voiceConfigGot.getValue();
    }

    private final WeatherSkill o() {
        return (WeatherSkill) this.weatherSkill.getValue();
    }

    private final AlexaWebApi p() {
        return (AlexaWebApi) this.webApi.getValue();
    }

    private final Void q(String name) throws UnsupportedCommanderException {
        throw new UnsupportedCommanderException(name);
    }

    @NotNull
    public final Commander<?, Object> createByType(@NotNull String type) throws UnsupportedCommanderException {
        String str = (String) CollectionsKt.first(StringsKt__StringsKt.split$default((CharSequence) type, new String[]{":"}, false, 0, 6, (Object) null));
        if (Intrinsics.areEqual(str, AlexaCommander.SpeechSynthesizer.getNamespace())) {
            return new SpeechSynthesizerCommander(new SpeechSynthesizerDirectiveImpl(new WebTvvCaptionChannel(f()), d(), n().getVoiceConfig(), l()));
        }
        if (Intrinsics.areEqual(str, AlexaCommander.SpeechRecognizer.getNamespace())) {
            return new SpeechRecognizerCommander(new SpeechRecognizerDirectiveImpl(m()), new SpeechRecognizerEventImpl(p(), h(), g()), i());
        }
        if (!VoiceConfigFuncKt.needNLP(n().getVoiceConfig())) {
            q(type);
            throw new KotlinNothingValueException();
        }
        if (Intrinsics.areEqual(str, AlexaCommander.Alerts.getNamespace())) {
            return new AlertsCommander(new AlertsDirectiveImpl(b(), a()), new AlertsEventImpl(p(), h()));
        }
        if (Intrinsics.areEqual(str, AlexaCommander.TemplateRuntime.getNamespace())) {
            return new TemplateRuntimeCommander(new TemplateRuntimeDirectiveImpl(n().getVoiceConfig().getVersion(), new TemplateRuntimeDirectiveImpl.TemplateSkills(o(), j(), f(), c()), k()));
        }
        if (Intrinsics.areEqual(str, AlexaCommander.AudioPlayer.getNamespace())) {
            return new AudioPlayerCommander(new AudioPlayerDirectiveImpl(e()));
        }
        q(type);
        throw new KotlinNothingValueException();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }
}
