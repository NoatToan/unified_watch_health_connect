package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.unitedevice.callback.ITransferFileCallback;
import com.huawei.unitedevice.hwcommonfilemgr.entity.RequestFileInfo;
import com.huawei.unitedevice.hwwifip2ptransfermgr.HwWifiP2pTransferManager;
import com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pTransferListener;
import health.compact.a.LogUtil;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes20.dex */
public class xha {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile xha f52968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f52969c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private xhr f52970a;
    private CountDownLatch e;
    private BlockingQueue<xhr> h = new LinkedBlockingDeque();
    private WifiP2pTransferListener i = new WifiP2pTransferListener() { // from class: xha.1
        @Override // com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pTransferListener
        public void onSuccess(int i, String str, int i2) {
            xha.this.b(i, str, i2);
        }

        @Override // com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pTransferListener
        public void onFail(int i, String str, int i2) {
            xha.this.e(i, str, i2);
        }

        @Override // com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pTransferListener
        public void onProcess(int i, int i2) {
            xha.this.c(i, i2);
        }
    };
    private ExtendHandler d = HandlerCenter.b(new b(), "CommonFileRequestWifiManager");

    private xha() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: xhc
            @Override // java.lang.Runnable
            public final void run() {
                this.f52973b.b();
            }
        });
    }

    /* synthetic */ void b() {
        try {
            a();
        } catch (InterruptedException e) {
            LogUtil.d("CommonFileRequestWifiManager", "dispatchMainLoop exception", cpc.c(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, String str, int i2) {
        LogUtil.b("CommonFileRequestWifiManager", "mWifiListener parameter： code : ", Integer.valueOf(i), "; msg: ", str, "; fileType: ", Integer.valueOf(i2));
        if (i != 0 && i != 1) {
            if (i == 10000) {
                xhr xhrVar = this.f52970a;
                if (xhrVar != null) {
                    String strD = xhn.d(xhrVar, xhrVar.z());
                    xia xiaVarI = HwWifiP2pTransferManager.a().i();
                    if (xiaVarI != null) {
                        LogUtil.b("CommonFileRequestWifiManager", "resultSha256: " + strD + ", fileSha256: " + xiaVarI.d());
                    }
                    xie.c(i2);
                    d(15, i2);
                    return;
                }
                LogUtil.b("CommonFileRequestWifiManager", "no fileInfo, please check, stop wifi");
                HwWifiP2pTransferManager.a().c();
                return;
            }
            if (i != 140008) {
                LogUtil.e("CommonFileRequestWifiManager", "unknown code, please deal this : ", Integer.valueOf(i));
                return;
            }
        }
        e(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, String str, int i2) {
        LogUtil.b("CommonFileRequestWifiManager", "mWifiListener fail code : ", Integer.valueOf(i), " msg : ", str);
        xhr xhrVar = this.f52970a;
        if (xhrVar != null) {
            HwWifiP2pTransferManager.a().c();
            if (!HwWifiP2pTransferManager.a().c(i2)) {
                LogUtil.e("CommonFileRequestWifiManager", "isHasFile is false");
                return;
            }
            HwWifiP2pTransferManager.a().b(i2);
            e(i, xhrVar.p(), str);
            c(xhrVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, int i2) {
        LogUtil.b("CommonFileRequestWifiManager", "mWifiListener process ", Integer.valueOf(i));
        xhr xhrVar = this.f52970a;
        if (xhrVar != null) {
            ITransferFileCallback iTransferFileCallbackP = xhrVar.p();
            if (iTransferFileCallbackP != null) {
                try {
                    iTransferFileCallbackP.onProgress(i, "");
                    iTransferFileCallbackP.onResponse(i2, String.format("request file by wifi,{%s}", xhrVar.n()));
                    return;
                } catch (RemoteException e) {
                    LogUtil.d("CommonFileRequestWifiManager", "wifi process listener exception : ", cpc.c(e));
                    return;
                }
            }
            LogUtil.e("CommonFileRequestWifiManager", "callback is null. please check.");
            return;
        }
        LogUtil.e("CommonFileRequestWifiManager", "mCurrentCommonFileInfo is null. please check.");
    }

    private void e(int i, int i2) {
        ExtendHandler extendHandler = this.d;
        if (extendHandler != null) {
            extendHandler.removeMessages(i2);
        }
        if (this.f52970a != null) {
            HwWifiP2pTransferManager.a().b(i2);
            e(i, this.f52970a.p(), "");
            c(this.f52970a);
            return;
        }
        LogUtil.e("CommonFileRequestWifiManager", "file valid file info is null. please check");
    }

    private void c(xhr xhrVar) {
        if (xhrVar == null) {
            LogUtil.e("CommonFileRequestWifiManager", "handleRequestEnd error, file info is null");
            return;
        }
        LogUtil.b("CommonFileRequestWifiManager", "finish file:", xhrVar.n());
        cpm.d(xhrVar.aa());
        CountDownLatch countDownLatch = this.e;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    private void a() throws InterruptedException {
        LogUtil.b("CommonFileRequestWifiManager", "begin dispatchMainLoop");
        while (true) {
            xhr xhrVarTake = this.h.take();
            boolean zA = xhx.a(xhrVarTake, this.i, new HashMap(0), -10);
            boolean zC = HwWifiP2pTransferManager.a().c(xhrVarTake.y());
            LogUtil.b("CommonFileRequestWifiManager", "next fileInfo from waitQueue: ", Integer.valueOf(xhrVarTake.y()), "; ", xhrVarTake.n(), "task is accept by wifi: ", Boolean.valueOf(zA), "; ", Boolean.valueOf(zC));
            if (!zA || !zC) {
                HwWifiP2pTransferManager.a().c();
                e(1029, xhrVarTake.p(), "task is accept by wifi: " + zA + "; " + zC);
            } else {
                this.f52970a = xhrVarTake;
                this.e = new CountDownLatch(1);
                LogUtil.b("CommonFileRequestWifiManager", "file wait: ", xhrVarTake.n());
                boolean zAwait = this.e.await(600000L, TimeUnit.MILLISECONDS);
                this.e = null;
                if (!zAwait) {
                    LogUtil.d("CommonFileRequestWifiManager", "file wait is timeout");
                    e(1030, "file transfer timeout", this.f52970a.y());
                }
                this.f52970a = null;
                LogUtil.b("CommonFileRequestWifiManager", "file transfer end:", xhrVarTake.n());
            }
        }
    }

    private void e(int i, ITransferFileCallback iTransferFileCallback, String str) {
        if (iTransferFileCallback != null) {
            try {
                if (i != 1) {
                    LogUtil.b("CommonFileRequestWifiManager", "callback.onTransferFailed(), code: ", Integer.valueOf(i));
                    iTransferFileCallback.onFailure(i, str);
                } else {
                    iTransferFileCallback.onSuccess(i, "", "");
                }
            } catch (RemoteException e) {
                LogUtil.d("CommonFileRequestWifiManager", "wifi success listener exception : ", cpc.c(e));
            }
        }
    }

    public static xha c() {
        xha xhaVar;
        synchronized (f52969c) {
            if (f52968b == null) {
                f52968b = new xha();
            }
            xhaVar = f52968b;
        }
        return xhaVar;
    }

    public void d(RequestFileInfo requestFileInfo, ITransferFileCallback iTransferFileCallback) {
        if (requestFileInfo == null || iTransferFileCallback == null) {
            LogUtil.e("CommonFileRequestWifiManager", "start request param null");
            return;
        }
        LogUtil.b("CommonFileRequestWifiManager", "start request file:", requestFileInfo.getFileName(), " ;", Integer.valueOf(requestFileInfo.getFileType()), " by wifi");
        xhr xhrVarA = a(requestFileInfo, iTransferFileCallback);
        if (xhrVarA.h() == null) {
            try {
                iTransferFileCallback.onFailure(130004, "");
                return;
            } catch (RemoteException e) {
                LogUtil.d("CommonFileRequestWifiManager", "startRequest exception : ", cpc.c(e));
                return;
            }
        }
        if (!d(xhrVarA)) {
            LogUtil.e("CommonFileRequestWifiManager", "file put wait queue fail");
            try {
                iTransferFileCallback.onFailure(130005, "");
            } catch (RemoteException e2) {
                LogUtil.d("CommonFileRequestWifiManager", "startRequest exception : ", cpc.c(e2));
            }
        }
        LogUtil.b("CommonFileRequestWifiManager", "file put wait queue success");
    }

    private boolean d(xhr xhrVar) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            if (((xhr) it.next()).equals(xhrVar)) {
                LogUtil.b("CommonFileRequestWifiManager", "file already exit ", xhrVar.n());
                return false;
            }
        }
        try {
            this.h.put(xhrVar);
            return true;
        } catch (InterruptedException e) {
            LogUtil.d("CommonFileRequestWifiManager", "putFileInfo2WaitQueue put exception:", cpc.c(e));
            return false;
        }
    }

    private xhr a(RequestFileInfo requestFileInfo, ITransferFileCallback iTransferFileCallback) {
        xhr xhrVar = new xhr();
        xhrVar.g(requestFileInfo.getFileType());
        if (!TextUtils.isEmpty(requestFileInfo.getFileName())) {
            xhrVar.c(requestFileInfo.getFileName());
        }
        xhrVar.o(2);
        xhrVar.a(2147483647L);
        xhrVar.d(requestFileInfo.getSavePath());
        xhrVar.c(iTransferFileCallback);
        xhrVar.i(xhw.e(new File(requestFileInfo.getSavePath())));
        LogUtil.b("CommonFileRequestWifiManager", "getCommonFileInfo fileInfo.getFilePath = " + xhrVar.t() + ", fileInfo.getSha256Result = " + xhrVar.ah());
        if (TextUtils.isEmpty(requestFileInfo.getDeviceMac())) {
            LogUtil.b("CommonFileRequestWifiManager", "deviceMac is null");
        } else {
            xhrVar.c(xhw.b(requestFileInfo.getDeviceMac()));
        }
        xhrVar.c(requestFileInfo.getDictTypeId());
        return xhrVar;
    }

    private void d(int i, int i2) {
        if (this.d == null) {
            this.d = HandlerCenter.b(new b(), "CommonFileRequestWifiManager");
        }
        if (i != 0) {
            Message messageObtain = Message.obtain();
            messageObtain.what = i2;
            messageObtain.arg1 = 101;
            this.d.sendMessage(messageObtain, ((long) i) * 1000);
        }
    }

    class b implements Handler.Callback {
        private b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message == null) {
                LogUtil.e("CommonFileRequestWifiManager", "handleMessage param null");
                return false;
            }
            if (message.arg1 == 101) {
                xha.this.e(1030, "54.7 time out", message.what);
                return true;
            }
            LogUtil.e("CommonFileRequestWifiManager", "handleMessage no match value");
            return false;
        }
    }
}
