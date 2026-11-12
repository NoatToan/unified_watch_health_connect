package com.huami.ai.speech.simplify.inject.impl.alexa;

import com.huami.ai.helper.Locales;
import com.huami.ai.speech.simplify.alexa.language.AlexaLanguageRepo;
import com.huami.ai.speech.simplify.alexa.language.AlexaLanguageRepoImpl;
import com.huami.ai.speech.simplify.alexa.language.AlexaLanguageUtilsKt;
import com.huami.ai.speech.simplify.inject.SwitchConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/ai/speech/simplify/inject/impl/alexa/LocalesImpl;", "Lcom/huami/ai/helper/Locales;", "", "", "getLocales", "()[Ljava/lang/String;", "Lcom/huami/ai/speech/simplify/alexa/language/AlexaLanguageRepo;", "a", "Lcom/huami/ai/speech/simplify/alexa/language/AlexaLanguageRepo;", "languageRepo", "Lcom/huami/ai/speech/simplify/inject/SwitchConfig;", "b", "Lcom/huami/ai/speech/simplify/inject/SwitchConfig;", "switchConfig", "<init>", "(Lcom/huami/ai/speech/simplify/alexa/language/AlexaLanguageRepo;Lcom/huami/ai/speech/simplify/inject/SwitchConfig;)V", "speech-simplify_release"}, k = 1, mv = {1, 5, 1})
public final class LocalesImpl implements Locales {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AlexaLanguageRepo languageRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SwitchConfig switchConfig;

    public LocalesImpl(@NotNull AlexaLanguageRepo alexaLanguageRepo, @NotNull SwitchConfig switchConfig) {
        this.languageRepo = alexaLanguageRepo;
        this.switchConfig = switchConfig;
    }

    @Override // com.huami.ai.helper.Locales
    @NotNull
    public String[] getLocales() {
        if (this.switchConfig.getSupportMultiLanguage()) {
            String currentSavedAlexaLanguage = AlexaLanguageUtilsKt.getCurrentSavedAlexaLanguage();
            if (currentSavedAlexaLanguage != null) {
                return new String[]{currentSavedAlexaLanguage};
            }
            AlexaLanguageRepo alexaLanguageRepo = this.languageRepo;
            if (alexaLanguageRepo instanceof AlexaLanguageRepoImpl) {
                return new String[]{((AlexaLanguageRepoImpl) alexaLanguageRepo).getDefaultLanguage()};
            }
        }
        return new String[]{AlexaLanguageRepoImpl.BASE_DEFAULT_LANGUAGE};
    }
}
