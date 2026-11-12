package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwdevice.phoneprocess.mgr.hwsynctaskmanager.synctask.AbstractSyncTask;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataJsApi;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes11.dex */
public class mzm extends AbstractSyncTask {
    private static final LinkedList<mvh> e = new LinkedList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f42758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DeviceInfo f42759c;
    private mzh d;

    public mzm(DeviceInfo deviceInfo, mzh mzhVar, long j) {
        StringBuilder sb = new StringBuilder("CommonDataDicSyncTask ");
        sb.append(deviceInfo == null ? "" : deviceInfo.getDeviceName());
        sb.append("_");
        sb.append(mzhVar.a());
        sb.append("_");
        sb.append(j);
        super(sb.toString());
        this.f42759c = deviceInfo;
        this.d = mzhVar;
        this.f42758b = j;
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwsynctaskmanager.synctask.AbstractSyncTask
    public void startTask(IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("CommonDataDicSyncTask", "startTask callback is null");
            return;
        }
        DeviceInfo deviceInfo = this.f42759c;
        if (deviceInfo == null) {
            LogUtil.j("CommonDataDicSyncTask", "initSyncData deviceInfo is null");
            iBaseResponseCallback.a(-1, null);
        } else if (deviceInfo.getDeviceConnectState() != 2) {
            LogUtil.j("CommonDataDicSyncTask", "initSyncData device is not connected");
            iBaseResponseCallback.a(-1, null);
        } else {
            LogUtil.a("CommonDataDicSyncTask", "CommonDataDicSyncTask begin: ", this.f42759c.getDeviceName(), " timeTag: ", Long.valueOf(this.f42758b));
            d(iBaseResponseCallback);
            LogUtil.a("CommonDataDicSyncTask", "CommonDataDicSyncTask over: ", this.f42759c.getDeviceName(), " timeTag: ", Long.valueOf(this.f42758b));
        }
    }

    private void d(IBaseResponseCallback iBaseResponseCallback) {
        if (this.d.a() == -1) {
            d();
            this.d.c(new LinkedList<>(e));
            a(iBaseResponseCallback);
            return;
        }
        e(iBaseResponseCallback);
    }

    private void d() {
        if (e.isEmpty()) {
            e();
        }
    }

    private void e() {
        LinkedList<mvh> linkedList = e;
        linkedList.add(new mvh(500035, MatterDataJsApi.MATTER_PACKAGE_NAME, MatterDataJsApi.APP_PACKAGE_NAME));
        linkedList.add(new mvh(500036, MatterDataJsApi.MATTER_PACKAGE_NAME, MatterDataJsApi.APP_PACKAGE_NAME));
        linkedList.add(new mvh(500037, MatterDataJsApi.MATTER_PACKAGE_NAME, MatterDataJsApi.APP_PACKAGE_NAME));
        linkedList.add(new mvh(500038, MatterDataJsApi.MATTER_PACKAGE_NAME, MatterDataJsApi.APP_PACKAGE_NAME));
        linkedList.add(new mvh(500039, MatterDataJsApi.MATTER_PACKAGE_NAME, MatterDataJsApi.APP_PACKAGE_NAME));
        linkedList.add(new mvh(500040, MatterDataJsApi.MATTER_PACKAGE_NAME, MatterDataJsApi.APP_PACKAGE_NAME));
        linkedList.add(new mvh(500041, MatterDataJsApi.MATTER_PACKAGE_NAME, MatterDataJsApi.APP_PACKAGE_NAME));
    }

    private void e(IBaseResponseCallback iBaseResponseCallback) {
        LinkedList<mvh> linkedListC = this.d.c();
        if (linkedListC == null) {
            LogUtil.j("CommonDataDicSyncTask", "DictionaryInfos is null");
            iBaseResponseCallback.a(-1, null);
            return;
        }
        if (linkedListC.size() != 1) {
            LogUtil.j("CommonDataDicSyncTask", "dictionarySingleInfos size is not equal 1, size is " + linkedListC.size());
            iBaseResponseCallback.a(-1, null);
            return;
        }
        try {
            a(linkedListC.getFirst());
            iBaseResponseCallback.a(0, null);
        } catch (NoSuchElementException unused) {
            LogUtil.j("CommonDataDicSyncTask", "dictionarySingleInfos throw exception, size is " + linkedListC.size());
            iBaseResponseCallback.a(-1, null);
        }
    }

    private void a(mvh mvhVar) {
        mzb.e().a(this.f42759c, mvhVar);
    }

    private void a(IBaseResponseCallback iBaseResponseCallback) {
        LinkedList<mvh> linkedListC = this.d.c();
        if (linkedListC == null) {
            LogUtil.j("CommonDataDicSyncTask", "DictionaryInfos is null");
            iBaseResponseCallback.a(-1, null);
        } else {
            Iterator<mvh> it = linkedListC.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            iBaseResponseCallback.a(0, null);
        }
    }
}
