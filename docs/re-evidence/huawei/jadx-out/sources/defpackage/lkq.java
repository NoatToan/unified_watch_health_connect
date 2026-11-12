package defpackage;

import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.data.type.HiHealthDataType;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class lkq {
    public static void b(HiDataReadOption hiDataReadOption) throws lks {
        if (hiDataReadOption == null) {
            throw new lks("HiDataReadOption is null");
        }
        c(hiDataReadOption.getType());
        c(hiDataReadOption.getAlignType());
        e(hiDataReadOption);
        int readType = hiDataReadOption.getReadType();
        if ((readType == 2 || readType == 3) && hiDataReadOption.getDeviceUuid() == null) {
            throw new lks("readType is " + readType + " but deviceUUID is null");
        }
    }

    private static void e(HiDataReadOption hiDataReadOption) throws lks {
        long startTime = hiDataReadOption.getStartTime();
        long endTime = hiDataReadOption.getEndTime();
        if (startTime < 0) {
            ReleaseLogUtil.e("HiH_HiDataReadValid", "startTime cannot be less than 0");
        }
        if (startTime > endTime) {
            throw new lks("startTime > endTime");
        }
        long modifiedStartTime = hiDataReadOption.getModifiedStartTime();
        long modifiedEndTime = hiDataReadOption.getModifiedEndTime();
        if (modifiedStartTime < 0) {
            throw new lks("modifiedStartTime cannot be less than 0");
        }
        if (modifiedStartTime > modifiedEndTime) {
            throw new lks("modifiedStartTime > modifiedEndTime");
        }
        if (modifiedEndTime <= 0 || hiDataReadOption.getEndTime() > 0) {
            return;
        }
        hiDataReadOption.setStartTime(0L);
        hiDataReadOption.setEndTime(Long.MAX_VALUE);
    }

    private static void c(int[] iArr) throws lks {
        if (iArr == null || iArr.length <= 0) {
            throw new lks("types is null");
        }
        for (int i : iArr) {
            switch (AnonymousClass4.f40373a[HiHealthDataType.d(i).ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    throw new lks("Unknown data type: " + i);
            }
        }
    }

    /* JADX INFO: renamed from: lkq$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40373a;

        static {
            int[] iArr = new int[HiHealthDataType.Category.values().length];
            f40373a = iArr;
            try {
                iArr[HiHealthDataType.Category.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40373a[HiHealthDataType.Category.SEQUENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40373a[HiHealthDataType.Category.SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40373a[HiHealthDataType.Category.STAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40373a[HiHealthDataType.Category.SESSION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f40373a[HiHealthDataType.Category.REALTIME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f40373a[HiHealthDataType.Category.CONFIG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f40373a[HiHealthDataType.Category.CONFIGSTAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f40373a[HiHealthDataType.Category.CHECK_DWONLOAD.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f40373a[HiHealthDataType.Category.BUSINESS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private static void c(int i) throws lks {
        if (i <= 0 || i == 20001) {
            return;
        }
        throw new lks("alignType is error" + i);
    }
}
