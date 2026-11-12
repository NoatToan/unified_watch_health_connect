package defpackage;

import android.os.Process;
import android.text.TextUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.hwsynctaskmanager.synctask.AbstractSyncTask;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class mzj {
    private static mzj d;
    private long h;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f42752c = new Object();
    private List<AbstractSyncTask> g = new LinkedList();
    private boolean j = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f42753a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f42754b = false;

    private mzj() {
        String strB = CommonUtil.b(Process.myPid());
        if (TextUtils.isEmpty(strB) || cip.e.equals(strB)) {
            return;
        }
        throw new RuntimeException("SyncTaskManager do not init in process process." + strB);
    }

    public static mzj b() {
        mzj mzjVar;
        synchronized (e) {
            if (d == null) {
                d = new mzj();
            }
            mzjVar = d;
        }
        return mzjVar;
    }

    public void a(String str) {
        ReleaseLogUtil.d("R_SyncTaskManager", "putAllSyncTask tag: ", str);
        this.h = System.currentTimeMillis();
        this.f42754b = true;
        synchronized (f42752c) {
            boolean zIsEmpty = this.g.isEmpty();
            c(new mzu(""));
            c(new mzt());
            c(new mzs());
            d();
            c(new buv());
            c(new cgm());
            c(new mzl(""));
            c(new lwe());
            if (zIsEmpty) {
                g();
            } else {
                LogUtil.j("SyncTaskManager", "task is running. wait queue.");
            }
        }
    }

    public void b(String str) {
        boolean z;
        synchronized (f42752c) {
            if (this.g.isEmpty()) {
                this.f42754b = false;
                z = true;
            } else {
                z = false;
            }
            e(str);
            if (z) {
                LogUtil.a("SyncTaskManager", "run", str, "task.");
                g();
            } else {
                LogUtil.j("SyncTaskManager", "task", str, " is running. wait queue.");
            }
        }
    }

    public void d(String str, mzh mzhVar, IBaseResponseCallback iBaseResponseCallback) {
        boolean z;
        synchronized (f42752c) {
            if (this.g.isEmpty()) {
                this.f42754b = false;
                z = true;
            } else {
                z = false;
            }
            a(str, mzhVar, iBaseResponseCallback);
            if (z) {
                LogUtil.a("SyncTaskManager", "run", str, "task.");
                g();
            } else {
                LogUtil.j("SyncTaskManager", "task", str, " is running. wait queue.");
            }
        }
    }

    private void e(String str) {
        str.hashCode();
        if (str.equals("ECG_ANALY_SYNC_TASK")) {
            a(new mzl(String.valueOf(System.currentTimeMillis())));
        } else if (str.equals("ECG_SYNC_TASK")) {
            a(new mzu(String.valueOf(System.currentTimeMillis())));
        } else {
            LogUtil.j("SyncTaskManager", "taskTag is not adapter : ", str);
        }
    }

    private boolean a(String str, mzh mzhVar, IBaseResponseCallback iBaseResponseCallback) {
        str.hashCode();
        if (str.equals("DIC_SYNC_TASK")) {
            a(b(mzhVar));
            if (!CommonUtil.ap()) {
                return true;
            }
            mzc.d().a(System.currentTimeMillis());
            return true;
        }
        if (str.equals("DIC_SEQUENCE_SYNC_TASK")) {
            a(b(mzhVar, iBaseResponseCallback));
            if (!CommonUtil.ap()) {
                return true;
            }
            mvl.e().b(System.currentTimeMillis());
            return true;
        }
        LogUtil.j("SyncTaskManager", "insertTask taskParams default");
        return true;
    }

    private void g() {
        LogUtil.a("SyncTaskManager", "runTasks enter.");
        synchronized (f42752c) {
            if (this.g.isEmpty()) {
                LogUtil.j("SyncTaskManager", "all tasks is completed.");
                if (CommonUtil.ap()) {
                    xjt.d("all tasks is completed, sync duration: " + (System.currentTimeMillis() - this.h));
                }
                i();
                this.j = false;
                return;
            }
            final AbstractSyncTask abstractSyncTask = this.g.get(0);
            if (abstractSyncTask != null) {
                this.j = true;
                abstractSyncTask.startTask(new IBaseResponseCallback() { // from class: mzj.3
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) {
                        ReleaseLogUtil.d("R_SyncTaskManager", "AbstractSyncTask : ", abstractSyncTask.getTaskTag(), ",errorCode : ", Integer.valueOf(i));
                        mzj.this.c(abstractSyncTask, i);
                    }
                });
            } else {
                LogUtil.e("SyncTaskManager", "syncTask is null. check add task.");
                this.g.remove(0);
                g();
            }
        }
    }

    private void i() {
        LogUtil.a("SyncTaskManager", "syncCloudProcess isManualSync:", Boolean.valueOf(this.f42753a), ",isAllSync:", Boolean.valueOf(this.f42754b));
        if (this.f42753a && this.f42754b) {
            if (System.currentTimeMillis() - SharedPreferenceManager.d("SyncTaskManager", "key_last_sync_cloud_time", 0L) >= 1800000) {
                b(true);
            } else {
                b(false);
            }
            SharedPreferenceManager.c("SyncTaskManager", "key_last_sync_cloud_time", System.currentTimeMillis());
            this.f42753a = false;
            this.f42754b = false;
        }
    }

    private void b(boolean z) {
        LogUtil.a("SyncTaskManager", "syncCloud forceSync:", Boolean.valueOf(z));
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(20000);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncScope(1);
        hiSyncOption.setForceSync(z);
        HiHealthNativeApi.a(BaseApplication.getContext()).synCloud(hiSyncOption, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(AbstractSyncTask abstractSyncTask, int i) {
        if (!(abstractSyncTask instanceof mzu) && !(abstractSyncTask instanceof mzl)) {
            e(abstractSyncTask);
        } else if (i == 100005) {
            LogUtil.a("SyncTaskManager", "ecg file is busy, wait file queue.");
        } else {
            e(abstractSyncTask);
        }
    }

    private void e(AbstractSyncTask abstractSyncTask) {
        i(abstractSyncTask);
        g();
    }

    private void i(AbstractSyncTask abstractSyncTask) {
        synchronized (f42752c) {
            this.g.remove(abstractSyncTask);
        }
    }

    private void c(AbstractSyncTask abstractSyncTask) {
        if (this.g.contains(abstractSyncTask)) {
            LogUtil.j("SyncTaskManager", "task : ", abstractSyncTask.getTaskTag(), ",already in queue.");
        } else if (d(abstractSyncTask) || b(abstractSyncTask)) {
            LogUtil.a("SyncTaskManager", "has ecg or analysis task, tag : ", abstractSyncTask.getTaskTag());
        } else {
            this.g.add(abstractSyncTask);
        }
    }

    private boolean d(AbstractSyncTask abstractSyncTask) {
        for (AbstractSyncTask abstractSyncTask2 : this.g) {
            if ((abstractSyncTask instanceof mzu) && (abstractSyncTask2 instanceof mzu)) {
                return true;
            }
        }
        return false;
    }

    private boolean b(AbstractSyncTask abstractSyncTask) {
        for (AbstractSyncTask abstractSyncTask2 : this.g) {
            if ((abstractSyncTask instanceof mzl) && (abstractSyncTask2 instanceof mzl)) {
                return true;
            }
        }
        return false;
    }

    private void a(AbstractSyncTask abstractSyncTask) {
        if (this.g.contains(abstractSyncTask)) {
            LogUtil.j("SyncTaskManager", "task : ", abstractSyncTask.getTaskTag(), ",already in queue.");
            if (this.g.size() == 1) {
                LogUtil.a("SyncTaskManager", "task is running.add task.");
                this.g.add(0, abstractSyncTask);
                return;
            } else {
                LogUtil.a("SyncTaskManager", "task is wait.remove task old index and jump first index.");
                this.g.remove(abstractSyncTask);
                this.g.add(0, abstractSyncTask);
                return;
            }
        }
        LogUtil.a("SyncTaskManager", "jumpTask insert first index.");
        this.g.add(0, abstractSyncTask);
    }

    public int a() {
        return this.j ? 101 : 100;
    }

    public void c() {
        ReleaseLogUtil.d("R_SyncTaskManager", "clearSyncTaskQueue.");
        synchronized (f42752c) {
            this.g.clear();
        }
    }

    public void e() {
        LogUtil.a("SyncTaskManager", "destroy.");
        synchronized (f42752c) {
            this.g.clear();
        }
        j();
    }

    private static void j() {
        synchronized (e) {
            d = null;
        }
    }

    private void d() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "SyncTaskManager");
        for (DeviceInfo deviceInfo : deviceList) {
            if (deviceInfo != null) {
                mzh mzhVar = new mzh();
                mzhVar.e(deviceInfo.getDeviceIdentify());
                mzhVar.e(-1);
                c(new mzn(deviceInfo, mzhVar, System.currentTimeMillis()));
            }
        }
        if (CommonUtil.ap()) {
            mzc.d().a(System.currentTimeMillis());
        }
        for (DeviceInfo deviceInfo2 : deviceList) {
            if (deviceInfo2 != null) {
                mzh mzhVar2 = new mzh();
                mzhVar2.e(deviceInfo2.getDeviceIdentify());
                mzhVar2.e(-1);
                c(new mzo(deviceInfo2, mzhVar2, System.currentTimeMillis(), null));
            }
        }
        if (CommonUtil.ap()) {
            mvl.e().b(System.currentTimeMillis());
        }
    }

    private mzn b(mzh mzhVar) {
        LogUtil.a("SyncTaskManager", "addSingleDeviceTask");
        return new mzn(a(mzhVar), mzhVar, System.currentTimeMillis());
    }

    private mzo b(mzh mzhVar, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("SyncTaskManager", "addSequenceSingleDeviceTask");
        return new mzo(a(mzhVar), mzhVar, System.currentTimeMillis(), iBaseResponseCallback);
    }

    private DeviceInfo a(mzh mzhVar) {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "SyncTaskManager");
        if (deviceList == null || deviceList.isEmpty()) {
            return null;
        }
        return deviceList.get(0);
    }

    public void e(boolean z) {
        this.f42753a = z;
    }
}
