package com.huami.ai.speech.xiaoai.interceptor;

import com.xiaomi.ai.api.common.Instruction;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J(\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00030\u00022\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00030\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/ai/speech/xiaoai/interceptor/InstructionInterceptor;", "", "", "Lcom/xiaomi/ai/api/common/Instruction;", "instruction", "intercept", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public interface InstructionInterceptor {
    @NotNull
    List<Instruction<Object>> intercept(@NotNull List<? extends Instruction<Object>> instruction);
}
