package com.huami.ai.speech.xiaoai.capability.skill;

import com.huami.ai.helper.SpeechDevice;
import com.huami.ai.skill.SetBrightnessSkill;
import com.huami.bluetooth.profile.channel.module.voice.command.NLPCommand;
import com.huami.bluetooth.profile.channel.module.voice.content.OpenAppContent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/skill/NewSetBrightnessSkillImpl;", "Lcom/huami/ai/skill/SetBrightnessSkill;", "", "delta", "", "setBrightnessDelta", "percent", "setBrightnessPercent", "openBrightnessPage", "Lcom/huami/ai/helper/SpeechDevice;", "a", "Lcom/huami/ai/helper/SpeechDevice;", "baseDevice", "<init>", "(Lcom/huami/ai/helper/SpeechDevice;)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class NewSetBrightnessSkillImpl implements SetBrightnessSkill {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SpeechDevice baseDevice;

    public NewSetBrightnessSkillImpl(@NotNull SpeechDevice speechDevice) {
        this.baseDevice = speechDevice;
    }

    @Override // com.huami.ai.skill.SetBrightnessSkill
    public boolean openBrightnessPage() {
        return SpeechDevice.DefaultImpls.sendCommand$default(this.baseDevice, new NLPCommand(new OpenAppContent(15, new OpenAppContent.BrightnessParameter(0, null, null, 6, null))), null, 2, null);
    }

    @Override // com.huami.ai.skill.SetBrightnessSkill
    public boolean setBrightnessDelta(int delta) {
        return SpeechDevice.DefaultImpls.sendCommand$default(this.baseDevice, new NLPCommand(new OpenAppContent(15, new OpenAppContent.BrightnessParameter(1, Integer.valueOf(delta), null, 4, null))), null, 2, null);
    }

    @Override // com.huami.ai.skill.SetBrightnessSkill
    public boolean setBrightnessPercent(int percent) {
        return SpeechDevice.DefaultImpls.sendCommand$default(this.baseDevice, new NLPCommand(new OpenAppContent(15, new OpenAppContent.BrightnessParameter(2, null, Integer.valueOf(percent), 2, null))), null, 2, null);
    }
}
