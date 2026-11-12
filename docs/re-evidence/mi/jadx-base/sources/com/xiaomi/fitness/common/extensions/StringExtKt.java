package com.xiaomi.fitness.common.extensions;

import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0002\u001a\u001a\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u001au\u0010\b\u001a\u00020\t*\u00020\u00022\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062<\b\u0002\u0010\f\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0012\u001ah\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00062:\u0010\u0018\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rH\u0002\u001a\u001e\u0010\u0019\u001a\u00020\u0002*\u0004\u0018\u00010\u00022\u0006\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u001c¨\u0006\u001d"}, d2 = {"toLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "spannable", "", "highColorId", "", "textSize", "clickSpannable", "", "titles", "", "onClickListener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "title", "url", "(Ljava/lang/String;[Ljava/lang/String;IILkotlin/jvm/functions/Function2;)Ljava/lang/CharSequence;", "setLinkClickable", "builder", "Landroid/text/SpannableStringBuilder;", "urlSpan", "Landroid/text/style/URLSpan;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "subStringByByte", "bytCounts", "charset", "Ljava/nio/charset/Charset;", "common_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStringExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringExt.kt\ncom/xiaomi/fitness/common/extensions/StringExtKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,112:1\n13467#2,3:113\n*S KotlinDebug\n*F\n+ 1 StringExt.kt\ncom/xiaomi/fitness/common/extensions/StringExtKt\n*L\n54#1:113,3\n*E\n"})
public final class StringExtKt {
    @NotNull
    public static final CharSequence clickSpannable(@NotNull String str, @Nullable String[] strArr, int i, int i2, @Nullable Function2<? super String, ? super String, Unit> function2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Spanned spannedFromHtml = Html.fromHtml(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedFromHtml);
        int i3 = 0;
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            int length = uRLSpanArr.length;
            int i4 = 0;
            while (i3 < length) {
                int i5 = i4 + 1;
                setLinkClickable(spannableStringBuilder, uRLSpanArr[i3], strArr != null ? strArr[i4] : null, i, function2);
                i3++;
                i4 = i5;
            }
        }
        return spannableStringBuilder;
    }

    public static /* synthetic */ CharSequence clickSpannable$default(String str, String[] strArr, int i, int i2, Function2 function2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            strArr = null;
        }
        if ((i3 & 2) != 0) {
            i = -1;
        }
        if ((i3 & 4) != 0) {
            i2 = -1;
        }
        if ((i3 & 8) != 0) {
            function2 = null;
        }
        return clickSpannable(str, strArr, i, i2, function2);
    }

    private static final void setLinkClickable(SpannableStringBuilder spannableStringBuilder, final URLSpan uRLSpan, final String str, final int i, final Function2<? super String, ? super String, Unit> function2) {
        int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
        int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
        ClickableSpan clickableSpan = new ClickableSpan() { // from class: com.xiaomi.fitness.common.extensions.StringExtKt$setLinkClickable$clickSpan$1
            @Override // android.text.style.ClickableSpan
            public void onClick(View widget) {
                Intrinsics.checkNotNullParameter(widget, "widget");
                URLSpan uRLSpan2 = uRLSpan;
                String url = uRLSpan2 != null ? uRLSpan2.getURL() : null;
                if (url == null || url.length() == 0) {
                    Logger.i("url is empty or null", new Object[0]);
                    return;
                }
                Function2<String, String, Unit> function3 = function2;
                if (function3 != null) {
                    String str2 = str;
                    URLSpan uRLSpan3 = uRLSpan;
                    Intrinsics.checkNotNull(uRLSpan3);
                    String url2 = uRLSpan3.getURL();
                    Intrinsics.checkNotNullExpressionValue(url2, "getURL(...)");
                    function3.invoke(str2, url2);
                }
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint ds) {
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                int i2 = i;
                if (i2 != -1) {
                    ds.setColor(ExtUtilsKt.getColor(i2));
                }
                ds.setUnderlineText(true);
            }
        };
        StyleSpan styleSpan = new StyleSpan(1);
        spannableStringBuilder.setSpan(clickableSpan, spanStart, spanEnd, 33);
        spannableStringBuilder.setSpan(styleSpan, spanStart, spanEnd, 33);
    }

    public static final void spannable(@NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
    }

    @NotNull
    public static final String subStringByByte(@Nullable String str, int i, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (str == null || str.length() == 0) {
            return "";
        }
        int length = str.length();
        int i2 = 0;
        int length2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            String strSubstring = str.substring(i2, i3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            byte[] bytes = strSubstring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            length2 += bytes.length;
            if (length2 > i) {
                char[] charArray = strSubstring.toCharArray();
                Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
                char c = charArray[0];
                if (56064 > c || c >= 57343) {
                    String strSubstring2 = str.substring(0, i2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    return strSubstring2;
                }
                String strSubstring3 = str.substring(RangesKt___RangesKt.coerceAtLeast(0, i2 - 1));
                Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                return strSubstring3;
            }
            i2 = i3;
        }
        return str;
    }

    public static /* synthetic */ String subStringByByte$default(String str, int i, Charset charset, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        return subStringByByte(str, i, charset);
    }

    @NotNull
    public static final MutableLiveData<String> toLiveData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new MutableLiveData<>(str);
    }
}
