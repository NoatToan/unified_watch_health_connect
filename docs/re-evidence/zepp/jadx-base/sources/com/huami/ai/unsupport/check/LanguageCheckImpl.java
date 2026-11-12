package com.huami.ai.unsupport.check;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ*\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/ai/unsupport/check/LanguageCheckImpl;", "Lcom/huami/ai/unsupport/check/LanguageCheck;", "", "text", "", "Lkotlin/Function1;", "", "", "check", "<init>", "()V", "speech-skill_release"}, k = 1, mv = {1, 5, 1})
public final class LanguageCheckImpl implements LanguageCheck {
    @Override // com.huami.ai.unsupport.check.LanguageCheck
    public boolean check(@NotNull String text, @NotNull List<? extends Function1<? super Integer, Boolean>> check) {
        int iCharCount = 0;
        while (iCharCount < text.length()) {
            int iCodePointAt = Character.codePointAt(text, iCharCount);
            Iterator<T> it2 = check.iterator();
            while (it2.hasNext()) {
                if (((Boolean) ((Function1) it2.next()).invoke(Integer.valueOf(iCodePointAt))).booleanValue()) {
                    return true;
                }
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return false;
    }
}
