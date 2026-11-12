package com.huami.ai.speech.xiaoai.capability.skill;

import com.huami.ai.helper.DeviceSpeechID;
import com.huami.ai.helper.SpeechDevice;
import com.huami.ai.skill.SetBrightnessSkill;
import com.xiaomi.hm.health.bt.profile.speech.HMSpeechInfo;
import com.xiaomi.hm.health.bt.profile.speech.OpenContent;
import com.xiaomi.hm.health.bt.profile.speech.SpeechType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/skill/SetBrightnessSkillImpl;", "Lcom/huami/ai/skill/SetBrightnessSkill;", "Lcom/xiaomi/hm/health/bt/profile/speech/OpenContent$BrightnessContent;", "brightnessContent", "", "a", "", "delta", "setBrightnessDelta", "percent", "setBrightnessPercent", "openBrightnessPage", "Lcom/huami/ai/helper/SpeechDevice;", "Lcom/huami/ai/helper/SpeechDevice;", "baseDevice", "Lcom/huami/ai/helper/DeviceSpeechID;", "b", "Lcom/huami/ai/helper/DeviceSpeechID;", "deviceSpeechID", "<init>", "(Lcom/huami/ai/helper/SpeechDevice;Lcom/huami/ai/helper/DeviceSpeechID;)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class SetBrightnessSkillImpl implements SetBrightnessSkill {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SpeechDevice baseDevice;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final DeviceSpeechID deviceSpeechID;

    public SetBrightnessSkillImpl(@NotNull SpeechDevice speechDevice, @NotNull DeviceSpeechID deviceSpeechID) {
        this.baseDevice = speechDevice;
        this.deviceSpeechID = deviceSpeechID;
    }

    private final boolean a(OpenContent.BrightnessContent brightnessContent) {
        if (brightnessContent == null) {
            return false;
        }
        OpenContent openContent = new OpenContent((byte) 15);
        openContent.setParam(brightnessContent);
        return this.baseDevice.sendSpeechInfoSync(new HMSpeechInfo(this.deviceSpeechID.getId(), SpeechType.OPEN, openContent));
    }

    @Override // com.huami.ai.skill.SetBrightnessSkill
    public boolean openBrightnessPage() {
        return a(new OpenContent.BrightnessContent((byte) 32));
    }

    @Override // com.huami.ai.skill.SetBrightnessSkill
    public boolean setBrightnessDelta(int delta) {
        int i = delta > 0 ? 1 : -1;
        OpenContent.BrightnessContent brightnessContent = new OpenContent.BrightnessContent((byte) 1);
        brightnessContent.setBrightnessDelta((byte) i);
        return a(brightnessContent);
    }

    @Override // com.huami.ai.skill.SetBrightnessSkill
    public boolean setBrightnessPercent(int percent) {
        OpenContent.BrightnessContent brightnessContent = new OpenContent.BrightnessContent((byte) 2);
        brightnessContent.setBrightnessPercent((byte) percent);
        return a(brightnessContent);
    }
}
