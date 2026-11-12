package com.huami.ai.speech.alexa.capability.synthesizer;

import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ai.helper.VoiceConfigFuncKt;
import com.huami.ai.skill.AudioChannel;
import com.huami.ai.skill.CaptionChannel;
import com.huami.ai.speech.alexa.entity.AudioContent;
import com.huami.ai.speech.alexa.entity.payload.SpeakPayload;
import com.huami.bluetooth.profile.channel.module.voice.VoiceConfig;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/huami/ai/speech/alexa/capability/synthesizer/SpeechSynthesizerDirectiveImpl;", "Lcom/huami/ai/speech/alexa/capability/synthesizer/SpeechSynthesizerDirective;", "Lcom/huami/ai/speech/alexa/entity/payload/SpeakPayload;", "payload", "", "speak", "Lcom/huami/ai/skill/CaptionChannel;", "a", "Lcom/huami/ai/skill/CaptionChannel;", "captionChannel", "Lcom/huami/ai/skill/AudioChannel;", "b", "Lcom/huami/ai/skill/AudioChannel;", "audioChannel", "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "c", "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "voiceConfig", "Lcom/huami/ai/speech/alexa/capability/synthesizer/SpeechSynthesizerEvent;", GoogleApiAvailabilityLight.a, "Lcom/huami/ai/speech/alexa/capability/synthesizer/SpeechSynthesizerEvent;", "speechSynthesizerEvent", "<init>", "(Lcom/huami/ai/skill/CaptionChannel;Lcom/huami/ai/skill/AudioChannel;Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;Lcom/huami/ai/speech/alexa/capability/synthesizer/SpeechSynthesizerEvent;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class SpeechSynthesizerDirectiveImpl implements SpeechSynthesizerDirective {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CaptionChannel captionChannel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final AudioChannel audioChannel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final VoiceConfig voiceConfig;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final SpeechSynthesizerEvent speechSynthesizerEvent;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "config not need tts audio";
        }
    }

    public SpeechSynthesizerDirectiveImpl(@NotNull CaptionChannel captionChannel, @Nullable AudioChannel audioChannel, @NotNull VoiceConfig voiceConfig, @NotNull SpeechSynthesizerEvent speechSynthesizerEvent) {
        this.captionChannel = captionChannel;
        this.audioChannel = audioChannel;
        this.voiceConfig = voiceConfig;
        this.speechSynthesizerEvent = speechSynthesizerEvent;
    }

    @Override // com.huami.ai.speech.alexa.capability.synthesizer.SpeechSynthesizerDirective
    public void speak(@NotNull SpeakPayload payload) {
        if (VoiceConfigFuncKt.needTTSText(this.voiceConfig) && payload.getCaption() != null) {
            if ((payload.getCaption().getContent().length() > 0) || TextUtils.isEmpty(payload.getUrl())) {
                this.captionChannel.showCaption(payload.getCaption().getContent());
            }
        }
        if (!VoiceConfigFuncKt.needTTSAudio(this.voiceConfig)) {
            HMLog.info("speech", a.a);
            return;
        }
        AudioContent audio = payload.getAudio();
        if (audio == null) {
            return;
        }
        this.speechSynthesizerEvent.speechStarted(payload.getToken());
        AudioChannel audioChannel = this.audioChannel;
        if (audioChannel == null) {
            return;
        }
        AudioChannel.DefaultImpls.playAudio$default(audioChannel, ByteStreamsKt.readBytes(audio.getCom.xiaomi.ai.core.AivsConfig.Tts.AUDIO_TYPE_STREAM java.lang.String()), false, 2, null);
    }
}
