package com.huawei.unitedevice.hwcommonfilemgr;

import android.text.TextUtils;
import com.huawei.unitedevice.hwwifip2ptransfermgr.HwWifiP2pTransferManager;
import defpackage.xhj;
import defpackage.xhr;
import defpackage.xin;
import health.compact.a.BuildConfigProperties;
import health.compact.a.LogUtil;
import health.compact.a.ProcessUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes20.dex */
public class TransferFileQueueManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile TransferFileQueueManager f29864b;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinkedList<xhr> f29865a = new LinkedList<>();
    private Semaphore e = new Semaphore(1);

    public enum TaskMode {
        ENGINE,
        APP
    }

    private TransferFileQueueManager() {
        if (BuildConfigProperties.a("IS_RELEASE_VERSION", false)) {
            return;
        }
        String strC = ProcessUtil.c();
        if (TextUtils.isEmpty(strC) || ProcessUtil.e(":PhoneService").equals(strC)) {
            return;
        }
        throw new RuntimeException("TransferFileQueueManager do not init in phoneService process." + strC);
    }

    public static TransferFileQueueManager b() {
        TransferFileQueueManager transferFileQueueManager;
        synchronized (d) {
            if (f29864b == null) {
                f29864b = new TransferFileQueueManager();
            }
            transferFileQueueManager = f29864b;
        }
        return transferFileQueueManager;
    }

    public boolean e(xhr xhrVar, String str) {
        LogUtil.b("TransferFileQueueManager", "ready add queue.", str);
        try {
            this.e.acquire();
        } catch (InterruptedException unused) {
            LogUtil.d("TransferFileQueueManager", "addQueueToHead acquire exception.");
        }
        LogUtil.b("TransferFileQueueManager", "mQueueMap.size() ", Integer.valueOf(this.f29865a.size()));
        this.f29865a.add(xhrVar);
        boolean z = this.f29865a.size() == 1;
        this.e.release();
        if (xhrVar != null) {
            ReleaseLogUtil.c("R_TransferFileQueueManager", "add queue success.", str, " result : ", Integer.valueOf(this.f29865a.size()), "file type : ", Integer.valueOf(xhrVar.y()));
        }
        return z;
    }

    public void i(String str) {
        LogUtil.b("TransferFileQueueManager", "ready remove head task by queue.", str);
        try {
            this.e.acquire();
        } catch (InterruptedException unused) {
            LogUtil.d("TransferFileQueueManager", "removeHeadTask acquire exception.");
        }
        if (this.f29865a.isEmpty()) {
            LogUtil.e("TransferFileQueueManager", "wrong, no task in queue, please check your code.");
        } else {
            xhr xhrVarRemove = this.f29865a.remove(0);
            LogUtil.b("TransferFileQueueManager", "remove task : ", xhrVarRemove.n(), " id ： ", Integer.valueOf(xhrVarRemove.m()));
        }
        this.e.release();
        LogUtil.b("TransferFileQueueManager", "ready remove head task by queue success.", str);
    }

    public List<xhr> d(String str) {
        LogUtil.b("TransferFileQueueManager", "ready getAllTask.", str);
        try {
            this.e.acquire();
        } catch (InterruptedException unused) {
            LogUtil.d("TransferFileQueueManager", "getAllTask acquire exception.");
        }
        LinkedList linkedList = new LinkedList(this.f29865a);
        this.e.release();
        LogUtil.b("TransferFileQueueManager", "getAllTask success.", str);
        return linkedList;
    }

    public List<xhr> a(String str) {
        LinkedList linkedList;
        try {
            this.e.acquire();
        } catch (InterruptedException unused) {
            LogUtil.d("TransferFileQueueManager", "getTaskNoHeader acquire exception.");
        }
        if (this.f29865a.isEmpty() || this.f29865a.size() == 1) {
            linkedList = new LinkedList();
        } else {
            linkedList = new LinkedList(this.f29865a);
            linkedList.remove(0);
        }
        this.e.release();
        return linkedList;
    }

    public xhr e(String str, int i, String str2) {
        LogUtil.b("TransferFileQueueManager", "ready stopInQueue queue.", str);
        xhr xhrVar = null;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            this.e.acquire();
        } catch (InterruptedException unused) {
            LogUtil.d("TransferFileQueueManager", "stopInQueue acquire exception.");
        }
        if (this.f29865a.size() > 1) {
            for (int i2 = 1; i2 < this.f29865a.size(); i2++) {
                xhr xhrVar2 = this.f29865a.get(i2);
                int iY = xhrVar2.y();
                String strN = xhrVar2.n();
                if (i == iY && str2.equalsIgnoreCase(strN)) {
                    this.f29865a.remove(i2);
                    xhrVar = xhrVar2;
                    break;
                }
            }
        }
        this.e.release();
        LogUtil.b("TransferFileQueueManager", "stopInQueue queue success.", str);
        return xhrVar;
    }

    public void e(String str) {
        xhr xhrVar;
        LogUtil.b("TransferFileQueueManager", "ready nextTaskFromQueue.", str);
        try {
            this.e.acquire();
        } catch (InterruptedException unused) {
            LogUtil.d("TransferFileQueueManager", "nextTaskFromQueue acquire exception.");
        }
        xhr xhrVar2 = null;
        if (this.f29865a.isEmpty()) {
            LogUtil.e("TransferFileQueueManager", "wrong, no task in queue, please check your code.");
            xhrVar = null;
        } else {
            xhr xhrVarRemove = this.f29865a.remove(0);
            if (this.f29865a.isEmpty()) {
                LogUtil.b("TransferFileQueueManager", "no next task");
            } else {
                xhrVar2 = this.f29865a.get(0);
            }
            xhr xhrVar3 = xhrVar2;
            xhrVar2 = xhrVarRemove;
            xhrVar = xhrVar3;
        }
        this.e.release();
        LogUtil.b("TransferFileQueueManager", "nextTaskFromQueue success.", str);
        if (xhrVar2 != null) {
            HwWifiP2pTransferManager.a().f(xhrVar2.w());
            ReleaseLogUtil.c("R_TransferFileQueueManager", "file type : ", Integer.valueOf(xhrVar2.y()), " finish");
        }
        if (xhrVar == null) {
            return;
        }
        if (xhrVar.au()) {
            LogUtil.b("TransferFileQueueManager", "next task is wifi uplink");
            xin.d().b(xhrVar);
            return;
        }
        TaskMode taskModeAk = xhrVar.ak();
        int iOrdinal = taskModeAk.ordinal();
        if (iOrdinal == 0) {
            LogUtil.b("TransferFileQueueManager", "next task is engine mode.");
            xhj.c().d(xhrVar.h(), xhrVar);
        } else if (iOrdinal == 1) {
            LogUtil.b("TransferFileQueueManager", "next task is app mode.");
            xhj.c().a(xhrVar);
        } else {
            LogUtil.e("TransferFileQueueManager", "no adapter mode : ", taskModeAk);
        }
    }

    public xhr b(String str) {
        LogUtil.b("TransferFileQueueManager", "getHeadTask : ", str);
        try {
            this.e.acquire();
        } catch (InterruptedException unused) {
            LogUtil.d("TransferFileQueueManager", "getHeadTask acquire exception.");
        }
        xhr xhrVarPeek = this.f29865a.peek();
        this.e.release();
        return xhrVarPeek;
    }

    public void c(String str) {
        LogUtil.b("TransferFileQueueManager", "ready clearAllTask queue.", str);
        try {
            this.e.acquire();
        } catch (InterruptedException unused) {
            LogUtil.d("TransferFileQueueManager", "clearAllTask acquire exception.");
        }
        this.f29865a.clear();
        this.e.release();
        LogUtil.b("TransferFileQueueManager", "add clearAllTask success.", str);
    }
}
