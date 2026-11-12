package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;

/* JADX INFO: loaded from: classes10.dex */
public class jhj {
    public static SpannableString e(Context context, String str, int i) {
        SpannableString spannableString = new SpannableString(str);
        d(context, spannableString, i);
        return spannableString;
    }

    private static jhc c(Context context, int i, int i2) {
        Drawable drawable = context.getResources().getDrawable(i);
        int i3 = (i2 * 13) / 10;
        drawable.setBounds(0, 0, i3, i3);
        return new jhc(drawable);
    }

    private static void d(Context context, SpannableString spannableString, int i) {
        for (int i2 = 0; i2 < spannableString.length(); i2++) {
            if (spannableString.charAt(i2) == '[') {
                int i3 = i2 + 4;
                if (i3 > spannableString.length()) {
                    return;
                }
                int iC = jhe.c(spannableString.subSequence(i2, i3).toString());
                if (iC > 0) {
                    spannableString.setSpan(c(context, iC, i), i2, i3, 33);
                }
            }
        }
    }
}
