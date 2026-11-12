package defpackage;

import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes19.dex */
public class uwm {
    private static void d(int i, int i2) {
        long jC = ltb.c(System.currentTimeMillis());
        int i3 = i;
        while (i3 < i2) {
            HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
            int i4 = 0;
            while (i4 < 7) {
                long j = jC - (((long) ((i3 * 7) + i4)) * 86400000);
                for (int i5 = 0; i5 < 1440; i5 += 25) {
                    long j2 = j + (((long) i5) * 60000);
                    hiDataInsertOption.addData(a(j2, j2, 2002, c(i5)));
                }
                hiDataInsertOption.addData(a(j, j, 2018, wun.e(60, 70)));
                hiDataInsertOption.addData(a(j, j, 2018, wun.e(60, 70)));
                hiDataInsertOption.addData(a(j, j, 2018, wun.e(60, 70)));
                i4++;
                jC = jC;
            }
            d(hiDataInsertOption, new IBaseResponseCallback() { // from class: uwm.4
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i6, Object obj) {
                }
            }, 1);
            i3++;
            jC = jC;
        }
    }

    private static double c(int i) {
        int iE;
        if (i < 300) {
            iE = wun.e(40, 90);
        } else if (i >= 660 && i < 1020) {
            iE = wun.e(80, 140);
        } else {
            iE = wun.e(60, 200);
        }
        return iE;
    }

    public static void b() {
        d(0, 1);
    }

    public static void e() {
        d(1, 4);
    }

    private static HiHealthData a(long j, long j2, int i, double d) {
        HiHealthData hiHealthData = new HiHealthData(i);
        hiHealthData.setDeviceUuid("-1");
        hiHealthData.setStartTime(j);
        hiHealthData.setEndTime(j2);
        hiHealthData.setValue(d);
        return hiHealthData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(final HiDataInsertOption hiDataInsertOption, final IBaseResponseCallback iBaseResponseCallback, final int i) {
        if (i < 0) {
            LogUtil.a("HeartDataMockUtil", "tryTime < 0 ");
        } else {
            HiHealthNativeApi.a(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: uwm.3
                @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                public void onResult(int i2, Object obj) {
                    LogUtil.a("HeartDataMockUtil", "insertHiHealthData errorCode = ", Integer.valueOf(i2));
                    iBaseResponseCallback.a(i2, null);
                    if (i2 != 0) {
                        int i3 = i - 1;
                        LogUtil.a("HeartDataMockUtil", "count = ", Integer.valueOf(i3));
                        uwm.d(hiDataInsertOption, iBaseResponseCallback, i3);
                    }
                }
            });
        }
    }
}
