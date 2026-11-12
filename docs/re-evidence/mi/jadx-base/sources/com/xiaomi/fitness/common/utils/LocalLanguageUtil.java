package com.xiaomi.fitness.common.utils;

import com.xiaomi.hm.health.baseutil.Language;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0005¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/common/utils/LocalLanguageUtil;", "", "<init>", "()V", "languageFrench", "", "languageGreek", "languageGerman", "sportBehaviorSpecial", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocalLanguageUtil {

    @NotNull
    public static final LocalLanguageUtil INSTANCE = new LocalLanguageUtil();

    private LocalLanguageUtil() {
    }

    public final boolean languageFrench() {
        String language = AppUtil.getApp().getResources().getConfiguration().locale.getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = language.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "fr", false, 2, (Object) null);
    }

    public final boolean languageGerman() {
        String language = AppUtil.getApp().getResources().getConfiguration().locale.getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = language.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "de", false, 2, (Object) null);
    }

    public final boolean languageGreek() {
        String language = AppUtil.getApp().getResources().getConfiguration().locale.getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = language.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) Language.EL, false, 2, (Object) null);
    }

    public final boolean sportBehaviorSpecial() {
        String language = AppUtil.getApp().getResources().getConfiguration().locale.getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = language.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "uk", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) Language.RO, false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "es", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "ru", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "de", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) Language.EL, false, 2, (Object) null);
    }
}
