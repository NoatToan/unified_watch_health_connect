package com.huami.ai.speech.xiaoai.interceptor;

import com.xiaomi.ai.api.common.Instruction;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J(\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00070\u00062\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00070\u0006H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\n\u001a\u00020\u0004H&¨\u0006\u000b"}, d2 = {"Lcom/huami/ai/speech/xiaoai/interceptor/InterceptorChain;", "", "Lcom/huami/ai/speech/xiaoai/interceptor/InstructionInterceptor;", "interceptor", "", "addInterceptor", "", "Lcom/xiaomi/ai/api/common/Instruction;", "instruction", "removeInterceptor", "removeAllInterceptor", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public interface InterceptorChain {
    void addInterceptor(@NotNull InstructionInterceptor interceptor);

    @NotNull
    List<Instruction<Object>> interceptor(@NotNull List<? extends Instruction<Object>> instruction);

    void removeAllInterceptor();

    void removeInterceptor(@NotNull InstructionInterceptor interceptor);
}
