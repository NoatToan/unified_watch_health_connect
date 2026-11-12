package defpackage;

import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.haf.common.utils.PowerUtil;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.deviceconnect.callback.BtDeviceResponseCallback;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.datatypes.TransferFileInfo;
import com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.unitedevice.callback.ITransferFileCallback;
import com.huawei.unitedevice.hwcommonfilemgr.entity.RequestFileInfo;
import com.huawei.unitedevice.hwwifip2ptransfermgr.HwWifiP2pTransferManager;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class mnm implements ParserInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f41999a = new Object();
    private static mnm d;
    private int aa;
    private int as;
    private TransferFileInfo au;
    private boolean e;
    private IBaseResponseCallback h;
    private ExtendHandler s;
    private long x;
    private boolean ad = false;
    private SparseArray<ExtendHandler> ao = new SparseArray<>();
    private ExtendHandler z = null;
    private ArrayList u = null;
    private String w = null;
    private MaintenaceInterface al = null;
    private int ap = 0;
    private ArrayList<byte[]> am = new ArrayList<>(16);
    private int g = 2440;
    private int ak = 732;
    private int ab = 0;
    private int v = 0;
    private int q = 0;
    private boolean af = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f42001c = "All file:";
    private String t = "Done file:";
    private Date m = new Date();
    private int av = 5000;
    private mus an = null;
    private String k = "";
    private String p = "";
    private int l = -1;
    private int aj = 1;
    private int ax = 244;
    private int i = -1;
    private int j = 0;
    private int r = 0;
    private int aq = 0;
    private int ag = -1;
    private int ae = 1;
    private int ac = -1;
    private long y = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42000b = 0;
    private boolean ai = false;
    private boolean ah = false;
    private Map<Integer, byte[]> o = new HashMap(16);
    private BtDeviceResponseCallback f = new BtDeviceResponseCallback() { // from class: mnm.1
        @Override // com.huawei.health.deviceconnect.callback.BtDeviceResponseCallback
        public void onResponse(int i, Object obj) {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                muq muqVar = new muq();
                muqVar.c(0);
                muqVar.e(bArr);
                if (bArr.length != 8 || bArr[2] != 127) {
                    mnr.b().c(mnm.this.z, 15);
                    mnm.this.c(muqVar, 1);
                    return;
                } else {
                    cpl.d("HwFileTransferTaskManager", bArr, "mApplyWearAssetFileCallback() onResponse error: ");
                    return;
                }
            }
            lng.b();
        }
    };
    private BtDeviceResponseCallback ar = new BtDeviceResponseCallback() { // from class: mnm.2
        @Override // com.huawei.health.deviceconnect.callback.BtDeviceResponseCallback
        public void onResponse(int i, Object obj) {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                cpl.d("HwFileTransferTaskManager", bArr, "mPeriodRriFileCallBack");
                muq muqVar = new muq();
                muqVar.c(0);
                muqVar.e(bArr);
                if (bArr.length != 8 || bArr[2] != 127) {
                    mnr.b().c(mnm.this.z, 15);
                    LogUtil.a("HwFileTransferTaskManager", "mPeriodRriFileCallBack applyDataFromDeviceHandle");
                    mnm.this.c(muqVar, 1);
                    return;
                }
                cpl.d("HwFileTransferTaskManager", bArr, "mPeriodRriFileCallBack() onResponse error: ");
            }
        }
    };
    private IBaseResponseCallback n = new IBaseResponseCallback() { // from class: mnm.5
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (bArr.length < 2) {
                    ReleaseLogUtil.e("Dfx_HwFileTransferTaskManager", "onResponse(), error data, return");
                    return;
                }
                byte b2 = bArr[1];
                LogUtil.a("HwFileTransferTaskManager", "mDeviceCallbackCmd: ", Integer.valueOf(b2));
                if (b2 == 11) {
                    if (!mnm.this.af && CompileParameterUtil.d("SUPPORT_LOG_FEEDBACK")) {
                        LogUtil.a("HwFileTransferTaskManager", "The current DFX is status is idle, sending a broadcast", "request for processing the report on the board");
                        if (mnm.this.z == null) {
                            mnm.this.i(1);
                        }
                    } else {
                        LogUtil.a("HwFileTransferTaskManager", "The current DFX status is busy or not supported");
                        return;
                    }
                }
                if (b2 == 12) {
                    mnr.b().a(bArr);
                    return;
                }
                mnf.e(true);
                if (mnr.b().d(b2)) {
                    mnf.c(0);
                }
                if (mnm.this.z != null) {
                    Message messageObtain = Message.obtain();
                    messageObtain.what = b2;
                    messageObtain.obj = bArr;
                    mnm.this.z.sendMessage(messageObtain);
                }
            }
        }
    };
    private mup aw = mup.b();

    private mnm() {
        ExtendHandler extendHandlerB = HandlerCenter.b(new c(), "DFX_AND_SLEEPHwFileTransferTaskManager");
        this.s = extendHandlerB;
        this.ao.put(1, extendHandlerB);
    }

    public static mnm a() {
        mnm mnmVar;
        synchronized (f41999a) {
            if (d == null) {
                d = new mnm();
            }
            mnmVar = d;
        }
        return mnmVar;
    }

    public void d(ExtendHandler extendHandler) {
        this.ao.put(0, extendHandler);
    }

    public int s() {
        return this.ap;
    }

    public void j(int i) {
        this.ap = i;
    }

    public mup y() {
        return this.aw;
    }

    public String m() {
        return this.w;
    }

    public void d(String str) {
        this.w = str;
    }

    public int o() {
        return this.aa;
    }

    public void g(int i) {
        this.aa = i;
    }

    public ArrayList<byte[]> n() {
        return this.am;
    }

    public int e() {
        return this.g;
    }

    public void d(int i) {
        this.g = i;
    }

    public int r() {
        return this.ak;
    }

    public void f(int i) {
        this.ak = i;
    }

    public int k() {
        return this.ab;
    }

    public void b(int i) {
        this.ab = i;
    }

    public int h() {
        return this.v;
    }

    public void a(int i) {
        this.v = i;
    }

    public int j() {
        return this.q;
    }

    public void c(int i) {
        this.q = i;
    }

    public long g() {
        return this.x;
    }

    public void d(long j) {
        this.x = j;
    }

    public String c() {
        return this.f42001c;
    }

    public void a(String str) {
        this.f42001c = str;
    }

    public String i() {
        return this.t;
    }

    public void c(String str) {
        this.t = str;
    }

    public int u() {
        return this.av;
    }

    public void l(int i) {
        this.av = i;
    }

    public mus q() {
        return this.an;
    }

    public void d(mus musVar) {
        this.an = musVar;
    }

    public String f() {
        return this.k;
    }

    public int v() {
        return this.ax;
    }

    public void m(int i) {
        this.ax = i;
    }

    public int b() {
        return this.j;
    }

    public void e(int i) {
        this.j = i;
    }

    public IBaseResponseCallback d() {
        return this.h;
    }

    public TransferFileInfo t() {
        return this.au;
    }

    public int l() {
        return this.ag;
    }

    public void h(int i) {
        this.ag = i;
    }

    public void i(int i) {
        this.z = this.ao.get(i);
        ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "setStates() state is :", Integer.valueOf(i));
    }

    public void c(TransferFileInfo transferFileInfo, IBaseResponseCallback iBaseResponseCallback) {
        if (this.af) {
            ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "startMainteFile mIsMaintenance, so return");
            return;
        }
        this.h = iBaseResponseCallback;
        if (transferFileInfo == null) {
            return;
        }
        this.au = transferFileInfo;
        lrs.b(transferFileInfo);
        mnr.b().a(this.au);
        this.ac = -1;
        this.y = -1L;
        this.ai = false;
        if (this.au.getIsFromAbout() == 1) {
            this.ad = true;
        } else {
            this.ad = false;
        }
        LogUtil.a("HwFileTransferTaskManager", "mIsFromActivity:", Integer.valueOf(this.au.getIsFromAbout()));
        this.af = true;
        if (transferFileInfo.getType() == 1) {
            mnp.d().e(transferFileInfo);
        } else if (transferFileInfo.getType() == 0) {
            c(transferFileInfo);
        } else if (transferFileInfo.getType() == 2) {
            i(1);
            this.al = mjg.e();
            mke.e(this.f);
            LogUtil.a("HwFileTransferTaskManager", "request sleep transferFileInfo.getStartTime() :", Integer.valueOf(transferFileInfo.getStartTime()), " ,transferFileInfo.getEndTime() :", Integer.valueOf(transferFileInfo.getEndTime()));
            this.al.setMaintRetryResult(true);
            mnr.b().b(transferFileInfo.getStartTime(), transferFileInfo.getEndTime(), this.z);
        } else if (transferFileInfo.getType() == 4) {
            d(transferFileInfo);
        } else {
            LogUtil.a("HwFileTransferTaskManager", "request type error transferFileInfo.getType() :", Integer.valueOf(transferFileInfo.getType()));
            aa();
            ab();
            this.h.a(10001, " mType not found");
        }
        LogUtil.a("HwFileTransferTaskManager", "file modelType is:", Integer.valueOf(transferFileInfo.getType()), ";transferFile size:", Integer.valueOf(this.ab));
    }

    private void d(TransferFileInfo transferFileInfo) {
        i(1);
        mji mjiVarC = mji.c();
        this.al = mjiVarC;
        mjiVarC.setMaintRetryResult(true);
        mke.e(this.ar);
        LogUtil.a("HwFileTransferTaskManager", " request Period_rri file transferFileInfo.getStartTime() :", Integer.valueOf(transferFileInfo.getStartTime()), ",transferFileInfo.getEndTime() :", Integer.valueOf(transferFileInfo.getEndTime()));
        mnr.b().a(transferFileInfo.getStartTime(), transferFileInfo.getEndTime(), this.z);
    }

    private void c(TransferFileInfo transferFileInfo) {
        i(1);
        LogUtil.a("HwFileTransferTaskManager", "request DFX transferFileInfo.getDeviceMac() :", BTDeviceMgrUtil.c().e(transferFileInfo.getDeviceMac()), " , transferFileInfo.getDeviceVersion() :", transferFileInfo.getDeviceVersion());
        moc.e(BaseApplication.getContext(), transferFileInfo.getDeviceSn());
        mnn.a().e(System.currentTimeMillis());
        int selectedFlag = transferFileInfo.getSelectedFlag();
        ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "selectedFlag:", Integer.valueOf(selectedFlag));
        if (!CompileParameterUtil.d("RELEASE_EVENT_LOG_UPLOAD")) {
            this.aj = 0;
        } else if (selectedFlag == 1) {
            this.aj = 2;
        } else {
            this.aj = 1;
        }
        e(transferFileInfo);
        if (TextUtils.isEmpty(this.k) || TextUtils.isEmpty(this.p)) {
            b(transferFileInfo);
            return;
        }
        boolean zE = mnq.b().e(transferFileInfo);
        if (!this.k.equals(mnr.b().e("DEVICE_MACADDRESS")) || zE) {
            ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "Device mac address is different from the previous one");
            mnr.b().d(transferFileInfo, this.k);
        }
        mjj mjjVarC = mjj.c();
        this.al = mjjVarC;
        mjjVarC.initName();
        LogUtil.a("HwFileTransferTaskManager", "DFX registered callback");
        if (transferFileInfo.getDeviceType() == 32) {
            LogUtil.a("HwFileTransferTaskManager", "Device is Cassini");
            mnr.b().d(this.au, this.k);
            ab();
            if (this.h != null) {
                mjh.e(transferFileInfo, 10000, mnr.b().b(this.f42001c, this.t), this.h);
                return;
            }
            return;
        }
        mke.e(this.f);
        mnr.b().b(transferFileInfo.getDfxLogType(), this.au, this.z);
    }

    private void e(TransferFileInfo transferFileInfo) {
        this.k = transferFileInfo.getDeviceSn();
        this.p = transferFileInfo.getDeviceVersion();
        this.l = transferFileInfo.getDeviceType();
    }

    private void b(TransferFileInfo transferFileInfo) {
        ReleaseLogUtil.e("Dfx_HwFileTransferTaskManager", "Request Dfx parameter is error");
        mnr.b().d(transferFileInfo, this.k);
        ab();
        mjh.e(transferFileInfo, 10001, "parameter is error", this.h);
    }

    private void a(ArrayList arrayList) {
        String str;
        try {
            this.u = arrayList;
            if (arrayList == null) {
                if (this.h != null) {
                    ab();
                    this.al.cutFolder(mjj.e, mjj.f41752c);
                    MaintenaceInterface maintenaceInterface = this.al;
                    if (maintenaceInterface instanceof mjg) {
                        maintenaceInterface.setMaintRetryResult(true);
                    }
                    mjh.e(this.au, 10001, "error fileList is null", this.h);
                    return;
                }
                return;
            }
            this.as = arrayList.size();
            ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "getMaintenanceSleepOrDfxFileNameHandle CommonUtil.isReleaseVersion() = " + CommonUtil.bu());
            if (ar()) {
                DeviceInfo deviceInfoC = mnn.a().c(this.k);
                if (deviceInfoC == null) {
                    ReleaseLogUtil.a("Dfx_HwFileTransferTaskManager", "getMaintenanceSleepOrDfxFileNameHandle deviceInfo is null");
                } else if (eey.d(deviceInfoC, 217) && muy.c(deviceInfoC.getDeviceIdentify())) {
                    ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "getMaintenanceSleepOrDfxFileNameHandle mTransferFileInfo.getTaskType() = " + this.au.getTaskType());
                    if (this.u.size() == 0) {
                        ReleaseLogUtil.a("Dfx_HwFileTransferTaskManager", "getMaintenanceSleepOrDfxFileNameHandle fileList() is 0");
                        ab();
                        if (this.h == null) {
                            ReleaseLogUtil.a("Dfx_HwFileTransferTaskManager", "getMaintenanceSleepOrDfxFileNameHandle mCallback == null");
                            return;
                        } else {
                            this.al.cutFolder(mjj.e, mjh.f41743c);
                            mjh.e(this.au, 10000, mnr.b().b(this.f42001c, this.t), this.h);
                            return;
                        }
                    }
                    if (!(this.u.get(0) instanceof String)) {
                        str = "";
                    } else {
                        str = (String) this.u.get(0);
                    }
                    d(this.u, str);
                    return;
                }
            }
            ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "mLogLevel", Integer.valueOf(this.aj));
            aw();
            mnq.b().a(this.u, this.au);
            String str2 = this.f42001c + this.u;
            this.f42001c = str2;
            ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "getMaintenanceSleepOrDfxFileNameHandle mAllFileListName:", str2);
            if (this.u.size() == 0) {
                ReleaseLogUtil.a("Dfx_HwFileTransferTaskManager", "getMaintenanceSleepOrDfxFileNameHandle fileList() is 0");
                ab();
                mnr.b().d(this.au, this.k);
                if (this.h != null) {
                    this.al.cutFolder(mjj.e, mjj.f41752c);
                    mjh.e(this.au, 10000, mnr.b().b(this.f42001c, this.t), this.h);
                    return;
                }
                return;
            }
            TransferFileInfo transferFileInfo = this.au;
            if (transferFileInfo != null) {
                this.al.initMaintenanceParame(transferFileInfo);
            }
            mnr.b().c(this.al, this.z);
        } catch (Exception unused) {
            ReleaseLogUtil.a("Dfx_HwFileTransferTaskManager", "getMaintenanceSleepOrDfxFileNameHandle Exception");
        }
    }

    private boolean ar() {
        if (CommonUtil.bu() || this.au.getType() != 0) {
            return false;
        }
        if (this.au.getTaskType() != 0 && this.au.getTaskType() != 1) {
            return false;
        }
        xjt.r("HwFileTransferTaskManager, isDfxNeedWifiP2p");
        return true;
    }

    private void aw() {
        DeviceInfo deviceInfoC = mnn.a().c(this.k);
        if (deviceInfoC == null) {
            ReleaseLogUtil.e("Dfx_HwFileTransferTaskManager", "LogTrustlistFiltering deviceInfo is null");
            int i = this.aj;
            if (i != 0) {
                this.u = this.al.filtertFile(this.u, i);
                return;
            }
            return;
        }
        if (!eey.d(deviceInfoC, 129)) {
            ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "logTrustListFiltering device not support log trust list");
            int i2 = this.aj;
            if (i2 != 0) {
                this.u = this.al.filtertFile(this.u, i2);
            }
        } else {
            ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "logTrustListFiltering device support log trust list");
        }
        ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "getMaintenanceSleepOrDfxFileNameHandle mFileSleepOrDfxList:", this.u);
    }

    private void c(mus musVar) {
        if (musVar != null) {
            try {
                this.an = musVar;
                this.av = musVar.a();
                this.ax = this.an.d();
                if (this.al instanceof mjj) {
                    TransferFileInfo transferFileInfo = this.au;
                    if (transferFileInfo != null && transferFileInfo.getDeviceType() >= 34) {
                        this.ak = this.an.e();
                    }
                    this.g = this.ak;
                } else {
                    this.ak = this.an.e();
                }
                String strC = this.an.c();
                String strLineSeparator = System.lineSeparator();
                int i = this.ax;
                String strLineSeparator2 = System.lineSeparator();
                int i2 = this.ak;
                ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "getMaintenanceSleepOrDfxParametersHandle() ok, protocalVersion :", strC, strLineSeparator, "mTransferUnitSize:", Integer.valueOf(i), strLineSeparator2, "mMaxApplyDataSize:", Integer.valueOf(i2), System.lineSeparator(), "mWaitTimeout:", Integer.valueOf(this.av), System.lineSeparator(), "breakPointEnable:", Boolean.valueOf(this.an.b()));
            } catch (Exception unused) {
                ReleaseLogUtil.a("Dfx_HwFileTransferTaskManager", "getMaintenanceSleepOrDfxParametersHandle Exception");
                ab();
                if (this.h != null) {
                    this.al.cutFolder(mjj.e, mjj.f41752c);
                    mjh.e(this.au, 10000, mnr.b().b(this.f42001c, this.t), this.h);
                    return;
                }
                return;
            }
        }
        if (this.z != null) {
            this.al.deleteTenDayFile();
            this.z.sendEmptyMessage(14);
        }
    }

    private void b(String str) {
        ExtendHandler extendHandler = this.z;
        if (extendHandler != null) {
            extendHandler.removeMessages(15);
            this.z.sendEmptyMessage(15, 30000L);
        }
        w();
        this.j = 0;
        if (this.au.getType() == 0) {
            mnr.b().a(str, this.k);
        } else {
            mnr.b().a(str, "");
        }
    }

    private void e(mut mutVar) {
        if (mutVar != null) {
            try {
                this.ab = (int) mutVar.c();
                this.x = mutVar.b();
                this.ac = mutVar.a();
                this.y = mutVar.e();
                this.f42000b = mutVar.d();
            } catch (ClassCastException unused) {
                ReleaseLogUtil.a("Dfx_HwFileTransferTaskManager", "querySleepOrDfxFileInformationHandle ClassCastException");
                return;
            }
        }
        this.ai = false;
        ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "querySleepOrDfxFileInformationHandle() ok, mFileTotalSize:", Integer.valueOf(this.ab));
        LogUtil.a("HwFileTransferTaskManager", "querySleepOrDfxFileInformationHandle() ok, mFileCrc = ", Long.valueOf(this.x));
        int i = this.ac;
        if (i != -1 || this.y != -1) {
            this.ai = true;
            LogUtil.a("HwFileTransferTaskManager", "querySleepOrDfxFileInformationHandle ok, mFileTransferType:", Integer.valueOf(i), ", mFileCreateTime:", Long.valueOf(this.y));
        } else {
            mnr.b().e(this.au);
        }
        if (this.ab == 0) {
            aj();
        } else {
            ak();
        }
    }

    private void aj() {
        ArrayList arrayList = this.u;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.u.remove(0);
            if (aq()) {
                mnr.b().d(this.u);
            }
        }
        ExtendHandler extendHandler = this.z;
        if (extendHandler != null) {
            extendHandler.sendEmptyMessage(14);
        }
    }

    private void ak() {
        int i;
        if ((this.al instanceof mjj) && this.l != 10) {
            this.e = false;
            at();
            if (this.h != null && (i = this.ab) != 0 && this.r <= i) {
                ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "dfx progress mCallback is not null. WearhomeActivity: ", Integer.valueOf(this.as), " is ", this.u);
                this.h.a(20001, "0&" + this.w + Constants.LEFT_BRACKET_ONLY + ((this.as - this.u.size()) + 1) + "/" + this.as + Constants.RIGHT_BRACKET_ONLY);
            }
            if (this.e) {
                ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "fileContent is return dump file");
                return;
            }
        }
        if (mnr.b().a(this.ai, this.au, this.y, this.ac)) {
            ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "dfx progress TRANSMITTED_SIZE mDoneTotalSize = ", mnr.b().e("TRANSMITTED_SIZE"));
            this.v = CommonUtil.n(BaseApplication.getContext(), mnr.b().e("TRANSMITTED_SIZE"));
        }
        this.m = new Date();
        p();
    }

    private void b(String str, int i, int i2) {
        this.ag = 1;
        if (aq() && mnf.i()) {
            ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "5.10.4 DFX 4mins Timer is arrived");
            ab();
            mnf.d(mnf.a(), mnf.c());
            au();
            return;
        }
        if (lrs.a() != null && lrs.a().getSuspend() == 1) {
            this.au.setSuspend(1);
            LogUtil.a("HwFileTransferTaskManager", "5.10.4 DFX Tasks are interrupted, and the higher priority is ", Integer.valueOf(this.au.getType()));
            ab();
            if (this.h != null) {
                bb();
                return;
            } else {
                ReleaseLogUtil.a("Dfx_HwFileTransferTaskManager", "IBaseResponseCallback is null");
                return;
            }
        }
        d(str, i, i2);
    }

    private void au() {
        this.al.save2File(new IBaseResponseCallback() { // from class: mnm.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (mnm.this.x()) {
                    mnr.b().d("IS_CONTINUE", "true");
                } else {
                    mnr.b().d("IS_CONTINUE", "false");
                }
                mnm.this.al.cutFolder(mjj.e, mjj.f41752c);
                mjh.e(mnm.this.au, 10000, mnr.b().b(mnm.this.f42001c, mnm.this.t), mnm.this.h);
            }
        }, true);
    }

    private void d(String str, int i, int i2) {
        ExtendHandler extendHandler = this.z;
        if (extendHandler != null) {
            extendHandler.removeMessages(7);
            this.z.sendEmptyMessage(7, this.av);
        }
        this.aq = i;
        if (this.au.getType() == 0) {
            mnr.b().c(str, i, i2, this.an, this.k);
        } else {
            mnr.b().c(str, i, i2, this.an, "");
        }
    }

    private void bb() {
        MaintenaceInterface maintenaceInterface = this.al;
        if (maintenaceInterface instanceof mjj) {
            ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "Tasks are interrupted,the higher is", Integer.valueOf(this.au.getTaskType()));
            this.al.save2File(new IBaseResponseCallback() { // from class: mnm.7
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    mnf.d(mnf.a(), mnf.c());
                    mnr.b().e(mnm.this.au, mnm.this.ac);
                    mnm.this.al.cutFolder(mjj.e, mjj.f41752c);
                    if (mnm.this.z != null) {
                        mnm.this.z.postTask(new Runnable() { // from class: mnm.7.5
                            @Override // java.lang.Runnable
                            public void run() {
                                LogUtil.a("HwFileTransferTaskManager", "taskInterrupt callback ERROR_CODE_NUMBER_SUSPEND_ERROR");
                                mnm.this.h.a(104003, mnr.b().b(mnm.this.f42001c, mnm.this.t));
                            }
                        }, 2000L);
                    } else {
                        LogUtil.a("HwFileTransferTaskManager", "taskInterrupt mHandler is null");
                    }
                }
            }, true);
            return;
        }
        maintenaceInterface.cutFolder(mjj.e, mjj.f41752c);
        MaintenaceInterface maintenaceInterface2 = this.al;
        if (maintenaceInterface2 instanceof mjg) {
            maintenaceInterface2.setMaintRetryResult(true);
        }
        this.h.a(104003, mnr.b().b(this.f42001c, this.t));
    }

    private void b(int[] iArr) {
        if (iArr != null) {
            try {
                int i = this.aq;
                int i2 = iArr.length > 0 ? iArr[0] : -1;
                int i3 = iArr.length > 1 ? iArr[1] : i;
                if (this.al instanceof mjj) {
                    i3 = i;
                }
                ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "applySleepOrDfxDataHandle objectData[0]:", Integer.valueOf(i2), "objectData[1]:", Integer.valueOf(i3), " mRequestApplyOffset:", Integer.valueOf(i));
                if (i2 == 100000) {
                    k(i3);
                    return;
                }
                ab();
                if (this.h != null) {
                    o(i2);
                }
            } catch (ClassCastException unused) {
                ReleaseLogUtil.a("Dfx_HwFileTransferTaskManager", "applySleepOrDfxDataHandle errorCodeHandle ClassCastException");
            }
        }
    }

    private void k(int i) {
        if (i == this.aq) {
            this.i = 0;
            this.o.clear();
            this.q = 0;
            this.r = this.v;
            this.am.clear();
            ExtendHandler extendHandler = this.z;
            if (extendHandler != null) {
                extendHandler.removeMessages(15);
                this.z.removeMessages(7);
                this.z.sendEmptyMessage(7, this.av);
                return;
            }
            return;
        }
        ReleaseLogUtil.a("Dfx_HwFileTransferTaskManager", "responseApplyOffset is inequal throw error package");
    }

    private void o(int i) {
        MaintenaceInterface maintenaceInterface = this.al;
        if (maintenaceInterface instanceof mjj) {
            mnr.b().b(i, this.h, this.al, this.au, this.ac);
            return;
        }
        maintenaceInterface.cutFolder(mjj.e, mjj.f41752c);
        MaintenaceInterface maintenaceInterface2 = this.al;
        if (maintenaceInterface2 instanceof mjg) {
            maintenaceInterface2.setMaintRetryResult(true);
        }
        this.h.a(10002, mnr.b().b(this.f42001c, this.t));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(muq muqVar, int i) {
        if (muqVar != null) {
            try {
                if (i != 1) {
                    mnp.d().b(i, muqVar);
                } else {
                    d(muqVar);
                }
            } catch (Exception unused) {
                aa();
                if (this.h != null) {
                    mjh.e(this.au, 10002, mnr.b().b(this.f42001c, this.t), this.h);
                }
                ReleaseLogUtil.a("Dfx_HwFileTransferTaskManager", "applyDataFromDeviceHandle Exception");
            }
        }
    }

    private void d(mur murVar) {
        if (murVar != null) {
            try {
                if (!mny.a().b(murVar)) {
                    ReleaseLogUtil.e("Dfx_HwFileTransferTaskManager", "maintenanceLog is null");
                } else {
                    a(murVar);
                }
            } catch (Exception unused) {
                ReleaseLogUtil.a("Dfx_HwFileTransferTaskManager", "queryOtaAllowHandle Exception");
            }
        }
    }

    private void av() {
        ExtendHandler extendHandler = this.z;
        if (extendHandler != null) {
            extendHandler.removeMessages(15);
            this.z.sendEmptyMessage(15, 30000L);
        }
        if (this.au.getType() == 0) {
            mnr.b().b(this.k);
        }
    }

    private void a(mur murVar) {
        int iD = murVar.d();
        if (iD == this.i) {
            byte[] bArrC = murVar.c();
            this.q += bArrC.length;
            this.am.add(bArrC);
            this.r += bArrC.length;
            this.i++;
            as();
        } else {
            this.o.put(Integer.valueOf(iD), murVar.c());
            ReleaseLogUtil.e("Dfx_HwFileTransferTaskManager", "addSleepOrDfxPlayDataToList() lost index = ", Integer.valueOf(iD));
        }
        LogUtil.a("HwFileTransferTaskManager", "sleepDfxData = ", Integer.valueOf(this.g), ", doneSize = ", Integer.valueOf(this.q), ", frameNum = ", Integer.valueOf(this.i), ", index = ", Integer.valueOf(iD));
        if (this.g == this.q) {
            this.ap = 0;
            this.q = 0;
            ExtendHandler extendHandler = this.z;
            if (extendHandler != null) {
                extendHandler.removeMessages(7);
                this.v = this.r;
                MaintenaceInterface maintenaceInterface = this.al;
                if (maintenaceInterface != null) {
                    maintenaceInterface.writeLogToFile(this.am, this.w, this.m);
                }
                this.am.clear();
                int i = this.ab;
                if (i <= 0) {
                    ReleaseLogUtil.a("Dfx_HwFileTransferTaskManager", "addSleepOrDfxPlayDataToList() lost package error");
                    ab();
                    mnr.b().a(this.h, this.al, this.au, this.ac);
                    return;
                }
                ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "addSleepOrDfxPlayDataToList() send ok mDoneTotalSize:", Integer.valueOf(this.v), ",mFileTotalSize = ", Integer.valueOf(i), ",file name = ", this.w);
                az();
                if (this.v >= this.ab) {
                    al();
                } else {
                    an();
                }
            }
        }
    }

    private void az() {
        int i;
        mnr.b().d(this.w, this.h, this.ab, this.v, this.r);
        if (!(this.al instanceof mjj) || this.h == null || (i = this.ab) == 0 || this.r > i) {
            return;
        }
        ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "dfx progress mCallback is not null");
        long j = (((long) this.v) * ((long) 100)) / ((long) this.ab);
        this.h.a(20001, j + "&" + this.w + Constants.LEFT_BRACKET_ONLY + ((this.as - this.u.size()) + 1) + "/" + this.as + Constants.RIGHT_BRACKET_ONLY);
    }

    private void al() {
        this.t += this.w + ",";
        ArrayList arrayList = this.u;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.u.remove(0);
            if (aq()) {
                mnr.b().b(this.u);
            }
        }
        mnr.b().b(this.al, this.z, this.au, this.ac);
    }

    private void an() {
        if (this.al instanceof mjj) {
            ExtendHandler extendHandler = this.z;
            if (extendHandler != null) {
                extendHandler.removeMessages(13);
                this.z.sendEmptyMessage(13, 30000L);
            }
            this.al.save2File(new IBaseResponseCallback() { // from class: mnm.9
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("HwFileTransferTaskManager", "onResponse fileTransfer: ", Integer.valueOf(i));
                    if (mnm.this.z != null) {
                        mnm.this.z.removeMessages(13);
                        if (i == 10001) {
                            mnm.this.z.sendEmptyMessage(12);
                            return;
                        }
                    }
                    if (mnm.this.x()) {
                        mnr.b().d("IS_CONTINUE", "true");
                        mnr.b().d("TRANSMITTED_SIZE", String.valueOf(mnm.this.v));
                    }
                    mnm.this.p();
                }
            }, false);
            return;
        }
        p();
    }

    private void d(muq muqVar) {
        int iB = muqVar.b();
        if (iB == this.j) {
            byte[] bArrA = muqVar.a();
            if (bArrA != null) {
                this.q += bArrA.length;
                this.aa = 0;
                LogUtil.a("HwFileTransferTaskManager", "addSleepDataFromAndroidWear() mFileType:", 0, "valueByte.length:", Integer.valueOf(bArrA.length));
                if (this.aa != 1) {
                    this.am.add(bArrA);
                } else {
                    try {
                        this.am.add(eeq.e(bArrA).getBytes("UTF-8"));
                    } catch (UnsupportedEncodingException unused) {
                        ReleaseLogUtil.a("Dfx_HwFileTransferTaskManager", "addSleepDataFromAndroidWear exception is UnsupportedEncodingException");
                    }
                }
                this.v += bArrA.length;
            } else {
                LogUtil.j("HwFileTransferTaskManager", "addSleepDataFromAndroidWear() byteData is null");
            }
            this.j++;
        } else {
            LogUtil.a("HwFileTransferTaskManager", "addSleepDataFromAndroidWear() lost index", Integer.valueOf(iB));
        }
        LogUtil.a("HwFileTransferTaskManager", "mCurrentApplyDataSize:", Integer.valueOf(this.g), ",mDonePackageSize:", Integer.valueOf(this.q), ",mCurrentSleepOrDfxFrameNum:", Integer.valueOf(this.i), ",index:", Integer.valueOf(iB));
        if (this.v >= this.ab) {
            this.ap = 0;
            this.q = 0;
            if (this.z != null) {
                ac();
            }
        }
    }

    private void ac() {
        this.z.removeMessages(7);
        MaintenaceInterface maintenaceInterface = this.al;
        if (maintenaceInterface != null) {
            maintenaceInterface.writeLogToFile(this.am, this.w, this.m);
        }
        this.am.clear();
        int i = this.ab;
        if (i <= 0) {
            LogUtil.j("HwFileTransferTaskManager", "addSleepDataFromAndroidWear() lost package error");
            ab();
            mnr.b().c(this.h, this.al);
        } else {
            if (this.v >= i) {
                ao();
                mnr.b().b(this.ag, this.z);
                return;
            }
            MaintenaceInterface maintenaceInterface2 = this.al;
            if (maintenaceInterface2 instanceof mjj) {
                maintenaceInterface2.save2File(new IBaseResponseCallback() { // from class: mnm.8
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i2, Object obj) {
                        mnm.this.p();
                    }
                }, false);
            } else {
                p();
            }
        }
    }

    private void ao() {
        this.t += this.w + ",";
        ArrayList arrayList = this.u;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.u.remove(0);
        }
        mnr.b().b(this.al, this.z);
    }

    public void p() {
        int i = this.ab - this.v;
        String strC = this.an.c();
        ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "Enter getSleepOrDFXApplyDataFromDevice spareSize = ", Integer.valueOf(i), ",mCurrentApplyDataSize = ", Integer.valueOf(this.g), ",mMaxApplyDataSize : ", Integer.valueOf(this.ak), ",version : ", strC);
        boolean z = strC != null && strC.contains("AW");
        if (i <= this.g || z) {
            this.g = i;
            ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "requeset final package mCurrentApplyDataSize:", Integer.valueOf(i));
            b(this.w, this.v, this.g);
        } else {
            int i2 = this.ak;
            this.g = i2;
            b(this.w, this.v, i2);
        }
    }

    private void c(int[] iArr) {
        if (iArr != null) {
            try {
                if (iArr.length > 0 && iArr[0] != 100000) {
                    ab();
                    if (this.h != null) {
                        mnr.b().a(iArr, this.h, this.al, this.au, this.ac);
                    }
                }
            } catch (Exception unused) {
                ReleaseLogUtil.a("Dfx_HwFileTransferTaskManager", "errorCodeHandle Exception");
            }
        }
    }

    public void w() {
        this.g = this.ak;
        this.ab = 0;
        this.v = 0;
        this.r = 0;
        this.aq = 0;
        this.q = 0;
        this.x = 0L;
        this.am.clear();
    }

    public void aa() {
        LogUtil.a("HwFileTransferTaskManager", "enter resetMaintenance()");
        w();
        this.j = 0;
        this.af = false;
        this.ap = 0;
        this.f42001c = "All file:";
        this.t = "Done file:";
        mke.e((BtDeviceResponseCallback) null);
        this.av = 5000;
        this.ak = 732;
        this.ax = 244;
    }

    public void ab() {
        LogUtil.a("HwFileTransferTaskManager", "enter resetSleepOrDfxMaintenance()");
        this.ad = false;
        this.k = "";
        ay();
        mke.e((BtDeviceResponseCallback) null);
    }

    public void ad() {
        LogUtil.a("HwFileTransferTaskManager", "enter resetDfxMaintenance()");
        ay();
    }

    @Override // com.huawei.hwdevice.phoneprocess.binder.ParserInterface
    public void getResult(DeviceInfo deviceInfo, byte[] bArr) {
        if (deviceInfo == null) {
            LogUtil.j("HwFileTransferTaskManager", "getResult deviceInfo is null");
            this.n.a(-1, bArr);
        } else if (eel.d(deviceInfo.getProductType())) {
            moe.a().b(bArr);
        } else {
            this.n.a(0, bArr);
        }
    }

    private void as() {
        if (this.o.size() <= 0 || this.o.get(Integer.valueOf(this.i)) == null) {
            return;
        }
        byte[] bArr = this.o.get(Integer.valueOf(this.i));
        this.q += bArr.length;
        this.am.add(bArr);
        this.r += bArr.length;
        this.i++;
        as();
    }

    private void ay() {
        w();
        ExtendHandler extendHandler = this.z;
        if (extendHandler != null) {
            extendHandler.removeMessages(15);
            this.z.removeMessages(7);
        }
        this.i = -1;
        this.o.clear();
        this.af = false;
        this.ap = 0;
        this.f42001c = "All file:";
        this.t = "Done file:";
        this.av = 5000;
        this.ak = 732;
        this.ax = 244;
        this.ah = false;
    }

    class c implements Handler.Callback {
        private c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 9) {
                if (message.what != 4 && message.what != 5) {
                    ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "DfxAndSleepHandle handleMessage msg: ", Integer.valueOf(message.what));
                } else {
                    LogUtil.a("HwFileTransferTaskManager", "DfxAndSleepHandle handleMessage msg: ", Integer.valueOf(message.what));
                }
            }
            try {
                return d(message);
            } catch (ClassCastException unused) {
                ReleaseLogUtil.a("Dfx_HwFileTransferTaskManager", "DfxAndSleepHandle ClassCastException");
                return true;
            } catch (NumberFormatException unused2) {
                ReleaseLogUtil.a("Dfx_HwFileTransferTaskManager", "DfxAndSleepHandle NumberFormatException");
                return true;
            } catch (Exception unused3) {
                ReleaseLogUtil.a("Dfx_HwFileTransferTaskManager", "DfxAndSleepHandle Exception");
                return true;
            }
        }

        private boolean d(Message message) {
            if (message == null) {
                return false;
            }
            int i = message.what;
            if (i == 1) {
                mnm.this.c(message);
                return true;
            }
            if (i == 2) {
                mnm.this.b(message);
                return true;
            }
            if (i == 3) {
                mnm.this.i(message);
                return true;
            }
            if (i == 4) {
                mnm.this.a(message);
                return true;
            }
            if (i == 5) {
                mnm.this.f(message);
                return true;
            }
            if (i == 7) {
                mnm.this.ae();
                return true;
            }
            if (i != 127) {
                switch (i) {
                    case 10:
                        mnm.this.h(message);
                        return true;
                    case 11:
                        mnm.this.d(message);
                        return true;
                    case 12:
                    case 13:
                        mnm.this.af();
                        return true;
                    case 14:
                        mnm.this.ag();
                        return true;
                    case 15:
                        mnm.this.ai();
                        return true;
                    default:
                        LogUtil.j("HwFileTransferTaskManager", "DfxAndSleepHandle is default");
                        return false;
                }
            }
            mnm.this.e(message);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void af() {
        ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "save log error");
        ab();
        IBaseResponseCallback iBaseResponseCallback = this.h;
        if (iBaseResponseCallback != null) {
            mjh.e(this.au, 10001, "save log error", iBaseResponseCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ag() {
        mja.b();
        ArrayList arrayList = this.u;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (this.u.get(0) instanceof String) {
                this.w = (String) this.u.get(0);
            }
            if (mnr.b().b(this.au)) {
                mnr.b().d("CONTINUE_LOG_NAME", this.w);
            }
            ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "start querySleepOrDfxFileInformation mFileName:", this.w);
            this.i = -1;
            this.o.clear();
            b(this.w);
            return;
        }
        if (CommonUtil.ap() && ap()) {
            LogUtil.a("HwFileTransferTaskManager", "start query raw file info info");
            this.ah = true;
            av();
        } else {
            ab();
            mnr.b().c(this.au, this.h, this.al);
        }
    }

    private boolean ap() {
        LogUtil.a("HwFileTransferTaskManager", "raw file mIsRawFileHandled is : ", Boolean.valueOf(this.ah));
        if (this.ah) {
            return false;
        }
        Object systemService = BaseApplication.getContext().getApplicationContext().getSystemService("wifi");
        if (!(systemService instanceof WifiManager)) {
            LogUtil.a("HwFileTransferTaskManager", "raw file get wifiManager fail");
            return false;
        }
        if (!((WifiManager) systemService).isWifiEnabled()) {
            LogUtil.a("HwFileTransferTaskManager", "raw file wifi is disabled");
            return false;
        }
        boolean zD = eey.d(mnn.a().c(this.k), 153);
        LogUtil.a("HwFileTransferTaskManager", "raw file isSuppoerRawFileTransfer is : ", Boolean.valueOf(zD));
        if (!zD) {
            return false;
        }
        if (HwWifiP2pTransferManager.a().i() != null) {
            LogUtil.a("HwFileTransferTaskManager", "raw file transfer channel conflict");
            return false;
        }
        boolean z = this.au.getType() == 0 && this.au.getTaskType() == 0;
        LogUtil.a("HwFileTransferTaskManager", "raw file isLogFeedBack is : ", Boolean.valueOf(z));
        if (!z) {
            return false;
        }
        boolean zC = PowerUtil.c(BaseApplication.getContext());
        LogUtil.a("HwFileTransferTaskManager", "raw file isCharged is : ", Boolean.valueOf(zC));
        boolean zBg = CommonUtil.bg();
        LogUtil.a("HwFileTransferTaskManager", "raw file is3rdSystem is : ", Boolean.valueOf(!zBg));
        return zC || !zBg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ae() {
        int i = this.ap + 1;
        this.ap = i;
        if (i == 3) {
            ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "More than three failures and mReTransferTime = 3");
            ab();
            if (this.h == null) {
                ReleaseLogUtil.a("Dfx_HwFileTransferTaskManager", "maintenanceCallback is null");
            } else {
                ah();
            }
            ExtendHandler extendHandler = this.z;
            if (extendHandler != null) {
                extendHandler.removeMessages(7);
                return;
            }
            return;
        }
        if (this.z != null) {
            ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "lost packet and resend");
            p();
        }
    }

    private void ah() {
        if (this.al instanceof mjj) {
            ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "More than three failures and save the collected log locally");
            am();
        } else {
            mnr.b().a(this.h, this.al, this.f42001c, this.t);
        }
    }

    private void am() {
        this.al.save2File(new IBaseResponseCallback() { // from class: mnm.10
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (mnm.this.x()) {
                    mnr.b().d("IS_CONTINUE", "true");
                    mnf.d(mnf.a(), mnf.c());
                }
                mnm.this.al.cutFolder(mjj.e, mjj.f41752c);
                mjh.e(mnm.this.au, 10002, mnr.b().b(mnm.this.f42001c, mnm.this.t), mnm.this.h);
            }
        }, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ai() {
        ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "data transfer time out");
        if (this.ah) {
            ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "raw file transfer time out");
            this.z.sendEmptyMessage(14);
            return;
        }
        ab();
        if (this.h != null) {
            if (this.al instanceof mjj) {
                ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "Dfx command upload timeout and save the collected log locally");
                mnr.b().b(this.h, this.al, this.au, this.ac);
                return;
            } else {
                mnr.b().b(this.h, this.al);
                return;
            }
        }
        LogUtil.a("HwFileTransferTaskManager", "maintenanceCallback is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Message message) {
        ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "dfxOrSleepGetFileName 5.10.1 received");
        mnr.b().c(this.z, 15);
        try {
            if (message.obj instanceof byte[]) {
                byte[] bArr = (byte[]) message.obj;
                if (bArr.length == 8 && bArr[2] == 127) {
                    if (mnr.b().b(bArr)) {
                        z();
                        return;
                    } else {
                        ab();
                        mnr.b().c(bArr, this.h, this.al);
                        return;
                    }
                }
                if (message.obj instanceof byte[]) {
                    a(this.aw.b((byte[]) message.obj));
                }
            }
        } catch (eeu unused) {
            ReleaseLogUtil.a("Dfx_HwFileTransferTaskManager", "GpsHandle dfxOrSleepGetFileName() TlvException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(Message message) {
        ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "rawGetFileName 5.10.10 received");
        mnr.b().c(this.z, 15);
        try {
            if (message.obj instanceof byte[]) {
                byte[] bArr = (byte[]) message.obj;
                int i = 0;
                if (bArr.length == 8 && bArr[2] == 127) {
                    LogUtil.a("HwFileTransferTaskManager", "raw file name get error, reenter normal handler");
                    this.z.sendEmptyMessage(14);
                    return;
                }
                ArrayList arrayListB = this.aw.b(bArr);
                LogUtil.a("HwFileTransferTaskManager", "raw file size is " + arrayListB.size());
                LogUtil.a("HwFileTransferTaskManager", "raw file name is " + String.join(";", arrayListB));
                if (arrayListB.isEmpty()) {
                    LogUtil.a("HwFileTransferTaskManager", "not exist raw file, reenter normal control");
                    this.z.sendEmptyMessage(14);
                    return;
                }
                String string = arrayListB.get(0).toString();
                if (string.isEmpty()) {
                    LogUtil.a("HwFileTransferTaskManager", "initFileName is Empty, reenter normal control");
                    this.z.sendEmptyMessage(14);
                    return;
                }
                this.h.a(20001, String.format(Locale.ENGLISH, "0&%s(1%s%d)", string, File.separator, Integer.valueOf(arrayListB.size())));
                while (i < arrayListB.size()) {
                    String string2 = arrayListB.get(i).toString();
                    i++;
                    RequestFileInfo requestFileInfo = new RequestFileInfo();
                    requestFileInfo.setFileName(string2);
                    mjj.c(string2);
                    requestFileInfo.setSavePath(mjj.c().a());
                    requestFileInfo.setFileType(125);
                    requestFileInfo.setDeviceMac(this.k);
                    d(requestFileInfo, e(arrayListB, string2, Integer.valueOf(i)));
                }
            }
        } catch (eeu unused) {
            ReleaseLogUtil.a("Dfx_HwFileTransferTaskManager", "rawGetFileName TlvException");
        }
    }

    private void d(ArrayList arrayList, String str) {
        this.h.a(20001, String.format(Locale.ENGLISH, "0&%s(1%s%d)", str, File.separator, Integer.valueOf(arrayList.size())));
        int i = 0;
        while (i < arrayList.size()) {
            String string = arrayList.get(i).toString();
            i++;
            RequestFileInfo requestFileInfo = new RequestFileInfo();
            requestFileInfo.setFileName(string);
            mjj.c(string);
            String str2 = mjj.e + "/" + string;
            LogUtil.e("HwFileTransferTaskManager", "targetFilePath isExist = " + new File(str2).exists());
            LogUtil.e("HwFileTransferTaskManager", "targetFilePath isExist final = " + new File(str2).exists());
            LogUtil.e("HwFileTransferTaskManager", "targetFilePath = " + str2);
            requestFileInfo.setSavePath(str2);
            requestFileInfo.setFileType(125);
            requestFileInfo.setDeviceMac(this.k);
            d(requestFileInfo, a(arrayList, string, Integer.valueOf(i)));
        }
    }

    private ITransferFileCallback a(final ArrayList arrayList, final String str, final Integer num) {
        return new ITransferFileCallback.Stub() { // from class: mnm.6
            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onProgress(int i, String str2) throws RemoteException {
                LogUtil.a("HwFileTransferTaskManager", "wifi file onProgress percentage: ", Integer.valueOf(i), ", progressDesc = ", str2, ", currentFileName = ", str);
                mnm.this.h.a(20001, String.format(Locale.ENGLISH, "%d&%s(%d/%d)", Integer.valueOf(i), arrayList.get(num.intValue() - 1).toString(), num, Integer.valueOf(arrayList.size())));
            }

            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onFailure(int i, String str2) throws RemoteException {
                ReleaseLogUtil.a("HwFileTransferTaskManager", "wifi file onTransferFailed errorCode = ", Integer.valueOf(i), ", errMsg = ", str2, ", currentFileName = ", str);
                String str3 = mjj.e + "/" + str;
                File file = new File(str3);
                if (file.isFile() && file.exists()) {
                    LogUtil.j("HwFileTransferTaskManager", "wifi file onTransferFailed delete file = ", str3, ", isDelete = ", Boolean.valueOf(file.delete()));
                }
                if (num.intValue() == arrayList.size()) {
                    LogUtil.j("HwFileTransferTaskManager", "wifi file onTransferFailed EVENT_SAVE_LOG_ERROR");
                    mnm.this.ab();
                    mnm.this.z.sendEmptyMessage(12);
                } else {
                    LogUtil.j("HwFileTransferTaskManager", "wifi file onTransferFailed currentIndex = ", num, ", arrayList.size() = ", Integer.valueOf(arrayList.size()));
                    mnm.this.ab();
                    mnr.b().b(mnm.this.au, mnm.this.h, mnm.this.al);
                }
            }

            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onSuccess(int i, String str2, String str3) throws RemoteException {
                LogUtil.a("HwFileTransferTaskManager", "wifi file onSuccess = ", Integer.valueOf(i), ", mTransferDataContent = ", str2, ", mTransferStateContent = ", str3, ", currentFileName = ", str);
                if (num.intValue() == arrayList.size()) {
                    mnm.this.ab();
                    mnr.b().b(mnm.this.au, mnm.this.h, mnm.this.al);
                } else {
                    LogUtil.j("HwFileTransferTaskManager", "wifi file onSuccess currentIndex = ", num, ", arrayList.size() = ", Integer.valueOf(arrayList.size()));
                }
            }

            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onResponse(int i, String str2) throws RemoteException {
                LogUtil.a("HwFileTransferTaskManager", "wifi file onResponse errorCode = ", Integer.valueOf(i), ", responseMsg = ", str2);
            }
        };
    }

    private ITransferFileCallback e(final ArrayList arrayList, final String str, final Integer num) {
        return new ITransferFileCallback.Stub() { // from class: mnm.3
            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onProgress(int i, String str2) throws RemoteException {
                LogUtil.a("HwFileTransferTaskManager", "raw file onFileTransferState percentage:", Integer.valueOf(i), ",des", str2, ",currentFileName", str);
                mnm.this.h.a(20001, String.format(Locale.ENGLISH, "%d&%s(%d/%d)", Integer.valueOf(i), arrayList.get(num.intValue() - 1).toString(), num, Integer.valueOf(arrayList.size())));
            }

            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onFailure(int i, String str2) throws RemoteException {
                LogUtil.a("HwFileTransferTaskManager", "raw file onTransferFailed errorCode:", Integer.valueOf(i), ",des", str2, ",currentFileName:", str);
                if (num.intValue() == arrayList.size()) {
                    mnm.this.z.sendEmptyMessage(14);
                }
            }

            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onSuccess(int i, String str2, String str3) throws RemoteException {
                LogUtil.a("HwFileTransferTaskManager", "raw file checkResult:", Integer.valueOf(i), ",des", str2);
                if (num.intValue() == arrayList.size()) {
                    mnm.this.z.sendEmptyMessage(14);
                }
            }

            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onResponse(int i, String str2) throws RemoteException {
                LogUtil.a("HwFileTransferTaskManager", "raw file onResponse: ", str2);
            }
        };
    }

    private void d(RequestFileInfo requestFileInfo, ITransferFileCallback iTransferFileCallback) {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "HwFileTransferTaskManager");
        if (deviceList == null || deviceList.isEmpty()) {
            LogUtil.a("HwFileTransferTaskManager", "startTransferRawFileMessage no device connected");
            return;
        }
        DeviceInfo deviceInfo = deviceList.get(0);
        if (deviceInfo == null) {
            LogUtil.j("Dfx_HwFileTransferTaskManager", "startTransferRawFileMessage the device is null");
        } else if (deviceInfo.getDeviceIdentify().equals(requestFileInfo.getDeviceMac())) {
            LogUtil.a("HwFileTransferTaskManager", "startTransferRawFileMessage. ", requestFileInfo.getFileName());
            xha.c().d(requestFileInfo, iTransferFileCallback);
        } else {
            LogUtil.a("HwFileTransferTaskManager", "startTransferRawFileMessage the device is null or not connected");
        }
    }

    private void z() {
        LogUtil.a("HwFileTransferTaskManager", "is LEO return");
        mnf.e(false);
        this.ae = this.au.getIsUploadAppLog();
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), "last_trigger_beta_log_time", String.valueOf(0), new StorageParams(0));
        ad();
        ExtendHandler extendHandler = this.z;
        if (extendHandler != null) {
            extendHandler.sendEmptyMessage(15, 600000L);
        }
        LogUtil.a("HwFileTransferTaskManager", "getlog from activity:", Boolean.valueOf(this.ad));
        mnr.b().d(this.ad, this.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Message message) {
        ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "dfxOrSleepGetParameter 5.10.2 received");
        mnr.b().c(this.z, 15);
        try {
            if (message.obj instanceof byte[]) {
                byte[] bArr = (byte[]) message.obj;
                if (bArr.length == 8 && bArr[2] == 127) {
                    ab();
                    mnr.b().e(bArr, this.al, this.h);
                }
                c(this.aw.h(bArr));
            }
        } catch (eeu unused) {
            ReleaseLogUtil.a("Dfx_HwFileTransferTaskManager", "GpsHandle dfxOrSleepGetParameter() TlvException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(Message message) {
        ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "dfxOrSleepQueryFileInformation 5.10.3 received");
        mnr.b().c(this.z, 15);
        try {
            if (message.obj instanceof byte[]) {
                byte[] bArr = (byte[]) message.obj;
                if (bArr.length == 8 && bArr[2] == 127) {
                    ab();
                    mnr.b().d(bArr, this.h, this.al);
                } else {
                    e(this.aw.f(message.obj instanceof byte[] ? (byte[]) message.obj : null));
                }
            }
        } catch (eeu unused) {
            ReleaseLogUtil.a("Dfx_HwFileTransferTaskManager", "GpsHandle dfxOrSleepQueryFileInformation() TlvException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Message message) {
        try {
            if (message.obj instanceof byte[]) {
                byte[] bArr = (byte[]) message.obj;
                if (bArr.length == 8 && bArr[2] == 127) {
                    ab();
                    if (this.al instanceof mjj) {
                        mnr.b().a(bArr, this.h, this.z);
                        return;
                    }
                }
                d(this.aw.c(bArr));
            }
        } catch (eeu unused) {
            ReleaseLogUtil.a("Dfx_HwFileTransferTaskManager", "GpsHandle dfxOrSleepMaintenanceReportData() TlvException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Message message) {
        ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "dfxOrSleepAutoMaticGetLog 5.10.11 received");
        mnr.b().c(this.z, 15);
        if (message.obj instanceof byte[]) {
            b((byte[]) message.obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Message message) {
        try {
            if (message.obj instanceof byte[]) {
                c(this.aw.e((byte[]) message.obj));
            }
        } catch (eeu unused) {
            ReleaseLogUtil.a("Dfx_HwFileTransferTaskManager", "GpsHandle dfxOrSleepErrorCode() TlvException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) {
        ReleaseLogUtil.d("Dfx_HwFileTransferTaskManager", "dfxOrSleepQueryFileInformation 5.10.4 received");
        try {
            if (message.obj instanceof byte[]) {
                b(this.aw.d((byte[]) message.obj));
            }
        } catch (eeu unused) {
            ReleaseLogUtil.a("Dfx_HwFileTransferTaskManager", "GpsHandle dfxOrSleepApplyData() TlvException");
        }
    }

    private void b(byte[] bArr) {
        LogUtil.a("HwFileTransferTaskManager", "is show collect dialog: ", Boolean.valueOf(this.ad));
        if (this.ad) {
            c(this.au, this.h);
            this.ad = false;
            this.au.setIsFromAbout(0);
            lrs.a().setIsFromAbout(0);
            return;
        }
        mnr.b().e(bArr, this.ae);
    }

    public boolean x() {
        return mnr.b().b(this.au) && this.ac == 1;
    }

    private boolean aq() {
        return mnr.b().b(this.au) && this.ai;
    }

    private void at() {
        ArrayList arrayList;
        if (!CompileParameterUtil.d("RELEASE_EVENT_LOG_UPLOAD") || this.f42000b != 0 || (arrayList = this.u) == null || arrayList.isEmpty()) {
            return;
        }
        ax();
    }

    private void ax() {
        Object obj = this.u.get(0);
        if ((obj instanceof String) && ((String) obj).toLowerCase(Locale.ENGLISH).contains("dump.log")) {
            this.u.remove(0);
            ExtendHandler extendHandler = this.z;
            if (extendHandler != null) {
                this.e = true;
                extendHandler.sendEmptyMessage(14);
            }
        }
    }
}
