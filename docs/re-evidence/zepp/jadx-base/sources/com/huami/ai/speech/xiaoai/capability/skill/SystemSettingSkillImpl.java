package com.huami.ai.speech.xiaoai.capability.skill;

import com.huami.ai.helper.DeviceSpeechID;
import com.huami.ai.helper.SpeechDevice;
import com.huami.ai.skill.Operation;
import com.huami.ai.skill.SystemSettingSkill;
import com.xiaomi.hm.health.bt.profile.speech.HMSpeechInfo;
import com.xiaomi.hm.health.bt.profile.speech.OpenContent;
import com.xiaomi.hm.health.bt.profile.speech.SpeechType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/skill/SystemSettingSkillImpl;", "Lcom/huami/ai/skill/SystemSettingSkill;", "Lcom/huami/ai/skill/Operation;", "quietMode", "", "reboot", "quiet", "phoneQuiet", "shutdown", "Lcom/huami/ai/helper/SpeechDevice;", "a", "Lcom/huami/ai/helper/SpeechDevice;", "baseDevice", "Lcom/huami/ai/helper/DeviceSpeechID;", "b", "Lcom/huami/ai/helper/DeviceSpeechID;", "speechId", "<init>", "(Lcom/huami/ai/helper/SpeechDevice;Lcom/huami/ai/helper/DeviceSpeechID;)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class SystemSettingSkillImpl implements SystemSettingSkill {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SpeechDevice baseDevice;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final DeviceSpeechID speechId;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Operation.values().length];
            iArr[Operation.ON.ordinal()] = 1;
            iArr[Operation.OFF.ordinal()] = 2;
            iArr[Operation.SWITCH.ordinal()] = 3;
            iArr[Operation.NO_OPERATION.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SystemSettingSkillImpl(@NotNull SpeechDevice speechDevice, @NotNull DeviceSpeechID deviceSpeechID) {
        this.baseDevice = speechDevice;
        this.speechId = deviceSpeechID;
    }

    @Override // com.huami.ai.skill.SystemSettingSkill
    public boolean phoneQuiet(boolean quiet) {
        return false;
    }

    @Override // com.huami.ai.skill.SystemSettingSkill
    public boolean quietMode(@NotNull Operation quietMode) {
        OpenContent openContent = new OpenContent((byte) 7);
        int i = WhenMappings.$EnumSwitchMapping$0[quietMode.ordinal()];
        byte b = 1;
        if (i != 1) {
            if (i == 2) {
                b = 0;
            } else if (i == 3) {
                b = 16;
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                b = 32;
            }
        }
        openContent.setParam(new OpenContent.DndContent(b));
        return this.baseDevice.sendSpeechInfoSync(new HMSpeechInfo(this.speechId.getId(), SpeechType.OPEN, openContent));
    }

    @Override // com.huami.ai.skill.SystemSettingSkill
    public boolean reboot() {
        return false;
    }

    @Override // com.huami.ai.skill.SystemSettingSkill
    public boolean shutdown() {
        return false;
    }
}
