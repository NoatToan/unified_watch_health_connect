package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.AppCompatDelegate;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.CreativeType;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.privacy.template.model.bean.PageModelArgs;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class wig {
    public static int d(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
        }
        return i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    public static String e(String str) {
        Resources resources = BaseApplication.getContext().getResources();
        str.hashCode();
        switch (str) {
            case "com.huawei.continuous.body_weight.statistics":
                return resources.getString(R.string.IDS_hw_health_show_healthdata_weight_unit);
            case "com.huawei.continuous.heart_rate.statistics":
            case "com.huawei.continuous.steps.rate.statistics":
                return resources.getString(R.string.IDS_awake_times);
            case "com.huawei.continuous.steps.total":
                return resources.getString(R.string.IDS_settings_steps_unit);
            case "com.huawei.continuous.sleep.statistics":
                return resources.getString(R.string.IDS_hw_show_main_home_page_minutes);
            case "com.huawei.continuous.calories.burnt.total":
                return resources.getString(R.string.IDS_band_data_sport_energy_unit);
            case "com.huawei.continuous.distance.total":
                return resources.getString(R.string.IDS_fitness_data_list_activity_meter_unit);
            default:
                return "";
        }
    }

    public static String i(int i) {
        Resources resources = BaseApplication.getContext().getResources();
        if (i == 100) {
            return resources.getString(R.string.IDS_hw_show_main_home_page_steps);
        }
        if (i != 103) {
            switch (i) {
                case 106:
                    return resources.getString(R.string.IDS_device_device_weather_unit_celsius);
                case 107:
                    return resources.getString(R.string.IDS_hw_health_show_healthdata_mmhg_str);
                case 108:
                    return resources.getString(R.string.IDS_device_measure_sugar_value_unit);
                case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY /* 109 */:
                    return resources.getString(R.string.IDS_device_measure_weight_value_unit);
                default:
                    return "";
            }
        }
        return resources.getString(R.string.IDS_hw_show_main_home_page_minutes);
    }

    public static String a(int i) {
        Resources resources = BaseApplication.getContext().getResources();
        switch (i) {
            case 100:
                return resources.getString(R.string.IDS_motiontrack_show_detail_stemps);
            case 101:
                return resources.getString(R.string.IDS_sport_distance);
            case 102:
                return resources.getString(R.string.IDS_main_watch_heart_rate_string);
            case 103:
                return resources.getString(R.string.IDS_hw_show_main_permission_sleep);
            case 104:
                return resources.getString(R.string.IDS_settings_one_level_menu_settings_item_text_id14);
            case 105:
                return resources.getString(R.string.IDS_hw_health_blood_oxygen);
            case 106:
                return resources.getString(R.string.IDS_settings_health_temperature);
            case 107:
                return resources.getString(R.string.IDS_hw_show_main_home_page_bloodpressure);
            case 108:
                return resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar);
            case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY /* 109 */:
                return resources.getString(R.string.IDS_hw_health_show_healthdata_weight);
            case 110:
                return resources.getString(R.string.IDS_motiontrack_climb_stairs_tip);
            case 111:
                return resources.getString(R.string.IDS_active_caloric);
            case 112:
                return resources.getString(R.string.IDS_privacy_activity_records);
            case CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON /* 113 */:
                return resources.getString(R.string.IDS_health_skin_temperature);
            default:
                return "UnknownType";
        }
    }

    public static String b(long j) {
        return UnitUtil.a(new Date(j), 131097);
    }

    public static String d(long j) {
        return UnitUtil.a(new Date(j), 131096);
    }

    public static String e(long j) {
        return UnitUtil.a(new Date(j), 1);
    }

    public static String c(long j) {
        return UnitUtil.a(new Date(j), 131093);
    }

    public static String j(long j) {
        return UnitUtil.a(new Date(j), 131092);
    }

    public static String a(long j) {
        return paw.d(j, 0);
    }

    public static String b(int i, double d) {
        int i2 = R.plurals.IDS_hwh_me_other_target_steps;
        if (i == 100) {
            i2 = R.plurals.IDS_hwh_me_other_target_steps;
        } else if (i == 109) {
            if (UnitUtil.f()) {
                i2 = R.plurals.IDS_lb_string;
            } else {
                i2 = R.plurals.IDS_kg_string;
            }
        }
        return BaseApplication.getContext().getResources().getQuantityString(i2, vdo.b(d), "");
    }

    public static String i(long j) {
        StringBuilder sb = new StringBuilder();
        Resources resources = BaseApplication.getContext().getResources();
        long j2 = j / 60;
        long j3 = j2 / 60;
        if (j3 != 0) {
            sb.append(e(resources.getString(R.string.IDS_hw_show_main_home_page_hours), UnitUtil.e(j3, 1, 0), 103));
            sb.append(" ");
        }
        long j4 = j2 % 60;
        if (j4 != 0 || j3 == 0) {
            sb.append(e(resources.getString(R.string.IDS_hw_show_main_home_page_minutes), UnitUtil.e(j4, 1, 0), 103));
        }
        return sb.toString();
    }

    public static String e(String str, String str2, int i) {
        String str3;
        StringBuilder sb = new StringBuilder();
        if (i != 108) {
            str3 = " ";
        } else {
            str3 = "";
        }
        if (LanguageUtil.aj(BaseApplication.getContext())) {
            switch (i) {
                case 100:
                case 101:
                case 102:
                case 107:
                case 111:
                    sb.append(str);
                    sb.append(str3);
                    sb.append(str2);
                    break;
                case 103:
                    sb.append(str);
                    sb.append(str2);
                    break;
                case 108:
                    int iLastIndexOf = str.lastIndexOf("/");
                    if (iLastIndexOf == -1) {
                        sb.append(str);
                        sb.append(str3);
                        sb.append(str2);
                    } else {
                        String strSubstring = str.substring(0, iLastIndexOf);
                        String strSubstring2 = str.substring(iLastIndexOf);
                        sb.append(strSubstring);
                        sb.append(str3);
                        sb.append(str2);
                        sb.append(str3);
                        sb.append(strSubstring2);
                    }
                    break;
                case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY /* 109 */:
                    sb.append(str3);
                    sb.append(str);
                    sb.append(str3);
                    sb.append(str2);
                    break;
            }
        } else {
            sb.append(str2);
            sb.append(str3);
            sb.append(str);
        }
        return sb.toString();
    }

    public static boolean d(long j, long j2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        return simpleDateFormat.format(Long.valueOf(j)).equals(simpleDateFormat.format(Long.valueOf(j2)));
    }

    public static boolean b(long j, long j2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM");
        return simpleDateFormat.format(Long.valueOf(j)).equals(simpleDateFormat.format(Long.valueOf(j2)));
    }

    public static boolean a(long j, long j2) {
        int iB = lsl.b(j, j2);
        LogUtil.a("PrivacyUtil", "thirtyDaysDiff: ", Integer.valueOf(iB));
        return iB >= 30;
    }

    public static long f(long j) {
        return ((j / 1000) / 60) * 60;
    }

    public static String b(int i, PrivacyDataModel privacyDataModel) {
        if (privacyDataModel == null) {
            return "";
        }
        switch (i) {
            case 100:
                return wgv.g(privacyDataModel.getIntValue());
            case 101:
                return wgv.d(privacyDataModel.getDoubleValue());
            case 102:
                return wgv.b(privacyDataModel.getIntValue());
            case 103:
                return i((privacyDataModel.getEndTime() - privacyDataModel.getStartTime()) / 1000);
            case 104:
                return wgv.b(privacyDataModel.getIntValue(), false);
            case 105:
                return wgv.c(privacyDataModel.getIntValue());
            case 106:
            case CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON /* 113 */:
                return wgv.d(privacyDataModel.getDoubleValue(), privacyDataModel.getType());
            case 107:
                return wgv.d(UnitUtil.e(privacyDataModel.getInt(BleConstants.BLOODPRESSURE_SYSTOLIC), 1, 0) + "/" + UnitUtil.e(privacyDataModel.getInt(BleConstants.BLOODPRESSURE_DIASTOLIC), 1, 0));
            case 108:
                return wgv.b(privacyDataModel.getDoubleValue());
            case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY /* 109 */:
                return wgv.e(privacyDataModel.getDoubleValue(), false);
            case 110:
                return wgv.e((float) privacyDataModel.getDoubleValue());
            case 111:
                return wgv.e(privacyDataModel.getDoubleValue());
            case 112:
            default:
                return "";
        }
    }

    public static List<String> b(int i) {
        Context context = BaseApplication.getContext();
        if (i != 105) {
            if (i == 107) {
                return Arrays.asList(context.getResources().getStringArray(R.array.IDS_bp_spinner_option_array));
            }
            return new ArrayList(10);
        }
        if (fua.e()) {
            return Arrays.asList(context.getResources().getStringArray(R.array.IDS_spo2_spinner_option_array));
        }
        return Arrays.asList(context.getString(R.string.IDS_privacy_all_data));
    }

    public static List<Integer> f(int i) {
        if (i != 105) {
            if (i == 107) {
                return Arrays.asList(1, 2, 3);
            }
            return new ArrayList(10);
        }
        if (fua.e()) {
            return Arrays.asList(1, 2, 3, 4);
        }
        return Arrays.asList(1);
    }

    public static String[] h(int i) {
        Context context = BaseApplication.getContext();
        if (i == 106) {
            return context.getResources().getStringArray(R.array.IDS_temperature_tab_array);
        }
        if (i == 107) {
            int[] iArrB = ftw.b();
            ArrayList arrayList = new ArrayList(10);
            arrayList.add(context.getString(R.string.IDS_bloodpressure_all_data));
            for (int length = iArrB.length - 1; length >= 0; length--) {
                int i2 = iArrB[length];
                if (i2 != 1) {
                    arrayList.add(ftw.d(i2));
                }
            }
            return (String[]) arrayList.toArray(new String[0]);
        }
        return new String[0];
    }

    public static Integer[] c(int i) {
        if (i == 106) {
            return new Integer[]{1, 2};
        }
        if (i == 107) {
            int[] iArrB = ftw.b();
            ArrayList arrayList = new ArrayList(10);
            arrayList.add(100);
            for (int length = iArrB.length - 1; length >= 0; length--) {
                int i2 = iArrB[length];
                if (i2 != 1) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            return (Integer[]) arrayList.toArray(new Integer[0]);
        }
        return new Integer[0];
    }

    public static boolean d(PageModelArgs pageModelArgs) {
        if (pageModelArgs == null || pageModelArgs.getDataSource() != 3) {
            return false;
        }
        int pageType = pageModelArgs.getPageType();
        if (pageType == 106 || pageType == 107 || pageType == 113) {
            return true;
        }
        switch (pageType) {
            case 102:
            case 103:
            case 104:
                return true;
            default:
                return false;
        }
    }

    public static boolean e(PageModelArgs pageModelArgs) {
        if (pageModelArgs == null || pageModelArgs.getDataSource() != 3) {
            return false;
        }
        int pageType = pageModelArgs.getPageType();
        return pageType == 106 || pageType == 113;
    }

    public static boolean c(PageModelArgs pageModelArgs) {
        return pageModelArgs != null && pageModelArgs.getPageType() == 103 && pageModelArgs.getModuleType() == 1;
    }

    public static boolean g(PageModelArgs pageModelArgs) {
        if (pageModelArgs == null) {
            return false;
        }
        int pageType = pageModelArgs.getPageType();
        if (pageType != 102 && pageType != 103 && pageType != 113) {
            switch (pageType) {
                case 105:
                case 106:
                case 107:
                    break;
                default:
                    return false;
            }
        }
        return pageModelArgs.getDataSource() == 3 && (pageModelArgs.getModuleType() == 1 || pageModelArgs.getModuleType() == 3);
    }

    public static boolean j(PageModelArgs pageModelArgs) {
        return pageModelArgs != null && pageModelArgs.getPageType() == 106;
    }

    public static boolean h(PageModelArgs pageModelArgs) {
        return pageModelArgs != null && pageModelArgs.getPageType() == 107;
    }

    public static boolean b(PageModelArgs pageModelArgs) {
        if (pageModelArgs == null) {
            return false;
        }
        int pageType = pageModelArgs.getPageType();
        return pageType == 102 || pageType == 103 || pageType == 106 || pageType == 113;
    }

    public static Drawable e(int i) {
        Context context = BaseApplication.getContext();
        if (LanguageUtil.ba(context)) {
            return qqz.e(context, i);
        }
        return context.getDrawable(i);
    }

    public static PageModelArgs a(PageModelArgs pageModelArgs) {
        PageModelArgs pageModelArgs2 = new PageModelArgs();
        if (pageModelArgs != null) {
            pageModelArgs2.setPageType(pageModelArgs.getPageType());
            pageModelArgs2.setServiceId(pageModelArgs.getServiceId());
            pageModelArgs2.setUuid(pageModelArgs.getUuid());
            pageModelArgs2.setDataSource(pageModelArgs.getDataSource());
            pageModelArgs2.setModuleType(pageModelArgs.getModuleType());
            pageModelArgs2.setTimestamp(pageModelArgs.getTimestamp());
            pageModelArgs2.setClassType(pageModelArgs.getClassType());
            pageModelArgs2.setPackageName(pageModelArgs.getPackageName());
            pageModelArgs2.setOtherManufacturer(pageModelArgs.isOtherManufacturer());
            pageModelArgs2.setSourceInfo(pageModelArgs.getSourceInfo());
            pageModelArgs2.setContentValues(pageModelArgs.getContentValues());
        }
        return pageModelArgs2;
    }
}
