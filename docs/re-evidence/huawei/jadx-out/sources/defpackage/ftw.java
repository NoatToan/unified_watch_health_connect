package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.text.format.DateUtils;
import androidx.core.content.ContextCompat;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Utils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class ftw {
    public static String d(long j, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(14, 0);
        calendar.set(13, 0);
        calendar.add(12, -(calendar.get(12) % i));
        long timeInMillis = calendar.getTimeInMillis();
        calendar.add(12, i);
        return DateUtils.formatDateRange(BaseApplication.getContext(), timeInMillis, calendar.getTimeInMillis(), 129);
    }

    public static String c(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(14, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.add(11, 1);
        return DateUtils.formatDateRange(BaseApplication.getContext(), timeInMillis, calendar.getTimeInMillis(), 129);
    }

    public static long e(String str) {
        try {
            Date date = new SimpleDateFormat("HH:mm", Locale.getDefault()).parse(str);
            if (date == null) {
                LogUtil.j("SectionChartUtils", "getTimestampByString date is null ", str);
                return System.currentTimeMillis();
            }
            return date.getTime();
        } catch (ParseException unused) {
            LogUtil.j("SectionChartUtils", "getTimestampByString ParseException ", str);
            return System.currentTimeMillis();
        }
    }

    public static int b(int i, int i2) {
        ArrayList arrayList = new ArrayList(d());
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) != null) {
                int iA = ((fde) arrayList.get(size)).a();
                if (iA == 1) {
                    if (b(i, i2, ((fde) arrayList.get(size)).e())) {
                        return 1;
                    }
                } else if (iA == 2) {
                    if (d(i, i2, ((fde) arrayList.get(size)).e())) {
                        return 2;
                    }
                } else if (iA != 3) {
                    continue;
                } else {
                    List<fde.b> listE = ((fde) arrayList.get(size)).e();
                    if (njy.e(listE)) {
                        LogUtil.e("SectionChartUtils", "getBloodPressureType allHighGradeList null");
                        return 0;
                    }
                    for (int size2 = listE.size() - 1; size2 >= 0; size2--) {
                        if (listE.get(size2) != null) {
                            int iA2 = listE.get(size2).a();
                            if (iA2 == 2) {
                                if (njy.e(listE, size2)) {
                                    LogUtil.e("SectionChartUtils", "allHighGradeList OutOfBounds 2");
                                    return 0;
                                }
                                if (a(i, i2, listE, size2)) {
                                    return 5;
                                }
                            } else if (iA2 == 1) {
                                if (njy.e(listE, size2)) {
                                    LogUtil.e("SectionChartUtils", "allHighGradeList OutOfBounds 1");
                                    return 0;
                                }
                                if (b(i, i2, listE, size2)) {
                                    return 4;
                                }
                            } else if (iA2 == 0) {
                                if (njy.e(listE, size2)) {
                                    LogUtil.e("SectionChartUtils", "allHighGradeList OutOfBounds 0");
                                    return 0;
                                }
                                if (d(i, i2, listE, size2)) {
                                    return 3;
                                }
                            } else {
                                LogUtil.e("SectionChartUtils", "getBloodPressureType gradeIndex error");
                            }
                        }
                    }
                }
            }
        }
        LogUtil.d("SectionChartUtils", "bloodType,0");
        return 0;
    }

    public static String c(int i, List<Object> list) {
        int iB = b(i);
        if (list != null && list.size() > iB && (list.get(iB) instanceof String)) {
            return String.valueOf(list.get(iB));
        }
        return "";
    }

    public static int b(int i) {
        if (i > 0 && i < 30) {
            return 0;
        }
        if (i >= 30 && i < 60) {
            return 1;
        }
        if (i >= 60 && i < 80) {
            return 2;
        }
        if (i >= 80 && i < 100) {
            return 3;
        }
        LogUtil.a("SectionChartUtils", "invalid stress value, please check.");
        return 0;
    }

    public static boolean b(int i, int i2, List<fde.b> list) {
        if (njy.e(list)) {
            LogUtil.e("SectionChartUtils", "isIdeal idealGradeList null");
            return false;
        }
        fde.b bVar = list.get(0);
        if (bVar == null) {
            LogUtil.e("SectionChartUtils", "isIdeal categorization null");
            return false;
        }
        List<Integer> listD = bVar.d();
        List<Integer> listE = bVar.e();
        if (c(listD)) {
            LogUtil.e("SectionChartUtils", "isIdeal sysList OutOfBounds");
            return false;
        }
        int iIntValue = listD.get(0).intValue();
        int iIntValue2 = listD.get(1).intValue();
        if (c(listE)) {
            LogUtil.e("SectionChartUtils", "isIdeal diaList OutOfBounds");
            return false;
        }
        int iIntValue3 = listE.get(0).intValue();
        int iIntValue4 = listE.get(1).intValue();
        boolean z = i <= iIntValue2 && i >= iIntValue;
        boolean z2 = i2 <= iIntValue4 && i2 >= iIntValue3;
        if (bVar.b() == 0) {
            return z && z2;
        }
        return z || z2;
    }

    public static boolean d(int i, int i2, List<fde.b> list) {
        return e(i, i2, list, 0);
    }

    public static boolean d(int i, int i2, List<fde.b> list, int i3) {
        return e(i, i2, list, i3);
    }

    public static boolean b(int i, int i2, List<fde.b> list, int i3) {
        return e(i, i2, list, i3);
    }

    public static boolean a(int i, int i2, List<fde.b> list, int i3) {
        if (njy.e(list)) {
            LogUtil.e("SectionChartUtils", "isHigh allHighGradeList null");
            return false;
        }
        fde.b bVar = list.get(i3);
        if (bVar == null) {
            LogUtil.e("SectionChartUtils", "isHigh categorization null");
            return false;
        }
        List<Integer> listD = bVar.d();
        List<Integer> listE = bVar.e();
        if (njy.e(listD, 0)) {
            LogUtil.e("SectionChartUtils", "isHigh sysList OutOfBounds");
            return false;
        }
        int iIntValue = listD.get(0).intValue();
        if (!njy.e(listE, 0)) {
            return i >= iIntValue || i2 >= listE.get(0).intValue();
        }
        LogUtil.e("SectionChartUtils", "isHigh diaList OutOfBounds");
        return false;
    }

    public static ArrayList<fde> d() {
        if (!CommonUtil.ab(BaseApplication.getContext())) {
            if (Utils.o()) {
                LogUtil.d("SectionChartUtils", "getInternationalGradeList");
                return fdm.d().h();
            }
            LogUtil.d("SectionChartUtils", "getDefaultGradeList");
            return fdm.d().b();
        }
        LogUtil.d("SectionChartUtils", "isNetworkConnected");
        ArrayList<fde> arrayListJ = fdm.d().j();
        if (njy.e(arrayListJ)) {
            dfp.d();
        }
        if (njy.e(arrayListJ)) {
            LogUtil.d("SectionChartUtils", "getGradeList is null ");
            if (Utils.o()) {
                LogUtil.d("SectionChartUtils", "getGradeList is null return getInternationalGradeList");
                return fdm.d().h();
            }
            LogUtil.d("SectionChartUtils", "getGradeList is null return getDefaultGradeList");
            return fdm.d().b();
        }
        LogUtil.d("SectionChartUtils", " return getGradeList");
        return fdm.d().j();
    }

    public static boolean c(List<Integer> list) {
        return njy.e(list, 0) || njy.e(list, 1);
    }

    public static boolean e(int i, int i2, List<fde.b> list, int i3) {
        if (njy.e(list)) {
            LogUtil.e("SectionChartUtils", "bloodList null");
            return false;
        }
        fde.b bVar = list.get(i3);
        if (bVar == null) {
            LogUtil.e("SectionChartUtils", "categorization null");
            return false;
        }
        List<Integer> listD = bVar.d();
        List<Integer> listE = bVar.e();
        if (c(listD)) {
            LogUtil.e("SectionChartUtils", " sysList OutOfBounds");
            return false;
        }
        int iIntValue = listD.get(0).intValue();
        int iIntValue2 = listD.get(1).intValue();
        if (c(listE)) {
            LogUtil.e("SectionChartUtils", " diaList OutOfBounds");
            return false;
        }
        int iIntValue3 = listE.get(0).intValue();
        int iIntValue4 = listE.get(1).intValue();
        boolean z = i <= iIntValue2 && i >= iIntValue;
        boolean z2 = i2 <= iIntValue4 && i2 >= iIntValue3;
        if (bVar.b() == 0) {
            return z && z2;
        }
        return z || z2;
    }

    public static int[] b() {
        int[] iArr = {0, 1, 2, 3, 4, 5};
        ArrayList<fde> arrayListD = d();
        if (njy.e(arrayListD)) {
            LogUtil.a("SectionChartUtils", "getBloodPressureGradeTypeList: list is empty");
            return iArr;
        }
        ArrayList arrayList = new ArrayList(arrayListD);
        if (njy.c(arrayList, 3)) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                fde fdeVar = (fde) arrayList.get(size);
                if (fdeVar != null && fdeVar.a() == 3) {
                    List<fde.b> listE = fdeVar.e();
                    if (njy.e(listE)) {
                        LogUtil.e("SectionChartUtils", "getBloodPressureGradeTypeList, gradeList is empty");
                        return iArr;
                    }
                    int size2 = listE.size();
                    LogUtil.a("SectionChartUtils", "getBloodPressureGradeTypeList, count: ", Integer.valueOf(size2));
                    if (size2 == 1) {
                        return new int[]{0, 1, 2, 3};
                    }
                    if (size2 == 2) {
                        return new int[]{0, 1, 2, 3, 4};
                    }
                    LogUtil.a("SectionChartUtils", "getBloodPressureGradeTypeList, default list");
                }
            }
        }
        return iArr;
    }

    public static int a() {
        int[] iArrB = b();
        if (iArrB == null || iArrB.length == 0) {
            return 3;
        }
        return iArrB.length;
    }

    public static String e(int i, int i2) {
        return d(b(i, i2));
    }

    public static String d(int i) {
        String[] strArrC = c();
        if (strArrC == null || strArrC.length <= i) {
            LogUtil.j("SectionChartUtils", "getGradeDes，type is out of bound");
            return "";
        }
        return strArrC[i];
    }

    public static String[] c() {
        String[] strArr;
        ArrayList<fde> arrayList = new ArrayList(d());
        LogUtil.a("SectionChartUtils", "featureInfoList,", Integer.valueOf(arrayList.size()));
        ArrayList arrayList2 = new ArrayList();
        for (fde fdeVar : arrayList) {
            if (fdeVar == null) {
                LogUtil.j("SectionChartUtils", "featureInfo is null");
            } else {
                List<fde.b> listE = fdeVar.e();
                if (fdeVar.a() != 0 && !njy.e(listE)) {
                    arrayList2.addAll(listE);
                }
            }
        }
        int size = arrayList2.size();
        Resources resources = BaseApplication.getContext().getResources();
        String[] strArr2 = {resources.getString(R.string.IDS_bloodpressure_degree_low), resources.getString(R.string.IDS_hw_normal_overseas), resources.getString(R.string.IDS_hw_normal_high_value_overseas), resources.getString(R.string.IDS_hw_high_overseas)};
        if (size > 3) {
            if (!Utils.o()) {
                strArr = (String[]) Arrays.copyOf(strArr2, 6);
                strArr[0] = resources.getString(R.string.IDS_bloodpressure_degree_low);
                strArr[1] = resources.getString(R.string.IDS_hw_normal);
                strArr[2] = resources.getString(R.string.IDS_hw_normal_high_value);
                strArr[3] = resources.getString(R.string.IDS_hw_mild);
                strArr[4] = resources.getString(R.string.IDS_hw_moderate);
                strArr[5] = resources.getString(R.string.IDS_hw_high);
            } else if (a() == 5) {
                strArr = (String[]) Arrays.copyOf(strArr2, 5);
                if (Utils.c(BaseApplication.getContext())) {
                    strArr[1] = resources.getString(R.string.IDS_hw_normal_level_value_jp);
                    strArr[2] = resources.getString(R.string.IDS_hw_normal_high_level_value_jp);
                    strArr[3] = resources.getString(R.string.IDS_hw_high_level_value_jp);
                    strArr[4] = resources.getString(R.string.IDS_hw_high_value_jp);
                } else {
                    strArr[3] = resources.getString(R.string.IDS_hw_high_level_1);
                    strArr[4] = resources.getString(R.string.IDS_hw_high_level_2);
                }
            } else {
                if (a() == 6) {
                    strArr = (String[]) Arrays.copyOf(strArr2, 6);
                    strArr[3] = resources.getString(R.string.IDS_hw_high_level_1);
                    strArr[4] = resources.getString(R.string.IDS_hw_high_level_2);
                    strArr[5] = resources.getString(R.string.IDS_hw_high_level_3);
                } else {
                    LogUtil.e("SectionChartUtils", "getBloodPressureGradeDesList: categorizationListSize: ", Integer.valueOf(size));
                }
                b(strArr2);
            }
            strArr2 = strArr;
            b(strArr2);
        }
        return strArr2;
    }

    public static int e(int i) {
        int iA = a();
        Context context = BaseApplication.getContext();
        if (i == 0) {
            return ContextCompat.getColor(context, R.color.blood_pressure_low_end);
        }
        if (i == 1) {
            return ContextCompat.getColor(context, R.color.blood_pressure_ideal_end);
        }
        if (i == 2) {
            return ContextCompat.getColor(context, R.color.blood_pressure_normal_end);
        }
        if (i == 3) {
            if (iA == 6) {
                return ContextCompat.getColor(context, R.color.blood_pressure_mild_end);
            }
            if (iA == 5) {
                return ContextCompat.getColor(context, R.color.blood_pressure_moderate_end);
            }
            return ContextCompat.getColor(context, R.color.blood_pressure_high_end);
        }
        if (i != 4) {
            if (i == 5) {
                return ContextCompat.getColor(context, R.color.blood_pressure_high_end);
            }
            return ContextCompat.getColor(context, R.color.emui_accent);
        }
        if (iA == 6) {
            return ContextCompat.getColor(context, R.color.blood_pressure_moderate_end);
        }
        return ContextCompat.getColor(context, R.color.blood_pressure_high_end);
    }

    private static void b(String[] strArr) {
        if ((!LanguageUtil.bc(BaseApplication.getContext()) && !LanguageUtil.w(BaseApplication.getContext())) || strArr == null || strArr.length == 0) {
            return;
        }
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (!TextUtils.isEmpty(str) && str.contains(Constants.LEFT_BRACKET_ONLY)) {
                StringBuilder sb = new StringBuilder(str);
                strArr[i] = sb.insert(sb.indexOf(Constants.LEFT_BRACKET_ONLY), "\n").toString();
            }
        }
    }
}
