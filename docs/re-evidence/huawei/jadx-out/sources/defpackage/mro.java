package defpackage;

import android.content.BroadcastReceiver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.health.devicemgr.business.constant.TransferFileReqType;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback;
import com.huawei.hwservicesmgr.IBaseCallback;
import com.huawei.hwservicesmgr.IOTAResultAIDLCallback;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import com.huawei.phoneservice.feedbackcommon.network.FeedbackWebConstants;
import com.huawei.unitedevice.callback.IResultAIDLCallback;
import com.huawei.unitedevice.callback.ITransferFileCallback;
import com.huawei.unitedevice.entity.UniteDevice;
import com.huawei.watchface.mvp.model.latona.provider.WatchFaceProvider;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.IoUtils;
import health.compact.a.LocalBroadcast;
import health.compact.a.LogAnonymous;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
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
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class mro extends HwBaseManager implements ParserInterface {
    private static volatile mro j;
    private ConcurrentHashMap<Integer, mrn> f;
    private CopyOnWriteArrayList<mrk> h;
    private Map<Integer, Map<Integer, byte[]>> i;
    private FileChannel k;
    private Context l;
    private int m;
    private mrk n;
    private BroadcastReceiver o;
    private HandlerThread p;
    private final HashMap<Integer, LinkedList<mrk>> q;
    private d r;
    private Queue<DeviceCommand> s;
    private FileInputStream t;
    private ConcurrentHashMap<Integer, mrk> u;
    private ParcelFileDescriptor v;
    private IAppTransferFileResultAIDLCallback w;
    private eet x;
    private static final String d = BaseApplication.getContext().getFilesDir() + "/fileShare/";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f42280c = "watchfacePhoto" + File.separator + WatchFaceProvider.BACKGROUND_LABEL;
    private static final String g = "watchfaceVideo" + File.separator + WatchFaceProvider.BACKGROUND_LABEL;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f42279b = new Object();
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f42278a = new byte[0];

    private mro(Context context) {
        super(context);
        this.q = new HashMap<>(16);
        this.m = -1;
        this.t = null;
        this.k = null;
        this.i = new LinkedHashMap(4);
        this.u = new ConcurrentHashMap<>(20);
        this.h = new CopyOnWriteArrayList<>();
        this.s = new LinkedList();
        this.x = new eet();
        this.f = new ConcurrentHashMap<>(20);
        this.w = null;
        this.o = new BroadcastReceiver() { // from class: mro.4
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                DeviceInfo deviceInfo;
                if (context2 == null || intent == null || !"com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction()) || (deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo")) == null) {
                    return;
                }
                if ((deviceInfo.getRelationship() == null || !"followed_relationship".equals(deviceInfo.getRelationship())) && deviceInfo.getDeviceConnectState() == 3) {
                    mro.this.g();
                    mro.this.j();
                }
            }
        };
        this.l = context;
        HandlerThread handlerThread = new HandlerThread("HwCommonFileMgr");
        this.p = handlerThread;
        handlerThread.start();
        this.r = new d(this.p.getLooper());
        BroadcastManagerUtil.c(this.l, this.o, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), LocalBroadcast.f36595c, null);
    }

    public void d() {
        if (mjx.a()) {
            return;
        }
        this.l.unregisterReceiver(this.o);
        a();
        b();
    }

    private static void a() {
        synchronized (e) {
            j = null;
        }
    }

    private void b() {
        HandlerThread handlerThread = this.p;
        if (handlerThread != null) {
            handlerThread.quit();
            this.p = null;
        }
    }

    public static mro e() {
        mro mroVar;
        synchronized (e) {
            if (j == null) {
                j = new mro(BaseApplication.getContext());
            }
            mroVar = j;
        }
        return mroVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        f();
        synchronized (f42278a) {
            mrk mrkVar = this.n;
            if (mrkVar != null) {
                if (mrkVar.ah() != null) {
                    try {
                        this.n.ah().onUpgradeFailed(141001, "");
                    } catch (RemoteException unused) {
                        LogUtil.e("HwCommonFileMgr", "mCurrentCommonFileInfo appTransferFilCallback() RemoteException");
                    }
                }
                e(this.n);
                this.n = null;
            }
        }
        this.q.clear();
    }

    private void f() {
        for (Map.Entry<Integer, mrk> entry : this.u.entrySet()) {
            if (entry.getValue().ah() != null) {
                try {
                    entry.getValue().ah().onUpgradeFailed(141001, "");
                } catch (RemoteException unused) {
                    LogUtil.e("HwCommonFileMgr", "disconnected appTransferFilCallback() RemoteException");
                }
            }
            e(entry.getValue());
            synchronized (f42278a) {
                if (entry.getValue().equals(this.n)) {
                    this.n = null;
                }
            }
        }
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 40;
    }

    @Override // com.huawei.hwdevice.phoneprocess.binder.ParserInterface
    public void getResult(DeviceInfo deviceInfo, byte[] bArr) throws Throwable {
        if (bArr == null || bArr.length <= 1) {
            return;
        }
        LogUtil.a("HwCommonFileMgr", "getResult(), message :", eeq.e(bArr));
        byte b2 = bArr[1];
        switch (b2) {
            case 1:
                b(bArr, deviceInfo);
                break;
            case 2:
                d(bArr);
                break;
            case 3:
                a(bArr, deviceInfo);
                break;
            case 4:
                e(bArr, deviceInfo);
                break;
            case 5:
                a(bArr);
                break;
            case 6:
            default:
                LogUtil.j("HwCommonFileMgr", "getResult()  default switch ", Byte.valueOf(b2));
                break;
            case 7:
                c(bArr);
                break;
            case 8:
                e(bArr);
                break;
            case 9:
                b(bArr);
                break;
        }
    }

    public void d(final mrk mrkVar, final UniteDevice uniteDevice) {
        if (mrkVar == null || uniteDevice == null || mrkVar.g() == null) {
            return;
        }
        if (mjx.a() || mjx.a(uniteDevice.getIdentify())) {
            xgz xgzVar = new xgz();
            xgzVar.i(mrkVar.f());
            xgzVar.h(mrkVar.i());
            xgzVar.j(mrkVar.ac());
            xgzVar.a(mrkVar.v());
            xgzVar.c(mrkVar.n());
            xgzVar.d(mrkVar.q());
            xgzVar.e(mrkVar.m());
            xgzVar.b(mrkVar.w());
            xgzVar.d(mrkVar.e());
            xgzVar.b(mrkVar.u());
            final IOTAResultAIDLCallback iOTAResultAIDLCallbackG = mrkVar.g();
            xgt.b().p2pSendForWearEngine(this.l, uniteDevice, xgzVar, new SendCallback() { // from class: mro.5
                @Override // com.huawei.health.deviceconnect.callback.SendCallback
                public void onSendResult(int i) {
                    mro.this.d(i, iOTAResultAIDLCallbackG);
                }

                @Override // com.huawei.health.deviceconnect.callback.SendCallback
                public void onSendProgress(long j2) {
                    try {
                        iOTAResultAIDLCallbackG.onFileTransferState((int) j2);
                    } catch (RemoteException unused) {
                        LogUtil.e("HwCommonFileMgr", "callback onFileTransferState ");
                        mro.this.a(mrkVar, (IBaseCallback) null, uniteDevice);
                    }
                }

                @Override // com.huawei.health.deviceconnect.callback.SendCallback
                public void onFileTransferReport(String str) {
                    LogUtil.a("HwCommonFileMgr", "transferFileByQueue onFileTransferReport transferWay: ", str);
                    try {
                        iOTAResultAIDLCallbackG.onFileTransferReport(str);
                    } catch (RemoteException unused) {
                        LogUtil.e("HwCommonFileMgr", "onFileTransferReport remoteException");
                    }
                }
            });
            LogUtil.a("HwCommonFileMgr", "use unite_HwCommonFileMgr transferFileByQueue");
            return;
        }
        b(mrkVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, IOTAResultAIDLCallback iOTAResultAIDLCallback) {
        if (i == 207) {
            try {
                iOTAResultAIDLCallback.onFileRespond(1);
            } catch (RemoteException unused) {
                LogUtil.e("HwCommonFileMgr", "callback onSendResult");
            }
        } else {
            try {
                iOTAResultAIDLCallback.onFileRespond(i);
            } catch (RemoteException unused2) {
                LogUtil.e("HwCommonFileMgr", "callback onFileRespond");
            }
        }
    }

    private void b(mrk mrkVar) {
        int iC;
        try {
            if (mrkVar.u() != null) {
                iC = c(mrkVar.u());
            } else if (!TextUtils.isEmpty(mrkVar.m())) {
                iC = c(new File(mrkVar.m()), -1L);
            } else {
                LogUtil.j("HwCommonFileMgr", "transferFileByQueue getFileSize default");
                iC = 0;
            }
            if (iC == 0) {
                mrkVar.g().onUpgradeFailed(20000, "");
                return;
            }
            if (iC == -1) {
                mrkVar.g().onUpgradeFailed(20005, "");
                return;
            }
            mrkVar.h(iC);
            synchronized (this.q) {
                a(mrkVar);
            }
        } catch (RemoteException unused) {
            LogUtil.e("HwCommonFileMgr", "transferFileByQueue RemoteException");
        }
    }

    public void e(mhp mhpVar, IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback) {
        int iB;
        if (iAppTransferFileResultAIDLCallback == null) {
            return;
        }
        if (mhpVar == null) {
            try {
                iAppTransferFileResultAIDLCallback.onUpgradeFailed(20000, "");
                return;
            } catch (RemoteException unused) {
                LogUtil.e("HwCommonFileMgr", "startTransfer RemoteException");
                return;
            }
        }
        if (mjx.a() || mjx.a(mhpVar.c())) {
            a(mhpVar, iAppTransferFileResultAIDLCallback);
            return;
        }
        try {
            TransferFileReqType transferFileReqTypeK = mhpVar.k();
            List<Integer> listA = mhpVar.a();
            if (transferFileReqTypeK == TransferFileReqType.DEVICE_REGISTRATION && listA.size() > 0) {
                c(iAppTransferFileResultAIDLCallback, listA);
                return;
            }
            if (transferFileReqTypeK == TransferFileReqType.APP_STOP) {
                d(mhpVar, iAppTransferFileResultAIDLCallback);
                return;
            }
            if (transferFileReqTypeK == TransferFileReqType.APP_DELIVERY) {
                if (!TextUtils.isEmpty(mhpVar.i()) && (iB = b(mhpVar, iAppTransferFileResultAIDLCallback)) != -1 && iB != 0) {
                    b(mhpVar, iAppTransferFileResultAIDLCallback, iB);
                    return;
                }
                return;
            }
            LogUtil.a("HwCommonFileMgr", "startToDeviceTransFile error");
        } catch (RemoteException unused2) {
            LogUtil.e("HwCommonFileMgr", "startTransfer RemoteException");
        }
    }

    private void b(mhp mhpVar, IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback, int i) {
        mrk mrkVar = new mrk();
        mrkVar.b(mhpVar.f());
        mrkVar.c(mhpVar.i());
        mrkVar.f(mhpVar.n());
        mrkVar.h(i);
        mrkVar.a(iAppTransferFileResultAIDLCallback);
        if (mhpVar.m() > 0) {
            mrkVar.c(mhpVar.m());
        }
        if (!c(mrkVar)) {
            this.h.add(mrkVar);
        }
        c();
        synchronized (f42278a) {
            this.n = mrkVar;
        }
        c(mhpVar.f(), i, mhpVar.n(), mhpVar.o());
    }

    private int b(mhp mhpVar, IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback) throws RemoteException {
        String canonicalPath;
        int iC;
        try {
            canonicalPath = new File(mhpVar.i()).getCanonicalPath();
        } catch (IOException unused) {
            LogUtil.e("HwCommonFileMgr", "startTransfer IOException");
            canonicalPath = null;
        }
        if (TextUtils.isEmpty(canonicalPath)) {
            return 0;
        }
        File file = new File(canonicalPath);
        if (!file.exists()) {
            iAppTransferFileResultAIDLCallback.onUpgradeFailed(20000, "");
            return 0;
        }
        if (mhpVar.m() > 0) {
            iC = c(file, mhpVar.m());
        } else {
            iC = c(file, -1L);
        }
        if (iC == 0) {
            iAppTransferFileResultAIDLCallback.onUpgradeFailed(20000, "");
            return iC;
        }
        if (iC == -1) {
            iAppTransferFileResultAIDLCallback.onUpgradeFailed(20005, "");
        }
        return iC;
    }

    private void a(mhp mhpVar, final IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback) {
        xhr xhrVarE = e(mhpVar);
        if (TextUtils.isEmpty(mhpVar.c())) {
            xhrVarE.c(xit.e(mrs.b()));
        }
        IResultAIDLCallback.Stub stub = new IResultAIDLCallback.Stub() { // from class: mro.1
            @Override // com.huawei.unitedevice.callback.IResultAIDLCallback
            public void onFileTransferState(int i, String str) throws RemoteException {
                try {
                    LogUtil.a("HwCommonFileMgr", "onFileTransferState percentage:", Integer.valueOf(i), ",des", str);
                    iAppTransferFileResultAIDLCallback.onFileTransferState(i, str);
                } catch (Exception e2) {
                    LogUtil.e("HwCommonFileMgr", "transferState ", this, "callback : ", iAppTransferFileResultAIDLCallback, ExceptionUtils.c(e2));
                }
            }

            @Override // com.huawei.unitedevice.callback.IResultAIDLCallback
            public void onTransferFailed(int i, String str) throws RemoteException {
                try {
                    LogUtil.a("HwCommonFileMgr", " onUpgradeFailed errorCode:", Integer.valueOf(i), ",des", str);
                    iAppTransferFileResultAIDLCallback.onUpgradeFailed(i, str);
                } catch (Exception e2) {
                    LogUtil.e("HwCommonFileMgr", "onUpgradeFailed Exception ", ExceptionUtils.c(e2));
                }
            }

            @Override // com.huawei.unitedevice.callback.IResultAIDLCallback
            public void onFileRespond(int i, String str) throws RemoteException {
                try {
                    LogUtil.a("HwCommonFileMgr", "checkResult:", Integer.valueOf(i), ",des", str);
                    iAppTransferFileResultAIDLCallback.onFileRespond(i, str);
                } catch (Exception e2) {
                    LogUtil.e("HwCommonFileMgr", "onFileRespond Exception : ", ExceptionUtils.c(e2));
                }
            }

            @Override // com.huawei.unitedevice.callback.IResultAIDLCallback
            public void onFileTransferReport(String str) {
                LogUtil.a("HwCommonFileMgr", "transferFileByQueue onFileTransferReport transferWay: ", str);
            }
        };
        xgt.b().startTransferFileToWear(xhrVarE, stub);
        LogUtil.a("HwCommonFileMgr", "use unite_HWcommonfileMgr startTransferFile : ", stub);
    }

    private xhr e(mhp mhpVar) {
        xhr xhrVar = new xhr();
        xhrVar.c(mhpVar.f());
        xhrVar.d(mhpVar.i());
        xhrVar.g(mhpVar.n());
        xhrVar.c(mhpVar.m());
        xhrVar.h(mhpVar.o());
        xhrVar.a(mhpVar.k());
        xhrVar.e(mhpVar.a());
        xhrVar.e(mhpVar.j());
        xhrVar.a(mhpVar.g());
        UniteDevice uniteDevice = new UniteDevice();
        uniteDevice.setIdentify(mhpVar.c());
        xhrVar.c(uniteDevice);
        return xhrVar;
    }

    private xhr a(mrk mrkVar, UniteDevice uniteDevice) {
        xhr xhrVar = new xhr();
        xhrVar.e(mrkVar.u());
        xhrVar.c(mrkVar.n());
        xhrVar.g(mrkVar.q());
        xhrVar.b(mrkVar.e());
        xhrVar.d(mrkVar.m());
        xhrVar.i(mrkVar.w());
        xhrVar.g(mrkVar.ac());
        xhrVar.j(mrkVar.v());
        xhrVar.a(mrkVar.f());
        xhrVar.e(mrkVar.i());
        xhrVar.b(true);
        if (uniteDevice == null) {
            xhrVar.c(xit.e(mrs.b()));
            return xhrVar;
        }
        xhrVar.c(uniteDevice);
        return xhrVar;
    }

    private void a(mrk mrkVar) {
        int iQ = mrkVar.q();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.q.get(Integer.valueOf(iQ)) == null) {
            this.q.put(Integer.valueOf(iQ), new LinkedList<>());
        }
        LinkedList<mrk> linkedList = this.q.get(Integer.valueOf(iQ));
        if (linkedList != null && linkedList.isEmpty()) {
            mrkVar.d(jCurrentTimeMillis);
            mrkVar.b(jCurrentTimeMillis);
            linkedList.add(mrkVar);
            f(mrkVar);
            return;
        }
        if (linkedList == null) {
            LogUtil.j("HwCommonFileMgr", "putCommonFileInfo fileBeanList is null");
            return;
        }
        LogUtil.a("HwCommonFileMgr", "putCommonFileInfo fileBeanList size :", Integer.valueOf(linkedList.size()));
        Iterator<mrk> it = linkedList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            mrk next = it.next();
            if ((next.ad() != 0 && jCurrentTimeMillis - next.ad() > 86400000) || (next.aa() != 0 && jCurrentTimeMillis - next.aa() > 3600000)) {
                LogUtil.a("HwCommonFileMgr", "putCommonFileInfo check task is not effective");
                it.remove();
            } else if (next.equals(mrkVar)) {
                z = true;
            }
        }
        if (z) {
            return;
        }
        LogUtil.j("HwCommonFileMgr", "putCommonFileInfo task is not exist");
        mrkVar.d(jCurrentTimeMillis);
        linkedList.add(mrkVar);
    }

    private void b(int i) {
        LogUtil.a("HwCommonFileMgr", "removeFirstAndSendNext");
        synchronized (this.q) {
            LinkedList<mrk> linkedList = this.q.get(Integer.valueOf(i));
            if (linkedList != null) {
                LogUtil.a("HwCommonFileMgr", "removeFirstAndSendNext fileBeanList size :", Integer.valueOf(linkedList.size()));
                linkedList.poll();
                mrk mrkVarPeek = linkedList.peek();
                if (mrkVarPeek != null) {
                    mrkVarPeek.b(System.currentTimeMillis());
                    f(mrkVarPeek);
                }
            }
        }
    }

    private void f(mrk mrkVar) {
        if (!c(mrkVar)) {
            this.h.add(mrkVar);
        }
        c();
        synchronized (f42278a) {
            this.n = mrkVar;
        }
        if (mrkVar.q() == 7) {
            mkf.e(BaseApplication.getContext()).sendDeviceData(mrs.c(mrkVar));
        } else {
            c(mrkVar.n(), mrkVar.p(), mrkVar.q(), mrkVar.ac());
        }
    }

    public void d(mrk mrkVar, IBaseCallback iBaseCallback, UniteDevice uniteDevice) {
        if (mrkVar == null || uniteDevice == null || iBaseCallback == null) {
            LogUtil.j("HwCommonFileMgr", "stopTransferByQueue param empty");
            return;
        }
        if (mjx.a() || mjx.a(uniteDevice.getIdentify())) {
            LogUtil.a("HwCommonFileMgr", "callStopTransferQueue entry");
            a(mrkVar, iBaseCallback, uniteDevice);
            return;
        }
        synchronized (this.q) {
            LinkedList<mrk> linkedList = this.q.get(Integer.valueOf(mrkVar.q()));
            if (linkedList != null && linkedList.peek() != null) {
                mrk mrkVarPeek = linkedList.peek();
                if (mrkVarPeek != null && mrkVarPeek.equals(mrkVar)) {
                    LogUtil.a("HwCommonFileMgr", "stopTransfer firstTask");
                    b(mrkVarPeek.n(), mrkVarPeek.q(), iBaseCallback);
                    return;
                }
                try {
                    Iterator<mrk> it = linkedList.iterator();
                    while (it.hasNext()) {
                        if (it.next().equals(mrkVar)) {
                            it.remove();
                            iBaseCallback.onResponse(20003, "");
                            return;
                        }
                    }
                    iBaseCallback.onResponse(20004, "");
                } catch (RemoteException unused) {
                    LogUtil.e("HwCommonFileMgr", "stopTransferByQueue RemoteException");
                }
                return;
            }
            LogUtil.j("HwCommonFileMgr", "stopTransfer error");
        }
    }

    public void a(mrk mrkVar, final IBaseCallback iBaseCallback, UniteDevice uniteDevice) {
        xgt.b().stopTransferFileToWear(a(mrkVar, uniteDevice), new ITransferFileCallback.Stub() { // from class: mro.2
            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onFailure(int i, String str) throws RemoteException {
            }

            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onProgress(int i, String str) throws RemoteException {
            }

            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onSuccess(int i, String str, String str2) throws RemoteException {
            }

            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onResponse(int i, String str) throws RemoteException {
                IBaseCallback iBaseCallback2 = iBaseCallback;
                if (iBaseCallback2 != null) {
                    iBaseCallback2.onResponse(i, str);
                }
            }
        });
        LogUtil.a("HwCommonFileMgr", "use unite_HwCommonFileMgr stopTransferByQueue");
    }

    public void b(String str, int i, final IBaseCallback iBaseCallback) {
        if (mjx.a()) {
            xhr xhrVar = new xhr();
            xhrVar.c(str);
            xhrVar.g(i);
            xhrVar.b(false);
            xhrVar.c(xit.e(mrs.b()));
            xgt.b().stopTransferFileToWear(xhrVar, new ITransferFileCallback.Stub() { // from class: mro.3
                @Override // com.huawei.unitedevice.callback.ITransferFileCallback
                public void onFailure(int i2, String str2) throws RemoteException {
                }

                @Override // com.huawei.unitedevice.callback.ITransferFileCallback
                public void onProgress(int i2, String str2) throws RemoteException {
                }

                @Override // com.huawei.unitedevice.callback.ITransferFileCallback
                public void onSuccess(int i2, String str2, String str3) throws RemoteException {
                }

                @Override // com.huawei.unitedevice.callback.ITransferFileCallback
                public void onResponse(int i2, String str2) throws RemoteException {
                    iBaseCallback.onResponse(i2, str2);
                }
            });
            return;
        }
        for (Map.Entry<Integer, mrk> entry : this.u.entrySet()) {
            if (TextUtils.equals(entry.getValue().n(), str) && entry.getValue().q() == i) {
                LogUtil.a("HwCommonFileMgr", "stopTransferFile fileId :", entry.getKey());
                entry.getValue().a(iBaseCallback);
                c(entry.getKey().intValue());
            }
        }
    }

    private void d(mhp mhpVar, final IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback) {
        b(mhpVar.f(), mhpVar.n(), new IBaseCallback.Stub() { // from class: mro.10
            @Override // com.huawei.hwservicesmgr.IBaseCallback
            public void onResponse(int i, String str) throws RemoteException {
                LogUtil.a("HwCommonFileMgr", "stopTransmit, errorCode: ", Integer.valueOf(i), ", reason: ", str);
                IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback2 = iAppTransferFileResultAIDLCallback;
                if (iAppTransferFileResultAIDLCallback2 != null) {
                    iAppTransferFileResultAIDLCallback2.onFileRespond(i, str);
                    LogUtil.a("HwCommonFileMgr", "stopTransmit onResponse");
                }
            }
        });
    }

    public void c(IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback, List<Integer> list) {
        LogUtil.a("HwCommonFileMgr", "registToDevicesCallback entry");
        this.w = iAppTransferFileResultAIDLCallback;
        LogUtil.a("HwCommonFileMgr", "registToDevicesCallback success ! ");
    }

    private void c() {
        synchronized (this) {
            this.i.clear();
            this.m = -1;
            IoUtils.c(this.k);
            IoUtils.c(this.t);
            IoUtils.c(this.v);
            this.k = null;
            this.t = null;
        }
    }

    private void b(byte[] bArr, DeviceInfo deviceInfo) throws Throwable {
        String strE = eeq.e(bArr);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            LogUtil.j("HwCommonFileMgr", "handleDeviceRequest data is error");
            return;
        }
        try {
            List<eew> listE = this.x.b(strE.substring(4)).e();
            if (listE != null && listE.size() > 0) {
                String strD = "";
                int iV = 3;
                int iV2 = -1;
                for (eew eewVar : listE) {
                    int iV3 = CommonUtil.v(eewVar.e());
                    String strB = eewVar.b();
                    if (iV3 == 1) {
                        strD = eeq.d(strB);
                        LogUtil.a("HwCommonFileMgr", "handleDeviceRequest file_name :", strD);
                    } else if (iV3 == 2) {
                        iV = CommonUtil.v(strB);
                        LogUtil.a("HwCommonFileMgr", "handleDeviceRequest file_type:", Integer.valueOf(iV));
                    } else if (iV3 == 5) {
                        iV2 = CommonUtil.v(strB);
                        LogUtil.a("HwCommonFileMgr", "handleDeviceRequest resource_Type:", Integer.valueOf(iV2));
                    } else {
                        LogUtil.a("HwCommonFileMgr", "handleDeviceRequest default type:", Integer.valueOf(iV3));
                    }
                }
                b(strD, iV, iV2, deviceInfo);
                return;
            }
            LogUtil.j("HwCommonFileMgr", "handleDeviceRequest tlvs error");
        } catch (eeu unused) {
            LogUtil.e("HwCommonFileMgr", "handleDeviceRequest error");
        }
    }

    private void b(String str, int i, int i2, DeviceInfo deviceInfo) throws Throwable {
        if (e(i, str)) {
            c(str, i, i2, 100000, deviceInfo);
            if (i == 3 || i == 10 || i == 11) {
                e(str, i, i2);
            }
            if (i == 4 || i == 5) {
                a(str, i);
                return;
            }
            return;
        }
        c(str, i, i2, 140006, deviceInfo);
    }

    private void a(String str, int i) throws Throwable {
        LogUtil.a("HwCommonFileMgr", "deviceStartPayFileTransfer fileName:", str, ", fileType:", Integer.valueOf(i));
        if (str == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        String str2 = d;
        sb.append(str2);
        sb.append(str);
        String string = sb.toString();
        if (i == 5 && str.endsWith(".png")) {
            string = str2 + (str.substring(0, str.lastIndexOf(".")) + WatchFaceConstant.BIN_SUFFIX);
            mjf.a().a(str2 + str, string);
        }
        mhp mhpVar = new mhp();
        mhpVar.h(string);
        mhpVar.a(str);
        mhpVar.c(i);
        mhpVar.e(TransferFileReqType.APP_DELIVERY);
        e(mhpVar, new IAppTransferFileResultAIDLCallback.Stub() { // from class: mro.9
            @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
            public void onFileTransferState(int i2, String str3) {
            }

            @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
            public void onUpgradeFailed(int i2, String str3) {
                LogUtil.e("HwCommonFileMgr", "deviceStartPayFileTransfer onUpgradeFailed");
            }

            @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
            public void onFileRespond(int i2, String str3) {
                LogUtil.e("HwCommonFileMgr", "deviceStartPayFileTransfer onFileRespond");
            }
        });
    }

    private void e(String str, int i, int i2) {
        try {
            mhp mhpVar = new mhp();
            mhpVar.h(d(str, i, i2));
            mhpVar.a(str);
            mhpVar.c(i);
            mhpVar.e(TransferFileReqType.APP_DELIVERY);
            if (this.w != null) {
                LogUtil.a("HwCommonFileMgr", "deviceStartToDeviceTransFile entry");
                b(mhpVar);
            } else {
                LogUtil.a("HwCommonFileMgr", "mToDevicesFileCallback is null");
            }
        } catch (IOException unused) {
            LogUtil.e("HwCommonFileMgr", "deviceStartTransfer IOException");
        }
    }

    private void b(mhp mhpVar) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ContentResource.FILE_NAME, mhpVar.f());
            jSONObject.put("fileType", mhpVar.n());
        } catch (JSONException unused) {
            LogUtil.a("HwCommonFileMgr", "transfer to JSONObject error");
        }
        e(mhpVar, new IAppTransferFileResultAIDLCallback.Stub() { // from class: mro.8
            @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
            public void onFileTransferState(int i, String str) {
                LogUtil.a("HwCommonFileMgr", "deviceStartTransfer onFileTransferState ");
                if (mro.this.w != null) {
                    try {
                        mro.this.w.onFileTransferState(i, jSONObject.toString());
                        LogUtil.a("HwCommonFileMgr", "onFileTransferState success, percentage: ", Integer.valueOf(i), ", des: ", jSONObject.toString());
                    } catch (RemoteException unused2) {
                        LogUtil.e("HwCommonFileMgr", "onFileTransferState remoteException");
                    }
                }
            }

            @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
            public void onUpgradeFailed(int i, String str) {
                LogUtil.a("HwCommonFileMgr", "deviceStartTransfer onUpgradeFailed ");
                if (mro.this.w != null) {
                    try {
                        mro.this.w.onUpgradeFailed(i, jSONObject.toString());
                        LogUtil.a("HwCommonFileMgr", "onUpgradeFailed success, errorCode: ", Integer.valueOf(i), ", des: ", jSONObject.toString());
                    } catch (RemoteException unused2) {
                        LogUtil.e("HwCommonFileMgr", "onUpgradeFailed remoteException");
                    }
                }
            }

            @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
            public void onFileRespond(int i, String str) {
                LogUtil.a("HwCommonFileMgr", "deviceStartTransfer onFileRespond ");
                if (mro.this.w != null) {
                    try {
                        mro.this.w.onFileRespond(i, jSONObject.toString());
                        LogUtil.a("HwCommonFileMgr", "onFileRespond success, checkResult: ", Integer.valueOf(i), ", des: ", jSONObject.toString());
                    } catch (RemoteException unused2) {
                        LogUtil.e("HwCommonFileMgr", "onFileRespond remoteException");
                    }
                }
            }
        });
    }

    private String d(String str, int i, int i2) throws IOException {
        String str2;
        if (i == 10) {
            return BaseApplication.getContext().getFilesDir().getCanonicalPath() + File.separator + g + File.separator + str;
        }
        if (i == 11) {
            str2 = BaseApplication.getContext().getFilesDir().getCanonicalPath() + File.separator + g + File.separator + str;
        } else {
            str2 = BaseApplication.getContext().getFilesDir().getCanonicalPath() + File.separator + f42280c + File.separator + str;
        }
        int iLastIndexOf = str2.lastIndexOf(".");
        if (i2 != 1) {
            if (iLastIndexOf >= str2.length()) {
                str2 = "";
            } else {
                str2 = str2.substring(0, iLastIndexOf) + WatchFaceConstant.BIN_SUFFIX;
            }
        }
        LogUtil.a("HwCommonFileMgr", "deviceStartTransfer filePath :", str2);
        return str2;
    }

    private boolean e(int i, String str) {
        if (str == null) {
            LogUtil.j("HwCommonFileMgr", "checkFileExist fileType :", Integer.valueOf(i), ", fileName = null");
            return false;
        }
        if (i != 3) {
            if (i == 4 || i == 5) {
                return d(str);
            }
            if (i != 10 && i != 11) {
                LogUtil.j("HwCommonFileMgr", "checkFileExist fileType :", Integer.valueOf(i), ", file type is not support.");
                return false;
            }
        }
        return d(str, i);
    }

    private boolean d(String str) {
        if (str == null || str.isEmpty()) {
            LogUtil.j("HwCommonFileMgr", "checkPayFileExist fileName null or empty");
            return false;
        }
        File file = new File(d + str);
        LogUtil.a("HwCommonFileMgr", " checkPayFileExist file exists :", Boolean.valueOf(file.exists()));
        return file.exists();
    }

    private boolean d(String str, int i) {
        try {
            File file = new File((i == 10 || i == 11) ? BaseApplication.getContext().getFilesDir().getCanonicalPath() + File.separator + g : BaseApplication.getContext().getFilesDir().getCanonicalPath() + File.separator + f42280c);
            if (!file.isDirectory()) {
                return false;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                for (File file2 : fileArrListFiles) {
                    String name = file2.getName();
                    if (i == 10 && name.contains(str)) {
                        LogUtil.j("HwCommonFileMgr", "checkFileExist exists WATCH_VIDEO_FILE_TYPE");
                        return true;
                    }
                    if (name.contains(str) && name.endsWith(".png")) {
                        LogUtil.a("HwCommonFileMgr", "checkFileExist exists");
                        return true;
                    }
                }
                return false;
            }
            LogUtil.j("HwCommonFileMgr", "files is null or length = 0");
            return false;
        } catch (IOException unused) {
            LogUtil.e("HwCommonFileMgr", "checkFileExist IOException");
            return false;
        }
    }

    private void c(String str, int i, int i2, int i3, DeviceInfo deviceInfo) {
        String str2;
        String strA = eeq.a(str);
        String str3 = eeq.d(1) + eeq.d(strA.length() / 2) + strA;
        String str4 = eeq.d(2) + eeq.d(1) + eeq.d(i);
        String str5 = eeq.d(127) + eeq.d(4) + eeq.c(i3);
        DeviceCommand deviceCommand = new DeviceCommand();
        if (i2 != -1) {
            str2 = str3 + str4 + (eeq.d(5) + eeq.d(1) + eeq.d(i2)) + str5;
        } else {
            str2 = str3 + str4 + str5;
        }
        deviceCommand.setServiceID(40);
        deviceCommand.setCommandID(1);
        deviceCommand.setDataContent(eeq.c(str2));
        deviceCommand.setDataLen(eeq.c(str2).length);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        LogUtil.a("HwCommonFileMgr", "reportDeviceRequest, deviceCommand :", deviceCommand.toString());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    private void d(byte[] bArr) {
        LogUtil.a("HwCommonFileMgr", "5.40.2 handleAppSend :", eeq.e(bArr));
        String strE = eeq.e(bArr);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            return;
        }
        String strSubstring = strE.substring(4);
        mrk mrkVar = new mrk();
        int i = 0;
        try {
            List<eew> listE = this.x.b(strSubstring).e();
            if (listE != null && listE.size() > 0) {
                for (eew eewVar : listE) {
                    int iV = CommonUtil.v(eewVar.e());
                    String strB = eewVar.b();
                    int iB = mrs.b(iV, strB, mrkVar);
                    if (iB != 0) {
                        i = iB;
                    }
                    mrs.c(iV, strB, mrkVar);
                }
            } else {
                LogUtil.j("HwCommonFileMgr", "handleAppSend tlvs error");
            }
        } catch (eeu unused) {
            LogUtil.e("HwCommonFileMgr", "handleAppSend TlvException");
        }
        c(mrkVar, i);
    }

    private void c(mrk mrkVar, int i) {
        for (mrk mrkVar2 : this.h) {
            LogUtil.a("HwCommonFileMgr", "handleAppSend has cache file :", mrkVar2.n(), " , type :", Integer.valueOf(mrkVar2.q()));
            if (mrkVar.equals(mrkVar2)) {
                mrkVar.a(mrkVar2.u());
                mrkVar.j(mrkVar2.w());
                mrkVar.c(mrkVar2.m());
                mrkVar.h(mrkVar2.p());
                mrkVar.b(mrkVar2.g());
                mrkVar.a(mrkVar2.ah());
                mrkVar.c(mrkVar2.ag());
                LogUtil.a("HwCommonFileMgr", "commonFileInfo.name :", mrkVar.n());
                break;
            }
        }
        if (i != 100000) {
            if (mrkVar.ah() != null) {
                try {
                    mrkVar.ah().onUpgradeFailed(i, "");
                    return;
                } catch (RemoteException unused) {
                    LogUtil.e("HwCommonFileMgr", "mAppTransferFilCallback() RemoteException");
                    return;
                }
            }
            LogUtil.j("HwCommonFileMgr", "file callBack is null");
            return;
        }
        LogUtil.a("HwCommonFileMgr", "device support transfer file");
        this.u.put(Integer.valueOf(mrkVar.j()), mrkVar);
        d(mrkVar);
        j();
    }

    private void d(mrk mrkVar) {
        LogUtil.a("HwCommonFileMgr", "dealWatchFaceTaskHang, getFileId :", Integer.valueOf(mrkVar.j()));
        try {
            if (mrkVar.q() == 1) {
                LogUtil.a("HwCommonFileMgr", "dealWatchFaceTaskHang, watch face type");
                return;
            }
            for (mrk mrkVar2 : this.u.values()) {
                if (mrkVar2.q() == 1) {
                    LogUtil.a("HwCommonFileMgr", "dealWatchFaceTaskHang, watch face task HANG");
                    if (mrkVar2.ah() != null) {
                        mrkVar2.ah().onFileTransferState(142000, "");
                        return;
                    } else {
                        LogUtil.j("HwCommonFileMgr", "dealWatchFaceTaskHang, fileCallback is null");
                        return;
                    }
                }
            }
        } catch (RemoteException unused) {
            LogUtil.e("HwCommonFileMgr", "dealWatchFaceTaskHang, RemoteException");
        }
    }

    private void c(String str, long j2, int i, String str2) {
        StringBuilder sb = new StringBuilder(mrs.c(str, j2, i));
        if (i == 1) {
            String[] strArrSplit = str.split("_");
            if (strArrSplit.length != 2) {
                LogUtil.j("HwCommonFileMgr", "sendFileInfo, deviceCommand error");
                return;
            }
            String strA = eeq.a(strArrSplit[0]);
            String str3 = eeq.d(5) + eeq.d(strA.length() / 2) + strA;
            String strA2 = eeq.a(strArrSplit[1]);
            String str4 = eeq.d(6) + eeq.d(strA2.length() / 2) + strA2;
            sb.append(str3);
            sb.append(str4);
            LogUtil.a("HwCommonFileMgr", "sendFileInfo, get WatchInfo success");
        } else if (i != 2 || TextUtils.isEmpty(str2) || "huaweiOnlineMusic".equals(str2)) {
            LogUtil.j("HwCommonFileMgr", "sendFileInfo error");
        } else {
            String strA3 = eeq.a(str2);
            sb.append(eeq.d(7) + eeq.d(strA3.length() / 2) + strA3);
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(40);
        deviceCommand.setCommandID(2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        deviceCommand.setDataLen(eeq.c(sb.toString()).length);
        deviceCommand.setNeedAck(true);
        LogUtil.a("HwCommonFileMgr", "sendFileInfo, deviceCommand :", deviceCommand.toString());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    private void a(byte[] bArr, DeviceInfo deviceInfo) {
        LogUtil.a("HwCommonFileMgr", "5.40.3 handleRequestHash :", eeq.e(bArr));
        String strE = eeq.e(bArr);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            return;
        }
        try {
            List<eew> listE = this.x.b(strE.substring(4)).e();
            if (listE != null && listE.size() > 0) {
                int iV = 0;
                int iV2 = 0;
                for (eew eewVar : listE) {
                    int iV3 = CommonUtil.v(eewVar.e());
                    String strB = eewVar.b();
                    if (iV3 == 1) {
                        iV = CommonUtil.v(strB);
                        LogUtil.a("HwCommonFileMgr", "handleRequestHash file_id :", Integer.valueOf(CommonUtil.v(strB)));
                    } else if (iV3 == 2) {
                        iV2 = CommonUtil.v(strB);
                        LogUtil.a("HwCommonFileMgr", "handleRequestHash check_mode :", Integer.valueOf(CommonUtil.v(strB)));
                    } else {
                        LogUtil.j("HwCommonFileMgr", "handleRequestHash default type :", Integer.valueOf(iV3));
                    }
                }
                a(iV, iV2, deviceInfo);
                return;
            }
            LogUtil.j("HwCommonFileMgr", "handleRequestHash tlvs error");
        } catch (eeu unused) {
            LogUtil.e("HwCommonFileMgr", "handleRequestHash TlvException");
        }
    }

    private void b(int i, String str, DeviceInfo deviceInfo) {
        String str2 = (eeq.d(1) + eeq.d(1) + eeq.d(i)) + (eeq.d(3) + eeq.d(str.length() / 2) + str);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(40);
        deviceCommand.setCommandID(3);
        deviceCommand.setDataContent(eeq.c(str2));
        deviceCommand.setDataLen(eeq.c(str2).length);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        LogUtil.a("HwCommonFileMgr", "sendFileHashResult, deviceCommand :", deviceCommand.toString());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    private void d(int i, DeviceInfo deviceInfo) {
        String str = (eeq.d(1) + eeq.d(1) + eeq.d(i)) + (eeq.d(127) + eeq.d(4) + eeq.c(20001L));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(40);
        deviceCommand.setCommandID(3);
        deviceCommand.setDataContent(eeq.c(str));
        deviceCommand.setDataLen(eeq.c(str).length);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        LogUtil.a("HwCommonFileMgr", "sendFileHashFailed, deviceCommand :", deviceCommand.toString());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    private void e(byte[] bArr, DeviceInfo deviceInfo) {
        LogUtil.a("HwCommonFileMgr", "5.40.4 handleConsult :", eeq.e(bArr));
        String strE = eeq.e(bArr);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            return;
        }
        String strSubstring = strE.substring(4);
        mrn mrnVar = new mrn();
        try {
            List<eew> listE = this.x.b(strSubstring).e();
            if (listE != null && listE.size() > 0) {
                for (eew eewVar : listE) {
                    c(mrnVar, CommonUtil.v(eewVar.e()), eewVar.b());
                }
                LogUtil.a("HwCommonFileMgr", "5.40.4 fileId :", Integer.valueOf(mrnVar.c()));
                this.f.put(Integer.valueOf(mrnVar.c()), mrnVar);
                d(mrnVar.c(), mrnVar.h(), deviceInfo);
                return;
            }
            LogUtil.j("HwCommonFileMgr", "handleConsult tlvs error");
        } catch (eeu unused) {
            LogUtil.e("HwCommonFileMgr", "handleConsult TlvException");
        }
    }

    private void c(mrn mrnVar, int i, String str) {
        switch (i) {
            case 1:
                mrnVar.c(CommonUtil.v(str));
                LogUtil.a("HwCommonFileMgr", "handleConsult file_id :", Integer.valueOf(CommonUtil.v(str)));
                break;
            case 2:
                mrnVar.c(eeq.d(str));
                LogUtil.a("HwCommonFileMgr", "handleConsult protocol version :", eeq.d(str));
                break;
            case 3:
                mrnVar.a(CommonUtil.v(str));
                LogUtil.a("HwCommonFileMgr", "handleConsult app_wait_time :", Integer.valueOf(CommonUtil.v(str)));
                break;
            case 4:
                mrnVar.c(CommonUtil.v(str) == 1);
                LogUtil.a("HwCommonFileMgr", "handleConsult bitmap_enable :", Integer.valueOf(CommonUtil.v(str)));
                break;
            case 5:
                mrnVar.g(CommonUtil.v(str));
                LogUtil.a("HwCommonFileMgr", "handleConsult unit_size :", Integer.valueOf(CommonUtil.v(str)));
                break;
            case 6:
                mrnVar.d(CommonUtil.v(str));
                LogUtil.a("HwCommonFileMgr", "handleConsult max_apply_data_size :", Integer.valueOf(CommonUtil.v(str)));
                break;
            case 7:
                mrnVar.b(CommonUtil.v(str));
                LogUtil.a("HwCommonFileMgr", "handleConsult interval :", Integer.valueOf(CommonUtil.v(str)));
                break;
            case 8:
                mrnVar.f(CommonUtil.v(str));
                LogUtil.a("HwCommonFileMgr", "handleConsult received_file_size :", Integer.valueOf(CommonUtil.v(str)));
                break;
            case 9:
                mrnVar.d(CommonUtil.v(str) == 1);
                LogUtil.a("HwCommonFileMgr", "handleConsult not need encrypt :", Boolean.valueOf(mrnVar.h()));
                break;
            default:
                LogUtil.j("HwCommonFileMgr", "handleParamTlv default type :", Integer.valueOf(i));
                break;
        }
    }

    private void d(int i, boolean z, DeviceInfo deviceInfo) {
        String str;
        LogUtil.a("HwCommonFileMgr", "enter sendConsultAck fileId :", Integer.valueOf(i), ", isNormal :", Boolean.valueOf(z));
        String str2 = eeq.d(1) + eeq.d(1) + eeq.d(i);
        String str3 = eeq.d(127) + eeq.d(4) + eeq.c(SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US);
        if (z) {
            str = str3 + str2 + (eeq.d(9) + eeq.d(1) + eeq.d(1));
        } else {
            str = str3 + str2;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(40);
        deviceCommand.setCommandID(4);
        deviceCommand.setDataContent(eeq.c(str));
        deviceCommand.setDataLen(eeq.c(str).length);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        LogUtil.a("HwCommonFileMgr", "sendConsultAck, deviceCommand :", deviceCommand.toString());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    private void a(byte[] bArr) {
        LogUtil.a("HwCommonFileMgr", "5.40.5 handleDeviceRequestData :", eeq.e(bArr));
        String strE = eeq.e(bArr);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            return;
        }
        String strSubstring = strE.substring(4);
        List<Integer> arrayList = new ArrayList<>(20);
        try {
            List<eew> listE = this.x.b(strSubstring).e();
            if (listE == null || listE.size() <= 0) {
                return;
            }
            int iV = 0;
            int iV2 = 0;
            int iV3 = 0;
            for (eew eewVar : listE) {
                int iV4 = CommonUtil.v(eewVar.e());
                String strB = eewVar.b();
                if (iV4 == 1) {
                    iV = CommonUtil.v(strB);
                    LogUtil.a("HwCommonFileMgr", "handleDeviceRequestData file_id :", Integer.valueOf(CommonUtil.v(strB)));
                } else if (iV4 == 2) {
                    iV2 = CommonUtil.v(strB);
                    LogUtil.a("HwCommonFileMgr", "handleDeviceRequestData offset :", Integer.valueOf(CommonUtil.v(strB)));
                } else if (iV4 == 3) {
                    iV3 = CommonUtil.v(strB);
                    LogUtil.a("HwCommonFileMgr", "handleDeviceRequestData length :", Integer.valueOf(CommonUtil.v(strB)));
                } else if (iV4 == 4) {
                    arrayList = nda.c(strB);
                    LogUtil.a("HwCommonFileMgr", "handleDeviceRequestData bitmap :", Integer.valueOf(arrayList.size()));
                } else {
                    LogUtil.j("HwCommonFileMgr", "handleDeviceRequestData default :", Integer.valueOf(iV4));
                }
            }
            d(iV, iV2, iV3, arrayList);
        } catch (eeu unused) {
            LogUtil.e("HwCommonFileMgr", "handleRequestHash TlvException");
        }
    }

    private void d(int i, int i2, int i3, List<Integer> list) {
        if (this.u.containsKey(Integer.valueOf(i))) {
            j();
            e(i, i2, i3, list);
        } else {
            LogUtil.j("HwCommonFileMgr", "fileId is not in mTransferingFileList");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        d dVar = this.r;
        if (dVar == null || !dVar.hasMessages(100)) {
            return;
        }
        this.r.removeMessages(100);
    }

    private void c(int i, int i2, int i3, byte[] bArr, boolean z) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(40);
        deviceCommand.setCommandID(6);
        String strD = eeq.d(i);
        String strD2 = eeq.d(i2);
        String strC = eeq.c(i3);
        String strE = eeq.e(bArr);
        StringBuilder sb = new StringBuilder(16);
        sb.append(strD);
        sb.append(strD2);
        sb.append(strC);
        sb.append(strE);
        byte[] bArrC = eeq.c(sb.toString());
        deviceCommand.setDataContent(bArrC);
        deviceCommand.setDataLen(bArrC.length);
        if (!z) {
            deviceCommand.setNeedEncrypt(false);
        }
        synchronized (f42279b) {
            this.s.add(deviceCommand);
        }
        h();
    }

    private void h() {
        if (this.r == null) {
            HandlerThread handlerThread = new HandlerThread("HwCommonFileMgr");
            this.p = handlerThread;
            handlerThread.start();
            this.r = new d(this.p.getLooper());
            Message messageObtain = Message.obtain();
            messageObtain.what = 400;
            this.r.sendMessage(messageObtain);
            return;
        }
        Message messageObtain2 = Message.obtain();
        messageObtain2.what = 400;
        this.r.sendMessage(messageObtain2);
    }

    private void c(byte[] bArr) {
        LogUtil.a("HwCommonFileMgr", "5.40.7 handleDeviceResultReport :", eeq.e(bArr));
        c();
        String strE = eeq.e(bArr);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            return;
        }
        try {
            List<eew> listE = this.x.b(strE.substring(4)).e();
            if (listE == null || listE.size() <= 0) {
                return;
            }
            int iV = -1;
            int iV2 = 0;
            for (eew eewVar : listE) {
                int iV3 = CommonUtil.v(eewVar.e());
                String strB = eewVar.b();
                if (iV3 == 1) {
                    iV2 = CommonUtil.v(strB);
                    LogUtil.a("HwCommonFileMgr", "handleDeviceResultReport file_id :", Integer.valueOf(CommonUtil.v(strB)));
                } else if (iV3 == 2) {
                    iV = CommonUtil.v(strB);
                    LogUtil.a("HwCommonFileMgr", "handleDeviceResultReport validity_result :", Integer.valueOf(CommonUtil.v(strB)));
                } else {
                    LogUtil.j("HwCommonFileMgr", "handleDeviceResultReport default type :", Integer.valueOf(iV3));
                }
            }
            e(iV2, iV);
        } catch (eeu unused) {
            LogUtil.e("HwCommonFileMgr", "handleDeviceResultReport TlvException");
        }
    }

    private void e(int i, int i2) {
        if (this.r == null) {
            HandlerThread handlerThread = new HandlerThread("HwCommonFileMgr");
            this.p = handlerThread;
            handlerThread.start();
            this.r = new d(this.p.getLooper());
            Message messageObtain = Message.obtain();
            messageObtain.what = 200;
            messageObtain.arg1 = i;
            messageObtain.arg2 = i2;
            this.r.sendMessage(messageObtain);
            return;
        }
        Message messageObtain2 = Message.obtain();
        messageObtain2.what = 200;
        messageObtain2.arg1 = i;
        messageObtain2.arg2 = i2;
        this.r.sendMessage(messageObtain2);
    }

    private void d(int i) {
        String str = (eeq.d(127) + eeq.d(4) + eeq.c(SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US)) + (eeq.d(1) + eeq.d(1) + eeq.d(i));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(40);
        deviceCommand.setCommandID(7);
        deviceCommand.setDataContent(eeq.c(str));
        deviceCommand.setDataLen(eeq.c(str).length);
        LogUtil.a("HwCommonFileMgr", "sendResultAck, deviceCommand :", deviceCommand.toString());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    private void e(byte[] bArr) {
        LogUtil.a("HwCommonFileMgr", "5.40.8 handleDeviceStatusReport :", eeq.e(bArr));
        c();
        j();
        String strE = eeq.e(bArr);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            return;
        }
        try {
            List<eew> listE = this.x.b(strE.substring(4)).e();
            if (listE != null && listE.size() > 0) {
                int iV = 0;
                int iV2 = 0;
                for (eew eewVar : listE) {
                    int iV3 = CommonUtil.v(eewVar.e());
                    String strB = eewVar.b();
                    if (iV3 == 1) {
                        iV = CommonUtil.v(strB);
                        LogUtil.a("HwCommonFileMgr", "handleDeviceStatusReport file_id :", Integer.valueOf(CommonUtil.v(strB)));
                    } else if (iV3 == 127) {
                        iV2 = CommonUtil.v(strB);
                        LogUtil.a("HwCommonFileMgr", "handleDeviceStatusReport status :", Integer.valueOf(CommonUtil.v(strB)));
                    } else {
                        LogUtil.j("HwCommonFileMgr", "handleDeviceStatusReport default tag :", Integer.valueOf(iV3));
                    }
                }
                d(iV, iV2);
                return;
            }
            LogUtil.j("HwCommonFileMgr", "handleDeviceStatusReport tlvs error");
        } catch (eeu unused) {
            LogUtil.e("HwCommonFileMgr", "handleDeviceStatusReport TlvException");
        }
    }

    private void d(int i, int i2) {
        if (this.r == null) {
            HandlerThread handlerThread = new HandlerThread("HwCommonFileMgr");
            this.p = handlerThread;
            handlerThread.start();
            this.r = new d(this.p.getLooper());
            Message messageObtain = Message.obtain();
            messageObtain.what = 300;
            messageObtain.arg1 = i;
            messageObtain.arg2 = i2;
            this.r.sendMessage(messageObtain);
            return;
        }
        Message messageObtain2 = Message.obtain();
        messageObtain2.what = 300;
        messageObtain2.arg1 = i;
        messageObtain2.arg2 = i2;
        this.r.sendMessage(messageObtain2);
    }

    private void c(int i) {
        c();
        String str = eeq.d(1) + eeq.d(1) + eeq.d(i);
        mrk mrkVar = this.u.get(Integer.valueOf(i));
        StringBuilder sb = new StringBuilder(16);
        sb.append(str);
        if (mrkVar != null && mrkVar.q() == 7) {
            String strA = eeq.a(mrkVar.n());
            sb.append(eeq.d(2) + eeq.d(strA.length() / 2) + strA);
            String strA2 = eeq.a(mrkVar.ac());
            sb.append(eeq.d(3) + eeq.d(strA2.length() / 2) + strA2);
            String strA3 = eeq.a(mrkVar.f());
            sb.append(eeq.d(4) + eeq.d(strA3.length() / 2) + strA3);
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(40);
        deviceCommand.setCommandID(9);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        deviceCommand.setDataLen(eeq.c(sb.toString()).length);
        LogUtil.a("HwCommonFileMgr", "sendCancelCommand, deviceCommand :", deviceCommand.toString());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    private void b(byte[] bArr) {
        LogUtil.a("HwCommonFileMgr", "5.40.9 handleCancelReply :", eeq.e(bArr));
        String strE = eeq.e(bArr);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            return;
        }
        try {
            List<eew> listE = this.x.b(strE.substring(4)).e();
            if (listE != null && listE.size() > 0) {
                int iV = 0;
                int iV2 = 0;
                for (eew eewVar : listE) {
                    int iV3 = CommonUtil.v(eewVar.e());
                    String strB = eewVar.b();
                    if (iV3 == 1) {
                        iV = CommonUtil.v(strB);
                        LogUtil.a("HwCommonFileMgr", "handleCancelReply CANCEL_FILE_ID :", Integer.valueOf(CommonUtil.v(strB)));
                    } else if (iV3 == 127) {
                        iV2 = CommonUtil.v(strB);
                        LogUtil.a("HwCommonFileMgr", "handleCancelReply validity_result :", Integer.valueOf(CommonUtil.v(strB)));
                    } else {
                        LogUtil.j("HwCommonFileMgr", "handleCancelReply default type :", Integer.valueOf(iV3));
                    }
                }
                c(iV, iV2);
                return;
            }
            LogUtil.j("HwCommonFileMgr", "handleCancelReply tlvs error");
        } catch (eeu unused) {
            LogUtil.e("HwCommonFileMgr", "handleCancelReply TlvException");
        }
    }

    private void c(int i, int i2) {
        mrk mrkVar = this.u.get(Integer.valueOf(i));
        if (mrkVar == null || mrkVar.a() == null) {
            return;
        }
        try {
            LogUtil.a("HwCommonFileMgr", "handleCancelReply errorCode :", Integer.valueOf(i2));
            if (i2 == 100000) {
                if (mrkVar.q() != 1) {
                    mrkVar.a().onResponse(20003, "");
                } else {
                    mrkVar.a().onResponse(20003, String.valueOf(mrkVar.n()));
                    LogUtil.a("HwCommonFileMgr", "entry  watchType callback , fileName: ", mrkVar.n());
                }
                j();
                e(mrkVar);
                return;
            }
            if (mrkVar.q() != 1) {
                mrkVar.a().onResponse(20004, "");
            } else {
                mrkVar.a().onResponse(20004, String.valueOf(mrkVar.n()));
            }
        } catch (RemoteException unused) {
            LogUtil.e("HwCommonFileMgr", "handleCancelReply RemoteException");
        }
    }

    private void a(int i, int i2, DeviceInfo deviceInfo) {
        LogUtil.a("HwCommonFileMgr", "enter sendFileHashToDevice, fileId :", Integer.valueOf(i), ", check_mode :", Integer.valueOf(i2));
        if (this.u.get(Integer.valueOf(i)) == null) {
            LogUtil.j("HwCommonFileMgr", "sendFileHashToDevice, mFileInfoList have not or filePath isEmpty");
            d(i, deviceInfo);
        } else if (i2 == 3) {
            a(i, deviceInfo);
        }
    }

    private void a(int i, DeviceInfo deviceInfo) {
        if (this.u.get(Integer.valueOf(i)) == null) {
            d(i, deviceInfo);
            LogUtil.j("HwCommonFileMgr", "handleShare commonFileInfo error");
            return;
        }
        String strW = this.u.get(Integer.valueOf(i)).w();
        if (TextUtils.isEmpty(strW)) {
            LogUtil.a("HwCommonFileMgr", "handleShare not from cache :", Integer.valueOf(i));
            strW = g(this.u.get(Integer.valueOf(i)));
        }
        if (!TextUtils.isEmpty(strW)) {
            LogUtil.a("HwCommonFileMgr", "sendFileHashToDevice, get hash success");
            b(i, strW, deviceInfo);
        } else {
            LogUtil.j("HwCommonFileMgr", "sendFileHashToDevice, get hash failed");
            d(i, deviceInfo);
        }
    }

    private void e(int i, int i2, int i3, List<Integer> list) {
        LogUtil.a("HwCommonFileMgr", "Enter sendDataToDevice fileId: ", Integer.valueOf(i), ", offset: ", Integer.valueOf(i2), ", length: ", Integer.valueOf(i3), ", bitmap.size :", Integer.valueOf(list.size()));
        if (!this.u.containsKey(Integer.valueOf(i))) {
            LogUtil.j("HwCommonFileMgr", "sendDataToDevice, found no fileId");
        } else {
            e(i, i2, i3, e(this.u.get(Integer.valueOf(i)), i, i2, i3));
        }
    }

    private void e(int i, int i2, int i3, byte[] bArr) {
        f(i, i2);
        mrn mrnVar = this.f.get(Integer.valueOf(i));
        if (mrnVar == null) {
            LogUtil.j("HwCommonFileMgr", "fileTransferParameter is null,fileId is :", Integer.valueOf(i));
            return;
        }
        int iE = mrnVar.e();
        boolean z = !mrnVar.h();
        LogUtil.a("HwCommonFileMgr", "sendDataToDevice, isNeedEncrypt :", Boolean.valueOf(z), ", frameLength :", Integer.valueOf(iE));
        int iA = a(i3, iE);
        int i4 = i2;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < iA; i8++) {
            int iD = d(i3, iE, i7);
            byte[] bArrB = b(i6, iD, bArr);
            int i9 = i5 > 255 ? 0 : i5;
            c(i, i9, i4, bArrB, z);
            StringBuilder sb = new StringBuilder(16);
            sb.append("transferData psnID ");
            sb.append(i9);
            sb.append("length = ");
            sb.append(iD);
            sb.append("ota_offset = ");
            sb.append(i4);
            sb.append("sended_length = ");
            sb.append(i7);
            LogUtil.a("HwCommonFileMgr", sb.toString());
            i7 += iD;
            i4 += iD;
            i6 += iD;
            i5 = i9 + 1;
        }
        mrn mrnVar2 = this.f.get(Integer.valueOf(i));
        int iD2 = mrnVar2 != null ? mrnVar2.d() : 0;
        LogUtil.a("HwCommonFileMgr", "sendDataToDevice, mWaitTimeout :", Integer.valueOf(iD2));
        i(i, iD2);
    }

    private int a(int i, int i2) {
        int i3;
        if (i % i2 == 0) {
            i3 = i / i2;
        } else {
            i3 = (i / i2) + 1;
        }
        LogUtil.a("HwCommonFileMgr", "sendDataToDevice, file_array :", Integer.valueOf(i3));
        return i3;
    }

    private byte[] b(int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[i2];
        try {
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        } catch (ArrayIndexOutOfBoundsException e2) {
            LogUtil.e("HwCommonFileMgr", "getSendBytes, ArrayIndexOutOfBoundsException,", ExceptionUtils.c(e2));
            return bArr2;
        }
    }

    private int d(int i, int i2, int i3) {
        if ((i - i3) / i2 != 0) {
            LogUtil.a("HwCommonFileMgr", "send max, size :", Integer.valueOf(i2));
            return i2;
        }
        int i4 = i % i2;
        LogUtil.a("HwCommonFileMgr", "send not max, size :", Integer.valueOf(i4));
        return i4;
    }

    private void f(int i, int i2) {
        int iP;
        LogUtil.a("HwCommonFileMgr", "reportProgressForUi entry.");
        if (this.u.get(Integer.valueOf(i)) == null || (iP = this.u.get(Integer.valueOf(i)).p()) == 0) {
            return;
        }
        long j2 = (((long) i2) * 100) / ((long) iP);
        if (j2 < -2147483648L || j2 > 2147483647L) {
            LogUtil.a("HwCommonFileMgr", "progressLong is not Integer.");
            return;
        }
        int i3 = (int) j2;
        LogUtil.a("HwCommonFileMgr", "fileSize :", Integer.valueOf(iP), " , offset :", Integer.valueOf(i2), " , progress :", Integer.valueOf(i3));
        try {
            if (this.u.get(Integer.valueOf(i)).ah() != null) {
                this.u.get(Integer.valueOf(i)).ah().onFileTransferState(i3, "");
            } else {
                LogUtil.a("HwCommonFileMgr", "CallBack() is null");
            }
        } catch (RemoteException unused) {
            LogUtil.e("HwCommonFileMgr", "reportProgressForUi, RemoteException");
        }
    }

    private void i(int i, int i2) {
        if (this.r != null) {
            if (i2 != 0) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 100;
                messageObtain.arg1 = i;
                this.r.sendMessageDelayed(messageObtain, ((long) i2) * 1000);
                return;
            }
            return;
        }
        HandlerThread handlerThread = new HandlerThread("HwCommonFileMgr");
        this.p = handlerThread;
        handlerThread.start();
        this.r = new d(this.p.getLooper());
        if (i2 != 0) {
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = 100;
            messageObtain2.arg1 = i;
            this.r.sendMessageDelayed(messageObtain2, ((long) i2) * 1000);
        }
    }

    private byte[] e(mrk mrkVar, int i, int i2, int i3) {
        IOException e2;
        int i4;
        synchronized (this) {
            try {
                if (mrkVar == null || i3 > 10485760) {
                    LogUtil.j("HwCommonFileMgr", "getFileByPath info is null or length is illegal.");
                    return new byte[0];
                }
                Map<Integer, byte[]> map = this.i.get(Integer.valueOf(i2));
                if (map != null && map.get(Integer.valueOf(i)) != null) {
                    LogUtil.j("HwCommonFileMgr", "cacheBytesMap length is ：", Integer.valueOf(map.size()));
                    return map.get(Integer.valueOf(i));
                }
                if (this.m != i || this.t == null) {
                    LogUtil.j("HwCommonFileMgr", "getFileByPath fileId is not same or stream is null.");
                    c();
                    this.m = i;
                    this.t = c(mrkVar, mrkVar.ag());
                }
                if (this.t == null) {
                    LogUtil.j("HwCommonFileMgr", "getFileByPath error.");
                    IoUtils.c(this.v);
                    return new byte[0];
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i3);
                try {
                    LogUtil.a("HwCommonFileMgr", "mCurrentFileInputStream size: ", Integer.valueOf(this.t.available()));
                    FileChannel channel = this.t.getChannel();
                    this.k = channel;
                    i4 = channel.read(byteBufferAllocate, i2);
                    try {
                        LogUtil.a("HwCommonFileMgr", "mChannel: ", Long.valueOf(this.k.size()), "getFileByPath readFileSize: ", Integer.valueOf(i4));
                    } catch (IOException e3) {
                        e2 = e3;
                        LogUtil.e("HwCommonFileMgr", "getFileByPath IOException ", ExceptionUtils.c(e2));
                    }
                } catch (IOException e4) {
                    e2 = e4;
                    i4 = 0;
                }
                if (i4 == -1) {
                    LogUtil.a("HwCommonFileMgr", "getFileByPath set read position occur error.");
                    return new byte[0];
                }
                byte[] bArrArray = byteBufferAllocate.array();
                LogUtil.a("HwCommonFileMgr", "bufferArray is：", eeq.e(bArrArray));
                d(i2, i, bArrArray);
                return bArrArray;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void d(int i, int i2, byte[] bArr) {
        if (this.i.size() >= 4) {
            Integer key = this.i.entrySet().iterator().next().getKey();
            key.intValue();
            this.i.remove(key);
        }
        HashMap map = new HashMap();
        map.put(Integer.valueOf(i2), bArr);
        LogUtil.a("HwCommonFileMgr", "bufferArrayMap add.", Integer.valueOf(map.size()));
        this.i.put(Integer.valueOf(i), map);
    }

    private boolean b(String str) {
        return str == null || str.indexOf(FeedbackWebConstants.INVALID_FILE_NAME_PRE) < 0;
    }

    private int c(File file, long j2) {
        if (file != null && file.exists()) {
            FileInputStream fileInputStreamD = d(file.getPath(), j2);
            if (fileInputStreamD == null) {
                LogUtil.j("HwCommonFileMgr", "getFileSizeByFilePath, getFileSize error.");
                IoUtils.c(this.v);
                return 0;
            }
            try {
                long size = fileInputStreamD.getChannel().size();
                LogUtil.a("HwCommonFileMgr", "fileInputStream getChannel( size is: ", Long.valueOf(size));
                return size > 2147483647L ? -1 : (int) size;
            } catch (IOException unused) {
                LogUtil.e("HwCommonFileMgr", "getFileSizeByFilePath, IOException");
            } finally {
                IoUtils.c(fileInputStreamD);
                IoUtils.c(this.v);
            }
        }
        return 0;
    }

    private int c(ParcelFileDescriptor parcelFileDescriptor) {
        FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptor.getFileDescriptor());
        try {
            long size = fileInputStream.getChannel().size();
            LogUtil.a("HwCommonFileMgr", "fileInputStream getChannel( size is: ", Long.valueOf(size));
            return size > 2147483647L ? -1 : (int) size;
        } catch (IOException unused) {
            LogUtil.e("HwCommonFileMgr", "getFileSizeByFileDescriptor, IOException");
            return 0;
        } finally {
            IoUtils.c(fileInputStream);
            IoUtils.c(this.v);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(mrk mrkVar) {
        if (mrkVar == null) {
            LogUtil.j("HwCommonFileMgr", "handleFailed error, fileInfo is null");
            return;
        }
        for (int i = 0; i < this.h.size(); i++) {
            mrk mrkVar2 = this.h.get(i);
            LogUtil.a("HwCommonFileMgr", "handleFailed has cache file name :", mrkVar2.n(), " , file type :", Integer.valueOf(mrkVar2.q()));
            if (TextUtils.equals(mrkVar2.n(), mrkVar.n()) && mrkVar2.q() == mrkVar.q()) {
                LogUtil.a("HwCommonFileMgr", "delete commonFileInfo.name :", mrkVar2.n());
                this.h.remove(mrkVar2);
                break;
            }
        }
        LogUtil.a("HwCommonFileMgr", "handleFailed has fileInfo file id :", Integer.valueOf(mrkVar.j()));
        if (this.u.get(Integer.valueOf(mrkVar.j())) != null) {
            this.u.remove(Integer.valueOf(mrkVar.j()));
        }
        c();
        synchronized (f42278a) {
            if (mrkVar.equals(this.n)) {
                LogUtil.a("HwCommonFileMgr", "handleFailed set mCurrentCommonFileInfo null:", Integer.valueOf(mrkVar.j()));
                this.n = null;
            }
        }
        b(mrkVar.q());
        if (this.f.get(Integer.valueOf(mrkVar.j())) != null) {
            this.f.remove(Integer.valueOf(mrkVar.j()));
        }
    }

    private String g(mrk mrkVar) {
        if (mrkVar == null) {
            LogUtil.j("HwCommonFileMgr", "CommonFileInfo is null.");
            return null;
        }
        FileInputStream fileInputStreamC = c(mrkVar, mrkVar.ag());
        if (fileInputStreamC == null) {
            LogUtil.j("HwCommonFileMgr", "sha256File error.");
            IoUtils.c(this.v);
            return null;
        }
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                byte[] bArr = new byte[1024];
                int i = fileInputStreamC.read(bArr);
                if (i == -1) {
                    messageDigest.update(bArr, 0, 0);
                } else {
                    messageDigest.update(bArr, 0, i);
                    while (true) {
                        int i2 = fileInputStreamC.read(bArr);
                        if (i2 == -1) {
                            break;
                        }
                        messageDigest.update(bArr, 0, i2);
                    }
                }
                String strE = eeq.e(messageDigest.digest());
                b(fileInputStreamC);
                IoUtils.c(this.v);
                return strE;
            } catch (IOException unused) {
                LogUtil.e("HwCommonFileMgr", "sha256File IOException");
                b(fileInputStreamC);
                IoUtils.c(this.v);
                return "";
            } catch (NoSuchAlgorithmException unused2) {
                LogUtil.e("HwCommonFileMgr", "MessageDigest not support");
                b(fileInputStreamC);
                IoUtils.c(this.v);
                return "";
            }
        } catch (Throwable th) {
            b(fileInputStreamC);
            IoUtils.c(this.v);
            throw th;
        }
    }

    private FileInputStream c(mrk mrkVar, long j2) {
        LogUtil.a("HwCommonFileMgr", "fileInfo.getFilePath() :", mrkVar.m(), "uriId :", Long.valueOf(j2));
        LogUtil.a("HwCommonFileMgr", "getFileInputStream, fileInfo.getParcelFileDescriptor() isNull :", Boolean.valueOf(mrkVar.u() == null));
        if (mrkVar.u() != null) {
            LogUtil.a("HwCommonFileMgr", "FileDescriptor is :", mrkVar.u().getFileDescriptor());
            return new FileInputStream(mrkVar.u().getFileDescriptor());
        }
        return d(mrkVar.m(), j2);
    }

    private FileInputStream d(String str, long j2) {
        if (!b(str)) {
            LogUtil.j("HwCommonFileMgr", "getFileInputStreamByUriId checkFilepath error");
            return null;
        }
        try {
            if (j2 == -1) {
                String strC = CommonUtil.c(str);
                if (strC != null) {
                    return new FileInputStream(strC);
                }
            } else {
                Uri uriWithAppendedId = ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, j2);
                InputStream inputStreamOpenInputStream = this.l.getContentResolver().openInputStream(uriWithAppendedId);
                if (inputStreamOpenInputStream instanceof FileInputStream) {
                    LogUtil.e("HwCommonFileMgr", "transform type success ");
                    return (FileInputStream) inputStreamOpenInputStream;
                }
                LogUtil.e("HwCommonFileMgr", "transform type fail");
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.l.getContentResolver().openFileDescriptor(uriWithAppendedId, "r");
                this.v = parcelFileDescriptorOpenFileDescriptor;
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    return new FileInputStream(this.v.getFileDescriptor());
                }
            }
        } catch (FileNotFoundException unused) {
            LogUtil.e("HwCommonFileMgr", "getFileInputStreamByUriId FileNotFoundException");
        }
        return null;
    }

    private void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                LogUtil.e("HwCommonFileMgr", "close stream IoException");
            }
        }
    }

    private boolean c(mrk mrkVar) {
        Iterator<mrk> it = this.h.iterator();
        while (it.hasNext()) {
            if (it.next().equals(mrkVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: loaded from: classes11.dex */
    class d extends Handler {
        d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 100) {
                int i2 = message.arg1;
                LogUtil.a("HwCommonFileMgr", "handleMessage wait timeout! fileId :", Integer.valueOf(i2));
                mro.this.b(i2, 141000);
                mro mroVar = mro.this;
                mroVar.e((mrk) mroVar.u.get(Integer.valueOf(i2)));
                return;
            }
            if (i == 200) {
                mro.this.c(message);
                return;
            }
            if (i != 300) {
                if (i == 400) {
                    mro.this.i();
                    return;
                } else {
                    LogUtil.j("HwCommonFileMgr", "handleMessage default msg.what :", Integer.valueOf(message.what));
                    return;
                }
            }
            int i3 = message.arg1;
            int i4 = message.arg2;
            LogUtil.a("HwCommonFileMgr", "handleMessage device report error, fileId :", Integer.valueOf(i3), " , result :", Integer.valueOf(i4));
            mro.this.b(i3, i4);
            mro mroVar2 = mro.this;
            mroVar2.e((mrk) mroVar2.u.get(Integer.valueOf(i3)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Message message) {
        int i = message.arg1;
        int i2 = message.arg2;
        LogUtil.a("HwCommonFileMgr", "handleMessage receive result! fileId :", Integer.valueOf(i), " , result :", Integer.valueOf(i2));
        d(i);
        try {
            mrk mrkVar = this.u.get(Integer.valueOf(i));
            if (mrkVar != null && mrkVar.ah() != null) {
                j();
                e(mrkVar);
                if (i2 == 1) {
                    mrkVar.ah().onFileTransferState(100, "");
                }
                mrkVar.ah().onFileRespond(i2, "");
                LogUtil.a("HwCommonFileMgr", "handleMessage receive result! onFileRespond");
                return;
            }
            LogUtil.a("HwCommonFileMgr", "CallBack() is null");
        } catch (RemoteException unused) {
            LogUtil.e("HwCommonFileMgr", "handleMessage receive result! RemoteException");
        } catch (Exception e2) {
            LogUtil.e("HwCommonFileMgr", LogAnonymous.b(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        ArrayList arrayList = new ArrayList(16);
        synchronized (f42279b) {
            DeviceCommand deviceCommandPoll = this.s.poll();
            while (deviceCommandPoll != null) {
                arrayList.add(deviceCommandPoll);
                deviceCommandPoll = this.s.poll();
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            mkf.e(BaseApplication.getContext()).sendDeviceData((DeviceCommand) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, int i2) {
        try {
            if (this.u.get(Integer.valueOf(i)) == null || this.u.get(Integer.valueOf(i)).ah() == null) {
                LogUtil.a("HwCommonFileMgr", "CallBack() is null");
            } else {
                this.u.get(Integer.valueOf(i)).ah().onUpgradeFailed(i2, "");
                LogUtil.a("HwCommonFileMgr", "reportFailedForUi fileId :", Integer.valueOf(i), " , errorCode :", Integer.valueOf(i2));
            }
        } catch (RemoteException unused) {
            LogUtil.e("HwCommonFileMgr", "reportFailedForUi RemoteException");
        }
    }
}
