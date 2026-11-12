package defpackage;

import android.os.Parcel;
import android.util.Log;
import com.huawei.hihealth.HiHealthKitData;
import com.huawei.hihealth.device.HiHealthDeviceInfo;
import com.huawei.hihealthkit.data.type.HiHealthDataType;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ksv {
    public static boolean c(List list) {
        if (list == null) {
            return false;
        }
        int iB = b(list);
        Log.i("HiHealthKitCommonUtil", "dataList size = " + list.size() + ", parcelSize = " + iB);
        return iB >= 524288;
    }

    public static int b(List list) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeList(list);
        int iDataSize = parcelObtain.dataSize();
        parcelObtain.recycle();
        return iDataSize;
    }

    public static HiHealthKitData e(krl krlVar, HiHealthDataType.Category category) {
        HiHealthKitData hiHealthKitData = new HiHealthKitData();
        hiHealthKitData.setContentValues(krlVar.getValueHolder());
        hiHealthKitData.setStartTime(krlVar.getStartTime());
        hiHealthKitData.setEndTime(krlVar.getEndTime());
        hiHealthKitData.setUpdateTime(krlVar.getUpdateTime());
        hiHealthKitData.setType(krlVar.getType());
        hiHealthKitData.putString("metadata", krlVar.getMetaData());
        HiHealthDeviceInfo sourceDevice = krlVar.getSourceDevice();
        if (sourceDevice != null) {
            hiHealthKitData.putString("device_uniquecode", sourceDevice.getDeviceUniqueCode());
            hiHealthKitData.putString("device_name", sourceDevice.getDeviceName());
            hiHealthKitData.putString("device_model", sourceDevice.getDeviceModel());
            hiHealthKitData.putString("deviceType", sourceDevice.getDeviceType());
        }
        c(krlVar, hiHealthKitData, category);
        return hiHealthKitData;
    }

    /* JADX INFO: renamed from: ksv$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[HiHealthDataType.Category.values().length];
            d = iArr;
            try {
                iArr[HiHealthDataType.Category.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[HiHealthDataType.Category.STAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[HiHealthDataType.Category.REALTIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[HiHealthDataType.Category.SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[HiHealthDataType.Category.SEQUENCE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d[HiHealthDataType.Category.BUSINESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                d[HiHealthDataType.Category.SESSION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static void c(krl krlVar, HiHealthKitData hiHealthKitData, HiHealthDataType.Category category) {
        try {
            switch (AnonymousClass4.d[category.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    krp krpVar = (krp) krlVar;
                    if (kss.a(krpVar.getType())) {
                        hiHealthKitData.setDoubleValue(Double.valueOf(krpVar.getDoubleValue()));
                    } else {
                        hiHealthKitData.setValue(krpVar.getValue());
                    }
                    break;
                case 4:
                case 5:
                case 6:
                    if (!(krlVar instanceof krq)) {
                        Log.w("HiHealthKitCommonUtil", "wrong data type for set data");
                    } else {
                        hiHealthKitData.setMap(((krq) krlVar).getMap());
                    }
                    break;
                case 7:
                    Log.i("HiHealthKitCommonUtil", "nothing to do");
                    break;
                default:
                    Log.w("HiHealthKitCommonUtil", "wrong data type");
                    break;
            }
        } catch (ClassCastException unused) {
            Log.w("HiHealthKitCommonUtil", "class cast exception");
        }
    }
}
