package defpackage;

import android.util.SparseArray;
import com.huawei.health.algorithm.api.SleepMonitorAlgorithmApi;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import health.compact.a.Services;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes43.dex */
public class ucv {
    private static int m(int i) {
        if (i == 2 || i == 3 || i == 4 || i == 6 || i == 7) {
            return 1;
        }
        if (i == 8 || i == 9 || i == 10 || i == 12) {
            return 2;
        }
        return (i == 13 || i == 14) ? 3 : 4;
    }

    private static boolean s(int i) {
        return i == 2 || i == 3 || i == 4 || i == 6 || i == 7 || i == 8 || i == 9 || i == 10 || i == 12 || i == 13 || i == 14 || i == 1;
    }

    private static List<String> e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_1));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_2));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_3));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_4));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_5));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_6));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_7, 30, 2));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_8));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_9));
        return arrayList;
    }

    private static List<String> c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_10, 30));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_11, 10));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_12));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_13));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_14));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_15));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_9));
        return arrayList;
    }

    private static List<String> n() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_17));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_18));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_19, 6));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_20, 6));
        return arrayList;
    }

    private static List<String> l() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_21));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_22));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_23));
        return arrayList;
    }

    private static List<String> o() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_24));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_25));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_26));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_27));
        return arrayList;
    }

    private static List<String> i() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_28));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_29));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_30));
        return arrayList;
    }

    private static List<String> a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_31));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_32));
        return arrayList;
    }

    private static List<String> j() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_33));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_34));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_35));
        return arrayList;
    }

    private static List<String> f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_36));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_13));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_38));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_39));
        return arrayList;
    }

    private static List<String> k() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_40, 6, 8));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_41));
        return arrayList;
    }

    private static List<String> m() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_42, 30));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_43));
        return arrayList;
    }

    private static List<String> g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_44));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_45));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_46));
        return arrayList;
    }

    private static List<String> b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_sleep_input_text13));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_sleep_input_text14));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_sleep_input_text15));
        return arrayList;
    }

    public static String j(int i) {
        int i2;
        if (i > 85 && i <= 100) {
            i2 = R.string.IDS_excellent;
        } else if (i >= 75 && i <= 85) {
            i2 = R.string.IDS_good;
        } else if (i > 60 && i < 75) {
            i2 = R.string.IDS_general;
        } else {
            i2 = R.string.IDS_need_improving;
        }
        return BaseApplication.getContext().getString(i2);
    }

    public static int f(int i) {
        if (i > 60) {
            return BaseApplication.getContext().getColor(R.color.sleep_quality_green_color);
        }
        return BaseApplication.getContext().getColor(R.color.sleep_quality_yellow_color);
    }

    public static String e(int i) {
        int i2;
        if (i > 85 && i <= 100) {
            i2 = R.string.IDS_day_quality_summary_4;
        } else if (i >= 75 && i <= 85) {
            i2 = R.string.IDS_day_quality_summary_3;
        } else if (i > 60 && i < 75) {
            i2 = R.string.IDS_day_quality_summary_2;
        } else {
            i2 = R.string.IDS_day_quality_summary_1;
        }
        return BaseApplication.getContext().getString(i2);
    }

    public static String b(int i, int i2, boolean z, int i3) {
        LogUtil.a("PhoneSleepSuggestUtils", "sleepTag: ", Integer.valueOf(i), ", sdkLevel: ", Integer.valueOf(i2));
        int iD = 0;
        switch (i) {
            case 1:
                iD = d(i2, R.string.IDS_day_analysis_result_29);
                break;
            case 2:
                iD = d(i2, R.string.IDS_day_analysis_result_3, R.string.IDS_day_analysis_result_2, R.string.IDS_day_analysis_result_1);
                break;
            case 3:
                iD = d(i2, R.string.IDS_day_analysis_result_6, R.string.IDS_day_analysis_result_5, R.string.IDS_day_analysis_result_4);
                break;
            case 4:
                iD = d(i2, R.string.IDS_day_analysis_result_9, R.string.IDS_day_analysis_result_8, R.string.IDS_day_analysis_result_7);
                break;
            case 5:
            case 11:
            default:
                return "";
            case 6:
                iD = d(i2, R.string.IDS_day_analysis_result_12, R.string.IDS_day_analysis_result_11, R.string.IDS_day_analysis_result_10);
                break;
            case 7:
                iD = d(i2, R.string.IDS_day_analysis_result_15, R.string.IDS_day_analysis_result_14, R.string.IDS_day_analysis_result_13);
                break;
            case 8:
                iD = d(i2, R.string.IDS_day_analysis_result_18, R.string.IDS_day_analysis_result_17, R.string.IDS_day_analysis_result_16);
                break;
            case 9:
                iD = d(i2, 0, R.string.IDS_day_analysis_result_20, R.string.IDS_day_analysis_result_19);
                break;
            case 10:
                iD = d(i2, 0, R.string.IDS_day_analysis_result_22, R.string.IDS_day_analysis_result_21);
                break;
            case 12:
                iD = d(i2, 0, R.string.IDS_day_analysis_result_24, R.string.IDS_day_analysis_result_23);
                break;
            case 13:
                if (z) {
                    iD = d(i2, R.string.IDS_day_analysis_result_25, R.string.IDS_day_analysis_result_26);
                }
                break;
            case 14:
                if (i3 < 360) {
                    iD = d(i2, R.string.IDS_day_analysis_result_27, R.string.IDS_day_analysis_result_28);
                }
                break;
            case 15:
                iD = d(i2, R.string.IDS_sleep_input_text12, R.string.IDS_sleep_input_text11, R.string.IDS_sleep_input_text10);
                break;
        }
        if (iD == 0) {
            return "";
        }
        return BaseApplication.getContext().getString(iD);
    }

    private static int d(int i, int... iArr) {
        if (i == 1) {
            return iArr[0];
        }
        if (i == 2) {
            return iArr[1];
        }
        if (i != 3) {
            return 0;
        }
        return iArr[2];
    }

    public static String c(int i) {
        List<String> listG;
        new ArrayList();
        switch (i) {
            case 1:
                listG = g();
                break;
            case 2:
                listG = e();
                break;
            case 3:
                listG = c();
                break;
            case 4:
                listG = n();
                break;
            case 5:
            case 11:
            default:
                listG = d();
                break;
            case 6:
                listG = l();
                break;
            case 7:
                listG = o();
                break;
            case 8:
                listG = i();
                break;
            case 9:
                listG = a();
                break;
            case 10:
                listG = j();
                break;
            case 12:
                listG = f();
                break;
            case 13:
                listG = k();
                break;
            case 14:
                listG = m();
                break;
            case 15:
                listG = h();
                break;
        }
        if (listG.size() == 0) {
            return "";
        }
        return listG.get(b(0, listG.size() - 1));
    }

    private static List<String> d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_44));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_45));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_46));
        return arrayList;
    }

    private static List<String> h() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_1));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_2));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_3));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_4));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_5));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_6));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_7, 30, 2));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_9));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_day_sleep_suggestion_43));
        return arrayList;
    }

    public static String b(int i) {
        if (i == 2) {
            List<String> listB = b();
            return listB.get(b(0, listB.size() - 1));
        }
        if (i == 3) {
            return BaseApplication.getContext().getString(R.string.IDS_sleep_input_text16);
        }
        return "";
    }

    public static void e(final Date date, final Date date2, final IBaseResponseCallback iBaseResponseCallback) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(e(date));
        hiDataReadOption.setEndTime(c(date2));
        hiDataReadOption.setType(new int[]{DicDataTypeUtil.DataType.EFFECTIVE_SLEEP_DURATION.value()});
        HiHealthNativeApi.a(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: ucv.2
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.a("PhoneSleepSuggestUtils", "getDailySleepRegularity onResult: errorCode: ", Integer.valueOf(i), ", data: ", obj);
                if (iBaseResponseCallback == null) {
                    LogUtil.e("PhoneSleepSuggestUtils", "callback is null");
                    return;
                }
                if (!(obj instanceof SparseArray)) {
                    LogUtil.j("PhoneSleepSuggestUtils", "getTemperatureData convert fail, data = ", Boolean.valueOf(obj == null));
                    iBaseResponseCallback.a(-1, null);
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0) {
                    LogUtil.j("PhoneSleepSuggestUtils", "existOxygenRemindData map is null");
                    iBaseResponseCallback.a(-1, null);
                    return;
                }
                ArrayList arrayList = new ArrayList(16);
                Object obj2 = sparseArray.get(DicDataTypeUtil.DataType.EFFECTIVE_SLEEP_DURATION.value());
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    LogUtil.a("PhoneSleepSuggestUtils", "getDailySleepRegularity ", " list size ", Integer.valueOf(list.size()));
                    arrayList.addAll(list);
                }
                if (arrayList.size() != 0) {
                    String strE = ucv.e(ucv.e(date), ucv.c(date2), (int) ((HiHealthData) arrayList.get(arrayList.size() - 1)).getValue());
                    LogUtil.a("PhoneSleepSuggestUtils", "callback successful, sleepRegularityDesc", strE);
                    iBaseResponseCallback.a(0, strE);
                    return;
                }
                iBaseResponseCallback.a(-1, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String e(long j, long j2, long j3) {
        int regularScore = ((SleepMonitorAlgorithmApi) Services.b("SleepMonitor", SleepMonitorAlgorithmApi.class)).getRegularScore(new dda.d().d(j).b(j2).c(j3).a());
        if (regularScore <= 10) {
            return BaseApplication.getContext().getString(R.string.IDS_irregular_sleep);
        }
        if (regularScore > 10 && regularScore <= 20) {
            return BaseApplication.getContext().getString(R.string.IDS_fairly_regular_sleep);
        }
        if (regularScore > 20 && regularScore <= 40) {
            return BaseApplication.getContext().getString(R.string.IDS_more_regular_sleep);
        }
        if (regularScore > 40 && regularScore <= 50) {
            return BaseApplication.getContext().getString(R.string.IDS_very_regular_sleep);
        }
        return "";
    }

    public static String a(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        if (i == 0 && i2 == 0 && i3 == 0) {
            return e(z);
        }
        int i7 = i4 - i;
        int i8 = i5 - i2;
        int i9 = i6 - i3;
        if (Math.abs(i7) <= 90 && Math.abs(i8) <= 90 && Math.abs(i9) <= 90) {
            int i10 = ((i7 + i8) + i9) / 3;
            if (i10 <= 30 && z) {
                return BaseApplication.getContext().getString(R.string.IDS_week_data_difference_2);
            }
            if (i10 <= 60 && z) {
                return BaseApplication.getContext().getString(R.string.IDS_week_data_difference_3);
            }
            if (i10 <= 90 && z) {
                return BaseApplication.getContext().getString(R.string.IDS_week_data_difference_4);
            }
            if (i10 <= 30) {
                return BaseApplication.getContext().getString(R.string.IDS_month_data_difference_2);
            }
            if (i10 <= 60) {
                return BaseApplication.getContext().getString(R.string.IDS_month_data_difference_3);
            }
            if (i10 <= 90) {
                return BaseApplication.getContext().getString(R.string.IDS_month_data_difference_4);
            }
            return "";
        }
        if (Math.abs(i7) > 90 || Math.abs(i8) > 90 || Math.abs(i9) > 90) {
            return a(i7, i8, i9, z);
        }
        return "";
    }

    public static String e(boolean z) {
        if (z) {
            return BaseApplication.getContext().getString(R.string.IDS_week_data_difference_1);
        }
        return BaseApplication.getContext().getString(R.string.IDS_month_data_difference_1);
    }

    private static String a(int i, int i2, int i3, boolean z) {
        String string = Math.abs(i) > 90 ? BaseApplication.getContext().getString(R.string.IDS_two_parts, "", i(i)) : "";
        if (Math.abs(i2) > 90) {
            string = BaseApplication.getContext().getString(R.string.IDS_two_parts, string, n(i2));
        }
        if (Math.abs(i3) > 90) {
            string = BaseApplication.getContext().getString(R.string.IDS_two_parts, string, o(i3));
        }
        if (z) {
            return BaseApplication.getContext().getString(R.string.IDS_week_compared_to_last_week, string);
        }
        return BaseApplication.getContext().getString(R.string.IDS_month_compared_to_last_month, string);
    }

    private static String i(int i) {
        String strD = d(i);
        String strA = a(i);
        if (i < 0) {
            return BaseApplication.getContext().getString(R.string.IDS_early_bedtime, strD, strA);
        }
        return BaseApplication.getContext().getString(R.string.IDS_delayed_bedtime, strD, strA);
    }

    private static String n(int i) {
        String strD = d(i);
        String strA = a(i);
        if (i < 0) {
            return BaseApplication.getContext().getString(R.string.IDS_wake_up_early, strD, strA);
        }
        return BaseApplication.getContext().getString(R.string.IDS_wake_up_delay, strD, strA);
    }

    private static String o(int i) {
        String strD = d(i);
        String strA = a(i);
        if (i < 0) {
            return BaseApplication.getContext().getString(R.string.IDS_decrease_sleep_duration, strD, strA);
        }
        return BaseApplication.getContext().getString(R.string.IDS_increase_sleep_duration, strD, strA);
    }

    public static String d(int i) {
        return BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_hour_unit, Math.abs(i) / 60, Integer.valueOf(Math.abs(i) / 60));
    }

    public static String a(int i) {
        return BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_min_unit, Math.abs(i) % 60, Integer.valueOf(Math.abs(i) % 60));
    }

    public static String d(int i, int i2, boolean z) {
        if (i > 85 && i <= 100) {
            return BaseApplication.getContext().getString(R.string.IDS_week_summary_of_sleep_26);
        }
        if (i >= 75 && i <= 85) {
            return BaseApplication.getContext().getString(R.string.IDS_week_summary_of_sleep_25);
        }
        if (i <= 60 || i >= 75) {
            if (z) {
                return t(i2);
            }
            return g(i2);
        }
        if (z) {
            return r(i2);
        }
        return h(i2);
    }

    private static String r(int i) {
        switch (i) {
            case 2:
                return BaseApplication.getContext().getString(R.string.IDS_week_summary_of_sleep_13);
            case 3:
                return BaseApplication.getContext().getString(R.string.IDS_week_summary_of_sleep_14);
            case 4:
                return BaseApplication.getContext().getString(R.string.IDS_week_summary_of_sleep_15);
            case 5:
            case 11:
            default:
                return "";
            case 6:
                return BaseApplication.getContext().getString(R.string.IDS_week_summary_of_sleep_16);
            case 7:
                return BaseApplication.getContext().getString(R.string.IDS_week_summary_of_sleep_17);
            case 8:
                return BaseApplication.getContext().getString(R.string.IDS_week_summary_of_sleep_18);
            case 9:
                return BaseApplication.getContext().getString(R.string.IDS_week_summary_of_sleep_19);
            case 10:
                return BaseApplication.getContext().getString(R.string.IDS_week_summary_of_sleep_20);
            case 12:
                return BaseApplication.getContext().getString(R.string.IDS_week_summary_of_sleep_21);
            case 13:
                return BaseApplication.getContext().getString(R.string.IDS_week_summary_of_sleep_22);
            case 14:
                return BaseApplication.getContext().getString(R.string.IDS_week_summary_of_sleep_23);
        }
    }

    private static String t(int i) {
        switch (i) {
            case 2:
                return BaseApplication.getContext().getString(R.string.IDS_week_summary_of_sleep_1);
            case 3:
                return BaseApplication.getContext().getString(R.string.IDS_week_summary_of_sleep_2);
            case 4:
                return BaseApplication.getContext().getString(R.string.IDS_week_summary_of_sleep_3);
            case 5:
            case 11:
            default:
                return "";
            case 6:
                return BaseApplication.getContext().getString(R.string.IDS_week_summary_of_sleep_4);
            case 7:
                return BaseApplication.getContext().getString(R.string.IDS_week_summary_of_sleep_5);
            case 8:
                return BaseApplication.getContext().getString(R.string.IDS_week_summary_of_sleep_6);
            case 9:
                return BaseApplication.getContext().getString(R.string.IDS_week_summary_of_sleep_7);
            case 10:
                return BaseApplication.getContext().getString(R.string.IDS_week_summary_of_sleep_8);
            case 12:
                return BaseApplication.getContext().getString(R.string.IDS_week_summary_of_sleep_9);
            case 13:
                return BaseApplication.getContext().getString(R.string.IDS_week_summary_of_sleep_10);
            case 14:
                return BaseApplication.getContext().getString(R.string.IDS_week_summary_of_sleep_11);
        }
    }

    private static String h(int i) {
        switch (i) {
            case 2:
                return BaseApplication.getContext().getString(R.string.IDS_month_summary_of_sleep_13);
            case 3:
                return BaseApplication.getContext().getString(R.string.IDS_month_summary_of_sleep_14);
            case 4:
                return BaseApplication.getContext().getString(R.string.IDS_month_summary_of_sleep_15);
            case 5:
            case 11:
            default:
                return "";
            case 6:
                return BaseApplication.getContext().getString(R.string.IDS_month_summary_of_sleep_16);
            case 7:
                return BaseApplication.getContext().getString(R.string.IDS_month_summary_of_sleep_17);
            case 8:
                return BaseApplication.getContext().getString(R.string.IDS_month_summary_of_sleep_18);
            case 9:
                return BaseApplication.getContext().getString(R.string.IDS_month_summary_of_sleep_19);
            case 10:
                return BaseApplication.getContext().getString(R.string.IDS_month_summary_of_sleep_20);
            case 12:
                return BaseApplication.getContext().getString(R.string.IDS_month_summary_of_sleep_21);
            case 13:
                return BaseApplication.getContext().getString(R.string.IDS_month_summary_of_sleep_22);
            case 14:
                return BaseApplication.getContext().getString(R.string.IDS_month_summary_of_sleep_23);
        }
    }

    private static String g(int i) {
        switch (i) {
            case 2:
                return BaseApplication.getContext().getString(R.string.IDS_month_summary_of_sleep_1);
            case 3:
                return BaseApplication.getContext().getString(R.string.IDS_month_summary_of_sleep_2);
            case 4:
                return BaseApplication.getContext().getString(R.string.IDS_month_summary_of_sleep_3);
            case 5:
            case 11:
            default:
                return "";
            case 6:
                return BaseApplication.getContext().getString(R.string.IDS_month_summary_of_sleep_4);
            case 7:
                return BaseApplication.getContext().getString(R.string.IDS_month_summary_of_sleep_5);
            case 8:
                return BaseApplication.getContext().getString(R.string.IDS_month_summary_of_sleep_6);
            case 9:
                return BaseApplication.getContext().getString(R.string.IDS_month_summary_of_sleep_7);
            case 10:
                return BaseApplication.getContext().getString(R.string.IDS_month_summary_of_sleep_8);
            case 12:
                return BaseApplication.getContext().getString(R.string.IDS_month_summary_of_sleep_9);
            case 13:
                return BaseApplication.getContext().getString(R.string.IDS_month_summary_of_sleep_10);
            case 14:
                return BaseApplication.getContext().getString(R.string.IDS_month_summary_of_sleep_11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long e(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long c(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int a(int i, int i2, int i3, int i4) {
        if (!s(i) || s(i2)) {
            if (s(i) || !s(i2)) {
                int iM = m(i);
                int iM2 = m(i2);
                if (iM >= iM2) {
                    if (iM <= iM2) {
                        if (i3 <= i4) {
                            return i3 < i4 ? i4 : new int[]{i, i2}[b(0, 1)];
                        }
                    }
                }
            }
            return i2;
        }
        return i;
    }

    public static void a(Date date, Date date2, final IBaseResponseCallback iBaseResponseCallback) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(e(date));
        hiDataReadOption.setEndTime(c(date2));
        hiDataReadOption.setType(new int[]{DicDataTypeUtil.DataType.SLEEP_SYMPTOMS.value()});
        HiHealthNativeApi.a(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: ucv.1
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.a("PhoneSleepSuggestUtils", "getDailySleepTag onResult: errorCode: ", Integer.valueOf(i), ", data: ", obj);
                if (iBaseResponseCallback == null) {
                    LogUtil.e("PhoneSleepSuggestUtils", "callback is null");
                    return;
                }
                if (!(obj instanceof SparseArray)) {
                    LogUtil.j("PhoneSleepSuggestUtils", "getTemperatureData convert fail, data = ", Boolean.valueOf(obj == null));
                    iBaseResponseCallback.a(-1, null);
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0) {
                    LogUtil.j("PhoneSleepSuggestUtils", "existOxygenRemindData map is null");
                    iBaseResponseCallback.a(-1, null);
                    return;
                }
                ArrayList arrayList = new ArrayList(16);
                Object obj2 = sparseArray.get(DicDataTypeUtil.DataType.SLEEP_SYMPTOMS.value());
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    LogUtil.a("PhoneSleepSuggestUtils", "getDailySleepTag ", " list size ", Integer.valueOf(list.size()));
                    arrayList.addAll(list);
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    try {
                        JSONObject jSONObject = new JSONObject(((HiHealthData) arrayList.get(i3)).getMetaData());
                        int iA = ucv.a(jSONObject.getInt("sym1_idx"), jSONObject.getInt("sym2_idx"), jSONObject.getInt("sym1_lvl"), jSONObject.getInt("sym2_lvl"));
                        if (iA != 1) {
                            arrayList2.add(Integer.valueOf(iA));
                        }
                    } catch (JSONException unused) {
                        iBaseResponseCallback.a(-1, null);
                    }
                }
                LogUtil.a("PhoneSleepSuggestUtils", "callback successful, getMaxCountValue", Integer.valueOf(ucv.c(arrayList2)));
                iBaseResponseCallback.a(0, Integer.valueOf(ucv.c(arrayList2)));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(List<Integer> list) {
        HashMap map = new HashMap();
        for (Integer num : list) {
            num.intValue();
            if (map.get(num) == null) {
                map.put(num, 1);
            } else {
                map.put(num, Integer.valueOf(((Integer) map.get(num)).intValue() + 1));
            }
        }
        int iIntValue = ((Integer) Collections.max(map.values())).intValue();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Integer) entry.getValue()).intValue() == iIntValue) {
                arrayList.add((Integer) entry.getKey());
            }
        }
        return ((Integer) arrayList.get(b(0, arrayList.size() - 1))).intValue();
    }

    public static void e(Date date, final IBaseResponseCallback iBaseResponseCallback) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(e(date));
        hiDataReadOption.setEndTime(c(date));
        hiDataReadOption.setType(new int[]{DicDataTypeUtil.DataType.SLEEP_SYMPTOMS.value()});
        HiHealthNativeApi.a(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: ucv.4
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                if (iBaseResponseCallback == null) {
                    return;
                }
                if (!(obj instanceof SparseArray)) {
                    LogUtil.j("PhoneSleepSuggestUtils", "getTemperatureData convert fail, data = ", Boolean.valueOf(obj == null));
                    iBaseResponseCallback.a(-1, null);
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0) {
                    LogUtil.j("PhoneSleepSuggestUtils", "existOxygenRemindData map is null");
                    iBaseResponseCallback.a(-1, null);
                    return;
                }
                ArrayList arrayList = new ArrayList(16);
                Object obj2 = sparseArray.get(DicDataTypeUtil.DataType.SLEEP_SYMPTOMS.value());
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    LogUtil.a("PhoneSleepSuggestUtils", "getSleepTag ", " list size ", Integer.valueOf(list.size()));
                    arrayList.addAll(list);
                }
                try {
                    JSONObject jSONObject = new JSONObject(((HiHealthData) arrayList.get(arrayList.size() - 1)).getMetaData());
                    int i3 = jSONObject.getInt("sym1_idx");
                    int i4 = jSONObject.getInt("sym1_lvl");
                    int i5 = jSONObject.getInt("sym2_idx");
                    int i6 = jSONObject.getInt("sym2_lvl");
                    int iA = ucv.a(i3, i5, i4, i6);
                    if (iA != i3) {
                        i4 = i6;
                    }
                    HashMap map = new HashMap();
                    map.put("sleep_tag", Integer.valueOf(iA));
                    map.put("sdk_type", Integer.valueOf(i4));
                    iBaseResponseCallback.a(0, map);
                } catch (JSONException unused) {
                    iBaseResponseCallback.a(-1, null);
                }
            }
        });
    }

    private static int b(int i, int i2) {
        return qrf.d((i2 - i) + 1) + i;
    }

    public static void c(Date date, IBaseResponseCallback iBaseResponseCallback) {
        int[] iArr = {DicDataTypeUtil.DataType.SLEEP_END_REASON.value(), DicDataTypeUtil.DataType.BED_TIME.value(), DicDataTypeUtil.DataType.RISING_TIME.value()};
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(e(date));
        hiDataReadOption.setEndTime(c(date));
        hiDataReadOption.setType(iArr);
        HiHealthNativeApi.a(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, new AnonymousClass3(iBaseResponseCallback));
    }

    /* JADX INFO: renamed from: ucv$3, reason: invalid class name */
    class AnonymousClass3 implements HiDataReadResultListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ IBaseResponseCallback f49948c;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        AnonymousClass3(IBaseResponseCallback iBaseResponseCallback) {
            this.f49948c = iBaseResponseCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            if (this.f49948c == null) {
                return;
            }
            if (!(obj instanceof SparseArray)) {
                LogUtil.j("PhoneSleepSuggestUtils", "getTemperatureData convert fail, data = ", Boolean.valueOf(obj == null));
                this.f49948c.a(-1, null);
                return;
            }
            SparseArray sparseArray = (SparseArray) obj;
            if (sparseArray.size() <= 0) {
                LogUtil.j("PhoneSleepSuggestUtils", "existOxygenRemindData map is null");
                this.f49948c.a(-1, null);
                return;
            }
            List arrayList = new ArrayList();
            if (sparseArray.get(DicDataTypeUtil.DataType.SLEEP_END_REASON.value()) instanceof List) {
                arrayList = (List) sparseArray.get(DicDataTypeUtil.DataType.SLEEP_END_REASON.value());
            }
            int value = arrayList.size() != 0 ? (int) ((HiHealthData) arrayList.get(arrayList.size() - 1)).getValue() : 0;
            List arrayList2 = new ArrayList();
            if (sparseArray.get(DicDataTypeUtil.DataType.BED_TIME.value()) instanceof List) {
                arrayList2 = (List) sparseArray.get(DicDataTypeUtil.DataType.BED_TIME.value());
            }
            List arrayList3 = new ArrayList();
            if (sparseArray.get(DicDataTypeUtil.DataType.RISING_TIME.value()) instanceof List) {
                arrayList3 = (List) sparseArray.get(DicDataTypeUtil.DataType.RISING_TIME.value());
            }
            if (value == 0) {
                this.f49948c.a(-1, null);
                return;
            }
            if (value == 1) {
                HashMap map = new HashMap();
                map.put("detect_abnormal", BaseApplication.getContext().getString(R.string.IDS_sleep_end_reason_2));
                this.f49948c.a(0, map);
                return;
            }
            if (value == 2 && arrayList2.size() != 0 && arrayList3.size() != 0) {
                long value2 = (long) ((HiHealthData) arrayList2.get(arrayList2.size() - 1)).getValue();
                long value3 = (long) ((HiHealthData) arrayList3.get(arrayList3.size() - 1)).getValue();
                final IBaseResponseCallback iBaseResponseCallback = this.f49948c;
                ucv.a(value2, value3, new IBaseResponseCallback() { // from class: uct
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i3, Object obj2) {
                        ucv.AnonymousClass3.a(iBaseResponseCallback, i3, obj2);
                    }
                });
                return;
            }
            if (value == 3 && arrayList3.size() != 0) {
                HashMap map2 = new HashMap();
                map2.put("detect_abnormal", BaseApplication.getContext().getString(R.string.IDS_sleep_end_reason_3, ucv.b((long) ((HiHealthData) arrayList3.get(arrayList3.size() - 1)).getValue())));
                this.f49948c.a(0, map2);
                return;
            }
            this.f49948c.a(-1, null);
        }

        static /* synthetic */ void a(IBaseResponseCallback iBaseResponseCallback, int i, Object obj) {
            LogUtil.a("PhoneSleepSuggestUtils", "errCode: ", Integer.valueOf(i), ", objData: ", obj);
            HashMap map = new HashMap();
            if (i == 0) {
                map.put("detect_abnormal", (String) obj);
                map.put("detect_abnormal_jump", BaseApplication.getContext().getString(R.string.IDS_sleep_to_set_up));
                iBaseResponseCallback.a(0, map);
                return;
            }
            iBaseResponseCallback.a(-1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return new SimpleDateFormat("HH:mm").format(calendar.getTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(long j, long j2, final IBaseResponseCallback iBaseResponseCallback) {
        final int[] iArr = {22104, 22101, 22103};
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(j);
        hiDataReadOption.setEndTime(j2);
        hiDataReadOption.setType(iArr);
        HiHealthNativeApi.a(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: ucv.5
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                long j3;
                long j4;
                if (iBaseResponseCallback == null) {
                    return;
                }
                if (!(obj instanceof SparseArray)) {
                    LogUtil.j("PhoneSleepSuggestUtils", "getTemperatureData convert fail, data = ", Boolean.valueOf(obj == null));
                    iBaseResponseCallback.a(-1, null);
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0) {
                    LogUtil.j("PhoneSleepSuggestUtils", "existOxygenRemindData map is null");
                    iBaseResponseCallback.a(-1, null);
                    return;
                }
                ArrayList arrayList = new ArrayList(16);
                for (int i3 : iArr) {
                    Object obj2 = sparseArray.get(i3);
                    if (obj2 instanceof List) {
                        List list = (List) obj2;
                        LogUtil.a("PhoneSleepSuggestUtils", "getInterruptSleepEndReason ", " list size ", Integer.valueOf(list.size()));
                        arrayList.addAll(list);
                    }
                }
                int size = arrayList.size();
                a[] aVarArr = new a[size];
                for (int i4 = 0; i4 < size; i4++) {
                    aVarArr[i4] = new a(((HiHealthData) arrayList.get(i4)).getStartTime(), ((HiHealthData) arrayList.get(i4)).getEndTime());
                }
                Arrays.sort(aVarArr);
                int i5 = 0;
                while (true) {
                    if (i5 >= size - 1) {
                        j3 = 0;
                        j4 = 0;
                        break;
                    }
                    int i6 = i5 + 1;
                    if (aVarArr[i6].f49950b - aVarArr[i5].f49950b > 60000) {
                        j3 = aVarArr[i5].d;
                        j4 = aVarArr[i6].f49950b;
                        break;
                    }
                    i5 = i6;
                }
                if (j3 != 0 && j4 != 0) {
                    LogUtil.a("PhoneSleepSuggestUtils", "interrupt time exist");
                    iBaseResponseCallback.a(0, BaseApplication.getContext().getString(R.string.IDS_sleep_end_reason_1, ucv.b(j3), ucv.b(j4)));
                } else {
                    LogUtil.a("PhoneSleepSuggestUtils", "interrupt time not exist");
                    iBaseResponseCallback.a(-1, null);
                }
            }
        });
    }

    public static String b(gxq gxqVar, int i, boolean z, int i2) {
        return b(i, e(i, gxqVar), z, i2);
    }

    public static int a(gxq gxqVar) {
        List<Integer> listD = d(gxqVar);
        if (listD.isEmpty()) {
            return 0;
        }
        if (!listD.contains(2) && !listD.contains(3) && !listD.contains(4) && !listD.contains(15)) {
            return listD.contains(13) ? 13 : 0;
        }
        if (listD.contains(13)) {
            listD.remove(new Integer(13));
        }
        LogUtil.a("PhoneSleepSuggestUtils", "tags: ", listD);
        return listD.get(b(0, listD.size() - 1)).intValue();
    }

    private static List<Integer> d(gxq gxqVar) {
        ArrayList arrayList = new ArrayList();
        if (gxqVar.h().h() >= 30) {
            arrayList.add(2);
        }
        float fI = gxqVar.h().i();
        if (fI < 360.0f) {
            arrayList.add(3);
        }
        if (fI < 360.0f) {
            arrayList.add(4);
        }
        if (gxqVar.h().p() < 0.85f) {
            arrayList.add(15);
        }
        if (fI > 600.0f) {
            arrayList.add(13);
        }
        return arrayList;
    }

    private static int e(int i, gxq gxqVar) {
        LogUtil.a("PhoneSleepSuggestUtils", "sleepTag: ", Integer.valueOf(i));
        if (i == 2) {
            int iH = gxqVar.h().h();
            if (iH >= 120) {
                return 3;
            }
            if (iH >= 60 && iH < 120) {
                return 2;
            }
            if (iH >= 30 && iH < 60) {
                return 1;
            }
        } else if (i == 3) {
            int i2 = gxqVar.h().i();
            int iF = gxqVar.h().f();
            if (iF < 480 && i2 < 300.0f) {
                return 3;
            }
            if (iF < 510 && i2 < 330.0f) {
                return 2;
            }
            if (iF < 540 && i2 < 360.0f) {
                return 1;
            }
        } else if (i == 4) {
            float fI = gxqVar.h().i();
            if (fI < 240.0f) {
                return 3;
            }
            if (fI >= 240.0f && fI < 300.0f) {
                return 2;
            }
            if (fI >= 300.0f && fI < 360.0f) {
                return 1;
            }
        } else if (i == 13) {
            float fI2 = gxqVar.h().i();
            if (fI2 > 600.0f && fI2 <= 720.0f) {
                return 2;
            }
            if (fI2 > 720.0f) {
                return 1;
            }
        } else {
            if (i != 15) {
                return 0;
            }
            float fP = gxqVar.h().p();
            if (fP != 0.0f) {
                if (fP < 0.7f) {
                    return 3;
                }
                if (fP >= 0.7f && fP < 0.8f) {
                    return 2;
                }
                if (fP >= 0.8f && fP < 0.85f) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static String e(gxq gxqVar) {
        int iAa = ((gxn) gxqVar.h()).aa();
        int iZ = ((gxn) gxqVar.h()).z();
        if (iAa <= 70 || iZ <= 70) {
            return c(Math.min(iAa, iZ), iAa < iZ);
        }
        return c(Math.max(iAa, iZ), iAa > iZ);
    }

    private static String c(int i, boolean z) {
        if (z) {
            return l(i);
        }
        return k(i);
    }

    private static String l(int i) {
        if (i < 35) {
            return BaseApplication.getContext().getString(R.string.IDS_sleep_input_text24);
        }
        if (i < 70) {
            return BaseApplication.getContext().getString(R.string.IDS_sleep_input_text25);
        }
        if (i < 85) {
            return BaseApplication.getContext().getString(R.string.IDS_sleep_input_text26);
        }
        return BaseApplication.getContext().getString(R.string.IDS_sleep_input_text27);
    }

    private static String k(int i) {
        if (i < 35) {
            return BaseApplication.getContext().getString(R.string.IDS_sleep_input_text28);
        }
        if (i < 70) {
            return BaseApplication.getContext().getString(R.string.IDS_sleep_input_text29);
        }
        if (i < 85) {
            return BaseApplication.getContext().getString(R.string.IDS_sleep_input_text30);
        }
        return BaseApplication.getContext().getString(R.string.IDS_sleep_input_text31);
    }

    static class a implements Comparable<a> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f49950b;
        long d;

        public a(long j, long j2) {
            this.f49950b = j;
            this.d = j2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            long j = this.f49950b;
            long j2 = aVar.f49950b;
            if (j > j2) {
                return 1;
            }
            return j < j2 ? -1 : 0;
        }
    }
}
