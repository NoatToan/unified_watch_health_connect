package com.huami.healthlabel.utils.ext;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import androidx.annotation.ColorRes;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u001a\u0016\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0000\"\u001a\u0010\u0007\u001a\u00020\u0001*\u00020\u00048B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u001a\u0010\n\u001a\u00020\u0004*\u00020\u00048@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u001a\u0010\f\u001a\u00020\u0004*\u00020\u00048@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t\"\u001a\u0010\u000f\u001a\u00020\u0004*\u00020\u00018@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroid/content/Context;", "", "colorRes", "color", "", "a", "(Ljava/lang/String;)I", "colorInt", "getTextColorChange", "(Ljava/lang/String;)Ljava/lang/String;", "textColorChange", "getConvertColor", "convertColor", "getBg2TextColor", "(I)Ljava/lang/String;", "bg2TextColor", "healthLabel_release"}, k = 2, mv = {1, 5, 1})
public final class ColorExtKt {
    private static final int a(String str) {
        return Color.parseColor(str);
    }

    public static final int color(@NotNull Context context, @ColorRes int i) {
        return Build.VERSION.SDK_INT >= 23 ? context.getColor(i) : context.getResources().getColor(i);
    }

    @NotNull
    public static final String getBg2TextColor(int i) {
        if (i != a(InputColor.BACKGROUND_BLUE_COLOR)) {
            if (i == a("#F66A15")) {
                return "#F66A15";
            }
            if (i == a("#009E7A")) {
                return "#009E7A";
            }
            if (i == a("#985FFC")) {
                return "#985FFC";
            }
            if (i == a("#FF5850")) {
                return "#FF5850";
            }
        }
        return InputColor.TEXT_BLUE_COLOR;
    }

    @NotNull
    public static final String getConvertColor(@NotNull String str) {
        String textColorChange = getTextColorChange(str);
        switch (textColorChange.hashCode()) {
            case -1876843581:
                return !textColorChange.equals(InputColor.TEXT_BLUE_COLOR) ? str : InputColor.BACKGROUND_BLUE_COLOR;
            case -1876815111:
                return !textColorChange.equals("#009E7A") ? str : "#009E7A";
            case -1611882320:
                return !textColorChange.equals("#985FFC") ? str : "#985FFC";
            case -1241526078:
                return !textColorChange.equals("#F66A15") ? str : "#F66A15";
            case -1226788063:
                return !textColorChange.equals("#FF5850") ? str : "#FF5850";
            default:
                return str;
        }
    }

    @NotNull
    public static final String getTextColorChange(@NotNull String str) {
        switch (str.hashCode()) {
            case -1761037241:
                return !str.equals("#41E0EA") ? str : "#985FFC";
            case -1673272363:
                return !str.equals("#73F19D") ? str : "#009E7A";
            case -1642909163:
                return !str.equals("#85B7FF") ? str : InputColor.TEXT_BLUE_COLOR;
            case -1226659878:
                return !str.equals("#FF9AA0") ? str : "#FF5850";
            case -1226418029:
                return !str.equals("#FFAE6B") ? str : "#F66A15";
            default:
                return str;
        }
    }
}
