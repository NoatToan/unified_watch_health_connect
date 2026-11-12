package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.datatypes.TransferFileInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mol {
    private static mol e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private moe f42082b;
    private long j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f42081c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f42080a = new Object();
    private static List<TransferFileInfo> d = new ArrayList(10);
    private d h = new d();
    private IBaseResponseCallback i = new IBaseResponseCallback() { // from class: mol.2
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (obj == null) {
                return;
            }
            synchronized (mol.a()) {
                LogUtil.a("HwFileTransferTaskAw70Queue", "myCallback into lock");
                if (mol.d.isEmpty()) {
                    return;
                }
                LogUtil.a("HwFileTransferTaskAw70Queue", "myCallback transfer finished, number of files in queue is ", Integer.valueOf(mol.d.size()), ", type of the first file in the queue is ", Integer.valueOf(((TransferFileInfo) mol.d.get(0)).getType()));
                Object callback = ((TransferFileInfo) mol.d.get(0)).getCallback();
                ITransferSleepAndDFXFileCallback iTransferSleepAndDFXFileCallback = callback instanceof ITransferSleepAndDFXFileCallback ? (ITransferSleepAndDFXFileCallback) callback : null;
                String strB = mol.this.b();
                if (((TransferFileInfo) mol.d.get(0)).getType() == 0) {
                    moc.e(BaseApplication.getContext(), ((TransferFileInfo) mol.d.get(0)).getDeviceSn());
                    String str = "" + ((System.currentTimeMillis() - mol.this.j) / 1000);
                    SharedPreferenceManager.d(BaseApplication.getContext(), mol.this.j, "EXCE_DFT_APP_SYNSTART_TIME");
                    SharedPreferenceManager.a(BaseApplication.getContext(), "" + i, "EXCE_DFT_APP_SYNSTART");
                    mjh.e("910401", "EXCE_DFT_APP_SYNSTOP", str, strB);
                }
                mol.d.remove(0);
                if (!mol.d.isEmpty() && mol.this.f42082b != null) {
                    LogUtil.a("HwFileTransferTaskAw70Queue", "myCallback still has data in the queue, continue");
                    mol.this.f42082b.c((TransferFileInfo) mol.d.get(0), mol.this.i);
                }
                LogUtil.a("HwFileTransferTaskAw70Queue", "myCallback return result to upper level, the number of files in the queue is ", Integer.valueOf(mol.d.size()));
                mol.this.b(iTransferSleepAndDFXFileCallback, i, obj);
                LogUtil.a("HwFileTransferTaskAw70Queue", "myCallback out of lock");
            }
        }
    };
    private ExtendHandler f = HandlerCenter.b(this.h, "HwFileTransferTaskAw70Queue");

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "HwFileTransferTaskAw70Queue");
        DeviceInfo deviceInfo = deviceList.size() != 0 ? deviceList.get(0) : null;
        if (deviceInfo == null) {
            List<DeviceInfo> deviceList2 = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_AW70_DEVICES, null, "HwFileTransferTaskAw70Queue");
            if (deviceList2.size() != 0) {
                deviceInfo = deviceList2.get(0);
            }
        }
        return mjh.a(deviceInfo);
    }

    private mol() {
        this.f42082b = null;
        this.f42082b = moe.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(ITransferSleepAndDFXFileCallback iTransferSleepAndDFXFileCallback, int i, Object obj) {
        if (this.f == null) {
            LogUtil.j("HwFileTransferTaskAw70Queue", "deliverResponse myHanlder is null");
            return;
        }
        Message messageObtain = Message.obtain();
        if (iTransferSleepAndDFXFileCallback != null) {
            if (i == 10000) {
                mnv mnvVar = new mnv();
                mnvVar.c(iTransferSleepAndDFXFileCallback);
                mnvVar.a(obj.toString());
                mnvVar.e((Object) null);
                messageObtain.obj = mnvVar;
                messageObtain.what = 0;
                messageObtain.arg1 = i;
                this.f.sendMessage(messageObtain);
                return;
            }
            if (i == 110002) {
                LogUtil.e("HwFileTransferTaskAw70Queue", "error getting LEO log file name");
                return;
            }
            mnv mnvVar2 = new mnv();
            mnvVar2.c(iTransferSleepAndDFXFileCallback);
            mnvVar2.a(obj.toString());
            messageObtain.obj = mnvVar2;
            messageObtain.what = 0;
            messageObtain.arg1 = i;
            this.f.sendMessage(messageObtain);
        }
    }

    public static mol d() {
        mol molVar;
        synchronized (f42080a) {
            if (e == null) {
                e = new mol();
            }
            molVar = e;
        }
        return molVar;
    }

    public void b(TransferFileInfo transferFileInfo, Object obj) {
        if (transferFileInfo == null || obj == null) {
            LogUtil.j("HwFileTransferTaskAw70Queue", "getFile, transferFileInfo is null or object is null, return");
            return;
        }
        synchronized (a()) {
            LogUtil.a("HwFileTransferTaskAw70Queue", "getFile into lock");
            List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_AW70_DEVICES, null, "HwFileTransferTaskAw70Queue");
            if ((deviceList.size() > 0 ? deviceList.get(0) : null) == null) {
                LogUtil.j("HwFileTransferTaskAw70Queue", "no aw70 device connected");
                return;
            }
            if (d.isEmpty()) {
                LogUtil.a("HwFileTransferTaskAw70Queue", "getFile size is 0");
                transferFileInfo.setCallback(obj);
                LogUtil.a("HwFileTransferTaskAw70Queue", "getFile transferFileInfo callback is ", transferFileInfo.getCallback(), " transferFileInfo type is ", Integer.valueOf(transferFileInfo.getType()));
                d.add(transferFileInfo);
                this.f42082b.c(transferFileInfo, this.i);
            } else {
                LogUtil.a("HwFileTransferTaskAw70Queue", "getFile size = ", Integer.valueOf(d.size()));
                transferFileInfo.setCallback(obj);
                LogUtil.a("HwFileTransferTaskAw70Queue", "getFile transferFileInfo callback is ", transferFileInfo.getCallback(), " transferFileInfo type is ", Integer.valueOf(transferFileInfo.getType()));
                c(d, transferFileInfo);
            }
            LogUtil.a("HwFileTransferTaskAw70Queue", "getFile out of lock");
        }
    }

    public void d(long j) {
        this.j = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object a() {
        Object obj;
        synchronized (mol.class) {
            obj = f42081c;
        }
        return obj;
    }

    private void c(List<TransferFileInfo> list, TransferFileInfo transferFileInfo) {
        for (int i = 0; i < list.size(); i++) {
            if (transferFileInfo.getType() == list.get(i).getType() && list.get(i).getTaskType() == transferFileInfo.getTaskType()) {
                list.remove(list.get(i));
                list.add(i, transferFileInfo);
                return;
            }
        }
        list.add(transferFileInfo);
    }

    static class d implements Handler.Callback {
        private d() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 0) {
                if (!(message.obj instanceof mnv)) {
                    LogUtil.j("HwFileTransferTaskAw70Queue", "msg.obj not instanceof TransferTaskInfo");
                    return false;
                }
                mnv mnvVar = (mnv) message.obj;
                try {
                    Object objA = mnvVar.a();
                    ITransferSleepAndDFXFileCallback iTransferSleepAndDFXFileCallback = objA instanceof ITransferSleepAndDFXFileCallback ? (ITransferSleepAndDFXFileCallback) objA : null;
                    if (iTransferSleepAndDFXFileCallback != null) {
                        LogUtil.a("HwFileTransferTaskAw70Queue", "maintance return");
                        if (message.arg1 == 10000) {
                            iTransferSleepAndDFXFileCallback.onSuccess(message.arg1, mnvVar.d().toString(), null);
                        } else {
                            iTransferSleepAndDFXFileCallback.onFailure(message.arg1, mnvVar.d().toString());
                        }
                    } else {
                        LogUtil.j("HwFileTransferTaskAw70Queue", "maintance dfxCallback = null");
                    }
                } catch (RemoteException unused) {
                    LogUtil.e("HwFileTransferTaskAw70Queue", "maintance RemoteException");
                }
                return true;
            }
            LogUtil.j("HwFileTransferTaskAw70Queue", "MyHandler unknown message");
            return false;
        }
    }
}
