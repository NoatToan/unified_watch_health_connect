package com.huami.ai.speech.alexa;

import android.content.Context;
import com.amap.api.mapcore.util.hl;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.huami.ai.helper.AudioSaveKt;
import com.huami.ai.helper.DebugMode;
import com.huami.ai.helper.Locales;
import com.huami.ai.helper.SpeechDevice;
import com.huami.ai.helper.TimeZone;
import com.huami.ai.helper.VoiceConfigFuncKt;
import com.huami.ai.helper.VoiceConfigGot;
import com.huami.ai.notify.DialogState;
import com.huami.ai.notify.EngineExceptionNotify;
import com.huami.ai.notify.VADSendState;
import com.huami.ai.speech.alexa.capability.recognizer.InitiatorWrapper;
import com.huami.ai.speech.alexa.capability.recognizer.SpeechRecognizerEvent;
import com.huami.ai.speech.alexa.capability.recognizer.SpeechRecognizerEventImpl;
import com.huami.ai.speech.alexa.capability.system.SystemEventImpl;
import com.huami.ai.speech.alexa.entity.payload.LocalesPayload;
import com.huami.ai.speech.alexa.entity.payload.RecognizePayload;
import com.huami.ai.speech.alexa.entity.payload.SoftwareInfoPayload;
import com.huami.ai.speech.alexa.entity.payload.TimeZonePayload;
import com.huami.ai.speech.alexa.filter.FilterChain;
import com.huami.ai.speech.alexa.filter.MultiTtsMergeFilter;
import com.huami.ai.speech.alexa.filter.ReduplicatedSetAlertFilter;
import com.huami.ai.speech.alexa.filter.TTSAudioFilter;
import com.huami.ai.speech.alexa.filter.UnSupportDirectFilter;
import com.huami.ai.speech.alexa.http.AlexaToken;
import com.huami.ai.speech.alexa.http.PipeBody;
import com.huami.ai.speech.alexa.uitls.FilterConfigKt;
import com.huami.ai.speech.api.CommandCenter;
import com.huami.ai.speech.api.KoinHelperKt;
import com.huami.ai.speech.api.engine.Engine;
import com.huami.ai.speech.api.engine.VoiceCodeType;
import com.huami.ai.speech.api.scpoe.SpeechScope;
import com.huami.ai.uitls.VoiceConfigExtKt;
import com.huami.bluetooth.profile.channel.module.voice.VoiceConfig;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.mediac.Command;
import com.huami.watch.notification.TransportUri;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.xmlywind.sdk.common.mta.PointCategory;
import it.sauronsoftware.ftp4j.FTPCodes;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import okhttp3.Response;
import org.cybergarage.soap.SOAP;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\b\u0002\u0010'\u001a\u00020%\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b{\u0010|J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0002J\u0013\u0010\t\u001a\u00020\bH\u0082Pø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0003H\u0002J\b\u0010\f\u001a\u00020\u0003H\u0002J\b\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J+\u0010\u001a\u001a\u00020\u00032!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00030\u0016H\u0016J\b\u0010\u001b\u001a\u00020\u0003H\u0016J \u0010!\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0016J\b\u0010\"\u001a\u00020\u0003H\u0016J\b\u0010#\u001a\u00020\u0003H\u0016J\b\u0010$\u001a\u00020\u0003H\u0016R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010&R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u001f\u0010-\u001a\u0004\u0018\u00010)8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b+\u0010,R\u001d\u00102\u001a\u00020.8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u00101R\u001d\u00107\u001a\u0002038B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b5\u00106R\u001d\u0010<\u001a\u0002088B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010*\u001a\u0004\b:\u0010;R\u001d\u0010A\u001a\u00020=8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010*\u001a\u0004\b?\u0010@R\u001d\u0010E\u001a\u00020B8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010*\u001a\u0004\bC\u0010DR\u001d\u0010I\u001a\u00020F8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010*\u001a\u0004\b>\u0010HR\u001d\u0010M\u001a\u00020J8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010*\u001a\u0004\bK\u0010LR\u001d\u0010R\u001a\u00020N8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010*\u001a\u0004\bP\u0010QR\u001f\u0010V\u001a\u0004\u0018\u00010S8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010*\u001a\u0004\bG\u0010UR\u001d\u0010Y\u001a\u00020W8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010*\u001a\u0004\bT\u0010XR\u0016\u0010\\\u001a\u00020Z8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bP\u0010[R\u001d\u0010_\u001a\u00020]8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010*\u001a\u0004\b9\u0010^R\u001d\u0010c\u001a\u00020`8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010*\u001a\u0004\ba\u0010bR\u001e\u0010f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010eR\u001d\u0010i\u001a\u00020g8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010*\u001a\u0004\bO\u0010hR\u001d\u0010l\u001a\u00020j8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010*\u001a\u0004\b4\u0010kR\u001d\u0010o\u001a\u00020m8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010*\u001a\u0004\b/\u0010nR\u0016\u0010r\u001a\u00020p8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010qR\u0016\u0010s\u001a\u00020p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010qR\u0016\u0010v\u001a\u00020t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010uR\u0016\u0010w\u001a\u00020p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010qR\u0018\u0010z\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010y\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006}"}, d2 = {"Lcom/huami/ai/speech/alexa/AlexaEngine;", "Lcom/huami/ai/speech/api/engine/Engine;", "Lorg/koin/core/component/KoinComponent;", "", "u", "Lkotlin/Function0;", TransportUri.ACTION_BLOCK, "b", "", "v", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "y", "w", "x", "", "throwable", "c", "", SOAP.XMLNS, "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "voiceConfig", "a", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "success", PointCategory.INIT, "start", "", "byte", "", SessionDescription.p, "offset", "putData", "interrupt", Command.STOP, "destroy", "Lcom/huami/ai/speech/api/engine/VoiceCodeType;", "Lcom/huami/ai/speech/api/engine/VoiceCodeType;", "voiceCodeType", "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "Lcom/huami/ai/speech/api/scpoe/SpeechScope;", "Lkotlin/Lazy;", com.google.android.exoplayer2.text.ttml.b.r, "()Lcom/huami/ai/speech/api/scpoe/SpeechScope;", "speechScope", "Lcom/huami/ai/speech/alexa/DataDistributor;", GoogleApiAvailabilityLight.a, "h", "()Lcom/huami/ai/speech/alexa/DataDistributor;", "distributor", "Lcom/huami/ai/speech/alexa/AlexaWebApi;", "e", "t", "()Lcom/huami/ai/speech/alexa/AlexaWebApi;", "webApi", "Lcom/huami/ai/speech/alexa/capability/recognizer/InitiatorWrapper;", "f", "m", "()Lcom/huami/ai/speech/alexa/capability/recognizer/InitiatorWrapper;", "initiatorWrapper", "Lcom/huami/ai/speech/alexa/capability/recognizer/SpeechRecognizerEvent;", "g", "o", "()Lcom/huami/ai/speech/alexa/capability/recognizer/SpeechRecognizerEvent;", "speech", "Lcom/huami/ai/notify/EngineExceptionNotify;", z.j, "()Lcom/huami/ai/notify/EngineExceptionNotify;", "engineExceptionNotify", "Lcom/huami/ai/notify/DialogState;", "i", "()Lcom/huami/ai/notify/DialogState;", "dialogState", "Lcom/huami/ai/helper/TimeZone;", DTransferConstants.SEARCH_KEY, "()Lcom/huami/ai/helper/TimeZone;", "timeZone", "Lcom/huami/ai/helper/Locales;", hl.k, GoogleApiAvailabilityLight.b, "()Lcom/huami/ai/helper/Locales;", "locales", "Lcom/huami/ai/speech/alexa/DownChannelApi;", "l", "()Lcom/huami/ai/speech/alexa/DownChannelApi;", "downChanel", "Lcom/google/gson/Gson;", "()Lcom/google/gson/Gson;", "gson", "Lcom/huami/ai/speech/alexa/http/PipeBody;", "Lcom/huami/ai/speech/alexa/http/PipeBody;", "pipeBody", "Landroid/content/Context;", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/ai/speech/alexa/http/AlexaToken;", "r", "()Lcom/huami/ai/speech/alexa/http/AlexaToken;", "tokenApi", "", "[Ljava/lang/String;", "lastLocal", "Lcom/huami/ai/speech/alexa/filter/FilterChain;", "()Lcom/huami/ai/speech/alexa/filter/FilterChain;", "filterChain", "Lcom/huami/ai/helper/VoiceConfigGot;", "()Lcom/huami/ai/helper/VoiceConfigGot;", "configGot", "Lcom/huami/ai/helper/SpeechDevice;", "()Lcom/huami/ai/helper/SpeechDevice;", "baseDevice", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInit", "isSpeechRecognizer", "", "J", "retryLatency", "isDestroyMethodCall", "Ljava/io/File;", "Ljava/io/File;", "audioSaveFile", "<init>", "(Lcom/huami/ai/speech/api/engine/VoiceCodeType;Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class AlexaEngine implements Engine, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final VoiceCodeType voiceCodeType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final VoiceConfig voiceConfig;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy speechScope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy distributor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy webApi;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy initiatorWrapper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy speech;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy engineExceptionNotify;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy dialogState;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy timeZone;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy locales;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy downChanel;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final Lazy gson;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private PipeBody pipeBody;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final Lazy context;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final Lazy tokenApi;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    private String[] lastLocal;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final Lazy filterChain;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final Lazy configGot;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private final Lazy baseDevice;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private final AtomicBoolean isInit;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private AtomicBoolean isSpeechRecognizer;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private long retryLatency;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private AtomicBoolean isDestroyMethodCall;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    private File audioSaveFile;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VoiceCodeType.values().length];
            iArr[VoiceCodeType.PCM_16K.ordinal()] = 1;
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
            return ParametersHolderKt.parametersOf(VoiceConfigFuncKt.checkAndReturnValidatedConfig(AlexaEngine.this.voiceConfig));
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
            return "Alexa engine destroy";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/ai/speech/alexa/DistributorImpl;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<DistributorImpl> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DistributorImpl getA() {
            KoinComponent koinComponent = AlexaEngine.this;
            CommandCenter commandCenter = (CommandCenter) (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(CommandCenter.class), null, null);
            KoinComponent koinComponent2 = AlexaEngine.this;
            FilterChain filterChain = (FilterChain) (koinComponent2 instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent2).getScope() : koinComponent2.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(FilterChain.class), null, null);
            KoinComponent koinComponent3 = AlexaEngine.this;
            DialogState dialogState = (DialogState) (koinComponent3 instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent3).getScope() : koinComponent3.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DialogState.class), null, null);
            KoinComponent koinComponent4 = AlexaEngine.this;
            return new DistributorImpl(commandCenter, filterChain, dialogState, (VADSendState) (koinComponent4 instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent4).getScope() : koinComponent4.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(VADSendState.class), null, null), AlexaEngine.this.voiceConfig.getVersion());
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
            return "Alexa Engine init false";
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
            return "Down Channel normal closed!";
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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("flow inner exception:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.alexa.AlexaEngine$init$1", f = "AlexaEngine.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            g gVar = AlexaEngine.this.new g(continuation);
            gVar.b = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AlexaEngine alexaEngine = AlexaEngine.this;
                    Result.Companion companion = Result.Companion;
                    this.a = 1;
                    obj = alexaEngine.v(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Result.m3845constructorimpl(Boxing.boxBoolean(((Boolean) obj).booleanValue()));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<Unit> {
        public final /* synthetic */ byte[] b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(byte[] bArr) {
            super(0);
            this.b = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AlexaEngine alexaEngine = AlexaEngine.this;
            byte[] bArr = this.b;
            try {
                Result.Companion companion = Result.Companion;
                PipeBody pipeBody = alexaEngine.pipeBody;
                Unit unit = null;
                if (pipeBody == null) {
                    throw null;
                }
                pipeBody.sink().write(bArr);
                File file = alexaEngine.audioSaveFile;
                if (file != null) {
                    AudioSaveKt.saveAudio(file, bArr);
                    unit = Unit.INSTANCE;
                }
                Result.m3845constructorimpl(unit);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/ai/speech/alexa/capability/recognizer/SpeechRecognizerEventImpl;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<SpeechRecognizerEventImpl> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SpeechRecognizerEventImpl getA() {
            AlexaWebApi alexaWebApiT = AlexaEngine.this.t();
            KoinComponent koinComponent = AlexaEngine.this;
            Gson gson = (Gson) (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(Gson.class), null, null);
            KoinComponent koinComponent2 = AlexaEngine.this;
            return new SpeechRecognizerEventImpl(alexaWebApiT, gson, (GeoLocation) (koinComponent2 instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent2).getScope() : koinComponent2.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(GeoLocation.class), null, null));
        }
    }

    /* JADX INFO: renamed from: com.huami.ai.speech.alexa.AlexaEngine$init$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.alexa.AlexaEngine$init$2", f = "AlexaEngine.kt", i = {}, l = {355}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ Function1<Boolean, Unit> d;

        /* JADX INFO: renamed from: com.huami.ai.speech.alexa.AlexaEngine$init$2$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/ai/speech/alexa/MultipartResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.ai.speech.alexa.AlexaEngine$init$2$1$1", f = "AlexaEngine.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<FlowCollector<? super MultipartResponse>, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ AlexaEngine b;
            public final /* synthetic */ Function1<Boolean, Unit> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(AlexaEngine alexaEngine, Function1<? super Boolean, Unit> function1, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = alexaEngine;
                this.c = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull FlowCollector<? super MultipartResponse> flowCollector, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.b.isDestroyMethodCall.get()) {
                    DownChannelApi downChannelApiI = this.b.i();
                    if (downChannelApiI != null) {
                        downChannelApiI.close();
                    }
                    return Unit.INSTANCE;
                }
                this.b.isInit.set(true);
                this.b.y();
                this.b.x();
                this.c.invoke(Boxing.boxBoolean(true));
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.huami.ai.speech.alexa.AlexaEngine$init$2$b */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/ai/speech/alexa/MultipartResponse;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.ai.speech.alexa.AlexaEngine$init$2$1$2", f = "AlexaEngine.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function3<FlowCollector<? super MultipartResponse>, Throwable, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ AlexaEngine c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(AlexaEngine alexaEngine, Continuation<? super b> continuation) {
                super(3, continuation);
                this.c = alexaEngine;
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull FlowCollector<? super MultipartResponse> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
                b bVar = new b(this.c, continuation);
                bVar.b = th;
                return bVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.c.c((Throwable) this.b);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.huami.ai.speech.alexa.AlexaEngine$init$2$c */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public final /* synthetic */ Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Throwable th) {
                super(0);
                this.a = th;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return String.valueOf(this.a);
            }
        }

        /* JADX INFO: renamed from: com.huami.ai.speech.alexa.AlexaEngine$init$2$d */
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
                return "down channel close by self";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function1<? super Boolean, Unit> function1, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = AlexaEngine.this.new AnonymousClass2(this.d, continuation);
            anonymousClass2.b = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0075  */
        /* JADX WARN: Code duplicated, block: B:34:0x008d  */
        /* JADX WARN: Code duplicated, block: B:36:0x0097  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM3845constructorimpl;
            AlexaEngine alexaEngine;
            Function1<Boolean, Unit> function1;
            Throwable thM3848exceptionOrNullimpl;
            Flow<MultipartResponse> flowEstablish;
            Flow flowOnStart;
            Flow flowM4456catch;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            Unit unit = null;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final AlexaEngine alexaEngine2 = AlexaEngine.this;
                    Function1<Boolean, Unit> function2 = this.d;
                    Result.Companion companion = Result.Companion;
                    DownChannelApi downChannelApiI = alexaEngine2.i();
                    if (downChannelApiI != null && (flowEstablish = downChannelApiI.establish()) != null && (flowOnStart = FlowKt.onStart(flowEstablish, new a(alexaEngine2, function2, null))) != null && (flowM4456catch = FlowKt.m4456catch(flowOnStart, new b(alexaEngine2, null))) != null) {
                        FlowCollector<MultipartResponse> flowCollector = new FlowCollector<MultipartResponse>() { // from class: com.huami.ai.speech.alexa.AlexaEngine$init$2$invokeSuspend$lambda-1$$inlined$collect$1
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            @Nullable
                            public Object emit(MultipartResponse multipartResponse, @NotNull Continuation<? super Unit> continuation) {
                                Object objDeliver = alexaEngine2.h().deliver(multipartResponse, continuation);
                                return objDeliver == a.getCOROUTINE_SUSPENDED() ? objDeliver : Unit.INSTANCE;
                            }
                        };
                        this.a = 1;
                        if (flowM4456catch.collect(flowCollector, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    objM3845constructorimpl = Result.m3845constructorimpl(unit);
                    alexaEngine = AlexaEngine.this;
                    function1 = this.d;
                    thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                    if (thM3848exceptionOrNullimpl != null) {
                        HMLog.error$default("speech", null, null, new c(thM3848exceptionOrNullimpl), 6, null);
                        if (alexaEngine.isDestroyMethodCall.get()) {
                            HMLog.info("speech", d.a);
                            return Unit.INSTANCE;
                        }
                        alexaEngine.isInit.set(false);
                        function1.invoke(Boxing.boxBoolean(false));
                        alexaEngine.j().engineException(1);
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                unit = Unit.INSTANCE;
                objM3845constructorimpl = Result.m3845constructorimpl(unit);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            alexaEngine = AlexaEngine.this;
            function1 = this.d;
            thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.error$default("speech", null, null, new c(thM3848exceptionOrNullimpl), 6, null);
                if (alexaEngine.isDestroyMethodCall.get()) {
                    HMLog.info("speech", d.a);
                    return Unit.INSTANCE;
                }
                alexaEngine.isInit.set(false);
                function1.invoke(Boxing.boxBoolean(false));
                alexaEngine.j().engineException(1);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.alexa.AlexaEngine$speechRecognizer$1", f = "AlexaEngine.kt", i = {}, l = {FTPCodes.DATA_CONNECTION_CLOSING}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ MultipartResponse a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MultipartResponse multipartResponse) {
                super(0);
                this.a = multipartResponse;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return this.a.toString();
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
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return Intrinsics.stringPlus("产生异常：", this.a);
            }
        }

        public j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            j jVar = AlexaEngine.this.new j(continuation);
            jVar.b = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0097  */
        /* JADX WARN: Code duplicated, block: B:28:0x00b2  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM3845constructorimpl;
            AlexaEngine alexaEngine;
            Throwable thM3848exceptionOrNullimpl;
            AlexaEngine alexaEngine2;
            AlexaEngine alexaEngine3;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    alexaEngine2 = AlexaEngine.this;
                    Result.Companion companion = Result.Companion;
                    RecognizePayload recognizePayload = new RecognizePayload("NEAR_FIELD", alexaEngine2.s(), alexaEngine2.m().getInitiator());
                    SpeechRecognizerEvent speechRecognizerEventO = alexaEngine2.o();
                    PipeBody pipeBody = alexaEngine2.pipeBody;
                    if (pipeBody == null) {
                        throw null;
                    }
                    MultipartResponse multipartResponseRecognize = speechRecognizerEventO.recognize(recognizePayload, pipeBody);
                    HMLog.info("speech", new a(multipartResponseRecognize));
                    alexaEngine2.g().set(4);
                    if (!alexaEngine2.isDestroyMethodCall.get()) {
                        DataDistributor dataDistributorH = alexaEngine2.h();
                        this.b = alexaEngine2;
                        this.a = 1;
                        if (dataDistributorH.deliver(multipartResponseRecognize, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        alexaEngine3 = alexaEngine2;
                    }
                    alexaEngine2.m().setInitiator(null);
                    objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
                    alexaEngine = AlexaEngine.this;
                    thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                    if (thM3848exceptionOrNullimpl != null) {
                        HMLog.error$default("speech", null, null, new b(thM3848exceptionOrNullimpl), 6, null);
                        alexaEngine.stop();
                        if (!alexaEngine.isDestroyMethodCall.get()) {
                            alexaEngine.j().engineException(1);
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                alexaEngine3 = (AlexaEngine) this.b;
                ResultKt.throwOnFailure(obj);
                alexaEngine2 = alexaEngine3;
                alexaEngine2.m().setInitiator(null);
                objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            alexaEngine = AlexaEngine.this;
            thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.error$default("speech", null, null, new b(thM3848exceptionOrNullimpl), 6, null);
                alexaEngine.stop();
                if (!alexaEngine.isDestroyMethodCall.get()) {
                    alexaEngine.j().engineException(1);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<Unit> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AlexaEngine.this.w();
            AlexaEngine.this.pipeBody = new PipeBody();
            AlexaEngine.this.u();
            AlexaEngine.this.isSpeechRecognizer.set(true);
            if (DebugMode.INSTANCE.getDebug()) {
                AlexaEngine alexaEngine = AlexaEngine.this;
                alexaEngine.audioSaveFile = AudioSaveKt.getAlexaAudioFile(alexaEngine.f());
            }
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
            return "engine stop";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.alexa.AlexaEngine", f = "AlexaEngine.kt", i = {}, l = {272}, m = "syncCapability", n = {}, s = {})
    public static final class m extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public m(Continuation<? super m> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return AlexaEngine.this.v(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public final /* synthetic */ Response a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Response response) {
            super(0);
            this.a = response;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("Request json body error! Error msg:", this.a.body());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("UnKnown status code:", Integer.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<String> {
        public final /* synthetic */ String[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String[] strArr) {
            super(0);
            this.a = strArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("localsChanged:", this.a[0]);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.alexa.AlexaEngine$syncSoftwareVersion$1$1", f = "AlexaEngine.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class q extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ String c;
        public final /* synthetic */ AlexaEngine d;

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
                return "向Alexa上报固件版本失败";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str, AlexaEngine alexaEngine, Continuation<? super q> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = alexaEngine;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            q qVar = new q(this.c, this.d, continuation);
            qVar.b = obj;
            return qVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM3845constructorimpl;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String str = this.c;
            AlexaEngine alexaEngine = this.d;
            try {
                Result.Companion companion = Result.Companion;
                new SystemEventImpl(alexaEngine.t(), alexaEngine.l()).softwareInfo(new SoftwareInfoPayload(kotlin.text.m.replace(str, "v", "", true)));
                objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
                HMLog.error$default("speech", null, null, a.a, 6, null);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.alexa.AlexaEngine$syncStateToAvs$1$1", f = "AlexaEngine.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class r extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ SystemEventImpl c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(SystemEventImpl systemEventImpl, Continuation<? super r> continuation) {
            super(2, continuation);
            this.c = systemEventImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            r rVar = new r(this.c, continuation);
            rVar.b = obj;
            return rVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SystemEventImpl systemEventImpl = this.c;
            try {
                Result.Companion companion = Result.Companion;
                systemEventImpl.synchronizeState();
                Result.m3845constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.alexa.AlexaEngine$syncStateToAvs$1$2", f = "AlexaEngine.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class s extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ SystemEventImpl c;
        public final /* synthetic */ AlexaEngine d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(SystemEventImpl systemEventImpl, AlexaEngine alexaEngine, Continuation<? super s> continuation) {
            super(2, continuation);
            this.c = systemEventImpl;
            this.d = alexaEngine;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            s sVar = new s(this.c, this.d, continuation);
            sVar.b = obj;
            return sVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SystemEventImpl systemEventImpl = this.c;
            AlexaEngine alexaEngine = this.d;
            try {
                Result.Companion companion = Result.Companion;
                systemEventImpl.timeZoneChanged(new TimeZonePayload(alexaEngine.q().getTimeZone()));
                Result.m3845constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AlexaEngine(@NotNull VoiceCodeType voiceCodeType, @NotNull VoiceConfig voiceConfig) {
        this.voiceCodeType = voiceCodeType;
        this.voiceConfig = voiceConfig;
        Koin koin = KoinHelperKt.getKoin();
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Scope rootScope = koin.getScopeRegistry().getRootScope();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.speechScope = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<SpeechScope>() { // from class: com.huami.ai.speech.alexa.AlexaEngine$special$$inlined$injectOrNull$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.ai.speech.api.scpoe.SpeechScope, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke */
            public final SpeechScope getA() {
                return rootScope.getOrNull(Reflection.getOrCreateKotlinClass(SpeechScope.class), qualifier, objArr);
            }
        });
        this.distributor = LazyKt__LazyJVMKt.lazy(new c());
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.webApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<AlexaWebApi>() { // from class: com.huami.ai.speech.alexa.AlexaEngine$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.speech.alexa.AlexaWebApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final AlexaWebApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(AlexaWebApi.class), objArr2, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.initiatorWrapper = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<InitiatorWrapper>() { // from class: com.huami.ai.speech.alexa.AlexaEngine$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.speech.alexa.capability.recognizer.InitiatorWrapper, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final InitiatorWrapper getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(InitiatorWrapper.class), objArr4, objArr5);
            }
        });
        this.speech = LazyKt__LazyJVMKt.lazy(new i());
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode4 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.engineExceptionNotify = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode4, (Function0) new Function0<EngineExceptionNotify>() { // from class: com.huami.ai.speech.alexa.AlexaEngine$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.notify.EngineExceptionNotify, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final EngineExceptionNotify getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(EngineExceptionNotify.class), objArr6, objArr7);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode5 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr8 = 0 == true ? 1 : 0;
        final Object[] objArr9 = 0 == true ? 1 : 0;
        this.dialogState = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode5, (Function0) new Function0<DialogState>() { // from class: com.huami.ai.speech.alexa.AlexaEngine$special$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [com.huami.ai.notify.DialogState, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DialogState getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DialogState.class), objArr8, objArr9);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode6 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr10 = 0 == true ? 1 : 0;
        final Object[] objArr11 = 0 == true ? 1 : 0;
        this.timeZone = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode6, (Function0) new Function0<TimeZone>() { // from class: com.huami.ai.speech.alexa.AlexaEngine$special$$inlined$inject$default$5
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
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(TimeZone.class), objArr10, objArr11);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode7 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr12 = 0 == true ? 1 : 0;
        final Object[] objArr13 = 0 == true ? 1 : 0;
        this.locales = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode7, (Function0) new Function0<Locales>() { // from class: com.huami.ai.speech.alexa.AlexaEngine$special$$inlined$inject$default$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.helper.Locales, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final Locales getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(Locales.class), objArr12, objArr13);
            }
        });
        Koin koin2 = KoinHelperKt.getKoin();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode8 = koinPlatformTools.defaultLazyMode();
        final Scope rootScope2 = koin2.getScopeRegistry().getRootScope();
        final Object[] objArr14 = 0 == true ? 1 : 0;
        final Object[] objArr15 = 0 == true ? 1 : 0;
        this.downChanel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode8, (Function0) new Function0<DownChannelApi>() { // from class: com.huami.ai.speech.alexa.AlexaEngine$special$$inlined$injectOrNull$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.ai.speech.alexa.DownChannelApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke */
            public final DownChannelApi getA() {
                return rootScope2.getOrNull(Reflection.getOrCreateKotlinClass(DownChannelApi.class), objArr14, objArr15);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode9 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr16 = 0 == true ? 1 : 0;
        final Object[] objArr17 = 0 == true ? 1 : 0;
        this.gson = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode9, (Function0) new Function0<Gson>() { // from class: com.huami.ai.speech.alexa.AlexaEngine$special$$inlined$inject$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.google.gson.Gson, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final Gson getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(Gson.class), objArr16, objArr17);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode10 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr18 = 0 == true ? 1 : 0;
        final Object[] objArr19 = 0 == true ? 1 : 0;
        this.context = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode10, (Function0) new Function0<Context>() { // from class: com.huami.ai.speech.alexa.AlexaEngine$special$$inlined$inject$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [android.content.Context, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final Context getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(Context.class), objArr18, objArr19);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode11 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr20 = 0 == true ? 1 : 0;
        final Object[] objArr21 = 0 == true ? 1 : 0;
        this.tokenApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode11, (Function0) new Function0<AlexaToken>() { // from class: com.huami.ai.speech.alexa.AlexaEngine$special$$inlined$inject$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.speech.alexa.http.AlexaToken, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final AlexaToken getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(AlexaToken.class), objArr20, objArr21);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode12 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr22 = 0 == true ? 1 : 0;
        final Object[] objArr23 = 0 == true ? 1 : 0;
        this.filterChain = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode12, (Function0) new Function0<FilterChain>() { // from class: com.huami.ai.speech.alexa.AlexaEngine$special$$inlined$inject$default$10
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.speech.alexa.filter.FilterChain, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final FilterChain getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(FilterChain.class), objArr22, objArr23);
            }
        });
        final a aVar = new a();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode13 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr24 = 0 == true ? 1 : 0;
        this.configGot = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode13, (Function0) new Function0<VoiceConfigGot>() { // from class: com.huami.ai.speech.alexa.AlexaEngine$special$$inlined$inject$default$11
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.helper.VoiceConfigGot, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final VoiceConfigGot getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(VoiceConfigGot.class), objArr24, aVar);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode14 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr25 = 0 == true ? 1 : 0;
        final Object[] objArr26 = 0 == true ? 1 : 0;
        this.baseDevice = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode14, (Function0) new Function0<SpeechDevice>() { // from class: com.huami.ai.speech.alexa.AlexaEngine$special$$inlined$inject$default$12
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.helper.SpeechDevice, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final SpeechDevice getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(SpeechDevice.class), objArr25, objArr26);
            }
        });
        this.isInit = new AtomicBoolean(false);
        this.isSpeechRecognizer = new AtomicBoolean(false);
        this.retryLatency = 1000L;
        this.isDestroyMethodCall = new AtomicBoolean(false);
        VoiceConfigExtKt.printString(voiceConfig);
        a(voiceConfig);
    }

    private final void a(VoiceConfig voiceConfig) {
        FilterChain filterChainK = k();
        if (!VoiceConfigFuncKt.needTTSAudio(voiceConfig)) {
            filterChainK.addFilter(new TTSAudioFilter());
        }
        filterChainK.addFilter(FilterConfigKt.expectSpeechFilter(voiceConfig.getVersion()));
        filterChainK.addFilter(new MultiTtsMergeFilter());
        filterChainK.addFilter(FilterConfigKt.ttsTextFilter(VoiceConfigFuncKt.supportDeleteAlert(voiceConfig), voiceConfig.getVersion()));
        filterChainK.addFilter(new ReduplicatedSetAlertFilter());
        UnSupportDirectFilter unSupportDirectFilterUnSupportFilter = FilterConfigKt.unSupportFilter(d(), e().getVoiceConfig());
        if (unSupportDirectFilterUnSupportFilter == null) {
            return;
        }
        filterChainK.addFilter(unSupportDirectFilterUnSupportFilter);
    }

    private final void b(Function0<Unit> block) {
        if (this.isInit.get()) {
            block.getA();
        } else {
            HMLog.error$default("speech", null, null, d.a, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(Throwable throwable) {
        this.isInit.set(false);
        if (this.isDestroyMethodCall.get()) {
            HMLog.info("speech", e.a);
            return;
        }
        HMLog.error$default("speech", null, null, new f(throwable), 6, null);
        if (throwable instanceof IOException) {
            j().engineException(1);
        } else {
            j().engineException(19);
        }
    }

    private final SpeechDevice d() {
        return (SpeechDevice) this.baseDevice.getValue();
    }

    private final VoiceConfigGot e() {
        return (VoiceConfigGot) this.configGot.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context f() {
        return (Context) this.context.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialogState g() {
        return (DialogState) this.dialogState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DataDistributor h() {
        return (DataDistributor) this.distributor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DownChannelApi i() {
        return (DownChannelApi) this.downChanel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EngineExceptionNotify j() {
        return (EngineExceptionNotify) this.engineExceptionNotify.getValue();
    }

    private final FilterChain k() {
        return (FilterChain) this.filterChain.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Gson l() {
        return (Gson) this.gson.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InitiatorWrapper m() {
        return (InitiatorWrapper) this.initiatorWrapper.getValue();
    }

    private final Locales n() {
        return (Locales) this.locales.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SpeechRecognizerEvent o() {
        return (SpeechRecognizerEvent) this.speech.getValue();
    }

    private final SpeechScope p() {
        return (SpeechScope) this.speechScope.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TimeZone q() {
        return (TimeZone) this.timeZone.getValue();
    }

    private final AlexaToken r() {
        return (AlexaToken) this.tokenApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String s() {
        if (WhenMappings.$EnumSwitchMapping$0[this.voiceCodeType.ordinal()] == 1) {
            return "AUDIO_L16_RATE_16000_CHANNELS_1";
        }
        throw new IllegalArgumentException("not support voice codec");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AlexaWebApi t() {
        return (AlexaWebApi) this.webApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        SpeechScope speechScopeP = p();
        if (speechScopeP == null) {
            return;
        }
        kotlinx.coroutines.e.f(speechScopeP, null, null, new j(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX WARN: Code duplicated, block: B:21:0x0054  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    /* JADX WARN: Code duplicated, block: B:27:0x0073 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x0099  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0071 -> B:28:0x0074). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object v(kotlin.coroutines.Continuation<? super java.lang.Boolean> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.huami.ai.speech.alexa.AlexaEngine.m
            if (r0 == 0) goto L13
            r0 = r9
            com.huami.ai.speech.alexa.AlexaEngine$m r0 = (com.huami.ai.speech.alexa.AlexaEngine.m) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.huami.ai.speech.alexa.AlexaEngine$m r0 = new com.huami.ai.speech.alexa.AlexaEngine$m
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r2 = r0.a
            com.huami.ai.speech.alexa.AlexaEngine r2 = (com.huami.ai.speech.alexa.AlexaEngine) r2
            kotlin.ResultKt.throwOnFailure(r9)
            goto L74
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            kotlin.ResultKt.throwOnFailure(r9)
            r2 = r8
        L39:
            com.huami.ai.speech.alexa.AlexaWebApi r9 = r2.t()
            com.huami.bluetooth.profile.channel.module.voice.VoiceConfig r4 = r2.voiceConfig
            okhttp3.Response r9 = r9.capabilities(r4)
            int r4 = r9.code()
            r5 = 204(0xcc, float:2.86E-43)
            if (r4 == r5) goto Lac
            r5 = 400(0x190, float:5.6E-43)
            r6 = 0
            if (r4 == r5) goto L99
            r9 = 403(0x193, float:5.65E-43)
            if (r4 == r9) goto L84
            r9 = 500(0x1f4, float:7.0E-43)
            if (r4 == r9) goto L67
            com.huami.ai.speech.alexa.AlexaEngine$o r9 = new com.huami.ai.speech.alexa.AlexaEngine$o
            r9.<init>(r4)
            java.lang.String r0 = "speech"
            com.huami.tools.log.HMLog.debug(r0, r9)
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r9
        L67:
            long r4 = r2.retryLatency
            r0.a = r2
            r0.d = r3
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r4, r0)
            if (r9 != r1) goto L74
            return r1
        L74:
            long r4 = r2.retryLatency
            r6 = 256000(0x3e800, double:1.26481E-318)
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto L39
            r9 = 2
            long r6 = (long) r9
            long r4 = r4 * r6
            r2.retryLatency = r4
            goto L39
        L84:
            com.huami.ai.speech.alexa.http.AlexaToken r9 = r2.r()
            r9.tokenInvalidate()
            com.huami.ai.notify.EngineExceptionNotify r9 = r2.j()
            r0 = 18
            r9.engineException(r0)
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
            return r9
        L99:
            r1 = 0
            r2 = 0
            com.huami.ai.speech.alexa.AlexaEngine$n r3 = new com.huami.ai.speech.alexa.AlexaEngine$n
            r3.<init>(r9)
            r4 = 6
            r5 = 0
            java.lang.String r0 = "speech"
            com.huami.tools.log.HMLog.error$default(r0, r1, r2, r3, r4, r5)
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
            return r9
        Lac:
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.ai.speech.alexa.AlexaEngine.v(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        try {
            Result.Companion companion = Result.Companion;
            String[] locales = n().getLocales();
            String[] strArr = this.lastLocal;
            if (strArr == null || !kotlin.collections.c.contentDeepEquals(locales, strArr)) {
                this.lastLocal = locales;
                new SystemEventImpl(t(), l()).localsChanged(new LocalesPayload(locales));
            }
            HMLog.info("speech", new p(locales));
            Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        SpeechScope speechScopeP;
        String firmwareVersion = d().getFirmwareVersion();
        if (firmwareVersion == null || (speechScopeP = p()) == null) {
            return;
        }
        kotlinx.coroutines.e.f(speechScopeP, null, null, new q(firmwareVersion, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y() {
        SystemEventImpl systemEventImpl = new SystemEventImpl(t(), l());
        SpeechScope speechScopeP = p();
        if (speechScopeP != null) {
            kotlinx.coroutines.e.f(speechScopeP, null, null, new r(systemEventImpl, null), 3, null);
        }
        SpeechScope speechScopeP2 = p();
        if (speechScopeP2 == null) {
            return;
        }
        kotlinx.coroutines.e.f(speechScopeP2, null, null, new s(systemEventImpl, this, null), 3, null);
    }

    @Override // com.huami.ai.speech.api.engine.Engine
    public void destroy() {
        this.isDestroyMethodCall.set(true);
        SpeechScope speechScopeP = p();
        if (speechScopeP != null) {
            CoroutineScopeKt.cancel$default(speechScopeP, null, 1, null);
        }
        DownChannelApi downChannelApiI = i();
        if (downChannelApiI != null) {
            downChannelApiI.close();
        }
        HMLog.info("speech", b.a);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.ai.speech.api.engine.Engine
    public void init(@NotNull Function1<? super Boolean, Unit> block) throws InterruptedException {
        SpeechScope speechScopeP = p();
        if (speechScopeP != null) {
            kotlinx.coroutines.e.f(speechScopeP, null, null, new g(null), 3, null);
        }
        kotlinx.coroutines.d.b(null, new AnonymousClass2(block, null), 1, null);
    }

    @Override // com.huami.ai.speech.api.engine.Engine
    public void interrupt() {
        SpeechScope speechScopeP = p();
        if (speechScopeP == null) {
            return;
        }
        CoroutineScopeKt.cancel$default(speechScopeP, null, 1, null);
    }

    @Override // com.huami.ai.speech.api.engine.Engine
    public void putData(@NotNull byte[] bArr, int length, int offset) {
        if (this.isSpeechRecognizer.get()) {
            b(new h(bArr));
        }
    }

    @Override // com.huami.ai.speech.api.engine.Engine
    public void start() {
        b(new k());
    }

    @Override // com.huami.ai.speech.api.engine.Engine
    public void stop() {
        HMLog.info("speech", l.a);
        this.isSpeechRecognizer.set(false);
        try {
            Result.Companion companion = Result.Companion;
            PipeBody pipeBody = this.pipeBody;
            if (pipeBody != null) {
                if (pipeBody == null) {
                    throw null;
                }
                pipeBody.sink().close();
            }
            Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
    }

    public /* synthetic */ AlexaEngine(VoiceCodeType voiceCodeType, VoiceConfig voiceConfig, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? VoiceCodeType.PCM_16K : voiceCodeType, voiceConfig);
    }
}
