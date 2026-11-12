package defpackage;

import android.os.Handler;
import android.os.Message;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.unitedevice.callback.ITransferFileCallback;
import com.huawei.unitedevice.hwcommonfilemgr.TransferFileQueueManager;
import com.huawei.unitedevice.hwwifip2ptransfermgr.HwWifiP2pTransferManager;
import com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pTransferListener;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
public class xin {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private xhr f53062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExtendHandler f53063b;
    private IBaseResponseCallback d;
    private WifiP2pTransferListener e;

    public void a(IBaseResponseCallback iBaseResponseCallback) {
        this.d = iBaseResponseCallback;
    }

    public void c() {
        this.d = null;
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final xin f53065a = new xin();
    }

    private xin() {
        this.e = new WifiP2pTransferListener() { // from class: xin.5
            @Override // com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pTransferListener
            public void onSuccess(int i, String str, int i2) {
                xin.this.e(i, str, i2);
            }

            @Override // com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pTransferListener
            public void onFail(int i, String str, int i2) {
                xin.this.a(i, str, i2);
            }

            @Override // com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pTransferListener
            public void onProcess(int i, int i2) {
                xin.this.b(i, i2);
            }
        };
        this.f53063b = HandlerCenter.b(new d(), "WifiP2pUplinkTransferManager");
    }

    public static xin d() {
        return e.f53065a;
    }

    public void d(xhr xhrVar) {
        if (TransferFileQueueManager.b().e(xhrVar, "app.requestFile")) {
            b(xhrVar);
        } else {
            LogUtil.a("WifiP2pUplinkTransferManager", "app want request file, wait queue.");
        }
    }

    public void b(final xhr xhrVar) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: xij
            @Override // java.lang.Runnable
            public final void run() {
                this.f53050b.a(xhrVar);
            }
        });
    }

    /* synthetic */ void a(xhr xhrVar) {
        boolean zA = xhx.a(xhrVar, this.e, new HashMap(0), -10);
        boolean zC = HwWifiP2pTransferManager.a().c(xhrVar.y());
        LogUtil.a("WifiP2pUplinkTransferManager", "next fileInfo from waitQueue: ", Integer.valueOf(xhrVar.y()), "; ", xhrVar.n(), "task is accept by wifi: ", Boolean.valueOf(zA), "; ", Boolean.valueOf(zC));
        if (!zA || !zC) {
            HwWifiP2pTransferManager.a().c();
            b(1029, xhrVar.p(), "task is accept by wifi: " + zA + "; " + zC);
            this.f53062a = null;
            TransferFileQueueManager.b().e("wifi_uplink_task_error_next_task");
            return;
        }
        this.f53062a = xhrVar;
    }

    private void b(int i, ITransferFileCallback iTransferFileCallback, String str) {
        if (iTransferFileCallback != null) {
            try {
                if (i != 1) {
                    LogUtil.a("WifiP2pUplinkTransferManager", "callback.onTransferFailed(), code: ", Integer.valueOf(i));
                    iTransferFileCallback.onFailure(i, str);
                } else {
                    iTransferFileCallback.onSuccess(i, "", "");
                }
            } catch (Exception e2) {
                LogUtil.e("WifiP2pUplinkTransferManager", "wifi success listener exception : ", cpc.c(e2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, String str, int i2) {
        int i3;
        LogUtil.a("WifiP2pUplinkTransferManager", "mWifiListener parameter： code : ", Integer.valueOf(i), "; msg: ", str, "; fileType: ", Integer.valueOf(i2));
        if (i != 0 && i != 1) {
            if (i == 10000) {
                xhr xhrVar = this.f53062a;
                if (xhrVar != null) {
                    String strD = xhn.d(xhrVar, xhrVar.z());
                    String strD2 = HwWifiP2pTransferManager.a().i().d();
                    LogUtil.a("WifiP2pUplinkTransferManager", "resultSha256: " + strD + ", fileSha256: " + strD2);
                    if (strD2 != null && strD2.equalsIgnoreCase(strD)) {
                        e(this.f53062a);
                        i3 = 100000;
                    } else {
                        LogUtil.a("WifiP2pUplinkTransferManager", "check file error");
                        i3 = 100001;
                    }
                    xie.e(i2, i3);
                    e(15, i2);
                    return;
                }
                LogUtil.a("WifiP2pUplinkTransferManager", "no fileInfo, please check, stop wifi");
                HwWifiP2pTransferManager.a().c();
                return;
            }
            if (i != 140008) {
                LogUtil.j("WifiP2pUplinkTransferManager", "unknown code, please deal this : ", Integer.valueOf(i));
                return;
            }
        }
        a(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str, int i2) {
        LogUtil.a("WifiP2pUplinkTransferManager", "mWifiListener fail code : ", Integer.valueOf(i), " msg : ", str);
        if (this.f53062a != null) {
            HwWifiP2pTransferManager.a().c();
            if (!HwWifiP2pTransferManager.a().c(i2)) {
                LogUtil.j("WifiP2pUplinkTransferManager", "isHasFile is false");
                return;
            }
            HwWifiP2pTransferManager.a().b(i2);
            b(this.f53062a, i, str);
            b(i, this.f53062a.p(), str);
            c(this.f53062a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, int i2) {
        LogUtil.a("WifiP2pUplinkTransferManager", "mWifiListener process ", Integer.valueOf(i));
    }

    private void a(int i, int i2) {
        ExtendHandler extendHandler = this.f53063b;
        if (extendHandler != null) {
            extendHandler.removeMessages(i2);
        }
        if (this.f53062a != null) {
            HwWifiP2pTransferManager.a().b(i2);
            b(i, this.f53062a.p(), "");
            c(this.f53062a);
            return;
        }
        LogUtil.j("WifiP2pUplinkTransferManager", "file valid file info is null. please check");
    }

    private void c(xhr xhrVar) {
        if (xhrVar == null) {
            LogUtil.j("WifiP2pUplinkTransferManager", "handleRequestEnd error, file info is null");
            return;
        }
        LogUtil.a("WifiP2pUplinkTransferManager", "finish file:", xhrVar.n());
        cpm.d(xhrVar.aa());
        this.f53062a = null;
        TransferFileQueueManager.b().e("wifi_uplink_task_finish_next_task");
    }

    private void e(int i, int i2) {
        if (i != 0) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 101;
            messageObtain.arg1 = i2;
            this.f53063b.sendMessage(messageObtain, ((long) i) * 1000);
        }
    }

    private void b(xhr xhrVar, int i, String str) {
        String str2 = String.format(Locale.ENGLISH, "code: %d, msg: %s", Integer.valueOf(i), str);
        IBaseResponseCallback iBaseResponseCallback = this.d;
        if (iBaseResponseCallback == null) {
            LogUtil.j("WifiP2pUplinkTransferManager", "callback is null");
        } else {
            iBaseResponseCallback.a(-1, str2);
        }
    }

    private void e(xhr xhrVar) {
        IBaseResponseCallback iBaseResponseCallback = this.d;
        if (iBaseResponseCallback == null) {
            LogUtil.j("WifiP2pUplinkTransferManager", "callback is null");
        } else {
            iBaseResponseCallback.a(0, xhrVar);
        }
    }

    class d implements Handler.Callback {
        private d() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message == null) {
                LogUtil.j("WifiP2pUplinkTransferManager", "handleMessage param null");
                return false;
            }
            if (message.arg1 == 101) {
                xin.this.a(1030, "54.7 time out", message.what);
                return true;
            }
            LogUtil.j("WifiP2pUplinkTransferManager", "handleMessage no match value");
            return false;
        }
    }
}
