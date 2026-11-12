package androidx.compose.ui.text.platform.extensions;

import android.os.Build;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.LocaleSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.FontFeatureSpan;
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;
import androidx.compose.ui.text.android.style.LineHeightSpan;
import androidx.compose.ui.text.android.style.ShadowSpan;
import androidx.compose.ui.text.android.style.SkewXSpan;
import androidx.compose.ui.text.android.style.TextDecorationSpan;
import androidx.compose.ui.text.android.style.TypefaceSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.TypefaceAdapter;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import com.google.android.exoplayer2.text.ttml.b;
import com.huami.watch.notification.TransportUri;
import com.xiaomi.market.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function3;
import kotlin.math.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a$\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a&\u0010\u000e\u001a\u00020\u0006*\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0000\u001a1\u0010\u0013\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a8\u0010\u001c\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0000\u001a:\u0010\"\u001a\u00020\u0006*\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\r\u001a\u00020\f2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u001ej\b\u0012\u0004\u0012\u00020\u001f` H\u0002\u001a0\u0010#\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00162\u0006\u0010\u001b\u001a\u00020\u001aH\u0002\u001aF\u0010'\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010\u00182\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00162\u001e\u0010&\u001a\u001a\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060%H\u0000\u001a'\u0010,\u001a\u0004\u0018\u00010)2\u0006\u0010(\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+\u001a&\u0010/\u001a\u00020\u0006*\u00020\u00002\b\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a1\u00104\u001a\u00020\u0006*\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103\u001a&\u00107\u001a\u00020\u0006*\u00020\u00002\b\u00106\u001a\u0004\u0018\u0001052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a&\u0010:\u001a\u00020\u0006*\u00020\u00002\b\u00109\u001a\u0004\u0018\u0001082\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a&\u0010=\u001a\u00020\u0006*\u00020\u00002\b\u0010<\u001a\u0004\u0018\u00010;2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a9\u0010A\u001a\u00020\u0006*\u00020\u00002\u0006\u0010>\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b?\u0010@\u001a&\u0010D\u001a\u00020\u0006*\u00020\u00002\b\u0010C\u001a\u0004\u0018\u00010B2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a1\u0010F\u001a\u00020\u0006*\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bE\u00103\u001a3\u0010K\u001a\u00020\u0006*\u00020\u00002\b\u0010H\u001a\u0004\u0018\u00010G2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bI\u0010J\u001a\f\u0010M\u001a\u00020L*\u00020\u0014H\u0002\u001a\u0016\u0010O\u001a\u00020\u0018*\u0004\u0018\u00010\u00182\u0006\u0010N\u001a\u00020\u0018H\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006P"}, d2 = {"Landroid/text/Spannable;", "", "span", "", "start", "end", "", "setSpan", "Landroidx/compose/ui/text/style/TextIndent;", "textIndent", "", "contextFontSize", "Landroidx/compose/ui/unit/Density;", Constants.JSON_DENSITY, "setTextIndent", "Landroidx/compose/ui/unit/TextUnit;", "lineHeight", "setLineHeight-r9BaKPg", "(Landroid/text/Spannable;JFLandroidx/compose/ui/unit/Density;)V", "setLineHeight", "Landroidx/compose/ui/text/TextStyle;", "contextTextStyle", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "spanStyles", "Landroidx/compose/ui/text/platform/TypefaceAdapter;", "typefaceAdapter", "setSpanStyles", "spanStyleRange", "Ljava/util/ArrayList;", "Landroidx/compose/ui/text/platform/extensions/SpanRange;", "Lkotlin/collections/ArrayList;", "lowPrioritySpans", "setSpanStyle", "setFontAttributes", "contextFontSpanStyle", "Lkotlin/Function3;", TransportUri.ACTION_BLOCK, "flattenFontStylesAndApply", "letterSpacing", "Landroid/text/style/MetricAffectingSpan;", "createLetterSpacingSpan-eAf_CNQ", "(JLandroidx/compose/ui/unit/Density;)Landroid/text/style/MetricAffectingSpan;", "createLetterSpacingSpan", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "setShadow", "Landroidx/compose/ui/graphics/Color;", "color", "setBackground-RPmYEkk", "(Landroid/text/Spannable;JII)V", "setBackground", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "setLocaleList", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textGeometricTransform", "setGeometricTransform", "", "fontFeatureSettings", "setFontFeatureSettings", b.J, "setFontSize-KmRG4DE", "(Landroid/text/Spannable;JLandroidx/compose/ui/unit/Density;II)V", "setFontSize", "Landroidx/compose/ui/text/style/TextDecoration;", b.P, "setTextDecoration", "setColor-RPmYEkk", "setColor", "Landroidx/compose/ui/text/style/BaselineShift;", "baselineShift", "setBaselineShift-0ocSgnM", "(Landroid/text/Spannable;Landroidx/compose/ui/text/style/BaselineShift;II)V", "setBaselineShift", "", "hasFontAttributes", "spanStyle", "merge", "ui-text_release"}, k = 2, mv = {1, 5, 1})
public final class SpannableExtensions_androidKt {
    /* JADX INFO: renamed from: createLetterSpacingSpan-eAf_CNQ, reason: not valid java name */
    private static final MetricAffectingSpan m2864createLetterSpacingSpaneAf_CNQ(long j, Density density) {
        long jM3105getTypeUIouoOA = TextUnit.m3105getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m3134equalsimpl0(jM3105getTypeUIouoOA, companion.m3139getSpUIouoOA())) {
            return new LetterSpacingSpanPx(density.mo192toPxR2X_6o(j));
        }
        if (TextUnitType.m3134equalsimpl0(jM3105getTypeUIouoOA, companion.m3138getEmUIouoOA())) {
            return new LetterSpacingSpanEm(TextUnit.m3106getValueimpl(j));
        }
        return null;
    }

    public static final void flattenFontStylesAndApply(@Nullable SpanStyle spanStyle, @NotNull List<AnnotatedString.Range<SpanStyle>> list, @NotNull Function3<? super SpanStyle, ? super Integer, ? super Integer, Unit> function3) {
        if (list.size() <= 1) {
            if (!list.isEmpty()) {
                function3.invoke(merge(spanStyle, list.get(0).getItem()), Integer.valueOf(list.get(0).getStart()), Integer.valueOf(list.get(0).getEnd()));
                return;
            }
            return;
        }
        int size = list.size();
        int i = size * 2;
        Integer[] numArr = new Integer[i];
        for (int i2 = 0; i2 < i; i2++) {
            numArr[i2] = 0;
        }
        int size2 = list.size() - 1;
        if (size2 >= 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                AnnotatedString.Range<SpanStyle> range = list.get(i3);
                numArr[i3] = Integer.valueOf(range.getStart());
                numArr[i3 + size] = Integer.valueOf(range.getEnd());
                if (i4 > size2) {
                    break;
                } else {
                    i3 = i4;
                }
            }
        }
        ArraysKt___ArraysJvmKt.sort(numArr);
        int iIntValue = ((Number) ArraysKt.first(numArr)).intValue();
        int i5 = 0;
        while (i5 < i) {
            int iIntValue2 = numArr[i5].intValue();
            i5++;
            if (iIntValue2 != iIntValue) {
                int size3 = list.size() - 1;
                SpanStyle spanStyleMerge = spanStyle;
                if (size3 >= 0) {
                    int i6 = 0;
                    while (true) {
                        int i7 = i6 + 1;
                        AnnotatedString.Range<SpanStyle> range2 = list.get(i6);
                        if (AnnotatedStringKt.intersect(iIntValue, iIntValue2, range2.getStart(), range2.getEnd())) {
                            spanStyleMerge = merge(spanStyleMerge, range2.getItem());
                        }
                        if (i7 > size3) {
                            break;
                        } else {
                            i6 = i7;
                        }
                    }
                }
                if (spanStyleMerge != null) {
                    function3.invoke(spanStyleMerge, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
                }
                iIntValue = iIntValue2;
            }
        }
    }

    private static final boolean hasFontAttributes(TextStyle textStyle) {
        return TextPaintExtensions_androidKt.hasFontAttributes(textStyle.toSpanStyle()) || textStyle.getFontSynthesis() != null;
    }

    private static final SpanStyle merge(SpanStyle spanStyle, SpanStyle spanStyle2) {
        return spanStyle == null ? spanStyle2 : spanStyle.merge(spanStyle2);
    }

    /* JADX INFO: renamed from: setBackground-RPmYEkk, reason: not valid java name */
    public static final void m2865setBackgroundRPmYEkk(@NotNull Spannable spannable, long j, int i, int i2) {
        if (j != Color.INSTANCE.m1248getUnspecified0d7_KjU()) {
            setSpan(spannable, new BackgroundColorSpan(ColorKt.m1267toArgb8_81llA(j)), i, i2);
        }
    }

    /* JADX INFO: renamed from: setBaselineShift-0ocSgnM, reason: not valid java name */
    private static final void m2866setBaselineShift0ocSgnM(Spannable spannable, BaselineShift baselineShift, int i, int i2) {
        if (baselineShift == null) {
            return;
        }
        setSpan(spannable, new BaselineShiftSpan(baselineShift.m2876unboximpl()), i, i2);
    }

    /* JADX INFO: renamed from: setColor-RPmYEkk, reason: not valid java name */
    public static final void m2867setColorRPmYEkk(@NotNull Spannable spannable, long j, int i, int i2) {
        if (j != Color.INSTANCE.m1248getUnspecified0d7_KjU()) {
            setSpan(spannable, new ForegroundColorSpan(ColorKt.m1267toArgb8_81llA(j)), i, i2);
        }
    }

    private static final void setFontAttributes(final Spannable spannable, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, final TypefaceAdapter typefaceAdapter) {
        SpanStyle spanStyle;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                AnnotatedString.Range<SpanStyle> range = list.get(i);
                AnnotatedString.Range<SpanStyle> range2 = range;
                if (TextPaintExtensions_androidKt.hasFontAttributes(range2.getItem()) || range2.getItem().getFontSynthesis() != null) {
                    arrayList.add(range);
                }
                if (i2 > size) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        if (hasFontAttributes(textStyle)) {
            spanStyle = new SpanStyle(0L, 0L, textStyle.getFontWeight(), textStyle.getFontStyle(), textStyle.getFontSynthesis(), textStyle.getFontFamily(), null, 0L, null, null, null, 0L, null, null, 16323, null);
        } else {
            spanStyle = null;
        }
        flattenFontStylesAndApply(spanStyle, arrayList, new Function3<SpanStyle, Integer, Integer, Unit>() { // from class: androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.setFontAttributes.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(SpanStyle spanStyle2, Integer num, Integer num2) {
                invoke(spanStyle2, num.intValue(), num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull SpanStyle spanStyle2, int i3, int i4) {
                Spannable spannable2 = spannable;
                TypefaceAdapter typefaceAdapter2 = typefaceAdapter;
                FontFamily fontFamily = spanStyle2.getFontFamily();
                FontWeight fontWeight = spanStyle2.getFontWeight();
                if (fontWeight == null) {
                    fontWeight = FontWeight.INSTANCE.getNormal();
                }
                FontStyle fontStyle = spanStyle2.getFontStyle();
                int iM2765getNormal_LCdwA = fontStyle == null ? FontStyle.INSTANCE.m2765getNormal_LCdwA() : fontStyle.m2763unboximpl();
                FontSynthesis fontSynthesis = spanStyle2.getFontSynthesis();
                spannable2.setSpan(new TypefaceSpan(typefaceAdapter2.m2851createDPcqOEQ(fontFamily, fontWeight, iM2765getNormal_LCdwA, fontSynthesis == null ? FontSynthesis.INSTANCE.m2775getAllGVVA2EU() : fontSynthesis.getValue())), i3, i4, 33);
            }
        });
    }

    private static final void setFontFeatureSettings(Spannable spannable, String str, int i, int i2) {
        if (str == null) {
            return;
        }
        setSpan(spannable, new FontFeatureSpan(str), i, i2);
    }

    /* JADX INFO: renamed from: setFontSize-KmRG4DE, reason: not valid java name */
    public static final void m2868setFontSizeKmRG4DE(@NotNull Spannable spannable, long j, @NotNull Density density, int i, int i2) {
        long jM3105getTypeUIouoOA = TextUnit.m3105getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m3134equalsimpl0(jM3105getTypeUIouoOA, companion.m3139getSpUIouoOA())) {
            setSpan(spannable, new AbsoluteSizeSpan(c.roundToInt(density.mo192toPxR2X_6o(j)), false), i, i2);
        } else if (TextUnitType.m3134equalsimpl0(jM3105getTypeUIouoOA, companion.m3138getEmUIouoOA())) {
            setSpan(spannable, new RelativeSizeSpan(TextUnit.m3106getValueimpl(j)), i, i2);
        }
    }

    private static final void setGeometricTransform(Spannable spannable, TextGeometricTransform textGeometricTransform, int i, int i2) {
        if (textGeometricTransform == null) {
            return;
        }
        setSpan(spannable, new ScaleXSpan(textGeometricTransform.getScaleX()), i, i2);
        setSpan(spannable, new SkewXSpan(textGeometricTransform.getSkewX()), i, i2);
    }

    /* JADX INFO: renamed from: setLineHeight-r9BaKPg, reason: not valid java name */
    public static final void m2869setLineHeightr9BaKPg(@NotNull Spannable spannable, long j, float f, @NotNull Density density) {
        long jM3105getTypeUIouoOA = TextUnit.m3105getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m3134equalsimpl0(jM3105getTypeUIouoOA, companion.m3139getSpUIouoOA())) {
            setSpan(spannable, new LineHeightSpan((int) Math.ceil(density.mo192toPxR2X_6o(j))), 0, spannable.length());
        } else if (TextUnitType.m3134equalsimpl0(jM3105getTypeUIouoOA, companion.m3138getEmUIouoOA())) {
            setSpan(spannable, new LineHeightSpan((int) Math.ceil(TextUnit.m3106getValueimpl(j) * f)), 0, spannable.length());
        }
    }

    public static final void setLocaleList(@NotNull Spannable spannable, @Nullable LocaleList localeList, int i, int i2) {
        Object localeSpan;
        if (localeList == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            localeSpan = LocaleListHelperMethods.INSTANCE.localeSpan(localeList);
        } else {
            localeSpan = new LocaleSpan(LocaleExtensions_androidKt.toJavaLocale(localeList.isEmpty() ? Locale.INSTANCE.getCurrent() : localeList.get(0)));
        }
        setSpan(spannable, localeSpan, i, i2);
    }

    private static final void setShadow(Spannable spannable, Shadow shadow, int i, int i2) {
        if (shadow == null) {
            return;
        }
        setSpan(spannable, new ShadowSpan(ColorKt.m1267toArgb8_81llA(shadow.getColor()), Offset.m983getXimpl(shadow.getOffset()), Offset.m984getYimpl(shadow.getOffset()), shadow.getBlurRadius()), i, i2);
    }

    public static final void setSpan(@NotNull Spannable spannable, @NotNull Object obj, int i, int i2) {
        spannable.setSpan(obj, i, i2, 33);
    }

    private static final void setSpanStyle(Spannable spannable, AnnotatedString.Range<SpanStyle> range, Density density, ArrayList<SpanRange> arrayList) {
        int start = range.getStart();
        int end = range.getEnd();
        SpanStyle item = range.getItem();
        m2866setBaselineShift0ocSgnM(spannable, item.getBaselineShift(), start, end);
        m2867setColorRPmYEkk(spannable, item.getColor(), start, end);
        setTextDecoration(spannable, item.getTextDecoration(), start, end);
        m2868setFontSizeKmRG4DE(spannable, item.getFontSize(), density, start, end);
        setFontFeatureSettings(spannable, item.getFontFeatureSettings(), start, end);
        setGeometricTransform(spannable, item.getTextGeometricTransform(), start, end);
        setLocaleList(spannable, item.getLocaleList(), start, end);
        m2865setBackgroundRPmYEkk(spannable, item.getBackground(), start, end);
        setShadow(spannable, item.getShadow(), start, end);
        MetricAffectingSpan metricAffectingSpanM2864createLetterSpacingSpaneAf_CNQ = m2864createLetterSpacingSpaneAf_CNQ(item.getLetterSpacing(), density);
        if (metricAffectingSpanM2864createLetterSpacingSpaneAf_CNQ == null) {
            return;
        }
        arrayList.add(new SpanRange(metricAffectingSpanM2864createLetterSpacingSpaneAf_CNQ, start, end));
    }

    public static final void setSpanStyles(@NotNull Spannable spannable, @NotNull TextStyle textStyle, @NotNull List<AnnotatedString.Range<SpanStyle>> list, @NotNull Density density, @NotNull TypefaceAdapter typefaceAdapter) {
        setFontAttributes(spannable, textStyle, list, typefaceAdapter);
        ArrayList arrayList = new ArrayList();
        int size = list.size() - 1;
        int i = 0;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                AnnotatedString.Range<SpanStyle> range = list.get(i2);
                int start = range.getStart();
                int end = range.getEnd();
                if (start >= 0 && start < spannable.length() && end > start && end <= spannable.length()) {
                    setSpanStyle(spannable, range, density, arrayList);
                }
                if (i3 > size) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        }
        int size2 = arrayList.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i4 = i + 1;
            SpanRange spanRange = (SpanRange) arrayList.get(i);
            setSpan(spannable, spanRange.getSpan(), spanRange.getStart(), spanRange.getEnd());
            if (i4 > size2) {
                return;
            } else {
                i = i4;
            }
        }
    }

    public static final void setTextDecoration(@NotNull Spannable spannable, @Nullable TextDecoration textDecoration, int i, int i2) {
        if (textDecoration == null) {
            return;
        }
        TextDecoration.Companion companion = TextDecoration.INSTANCE;
        setSpan(spannable, new TextDecorationSpan(textDecoration.contains(companion.getUnderline()), textDecoration.contains(companion.getLineThrough())), i, i2);
    }

    public static final void setTextIndent(@NotNull Spannable spannable, @Nullable TextIndent textIndent, float f, @NotNull Density density) {
        float fM3106getValueimpl;
        if (textIndent == null) {
            return;
        }
        if ((TextUnit.m3103equalsimpl0(textIndent.getFirstLine(), TextUnitKt.getSp(0)) && TextUnit.m3103equalsimpl0(textIndent.getRestLine(), TextUnitKt.getSp(0))) || TextUnitKt.m3124isUnspecifiedR2X_6o(textIndent.getFirstLine()) || TextUnitKt.m3124isUnspecifiedR2X_6o(textIndent.getRestLine())) {
            return;
        }
        long jM3105getTypeUIouoOA = TextUnit.m3105getTypeUIouoOA(textIndent.getFirstLine());
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        float fM3106getValueimpl2 = 0.0f;
        if (TextUnitType.m3134equalsimpl0(jM3105getTypeUIouoOA, companion.m3139getSpUIouoOA())) {
            fM3106getValueimpl = density.mo192toPxR2X_6o(textIndent.getFirstLine());
        } else {
            fM3106getValueimpl = TextUnitType.m3134equalsimpl0(jM3105getTypeUIouoOA, companion.m3138getEmUIouoOA()) ? TextUnit.m3106getValueimpl(textIndent.getFirstLine()) * f : 0.0f;
        }
        long jM3105getTypeUIouoOA2 = TextUnit.m3105getTypeUIouoOA(textIndent.getRestLine());
        if (TextUnitType.m3134equalsimpl0(jM3105getTypeUIouoOA2, companion.m3139getSpUIouoOA())) {
            fM3106getValueimpl2 = density.mo192toPxR2X_6o(textIndent.getRestLine());
        } else if (TextUnitType.m3134equalsimpl0(jM3105getTypeUIouoOA2, companion.m3138getEmUIouoOA())) {
            fM3106getValueimpl2 = TextUnit.m3106getValueimpl(textIndent.getRestLine()) * f;
        }
        setSpan(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(fM3106getValueimpl), (int) Math.ceil(fM3106getValueimpl2)), 0, spannable.length());
    }
}
