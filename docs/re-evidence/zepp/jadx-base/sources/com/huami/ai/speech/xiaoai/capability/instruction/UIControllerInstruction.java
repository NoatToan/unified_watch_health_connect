package com.huami.ai.speech.xiaoai.capability.instruction;

import com.huami.ai.skill.NavigateSkill;
import com.xiaomi.ai.android.capability.InstructionCapability;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.UIController;
import com.xiaomi.ai.api.common.Instruction;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\b\u001a\u00020\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016R\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/instruction/UIControllerInstruction;", "Lcom/xiaomi/ai/android/capability/InstructionCapability;", "Lcom/xiaomi/ai/api/UIController$Navigate;", "payload", "", "a", "Lcom/xiaomi/ai/api/common/Instruction;", "instruction", "process", "Lcom/huami/ai/skill/NavigateSkill;", "Lcom/huami/ai/skill/NavigateSkill;", "navigateSkill", "<init>", "(Lcom/huami/ai/skill/NavigateSkill;)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class UIControllerInstruction extends InstructionCapability {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final NavigateSkill navigateSkill;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UIController.NavigateOp.values().length];
            iArr[UIController.NavigateOp.EXIT.ordinal()] = 1;
            iArr[UIController.NavigateOp.HOME.ordinal()] = 2;
            iArr[UIController.NavigateOp.BACK.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public UIControllerInstruction(@NotNull NavigateSkill navigateSkill) {
        this.navigateSkill = navigateSkill;
    }

    private final boolean a(UIController.Navigate payload) {
        UIController.NavigateOp operation = payload.getOperation();
        int i = operation == null ? -1 : WhenMappings.$EnumSwitchMapping$0[operation.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.navigateSkill.goMainPage();
        }
        return false;
    }

    @Override // com.xiaomi.ai.android.capability.InstructionCapability
    public boolean process(@NotNull Instruction<?> instruction) {
        if (!Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.UIController.Navigate)) {
            return false;
        }
        Object payload = instruction.getPayload();
        Objects.requireNonNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.UIController.Navigate");
        return a((UIController.Navigate) payload);
    }
}
