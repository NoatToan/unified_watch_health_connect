package com.huami.ai.speech.xiaoai.capability.skill;

import com.huami.ai.helper.DeviceSpeechID;
import com.huami.ai.helper.SpeechDevice;
import com.huami.ai.skill.PlayControlSkill;
import com.huami.watch.companion.mediac.Command;
import com.xiaomi.hm.health.bt.profile.speech.HMSpeechInfo;
import com.xiaomi.hm.health.bt.profile.speech.OpenContent;
import com.xiaomi.hm.health.bt.profile.speech.SpeechType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/skill/OldBlePlayControlSkillImpl;", "Lcom/huami/ai/skill/PlayControlSkill;", "", "option", "", "a", "next", "prev", "start", Command.STOP, "Lcom/huami/ai/helper/SpeechDevice;", "Lcom/huami/ai/helper/SpeechDevice;", "baseDevice", "Lcom/huami/ai/helper/DeviceSpeechID;", "b", "Lcom/huami/ai/helper/DeviceSpeechID;", "deviceSpeechID", "<init>", "(Lcom/huami/ai/helper/SpeechDevice;Lcom/huami/ai/helper/DeviceSpeechID;)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class OldBlePlayControlSkillImpl implements PlayControlSkill {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SpeechDevice baseDevice;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final DeviceSpeechID deviceSpeechID;

    public OldBlePlayControlSkillImpl(@NotNull SpeechDevice speechDevice, @NotNull DeviceSpeechID deviceSpeechID) {
        this.baseDevice = speechDevice;
        this.deviceSpeechID = deviceSpeechID;
    }

    private final boolean a(byte option) {
        OpenContent.MusicContent musicContent = new OpenContent.MusicContent(option);
        OpenContent openContent = new OpenContent((byte) 9);
        openContent.setParam(musicContent);
        return this.baseDevice.sendSpeechInfoSync(new HMSpeechInfo(this.deviceSpeechID.getId(), SpeechType.OPEN, openContent));
    }

    @Override // com.huami.ai.skill.PlayControlSkill
    public boolean next() {
        return a((byte) 3);
    }

    @Override // com.huami.ai.skill.PlayControlSkill
    public boolean prev() {
        return a((byte) 4);
    }

    @Override // com.huami.ai.skill.PlayControlSkill
    public boolean start() {
        return a((byte) 0);
    }

    @Override // com.huami.ai.skill.PlayControlSkill
    public boolean stop() {
        return a((byte) 1);
    }
}
