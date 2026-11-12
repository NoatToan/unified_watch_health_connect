package defpackage;

import android.text.TextUtils;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiSportStatDataAggregateOption;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hwcommonmodel.application.BaseApplication;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public class lkm {
    public static void b(HiAggregateOption hiAggregateOption) throws lks {
        e(hiAggregateOption);
        b(hiAggregateOption.getStartTime(), hiAggregateOption.getEndTime());
        c(hiAggregateOption.getFilterStartTime(), hiAggregateOption.getFilterEndTime());
        int[] type = hiAggregateOption.getType();
        String[] constantsKey = hiAggregateOption.getConstantsKey();
        d(type);
        if (!c(type)) {
            throw new lks("HiAggregateOption types is not all sensitive or normal");
        }
        b(constantsKey);
        e(type.length, constantsKey.length);
        c(hiAggregateOption);
        int alignType = hiAggregateOption.getAlignType();
        e(alignType);
        HiHealthDataType.Category categoryD = HiHealthDataType.d(type[0]);
        a(categoryD, type);
        e(categoryD, hiAggregateOption.getAggregateType(), alignType);
        a(hiAggregateOption);
        b(hiAggregateOption.getEndTime() - hiAggregateOption.getStartTime(), hiAggregateOption.getGroupUnitType());
        a(hiAggregateOption.getAggregateType());
    }

    private static void a(HiAggregateOption hiAggregateOption) throws lks {
        long modifiedStartTime = hiAggregateOption.getModifiedStartTime();
        long modifiedEndTime = hiAggregateOption.getModifiedEndTime();
        if (modifiedStartTime < 0) {
            throw new lks("HiAggregateOption modifiedStartTime cannot be less than 0");
        }
        if (modifiedStartTime > modifiedEndTime) {
            throw new lks("modifiedStartTime > modifiedEndTime");
        }
        if (modifiedEndTime <= 0 || hiAggregateOption.getEndTime() > 0) {
            return;
        }
        hiAggregateOption.setStartTime(0L);
        hiAggregateOption.setEndTime(Long.MAX_VALUE);
    }

    public static void c(HiSportStatDataAggregateOption hiSportStatDataAggregateOption) throws lks {
        b(hiSportStatDataAggregateOption);
        long startTime = hiSportStatDataAggregateOption.getStartTime();
        long endTime = hiSportStatDataAggregateOption.getEndTime();
        b(startTime, endTime);
        int[] type = hiSportStatDataAggregateOption.getType();
        String[] constantsKey = hiSportStatDataAggregateOption.getConstantsKey();
        d(type);
        if (!c(type)) {
            throw new lks("HiAggregateOption types is not all sensitive or normal");
        }
        b(constantsKey);
        e(type.length, constantsKey.length);
        e(hiSportStatDataAggregateOption);
        e(hiSportStatDataAggregateOption.getAlignType());
        b(endTime - startTime, hiSportStatDataAggregateOption.getGroupUnitType());
        a(hiSportStatDataAggregateOption.getAggregateType());
    }

    private static boolean c(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return true;
        }
        boolean zI = ljq.i(BaseApplication.getContext(), iArr[0]);
        for (int i : iArr) {
            if (ljq.i(BaseApplication.getContext(), i) != zI) {
                return false;
            }
        }
        return true;
    }

    private static void e(HiAggregateOption hiAggregateOption) throws lks {
        if (hiAggregateOption == null) {
            throw new lks("HiAggregateOption is null");
        }
    }

    private static void b(HiSportStatDataAggregateOption hiSportStatDataAggregateOption) throws lks {
        if (hiSportStatDataAggregateOption == null) {
            throw new lks("HiSportStatDataAggregateOption is null");
        }
    }

    private static void b(long j, long j2) throws lks {
        if (j < 0) {
            ReleaseLogUtil.e("HiH_HiDateAggregateValid", "HiAggregateOption startTime cannot be less than 0");
        }
        if (j > j2) {
            throw new lks("HiAggregateOption startTime is bigger than endTime");
        }
    }

    private static void c(String str, String str2) throws lks {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return;
        }
        if (str.length() != 8 || str2.length() != 8) {
            throw new lks("filterTime length error");
        }
        Pattern patternCompile = Pattern.compile("([0-1][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])");
        if (!patternCompile.matcher(str).matches() || !patternCompile.matcher(str2).matches()) {
            throw new lks("filterTime Format error");
        }
    }

    private static void d(int[] iArr) throws lks {
        if (iArr == null || iArr.length <= 0) {
            throw new lks("HiAggregateOption types is null");
        }
    }

    private static void b(String[] strArr) throws lks {
        if (strArr == null || strArr.length <= 0) {
            throw new lks("HiAggregateOption constantsKey is null");
        }
    }

    private static void e(int i, int i2) throws lks {
        if (i != i2) {
            throw new lks("HiAggregateOption constantsKey length not equal types length");
        }
    }

    private static void e(String str) throws lks {
        if (str == null || str.isEmpty()) {
            throw new lks("HiAggregateOption readType is READ_USER_DEVICE deviceUuid should be not null");
        }
    }

    private static void c(HiAggregateOption hiAggregateOption) throws lks {
        int readType = hiAggregateOption.getReadType();
        if (readType == 0 || readType == 1) {
            return;
        }
        if (readType == 2 || readType == 3) {
            e(hiAggregateOption.getDeviceUuid());
            return;
        }
        throw new lks("HiAggregateOption readType is out of rang");
    }

    private static void e(HiSportStatDataAggregateOption hiSportStatDataAggregateOption) throws lks {
        int readType = hiSportStatDataAggregateOption.getReadType();
        if (readType == 0 || readType == 1) {
            return;
        }
        if (readType == 2) {
            e(hiSportStatDataAggregateOption.getDeviceUuid());
            return;
        }
        throw new lks("HiSportStatDataAggregateOption readType is out of rang");
    }

    private static void e(int i) throws lks {
        if (i > 0 && HiHealthDataType.d(i) != HiHealthDataType.Category.SESSION) {
            throw new lks("HiAggregateOption alignType is not SESSION");
        }
    }

    private static void a(HiHealthDataType.Category category, int[] iArr) throws lks {
        for (int i : iArr) {
            if (category != HiHealthDataType.d(i)) {
                throw new lks("HiAggregateOption types is not same category");
            }
        }
    }

    /* JADX INFO: renamed from: lkm$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[HiHealthDataType.Category.values().length];
            d = iArr;
            try {
                iArr[HiHealthDataType.Category.SESSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[HiHealthDataType.Category.POINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[HiHealthDataType.Category.SEQUENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[HiHealthDataType.Category.STAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[HiHealthDataType.Category.SET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private static void e(HiHealthDataType.Category category, int i, int i2) throws lks {
        int i3 = AnonymousClass4.d[category.ordinal()];
        if (i3 == 1) {
            if (i2 > 0) {
                throw new lks("HiAggregateOption types is SESSION alignType should equal O");
            }
            if (i != 1 && i != 6) {
                throw new lks("HiAggregateOption types is SESSION aggregateType should be SUM or CLUSTER_COUNT");
            }
            return;
        }
        if (i3 != 2) {
            if (i3 == 3) {
                if (i2 > 0) {
                    throw new lks("HiAggregateOption types is SEQUENCE alignType should equal O");
                }
                if (i != 2) {
                    throw new lks("HiAggregateOption types is SEQUENCE aggregateType should be SUM");
                }
                return;
            }
            if (i3 != 4) {
                if (i3 != 5) {
                    throw new lks("HiAggregateOption types is out of rang ");
                }
            } else if (i2 > 0) {
                throw new lks("HiAggregateOption types is STAT alignType should equal O");
            }
        }
    }

    private static void b(long j, int i) throws lks {
        switch (i) {
            case 0:
            case 7:
                return;
            case 1:
            case 2:
                a(j);
                return;
            case 3:
                e(j);
                return;
            case 4:
                d(j);
                return;
            case 5:
                c(j);
                return;
            case 6:
                b(j);
                return;
            default:
                throw new lks("HiAggregateOption groupUnitType is out of rang ");
        }
    }

    private static void a(long j) throws lks {
        if (j > 90000000) {
            throw new lks("HiAggregateOption groupUnitType is MINUTE or HOUR endTime - startTime should < one day");
        }
    }

    private static void e(long j) throws lks {
        if (j < 82740000) {
            throw new lks("HiAggregateOption groupUnitType is DAY endTime - startTime should >= one day");
        }
    }

    private static void d(long j) throws lks {
        if (j < 601140000) {
            throw new lks("HiAggregateOption groupUnitType is WEEK endTime - startTime should >= one week");
        }
    }

    private static void c(long j) throws lks {
        if (j < 2415540000L) {
            throw new lks("HiAggregateOption groupUnitType is MONTH endTime - startTime should >= one month");
        }
    }

    private static void b(long j) throws lks {
        if (j < 31532340000L) {
            throw new lks("HiAggregateOption groupUnitType is YEAR endTime - startTime should >= one year");
        }
    }

    private static void a(int i) throws lks {
        if (i < 0 || i > 7) {
            throw new lks("HiAggregateOption aggregateType has input a invalid type");
        }
    }
}
