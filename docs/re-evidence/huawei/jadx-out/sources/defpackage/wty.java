package defpackage;

import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class wty {
    public static void d() {
        e(0, 1);
    }

    public static void e() {
        e(1, 4);
    }

    private static void e(int i, int i2) {
        long jC = ltb.c(System.currentTimeMillis());
        while (i < i2) {
            HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
            for (int i3 = 0; i3 < 7; i3++) {
                long j = jC - (((long) ((i * 7) + i3)) * 86400000);
                hiDataInsertOption.addData(c(j, 7, 2008));
                hiDataInsertOption.addData(c(j, 9, 2009));
                hiDataInsertOption.addData(c(j, 10, 2010));
                hiDataInsertOption.addData(c(j, 13, 2011));
                hiDataInsertOption.addData(c(j, 16, 2012));
                hiDataInsertOption.addData(c(j, 20, 2013));
                hiDataInsertOption.addData(c(j, 22, 2015));
                hiDataInsertOption.addData(c(j, 23, 2014));
            }
            a(hiDataInsertOption, new IBaseResponseCallback() { // from class: wty.4
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i4, Object obj) {
                }
            }, 1);
            i++;
        }
    }

    private static HiHealthData c(long j, int i, int i2) {
        long j2 = j + (((long) i) * 3600000);
        return b(j2, j2, i2, wun.e(1, 15));
    }

    private static HiHealthData b(long j, long j2, int i, double d) {
        HiHealthData hiHealthData = new HiHealthData(10001);
        hiHealthData.setDeviceUuid("-1");
        hiHealthData.setStartTime(j);
        hiHealthData.setEndTime(j2);
        hiHealthData.setType(i);
        hiHealthData.setValue(d);
        return hiHealthData;
    }

    private static HiHealthData e(long j, long j2, double d, double d2, double d3) {
        HiHealthData hiHealthData = new HiHealthData(DicDataTypeUtil.DataType.BLOOD_PRESSURE_SET.value());
        hiHealthData.setDeviceUuid("-1");
        hiHealthData.setStartTime(j);
        hiHealthData.setEndTime(j2);
        hiHealthData.setTimeInterval(j, j2);
        HashMap map = new HashMap(16);
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.BLOOD_PRESSURE_SYSTOLIC.value()), Double.valueOf(d));
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.BLOOD_PRESSURE_DIASTOLIC.value()), Double.valueOf(d2));
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.BLOOD_PRESSURE_SPHYGMUS.value()), Double.valueOf(d3));
        hiHealthData.setFieldsValue(HiJsonUtil.d(map));
        return hiHealthData;
    }

    private static void a(int i, int i2) {
        long jC = ltb.c(System.currentTimeMillis());
        for (int i3 = i; i3 < i2; i3++) {
            HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
            for (int i4 = 0; i4 < 7; i4++) {
                long j = jC - (((long) ((i3 * 7) + i4)) * 86400000);
                long j2 = j + 28800000;
                int iE = wun.e(60, 160);
                hiDataInsertOption.addData(e(j2, j2, iE, Math.min(iE - 5, wun.e(40, 160)), 80.0d));
                long j3 = j + 43200000;
                int iE2 = wun.e(60, 160);
                hiDataInsertOption.addData(e(j3, j3, iE2, Math.min(iE2 - 5, wun.e(40, 100)), 80.0d));
                long j4 = j + 72000000;
                int iE3 = wun.e(60, 160);
                hiDataInsertOption.addData(e(j4, j4, iE3, Math.min(iE3 - 5, wun.e(40, 100)), 80.0d));
            }
            a(hiDataInsertOption, new IBaseResponseCallback() { // from class: wty.1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i5, Object obj) {
                }
            }, 1);
        }
    }

    public static void a() {
        a(0, 1);
    }

    public static void c() {
        a(1, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(final HiDataInsertOption hiDataInsertOption, final IBaseResponseCallback iBaseResponseCallback, final int i) {
        if (i < 0) {
            LogUtil.a("Login_BPAndBSMockUtil", "tryTime < 0 ");
        } else {
            HiHealthNativeApi.a(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: wty.3
                @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                public void onResult(int i2, Object obj) {
                    LogUtil.a("Login_BPAndBSMockUtil", "insertHiHealthData errorCode = ", Integer.valueOf(i2));
                    iBaseResponseCallback.a(i2, null);
                    if (i2 != 0) {
                        int i3 = i - 1;
                        LogUtil.a("Login_BPAndBSMockUtil", "count = ", Integer.valueOf(i3));
                        wty.a(hiDataInsertOption, iBaseResponseCallback, i3);
                    }
                }
            });
        }
    }
}
