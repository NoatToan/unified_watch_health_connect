package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.deviceconnect.callback.BtDeviceResponseCallback;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.datatypes.TransferFileInfo;
import com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.AiCoreSdkConstant;
import health.compact.a.CompileParameterUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class moe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f42059a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static moe f42060b;
    private TransferFileInfo ab;
    private long n;
    private IBaseResponseCallback w;
    private boolean q = false;
    private ArrayList t = null;
    private String l = null;
    private MaintenaceInterface u = null;
    private int z = 0;
    private ArrayList<byte[]> x = new ArrayList<>(16);
    private int d = 2440;
    private int y = 732;
    private int r = 0;
    private int o = 0;
    private int k = 0;
    private boolean p = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f42061c = "All file:";
    private String m = "Done file:";
    private Date j = null;
    private int ae = 5000;
    private mus v = null;
    private String i = "";
    private String f = "";
    private int s = 1;
    private int aa = 244;
    private int e = -1;
    private int g = 0;
    private int ag = 1;
    private IBaseResponseCallback h = new IBaseResponseCallback() { // from class: moe.5
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            byte[] bArr = obj instanceof byte[] ? (byte[]) obj : null;
            if (bArr == null || bArr.length < 2) {
                LogUtil.j("HwFileTransferTaskAw70Manager", "onResponse error data is null return");
                return;
            }
            byte b2 = bArr[1];
            if (b2 == 11) {
                if (moe.this.p || !CompileParameterUtil.d("SUPPORT_LOG_FEEDBACK")) {
                    LogUtil.j("HwFileTransferTaskAw70Manager", "is busy or is not support");
                    return;
                }
                LogUtil.a("HwFileTransferTaskAw70Manager", "Dfx is ok, not busy");
            }
            if (moe.this.ad != null) {
                Message messageObtainMessage = moe.this.ad.obtainMessage();
                messageObtainMessage.what = b2;
                messageObtainMessage.obj = bArr;
                moe.this.ad.sendMessage(messageObtainMessage);
            }
        }
    };
    private mup ac = mup.b();
    private Handler ad = new c(Looper.getMainLooper());

    private moe() {
    }

    public static moe a() {
        moe moeVar;
        synchronized (f42059a) {
            if (f42060b == null) {
                f42060b = new moe();
            }
            moeVar = f42060b;
        }
        return moeVar;
    }

    public void c(TransferFileInfo transferFileInfo, IBaseResponseCallback iBaseResponseCallback) {
        if (this.p) {
            LogUtil.j("HwFileTransferTaskAw70Manager", "startMainFile mIsMaintaining, so return!");
            return;
        }
        this.w = iBaseResponseCallback;
        this.ab = transferFileInfo;
        if (transferFileInfo.getIsFromAbout() == 1) {
            this.q = true;
        } else {
            this.q = false;
        }
        LogUtil.a("HwFileTransferTaskAw70Manager", "isFromAbout = ", Integer.valueOf(this.ab.getIsFromAbout()));
        this.p = true;
        if (transferFileInfo.getType() == 0) {
            moc.e(BaseApplication.getContext(), transferFileInfo.getDeviceSn());
            mol.d().d(System.currentTimeMillis());
            LogUtil.a("HwFileTransferTaskAw70Manager", "transferFileInfo.getDeviceMac() = ", BTDeviceMgrUtil.c().e(transferFileInfo.getDeviceMac()), " , transferFileInfo.getDeviceVersion() = ", transferFileInfo.getDeviceVersion());
            if (CompileParameterUtil.d("RELEASE_EVENT_LOG_UPLOAD")) {
                this.s = 1;
            } else {
                this.s = 0;
            }
            this.i = transferFileInfo.getDeviceSn();
            this.f = transferFileInfo.getDeviceVersion();
            if (TextUtils.isEmpty(this.i) || TextUtils.isEmpty(this.f)) {
                LogUtil.e("HwFileTransferTaskAw70Manager", "parameter is error!!!");
                d();
                mjh.e(this.ab, 10001, "parameter is error", this.w);
                return;
            } else {
                this.u = mjj.c();
                a(transferFileInfo.getDfxLogType());
                return;
            }
        }
        LogUtil.a("HwFileTransferTaskAw70Manager", "transferFileInfo.getType() = ", Integer.valueOf(transferFileInfo.getType()));
        c();
        d();
        mjh.e(this.ab, 10001, "type not found", this.w);
    }

    private void c(ArrayList arrayList) {
        try {
            this.t = arrayList;
            if (arrayList == null) {
                if (this.w != null) {
                    d();
                    this.u.cutFolder(mjj.e, mjj.f41752c);
                    mjh.e(this.ab, 10001, "error file list is null", this.w);
                    return;
                }
                return;
            }
            int i = this.s;
            if (i != 0) {
                this.t = this.u.filtertFile(arrayList, i);
            }
            String str = this.f42061c + this.t;
            this.f42061c = str;
            LogUtil.a("HwFileTransferTaskAw70Manager", "getMainSleepOrDfxFileNameHandle() mAllFileListName ", str);
            if (this.t.size() == 0) {
                LogUtil.j("HwFileTransferTaskAw70Manager", "getMainSleepOrDfxFileNameHandle fileList() size is 0");
                d();
                if (this.w != null) {
                    this.u.cutFolder(mjj.e, mjj.f41752c);
                    mjh.e(this.ab, 10000, n(), this.w);
                    return;
                }
                return;
            }
            i();
        } catch (Exception unused) {
            LogUtil.e("HwFileTransferTaskAw70Manager", "getMainSleepOrDfxFileNameHandle Exception");
        }
    }

    private void a(int i) {
        Handler handler = this.ad;
        if (handler != null) {
            handler.removeMessages(15);
            this.ad.sendEmptyMessageDelayed(15, 30000L);
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(10);
        deviceCommand.setCommandID(1);
        String strG = g();
        if (!TextUtils.isEmpty(strG)) {
            deviceCommand.setmIdentify(strG);
        }
        if (i != 0) {
            String str = eeq.d(15) + eeq.d(2) + eeq.d(i);
            deviceCommand.setDataContent(eeq.c(str));
            deviceCommand.setDataLen(eeq.c(str).length);
        }
        b(deviceCommand);
    }

    private void i() {
        Handler handler = this.ad;
        if (handler != null) {
            handler.removeMessages(15);
            this.ad.sendEmptyMessageDelayed(15, 30000L);
        }
        MaintenaceInterface maintenaceInterface = this.u;
        if (maintenaceInterface != null) {
            DeviceCommand deviceCommandMaintParametersCommand = maintenaceInterface.maintParametersCommand();
            String strG = g();
            if (!TextUtils.isEmpty(strG)) {
                deviceCommandMaintParametersCommand.setmIdentify(strG);
            }
            b(deviceCommandMaintParametersCommand);
        }
    }

    private void c(mus musVar) {
        try {
            this.v = musVar;
            if (musVar == null) {
                return;
            }
            this.ae = musVar.a();
            this.aa = this.v.d();
            int iE = this.v.e();
            this.y = iE;
            if (iE == 0) {
                this.y = 732;
            }
            this.d = this.y;
            LogUtil.a("HwFileTransferTaskAw70Manager", " getSleepOrDfxParametersHandle() ok, protocalVersion :", this.v.c(), ", mTransferUnitSize:", Integer.valueOf(this.aa), ", mMaxApplyDataSize:", Integer.valueOf(this.y), ", mWaitTimeout:", Integer.valueOf(this.ae), ", breakPointEnable:", Boolean.valueOf(this.v.b()));
            if (this.ad != null) {
                this.u.deleteTenDayFile();
                this.u.initMaintenanceParame(this.ab);
                this.ad.sendEmptyMessage(14);
            }
        } catch (Exception unused) {
            LogUtil.e("HwFileTransferTaskAw70Manager", "getSleepOrDfxParametersHandle Exception");
            d();
            if (this.w != null) {
                this.u.cutFolder(mjj.e, mjj.f41752c);
                mjh.e(this.ab, 10000, n(), this.w);
            }
        }
    }

    private void e(String str) {
        Handler handler = this.ad;
        if (handler != null) {
            handler.removeMessages(15);
            this.ad.sendEmptyMessageDelayed(15, 30000L);
        }
        j();
        String strA = eeq.a(str);
        String str2 = eeq.d(1) + eeq.d(strA.length() / 2) + strA;
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(10);
        deviceCommand.setCommandID(3);
        deviceCommand.setDataContent(eeq.c(str2));
        deviceCommand.setDataLen(eeq.c(str2).length);
        String strG = g();
        if (!TextUtils.isEmpty(strG)) {
            deviceCommand.setmIdentify(strG);
        }
        b(deviceCommand);
    }

    private void a(mut mutVar) {
        try {
            this.r = (int) mutVar.c();
            long jB = mutVar.b();
            this.n = jB;
            LogUtil.a("HwFileTransferTaskAw70Manager", " querySleepOrDfxFileInformationHandle() ok, mFileTotalSize = ", Integer.valueOf(this.r), ", mFileCrc = ", Long.valueOf(jB));
            if (this.r == 0) {
                ArrayList arrayList = this.t;
                if (arrayList != null && arrayList.size() > 0) {
                    this.t.remove(0);
                }
                Handler handler = this.ad;
                if (handler != null) {
                    handler.sendEmptyMessage(14);
                    return;
                }
                return;
            }
            this.j = new Date();
            b();
        } catch (Exception unused) {
            LogUtil.e("HwFileTransferTaskAw70Manager", "querySleepOrDfxFileInformationHandle Exception");
        }
    }

    private void c(String str, int i, int i2) {
        Handler handler = this.ad;
        if (handler != null) {
            handler.removeMessages(15);
            this.ad.sendEmptyMessageDelayed(15, 30000L);
        }
        String strA = eeq.a(str);
        String str2 = eeq.d(1) + eeq.d(strA.length() / 2) + strA;
        String str3 = eeq.d(2) + eeq.d(4) + eeq.c(i);
        String str4 = eeq.d(3) + eeq.d(4) + eeq.c(i2);
        mus musVar = this.v;
        if (musVar == null) {
            return;
        }
        String strC = musVar.c();
        if (strC != null) {
            if (!strC.contains("AW")) {
                str2 = str2 + str3 + str4;
            }
        } else {
            str2 = str2 + str3 + str4;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(10);
        deviceCommand.setCommandID(4);
        deviceCommand.setDataContent(eeq.c(str2));
        deviceCommand.setDataLen(eeq.c(str2).length);
        String strG = g();
        if (!TextUtils.isEmpty(strG)) {
            deviceCommand.setmIdentify(strG);
        }
        b(deviceCommand);
    }

    private void b(int[] iArr) {
        try {
            if (iArr.length > 0 && iArr[0] == 100000) {
                this.e = 0;
                this.k = 0;
                this.g = this.o;
                this.x.clear();
                Handler handler = this.ad;
                if (handler != null) {
                    handler.removeMessages(15);
                    this.ad.removeMessages(7);
                    this.ad.sendEmptyMessageDelayed(7, this.ae);
                    return;
                }
                return;
            }
            d();
            if (this.w != null) {
                this.u.cutFolder(mjj.e, mjj.f41752c);
                mjh.e(this.ab, 10002, n(), this.w);
            }
        } catch (Exception unused) {
            LogUtil.e("HwFileTransferTaskAw70Manager", "applySleepOrDFXDataHandle errorCodeHandle Exception");
        }
    }

    private void c(mur murVar) {
        try {
            if (murVar == null) {
                LogUtil.j("HwFileTransferTaskAw70Manager", "maintenanceLog is null");
            } else {
                d(murVar);
            }
        } catch (Exception unused) {
            LogUtil.e("HwFileTransferTaskAw70Manager", "queryOtaAllowHandle Exception");
        }
    }

    private void d(mur murVar) {
        int iD = murVar.d();
        if (iD == this.e) {
            byte[] bArrC = murVar.c();
            this.k += bArrC.length;
            this.x.add(bArrC);
            this.g += bArrC.length;
            this.e++;
        } else {
            LogUtil.a("HwFileTransferTaskAw70Manager", "addSleepOrDfxPlayDataToList() lost index:", Integer.valueOf(iD));
        }
        LogUtil.d("HwFileTransferTaskAw70Manager", "addSleepOrDfxPlayDataToList() mCurrentApplyDataSize:", Integer.valueOf(this.d), ",mDonePackageSize:", Integer.valueOf(this.k), ",mCurrentSleepOrDfxFrameNum:", Integer.valueOf(this.e), ",index:", Integer.valueOf(iD));
        if (this.d == this.k) {
            h();
        }
    }

    private void h() {
        this.z = 0;
        this.k = 0;
        Handler handler = this.ad;
        if (handler == null) {
            return;
        }
        handler.removeMessages(7);
        this.o = this.g;
        MaintenaceInterface maintenaceInterface = this.u;
        if (maintenaceInterface != null) {
            maintenaceInterface.writeLogToFile(this.x, this.l, this.j);
        }
        this.x.clear();
        int i = this.r;
        if (i <= 0) {
            f();
            return;
        }
        LogUtil.a("HwFileTransferTaskAw70Manager", "addSleepOrDFXPlayData2List() send ok mDoneTotalSize is ", Integer.valueOf(this.o), ", mFileTotalSize is ", Integer.valueOf(i));
        if (this.o >= this.r) {
            this.m += this.l + ",";
            ArrayList arrayList = this.t;
            if (arrayList != null && arrayList.size() > 0) {
                this.t.remove(0);
            }
            MaintenaceInterface maintenaceInterface2 = this.u;
            DeviceCommand deviceCommandTransferFileEndProcess = maintenaceInterface2 != null ? maintenaceInterface2.transferFileEndProcess() : null;
            if (deviceCommandTransferFileEndProcess != null) {
                LogUtil.a("HwFileTransferTaskAw70Manager", "addSleepOrDFXPlayData2List transferFileEndProcess sendDeviceData");
                b(deviceCommandTransferFileEndProcess);
            }
            MaintenaceInterface maintenaceInterface3 = this.u;
            if (maintenaceInterface3 != null) {
                maintenaceInterface3.save2File(new IBaseResponseCallback() { // from class: moe.3
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i2, Object obj) {
                        moe.this.ad.sendEmptyMessage(14);
                    }
                }, true);
                return;
            }
            return;
        }
        MaintenaceInterface maintenaceInterface4 = this.u;
        if (maintenaceInterface4 != null) {
            maintenaceInterface4.save2File(new IBaseResponseCallback() { // from class: moe.2
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    moe.this.b();
                }
            }, false);
        }
    }

    private void f() {
        LogUtil.j("HwFileTransferTaskAw70Manager", "addSleepOrDfxPlayData2List() lost package error");
        d();
        if (this.w == null) {
            return;
        }
        MaintenaceInterface maintenaceInterface = this.u;
        if (maintenaceInterface != null) {
            maintenaceInterface.cutFolder(mjj.e, mjj.f41752c);
        }
        mjh.e(this.ab, 10002, "package error", this.w);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a  */
    public void b() {
        boolean z;
        int i = this.r - this.o;
        LogUtil.a("HwFileTransferTaskAw70Manager", "Enter getSleepOrDfxApplyDataFromDevice spareSize is ", Integer.valueOf(i), ", mCurrentApplyDataSize is ", Integer.valueOf(this.d));
        mus musVar = this.v;
        if (musVar == null) {
            return;
        }
        String strC = musVar.c();
        if (strC != null) {
            LogUtil.a("HwFileTransferTaskAw70Manager", "getSleepOrDfxApplyDataFromDevice version : ", strC);
            if (strC.contains("AW")) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (i <= this.d || z) {
            this.d = i;
            LogUtil.a("HwFileTransferTaskAw70Manager", "getSleepOrDfxApplyDataFromDevice request final package mCurrentApplyDataSize:", Integer.valueOf(i));
            c(this.l, this.o, this.d);
        } else {
            int i2 = this.y;
            this.d = i2;
            LogUtil.a("HwFileTransferTaskAw70Manager", "getSleepOrDfxApplyDataFromDevice request next package mCurrentApplyDataSize:", Integer.valueOf(i2));
            c(this.l, this.o, this.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int[] iArr) {
        try {
            if (iArr.length <= 0 || iArr[0] == 100000) {
                return;
            }
            d();
            if (this.w != null) {
                this.u.cutFolder(mjj.e, mjj.f41752c);
                mjh.e(this.ab, iArr[0], mnr.b().b(iArr[0]), this.w);
            }
        } catch (Exception unused) {
            LogUtil.e("HwFileTransferTaskAw70Manager", "errorCodeHandle Exception");
        }
    }

    private void j() {
        this.d = this.y;
        this.r = 0;
        this.o = 0;
        this.g = 0;
        this.k = 0;
        this.n = 0L;
        this.x.clear();
    }

    public void c() {
        LogUtil.a("HwFileTransferTaskAw70Manager", "enter resetMaintenance ");
        j();
        this.p = false;
        this.z = 0;
        this.f42061c = "All file:";
        this.m = "Done file:";
        mke.e((BtDeviceResponseCallback) null);
        this.ae = 5000;
        this.y = 732;
        this.aa = 244;
    }

    public void d() {
        LogUtil.a("HwFileTransferTaskAw70Manager", "enter resetSleepOrDFXMaintenance ");
        e();
        mke.e((BtDeviceResponseCallback) null);
    }

    public void e() {
        LogUtil.a("HwFileTransferTaskAw70Manager", "enter resetDFXMaintenance ");
        j();
        Handler handler = this.ad;
        if (handler != null) {
            handler.removeMessages(15);
        }
        this.e = -1;
        this.p = false;
        this.z = 0;
        this.f42061c = "All file:";
        this.m = "Done file:";
        this.ae = 5000;
        this.y = 732;
        this.aa = 244;
    }

    private String n() {
        String str = this.f42061c + ";" + this.m;
        LogUtil.a("HwFileTransferTaskAw70Manager", "reportStatusFileList result:", str);
        return str;
    }

    private void b(DeviceCommand deviceCommand) {
        cpl.d("HwFileTransferTaskAw70Manager", deviceCommand.getDataContent(), "sendCommand deviceCommand: ");
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public void b(byte[] bArr) {
        this.h.a(0, bArr);
    }

    class c extends Handler {
        c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            try {
                int i = message.what;
                if (i == 1) {
                    moe.this.d(message);
                } else if (i == 7) {
                    moe.this.l();
                } else if (i == 127) {
                    int[] iArrE = message.obj instanceof byte[] ? moe.this.ac.e((byte[]) message.obj) : null;
                    if (iArrE instanceof int[]) {
                        moe.this.a(iArrE);
                    }
                } else if (i == 14) {
                    moe.this.k();
                } else if (i == 15) {
                    moe.this.o();
                } else {
                    LogUtil.d("HwFileTransferTaskAw70Manager", "DfxAndSleepHandle handleMessage default");
                }
            } catch (eeu unused) {
                LogUtil.e("HwFileTransferTaskAw70Manager", "DfxAndSleepHandle tlvException");
            }
            moe.this.b(message);
            moe.this.e(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        ArrayList arrayList = this.t;
        if (arrayList != null && arrayList.size() > 0) {
            if (this.t.get(0) instanceof String) {
                this.l = (String) this.t.get(0);
            }
            LogUtil.a("HwFileTransferTaskAw70Manager", "start querySleepOrDfxFileInformation fileName = ", this.l);
            this.e = -1;
            e(this.l);
            return;
        }
        IBaseResponseCallback iBaseResponseCallback = this.w;
        d();
        this.u.onDestroyMaintenance();
        if (iBaseResponseCallback != null) {
            this.u.cutFolder(mjj.e, mjj.f41752c);
            LogUtil.a("HwFileTransferTaskAw70Manager", "dataPath is ", this.u.getmTransferDataContentPath());
            mnt mntVar = new mnt();
            mntVar.e(this.u.getmTransferDataContentPath());
            mntVar.c(this.u.getmTransferStateContentPath());
            mjh.e(this.ab, 10000, mntVar, this.w);
        } else {
            LogUtil.j("HwFileTransferTaskAw70Manager", "callback is null");
        }
        LogUtil.a("HwFileTransferTaskAw70Manager", "maintenance success");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        int i = this.z + 1;
        this.z = i;
        if (i == 3) {
            LogUtil.a("HwFileTransferTaskAw70Manager", "mRetryTimeTransform is already 3");
            d();
            if (this.w == null) {
                LogUtil.j("HwFileTransferTaskAw70Manager", "maintenanceCallback is null!");
            } else {
                this.u.cutFolder(mjj.e, mjj.f41752c);
                mjh.e(this.ab, 10002, n(), this.w);
            }
            Handler handler = this.ad;
            if (handler != null) {
                handler.removeMessages(7);
                return;
            }
            return;
        }
        if (this.ad != null) {
            LogUtil.a("HwFileTransferTaskAw70Manager", "Packet loss repeat");
            b();
            this.ad.sendEmptyMessageDelayed(7, this.ae);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        LogUtil.a("HwFileTransferTaskAw70Manager", "data transfer time out");
        d();
        if (this.w != null) {
            this.u.cutFolder(mjj.e, mjj.f41752c);
            mjh.e(this.ab, 10001, "30s timeout", this.w);
        } else {
            LogUtil.j("HwFileTransferTaskAw70Manager", "maintenanceCallback is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Message message) {
        try {
            int i = message.what;
            if (i == 4) {
                int[] iArrD = message.obj instanceof byte[] ? this.ac.d((byte[]) message.obj) : null;
                if (iArrD instanceof int[]) {
                    b(iArrD);
                    return;
                }
                return;
            }
            if (i == 5) {
                mur murVarC = message.obj instanceof byte[] ? this.ac.c((byte[]) message.obj) : null;
                mur murVar = murVarC;
                c(murVarC);
            } else {
                if (i != 11) {
                    LogUtil.a("HwFileTransferTaskAw70Manager", "processHandleMessageCommandData default");
                    return;
                }
                Handler handler = this.ad;
                if (handler != null) {
                    handler.removeMessages(15);
                }
                d(message.obj instanceof byte[] ? (byte[]) message.obj : null);
            }
        } catch (eeu unused) {
            LogUtil.e("HwFileTransferTaskAw70Manager", "processHandleMessageCommandData handleMessage TlvException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Message message) {
        Object obj = new Object();
        try {
            int i = message.what;
            if (i == 2) {
                Handler handler = this.ad;
                if (handler != null) {
                    handler.removeMessages(15);
                }
                if (message.obj instanceof byte[]) {
                    obj = this.ac.h((byte[]) message.obj);
                }
                if (obj instanceof mus) {
                    c((mus) obj);
                    return;
                }
                return;
            }
            if (i != 3) {
                LogUtil.a("HwFileTransferTaskAw70Manager", "processHandleMessageCommand default");
                return;
            }
            Handler handler2 = this.ad;
            if (handler2 != null) {
                handler2.removeMessages(15);
            }
            byte[] bArr = new byte[0];
            if (message.obj instanceof byte[]) {
                bArr = (byte[]) message.obj;
            }
            if (bArr.length == 8 && bArr[2] == 127) {
                d();
                if (this.w != null) {
                    this.u.onDestroyMaintenance();
                    mjh.e(this.ab, 10002, eeq.e(bArr), this.w);
                    return;
                }
                return;
            }
            if (message.obj instanceof byte[]) {
                obj = this.ac.f((byte[]) message.obj);
            }
            if (obj instanceof mut) {
                a((mut) obj);
            }
        } catch (eeu unused) {
            LogUtil.e("HwFileTransferTaskAw70Manager", "processHandleMessageCommand handleMessage TlvException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Message message) {
        Handler handler = this.ad;
        if (handler != null) {
            handler.removeMessages(15);
        }
        if (message.obj instanceof byte[]) {
            byte[] bArr = (byte[]) message.obj;
            try {
                if (bArr.length == 8 && bArr[2] == 127) {
                    if (a(bArr)) {
                        this.ag = this.ab.getIsUploadAppLog();
                        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), "last_trigger_beta_log_time", String.valueOf(0), new StorageParams(0));
                        e();
                        Handler handler2 = this.ad;
                        if (handler2 != null) {
                            handler2.sendEmptyMessageDelayed(15, 600000L);
                        }
                        if (this.q || this.w == null) {
                            return;
                        }
                        LogUtil.a("HwFileTransferTaskAw70Manager", "is LEO return callback");
                        this.w.a(110002, null);
                        return;
                    }
                    d();
                    if (this.w != null) {
                        this.u.onDestroyMaintenance();
                        mjh.e(this.ab, 10002, eeq.e(bArr), this.w);
                        return;
                    }
                    return;
                }
                c(this.ac.b(bArr));
            } catch (eeu unused) {
                LogUtil.e("HwFileTransferTaskAw70Manager", "handleMessage COMMAND_ID_MAINT_GET_FILE_NAME TlvException");
            }
        }
    }

    private void d(byte[] bArr) {
        LogUtil.a("HwFileTransferTaskAw70Manager", "log from about activity:", Boolean.valueOf(this.q));
        if (this.q) {
            c(this.ab, this.w);
            this.q = false;
            this.ab.setIsFromAbout(0);
            return;
        }
        if (CompileParameterUtil.d("SUPPORT_LOG_FEEDBACK") && !mjq.a()) {
            if (bArr == null || bArr.length <= 3 || bArr[2] != 1) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), "last_trigger_beta_log_time");
                LogUtil.a("HwFileTransferTaskAw70Manager", "DeviceTriggerDFXReceiver startMainteFile: sharedPreference is ", strE);
                long j = !TextUtils.isEmpty(strE) ? Long.parseLong(strE) : 0L;
                LogUtil.a("HwFileTransferTaskAw70Manager", "DeviceTriggerDFXReceiver startMainteFile: curTime:", Long.valueOf(jCurrentTimeMillis), ", lastTime:", Long.valueOf(j));
                if (jCurrentTimeMillis - j < AiCoreSdkConstant.CHECK_SUPPORT_INTERVAL) {
                    LogUtil.j("HwFileTransferTaskAw70Manager", "two hour wait");
                    return;
                }
            } catch (NumberFormatException e) {
                LogUtil.e("HwFileTransferTaskAw70Manager", "DeviceDFXReceiver NumberFormatException", e.getMessage());
            }
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), "last_trigger_beta_log_time", String.valueOf(jCurrentTimeMillis), new StorageParams(0));
            mni.e(BaseApplication.getContext()).c();
            return;
        }
        LogUtil.j("HwFileTransferTaskAw70Manager", "the version is not beta. do not support 11");
    }

    private boolean a(byte[] bArr) {
        try {
            return Integer.parseInt(eeq.e(bArr).substring(8), 16) == 110002;
        } catch (NumberFormatException unused) {
            LogUtil.e("HwFileTransferTaskAw70Manager", "value is not number");
            return false;
        }
    }

    private String g() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_AW70_DEVICES, null, "HwFileTransferTaskAw70Manager");
        DeviceInfo deviceInfo = deviceList.size() != 0 ? deviceList.get(0) : null;
        if (deviceInfo != null) {
            return deviceInfo.getDeviceIdentify();
        }
        return "";
    }
}
