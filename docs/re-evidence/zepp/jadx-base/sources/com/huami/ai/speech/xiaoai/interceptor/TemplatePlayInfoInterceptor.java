package com.huami.ai.speech.xiaoai.interceptor;

import com.huami.ai.speech.xiaoai.utils.CheckInstructionKt;
import com.xiaomi.ai.api.common.Instruction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/huami/ai/speech/xiaoai/interceptor/TemplatePlayInfoInterceptor;", "Lcom/huami/ai/speech/xiaoai/interceptor/InstructionInterceptor;", "", "Lcom/xiaomi/ai/api/common/Instruction;", "", "instruction", "intercept", "<init>", "()V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class TemplatePlayInfoInterceptor implements InstructionInterceptor {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huami.ai.speech.xiaoai.interceptor.InstructionInterceptor
    @NotNull
    public List<Instruction<Object>> intercept(@NotNull List<? extends Instruction<Object>> instruction) {
        Object next;
        Function1<Instruction<Object>, Boolean> checkPlayInfoInstruction = CheckInstructionKt.getCheckPlayInfoInstruction();
        Iterator it2 = instruction.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!((Boolean) checkPlayInfoInstruction.invoke(next)).booleanValue());
        if (((Instruction) next) == null) {
            return instruction;
        }
        Function1<Instruction<Object>, Boolean> checkAudioPlayInstruction = CheckInstructionKt.getCheckAudioPlayInstruction();
        ArrayList arrayList = new ArrayList();
        for (Object obj : instruction) {
            if (!((Boolean) checkAudioPlayInstruction.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        Function1<Instruction<Object>, Boolean> checkPlaybackControllerInstruction = CheckInstructionKt.getCheckPlaybackControllerInstruction();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!((Boolean) checkPlaybackControllerInstruction.invoke(obj2)).booleanValue()) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }
}
