package com.huami.ai.unsupport.check;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004H&¨\u0006\t"}, d2 = {"Lcom/huami/ai/unsupport/check/LanguageCheck;", "", "", "text", "", "Lkotlin/Function1;", "", "", "check", "speech-skill_release"}, k = 1, mv = {1, 5, 1})
public interface LanguageCheck {
    boolean check(@NotNull String text, @NotNull List<? extends Function1<? super Integer, Boolean>> check);
}
