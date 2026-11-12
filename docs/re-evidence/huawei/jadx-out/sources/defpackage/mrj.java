package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.json.JsonSanitizer;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.IBaseCommonCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwdevice.phoneprocess.mgr.hwcommonfilemgr.bean.Priority;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback;
import com.huawei.hwservicesmgr.IBaseCallback;
import com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback;
import com.huawei.skinner.internal.OnRegisterSkinAttrsListener;
import com.huawei.ui.main.stories.me.adapter.AdapterWithBottomView;
import com.huawei.unitedevice.callback.ITransferFileCallback;
import com.huawei.unitedevice.hwcommonfilemgr.entity.CommonFileInfoParcel;
import com.huawei.unitedevice.hwcommonfilemgr.entity.RequestFileInfo;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.Sha256;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class mrj extends HwBaseManager implements ParserInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile mrj f42256a;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CopyOnWriteArrayList<mrk> f42257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f42258c;
    private mrm e;
    private c f;
    private HandlerThread g;
    private Context h;
    private ConcurrentHashMap<Integer, mrn> i;
    private IBaseResponseCallback j;
    private ConcurrentHashMap<Integer, mrk> k;
    private boolean l;
    private ConcurrentHashMap<Integer, mrl> m;
    private eet n;

    private mrj(Context context) {
        super(context);
        this.k = new ConcurrentHashMap<>(20);
        this.f42257b = new CopyOnWriteArrayList<>();
        this.m = new ConcurrentHashMap<>(20);
        this.n = new eet();
        this.l = false;
        this.i = new ConcurrentHashMap<>(20);
        this.f42258c = new BroadcastReceiver() { // from class: mrj.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (context2 == null || intent == null) {
                    LogUtil.j("CommonFileRequestManager", "CommonFileRequestManager context or intent is null");
                    return;
                }
                if (!"com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                    LogUtil.j("CommonFileRequestManager", "CommonFileRequestManager receiver not connect change");
                    return;
                }
                DeviceInfo deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo");
                if (deviceInfo == null) {
                    LogUtil.j("CommonFileRequestManager", "mConnectStateChangedReceiver deviceInfo null");
                    return;
                }
                LogUtil.a("CommonFileRequestManager", "mConnectStateChangedReceiver() status:", Integer.valueOf(deviceInfo.getDeviceConnectState()));
                if (deviceInfo.getDeviceConnectState() == 3) {
                    mrj.this.l();
                    mrj.this.i();
                    mrj.this.f.removeCallbacksAndMessages(null);
                    return;
                }
                LogUtil.d("CommonFileRequestManager", "mConnectStateChangedReceiver() default");
            }
        };
        this.h = context;
        HandlerThread handlerThread = new HandlerThread("CommonFileRequestManager");
        this.g = handlerThread;
        handlerThread.start();
        this.f = new c(this.g.getLooper());
        this.e = mrm.b();
        BroadcastManagerUtil.c(this.h, this.f42258c, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), LocalBroadcast.f36595c, null);
    }

    public void d(IBaseResponseCallback iBaseResponseCallback) {
        this.j = iBaseResponseCallback;
    }

    public void b() {
        this.j = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (!this.f42257b.isEmpty()) {
            for (mrk mrkVar : this.f42257b) {
                ITransferSleepAndDFXFileCallback iTransferSleepAndDFXFileCallbackR = mrkVar.r();
                if (iTransferSleepAndDFXFileCallbackR != null) {
                    try {
                        LogUtil.a("CommonFileRequestManager", "first command not receive, check tasks");
                        iTransferSleepAndDFXFileCallbackR.onFailure(30004, "");
                    } catch (RemoteException unused) {
                        LogUtil.e("CommonFileRequestManager", "removeAllCaches disconnected RemoteException");
                    }
                }
                IBaseCommonCallback iBaseCommonCallbackX = mrkVar.x();
                if (iBaseCommonCallbackX != null) {
                    try {
                        LogUtil.a("CommonFileRequestManager", "first command not receive, check tasks, to kit.");
                        iBaseCommonCallbackX.onResponse(300004, "");
                    } catch (RemoteException unused2) {
                        LogUtil.e("CommonFileRequestManager", "removeAllCaches disconnected RemoteException");
                    }
                }
            }
        }
        this.f42257b.clear();
    }

    private void f() {
        LogUtil.a("CommonFileRequestManager", "enter remove kit , size:", Integer.valueOf(this.f42257b.size()));
        if (this.f42257b.size() <= 0 || this.f42257b.get(0).x() == null) {
            return;
        }
        LogUtil.a("CommonFileRequestManager", "remove kit callback");
        this.f42257b.remove(0);
        k();
    }

    public void a() {
        this.h.unregisterReceiver(this.f42258c);
        c();
        d();
    }

    private static void c() {
        synchronized (d) {
            f42256a = null;
        }
    }

    private void d() {
        HandlerThread handlerThread = this.g;
        if (handlerThread != null) {
            handlerThread.quit();
            this.g = null;
        }
    }

    public static mrj e() {
        mrj mrjVar;
        synchronized (d) {
            if (f42256a == null) {
                f42256a = new mrj(BaseApplication.getContext());
            }
            mrjVar = f42256a;
        }
        return mrjVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        for (Map.Entry<Integer, mrk> entry : this.k.entrySet()) {
            LogUtil.a("CommonFileRequestManager", "disconnected fileId:", entry.getKey());
            c(entry);
            if (entry.getValue().r() != null) {
                try {
                    entry.getValue().r().onFailure(30004, "");
                } catch (RemoteException unused) {
                    LogUtil.e("CommonFileRequestManager", "disconnected RemoteException");
                }
            }
            a(entry.getValue());
        }
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 44;
    }

    @Override // com.huawei.hwdevice.phoneprocess.binder.ParserInterface
    public void getResult(DeviceInfo deviceInfo, byte[] bArr) {
        cpl.d("CommonFileRequestManager", bArr, "getResult() message: ");
        if (bArr == null || bArr.length <= 2) {
            return;
        }
        byte b2 = bArr[1];
        if (b2 == 1) {
            e(bArr);
            return;
        }
        if (b2 == 2) {
            d(bArr);
            return;
        }
        if (b2 == 3) {
            c(bArr);
            return;
        }
        if (b2 == 5) {
            a(bArr);
            return;
        }
        if (b2 == 6) {
            b(bArr);
        } else if (b2 == 7) {
            d(deviceInfo, bArr);
        } else {
            LogUtil.d("CommonFileRequestManager", "getResult() default");
        }
    }

    private void b(mrk mrkVar, long j) {
        mrkVar.b(j);
        mrkVar.d(j);
        if (this.f42257b.size() == 0) {
            this.f42257b.add(mrkVar);
        }
        d(mrkVar);
    }

    private boolean c(mrk mrkVar, long j) {
        LogUtil.a("CommonFileRequestManager", "prepare putCommonFileInfo to queue");
        boolean z = false;
        for (int i = 0; i < this.f42257b.size(); i++) {
            mrk mrkVar2 = this.f42257b.get(i);
            if ((mrkVar2.ad() != 0 && j - mrkVar2.ad() > 86400000) || (mrkVar2.aa() != 0 && j - mrkVar2.aa() > 3600000)) {
                LogUtil.a("CommonFileRequestManager", "putCommonFileInfo check task is not effective");
                this.f42257b.remove(mrkVar2);
            } else if (!mrkVar2.equals(mrkVar)) {
                continue;
            } else {
                if (mrkVar.ai()) {
                    LogUtil.a("CommonFileRequestManager", "cancel line up success:", Integer.valueOf(mrkVar.j()));
                    c(mrkVar, 3);
                    this.f42257b.remove(mrkVar2);
                    return false;
                }
                z = true;
            }
        }
        if (z) {
            LogUtil.j("CommonFileRequestManager", "putCommonFileInfo sameTask exist");
            return false;
        }
        if (mrkVar.ai()) {
            LogUtil.a("CommonFileRequestManager", "cancel line up fail:", Integer.valueOf(mrkVar.j()));
            c(mrkVar, 4);
            return false;
        }
        mrkVar.d(j);
        return c(mrkVar);
    }

    private boolean c(mrk mrkVar) {
        for (int size = this.f42257b.size() - 1; size >= 0; size--) {
            try {
                mrk mrkVar2 = this.f42257b.get(size);
                LogUtil.a("CommonFileRequestManager", "putCommonFileInfo:", Integer.valueOf(mrkVar2.y().getValue()), ",", Integer.valueOf(mrkVar.y().getValue()));
                if (size == this.f42257b.size() - 1 && mrkVar.y().getValue() <= mrkVar2.y().getValue()) {
                    LogUtil.a("CommonFileRequestManager", "putCommonFileInfo index last");
                    this.f42257b.add(mrkVar);
                    return true;
                }
                if (mrkVar.y().getValue() <= mrkVar2.y().getValue()) {
                    LogUtil.a("CommonFileRequestManager", "putCommonFileInfo insert index:", Integer.valueOf(size));
                    e(size + 1, mrkVar);
                    return true;
                }
                if (size == 0 && mrkVar.y().getValue() > mrkVar2.y().getValue()) {
                    LogUtil.a("CommonFileRequestManager", "putCommonFileInfo insert index first");
                    this.l = true;
                    this.f42257b.add(0, mrkVar);
                    return true;
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                LogUtil.e("CommonFileRequestManager", "mCacheFiles occur exception");
            }
        }
        return false;
    }

    private void e(int i, mrk mrkVar) {
        if (i > this.f42257b.size()) {
            this.f42257b.add(mrkVar);
        } else {
            this.f42257b.add(i, mrkVar);
        }
    }

    private void d(mrk mrkVar) {
        if (this.l) {
            LogUtil.a("CommonFileRequestManager", "send 5.44.1 task insert, requestNextTask");
            k();
        } else {
            DeviceCommand deviceCommandB = mrs.b(mrkVar);
            e(mrkVar.q());
            mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommandB);
            m();
        }
    }

    public void a(mhp mhpVar, final IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback) {
        b(mhpVar, new ITransferSleepAndDFXFileCallback.Stub() { // from class: mrj.2
            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onSuccess(int i, String str, String str2) throws RemoteException {
                LogUtil.a("CommonFileRequestManager", "5.44 onFileRespond onSuccess", Integer.valueOf(i));
                iAppTransferFileResultAIDLCallback.onFileRespond(i, str);
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onFailure(int i, String str) throws RemoteException {
                LogUtil.a("CommonFileRequestManager", "5.44 onFailure : ", Integer.valueOf(i));
                iAppTransferFileResultAIDLCallback.onUpgradeFailed(i, str);
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onProgress(int i, String str) throws RemoteException {
                LogUtil.a("CommonFileRequestManager", "5.44 onProgress : ", Integer.valueOf(i));
                iAppTransferFileResultAIDLCallback.onFileTransferState(i, str);
            }
        });
    }

    private void b(mhp mhpVar, ITransferSleepAndDFXFileCallback iTransferSleepAndDFXFileCallback) {
        int i;
        int i2;
        String strF = mhpVar.f();
        int iN = mhpVar.n();
        boolean zT = mhpVar.t();
        int[] iArrP = mhpVar.p();
        String strC = mhpVar.c();
        if (mjx.a(strC)) {
            RequestFileInfo requestFileInfo = new RequestFileInfo();
            requestFileInfo.setFileName(strF);
            requestFileInfo.setFileType(iN);
            requestFileInfo.setNeedVerify(zT);
            requestFileInfo.setTimes(iArrP);
            requestFileInfo.setDeviceMac(strC);
            c(requestFileInfo, iTransferSleepAndDFXFileCallback);
            return;
        }
        mrk mrkVar = new mrk();
        mrkVar.b(strF);
        mrkVar.f(iN);
        mrkVar.e(zT);
        mrkVar.c(iTransferSleepAndDFXFileCallback);
        mrkVar.c(Priority.DEFAULT);
        if (iArrP == null || iArrP.length != 2) {
            i = -1;
            i2 = -1;
        } else {
            i = iArrP[0];
            i2 = iArrP[1];
            mrkVar.i(i);
            mrkVar.c(i2);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f42257b.size() > 0) {
            if (c(mrkVar, jCurrentTimeMillis)) {
                j();
                return;
            } else {
                b(mrkVar, jCurrentTimeMillis);
                return;
            }
        }
        mrkVar.b(jCurrentTimeMillis);
        mrkVar.d(jCurrentTimeMillis);
        if (!e(mrkVar)) {
            this.f42257b.add(mrkVar);
        }
        d(strF, iN, i, i2);
    }

    public void a(mhp mhpVar, ITransferSleepAndDFXFileCallback iTransferSleepAndDFXFileCallback) {
        int i;
        int i2;
        LogUtil.a("CommonFileRequestManager", "startRequestFile0 entry");
        String strF = mhpVar.f();
        int iN = mhpVar.n();
        boolean zT = mhpVar.t();
        int[] iArrP = mhpVar.p();
        String strC = mhpVar.c();
        if (mjx.a() || mjx.a(strC)) {
            RequestFileInfo requestFileInfo = new RequestFileInfo();
            requestFileInfo.setFileName(strF);
            requestFileInfo.setFileType(iN);
            requestFileInfo.setNeedVerify(zT);
            requestFileInfo.setTimes(iArrP);
            requestFileInfo.setDeviceMac(strC);
            if (iN == 10) {
                requestFileInfo.setSourcePackageName(mhpVar.r());
                requestFileInfo.setSourceCertificate(mhpVar.l());
                requestFileInfo.setDestinationPackageName(mhpVar.b());
                requestFileInfo.setDestinationCertificate(mhpVar.d());
                requestFileInfo.setDescription(mhpVar.e());
            }
            requestFileInfo.setDictTypeId(mhpVar.h());
            c(requestFileInfo, iTransferSleepAndDFXFileCallback);
            return;
        }
        mrk mrkVar = new mrk();
        mrkVar.b(strF);
        mrkVar.f(iN);
        mrkVar.e(zT);
        mrkVar.c(iTransferSleepAndDFXFileCallback);
        mrkVar.c(Priority.DEFAULT);
        if (iArrP == null || iArrP.length != 2) {
            i = -1;
            i2 = -1;
        } else {
            i = iArrP[0];
            i2 = iArrP[1];
            mrkVar.i(i);
            mrkVar.c(i2);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f42257b.size() > 0) {
            if (c(mrkVar, jCurrentTimeMillis)) {
                j();
                return;
            } else {
                b(mrkVar, jCurrentTimeMillis);
                return;
            }
        }
        mrkVar.b(jCurrentTimeMillis);
        mrkVar.d(jCurrentTimeMillis);
        if (!e(mrkVar)) {
            this.f42257b.add(mrkVar);
        }
        d(strF, iN, i, i2);
    }

    public void c(mhp mhpVar, IBaseCommonCallback iBaseCommonCallback) {
        int i;
        int i2;
        LogUtil.a("CommonFileRequestManager", "startRequestFile1 entry");
        String strC = mhpVar.c();
        if (mjx.a() || mjx.a(strC)) {
            d(mhpVar, iBaseCommonCallback);
            return;
        }
        int[] iArrP = mhpVar.p();
        if (iArrP == null || iArrP.length != 2) {
            i = -1;
            i2 = -1;
        } else {
            i = iArrP[0];
            i2 = iArrP[1];
        }
        String strF = mhpVar.f();
        int iN = mhpVar.n();
        boolean zT = mhpVar.t();
        mrk mrkVar = new mrk();
        mrkVar.f(iN);
        if (!TextUtils.isEmpty(strF)) {
            mrkVar.b(strF);
        }
        mrkVar.e(zT);
        mrkVar.d(iBaseCommonCallback);
        mrkVar.i(i);
        mrkVar.c(i2);
        mrkVar.c(Priority.DEFAULT);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f42257b.size() > 0) {
            LogUtil.a("CommonFileRequestManager", "mCacheFiles size: ", Integer.valueOf(this.f42257b.size()), " fileInfo name: ", mrkVar.n(), " type: ", Integer.valueOf(mrkVar.q()));
            e(mrkVar, AdapterWithBottomView.TYPE_BOTTOM);
            if (c(mrkVar, jCurrentTimeMillis)) {
                j();
                return;
            } else {
                b(mrkVar, jCurrentTimeMillis);
                return;
            }
        }
        mrkVar.b(jCurrentTimeMillis);
        mrkVar.d(jCurrentTimeMillis);
        if (!e(mrkVar)) {
            this.f42257b.add(mrkVar);
        }
        d(strF, iN, i, i2);
    }

    private void c(RequestFileInfo requestFileInfo, ITransferSleepAndDFXFileCallback iTransferSleepAndDFXFileCallback) {
        requestFileInfo.setKit(false);
        if (TextUtils.isEmpty(requestFileInfo.getDeviceMac())) {
            requestFileInfo.setDeviceMac(h());
        }
        LogUtil.a("CommonFileRequestManager", " deviceMac is: ", cpl.a(requestFileInfo.getDeviceMac()));
        xgt.b().startReceiveFileFromWear(requestFileInfo, a(iTransferSleepAndDFXFileCallback));
    }

    private ITransferFileCallback.Stub a(final ITransferSleepAndDFXFileCallback iTransferSleepAndDFXFileCallback) {
        return new ITransferFileCallback.Stub() { // from class: mrj.1
            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onSuccess(int i, String str, String str2) throws RemoteException {
                ITransferSleepAndDFXFileCallback iTransferSleepAndDFXFileCallback2 = iTransferSleepAndDFXFileCallback;
                if (iTransferSleepAndDFXFileCallback2 != null) {
                    try {
                        iTransferSleepAndDFXFileCallback2.onSuccess(i, str, str2);
                    } catch (Exception e) {
                        LogUtil.e("CommonFileRequestManager", "ITransferFileCallback onSuccess mTransferDataContent:", str, ", mTransferStateContent:", str2, ", IllegalArgumentException:", ExceptionUtils.c(e));
                    }
                }
            }

            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onFailure(int i, String str) throws RemoteException {
                try {
                    ITransferSleepAndDFXFileCallback iTransferSleepAndDFXFileCallback2 = iTransferSleepAndDFXFileCallback;
                    if (iTransferSleepAndDFXFileCallback2 != null) {
                        iTransferSleepAndDFXFileCallback2.onFailure(i, str);
                    }
                } catch (IllegalArgumentException e) {
                    LogUtil.e("CommonFileRequestManager", "ITransferFileCallback onFailure errMsg:", str, ", IllegalArgumentException:", ExceptionUtils.c(e));
                }
            }

            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onProgress(int i, String str) throws RemoteException {
                ITransferSleepAndDFXFileCallback iTransferSleepAndDFXFileCallback2 = iTransferSleepAndDFXFileCallback;
                if (iTransferSleepAndDFXFileCallback2 != null) {
                    iTransferSleepAndDFXFileCallback2.onProgress(i, str);
                }
            }

            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onResponse(int i, String str) throws RemoteException {
                LogUtil.a("CommonFileRequestManager", "ITransferFileCallback onResponse");
            }
        };
    }

    private void d(mhp mhpVar, final IBaseCommonCallback iBaseCommonCallback) {
        RequestFileInfo requestFileInfo = new RequestFileInfo();
        requestFileInfo.setFileName(mhpVar.f());
        requestFileInfo.setFileType(mhpVar.n());
        requestFileInfo.setNeedVerify(mhpVar.t());
        requestFileInfo.setTimes(mhpVar.p());
        requestFileInfo.setKit(true);
        String strC = mhpVar.c();
        if (TextUtils.isEmpty(strC)) {
            requestFileInfo.setDeviceMac(h());
        } else {
            requestFileInfo.setDeviceMac(strC);
        }
        LogUtil.a("CommonFileRequestManager", " deviceMac is: ", cpl.a(requestFileInfo.getDeviceMac()));
        xgt.b().startReceiveFileFromWear(requestFileInfo, new ITransferFileCallback.Stub() { // from class: mrj.4
            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onSuccess(int i, String str, String str2) throws RemoteException {
                LogUtil.a("CommonFileRequestManager", "ITransferFileCallback onSuccess");
            }

            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onFailure(int i, String str) throws RemoteException {
                try {
                    IBaseCommonCallback iBaseCommonCallback2 = iBaseCommonCallback;
                    if (iBaseCommonCallback2 != null) {
                        iBaseCommonCallback2.onResponse(i, str);
                    }
                } catch (Exception e) {
                    LogUtil.a("CommonFileRequestManager", "ITransferFileCallback onFailure Exception ", ExceptionUtils.c(e));
                }
            }

            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onProgress(int i, String str) throws RemoteException {
                LogUtil.a("CommonFileRequestManager", "ITransferFileCallback onProgress");
            }

            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onResponse(int i, String str) throws RemoteException {
                IBaseCommonCallback iBaseCommonCallback2 = iBaseCommonCallback;
                if (iBaseCommonCallback2 != null) {
                    iBaseCommonCallback2.onResponse(i, str);
                }
            }
        });
    }

    private void j() {
        if (this.f42257b.size() == 1) {
            k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.l = false;
        if (this.f42257b.size() > 0) {
            mrk mrkVar = this.f42257b.get(0);
            LogUtil.a("CommonFileRequestManager", "request next task:", Integer.valueOf(mrkVar.q()));
            mrkVar.b(System.currentTimeMillis());
            if (mrkVar.af()) {
                LogUtil.a("CommonFileRequestManager", "request next task:", Integer.valueOf(mrkVar.j()));
                a(mrkVar.j(), mrkVar);
                return;
            } else if (mrkVar.q() == 1) {
                e(mrkVar.n(), mrkVar.q());
                return;
            } else if (mrkVar.q() >= 10 && mrkVar.q() <= 13) {
                d(mrkVar);
                return;
            } else {
                d(mrkVar.n(), mrkVar.q(), mrkVar.ab(), mrkVar.h());
                return;
            }
        }
        LogUtil.a("CommonFileRequestManager", "task is empty.");
    }

    public void d(mhp mhpVar, IBaseCallback iBaseCallback) {
        String strF = mhpVar.f();
        int iN = mhpVar.n();
        String strC = mhpVar.c();
        if (mjx.a() || mjx.a(strC)) {
            RequestFileInfo requestFileInfo = new RequestFileInfo();
            requestFileInfo.setFileName(strF);
            requestFileInfo.setFileType(iN);
            if (TextUtils.isEmpty(strC)) {
                requestFileInfo.setDeviceMac(h());
            } else {
                requestFileInfo.setDeviceMac(strC);
            }
            xgt.b().stopReceiveFileFromWear(requestFileInfo, a(iBaseCallback));
            return;
        }
        for (Map.Entry<Integer, mrk> entry : this.k.entrySet()) {
            if (TextUtils.equals(entry.getValue().n(), strF) && iN == entry.getValue().q()) {
                LogUtil.a("CommonFileRequestManager", "stopRequestFile fileId:", entry.getKey());
                entry.getValue().a(iBaseCallback);
                a(entry.getKey().intValue(), 4);
            }
        }
    }

    private String h() {
        String strE = mrs.e();
        return TextUtils.isEmpty(strE) ? mrs.a() : strE;
    }

    private ITransferFileCallback.Stub a(final IBaseCallback iBaseCallback) {
        return new ITransferFileCallback.Stub() { // from class: mrj.5
            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onSuccess(int i, String str, String str2) throws RemoteException {
                LogUtil.a("CommonFileRequestManager", "stopRequestFile onSuccess");
            }

            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onFailure(int i, String str) throws RemoteException {
                LogUtil.a("CommonFileRequestManager", "stopRequestFile onFailure");
            }

            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onProgress(int i, String str) throws RemoteException {
                LogUtil.a("CommonFileRequestManager", "stopRequestFile onProgress");
            }

            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onResponse(int i, String str) throws RemoteException {
                IBaseCallback iBaseCallback2 = iBaseCallback;
                if (iBaseCallback2 != null) {
                    iBaseCallback2.onResponse(i, str);
                }
            }
        };
    }

    private boolean e(mrk mrkVar) {
        Iterator<mrk> it = this.f42257b.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (mrkVar.equals(it.next())) {
                z = true;
            }
        }
        return z;
    }

    private void d(String str, int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder(16);
        if (!TextUtils.isEmpty(str)) {
            String strA = eeq.a(str);
            sb.append(eeq.d(1) + eeq.d(strA.length() / 2) + strA);
        } else {
            LogUtil.a("CommonFileRequestManager", "5.44.1 file name is empty.");
        }
        sb.append(eeq.d(2) + eeq.d(1) + eeq.d(i));
        if (i2 != -1 && i3 != -1) {
            sb.append(eeq.d(5));
            sb.append(eeq.d(4));
            sb.append(eeq.c(i2));
            sb.append(eeq.d(6));
            sb.append(eeq.d(4));
            sb.append(eeq.c(i3));
        } else {
            LogUtil.a("CommonFileRequestManager", "5.44.1 startTime or endTime is -1, startTime:", Integer.valueOf(i2), ", end time:", Integer.valueOf(i3));
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(44);
        deviceCommand.setCommandID(1);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        deviceCommand.setDataLen(eeq.c(sb.toString()).length);
        deviceCommand.setNeedAck(true);
        LogUtil.a("CommonFileRequestManager", "sendFileInfo, deviceCommand:", deviceCommand.toString());
        e(i);
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
        c(i);
    }

    private void e(int i) {
        this.m.put(Integer.valueOf(i), new mrl());
    }

    private void e(String str, int i) {
        String strA = eeq.a(str);
        String str2 = (eeq.d(1) + eeq.d(strA.length() / 2) + strA) + (eeq.d(2) + eeq.d(1) + eeq.d(i));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(44);
        deviceCommand.setCommandID(1);
        deviceCommand.setDataContent(eeq.c(str2));
        deviceCommand.setDataLen(eeq.c(str2).length);
        deviceCommand.setNeedAck(true);
        LogUtil.a("CommonFileRequestManager", "sendFileInfo, deviceCommand:", deviceCommand.toString());
        e(i);
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    private void c(int i) {
        if (this.f == null) {
            HandlerThread handlerThread = new HandlerThread("CommonFileRequestManager");
            this.g = handlerThread;
            handlerThread.start();
            this.f = new c(this.g.getLooper());
        }
        Message messageObtain = Message.obtain();
        messageObtain.arg1 = 500;
        messageObtain.what = i;
        this.f.sendMessageDelayed(messageObtain, 35000L);
    }

    private void g() {
        LogUtil.a("CommonFileRequestManager", "enter removeFileInfoTimeout");
        if (this.f42257b.size() > 0) {
            a(this.f42257b.get(0).q());
        }
    }

    private void e(byte[] bArr) {
        o();
        if (this.l) {
            LogUtil.a("CommonFileRequestManager", "receive 5.44.1 task insert, requestNextTask");
            k();
            return;
        }
        g();
        String strE = eeq.e(bArr);
        LogUtil.a("CommonFileRequestManager", "5.44.1 handleRequest:", strE);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            LogUtil.j("CommonFileRequestManager", "handleRequest dataBytes is error");
        } else {
            c(strE.substring(4));
        }
    }

    private void c(String str) {
        mrk mrkVar = new mrk();
        int i = 0;
        try {
            List<eew> listE = this.n.b(str).e();
            if (listE == null || listE.size() <= 0) {
                LogUtil.j("CommonFileRequestManager", "handleRequest tlv list error");
            } else {
                for (eew eewVar : listE) {
                    int iB = CommonUtil.b(eewVar.e(), 16);
                    String strB = eewVar.b();
                    int iD = mrs.d(iB, mrkVar, strB);
                    if (iD != 0) {
                        i = iD;
                    }
                    mrs.e(iB, mrkVar, strB);
                }
            }
        } catch (eeu unused) {
            LogUtil.e("CommonFileRequestManager", "handleRequest error");
        }
        d(mrkVar, i);
    }

    private void d(mrk mrkVar, int i) {
        for (mrk mrkVar2 : this.f42257b) {
            LogUtil.a("CommonFileRequestManager", "handleRequest has cache file name: ", mrkVar2.n(), " cache type: ", Integer.valueOf(mrkVar2.q()), " need verify: ", Boolean.valueOf(mrkVar2.aj()));
            if (this.e.e(mrkVar2.n(), mrkVar.n()) && (mrkVar2.q() == mrkVar.q() || mrkVar.q() == 0)) {
                mrkVar.c(mrkVar2.r());
                mrkVar.d(mrkVar2.x());
                mrkVar.e(mrkVar2.aj());
                mrkVar.b(mrkVar2.l());
                mrkVar.d(mrkVar2.c());
                LogUtil.a("CommonFileRequestManager", "commonFileInfo.name: ", mrkVar.n());
                break;
            }
            if (mrkVar.n() == null && mrkVar2.n() == null && i != 100000) {
                mrkVar.d(mrkVar2.x());
            }
        }
        if (i != 100000) {
            b(mrkVar, i);
            if (mrkVar.r() != null) {
                try {
                    mrkVar.r().onFailure(i, "");
                    LogUtil.a("CommonFileRequestManager", "onUpgradeFailed errorCode:", Integer.valueOf(i));
                    a(mrkVar);
                    return;
                } catch (RemoteException unused) {
                    LogUtil.e("CommonFileRequestManager", "commonFileInfo.getFileRequestCallback RemoteException");
                    return;
                }
            }
            LogUtil.a("CommonFileRequestManager", "file callback is null");
            try {
                if (mrkVar.g() != null) {
                    mrkVar.r().onFailure(i, "");
                    return;
                }
                return;
            } catch (RemoteException unused2) {
                LogUtil.e("CommonFileRequestManager", "commonFileInfo.getFileRequestCallback RemoteException");
                return;
            }
        }
        a(mrkVar.j(), mrkVar);
    }

    private void a(int i, mrk mrkVar) {
        LogUtil.a("CommonFileRequestManager", "device support transfer file, file type:", Integer.valueOf(mrkVar.q()), mrkVar.q() == 0 ? ", no task deal with this tlv." : "");
        if (mrkVar.q() == 0) {
            return;
        }
        mrkVar.a(i);
        this.k.put(Integer.valueOf(mrkVar.j()), mrkVar);
        LogUtil.a("CommonFileRequestManager", "reset info:file id:", Integer.valueOf(mrkVar.j()), ", fileType:", Integer.valueOf(mrkVar.q()), ", filename:", mrkVar.n(), ", NeedVerify:", Boolean.valueOf(mrkVar.aj()));
        if (mrkVar.aj()) {
            e(mrkVar.j(), 1);
        } else {
            g(mrkVar.j());
        }
    }

    private void e(int i, int i2) {
        if (this.l) {
            LogUtil.a("CommonFileRequestManager", "send 5.44.2 task insert, requestNextTask");
            k();
            return;
        }
        String str = (eeq.d(1) + eeq.d(1) + eeq.d(i)) + (eeq.d(2) + eeq.d(1) + eeq.d(i2));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(44);
        deviceCommand.setCommandID(2);
        deviceCommand.setDataContent(eeq.c(str));
        deviceCommand.setDataLen(eeq.c(str).length);
        deviceCommand.setNeedAck(true);
        LogUtil.a("CommonFileRequestManager", "sendFileCheck, deviceCommand:", deviceCommand.toString());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
        m();
    }

    private void d(byte[] bArr) {
        o();
        if (this.l) {
            LogUtil.a("CommonFileRequestManager", "receive 5.44.2 task insert, requestNextTask");
            k();
            return;
        }
        String strE = eeq.e(bArr);
        LogUtil.a("CommonFileRequestManager", "5.44.2 handleRequestHash:", strE);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            LogUtil.j("CommonFileRequestManager", "handleRequestHash dataBytes is error");
            return;
        }
        try {
            List<eew> listE = this.n.b(strE.substring(4)).e();
            if (listE != null && listE.size() > 0) {
                String str = "";
                int iB = 0;
                for (eew eewVar : listE) {
                    int iB2 = CommonUtil.b(eewVar.e(), 16);
                    String strB = eewVar.b();
                    if (iB2 == 1) {
                        iB = CommonUtil.b(strB, 16);
                        LogUtil.a("CommonFileRequestManager", "handleRequestHash file id:", Integer.valueOf(iB));
                    } else if (iB2 != 3) {
                        LogUtil.d("CommonFileRequestManager", "handleRequestHash default");
                    } else {
                        str = strB;
                    }
                }
                a(iB, str);
                return;
            }
            LogUtil.j("CommonFileRequestManager", "handleRequestHash tlv list error");
        } catch (eeu unused) {
            LogUtil.e("CommonFileRequestManager", "handleRequestHash error");
        }
    }

    private void a(int i, String str) {
        if (this.k.get(Integer.valueOf(i)) != null) {
            this.k.get(Integer.valueOf(i)).f(str);
            g(i);
        } else {
            LogUtil.a("CommonFileRequestManager", "saveFileHash error");
        }
    }

    private void g(int i) {
        if (this.l) {
            LogUtil.a("CommonFileRequestManager", "send 5.44.3 task insert, requestNextTask");
            k();
            return;
        }
        String str = (eeq.d(1) + eeq.d(1) + eeq.d(i)) + (eeq.d(2) + eeq.d(0)) + (eeq.d(3) + eeq.d(0)) + (eeq.d(4) + eeq.d(0)) + (eeq.d(5) + eeq.d(0));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(44);
        deviceCommand.setCommandID(3);
        deviceCommand.setDataContent(eeq.c(str));
        deviceCommand.setDataLen(eeq.c(str).length);
        deviceCommand.setNeedAck(true);
        LogUtil.a("CommonFileRequestManager", "sendRequestParameter, deviceCommand:", deviceCommand.toString());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
        m();
    }

    private void c(byte[] bArr) {
        int iB;
        o();
        if (this.l) {
            LogUtil.a("CommonFileRequestManager", "receive 5.44.3 task insert, requestNextTask");
            k();
            return;
        }
        String strE = eeq.e(bArr);
        LogUtil.a("CommonFileRequestManager", "5.44.3 handleConsult:", strE);
        String strSubstring = strE.substring(4);
        mrn mrnVar = new mrn();
        try {
            List<eew> listE = this.n.b(strSubstring).e();
            if (listE != null && listE.size() > 0) {
                for (eew eewVar : listE) {
                    b(mrnVar, CommonUtil.b(eewVar.e(), 16), eewVar.b());
                }
                if (mrnVar.e() == 0) {
                    LogUtil.j("CommonFileRequestManager", "xxx / 0 will error, check this info.");
                    return;
                }
                LogUtil.a("CommonFileRequestManager", "5.44.3 handleConsult fileId:", Integer.valueOf(mrnVar.c()));
                if (mrnVar.b() % mrnVar.e() == 0) {
                    iB = (mrnVar.b() / mrnVar.e()) - 1;
                } else {
                    iB = mrnVar.b() / mrnVar.e();
                }
                mrnVar.e(iB);
                LogUtil.a("CommonFileRequestManager", "5.44.3 handleConsult psnMax:", Integer.valueOf(iB));
                this.i.put(Integer.valueOf(mrnVar.c()), mrnVar);
                if (this.k.get(Integer.valueOf(mrnVar.c())) != null) {
                    f(mrnVar.c());
                    d(mrnVar, this.k.get(Integer.valueOf(mrnVar.c())));
                    return;
                }
                return;
            }
            LogUtil.j("CommonFileRequestManager", "handleConsult tlv list error");
        } catch (eeu unused) {
            LogUtil.e("CommonFileRequestManager", "handleConsult error");
        }
    }

    private void b(mrn mrnVar, int i, String str) {
        if (i == 1) {
            mrnVar.c(CommonUtil.b(str, 16));
            LogUtil.a("CommonFileRequestManager", "handleParamTlv file id:", Integer.valueOf(mrnVar.c()));
            return;
        }
        if (i == 2) {
            mrnVar.a(CommonUtil.b(str, 16));
            LogUtil.a("CommonFileRequestManager", "handleParamTlv device wait timeout:", Integer.valueOf(mrnVar.d()));
            return;
        }
        if (i == 3) {
            mrnVar.g(CommonUtil.b(str, 16));
            LogUtil.a("CommonFileRequestManager", "handleConsult unit size:", Integer.valueOf(mrnVar.e()));
        } else if (i == 4) {
            mrnVar.d(CommonUtil.b(str, 16));
            LogUtil.a("CommonFileRequestManager", "handleConsult max apply:", Integer.valueOf(mrnVar.b()));
        } else if (i != 5) {
            LogUtil.d("CommonFileRequestManager", "handleParamTlv default");
        } else {
            mrnVar.d(CommonUtil.v(str) == 1);
            LogUtil.a("CommonFileRequestManager", "handleConsult not need encrypt:", Boolean.valueOf(mrnVar.h()));
        }
    }

    private void f(int i) {
        LogUtil.a("CommonFileRequestManager", "startRequest fileId:", Integer.valueOf(i));
        mrk mrkVar = this.k.get(Integer.valueOf(i));
        if (mrkVar == null) {
            LogUtil.e("CommonFileRequestManager", "startRequest, commonFileInfo is null");
            return;
        }
        try {
            mrkVar.c(ByteBuffer.allocate(mrkVar.p() - mrkVar.l()));
            LogUtil.a("CommonFileRequestManager", "startRequest offset:", Integer.valueOf(mrkVar.l()));
            d(i, mrkVar.l(), false);
        } catch (OutOfMemoryError unused) {
            LogUtil.e("CommonFileRequestManager", "startRequest occur OutOfMemoryError. file size = ", Integer.valueOf(mrkVar.p()), "file name = ", mrkVar.n(), "file id = ", Integer.valueOf(mrkVar.j()));
        }
    }

    private void e(int i, int i2, boolean z) {
        mrl mrlVar = this.m.get(Integer.valueOf(i));
        if (mrlVar == null) {
            LogUtil.j("CommonFileRequestManager", "setRetryInfo info is null.");
            return;
        }
        mrlVar.c(i2);
        if (z) {
            mrlVar.b(-1);
        }
        this.m.put(Integer.valueOf(i), mrlVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, int i2, boolean z) {
        LogUtil.a("CommonFileRequestManager", "doRequest fileId:", Integer.valueOf(i), "offset:", Integer.valueOf(i2));
        mrk mrkVar = this.k.get(Integer.valueOf(i));
        if (mrkVar == null) {
            LogUtil.j("CommonFileRequestManager", "doRequest fileId not in list!");
            return;
        }
        mrn mrnVar = this.i.get(Integer.valueOf(i));
        if (mrnVar == null) {
            LogUtil.j("CommonFileRequestManager", "fileTransferParameter is null");
            return;
        }
        mrkVar.b(i2);
        mrkVar.g(0);
        e(i, i2, !z);
        if (mrnVar.b() <= mrkVar.p() - mrkVar.l()) {
            LogUtil.a("CommonFileRequestManager", "doRequest request max:", Integer.valueOf(mrnVar.b()));
            mrkVar.e(mrnVar.b());
            mrkVar.j(mrnVar.a());
            mrkVar.a(ByteBuffer.allocate(mrnVar.b()));
            b(i, mrkVar.l(), mrnVar.b());
        } else {
            int iP = mrkVar.p() - mrkVar.l();
            LogUtil.a("CommonFileRequestManager", "doRequest request not max:", Integer.valueOf(iP));
            if (mrnVar.e() == 0) {
                LogUtil.j("CommonFileRequestManager", "xxx / 0 will error, check this info.");
                return;
            }
            if (iP % mrnVar.e() == 0) {
                mrkVar.j((iP / mrnVar.e()) - 1);
            } else {
                mrkVar.j(iP / mrnVar.e());
            }
            mrkVar.e(iP);
            mrkVar.a(ByteBuffer.allocate(iP));
            b(i, mrkVar.l(), mrkVar.k());
        }
        if (!z) {
            LogUtil.a("CommonFileRequestManager", "doRequest first!");
            h(i, mrnVar.d());
        }
        c(i, i2, mrnVar.d() / 3);
    }

    private void b(int i, int i2, int i3) {
        if (this.l) {
            LogUtil.a("CommonFileRequestManager", "send 5.44.4 task insert, requestNextTask");
            k();
            return;
        }
        String str = (eeq.d(1) + eeq.d(1) + eeq.d(i)) + (eeq.d(2) + eeq.d(4) + eeq.c(i2)) + (eeq.d(3) + eeq.d(4) + eeq.c(i3));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(44);
        deviceCommand.setCommandID(4);
        deviceCommand.setDataContent(eeq.c(str));
        deviceCommand.setDataLen(eeq.c(str).length);
        if (this.i.get(Integer.valueOf(i)) != null && this.i.get(Integer.valueOf(i)).h()) {
            deviceCommand.setNeedEncrypt(false);
        }
        LogUtil.a("CommonFileRequestManager", "sendRequestCommand, deviceCommand:", deviceCommand.toString());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
        m();
    }

    private void a(byte[] bArr) {
        if (!i(bArr)) {
            LogUtil.j("CommonFileRequestManager", "data is too big, please watch or band check 5.44.5, might lost data.");
            return;
        }
        o();
        String strE = eeq.e(bArr);
        if (TextUtils.isEmpty(strE) || strE.length() < 16) {
            boolean z = this.l;
            LogUtil.j("CommonFileRequestManager", "handleDeviceDataReceived dataBytes is error, mIsCurrentTaskStop:", Boolean.valueOf(z), z ? "empty tlv 5.44.5 task insert, requestNextTask" : "");
            if (this.l) {
                k();
                return;
            }
            return;
        }
        String strSubstring = strE.substring(4);
        int iB = CommonUtil.b(strSubstring.substring(0, 2), 16);
        int iB2 = CommonUtil.b(strSubstring.substring(2, 10), 16);
        int iB3 = CommonUtil.b(strSubstring.substring(10, 12), 16);
        LogUtil.a("CommonFileRequestManager", "5.44.5 handleDeviceDataReceived fileID:", Integer.valueOf(iB), ", offset:", Integer.valueOf(iB2), ", psn:", Integer.valueOf(iB3));
        mrk mrkVar = this.k.get(Integer.valueOf(iB));
        if (mrkVar != null) {
            if (mrkVar.l() != iB2 || mrkVar.o() != iB3) {
                boolean z2 = this.l;
                LogUtil.a("CommonFileRequestManager", "handleDeviceDataReceived fileOffset or psn error, mIsCurrentTaskStop:", Boolean.valueOf(z2), z2 ? ", receive 5.44.5 task insert, requestNextTask" : "");
                if (this.l) {
                    k();
                    return;
                }
                return;
            }
            a(strSubstring, iB, iB3, mrkVar);
            if (mrkVar.p() == 0) {
                LogUtil.j("CommonFileRequestManager", "getFileSize is zero");
                return;
            }
            int iP = (iB2 * 100) / mrkVar.p();
            LogUtil.a("CommonFileRequestManager", "reportProgressForUi progress:", Integer.valueOf(iP));
            d(iB, iP);
            return;
        }
        boolean z3 = this.l;
        LogUtil.j("CommonFileRequestManager", "handleDeviceDataReceived fileID error, mIsCurrentTaskStop:", Boolean.valueOf(z3), z3 ? ", receive 5.44.5 task insert, requestNextTask" : "");
        if (this.l) {
            k();
        }
    }

    private boolean i(byte[] bArr) {
        if (bArr.length < 8) {
            LogUtil.a("CommonFileRequestManager", "length < 8");
            return false;
        }
        mrn mrnVar = this.i.get(Integer.valueOf(bArr[2]));
        if (mrnVar != null) {
            return bArr.length - 8 <= mrnVar.e();
        }
        LogUtil.j("CommonFileRequestManager", "fileTransferParameter is null");
        return true;
    }

    private void a(String str, int i, int i2, mrk mrkVar) {
        byte[] bArrC = eeq.c(str.substring(12));
        if (mrkVar.b() != null) {
            if (mrkVar.b().capacity() >= mrkVar.b().position() + bArrC.length) {
                mrkVar.b().put(bArrC);
                a(i);
                a(mrkVar, bArrC, i, i2);
                if (i2 < mrkVar.s()) {
                    LogUtil.a("CommonFileRequestManager", "handleDeviceDataReceived keep wait");
                    if (this.i.get(Integer.valueOf(i)) != null) {
                        h(i, this.i.get(Integer.valueOf(i)).d());
                        mrl mrlVar = this.m.get(Integer.valueOf(i));
                        if (mrlVar != null) {
                            c(i, mrlVar.e(), this.i.get(Integer.valueOf(i)).d() / 3);
                        }
                    }
                    mrkVar.g(i2 + 1);
                    mrkVar.b(mrkVar.l() + bArrC.length);
                    return;
                }
                LogUtil.a("CommonFileRequestManager", "handleDeviceDataReceived one unit all received");
                mrkVar.b().clear();
                mrkVar.d().put(mrkVar.b());
                if (mrkVar.d().hasRemaining()) {
                    int iL = mrkVar.l() + bArrC.length;
                    boolean z = this.l;
                    LogUtil.a("CommonFileRequestManager", "mIsCurrentTaskStop:", Boolean.valueOf(z), z ? "handleRequest next, task insert, requestNextTask" : "start request next");
                    if (this.l) {
                        a(mrkVar, iL);
                        k();
                        return;
                    } else {
                        d(i, iL, false);
                        return;
                    }
                }
                d(i);
                return;
            }
            LogUtil.j("CommonFileRequestManager", "device return info is error. too big");
            return;
        }
        LogUtil.j("CommonFileRequestManager", "getByteUnit is null");
    }

    private void a(mrk mrkVar, int i) {
        for (mrk mrkVar2 : this.f42257b) {
            if (mrkVar2.equals(mrkVar)) {
                LogUtil.a("CommonFileRequestManager", "saveThisTask save cut point");
                int iC = mrkVar.c() + 1;
                mrkVar.d(iC);
                mrkVar2.d(iC);
                mrkVar2.b(i);
                break;
            }
        }
        try {
            this.e.c(mrkVar, false);
        } catch (IOException unused) {
            LogUtil.e("CommonFileRequestManager", "saveBreakPointTask IOException");
        }
    }

    private void d(int i) {
        mrk mrkVar = this.k.get(Integer.valueOf(i));
        if (mrkVar == null) {
            boolean z = this.l;
            LogUtil.j("CommonFileRequestManager", "handleRequestOver commonFileInfo is null, mIsCurrentTaskStop:", Boolean.valueOf(z), z ? "handleRequest next, task insert, requestNextTask" : "");
            if (this.l) {
                k();
                return;
            }
            return;
        }
        try {
            int i2 = 0;
            int i3 = 1;
            if (mrkVar.aj()) {
                String strE = eeq.e(Sha256.c(mrkVar.d().array()));
                LogUtil.a("CommonFileRequestManager", "app hashValue: ", strE, ", device hashValue: ", mrkVar.t());
                if (TextUtils.equals(strE.toUpperCase(Locale.ENGLISH), mrkVar.t().toUpperCase(Locale.ENGLISH))) {
                    if (!this.e.c(mrkVar, true)) {
                        i2 = 2;
                    }
                    b(mrkVar);
                    a(i, 1);
                } else {
                    j(mrkVar);
                    a(i, 2);
                }
                f();
                e(mrkVar, 30005);
                mrkVar.m(i3);
            }
            if (!this.e.c(mrkVar, true)) {
                i2 = 2;
            }
            b(mrkVar);
            a(i, 1);
            i3 = i2;
            f();
            e(mrkVar, 30005);
            mrkVar.m(i3);
        } catch (IOException unused) {
            LogUtil.e("CommonFileRequestManager", "handleRequestOver IOException");
        }
    }

    private void c(int i, mrk mrkVar) throws IOException, RemoteException {
        LogUtil.a("CommonFileRequestManager", "sendSuccessToCallback transferResult is ", Integer.valueOf(i));
        if (i == 0) {
            if (mrkVar.r() != null) {
                String strD = this.e.d(mrkVar.n(), mrkVar.j());
                if (strD != null) {
                    mrkVar.r().onSuccess(30000, strD, "");
                    return;
                } else {
                    LogUtil.j("CommonFileRequestManager", "sendSuccessToCallback path is null");
                    mrkVar.r().onFailure(30007, "createFileWithByte path is null");
                    return;
                }
            }
            return;
        }
        if ((i & 1) == 1) {
            if (mrkVar.r() != null) {
                mrkVar.r().onFailure(30001, "");
                return;
            } else {
                LogUtil.j("CommonFileRequestManager", "check failed fileRequestCallback is null");
                return;
            }
        }
        if ((i & 2) == 2) {
            if (mrkVar.r() != null) {
                mrkVar.r().onFailure(30007, "");
                return;
            } else {
                LogUtil.j("CommonFileRequestManager", "save failed fileRequestCallback is null");
                return;
            }
        }
        LogUtil.j("CommonFileRequestManager", "transferResult is other status.");
    }

    private void d(int i, int i2) {
        mrk mrkVar = this.k.get(Integer.valueOf(i));
        if (mrkVar == null) {
            LogUtil.j("CommonFileRequestManager", "reportProgressForUi commonFileInfo is null");
        } else if (mrkVar.r() != null) {
            try {
                mrkVar.r().onProgress(i2, "");
            } catch (RemoteException unused) {
                LogUtil.e("CommonFileRequestManager", "reportProgressForUi RemoteException");
            }
        }
    }

    private void a(int i, int i2) {
        String str = (eeq.d(1) + eeq.d(1) + eeq.d(i)) + (eeq.d(2) + eeq.d(1) + eeq.d(i2));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(44);
        deviceCommand.setCommandID(6);
        deviceCommand.setDataContent(eeq.c(str));
        deviceCommand.setDataLen(eeq.c(str).length);
        LogUtil.a("CommonFileRequestManager", "sendRequestCommand, deviceCommand:", deviceCommand.toString());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
        m();
    }

    private void b(byte[] bArr) {
        o();
        String strE = eeq.e(bArr);
        cpl.d("CommonFileRequestManager", bArr, "5.44.6 handleDeviceStatusReport: ");
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            LogUtil.j("CommonFileRequestManager", "handleDeviceStatusReport dataBytes is error");
            return;
        }
        try {
            List<eew> listE = this.n.b(strE.substring(4)).e();
            if (listE != null && listE.size() > 0) {
                int iB = 0;
                int iB2 = 0;
                for (eew eewVar : listE) {
                    int iB3 = CommonUtil.b(eewVar.e(), 16);
                    String strB = eewVar.b();
                    if (iB3 == 1) {
                        iB = CommonUtil.b(strB, 16);
                        LogUtil.a("CommonFileRequestManager", "handleDeviceStatusReport file_id:", Integer.valueOf(iB));
                    } else if (iB3 == 127) {
                        iB2 = CommonUtil.b(strB, 16);
                        LogUtil.a("CommonFileRequestManager", "handleDeviceStatusReport status:", Integer.valueOf(iB2));
                    } else {
                        LogUtil.d("CommonFileRequestManager", "handleDeviceStatusReport default");
                    }
                }
                b(iB, iB2);
                return;
            }
            LogUtil.j("CommonFileRequestManager", "handleDeviceStatusReport tlv list error");
        } catch (eeu unused) {
            LogUtil.e("CommonFileRequestManager", "handleDeviceStatusReport error");
        }
    }

    private void b(int i, int i2) {
        mrk mrkVar = this.k.get(Integer.valueOf(i));
        if (mrkVar == null) {
            LogUtil.j("CommonFileRequestManager", "reportCancelResult commonFileInfo is null");
            return;
        }
        try {
            LogUtil.a("CommonFileRequestManager", i2 == 100000 ? "handleCancelReply success" : "handleCancelReply failed");
            if (i2 == 100000) {
                if (mrkVar.a() != null) {
                    mrkVar.a().onResponse(30005, "");
                    e(mrkVar, 30005);
                }
                a(i);
            } else if (mrkVar.a() != null) {
                mrkVar.a().onResponse(30006, "");
                e(mrkVar, 30006);
            }
        } catch (RemoteException unused) {
            LogUtil.e("CommonFileRequestManager", "handleCancelReply RemoteException");
        }
        a(mrkVar);
        try {
            c(mrkVar.ae(), mrkVar);
        } catch (RemoteException | IOException unused2) {
            LogUtil.e("CommonFileRequestManager", "reportCancelResult RemoteException | IOException");
        }
    }

    private void b(mrk mrkVar) {
        if (!mrkVar.af() || this.j == null) {
            return;
        }
        try {
            mrkVar.c(CommonUtil.c(this.h.getFilesDir().getCanonicalPath() + File.separator + "commonFileRequest" + File.separator + mrkVar.n()));
        } catch (IOException unused) {
            LogUtil.e("CommonFileRequestManager", "noticeHiWearFileObtain IOException");
        }
        LogUtil.a("CommonFileRequestManager", "noticeHiWearFileObtain isDeviceReport");
        int iQ = mrkVar.q();
        if (iQ != 1 && iQ != 10) {
            LogUtil.a("CommonFileRequestManager", "noticeHiWearFileObtain not hiwear type");
        } else {
            this.j.a(0, mrkVar);
        }
    }

    private void d(DeviceInfo deviceInfo, byte[] bArr) {
        String strE = eeq.e(bArr);
        cpl.d("CommonFileRequestManager", bArr, "5.44.7 handleDeviceSendNotice: ");
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            LogUtil.j("CommonFileRequestManager", "handleDeviceSendNotice dataBytes error");
            return;
        }
        mrk mrkVarD = d(strE.substring(4));
        if (TextUtils.isEmpty(mrkVarD.n()) || mrkVarD.n().contains("..")) {
            LogUtil.e("CommonFileRequestManager", "tlv may hacker report to app, file name has .. may inject patch.");
            return;
        }
        f(mrkVarD);
        if ((mrkVarD.q() == 1 || mrkVarD.q() == 10) && (this.j == null || !yhu.b().c(mrkVarD))) {
            if (mrkVarD.f().contains("hw.unitedevice.") && (mjx.a() || mjx.a(deviceInfo.getDeviceIdentify()))) {
                LogUtil.a("CommonFileRequestManager", "device is using uds connect.");
                return;
            } else {
                LogUtil.a("CommonFileRequestManager", "mFileObtainCallback ,cancel:", mrkVarD.n());
                c(mrkVarD, 1);
                return;
            }
        }
        if (mjx.a() || mjx.a(deviceInfo.getDeviceIdentify())) {
            a(deviceInfo, mrkVarD);
            return;
        }
        if (this.f42257b.size() > 0) {
            if (!mrkVarD.ai()) {
                c(mrkVarD, 2);
            }
            if (c(mrkVarD, System.currentTimeMillis())) {
                j();
                return;
            }
            return;
        }
        this.f42257b.add(mrkVarD);
        c(mrkVarD, 0);
        a(mrkVarD.j(), mrkVarD);
    }

    private mrk d(String str) {
        mrk mrkVar = new mrk();
        try {
            e(mrkVar, this.n.b(str).e());
        } catch (eeu unused) {
            LogUtil.e("CommonFileRequestManager", "handleDeviceSendNotice error");
        }
        mrkVar.e(true);
        mrkVar.d(true);
        mrkVar.c(Priority.DEFAULT);
        return mrkVar;
    }

    private void a(DeviceInfo deviceInfo, mrk mrkVar) {
        xgt.b().startReceiveFileFromWear(mrs.a(deviceInfo, mrkVar), new ITransferFileCallback.Stub() { // from class: mrj.8
            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onSuccess(int i, String str, String str2) throws RemoteException {
                LogUtil.a("CommonFileRequestManager", "ITransferFileCallback onSuccess");
            }

            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onFailure(int i, String str) throws RemoteException {
                LogUtil.a("CommonFileRequestManager", "ITransferFileCallback onFailure");
            }

            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onProgress(int i, String str) throws RemoteException {
                LogUtil.a("CommonFileRequestManager", "ITransferFileCallback onProgress");
            }

            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onResponse(int i, String str) throws RemoteException {
                if (mrj.this.j != null) {
                    CommonFileInfoParcel commonFileInfoParcel = (CommonFileInfoParcel) new Gson().fromJson(JsonSanitizer.sanitize(str), CommonFileInfoParcel.class);
                    mrk mrkVar2 = new mrk();
                    mrkVar2.b(commonFileInfoParcel.getFileName());
                    mrkVar2.f(commonFileInfoParcel.getFileType());
                    mrkVar2.c(commonFileInfoParcel.getFilePath());
                    mrkVar2.g(commonFileInfoParcel.getSourcePackageName());
                    mrkVar2.i(commonFileInfoParcel.getSourceCertificate());
                    mrkVar2.d(commonFileInfoParcel.getDestinationPackageName());
                    mrkVar2.a(commonFileInfoParcel.getDestinationCertificate());
                    mrkVar2.e(commonFileInfoParcel.getDescription());
                    mrkVar2.j(commonFileInfoParcel.getSha256Result());
                    mrj.this.j.a(i, mrkVar2);
                }
            }
        });
    }

    private void f(mrk mrkVar) {
        mrkVar.c(new ITransferSleepAndDFXFileCallback.Stub() { // from class: mrj.7
            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onSuccess(int i, String str, String str2) {
                LogUtil.a("CommonFileRequestManager", "handleDeviceSendNotice receive success");
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onFailure(int i, String str) {
                LogUtil.a("CommonFileRequestManager", "handleDeviceSendNotice receive fail");
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onProgress(int i, String str) {
                LogUtil.d("CommonFileRequestManager", "handleDeviceSendNotice receive onProgress");
            }
        });
    }

    private void e(mrk mrkVar, List<eew> list) {
        for (eew eewVar : list) {
            int iB = CommonUtil.b(eewVar.e(), 16);
            String strB = eewVar.b();
            switch (iB) {
                case 1:
                    mrkVar.b(eeq.d(strB));
                    break;
                case 2:
                    mrkVar.f(CommonUtil.v(strB));
                    break;
                case 3:
                    mrkVar.a(CommonUtil.v(strB));
                    break;
                case 4:
                    mrkVar.h(CommonUtil.v(strB));
                    break;
                case 5:
                case 6:
                default:
                    LogUtil.a("CommonFileRequestManager", "entry parseDeviceReportTlv2");
                    a(mrkVar, iB, strB);
                    break;
                case 7:
                    mrkVar.e(eeq.d(strB));
                    break;
                case 8:
                    mrkVar.g(eeq.d(strB));
                    break;
                case 9:
                    mrkVar.d(eeq.d(strB));
                    break;
                case 10:
                    mrkVar.i(eeq.d(strB));
                    break;
                case 11:
                    mrkVar.a(eeq.d(strB));
                    break;
            }
        }
    }

    private void a(mrk mrkVar, int i, String str) {
        if (i == 12) {
            if (CommonUtil.v(str) == 1) {
                mrkVar.a(true);
                return;
            }
            return;
        }
        LogUtil.a("CommonFileRequestManager", "5.44.7 handleDeviceSendNotice default");
    }

    private void c(mrk mrkVar, int i) {
        LogUtil.a("CommonFileRequestManager", "confirmDeviceFileReport,errorCode:", Integer.valueOf(i));
        StringBuilder sb = new StringBuilder(16);
        String strA = eeq.a(mrkVar.n());
        sb.append(eeq.d(1) + eeq.d(strA.length() / 2) + strA);
        sb.append(eeq.d(2) + eeq.d(1) + eeq.d(mrkVar.q()));
        sb.append(eeq.d(3) + eeq.d(1) + eeq.d(mrkVar.j()));
        sb.append(eeq.d(4) + eeq.d(4) + eeq.c((long) mrkVar.p()));
        String strA2 = eeq.a(mrkVar.ac());
        sb.append(eeq.d(8) + eeq.d(strA2.length() / 2) + strA2);
        String strA3 = eeq.a(mrkVar.f());
        sb.append(eeq.d(9) + eeq.d(strA3.length() / 2) + strA3);
        String strA4 = eeq.a(mrkVar.v());
        sb.append(eeq.d(10) + eeq.d(strA4.length() / 2) + strA4);
        String strA5 = eeq.a(mrkVar.i());
        sb.append(eeq.d(11) + eeq.d(strA5.length() / 2) + strA5);
        sb.append(eeq.d(13) + eeq.d(1) + eeq.d(i));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceId(44);
        deviceCommand.setCommandId(7);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        deviceCommand.setDataLen(eeq.c(sb.toString()).length);
        LogUtil.a("CommonFileRequestManager", "confirmDeviceFileReport, deviceCommand:", deviceCommand.toString());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        c cVar = this.f;
        if (cVar == null || !cVar.hasMessages(i)) {
            return;
        }
        this.f.removeMessages(i);
    }

    private void h(int i, int i2) {
        if (this.f != null) {
            if (i2 != 0) {
                Message messageObtain = Message.obtain();
                messageObtain.what = i;
                messageObtain.arg1 = 100;
                this.f.sendMessageDelayed(messageObtain, ((long) i2) * 1000);
                return;
            }
            return;
        }
        HandlerThread handlerThread = new HandlerThread("CommonFileRequestManager");
        this.g = handlerThread;
        handlerThread.start();
        this.f = new c(this.g.getLooper());
        if (i2 != 0) {
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = i;
            messageObtain2.arg1 = 100;
            this.f.sendMessageDelayed(messageObtain2, ((long) i2) * 1000);
        }
    }

    private void c(int i, int i2, int i3) {
        if (this.f != null) {
            if (i3 != 0) {
                Message messageObtain = Message.obtain();
                messageObtain.what = i;
                messageObtain.arg1 = 200;
                messageObtain.arg2 = i2;
                this.f.sendMessageDelayed(messageObtain, ((long) i3) * 1000);
                return;
            }
            return;
        }
        HandlerThread handlerThread = new HandlerThread("CommonFileRequestManager");
        this.g = handlerThread;
        handlerThread.start();
        this.f = new c(this.g.getLooper());
        if (i3 != 0) {
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = i;
            messageObtain2.arg1 = 200;
            messageObtain2.arg2 = i2;
            this.f.sendMessageDelayed(messageObtain2, ((long) i3) * 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(mrk mrkVar) {
        if (mrkVar == null) {
            LogUtil.j("CommonFileRequestManager", "handleRequestEnd error, file info is null");
            return;
        }
        for (int i = 0; i < this.f42257b.size(); i++) {
            mrk mrkVar2 = this.f42257b.get(i);
            LogUtil.a("CommonFileRequestManager", "handleRequestEnd has cache file name:", mrkVar2.n(), ", type:", Integer.valueOf(mrkVar2.q()));
            if ((TextUtils.equals(mrkVar2.n(), mrkVar.n()) || TextUtils.isEmpty(mrkVar2.n())) && mrkVar2.q() == mrkVar.q()) {
                LogUtil.a("CommonFileRequestManager", "delete commonFileInfo.name:", mrkVar2.n());
                this.f42257b.remove(mrkVar2);
                k();
                break;
            }
        }
        if (this.k.get(Integer.valueOf(mrkVar.j())) != null) {
            LogUtil.a("CommonFileRequestManager", "handleRequestEnd has mTransferringFileList file id:", Integer.valueOf(mrkVar.j()));
            this.k.remove(Integer.valueOf(mrkVar.j()));
        }
        if (this.i.get(Integer.valueOf(mrkVar.j())) != null) {
            LogUtil.a("CommonFileRequestManager", "handleRequestEnd has mFileTypeTransferInfos file id:", Integer.valueOf(mrkVar.j()));
            this.i.remove(Integer.valueOf(mrkVar.j()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, int i2) {
        mrk mrkVar = this.k.get(Integer.valueOf(i));
        if (mrkVar == null) {
            LogUtil.j("CommonFileRequestManager", "reportFailedForUi commonFileInfo is null");
            return;
        }
        try {
            if (mrkVar.r() != null) {
                mrkVar.r().onFailure(i2, "");
                LogUtil.a("CommonFileRequestManager", "reportFailedForUi fileId:", Integer.valueOf(i), "errorCode:", Integer.valueOf(i2));
            }
        } catch (RemoteException unused) {
            LogUtil.e("CommonFileRequestManager", "reportFailedForUi RemoteException");
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    class c extends Handler {
        c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.arg1;
            if (i == 100) {
                LogUtil.d("CommonFileRequestManager", "handleMessage wait timeout!");
                int i2 = message.what;
                LogUtil.a("CommonFileRequestManager", "wait timeout! file id:", Integer.valueOf(i2));
                mrj mrjVar = mrj.this;
                mrjVar.h((mrk) mrjVar.k.get(Integer.valueOf(i2)));
                mrj.this.c(i2, OnRegisterSkinAttrsListener.REGISTER_BY_SCAN);
                mrj mrjVar2 = mrj.this;
                mrjVar2.a((mrk) mrjVar2.k.get(Integer.valueOf(i2)));
                mrj.this.a(i2);
                return;
            }
            if (i == 200) {
                LogUtil.d("CommonFileRequestManager", "handleMessage retry");
                int i3 = message.what;
                int i4 = message.arg2;
                LogUtil.a("CommonFileRequestManager", "retry! file id:", Integer.valueOf(i3), ", offset:", Integer.valueOf(i4));
                mrj.this.d(i3, i4, true);
                return;
            }
            if (i == 500) {
                LogUtil.a("CommonFileRequestManager", "kit NO_MANAGER_CALLBACK");
                mrj.this.b(message.what);
            } else {
                if (i == 544) {
                    LogUtil.a("CommonFileRequestManager", "start send next, mIsCurrentTaskStop:", Boolean.valueOf(mrj.this.l), mrj.this.l ? "WAIT_MESSAGE, requestNextTask" : "");
                    if (mrj.this.l) {
                        mrj.this.k();
                        return;
                    }
                    return;
                }
                LogUtil.d("CommonFileRequestManager", "handleMessage default");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        mrk next;
        Iterator<mrk> it = this.f42257b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.q() != i);
        if (next == null) {
            LogUtil.j("CommonFileRequestManager", "toKitTimeoutError is null");
            return;
        }
        ITransferSleepAndDFXFileCallback iTransferSleepAndDFXFileCallbackR = next.r();
        if (iTransferSleepAndDFXFileCallbackR != null) {
            LogUtil.a("CommonFileRequestManager", "onResponse callback.");
            try {
                iTransferSleepAndDFXFileCallbackR.onFailure(100001, "5.44.1 time out");
            } catch (RemoteException | NullPointerException unused) {
                LogUtil.e("CommonFileRequestManager", "reportFileInfoTimeout onFailure exception.");
            }
        }
        e(next, 100009);
        if (this.f42257b.size() > 0) {
            try {
                this.f42257b.remove(0);
                k();
            } catch (ArrayIndexOutOfBoundsException unused2) {
                LogUtil.e("CommonFileRequestManager", "reportFileInfoTimeout remove failed due to empty list");
            }
        }
    }

    private void c(Map.Entry<Integer, mrk> entry) {
        LogUtil.a("CommonFileRequestManager", "toKitReportNoConnectDevice enter.");
        if (entry.getValue().x() == null || !d(entry.getValue().x())) {
            return;
        }
        try {
            LogUtil.a("CommonFileRequestManager", "to kit error code.");
            entry.getValue().x().onResponse(300004, "");
        } catch (RemoteException unused) {
            LogUtil.e("CommonFileRequestManager", "toKitReportNoConnectDevice disconnected RemoteException");
        }
    }

    private boolean d(IBaseCommonCallback iBaseCommonCallback) {
        if (this.f42257b.size() == 0) {
            return false;
        }
        Iterator<mrk> it = this.f42257b.iterator();
        while (it.hasNext()) {
            if (it.next().x() == iBaseCommonCallback) {
                return true;
            }
        }
        return false;
    }

    private void b(mrk mrkVar, int i) {
        LogUtil.a("CommonFileRequestManager", "5.44.1 toKitFileMessageErrorCode enter.");
        e(mrkVar, i);
        if (this.f42257b.size() <= 0 || i == 30003) {
            return;
        }
        this.f42257b.remove(0);
        k();
    }

    private void j(mrk mrkVar) {
        LogUtil.a("CommonFileRequestManager", "toKitCheckFailure enter.");
        e(mrkVar, 30001);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(mrk mrkVar) {
        LogUtil.a("CommonFileRequestManager", "toKitFileTimeout enter");
        b(mrkVar, OnRegisterSkinAttrsListener.REGISTER_BY_SCAN);
    }

    private void e(mrk mrkVar, int i) {
        if (mrkVar == null || mrkVar.x() == null) {
            LogUtil.j("CommonFileRequestManager", "commonFileInfo.getKitCallback() is null. code:", Integer.valueOf(i));
            return;
        }
        LogUtil.a("CommonFileRequestManager", "toKitFailureCode enter. errorCode:", Integer.valueOf(i));
        try {
            mrkVar.x().onResponse(i, "");
        } catch (RemoteException unused) {
            LogUtil.e("CommonFileRequestManager", "toKitFailureCode remote exception");
        } catch (Exception unused2) {
            LogUtil.e("CommonFileRequestManager", "third part has exception, catch this");
        }
    }

    private void d(mrn mrnVar, mrk mrkVar) {
        if (mrkVar.x() == null) {
            LogUtil.j("CommonFileRequestManager", "toKitFileConsultInfo callback is null");
            return;
        }
        LogUtil.a("CommonFileRequestManager", "enter toKitFileConsultInfo");
        try {
            try {
                mrkVar.x().onResponse(10001, e(0, mrnVar.b(), mrkVar.p(), mrkVar.t().getBytes("UTF-8")));
            } catch (RemoteException unused) {
                LogUtil.e("CommonFileRequestManager", "toKitFileConsultInfo remote exception");
            }
        } catch (UnsupportedEncodingException unused2) {
            LogUtil.e("CommonFileRequestManager", "UnsupportedEncodingException : no support utf-8");
            try {
                mrkVar.x().onResponse(10001, "");
            } catch (RemoteException unused3) {
                LogUtil.e("CommonFileRequestManager", "toKitFileConsultInfo remote exception");
            }
        }
    }

    private void a(mrk mrkVar, byte[] bArr, int i, int i2) {
        if (mrkVar.x() == null) {
            LogUtil.j("CommonFileRequestManager", "toKitFrameData callback is null.");
            return;
        }
        mrl mrlVar = this.m.get(Integer.valueOf(i));
        if (mrlVar == null) {
            LogUtil.j("CommonFileRequestManager", "toKitFrameData retryInfo is null.");
            return;
        }
        if (i2 != mrlVar.a() + 1) {
            LogUtil.j("CommonFileRequestManager", "this frame has return to kit, return.");
            return;
        }
        mrlVar.b(i2);
        this.m.put(Integer.valueOf(i), mrlVar);
        LogUtil.a("CommonFileRequestManager", "toKitFrameData enter");
        mrkVar.k(mrkVar.z() + 1);
        String strB = b(0, mrkVar.z(), bArr);
        LogUtil.a("CommonFileRequestManager", "toKitFrameData:", lnb.e(strB));
        try {
            mrkVar.x().onResponse(10002, strB);
        } catch (RemoteException unused) {
            LogUtil.e("CommonFileRequestManager", "toKitFrameData remote exception");
        } catch (Exception unused2) {
            LogUtil.e("CommonFileRequestManager", "toKitFrameData occur exception");
        }
    }

    private String b(int i, int i2, byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", i);
            jSONObject.put("index", i2);
            jSONObject.put("value", eeq.e(bArr));
        } catch (JSONException unused) {
            LogUtil.e("CommonFileRequestManager", "toFileTransferInfoJson exception");
        }
        LogUtil.a("CommonFileRequestManager", "toFileTransferInfoJson json:", jSONObject.toString());
        return jSONObject.toString();
    }

    private String e(int i, int i2, int i3, byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", i);
            jSONObject.put("maxTransferUnit", i2);
            jSONObject.put("fileSize", i3);
            jSONObject.put("crc", eeq.e(bArr));
        } catch (JSONException unused) {
            LogUtil.e("CommonFileRequestManager", "toFileConsultInfoJson exception");
        }
        LogUtil.a("CommonFileRequestManager", "toFileConsultInfoJson json is:", jSONObject.toString());
        return jSONObject.toString();
    }

    private void m() {
        if (this.f == null) {
            HandlerThread handlerThread = new HandlerThread("CommonFileRequestManager");
            this.g = handlerThread;
            handlerThread.start();
            this.f = new c(this.g.getLooper());
            Message messageObtain = Message.obtain();
            messageObtain.what = 544;
            this.f.sendMessageDelayed(messageObtain, 10000L);
            return;
        }
        Message messageObtain2 = Message.obtain();
        messageObtain2.what = 544;
        this.f.sendMessageDelayed(messageObtain2, 10000L);
    }

    private void o() {
        c cVar = this.f;
        if (cVar != null) {
            cVar.removeMessages(544);
        }
    }
}
