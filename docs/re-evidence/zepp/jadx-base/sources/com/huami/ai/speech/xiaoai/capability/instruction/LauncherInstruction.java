package com.huami.ai.speech.xiaoai.capability.instruction;

import com.huami.ai.skill.FindPhoneSkill;
import com.xiaomi.ai.android.capability.InstructionCapability;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.Launcher;
import com.xiaomi.ai.api.common.Instruction;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\b\u001a\u00020\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016R\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/instruction/LauncherInstruction;", "Lcom/xiaomi/ai/android/capability/InstructionCapability;", "Lcom/xiaomi/ai/api/Launcher$LaunchApp;", "payload", "", "a", "Lcom/xiaomi/ai/api/common/Instruction;", "instruction", "process", "Lcom/huami/ai/skill/FindPhoneSkill;", "Lcom/huami/ai/skill/FindPhoneSkill;", "findPhoneSkill", "<init>", "(Lcom/huami/ai/skill/FindPhoneSkill;)V", "Companion", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class LauncherInstruction extends InstructionCapability {

    @NotNull
    private static final String b = "hm.band.findphone";

    @NotNull
    private static final String c = "hm.watch.findphone";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final FindPhoneSkill findPhoneSkill;

    public LauncherInstruction(@NotNull FindPhoneSkill findPhoneSkill) {
        this.findPhoneSkill = findPhoneSkill;
    }

    private final boolean a(Launcher.LaunchApp payload) {
        if (!payload.getIntent().isPresent()) {
            return false;
        }
        String uri = payload.getIntent().get().getUri();
        if (!(Intrinsics.areEqual(uri, b) ? true : Intrinsics.areEqual(uri, c))) {
            return false;
        }
        this.findPhoneSkill.findPhone();
        return true;
    }

    @Override // com.xiaomi.ai.android.capability.InstructionCapability
    public boolean process(@NotNull Instruction<?> instruction) {
        if (!Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.Launcher.LaunchApp)) {
            return false;
        }
        Object payload = instruction.getPayload();
        Objects.requireNonNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Launcher.LaunchApp");
        return a((Launcher.LaunchApp) payload);
    }
}
