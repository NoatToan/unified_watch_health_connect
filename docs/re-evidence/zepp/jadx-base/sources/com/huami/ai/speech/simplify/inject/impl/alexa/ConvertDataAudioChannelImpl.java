package com.huami.ai.speech.simplify.inject.impl.alexa;

import android.content.Context;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ai.helper.VoiceConfigFuncKt;
import com.huami.ai.notify.DialogState;
import com.huami.ai.skill.AudioChannel;
import com.huami.ai.speech.simplify.inject.SwitchConfig;
import com.huami.ai.speech.simplify.inject.impl.alexa.ConvertDataAudioChannelImpl;
import com.huami.ai.speech.simplify.opus.OpusDataCallback;
import com.huami.ai.speech.simplify.opus.PcmEncodeToOpus;
import com.huami.ai.speech.simplify.utils.AudioSave;
import com.huami.ai.uitls.DeviceUtilsKt;
import com.huami.bluetooth.profile.channel.module.voice.VoiceConfig;
import com.huami.bluetooth.profile.channel.module.voice.command.TTSAudioCommand;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.xiaomiai.alexa.resample.ReSample;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000u\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001.\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b6\u00107J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u001e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001d\u0010)\u001a\u00020%8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u0014\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00068"}, d2 = {"Lcom/huami/ai/speech/simplify/inject/impl/alexa/ConvertDataAudioChannelImpl;", "Lcom/huami/ai/skill/AudioChannel;", "Lorg/koin/core/component/KoinComponent;", "", GoogleApiAvailabilityLight.a, "b", "", "audio", "", "isFinal", "playAudio", "Lkotlin/Function0;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "a", "Lkotlin/jvm/functions/Function0;", "deviceFunc", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "c", "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "voiceConfig", "Lcom/huami/ai/notify/DialogState;", "Lcom/huami/ai/notify/DialogState;", "dialogState", "e", "[B", "opusData", "", "f", LogUtil.I, "arraySize", "", "g", "Ljava/lang/Object;", "lock", "Lcom/huami/ai/speech/simplify/inject/SwitchConfig;", "h", "Lkotlin/Lazy;", "()Lcom/huami/ai/speech/simplify/inject/SwitchConfig;", "switchConfig", "Lcom/huami/ai/speech/simplify/utils/AudioSave;", "i", "Lcom/huami/ai/speech/simplify/utils/AudioSave;", "audioSave", "com/huami/ai/speech/simplify/inject/impl/alexa/ConvertDataAudioChannelImpl$opusDataCallback$1", z.j, "Lcom/huami/ai/speech/simplify/inject/impl/alexa/ConvertDataAudioChannelImpl$opusDataCallback$1;", "opusDataCallback", "Lcom/huami/ai/speech/simplify/opus/PcmEncodeToOpus;", hl.k, "Lcom/huami/ai/speech/simplify/opus/PcmEncodeToOpus;", "pcmEncodeToOpus", "<init>", "(Lkotlin/jvm/functions/Function0;Landroid/content/Context;Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;Lcom/huami/ai/notify/DialogState;)V", "speech-simplify_release"}, k = 1, mv = {1, 5, 1})
public final class ConvertDataAudioChannelImpl implements AudioChannel, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function0<HMBaseDevice> deviceFunc;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final VoiceConfig voiceConfig;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final DialogState dialogState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private byte[] opusData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int arraySize;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Object lock;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy switchConfig;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private AudioSave audioSave;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final ConvertDataAudioChannelImpl$opusDataCallback$1 opusDataCallback;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final PcmEncodeToOpus pcmEncodeToOpus;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("dialog state:", Integer.valueOf(ConvertDataAudioChannelImpl.this.dialogState.get()));
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
        public final String invoke() {
            return "取消TTS Audio发送";
        }
    }

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
        public final String invoke() {
            return Intrinsics.stringPlus("将Alexa的TTS语音流编码成OPUS失败。", this.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.huami.ai.speech.simplify.inject.impl.alexa.ConvertDataAudioChannelImpl$opusDataCallback$1, com.huami.ai.speech.simplify.opus.OpusDataCallback] */
    public ConvertDataAudioChannelImpl(@NotNull Function0<? extends HMBaseDevice> function0, @NotNull Context context, @NotNull VoiceConfig voiceConfig, @NotNull DialogState dialogState) {
        this.deviceFunc = function0;
        this.context = context;
        this.voiceConfig = voiceConfig;
        this.dialogState = dialogState;
        ReSample.loadLibrary();
        this.lock = new Object();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.switchConfig = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<SwitchConfig>() { // from class: com.huami.ai.speech.simplify.inject.impl.alexa.ConvertDataAudioChannelImpl$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.speech.simplify.inject.SwitchConfig, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SwitchConfig invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(SwitchConfig.class), qualifier, objArr);
            }
        });
        ?? r1 = new OpusDataCallback() { // from class: com.huami.ai.speech.simplify.inject.impl.alexa.ConvertDataAudioChannelImpl$opusDataCallback$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public static final a a = new a();

                public a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "final opus data";
                }
            }

            @Override // com.huami.ai.speech.simplify.opus.OpusDataCallback
            public void onAudioData(@NotNull byte[] byteArray, boolean isFinal) throws IOException {
                this.a.b();
                if (this.a.arraySize + byteArray.length > VoiceConfigFuncKt.ttsAudioSize(this.a.voiceConfig)) {
                    byte[] bArr = this.a.opusData;
                    Objects.requireNonNull(bArr);
                    TTSAudioCommand tTSAudioCommand = new TTSAudioCommand(false, Arrays.copyOf(bArr, this.a.arraySize));
                    HMBaseDevice hMBaseDevice = (HMBaseDevice) this.a.deviceFunc.invoke();
                    if (hMBaseDevice != null) {
                        DeviceUtilsKt.sendCommandSync$default(hMBaseDevice, tTSAudioCommand, null, 2, null);
                    }
                    ConvertDataAudioChannelImpl convertDataAudioChannelImpl = this.a;
                    convertDataAudioChannelImpl.opusData = new byte[VoiceConfigFuncKt.ttsAudioSize(convertDataAudioChannelImpl.voiceConfig)];
                    this.a.arraySize = 0;
                }
                byte[] bArr2 = this.a.opusData;
                Objects.requireNonNull(bArr2);
                System.arraycopy(byteArray, 0, bArr2, this.a.arraySize, byteArray.length);
                this.a.arraySize += byteArray.length;
                if (isFinal) {
                    HMLog.info("speech", a.a);
                    byte[] bArr3 = this.a.opusData;
                    Objects.requireNonNull(bArr3);
                    TTSAudioCommand tTSAudioCommand2 = new TTSAudioCommand(isFinal, Arrays.copyOf(bArr3, this.a.arraySize));
                    HMBaseDevice hMBaseDevice2 = (HMBaseDevice) this.a.deviceFunc.invoke();
                    if (hMBaseDevice2 != null) {
                        DeviceUtilsKt.sendCommandSync$default(hMBaseDevice2, tTSAudioCommand2, null, 2, null);
                    }
                }
                AudioSave audioSave = this.a.audioSave;
                if (audioSave == null) {
                    return;
                }
                audioSave.saveAudio(byteArray);
            }
        };
        this.opusDataCallback = r1;
        this.pcmEncodeToOpus = new PcmEncodeToOpus(r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        HMLog.info("speech", new a());
        if (this.dialogState.get() == 1) {
            this.pcmEncodeToOpus.cancelEncode();
            HMLog.info("speech", b.a);
        }
    }

    private final SwitchConfig c() {
        return (SwitchConfig) this.switchConfig.getValue();
    }

    private final void d() {
        if (c().getSaveAudio()) {
            if (this.audioSave == null) {
                this.audioSave = new AudioSave();
            }
            AudioSave audioSave = this.audioSave;
            if (audioSave == null) {
                return;
            }
            audioSave.createFile(this.context, "opus");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(ConvertDataAudioChannelImpl convertDataAudioChannelImpl, byte[] bArr) {
        Object objM3845constructorimpl;
        synchronized (convertDataAudioChannelImpl.lock) {
            try {
                Result.Companion companion = Result.Companion;
                convertDataAudioChannelImpl.d();
                convertDataAudioChannelImpl.opusData = new byte[VoiceConfigFuncKt.ttsAudioSize(convertDataAudioChannelImpl.voiceConfig)];
                convertDataAudioChannelImpl.arraySize = 0;
                convertDataAudioChannelImpl.pcmEncodeToOpus.encode(new ByteArrayInputStream(bArr));
                objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.error$default(null, null, null, new c(thM3848exceptionOrNullimpl), 7, null);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.ai.skill.AudioChannel
    public void playAudio(@NotNull final byte[] audio, boolean isFinal) {
        Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: zz0
            @Override // java.lang.Runnable
            public final void run() {
                ConvertDataAudioChannelImpl.e(this.a, audio);
            }
        });
    }
}
