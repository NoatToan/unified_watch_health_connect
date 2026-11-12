package com.huami.heartrate.utils;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import androidx.annotation.ColorInt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\b\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u001a5\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\f\"\u001e\u0010\u0010\u001a\n \u000e*\u0004\u0018\u00010\r0\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0011"}, d2 = {"", "text", "Landroid/graphics/Typeface;", "typeface", "", "digitTextSize", "digitTextColor", "Landroid/text/SpannableStringBuilder;", "getDigitsSpannableStringBuilder", "", "Landroid/text/style/CharacterStyle;", "a", "(Landroid/graphics/Typeface;Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/util/List;", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "Ljava/util/regex/Pattern;", "digitsPattern", "heartrate_release"}, k = 2, mv = {1, 5, 1})
public final class SpannableStringKt {
    private static final Pattern a = Pattern.compile("\\d+");

    private static final List<CharacterStyle> a(Typeface typeface, Integer num, @ColorInt Integer num2) {
        ArrayList arrayList = new ArrayList();
        if (typeface != null) {
            arrayList.add(new a(typeface));
        }
        if (num != null) {
            arrayList.add(new AbsoluteSizeSpan(num.intValue()));
        }
        if (num2 != null) {
            arrayList.add(new ForegroundColorSpan(num2.intValue()));
        }
        return arrayList;
    }

    @NotNull
    public static final SpannableStringBuilder getDigitsSpannableStringBuilder(@Nullable String str, @Nullable Typeface typeface, int i, @ColorInt int i2) {
        Boolean boolValueOf;
        if (str == null) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(str.length() == 0);
        }
        if (boolValueOf == null) {
            return new SpannableStringBuilder();
        }
        boolValueOf.booleanValue();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        Matcher matcher = a.matcher(str);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            Iterator<CharacterStyle> it2 = a(typeface, Integer.valueOf(i), Integer.valueOf(i2)).iterator();
            while (it2.hasNext()) {
                spannableStringBuilder.setSpan(it2.next(), iStart, iEnd, 18);
            }
        }
        return spannableStringBuilder;
    }
}
