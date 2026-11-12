package com.huami.ai.koin.common;

import com.huami.ai.helper.DeviceSpeechID;
import com.huami.ai.skill.FindPhoneSkill;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.speech.HMSpeechInfo;
import com.xiaomi.hm.health.bt.profile.speech.OpenContent;
import com.xiaomi.hm.health.bt.profile.speech.SpeechType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/ai/koin/common/FindPhoneSkillImpl;", "Lcom/huami/ai/skill/FindPhoneSkill;", "", "findPhone", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "a", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "baseDevice", "Lcom/huami/ai/helper/DeviceSpeechID;", "b", "Lcom/huami/ai/helper/DeviceSpeechID;", "deviceSpeechID", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;Lcom/huami/ai/helper/DeviceSpeechID;)V", "speech-skill_release"}, k = 1, mv = {1, 5, 1})
public final class FindPhoneSkillImpl implements FindPhoneSkill {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HMBaseDevice baseDevice;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final DeviceSpeechID deviceSpeechID;

    public FindPhoneSkillImpl(@NotNull HMBaseDevice hMBaseDevice, @NotNull DeviceSpeechID deviceSpeechID) {
        this.baseDevice = hMBaseDevice;
        this.deviceSpeechID = deviceSpeechID;
    }

    @Override // com.huami.ai.skill.FindPhoneSkill
    public boolean findPhone() {
        return ((HMMiLiProDevice) this.baseDevice).sendSpeechInfoSync(new HMSpeechInfo(this.deviceSpeechID.getId(), SpeechType.OPEN, new OpenContent((byte) 12)));
    }
}
