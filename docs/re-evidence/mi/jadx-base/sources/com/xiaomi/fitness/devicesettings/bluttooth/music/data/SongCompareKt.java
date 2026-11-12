package com.xiaomi.fitness.devicesettings.bluttooth.music.data;

import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0003"}, d2 = {"getSongFirstChar", "", "pinyin", "device-settings_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SongCompareKt {
    @NotNull
    public static final String getSongFirstChar(@NotNull String pinyin) {
        Intrinsics.checkNotNullParameter(pinyin, "pinyin");
        String strSubstring = pinyin.substring(0, 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String upperCase = strSubstring.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (new Regex("[A-Z]").matches(upperCase)) {
            Locale locale2 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
            String upperCase2 = upperCase.toUpperCase(locale2);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            return upperCase2;
        }
        if (pinyin.length() != 1) {
            String strSubstring2 = pinyin.substring(1, 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            Locale locale3 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale3, "getDefault(...)");
            String upperCase3 = strSubstring2.toUpperCase(locale3);
            Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
            if (new Regex("[A-Z]").matches(upperCase3)) {
                Locale locale4 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale4, "getDefault(...)");
                String upperCase4 = upperCase3.toUpperCase(locale4);
                Intrinsics.checkNotNullExpressionValue(upperCase4, "toUpperCase(...)");
                return upperCase4;
            }
        }
        return PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX;
    }
}
