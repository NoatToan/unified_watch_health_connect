package defpackage;

import android.content.Context;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.type.HiConfigDataType;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwcloudmodel.agreement.AgrConstant;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.CreativeType;
import health.compact.a.CommonUtil;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lke {
    public static int c(int i) {
        if (i == 14) {
            return 20014;
        }
        switch (i) {
            case 1:
            case 2:
                return 20004;
            case 3:
                return 20005;
            case 4:
                return 20003;
            case 5:
                return 20002;
            case 6:
                return 22001;
            case 7:
                return 22002;
            case 8:
                return 22003;
            case 9:
                return 20007;
            case 10:
                return 20010;
            default:
                return 0;
        }
    }

    public static int e(int i) {
        if (i == 20007) {
            return 9;
        }
        if (i == 20010) {
            return 10;
        }
        if (i == 20014) {
            return 14;
        }
        switch (i) {
            case 20002:
                return 5;
            case 20003:
                return 4;
            case 20004:
                return 2;
            case 20005:
                return 3;
            default:
                switch (i) {
                    case 22001:
                        return 6;
                    case 22002:
                        return 7;
                    case 22003:
                        return 8;
                    default:
                        return 0;
                }
        }
    }

    public static boolean e(List<HiHealthData> list) {
        if (list == null) {
            return false;
        }
        Iterator<HiHealthData> it = list.iterator();
        while (it.hasNext()) {
            int type = it.next().getType();
            boolean z = type >= 20001 && type <= 21000;
            boolean z2 = type > 40001 && type < 41000;
            if (z || z2) {
                return true;
            }
        }
        return false;
    }

    public static int a(int i) {
        if (i == 271) {
            return AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
        }
        if (i == 273) {
            return 111;
        }
        if (i == 274) {
            return 112;
        }
        if (i == 279) {
            return 117;
        }
        if (i == 280) {
            return AgrConstant.HEALTH_AGREEMENT_CODE;
        }
        switch (i) {
            case 257:
                return 5;
            case 258:
                return 4;
            case 259:
                return 3;
            case 260:
                return 2;
            case 261:
                return 1;
            case 262:
                return 102;
            default:
                switch (i) {
                    case 264:
                        return 101;
                    case OldToNewMotionPath.SPORT_TYPE_INDOOR_BIKE /* 265 */:
                        return 103;
                    case OldToNewMotionPath.SPORT_TYPE_OPEN_AREA_SWIM /* 266 */:
                        return 104;
                    default:
                        return f(i);
                }
        }
    }

    private static int f(int i) {
        if (i == 133) {
            return 110;
        }
        if (i == 270) {
            return 108;
        }
        if (i == 275) {
            return CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON;
        }
        if (i == 283) {
            return 283;
        }
        switch (i) {
            case 128:
                return 105;
            case 129:
                return 106;
            case 130:
                return 107;
            default:
                switch (i) {
                    case 137:
                        return 114;
                    case 138:
                        return 115;
                    case 139:
                        return AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID;
                    default:
                        switch (i) {
                            case 217:
                                return 217;
                            case 218:
                                return 218;
                            case 219:
                                return 219;
                            case HeartRateThresholdConfig.HEART_RATE_LIMIT /* 220 */:
                                return HeartRateThresholdConfig.HEART_RATE_LIMIT;
                            default:
                                LogUtil.j("Debug_HiTypeUtil", "getCloudTrackSportType do not has this type yet , localType is ", Integer.valueOf(i));
                                return i;
                        }
                }
        }
    }

    public static int b(int i) {
        if (i == 1) {
            return 261;
        }
        if (i == 2) {
            return 260;
        }
        if (i == 3) {
            return 259;
        }
        if (i == 4) {
            return 258;
        }
        if (i == 5) {
            return 257;
        }
        if (i == 109) {
            return OldToNewMotionPath.SPORT_TYPE_BASKETBALL;
        }
        if (i == 111) {
            return OldToNewMotionPath.SPORT_TYPE_CROSS_TRAINER;
        }
        if (i == 112) {
            return OldToNewMotionPath.SPORT_TYPE_ROW_MACHINE;
        }
        if (i == 117) {
            return OldToNewMotionPath.SPORT_TYPE_OTHER_SPORT;
        }
        if (i == 118) {
            return OldToNewMotionPath.SPORT_TYPE_CROSS_COUNTRY_RACE;
        }
        switch (i) {
            case 101:
                return 264;
            case 102:
                return 262;
            case 103:
                return OldToNewMotionPath.SPORT_TYPE_INDOOR_BIKE;
            case 104:
                return OldToNewMotionPath.SPORT_TYPE_OPEN_AREA_SWIM;
            default:
                return h(i);
        }
    }

    private static int h(int i) {
        if (i == 110) {
            return OldToNewMotionPath.SPORT_TYPE_VOLLEYBALL;
        }
        if (i == 283) {
            return 283;
        }
        switch (i) {
            case 105:
                return 128;
            case 106:
                return 129;
            case 107:
                return 130;
            case 108:
                return 270;
            default:
                switch (i) {
                    case CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON /* 113 */:
                        return OldToNewMotionPath.SPORT_TYPE_TREAD_MACHINE;
                    case 114:
                        return 137;
                    case 115:
                        return 138;
                    case AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID /* 116 */:
                        return 139;
                    default:
                        switch (i) {
                            case 217:
                                return 217;
                            case 218:
                                return 218;
                            case 219:
                                return 219;
                            case HeartRateThresholdConfig.HEART_RATE_LIMIT /* 220 */:
                                return HeartRateThresholdConfig.HEART_RATE_LIMIT;
                            default:
                                LogUtil.j("Debug_HiTypeUtil", "getLocalTrackSportType do not has this type yet , cloudType is ", Integer.valueOf(i));
                                return i;
                        }
                }
        }
    }

    public static String d(int i) {
        if (i == 0) {
            return "config_data";
        }
        if (i == 1) {
            return "sample_point";
        }
        if (i == 2) {
            return "sample_point_health";
        }
        if (i != 3) {
            return null;
        }
        return "config_stat_day";
    }

    public static Map<String, Map<String, LinkedHashSet<Integer>>> d(List<Integer> list, Context context) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Integer num : list) {
            d dVarC = c(num, HiHealthDataType.d(num.intValue()), context);
            String strB = dVarC.b();
            String strC = dVarC.c();
            Map map = (Map) linkedHashMap.getOrDefault(strB, new LinkedHashMap());
            LinkedHashSet linkedHashSet = (LinkedHashSet) map.getOrDefault(strC, new LinkedHashSet());
            linkedHashSet.add(num);
            map.put(strC, linkedHashSet);
            linkedHashMap.put(strB, map);
        }
        return linkedHashMap;
    }

    static class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f40364c;
        private String d;

        private d() {
            this.f40364c = "hihealth_003.db";
            this.d = "unknow";
        }

        /* synthetic */ d(AnonymousClass2 anonymousClass2) {
            this();
        }

        public String b() {
            return this.f40364c;
        }

        public void c(String str) {
            this.f40364c = str;
        }

        public String c() {
            return this.d;
        }

        public void e(String str) {
            this.d = str;
        }
    }

    /* JADX INFO: renamed from: lke$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[HiHealthDataType.Category.values().length];
            d = iArr;
            try {
                iArr[HiHealthDataType.Category.STAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[HiHealthDataType.Category.POINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[HiHealthDataType.Category.SESSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[HiHealthDataType.Category.SEQUENCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[HiHealthDataType.Category.BUSINESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d[HiHealthDataType.Category.REALTIME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                d[HiHealthDataType.Category.CONFIG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                d[HiHealthDataType.Category.CONFIGSTAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private static d c(Integer num, HiHealthDataType.Category category, Context context) {
        d dVar = new d(null);
        int i = AnonymousClass2.d[category.ordinal()];
        if (i == 1) {
            if ((ljq.d(context, num.intValue()) instanceof kwz) && CommonUtil.av()) {
                dVar.c("hihealth_sensitive.db");
            }
            dVar.e("hihealth_stat_day");
            return dVar;
        }
        if (i == 2) {
            if (HiHealthDictManager.a(context).e(num.intValue()) == 0) {
                if (ljq.i(context, num.intValue()) && CommonUtil.av()) {
                    dVar.c("hihealth_sensitive.db");
                }
                dVar.e("sample_point_health");
                return dVar;
            }
            if (num.intValue() < 2000) {
                dVar.e("sample_point");
                return dVar;
            }
            if (HiHealthDataType.f(num.intValue())) {
                if (ljq.i(context, num.intValue()) && CommonUtil.av()) {
                    dVar.c("hihealth_sensitive.db");
                }
                dVar.e("sample_point_health");
                return dVar;
            }
            if (HiHealthDataType.t(num.intValue())) {
                dVar.e("sample_point_health_stress");
            }
            return dVar;
        }
        return b(num, category, context);
    }

    private static d b(Integer num, HiHealthDataType.Category category, Context context) {
        d dVar = new d(null);
        int i = AnonymousClass2.d[category.ordinal()];
        if (i == 3) {
            if (num.intValue() <= 21000) {
                dVar.e("sample_session");
                return dVar;
            }
            if (num.intValue() <= 22099) {
                dVar.e("sample_session_health");
                return dVar;
            }
            dVar.e("sample_session_core");
            return dVar;
        }
        if (i == 4) {
            dVar.e("sample_sequence");
            return dVar;
        }
        if (i == 5) {
            dVar.e("business_data");
            return dVar;
        }
        if (i == 6) {
            dVar.e("real_time_health");
            return dVar;
        }
        return e(num, category, context);
    }

    private static d e(Integer num, HiHealthDataType.Category category, Context context) {
        String strD;
        String strD2;
        d dVar = new d(null);
        int i = AnonymousClass2.d[category.ordinal()];
        if (i != 7) {
            if (i == 8) {
                if (HiConfigDataType.i(num.intValue())) {
                    Object objC = HiConfigDataType.c(HiConfigDataType.c(num.intValue()).intValue(), 7);
                    if ((objC instanceof Integer) && (strD2 = d(((Integer) objC).intValue())) != null) {
                        dVar.e(strD2);
                        return dVar;
                    }
                }
            } else {
                dVar.c("unknow");
                dVar.e("unknow");
                return dVar;
            }
        } else if (HiConfigDataType.f(num.intValue())) {
            Object objC2 = HiConfigDataType.c(HiConfigDataType.a(num.intValue()).intValue(), 1);
            if ((objC2 instanceof Integer) && (strD = d(((Integer) objC2).intValue())) != null) {
                dVar.e(strD);
            }
        }
        return dVar;
    }
}
