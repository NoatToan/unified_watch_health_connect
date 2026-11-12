package com.huami.widget.typeface;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes17.dex */
public class TypefaceSpanUtils {
    private static final Pattern a = Pattern.compile("\\d+");

    @NonNull
    public static List<CharacterStyle> getCharacterStyles(@Nullable Context context, @Nullable Font font, @Nullable @Px Integer num, @Nullable @ColorInt Integer num2) {
        ArrayList arrayList = new ArrayList();
        if (context != null && font != null) {
            arrayList.add(getTypefaceSpan(context, font));
        }
        if (num != null) {
            arrayList.add(new AbsoluteSizeSpan(num.intValue()));
        }
        if (num2 != null) {
            arrayList.add(new ForegroundColorSpan(num2.intValue()));
        }
        return arrayList;
    }

    @NonNull
    public static SpannableStringBuilder getStyledDigitsSpannableStringBuilder(@Nullable String str, @Nullable Context context, @Nullable Font font, @Nullable @Px Integer num, @Nullable @ColorInt Integer num2) {
        if (str == null || str.isEmpty()) {
            return new SpannableStringBuilder();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        Matcher matcher = a.matcher(str);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            Iterator<CharacterStyle> it2 = getCharacterStyles(context, font, num, num2).iterator();
            while (it2.hasNext()) {
                spannableStringBuilder.setSpan(it2.next(), iStart, iEnd, 18);
            }
        }
        return spannableStringBuilder;
    }

    @NonNull
    public static MetricAffectingSpan getTypefaceSpan(@Nullable Context context, @Nullable String str) {
        return getTypefaceSpan(context, Font.from(str));
    }

    @NonNull
    public static MetricAffectingSpan getTypefaceSpan(@Nullable Context context, @Nullable Font font) {
        return new a(TypefaceManager.get().getTypeface(context, font));
    }
}
