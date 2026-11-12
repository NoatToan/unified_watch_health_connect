package com.huami.util.language;

import com.huami.account.UserLegalInfoManager;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H&J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J \u0010\f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\r"}, d2 = {"Lcom/huami/util/language/HmLocaleFactory;", "", "Lcom/huami/util/language/Language;", UserLegalInfoManager.KEY_LANGUAGE, "Ljava/util/Locale;", "create", "Lcom/huami/util/language/Country;", "country", "locale", "convert2HmCountryEnum", "", "isCountryEquals", "isCountryAndLanguageEquals", "hmutil_release"}, k = 1, mv = {1, 5, 1})
public interface HmLocaleFactory {
    @NotNull
    Country convert2HmCountryEnum(@NotNull Locale locale);

    @NotNull
    Locale create(@NotNull Language language);

    @NotNull
    Locale create(@NotNull Language language, @NotNull Country country);

    boolean isCountryAndLanguageEquals(@NotNull Locale locale, @NotNull Country country, @NotNull Language language);

    boolean isCountryEquals(@NotNull Locale locale, @NotNull Country country);
}
