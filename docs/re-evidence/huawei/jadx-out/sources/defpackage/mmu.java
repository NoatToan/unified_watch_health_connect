package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.huawei.datatype.DeviceCommand;
import com.huawei.devicesdk.entity.ConnectMode;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import health.compact.a.CommonUtil;
import health.compact.a.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class mmu {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static mmu f41950b;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Boolean> f41952c;
    private String g;
    private List<String> i;
    private Map<String, e> h = new ConcurrentHashMap(16);
    private Map<String, e> f = new ConcurrentHashMap(16);
    private Map<String, Integer> j = new HashMap(16);
    private boolean e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f41951a = new e(Looper.getMainLooper());

    class e extends Handler {
        e(Looper looper) {
            super(looper);
            LogUtil.b("DeviceBackupManage", "ProcessHandler start");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message == null) {
                LogUtil.b("DeviceBackupManage", "ProcessHandler message is null");
                return;
            }
            int i = message.what;
            if (i == 100) {
                ReleaseLogUtil.d("DEVMGR_DeviceBackupManage", "ProcessHandler command time out");
                mmu.this.a((String) message.obj);
                return;
            }
            if (i == 200) {
                ReleaseLogUtil.d("DEVMGR_DeviceBackupManage", "ProcessHandler retry connect");
                mkm.d().c(mkm.d().b((String) message.obj), true, ConnectMode.GENERAL);
                return;
            }
            if (i != 300) {
                return;
            }
            ReleaseLogUtil.d("DEVMGR_DeviceBackupManage", "sendOldCloneCommand start");
            mmu.this.g();
            mmu.this.c((DeviceInfo) message.obj);
        }
    }

    public static mmu e() {
        mmu mmuVar;
        synchronized (d) {
            if (f41950b == null) {
                f41950b = new mmu();
            }
            mmuVar = f41950b;
        }
        return mmuVar;
    }

    private mmu() {
        LogUtil.b("DeviceBackupManage", "DeviceBackupManage init success");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (CommonUtil.bc()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: mmv
                @Override // java.lang.Runnable
                public final void run() {
                    mmu.c();
                }
            });
        }
    }

    static /* synthetic */ void c() {
        LogUtil.b("DeviceBackupManage", "PowerKitManager 5.1.58 request");
        cpw.c("DeviceBackupManage", 65535, 30000L, "user-reconnectDevice");
    }

    private void f() {
        if (CommonUtil.bc()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: mmw
                @Override // java.lang.Runnable
                public final void run() {
                    mmu.d();
                }
            });
        }
    }

    static /* synthetic */ void d() {
        LogUtil.b("DeviceBackupManage", "PowerKitManager 5.1.58 release");
        cpw.b("DeviceBackupManage", 65535, "user-reconnectDevice");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        List<String> list = this.i;
        if (list == null || !list.contains(str)) {
            return;
        }
        ReleaseLogUtil.d("DEVMGR_DeviceBackupManage", "clearOldDeviceMap isSuccess: ", Boolean.valueOf(this.i.remove(str)));
        if (this.i.size() == 0) {
            this.i.clear();
            ReleaseLogUtil.d("DEVMGR_DeviceBackupManage", "clearOldDeviceMap set empty");
            this.i = null;
        }
    }

    public String a() {
        return this.g;
    }

    public void b(DeviceInfo deviceInfo) {
        LogUtil.b("DeviceBackupManage", "sendOldCloneCommandDelay enter");
        List<String> list = this.i;
        if (list == null || list.size() <= 0) {
            return;
        }
        LogUtil.b("DeviceBackupManage", "sendOldCloneCommandDelay size not zero");
        Message messageObtain = Message.obtain();
        messageObtain.what = 300;
        messageObtain.obj = deviceInfo;
        this.f41951a.sendMessageDelayed(messageObtain, 5000L);
        LogUtil.b("DeviceBackupManage", "sendOldCloneCommandDelay end, threadName: ", Thread.currentThread().getName());
    }

    public void d(String str) {
        this.g = str;
    }

    public void c(Map<String, Boolean> map) {
        this.f41952c = map;
    }

    public void b(List<String> list) {
        this.i = list;
    }

    public void c(DeviceInfo deviceInfo) {
        LogUtil.b("DeviceBackupManage", "sendOldPhoneCommand identify: ", CommonUtil.n(deviceInfo.getDeviceIdentify()));
        if (!cqd.c(deviceInfo, 223)) {
            LogUtil.e("DeviceBackupManage", "sendOldPhoneCommand device is not support.");
            return;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(1);
        deviceCommand.setCommandID(58);
        String strA = eeq.a(a());
        StringBuilder sb = new StringBuilder(16);
        sb.append(eeq.d(1));
        sb.append(eeq.d(1));
        sb.append(eeq.d(1));
        sb.append(eeq.d(2));
        sb.append(eeq.d(strA.length() / 2));
        sb.append(strA);
        sb.append(eeq.d(4));
        sb.append(eeq.d(1));
        sb.append(eeq.d(1));
        deviceCommand.setDataLen(sb.length());
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        LogUtil.b("DeviceBackupManage", "sendOldPhoneCommand: ", eeq.e(deviceCommand.getDataContent()));
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
        f(deviceInfo);
    }

    public void c(DeviceInfo deviceInfo, cmm cmmVar) {
        LogUtil.b("DeviceBackupManage", "dealOldPhoneResult identify: ", CommonUtil.n(deviceInfo.getDeviceIdentify()));
        List<String> list = this.i;
        if (list == null || list.size() == 0) {
            LogUtil.e("DeviceBackupManage", "dealOldPhoneResult return.");
            return;
        }
        if (!cqd.c(deviceInfo, 223)) {
            LogUtil.e("DeviceBackupManage", "dealOldPhoneResult device is not support.");
            return;
        }
        if (this.i.contains(deviceInfo.getDeviceIdentify())) {
            e eVar = this.h.get(deviceInfo.getDeviceIdentify());
            if (eVar != null) {
                eVar.removeMessages(100);
                this.h.remove(deviceInfo.getDeviceIdentify());
            }
            a(deviceInfo.getDeviceIdentify());
            cqb cqbVarE = cku.e(cmmVar.d());
            if (cqbVarE == null) {
                LogUtil.e("DeviceBackupManage", "dealOldPhoneResult tlvFather is null");
                return;
            }
            int iA = 0;
            for (cqa cqaVar : cqbVarE.b()) {
                if (cpb.a(cqaVar.b()) == 3) {
                    iA = cpb.a(cqaVar.c());
                }
            }
            ReleaseLogUtil.d("DEVMGR_DeviceBackupManage", "dealOldPhoneResult confirmResult: ", Integer.valueOf(iA));
            if (iA == 0) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(deviceInfo.getDeviceIdentify());
                mkf.e(BaseApplication.getContext()).unPair(arrayList, false);
            } else {
                ReleaseLogUtil.d("DEVMGR_DeviceBackupManage", "dealOldPhoneResult do not");
            }
            f();
        }
    }

    public void d(DeviceInfo deviceInfo) {
        LogUtil.b("DeviceBackupManage", "dealOldPhoneConnectFail identify: ", CommonUtil.n(deviceInfo.getDeviceIdentify()));
        Map<String, Boolean> map = this.f41952c;
        if (map == null || map.size() == 0) {
            LogUtil.e("DeviceBackupManage", "dealOldPhoneConnectFail return.");
            return;
        }
        if (!cqd.c(deviceInfo, 223)) {
            LogUtil.e("DeviceBackupManage", "dealOldPhoneConnectFail device is not support.");
            return;
        }
        if (this.f41952c.containsKey(deviceInfo.getDeviceIdentify())) {
            if (this.f41952c.get(deviceInfo.getDeviceIdentify()).booleanValue()) {
                this.f41952c.put(deviceInfo.getDeviceIdentify(), false);
                mkm.d().c(mkm.d().b(deviceInfo.getDeviceIdentify()), true, ConnectMode.GENERAL);
            } else {
                a(deviceInfo.getDeviceIdentify());
                this.f41952c.remove(deviceInfo.getDeviceIdentify());
            }
        }
    }

    public void e(DeviceInfo deviceInfo) {
        if (deviceInfo == null || !h()) {
            ReleaseLogUtil.e("DEVMGR_DeviceBackupManage", "dealNewPhoneConnectFail is not clone.");
            return;
        }
        if (!cqd.c(deviceInfo, 223)) {
            LogUtil.e("DeviceBackupManage", "dealNewPhoneConnectFail device is not support.");
            return;
        }
        LogUtil.e("DeviceBackupManage", "dealNewPhoneConnectFail app package: ", BaseApplication.getAppPackage());
        if (CommonUtil.q(BaseApplication.getContext())) {
            LogUtil.e("DeviceBackupManage", "dealNewPhoneConnectFail main process running, return.");
            a(false);
            this.j.clear();
            return;
        }
        if (this.j.size() == 0) {
            LogUtil.e("DeviceBackupManage", "dealNewPhoneConnectFail mNewPhoneReconnectDeviceMap is zero.");
            a(false);
            return;
        }
        if (!this.j.containsKey(deviceInfo.getDeviceIdentify())) {
            LogUtil.e("DeviceBackupManage", "dealNewPhoneConnectFail is not contains.");
            return;
        }
        if (this.j.get(deviceInfo.getDeviceIdentify()) == null) {
            LogUtil.e("DeviceBackupManage", "dealNewPhoneConnectFail value is null.");
            return;
        }
        Integer num = this.j.get(deviceInfo.getDeviceIdentify());
        if (num.intValue() >= 2) {
            LogUtil.e("DeviceBackupManage", "dealNewPhoneConnectFail count is 2, return.");
            this.j.remove(deviceInfo.getDeviceIdentify());
            return;
        }
        this.j.put(deviceInfo.getDeviceIdentify(), num);
        e eVar = this.f.get(deviceInfo.getDeviceIdentify());
        if (eVar != null) {
            Message messageObtainMessage = eVar.obtainMessage(200);
            messageObtainMessage.obj = deviceInfo.getDeviceIdentify();
            eVar.sendMessageDelayed(messageObtainMessage, 60000L);
        }
    }

    public void b() {
        if (!h()) {
            ReleaseLogUtil.e("DEVMGR_DeviceBackupManage", "initNewPhoneData is not clone.");
            return;
        }
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "initNewPhoneData");
        if (deviceList == null || deviceList.size() == 0) {
            return;
        }
        for (DeviceInfo deviceInfo : deviceList) {
            if (cqd.c(deviceInfo, 223) && deviceInfo.getDeviceConnectState() != 2) {
                this.j.put(deviceInfo.getDeviceIdentify(), 0);
                if (this.f.get(deviceInfo.getDeviceIdentify()) == null) {
                    this.f.put(deviceInfo.getDeviceIdentify(), new e(Looper.getMainLooper()));
                }
            }
        }
        i();
        ReleaseLogUtil.e("DEVMGR_DeviceBackupManage", "initNewPhoneData mNewPhoneReconnectDeviceMap size: ", Integer.valueOf(this.j.size()));
    }

    public void a(DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("DEVMGR_DeviceBackupManage", "removeNewPhoneDeviceMapByMac deviceIdentify: ", CommonUtil.n(deviceInfo.getDeviceIdentify()));
        if (deviceInfo == null || !h()) {
            ReleaseLogUtil.e("DEVMGR_DeviceBackupManage", "removeNewPhoneDeviceMapByMac is not clone.");
            return;
        }
        if (this.j.containsKey(deviceInfo.getDeviceIdentify())) {
            e eVar = this.f.get(deviceInfo.getDeviceIdentify());
            if (eVar != null) {
                eVar.removeMessages(200);
                this.f.remove(deviceInfo.getDeviceIdentify());
            }
            this.j.remove(deviceInfo.getDeviceIdentify());
            LogUtil.e("DeviceBackupManage", "cancelReconnectTimerTask deviceIdentify: ", CommonUtil.n(deviceInfo.getDeviceIdentify()));
            i();
        }
        ReleaseLogUtil.d("DEVMGR_DeviceBackupManage", "removeNewPhoneDeviceMapByMac mNewPhoneReconnectDeviceMap size: ", Integer.valueOf(this.j.size()));
    }

    private void i() {
        if (this.j.size() == 0) {
            a(false);
        }
    }

    private void f(DeviceInfo deviceInfo) {
        e eVar = this.h.get(deviceInfo.getDeviceIdentify());
        if (eVar == null) {
            eVar = new e(Looper.getMainLooper());
            this.h.put(deviceInfo.getDeviceIdentify(), eVar);
            LogUtil.e("DeviceBackupManage", "create new timeOutHandler");
        }
        Message messageObtainMessage = eVar.obtainMessage(100);
        messageObtainMessage.obj = deviceInfo.getDeviceIdentify();
        eVar.sendMessageDelayed(messageObtainMessage, 30000L);
    }

    public void a(boolean z) {
        this.e = z;
    }

    public boolean h() {
        return this.e;
    }
}
