package com.huami.ai.speech.xiaoai.capability.instruction;

import com.huami.tools.log.HMLog;
import com.xiaomi.ai.android.capability.InstructionCapability;
import com.xiaomi.ai.api.common.Instruction;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/instruction/TemplateInstruction;", "Lcom/xiaomi/ai/android/capability/InstructionCapability;", "Lcom/xiaomi/ai/api/common/Instruction;", "instruction", "", "process", "<init>", "()V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class TemplateInstruction extends InstructionCapability {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Instruction<?> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Instruction<?> instruction) {
            super(0);
            this.a = instruction;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("未实现 ", this.a.getFullName());
        }
    }

    @Override // com.xiaomi.ai.android.capability.InstructionCapability
    public boolean process(@NotNull Instruction<?> instruction) {
        HMLog.warn$default("speech", null, new a(instruction), 2, null);
        return false;
    }
}
