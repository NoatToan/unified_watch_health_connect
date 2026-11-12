package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.devicesdk.callback.StatusCallback;
import com.huawei.devicesdk.entity.ConnectMode;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.skinner.internal.OnRegisterSkinAttrsListener;
import com.huawei.ui.main.stories.me.adapter.AdapterWithBottomView;
import com.huawei.unitedevice.callback.ITransferFileCallback;
import com.huawei.unitedevice.entity.UniteDevice;
import com.huawei.unitedevice.hwcommonfilemgr.FileRequestBaseManager;
import com.huawei.unitedevice.hwcommonfilemgr.ParserInterface;
import com.huawei.unitedevice.hwcommonfilemgr.bean.Priority;
import com.huawei.unitedevice.hwcommonfilemgr.entity.CommonFileInfoParcel;
import com.huawei.unitedevice.hwcommonfilemgr.entity.RequestFileInfo;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes20.dex */
public class xhe extends FileRequestBaseManager implements ParserInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f52974c = new Object();
    private static volatile xhe d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f52975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f52976b;
    private int e;
    private ExtendHandler f;
    private boolean g;
    private int h;
    private StatusCallback.Stub i;
    private xhk j;
    private cqe l;
    private long m;
    private xho o;

    private xhe(Context context) {
        super(context);
        this.o = xho.d();
        this.j = new xhk();
        this.l = new cqe();
        this.g = false;
        this.m = 0L;
        this.f52975a = 0L;
        this.h = 0;
        this.e = 0;
        this.i = new StatusCallback.Stub() { // from class: xhe.5
            @Override // com.huawei.devicesdk.callback.StatusCallback
            public void onStatusChanged(int i, UniteDevice uniteDevice, int i2) {
                if (uniteDevice == null) {
                    LogUtil.d("Unite_CommonFileRequestManager", "onStatusChanged error. UniteDevice is null");
                    return;
                }
                DeviceInfo deviceInfo = uniteDevice.getDeviceInfo();
                if (deviceInfo == null || deviceInfo.getDeviceBtType() <= 0) {
                    LogUtil.b("onStatusChanged. deviceInfo is", Boolean.valueOf(deviceInfo == null));
                    return;
                }
                if (i2 == 2) {
                    LogUtil.b("Unite_CommonFileRequestManager", "device connected");
                } else if (i2 == 3) {
                    xhe.this.e(uniteDevice);
                } else {
                    LogUtil.c("Unite_CommonFileRequestManager", "mConnectStateChangedReceiver() default");
                }
            }
        };
        this.f52976b = context;
        this.f = HandlerCenter.b(new a(), "Unite_CommonFileRequestManager");
        xhg.e().a(this.i);
        b();
    }

    private void j() {
        LogUtil.b("Unite_CommonFileRequestManager", "enter remove kit , size:", Integer.valueOf(this.o.a().size()));
        if (this.o.a().size() > 0) {
            try {
                if (this.o.a().get(0).aw()) {
                    LogUtil.b("Unite_CommonFileRequestManager", "remove kit callback");
                    this.o.a().remove(0);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                ReleaseLogUtil.c("R_Unite_CommonFileRequestManager", "removeKit error out of bounds");
            }
        }
    }

    public void e() {
        xhg.e().d(this.i);
        g();
    }

    private static void g() {
        synchronized (f52974c) {
            d = null;
        }
    }

    public static xhe d() {
        xhe xheVar;
        synchronized (f52974c) {
            if (d == null) {
                d = new xhe(BaseApplication.b());
            }
            xheVar = d;
        }
        return xheVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(UniteDevice uniteDevice) {
        LogUtil.b("Unite_CommonFileRequestManager", "disconnected identify:", cpl.a(xhw.a(uniteDevice)));
        CopyOnWriteArrayList<xhr> copyOnWriteArrayListA = this.o.a();
        if (copyOnWriteArrayListA.isEmpty()) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        AtomicBoolean atomicBoolean = null;
        for (xhr xhrVar : copyOnWriteArrayListA) {
            String strB = xhw.b(xhrVar);
            if (strB != null && !strB.equals(xhw.a(uniteDevice))) {
                LogUtil.b("Unite_CommonFileRequestManager", "other device disconnect, no remove task.");
                if (atomicBoolean == null) {
                    atomicBoolean = new AtomicBoolean(false);
                }
            } else {
                if (atomicBoolean == null) {
                    atomicBoolean = new AtomicBoolean(true);
                    this.f.removeTasksAndMessages();
                }
                copyOnWriteArrayList.add(xhrVar);
                d(xhrVar);
            }
        }
        LogUtil.b("Unite_CommonFileRequestManager", "remove disconnect device task size : " + copyOnWriteArrayList.size());
        this.o.a().removeAll(copyOnWriteArrayList);
        if (atomicBoolean == null || !atomicBoolean.get()) {
            return;
        }
        l();
    }

    private void d(xhr xhrVar) {
        ITransferFileCallback iTransferFileCallbackP = xhrVar.p();
        if (iTransferFileCallbackP == null) {
            return;
        }
        try {
            if (xhrVar.aw()) {
                iTransferFileCallbackP.onFailure(300004, "");
            } else {
                iTransferFileCallbackP.onFailure(30004, "");
            }
        } catch (Exception unused) {
            LogUtil.d("Unite_CommonFileRequestManager", "disconnected RemoteException");
        }
        xhw.c(this.f52976b, xhrVar);
    }

    @Override // com.huawei.unitedevice.hwcommonfilemgr.ParserInterface
    public boolean getResult(DeviceInfo deviceInfo, byte[] bArr) {
        cpl.d("Unite_CommonFileRequestManager", bArr, "getResult message:");
        if (deviceInfo == null) {
            return false;
        }
        cmo cmoVarF = cnk.c().f(deviceInfo.getDeviceMac());
        ConnectMode connectModeB = cmoVarF == null ? null : cmoVarF.b();
        if (connectModeB != null) {
            if (connectModeB.value() == ConnectMode.SIMPLE.value()) {
                return true;
            }
        } else {
            LogUtil.e("Unite_CommonFileRequestManager", "getResult connectMode is null");
        }
        if (bArr == null || bArr.length <= 2 || d(bArr)) {
            LogUtil.e("Unite_CommonFileRequestManager", "getResult() dataBytes is error.");
            return false;
        }
        byte b2 = bArr[1];
        if (b2 == 1) {
            e(bArr, deviceInfo);
        } else if (b2 == 2) {
            b(bArr, deviceInfo);
        } else if (b2 == 3) {
            d(bArr, deviceInfo);
        } else if (b2 == 5) {
            c(bArr, deviceInfo);
        } else if (b2 == 6) {
            a(bArr, deviceInfo);
        } else {
            LogUtil.c("Unite_CommonFileRequestManager", "getResult() default");
            return true;
        }
        return false;
    }

    private boolean d(byte[] bArr) {
        if (bArr[1] == 5) {
            return false;
        }
        cql cqlVar = new cql();
        int length = bArr.length - 2;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 2, bArr2, 0, length);
        try {
            cqlVar.b(bArr2);
            return false;
        } catch (cpy unused) {
            LogUtil.d("Unite_CommonFileRequestManager", "device send app wrong data");
            return true;
        }
    }

    private boolean e(xhr xhrVar, long j) {
        LogUtil.b("Unite_CommonFileRequestManager", "prepare putCommonFileInfo to queue");
        boolean z = false;
        for (xhr xhrVar2 : this.o.a()) {
            if ((xhrVar2.an() != 0 && j - xhrVar2.an() > 86400000) || (xhrVar2.al() != 0 && j - xhrVar2.al() > 3600000)) {
                LogUtil.b("Unite_CommonFileRequestManager", "putCommonFileInfo check task is not effective");
                this.o.a().remove(xhrVar2);
            } else if (!xhrVar2.equals(xhrVar)) {
                continue;
            } else {
                if (xhrVar.ao()) {
                    if (xhrVar.at()) {
                        LogUtil.b("Unite_CommonFileRequestManager", "cancel line up fail,task started:", Integer.valueOf(xhrVar.m()));
                        b(xhrVar, 4);
                    } else {
                        LogUtil.b("Unite_CommonFileRequestManager", "cancel line up success:", Integer.valueOf(xhrVar.m()));
                        b(xhrVar, 3);
                        this.o.a().remove(xhrVar2);
                    }
                    return false;
                }
                z = true;
            }
        }
        if (z) {
            LogUtil.e("Unite_CommonFileRequestManager", "putCommonFileInfo sameTask exist");
            b(xhrVar, "same task, can not put in queue.", 140008);
            return false;
        }
        if (xhrVar.ao()) {
            LogUtil.b("Unite_CommonFileRequestManager", "cancel line up fail:", Integer.valueOf(xhrVar.m()));
            b(xhrVar, 4);
            return false;
        }
        xhrVar.i(j);
        this.o.a().add(xhrVar);
        return true;
    }

    private void b(xhr xhrVar, String str, int i) {
        ITransferFileCallback iTransferFileCallbackP = xhrVar.p();
        if (iTransferFileCallbackP == null) {
            return;
        }
        try {
            iTransferFileCallbackP.onFailure(i, str);
        } catch (Exception unused) {
            LogUtil.d("Unite_CommonFileRequestManager", str + " : RemoteException");
        }
    }

    private void i(xhr xhrVar) {
        if (this.g) {
            LogUtil.b("Unite_CommonFileRequestManager", "send 5.44.1 task insert, requestNextTask");
            l();
        } else {
            cmg cmgVarE = xhu.e(xhrVar);
            a(xhrVar.y(), xhw.b(xhrVar));
            c(cmgVarE, xhw.a(xhrVar));
            n();
        }
    }

    public void a(RequestFileInfo requestFileInfo, ITransferFileCallback iTransferFileCallback) {
        int i;
        int i2;
        if (requestFileInfo == null) {
            return;
        }
        ReleaseLogUtil.c("R_Unite_CommonFileRequestManager", "enter startRequestFile isIskitWear: ", Boolean.valueOf(requestFileInfo.isKit()), "file type : ", Integer.valueOf(requestFileInfo.getFileType()));
        int[] times = requestFileInfo.getTimes();
        if (times == null || times.length != 2) {
            i = -1;
            i2 = -1;
        } else {
            int i3 = times[0];
            i2 = times[1];
            i = i3;
        }
        xhr xhrVarC = c(requestFileInfo, iTransferFileCallback);
        if (xhrVarC.h() == null) {
            try {
                iTransferFileCallback.onFailure(30004, "");
                return;
            } catch (RemoteException unused) {
                LogUtil.d("Unite_CommonFileRequestManager", "startRequestFile remote exception");
                return;
            }
        }
        xhrVarC.k(i);
        xhrVarC.b(i2);
        xhrVarC.c(Priority.DEFAULT);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (requestFileInfo.getFileType() == 10) {
            xhrVarC.g(requestFileInfo.getSourcePackageName());
            xhrVarC.j(requestFileInfo.getSourceCertificate());
            xhrVarC.a(requestFileInfo.getDestinationPackageName());
            xhrVarC.e(requestFileInfo.getDestinationCertificate());
            xhrVarC.b(requestFileInfo.getDescription());
        }
        if (xhrVarC.av()) {
            b(xhrVarC);
        } else {
            a(requestFileInfo, i, i2, xhrVarC, jCurrentTimeMillis);
        }
    }

    private void b() {
        xhw.c(new File(this.f52976b.getFilesDir().getPath() + File.separator + "commonFileRequest"));
        try {
            String strB = cop.b(this.f52976b.getFilesDir().getCanonicalPath() + File.separator + "commonFileRequest");
            if (strB != null) {
                xhw.c(new File(strB));
            }
        } catch (IOException unused) {
            LogUtil.d("Unite_CommonFileRequestManager", "deleteMacDir wrong");
        }
    }

    private void a(RequestFileInfo requestFileInfo, int i, int i2, xhr xhrVar, long j) {
        if (this.o.a().size() > 0) {
            int size = this.o.a().size();
            LogUtil.b("Unite_CommonFileRequestManager", "mCacheFiles size:", Integer.valueOf(size), ", fileInfo name:", xhrVar.n(), ", type:", Integer.valueOf(xhrVar.y()));
            if (requestFileInfo.isKit()) {
                try {
                    ITransferFileCallback iTransferFileCallbackP = xhrVar.p();
                    if (iTransferFileCallbackP != null) {
                        iTransferFileCallbackP.onFailure(AdapterWithBottomView.TYPE_BOTTOM, "");
                    }
                } catch (RemoteException unused) {
                    LogUtil.d("Unite_CommonFileRequestManager", "toKitFailureCode remote exception");
                }
            }
            if (e(xhrVar, j)) {
                f();
                return;
            }
            return;
        }
        c(xhrVar, j, requestFileInfo, i, i2);
    }

    private void c(xhr xhrVar, long j, RequestFileInfo requestFileInfo, int i, int i2) {
        xhrVar.j(j);
        xhrVar.i(j);
        if (!e(xhrVar)) {
            this.o.a().add(xhrVar);
        }
        boolean zE = e(xhrVar);
        LogUtil.b("Unite_CommonFileRequestManager", "sendOneCommonFileInfo enter isCacheListContains :", Boolean.valueOf(zE), "send 5.44.1 deviceMac is :", cpl.a(requestFileInfo.getDeviceMac()));
        j(xhrVar);
    }

    private void b(xhr xhrVar) {
        if (this.o.a().size() > 0) {
            if (!xhrVar.ao()) {
                b(xhrVar, 2);
            }
            if (e(xhrVar, System.currentTimeMillis())) {
                f();
                return;
            }
            return;
        }
        this.o.a().add(xhrVar);
        b(xhrVar, 0);
        e(xhrVar.m(), xhrVar);
    }

    private xhr c(RequestFileInfo requestFileInfo, ITransferFileCallback iTransferFileCallback) {
        xhr xhrVar = new xhr();
        xhrVar.g(requestFileInfo.getFileType());
        if (!TextUtils.isEmpty(requestFileInfo.getFileName())) {
            xhrVar.c(requestFileInfo.getFileName());
        }
        xhrVar.a(requestFileInfo.isNeedVerify());
        xhrVar.d(requestFileInfo.isKit());
        xhrVar.c(iTransferFileCallback);
        xhrVar.e(requestFileInfo.isDeviceReport());
        if (!TextUtils.isEmpty(requestFileInfo.getDeviceMac())) {
            xhrVar.c(xhw.b(requestFileInfo.getDeviceMac()));
        } else {
            LogUtil.b("Unite_CommonFileRequestManager", "deviceMac is null ");
        }
        LogUtil.b("Unite_CommonFileRequestManager", "DictTypeId : ", Integer.valueOf(requestFileInfo.getDictTypeId()));
        xhrVar.c(requestFileInfo.getDictTypeId());
        if (cop.e()) {
            this.e = requestFileInfo.getDictTypeId();
            this.h = requestFileInfo.getFileType();
        }
        if (requestFileInfo.isDeviceReport()) {
            xhrVar.a(requestFileInfo.getFileId());
            xhrVar.a(requestFileInfo.getFileSize());
            xhrVar.b(requestFileInfo.getDescription());
            xhrVar.g(requestFileInfo.getSourcePackageName());
            xhrVar.a(requestFileInfo.getDestinationPackageName());
            xhrVar.j(requestFileInfo.getSourceCertificate());
            xhrVar.e(requestFileInfo.getDestinationCertificate());
            xhrVar.c(requestFileInfo.isCancelTransmission());
        }
        return xhrVar;
    }

    private void f() {
        LogUtil.b("Unite_CommonFileRequestManager", "doubleCheckQueue CacheFiles size is :", Integer.valueOf(this.o.a().size()));
        if (this.o.a().size() == 1) {
            l();
        }
    }

    private void l() {
        this.g = false;
        try {
            if (this.o.a().size() > 0) {
                xhr xhrVar = this.o.a().get(0);
                LogUtil.b("Unite_CommonFileRequestManager", "request next task:", Integer.valueOf(xhrVar.y()));
                xhrVar.j(System.currentTimeMillis());
                if (xhrVar.av()) {
                    LogUtil.b("Unite_CommonFileRequestManager", "request next task:", Integer.valueOf(xhrVar.m()));
                    e(xhrVar.m(), xhrVar);
                    return;
                } else if (xhrVar.y() == 1) {
                    e(xhrVar.n(), xhrVar.y(), xhw.a(xhrVar), xhrVar.f());
                    return;
                } else if (xhrVar.y() >= 10 && xhrVar.y() <= 13) {
                    i(xhrVar);
                    return;
                } else {
                    j(xhrVar);
                    return;
                }
            }
            LogUtil.e("Unite_CommonFileRequestManager", "task is empty.");
        } catch (ArrayIndexOutOfBoundsException unused) {
            ReleaseLogUtil.c("R_Unite_CommonFileRequestManager", "getCacheFiles error out of bounds");
        }
    }

    public void d(RequestFileInfo requestFileInfo, ITransferFileCallback iTransferFileCallback) {
        if (requestFileInfo == null) {
            return;
        }
        for (Map.Entry<String, xhr> entry : this.o.c().entrySet()) {
            if (TextUtils.equals(entry.getValue().n(), requestFileInfo.getFileName()) && requestFileInfo.getFileType() == entry.getValue().y() && TextUtils.equals(xhw.b(entry.getValue()), requestFileInfo.getDeviceMac())) {
                LogUtil.b("Unite_CommonFileRequestManager", "stopRequestFile fileId:", entry.getKey());
                entry.getValue().b(iTransferFileCallback);
                e(entry.getValue().m(), 4, xhw.a(entry.getValue()));
            }
        }
    }

    private boolean e(xhr xhrVar) {
        Iterator<xhr> it = this.o.a().iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (xhrVar.equals(it.next())) {
                z = true;
            }
        }
        return z;
    }

    private void j(xhr xhrVar) {
        byte[] bArrD;
        LogUtil.b("Unite_CommonFileRequestManager", "sendFileInfo 5.44.1 fileName : ", xhrVar.n(), ", fileType: ", Integer.valueOf(xhrVar.y()));
        if (xhrVar.y() == 10) {
            bArrD = a(xhrVar);
        } else {
            bArrD = d(xhrVar.n(), xhrVar.y(), xhrVar.aj(), xhrVar.k(), xhrVar.f());
        }
        a(xhrVar.y(), xhw.b(xhrVar));
        c(xhu.b(bArrD, 44, 1), xhw.a(xhrVar));
        c(xhrVar.y());
    }

    private void a(int i, String str) {
        this.o.b().put(xhw.d(str, i), new xhp());
    }

    private void e(String str, int i, DeviceInfo deviceInfo, int i2) {
        byte[] bArrD = d(str, i, -1, -1, i2);
        a(i, deviceInfo.getDeviceMac());
        c(xhu.b(bArrD, 44, 1), deviceInfo);
    }

    private void c(int i) {
        if (this.f == null) {
            this.f = HandlerCenter.b(new a(), "Unite_CommonFileRequestManager");
        }
        Message messageObtain = Message.obtain();
        messageObtain.arg1 = 500;
        messageObtain.what = i;
        this.f.sendMessage(messageObtain, 35000L);
    }

    private void i() {
        LogUtil.b("Unite_CommonFileRequestManager", "enter removeFileInfoTimeout");
        Iterator<xhr> it = this.o.a().iterator();
        if (it.hasNext()) {
            b(it.next().y());
        }
    }

    private void e(byte[] bArr, DeviceInfo deviceInfo) {
        h();
        if (this.g) {
            LogUtil.b("Unite_CommonFileRequestManager", "receive 5.44.1 task insert, requestNextTask");
            l();
            return;
        }
        i();
        String strD = cph.d(bArr);
        LogUtil.b("Unite_CommonFileRequestManager", "5.44.1 handleRequest: ", strD);
        if (TextUtils.isEmpty(strD) || strD.length() < 4) {
            LogUtil.e("Unite_CommonFileRequestManager", "handleRequest dataBytes is error");
        } else {
            a(strD.substring(4), deviceInfo);
        }
    }

    private void a(String str, DeviceInfo deviceInfo) {
        LogUtil.e("Unite_CommonFileRequestManager", "handleRequestTlv entry");
        xhr xhrVar = new xhr();
        int i = 0;
        try {
            List<cqa> listB = this.l.a(str).b();
            if (listB != null && listB.size() > 0) {
                for (cqa cqaVar : listB) {
                    int iC = cpb.c(cqaVar.b(), 16);
                    String strC = cqaVar.c();
                    int iD = xhu.d(iC, xhrVar, strC);
                    if (iD != 0) {
                        i = iD;
                    }
                    xhu.c(iC, xhrVar, strC);
                }
            } else {
                LogUtil.e("Unite_CommonFileRequestManager", "handleRequest tlv list error");
            }
        } catch (cpy unused) {
            LogUtil.d("Unite_CommonFileRequestManager", "handleRequest error");
        }
        LogUtil.e("Unite_CommonFileRequestManager", "deviceMac:", cpl.a(deviceInfo.getDeviceMac()));
        UniteDevice uniteDevice = new UniteDevice();
        uniteDevice.setDeviceInfo(deviceInfo);
        xhrVar.c(uniteDevice);
        if (cop.e()) {
            this.f52975a = xhrVar.u();
        }
        xhrVar.j(xhw.e(xhw.d(deviceInfo.getDeviceMac(), xhrVar.m())));
        c(xhrVar, i);
    }

    private void c(xhr xhrVar, int i) {
        LogUtil.b("Unite_CommonFileRequestManager", "handleRequestFunc entry");
        Iterator<xhr> it = this.o.a().iterator();
        if (it.hasNext()) {
            xhr next = it.next();
            LogUtil.b("Unite_CommonFileRequestManager", "name :", next.n(), ", cache type:", Integer.valueOf(next.y()));
            xhrVar.c(next.p());
            xhrVar.e(next.av());
            if (e(next.n(), xhrVar.n()) && (next.y() == xhrVar.y() || xhrVar.y() == 0)) {
                xhrVar.d(next.aw());
                xhrVar.a(next.ax());
                xhrVar.d(next.s());
                xhrVar.d(next.d());
                xhrVar.c(next.f());
                if (xhrVar.y() == 0) {
                    xhrVar.c(next.n());
                    xhrVar.g(next.y());
                }
            } else {
                LogUtil.b("Unite_CommonFileRequestManager", "5.44.1 device report error.");
                if (xhrVar.n() == null && next.n() == null && i != 100000) {
                    xhrVar.d(true);
                }
                xhrVar.c(next.n());
                xhrVar.g(next.y());
                if (i == 100000) {
                    i = 144001;
                }
            }
            if (i != 100000) {
                if (xhrVar.p() != null) {
                    try {
                        c(xhrVar);
                        xhrVar.p().onFailure(i, "");
                        LogUtil.b("Unite_CommonFileRequestManager", "onUpgradeFailed errorCode:", Integer.valueOf(i));
                        return;
                    } catch (RemoteException | NullPointerException unused) {
                        LogUtil.d("Unite_CommonFileRequestManager", "commonFileInfo.getFileRequestCallBack RemoteException");
                        return;
                    }
                }
                LogUtil.e("Unite_CommonFileRequestManager", "file callback is null");
                d(i);
                return;
            }
            e(xhrVar.m(), xhrVar);
        }
    }

    private void e(int i, xhr xhrVar) {
        LogUtil.b("Unite_CommonFileRequestManager", "device support transfer file, file type: ", Integer.valueOf(xhrVar.y()), xhrVar.y() == 0 ? ", no task deal with this tlv." : "");
        if (xhrVar.y() == 0) {
            LogUtil.e("Unite_CommonFileRequestManager", "commonFileInfo fileType is 0");
            return;
        }
        xhrVar.a(i);
        xhrVar.f(true);
        String strD = xhw.d(xhw.b(xhrVar), xhrVar.m());
        this.o.c().put(strD, xhrVar);
        this.o.b().put(strD, new xhp());
        LogUtil.b("Unite_CommonFileRequestManager", "reset info:file id: ", Integer.valueOf(xhrVar.m()), ", fileType: ", Integer.valueOf(xhrVar.y()), ", filename: ", xhrVar.n(), ", NeedVerify: ", Boolean.valueOf(xhrVar.ax()));
        if (cop.e()) {
            this.m = System.currentTimeMillis();
        }
        if (xhrVar.ax()) {
            b(xhrVar.m(), 1, xhw.a(xhrVar));
        } else {
            c(xhrVar.m(), xhw.a(xhrVar));
        }
    }

    private boolean e(String str, String str2) {
        return TextUtils.equals(str, str2) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str);
    }

    private void b(int i, int i2, DeviceInfo deviceInfo) {
        if (this.g) {
            LogUtil.b("Unite_CommonFileRequestManager", "send 5.44.2 task insert, requestNextTask");
            l();
        } else {
            c(xhu.b(d(i, i2), 44, 2), deviceInfo);
            n();
        }
    }

    private void b(byte[] bArr, DeviceInfo deviceInfo) {
        h();
        if (this.g) {
            LogUtil.b("Unite_CommonFileRequestManager", "receive 5.44.2 task insert, requestNextTask");
            l();
            return;
        }
        String strD = cph.d(bArr);
        LogUtil.b("Unite_CommonFileRequestManager", "5.44.2 handleRequestHash: ", strD);
        if (TextUtils.isEmpty(strD) || strD.length() < 4) {
            LogUtil.e("Unite_CommonFileRequestManager", "handleRequestHash dataBytes is error");
            return;
        }
        try {
            List<cqa> listB = this.l.a(strD.substring(4)).b();
            if (listB != null && listB.size() > 0) {
                String str = "";
                int iC = 0;
                for (cqa cqaVar : listB) {
                    int iC2 = cpb.c(cqaVar.b(), 16);
                    String strC = cqaVar.c();
                    if (iC2 == 1) {
                        iC = cpb.c(strC, 16);
                        LogUtil.b("Unite_CommonFileRequestManager", "handleRequestHash file id: ", Integer.valueOf(iC));
                    } else if (iC2 != 3) {
                        LogUtil.c("Unite_CommonFileRequestManager", "handleRequestHash default");
                    } else {
                        str = strC;
                    }
                }
                e(iC, str, deviceInfo);
                return;
            }
            LogUtil.e("Unite_CommonFileRequestManager", "handleRequestHash tlv list error");
        } catch (cpy unused) {
            LogUtil.d("Unite_CommonFileRequestManager", "handleRequestHash error");
        }
    }

    private void e(int i, String str, DeviceInfo deviceInfo) {
        String strD = xhw.d(deviceInfo.getDeviceMac(), i);
        if (this.o.c().get(strD) != null) {
            this.o.c().get(strD).f(str);
            c(i, deviceInfo);
        } else {
            LogUtil.b("Unite_CommonFileRequestManager", "saveFileHash error");
        }
    }

    private void c(int i, DeviceInfo deviceInfo) {
        if (this.g) {
            LogUtil.b("Unite_CommonFileRequestManager", "send 5.44.3 task insert, requestNextTask");
            l();
        } else {
            c(xhu.b(a(i), 44, 3), deviceInfo);
            n();
        }
    }

    private void d(byte[] bArr, DeviceInfo deviceInfo) {
        h();
        if (this.g) {
            LogUtil.b("Unite_CommonFileRequestManager", "receive 5.44.3 task insert, requestNextTask");
            l();
            return;
        }
        String strD = cph.d(bArr);
        LogUtil.b("Unite_CommonFileRequestManager", "5.44.3 handleConsult:", strD);
        String strSubstring = strD.substring(4);
        xht xhtVar = new xht();
        try {
            List<cqa> listB = this.l.a(strSubstring).b();
            if (listB != null && listB.size() > 0) {
                for (cqa cqaVar : listB) {
                    c(xhtVar, cpb.c(cqaVar.b(), 16), cqaVar.c(), deviceInfo);
                }
                if (xhtVar.e() == 0) {
                    LogUtil.e("Unite_CommonFileRequestManager", "xxx / 0 will error, check this info.");
                    return;
                }
                LogUtil.b("Unite_CommonFileRequestManager", "5.44.3 handleConsult fileId: ", Integer.valueOf(xhtVar.b()));
                int iB = b(xhtVar);
                xhtVar.a(iB);
                LogUtil.b("Unite_CommonFileRequestManager", "5.44.3 handleConsult psnMax: ", Integer.valueOf(iB));
                String strD2 = xhw.d(deviceInfo.getDeviceMac(), xhtVar.b());
                this.o.e().put(strD2, xhtVar);
                if (this.o.c().get(strD2) != null) {
                    a(xhtVar.b(), deviceInfo);
                    this.j.b(xhtVar, this.o.c().get(strD2));
                    return;
                }
                return;
            }
            LogUtil.e("Unite_CommonFileRequestManager", "handleConsult tlv list error");
        } catch (cpy unused) {
            LogUtil.d("Unite_CommonFileRequestManager", "handleConsult error");
        }
    }

    private int b(xht xhtVar) {
        if (xhtVar.c() % xhtVar.e() == 0) {
            return (xhtVar.c() / xhtVar.e()) - 1;
        }
        return xhtVar.c() / xhtVar.e();
    }

    private void c(xht xhtVar, int i, String str, DeviceInfo deviceInfo) {
        if (i == 1) {
            xhtVar.b(cpb.c(str, 16));
            LogUtil.b("Unite_CommonFileRequestManager", "handleParamTlv file id: ", Integer.valueOf(xhtVar.b()));
            return;
        }
        if (i == 2) {
            xhtVar.e(cpb.c(str, 16));
            LogUtil.b("Unite_CommonFileRequestManager", "handleParamTlv device wait timeout: ", Integer.valueOf(xhtVar.d()));
            return;
        }
        if (i == 3) {
            xhtVar.g(cpb.c(str, 16));
            LogUtil.b("Unite_CommonFileRequestManager", "handleConsult unit size: ", Integer.valueOf(xhtVar.e()));
        } else if (i == 4) {
            xhtVar.c(cpb.c(str, 16));
            LogUtil.b("Unite_CommonFileRequestManager", "handleConsult max apply: ", Integer.valueOf(xhtVar.c()));
        } else if (i != 5) {
            LogUtil.c("Unite_CommonFileRequestManager", "handleParamTlv default");
        } else {
            xhtVar.c(cpb.a(str) == 1);
            LogUtil.b("Unite_CommonFileRequestManager", "handleConsult not need encrypt: ", Boolean.valueOf(xhtVar.f()));
        }
    }

    private void a(int i, DeviceInfo deviceInfo) {
        LogUtil.b("Unite_CommonFileRequestManager", "startRequest fileId:", Integer.valueOf(i));
        String strD = xhw.d(deviceInfo.getDeviceMac(), i);
        xhr xhrVar = this.o.c().get(strD);
        if (xhrVar == null) {
            LogUtil.d("Unite_CommonFileRequestManager", "startRequest, commonFileInfo is null");
            return;
        }
        xhrVar.c(xhw.d(this.f52976b, xhrVar));
        LogUtil.b("Unite_CommonFileRequestManager", "startRequest offset:", Long.valueOf(xhrVar.s()));
        e(i, xhrVar.s(), false, strD);
    }

    private void a(int i, long j, boolean z, String str) {
        xhp xhpVar = this.o.b().get(str);
        if (xhpVar == null) {
            LogUtil.e("Unite_CommonFileRequestManager", "setRetryInfo info is null.");
            return;
        }
        xhpVar.a(j);
        if (z) {
            xhpVar.b(-1);
        }
        this.o.b().put(str, xhpVar);
    }

    private void e(int i, long j, boolean z, String str) {
        LogUtil.b("Unite_CommonFileRequestManager", "doRequest fileId: ", Integer.valueOf(i), " offset: ", Long.valueOf(j));
        xhr xhrVar = this.o.c().get(str);
        if (xhrVar == null) {
            LogUtil.e("Unite_CommonFileRequestManager", "doRequest fileId not in list");
            return;
        }
        xht xhtVar = this.o.e().get(str);
        if (xhtVar == null) {
            LogUtil.e("Unite_CommonFileRequestManager", "fileTransferParameter is null");
            return;
        }
        xhrVar.d(j);
        xhrVar.f(0);
        a(i, j, !z, str);
        if (xhtVar.c() <= xhrVar.u() - xhrVar.s()) {
            LogUtil.b("Unite_CommonFileRequestManager", "doRequest request max: ", Integer.valueOf(xhtVar.c()));
            xhrVar.e(xhtVar.c());
            xhrVar.b(xhtVar.a());
            xhrVar.d(ByteBuffer.allocate(xhtVar.c()));
            e(xhrVar, xhtVar.c(), xhw.a(xhrVar));
        } else {
            long jU = xhrVar.u() - xhrVar.s();
            LogUtil.b("Unite_CommonFileRequestManager", "doRequest request not max: ", Long.valueOf(jU));
            if (xhtVar.e() == 0 || jU < 0) {
                LogUtil.d("Unite_CommonFileRequestManager", "fileSpare / 0 will error, check this info.");
                return;
            }
            if (jU % ((long) xhtVar.e()) == 0) {
                xhrVar.b((jU / ((long) xhtVar.e())) - 1);
            } else {
                xhrVar.b(jU / ((long) xhtVar.e()));
            }
            xhrVar.e(jU);
            xhrVar.d(ByteBuffer.allocate((int) jU));
            e(xhrVar, xhrVar.o(), xhw.a(xhrVar));
        }
        if (!z) {
            LogUtil.b("Unite_CommonFileRequestManager", "doRequest first");
            c(i, xhtVar.d(), xhrVar.v(), str);
            xhrVar.h(0);
        }
        a(i, j, xhtVar.d() / 3, xhrVar.v(), str);
    }

    private void e(xhr xhrVar, long j, DeviceInfo deviceInfo) {
        if (this.g) {
            LogUtil.b("Unite_CommonFileRequestManager", "send 5.44.4 task insert, requestNextTask");
            l();
            return;
        }
        cmg cmgVarB = xhu.b(a(xhrVar.m(), xhrVar.s(), j, xhrVar.y(), xhrVar.f()), 44, 4);
        String strD = xhw.d(deviceInfo.getDeviceMac(), xhrVar.m());
        if (this.o.e().get(strD) != null && this.o.e().get(strD).f()) {
            LogUtil.b("Unite_CommonFileRequestManager", "builder command");
            cmg.b bVar = new cmg.b();
            bVar.b(false);
            c(bVar.a(cmgVarB), deviceInfo);
            return;
        }
        c(cmgVarB, deviceInfo);
    }

    private void c(byte[] bArr, DeviceInfo deviceInfo) {
        if (!f(bArr, deviceInfo)) {
            LogUtil.e("Unite_CommonFileRequestManager", "data is too big, please watch or band check 5.44.5, might lost data.");
            return;
        }
        h();
        String str = "";
        if (bArr == null || bArr.length < 8) {
            boolean z = this.g;
            if (z) {
                str = "empty tlv 5.44.5 task insert, requestNextTask";
            }
            LogUtil.e("Unite_CommonFileRequestManager", "handleDeviceDataReceived dataBytes is error, mIsCurrentTaskStop: ", Boolean.valueOf(z), str);
            if (this.g) {
                l();
                return;
            }
            return;
        }
        int iE = cph.e(Arrays.copyOfRange(bArr, 2, 3), 0);
        int iE2 = cph.e(Arrays.copyOfRange(bArr, 3, 7), 0);
        int iE3 = cph.e(Arrays.copyOfRange(bArr, 7, 8), 0);
        LogUtil.b("Unite_CommonFileRequestManager", "5.44.5 handleDeviceDataReceived fileID: ", Integer.valueOf(iE), ", offset: ", Integer.valueOf(iE2), ", psn: ", Integer.valueOf(iE3), " dataBytes ", Integer.valueOf(bArr.length));
        String strD = xhw.d(deviceInfo.getDeviceMac(), iE);
        xhr xhrVar = this.o.c().get(strD);
        if (xhrVar == null) {
            c();
            return;
        }
        long j = iE2;
        if (xhrVar.s() != j || xhrVar.r() != iE3) {
            boolean z2 = this.g;
            if (z2) {
                str = ", receive 5.44.5 task insert, requestNextTask";
            }
            LogUtil.b("Unite_CommonFileRequestManager", "handleDeviceDataReceived fileOffset or psn error, mIsCurrentTaskStop:", Boolean.valueOf(z2), str);
            if (this.g) {
                l();
                return;
            }
            return;
        }
        c(bArr, iE, iE3, xhrVar, strD);
        if (xhrVar.u() == 0) {
            LogUtil.e("Unite_CommonFileRequestManager", "getFileSize is zero");
            return;
        }
        long jU = (j * 100) / xhrVar.u();
        LogUtil.b("Unite_CommonFileRequestManager", "reportProgressForUi progress:", Long.valueOf(jU));
        b(strD, (int) jU);
    }

    private void c() {
        boolean z = this.g;
        LogUtil.e("Unite_CommonFileRequestManager", "handleDeviceDataReceived fileID error, mIsCurrentTaskStop: ", Boolean.valueOf(z), z ? ", receive 5.44.5 task insert, requestNextTask" : "");
        if (this.g) {
            l();
        }
    }

    private boolean f(byte[] bArr, DeviceInfo deviceInfo) {
        ConcurrentHashMap<String, xht> concurrentHashMapE = this.o.e();
        if (concurrentHashMapE == null) {
            LogUtil.e("Unite_CommonFileRequestManager", "fileTypeTransferInfos is null");
            return true;
        }
        if (bArr.length < 8) {
            LogUtil.e("Unite_CommonFileRequestManager", "length < 8, please check 5.44.5");
            return false;
        }
        xht xhtVar = concurrentHashMapE.get(xhw.d(deviceInfo.getDeviceMac(), bArr[2]));
        if (xhtVar != null) {
            return bArr.length - 8 <= xhtVar.e();
        }
        LogUtil.e("Unite_CommonFileRequestManager", "fileTransferParameter is null");
        return true;
    }

    private void c(byte[] bArr, int i, int i2, xhr xhrVar, String str) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 8, bArr.length);
        if (xhrVar.a() != null) {
            if (xhrVar.a().capacity() >= xhrVar.a().position() + bArrCopyOfRange.length) {
                xhrVar.a().put(bArrCopyOfRange);
                LogUtil.b("Unite_CommonFileRequestManager", "handleRequest dataValue:", Integer.valueOf(xhrVar.a().toString().length()));
                c(xhrVar.v(), xhrVar);
                this.j.d(xhrVar, bArrCopyOfRange, i, i2);
                if (i2 < xhrVar.q()) {
                    LogUtil.b("Unite_CommonFileRequestManager", "handleDeviceDataReceived keep wait");
                    xht xhtVar = this.o.e().get(str);
                    if (xhtVar != null) {
                        c(i, xhtVar.d(), xhrVar.v(), str);
                        xhp xhpVar = this.o.b().get(str);
                        if (xhpVar != null) {
                            a(i, xhpVar.e(), xhtVar.d() / 3, xhrVar.v(), str);
                        }
                    }
                    xhrVar.f(i2 + 1);
                    xhrVar.d(xhrVar.s() + ((long) bArrCopyOfRange.length));
                    return;
                }
                LogUtil.b("Unite_CommonFileRequestManager", "handleDeviceDataReceived one unit all received");
                ByteBuffer byteBufferA = xhrVar.a();
                if (byteBufferA != null) {
                    byteBufferA.clear();
                } else {
                    LogUtil.e("Unite_CommonFileRequestManager", "byteUnit is null.");
                }
                b(xhrVar, bArrCopyOfRange, i, str);
                return;
            }
            LogUtil.e("Unite_CommonFileRequestManager", "device return info is error. too big");
            return;
        }
        LogUtil.e("Unite_CommonFileRequestManager", "getByteUnit is null");
    }

    private void b(xhr xhrVar, byte[] bArr, int i, String str) {
        LogUtil.b("Unite_CommonFileRequestManager", "dealCommonFileInfoNext isSaveSuccess: ", Boolean.valueOf(xhw.a(this.f52976b, xhrVar, xhrVar.aa())));
        long jS = xhrVar.s() + ((long) bArr.length);
        if (jS < xhrVar.u()) {
            boolean z = this.g;
            LogUtil.b("Unite_CommonFileRequestManager", "mIsCurrentTaskStop:", Boolean.valueOf(z), z ? "handleRequest next, task insert, requestNextTask" : "start request next");
            if (this.g) {
                b(xhrVar, jS);
                l();
                return;
            } else {
                e(i, jS, false, str);
                return;
            }
        }
        xhrVar.d(jS);
        c(i, str);
    }

    private void b(xhr xhrVar, long j) {
        for (xhr xhrVar2 : this.o.a()) {
            if (xhrVar2.equals(xhrVar)) {
                LogUtil.b("Unite_CommonFileRequestManager", "saveThisTask save cut point");
                int iD = xhrVar.d() + 1;
                xhrVar.d(iD);
                xhrVar2.d(iD);
                xhrVar2.d(j);
                return;
            }
        }
    }

    private void c(int i, String str) {
        xhr xhrVar = this.o.c().get(str);
        if (xhrVar == null) {
            boolean z = this.g;
            LogUtil.e("Unite_CommonFileRequestManager", "handleRequestOver commonFileInfo is null, mIsCurrentTaskStop:", Boolean.valueOf(z), z ? "handleRequest next, task insert, requestNextTask" : "");
            if (this.g) {
                l();
                return;
            }
            return;
        }
        try {
            int i2 = 0;
            if (xhrVar.ax()) {
                String strD = xhw.d(xhrVar, 0L, 16384, xhw.b(this.f52976b, xhrVar));
                LogUtil.b("Unite_CommonFileRequestManager", "handleRequestOver hashValue end: ", strD, ", device hashValue: ", xhrVar.x());
                if (strD != null && strD.equalsIgnoreCase(xhrVar.x())) {
                    g(xhrVar);
                    e(i, 1, xhw.a(xhrVar));
                } else {
                    xhw.c(this.f52976b, xhrVar);
                    e(i, 2, xhw.a(xhrVar));
                    i2 = 1;
                }
            } else {
                g(xhrVar);
                e(i, 1, xhw.a(xhrVar));
            }
            j();
            if (xhrVar.aw()) {
                xhrVar.p().onFailure(30005, "");
            }
            xhrVar.p(i2);
        } catch (RemoteException unused) {
            LogUtil.d("Unite_CommonFileRequestManager", "handleRequestOver RemoteException");
        }
    }

    private void a(int i, xhr xhrVar) throws RemoteException, IOException {
        LogUtil.b("Unite_CommonFileRequestManager", "sendSuccessToCallBack transferResult is ", Integer.valueOf(i));
        if (i == 0) {
            if (xhrVar.p() != null) {
                String strB = xhw.b(this.f52976b, xhrVar.n(), xhrVar.m(), xhw.b(xhrVar));
                LogUtil.e("Unite_CommonFileRequestManager", "sendSuccessToCallBack path is : ", strB);
                if (strB != null) {
                    xhrVar.p().onSuccess(30000, strB, "");
                    return;
                } else {
                    LogUtil.e("Unite_CommonFileRequestManager", "sendSuccessToCallBack path is null");
                    xhrVar.p().onFailure(30007, "createFileWithByte path is null");
                    return;
                }
            }
            return;
        }
        if ((i & 1) == 1) {
            if (xhrVar.p() != null) {
                xhrVar.p().onFailure(30001, "");
                return;
            } else {
                LogUtil.e("Unite_CommonFileRequestManager", "check failed, fileRequestCallBack is null");
                return;
            }
        }
        if ((i & 2) == 2) {
            if (xhrVar.p() != null) {
                xhrVar.p().onFailure(30007, "");
                return;
            } else {
                LogUtil.e("Unite_CommonFileRequestManager", "save failed, fileRequestCallBack is null");
                return;
            }
        }
        LogUtil.e("Unite_CommonFileRequestManager", "transferResult is other status.");
    }

    private void b(String str, int i) {
        xhr xhrVar = this.o.c().get(str);
        if (xhrVar == null) {
            LogUtil.e("Unite_CommonFileRequestManager", "reportProgressForUi commonFileInfo is null");
        } else if (xhrVar.p() != null) {
            try {
                xhrVar.p().onProgress(i, "");
            } catch (RemoteException unused) {
                LogUtil.d("Unite_CommonFileRequestManager", "reportProgressForUi RemoteException");
            }
        }
    }

    private void e(int i, int i2, DeviceInfo deviceInfo) {
        c(xhu.b(b(i, i2), 44, 6), deviceInfo);
        if (cop.e()) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.m;
            lng.c("DataSyncSpeed", "5.44 transfer file size: " + this.f52975a + ", fileType: " + this.h + ", dictType: " + this.e + ", duration: " + jCurrentTimeMillis + ", transferSpeed: " + (((this.f52975a * 1.0d) / (jCurrentTimeMillis * 1024)) * 1000.0d));
        }
        n();
    }

    private void a(byte[] bArr, DeviceInfo deviceInfo) {
        h();
        String strD = cph.d(bArr);
        LogUtil.b("Unite_CommonFileRequestManager", "5.44.6 handleDeviceStatusReport:", strD);
        if (TextUtils.isEmpty(strD) || strD.length() < 4) {
            LogUtil.e("Unite_CommonFileRequestManager", "handleDeviceStatusReport dataBytes is error");
            return;
        }
        try {
            List<cqa> listB = this.l.a(strD.substring(4)).b();
            if (listB != null && listB.size() > 0) {
                int iC = 0;
                int iC2 = 0;
                for (cqa cqaVar : listB) {
                    int iC3 = cpb.c(cqaVar.b(), 16);
                    String strC = cqaVar.c();
                    if (iC3 == 1) {
                        iC = cpb.c(strC, 16);
                        LogUtil.b("Unite_CommonFileRequestManager", "handleDeviceStatusReport file_id:", Integer.valueOf(iC));
                    } else if (iC3 == 127) {
                        iC2 = cpb.c(strC, 16);
                        LogUtil.b("Unite_CommonFileRequestManager", "handleDeviceStatusReport status:", Integer.valueOf(iC2));
                    } else {
                        LogUtil.c("Unite_CommonFileRequestManager", "handleDeviceStatusReport default");
                    }
                }
                d(iC, iC2, deviceInfo);
                return;
            }
            LogUtil.e("Unite_CommonFileRequestManager", "handleDeviceStatusReport tlv list error");
        } catch (cpy unused) {
            LogUtil.d("Unite_CommonFileRequestManager", "handleDeviceStatusReport error");
        }
    }

    private void d(int i, int i2, DeviceInfo deviceInfo) {
        xhr xhrVar = this.o.c().get(xhw.d(deviceInfo.getDeviceMac(), i));
        if (xhrVar == null) {
            LogUtil.e("Unite_CommonFileRequestManager", "reportCancelResult commonFileInfo is null");
            return;
        }
        try {
            LogUtil.b("Unite_CommonFileRequestManager", i2 == 100000 ? "handleCancelReply success" : "handleCancelReply failed");
            if (i2 == 100000) {
                if (xhrVar.b() != null) {
                    xhrVar.b().onResponse(30005, "");
                    if (xhrVar.aw()) {
                        xhrVar.p().onFailure(30005, "");
                    }
                }
                b(xhrVar.v());
            } else if (xhrVar.b() != null) {
                xhrVar.b().onResponse(30006, "");
                if (xhrVar.aw()) {
                    xhrVar.p().onFailure(30006, "");
                }
            }
        } catch (RemoteException unused) {
            LogUtil.d("Unite_CommonFileRequestManager", "handleCancelReply RemoteException");
        }
        c(xhrVar);
        try {
            a(xhrVar.ap(), xhrVar);
        } catch (RemoteException | IOException unused2) {
            LogUtil.d("Unite_CommonFileRequestManager", "reportCancelResult RemoteException | IOException");
        }
    }

    private void g(xhr xhrVar) {
        if (xhrVar.av()) {
            try {
                xhrVar.d(cop.b(this.f52976b.getFilesDir().getCanonicalPath() + File.separator + "common_file_request" + File.separator + xhw.c(xhw.b(xhrVar)) + File.separator + xhrVar.n()));
            } catch (IOException unused) {
                LogUtil.d("Unite_CommonFileRequestManager", "noticeHiWearFileObtain IOException");
            }
            LogUtil.b("Unite_CommonFileRequestManager", "noticeHiWearFileObtain isDeviceReport");
            CommonFileInfoParcel commonFileInfoParcel = new CommonFileInfoParcel();
            commonFileInfoParcel.setFileName(xhrVar.n());
            commonFileInfoParcel.setFileType(xhrVar.y());
            commonFileInfoParcel.setFilePath(xhrVar.t());
            commonFileInfoParcel.setSourcePackageName(xhrVar.ag());
            commonFileInfoParcel.setSourceCertificate(xhrVar.ai());
            commonFileInfoParcel.setDestinationPackageName(xhrVar.i());
            commonFileInfoParcel.setDestinationCertificate(xhrVar.g());
            commonFileInfoParcel.setDescription(xhrVar.j());
            commonFileInfoParcel.setSha256Result(xhrVar.ah());
            try {
                xhrVar.p().onResponse(0, new Gson().toJson(commonFileInfoParcel));
            } catch (RemoteException unused2) {
                LogUtil.d("Unite_CommonFileRequestManager", "IBaseFileResponseCallback RemoteException");
            }
        }
    }

    private void b(xhr xhrVar, int i) {
        LogUtil.b("Unite_CommonFileRequestManager", "confirmDeviceFileReport,errorCode:", Integer.valueOf(i));
        c(xhu.b(d(xhrVar, i), 44, 7), xhw.a(xhrVar), xhrVar.y(), xhrVar.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        ExtendHandler extendHandler = this.f;
        if (extendHandler != null) {
            extendHandler.removeMessages(i);
        }
    }

    private void c(int i, xhr xhrVar) {
        ExtendHandler extendHandler = this.f;
        if (extendHandler != null) {
            extendHandler.removeMessages(i);
        }
    }

    private void c(int i, int i2, int i3, String str) {
        LogUtil.b("Unite_CommonFileRequestManager", "startWait handlerWhat is :", Integer.valueOf(i3));
        if (this.f != null) {
            if (i2 != 0) {
                Message messageObtain = Message.obtain();
                messageObtain.what = i3;
                messageObtain.arg1 = 100;
                this.f.sendMessage(messageObtain, ((long) i2) * 1000);
                return;
            }
            return;
        }
        this.f = HandlerCenter.b(new a(), "Unite_CommonFileRequestManager");
        if (i2 != 0) {
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = i3;
            messageObtain2.arg1 = 100;
            messageObtain2.obj = str;
            this.f.sendMessage(messageObtain2, ((long) i2) * 1000);
        }
    }

    private void a(int i, long j, int i2, int i3, String str) {
        LogUtil.b("Unite_CommonFileRequestManager", "startRetry handlerWhat is :", Integer.valueOf(i3));
        AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(Long.valueOf(j), str);
        if (this.f != null) {
            if (i2 != 0) {
                Message messageObtain = Message.obtain();
                messageObtain.what = i3;
                messageObtain.arg1 = 200;
                messageObtain.obj = simpleEntry;
                this.f.sendMessage(messageObtain, ((long) i2) * 1000);
                return;
            }
            return;
        }
        this.f = HandlerCenter.b(new a(), "Unite_CommonFileRequestManager");
        if (i2 != 0) {
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = i3;
            messageObtain2.arg1 = 200;
            messageObtain2.obj = simpleEntry;
            this.f.sendMessage(messageObtain2, ((long) i2) * 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(xhr xhrVar) {
        if (xhrVar == null) {
            LogUtil.e("Unite_CommonFileRequestManager", "handleRequestEnd error, file info is null");
            return;
        }
        ReleaseLogUtil.c("R_Unite_CommonFileRequestManager", "finish file : ", Integer.valueOf(xhrVar.y()));
        xhw.e(this.f52976b, xhrVar);
        cpm.d(xhrVar.aa());
        for (xhr xhrVar2 : this.o.a()) {
            LogUtil.b("Unite_CommonFileRequestManager", "handleRequestEnd has cache file name:", xhrVar2.n(), ", type:", Integer.valueOf(xhrVar2.y()));
            if (TextUtils.equals(xhrVar2.n(), xhrVar.n()) || TextUtils.isEmpty(xhrVar2.n())) {
                if (xhrVar2.y() == xhrVar.y()) {
                    LogUtil.b("Unite_CommonFileRequestManager", "delete commonFileInfo.name:", xhrVar2.n());
                    this.o.a().remove(xhrVar2);
                    break;
                }
            }
        }
        String strD = xhw.d(xhw.b(xhrVar), xhrVar.m());
        if (this.o.c().get(strD) != null) {
            LogUtil.b("Unite_CommonFileRequestManager", "handleRequestEnd has mTransferringFileList file id:", Integer.valueOf(xhrVar.m()));
            this.o.c().remove(strD);
        }
        if (this.o.e().get(strD) != null) {
            LogUtil.b("Unite_CommonFileRequestManager", "handleRequestEnd has mFileTypeTransferInfos file id:", Integer.valueOf(xhrVar.m()));
            this.o.e().remove(strD);
        }
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, int i) {
        xhr xhrVar = this.o.c().get(str);
        if (xhrVar == null) {
            LogUtil.e("Unite_CommonFileRequestManager", "reportFailedForUi commonFileInfo is null");
            return;
        }
        try {
            if (xhrVar.p() != null) {
                xhrVar.p().onFailure(i, "");
                LogUtil.b("Unite_CommonFileRequestManager", "reportFailedForUi fileId:", Integer.valueOf(xhw.d(str)), "errorCode:", Integer.valueOf(i));
            }
        } catch (RemoteException unused) {
            LogUtil.d("Unite_CommonFileRequestManager", "reportFailedForUi RemoteException");
        }
    }

    class a implements Handler.Callback {
        private a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.arg1;
            if (i != 100) {
                if (i == 200) {
                    xhe.this.b(message);
                    return true;
                }
                if (i == 500) {
                    LogUtil.b("Unite_CommonFileRequestManager", "kit NO_MANAGER_CALLBACK");
                    xhe.this.e(message.what);
                    return true;
                }
                if (i == 544) {
                    xhe.this.a();
                    return true;
                }
                LogUtil.c("Unite_CommonFileRequestManager", "handleMessage default");
                return false;
            }
            LogUtil.c("Unite_CommonFileRequestManager", "handleMessage wait timeout!");
            Object obj = message.obj;
            if (obj instanceof String) {
                String str = (String) obj;
                LogUtil.b("Unite_CommonFileRequestManager", "wait timeout! file id:", Integer.valueOf(xhw.d(str)));
                xhe.this.e(str, OnRegisterSkinAttrsListener.REGISTER_BY_SCAN);
                xhr xhrVar = xhe.this.o.c().get(str);
                xhw.c(xhe.this.f52976b, xhrVar);
                xhe.this.c(xhrVar);
                xhe.this.b(message.what);
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        boolean z = this.g;
        LogUtil.b("Unite_CommonFileRequestManager", "start send next, mIsCurrentTaskStop:", Boolean.valueOf(z), z ? "WAIT_MESSAGE, requestNextTask" : "");
        try {
            if (this.o.a().size() > 0) {
                xhr xhrVarRemove = this.o.a().remove(0);
                if (xhrVarRemove.p() == null) {
                    LogUtil.b("Unite_CommonFileRequestManager", "task is no callback.");
                } else {
                    lng.c("FileTransfer", "Error occurs between 5.44.4 and 5.44.5");
                    LogUtil.b("Unite_CommonFileRequestManager", "timeout error code : ", Integer.valueOf(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN));
                    xhrVarRemove.p().onFailure(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN, "");
                }
            }
        } catch (RemoteException unused) {
            LogUtil.d("Unite_CommonFileRequestManager", "disconnected RemoteException");
        } catch (ArrayIndexOutOfBoundsException unused2) {
            LogUtil.d("Unite_CommonFileRequestManager", "dataTimeout ArrayIndexOutOfBoundsException");
        }
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Message message) {
        LogUtil.c("Unite_CommonFileRequestManager", "handleMessage retry");
        Object obj = message.obj;
        if (obj instanceof AbstractMap.SimpleEntry) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) obj;
            Long l = (Long) simpleEntry.getKey();
            long jLongValue = l.longValue();
            String str = (String) simpleEntry.getValue();
            int iD = xhw.d(str);
            LogUtil.b("Unite_CommonFileRequestManager", "retry! file id:", Integer.valueOf(iD), ", offset:", l);
            xhr xhrVar = this.o.c().get(str);
            if (xhrVar == null) {
                LogUtil.e("Unite_CommonFileRequestManager", "no target info, please check log.");
                return;
            }
            xhrVar.h(xhrVar.ad() + 1);
            LogUtil.b("Unite_CommonFileRequestManager", "5.44.5 no send to app, retry count : ", Integer.valueOf(xhrVar.ad()));
            if (xhrVar.ad() == 3) {
                LogUtil.b("Unite_CommonFileRequestManager", "device no send info to app, finish this task ", Integer.valueOf(xhrVar.ad()));
                Message messageObtain = Message.obtain();
                messageObtain.arg1 = 100;
                messageObtain.obj = str;
                this.f.sendMessage(messageObtain);
                return;
            }
            e(iD, jLongValue, true, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        xhr next;
        if (cop.e()) {
            lng.c("FileTransfer", "Device replies 5.44.1 reach timeout");
        }
        Iterator<xhr> it = this.o.a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.y() != i);
        if (next == null) {
            LogUtil.e("Unite_CommonFileRequestManager", "toKitTimeoutError is null");
            return;
        }
        ITransferFileCallback iTransferFileCallbackP = next.p();
        if (iTransferFileCallbackP != null) {
            LogUtil.b("Unite_CommonFileRequestManager", "onResponse callback.");
            try {
                if (next.aw()) {
                    iTransferFileCallbackP.onFailure(100009, "5.44.1 time out");
                } else {
                    iTransferFileCallbackP.onFailure(100001, "5.44.1 time out");
                }
            } catch (RemoteException unused) {
                LogUtil.d("Unite_CommonFileRequestManager", "reportFileInfoTimeout onFailure exception.");
            }
        }
        Iterator<xhr> it2 = this.o.a().iterator();
        if (it2.hasNext()) {
            xhr next2 = it2.next();
            LogUtil.b("Unite_CommonFileRequestManager", "reportFileInfoTimeout remove item");
            this.o.a().remove(next2);
        }
        l();
    }

    private void d(int i) {
        if (this.o.a().size() <= 0 || i == 30003) {
            return;
        }
        LogUtil.b("Unite_CommonFileRequestManager", "removeCacheFile remove item");
        this.o.a().remove(0);
        l();
    }

    private void n() {
        if (this.f == null) {
            this.f = HandlerCenter.b(new a(), "Unite_CommonFileRequestManager");
            Message messageObtain = Message.obtain();
            messageObtain.what = 544;
            messageObtain.arg1 = 544;
            this.f.sendMessage(messageObtain, 10000L);
            return;
        }
        Message messageObtain2 = Message.obtain();
        messageObtain2.what = 544;
        messageObtain2.arg1 = 544;
        this.f.sendMessage(messageObtain2, 10000L);
    }

    private void h() {
        ExtendHandler extendHandler = this.f;
        if (extendHandler != null) {
            extendHandler.removeMessages(544);
        }
    }

    private void c(cmg cmgVar, DeviceInfo deviceInfo) {
        int iY;
        if (deviceInfo != null) {
            Iterator<xhr> it = this.o.a().iterator();
            String strI = "";
            if (it.hasNext()) {
                xhr next = it.next();
                iY = next.y();
                if (iY == 10) {
                    strI = next.i();
                }
            } else {
                iY = -1;
            }
            c(cmgVar, deviceInfo, iY, strI);
            return;
        }
        LogUtil.d("Unite_CommonFileRequestManager", "deviceInfo is null");
    }

    private void c(cmg cmgVar, DeviceInfo deviceInfo, int i, String str) {
        if (deviceInfo == null) {
            LogUtil.d("Unite_CommonFileRequestManager", "deviceInfo is null");
            return;
        }
        LogUtil.b("Unite_CommonFileRequestManager", "sendCommand deviceInfo mac is", cpl.a(deviceInfo.getDeviceMac()), " fileType: ", Integer.valueOf(i));
        List<Integer> list = ckl.d.get(deviceInfo.getDeviceMac());
        if (i == 10) {
            int iE = cou.a().e(deviceInfo.getDeviceMac(), 44, str);
            cmgVar.d(iE);
            LogUtil.b("Unite_CommonFileRequestManager", "5.44.1 HiWearKit file send socketChannel: ", Integer.valueOf(iE));
        }
        if (list != null && list.contains(Integer.valueOf(i))) {
            LogUtil.b("Unite_CommonFileRequestManager", "socketChannel: ", ckl.f1684c.get(deviceInfo.getDeviceMac()));
            cmgVar.d(ckl.f1684c.get(deviceInfo.getDeviceMac()).intValue());
        }
        cju.d().sendCommand(deviceInfo, cmgVar);
    }
}
