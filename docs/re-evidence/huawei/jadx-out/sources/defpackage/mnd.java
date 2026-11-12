package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwdevicemgr.framework.INoitifyPhoneServiceCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mnd implements DataReceiveCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile mnd f41978a;
    private String e = "0";
    private boolean d = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ExtendHandler f41979b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f41980c = new b();

    private mnd() {
    }

    class b implements Handler.Callback {
        private b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            LogUtil.a("EarPhoneLogPreExportManager", "SyncMgsHandler handleMessage msg: ", Integer.valueOf(message.what));
            if (message.what == 1059) {
                LogUtil.a("EarPhoneLogPreExportManager", "get device earPhone log timeout");
                DeviceInfo deviceInfo = message.obj instanceof DeviceInfo ? (DeviceInfo) message.obj : null;
                mnd.this.f41979b.removeMessages(1059);
                mnd.this.b(false);
                if ("2".equals(mnd.this.e) || "3".equals(mnd.this.e)) {
                    mnn.a().a(1, deviceInfo, 0);
                }
                mnd.this.a(deviceInfo, 0, 1);
                return true;
            }
            LogUtil.j("EarPhoneLogPreExportManager", "SyncMgsHandler default");
            return false;
        }
    }

    private void j() {
        this.f41979b = HandlerCenter.b(this.f41980c, "EarPhoneLogPreExportManager");
    }

    public static mnd c() {
        if (f41978a == null) {
            synchronized (mnd.class) {
                if (f41978a == null) {
                    f41978a = new mnd();
                }
            }
        }
        return f41978a;
    }

    public void e() {
        LogUtil.a("EarPhoneLogPreExportManager", "registerCollectEarPhoneListener: ");
        edc.e().registerDeviceSampleListener("hw.unitedevice.hiviewEarphone", this);
    }

    public void d() {
        LogUtil.a("EarPhoneLogPreExportManager", "unRegisterCollectEarPhoneListener: ");
        edc.e().unRegisterDeviceSampleListener("hw.unitedevice.hiviewEarphone");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(DeviceInfo deviceInfo, int i, int i2) {
        LogUtil.a("EarPhoneLogPreExportManager", "notifyMessageResult enter");
        try {
            INoitifyPhoneServiceCallback iNoitifyPhoneServiceCallbackE = mjy.b().e("earphoneLogPre");
            if (iNoitifyPhoneServiceCallbackE != null) {
                iNoitifyPhoneServiceCallbackE.executeResponse("earphoneLogPre", i2, deviceInfo, i, "");
            } else {
                LogUtil.j("EarPhoneLogPreExportManager", "mCommonCallback is null");
            }
        } catch (RemoteException unused) {
            LogUtil.e("EarPhoneLogPreExportManager", "notifyMessageResult, exception");
        }
    }

    public void c(String str, DeviceInfo deviceInfo) {
        LogUtil.a("EarPhoneLogPreExportManager", "sendDeviceEvent enter");
        if (b()) {
            LogUtil.j("EarPhoneLogPreExportManager", "isExportingEvent is true");
            return;
        }
        b(true);
        LogUtil.a("EarPhoneLogPreExportManager", "sendDeviceEvent sendSampleEventCommand");
        edc.e().sendSampleEventCommand(deviceInfo, a(), "EarPhoneLogPreExportManager");
        if (this.f41979b == null) {
            j();
        }
        this.e = str;
        Message messageObtain = Message.obtain();
        messageObtain.what = 1059;
        messageObtain.obj = deviceInfo;
        this.f41979b.sendMessage(messageObtain, 30000L);
    }

    private static eee a() {
        eee eeeVar = new eee();
        eeeVar.setSrcPkgName("hw.unitedevice.hiviewEarphone");
        eeeVar.setWearPkgName("hiviewEarphone");
        eeeVar.setCommandId(2);
        eeeVar.a(800100006L);
        eeeVar.a(0);
        eeeVar.e(null);
        return eeeVar;
    }

    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
        LogUtil.a("EarPhoneLogPreExportManager", "onDataReceived: ", Integer.valueOf(i));
        if (eecVar instanceof eee) {
            eee eeeVar = (eee) eecVar;
            if (eecVar.getCommandId() != 2) {
                LogUtil.j("EarPhoneLogPreExportManager", "onDataReceived, message commandId: ", Integer.valueOf(eecVar.getCommandId()));
                return;
            }
            if (eeeVar.d() != 800100006) {
                return;
            }
            String strE = eeq.e(eeeVar.c());
            int iD = d(strE);
            LogUtil.a("EarPhoneLogPreExportManager", "eventData: ", strE, " status: ", Integer.valueOf(iD));
            if (this.f41979b == null) {
                j();
            }
            this.f41979b.removeMessages(1059);
            if (iD == 100) {
                LogUtil.a("EarPhoneLogPreExportManager", "earPhone log collect complete");
                b(false);
            } else {
                Message messageObtain = Message.obtain();
                messageObtain.what = 1059;
                messageObtain.obj = deviceInfo;
                this.f41979b.sendMessage(messageObtain, 30000L);
            }
            if ("2".equals(this.e) || "3".equals(this.e)) {
                mnn.a().a(0, deviceInfo, iD);
            }
            a(deviceInfo, iD, 0);
        }
    }

    public boolean b() {
        return this.d;
    }

    public void b(boolean z) {
        this.d = z;
    }

    private int d(String str) {
        int iV = -1;
        try {
            List<eew> listE = new eet().b(str).e();
            if (listE != null && listE.size() != 0) {
                for (eew eewVar : listE) {
                    if (CommonUtil.v(eewVar.e()) != 1) {
                        LogUtil.a("EarPhoneLogPreExportManager", "other type");
                    } else {
                        iV = CommonUtil.v(eewVar.b());
                    }
                }
                return iV;
            }
            LogUtil.j("EarPhoneLogPreExportManager", "tlvList is empty");
            return -1;
        } catch (eeu unused) {
            LogUtil.e("EarPhoneLogPreExportManager", "parseOperateData is error");
            return -1;
        }
    }
}
