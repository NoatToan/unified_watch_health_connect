package com.huami.util.language;

import com.huami.util.language.internal.LanguageCountryImpl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/util/language/HmLanguageUtil;", "", "Lcom/huami/util/language/HmLocaleFactory;", "localeFactory", "Lcom/huami/util/language/HmLanguageApi;", "languageUtil", "Lcom/huami/util/language/internal/LanguageCountryImpl;", "a", "Lcom/huami/util/language/internal/LanguageCountryImpl;", "hmLanguageCountryUti", "<init>", "()V", "hmutil_release"}, k = 1, mv = {1, 5, 1})
public final class HmLanguageUtil {

    @NotNull
    public static final HmLanguageUtil INSTANCE = new HmLanguageUtil();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final LanguageCountryImpl hmLanguageCountryUti = new LanguageCountryImpl();

    private HmLanguageUtil() {
    }

    @NotNull
    public final HmLanguageApi languageUtil() {
        return hmLanguageCountryUti;
    }

    @NotNull
    public final HmLocaleFactory localeFactory() {
        return hmLanguageCountryUti;
    }
}
