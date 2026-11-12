package com.huami.ai.koin.common;

import com.huami.ai.entity.audioplay.AudioData;
import com.huami.ai.entity.audioplay.AudioItem;
import com.huami.ai.skill.AudioPlaySkill;
import com.huami.ai.uitls.DeviceUtilsKt;
import com.huami.bluetooth.profile.channel.module.voice.command.NLPCommand;
import com.huami.bluetooth.profile.channel.module.voice.content.NewsContent;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/ai/koin/common/NewBleAudioPlaySkillImpl;", "Lcom/huami/ai/skill/AudioPlaySkill;", "Lcom/huami/ai/entity/audioplay/AudioData;", "audioData", "", "playAudio", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "a", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "baseDevice", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;)V", "speech-skill_release"}, k = 1, mv = {1, 5, 1})
public final class NewBleAudioPlaySkillImpl implements AudioPlaySkill {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HMBaseDevice baseDevice;

    public NewBleAudioPlaySkillImpl(@NotNull HMBaseDevice hMBaseDevice) {
        this.baseDevice = hMBaseDevice;
    }

    @Override // com.huami.ai.skill.AudioPlaySkill
    public void playAudio(@NotNull AudioData audioData) {
        ArrayList arrayList = new ArrayList();
        for (AudioItem audioItem : audioData.getAudioItems()) {
            arrayList.add(new NewsContent.Item(audioItem.getAudioId(), "", audioItem.getAudioUrl()));
        }
        DeviceUtilsKt.sendCommand$default(this.baseDevice, new NLPCommand(new NewsContent("", arrayList)), null, 2, null);
    }
}
