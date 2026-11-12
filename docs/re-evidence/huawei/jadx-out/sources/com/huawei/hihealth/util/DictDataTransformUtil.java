package com.huawei.hihealth.util;

import android.text.TextUtils;
import android.util.Log;
import com.huawei.hihealth.HiHealthKitData;
import com.huawei.hihealth.device.HiHealthDeviceInfo;
import com.huawei.hihealth.error.HiHealthError;
import com.huawei.hihealth.listener.IuniversalCallback;
import com.huawei.hihealthkit.data.type.HiHealthDataType;
import defpackage.krl;
import defpackage.krm;
import defpackage.krp;
import defpackage.krq;
import defpackage.krr;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class DictDataTransformUtil {
    private DictDataTransformUtil() {
    }

    public static void c(HiHealthDataType.Category category, List list, List list2) {
        Log.i("DictDataTransformUtil", "dealHiHealKitDicData hiHealthKitData size = " + list.size());
        for (Object obj : list) {
            if (obj instanceof HiHealthKitData) {
                HiHealthKitData hiHealthKitData = (HiHealthKitData) obj;
                int i = AnonymousClass1.f12331a[category.ordinal()];
                if (i == 1) {
                    a(hiHealthKitData, list2);
                } else if (i == 2) {
                    b(hiHealthKitData, list2);
                } else if (i == 3) {
                    c(hiHealthKitData, list2);
                } else if (i == 4) {
                    e(hiHealthKitData, list2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hihealth.util.DictDataTransformUtil$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12331a;

        static {
            int[] iArr = new int[HiHealthDataType.Category.values().length];
            f12331a = iArr;
            try {
                iArr[HiHealthDataType.Category.SEQUENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12331a[HiHealthDataType.Category.POINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12331a[HiHealthDataType.Category.SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12331a[HiHealthDataType.Category.SESSION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static void a(HiHealthKitData hiHealthKitData, List list) {
        String strC;
        krm krmVar = new krm();
        b(hiHealthKitData, krmVar);
        try {
            strC = com.huawei.hihealth.HiZipUtil.c(krmVar.getSequenceData());
        } catch (IOException unused) {
            Log.w("DictDataTransformUtil", "uncompress detail data error");
            strC = null;
        }
        krmVar.setSequenceData(strC);
        list.add(krmVar);
    }

    private static void b(HiHealthKitData hiHealthKitData, List list) {
        krp krpVar = new krp();
        b(hiHealthKitData, krpVar);
        list.add(krpVar);
    }

    private static void c(HiHealthKitData hiHealthKitData, List list) {
        krq krqVar = new krq();
        b(hiHealthKitData, krqVar);
        list.add(krqVar);
    }

    private static void e(HiHealthKitData hiHealthKitData, List list) {
        krr krrVar = new krr();
        b(hiHealthKitData, krrVar);
        list.add(krrVar);
    }

    public static void d(int i, int i2, List list, IuniversalCallback iuniversalCallback) {
        if (i2 == 2) {
            if (i != 0) {
                iuniversalCallback.onResultHandler(i, null, HiHealthError.e(i));
            } else if (list.size() == 0) {
                iuniversalCallback.onResultHandler(i, Collections.EMPTY_LIST, HiHealthError.e(i));
            } else {
                iuniversalCallback.onResultHandler(i, list, HiHealthError.e(i));
            }
        }
    }

    private static void b(HiHealthKitData hiHealthKitData, krl krlVar) {
        krlVar.setType(hiHealthKitData.getType());
        krlVar.setStartTime(hiHealthKitData.getStartTime());
        krlVar.setEndTime(hiHealthKitData.getEndTime());
        krlVar.setValueHolder(hiHealthKitData.getContentValue());
        String string = hiHealthKitData.getString("device_uniquecode");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        krlVar.setSourceDevice(new HiHealthDeviceInfo(string, hiHealthKitData.getString("device_name"), hiHealthKitData.getString("device_model")));
        krlVar.setUpdateTime(hiHealthKitData.getLong("update_time"));
    }
}
