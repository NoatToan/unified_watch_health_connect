package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.TypefaceSpan;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.ui.commonui.utils.HarmonyOsTypefaceSpan;
import health.compact.a.LogUtil;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes16.dex */
public class qri {
    public static void a(SpannableString spannableString, String str, CharacterStyle characterStyle) {
        if (spannableString == null || TextUtils.isEmpty(str)) {
            LogUtil.e("R_SpannableStringUtils", "setSpan source ", spannableString, " key ", str);
            return;
        }
        String string = spannableString.toString();
        if (TextUtils.isEmpty(string)) {
            LogUtil.e("R_SpannableStringUtils", "setSpan sourceText ", string);
            return;
        }
        int iIndexOf = string.indexOf(str);
        if (iIndexOf < 0) {
            LogUtil.e("R_SpannableStringUtils", "setSpan start ", Integer.valueOf(iIndexOf));
        } else {
            spannableString.setSpan(characterStyle, iIndexOf, str.length() + iIndexOf, 17);
        }
    }

    public static int b(SpannableString spannableString, String str) {
        if (spannableString == null || TextUtils.isEmpty(str)) {
            LogUtil.e("R_SpannableStringUtils", "setSpan source ", spannableString, " key ", str);
            return -1;
        }
        String string = spannableString.toString();
        if (TextUtils.isEmpty(string)) {
            LogUtil.e("R_SpannableStringUtils", "setSpan sourceText ", string);
            return -1;
        }
        int iIndexOf = string.indexOf(str);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        LogUtil.e("R_SpannableStringUtils", "setSpan start ", Integer.valueOf(iIndexOf));
        return -1;
    }

    public static void d(SpannableString spannableString, int i, int i2, CharacterStyle characterStyle) {
        if (spannableString == null || i < 0 || i2 < i || i2 > spannableString.length()) {
            LogUtil.e("R_SpannableStringUtils", "setSpan source:", spannableString, " start：", Integer.valueOf(i), " end:", Integer.valueOf(i2));
            return;
        }
        String string = spannableString.toString();
        if (TextUtils.isEmpty(string)) {
            LogUtil.e("R_SpannableStringUtils", "setSpan sourceText ", string);
        } else {
            spannableString.setSpan(characterStyle, i, i2, 17);
        }
    }

    public static void b(SpannableString spannableString, String str, int i) {
        a(spannableString, str, new ForegroundColorSpan(ContextCompat.getColor(BaseApplication.b(), i)));
    }

    public static void c(SpannableString spannableString, String str, int i) {
        a(spannableString, str, new AbsoluteSizeSpan(i));
    }

    public static void d(SpannableString spannableString, String str, int i) {
        a(spannableString, str, new AbsoluteSizeSpan(i, true));
    }

    public static void e(SpannableString spannableString, String str, int i) {
        a(spannableString, str, new TypefaceSpan(qre.f(i)));
    }

    public static void e(SpannableString spannableString, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            a(spannableString, str, new HarmonyOsTypefaceSpan(Typeface.createFromAsset(BaseApplication.b().getAssets(), "fonts/Harmony-Heavy.ttf")));
        } else {
            a(spannableString, str, new qli(Typeface.createFromAsset(BaseApplication.b().getAssets(), "fonts/Harmony-Heavy.ttf")));
        }
    }

    public static void a(SpannableString spannableString, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            a(spannableString, str, new HarmonyOsTypefaceSpan(qrr.c()));
        } else {
            a(spannableString, str, new qli(qrr.c()));
        }
    }

    public static void b(SpannableString spannableString, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            d(spannableString, i, i2, new HarmonyOsTypefaceSpan(qrr.c()));
        } else {
            d(spannableString, i, i2, new qli(qrr.c()));
        }
    }

    public static void e(int i, SpannableString spannableString) {
        if (spannableString == null) {
            LogUtil.e("R_SpannableStringUtils", "setTextNumberMedium source is null.");
            return;
        }
        String string = spannableString.toString();
        if (TextUtils.isEmpty(string)) {
            LogUtil.e("R_SpannableStringUtils", "setTextNumberMedium sourceText ", string);
            return;
        }
        Matcher matcher = Pattern.compile("[\\d\\-]", 2).matcher(spannableString);
        while (matcher.find()) {
            spannableString.setSpan(new TextAppearanceSpan(BaseApplication.b(), i), matcher.start(), matcher.end(), 17);
        }
    }
}
