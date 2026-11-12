package com.huami.ai.speech.xiaoai.capability.instruction;

import com.huami.ai.skill.SetBrightnessSkill;
import com.xiaomi.ai.android.capability.InstructionCapability;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.BrightnessController;
import com.xiaomi.ai.api.common.Instruction;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/instruction/BrightnessControllerInstruction;", "Lcom/xiaomi/ai/android/capability/InstructionCapability;", "Lcom/xiaomi/ai/api/common/Instruction;", "instruction", "", "process", "Lcom/huami/ai/skill/SetBrightnessSkill;", "a", "Lcom/huami/ai/skill/SetBrightnessSkill;", "setBrightnessSkill", "<init>", "(Lcom/huami/ai/skill/SetBrightnessSkill;)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class BrightnessControllerInstruction extends InstructionCapability {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SetBrightnessSkill setBrightnessSkill;

    public BrightnessControllerInstruction(@NotNull SetBrightnessSkill setBrightnessSkill) {
        this.setBrightnessSkill = setBrightnessSkill;
    }

    @Override // com.xiaomi.ai.android.capability.InstructionCapability
    public boolean process(@NotNull Instruction<?> instruction) {
        String fullName = instruction.getFullName();
        if (Intrinsics.areEqual(fullName, AIApiConstants.BrightnessController.AdjustBrightness)) {
            Object payload = instruction.getPayload();
            Objects.requireNonNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.BrightnessController.AdjustBrightness");
            this.setBrightnessSkill.setBrightnessDelta(((BrightnessController.AdjustBrightness) payload).getBrightnessDelta());
            return true;
        }
        if (!Intrinsics.areEqual(fullName, AIApiConstants.BrightnessController.SetBrightness)) {
            return false;
        }
        Object payload2 = instruction.getPayload();
        Objects.requireNonNull(payload2, "null cannot be cast to non-null type com.xiaomi.ai.api.BrightnessController.SetBrightness");
        this.setBrightnessSkill.setBrightnessPercent(((BrightnessController.SetBrightness) payload2).getBrightness());
        return true;
    }
}
