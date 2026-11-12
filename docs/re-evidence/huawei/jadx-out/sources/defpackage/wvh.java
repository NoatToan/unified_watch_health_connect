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
import java.security.SecureRandom;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class wvh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Float f52538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Float f52539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Float f52540c;
    private static final Float d;

    static {
        Float fValueOf = Float.valueOf(34.0f);
        f52539b = fValueOf;
        f52540c = Float.valueOf(42.0f);
        f52538a = fValueOf;
        d = Float.valueOf(40.0f);
    }

    public static void a() {
        a(DicDataTypeUtil.DataType.BODY_TEMPERATURE_SET.value(), 0, 1);
    }

    public static void b() {
        a(DicDataTypeUtil.DataType.BODY_TEMPERATURE_SET.value(), 1, 4);
    }

    private static void a(int i, int i2, int i3) {
        long jC = ltb.c(System.currentTimeMillis());
        while (i2 < i3) {
            HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
            for (int i4 = 0; i4 < 7; i4++) {
                long j = jC - (((long) ((i2 * 7) + i4)) * 86400000);
                hiDataInsertOption.addData(d(i, j, 8));
                hiDataInsertOption.addData(d(i, j, 9));
                hiDataInsertOption.addData(d(i, j, 10));
                hiDataInsertOption.addData(d(i, j, 11));
                hiDataInsertOption.addData(d(i, j, 12));
                hiDataInsertOption.addData(d(i, j, 13));
                hiDataInsertOption.addData(d(i, j, 14));
                hiDataInsertOption.addData(d(i, j, 15));
                hiDataInsertOption.addData(d(i, j, 16));
                hiDataInsertOption.addData(d(i, j, 16));
                hiDataInsertOption.addData(d(i, j, 19));
                hiDataInsertOption.addData(d(i, j, 20));
            }
            e(hiDataInsertOption, new IBaseResponseCallback() { // from class: wvh.5
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i5, Object obj) {
                }
            }, 1);
            i2++;
        }
    }

    public static Float c(Float f, Float f2) {
        return Float.valueOf((float) (((double) (new SecureRandom().nextInt((int) (f2.floatValue() - f.floatValue())) + f.floatValue())) + Math.random()));
    }

    private static HiHealthData d(int i, long j, int i2) {
        long j2 = j + (((long) i2) * 3600000);
        return c(i, j2, j2, c(f52539b, f52540c).floatValue());
    }

    private static HiHealthData c(int i, long j, long j2, float f) {
        HiHealthData hiHealthData = new HiHealthData(i);
        hiHealthData.setDeviceUuid("-1");
        hiHealthData.setStartTime(j);
        hiHealthData.setEndTime(j2);
        hiHealthData.setTimeInterval(j, j2);
        HashMap map = new HashMap(16);
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.BODY_TEMPERATURE.value()), Float.valueOf(f));
        int iValue = DicDataTypeUtil.DataType.SKIN_TEMPERATURE.value();
        map.put(Integer.valueOf(iValue), c(f52538a, d));
        hiHealthData.setFieldsValue(HiJsonUtil.d(map));
        return hiHealthData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(final HiDataInsertOption hiDataInsertOption, final IBaseResponseCallback iBaseResponseCallback, final int i) {
        if (i < 0) {
            LogUtil.a("Login_TemperatureUtil", "tryTime < 0 ");
        } else {
            HiHealthNativeApi.a(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: wvh.2
                @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                public void onResult(int i2, Object obj) {
                    LogUtil.a("Login_TemperatureUtil", "insertHiHealthData errorCode = ", Integer.valueOf(i2));
                    iBaseResponseCallback.a(i2, null);
                    if (i2 != 0) {
                        int i3 = i - 1;
                        LogUtil.a("Login_TemperatureUtil", "count = ", Integer.valueOf(i3));
                        wvh.e(hiDataInsertOption, iBaseResponseCallback, i3);
                    }
                }
            });
        }
    }
}
