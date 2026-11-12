package com.huami.util.language.internal;

import com.huami.account.UserLegalInfoManager;
import com.huami.tools.log.HMLog;
import com.huami.util.language.Country;
import com.huami.util.language.HmLanguageApi;
import com.huami.util.language.HmLocaleFactory;
import com.huami.util.language.Language;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J \u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\"\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/huami/util/language/internal/LanguageCountryImpl;", "Lcom/huami/util/language/HmLanguageApi;", "Lcom/huami/util/language/HmLocaleFactory;", "Lcom/huami/util/language/Language;", UserLegalInfoManager.KEY_LANGUAGE, "Lcom/huami/util/language/Country;", "country", "", "formatLocalLanguage", "Ljava/util/Locale;", "locale", "convert2HmLanguageEnum", "", "isLanguageEquals", "isCountryEquals", "isCountryAndLanguageEquals", "convert2HmCountryEnum", "create", "", "a", "Ljava/util/Map;", "depMap", "<init>", "()V", "hmutil_release"}, k = 1, mv = {1, 5, 1})
public final class LanguageCountryImpl implements HmLanguageApi, HmLocaleFactory {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Map<String, Language> depMap = r.mapOf(TuplesKt.to("IW", Language.HE), TuplesKt.to("IN", Language.ID), TuplesKt.to("JI", Language.YI));

    @Override // com.huami.util.language.HmLocaleFactory
    @NotNull
    public Country convert2HmCountryEnum(@NotNull Locale locale) {
        try {
            return Country.valueOf(locale.getCountry());
        } catch (Exception e) {
            HMLog.e("convert2HmCountryEnum", e);
            return Country.CN;
        }
    }

    @Override // com.huami.util.language.HmLanguageApi
    @NotNull
    public Language convert2HmLanguageEnum(@NotNull Locale locale) {
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        Language language2 = this.depMap.get(language.toUpperCase(locale2));
        if (language2 != null) {
            return language2;
        }
        try {
            return Language.valueOf(locale.getLanguage().toUpperCase(locale2));
        } catch (Exception e) {
            HMLog.e("convert2HmLanguageEnum", e);
            return Language.EN;
        }
    }

    @Override // com.huami.util.language.HmLocaleFactory
    @NotNull
    public Locale create(@NotNull Language language) {
        String strName = language.name();
        Locale locale = Locale.ENGLISH;
        Objects.requireNonNull(strName, "null cannot be cast to non-null type java.lang.String");
        return new Locale(strName.toLowerCase(locale));
    }

    @Override // com.huami.util.language.HmLanguageApi
    @NotNull
    public String formatLocalLanguage(@NotNull Language language, @NotNull Country country) {
        StringBuilder sb = new StringBuilder();
        String strName = language.name();
        Locale locale = Locale.ENGLISH;
        Objects.requireNonNull(strName, "null cannot be cast to non-null type java.lang.String");
        sb.append(strName.toLowerCase(locale));
        sb.append('_');
        sb.append(country.name());
        return sb.toString();
    }

    @Override // com.huami.util.language.HmLocaleFactory
    public boolean isCountryAndLanguageEquals(@NotNull Locale locale, @NotNull Country country, @NotNull Language language) {
        return isLanguageEquals(locale, language) && isCountryEquals(locale, country);
    }

    @Override // com.huami.util.language.HmLocaleFactory
    public boolean isCountryEquals(@NotNull Locale locale, @NotNull Country country) {
        return convert2HmCountryEnum(locale) == country;
    }

    @Override // com.huami.util.language.HmLanguageApi
    public boolean isLanguageEquals(@NotNull Locale locale, @NotNull Language language) {
        return convert2HmLanguageEnum(locale) == language;
    }

    @Override // com.huami.util.language.HmLocaleFactory
    @NotNull
    public Locale create(@NotNull Language language, @NotNull Country country) {
        String strName = language.name();
        Locale locale = Locale.ENGLISH;
        Objects.requireNonNull(strName, "null cannot be cast to non-null type java.lang.String");
        return new Locale(strName.toLowerCase(locale), country.name());
    }
}
