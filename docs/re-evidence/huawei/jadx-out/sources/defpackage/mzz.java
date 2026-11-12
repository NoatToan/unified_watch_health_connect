package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwdevice.phoneprocess.mgr.hwtwsmgr.BaseTwsTask;
import com.huawei.hwdevice.phoneprocess.mgr.hwtwsmgr.HwTwsDeleteDeviceTask;
import com.huawei.hwdevice.phoneprocess.mgr.hwtwsmgr.HwTwsGetDeviceTask;
import com.huawei.hwdevice.phoneprocess.mgr.hwtwsmgr.HwTwsPutDeviceTask;
import com.huawei.hwdevice.phoneprocess.mgr.hwtwsmgr.TwsExecutorListener;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.Utils;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public class mzz extends HwBaseManager implements ParserInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f42797a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile mzz f42798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TwsExecutorListener f42799c;
    private mzr d;
    private Context e;
    private eet h;
    private LinkedBlockingQueue<BaseTwsTask> i;

    private mzz(Context context) {
        super(context);
        this.i = new LinkedBlockingQueue<>(16);
        this.h = new eet();
        this.f42799c = new TwsExecutorListener() { // from class: mzz.3
            @Override // com.huawei.hwdevice.phoneprocess.mgr.hwtwsmgr.TwsExecutorListener
            public BaseTwsTask onGetNextTask() {
                return (BaseTwsTask) mzz.this.i.poll();
            }

            @Override // com.huawei.hwdevice.phoneprocess.mgr.hwtwsmgr.TwsExecutorListener
            public void onTaskBegin(BaseTwsTask baseTwsTask) {
                if (baseTwsTask != null) {
                    LogUtil.a("HwTwsManger", "onTaskBegin name:", baseTwsTask.getTaskName());
                }
            }

            @Override // com.huawei.hwdevice.phoneprocess.mgr.hwtwsmgr.TwsExecutorListener
            public void onTaskFinish(BaseTwsTask baseTwsTask) {
                if (baseTwsTask != null) {
                    LogUtil.a("HwTwsManger", "onTaskFinish name:", baseTwsTask.getTaskName());
                }
            }

            @Override // com.huawei.hwdevice.phoneprocess.mgr.hwtwsmgr.TwsExecutorListener
            public void onTaskTimeout(BaseTwsTask baseTwsTask) {
                if (baseTwsTask != null) {
                    LogUtil.a("HwTwsManger", "onTaskTimeout name:", baseTwsTask.getTaskName());
                }
            }

            @Override // com.huawei.hwdevice.phoneprocess.mgr.hwtwsmgr.TwsExecutorListener
            public void onAllTaskFinish() {
                LogUtil.a("HwTwsManger", "onAllTaskFinish");
                mzz.this.d.d();
            }
        };
        this.e = context;
        this.d = new mzr(this.f42799c);
    }

    public static mzz c() {
        mzz mzzVar;
        synchronized (f42797a) {
            if (f42798b == null) {
                f42798b = new mzz(BaseApplication.getContext());
            }
            mzzVar = f42798b;
        }
        return mzzVar;
    }

    public void b() {
        if (!g()) {
            LogUtil.j("HwTwsManger", "triggerByDeviceConnect but not support Tws");
            return;
        }
        LogUtil.a("HwTwsManger", "triggerByDeviceConnect");
        if (this.i.offer(new a(this.h, this.e))) {
            this.d.e();
        }
    }

    public void a() {
        if (!g()) {
            LogUtil.j("HwTwsManger", "triggerByLogin but not support Tws");
            return;
        }
        LogUtil.a("HwTwsManger", "triggerByLogin");
        if (this.i.offer(new d(this.h, this.e))) {
            this.d.e();
        }
    }

    public void e() {
        if (!g()) {
            LogUtil.j("HwTwsManger", "triggerByBroadcast but not support Tws");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: mzz.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Thread.sleep(2000L);
                    } catch (InterruptedException e2) {
                        LogUtil.e("HwTwsManger", "triggerByBroadcast InterruptedException ", e2.getMessage());
                    }
                    LogUtil.a("HwTwsManger", "triggerByBroadcast");
                    if (mzz.this.i.offer(new b(mzz.this.h, mzz.this.e))) {
                        mzz.this.d.e();
                    }
                }
            });
        }
    }

    private boolean g() {
        boolean z;
        DeviceInfo deviceInfoJ = j();
        if (deviceInfoJ == null) {
            LogUtil.j("HwTwsManger", "deviceInfo is null");
        } else {
            String deviceIdentify = deviceInfoJ.getDeviceIdentify();
            Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(this.e).queryDeviceCapability(1, deviceIdentify, "HwTwsManger");
            if (mapQueryDeviceCapability == null || mapQueryDeviceCapability.isEmpty()) {
                LogUtil.j("HwTwsManger", "isSupportTws queryDeviceCapability is null. ");
            } else {
                DeviceCapability deviceCapability = mapQueryDeviceCapability.get(deviceIdentify);
                if (deviceCapability != null && deviceCapability.isSupportTws()) {
                    z = true;
                }
                LogUtil.a("HwTwsManger", "isSupportTws:", Boolean.valueOf(z), ",isOversea:", Boolean.valueOf(Utils.o()), ",isEmui100:", Boolean.valueOf(CommonUtil.at()), ",isSystemSupportFreezing:", Boolean.valueOf(EnvironmentInfo.l()));
                return Utils.o() && z && (CommonUtil.at() || EnvironmentInfo.l());
            }
        }
        z = false;
        LogUtil.a("HwTwsManger", "isSupportTws:", Boolean.valueOf(z), ",isOversea:", Boolean.valueOf(Utils.o()), ",isEmui100:", Boolean.valueOf(CommonUtil.at()), ",isSystemSupportFreezing:", Boolean.valueOf(EnvironmentInfo.l()));
        if (Utils.o()) {
        }
    }

    private static DeviceInfo j() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "HwTwsManger");
        if (deviceList.size() > 0) {
            for (DeviceInfo deviceInfo : deviceList) {
                if (!eel.d(deviceInfo.getProductType())) {
                    return deviceInfo;
                }
            }
        }
        return null;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 43;
    }

    @Override // com.huawei.hwdevice.phoneprocess.binder.ParserInterface
    public void getResult(DeviceInfo deviceInfo, byte[] bArr) {
        d(bArr);
    }

    private void d(byte[] bArr) {
        if (!g()) {
            LogUtil.j("HwTwsManger", "onDataReceived callback but not support Tws");
        }
        LogUtil.a("HwTwsManger", "getResult(): ", eeq.e(bArr));
        if (bArr == null || bArr.length <= 0) {
            LogUtil.j("HwTwsManger", "getResult() but data is null");
            return;
        }
        switch (bArr[1]) {
            case 18:
                b(bArr);
                break;
            case 19:
                e(bArr);
                break;
            case 20:
                a(bArr);
                break;
            case 21:
                c(bArr);
                break;
            default:
                LogUtil.j("HwTwsManger", "getResult find default");
                break;
        }
    }

    private void b(byte[] bArr) {
        this.d.c("Wait_5_43_18", bArr);
    }

    private void e(byte[] bArr) {
        String strE = eeq.e(bArr);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            LogUtil.j("HwTwsManger", "handleTws19 data is error");
        }
    }

    private void a(byte[] bArr) {
        String strE = eeq.e(bArr);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            LogUtil.j("HwTwsManger", "handleTws20 data is error");
            return;
        }
        if (this.i.offer(new e(strE.substring(4), this.h, this.e))) {
            this.d.e();
        }
    }

    private void c(byte[] bArr) {
        String strE = eeq.e(bArr);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            LogUtil.j("HwTwsManger", "handleTws21 data is error");
            return;
        }
        if (this.i.offer(new c(strE.substring(4), this.h, this.e))) {
            this.d.e();
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    static class a extends HwTwsGetDeviceTask {
        a(eet eetVar, Context context) {
            super(eetVar, context);
        }

        @Override // com.huawei.hwdevice.phoneprocess.mgr.hwtwsmgr.HwTwsGetDeviceTask, com.huawei.hwdevice.phoneprocess.mgr.hwtwsmgr.BaseTwsTask
        public String getTaskName() {
            return "DeviceConnect";
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    static class d extends HwTwsGetDeviceTask {
        d(eet eetVar, Context context) {
            super(eetVar, context);
        }

        @Override // com.huawei.hwdevice.phoneprocess.mgr.hwtwsmgr.HwTwsGetDeviceTask, com.huawei.hwdevice.phoneprocess.mgr.hwtwsmgr.BaseTwsTask
        public String getTaskName() {
            return "LoginTask";
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    static class b extends HwTwsGetDeviceTask {
        b(eet eetVar, Context context) {
            super(eetVar, context);
        }

        @Override // com.huawei.hwdevice.phoneprocess.mgr.hwtwsmgr.HwTwsGetDeviceTask, com.huawei.hwdevice.phoneprocess.mgr.hwtwsmgr.BaseTwsTask
        public String getTaskName() {
            return "BroadcastTask";
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    static class e extends HwTwsPutDeviceTask {
        e(String str, eet eetVar, Context context) {
            super(str, eetVar, context);
        }

        @Override // com.huawei.hwdevice.phoneprocess.mgr.hwtwsmgr.BaseTwsTask
        public String getTaskName() {
            return "DevicePairTwsTask";
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    static class c extends HwTwsDeleteDeviceTask {
        c(String str, eet eetVar, Context context) {
            super(str, eetVar, context);
        }

        @Override // com.huawei.hwdevice.phoneprocess.mgr.hwtwsmgr.BaseTwsTask
        public String getTaskName() {
            return "DeviceDeleteTwsTask";
        }
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public void onDestroy() {
        super.onDestroy();
        d();
    }

    private void d() {
        this.d.a();
    }
}
