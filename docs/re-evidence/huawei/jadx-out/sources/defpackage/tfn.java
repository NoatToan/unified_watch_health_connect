package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.syncmgr.SyncOption;
import com.huawei.syncmgr.SyncStressDataApi;
import com.huawei.syncmgr.basicdata.BasicDataSyncApi;
import com.huawei.syncmgr.coresleep.CoreSleepSyncApi;
import com.huawei.syncmgr.workout.WorkOutSyncApi;
import com.huawei.ui.homewear21.R;
import com.huawei.ui.main.stories.nps.interactors.HwNpsManager;
import health.compact.a.CommonUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class tfn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static tfn f49069b;
    private static lvb e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f49070c;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f49068a = new Object();

    private tfn(Context context) {
        this.f49070c = context;
    }

    public static tfn a() {
        tfn tfnVar;
        synchronized (d) {
            if (f49069b == null) {
                f49069b = new tfn(BaseApplication.getContext());
            }
            if (e == null) {
                e = lvb.e();
            }
            if (e != null) {
                lvv.c(BaseApplication.getContext());
            }
            tfnVar = f49069b;
        }
        return tfnVar;
    }

    public int g() {
        DeviceInfo deviceInfoC = mgg.c("DeviceStateInteractors");
        if (deviceInfoC != null) {
            return deviceInfoC.getDeviceConnectState();
        }
        return 0;
    }

    public void b(final int i) {
        DeviceInfo deviceInfoC = mgg.c("DeviceStateInteractors");
        if (deviceInfoC == null) {
            ReleaseLogUtil.e("R_DeviceStateInteractors", "syncAllDataWithRetry deviceInfo is null retryTimes is : ", Integer.valueOf(i));
            if (i > 0) {
                HandlerCenter.a().d(new Runnable() { // from class: tfo
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49071b.e(i);
                    }
                }, 2000L);
                return;
            }
            return;
        }
        if (deviceInfoC.getDeviceConnectState() == 0) {
            f();
        }
    }

    /* synthetic */ void e(int i) {
        b(i - 1);
    }

    public DeviceInfo j() {
        DeviceInfo deviceInfoC = mgg.c("DeviceStateInteractors");
        if (deviceInfoC != null) {
            return deviceInfoC;
        }
        return null;
    }

    public List<DeviceInfo> i() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ACTIVE_DEVICES, null, "DeviceStateInteractors");
        if (deviceList == null || deviceList.size() == 0) {
            return deviceList;
        }
        ArrayList arrayList = new ArrayList(10);
        for (DeviceInfo deviceInfo : deviceList) {
            if ("main_relationship".equals(deviceInfo.getRelationship()) || eel.d(deviceInfo.getProductType())) {
                arrayList.add(deviceInfo);
            }
        }
        return arrayList;
    }

    public DeviceInfo e(String str) {
        DeviceInfo deviceInfoB = mgg.b(str, "DeviceStateInteractors");
        if (deviceInfoB != null) {
            return deviceInfoB;
        }
        return null;
    }

    public DeviceInfo a(String str) {
        DeviceInfo deviceInfoC = mgg.c(str, "DeviceStateInteractors");
        if (deviceInfoC != null) {
            return deviceInfoC;
        }
        return null;
    }

    public boolean c() {
        List<DeviceInfo> listK = k();
        boolean z = false;
        if (listK != null && listK.size() > 0) {
            Iterator<DeviceInfo> it = listK.iterator();
            while (it.hasNext()) {
                LogUtil.a("DeviceStateInteractors", "checkEnableDevice info ", it.next());
            }
            List<DeviceInfo> listI = i();
            if (listI == null || listI.isEmpty()) {
                DeviceInfo deviceInfo = listK.get(0);
                deviceInfo.setDeviceActiveState(1);
                d(listK, deviceInfo.getDeviceIdentify());
                z = true;
            } else {
                Iterator<DeviceInfo> it2 = listI.iterator();
                while (it2.hasNext()) {
                    ReleaseLogUtil.d("R_DeviceStateInteractors", "checkEnableDevice info device", it2.next());
                }
            }
        }
        LogUtil.a("DeviceStateInteractors", "checkEnableDevices res:" + z);
        return z;
    }

    public int o() {
        DeviceInfo deviceInfoC = mgg.c("DeviceStateInteractors");
        if (deviceInfoC != null) {
            return deviceInfoC.getProductType();
        }
        return -1;
    }

    public void h() {
        mev.d().e();
    }

    public void d(String str) {
        mev.d().b(str);
    }

    public List<DeviceInfo> k() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "DeviceStateInteractors");
        if (deviceList != null) {
            return deviceList;
        }
        LogUtil.e("DeviceStateInteractors", "getUsedDeviceList null");
        return new ArrayList(10);
    }

    public void b(List<String> list, boolean z) {
        try {
            LogUtil.a("DeviceStateInteractors", "unPair");
            e.d(list, z);
        } catch (RemoteException unused) {
            LogUtil.e("DeviceStateInteractors", "unPair remoteException");
            lug.b(BaseApplication.getContext(), null);
        }
    }

    public void d(List<DeviceInfo> list, String str) {
        try {
            LogUtil.e("DeviceStateInteractors", "setUsedDeviceList ");
            e.d(list, str);
        } catch (RemoteException e2) {
            LogUtil.e("DeviceStateInteractors", "RemoteException = " + e2.getMessage());
            lug.b(BaseApplication.getContext(), null);
        }
    }

    public boolean n() {
        return BTDeviceMgrUtil.c().h() == 3;
    }

    public void c(boolean z) {
        try {
            e.a(z);
        } catch (RemoteException e2) {
            LogUtil.e("DeviceStateInteractors", "openSystemBluetoothSwitch RemoteException = " + e2.getMessage());
            lug.b(BaseApplication.getContext(), null);
        }
    }

    public void c(final Context context) {
        LogUtil.a("DeviceStateInteractors", "nps startNps qstnSurveyActivate###");
        if (context == null) {
            LogUtil.a("DeviceStateInteractors", "startNps activityContext is null");
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: tfl
            @Override // java.lang.Runnable
            public final void run() {
                this.d.e(context);
            }
        });
    }

    /* synthetic */ void e(Context context) {
        synchronized (f49068a) {
            d(context);
        }
    }

    private void d(Context context) {
        LogUtil.a("DeviceStateInteractors", "Enter qstnSurveyActivate");
        if (context == null) {
            LogUtil.a("DeviceStateInteractors", "qstnSurveyActivate activityContext is null");
        }
        boolean zC = niz.c();
        LogUtil.a("DeviceStateInteractors", "qstnSurveyInit,isCheckHi" + zC + ",Utils.isOversea()" + Utils.o());
        if (zC || Utils.o()) {
            if (CommonUtil.ap()) {
                LogUtil.j("DeviceStateInteractors", "qstnSurveyActivate isBetaVersion");
            } else {
                if (CommonUtil.ab(this.f49070c)) {
                    boolean zH = rcv.a(this.f49070c).h();
                    LogUtil.a("DeviceStateInteractors", "testnps, qstnSurveyActivate qstnSurvey.activatedQstnSurvey, isSingleSmartWatch :", Boolean.valueOf(zH));
                    HwNpsManager.getInstance().activatedQuestionSurvey(Boolean.valueOf(zH));
                    return;
                }
                LogUtil.a("DeviceStateInteractors", "testnps, Network is disabled");
            }
        }
    }

    private void l() {
        LogUtil.a("DeviceStateInteractors", "Enter refreshAllCardsData");
        LogUtil.a("DeviceStateInteractors", "PullDownRefreshcore trigger sleep sync");
        r();
        lxg.c(this.f49070c.getApplicationContext());
        LogUtil.a("DeviceStateInteractors", "refreshAllCardsData syncFitnessDetailData!!!");
        ThreadPoolManager.c().execute(new Runnable() { // from class: tfn.1
            @Override // java.lang.Runnable
            public void run() {
                tfn.t();
                tfn.m();
                tfn.s();
            }
        });
        LogUtil.a("DeviceStateInteractors", "Leave refreshAllCardsData");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void s() {
        SyncStressDataApi syncStressDataApiF = qec.f();
        if (syncStressDataApiF == null) {
            ReleaseLogUtil.d("R_DeviceStateInteractors", "PullDownRefreshcore syncStressDataApi is null.");
            xjt.x("PullDownRefreshcore syncStressDataApi is null.");
        } else {
            syncStressDataApiF.syncStressDetailData();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m() {
        BasicDataSyncApi basicDataSyncApiC = qec.c();
        if (basicDataSyncApiC == null) {
            ReleaseLogUtil.d("R_DeviceStateInteractors", "PullDownRefreshcore basicDataSyncApi is null.");
            xjt.x("PullDownRefreshcore basicDataSyncApi is null.");
        } else {
            basicDataSyncApiC.startSynBasicData(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void t() {
        if (CommonUtil.ap() || CommonUtil.ao() || CommonUtil.cl()) {
            WorkOutSyncApi workOutSyncApiH = qec.h();
            if (workOutSyncApiH == null) {
                ReleaseLogUtil.d("R_DeviceStateInteractors", "PullDownRefreshcore workOutSyncApi is null.");
                xjt.x("PullDownRefreshcore workOutSyncApi is null.");
            } else {
                workOutSyncApiH.startSynWorkOut();
            }
        }
    }

    private static void r() {
        SyncOption syncOptionC = SyncOption.builder().d(true).c();
        CoreSleepSyncApi coreSleepSyncApiE = qec.e();
        if (coreSleepSyncApiE == null) {
            ReleaseLogUtil.d("R_DeviceStateInteractors", "PullDownRefreshcore coreSleepSyncApi is null.");
            xjt.x("PullDownRefreshcore coreSleepSyncApi is null.");
        } else {
            coreSleepSyncApiE.startSynCoreSleep(syncOptionC, new IBaseResponseCallback() { // from class: tfn.4
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("DeviceStateInteractors", "PullDownRefreshcore trigger sleep sync has been done errorCode: ", Integer.valueOf(i));
                }
            });
        }
    }

    public int a(int i) {
        LogUtil.a("DeviceStateInteractors", "Enter getIdImage productType :", Integer.valueOf(i));
        int i2 = R.mipmap.device_icon_band_default_new;
        if (!lvi.f(i)) {
            i2 = R.mipmap.device_icon_watch_default_new;
        }
        edn ednVarA = lvi.a(i);
        return ednVarA.c() != 0 ? ednVarA.c() : i2;
    }

    public void f() {
        LogUtil.a("DeviceStateInteractors", "Enter dataSync()");
        l();
        LogUtil.a("DeviceStateInteractors", "Leave dataSync()");
    }

    public void c(String str) {
        int iIndexOf;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DeviceStateInteractors", "mac is empty.");
            return;
        }
        LogUtil.a("DeviceStateInteractors", "Enter unbindDevice");
        List<DeviceInfo> listK = k();
        if (listK.size() > 0) {
            Iterator<DeviceInfo> it = listK.iterator();
            while (true) {
                if (!it.hasNext()) {
                    iIndexOf = -1;
                    break;
                }
                DeviceInfo next = it.next();
                if (next.getDeviceIdentify().equals(str)) {
                    iIndexOf = listK.indexOf(next);
                    break;
                }
            }
            if (iIndexOf != -1) {
                listK.remove(iIndexOf);
                LogUtil.a("DeviceStateInteractors", "deleteDevice");
                ArrayList arrayList = new ArrayList(16);
                arrayList.add(str);
                b(arrayList, true);
                return;
            }
            LogUtil.a("DeviceStateInteractors", "device is not deleted.");
        }
    }
}
