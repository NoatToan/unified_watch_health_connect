package com.huami.ai.speech.xiaoai.capability;

import com.huami.ai.skill.AudioChannel;
import com.xiaomi.ai.android.capability.SpeechSynthesizerCapability;
import kotlin.Metadata;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/SpeechSynthesizerCapabilityImpl;", "Lcom/xiaomi/ai/android/capability/SpeechSynthesizerCapability;", "Lorg/koin/core/component/KoinComponent;", "", "p0", "", "onPlayStart", "", HTTP.CONTENT_RANGE_BYTES, "onPcmData", "onPlayFinish", "Lcom/huami/ai/skill/AudioChannel;", "a", "Lcom/huami/ai/skill/AudioChannel;", "audioChannel", "<init>", "(Lcom/huami/ai/skill/AudioChannel;)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class SpeechSynthesizerCapabilityImpl extends SpeechSynthesizerCapability implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AudioChannel audioChannel;

    public SpeechSynthesizerCapabilityImpl(@NotNull AudioChannel audioChannel) {
        this.audioChannel = audioChannel;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.ai.android.capability.SpeechSynthesizerCapability
    public void onPcmData(@Nullable byte[] bytes) {
        if (bytes == null) {
            return;
        }
        this.audioChannel.playAudio(bytes, false);
    }

    @Override // com.xiaomi.ai.android.capability.SpeechSynthesizerCapability
    public void onPlayFinish() {
        AudioChannel.DefaultImpls.playAudio$default(this.audioChannel, new byte[0], false, 2, null);
    }

    @Override // com.xiaomi.ai.android.capability.SpeechSynthesizerCapability
    public void onPlayStart(int p0) {
    }
}
