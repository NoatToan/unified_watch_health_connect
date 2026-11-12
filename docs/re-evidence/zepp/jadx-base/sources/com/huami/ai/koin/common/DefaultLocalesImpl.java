package com.huami.ai.koin.common;

import com.huami.ai.helper.Locales;
import com.huami.ai.speech.simplify.alexa.language.AlexaLanguageRepoImpl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/huami/ai/koin/common/DefaultLocalesImpl;", "Lcom/huami/ai/helper/Locales;", "", "", "getLocales", "()[Ljava/lang/String;", "<init>", "()V", "speech-skill_release"}, k = 1, mv = {1, 5, 1})
public final class DefaultLocalesImpl implements Locales {
    @Override // com.huami.ai.helper.Locales
    @NotNull
    public String[] getLocales() {
        return new String[]{AlexaLanguageRepoImpl.BASE_DEFAULT_LANGUAGE};
    }
}
