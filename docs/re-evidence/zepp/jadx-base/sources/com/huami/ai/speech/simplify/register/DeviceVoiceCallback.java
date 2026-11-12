package com.huami.ai.speech.simplify.register;

import android.app.Application;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.hm.opuslib.OpusTool;
import com.huami.ai.helper.DebugMode;
import com.huami.ai.notify.DialogState;
import com.huami.ai.skill.AlertSkill;
import com.huami.ai.speech.alexa.alarm.AlarmRestApi;
import com.huami.ai.speech.alexa.entity.Alarm;
import com.huami.ai.speech.alexa.entity.Alarms;
import com.huami.ai.speech.alexa.uitls.AlertUtilKt;
import com.huami.ai.speech.api.KoinHelperKt;
import com.huami.ai.speech.api.engine.Engine;
import com.huami.ai.speech.api.scpoe.SpeechScope;
import com.huami.ai.speech.simplify.inject.SwitchConfig;
import com.huami.ai.speech.simplify.inject.module.LoadModuleKt;
import com.huami.ai.speech.simplify.opus.OpusParser;
import com.huami.ai.speech.simplify.register.DeviceVoiceCallback;
import com.huami.ai.speech.simplify.register.state.IdleState;
import com.huami.ai.speech.simplify.register.state.SpeechState;
import com.huami.ai.speech.simplify.register.state.ThinkingState;
import com.huami.ai.speech.simplify.utils.AudioSave;
import com.huami.ai.uitls.ISO8601DateFormatterKt;
import com.huami.bluetooth.profile.channel.module.voice.AlertItem;
import com.huami.bluetooth.profile.channel.module.voice.ICtrlCallback;
import com.huami.bluetooth.profile.channel.module.voice.VoiceConfig;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.market.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelicateCoroutinesApi;
import kotlinx.coroutines.GlobalScope;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010 \u001a\u00020\u001b\u0012\u0006\u0010&\u001a\u00020!\u0012\u0006\u0010,\u001a\u00020'¢\u0006\u0004\bk\u0010lJ!\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0004H\u0016J\u0016\u0010\u0010\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\u0006\u0010\u0018\u001a\u00020\u0006J\u000e\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011R\u0019\u0010 \u001a\u00020\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010&\u001a\u00020!8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010,\u001a\u00020'8\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R$\u00104\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001f\u0010E\u001a\u0004\u0018\u00010A8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\b:\u0010DR\u001e\u0010J\u001a\n G*\u0004\u0018\u00010F0F8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001f\u0010N\u001a\u0004\u0018\u00010K8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010C\u001a\u0004\b.\u0010MR\u001f\u0010R\u001a\u0004\u0018\u00010O8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010C\u001a\u0004\b6\u0010QR\u001d\u0010U\u001a\u00020S8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bB\u0010TR$\u0010\\\u001a\u0004\u0018\u00010V8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R$\u0010`\u001a\u0004\u0018\u00010V8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b]\u0010W\u001a\u0004\b^\u0010Y\"\u0004\b_\u0010[R\u001c\u0010f\u001a\u00020a8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u0018\u0010j\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010i\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006m"}, d2 = {"Lcom/huami/ai/speech/simplify/register/DeviceVoiceCallback;", "Lcom/huami/bluetooth/profile/channel/module/voice/ICtrlCallback;", "Lorg/koin/core/component/KoinComponent;", "", "Lcom/huami/bluetooth/profile/channel/module/voice/AlertItem;", "alarms", "", "l", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/ai/speech/alexa/entity/Alarm;", "alarm", hl.k, "(Lcom/huami/ai/speech/alexa/entity/Alarm;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "alert", "onAlertChanged", "alertList", "onAlertReceived", "", "data", "onAudioData", "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "config", "onStartSession", "onStopSession", "destroy", HTTP.CONTENT_RANGE_BYTES, "decodeBytes", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "a", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "getBaseDevice", "()Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "baseDevice", "", "b", LogUtil.I, "getFeature", "()I", Constants.JSON_FEATURE, "Landroid/app/Application;", "c", "Landroid/app/Application;", "getContext", "()Landroid/app/Application;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/ai/speech/api/engine/Engine;", GoogleApiAvailabilityLight.a, "Lcom/huami/ai/speech/api/engine/Engine;", "getEngine", "()Lcom/huami/ai/speech/api/engine/Engine;", "setEngine", "(Lcom/huami/ai/speech/api/engine/Engine;)V", "engine", "Lcom/huami/ai/notify/DialogState;", "e", "Lcom/huami/ai/notify/DialogState;", "dialogState", "Lcom/huami/ai/speech/simplify/register/state/SpeechState;", "f", "Lcom/huami/ai/speech/simplify/register/state/SpeechState;", "getState", "()Lcom/huami/ai/speech/simplify/register/state/SpeechState;", "setState", "(Lcom/huami/ai/speech/simplify/register/state/SpeechState;)V", "state", "Lcom/huami/ai/speech/api/scpoe/SpeechScope;", "g", "Lkotlin/Lazy;", "()Lcom/huami/ai/speech/api/scpoe/SpeechScope;", "speechScope", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "h", "Ljava/util/concurrent/ExecutorService;", "singleExecutor", "Lcom/huami/ai/speech/alexa/alarm/AlarmRestApi;", "i", "()Lcom/huami/ai/speech/alexa/alarm/AlarmRestApi;", "alarmRestApi", "Lcom/huami/ai/skill/AlertSkill;", z.j, "()Lcom/huami/ai/skill/AlertSkill;", "alertSkill", "Lcom/huami/ai/speech/simplify/inject/SwitchConfig;", "()Lcom/huami/ai/speech/simplify/inject/SwitchConfig;", "switchConfig", "Lcom/huami/ai/speech/simplify/utils/AudioSave;", "Lcom/huami/ai/speech/simplify/utils/AudioSave;", "getPcmAudioSave$speech_simplify_release", "()Lcom/huami/ai/speech/simplify/utils/AudioSave;", "setPcmAudioSave$speech_simplify_release", "(Lcom/huami/ai/speech/simplify/utils/AudioSave;)V", "pcmAudioSave", "m", "getOpusAudioSave$speech_simplify_release", "setOpusAudioSave$speech_simplify_release", "opusAudioSave", "Ljava/util/Observer;", GoogleApiAvailabilityLight.b, "Ljava/util/Observer;", "getDialogStateObserver$speech_simplify_release", "()Ljava/util/Observer;", "dialogStateObserver", "Lcom/hm/opuslib/OpusTool;", "o", "Lcom/hm/opuslib/OpusTool;", "opusTools", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;ILandroid/app/Application;)V", "speech-simplify_release"}, k = 1, mv = {1, 5, 1})
@DelicateCoroutinesApi
public final class DeviceVoiceCallback implements ICtrlCallback, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HMBaseDevice baseDevice;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int feature;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Application context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private volatile Engine engine;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private DialogState dialogState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private SpeechState state = new IdleState(this);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy speechScope;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final ExecutorService singleExecutor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy alarmRestApi;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy alertSkill;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy switchConfig;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private AudioSave pcmAudioSave;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private AudioSave opusAudioSave;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final Observer dialogStateObserver;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    private OpusTool opusTools;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "voice callback destroy.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Alarm a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Alarm alarm) {
            super(0);
            this.a = alarm;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("alarm changed:", this.a);
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
        public final String invoke() {
            return "onAlertReceived";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.simplify.register.DeviceVoiceCallback$onAlertReceived$2", f = "DeviceVoiceCallback.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ List<AlertItem> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<AlertItem> list, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceVoiceCallback.this.new d(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceVoiceCallback deviceVoiceCallback = DeviceVoiceCallback.this;
                List<AlertItem> list = this.c;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (Boxing.boxBoolean(((AlertItem) obj2).getAlertType() == 1).booleanValue()) {
                        arrayList.add(obj2);
                    }
                }
                this.a = 1;
                if (deviceVoiceCallback.l(arrayList, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
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
            return "start session";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ Alarm a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Alarm alarm) {
            super(0);
            this.a = alarm;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "转换时间出错。原时间：" + this.a.getTrigger().getScheduledTime() + ",时区：" + this.a.getTrigger().getTimeZoneId();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.simplify.register.DeviceVoiceCallback", f = "DeviceVoiceCallback.kt", i = {1}, l = {169, 175}, m = "syncAlarm", n = {"it"}, s = {"L$2"})
    public static final class g extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return DeviceVoiceCallback.this.l(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ List<AlertItem> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List<AlertItem> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("手表闹钟：", CollectionsKt___CollectionsKt.joinToString$default(this.a, null, null, null, 0, null, null, 63, null));
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
            return "read cloud alarm null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ Alarms a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Alarms alarms) {
            super(0);
            this.a = alarms;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("云端闹钟：", CollectionsKt___CollectionsKt.joinToString$default(this.a.getAlarms(), null, null, null, 0, null, null, 63, null));
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
        public final String invoke() {
            return "Syn alarm, but alertSkill null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ List<String> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(List<String> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("下发删除闹钟：", CollectionsKt___CollectionsKt.joinToString$default(this.a, null, null, null, 0, null, null, 63, null));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public final /* synthetic */ Alarm a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Alarm alarm) {
            super(0);
            this.a = alarm;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("下发设置闹钟：", this.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceVoiceCallback(@NotNull HMBaseDevice hMBaseDevice, int i2, @NotNull Application application) {
        this.baseDevice = hMBaseDevice;
        this.feature = i2;
        this.context = application;
        Koin koin = KoinHelperKt.getKoin();
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Scope rootScope = koin.getScopeRegistry().getRootScope();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.speechScope = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<SpeechScope>() { // from class: com.huami.ai.speech.simplify.register.DeviceVoiceCallback$special$$inlined$injectOrNull$default$1
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
        this.singleExecutor = Executors.newSingleThreadExecutor();
        Koin koin2 = KoinHelperKt.getKoin();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Scope rootScope2 = koin2.getScopeRegistry().getRootScope();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.alarmRestApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<AlarmRestApi>() { // from class: com.huami.ai.speech.simplify.register.DeviceVoiceCallback$special$$inlined$injectOrNull$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.ai.speech.alexa.alarm.AlarmRestApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final AlarmRestApi invoke() {
                return rootScope2.getOrNull(Reflection.getOrCreateKotlinClass(AlarmRestApi.class), objArr2, objArr3);
            }
        });
        Koin koin3 = KoinHelperKt.getKoin();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Scope rootScope3 = koin3.getScopeRegistry().getRootScope();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.alertSkill = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<AlertSkill>() { // from class: com.huami.ai.speech.simplify.register.DeviceVoiceCallback$special$$inlined$injectOrNull$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.ai.skill.AlertSkill, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final AlertSkill invoke() {
                return rootScope3.getOrNull(Reflection.getOrCreateKotlinClass(AlertSkill.class), objArr4, objArr5);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode4 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.switchConfig = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode4, (Function0) new Function0<SwitchConfig>() { // from class: com.huami.ai.speech.simplify.register.DeviceVoiceCallback$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.speech.simplify.inject.SwitchConfig, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SwitchConfig invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(SwitchConfig.class), objArr6, objArr7);
            }
        });
        this.dialogStateObserver = new Observer() { // from class: com.huami.ai.speech.simplify.register.DeviceVoiceCallback$dialogStateObserver$1
            @Override // java.util.Observer
            public void update(@Nullable Observable o, @Nullable Object arg) {
                if (arg == null || !(arg instanceof Integer) || !Intrinsics.areEqual(arg, (Object) 2) || this.a.getEngine() == null) {
                    return;
                }
                DialogState dialogState = this.a.dialogState;
                if (dialogState != null) {
                    dialogState.set(3);
                }
                Engine engine = this.a.getEngine();
                if (engine != null) {
                    engine.stop();
                }
                this.a.setState(new ThinkingState(this.a));
            }
        };
    }

    private final AlarmRestApi d() {
        return (AlarmRestApi) this.alarmRestApi.getValue();
    }

    private final AlertSkill e() {
        return (AlertSkill) this.alertSkill.getValue();
    }

    private final SpeechScope f() {
        return (SpeechScope) this.speechScope.getValue();
    }

    private final SwitchConfig g() {
        return (SwitchConfig) this.switchConfig.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(DeviceVoiceCallback deviceVoiceCallback, byte[] bArr) {
        deviceVoiceCallback.getState().onAudioData(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(DeviceVoiceCallback deviceVoiceCallback, VoiceConfig voiceConfig) {
        HMLog.info("speech", e.a);
        DebugMode.INSTANCE.setDebug(deviceVoiceCallback.g().getSaveAudio());
        deviceVoiceCallback.getState().startSession(voiceConfig);
        if (deviceVoiceCallback.g().getSaveAudio()) {
            AudioSave audioSave = new AudioSave();
            AudioSave.createFile$default(audioSave, deviceVoiceCallback.getContext(), null, 2, null);
            Unit unit = Unit.INSTANCE;
            deviceVoiceCallback.setPcmAudioSave$speech_simplify_release(audioSave);
            AudioSave audioSave2 = new AudioSave();
            audioSave2.createFile(deviceVoiceCallback.getContext(), "opus");
            deviceVoiceCallback.setOpusAudioSave$speech_simplify_release(audioSave2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(DeviceVoiceCallback deviceVoiceCallback) {
        deviceVoiceCallback.getState().onStopSession();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object k(Alarm alarm, Continuation<? super Unit> continuation) {
        int alexaAlarmRepeat = alarm.getTrigger().getRecurrence() == null ? 0 : AlertUtilKt.parseAlexaAlarmRepeat(alarm.getTrigger().getRecurrence().getFreq(), alarm.getTrigger().getRecurrence().getByDay());
        String strUtcString = ISO8601DateFormatterKt.utcString(alarm.getTrigger().getScheduledTime(), alarm.getTrigger().getTimeZoneId());
        if (strUtcString == null) {
            HMLog.warn$default("speech", null, new f(alarm), 2, null);
            return Unit.INSTANCE;
        }
        com.huami.ai.entity.alert.Alarm alarm2 = new com.huami.ai.entity.alert.Alarm(alarm.getAlarmToken(), strUtcString, alexaAlarmRepeat, null, 8, null);
        AlertSkill alertSkillE = e();
        if (alertSkillE != null) {
            Object alarm3 = alertSkillE.setAlarm(alarm2, continuation);
            return alarm3 == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? alarm3 : Unit.INSTANCE;
        }
        if (kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() == null) {
            return null;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:76:0x0195  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x01a7 -> B:79:0x01aa). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object l(java.util.List<com.huami.bluetooth.profile.channel.module.voice.AlertItem> r19, kotlin.coroutines.Continuation<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.ai.speech.simplify.register.DeviceVoiceCallback.l(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public final byte[] decodeBytes(@NotNull byte[] bytes) {
        if (this.opusTools == null) {
            OpusTool opusTool = new OpusTool();
            opusTool.init();
            Unit unit = Unit.INSTANCE;
            this.opusTools = opusTool;
        }
        return OpusParser.parse(this.opusTools, bytes);
    }

    public final void destroy() {
        HMLog.info("speech", a.a);
        OpusTool opusTool = this.opusTools;
        if (opusTool != null) {
            opusTool.deinit();
        }
        this.opusTools = null;
        SpeechScope speechScopeF = f();
        if (speechScopeF != null) {
            CoroutineScopeKt.cancel$default(speechScopeF, null, 1, null);
        }
        Engine engine = this.engine;
        if (engine != null) {
            engine.destroy();
        }
        this.engine = null;
        LoadModuleKt.unloadModule(this.feature);
    }

    @NotNull
    public final HMBaseDevice getBaseDevice() {
        return this.baseDevice;
    }

    @NotNull
    public final Application getContext() {
        return this.context;
    }

    @NotNull
    /* JADX INFO: renamed from: getDialogStateObserver$speech_simplify_release, reason: from getter */
    public final Observer getDialogStateObserver() {
        return this.dialogStateObserver;
    }

    @Nullable
    public final Engine getEngine() {
        return this.engine;
    }

    public final int getFeature() {
        return this.feature;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Nullable
    /* JADX INFO: renamed from: getOpusAudioSave$speech_simplify_release, reason: from getter */
    public final AudioSave getOpusAudioSave() {
        return this.opusAudioSave;
    }

    @Nullable
    /* JADX INFO: renamed from: getPcmAudioSave$speech_simplify_release, reason: from getter */
    public final AudioSave getPcmAudioSave() {
        return this.pcmAudioSave;
    }

    @NotNull
    public final SpeechState getState() {
        return this.state;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    @Override // com.huami.bluetooth.profile.channel.module.voice.ICtrlCallback
    public void onAlertChanged(@NotNull AlertItem alert) {
        Alarm alarmCancelAlarm;
        if (alert.getEnabled()) {
            AlarmRestApi alarmRestApiD = d();
            if (alarmRestApiD == null) {
                alarmCancelAlarm = null;
            } else {
                alarmCancelAlarm = alarmRestApiD.activeAlarm(alert.getId());
            }
        } else {
            AlarmRestApi alarmRestApiD2 = d();
            if (alarmRestApiD2 == null) {
                alarmCancelAlarm = null;
            } else {
                alarmCancelAlarm = alarmRestApiD2.cancelAlarm(alert.getId());
            }
        }
        HMLog.info$default(null, new b(alarmCancelAlarm), 1, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.voice.ICtrlCallback
    public void onAlertReceived(@NotNull List<AlertItem> alertList) {
        HMLog.info("speech", c.a);
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, null, null, new d(alertList, null), 3, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.voice.ICtrlCallback
    public void onAudioData(@NotNull final byte[] data) {
        this.singleExecutor.execute(new Runnable() { // from class: ba1
            @Override // java.lang.Runnable
            public final void run() {
                DeviceVoiceCallback.h(this.a, data);
            }
        });
    }

    @Override // com.huami.bluetooth.profile.channel.module.voice.ICtrlCallback
    public void onStartSession(@NotNull final VoiceConfig config) {
        this.singleExecutor.execute(new Runnable() { // from class: aa1
            @Override // java.lang.Runnable
            public final void run() {
                DeviceVoiceCallback.i(this.a, config);
            }
        });
    }

    @Override // com.huami.bluetooth.profile.channel.module.voice.ICtrlCallback
    public void onStopSession() {
        this.singleExecutor.execute(new Runnable() { // from class: z91
            @Override // java.lang.Runnable
            public final void run() {
                DeviceVoiceCallback.j(this.a);
            }
        });
    }

    public final void setEngine(@Nullable Engine engine) {
        this.engine = engine;
    }

    public final void setOpusAudioSave$speech_simplify_release(@Nullable AudioSave audioSave) {
        this.opusAudioSave = audioSave;
    }

    public final void setPcmAudioSave$speech_simplify_release(@Nullable AudioSave audioSave) {
        this.pcmAudioSave = audioSave;
    }

    public final void setState(@NotNull SpeechState speechState) {
        this.state = speechState;
    }
}
