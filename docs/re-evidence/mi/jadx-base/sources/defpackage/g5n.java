package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.text.style.TextAppearanceSpan;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public class g5n {
    public static SpannableString a(Context context, String str, int i) {
        int iStart;
        int iEnd;
        Matcher matcher = Pattern.compile("-?[0-9]+((.)?[0-9]+)?").matcher(str);
        if (matcher.find()) {
            iStart = matcher.start();
            iEnd = matcher.end();
        } else {
            iStart = 0;
            iEnd = 0;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new TextAppearanceSpan(context, i), iStart, iEnd, 33);
        return spannableString;
    }

    public static SpannableString b(String str, int i, int i2) {
        if (!TextUtils.isEmpty(str) && i < i2) {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new StrikethroughSpan(), i, i2, 33);
            return spannableString;
        }
        return new SpannableString(str);
    }
}
