package com.huami.util.language;

import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¨\u0006\u0003"}, d2 = {"Ljava/util/Locale;", "", "isTimexSupportLanguage", "hmutil_release"}, k = 2, mv = {1, 5, 1})
public final class TimexLanguageUtilKt {
    public static final boolean isTimexSupportLanguage(@Nullable Locale locale) {
        if (locale == null) {
            return false;
        }
        HmLanguageApi hmLanguageApiLanguageUtil = HmLanguageUtil.INSTANCE.languageUtil();
        return hmLanguageApiLanguageUtil.isLanguageEquals(locale, Language.EN) || hmLanguageApiLanguageUtil.isLanguageEquals(locale, Language.NL) || hmLanguageApiLanguageUtil.isLanguageEquals(locale, Language.FR) || hmLanguageApiLanguageUtil.isLanguageEquals(locale, Language.DE) || hmLanguageApiLanguageUtil.isLanguageEquals(locale, Language.IT) || hmLanguageApiLanguageUtil.isLanguageEquals(locale, Language.PT) || hmLanguageApiLanguageUtil.isLanguageEquals(locale, Language.ES);
    }
}
