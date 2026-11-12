package com.huawei.hihealth.data.type;

import android.content.Context;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.model.HiHealthDictType;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hms.hihealth.HiHealthStatusCodes;

/* JADX INFO: loaded from: classes2.dex */
public class HiSubscribeType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f12259a = DicDataTypeUtil.DataType.WEIGHT_BODYFAT_BROAD.value();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f12261c = DicDataTypeUtil.DataType.BLOOD_PRESSURE_SET.value();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f12260b = DicDataTypeUtil.DataType.BLOODGLUCOSE_BLOODSUGAR.value();
    public static final int e = DicDataTypeUtil.DataType.CONTINUE_BLOODSUGAR_SET.value();

    public static boolean b(int i) {
        return i > 0;
    }

    private static int g(int i) {
        if (i <= 21000) {
            return 1;
        }
        if (i <= 22099) {
            return 2;
        }
        return i <= 22199 ? 3 : 0;
    }

    /* JADX INFO: renamed from: com.huawei.hihealth.data.type.HiSubscribeType$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f12262c;

        static {
            int[] iArr = new int[HiHealthDataType.Category.values().length];
            f12262c = iArr;
            try {
                iArr[HiHealthDataType.Category.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12262c[HiHealthDataType.Category.SET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12262c[HiHealthDataType.Category.SESSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12262c[HiHealthDataType.Category.SEQUENCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12262c[HiHealthDataType.Category.REALTIME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12262c[HiHealthDataType.Category.STAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static int d(int i) {
        switch (AnonymousClass1.f12262c[HiHealthDataType.d(i).ordinal()]) {
            case 1:
                return a(i);
            case 2:
                return j(i);
            case 3:
                return g(i);
            case 4:
                return e(i);
            case 5:
                return c(i);
            case 6:
                return h(i);
            default:
                return 0;
        }
    }

    private static int a(int i) {
        HiHealthDictType hiHealthDictTypeI;
        if (i < 1000) {
            return 1;
        }
        if (i == 2002) {
            return 5;
        }
        if (i == 2003) {
            return 11;
        }
        if (i == 2005) {
            return 12;
        }
        if (i == 2103) {
            return 18;
        }
        if (i != 2106) {
            switch (i) {
                case 2008:
                case 2009:
                case 2010:
                case 2011:
                case 2012:
                case 2013:
                case 2014:
                case 2015:
                    break;
                case 2016:
                case 2017:
                    return 12;
                case 2018:
                    return 6;
                default:
                    switch (i) {
                        case 2034:
                        case 2035:
                        case 2036:
                        case 2037:
                            return 14;
                        default:
                            if (HiHealthDictManager.a((Context) null).e(i) != 0 || (hiHealthDictTypeI = HiHealthDictManager.a((Context) null).i(i)) == null) {
                                return 0;
                            }
                            return hiHealthDictTypeI.l();
                    }
            }
        }
        return f12260b;
    }

    private static int j(int i) {
        if (i == 10006) {
            return f12259a;
        }
        if (i == 10010) {
            return 23;
        }
        switch (i) {
            case 10001:
                return f12260b;
            case 10002:
                return f12261c;
            case 10003:
                return 12;
            default:
                if (HiHealthDictManager.a((Context) null).a(i) != null) {
                    return i;
                }
                return 0;
        }
    }

    private static int e(int i) {
        if (i <= 30999) {
            return 4;
        }
        if (HiHealthDictManager.a((Context) null).k(i)) {
            return i;
        }
        return 0;
    }

    private static int c(int i) {
        if (i == 50001) {
            return 13;
        }
        if (i == 300001) {
            return 15;
        }
        switch (i) {
            case HiHealthStatusCodes.NOT_EXIST_DATA_TYPE_ERROR /* 50003 */:
                return 16;
            case HiHealthStatusCodes.APP_MISMATCH_ERROR /* 50004 */:
                return 17;
            case HiHealthStatusCodes.UNKNOWN_AUTH_ERROR /* 50005 */:
                return 19;
            case HiHealthStatusCodes.NO_BLE_PERMISSION_ERROR /* 50006 */:
                return 20;
            case HiHealthStatusCodes.UNSUPPORTED_PLATFORM_ERROR /* 50007 */:
                return 22;
            case HiHealthStatusCodes.TRY_AGAIN_ERROR /* 50008 */:
                return 24;
            case HiHealthStatusCodes.ACTIVITY_RECORD_ENDED_ERROR /* 50009 */:
                return 25;
            case HiHealthStatusCodes.APP_NOT_ENABLED_ERROR /* 50010 */:
                return 26;
            case HiHealthStatusCodes.API_EXCEPTION_ERROR /* 50011 */:
                return 27;
            case HiHealthStatusCodes.POLYMERIZED_NOT_SUPPORTED_ERROR /* 50012 */:
                return 28;
            case HiHealthStatusCodes.UNSUPPORTED_ACCOUNT_ERROR /* 50013 */:
                return 29;
            case HiHealthStatusCodes.BLUETOOTH_FORBIDDEN_ERROR /* 50014 */:
                return 30;
            case HiHealthStatusCodes.MISMATCH_PACKAGE_NAME_ERROR /* 50015 */:
                return 31;
            case 50016:
                return 32;
            case 50017:
                return 33;
            case HiHealthStatusCodes.NONEXISTENT_DATA_COLLECTOR_ERROR /* 50018 */:
                return 34;
            case HiHealthStatusCodes.SAMPLE_SET_TIMESTAMP_ERROR /* 50019 */:
                return 35;
            default:
                if (HiHealthDictManager.a((Context) null).a(i) != null) {
                    return i;
                }
                return 0;
        }
    }

    private static int h(int i) {
        HiHealthDictType hiHealthDictTypeG;
        if (i <= 41000) {
            return 1;
        }
        if (i <= 43900) {
            return 4;
        }
        if (i <= 44099) {
            return 2;
        }
        if (i <= 44299) {
            return 3;
        }
        if (i <= 46010 || i <= 47000) {
            return 5;
        }
        if (i > 47200 && i <= 47299) {
            return 18;
        }
        if (HiHealthDictManager.a((Context) null).e(i) != 2 || (hiHealthDictTypeG = HiHealthDictManager.a((Context) null).g(i)) == null) {
            return 0;
        }
        return hiHealthDictTypeG.l();
    }
}
