package ea;

import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    private g() {
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, Object obj, int i14, int i15) {
        for (Object obj2 : spannableStringBuilder.getSpans(i14, i15, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i14 && spannableStringBuilder.getSpanEnd(obj2) == i15 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i14, i15, 33);
    }
}
