package com.huami.util.language;

import com.huami.account.UserLegalInfoManager;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\r"}, d2 = {"Lcom/huami/util/language/HmLanguageApi;", "", "Lcom/huami/util/language/Language;", UserLegalInfoManager.KEY_LANGUAGE, "Lcom/huami/util/language/Country;", "country", "", "formatLocalLanguage", "Ljava/util/Locale;", "locale", "convert2HmLanguageEnum", "", "isLanguageEquals", "hmutil_release"}, k = 1, mv = {1, 5, 1})
public interface HmLanguageApi {
    @NotNull
    Language convert2HmLanguageEnum(@NotNull Locale locale);

    @NotNull
    String formatLocalLanguage(@NotNull Language language, @NotNull Country country);

    boolean isLanguageEquals(@NotNull Locale locale, @NotNull Language language);
}
