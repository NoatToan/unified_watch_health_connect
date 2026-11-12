package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.huawei.devicesdk.callback.StatusCallback;
import com.huawei.devicesdk.connect.retry.CommandPriorAdapter;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.constant.TransferFileReqType;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import com.huawei.unitedevice.callback.IResultAIDLCallback;
import com.huawei.unitedevice.callback.ITransferFileCallback;
import com.huawei.unitedevice.constant.ConnectState;
import com.huawei.unitedevice.entity.UniteDevice;
import com.huawei.unitedevice.hwcommonfilemgr.ParserInterface;
import com.huawei.unitedevice.hwcommonfilemgr.TransferFileQueueManager;
import com.huawei.unitedevice.hwcommonfilemgr.entity.CommonFileInfoParcel;
import com.huawei.unitedevice.hwcommonfilemgr.entity.FileInfo;
import com.huawei.unitedevice.hwwifip2ptransfermgr.HwWifiP2pTransferManager;
import com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pTransferListener;
import health.compact.a.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class xhj implements ParserInterface {
    private static volatile xhj d;
    private int aa;
    private xhr k;
    private Context n;
    private xhr o;
    private boolean t;
    private ParcelFileDescriptor y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f52986b = BaseApplication.b().getFilesDir() + "/fileShare/";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f52985a = new Object();
    private static final Object e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f52987c = new byte[0];
    private final HashMap<Integer, LinkedList<xhr>> q = new HashMap<>(16);
    private int m = -1;
    private FileInputStream l = null;
    private FileChannel g = null;
    private Map<Long, Map<Integer, byte[]>> h = new LinkedHashMap(4);
    private ConcurrentHashMap<String, xhr> z = new ConcurrentHashMap<>(20);
    private Queue<cmg> i = new LinkedList();
    private cqe w = new cqe();
    private IResultAIDLCallback u = null;
    private boolean v = false;
    private boolean r = false;
    private ConcurrentHashMap<String, xht> f = new ConcurrentHashMap<>(20);
    private StatusCallback.Stub j = new StatusCallback.Stub() { // from class: xhj.1
        @Override // com.huawei.devicesdk.callback.StatusCallback
        public void onStatusChanged(int i, UniteDevice uniteDevice, int i2) {
            if (uniteDevice == null) {
                LogUtil.d("unite_HwCommonFileMgr", "onStatusChanged error. UniteDevice is null");
                return;
            }
            DeviceInfo deviceInfo = uniteDevice.getDeviceInfo();
            if (deviceInfo == null || deviceInfo.getDeviceBtType() <= 0) {
                LogUtil.b("onStatusChanged. deviceInfo is", Boolean.valueOf(deviceInfo == null));
                return;
            }
            ConnectState connectState = ConnectState.getConnectState(i2);
            LogUtil.b("unite_HwCommonFileMgr", "mConnectStateChangedReceiver(), status :", Integer.valueOf(uniteDevice.getDeviceInfo().getDeviceConnectState()));
            if (connectState == ConnectState.DISCONNECTED) {
                xhj.this.c(uniteDevice);
            }
        }
    };
    private final BroadcastReceiver x = new BroadcastReceiver() { // from class: xhj.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.e("unite_HwCommonFileMgr", "mNetworkStateReceiver , intent is null.");
                return;
            }
            int intExtra = intent.getIntExtra("wifi_state", 0);
            LogUtil.b("unite_HwCommonFileMgr", "mNetworkStateReceiver wifiState: ", Integer.valueOf(intExtra), "mTransferFileMode:", Integer.valueOf(xhj.this.aa));
            if (TransferFileQueueManager.b().b("wifi_change") != null && intExtra == 3 && xhj.this.aa == 1) {
                xhj.this.p.c(xhj.this.o, xhj.this, 1L);
            }
        }
    };
    private WifiP2pTransferListener ac = new WifiP2pTransferListener() { // from class: xhj.4
        @Override // com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pTransferListener
        public void onSuccess(int i, String str, int i2) {
            LogUtil.b("unite_HwCommonFileMgr", "mWifiListener parameter： code : ", Integer.valueOf(i), "； msg: ", str, "； fileType: ", Integer.valueOf(i2));
            xhj.this.aa = 0;
            if (i != 0 && i != 1) {
                if (i == 10000) {
                    xhr xhrVar = (xhr) xhj.this.z.get(String.valueOf(i2));
                    if (xhrVar != null) {
                        xie.c(i2);
                        long jU = xhrVar.u();
                        long jMax = Math.max((jU / Constants.WEB_VIEW_CACHE_TOTAL_MAX_SIZE) + ((long) (jU % Constants.WEB_VIEW_CACHE_TOTAL_MAX_SIZE != 0 ? 1 : 0)), 1L);
                        LogUtil.b("unite_HwCommonFileMgr", "file sizek is : ", Long.valueOf(jU), "factor is : ", Long.valueOf(jMax));
                        xhj.this.a(jMax * 15, i2);
                        return;
                    }
                    LogUtil.b("unite_HwCommonFileMgr", "no fileInfo, please check, stop wifi");
                    HwWifiP2pTransferManager.a().c();
                    return;
                }
                if (i != 140008) {
                    LogUtil.e("unite_HwCommonFileMgr", "unknown code, please deal this : ", Integer.valueOf(i));
                    return;
                }
            }
            xhj.this.a(i, i2);
        }

        @Override // com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pTransferListener
        public void onFail(int i, String str, int i2) {
            xhj.this.b(i, str, i2);
        }

        @Override // com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pTransferListener
        public void onProcess(int i, int i2) {
            xhj.this.c(i, i2);
        }
    };
    private ExtendHandler s = HandlerCenter.b(new e(), "unite_HwCommonFileMgr");
    private xhn p = xhn.e();

    private void h() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        this.n.registerReceiver(this.x, intentFilter);
    }

    private xhj(Context context) {
        this.n = context;
        LogUtil.b("unite_HwCommonFileMgr", "registerNetworkStateBroadcast: ");
        h();
        xhg.e().a(this.j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2) {
        boolean z = this.r;
        if (z) {
            LogUtil.b("unite_HwCommonFileMgr", "current has excel file , mIsWifiExcelStatus: ", Boolean.valueOf(z));
            return;
        }
        a();
        e(i, i2);
        LogUtil.b("unite_HwCommonFileMgr", "wait next file.");
    }

    public void e(int i, int i2) {
        xhr xhrVar = this.z.get(String.valueOf(i2));
        if (xhrVar != null) {
            HwWifiP2pTransferManager.a().b(i2);
            UniteDevice uniteDeviceH = xhrVar.h();
            IResultAIDLCallback iResultAIDLCallbackL = xhrVar.l();
            a(xhrVar, uniteDeviceH, 0);
            a(i, iResultAIDLCallbackL);
            return;
        }
        LogUtil.e("unite_HwCommonFileMgr", "file valid file info is null. please check");
    }

    private void a(int i, IResultAIDLCallback iResultAIDLCallback) {
        if (iResultAIDLCallback != null) {
            try {
                if (i == 140008) {
                    lng.c("FileTransfer", "Transferring duplicate file.");
                    LogUtil.b("unite_HwCommonFileMgr", "callback.onTransferFailed(), code: ", Integer.valueOf(i));
                    iResultAIDLCallback.onTransferFailed(i, "");
                    return;
                }
                iResultAIDLCallback.onFileRespond(i, "");
            } catch (Exception e2) {
                LogUtil.d("unite_HwCommonFileMgr", "wifi success listener exception : ", cpc.c(e2));
            }
        }
    }

    private void b(xhr xhrVar) {
        xia xiaVarI = HwWifiP2pTransferManager.a().i();
        if (xiaVarI != null) {
            LogUtil.b("unite_HwCommonFileMgr", "task type .", Integer.valueOf(xiaVarI.l()));
            int iL = xiaVarI.l();
            if (xiaVarI.m() == 2) {
                LogUtil.b("unite_HwCommonFileMgr", "next task is ota.");
                WifiP2pTransferListener wifiP2pTransferListenerN = xiaVarI.n();
                if (wifiP2pTransferListenerN != null) {
                    xhx.e();
                    wifiP2pTransferListenerN.onSuccess(1000, "send 5.9.9", -1);
                    return;
                }
                return;
            }
            xhr xhrVar2 = this.z.get(String.valueOf(iL));
            if (xhrVar2 != null) {
                LogUtil.e("unite_HwCommonFileMgr", "wifi wrong, please check.");
                HwWifiP2pTransferManager.a().b(iL);
                this.p.c(xhrVar2, this, 0L);
                c(xhrVar2);
                return;
            }
            LogUtil.e("unite_HwCommonFileMgr", "file list is null, please check.");
            HwWifiP2pTransferManager.a().b(xiaVarI.l());
            return;
        }
        if (this.p.d(xhrVar)) {
            this.p.c(xhrVar, this, 0L);
            LogUtil.b("unite_HwCommonFileMgr", "no next task.");
            c(xhrVar);
            return;
        }
        this.p.a(xhrVar.l(), 141001, "");
    }

    private void c(xhr xhrVar) {
        this.v = false;
        this.o = xhrVar;
        LogUtil.b("unite_HwCommonFileMgr", "sendFileInfoByBluetooth");
        if (xhrVar.y() == 7) {
            xhv.d(xhrVar.h(), xiw.a(xhrVar));
        } else {
            xhv.b(xhrVar.n(), xhrVar.u(), xhrVar.y(), xhrVar.ab(), xhrVar.h());
        }
        long jMax = Math.max(xhrVar.u() / Constants.WEB_VIEW_CACHE_TOTAL_MAX_SIZE, 1L);
        a(xhrVar.y(), 15 * jMax, xhrVar.h().getDeviceInfo());
        a(jMax, xhrVar);
    }

    private void a(long j, xhr xhrVar) {
        long j2 = ((j * 15) / 60) + 1;
        if (j2 <= 1 || !xhn.e().b()) {
            return;
        }
        LogUtil.b("unite_HwCommonFileMgr", "5.40.3 timeout too much, try wifi need delay : " + j2);
        xhn.e().c(xhrVar, this, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, String str, int i2) {
        LogUtil.b("unite_HwCommonFileMgr", "mWifiListener fail code : ", Integer.valueOf(i), " msg : ", str);
        xhr xhrVar = this.z.get(String.valueOf(i2));
        this.aa = 0;
        if (i == 1014) {
            if (xhrVar != null) {
                this.r = true;
                xhr xhrVarB = TransferFileQueueManager.b().b("closeWifiP2p");
                if (xhrVarB != null) {
                    xhrVarB.l(1);
                    d(xhrVar);
                    return;
                } else {
                    ReleaseLogUtil.d("R_unite_HwCommonFileMgr", "CODE_STOP_WIFI_SEND but fileTask null");
                    return;
                }
            }
            return;
        }
        if (i == 20008) {
            b(i, i2, xhrVar, false);
            return;
        }
        if (i == 100005) {
            a(i2, str);
        } else if (i == 20003 || i == 20004) {
            b(i, i2, xhrVar, true);
        } else {
            e(i, str, xhrVar, i2);
        }
    }

    private void b(int i, int i2, xhr xhrVar, boolean z) {
        if (xhrVar == null) {
            LogUtil.b("unite_HwCommonFileMgr", "cancel from cache.");
            xhrVar = TransferFileQueueManager.b().b("cancel wifi task");
        }
        if (xhrVar == null) {
            LogUtil.e("unite_HwCommonFileMgr", "cancel fail, file is null");
            return;
        }
        this.v = false;
        this.r = false;
        ITransferFileCallback iTransferFileCallbackB = xhrVar.b();
        a(this.z.get(String.valueOf(i2)), xhrVar.h(), 0);
        HwWifiP2pTransferManager.a().b(i2);
        if (iTransferFileCallbackB == null) {
            LogUtil.e("unite_HwCommonFileMgr", "callback is null. cancel not response.");
            return;
        }
        try {
            LogUtil.b("unite_HwCommonFileMgr", "String.valueOf(fileInfo.getFileName()):", String.valueOf(xhrVar.n()));
            if (xhrVar.y() == 1) {
                iTransferFileCallbackB.onResponse(i, xhrVar.n());
            } else {
                iTransferFileCallbackB.onResponse(i, "cancel file.");
            }
        } catch (Exception e2) {
            LogUtil.d("unite_HwCommonFileMgr", "cancel response fail : ", cpc.c(e2));
        }
        boolean zP = HwWifiP2pTransferManager.a().p();
        if (z || zP) {
            HwWifiP2pTransferManager.a().c();
        }
    }

    private void a(int i, String str) {
        this.v = false;
        LogUtil.b("unite_HwCommonFileMgr", "busy : fileType : ", Integer.valueOf(i), " msg : ", str);
    }

    public void e(int i, String str, xhr xhrVar, int i2) {
        this.v = false;
        this.r = false;
        HwWifiP2pTransferManager.a().c();
        if (xhrVar != null) {
            if (!HwWifiP2pTransferManager.a().c(xhrVar.y())) {
                LogUtil.e("unite_HwCommonFileMgr", "isHasFile is false");
                return;
            }
            HwWifiP2pTransferManager.a().b(xhrVar.y());
            this.z.remove(String.valueOf(xhrVar.y()));
            if (!HwWifiP2pTransferManager.a().a(i)) {
                this.p.b();
                c(i, xhrVar);
                return;
            } else {
                if (this.p.b(xhrVar, i)) {
                    return;
                }
                LogUtil.b("unite_HwCommonFileMgr", "wifi pair fail, repeat bluetooth send file.");
                if (TransferFileQueueManager.b().b("wifi Pairing failed") == null) {
                    LogUtil.e("unite_HwCommonFileMgr", "may bluetooth was closed and cleared all task when wifi Pairing failed");
                    return;
                } else {
                    this.p.c(this.o, this, 0L);
                    c(xhrVar);
                    return;
                }
            }
        }
        HwWifiP2pTransferManager.a().b(i2);
        LogUtil.e("unite_HwCommonFileMgr", "mCurrentCommonFileInfo is null.please check.");
    }

    private void c(int i, xhr xhrVar) {
        LogUtil.b("unite_HwCommonFileMgr", "start bluetooth transfer:", Boolean.valueOf(this.t));
        d(xhrVar);
        if (this.p.c(HwWifiP2pTransferManager.a().e(i), xhrVar, this)) {
            if (this.z.get(String.valueOf(xhrVar.y())) != null) {
                this.z.remove(String.valueOf(xhrVar.y()));
            }
            if (TransferFileQueueManager.b().b("check Queue before wifi change to BT") == null) {
                LogUtil.e("unite_HwCommonFileMgr", "may bluetooth was closed and cleared all task when transfering by wifi");
            } else {
                b(xhrVar);
            }
        }
    }

    private void d(xhr xhrVar) {
        LogUtil.e("unite_HwCommonFileMgr", "send 54.6, and closeWifi");
        xie.a(xhrVar.y(), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, int i2) {
        this.aa = 2;
        LogUtil.b("unite_HwCommonFileMgr", "mWifiListener process ", Integer.valueOf(i));
        xhr xhrVar = this.z.get(String.valueOf(i2));
        if (xhrVar != null) {
            IResultAIDLCallback iResultAIDLCallbackL = xhrVar.l();
            if (iResultAIDLCallbackL != null) {
                try {
                    iResultAIDLCallbackL.onFileTransferState(i, "");
                    iResultAIDLCallbackL.onFileTransferReport(xhn.d("transferWay", "wifi"));
                } catch (Exception e2) {
                    LogUtil.d("unite_HwCommonFileMgr", "wifi process listener exception : ", cpc.c(e2));
                }
            } else {
                LogUtil.e("unite_HwCommonFileMgr", "callback is null. please check.");
            }
        } else {
            LogUtil.e("unite_HwCommonFileMgr", "mCurrentCommonFileInfo is null. please check.");
        }
        e("wifi");
    }

    public void e(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "TRANSFER_WAY_BLUETOOTH";
        }
        List<xhr> listA = TransferFileQueueManager.b().a(str + "_process");
        LogUtil.b("unite_HwCommonFileMgr", "wait queues report process 0 , wait task size : ", Integer.valueOf(listA.size()));
        Iterator<xhr> it = listA.iterator();
        while (it.hasNext()) {
            IResultAIDLCallback iResultAIDLCallbackL = it.next().l();
            if (iResultAIDLCallbackL != null) {
                try {
                    iResultAIDLCallbackL.onFileTransferState(0, "");
                    iResultAIDLCallbackL.onFileTransferReport(xhn.d("transferWay", str));
                } catch (Exception e2) {
                    LogUtil.d("unite_HwCommonFileMgr", "wifi process listener exception : ", cpc.c(e2));
                }
            }
        }
    }

    public void d(final UniteDevice uniteDevice, final xhr xhrVar) {
        long jB;
        LogUtil.b("unite_HwCommonFileMgr", "transferFileByQueue");
        if (xhrVar == null || xhrVar.l() == null) {
            LogUtil.e("unite_HwCommonFileMgr", "transferFileByQueue bean is null");
            return;
        }
        try {
            if (xhrVar.z() != null) {
                jB = xhn.c(xhrVar.z(), this.y);
            } else if (!TextUtils.isEmpty(xhrVar.t())) {
                jB = xhn.b(new File(xhrVar.t()), -1L, this.y);
            } else {
                LogUtil.e("unite_HwCommonFileMgr", "transferFileByQueue getFileSize default");
                jB = 0;
            }
            if (jB == 0) {
                LogUtil.e("unite_HwCommonFileMgr", "transferFileByQueue getFileSize size is 0");
                TransferFileQueueManager.b().e("fileSize size is 0");
                xhrVar.l().onTransferFailed(20000, "");
            } else if (jB == -1) {
                LogUtil.e("unite_HwCommonFileMgr", "transferFileByQueue getFileSize size is exceeded");
                TransferFileQueueManager.b().e("fileSize size is too big");
                xhrVar.l().onTransferFailed(20005, "");
            } else {
                xhrVar.a(jB);
                ThreadPoolManager.c().execute(new Runnable() { // from class: xhi
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.c(xhrVar, uniteDevice);
                    }
                });
            }
        } catch (Exception e2) {
            LogUtil.d("unite_HwCommonFileMgr", "transferFileByQueue Exception", cpc.c(e2));
        }
    }

    /* synthetic */ void c(xhr xhrVar, UniteDevice uniteDevice) {
        synchronized (this.q) {
            a(xhrVar, uniteDevice);
        }
    }

    private void a(xhr xhrVar, UniteDevice uniteDevice) {
        int iY = xhrVar.y();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.q.get(Integer.valueOf(iY)) == null) {
            LogUtil.b("unite_HwCommonFileMgr", "putCommonFileInfo fileBeanList is null");
            this.q.put(Integer.valueOf(iY), new LinkedList<>());
        }
        LinkedList<xhr> linkedList = this.q.get(Integer.valueOf(iY));
        if (linkedList != null) {
            linkedList.clear();
            xhrVar.i(jCurrentTimeMillis);
            xhrVar.j(jCurrentTimeMillis);
            linkedList.add(xhrVar);
            e(xhrVar, uniteDevice);
        }
    }

    private void e(xhr xhrVar, UniteDevice uniteDevice) {
        LogUtil.b("unite_HwCommonFileMgr", "enter startTransferFileByQueue");
        xhrVar.c(uniteDevice);
        g();
        synchronized (f52987c) {
            this.k = xhrVar;
            this.o = xhrVar;
        }
        xhrVar.a(xhrVar.y());
        LogUtil.b("unite_HwCommonFileMgr", "send file queue.");
        xhrVar.i(xhn.d(xhrVar, this.y));
        this.z.put(String.valueOf(xhrVar.y()), xhrVar);
        d("startTransferFileByQueue", xhrVar);
    }

    public void b(UniteDevice uniteDevice, FileInfo fileInfo, IResultAIDLCallback iResultAIDLCallback) {
        if (!this.p.a(iResultAIDLCallback, fileInfo)) {
            LogUtil.e("unite_HwCommonFileMgr", "checkAvailability is failed");
            return;
        }
        xhr xhrVar = new xhr();
        xhrVar.c(fileInfo.getFileName());
        xhrVar.d(fileInfo.getFilePath());
        xhrVar.e(fileInfo.getFileDescriptor());
        if (a(xhrVar, fileInfo, iResultAIDLCallback)) {
            a(fileInfo, xhrVar.u(), uniteDevice, iResultAIDLCallback);
        }
    }

    private boolean a(xhr xhrVar, FileInfo fileInfo, IResultAIDLCallback iResultAIDLCallback) {
        long jB;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ContentResource.FILE_NAME, fileInfo.getFileName());
            jSONObject.put("fileType", fileInfo.getFileType());
        } catch (JSONException unused) {
            LogUtil.e("unite_HwCommonFileMgr", "param to JSONObject error");
        }
        try {
            if (fileInfo.getFileDescriptor() != null) {
                long fileSize = fileInfo.getFileSize();
                xhrVar.a(fileSize);
                if (fileSize != 0) {
                    return true;
                }
                LogUtil.e("unite_HwCommonFileMgr", "from ParcelFileDescriptor file size is 0");
                iResultAIDLCallback.onTransferFailed(20000, jSONObject.toString());
                return false;
            }
            File file = new File(fileInfo.getFilePath());
            if (!file.exists()) {
                LogUtil.e("unite_HwCommonFileMgr", "file is not exist");
                iResultAIDLCallback.onTransferFailed(20000, jSONObject.toString());
                return false;
            }
            LogUtil.b("unite_HwCommonFileMgr", "fileBaseInfo.getSourceId() :", Long.valueOf(fileInfo.getSourceId()));
            if (fileInfo.getSourceId() > 0) {
                jB = xhn.b(file, fileInfo.getSourceId(), this.y);
            } else {
                jB = xhn.b(file, -1L, this.y);
            }
            if (jB == 0) {
                LogUtil.e("unite_HwCommonFileMgr", "file size is 0");
                iResultAIDLCallback.onTransferFailed(20000, jSONObject.toString());
                return false;
            }
            xhrVar.a(jB);
            return true;
        } catch (Exception e2) {
            LogUtil.d("unite_HwCommonFileMgr", "startTransfer Exception", cpc.c(e2));
            return false;
        }
    }

    public void c(IResultAIDLCallback iResultAIDLCallback, List<Integer> list) {
        this.u = iResultAIDLCallback;
        LogUtil.b("unite_HwCommonFileMgr", "registToDevicesCallback success ! ");
    }

    private void g() {
        synchronized (this) {
            this.h.clear();
            this.m = -1;
            cpm.d(this.g);
            cpm.d(this.l);
            cpm.d(this.y);
            this.g = null;
            this.l = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(UniteDevice uniteDevice) {
        LogUtil.b("unite_HwCommonFileMgr", "disconnected identify:", cpl.a(xhw.a(uniteDevice)));
        List<xhr> listD = TransferFileQueueManager.b().d("disconnectDevice");
        if (!listD.isEmpty()) {
            if (listD.get(0).h().getIdentify().equals(uniteDevice.getIdentify())) {
                LogUtil.b("unite_HwCommonFileMgr", "same device. disconnect");
            } else {
                LogUtil.b("unite_HwCommonFileMgr", "other device disconnect, no deal");
                return;
            }
        }
        TransferFileQueueManager.b().c("disconnectDevice");
        this.z.clear();
        for (xhr xhrVar : listD) {
            String strB = xhw.b(xhrVar);
            if (TextUtils.isEmpty(strB) || !strB.equals(xhw.a(uniteDevice))) {
                LogUtil.b("unite_HwCommonFileMgr", "not disconnected, fileId:", Integer.valueOf(xhrVar.m()), " file type : ", Integer.valueOf(xhrVar.y()));
            } else {
                i();
                xhn.c(uniteDevice);
                a(uniteDevice, xhrVar);
                a(uniteDevice);
            }
        }
    }

    private void a(UniteDevice uniteDevice) {
        synchronized (f52987c) {
            this.k = null;
        }
        this.q.clear();
        this.r = false;
    }

    private void a(UniteDevice uniteDevice, xhr xhrVar) {
        if (xhrVar != null) {
            LogUtil.b("unite_HwCommonFileMgr", "disconnected fileId: ", Integer.valueOf(xhrVar.m()));
            this.p.a(xhrVar.l(), 141001, "");
            a(xhrVar, uniteDevice, 2);
            synchronized (f52987c) {
                if (xhrVar.equals(this.k)) {
                    this.k = null;
                }
            }
        }
    }

    private void a(xhr xhrVar, UniteDevice uniteDevice, int i) {
        if (xhrVar == null) {
            LogUtil.e("unite_HwCommonFileMgr", "handleFailed error, fileInfo is null");
            return;
        }
        this.p.b();
        String strD = xhw.d(uniteDevice.getIdentify(), xhrVar.m());
        LogUtil.b("unite_HwCommonFileMgr", "handleFailed has fileInfo file id: ", Integer.valueOf(xhrVar.m()), "handleFailed has fileInfo device: ", cpl.a(uniteDevice.getIdentify()));
        if (this.z.get(strD) != null) {
            this.z.remove(strD);
        }
        g();
        synchronized (f52987c) {
            if (xhrVar.equals(this.k)) {
                LogUtil.b("unite_HwCommonFileMgr", "handleFailed set mCurrentCommonFileInfo null: ", Integer.valueOf(xhrVar.m()));
                this.k = null;
            }
        }
        e(xhrVar.y(), uniteDevice, i);
        if (this.f.get(strD) != null) {
            this.f.remove(strD);
        }
        if (i == 0) {
            TransferFileQueueManager.b().e("normal_next_task");
        }
    }

    private void e(int i, UniteDevice uniteDevice, int i2) {
        LogUtil.b("unite_HwCommonFileMgr", "removeFirstAndSendNext : ", Integer.valueOf(i), " fileSendType : ", Integer.valueOf(i2));
        synchronized (this.q) {
            LinkedList<xhr> linkedList = this.q.get(Integer.valueOf(i));
            if (linkedList != null) {
                LogUtil.b("unite_HwCommonFileMgr", "removeFirstAndSendNext fileBeanList size :", Integer.valueOf(linkedList.size()));
                linkedList.poll();
                xhr xhrVarPeek = linkedList.peek();
                if (xhrVarPeek != null) {
                    LogUtil.b("unite_HwCommonFileMgr", "ready send next kit");
                    xhrVarPeek.j(System.currentTimeMillis());
                    e(xhrVarPeek, uniteDevice);
                    return;
                }
            }
            LogUtil.b("unite_HwCommonFileMgr", "removeFirstAndSendNext no kit, next task");
        }
    }

    private void i() {
        ExtendHandler extendHandler = this.s;
        if (extendHandler != null) {
            extendHandler.removeMessages(100);
        }
    }

    public void a() {
        ExtendHandler extendHandler = this.s;
        if (extendHandler != null) {
            extendHandler.removeMessages(101);
        }
    }

    @Override // com.huawei.unitedevice.hwcommonfilemgr.ParserInterface
    public boolean getResult(DeviceInfo deviceInfo, byte[] bArr) throws Throwable {
        if (bArr == null || bArr.length <= 1 || xhw.b(bArr)) {
            return true;
        }
        cpl.d("unite_HwCommonFileMgr", bArr, "getResult(), message :");
        byte b2 = bArr[1];
        switch (b2) {
            case 1:
                c(deviceInfo, bArr);
                return false;
            case 2:
                b(deviceInfo, bArr);
                return false;
            case 3:
                g(deviceInfo, bArr);
                return false;
            case 4:
                a(deviceInfo, bArr);
                return false;
            case 5:
                e(deviceInfo, bArr);
                return false;
            case 6:
            default:
                LogUtil.e("unite_HwCommonFileMgr", "getResult()  default switch ", Byte.valueOf(b2));
                return true;
            case 7:
                h(deviceInfo, bArr);
                return false;
            case 8:
                f(deviceInfo, bArr);
                return false;
            case 9:
                d(deviceInfo, bArr);
                return false;
        }
    }

    private void c(DeviceInfo deviceInfo, byte[] bArr) throws Throwable {
        cpl.d("unite_HwCommonFileMgr", bArr, "5.40.1 handleDeviceRequest :");
        if (bArr == null || bArr.length < 2) {
            LogUtil.e("unite_HwCommonFileMgr", "handleDeviceRequest data is error");
            return;
        }
        try {
            cql.c cVarA = new cql().a(bArr, 2);
            String strE = cVarA.e((byte) 1, "");
            int iD = cVarA.d((byte) 2, 3);
            int iD2 = cVarA.d((byte) 5, -1);
            String strE2 = cVarA.e((byte) 4, "");
            e(strE2, cVarA.e((byte) 3, strE2), strE, iD, iD2, deviceInfo);
        } catch (cpy unused) {
            LogUtil.d("unite_HwCommonFileMgr", "handleDeviceRequest error");
        }
    }

    private void e(String str, String str2, String str3, int i, int i2, DeviceInfo deviceInfo) throws Throwable {
        if (!xhv.d(i, str3)) {
            xhv.b(str, str3, i, i2, 140006, deviceInfo);
            return;
        }
        if (i == 7) {
            LogUtil.b("unite_HwCommonFileMgr", "fileType 7 request through 5.40.1, destPkgName: ", str, " srcPkgName: ", str2);
            xhv.e(str, str3, i, 100000, deviceInfo, str2, str);
            a(str3, str2, str);
        } else {
            xhv.b(str, str3, i, i2, 100000, deviceInfo);
            if (i == 4 || i == 5) {
                e(str3, i, deviceInfo);
            } else {
                a(str3, i, i2, deviceInfo);
            }
        }
    }

    private void a(String str, int i, int i2, DeviceInfo deviceInfo) {
        String strD;
        try {
            if (i == 3 || i == 10 || i == 11) {
                strD = xhv.d(str, i, i2);
            } else {
                strD = xhv.a(str, i);
                LogUtil.b("unite_HwCommonFileMgr", "biMapFileName is :", strD);
            }
            FileInfo fileInfo = new FileInfo();
            fileInfo.setFilePath(strD);
            fileInfo.setFileName(str);
            fileInfo.setFileType(i);
            fileInfo.setPackageName(null);
            if (this.u != null) {
                LogUtil.b("unite_HwCommonFileMgr", "deviceStartToDeviceTransFile entry");
                a(deviceInfo, fileInfo);
            } else {
                LogUtil.b("unite_HwCommonFileMgr", "mToDevicesFileCallback is null ");
            }
        } catch (IOException unused) {
            LogUtil.d("unite_HwCommonFileMgr", "deviceStartTransfer IOException");
        }
    }

    private void a(String str, String str2, String str3) {
        if (StringUtils.strEquals(str2, "hw.wearable.httpProxyAp") || StringUtils.strEquals(str3, "hw.wearable.httpProxyAp")) {
            LogUtil.b("unite_HwCommonFileMgr", "enter httpProxy ap send cloud response file to device");
            xim.a().d(str);
        } else if (StringUtils.strEquals(str2, "hw.wearable.httpProxy") || StringUtils.strEquals(str2, "hw.unitedevice.httpProxy")) {
            LogUtil.b("unite_HwCommonFileMgr", "enter httpProxy send cloud response file to device");
            xir.b().c(str);
        } else {
            LogUtil.b("unite_HwCommonFileMgr", "not enter httpProxy send cloud response file to device");
        }
    }

    private void a(DeviceInfo deviceInfo, FileInfo fileInfo) {
        final JSONObject jSONObjectC = this.p.c(fileInfo);
        b(xhn.a(deviceInfo), fileInfo, new IResultAIDLCallback.Stub() { // from class: xhj.3
            @Override // com.huawei.unitedevice.callback.IResultAIDLCallback
            public void onFileTransferState(int i, String str) {
                LogUtil.b("unite_HwCommonFileMgr", "deviceStartTransfer startTransfer onFileTransferState");
                if (xhj.this.u != null) {
                    try {
                        LogUtil.b("unite_HwCommonFileMgr", "deviceStartTransfer onFileTransferState percentage: ", Integer.valueOf(i), "des: ", jSONObjectC.toString());
                        xhj.this.u.onFileTransferState(i, jSONObjectC.toString());
                        LogUtil.b("unite_HwCommonFileMgr", "onFileTransferState success");
                    } catch (Exception e2) {
                        LogUtil.d("unite_HwCommonFileMgr", "onFileTransferState remoteException", cpc.c(e2));
                    }
                }
            }

            @Override // com.huawei.unitedevice.callback.IResultAIDLCallback
            public void onTransferFailed(int i, String str) {
                LogUtil.b("unite_HwCommonFileMgr", "deviceStartTransfer startTransfer onTransferFailed");
                if (xhj.this.u != null) {
                    try {
                        LogUtil.b("unite_HwCommonFileMgr", "deviceStartTransfer onTransferFailed errorCode: ", Integer.valueOf(i), "des: ", jSONObjectC.toString());
                        xhj.this.u.onTransferFailed(i, jSONObjectC.toString());
                        LogUtil.b("unite_HwCommonFileMgr", "onTransferFailed success");
                    } catch (Exception e2) {
                        LogUtil.d("unite_HwCommonFileMgr", "onTransferFailed remoteException", cpc.c(e2));
                    }
                }
            }

            @Override // com.huawei.unitedevice.callback.IResultAIDLCallback
            public void onFileRespond(int i, String str) {
                xhj.this.a(i, str, jSONObjectC);
            }

            @Override // com.huawei.unitedevice.callback.IResultAIDLCallback
            public void onFileTransferReport(String str) {
                xhj.this.b(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        LogUtil.b("unite_HwCommonFileMgr", "deviceStartTransfer startTransfer onFileTransferReport");
        if (this.u != null) {
            try {
                LogUtil.b("unite_HwCommonFileMgr", "deviceStartTransfer onFileTransferReport transferWay: ", str);
                this.u.onFileTransferReport(str);
                LogUtil.b("unite_HwCommonFileMgr", "onFileRespond success");
            } catch (Exception e2) {
                LogUtil.d("unite_HwCommonFileMgr", "onFileRespond remoteException", cpc.c(e2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str, JSONObject jSONObject) {
        LogUtil.b("unite_HwCommonFileMgr", "deviceStartTransfer startTransfer onFileRespond");
        if (this.u != null) {
            try {
                LogUtil.b("unite_HwCommonFileMgr", "deviceStartTransfer onFileRespond checkResult: ", Integer.valueOf(i), "des: ", jSONObject.toString());
                this.u.onFileRespond(i, jSONObject.toString());
                LogUtil.b("unite_HwCommonFileMgr", "onFileRespond success");
            } catch (Exception e2) {
                LogUtil.d("unite_HwCommonFileMgr", "onFileRespond remoteException", cpc.c(e2));
            }
        }
    }

    public void e(UniteDevice uniteDevice, FileInfo fileInfo, IResultAIDLCallback iResultAIDLCallback) {
        if (uniteDevice == null || fileInfo == null) {
            return;
        }
        TransferFileReqType requestType = fileInfo.getRequestType();
        List<Integer> attentionTypes = fileInfo.getAttentionTypes();
        int value = requestType.getValue();
        LogUtil.e("unite_HwCommonFileMgr", "startTransferManager entry. requestType is :", Integer.valueOf(value), "device is :", cpl.a(uniteDevice.getIdentify()));
        int i = AnonymousClass8.f52993a[requestType.ordinal()];
        if (i == 1) {
            b(uniteDevice, fileInfo, iResultAIDLCallback);
        } else if (i == 2) {
            c(iResultAIDLCallback, attentionTypes);
        } else {
            if (i != 3) {
                return;
            }
            a(uniteDevice, fileInfo, iResultAIDLCallback);
        }
    }

    /* JADX INFO: renamed from: xhj$8, reason: invalid class name */
    static /* synthetic */ class AnonymousClass8 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f52993a;

        static {
            int[] iArr = new int[TransferFileReqType.values().length];
            f52993a = iArr;
            try {
                iArr[TransferFileReqType.APP_DELIVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52993a[TransferFileReqType.DEVICE_REGISTRATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52993a[TransferFileReqType.APP_STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void a(UniteDevice uniteDevice, FileInfo fileInfo, final IResultAIDLCallback iResultAIDLCallback) {
        d(uniteDevice, xhw.d(fileInfo), new ITransferFileCallback.Stub() { // from class: xhj.5
            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onSuccess(int i, String str, String str2) throws RemoteException {
                LogUtil.b("unite_HwCommonFileMgr", "stopTransmit onSuccess");
            }

            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onFailure(int i, String str) throws RemoteException {
                LogUtil.b("unite_HwCommonFileMgr", "stopTransmit onFailure");
            }

            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onProgress(int i, String str) throws RemoteException {
                LogUtil.b("unite_HwCommonFileMgr", "stopTransmit onProgress");
            }

            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onResponse(int i, String str) throws RemoteException {
                IResultAIDLCallback iResultAIDLCallback2 = iResultAIDLCallback;
                if (iResultAIDLCallback2 != null) {
                    iResultAIDLCallback2.onFileRespond(i, str);
                    LogUtil.b("unite_HwCommonFileMgr", "stopTransmit onResponse");
                }
            }
        });
    }

    private void e(String str, int i, DeviceInfo deviceInfo) throws Throwable {
        LogUtil.b("unite_HwCommonFileMgr", "deviceStartPayFileTransfer fileName:", str, ", fileType:", Integer.valueOf(i));
        if (str == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        String str2 = f52986b;
        sb.append(str2);
        sb.append(str);
        String string = sb.toString();
        if (i == 5 && str.endsWith(".png")) {
            string = str2 + (str.substring(0, str.lastIndexOf(".")) + WatchFaceConstant.BIN_SUFFIX);
            xhd.b().c(str2 + str, string);
        }
        FileInfo fileInfo = new FileInfo();
        fileInfo.setFilePath(string);
        fileInfo.setFileName(str);
        fileInfo.setFileType(i);
        fileInfo.setPackageName(null);
        b(xhn.a(deviceInfo), fileInfo, new IResultAIDLCallback.Stub() { // from class: xhj.7
            @Override // com.huawei.unitedevice.callback.IResultAIDLCallback
            public void onFileTransferState(int i2, String str3) {
                LogUtil.d("unite_HwCommonFileMgr", "deviceStartPayFileTransfer onFileTransferState");
            }

            @Override // com.huawei.unitedevice.callback.IResultAIDLCallback
            public void onTransferFailed(int i2, String str3) {
                LogUtil.d("unite_HwCommonFileMgr", "deviceStartPayFileTransfer onUpgradeFailed");
            }

            @Override // com.huawei.unitedevice.callback.IResultAIDLCallback
            public void onFileRespond(int i2, String str3) {
                LogUtil.d("unite_HwCommonFileMgr", "deviceStartPayFileTransfer onFileRespond");
            }

            @Override // com.huawei.unitedevice.callback.IResultAIDLCallback
            public void onFileTransferReport(String str3) {
                LogUtil.b("unite_HwCommonFileMgr", "deviceStartToDeviceTransferOld startTransfer onFileTransferReport");
            }
        });
    }

    private void b(DeviceInfo deviceInfo, byte[] bArr) {
        int iE;
        cpl.d("unite_HwCommonFileMgr", bArr, "5.40.2 handleAppSend :");
        if (bArr == null || bArr.length < 2) {
            return;
        }
        xhr xhrVar = new xhr();
        try {
            iE = xiw.e(bArr, xhrVar);
            if (iE == 0) {
                iE = 0;
            }
        } catch (cpy unused) {
            LogUtil.d("unite_HwCommonFileMgr", "handleAppSend TlvException");
        }
        d(deviceInfo, xhrVar, iE);
    }

    private void d(DeviceInfo deviceInfo, xhr xhrVar, int i) {
        xhr xhrVarB = TransferFileQueueManager.b().b("5.40.2");
        if (xhrVarB != null && xhrVarB.y() == xhrVar.y() && d(xhrVar, xhrVarB)) {
            this.p.d(xhrVar, xhrVarB);
            UniteDevice uniteDevice = new UniteDevice();
            uniteDevice.setDeviceInfo(deviceInfo);
            xhrVar.c(uniteDevice);
            if (i == 100000) {
                LogUtil.b("unite_HwCommonFileMgr", "device support transfer file");
                xhrVarB.a(xhrVar.m());
                this.z.put(xhw.d(deviceInfo.getDeviceMac(), xhrVar.m()), xhrVar);
                return;
            }
            if (cop.e()) {
                lng.c("FileTransfer", "Device replies 5.40.2 with error code " + i);
            }
            if (xhrVar.l() == null) {
                LogUtil.e("unite_HwCommonFileMgr", "file callBack is null");
                return;
            }
            try {
                i();
                xhrVar.l().onTransferFailed(i, "");
                LogUtil.b("unite_HwCommonFileMgr", "onUpgradeFailed errorCode :", Integer.valueOf(i));
                a(xhrVar, xhn.a(deviceInfo), 0);
            } catch (Exception e2) {
                LogUtil.d("unite_HwCommonFileMgr", "handleRequest, Exception", cpc.c(e2));
            }
        }
    }

    private boolean d(xhr xhrVar, xhr xhrVar2) {
        String strN = xhrVar2.n();
        String strN2 = xhrVar.n();
        if (strN == null) {
            return true;
        }
        return strN.equals(strN2);
    }

    private void g(DeviceInfo deviceInfo, byte[] bArr) {
        this.p.c(deviceInfo, bArr);
    }

    public void c(int i, int i2, DeviceInfo deviceInfo, long j) {
        LogUtil.b("unite_HwCommonFileMgr", "enter sendFileHashToDevice, fileId :", Integer.valueOf(i), ", check_mode :", Integer.valueOf(i2));
        if (deviceInfo == null) {
            return;
        }
        if (this.z.get(xhw.d(deviceInfo.getDeviceMac(), i)) != null) {
            if (i2 == 3) {
                b(i, deviceInfo, j);
                return;
            }
            return;
        }
        xhr xhrVarB = TransferFileQueueManager.b().b("5.40.3 no task");
        if (xhrVarB == null) {
            return;
        }
        if (xhrVarB.m() == i) {
            LogUtil.e("unite_HwCommonFileMgr", "sendFileHashToDevice, mFileInfoList have not or filePath isEmpty");
            xhv.c(i, deviceInfo);
        } else {
            LogUtil.b("unite_HwCommonFileMgr", "5.40.3 response no task receive");
        }
    }

    private void b(int i, DeviceInfo deviceInfo, long j) {
        xhr xhrVar = this.z.get(xhw.d(deviceInfo.getDeviceMac(), i));
        if (xhrVar == null) {
            xhv.c(i, deviceInfo);
            LogUtil.e("unite_HwCommonFileMgr", "handleShare commonFileInfo error");
            return;
        }
        String strAh = xhrVar.ah();
        if (TextUtils.isEmpty(strAh) || j > 0) {
            LogUtil.b("unite_HwCommonFileMgr", "handleShare not from cache :", Integer.valueOf(i));
            strAh = xhw.d(xhrVar, j, 1024, xhn.a(xhrVar, xhrVar.aq()));
            cpm.d(this.y);
        }
        if (!TextUtils.isEmpty(strAh)) {
            LogUtil.b("unite_HwCommonFileMgr", "sendFileHashToDevice, get hash success");
            xhv.a(i, strAh, deviceInfo, j);
        } else {
            LogUtil.e("unite_HwCommonFileMgr", "sendFileHashToDevice, get hash failed");
            xhv.c(i, deviceInfo);
        }
    }

    private void a(DeviceInfo deviceInfo, byte[] bArr) {
        cpl.d("unite_HwCommonFileMgr", bArr, "5.40.4 handleConsult :");
        if (bArr == null || bArr.length < 2) {
            return;
        }
        xht xhtVar = new xht();
        try {
            if (!xhn.e(xhtVar, bArr)) {
                lng.c("FileTransfer", "Invalid 5.40.4 send by device.");
                xhr xhrVar = this.k;
                if (xhrVar != null) {
                    IResultAIDLCallback iResultAIDLCallbackL = xhrVar.l();
                    if (iResultAIDLCallbackL != null) {
                        try {
                            i();
                            iResultAIDLCallbackL.onTransferFailed(140005, "");
                            LogUtil.b("unite_HwCommonFileMgr", "onUpgradeFailed errorCode :", 140005);
                            a(this.k, xhn.a(deviceInfo), 0);
                        } catch (Exception e2) {
                            LogUtil.d("unite_HwCommonFileMgr", "handleRequest, Exception", cpc.c(e2));
                        }
                    } else {
                        LogUtil.e("unite_HwCommonFileMgr", "file callBack is null");
                    }
                } else {
                    ReleaseLogUtil.e("R_unite_HwCommonFileMgr", "mCurrentCommonFileInfo is null");
                }
            }
            this.f.put(xhw.d(deviceInfo.getDeviceMac(), xhtVar.b()), xhtVar);
            xhv.b(xhtVar.b(), xhtVar.f(), deviceInfo);
        } catch (cpy unused) {
            LogUtil.d("unite_HwCommonFileMgr", "handleConsult TlvException");
        }
    }

    private void e(DeviceInfo deviceInfo, byte[] bArr) {
        cpl.d("unite_HwCommonFileMgr", bArr, "5.40.5 handleDeviceRequestData : ");
        if (bArr == null || bArr.length < 2) {
            return;
        }
        try {
            cql.c cVarA = new cql().a(bArr, 2);
            c(cVarA.d((byte) 1, 0), cVarA.d((byte) 2, 0L), cVarA.d((byte) 3, 0), xhb.c(cVarA.a((byte) 4, null)), deviceInfo);
        } catch (cpy unused) {
            LogUtil.d("unite_HwCommonFileMgr", "handleRequestHash TlvException");
        }
    }

    private void c(int i, long j, int i2, List<Integer> list, DeviceInfo deviceInfo) {
        if (this.z.containsKey(xhw.d(deviceInfo.getDeviceMac(), i))) {
            i();
            e(i, j, i2, list, deviceInfo);
        } else {
            LogUtil.e("unite_HwCommonFileMgr", "fileId is not in mTransferingFileList");
        }
    }

    private void e(int i, long j, int i2, List<Integer> list, DeviceInfo deviceInfo) {
        byte[] bArrDigest;
        LogUtil.b("unite_HwCommonFileMgr", "Enter sendDataToDevice fileId: ", Integer.valueOf(i), ", offset: ", Long.valueOf(j), ", length: ", Integer.valueOf(i2), ", bitmap.size :", Integer.valueOf(list.size()));
        String strD = xhw.d(deviceInfo.getDeviceMac(), i);
        if (!this.z.containsKey(strD)) {
            LogUtil.e("unite_HwCommonFileMgr", "sendDataToDevice, found no fileId");
            return;
        }
        if (list.size() > 0) {
            StringBuffer stringBuffer = new StringBuffer();
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next());
            }
            LogUtil.e("unite_HwCommonFileMgr", "this request is retransmission. bitmap content is :", stringBuffer.toString());
        }
        xhr xhrVar = this.z.get(strD);
        byte[] bArrD = d(xhrVar, i, j, i2);
        if (bArrD.length == 0) {
            LogUtil.b("unite_HwCommonFileMgr", "send file may delete, no need to trans.");
            xhr xhrVarB = TransferFileQueueManager.b().b("file_fail_check_is_cancel");
            if (xhrVarB != null && xhrVarB.b() != null) {
                LogUtil.b("unite_HwCommonFileMgr", "user cancel this task, no need to deal this.");
                return;
            } else {
                d(i, 140006, deviceInfo);
                return;
            }
        }
        xht xhtVar = this.f.get(strD);
        if (xhtVar != null && xhtVar.h()) {
            try {
                bArrDigest = MessageDigest.getInstance("SHA-256").digest(bArrD);
            } catch (NoSuchAlgorithmException unused) {
                bArrDigest = new byte[0];
                LogUtil.d("unite_HwCommonFileMgr", "digest, NoSuchAlgorithmException");
            }
            String strD2 = cph.d(bArrDigest);
            if (!TextUtils.isEmpty(strD2)) {
                LogUtil.b("unite_HwCommonFileMgr", "send suframecheckresult hash to device, get hash success! checkResult: ", strD2);
                xhv.c(i, j, i2, strD2, deviceInfo);
            } else {
                LogUtil.e("unite_HwCommonFileMgr", "send suframecheckresult hash to device, get hash failed");
                xhv.c(i, j, i2, null, deviceInfo);
            }
        }
        xhs xhsVarC = this.p.c(i, j, i2, list, deviceInfo);
        xhsVarC.b(xhrVar.y());
        e(xhsVarC, bArrD, strD);
    }

    private byte[] d(xhr xhrVar, int i, long j, int i2) {
        IOException e2;
        int i3;
        synchronized (this) {
            try {
                if (xhrVar == null || i2 > 10485760 || i2 < 0) {
                    LogUtil.e("unite_HwCommonFileMgr", "getFileByPath info is null or length is illegal.");
                    return new byte[0];
                }
                Map<Integer, byte[]> map = this.h.get(Long.valueOf(j));
                if (map != null && map.get(Integer.valueOf(i)) != null) {
                    LogUtil.e("unite_HwCommonFileMgr", "cacheBytesMap length is ：", Integer.valueOf(map.size()));
                    return map.get(Integer.valueOf(i));
                }
                if (this.m != i || this.l == null) {
                    LogUtil.e("unite_HwCommonFileMgr", "getFileByPath fileId is not same or stream is null.");
                    g();
                    this.m = i;
                    this.l = xhn.a(xhrVar, xhrVar.aq());
                }
                if (this.l == null) {
                    LogUtil.e("unite_HwCommonFileMgr", "getFileByPath error.");
                    cpm.d(this.y);
                    return new byte[0];
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i2);
                try {
                    FileChannel channel = this.l.getChannel();
                    this.g = channel;
                    i3 = channel.read(byteBufferAllocate, j);
                    try {
                        LogUtil.b("unite_HwCommonFileMgr", "mCurrentFileInputStream size: ", Integer.valueOf(this.l.available()), "mChannel: ", Long.valueOf(this.g.size()), "getFileByPath readFileSize: ", Integer.valueOf(i3));
                    } catch (IOException e3) {
                        e2 = e3;
                        LogUtil.d("unite_HwCommonFileMgr", "getFileByPath IOException ", cpc.c(e2));
                    }
                } catch (IOException e4) {
                    e2 = e4;
                    i3 = 0;
                }
                if (i3 == -1) {
                    LogUtil.e("unite_HwCommonFileMgr", "getFileByPath set read position occur error.");
                    return new byte[0];
                }
                byte[] bArrArray = byteBufferAllocate.array();
                e(j, i, bArrArray);
                return bArrArray;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void e(long j, int i, byte[] bArr) {
        if (this.h.size() >= 4) {
            Long key = this.h.entrySet().iterator().next().getKey();
            key.longValue();
            this.h.remove(key);
        }
        HashMap map = new HashMap();
        map.put(Integer.valueOf(i), bArr);
        LogUtil.b("unite_HwCommonFileMgr", "bufferArrayMap add.", Integer.valueOf(map.size()));
        this.h.put(Long.valueOf(j), map);
    }

    public void a(ParcelFileDescriptor parcelFileDescriptor) {
        this.y = parcelFileDescriptor;
    }

    private void e(xhs xhsVar, byte[] bArr, String str) {
        int i;
        int i2;
        int iE = xhsVar.e();
        e(str, xhsVar.j());
        xht xhtVar = this.f.get(str);
        if (xhtVar == null) {
            LogUtil.e("unite_HwCommonFileMgr", "fileTransferParameter is null,fileId is :", Integer.valueOf(iE));
            return;
        }
        int iE2 = xhtVar.e();
        int i3 = 1;
        boolean z = !xhtVar.f();
        LogUtil.b("unite_HwCommonFileMgr", "sendDataToDevice, isNeedEncrypt :", Boolean.valueOf(z), ", frameLength :", Integer.valueOf(iE2));
        int iD = xhv.d(xhsVar.b(), iE2);
        long j = xhsVar.j();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i6 < iD) {
            int iD2 = xhv.d(xhsVar.b(), iE2, i7);
            int i8 = i4 > 255 ? 0 : i4;
            List<Integer> listA = xhsVar.a();
            if (xhtVar.i() && listA.size() > 0 && listA.get(i8).intValue() == i3) {
                LogUtil.b("unite_HwCommonFileMgr", "sendDataToDevice, this frame does not need to be retransmitted!");
                i = iD2;
                i2 = i7;
            } else {
                xhq xhqVar = new xhq();
                xhqVar.e(iE);
                xhqVar.d(i8);
                xhqVar.c(j);
                xhqVar.c(z);
                d(xhqVar, xhv.e(i5, iD2, bArr), xhsVar);
                i = iD2;
                i2 = i7;
                this.p.c(i8, i, j, i2);
            }
            i7 = i2 + i;
            j += (long) i;
            i4 = i8 + 1;
            i6++;
            i5 += i;
            iE2 = iE2;
            z = z;
            i3 = 1;
        }
        int iD3 = xhtVar.d();
        LogUtil.b("unite_HwCommonFileMgr", "sendDataToDevice, mWaitTimeout :", Integer.valueOf(iD3));
        a(iE, iD3, xhsVar.c());
    }

    private void f() {
        xhr xhrVarB = TransferFileQueueManager.b().b("left_file_size_small");
        if (xhrVarB != null) {
            xhrVarB.e(0);
        }
        this.p.b();
    }

    private void e(String str, long j) {
        xhr xhrVar = this.z.get(str);
        if (xhrVar != null && xhrVar.l() != null) {
            long jU = xhrVar.u();
            if (jU != 0) {
                this.aa = 1;
                xhr xhrVar2 = this.k;
                if (xhrVar2 != null) {
                    xhrVar2.d(j);
                }
                long j2 = (100 * j) / jU;
                if (jU - j < PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) {
                    f();
                }
                if (j2 < -2147483648L || j2 > 2147483647L) {
                    LogUtil.b("unite_HwCommonFileMgr", "progressLong is not Integer.");
                    return;
                }
                int i = (int) j2;
                LogUtil.b("unite_HwCommonFileMgr", "fileSize :", Long.valueOf(jU), " , offset :", Long.valueOf(j), " , progress :", Integer.valueOf(i));
                try {
                    xhrVar.l().onFileTransferState(i, "");
                    xhrVar.l().onFileTransferReport(xhn.d("transferWay", "bluetooth"));
                } catch (Exception e2) {
                    LogUtil.d("unite_HwCommonFileMgr", "reportProgressForUi Exception", cpc.c(e2));
                }
            }
        }
        e("bluetooth");
    }

    private void d(xhq xhqVar, byte[] bArr, xhs xhsVar) {
        cmg cmgVarA = xhn.a(xhqVar, bArr);
        cmg.b bVar = new cmg.b();
        if (!xhqVar.e()) {
            bVar.b(false);
        }
        bVar.a(CommandPriorAdapter.INSTANCE.getFileTransferPrior(xhsVar.d()));
        synchronized (f52985a) {
            this.i.add(bVar.a(cmgVarA));
        }
        b(xhsVar.c());
    }

    private void b(DeviceInfo deviceInfo) {
        if (this.s == null) {
            this.s = HandlerCenter.b(new e(), "unite_HwCommonFileMgr");
            Message messageObtain = Message.obtain();
            messageObtain.what = 400;
            messageObtain.obj = deviceInfo;
            this.s.sendMessage(messageObtain);
            return;
        }
        Message messageObtain2 = Message.obtain();
        messageObtain2.what = 400;
        messageObtain2.obj = deviceInfo;
        this.s.sendMessage(messageObtain2);
    }

    private void a(int i, long j, DeviceInfo deviceInfo) {
        if (this.s != null) {
            if (j != 0) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 100;
                messageObtain.arg1 = i;
                messageObtain.obj = deviceInfo;
                this.s.sendMessage(messageObtain, j * 1000);
                return;
            }
            return;
        }
        this.s = HandlerCenter.b(new e(), "unite_HwCommonFileMgr");
        if (j != 0) {
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = 100;
            messageObtain2.arg1 = i;
            messageObtain2.obj = deviceInfo;
            this.s.sendMessage(messageObtain2, j * 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j, int i) {
        if (this.s == null) {
            this.s = HandlerCenter.b(new e(), "unite_HwCommonFileMgr");
        }
        if (j != 0) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 101;
            messageObtain.arg1 = i;
            this.s.sendMessage(messageObtain, j * 1000);
        }
    }

    private void h(DeviceInfo deviceInfo, byte[] bArr) {
        cpl.d("unite_HwCommonFileMgr", bArr, "5.40.7 handleDeviceResultReport :");
        g();
        if (bArr == null || bArr.length < 2) {
            return;
        }
        try {
            cql.c cVarA = new cql().a(bArr, 2);
            b(cVarA.d((byte) 1, 0), cVarA.d((byte) 2, -1), deviceInfo);
        } catch (cpy unused) {
            LogUtil.d("unite_HwCommonFileMgr", "handleDeviceResultReport TlvException");
        }
    }

    private void b(int i, int i2, DeviceInfo deviceInfo) {
        if (this.s == null) {
            this.s = HandlerCenter.b(new e(), "unite_HwCommonFileMgr");
            Message messageObtain = Message.obtain();
            messageObtain.what = 200;
            messageObtain.arg1 = i;
            messageObtain.arg2 = i2;
            messageObtain.obj = deviceInfo;
            this.s.sendMessage(messageObtain);
            return;
        }
        Message messageObtain2 = Message.obtain();
        messageObtain2.what = 200;
        messageObtain2.arg1 = i;
        messageObtain2.arg2 = i2;
        messageObtain2.obj = deviceInfo;
        this.s.sendMessage(messageObtain2);
    }

    private void f(DeviceInfo deviceInfo, byte[] bArr) {
        cpl.d("unite_HwCommonFileMgr", bArr, "5.40.8 handleDeviceStatusReport :");
        g();
        i();
        if (bArr == null || bArr.length < 2) {
            return;
        }
        try {
            cql.c cVarA = new cql().a(bArr, 2);
            d(cVarA.d((byte) 1, 0), cVarA.d(Ascii.DEL, 0), deviceInfo);
        } catch (cpy unused) {
            LogUtil.d("unite_HwCommonFileMgr", "handleDeviceStatusReport TlvException");
        }
    }

    private void d(int i, int i2, DeviceInfo deviceInfo) {
        if (this.s == null) {
            this.s = HandlerCenter.b(new e(), "unite_HwCommonFileMgr");
            Message messageObtain = Message.obtain();
            messageObtain.what = 300;
            messageObtain.arg1 = i;
            messageObtain.arg2 = i2;
            messageObtain.obj = deviceInfo;
            this.s.sendMessage(messageObtain);
            return;
        }
        Message messageObtain2 = Message.obtain();
        messageObtain2.what = 300;
        messageObtain2.arg1 = i;
        messageObtain2.arg2 = i2;
        messageObtain2.obj = deviceInfo;
        this.s.sendMessage(messageObtain2);
    }

    private void d(DeviceInfo deviceInfo, byte[] bArr) {
        cpl.d("unite_HwCommonFileMgr", bArr, "5.40.9 handleCancelReply :");
        if (bArr == null || bArr.length < 2) {
            return;
        }
        try {
            cql.c cVarA = new cql().a(bArr, 2);
            e(cVarA.d((byte) 1, 0), cVarA.d(Ascii.DEL, 0), deviceInfo);
        } catch (cpy unused) {
            LogUtil.d("unite_HwCommonFileMgr", "handleCancelReply TlvException");
        }
    }

    private void d(final String str, final xhr xhrVar) {
        this.aa = 0;
        ThreadPoolManager.c().execute(new Runnable() { // from class: xhf
            @Override // java.lang.Runnable
            public final void run() {
                this.f52979c.b(xhrVar, str);
            }
        });
    }

    /* synthetic */ void b(xhr xhrVar, String str) {
        xia xiaVarI = HwWifiP2pTransferManager.a().i();
        if (xiaVarI != null && xiaVarI.l() == -1) {
            this.v = false;
            xhrVar.n(1);
        } else {
            this.v = xhx.a(xhrVar, this.ac, this.q, -10);
        }
        LogUtil.b("unite_HwCommonFileMgr", "wifiAndBtTask ", str, " : ", Boolean.valueOf(this.v));
        if (this.v) {
            return;
        }
        this.z.remove(String.valueOf(xhrVar.y()));
        c(xhrVar);
    }

    private void e(int i, int i2, DeviceInfo deviceInfo) {
        xhr xhrVarB;
        String strD = xhw.d(deviceInfo.getDeviceMac(), i);
        LogUtil.b("unite_HwCommonFileMgr", "mIsBtToWifiState:", Boolean.valueOf(this.t), "errorCode:", Integer.valueOf(i2));
        xhr xhrVar = this.z.get(strD);
        if (i2 == 100000 && this.t && xhrVar != null) {
            this.t = false;
            i();
            a(xhrVar, xhn.a(deviceInfo), 1);
            xhrVar.c(xhn.a(deviceInfo));
            this.z.put(String.valueOf(xhrVar.y()), xhrVar);
            d("reportCancelResult", xhrVar);
            return;
        }
        if (this.t && (xhrVarB = TransferFileQueueManager.b().b("want change wifi and stop bt, but device wrong.")) != null) {
            HwWifiP2pTransferManager.a().b(xhrVarB.y());
        }
        c(i2, deviceInfo, xhrVar);
    }

    protected void c(int i, DeviceInfo deviceInfo, xhr xhrVar) {
        if (xhrVar == null || xhrVar.b() == null) {
            return;
        }
        try {
            LogUtil.b("unite_HwCommonFileMgr", "handleCancelReply errorCode :", Integer.valueOf(i));
            if (i == 100000) {
                if (xhrVar.y() != 1) {
                    xhrVar.b().onResponse(20003, "");
                } else {
                    xhrVar.b().onResponse(20003, String.valueOf(xhrVar.n()));
                    LogUtil.b("unite_HwCommonFileMgr", "entry  watchType callback , fileName: ", xhrVar.n());
                }
                i();
                a(xhrVar, xhn.a(deviceInfo), 0);
                return;
            }
            if (xhrVar.y() != 1) {
                xhrVar.b().onResponse(20004, "");
            } else {
                xhrVar.b().onResponse(20004, String.valueOf(xhrVar.n()));
            }
        } catch (Exception e2) {
            LogUtil.d("unite_HwCommonFileMgr", "handleCancelReply Exception", cpc.c(e2));
        }
    }

    public class e implements Handler.Callback {
        public e() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 100) {
                xhj.this.e(message);
                return true;
            }
            if (i == 101) {
                xhj.this.p.e(message, xhj.this.z);
                return true;
            }
            if (i == 200) {
                int i2 = message.arg1;
                int i3 = message.arg2;
                Object obj = message.obj;
                if (obj instanceof DeviceInfo) {
                    DeviceInfo deviceInfo = (DeviceInfo) obj;
                    LogUtil.b("unite_HwCommonFileMgr", "handleMessage receive result! fileId :", Integer.valueOf(i2), " , result :", Integer.valueOf(i3), " , deviceInfo :", cpl.a(deviceInfo.getDeviceMac()));
                    xhv.a(i2, deviceInfo);
                    xhj.this.a(deviceInfo, i2, i3);
                }
                return true;
            }
            if (i == 300) {
                xhj.this.b(message);
                return true;
            }
            if (i == 400) {
                Object obj2 = message.obj;
                if (obj2 instanceof DeviceInfo) {
                    xhj.this.c((DeviceInfo) obj2);
                }
                return true;
            }
            LogUtil.e("unite_HwCommonFileMgr", "handleMessage default msg.what :", Integer.valueOf(message.what));
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Message message) {
        int i = message.arg1;
        int i2 = message.arg2;
        Object obj = message.obj;
        if (obj instanceof DeviceInfo) {
            DeviceInfo deviceInfo = (DeviceInfo) obj;
            LogUtil.b("unite_HwCommonFileMgr", "handleMessage device report error, fileId :", Integer.valueOf(i), " , result :", Integer.valueOf(i2), " , deviceInfo :", cpl.a(deviceInfo.getDeviceMac()));
            xhr xhrVarB = this.z.get(xhw.d(deviceInfo.getDeviceMac(), i));
            if (xhrVarB == null) {
                LogUtil.b("unite_HwCommonFileMgr", "5.40.2 no response.");
                xhrVarB = TransferFileQueueManager.b().b("5.40.8");
            }
            d(xhrVarB, i2);
            a(xhrVarB, xhn.a(deviceInfo), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Message message) {
        this.aa = 0;
        LogUtil.b("unite_HwCommonFileMgr", "handleMessage wait timeout! fileId :", Integer.valueOf(message.arg1));
        Object obj = message.obj;
        if (obj instanceof DeviceInfo) {
            DeviceInfo deviceInfo = (DeviceInfo) obj;
            if (cop.e()) {
                lng.c("FileTransfer", "Device replies 5.40.x reach timeout");
            }
            xhr xhrVarB = TransferFileQueueManager.b().b("5.40.x timeout");
            if (xhrVarB == null || xhrVarB.l() == null) {
                return;
            }
            try {
                LogUtil.b("unite_HwCommonFileMgr", "getSendFileStatus : ", Integer.valueOf(xhrVarB.af()));
                if (xhrVarB.af() == 2) {
                    xhrVarB.l().onTransferFailed(109022, xhrVarB.h().getIdentify());
                } else {
                    xhrVarB.l().onTransferFailed(141000, "");
                }
            } catch (Exception e2) {
                LogUtil.d("unite_HwCommonFileMgr", "processTimeout Exception", cpc.c(e2));
            }
            a(xhrVarB, xhn.a(deviceInfo), 0);
        }
    }

    protected void e() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: xhl
            @Override // java.lang.Runnable
            public final void run() {
                this.e.d();
            }
        });
    }

    /* synthetic */ void d() {
        String identify;
        LogUtil.b("unite_HwCommonFileMgr", "processWifiEnableMessage enter.");
        if (this.p.e(this.o)) {
            if (this.o.h() == null) {
                identify = "";
            } else {
                identify = this.o.h().getIdentify();
            }
            HwWifiP2pTransferManager.a().r();
            HwWifiP2pTransferManager.a().c(this.o, this.ac, 1);
            HwWifiP2pTransferManager.a().d(identify, new HwWifiP2pTransferManager.TransferBleToWifiCallback() { // from class: xhh
                @Override // com.huawei.unitedevice.hwwifip2ptransfermgr.HwWifiP2pTransferManager.TransferBleToWifiCallback
                public final void onResult(boolean z) {
                    this.f52983b.e(z);
                }
            });
        }
    }

    /* synthetic */ void e(boolean z) {
        LogUtil.b("unite_HwCommonFileMgr", "isWifiSuccess: ", Boolean.valueOf(z), " fileId: ", Integer.valueOf(this.o.m()));
        if (z) {
            this.t = true;
            g();
            xhn.d(this.o, this.z);
            xhv.d(this.o.h(), this.o.m(), this.o);
            return;
        }
        HwWifiP2pTransferManager.a().c();
        HwWifiP2pTransferManager.a().b(this.o.y());
        this.t = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(DeviceInfo deviceInfo, int i, int i2) {
        try {
            xhr xhrVar = this.z.get(xhw.d(deviceInfo.getDeviceMac(), i));
            if (xhrVar == null || xhrVar.l() == null) {
                return;
            }
            i();
            a(xhrVar, xhn.a(deviceInfo), 0);
            this.aa = 0;
            if (i2 == 1) {
                xhrVar.l().onFileTransferState(100, "");
            }
            xhrVar.l().onFileRespond(i2, "");
            LogUtil.b("unite_HwCommonFileMgr", "handleMessage receive result! onFileRespond");
        } catch (Exception e2) {
            LogUtil.d("unite_HwCommonFileMgr", "handleMessage receive result! Exception", cpc.c(e2));
        }
    }

    private void d(xhr xhrVar, int i) {
        if (xhrVar != null) {
            try {
                if (xhrVar.l() != null) {
                    xhrVar.l().onTransferFailed(i, "");
                    LogUtil.b("unite_HwCommonFileMgr", "reportFailedForUi fileId errorCode :", Integer.valueOf(i));
                }
            } catch (Exception e2) {
                LogUtil.d("unite_HwCommonFileMgr", "reportFailedForUi Exception", cpc.c(e2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(DeviceInfo deviceInfo) {
        ArrayList arrayList = new ArrayList(16);
        synchronized (f52985a) {
            cmg cmgVarPoll = this.i.poll();
            while (cmgVarPoll != null) {
                arrayList.add(cmgVarPoll);
                cmgVarPoll = this.i.poll();
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            xhv.d(xhn.a(deviceInfo), (cmg) it.next());
        }
    }

    public void d(UniteDevice uniteDevice, CommonFileInfoParcel commonFileInfoParcel, ITransferFileCallback iTransferFileCallback) {
        if (commonFileInfoParcel == null || iTransferFileCallback == null || TextUtils.isEmpty(commonFileInfoParcel.getFileName())) {
            LogUtil.e("unite_HwCommonFileMgr", "stopTransferByQueue param empty");
            return;
        }
        if (TransferFileQueueManager.b().e("stopTransferByQueue", commonFileInfoParcel.getFileType(), commonFileInfoParcel.getFileName()) != null) {
            LogUtil.b("unite_HwCommonFileMgr", "task no in header, remove and stop it.");
            d(iTransferFileCallback, commonFileInfoParcel, 20003);
            return;
        }
        xhr xhrVarB = TransferFileQueueManager.b().b("stop_task");
        if (xhrVarB == null) {
            LogUtil.d("unite_HwCommonFileMgr", "no any task in queue, immediately report cancel fail.");
            d(iTransferFileCallback, commonFileInfoParcel, 20004);
            return;
        }
        xhrVarB.b(iTransferFileCallback);
        this.aa = 0;
        this.t = false;
        LogUtil.e("unite_HwCommonFileMgr", "mIsWifiP2pTransfer:", Boolean.valueOf(this.v));
        if (this.v) {
            if (xhx.d(commonFileInfoParcel, iTransferFileCallback)) {
                LogUtil.e("unite_HwCommonFileMgr", "wifiP2pStopTransferFileByQueue removeCache");
                c(commonFileInfoParcel);
                return;
            }
            xhr xhrVar = this.z.get(String.valueOf(commonFileInfoParcel.getFileType()));
            if (xhrVar != null) {
                LogUtil.e("unite_HwCommonFileMgr", "stopTransferByQueue: fileInfo.setCallback()");
                xhrVar.b(iTransferFileCallback);
                return;
            } else {
                LogUtil.e("unite_HwCommonFileMgr", "stopTransferByQueue: fileInfo is null");
                return;
            }
        }
        if (!commonFileInfoParcel.isInTheQueue()) {
            LogUtil.b("unite_HwCommonFileMgr", "stop transfer file is not in the queue");
            this.p.b();
            this.p.c();
            e(uniteDevice, commonFileInfoParcel.getFileName(), commonFileInfoParcel.getFileType(), iTransferFileCallback);
            return;
        }
        e(uniteDevice, commonFileInfoParcel, iTransferFileCallback);
    }

    private void d(ITransferFileCallback iTransferFileCallback, CommonFileInfoParcel commonFileInfoParcel, int i) {
        if (commonFileInfoParcel != null) {
            try {
                if (commonFileInfoParcel.getFileType() == 1) {
                    String fileName = commonFileInfoParcel.getFileName();
                    iTransferFileCallback.onResponse(i, String.valueOf(fileName));
                    LogUtil.b("unite_HwCommonFileMgr", "entry  watchType callback , fileName: ", fileName);
                    return;
                }
            } catch (Exception e2) {
                LogUtil.d("unite_HwCommonFileMgr", "immediatelyReportCancelResult Exception", cpc.c(e2));
                return;
            }
        }
        iTransferFileCallback.onResponse(i, "");
    }

    private void e(UniteDevice uniteDevice, CommonFileInfoParcel commonFileInfoParcel, ITransferFileCallback iTransferFileCallback) {
        xhr xhrVarB = this.p.b(commonFileInfoParcel);
        synchronized (this.q) {
            LinkedList<xhr> linkedList = this.q.get(Integer.valueOf(xhrVarB.y()));
            if (linkedList != null && linkedList.peek() != null) {
                xhr xhrVarPeek = linkedList.peek();
                if (xhrVarPeek != null && xhrVarPeek.equals(xhrVarB)) {
                    LogUtil.b("unite_HwCommonFileMgr", "stopTransfer firstTask");
                    e(uniteDevice, xhrVarPeek.n(), xhrVarPeek.y(), iTransferFileCallback);
                    return;
                }
                try {
                    Iterator<xhr> it = linkedList.iterator();
                    while (it.hasNext()) {
                        if (it.next().equals(xhrVarB)) {
                            it.remove();
                            iTransferFileCallback.onResponse(20003, "");
                            return;
                        }
                    }
                    iTransferFileCallback.onResponse(20004, "");
                } catch (Exception e2) {
                    LogUtil.d("unite_HwCommonFileMgr", "synchronizedFileQueueMap Exception", cpc.c(e2));
                }
                return;
            }
            LogUtil.e("unite_HwCommonFileMgr", "stopTransfer error");
        }
    }

    private void a(FileInfo fileInfo, long j, UniteDevice uniteDevice, IResultAIDLCallback iResultAIDLCallback) {
        xhr xhrVar = new xhr();
        xhrVar.c(fileInfo.getFileName());
        xhrVar.d(fileInfo.getFilePath());
        xhrVar.g(fileInfo.getFileType());
        xhrVar.a(j);
        xhrVar.e(iResultAIDLCallback);
        xhrVar.c(uniteDevice);
        if (fileInfo.getSourceId() > 0) {
            xhrVar.g(fileInfo.getSourceId());
        }
        xhrVar.h(fileInfo.getPackageName());
        xhrVar.a(xhrVar.y());
        xhrVar.e(fileInfo.getFileDescriptor());
        xhrVar.i(xhn.d(xhrVar, this.y));
        xhrVar.c(TransferFileQueueManager.TaskMode.APP);
        if (TransferFileQueueManager.b().e(xhrVar, "app.startToSendFileInfo")) {
            a(xhrVar);
        } else {
            LogUtil.b("unite_HwCommonFileMgr", "app want send file, wait queue.");
        }
    }

    public void a(xhr xhrVar) {
        g();
        synchronized (f52987c) {
            this.k = xhrVar;
            this.o = xhrVar;
        }
        this.z.put(String.valueOf(xhrVar.y()), xhrVar);
        d("startToSendFileInfo", xhrVar);
    }

    private void c(CommonFileInfoParcel commonFileInfoParcel) {
        LogUtil.b("unite_HwCommonFileMgr", "remove cache");
        this.z.remove(String.valueOf(commonFileInfoParcel.getFileType()));
        TransferFileQueueManager.b().i("stop_file_success.");
        xhr xhrVar = new xhr();
        xhrVar.c(commonFileInfoParcel.getFileName());
        xhrVar.g(commonFileInfoParcel.getFileType());
        xhrVar.g(commonFileInfoParcel.getSourcePackageName());
        xhrVar.a(commonFileInfoParcel.getDestinationPackageName());
        synchronized (this.q) {
            LinkedList<xhr> linkedList = this.q.get(Integer.valueOf(commonFileInfoParcel.getFileType()));
            if (linkedList != null && !linkedList.isEmpty()) {
                Iterator<xhr> it = linkedList.iterator();
                while (it.hasNext()) {
                    if (it.next().equals(xhrVar)) {
                        it.remove();
                        LogUtil.b("unite_HwCommonFileMgr", "remove file queue map.");
                        return;
                    }
                }
            }
        }
    }

    public void e(UniteDevice uniteDevice, String str, int i, ITransferFileCallback iTransferFileCallback) {
        if (uniteDevice == null || str == null || iTransferFileCallback == null) {
            LogUtil.e("unite_HwCommonFileMgr", "stopTransferFile param empty");
            return;
        }
        LogUtil.b("unite_HwCommonFileMgr", "stopTransferFile fileName : ", str, "fileType: ", Integer.valueOf(i));
        for (Map.Entry<String, xhr> entry : this.z.entrySet()) {
            LogUtil.b("unite_HwCommonFileMgr", "stopTransferFile fileMap.getValue().getFileName():", entry.getValue().n(), "stopTransferFile fileMap.getValue().getFileType():", Integer.valueOf(entry.getValue().y()));
            if (!TextUtils.equals(entry.getValue().n(), str) || entry.getValue().y() != i) {
                LogUtil.e("unite_HwCommonFileMgr", "stopTransferFile else branch");
            } else {
                LogUtil.b("unite_HwCommonFileMgr", "stopTransferFile fileName :", entry.getValue().n());
                entry.getValue().b(iTransferFileCallback);
                e(uniteDevice, entry.getValue().m(), entry.getKey());
            }
        }
    }

    private void e(UniteDevice uniteDevice, int i, String str) {
        g();
        xhv.d(uniteDevice, i, this.z.get(str));
    }

    public void b() {
        xhg.e().d(this.j);
        this.n.unregisterReceiver(this.x);
        j();
    }

    private static void j() {
        synchronized (e) {
            d = null;
        }
    }

    public static xhj c() {
        xhj xhjVar;
        synchronized (e) {
            if (d == null) {
                d = new xhj(BaseApplication.b());
            }
            xhjVar = d;
        }
        return xhjVar;
    }
}
