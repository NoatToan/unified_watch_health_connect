package com.huami.util.language;

import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\b"}, d2 = {"Lcom/huami/util/language/TimexLanguageUtil;", "", "Ljava/util/Locale;", "getTimexLocale", "", "getTimexLocalStr", "<init>", "()V", "hmutil_release"}, k = 1, mv = {1, 5, 1})
public final class TimexLanguageUtil {

    @NotNull
    public static final TimexLanguageUtil INSTANCE = new TimexLanguageUtil();

    private TimexLanguageUtil() {
    }

    @NotNull
    public final String getTimexLocalStr() {
        Locale locale = Locale.getDefault();
        Locale locale2 = TimexLanguageUtilKt.isTimexSupportLanguage(locale) ? locale : Locale.US;
        StringBuilder sb = new StringBuilder();
        sb.append((Object) locale2.getLanguage());
        sb.append('_');
        sb.append((Object) locale.getCountry());
        return sb.toString();
    }

    @NotNull
    public final Locale getTimexLocale() {
        Locale locale = Locale.getDefault();
        return TimexLanguageUtilKt.isTimexSupportLanguage(locale) ? locale : new Locale(Locale.ENGLISH.getLanguage(), locale.getCountry());
    }
}
