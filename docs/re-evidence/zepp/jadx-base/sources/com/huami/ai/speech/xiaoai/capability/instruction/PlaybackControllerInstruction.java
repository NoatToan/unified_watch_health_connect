package com.huami.ai.speech.xiaoai.capability.instruction;

import com.huami.ai.skill.PlayControlSkill;
import com.xiaomi.ai.android.capability.InstructionCapability;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.common.Instruction;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/instruction/PlaybackControllerInstruction;", "Lcom/xiaomi/ai/android/capability/InstructionCapability;", "Lcom/xiaomi/ai/api/common/Instruction;", "instruction", "", "process", "Lcom/huami/ai/skill/PlayControlSkill;", "a", "Lcom/huami/ai/skill/PlayControlSkill;", "playControlSkill", "<init>", "(Lcom/huami/ai/skill/PlayControlSkill;)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class PlaybackControllerInstruction extends InstructionCapability {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final PlayControlSkill playControlSkill;

    public PlaybackControllerInstruction(@NotNull PlayControlSkill playControlSkill) {
        this.playControlSkill = playControlSkill;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r3.equals(com.xiaomi.ai.api.AIApiConstants.PlaybackController.Stop) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        r2.playControlSkill.stop();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r3.equals(com.xiaomi.ai.api.AIApiConstants.PlaybackController.Pause) == false) goto L26;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.xiaomi.ai.android.capability.InstructionCapability
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean process(@NotNull Instruction<?> instruction) {
        String fullName = instruction.getFullName();
        if (fullName != null) {
            switch (fullName.hashCode()) {
                case -1954408854:
                    if (fullName.equals(AIApiConstants.PlaybackController.Next)) {
                        this.playControlSkill.next();
                        return true;
                    }
                    break;
                case -1954343253:
                    if (fullName.equals(AIApiConstants.PlaybackController.Play)) {
                        this.playControlSkill.start();
                        return true;
                    }
                    break;
                case -1954337366:
                    if (fullName.equals(AIApiConstants.PlaybackController.Prev)) {
                        this.playControlSkill.prev();
                        return true;
                    }
                    break;
                case -1954245767:
                    break;
                case -455407265:
                    break;
            }
        }
        return false;
    }
}
