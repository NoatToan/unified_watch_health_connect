package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import androidx.core.content.ContextCompat;
import com.huawei.hihealth.data.model.HiStressMetaData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class ugh {
    public static boolean b(int i) {
        return i >= 80 && i <= 99;
    }

    public static boolean c(int i) {
        return i >= 30 && i < 60;
    }

    public static boolean e(int i) {
        return i >= 60 && i < 80;
    }

    public static boolean j(int i) {
        return i > 0 && i < 30;
    }

    public static String a(int i) {
        if (i > 0 && i < 30) {
            return qre.f(R.string.IDS_hw_pressure_relaxed);
        }
        if (i >= 30 && i < 60) {
            return qre.f(R.string.IDS_hw_pressure_normal);
        }
        if (i >= 60 && i < 80) {
            return qre.f(R.string.IDS_hw_show_card_pressure_measure_calibrate_grade_item_3);
        }
        if (i >= 80 && i < 100) {
            return qre.f(R.string.IDS_hw_pressure_highly);
        }
        LogUtil.a("UiUtils", "invalid stress value, please check.");
        return "";
    }

    public static String[] d(int i) {
        Context context = BaseApplication.getContext();
        String string = context.getString(R.string.IDS_settings_one_level_menu_settings_item_text_id14);
        String string2 = context.getString(R.string.IDS_hw_pressure_ratio);
        if (i != 10001) {
            string2 = string + string2;
            if (i == 10002) {
                string = context.getString(R.string.IDS_hw_pressure_ratio_in_week);
            } else if (i == 10003) {
                string = context.getString(R.string.IDS_hw_pressure_ratio_in_month);
            } else if (i == 10004) {
                string = context.getString(R.string.IDS_hw_pressure_ration_in_year);
            } else {
                LogUtil.j("UiUtils", "updateDescForPieChart failed, cause type = ", Integer.valueOf(i), " is unknown!");
                string = "";
            }
        }
        return new String[]{string, string2};
    }

    public static List<qjp> b(List<wut> list) {
        int[] iArr = new int[4];
        Iterator<wut> it = list.iterator();
        while (it.hasNext()) {
            int iC = it.next().c();
            if (j(iC)) {
                iArr[3] = iArr[3] + 1;
            } else if (c(iC)) {
                iArr[2] = iArr[2] + 1;
            } else if (e(iC)) {
                iArr[1] = iArr[1] + 1;
            } else if (b(iC)) {
                iArr[0] = iArr[0] + 1;
            } else {
                LogUtil.j("UiUtils", "get chart items for pressure invalid pressure value = " + iC);
            }
        }
        List<String> listA = a();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Context context = BaseApplication.getContext();
        arrayList.add(Integer.valueOf(ContextCompat.getColor(context, R.color.pie_sector_high_pressure_color_begin)));
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(context, R.color.pie_sector_high_pressure_color_end)));
        arrayList.add(Integer.valueOf(ContextCompat.getColor(context, R.color.pie_sector_medium_pressure_color_begin)));
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(context, R.color.pie_sector_medium_pressure_color_end)));
        arrayList.add(Integer.valueOf(ContextCompat.getColor(context, R.color.pie_sector_normal_pressure_color_begin)));
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(context, R.color.pie_sector_normal_pressure_color_end)));
        arrayList.add(Integer.valueOf(ContextCompat.getColor(context, R.color.pie_sector_relax_pressure_color_begin)));
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(context, R.color.pie_sector_relax_pressure_color_end)));
        ArrayList arrayList3 = new ArrayList(4);
        int i = 0;
        while (i < 4) {
            arrayList3.add(new qjp(i < listA.size() ? listA.get(i) : "", iArr[i], i < arrayList2.size() ? ((Integer) arrayList2.get(i)).intValue() : 0, i < arrayList.size() ? ((Integer) arrayList.get(i)).intValue() : 0));
            i++;
        }
        return arrayList3;
    }

    private static List<String> a() {
        String strE = UnitUtil.e(1.0d, 1, 0);
        String strE2 = UnitUtil.e(29.0d, 1, 0);
        String strE3 = UnitUtil.e(30.0d, 1, 0);
        String strE4 = UnitUtil.e(59.0d, 1, 0);
        String strE5 = UnitUtil.e(60.0d, 1, 0);
        String strE6 = UnitUtil.e(79.0d, 1, 0);
        String strE7 = UnitUtil.e(80.0d, 1, 0);
        String strE8 = UnitUtil.e(99.0d, 1, 0);
        Context context = BaseApplication.getContext();
        String string = context.getString(R.string.IDS_hw_pressure_grade_range, strE, strE2);
        String string2 = context.getString(R.string.IDS_hw_pressure_grade_range, strE3, strE4);
        String string3 = context.getString(R.string.IDS_hw_pressure_grade_range, strE5, strE6);
        String string4 = context.getString(R.string.IDS_hw_pressure_grade_range, strE7, strE8);
        if (LanguageUtil.ba(context)) {
            string = context.getString(R.string.IDS_hw_pressure_grade_range, strE2, strE);
            string2 = context.getString(R.string.IDS_hw_pressure_grade_range, strE4, strE3);
            string3 = context.getString(R.string.IDS_hw_pressure_grade_range, strE6, strE5);
            string4 = context.getString(R.string.IDS_hw_pressure_grade_range, strE8, strE7);
        }
        String strF = qre.f(R.string.IDS_hw_pressure_relaxed);
        String strF2 = qre.f(R.string.IDS_hw_pressure_normal);
        String strF3 = qre.f(R.string.IDS_hw_show_card_pressure_measure_calibrate_grade_item_3);
        String strF4 = qre.f(R.string.IDS_hw_pressure_highly);
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(strF4 + " " + string4);
        arrayList.add(strF3 + " " + string3);
        arrayList.add(strF2 + " " + string2);
        arrayList.add(strF + " " + string);
        return arrayList;
    }

    public static SpannableStringBuilder e(List<wut> list, String str, int i) {
        Context context = BaseApplication.getContext();
        if (i != 10001) {
            int iC = uis.c(list);
            return c(str, UnitUtil.e(iC, 1, 0), wvb.a(iC));
        }
        float fI = qrs.i();
        String string = context.getString(R.string.IDS_hw_pressure_and_trend_curves);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) string).append((CharSequence) System.lineSeparator()).append((CharSequence) uis.e(list));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(context, R.color.textColorSecondary)), 0, string.length(), 33);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) (fI * 14.0f), true), 0, string.length(), 33);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder c(String str, String str2, String str3) {
        float fI = qrs.i();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str).append((CharSequence) System.lineSeparator()).append((CharSequence) str2).append((CharSequence) " ").append((CharSequence) str3);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(BaseApplication.getContext(), R.color.textColorSecondary)), 0, str.length(), 33);
        int i = (int) (fI * 14.0f);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(i, true), 0, str.length(), 33);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(i, true), spannableStringBuilder.length() - str3.length(), spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static int c(ArrayList<HiStressMetaData> arrayList) {
        Iterator<HiStressMetaData> it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            int iFetchStressScore = it.next().fetchStressScore();
            if (iFetchStressScore > 0) {
                i2 += iFetchStressScore;
                i++;
            }
        }
        LogUtil.a("UiUtils", "getAvg count = ", Integer.valueOf(i));
        if (i > 0) {
            return i2 / i;
        }
        return 0;
    }

    public static int c(List<wut> list) {
        Iterator<wut> it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            int iC = it.next().c();
            if (iC > 0) {
                i2 += iC;
                i++;
            }
        }
        LogUtil.a("UiUtils", "getAvg count = ", Integer.valueOf(i));
        if (i > 0) {
            return i2 / i;
        }
        return 0;
    }
}
