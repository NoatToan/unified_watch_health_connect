package com.huami.ai.speech.xiaoai.capability.instruction;

import com.huami.ai.skill.CaptionChannel;
import com.huami.ai.speech.xiaoai.capability.instruction.entity.CombineAnswer;
import com.xiaomi.ai.android.capability.InstructionCapability;
import com.xiaomi.ai.api.common.Instruction;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/instruction/CombineAnswerInstruction;", "Lcom/xiaomi/ai/android/capability/InstructionCapability;", "Lcom/xiaomi/ai/api/common/Instruction;", "instruction", "", "process", "Lcom/huami/ai/skill/CaptionChannel;", "a", "Lcom/huami/ai/skill/CaptionChannel;", "captionChannel", "<init>", "(Lcom/huami/ai/skill/CaptionChannel;)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class CombineAnswerInstruction extends InstructionCapability {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CaptionChannel captionChannel;

    public CombineAnswerInstruction(@NotNull CaptionChannel captionChannel) {
        this.captionChannel = captionChannel;
    }

    @Override // com.xiaomi.ai.android.capability.InstructionCapability
    public boolean process(@NotNull Instruction<?> instruction) {
        Object payload = instruction.getPayload();
        Objects.requireNonNull(payload, "null cannot be cast to non-null type com.huami.ai.speech.xiaoai.capability.instruction.entity.CombineAnswer.CombineAnswerPayload");
        this.captionChannel.showCaption(((CombineAnswer.CombineAnswerPayload) payload).getAnswer());
        return true;
    }
}
