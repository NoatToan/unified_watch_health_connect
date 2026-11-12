package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import androidx.media3.exoplayer.DefaultLoadControl;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.hms.hihealth.HiHealthStatusCodes;
import com.huawei.hms.iap.entity.OrderStatusCode;
import com.huawei.hms.network.embedded.y;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.LevelInfoDesc;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class paq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f45098b = {0, 400, 900, 1500, DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS, 3600, 4900, 6400, 8000, 10000, y.f15619c, 20000, 25000, 36000, 49000, 66000, 86000, 111000, 139000, 176000};
    private static final Integer[] e = {Integer.valueOf(R.mipmap.level_lock_huo), Integer.valueOf(R.mipmap.level_lock_zi), Integer.valueOf(R.mipmap.level_lock_neng), Integer.valueOf(R.mipmap.level_lock_wang), Integer.valueOf(R.mipmap.level_lock_quan), Integer.valueOf(R.mipmap.level_lock_mvp), Integer.valueOf(R.mipmap.level_lock_dian)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Integer[] f45097a = {Integer.valueOf(R.mipmap.ic_health_level_medal01), Integer.valueOf(R.mipmap.ic_health_level_medal02), Integer.valueOf(R.mipmap.ic_health_level_medal03), Integer.valueOf(R.mipmap.ic_health_level_medal04), Integer.valueOf(R.mipmap.ic_health_level_medal05), Integer.valueOf(R.mipmap.ic_health_level_medal06), Integer.valueOf(R.mipmap.ic_health_level_medal07)};
    private static final Integer[] d = {Integer.valueOf(R.mipmap.level_share_huo), Integer.valueOf(R.mipmap.level_share_zi), Integer.valueOf(R.mipmap.level_share_neng), Integer.valueOf(R.mipmap.level_share_wang), Integer.valueOf(R.mipmap.level_share_quan), Integer.valueOf(R.mipmap.level_share_chuan), Integer.valueOf(R.mipmap.level_share_dian)};

    public static int d(double d2) {
        double d3;
        double d4;
        if (d2 >= 10.0d) {
            if (d2 < 50.0d) {
                d4 = d2 * 20.0d;
                if (d4 < 400.0d) {
                    d4 = 400.0d;
                }
            } else if (d2 < 100.0d) {
                d3 = 22.0d;
            } else if (d2 < 200.0d) {
                d3 = 24.0d;
            } else if (d2 < 500.0d) {
                d3 = 26.0d;
            } else {
                d3 = d2 < 1000.0d ? 28.0d : 30.0d;
            }
            return (int) (d4 + 0.5d);
        }
        d3 = 15.0d;
        d4 = d2 * d3;
        return (int) (d4 + 0.5d);
    }

    public static int g(int i) {
        switch (i) {
            case 4:
            case 5:
            case 6:
                return 2;
            case 7:
            case 8:
            case 9:
                return 3;
            case 10:
            case 11:
            case 12:
                return 4;
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case 17:
            case 18:
                return 6;
            case 19:
            case 20:
                return 7;
            default:
                return 1;
        }
    }

    public static int h(int i) {
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 6;
            case 3:
                return 9;
            case 4:
                return 12;
            case 5:
                return 15;
            case 6:
                return 18;
            case 7:
                return 20;
            default:
                return 1;
        }
    }

    public static int i(int i) {
        switch (i) {
            case 1:
                return 2;
            case 2:
                return 5;
            case 3:
                return 8;
            case 4:
                return 11;
            case 5:
                return 14;
            case 6:
                return 17;
            case 7:
                return 20;
            default:
                return 1;
        }
    }

    public static int j(int i) {
        switch (i) {
            case 2:
                return 4;
            case 3:
                return 7;
            case 4:
                return 10;
            case 5:
                return 13;
            case 6:
                return 16;
            case 7:
                return 19;
            default:
                return 1;
        }
    }

    public static SpannableString a(Context context, int i) {
        if (context == null) {
            LogUtil.j("PLGACHIEVE_LevelUtil", "acquireLevelContent: context is null");
            return new SpannableString("");
        }
        return pba.b(String.valueOf(i), String.format(Locale.ROOT, context.getString(R.string.IDS_plugin_achievement_level_value), Integer.valueOf(i)), (int) context.getResources().getDimension(R.dimen.hw_achieve_medal_size_24), context.getResources().getColor(R.color.textColorPrimary));
    }

    public static int b(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("PLGACHIEVE_LevelUtil", "getTimeLocalMonth: context is null");
            return 0;
        }
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException e2) {
            LogUtil.e("PLGACHIEVE_LevelUtil", "setEvent NumberFormatException ", e2.getMessage());
            i = 0;
        }
        if (i != 1100 && i != 1200 && i != 1210) {
            if (i == 1300 || i == 1400) {
                return 20;
            }
            if (i != 1500) {
                LogUtil.a("PLGACHIEVE_LevelUtil", "invalid key");
                return 0;
            }
        }
        return 10;
    }

    public static void d(Map<Integer, Integer> map) {
        if (map == null) {
            return;
        }
        map.put(1, Integer.valueOf(R.mipmap.ic_lv01_810_on));
        map.put(2, Integer.valueOf(R.mipmap.ic_lv02_810_on));
        map.put(3, Integer.valueOf(R.mipmap.ic_lv03_810_on));
        map.put(4, Integer.valueOf(R.mipmap.ic_lv04_810_on));
        map.put(5, Integer.valueOf(R.mipmap.ic_lv05_810_on));
        map.put(6, Integer.valueOf(R.mipmap.ic_lv06_810_on));
        map.put(7, Integer.valueOf(R.mipmap.ic_lv07_810_on));
        map.put(8, Integer.valueOf(R.mipmap.ic_lv08_810_on));
        map.put(9, Integer.valueOf(R.mipmap.ic_lv09_810_on));
        map.put(10, Integer.valueOf(R.mipmap.ic_lv10_810_on));
        map.put(11, Integer.valueOf(R.mipmap.ic_lv11_810_on));
        map.put(12, Integer.valueOf(R.mipmap.ic_lv12_810_on));
        map.put(13, Integer.valueOf(R.mipmap.ic_lv13_810_on));
        map.put(14, Integer.valueOf(R.mipmap.ic_lv14_810_on));
        map.put(15, Integer.valueOf(R.mipmap.ic_lv15_810_on));
        map.put(16, Integer.valueOf(R.mipmap.ic_lv16_810_on));
        map.put(17, Integer.valueOf(R.mipmap.ic_lv17_810_on));
        map.put(18, Integer.valueOf(R.mipmap.ic_lv18_810_on));
        map.put(19, Integer.valueOf(R.mipmap.ic_lv19_810_on));
        map.put(20, Integer.valueOf(R.mipmap.ic_lv20_810_on));
    }

    public static void e(Map<Integer, Integer> map) {
        if (map == null) {
            return;
        }
        map.put(1, Integer.valueOf(R.mipmap.ic_health_level_medal01));
        map.put(2, Integer.valueOf(R.mipmap.ic_health_level_medal01));
        map.put(3, Integer.valueOf(R.mipmap.ic_health_level_medal01));
        map.put(4, Integer.valueOf(R.mipmap.ic_health_level_medal02));
        map.put(5, Integer.valueOf(R.mipmap.ic_health_level_medal02));
        map.put(6, Integer.valueOf(R.mipmap.ic_health_level_medal02));
        map.put(7, Integer.valueOf(R.mipmap.ic_health_level_medal03));
        map.put(8, Integer.valueOf(R.mipmap.ic_health_level_medal03));
        map.put(9, Integer.valueOf(R.mipmap.ic_health_level_medal03));
        map.put(10, Integer.valueOf(R.mipmap.ic_health_level_medal04));
        map.put(11, Integer.valueOf(R.mipmap.ic_health_level_medal04));
        map.put(12, Integer.valueOf(R.mipmap.ic_health_level_medal04));
        map.put(13, Integer.valueOf(R.mipmap.ic_health_level_medal05));
        map.put(14, Integer.valueOf(R.mipmap.ic_health_level_medal05));
        map.put(15, Integer.valueOf(R.mipmap.ic_health_level_medal05));
        map.put(16, Integer.valueOf(R.mipmap.ic_health_level_medal06));
        map.put(17, Integer.valueOf(R.mipmap.ic_health_level_medal06));
        map.put(18, Integer.valueOf(R.mipmap.ic_health_level_medal06));
        map.put(19, Integer.valueOf(R.mipmap.ic_health_level_medal07));
        map.put(20, Integer.valueOf(R.mipmap.ic_health_level_medal07));
    }

    public static void a(Map<Integer, Integer> map) {
        if (map == null) {
            return;
        }
        map.put(1, Integer.valueOf(R.mipmap.ic_lv1_off));
        map.put(2, Integer.valueOf(R.mipmap.ic_lv2_off));
        map.put(3, Integer.valueOf(R.mipmap.ic_lv3_off));
        map.put(4, Integer.valueOf(R.mipmap.ic_lv4_off));
        map.put(5, Integer.valueOf(R.mipmap.ic_lv5_off));
        map.put(6, Integer.valueOf(R.mipmap.ic_lv6_off));
        map.put(7, Integer.valueOf(R.mipmap.ic_lv7_off));
        map.put(8, Integer.valueOf(R.mipmap.ic_lv8_off));
        map.put(9, Integer.valueOf(R.mipmap.ic_lv9_off));
        map.put(10, Integer.valueOf(R.mipmap.ic_lv10_off));
        map.put(11, Integer.valueOf(R.mipmap.ic_lv11_off));
        map.put(12, Integer.valueOf(R.mipmap.ic_lv12_off));
        map.put(13, Integer.valueOf(R.mipmap.ic_lv13_off));
        map.put(14, Integer.valueOf(R.mipmap.ic_lv14_off));
        map.put(15, Integer.valueOf(R.mipmap.ic_lv15_off));
        map.put(16, Integer.valueOf(R.mipmap.ic_lv16_off));
        map.put(17, Integer.valueOf(R.mipmap.ic_lv17_off));
        map.put(18, Integer.valueOf(R.mipmap.ic_lv18_off));
        map.put(19, Integer.valueOf(R.mipmap.ic_lv19_off));
        map.put(20, Integer.valueOf(R.mipmap.ic_lv20_off));
    }

    public static void b(Map<Integer, Integer> map) {
        if (map == null) {
            return;
        }
        map.put(1, Integer.valueOf(R.string.IDS_plugin_achievement_msg_tip_level_one));
        map.put(2, Integer.valueOf(R.string.IDS_plugin_achievement_msg_tip_level_two));
        map.put(3, Integer.valueOf(R.string.IDS_plugin_achievement_msg_tip_l3));
        map.put(4, Integer.valueOf(R.string.IDS_plugin_achievement_msg_tip_l4));
        map.put(5, Integer.valueOf(R.string.IDS_plugin_achievement_msg_tip_l5));
        map.put(6, Integer.valueOf(R.string.IDS_plugin_achievement_level_value_6));
        map.put(7, Integer.valueOf(R.string.IDS_plugin_achievement_level_value_7));
        map.put(8, Integer.valueOf(R.string.IDS_plugin_achievement_level_value_8));
        map.put(9, Integer.valueOf(R.string.IDS_plugin_achievement_level_value_9));
        map.put(10, Integer.valueOf(R.string.IDS_plugin_achievement_level_value_10));
        map.put(11, Integer.valueOf(R.string.IDS_plugin_achievement_level_value_11));
        map.put(12, Integer.valueOf(R.string.IDS_plugin_achievement_level_value_12));
        map.put(13, Integer.valueOf(R.string.IDS_plugin_achievement_level_value_13));
        map.put(14, Integer.valueOf(R.string.IDS_plugin_achievement_level_value_14));
        map.put(15, Integer.valueOf(R.string.IDS_plugin_achievement_level_value_15));
        map.put(16, Integer.valueOf(R.string.IDS_plugin_achievement_level_value_16));
        map.put(17, Integer.valueOf(R.string.IDS_plugin_achievement_level_value_17));
        map.put(18, Integer.valueOf(R.string.IDS_plugin_achievement_level_value_18));
        map.put(19, Integer.valueOf(R.string.IDS_plugin_achievement_level_value_19));
        map.put(20, Integer.valueOf(R.string.IDS_plugin_achievement_level_value_20));
    }

    public static Map<Integer, String> b() {
        HashMap map = new HashMap(16);
        map.put(10050, BaseApplication.getContext().getResources().getString(R.string.IDS_level_label_run1));
        map.put(Integer.valueOf(PrebakedEffectId.RT_COIN_DROP), BaseApplication.getContext().getResources().getString(R.string.IDS_level_label_run2));
        map.put(10010, BaseApplication.getContext().getResources().getString(R.string.IDS_level_label_run3));
        map.put(20050, BaseApplication.getContext().getResources().getString(R.string.IDS_level_label_health1));
        map.put(20030, BaseApplication.getContext().getResources().getString(R.string.IDS_level_label_health1));
        map.put(20010, BaseApplication.getContext().getResources().getString(R.string.IDS_level_label_health1));
        map.put(30050, BaseApplication.getContext().getResources().getString(R.string.IDS_level_label_walk1));
        map.put(30030, BaseApplication.getContext().getResources().getString(R.string.IDS_level_label_walk2));
        map.put(30010, BaseApplication.getContext().getResources().getString(R.string.IDS_level_label_walk3));
        map.put(40050, BaseApplication.getContext().getResources().getString(R.string.IDS_level_label_fitness1));
        map.put(40030, BaseApplication.getContext().getResources().getString(R.string.IDS_level_label_fitness2));
        map.put(40010, BaseApplication.getContext().getResources().getString(R.string.IDS_level_label_fitness3));
        map.put(Integer.valueOf(HiHealthStatusCodes.HEALTH_RECORDS_NOT_EXIST), BaseApplication.getContext().getResources().getString(R.string.IDS_level_label_swim1));
        map.put(Integer.valueOf(HiHealthStatusCodes.NO_NETWORK), BaseApplication.getContext().getResources().getString(R.string.IDS_level_label_swim2));
        map.put(Integer.valueOf(HiHealthStatusCodes.APP_NOT_ENABLED_ERROR), BaseApplication.getContext().getResources().getString(R.string.IDS_level_label_swim3));
        map.put(Integer.valueOf(OrderStatusCode.ORDER_HWID_NOT_LOGIN), BaseApplication.getContext().getResources().getString(R.string.IDS_level_label_ride1));
        map.put(60030, BaseApplication.getContext().getResources().getString(R.string.IDS_level_label_ride2));
        map.put(60010, BaseApplication.getContext().getResources().getString(R.string.IDS_level_label_ride3));
        return map;
    }

    public static int f(int i) {
        if (i < 4) {
            return Color.parseColor("#2F2521");
        }
        if (i < 7) {
            return Color.parseColor("#2B1500");
        }
        if (i < 10) {
            return Color.parseColor("#1E0038");
        }
        if (i < 13) {
            return Color.parseColor("#001600");
        }
        if (i < 16) {
            return Color.parseColor("#000133");
        }
        if (i < 19) {
            return Color.parseColor("#2C0000");
        }
        return Color.parseColor("#100000");
    }

    public static int c(int i) {
        if (i < 1) {
            return 0;
        }
        if (i > 20) {
            return f45098b[19];
        }
        return f45098b[i - 1];
    }

    public static double e(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0.0d;
        }
        return par.e((((double) i) * 100.0d) / ((double) i2), par.c(i2 / (i * 100)));
    }

    public static int e(double d2) {
        return a(d(d2));
    }

    public static int a(int i) {
        for (int i2 = 0; i2 < 20; i2++) {
            if (i < f45098b[i2]) {
                return i2;
            }
        }
        return 20;
    }

    public static int n(int i) {
        switch (i) {
            case 1:
                return f45098b[3];
            case 2:
                return f45098b[6];
            case 3:
                return f45098b[9];
            case 4:
                return f45098b[12];
            case 5:
                return f45098b[15];
            case 6:
                return f45098b[18];
            case 7:
                return f45098b[19];
            default:
                return 0;
        }
    }

    public static List<LevelInfoDesc> d(int i, int i2, ArrayList<String> arrayList, List<String> list) {
        ArrayList arrayList2 = new ArrayList(10);
        arrayList2.add(d(1, a(i, i2, arrayList, 1), list));
        arrayList2.add(d(2, a(i, i2, arrayList, 2), list));
        arrayList2.add(d(3, a(i, i2, arrayList, 3), list));
        arrayList2.add(d(4, a(i, i2, arrayList, 4), list));
        arrayList2.add(d(5, a(i, i2, arrayList, 5), list));
        arrayList2.add(d(6, a(i, i2, arrayList, 6), list));
        arrayList2.add(d(7, a(i, i2, arrayList, 7), list));
        return arrayList2;
    }

    public static String d(int i) {
        switch (i) {
            case 1:
                return BaseApplication.getContext().getResources().getString(R.string.IDS_level_huo);
            case 2:
                return BaseApplication.getContext().getResources().getString(R.string.IDS_level_zi);
            case 3:
                return BaseApplication.getContext().getResources().getString(R.string.IDS_level_neng);
            case 4:
                return BaseApplication.getContext().getResources().getString(R.string.IDS_level_wang);
            case 5:
                return BaseApplication.getContext().getResources().getString(R.string.IDS_level_quan);
            case 6:
                return BaseApplication.getContext().getResources().getString(R.string.IDS_level_chuan);
            case 7:
                return BaseApplication.getContext().getResources().getString(R.string.IDS_level_dian);
            default:
                LogUtil.a("PLGACHIEVE_LevelUtil", "getLevelTitle: default");
                return BaseApplication.getContext().getResources().getString(R.string.IDS_level_huo);
        }
    }

    public static int b(int i) {
        int i2 = R.mipmap.ic_health_level_medal01;
        if (i >= 1) {
            int i3 = i - 1;
            Integer[] numArr = f45097a;
            if (i3 < numArr.length) {
                return numArr[i3].intValue();
            }
        }
        return i2;
    }

    public static int e(int i) {
        int i2 = R.mipmap.level_share_huo;
        if (i >= 1) {
            int i3 = i - 1;
            Integer[] numArr = d;
            if (i3 < numArr.length) {
                return numArr[i3].intValue();
            }
        }
        return i2;
    }

    public static String b(Context context, int i) {
        return context.getResources().getString(R.string.IDS_plugin_achievement_level_value_string, Integer.valueOf(i));
    }

    private static int o(int i) {
        int i2 = R.mipmap.level_lock_huo;
        if (i >= 1) {
            int i3 = i - 1;
            Integer[] numArr = e;
            if (i3 < numArr.length) {
                return numArr[i3].intValue();
            }
        }
        return i2;
    }

    private static int m(int i) {
        int i2;
        return (i < 1 || (i2 = i + (-1)) >= ozj.c().length) ? BaseApplication.getContext().getResources().getColor(R.color.level_bg_huo_color) : BaseApplication.getContext().getResources().getColor(ozj.c()[i2].intValue());
    }

    private static String a(int i, int i2, ArrayList<String> arrayList, int i3) {
        String strC = ltc.c(0.0d, 2, 0);
        int i4 = i3 + 1;
        if (njy.c(arrayList, i4)) {
            strC = arrayList.get(i4);
        }
        String strE = e(g(i), i3, i2);
        return i3 > g(i) ? BaseApplication.getContext().getResources().getString(R.string.IDS_level_lock_dec, strE) : BaseApplication.getContext().getResources().getString(R.string.IDS_level_dec, strC, strE);
    }

    public static String e(int i, int i2, int i3) {
        if (i2 < i) {
            return ltc.c(n(i2), 1, 0) + " / " + ltc.c(n(i2), 1, 0);
        }
        if (i2 == i) {
            return ltc.c(i3, 1, 0) + " / " + ltc.c(n(i2), 1, 0);
        }
        return " ≥ " + ltc.c(n(i2 - 1), 1, 0);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007e  */
    public static String b(int i, ArrayList<ozy> arrayList, int i2) {
        int iE;
        int iH = i;
        if (njy.e(arrayList)) {
            return "";
        }
        if (iH != h(i2) && iH != i(i2) && iH != j(i2)) {
            iH = h(i2);
        }
        double dA = 0.0d;
        double dA2 = 0.0d;
        for (ozy ozyVar : arrayList) {
            dA2 += (double) ozyVar.a();
            if (ozyVar.c() <= iH) {
                dA += (double) ozyVar.a();
            }
        }
        double d2 = (dA * 100.0d) / dA2;
        LogUtil.a("PLGACHIEVE_LevelUtil", "getSuperPercent num =", Double.valueOf(dA), " sum ", Double.valueOf(dA2), " percent ", Double.valueOf(d2));
        double d3 = 100.0d - d2;
        int i3 = (int) d3;
        if (i3 < 1) {
            if (d3 != 0.0d) {
                iE = par.e(d3);
            } else {
                iE = 0;
            }
        } else if (i3 < 10) {
            iE = 2;
        } else {
            iE = 0;
        }
        return ltc.c(d2, 2, iE);
    }

    private static LevelInfoDesc d(int i, String str, List<String> list) {
        LevelInfoDesc levelInfoDesc = new LevelInfoDesc();
        levelInfoDesc.setName(d(i));
        levelInfoDesc.setDescription(str);
        levelInfoDesc.setLabelList(list);
        levelInfoDesc.setBadgeImage(b(i));
        levelInfoDesc.setIcon(o(i));
        levelInfoDesc.setBackColor(m(i));
        return levelInfoDesc;
    }

    public static ArrayList<String> c(String str) {
        String[] strArrSplit;
        ArrayList<String> arrayList = new ArrayList<>(10);
        if (!TextUtils.isEmpty(str) && (strArrSplit = str.replace("[", "").replace("]", "").replace(" ", "").split(",")) != null && strArrSplit.length != 0) {
            Collections.addAll(arrayList, strArrSplit);
        }
        return arrayList;
    }

    public static boolean e() {
        String strE = osa.e(BaseApplication.getContext(), "levelTypeUpgraded");
        LogUtil.a("PLGACHIEVE_LevelUtil", "enter isHaveLevelUpgradeMsg(): levelUpgradeTime = ", strE);
        if (System.currentTimeMillis() - CommonUtil.m(BaseApplication.getContext(), strE) < 86400000) {
            return true;
        }
        boolean zB = SharedPreferenceManager.b(String.valueOf(20003), "new_level_first_use", true);
        LogUtil.a("PLGACHIEVE_LevelUtil", "enter isHaveLevelUpgradeMsg(): isFirstUse = ", Boolean.valueOf(zB));
        return zB;
    }

    public static void c(int i, int i2, long j, String str, boolean z) {
        LogUtil.a("PLGACHIEVE_LevelUtil", "doEventClickBi event ", Integer.valueOf(i), " level ", Integer.valueOf(i2), " duration ", Long.valueOf(j), " taskIdList ", str, " isHasNewUserTask ", Boolean.valueOf(z));
        HashMap map = new HashMap(8);
        map.put("click", 1);
        map.put("currentLevel", Integer.valueOf(i2));
        map.put("taskid", str);
        map.put("hasBeginnerTask", Boolean.valueOf(z));
        map.put("event", Integer.valueOf(i));
        map.put("duration", Long.valueOf(j));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.LEVEL_SHARE_1100070.value(), map, 0);
    }

    public static String a(ArrayList<ozs> arrayList, int i) {
        ozu ozuVarE;
        ArrayList arrayList2 = new ArrayList(10);
        if (njy.e(arrayList)) {
            LogUtil.j("PLGACHIEVE_LevelUtil", "getTaskId tasks is empty.");
            return arrayList2.toString();
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if ((i != 1 || i2 >= 3) && ((i != 0 || i2 < 3) && (ozuVarE = arrayList.get(i2).e()) != null)) {
                if (!pap.e(ozuVarE.k())) {
                    arrayList2.add(String.valueOf(ozuVarE.k()));
                } else if (pap.e(ozuVarE.k()) && oxi.a(ozuVarE.j()) < 2) {
                    arrayList2.add(String.valueOf(ozuVarE.k()));
                }
            }
        }
        LogUtil.a("PLGACHIEVE_LevelUtil", "getTaskId direction = ", Integer.valueOf(i), " taskIdList ", arrayList2.toString());
        return arrayList2.toString();
    }

    public static boolean d(ArrayList<ozs> arrayList) {
        if (njy.e(arrayList)) {
            LogUtil.j("PLGACHIEVE_LevelUtil", "isHasBeginnerTask tasks is empty.");
            return false;
        }
        Iterator<ozs> it = arrayList.iterator();
        while (it.hasNext()) {
            ozu ozuVarE = it.next().e();
            if (ozuVarE != null && pap.e(ozuVarE.k()) && oxi.a(ozuVarE.j()) < 2) {
                return true;
            }
        }
        return false;
    }
}
