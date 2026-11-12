package com.xiaomi.hm.health.bt.utils;

import android.os.Build;
import androidx.annotation.RequiresApi;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.model.HmLocale;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/bt/utils/HmLanguageUtil;", "", "Ljava/util/Locale;", "matchSrcLocale", "Lcom/xiaomi/hm/health/bt/model/HmLocale;", "matchDstLocale", "", "a", "(Ljava/util/Locale;Lcom/xiaomi/hm/health/bt/model/HmLocale;)Ljava/lang/Integer;", "locale", "parseLocaleToHmLanguageCode", "(Ljava/util/Locale;)Ljava/lang/Integer;", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HmLanguageUtil {

    @NotNull
    public static final HmLanguageUtil INSTANCE = new HmLanguageUtil();

    @NotNull
    public static final String TAG = "HmLanguageUtils";

    private HmLanguageUtil() {
    }

    @RequiresApi(api = 26)
    private final Integer a(Locale matchSrcLocale, HmLocale matchDstLocale) {
        List<Locale.LanguageRange> list = Locale.LanguageRange.parse(matchSrcLocale.toLanguageTag());
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(HmLocale.getLocaleWitchLanguageTag(matchDstLocale.getLangCode(), Boolean.TRUE));
            if (matchDstLocale.getLangCode() != 15 && matchDstLocale.getLangCode() != 20) {
                arrayList.add(HmLocale.getLocaleWitchLanguageTag(matchDstLocale.getLangCode(), Boolean.FALSE));
            }
            if (matchDstLocale.getLangCode() == 1) {
                arrayList.add(Locale.forLanguageTag("zh-TW"));
                arrayList.add(Locale.forLanguageTag("zh-HK"));
            }
            if (matchDstLocale.getLangCode() == 0) {
                arrayList.add(Locale.forLanguageTag("zh-CN"));
            }
            if (Locale.lookup(list, arrayList) != null) {
                return Integer.valueOf(matchDstLocale.getLangCode());
            }
            return null;
        } catch (Exception e) {
            Debug.i("HmLanguageUtils", e.getMessage());
            return null;
        }
    }

    @RequiresApi(21)
    @Nullable
    public final Integer parseLocaleToHmLanguageCode(@NotNull Locale locale) {
        int i = 0;
        Integer numA = null;
        if (Build.VERSION.SDK_INT >= 26) {
            HmLocale[] hmLocaleArrValues = HmLocale.values();
            int length = hmLocaleArrValues.length;
            while (i < length) {
                HmLocale hmLocale = hmLocaleArrValues[i];
                if (numA == null) {
                    numA = INSTANCE.a(locale, hmLocale);
                }
                i++;
            }
            return numA;
        }
        String language = locale.getLanguage();
        if (Intrinsics.areEqual(language, HmLocale.SIMPLIFIED_CHINESE.getLang())) {
            if (Intrinsics.areEqual(locale.getCountry(), Locale.TAIWAN.getCountry()) || Intrinsics.areEqual(locale.getCountry(), "HK")) {
                return 1;
            }
            return Integer.valueOf(!Intrinsics.areEqual(locale.getScript(), "Hans") ? 1 : 0);
        }
        HmLocale hmLocale2 = HmLocale.PORTUGUESE;
        if (Intrinsics.areEqual(language, hmLocale2.getLang())) {
            return Intrinsics.areEqual(locale.getCountry(), hmLocale2.getCountry()) ? Integer.valueOf(hmLocale2.getLangCode()) : Integer.valueOf(HmLocale.BRAZILIAN_PORTUGUESE.getLangCode());
        }
        HmLocale[] hmLocaleArrValues2 = HmLocale.values();
        int length2 = hmLocaleArrValues2.length;
        while (i < length2) {
            HmLocale hmLocale3 = hmLocaleArrValues2[i];
            if (Intrinsics.areEqual(hmLocale3.getLang(), locale.getLanguage())) {
                return Integer.valueOf(hmLocale3.getLangCode());
            }
            i++;
        }
        return null;
    }
}
