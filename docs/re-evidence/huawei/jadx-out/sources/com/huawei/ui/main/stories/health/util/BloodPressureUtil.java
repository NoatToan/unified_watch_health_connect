package com.huawei.ui.main.stories.health.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hihealth.HiDataSourceFetchOption;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataClientListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.util.BloodPressureUtil;
import defpackage.dfk;
import defpackage.dfl;
import defpackage.dfm;
import defpackage.dfp;
import defpackage.dmp;
import defpackage.dxy;
import defpackage.fde;
import defpackage.fdg;
import defpackage.fdi;
import defpackage.fdm;
import defpackage.fej;
import defpackage.ftw;
import defpackage.lsr;
import defpackage.lua;
import defpackage.lvl;
import defpackage.njy;
import defpackage.qre;
import defpackage.qrs;
import defpackage.utd;
import defpackage.utl;
import defpackage.uub;
import defpackage.uwu;
import defpackage.vdo;
import defpackage.wgr;
import defpackage.wgt;
import defpackage.xde;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class BloodPressureUtil {
    private static final String d = String.valueOf(10053);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static float f28162b = 16.67f;
    private static boolean e = false;

    /* JADX INFO: loaded from: classes43.dex */
    public interface IIconCallBack {
        void onReceive(HashMap<Integer, Integer> map);
    }

    public static int a(int i) {
        if ((i & (-128)) != 0) {
            return i;
        }
        if (i == 1) {
            return 128;
        }
        if (i == 2) {
            return 256;
        }
        if (i == 3) {
            return 512;
        }
        if (i == 4) {
            return 1024;
        }
        if (i == 5) {
            return 2048;
        }
        if (i == 7) {
            return 8192;
        }
        if (i != 8) {
            return i != 100 ? 4096 : 1073741824;
        }
        return 16384;
    }

    public static int d(int i) {
        if (i < 20) {
            return 0;
        }
        return i > 60 ? 5 : 1;
    }

    public static ArrayList<fde> d() {
        if (!CommonUtil.ab(BaseApplication.getContext())) {
            e = true;
            if (Utils.o()) {
                LogUtil.d("BloodPressureUtil", "getInternationalGradeList");
                return fdm.d().h();
            }
            LogUtil.d("BloodPressureUtil", "getDefaultGradeList");
            return fdm.d().b();
        }
        LogUtil.d("BloodPressureUtil", "isNetworkConnected");
        if (njy.e(fdm.d().j())) {
            LogUtil.d("BloodPressureUtil", "getGradeList is null ");
            e = true;
            if (Utils.o()) {
                LogUtil.d("BloodPressureUtil", "getGradeList is null return getInternationalGradeList");
                return fdm.d().h();
            }
            LogUtil.d("BloodPressureUtil", "getGradeList is null return getDefaultGradeList");
            return fdm.d().b();
        }
        e = false;
        LogUtil.d("BloodPressureUtil", " return getGradeList");
        return fdm.d().j();
    }

    public static String c(int i) {
        int iC;
        String string;
        String string2;
        Context context = BaseApplication.getContext();
        SpannableString spannableString = new SpannableString(context.getString(R.string.IDS_hw_pressure_learn_more));
        if (d() == null) {
            if (!Utils.o()) {
                return c(context.getString(R.string.IDS_blood_pressure_grading_description, 2018, spannableString));
            }
            return c(context.getString(R.string.IDS_blood_pressure_grading_description_International, 2018, spannableString));
        }
        if (e) {
            iC = Utils.o() ? 1 : 0;
        } else {
            iC = fdm.d().c();
        }
        LogUtil.d("BloodPressureUtil", "CountryType," + iC);
        switch (iC) {
            case 0:
                string = i == 0 ? context.getString(R.string.IDS_blood_pressure_grading_source, 2024, spannableString) : context.getString(R.string.IDS_hw_guard_description_source, 2024);
                break;
            case 1:
                string = i == 0 ? context.getString(R.string.IDS_blood_pressure_grading_description_International, 2018, spannableString) : context.getString(R.string.IDS_hw_hypotension_des_source_ESH, UnitUtil.c(2018.0d, 1, 0, false));
                break;
            case 2:
                LogUtil.e("BloodPressureUtil", "2018 European Standard");
                string = "";
                break;
            case 3:
                LogUtil.e("BloodPressureUtil", "2017 American Standard");
                string = "";
                break;
            case 4:
                string = i == 0 ? context.getString(R.string.IDS_blood_pressure_grading_description_peru, spannableString) : context.getString(R.string.IDS_hw_hypotension_des_source_PE);
                break;
            case 5:
                string = i == 0 ? context.getString(R.string.IDS_blood_pressure_grading_description_philippines, 2020, spannableString) : context.getString(R.string.IDS_hw_hypotension_des_source_PH, UnitUtil.c(2020.0d, 1, 0, false));
                break;
            case 6:
                string = i == 0 ? context.getString(R.string.IDS_blood_pressure_grading_description_saudiarabia, 2018, spannableString) : context.getString(R.string.IDS_hw_hypotension_des_source_SA, UnitUtil.c(2018.0d, 1, 0, false));
                break;
            case 7:
                if (i == 0) {
                    string = context.getString(R.string.IDS_blood_pressure_grading_description_chile, 2010, 15, spannableString);
                } else {
                    string = context.getString(R.string.IDS_hw_hypotension_des_source_CL, UnitUtil.c(2010.0d, 1, 0, false), UnitUtil.e(15.0d, 1, 0));
                }
                break;
            case 8:
                if (i == 0) {
                    string = context.getString(R.string.IDS_blood_pressure_grading_description_uae, spannableString);
                } else {
                    string = context.getString(R.string.IDS_hw_hypotension_des_source_AE);
                }
                break;
            case 9:
                if (i == 0) {
                    string = context.getString(R.string.IDS_blood_pressure_grading_description_Kuwait, spannableString);
                } else {
                    string = context.getString(R.string.IDS_hw_hypotension_des_source_KW);
                }
                break;
            case 10:
                if (i == 0) {
                    string = context.getString(R.string.IDS_blood_pressure_grading_description_bahrain, spannableString);
                } else {
                    string = context.getString(R.string.IDS_hw_hypotension_des_source_BH);
                }
                break;
            case 11:
                if (i == 0) {
                    string = context.getString(R.string.IDS_blood_pressure_grading_description_qatar, spannableString);
                } else {
                    string = context.getString(R.string.IDS_hw_hypotension_des_source_QA);
                }
                break;
            case 12:
                if (i == 0) {
                    string = context.getString(R.string.IDS_blood_pressure_grading_description_oman, spannableString);
                } else {
                    string = context.getString(R.string.IDS_hw_hypotension_des_source_OM);
                }
                break;
            case 13:
                if (i == 0) {
                    string = context.getString(R.string.IDS_blood_pressure_grading_description_newzealand, 2016, spannableString);
                } else {
                    string = context.getString(R.string.IDS_hw_hypotension_des_source_NZ, UnitUtil.c(2016.0d, 1, 0, false));
                }
                break;
            case 14:
                if (i == 0) {
                    string = context.getString(R.string.IDS_blood_pressure_grading_description_thailand, 2020, spannableString);
                } else {
                    string = context.getString(R.string.IDS_hw_hypotension_des_source_TH, UnitUtil.c(2020.0d, 1, 0, false));
                }
                break;
            case 15:
                if (i == 0) {
                    string = context.getString(R.string.IDS_blood_pressure_grading_description_colombia, 2018, spannableString);
                } else {
                    string = context.getString(R.string.IDS_hw_hypotension_des_source_CO, UnitUtil.c(2018.0d, 1, 0, false));
                }
                break;
            case 16:
                if (i == 0) {
                    string = context.getString(R.string.IDS_blood_pressure_grading_description_southafrica, spannableString);
                } else {
                    string = context.getString(R.string.IDS_hw_hypotension_des_source_ZA);
                }
                break;
            case 17:
                if (i == 0) {
                    string = context.getString(R.string.IDS_blood_pressure_grading_description_mexicano, spannableString);
                } else {
                    string = context.getString(R.string.IDS_hw_hypotension_des_source_MX);
                }
                break;
            case 18:
                if (i == 0) {
                    string = context.getString(R.string.IDS_blood_pressure_grading_description_australia, spannableString);
                } else {
                    string = context.getString(R.string.IDS_hw_hypotension_des_source_AU);
                }
                break;
            case 19:
                if (i == 0) {
                    string = context.getString(R.string.IDS_blood_pressure_grading_description_Jordan, spannableString);
                } else {
                    string = context.getString(R.string.IDS_hw_hypotension_des_source_AR_KW);
                }
                break;
            case 20:
                if (i == 0) {
                    string = context.getString(R.string.IDS_blood_pressure_grading_description_mauritius, spannableString);
                } else {
                    string = context.getString(R.string.IDS_hw_hypotension_des_source_MU);
                }
                break;
            case 21:
                if (i == 0) {
                    string = context.getString(R.string.IDS_blood_pressure_grading_description_cambodia, spannableString);
                } else {
                    string = context.getString(R.string.IDS_hw_hypotension_des_source_KH);
                }
                break;
            case 22:
                if (i == 0) {
                    string2 = context.getString(R.string.IDS_blood_pressure_grading_description_general, spannableString);
                } else {
                    string2 = context.getString(R.string.IDS_hw_hypotension_des_source_general);
                }
                string = a(string2);
                break;
            case 23:
            default:
                if (i == 0) {
                    string = context.getString(R.string.IDS_blood_pressure_grading_description_International, 2018, spannableString);
                } else {
                    string = context.getString(R.string.IDS_hw_hypotension_des_source_ESH, UnitUtil.c(2018.0d, 1, 0, false));
                }
                LogUtil.e("BloodPressureUtil", "The CountryType description is invalidation");
                break;
            case 24:
                if (i == 0) {
                    string = context.getString(R.string.IDS_blood_pressure_grading_des_japan, 2019, UnitUtil.e(2.0d, 1, 0), UnitUtil.e(5.0d, 1, 0), spannableString);
                } else {
                    string = context.getString(R.string.IDS_hw_hypotension_des_source_JP, 2019);
                }
                break;
        }
        return c(string);
    }

    private static String a(String str) {
        return TextUtils.isEmpty(str) ? str : str.replace("《", "").replace("》", "");
    }

    private static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("BloodPressureUtil", "description is invalid");
            return "";
        }
        int[] iArr = {2010, 2016, 2018, 2019, 2020};
        String strReplace = str;
        for (int i = 0; i < 5; i++) {
            int i2 = iArr[i];
            String strValueOf = String.valueOf(i2);
            if (str.contains(strValueOf)) {
                strReplace = str.replace(strValueOf, xde.b(i2));
            }
        }
        return strReplace;
    }

    public static Drawable e(Context context, int i, int i2) {
        if (context == null) {
            LogUtil.j("BloodPressureUtil", "context is null");
            return null;
        }
        if (i2 == 1) {
            return ContextCompat.getDrawable(context, R.drawable.evaluation_border_ideal);
        }
        if (i2 == 2) {
            return ContextCompat.getDrawable(context, R.drawable.evaluation_border_normal);
        }
        if (i2 == 3) {
            if (i == 6) {
                return ContextCompat.getDrawable(context, R.drawable.evaluation_border_mild);
            }
            if (i == 5) {
                return ContextCompat.getDrawable(context, R.drawable.evaluation_border_mode_rate);
            }
            return ContextCompat.getDrawable(context, R.drawable.evaluation_border_high);
        }
        if (i2 != 4) {
            if (i2 == 5) {
                return ContextCompat.getDrawable(context, R.drawable.evaluation_border_high);
            }
            return ContextCompat.getDrawable(context, R.drawable.evaluation_border_low);
        }
        if (i == 6) {
            return ContextCompat.getDrawable(context, R.drawable.evaluation_border_mode_rate);
        }
        return ContextCompat.getDrawable(context, R.drawable.evaluation_border_high);
    }

    public static long c(long j) {
        return b(j) + 150000;
    }

    public static long b(long j) {
        return (((j / 1000) / 60) / 5) * 300000;
    }

    public static long d(long j) {
        return b(j) + 300000;
    }

    public static String a(double d2) {
        return UnitUtil.e(d2, 1, 0);
    }

    public static void b(SectionBean sectionBean, utl utlVar) {
        if (njy.e(utlVar.a())) {
            sectionBean.c((Object) null);
        } else {
            sectionBean.c(utlVar);
        }
    }

    public static List<uwu> a() {
        Context context = BaseApplication.getContext();
        ArrayList arrayList = new ArrayList(14);
        arrayList.add(new uwu(context.getString(R.string.IDS_blood_measure_sports_housework), true, 32768, false));
        arrayList.add(new uwu(context.getString(R.string.IDS_blood_measure_body_activity), true, 128, false));
        arrayList.add(new uwu(context.getString(R.string.IDS_blood_measure_eating), true, 512, false));
        arrayList.add(new uwu(context.getString(R.string.IDS_blood_measure_no_medication_taken), true, 131072, false));
        arrayList.add(new uwu(context.getString(R.string.IDS_blood_measure_mood_swings), true, 65536, false));
        arrayList.add(new uwu(context.getString(R.string.IDS_blood_measure_lack_of_sleep), true, 262144, false));
        arrayList.add(new uwu(context.getString(R.string.IDS_blood_measure_smoke), true, 256, false));
        arrayList.add(new uwu(context.getString(R.string.IDS_blood_measure_drink), j() && (LanguageUtil.f(context) || LanguageUtil.q(context)), 1024, false));
        arrayList.add(new uwu(context.getString(R.string.IDS_blood_measure_coffee), true, 2048, false));
        arrayList.add(new uwu(context.getString(R.string.IDS_blood_measure_temperature_drop), true, 524288, false));
        arrayList.add(new uwu(context.getString(R.string.IDS_blood_measure_other), true, 1048576, false));
        arrayList.add(new uwu(context.getString(R.string.IDS_blood_measure_no_action), false, 4096, true));
        arrayList.add(new uwu(context.getString(R.string.IDS_blood_pressure_get_up), false, 8192, false));
        arrayList.add(new uwu(context.getString(R.string.IDS_blood_pressure_before_bedtime), false, 16384, false));
        return arrayList;
    }

    public static List<String> d(Context context) {
        String strE = SharedPreferenceManager.e(context, Integer.toString(30002), "BLOOD_PRESSURE_CUSTOM_ACTION_LIST");
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(strE)) {
            lsr.c(strE, context.getClassLoader(), "1", arrayList);
        }
        return arrayList;
    }

    public static void d(Context context, List<String> list) {
        if (context == null || list == null) {
            return;
        }
        SharedPreferenceManager.e(context, Integer.toString(30002), "BLOOD_PRESSURE_CUSTOM_ACTION_LIST", lsr.e(list, "1"), new StorageParams(0));
    }

    public static void d(int i, List<uwu> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            uwu uwuVar = list.get(i2);
            if ((uwuVar.e() & i) == uwuVar.e()) {
                uwuVar.a(true);
                uwuVar.e(true);
                if (uwuVar.c()) {
                    uwuVar.e(false);
                }
                Context context = BaseApplication.getContext();
                if (!LanguageUtil.f(context) && !LanguageUtil.q(context) && uwuVar.e() == 1024) {
                    uwuVar.e(false);
                }
            }
        }
    }

    public static int d(List<uwu> list) {
        if (list == null) {
            LogUtil.a("BloodPressureUtil", "actionList is null");
            return 0;
        }
        LogUtil.a("BloodPressureUtil", "getBeforeActiveIndex, ", list.toString());
        int iE = 0;
        for (int i = 0; i < list.size(); i++) {
            uwu uwuVar = list.get(i);
            if (uwuVar.g() && uwuVar.f()) {
                iE |= uwuVar.e();
            }
        }
        if (iE == 0) {
            iE = 4096;
        }
        LogUtil.a("BloodPressureUtil", "getBeforeActiveIndex, result=", Integer.valueOf(iE));
        return iE;
    }

    public static List<String> a(List<uwu> list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            uwu uwuVar = list.get(i);
            if (uwuVar.a() && uwuVar.g()) {
                arrayList.add(uwuVar.b());
            }
        }
        return arrayList;
    }

    public static void e(List<uwu> list) {
        Iterator<uwu> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().g()) {
                return;
            }
        }
        for (uwu uwuVar : list) {
            if (uwuVar.c()) {
                uwuVar.a(true);
            }
        }
    }

    public static int a(int i, int i2) {
        int iA = ftw.a();
        if (iA == 5) {
            f28162b = 20.0f;
        } else if (iA == 4) {
            f28162b = 25.0f;
        } else {
            f28162b = 16.67f;
        }
        ArrayList<fde> arrayListD = d();
        LogUtil.d("BloodPressureUtil", "bloodPressureList," + arrayListD.size());
        ArrayList arrayList = new ArrayList(arrayListD);
        int iB = ftw.b(i, i2);
        if (iB == 0) {
            float fMax = Math.max(e(i, i2, ((fde) arrayList.get(0)).e()), 0.0f);
            float f = f28162b;
            return Math.max((int) Math.floor((fMax * f) + (f * iB)), 0);
        }
        if (iB == 1) {
            float fMax2 = Math.max(c(i, i2, 0, ((fde) arrayList.get(1)).e()), 0.0f);
            float f2 = f28162b;
            return Math.min((int) Math.ceil((fMax2 * f2) + (f2 * iB)), (int) (f28162b * (iB + 1)));
        }
        if (iB == 2) {
            float fMax3 = Math.max(c(i, i2, 0, ((fde) arrayList.get(2)).e()), 0.0f);
            float f3 = f28162b;
            return Math.min((int) Math.ceil((fMax3 * f3) + (f3 * iB)), (int) (f28162b * (iB + 1)));
        }
        if (iB == 3 || iB == 4 || iB == 5) {
            float fC = c(i, i2, iB - 3, ((fde) arrayList.get(3)).e());
            float f4 = f28162b;
            return Math.min((int) Math.ceil((fC * f4) + (f4 * iB)), Math.min((int) (f28162b * (iB + 1)), 100));
        }
        LogUtil.a("BloodPressureUtil", "invalid convertType, ", Integer.valueOf(iB));
        return 0;
    }

    public static float c(int i, int i2, int i3, List<fde.b> list) {
        if (njy.e(list, i3)) {
            LogUtil.j("BloodPressureUtil", Integer.valueOf(i3), " out of bounds");
            return 0.0f;
        }
        fde.b bVar = list.get(i3);
        List<Integer> listD = bVar.d();
        int iIntValue = listD.get(0).intValue();
        int iIntValue2 = listD.get(1).intValue() <= 300 ? listD.get(1).intValue() : 300;
        List<Integer> listE = bVar.e();
        int iIntValue3 = listE.get(0).intValue();
        float f = (i - iIntValue) / (iIntValue2 - iIntValue);
        float fIntValue = (i2 - iIntValue3) / ((listE.get(1).intValue() <= 200 ? listE.get(1).intValue() : 200) - iIntValue3);
        if (f <= 0.0f) {
            f = 0.0f;
        }
        if (fIntValue <= 0.0f) {
            fIntValue = 0.0f;
        }
        int i4 = (f < 0.0f ? 0 : 1) + (fIntValue >= 0.0f ? 1 : 0);
        if (i4 == 0) {
            return 0.0f;
        }
        return Math.max(Math.min((f + fIntValue) / i4, 1.0f), 0.0f);
    }

    public static float e(int i, int i2, List<fde.b> list) {
        fde.b bVar = list.get(0);
        float fIntValue = (i - 40) / (bVar.d().get(1).intValue() - 40);
        float fIntValue2 = (i2 - 30) / (bVar.e().get(1).intValue() - 30);
        if (fIntValue <= 0.0f) {
            fIntValue = 0.0f;
        }
        if (fIntValue2 <= 0.0f) {
            fIntValue2 = 0.0f;
        }
        int i3 = (fIntValue <= 0.0f ? 0 : 1) + (fIntValue2 > 0.0f ? 1 : 0);
        if (i3 == 0) {
            return 0.0f;
        }
        return Math.max(Math.min((fIntValue + fIntValue2) / i3, 1.0f), 0.0f);
    }

    public static int[] a(Context context) {
        int iA = ftw.a();
        int[] iArr = {ContextCompat.getColor(context, R.color.blood_pressure_ideal_end), ContextCompat.getColor(context, R.color.blood_pressure_normal_end), ContextCompat.getColor(context, R.color.blood_pressure_high_end)};
        if (iA == 5) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, 4);
            iArrCopyOf[2] = ContextCompat.getColor(context, R.color.blood_pressure_moderate_end);
            iArrCopyOf[3] = ContextCompat.getColor(context, R.color.blood_pressure_high_end);
            return iArrCopyOf;
        }
        if (iA == 6) {
            int[] iArrCopyOf2 = Arrays.copyOf(iArr, 5);
            iArrCopyOf2[2] = ContextCompat.getColor(context, R.color.blood_pressure_mild_end);
            iArrCopyOf2[3] = ContextCompat.getColor(context, R.color.blood_pressure_moderate_end);
            iArrCopyOf2[4] = ContextCompat.getColor(context, R.color.blood_pressure_high_end);
            return iArrCopyOf2;
        }
        health.compact.a.util.LogUtil.a("BloodPressureUtil", "count: ", Integer.valueOf(iA));
        return iArr;
    }

    public static void c(final int[] iArr, final IIconCallBack iIconCallBack) {
        final HashMap map = new HashMap(16);
        HiDataSourceFetchOption hiDataSourceFetchOptionA = HiDataSourceFetchOption.builder().c(1).b(iArr).a();
        LogUtil.a("BloodPressureUtil", "fetchDataSource start");
        HiHealthNativeApi.a(BaseApplication.getContext()).fetchDataSource(hiDataSourceFetchOptionA, new HiDataClientListener() { // from class: vcd
            @Override // com.huawei.hihealth.data.listener.HiDataClientListener
            public final void onResult(List list) {
                BloodPressureUtil.c(iIconCallBack, map, iArr, list);
            }
        });
    }

    public static /* synthetic */ void c(IIconCallBack iIconCallBack, HashMap map, int[] iArr, List list) {
        String strValueOf;
        StringBuilder sb = new StringBuilder("fetchDataSource end clientList size = ");
        sb.append(list == null ? 0 : list.size());
        LogUtil.a("BloodPressureUtil", sb.toString());
        if (njy.e(list)) {
            iIconCallBack.onReceive(null);
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            HiHealthClient hiHealthClient = (HiHealthClient) list.get(i);
            if (wgr.a(hiHealthClient)) {
                map.put(Integer.valueOf(iArr[i]), Integer.valueOf(wgt.a()));
            } else {
                if (hiHealthClient.getHiDeviceInfo() == null) {
                    strValueOf = "";
                } else {
                    strValueOf = String.valueOf(hiHealthClient.getHiDeviceInfo().getDeviceType());
                }
                map.put(Integer.valueOf(iArr[i]), Integer.valueOf(wgt.e(strValueOf)));
            }
        }
        iIconCallBack.onReceive(map);
    }

    public static boolean c() {
        if (EnvironmentInfo.m() || Utils.k()) {
            return true;
        }
        if (!Utils.o() || e() || uub.a()) {
            return Utils.o() && LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode();
        }
        return true;
    }

    public static boolean e() {
        boolean z;
        boolean z2;
        ArrayList<dxy> arrayListJ = lvl.j();
        if (njy.b(arrayListJ)) {
            LogUtil.a("BloodPressureUtil", "connected device size: ", arrayListJ);
            z = false;
            z2 = false;
            for (dxy dxyVar : arrayListJ) {
                if (dxyVar != null && dxyVar.i() != null) {
                    LogUtil.a("BloodPressureUtil", "deviceInfo: ", dxyVar.toString());
                    if (dxyVar.i().toLowerCase().contains("huawei watch d") || dxyVar.i().toLowerCase().contains("huawei molly") || dxyVar.i().toLowerCase().contains("huawei watch b9") || dxyVar.g() == 73) {
                        z = true;
                    }
                    if (dxyVar.g() == 86 || dxyVar.g() == 87) {
                        z2 = true;
                    }
                }
            }
        } else {
            z = false;
            z2 = false;
        }
        boolean zE = njy.e(dmp.d().c(HealthDevice.HealthDeviceKind.HDK_BLOOD_PRESSURE));
        LogUtil.a("BloodPressureUtil", "hasMolly: ", Boolean.valueOf(z), ", hasBPDevice: ", Boolean.valueOf(!zE), ", hasLuca: ", Boolean.valueOf(z2));
        return z || !zE || z2;
    }

    public static boolean j() {
        String accountInfo = LoginInit.getInstance(com.huawei.haf.application.BaseApplication.b()).getAccountInfo(1010);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.e("BloodPressureUtil", "countryCode is error: ", accountInfo);
            return true;
        }
        for (String str : qre.g(com.huawei.hwcommonmodel.R.array.no_show_drink_action_country_code)) {
            if (accountInfo.equals(str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean b() {
        if (CommonUtil.bu()) {
            return !njy.e(fdm.d().e());
        }
        return true;
    }

    public static void i() {
        fdi fdiVarD = fej.d("com.huawei.health_deviceFeature_config", "txt", "com.huawei.health.h5.blood-pressure");
        if (fdiVarD == null || fdiVarD.e() == null) {
            LogUtil.e("BloodPressureUtil", "featureByFile or getExtInfo() is null");
            return;
        }
        Map mapE = fdiVarD.e();
        if (!(mapE instanceof LinkedTreeMap)) {
            LogUtil.j("BloodPressureUtil", "extInfoObject is not LinkedTreeMap");
            return;
        }
        LinkedTreeMap linkedTreeMap = (LinkedTreeMap) mapE;
        LogUtil.d("BloodPressureUtil", "extInfo," + linkedTreeMap);
        Object obj = linkedTreeMap.get("typeList");
        if (obj instanceof ArrayList) {
            Object obj2 = linkedTreeMap.get("dynamicBloodPressureTypeList");
            Object obj3 = linkedTreeMap.get("descriptionid");
            if (obj3 == null) {
                LogUtil.e("BloodPressureUtil", "objectId null");
                return;
            }
            int iH = (int) qrs.h(obj3.toString());
            LogUtil.d("BloodPressureUtil", "descriptionId," + iH);
            try {
                if (obj2 instanceof ArrayList) {
                    fdm.d().c(HiJsonUtil.d(obj2));
                }
                ArrayList<fde> arrayList = (ArrayList) HiJsonUtil.d(HiJsonUtil.d(obj), new TypeToken<ArrayList<fde>>() { // from class: com.huawei.ui.main.stories.health.util.BloodPressureUtil.1
                }.getType());
                ArrayList<fdg> arrayList2 = new ArrayList<>();
                if (obj2 instanceof ArrayList) {
                    arrayList2 = (ArrayList) HiJsonUtil.d(HiJsonUtil.d(obj2), new TypeToken<ArrayList<fdg>>() { // from class: com.huawei.ui.main.stories.health.util.BloodPressureUtil.2
                    }.getType());
                }
                if (arrayList == null) {
                    LogUtil.j("BloodPressureUtil", "get typeList list is null");
                    return;
                }
                LogUtil.d("BloodPressureUtil", "typeList," + arrayList.size() + "typeList," + arrayList, "dynamicBloodPressureTypeList," + arrayList2.size() + "dynamicBloodPressureTypeList," + arrayList2);
                if (njy.c(arrayList, 3)) {
                    e(arrayList.get(3));
                }
                fdm.d().b(arrayList);
                fdm.d().d(iH);
                fdm.d().a(arrayList2);
            } catch (JsonSyntaxException e2) {
                LogUtil.e("BloodPressureUtil", "JsonSyntaxException in get typeList: ", e2.getMessage());
            } catch (NullPointerException unused) {
                LogUtil.e("BloodPressureUtil", "Json NullPointerException");
            }
        }
    }

    private static void e(fde fdeVar) {
        if (fdeVar == null) {
            LogUtil.e("BloodPressureUtil", "bloodPressureFeatureInfo is null");
            return;
        }
        List<fde.b> listE = fdeVar.e();
        if (njy.e(listE)) {
            LogUtil.e("BloodPressureUtil", "Categorization list is null");
            return;
        }
        for (int i = 0; i < listE.size(); i++) {
            fde.b bVar = listE.get(i);
            if (bVar != null) {
                bVar.c(i);
            }
        }
    }

    public static void c(BaseResponseCallback<String> baseResponseCallback) {
        LogUtil.a("BloodPressureUtil", "Start updOldBloodPressurePlan");
        if (h()) {
            LogUtil.a("BloodPressureUtil", "checkUpdBloodPlanRes success");
            baseResponseCallback.onResponse(0, "updOldBloodPressurePlan success");
        } else {
            vdo.c("900300060", new AnonymousClass3(baseResponseCallback));
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.health.util.BloodPressureUtil$3, reason: invalid class name */
    public class AnonymousClass3 implements HiDataReadResultListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BaseResponseCallback f28163b;

        AnonymousClass3(BaseResponseCallback baseResponseCallback) {
            this.f28163b = baseResponseCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(final Object obj, final int i, final int i2) {
            ThreadPoolManager threadPoolManagerC = ThreadPoolManager.c();
            final BaseResponseCallback baseResponseCallback = this.f28163b;
            threadPoolManagerC.execute(new Runnable() { // from class: vcf
                @Override // java.lang.Runnable
                public final void run() {
                    BloodPressureUtil.d(obj, i, i2, baseResponseCallback);
                }
            });
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
            LogUtil.a("BloodPressureUtil", "getBloodPressureReminderPlan intentType", Integer.valueOf(i), "object", obj, "errorCode", Integer.valueOf(i2), "anchor", Integer.valueOf(i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Object obj, int i, int i2, BaseResponseCallback<String> baseResponseCallback) {
        ReleaseLogUtil.d("BloodPressureUtil", "updOldBloodPressurePlan onResult errorCode", Integer.valueOf(i), "anchor", Integer.valueOf(i2));
        LogUtil.a("BloodPressureUtil", "updOldBloodPressurePlan onResult object", obj, "errorCode", Integer.valueOf(i), "anchor", Integer.valueOf(i2));
        if (!njy.b(obj, HiSampleConfig.class)) {
            LogUtil.e("BloodPressureUtil", "updOldBloodPressurePlan type match fail!");
            baseResponseCallback.onResponse(-1, "updOldBloodPressurePlan type match fail!");
        } else if (njy.e((List) obj)) {
            LogUtil.a("BloodPressureUtil", "fetching old blood pressure plan");
            a(baseResponseCallback);
        } else {
            c(true);
            baseResponseCallback.onResponse(0, "updOldBloodPressurePlan success");
        }
    }

    private static void a(final BaseResponseCallback<String> baseResponseCallback) {
        c((ResponseCallback<List<dfl>>) new ResponseCallback() { // from class: vce
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                BloodPressureUtil.e(baseResponseCallback, i, (List) obj);
            }
        });
    }

    public static /* synthetic */ void e(final BaseResponseCallback baseResponseCallback, int i, List list) {
        dfk dfkVarC = utd.c(null, list);
        if (dfkVarC.a() == null) {
            dfkVarC = utd.a();
        }
        uub.d(dfkVarC, new ResponseCallback() { // from class: vcc
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i2, Object obj) {
                BloodPressureUtil.b(baseResponseCallback, i2, obj);
            }
        });
    }

    public static /* synthetic */ void b(BaseResponseCallback baseResponseCallback, int i, Object obj) {
        if (i == -1) {
            LogUtil.j("BloodPressureUtil", "saveBloodPressureRemindPlan callback error!");
            baseResponseCallback.onResponse(-1, "saveBloodPressureRemindPlan callback error!");
        } else {
            c(true);
            utd.d();
            baseResponseCallback.onResponse(0, "updOldBloodPressurePlan success");
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.health.util.BloodPressureUtil$5, reason: invalid class name */
    public class AnonymousClass5 implements HiDataReadResultListener {
        final /* synthetic */ ResponseCallback d;

        AnonymousClass5(ResponseCallback responseCallback) {
            this.d = responseCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(final Object obj, final int i, final int i2) {
            ThreadPoolManager threadPoolManagerC = ThreadPoolManager.c();
            final ResponseCallback responseCallback = this.d;
            threadPoolManagerC.execute(new Runnable() { // from class: vcg
                @Override // java.lang.Runnable
                public final void run() {
                    BloodPressureUtil.e(obj, i, i2, responseCallback);
                }
            });
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
            LogUtil.a("BloodPressureUtil", "getBloodPressureMeasurePlan intentType ", Integer.valueOf(i), " object ", obj, " errorCode ", Integer.valueOf(i2), " anchor ", Integer.valueOf(i3));
        }
    }

    private static void c(ResponseCallback<List<dfl>> responseCallback) {
        vdo.c("900300001", new AnonymousClass5(responseCallback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Object obj, int i, int i2, ResponseCallback<List<dfl>> responseCallback) {
        LogUtil.a("BloodPressureUtil", "fetchAndMergeOldPlan onResult object ", obj, " errorCode ", Integer.valueOf(i), " anchor ", Integer.valueOf(i2));
        if (!njy.b(obj, HiSampleConfig.class)) {
            LogUtil.j("BloodPressureUtil", "getOldBloodPressuerMeasurePlan object type match fail");
            return;
        }
        List list = (List) obj;
        if (njy.e(list)) {
            responseCallback.onResponse(i, null);
        } else {
            responseCallback.onResponse(i, b((HiSampleConfig) list.get(0)));
        }
    }

    private static List<dfl> b(HiSampleConfig hiSampleConfig) {
        return dfp.d((dfm) HiJsonUtil.d(hiSampleConfig.getConfigData(), dfm.class));
    }

    private static void c(boolean z) {
        LogUtil.a("BloodPressureUtil", "setUpdBloodPlanRes value ", Boolean.valueOf(z));
        lua.d(d, "UpdOldBloodRemindPlanResult", z);
    }

    private static boolean h() {
        return lua.a(d, "UpdOldBloodRemindPlanResult", false);
    }
}
