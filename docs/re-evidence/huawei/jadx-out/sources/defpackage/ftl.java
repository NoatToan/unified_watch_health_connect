package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import androidx.core.content.ContextCompat;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes7.dex */
public class ftl {
    public static String a(double d) {
        return UnitUtil.e(d, 1, 0);
    }

    public static SpannableString d(Context context, String str, String str2) {
        return e(context, str, str2, R.dimen.textSizeHeadline8);
    }

    public static SpannableString e(Context context, String str, String str2, int i) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("ActiveUtil", "getSpannableString context is null or part and content is empty");
            return null;
        }
        SpannableString spannableString = new SpannableString(str2);
        int iIndexOf = str2.indexOf(str);
        if (iIndexOf == -1) {
            LogUtil.j("ActiveUtil", "getSpannableString content not contains part");
            return spannableString;
        }
        int length = str.length() + iIndexOf;
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(context, R.color.textColorPrimary)), iIndexOf, length, 34);
        spannableString.setSpan(new TypefaceSpan(context.getString(R.string.textFontFamilyMedium)), iIndexOf, length, 34);
        spannableString.setSpan(new AbsoluteSizeSpan(context.getResources().getDimensionPixelSize(i)), iIndexOf, length, 34);
        return spannableString;
    }

    public static SpannableString b(Context context, String str, String str2, int i) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("ActiveUtil", "getTextSpannableString context is null or part and content is empty");
            return null;
        }
        SpannableString spannableString = new SpannableString(str2);
        int iLastIndexOf = str2.lastIndexOf(str);
        if (iLastIndexOf == -1) {
            LogUtil.j("ActiveUtil", "getSpannableString content not contains part");
            return spannableString;
        }
        int length = str.length() + iLastIndexOf;
        if (iLastIndexOf >= 0 && iLastIndexOf < length && length <= str2.length()) {
            spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(context, R.color.textColorPrimary)), iLastIndexOf, length, 34);
            spannableString.setSpan(new TypefaceSpan(context.getString(R.string.textFontFamilyMedium)), iLastIndexOf, length, 34);
            spannableString.setSpan(new AbsoluteSizeSpan(context.getResources().getDimensionPixelSize(i)), iLastIndexOf, length, 34);
        }
        return spannableString;
    }

    public static SpannableString c(Context context, String str, String str2, int i) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("ActiveUtil", "getColorSpannableString context is null or part and content is empty");
            return null;
        }
        SpannableString spannableString = new SpannableString(str2);
        int iLastIndexOf = str2.lastIndexOf(str);
        if (iLastIndexOf == -1) {
            LogUtil.j("ActiveUtil", "getColorSpannableString content not contains part");
            return spannableString;
        }
        int length = str.length() + iLastIndexOf;
        if (iLastIndexOf >= 0 && iLastIndexOf < length && length <= str2.length()) {
            spannableString.setSpan(new ForegroundColorSpan(qqn.d(i)), iLastIndexOf, length, 34);
            spannableString.setSpan(new TypefaceSpan(context.getString(R.string.textFontFamilyMedium)), iLastIndexOf, length, 34);
            spannableString.setSpan(new AbsoluteSizeSpan(context.getResources().getDimensionPixelSize(R.dimen.textSizeBody2)), iLastIndexOf, length, 34);
        }
        return spannableString;
    }

    public static SpannableString d(String str, String str2, int i) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        SpannableString spannableString = new SpannableString(str);
        int length = str2.length();
        int iIndexOf = str.indexOf(str2);
        AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(i);
        if (iIndexOf == -1) {
            length = str.length();
            iIndexOf = 0;
        }
        spannableString.setSpan(absoluteSizeSpan, iIndexOf, length + iIndexOf, 17);
        return spannableString;
    }

    public static boolean d(fsj fsjVar, fsj fsjVar2) {
        return fsjVar != null && fsjVar2 != null && fsjVar.t() == fsjVar2.t() && fsjVar.u() == fsjVar2.u() && fsjVar.x() == fsjVar2.x() && fsjVar.g() == fsjVar2.g() && fsjVar.i() == fsjVar2.i() && fsjVar.p() == fsjVar2.p() && fsjVar.q() == fsjVar2.q() && fsjVar.b() == fsjVar2.b() && fsjVar.c() == fsjVar2.c() && fsjVar.h() == fsjVar2.h() && fsjVar.j() == fsjVar2.j() && fsjVar.s() == fsjVar2.s();
    }
}
