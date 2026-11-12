package com.huami.ai.speech.xiaoai.capability.instruction;

import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ai.helper.SpeechDevice;
import com.huami.ai.helper.VoiceConfigFuncKt;
import com.huami.ai.helper.VoiceConfigGot;
import com.huami.ai.notify.DialogState;
import com.huami.ai.notify.EngineExceptionNotify;
import com.huami.ai.notify.VADSendState;
import com.huami.ai.notify.VoiceCaptureNotify;
import com.huami.ai.skill.AlertSkill;
import com.huami.ai.skill.AudioPlaySkill;
import com.huami.ai.skill.CaptionChannel;
import com.huami.ai.skill.CustomSkill;
import com.huami.ai.skill.FindPhoneSkill;
import com.huami.ai.skill.ListTemplateSkill;
import com.huami.ai.skill.NFCSkill;
import com.huami.ai.skill.NavigateSkill;
import com.huami.ai.skill.PlayControlSkill;
import com.huami.ai.skill.SetBrightnessSkill;
import com.huami.ai.skill.SystemSettingSkill;
import com.huami.ai.skill.UnSupportOperation;
import com.huami.ai.skill.VolumeControlSkill;
import com.huami.ai.speech.api.KoinHelperKt;
import com.huami.ai.speech.xiaoai.auth.XiaoMiToken;
import com.huami.ai.speech.xiaoai.capability.instruction.custom.CustomInstruction;
import com.huami.ai.speech.xiaoai.capability.instruction.entity.CombineAnswer;
import com.huami.ai.speech.xiaoai.event.RecognizerEventIdKeeper;
import com.huami.ai.speech.xiaoai.interceptor.InterceptorChain;
import com.huami.ai.speech.xiaoai.utils.CheckInstructionKt;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.ai.android.capability.InstructionCapability;
import com.xiaomi.ai.android.core.Engine;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.SpeechRecognizer;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.common.Optional;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u001d¢\u0006\u0004\bq\u0010rJ\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u0006H\u0002J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006H\u0002J\u0016\u0010\u000f\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\u0016\u0010\u0013\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J\u001c\u0010\u0018\u001a\u00020\u00062\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0016H\u0002J\u0016\u0010\u0019\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u001d\u0010%\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010*\u001a\u00020&8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010)R\u001d\u0010-\u001a\u00020+8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b!\u0010,R\u001d\u00102\u001a\u00020.8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\"\u001a\u0004\b0\u00101R\u001d\u00107\u001a\u0002038B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\"\u001a\u0004\b5\u00106R\u001d\u0010<\u001a\u0002088B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\"\u001a\u0004\b:\u0010;R\u001f\u0010@\u001a\u0004\u0018\u00010=8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010\"\u001a\u0004\b'\u0010?R\u001d\u0010D\u001a\u00020A8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010\"\u001a\u0004\bB\u0010CR\u001d\u0010G\u001a\u00020E8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\"\u001a\u0004\b4\u0010FR\u001d\u0010K\u001a\u00020H8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010\"\u001a\u0004\bI\u0010JR\u001d\u0010O\u001a\u00020L8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\"\u001a\u0004\bM\u0010NR\u001d\u0010R\u001a\u00020P8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\"\u001a\u0004\b9\u0010QR\u001d\u0010U\u001a\u00020S8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010\"\u001a\u0004\b>\u0010TR\u001d\u0010Y\u001a\u00020V8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010\"\u001a\u0004\b/\u0010XR\u001d\u0010\\\u001a\u00020Z8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\bW\u0010[R\u0018\u0010_\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R2\u0010c\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030`j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003`a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010bR\u001d\u0010g\u001a\u00020d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010\"\u001a\u0004\b]\u0010fR\u0016\u0010i\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010hR\u001d\u0010l\u001a\u00020j8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\be\u0010kR(\u0010p\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010n0m8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010o¨\u0006s"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/instruction/InstructionCapabilityImpl;", "Lcom/xiaomi/ai/android/capability/InstructionCapability;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/ai/api/common/Instruction;", "", "instruction", "", "v", "", "u", "a", "", "executeCount", "hasWeatherInstruction", "x", "b", "Lcom/xiaomi/common/Optional;", "", "optional", hl.k, "id", "y", "", "insList", "w", "process", "Lcom/xiaomi/ai/android/core/Engine;", "Lcom/xiaomi/ai/android/core/Engine;", "engine", "Lcom/huami/ai/speech/xiaoai/event/RecognizerEventIdKeeper;", "Lcom/huami/ai/speech/xiaoai/event/RecognizerEventIdKeeper;", "startRequestIdKeeper", "Lcom/huami/ai/notify/VoiceCaptureNotify;", "c", "Lkotlin/Lazy;", DTransferConstants.SEARCH_KEY, "()Lcom/huami/ai/notify/VoiceCaptureNotify;", "voiceCaptureNotify", "Lcom/huami/ai/skill/CaptionChannel;", GoogleApiAvailabilityLight.a, "e", "()Lcom/huami/ai/skill/CaptionChannel;", "captionChannel", "Lcom/huami/ai/skill/AlertSkill;", "()Lcom/huami/ai/skill/AlertSkill;", "alertSkill", "Lcom/huami/ai/skill/SetBrightnessSkill;", "f", "m", "()Lcom/huami/ai/skill/SetBrightnessSkill;", "setBrightnessSkill", "Lcom/huami/ai/skill/SystemSettingSkill;", "g", GoogleApiAvailabilityLight.b, "()Lcom/huami/ai/skill/SystemSettingSkill;", "systemSettingSkill", "Lcom/huami/ai/skill/PlayControlSkill;", "h", "l", "()Lcom/huami/ai/skill/PlayControlSkill;", "playControlSkill", "Lcom/huami/ai/skill/AudioPlaySkill;", "i", "()Lcom/huami/ai/skill/AudioPlaySkill;", "audioPlaySkill", "Lcom/huami/ai/skill/ListTemplateSkill;", z.j, "()Lcom/huami/ai/skill/ListTemplateSkill;", "listTemplateSkill", "Lcom/huami/ai/notify/EngineExceptionNotify;", "()Lcom/huami/ai/notify/EngineExceptionNotify;", "engineExceptionNotify", "Lcom/huami/ai/skill/UnSupportOperation;", "o", "()Lcom/huami/ai/skill/UnSupportOperation;", "unSupportOperation", "Lcom/huami/ai/skill/VolumeControlSkill;", SOAP.XMLNS, "()Lcom/huami/ai/skill/VolumeControlSkill;", "volumeControlSkill", "Lcom/huami/ai/skill/FindPhoneSkill;", "()Lcom/huami/ai/skill/FindPhoneSkill;", "findPhoneSkill", "Lcom/huami/ai/speech/xiaoai/interceptor/InterceptorChain;", "()Lcom/huami/ai/speech/xiaoai/interceptor/InterceptorChain;", "interceptorChain", "Lcom/huami/ai/notify/DialogState;", com.google.android.exoplayer2.text.ttml.b.r, "()Lcom/huami/ai/notify/DialogState;", "dialogState", "Lcom/huami/ai/notify/VADSendState;", "()Lcom/huami/ai/notify/VADSendState;", "vadSendState", "r", "Ljava/lang/String;", "dialogId", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "instList", "Lcom/huami/ai/helper/VoiceConfigGot;", "t", "()Lcom/huami/ai/helper/VoiceConfigGot;", "voiceConfigGot", "Z", "isAsrEmpty", "Lcom/huami/ai/speech/xiaoai/auth/XiaoMiToken;", "()Lcom/huami/ai/speech/xiaoai/auth/XiaoMiToken;", "xiaoMiToken", "", "Lkotlin/Lazy;", "Ljava/util/Map;", SportAnalytics.ParamValue.MapButtonType.MAP, "<init>", "(Lcom/xiaomi/ai/android/core/Engine;Lcom/huami/ai/speech/xiaoai/event/RecognizerEventIdKeeper;)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class InstructionCapabilityImpl extends InstructionCapability implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Engine engine;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final RecognizerEventIdKeeper startRequestIdKeeper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy voiceCaptureNotify;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy captionChannel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy alertSkill;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy setBrightnessSkill;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy systemSettingSkill;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy playControlSkill;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy audioPlaySkill;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy listTemplateSkill;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy engineExceptionNotify;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy unSupportOperation;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final Lazy volumeControlSkill;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final Lazy findPhoneSkill;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final Lazy interceptorChain;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final Lazy dialogState;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final Lazy vadSendState;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    private String dialogId;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<Instruction<Object>> instList;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private final Lazy voiceConfigGot;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private boolean isAsrEmpty;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private final Lazy xiaoMiToken;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    private final Map<String, Lazy<InstructionCapability>> map;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/instruction/AudioPlayerInstruction;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<AudioPlayerInstruction> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AudioPlayerInstruction getA() {
            return new AudioPlayerInstruction(InstructionCapabilityImpl.this.d());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/instruction/WearableControllerInstruction;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<WearableControllerInstruction> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WearableControllerInstruction getA() {
            KoinComponent koinComponent = InstructionCapabilityImpl.this;
            SpeechDevice speechDevice = (SpeechDevice) (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(SpeechDevice.class), null, null);
            KoinComponent koinComponent2 = InstructionCapabilityImpl.this;
            return new WearableControllerInstruction(speechDevice, (CustomSkill) (koinComponent2 instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent2).getScope() : koinComponent2.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(CustomSkill.class), null, null), InstructionCapabilityImpl.this.o());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/instruction/UIControllerInstruction;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<UIControllerInstruction> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UIControllerInstruction getA() {
            KoinComponent koinComponent = InstructionCapabilityImpl.this;
            return new UIControllerInstruction((NavigateSkill) (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(NavigateSkill.class), null, null));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/instruction/NFCInstruction;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<NFCInstruction> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NFCInstruction getA() {
            KoinComponent koinComponent = InstructionCapabilityImpl.this;
            return new NFCInstruction((NFCSkill) (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(NFCSkill.class), null, null));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/instruction/CombineAnswerInstruction;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<CombineAnswerInstruction> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CombineAnswerInstruction getA() {
            return new CombineAnswerInstruction(InstructionCapabilityImpl.this.e());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/instruction/AlertsInstruction;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<AlertsInstruction> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AlertsInstruction getA() {
            return new AlertsInstruction(InstructionCapabilityImpl.this.c(), InstructionCapabilityImpl.this.o());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/instruction/SystemInstruction;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<SystemInstruction> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SystemInstruction getA() {
            return new SystemInstruction(InstructionCapabilityImpl.this.n(), InstructionCapabilityImpl.this.g(), InstructionCapabilityImpl.this.q(), InstructionCapabilityImpl.this.t());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/instruction/BrightnessControllerInstruction;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<BrightnessControllerInstruction> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BrightnessControllerInstruction getA() {
            return new BrightnessControllerInstruction(InstructionCapabilityImpl.this.m());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/instruction/PlaybackControllerInstruction;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<PlaybackControllerInstruction> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PlaybackControllerInstruction getA() {
            return new PlaybackControllerInstruction(InstructionCapabilityImpl.this.l());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/instruction/TemplateInstruction;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<TemplateInstruction> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TemplateInstruction getA() {
            return new TemplateInstruction();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/instruction/SpeakerInstruction;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<SpeakerInstruction> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SpeakerInstruction getA() {
            return new SpeakerInstruction(InstructionCapabilityImpl.this.s());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/instruction/LauncherInstruction;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<LauncherInstruction> {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LauncherInstruction getA() {
            return new LauncherInstruction(InstructionCapabilityImpl.this.h());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/instruction/SuggestionInstruction;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<SuggestionInstruction> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SuggestionInstruction getA() {
            return new SuggestionInstruction(InstructionCapabilityImpl.this.j());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public static final n a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "send vad replay before end dispatcher.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public final /* synthetic */ SpeechRecognizer.RecognizeResult a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(SpeechRecognizer.RecognizeResult recognizeResult) {
            super(0);
            this.a = recognizeResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("asr final ", Boolean.valueOf(this.a.isFinal()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/instruction/SpeechRecognizerInstruction;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<SpeechRecognizerInstruction> {
        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SpeechRecognizerInstruction getA() {
            return new SpeechRecognizerInstruction(InstructionCapabilityImpl.this.q(), InstructionCapabilityImpl.this.e(), InstructionCapabilityImpl.this.g(), InstructionCapabilityImpl.this.r().getVoiceConfig());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<String> {
        public final /* synthetic */ Instruction<Object> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Instruction<Object> instruction) {
            super(0);
            this.a = instruction;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("MI AI directive: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<String> {
        public final /* synthetic */ Instruction<Object> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Instruction<Object> instruction) {
            super(0);
            this.a = instruction;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("before VAD:", this.a.getFullName());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("RecognizeStreamFinished,Dialog ID:", this.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InstructionCapabilityImpl(@NotNull Engine engine, @NotNull RecognizerEventIdKeeper recognizerEventIdKeeper) {
        this.engine = engine;
        this.startRequestIdKeeper = recognizerEventIdKeeper;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.voiceCaptureNotify = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<VoiceCaptureNotify>() { // from class: com.huami.ai.speech.xiaoai.capability.instruction.InstructionCapabilityImpl$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.notify.VoiceCaptureNotify, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final VoiceCaptureNotify getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(VoiceCaptureNotify.class), qualifier, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.captionChannel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<CaptionChannel>() { // from class: com.huami.ai.speech.xiaoai.capability.instruction.InstructionCapabilityImpl$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.skill.CaptionChannel, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final CaptionChannel getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(CaptionChannel.class), objArr4, objArr5);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.alertSkill = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<AlertSkill>() { // from class: com.huami.ai.speech.xiaoai.capability.instruction.InstructionCapabilityImpl$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.skill.AlertSkill, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final AlertSkill getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(AlertSkill.class), objArr6, objArr7);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode4 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr8 = 0 == true ? 1 : 0;
        final Object[] objArr9 = 0 == true ? 1 : 0;
        this.setBrightnessSkill = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode4, (Function0) new Function0<SetBrightnessSkill>() { // from class: com.huami.ai.speech.xiaoai.capability.instruction.InstructionCapabilityImpl$special$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.skill.SetBrightnessSkill, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final SetBrightnessSkill getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(SetBrightnessSkill.class), objArr8, objArr9);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode5 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr10 = 0 == true ? 1 : 0;
        final Object[] objArr11 = 0 == true ? 1 : 0;
        this.systemSettingSkill = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode5, (Function0) new Function0<SystemSettingSkill>() { // from class: com.huami.ai.speech.xiaoai.capability.instruction.InstructionCapabilityImpl$special$$inlined$inject$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.skill.SystemSettingSkill, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final SystemSettingSkill getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(SystemSettingSkill.class), objArr10, objArr11);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode6 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr12 = 0 == true ? 1 : 0;
        final Object[] objArr13 = 0 == true ? 1 : 0;
        this.playControlSkill = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode6, (Function0) new Function0<PlayControlSkill>() { // from class: com.huami.ai.speech.xiaoai.capability.instruction.InstructionCapabilityImpl$special$$inlined$inject$default$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.skill.PlayControlSkill, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final PlayControlSkill getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(PlayControlSkill.class), objArr12, objArr13);
            }
        });
        Koin koin = KoinHelperKt.getKoin();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode7 = koinPlatformTools.defaultLazyMode();
        final Scope rootScope = koin.getScopeRegistry().getRootScope();
        final Object[] objArr14 = 0 == true ? 1 : 0;
        final Object[] objArr15 = 0 == true ? 1 : 0;
        this.audioPlaySkill = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode7, (Function0) new Function0<AudioPlaySkill>() { // from class: com.huami.ai.speech.xiaoai.capability.instruction.InstructionCapabilityImpl$special$$inlined$injectOrNull$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.ai.skill.AudioPlaySkill, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke */
            public final AudioPlaySkill getA() {
                return rootScope.getOrNull(Reflection.getOrCreateKotlinClass(AudioPlaySkill.class), objArr14, objArr15);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode8 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr16 = 0 == true ? 1 : 0;
        final Object[] objArr17 = 0 == true ? 1 : 0;
        this.listTemplateSkill = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode8, (Function0) new Function0<ListTemplateSkill>() { // from class: com.huami.ai.speech.xiaoai.capability.instruction.InstructionCapabilityImpl$special$$inlined$inject$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.skill.ListTemplateSkill, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ListTemplateSkill getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(ListTemplateSkill.class), objArr16, objArr17);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode9 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr18 = 0 == true ? 1 : 0;
        final Object[] objArr19 = 0 == true ? 1 : 0;
        this.engineExceptionNotify = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode9, (Function0) new Function0<EngineExceptionNotify>() { // from class: com.huami.ai.speech.xiaoai.capability.instruction.InstructionCapabilityImpl$special$$inlined$inject$default$8
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
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(EngineExceptionNotify.class), objArr18, objArr19);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode10 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr20 = 0 == true ? 1 : 0;
        final Object[] objArr21 = 0 == true ? 1 : 0;
        this.unSupportOperation = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode10, (Function0) new Function0<UnSupportOperation>() { // from class: com.huami.ai.speech.xiaoai.capability.instruction.InstructionCapabilityImpl$special$$inlined$inject$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.skill.UnSupportOperation, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final UnSupportOperation getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(UnSupportOperation.class), objArr20, objArr21);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode11 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr22 = 0 == true ? 1 : 0;
        final Object[] objArr23 = 0 == true ? 1 : 0;
        this.volumeControlSkill = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode11, (Function0) new Function0<VolumeControlSkill>() { // from class: com.huami.ai.speech.xiaoai.capability.instruction.InstructionCapabilityImpl$special$$inlined$inject$default$10
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.skill.VolumeControlSkill, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final VolumeControlSkill getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(VolumeControlSkill.class), objArr22, objArr23);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode12 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr24 = 0 == true ? 1 : 0;
        final Object[] objArr25 = 0 == true ? 1 : 0;
        this.findPhoneSkill = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode12, (Function0) new Function0<FindPhoneSkill>() { // from class: com.huami.ai.speech.xiaoai.capability.instruction.InstructionCapabilityImpl$special$$inlined$inject$default$11
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.skill.FindPhoneSkill, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final FindPhoneSkill getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(FindPhoneSkill.class), objArr24, objArr25);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode13 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr26 = 0 == true ? 1 : 0;
        final Object[] objArr27 = 0 == true ? 1 : 0;
        this.interceptorChain = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode13, (Function0) new Function0<InterceptorChain>() { // from class: com.huami.ai.speech.xiaoai.capability.instruction.InstructionCapabilityImpl$special$$inlined$inject$default$12
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.speech.xiaoai.interceptor.InterceptorChain, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final InterceptorChain getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(InterceptorChain.class), objArr26, objArr27);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode14 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr28 = 0 == true ? 1 : 0;
        final Object[] objArr29 = 0 == true ? 1 : 0;
        this.dialogState = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode14, (Function0) new Function0<DialogState>() { // from class: com.huami.ai.speech.xiaoai.capability.instruction.InstructionCapabilityImpl$special$$inlined$inject$default$13
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
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DialogState.class), objArr28, objArr29);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode15 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr30 = 0 == true ? 1 : 0;
        final Object[] objArr31 = 0 == true ? 1 : 0;
        this.vadSendState = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode15, (Function0) new Function0<VADSendState>() { // from class: com.huami.ai.speech.xiaoai.capability.instruction.InstructionCapabilityImpl$special$$inlined$inject$default$14
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.notify.VADSendState, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final VADSendState getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(VADSendState.class), objArr30, objArr31);
            }
        });
        this.instList = new ArrayList<>();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode16 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr32 = 0 == true ? 1 : 0;
        final Object[] objArr33 = 0 == true ? 1 : 0;
        this.voiceConfigGot = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode16, (Function0) new Function0<VoiceConfigGot>() { // from class: com.huami.ai.speech.xiaoai.capability.instruction.InstructionCapabilityImpl$special$$inlined$inject$default$15
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
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(VoiceConfigGot.class), objArr32, objArr33);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode17 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr34 = 0 == true ? 1 : 0;
        final Object[] objArr35 = 0 == true ? 1 : 0;
        this.xiaoMiToken = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode17, (Function0) new Function0<XiaoMiToken>() { // from class: com.huami.ai.speech.xiaoai.capability.instruction.InstructionCapabilityImpl$special$$inlined$inject$default$16
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
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(XiaoMiToken.class), objArr34, objArr35);
            }
        });
        Map<String, Lazy<InstructionCapability>> mapMutableMapOf = kotlin.collections.r.mutableMapOf(TuplesKt.to("SpeechRecognizer", LazyKt__LazyJVMKt.lazy(new p())));
        this.map = mapMutableMapOf;
        if (VoiceConfigFuncKt.needTTSText(r().getVoiceConfig())) {
            mapMutableMapOf.put(CombineAnswer.NAME_SPACE, LazyKt__LazyJVMKt.lazy(new e()));
        }
        if (VoiceConfigFuncKt.needNLP(r().getVoiceConfig())) {
            mapMutableMapOf.put("Alerts", LazyKt__LazyJVMKt.lazy(new f()));
            mapMutableMapOf.put("System", LazyKt__LazyJVMKt.lazy(new g()));
            mapMutableMapOf.put(AIApiConstants.BrightnessController.NAME, LazyKt__LazyJVMKt.lazy(new h()));
            LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode18 = koinPlatformTools.defaultLazyMode();
            final Object[] objArr36 = objArr2 == true ? 1 : 0;
            final Object[] objArr37 = objArr == true ? 1 : 0;
            mapMutableMapOf.put(AIApiConstants.CustomDirective.NAME, LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode18, (Function0) new Function0<CustomInstruction>() { // from class: com.huami.ai.speech.xiaoai.capability.instruction.InstructionCapabilityImpl$special$$inlined$inject$default$17
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.speech.xiaoai.capability.instruction.custom.CustomInstruction, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: invoke */
                public final CustomInstruction getA() {
                    KoinComponent koinComponent = this;
                    return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(CustomInstruction.class), objArr36, objArr37);
                }
            }));
            mapMutableMapOf.put("PlaybackController", LazyKt__LazyJVMKt.lazy(new i()));
            mapMutableMapOf.put(AIApiConstants.Template.NAME, LazyKt__LazyJVMKt.lazy(j.a));
            mapMutableMapOf.put("Speaker", LazyKt__LazyJVMKt.lazy(new k()));
            mapMutableMapOf.put(AIApiConstants.Launcher.NAME, LazyKt__LazyJVMKt.lazy(new l()));
            if (VoiceConfigFuncKt.needSuggestion(r().getVoiceConfig())) {
                mapMutableMapOf.put(AIApiConstants.Suggestion.NAME, LazyKt__LazyJVMKt.lazy(new m()));
            }
            if (VoiceConfigFuncKt.needNews(r().getVoiceConfig())) {
                mapMutableMapOf.put("AudioPlayer", LazyKt__LazyJVMKt.lazy(new a()));
            }
            mapMutableMapOf.put(AIApiConstants.WearableController.NAME, LazyKt__LazyJVMKt.lazy(new b()));
            mapMutableMapOf.put(AIApiConstants.UIController.NAME, LazyKt__LazyJVMKt.lazy(new c()));
            mapMutableMapOf.put(AIApiConstants.NFC.NAME, LazyKt__LazyJVMKt.lazy(new d()));
        }
    }

    private final boolean a() {
        return VoiceConfigFuncKt.needASR(r().getVoiceConfig()) && !this.isAsrEmpty;
    }

    private final boolean b(Instruction<Object> instruction) {
        if (this.dialogId == null) {
            return true;
        }
        return !Intrinsics.areEqual(k(instruction.getDialogId()), this.dialogId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AlertSkill c() {
        return (AlertSkill) this.alertSkill.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AudioPlaySkill d() {
        return (AudioPlaySkill) this.audioPlaySkill.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CaptionChannel e() {
        return (CaptionChannel) this.captionChannel.getValue();
    }

    private final DialogState f() {
        return (DialogState) this.dialogState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EngineExceptionNotify g() {
        return (EngineExceptionNotify) this.engineExceptionNotify.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FindPhoneSkill h() {
        return (FindPhoneSkill) this.findPhoneSkill.getValue();
    }

    private final InterceptorChain i() {
        return (InterceptorChain) this.interceptorChain.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ListTemplateSkill j() {
        return (ListTemplateSkill) this.listTemplateSkill.getValue();
    }

    private final String k(Optional<String> optional) {
        return optional.isPresent() ? optional.get() : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PlayControlSkill l() {
        return (PlayControlSkill) this.playControlSkill.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SetBrightnessSkill m() {
        return (SetBrightnessSkill) this.setBrightnessSkill.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SystemSettingSkill n() {
        return (SystemSettingSkill) this.systemSettingSkill.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UnSupportOperation o() {
        return (UnSupportOperation) this.unSupportOperation.getValue();
    }

    private final VADSendState p() {
        return (VADSendState) this.vadSendState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VoiceCaptureNotify q() {
        return (VoiceCaptureNotify) this.voiceCaptureNotify.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VoiceConfigGot r() {
        return (VoiceConfigGot) this.voiceConfigGot.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VolumeControlSkill s() {
        return (VolumeControlSkill) this.volumeControlSkill.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final XiaoMiToken t() {
        return (XiaoMiToken) this.xiaoMiToken.getValue();
    }

    private final void u() {
        InstructionCapability value;
        f().set(4);
        boolean zW = w(this.instList);
        Iterator<T> it2 = i().interceptor(this.instList).iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Instruction instruction = (Instruction) it2.next();
            Lazy<InstructionCapability> lazy = this.map.get(instruction.getNamespace());
            if ((lazy == null || (value = lazy.getValue()) == null || !value.process(instruction)) ? false : true) {
                i2++;
            }
        }
        if (a() && x(i2, zW)) {
            o().doUnSupport();
        }
        this.instList.clear();
        f().set(5);
        if (p().compareAndSet(3, 1)) {
            f().set(0);
            HMLog.info("speech", n.a);
        }
    }

    private final boolean v(Instruction<Object> instruction) {
        InstructionCapability value;
        if (f().get() == 1) {
            Lazy<InstructionCapability> lazy = this.map.get(instruction.getNamespace());
            if (lazy == null || (value = lazy.getValue()) == null) {
                return false;
            }
            return value.process(instruction);
        }
        Object payload = instruction.getPayload();
        Objects.requireNonNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.SpeechRecognizer.RecognizeResult");
        SpeechRecognizer.RecognizeResult recognizeResult = (SpeechRecognizer.RecognizeResult) payload;
        HMLog.info("speech", new o(recognizeResult));
        boolean z = recognizeResult.getResults().get(0).getText().length() == 0;
        this.isAsrEmpty = z;
        if (!z) {
            return true;
        }
        g().engineException(9);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:11:0x0024 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    private final boolean w(List<? extends Instruction<Object>> insList) {
        Function1<Instruction<Object>, Boolean> checkWeatherInstruction = CheckInstructionKt.getCheckWeatherInstruction();
        for (Object obj : insList) {
            if (((Boolean) checkWeatherInstruction.invoke(obj)).booleanValue()) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    private final boolean x(int executeCount, boolean hasWeatherInstruction) {
        return executeCount == 0 && VoiceConfigFuncKt.needNLP(r().getVoiceConfig()) && !hasWeatherInstruction;
    }

    private final void y(String id) {
        HMLog.info("speech", new s(id));
        this.engine.postEvent(APIUtils.buildEvent(new SpeechRecognizer.RecognizeStreamFinished(), null, id));
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.ai.android.capability.InstructionCapability
    public boolean process(@NotNull Instruction<Object> instruction) {
        InstructionCapability value;
        HMLog.info("speech", new q(instruction));
        if (b(instruction)) {
            this.dialogId = k(instruction.getDialogId());
            this.instList.clear();
        }
        if (CheckInstructionKt.getCheckRecognizeResultInstruction().invoke(instruction).booleanValue()) {
            return v(instruction);
        }
        if (CheckInstructionKt.getCheckVADInstruction().invoke(instruction).booleanValue()) {
            if (f().compareAndSet(1, 2)) {
                y(this.startRequestIdKeeper.getStartRequestId());
                Lazy<InstructionCapability> lazy = this.map.get(instruction.getNamespace());
                if (lazy == null || (value = lazy.getValue()) == null) {
                    return false;
                }
                return value.process(instruction);
            }
            if (f().get() >= 2) {
                return true;
            }
        }
        if (f().get() < 2) {
            HMLog.info("speech", new r(instruction));
            return false;
        }
        this.instList.add(instruction);
        if (CheckInstructionKt.getCheckFinishInstruction().invoke(instruction).booleanValue()) {
            u();
        }
        return false;
    }
}
