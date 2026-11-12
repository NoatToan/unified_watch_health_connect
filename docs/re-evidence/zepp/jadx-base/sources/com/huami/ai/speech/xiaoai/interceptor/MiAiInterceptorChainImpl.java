package com.huami.ai.speech.xiaoai.interceptor;

import com.xiaomi.ai.api.common.Instruction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016R&\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00020\fj\b\u0012\u0004\u0012\u00020\u0002`\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/huami/ai/speech/xiaoai/interceptor/MiAiInterceptorChainImpl;", "Lcom/huami/ai/speech/xiaoai/interceptor/InterceptorChain;", "Lcom/huami/ai/speech/xiaoai/interceptor/InstructionInterceptor;", "interceptor", "", "addInterceptor", "", "Lcom/xiaomi/ai/api/common/Instruction;", "", "instruction", "removeInterceptor", "removeAllInterceptor", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "a", "Ljava/util/ArrayList;", "chainList", "<init>", "()V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class MiAiInterceptorChainImpl implements InterceptorChain {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<InstructionInterceptor> chainList = new ArrayList<>();

    @Override // com.huami.ai.speech.xiaoai.interceptor.InterceptorChain
    public void addInterceptor(@NotNull InstructionInterceptor interceptor) {
        this.chainList.add(interceptor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huami.ai.speech.xiaoai.interceptor.InterceptorChain
    @NotNull
    public List<Instruction<Object>> interceptor(@NotNull List<? extends Instruction<Object>> instruction) {
        if (this.chainList.isEmpty()) {
            return instruction;
        }
        Iterator<T> it2 = this.chainList.iterator();
        List listIntercept = instruction;
        while (it2.hasNext()) {
            listIntercept = ((InstructionInterceptor) it2.next()).intercept(listIntercept);
        }
        return listIntercept;
    }

    @Override // com.huami.ai.speech.xiaoai.interceptor.InterceptorChain
    public void removeAllInterceptor() {
        this.chainList.clear();
    }

    @Override // com.huami.ai.speech.xiaoai.interceptor.InterceptorChain
    public void removeInterceptor(@NotNull InstructionInterceptor interceptor) {
        this.chainList.remove(interceptor);
    }
}
