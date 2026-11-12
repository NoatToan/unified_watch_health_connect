package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.huawei.hihealth.HiHealthDataQuery;
import com.huawei.hihealth.HiHealthKitData;
import com.huawei.hihealth.IDataReadResultListener;
import com.huawei.hihealth.motion.HealthOpenSDK;
import com.huawei.hihealth.motion.IExecuteResult;
import health.compact.a.HiDateUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class lfg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f40023a = new Object();
    private static ldp d = new ldp();

    public static void b(HiHealthDataQuery hiHealthDataQuery, IDataReadResultListener iDataReadResultListener, HealthOpenSDK healthOpenSDK) throws RemoteException {
        ReleaseLogUtil.d("HiH_RealSportUtil", "enter queryRealSport");
        long jP = HiDateUtil.p(System.currentTimeMillis());
        if (hiHealthDataQuery.getStartTime() < hiHealthDataQuery.getEndTime() && hiHealthDataQuery.getStartTime() >= jP && hiHealthDataQuery.getEndTime() < System.currentTimeMillis()) {
            ArrayList arrayList = new ArrayList();
            HiHealthKitData hiHealthKitDataE = e(healthOpenSDK, "step");
            if (hiHealthKitDataE.getIntValue() == -1) {
                ReleaseLogUtil.e("HiH_RealSportUtil", "queryRealSport type is error");
                iDataReadResultListener.onResult(null, 4, 2);
                return;
            } else {
                arrayList.add(hiHealthKitDataE);
                iDataReadResultListener.onResult(arrayList, 40002, 1);
                iDataReadResultListener.onResult(null, 0, 2);
                return;
            }
        }
        ReleaseLogUtil.e("HiH_RealSportUtil", "only today data is supported");
        iDataReadResultListener.onResult(null, 2, 2);
    }

    public static HiHealthKitData e(HealthOpenSDK healthOpenSDK, final String str) {
        long jP = HiDateUtil.p(System.currentTimeMillis());
        final HiHealthKitData hiHealthKitData = new HiHealthKitData();
        hiHealthKitData.setValue(-1);
        hiHealthKitData.setStartTime(jP);
        hiHealthKitData.setEndTime(jP);
        if (healthOpenSDK == null) {
            ReleaseLogUtil.e("HiH_RealSportUtil", "step sdk is null");
            return hiHealthKitData;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        healthOpenSDK.c(new IExecuteResult() { // from class: lfg.5
            @Override // com.huawei.hihealth.motion.IExecuteResult
            public void onSuccess(Object obj) {
                if (obj instanceof Bundle) {
                    int i = ((Bundle) obj).getInt(str, -1);
                    if (i > -1) {
                        hiHealthKitData.setValue(i);
                    } else {
                        ReleaseLogUtil.e("HiH_RealSportUtil", "today sport data is invalid for type ", str);
                    }
                } else {
                    ReleaseLogUtil.e("HiH_RealSportUtil", "object is not instance of bundle", obj);
                }
                countDownLatch.countDown();
            }

            @Override // com.huawei.hihealth.motion.IExecuteResult
            public void onFailed(Object obj) {
                ReleaseLogUtil.a("HiH_RealSportUtil", "failed to get today sport data", obj);
                countDownLatch.countDown();
            }

            @Override // com.huawei.hihealth.motion.IExecuteResult
            public void onServiceException(Object obj) {
                ReleaseLogUtil.a("HiH_RealSportUtil", "service error when get today sport data", obj);
                countDownLatch.countDown();
            }
        });
        try {
            if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                ReleaseLogUtil.a("HiH_RealSportUtil", "getTodaySportData wait timeout");
            }
            return hiHealthKitData;
        } catch (InterruptedException e) {
            ReleaseLogUtil.a("HiH_RealSportUtil", "query today sport data process is interrupted", LogAnonymous.b(e));
            return hiHealthKitData;
        }
    }
}
