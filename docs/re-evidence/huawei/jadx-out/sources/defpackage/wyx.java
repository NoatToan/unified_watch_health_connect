package defpackage;

import android.util.SparseArray;
import androidx.health.connect.client.HealthConnectClient;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.thirdpartservice.interactors.thirdpartyservice.ThirdPartyDataType;
import health.compact.a.HiDateUtil;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes20.dex */
public class wyx {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f52606b = false;
    private static volatile wyx d;
    private static final Object e = new Object();

    private wyx() {
    }

    public static wyx c() {
        if (d == null) {
            synchronized (e) {
                if (d == null) {
                    d = new wyx();
                }
            }
        }
        return d;
    }

    public boolean a() {
        return lua.e("THIRD_PARTY_SERVICE", "HEALTH_CONNECT_AGREEMENT_STATUS", false);
    }

    public boolean i() {
        try {
            return "JP".equals(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010)) && PermissionUtil.g() && HealthConnectClient.getSdkStatus(com.huawei.haf.application.BaseApplication.b()) == 3;
        } catch (Exception e2) {
            ReleaseLogUtil.e("R_DataOpenCoordinator", "isSupportHealthConnect catch exception:", ExceptionUtils.c(e2));
            return false;
        }
    }

    public void b() {
        if (f52606b) {
            LogUtil.a("DataOpenCoordinator", "has init");
        } else {
            f52606b = true;
            wzv.b().c(com.huawei.haf.application.BaseApplication.b());
        }
    }

    public boolean h() {
        return xav.a(ThirdPartyDataType.Platform.HEALTH_CONNECT, ThirdPartyDataType.DataType.SPORT) == 0;
    }

    public boolean g() {
        return xav.a(ThirdPartyDataType.Platform.HEALTH_CONNECT, ThirdPartyDataType.DataType.SLEEP) == 0;
    }

    public boolean j() {
        return wzv.b().c(ThirdPartyDataType.DataType.STEP) || wzv.b().c(ThirdPartyDataType.DataType.CALORIES);
    }

    public boolean f() {
        return wzv.b().c(ThirdPartyDataType.DataType.STEP);
    }

    public boolean d() {
        return wzv.b().c(ThirdPartyDataType.DataType.CALORIES);
    }

    public boolean e() {
        return wzv.b().c(ThirdPartyDataType.DataType.SLEEP);
    }

    public void o() {
        f52606b = false;
        wzv.b().f();
    }

    public void c(Set<Integer> set) {
        if (set.isEmpty()) {
            LogUtil.a("DataOpenCoordinator", "handleSportData no type");
        } else if (set.contains(40002)) {
            n();
        } else {
            k();
        }
    }

    public void k() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jA = xav.a(ThirdPartyDataType.Platform.HEALTH_CONNECT, ThirdPartyDataType.DataType.CALORIES);
        long jA2 = wzv.b().a(jA, ThirdPartyDataType.DataType.CALORIES);
        ReleaseLogUtil.c("R_DataOpenCoordinator", "writeCaloriesOnly lastSyncTime:", Long.valueOf(jA), " ,startSyncTIme:", Long.valueOf(jA2));
        d(jA2, jCurrentTimeMillis, new int[]{40003}, new IBaseResponseCallback() { // from class: wzc
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                wyx.d(i, obj);
            }
        });
    }

    static /* synthetic */ void d(int i, Object obj) {
        ReleaseLogUtil.c("R_DataOpenCoordinator", "writeCaloriesOnly getHiHealthSportData errCode = ", Integer.valueOf(i));
        if (i == 0 && (obj instanceof SparseArray)) {
            ArrayList arrayList = new ArrayList(16);
            Object obj2 = ((SparseArray) obj).get(40003);
            if (obj2 == null || !wzv.b().c(ThirdPartyDataType.DataType.CALORIES)) {
                return;
            }
            arrayList.addAll(new ArrayList((List) obj2));
            wzv.b().a(arrayList);
        }
    }

    public void n() {
        if (HandlerExecutor.c()) {
            LogUtil.a("DataOpenCoordinator", "writeSportData isMainTread");
            ThreadPoolManager.c().execute(new Runnable() { // from class: wyy
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.n();
                }
            });
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jA = xav.a(ThirdPartyDataType.Platform.HEALTH_CONNECT, ThirdPartyDataType.DataType.SPORT);
        long jA2 = wzv.b().a(jA, ThirdPartyDataType.DataType.SPORT);
        ReleaseLogUtil.c("R_DataOpenCoordinator", "writeSportData lastSyncTime:", Long.valueOf(jA), " ,startSyncTIme:", Long.valueOf(jA2));
        d(jA2, jCurrentTimeMillis, new int[]{40002, 40003}, new IBaseResponseCallback() { // from class: wza
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                wyx.b(i, obj);
            }
        });
    }

    static /* synthetic */ void b(int i, Object obj) {
        ReleaseLogUtil.c("R_DataOpenCoordinator", "writeSportData getHiHealthSportData errCode = ", Integer.valueOf(i));
        if (i == 0 && (obj instanceof SparseArray)) {
            SparseArray sparseArray = (SparseArray) obj;
            Object obj2 = sparseArray.get(40002);
            if (obj2 != null && wzv.b().c(ThirdPartyDataType.DataType.STEP)) {
                wzv.b().c((List<HiHealthData>) obj2);
            }
            Object obj3 = sparseArray.get(40003);
            if (obj3 == null || !wzv.b().c(ThirdPartyDataType.DataType.CALORIES)) {
                return;
            }
            wzv.b().a((List) obj3);
        }
    }

    public void l() {
        if (HandlerExecutor.c()) {
            LogUtil.a("DataOpenCoordinator", "writeSleepDetails isMainTread");
            ThreadPoolManager.c().execute(new Runnable() { // from class: wyv
                @Override // java.lang.Runnable
                public final void run() {
                    this.f52603c.l();
                }
            });
            return;
        }
        long jO = HiDateUtil.o(System.currentTimeMillis());
        long jA = xav.a(ThirdPartyDataType.Platform.HEALTH_CONNECT, ThirdPartyDataType.DataType.SLEEP);
        long jA2 = wzv.b().a(jA, ThirdPartyDataType.DataType.SLEEP);
        int[] iArr = {22100, 22000};
        long jM = HiDateUtil.m(jA2);
        int i = ((int) (((jO - jA2) + 3600000) / 86400000)) + 1;
        ReleaseLogUtil.c("R_DataOpenCoordinator", "writeSleepDetails lastSyncTime:", Long.valueOf(jA), ", startSyncTime:", Long.valueOf(jA2), ", interval:", Integer.valueOf(i));
        final CountDownLatch countDownLatch = new CountDownLatch(i);
        final CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        long jO2 = jA2;
        long jM2 = jM;
        while (jO2 <= jO) {
            d(jO2, jM2, iArr, new IBaseResponseCallback() { // from class: wyw
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj) {
                    this.f52604b.c(countDownLatch, copyOnWriteArrayList, i2, obj);
                }
            });
            jO2 = HiDateUtil.o(jM2 + 1);
            jM2 = HiDateUtil.m(jO2);
        }
        try {
            ReleaseLogUtil.c("R_DataOpenCoordinator", "writeSleepDetails isOnTime= ", Boolean.valueOf(countDownLatch.await(5L, TimeUnit.SECONDS)));
        } catch (InterruptedException unused) {
            LogUtil.c("DataOpenCoordinator", "writeSleepDetails InterruptedException");
        }
        wzv.b().d(copyOnWriteArrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(CountDownLatch countDownLatch, List list, int i, Object obj) {
        ReleaseLogUtil.c("R_DataOpenCoordinator", "writeSleepDetails getHiHealthData errCode = ", Integer.valueOf(i));
        if (i != 0 || !(obj instanceof SparseArray)) {
            countDownLatch.countDown();
            return;
        }
        SparseArray sparseArray = (SparseArray) obj;
        ArrayList arrayList = new ArrayList();
        Boolean boolD = d((List) sparseArray.get(22100), (List) sparseArray.get(22000), arrayList);
        if (boolD == null) {
            countDownLatch.countDown();
        } else {
            list.add(new xbn(arrayList, boolD.booleanValue()));
            countDownLatch.countDown();
        }
    }

    private Boolean d(List<HiHealthData> list, List<HiHealthData> list2, List<HiHealthData> list3) {
        ArrayList arrayList = new ArrayList();
        if (njy.e(list)) {
            if (njy.e(list2)) {
                LogUtil.a("DataOpenCoordinator", "no sleepData");
                return null;
            }
            list3.addAll(list2);
            return false;
        }
        for (HiHealthData hiHealthData : list) {
            int type = hiHealthData.getType();
            if (type != 22105 && type != 22106 && type != 22107) {
                list3.addAll(list);
                return Boolean.valueOf(hiHealthData.getInt("trackdata_deviceType") != 32);
            }
            if (type == 22105) {
                arrayList.add(hiHealthData);
            }
        }
        if (njy.b(list2)) {
            list3.addAll(list2);
            if (njy.b(arrayList)) {
                list3.addAll(arrayList);
            }
        } else {
            list3.addAll(list);
        }
        return false;
    }

    private void d(long j, long j2, int[] iArr, final IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.c("R_DataOpenCoordinator", "getHiHealthData startTime:", Long.valueOf(j), " ,endTime:", Long.valueOf(j2));
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(j);
        hiDataReadOption.setEndTime(j2);
        hiDataReadOption.setSortOrder(0);
        hiDataReadOption.setReadType(0);
        hiDataReadOption.setType(iArr);
        HiHealthNativeApi.a(com.huawei.haf.application.BaseApplication.b()).readHiHealthDataPro(HiDataReadProOption.builder().e(hiDataReadOption).b(), new HiDataReadResultListener(this) { // from class: wyx.3
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.a("DataOpenCoordinator", "getHiHealthData object data:", obj);
                if (obj == null) {
                    iBaseResponseCallback.a(-1, null);
                } else {
                    iBaseResponseCallback.a(0, obj);
                }
            }
        });
    }
}
