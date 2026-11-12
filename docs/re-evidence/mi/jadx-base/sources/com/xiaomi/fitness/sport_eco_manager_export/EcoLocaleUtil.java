package com.xiaomi.fitness.sport_eco_manager_export;

import android.text.TextUtils;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nJ\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0002R\u001a\u0010\u0004\u001a\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager_export/EcoLocaleUtil;", "", "<init>", "()V", "currentLocale", "", "getCurrentLocale$annotations", "getCurrentLocale", "()Ljava/lang/String;", "countryLowerCase", "", "newISOCodes", "convertNewISOCodes", "language", "sport-eco-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EcoLocaleUtil {

    @NotNull
    public static final EcoLocaleUtil INSTANCE = new EcoLocaleUtil();

    private EcoLocaleUtil() {
    }

    private final String convertNewISOCodes(String language) {
        int iHashCode = language.hashCode();
        if (iHashCode != 3365) {
            if (iHashCode != 3374) {
                if (iHashCode == 3391 && language.equals("ji")) {
                    return "yi";
                }
            } else if (language.equals("iw")) {
                return "he";
            }
        } else if (language.equals("in")) {
            return "id";
        }
        return language;
    }

    @NotNull
    public static final String getCurrentLocale() {
        return INSTANCE.getCurrentLocale(true, false);
    }

    @JvmStatic
    public static /* synthetic */ void getCurrentLocale$annotations() {
    }

    public static /* synthetic */ String getCurrentLocale$default(EcoLocaleUtil ecoLocaleUtil, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return ecoLocaleUtil.getCurrentLocale(z, z2);
    }

    @NotNull
    public final String getCurrentLocale(boolean countryLowerCase, boolean newISOCodes) {
        String language = Locale.getDefault().getLanguage();
        if (TextUtils.isEmpty(language)) {
            return countryLowerCase ? "zh_cn" : "zh_CN";
        }
        Intrinsics.checkNotNull(language);
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = language.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return newISOCodes ? convertNewISOCodes(lowerCase) : lowerCase;
    }
}
