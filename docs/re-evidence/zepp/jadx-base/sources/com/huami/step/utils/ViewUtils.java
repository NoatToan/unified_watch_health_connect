package com.huami.step.utils;

import androidx.core.text.TextUtilsCompat;
import java.util.Locale;

/* JADX INFO: loaded from: classes14.dex */
public class ViewUtils {
    public static boolean isRTL() {
        return TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }
}
