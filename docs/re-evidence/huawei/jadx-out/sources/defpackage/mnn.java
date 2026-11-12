package defpackage;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.callback.TransferFileCallback;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.HwGetDevicesParameter;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.datatypes.TransferFileInfo;
import com.huawei.hwdevice.mainprocess.receiver.hwdfx.DeviceTriggerDfxReceiver;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes11.dex */
public class mnn {
    private static mnn d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IBaseResponseCallback f42014b = new IBaseResponseCallback() { // from class: mnn.4
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            ITransferSleepAndDFXFileCallback iTransferSleepAndDFXFileCallback;
            TransferFileCallback transferFileCallback;
            synchronized (mnn.c()) {
                LogUtil.a("HwFileTransferTaskQueue", "mCallback enter lock.");
                mnf.c(0);
                if (mnn.e.size() == 0) {
                    ReleaseLogUtil.d("Dfx_HwFileTransferTaskQueue", "mCallback enter and size is 0.");
                    mnf.d(mnf.d(), mnf.e());
                    return;
                }
                ReleaseLogUtil.d("Dfx_HwFileTransferTaskQueue", "mCallback transfer over,callbacks.size() is ", Integer.valueOf(mnn.e.size()), " callbacks.get(0).getType() is ", Integer.valueOf(((TransferFileInfo) mnn.e.get(0)).getType()));
                TransferFileInfo transferFileInfo = (TransferFileInfo) mnn.e.get(0);
                if (transferFileInfo.getType() == 1 && (transferFileInfo.getCallback() instanceof TransferFileCallback)) {
                    transferFileCallback = (TransferFileCallback) transferFileInfo.getCallback();
                    iTransferSleepAndDFXFileCallback = null;
                } else if (transferFileInfo.getCallback() instanceof ITransferSleepAndDFXFileCallback) {
                    iTransferSleepAndDFXFileCallback = (ITransferSleepAndDFXFileCallback) transferFileInfo.getCallback();
                    transferFileCallback = null;
                } else {
                    ReleaseLogUtil.e("Dfx_HwFileTransferTaskQueue", "transferFileInfo instanceof unKnow");
                    iTransferSleepAndDFXFileCallback = null;
                    transferFileCallback = null;
                }
                String strA = mjh.a(mnn.this.c(transferFileInfo.getDeviceSn()));
                if (i != 20000 && i != 20001) {
                    mnn.this.c(i, strA);
                }
                mnn.this.b(i, obj, iTransferSleepAndDFXFileCallback, transferFileCallback, transferFileInfo);
                LogUtil.a("HwFileTransferTaskQueue", "mCallback exit lock.");
            }
        }
    };
    private Object f;
    private mnm g;
    private ExtendHandler h;
    private TransferFileInfo i;
    private long j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f42012a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f42013c = new Object();
    private static List<TransferFileInfo> e = new ArrayList(16);

    private mnn() {
        this.g = null;
        this.h = null;
        this.g = mnm.a();
        this.h = HandlerCenter.b(new b(), "HwFileTransferTaskQueue");
    }

    public DeviceInfo c(String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("Dfx_HwFileTransferTaskQueue", "deviceSn is null");
            return null;
        }
        HwGetDevicesParameter hwGetDevicesParameter = new HwGetDevicesParameter();
        hwGetDevicesParameter.setDeviceIdentify(str);
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.IDENTIFY_DEVICES, hwGetDevicesParameter, "HwFileTransferTaskQueue");
        DeviceInfo deviceInfo = deviceList.size() != 0 ? deviceList.get(0) : null;
        if (deviceInfo == null) {
            deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "HwFileTransferTaskQueue");
        }
        if (deviceList.size() != 0) {
            deviceInfo = deviceList.get(0);
        }
        if (deviceInfo == null) {
            List<DeviceInfo> deviceList2 = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_AW70_DEVICES, null, "HwFileTransferTaskQueue");
            if (deviceList2.size() != 0) {
                return deviceList2.get(0);
            }
        }
        return deviceInfo;
    }

    public static mnn a() {
        mnn mnnVar;
        synchronized (f42012a) {
            if (d == null) {
                d = new mnn();
            }
            mnnVar = d;
        }
        return mnnVar;
    }

    public void e(long j) {
        this.j = j;
    }

    public void e(TransferFileInfo transferFileInfo, Object obj) {
        if (transferFileInfo.getLogPreExport() == 1) {
            this.i = transferFileInfo;
            this.f = obj;
            DeviceInfo deviceInfoC = c(transferFileInfo.getDeviceSn());
            LogUtil.a("HwFileTransferTaskQueue", "getFile exportKind: ", transferFileInfo.getLogPreExportKind());
            if (mnd.c().b()) {
                LogUtil.a("HwFileTransferTaskQueue", "getFile isExportingEvent is true handleGetFile");
                b(transferFileInfo, obj);
                return;
            } else {
                LogUtil.a("HwFileTransferTaskQueue", "start sendDeviceEvent exportKind: ", transferFileInfo.getLogPreExportKind());
                mnd.c().c(transferFileInfo.getLogPreExportKind(), deviceInfoC);
                return;
            }
        }
        b(transferFileInfo, obj);
    }

    private void b(TransferFileInfo transferFileInfo, Object obj) {
        LogUtil.a("HwFileTransferTaskQueue", "getFile handleGetFile");
        synchronized (c()) {
            LogUtil.a("HwFileTransferTaskQueue", "getFile entry lock.");
            String str = "start traansFile, getFile modelType is" + transferFileInfo.getType();
            LogUtil.a("HwFileTransferTaskQueue", "getCallbacksObject object: ", obj);
            LogUtil.a("HwFileTransferTaskQueue", str);
            if (d(transferFileInfo, obj)) {
                return;
            }
            h();
            i(transferFileInfo, obj);
            LogUtil.a("HwFileTransferTaskQueue", "getFile exit lock.");
        }
    }

    public void a(int i, DeviceInfo deviceInfo, int i2) {
        if (i == 0) {
            LogUtil.a("HwFileTransferTaskQueue", "dealPreLogFeedBack executeResponse progress : ", Integer.valueOf(i2));
            if (i2 == 100) {
                b(this.i, this.f);
                return;
            }
            return;
        }
        if (i != 1) {
            LogUtil.j("HwFileTransferTaskQueue", "dealPreLogFeedBack others");
            b(this.i, this.f);
        } else {
            LogUtil.a("HwFileTransferTaskQueue", "dealPreLogFeedBack executeResponse timeout");
            b(this.i, this.f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x005b  */
    private boolean d(TransferFileInfo transferFileInfo, Object obj) {
        LogUtil.a("HwFileTransferTaskQueue", "enter processDfxTask object: ", obj);
        DeviceInfo deviceInfo = null;
        if (TextUtils.isEmpty(transferFileInfo.getDeviceSn())) {
            LogUtil.a("HwFileTransferTaskQueue", "processDfxTask transferFileInfo.getDeviceSn() is null");
            List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "HwFileTransferTaskQueue");
            DeviceInfo deviceInfo2 = deviceList.size() != 0 ? deviceList.get(0) : null;
            if (deviceInfo2 == null) {
                LogUtil.a("HwFileTransferTaskQueue", "processDfxTask deviceInfo is null");
                List<DeviceInfo> deviceList2 = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_AW70_DEVICES, null, "HwFileTransferTaskQueue");
                if (deviceList2.size() != 0) {
                    deviceInfo = deviceList2.get(0);
                } else {
                    deviceInfo = deviceInfo2;
                }
            } else {
                deviceInfo = deviceInfo2;
            }
        } else {
            HwGetDevicesParameter hwGetDevicesParameter = new HwGetDevicesParameter();
            hwGetDevicesParameter.setDeviceIdentify(transferFileInfo.getDeviceSn());
            List<DeviceInfo> deviceList3 = ecu.d().getDeviceList(HwGetDevicesMode.IDENTIFY_DEVICES, hwGetDevicesParameter, "HwFileTransferTaskQueue");
            if (deviceList3 != null && deviceList3.size() != 0) {
                deviceInfo = deviceList3.get(0);
            }
        }
        if (deviceInfo == null) {
            c(transferFileInfo, obj);
            return true;
        }
        if (eel.d(deviceInfo.getProductType())) {
            if (transferFileInfo.getType() == 0) {
                if (deviceInfo.getAutoDetectSwitchStatus() != 1) {
                    mol.d().b(transferFileInfo, obj);
                    LogUtil.a("HwFileTransferTaskQueue", "processDfxTask  HwFileTransferTaskAw70Queue.getInstance().getFile");
                } else {
                    ReleaseLogUtil.e("Dfx_HwFileTransferTaskQueue", "Work mode don't support DFX.");
                }
            }
            c(transferFileInfo, obj);
            return true;
        }
        LogUtil.a("HwFileTransferTaskQueue", "enter else return false");
        return false;
    }

    private void c(TransferFileInfo transferFileInfo, Object obj) {
        j(transferFileInfo, obj);
        a(transferFileInfo, obj);
        ReleaseLogUtil.e("Dfx_HwFileTransferTaskQueue", "no device connected.");
    }

    private void i(TransferFileInfo transferFileInfo, Object obj) {
        LogUtil.a("HwFileTransferTaskQueue", "taskHandle object: ", obj);
        if (transferFileInfo == null) {
            LogUtil.j("HwFileTransferTaskQueue", "transferFileInfo is null.");
            return;
        }
        ReleaseLogUtil.d("Dfx_HwFileTransferTaskQueue", "getFile size is ", Integer.valueOf(e.size()));
        if (e.size() == 0) {
            if (transferFileInfo.getType() == 200) {
                LogUtil.j("HwFileTransferTaskQueue", "transferFileInfo's type is not rela sleep!");
                return;
            }
            transferFileInfo.setCallback(obj);
            LogUtil.a("HwFileTransferTaskQueue", "getFile transferFileInfo.getCallback() is ", transferFileInfo.getCallback(), " transferFileInfo.getType() is " + transferFileInfo.getType());
            e.add(transferFileInfo);
            this.g.c(transferFileInfo, this.f42014b);
            return;
        }
        TransferFileInfo transferFileInfo2 = e.get(0);
        TransferFileInfo transferFileInfoA = lrs.a();
        if (transferFileInfo2 == null || transferFileInfoA == null) {
            LogUtil.j("HwFileTransferTaskQueue", "TransferFileInfo is null.");
            return;
        }
        if (transferFileInfo.getType() == 200) {
            LogUtil.a("HwFileTransferTaskQueue", "transferFileInfo's type is not rela sleep ,and need improve priortiy!");
            if (transferFileInfo2.getType() == 2 && transferFileInfo2.getSuspend() == 0 && transferFileInfo2.getPriority() != 3) {
                LogUtil.a("HwFileTransferTaskQueue", "transferFileInfo's type is not rela sleep ,and the priortiy is improved!");
                transferFileInfo2.setPriority(3);
                transferFileInfoA.setPriority(3);
                return;
            }
            return;
        }
        transferFileInfo.setCallback(obj);
        LogUtil.a("HwFileTransferTaskQueue", "getFile transferFileInfo.getCallback() is ", transferFileInfo.getCallback(), " transferFileInfo.getType() is ", Integer.valueOf(transferFileInfo.getType()));
        b(e, transferFileInfo);
    }

    private void h() {
        if (mnf.d() == null || mnf.e() == null) {
            mnf.c(new Timer("HwFileTransferTaskQueue"));
            mnf.c(new TimerTask() { // from class: mnn.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    if (mnf.g()) {
                        mnf.b();
                    }
                    LogUtil.a("HwFileTransferTaskQueue", "FileTransferTimerTask getTimes = ", Integer.valueOf(mnf.f()), ", callbacks size = ", Integer.valueOf(mnn.e.size()));
                    if (mnf.f() > 12) {
                        if (mnn.e.size() != 0) {
                            mnn.this.e();
                            return;
                        } else {
                            mnf.c(0);
                            mnf.d(mnf.d(), mnf.e());
                            return;
                        }
                    }
                    if (mnn.e.size() == 0) {
                        mnf.c(0);
                        mnf.d(mnf.d(), mnf.e());
                    }
                }
            });
            LogUtil.a("HwFileTransferTaskQueue", "Timer start!");
            mnf.c(0);
            mnf.d().schedule(mnf.e(), 0L, 10000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.f42014b == null || e.size() <= 0) {
            return;
        }
        if (e.get(0).getType() == 1) {
            this.g.aa();
        } else {
            this.g.ab();
            if (this.g.x()) {
                mnr.b().d("IS_CONTINUE", "true");
                mnf.d(mnf.a(), mnf.c());
            }
        }
        mjh.e(e.get(0), 10001, "Forced interruption task", this.f42014b);
    }

    private void j(TransferFileInfo transferFileInfo, Object obj) {
        if (transferFileInfo.getType() == 4) {
            try {
                if (obj instanceof ITransferSleepAndDFXFileCallback) {
                    ((ITransferSleepAndDFXFileCallback) obj).onFailure(100001, "no device connected");
                }
            } catch (RemoteException unused) {
                LogUtil.e("HwFileTransferTaskQueue", "setRriCallback RemoteException.");
            }
        }
    }

    private void a(TransferFileInfo transferFileInfo, Object obj) {
        LogUtil.a("HwFileTransferTaskQueue", "enter setCoreSleepBack.");
        if (transferFileInfo.getType() == 2) {
            if (obj instanceof ITransferSleepAndDFXFileCallback) {
                LogUtil.a("HwFileTransferTaskQueue", "ready set back.");
                try {
                    ((ITransferSleepAndDFXFileCallback) obj).onFailure(100001, "no device connected");
                    return;
                } catch (RemoteException unused) {
                    LogUtil.e("HwFileTransferTaskQueue", "setCoreSleepBack RemoteException.");
                    return;
                }
            }
            LogUtil.j("HwFileTransferTaskQueue", "setCoreSleepBack call back in null.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object c() {
        Object obj;
        synchronized (mnn.class) {
            obj = f42013c;
        }
        return obj;
    }

    private void b(List<TransferFileInfo> list, TransferFileInfo transferFileInfo) {
        LogUtil.a("HwFileTransferTaskQueue", "enter getType");
        int i = -1;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list.get(i2).getPriority() < transferFileInfo.getPriority()) {
                if (!c(list, transferFileInfo, i2)) {
                    break;
                } else {
                    return;
                }
            }
            if (list.get(i2).getPriority() == transferFileInfo.getPriority()) {
                if (transferFileInfo.getType() == 1 || a(list.get(i2), transferFileInfo)) {
                    i = i2;
                } else if (list.get(i2).getType() == transferFileInfo.getType() && list.get(i2).getTaskType() == transferFileInfo.getTaskType()) {
                    LogUtil.a("HwFileTransferTaskQueue", "same task, override current task");
                    int suspend = list.get(i2).getSuspend();
                    list.remove(list.get(i2));
                    transferFileInfo.setSuspend(suspend);
                    list.add(i2, transferFileInfo);
                    return;
                }
            } else {
                LogUtil.d("Dfx_HwFileTransferTaskQueue", "compare next task.");
            }
        }
        LogUtil.a("HwFileTransferTaskQueue", "the task insert queue");
        if (i == -1) {
            list.add(transferFileInfo);
        } else {
            list.add(i + 1, transferFileInfo);
        }
    }

    private boolean a(TransferFileInfo transferFileInfo, TransferFileInfo transferFileInfo2) {
        if (transferFileInfo == null || transferFileInfo2 == null || transferFileInfo2.getType() != 0 || transferFileInfo.getDeviceSn() == null || transferFileInfo2.getDeviceSn() == null) {
            return false;
        }
        boolean zEquals = transferFileInfo.getDeviceSn().equals(transferFileInfo2.getDeviceSn());
        if (transferFileInfo2.getTaskType() != 2 || zEquals) {
            return false;
        }
        LogUtil.a("HwFileTransferTaskQueue", "insert task queue");
        return true;
    }

    private boolean c(List<TransferFileInfo> list, TransferFileInfo transferFileInfo, int i) {
        if (i == 0) {
            if (e.get(i).getSuspend() == 1) {
                return false;
            }
            list.add(i + 1, transferFileInfo);
            list.get(i).setSuspend(1);
            if (lrs.a() != null) {
                lrs.a().setSuspend(1);
            }
            ReleaseLogUtil.d("Dfx_HwFileTransferTaskQueue", "transferFileInfos FILE_TRANSFER_SUSPENDED.");
            return true;
        }
        list.add(i, transferFileInfo);
        return true;
    }

    static class b implements Handler.Callback {
        private b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.obj instanceof mnv) {
                mnv mnvVar = (mnv) message.obj;
                int i = message.what;
                if (i == 0) {
                    b(mnvVar, message);
                    return true;
                }
                if (i == 1) {
                    LogUtil.a("HwFileTransferTaskQueue", "GPS callback return, and return errorCode = ", Integer.valueOf(message.arg1));
                    if (message.arg1 != 104003 && (mnvVar.a() instanceof TransferFileCallback)) {
                        ((TransferFileCallback) mnvVar.a()).onResponse(message.arg1, mnvVar.d());
                    }
                    return true;
                }
                if (i == 2) {
                    d(mnvVar, message);
                    return true;
                }
                if (i == 4) {
                    c(mnvVar, message);
                    return true;
                }
                LogUtil.j("HwFileTransferTaskQueue", "task type is default branch.");
                return false;
            }
            LogUtil.j("HwFileTransferTaskQueue", "inputMessage.obj is null.");
            return false;
        }

        private void d(mnv mnvVar, Message message) {
            try {
                ITransferSleepAndDFXFileCallback iTransferSleepAndDFXFileCallback = (ITransferSleepAndDFXFileCallback) mnvVar.a();
                if (iTransferSleepAndDFXFileCallback != null && message != null) {
                    LogUtil.a("HwFileTransferTaskQueue", "core sleep enter.");
                    if (message.arg1 == 10000) {
                        iTransferSleepAndDFXFileCallback.onSuccess(message.arg1, mnvVar.d() instanceof String ? (String) mnvVar.d() : "", mnvVar.f() instanceof String ? (String) mnvVar.f() : "");
                        return;
                    }
                    if (message.arg1 == 20000) {
                        iTransferSleepAndDFXFileCallback.onProgress(message.arg2, null);
                        return;
                    } else if (message.arg1 == 104003) {
                        LogUtil.a("HwFileTransferTaskQueue", "core sleep errorcode.");
                        return;
                    } else {
                        iTransferSleepAndDFXFileCallback.onFailure(message.arg1, mnvVar.d() instanceof String ? (String) mnvVar.d() : "");
                        return;
                    }
                }
                LogUtil.j("HwFileTransferTaskQueue", "sleep return with parameter is null.");
            } catch (RemoteException unused) {
                LogUtil.e("HwFileTransferTaskQueue", "sleep return with RemoteException.");
            }
        }

        private void b(mnv mnvVar, Message message) {
            try {
                ITransferSleepAndDFXFileCallback iTransferSleepAndDFXFileCallback = (ITransferSleepAndDFXFileCallback) mnvVar.a();
                if (iTransferSleepAndDFXFileCallback != null && message != null) {
                    LogUtil.a("HwFileTransferTaskQueue", "maintance callback return.");
                    if (message.arg1 == 10000) {
                        iTransferSleepAndDFXFileCallback.onSuccess(message.arg1, mnvVar.d().toString(), null);
                        return;
                    }
                    if (message.arg1 == 20001) {
                        iTransferSleepAndDFXFileCallback.onProgress(message.arg2, mnvVar.d().toString());
                        return;
                    } else if (message.arg1 == 104003) {
                        ReleaseLogUtil.d("Dfx_HwFileTransferTaskQueue", "interrupt code DFX.");
                        return;
                    } else {
                        iTransferSleepAndDFXFileCallback.onFailure(message.arg1, mnvVar.d().toString());
                        return;
                    }
                }
                ReleaseLogUtil.e("Dfx_HwFileTransferTaskQueue", "DFX return with parameter is null.");
            } catch (RemoteException e) {
                ReleaseLogUtil.a("Dfx_HwFileTransferTaskQueue", "DFX retrun with RemoteException. e = ", ExceptionUtils.c(e));
                if (message.arg1 == 10000) {
                    d(mnvVar);
                    ReleaseLogUtil.d("Dfx_HwFileTransferTaskQueue", "RemoteException dfx success");
                } else if (message.arg1 == 20001) {
                    LogUtil.a("HwFileTransferTaskQueue", "RemoteException dfx progress");
                } else if (message.arg1 == 104003) {
                    ReleaseLogUtil.d("Dfx_HwFileTransferTaskQueue", "RemoteException interrupt code DFX.");
                } else {
                    d(mnvVar);
                    ReleaseLogUtil.d("Dfx_HwFileTransferTaskQueue", "RemoteException dfx fail");
                }
            }
        }

        private void d(mnv mnvVar) {
            ReleaseLogUtil.d("Dfx_HwFileTransferTaskQueue", "enter intentTriggerReceiver preExport: ", Integer.valueOf(mnvVar.e()));
            if (mnvVar.e() == 1) {
                String strB = mnvVar.b();
                LogUtil.a("HwFileTransferTaskQueue", "intentTriggerReceiver kind: ", mnvVar.c());
                Intent intent = new Intent("com.huawei.bone.dfx.device_trigger_upload_log");
                intent.setPackage(BaseApplication.getAppPackage());
                intent.putExtra("pre_log_export_mac", strB);
                intent.setClass(BaseApplication.getContext(), DeviceTriggerDfxReceiver.class);
                BaseApplication.getContext().sendBroadcast(intent, LocalBroadcast.f36595c);
                return;
            }
            ReleaseLogUtil.a("HwFileTransferTaskQueue", "intentTriggerReceiver kind: other: ", mnvVar.c());
            xjt.r("HwFileTransferTaskQueueDFX return with RemoteException. enter intentTriggerReceiver preExport: " + mnvVar.e());
        }

        private void c(mnv mnvVar, Message message) {
            try {
                ITransferSleepAndDFXFileCallback iTransferSleepAndDFXFileCallback = (ITransferSleepAndDFXFileCallback) mnvVar.a();
                if (iTransferSleepAndDFXFileCallback != null && message != null) {
                    LogUtil.a("HwFileTransferTaskQueue", "RRI callback retrun. InputMessage.arg1 is", Integer.valueOf(message.arg1));
                    if (message.arg1 == 10000) {
                        iTransferSleepAndDFXFileCallback.onSuccess(message.arg1, mnvVar.d() instanceof String ? (String) mnvVar.d() : "", mnvVar.f() instanceof String ? (String) mnvVar.f() : "");
                        return;
                    }
                    String str = mnvVar.d() instanceof String ? (String) mnvVar.d() : "";
                    LogUtil.a("HwFileTransferTaskQueue", "sync failed with code is ", Integer.valueOf(message.arg1), "sync failed with message is ", str);
                    iTransferSleepAndDFXFileCallback.onFailure(message.arg1, str);
                    return;
                }
                LogUtil.j("HwFileTransferTaskQueue", "RRI return with parameter is null.");
            } catch (RemoteException unused) {
                ReleaseLogUtil.a("Dfx_HwFileTransferTaskQueue", "RRI return with RemoteException.");
                mzj.b().a("HwFileTransferTaskQueue");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, String str) {
        if (i == 104003) {
            ReleaseLogUtil.d("Dfx_HwFileTransferTaskQueue", "The task is interrupted, After deletion,join the task queue again.");
            TransferFileInfo transferFileInfo = e.get(0);
            transferFileInfo.setSuspend(0);
            if (e.get(0).getType() == 0) {
                moc.e(BaseApplication.getContext(), e.get(0).getDeviceSn());
                String str2 = "" + ((System.currentTimeMillis() - this.j) / 1000);
                SharedPreferenceManager.d(BaseApplication.getContext(), this.j, "EXCE_DFT_APP_SYNSTART_TIME");
                SharedPreferenceManager.a(BaseApplication.getContext(), "" + i, "EXCE_DFT_APP_SYNSTART");
                mjh.e("910401", "EXCE_DFT_APP_SYNSTOP", str2, str);
            }
            e.remove(0);
            lrs.b(null);
            b(e, transferFileInfo);
            g();
            if (e.size() != 0) {
                this.g.c(e.get(0), this.f42014b);
            } else {
                mnf.d(mnf.d(), mnf.e());
            }
            ReleaseLogUtil.d("Dfx_HwFileTransferTaskQueue", "retrun sCallbacks.size() is ", Integer.valueOf(e.size()));
            return;
        }
        e(i, str);
        e.remove(0);
        lrs.b(null);
        if (e.size() != 0) {
            this.g.c(e.get(0), this.f42014b);
        } else {
            mnf.d(mnf.d(), mnf.e());
        }
        ReleaseLogUtil.d("Dfx_HwFileTransferTaskQueue", "mCallback retrun with callbacks.size() is ", Integer.valueOf(e.size()));
    }

    private void g() {
        Collections.sort(e, new Comparator<TransferFileInfo>() { // from class: mnn.2
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(TransferFileInfo transferFileInfo, TransferFileInfo transferFileInfo2) {
                return transferFileInfo2.getPriority() - transferFileInfo.getPriority();
            }
        });
    }

    private void e(int i, String str) {
        if (e.get(0).getType() == 0) {
            moc.e(BaseApplication.getContext(), e.get(0).getDeviceSn());
            String str2 = "" + ((System.currentTimeMillis() - this.j) / 1000);
            SharedPreferenceManager.d(BaseApplication.getContext(), this.j, "EXCE_DFT_APP_SYNSTART_TIME");
            SharedPreferenceManager.a(BaseApplication.getContext(), "" + i, "EXCE_DFT_APP_SYNSTART");
            mjh.e("910401", "EXCE_DFT_APP_SYNSTOP", str2, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, Object obj, ITransferSleepAndDFXFileCallback iTransferSleepAndDFXFileCallback, TransferFileCallback transferFileCallback, TransferFileInfo transferFileInfo) {
        Message messageObtain = Message.obtain();
        if (transferFileCallback != null) {
            mnv mnvVar = new mnv();
            mnvVar.c(transferFileCallback);
            mnvVar.a(obj);
            messageObtain.obj = mnvVar;
            messageObtain.what = 1;
            messageObtain.arg1 = i;
            this.h.sendMessage(messageObtain);
            return;
        }
        if (iTransferSleepAndDFXFileCallback == null) {
            LogUtil.j("HwFileTransferTaskQueue", "firstCallback is null.");
            return;
        }
        if (transferFileInfo.getType() == 2 || transferFileInfo.getType() == 4) {
            d(i, obj, iTransferSleepAndDFXFileCallback, transferFileInfo.getType(), messageObtain);
            return;
        }
        if (i == 10000) {
            mnv mnvVar2 = new mnv();
            mnvVar2.c(iTransferSleepAndDFXFileCallback);
            mnvVar2.a(obj.toString());
            mnvVar2.e((Object) null);
            mnvVar2.d(transferFileInfo.getLogPreExport());
            mnvVar2.b(transferFileInfo.getDeviceMac());
            mnvVar2.e(transferFileInfo.getLogPreExportKind());
            messageObtain.obj = mnvVar2;
            messageObtain.what = 0;
            messageObtain.arg1 = i;
            this.h.sendMessage(messageObtain, 350L);
            return;
        }
        if (i == 20001) {
            c(i, obj, iTransferSleepAndDFXFileCallback, messageObtain, transferFileInfo);
            return;
        }
        if (i == 110002) {
            LogUtil.j("HwFileTransferTaskQueue", "error code is 110002.");
            return;
        }
        mnv mnvVar3 = new mnv();
        mnvVar3.c(iTransferSleepAndDFXFileCallback);
        mnvVar3.a(obj.toString());
        mnvVar3.d(transferFileInfo.getLogPreExport());
        mnvVar3.b(transferFileInfo.getDeviceMac());
        mnvVar3.e(transferFileInfo.getLogPreExportKind());
        messageObtain.obj = mnvVar3;
        messageObtain.what = 0;
        messageObtain.arg1 = i;
        this.h.sendMessage(messageObtain);
    }

    private void d(int i, Object obj, ITransferSleepAndDFXFileCallback iTransferSleepAndDFXFileCallback, int i2, Message message) {
        if (i == 10000) {
            try {
                mnt mntVar = (mnt) obj;
                String strA = mntVar.a();
                String strE = mntVar.e();
                mnv mnvVar = new mnv();
                mnvVar.c(iTransferSleepAndDFXFileCallback);
                mnvVar.a(strA);
                mnvVar.e((Object) strE);
                if (message == null) {
                    return;
                }
                message.obj = mnvVar;
                message.what = i2;
                message.arg1 = i;
                this.h.sendMessage(message);
                return;
            } catch (ClassCastException unused) {
                ReleaseLogUtil.a("Dfx_HwFileTransferTaskQueue", "classCastException.");
                return;
            }
        }
        if (i == 20000) {
            mnt mntVar2 = obj instanceof mnt ? (mnt) obj : null;
            if (mntVar2 == null) {
                LogUtil.j("HwFileTransferTaskQueue", "coreSleepInfo is null.");
                return;
            }
            int iC = mntVar2.c();
            LogUtil.a("HwFileTransferTaskQueue", "myHanlder SleepProgress is", Integer.valueOf(iC));
            mnv mnvVar2 = new mnv();
            mnvVar2.c(iTransferSleepAndDFXFileCallback);
            message.obj = mnvVar2;
            message.what = i2;
            message.arg1 = i;
            message.arg2 = iC;
            this.h.sendMessage(message);
            return;
        }
        mnv mnvVar3 = new mnv();
        mnvVar3.c(iTransferSleepAndDFXFileCallback);
        mnvVar3.a(obj.toString());
        message.obj = mnvVar3;
        message.what = i2;
        message.arg1 = i;
        this.h.sendMessage(message);
    }

    private void c(int i, Object obj, ITransferSleepAndDFXFileCallback iTransferSleepAndDFXFileCallback, Message message, TransferFileInfo transferFileInfo) {
        int i2;
        String[] strArrSplit = ((String) obj).split("&");
        if (strArrSplit.length < 2) {
            return;
        }
        try {
            i2 = Integer.parseInt(strArrSplit[0]);
        } catch (NumberFormatException unused) {
            ReleaseLogUtil.a("Dfx_HwFileTransferTaskQueue", "unTLVGetFrameData NumberFormatException.");
            i2 = 0;
        }
        mnv mnvVar = new mnv();
        mnvVar.c(iTransferSleepAndDFXFileCallback);
        mnvVar.a(strArrSplit[1]);
        mnvVar.e((Object) null);
        mnvVar.d(transferFileInfo.getLogPreExport());
        mnvVar.b(transferFileInfo.getDeviceMac());
        mnvVar.e(transferFileInfo.getLogPreExportKind());
        message.obj = mnvVar;
        message.what = 0;
        message.arg1 = i;
        message.arg2 = i2;
        this.h.sendMessage(message);
    }
}
