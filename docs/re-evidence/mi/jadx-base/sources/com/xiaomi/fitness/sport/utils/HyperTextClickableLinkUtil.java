package com.xiaomi.fitness.sport.utils;

import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import defpackage.aki;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/sport/utils/HyperTextClickableLinkUtil;", "", "<init>", "()V", "setHyperTextClickableLink", "", "textView", "Landroid/widget/TextView;", "wholeText", "", "termTitleArray", "", "", "urls", "urlTitles", "(Landroid/widget/TextView;Ljava/lang/String;[Ljava/lang/Integer;[Ljava/lang/String;[Ljava/lang/String;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHyperTextClickableLinkUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HyperTextClickableLinkUtil.kt\ncom/xiaomi/fitness/sport/utils/HyperTextClickableLinkUtil\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,52:1\n13467#2,3:53\n*S KotlinDebug\n*F\n+ 1 HyperTextClickableLinkUtil.kt\ncom/xiaomi/fitness/sport/utils/HyperTextClickableLinkUtil\n*L\n27#1:53,3\n*E\n"})
public final class HyperTextClickableLinkUtil {

    @NotNull
    public static final HyperTextClickableLinkUtil INSTANCE = new HyperTextClickableLinkUtil();

    private HyperTextClickableLinkUtil() {
    }

    public final void setHyperTextClickableLink(@NotNull TextView textView, @NotNull String wholeText, @NotNull Integer[] termTitleArray, @NotNull final String[] urls, @NotNull final String[] urlTitles) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(wholeText, "wholeText");
        Intrinsics.checkNotNullParameter(termTitleArray, "termTitleArray");
        Intrinsics.checkNotNullParameter(urls, "urls");
        Intrinsics.checkNotNullParameter(urlTitles, "urlTitles");
        SpannableString spannableString = new SpannableString(wholeText);
        int length = termTitleArray.length;
        int i = 0;
        final int i2 = 0;
        while (i < length) {
            String string = ResourceExtKt.getString(termTitleArray[i].intValue());
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) wholeText, string, 0, false, 6, (Object) null);
            spannableString.setSpan(new ClickableSpan() { // from class: com.xiaomi.fitness.sport.utils.HyperTextClickableLinkUtil$setHyperTextClickableLink$1$1
                @Override // android.text.style.ClickableSpan
                public void onClick(View p0) {
                    Intrinsics.checkNotNullParameter(p0, "p0");
                    String[] strArr = urls;
                    int i3 = i2;
                    WebViewUtilKt.startWebView$default(strArr[i3], urlTitles[i3], false, false, 12, null);
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint ds) {
                    Intrinsics.checkNotNullParameter(ds, "ds");
                    super.updateDrawState(ds);
                    ds.setUnderlineText(false);
                    ds.setColor(ResourceExtKt.getResourceColor(ApplicationExtKt.getApplication(), aki.f1135b));
                    ds.setFakeBoldText(false);
                }
            }, iIndexOf$default, string.length() + iIndexOf$default, 17);
            i++;
            i2++;
        }
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
