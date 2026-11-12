package com.huami.ai.speech.xiaoai.interceptor;

import com.huami.ai.speech.xiaoai.utils.CheckInstructionKt;
import com.huami.ai.unsupport.check.LanguageCheck;
import com.xiaomi.ai.api.Template;
import com.xiaomi.ai.api.common.Instruction;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\u0002¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0016R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR(\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR,\u0010\u0016\u001a\u0004\u0018\u00010\u0012*\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00128B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\b\u0010\u0014\"\u0004\b\u000e\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/huami/ai/speech/xiaoai/interceptor/PlayInfoTitleLanguageInterceptor;", "Lcom/huami/ai/speech/xiaoai/interceptor/InstructionInterceptor;", "", "Lcom/xiaomi/ai/api/common/Instruction;", "", "instruction", "intercept", "Lcom/huami/ai/unsupport/check/LanguageCheck;", "a", "Lcom/huami/ai/unsupport/check/LanguageCheck;", "languageCheck", "Lkotlin/Function1;", "", "", "b", "Ljava/util/List;", "checkList", "Lcom/xiaomi/ai/api/Template$PlayInfo;", "", "value", "(Lcom/xiaomi/ai/api/Template$PlayInfo;)Ljava/lang/String;", "(Lcom/xiaomi/ai/api/Template$PlayInfo;Ljava/lang/String;)V", "mainTitle", "<init>", "(Lcom/huami/ai/unsupport/check/LanguageCheck;Ljava/util/List;)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class PlayInfoTitleLanguageInterceptor implements InstructionInterceptor {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LanguageCheck languageCheck;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<Function1<Integer, Boolean>> checkList;

    /* JADX WARN: Multi-variable type inference failed */
    public PlayInfoTitleLanguageInterceptor(@NotNull LanguageCheck languageCheck, @NotNull List<? extends Function1<? super Integer, Boolean>> list) {
        this.languageCheck = languageCheck;
        this.checkList = list;
    }

    private final String a(Template.PlayInfo playInfo) {
        return playInfo.getItems().size() == 0 ? "" : playInfo.getItems().get(0).getTitle().getMainTitle();
    }

    private final void b(Template.PlayInfo playInfo, String str) {
        if (playInfo.getItems().size() == 0) {
            return;
        }
        playInfo.getItems().get(0).getTitle().setMainTitle(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huami.ai.speech.xiaoai.interceptor.InstructionInterceptor
    @NotNull
    public List<Instruction<Object>> intercept(@NotNull List<? extends Instruction<Object>> instruction) {
        Object next;
        if (this.checkList.isEmpty()) {
            return instruction;
        }
        Function1<Instruction<Object>, Boolean> checkPlayInfoInstruction = CheckInstructionKt.getCheckPlayInfoInstruction();
        Iterator it2 = instruction.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!((Boolean) checkPlayInfoInstruction.invoke(next)).booleanValue());
        Instruction instruction2 = (Instruction) next;
        if (instruction2 == null) {
            return instruction;
        }
        T payload = instruction2.getPayload();
        Objects.requireNonNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Template.PlayInfo");
        String strA = a((Template.PlayInfo) payload);
        if (strA != null && this.languageCheck.check(strA, this.checkList)) {
            T payload2 = instruction2.getPayload();
            Objects.requireNonNull(payload2, "null cannot be cast to non-null type com.xiaomi.ai.api.Template.PlayInfo");
            b((Template.PlayInfo) payload2, null);
        }
        return instruction;
    }
}
