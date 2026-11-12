package defpackage;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import com.huawei.hwlogsmodel.LogUtil;
import java.math.BigDecimal;
import java.util.Locale;

/* JADX INFO: loaded from: classes41.dex */
public class pba {
    public static SpannableString b(String str, String str2, int i, int i2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("PluginAchievement_TextViewUtil", "acquireSpannableStrUtil: content/contentStr empty");
            return new SpannableString("");
        }
        SpannableString spannableString = new SpannableString(str2);
        int iIndexOf = str2.indexOf(str);
        if (iIndexOf < 0) {
            return spannableString;
        }
        spannableString.setSpan(new ForegroundColorSpan(i2), iIndexOf, str.length() + iIndexOf, 18);
        spannableString.setSpan(new AbsoluteSizeSpan(i), iIndexOf, str.length() + iIndexOf, 18);
        return spannableString;
    }

    public static String e(double d) {
        LogUtil.a("PluginAchievement_TextViewUtil", "enter getGreatWallPercent() :");
        double d2 = d / 21196.18d;
        if (d2 >= 1.0d) {
            return String.format(Locale.ROOT, "%.2f", Double.valueOf(d2));
        }
        String plainString = new BigDecimal(String.valueOf(d2)).toPlainString();
        int[] iArrA = a(plainString.substring(plainString.indexOf(".") + 1));
        int i = iArrA[0];
        int i2 = iArrA[1];
        if (i2 == 0 || i == 0) {
            return "0/21196";
        }
        double d3 = i2;
        int iA = a(i, (int) Math.pow(10.0d, d3));
        double dPow = Math.pow(10.0d, d3) / ((double) iA);
        if (dPow > 21196.0d && d > 0.0d) {
            return "1/" + ((int) (21196.18d / d));
        }
        String str = (i / iA) + "/" + ((int) dPow);
        LogUtil.d("PluginAchievement_TextViewUtil", "percent = ", str);
        return str;
    }

    private static int a(int i, int i2) {
        int i3 = i % i2;
        return i3 == 0 ? i2 : a(i2, i3);
    }

    private static int[] a(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length() && str.startsWith("0"); i2++) {
            try {
                str = str.substring(1);
                i++;
            } catch (NumberFormatException e) {
                LogUtil.e("PluginAchievement_TextViewUtil", e.getMessage());
            }
        }
        LogUtil.a("PluginAchievement_TextViewUtil", "value = ", str, ",count = ", Integer.valueOf(i));
        int i3 = 0;
        int i4 = 0;
        while (i3 < str.length()) {
            int i5 = Integer.parseInt(String.valueOf(str.charAt(i3)));
            if (i4 != 0) {
                return new int[]{(i4 * 10) + i5, i3 + 1 + i};
            }
            i3++;
            i4 = i5;
        }
        return new int[]{0, 0};
    }
}
