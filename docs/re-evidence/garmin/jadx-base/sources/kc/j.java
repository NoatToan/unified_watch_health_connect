package kc;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    private j() {
    }

    public static void a(ea.a.b bVar) {
        bVar.f63578k = -3.4028235E38f;
        bVar.f63577j = Integer.MIN_VALUE;
        CharSequence charSequence = bVar.f63568a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                bVar.f63568a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = bVar.f63568a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static float b(int i14, float f14, int i15, int i16) {
        float f15;
        if (f14 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i14 == 0) {
            f15 = i16;
        } else {
            if (i14 != 1) {
                if (i14 != 2) {
                    return -3.4028235E38f;
                }
                return f14;
            }
            f15 = i15;
        }
        return f14 * f15;
    }
}
