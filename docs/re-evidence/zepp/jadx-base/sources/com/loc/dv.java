package com.loc;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.NeighboringCellInfo;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.huami.watch.ota.UpdateUtils;
import com.huami.web.container.utils.UtilsKt;
import com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes18.dex */
@SuppressLint({"NewApi"})
public final class dv {
    private static int r = 0;
    private static boolean v = false;
    public int a;
    public TelephonyManager d;
    public CellLocation f;
    public String i;
    private Context l;
    private dt p;
    private Object q;

    @SuppressLint({"NewApi"})
    private TelephonyManager.CellInfoCallback t;
    private dn w;
    public ArrayList<du> b = new ArrayList<>();
    public ArrayList<cv> c = new ArrayList<>();
    private String m = null;
    private ArrayList<du> n = new ArrayList<>();
    private int o = RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
    public long e = 0;
    private long s = 0;
    public boolean g = false;
    public PhoneStateListener h = null;
    private boolean u = false;
    public boolean j = false;
    public StringBuilder k = null;
    private boolean x = false;
    private Object y = new Object();

    @SuppressLint({"NewApi"})
    public class a extends TelephonyManager.CellInfoCallback {
        public a() {
        }

        @Override // android.telephony.TelephonyManager.CellInfoCallback
        public final void onCellInfo(List<CellInfo> list) {
            dv.d(dv.this);
            CellLocation cellLocationA = dv.this.a(list);
            if (cellLocationA != null) {
                dv dvVar = dv.this;
                dvVar.f = cellLocationA;
                dvVar.g = true;
                dvVar.a(false);
                dv.this.s = eo.b();
            }
        }
    }

    public class b extends PhoneStateListener {
        public b() {
        }

        @Override // android.telephony.PhoneStateListener
        public final void onCellInfoChanged(List<CellInfo> list) {
            try {
                if (dv.this.w != null) {
                    dv.this.w.c();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.telephony.PhoneStateListener
        public final void onCellLocationChanged(CellLocation cellLocation) {
            try {
                if (dv.this.a(cellLocation)) {
                    dv dvVar = dv.this;
                    dvVar.f = cellLocation;
                    dvVar.g = true;
                    dvVar.a(false);
                    dv.this.s = eo.b();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.telephony.PhoneStateListener
        public final void onServiceStateChanged(ServiceState serviceState) {
            try {
                int state = serviceState.getState();
                if (state == 0) {
                    dv.this.a(false, false);
                } else {
                    if (state != 1) {
                        return;
                    }
                    dv.this.i();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.telephony.PhoneStateListener
        public final void onSignalStrengthChanged(int i) {
            int iA = RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
            try {
                int i2 = dv.this.a;
                if (i2 == 1 || i2 == 2) {
                    iA = eo.a(i);
                }
                dv.this.b(iA);
            } catch (Throwable unused) {
            }
        }

        @Override // android.telephony.PhoneStateListener
        public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
            if (signalStrength == null) {
                return;
            }
            int iA = RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
            try {
                int i = dv.this.a;
                if (i == 1) {
                    iA = eo.a(signalStrength.getGsmSignalStrength());
                } else if (i == 2) {
                    iA = signalStrength.getCdmaDbm();
                }
                dv.this.b(iA);
                if (dv.this.w != null) {
                    dv.this.w.c();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public dv(Context context) {
        Object objA;
        this.a = 0;
        this.d = null;
        this.p = null;
        this.i = null;
        this.l = context;
        this.d = (TelephonyManager) eo.a(context, "phone");
        TelephonyManager telephonyManager = this.d;
        if (telephonyManager != null) {
            try {
                this.a = c(telephonyManager.getCellLocation());
            } catch (SecurityException e) {
                this.i = e.getMessage();
            } catch (Throwable th) {
                this.i = null;
                ei.a(th, "CgiManager", "CgiManager");
                this.a = 0;
            }
            try {
                int i = r;
                if (i != 1) {
                    objA = eo.a(i != 2 ? this.l : this.l, "phone2");
                } else {
                    objA = eo.a(this.l, "phone_msim");
                }
                this.q = objA;
            } catch (Throwable unused) {
            }
            ab.d().submit(new Runnable() { // from class: com.loc.dv.1
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (dv.this.y) {
                        if (!dv.this.x) {
                            dv.c(dv.this);
                        }
                    }
                }
            });
        }
        this.p = new dt();
    }

    private CellLocation a(Object obj, String str, Object... objArr) {
        if (obj == null) {
            return null;
        }
        try {
            Object objA = el.a(obj, str, objArr);
            CellLocation cellLocation = objA != null ? (CellLocation) objA : null;
            if (b(cellLocation)) {
                return cellLocation;
            }
            return null;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.telephony.CellLocation] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [android.telephony.cdma.CdmaCellLocation] */
    @SuppressLint({"NewApi"})
    public synchronized CellLocation a(List<CellInfo> list) {
        ?? cdmaCellLocation;
        GsmCellLocation gsmCellLocation;
        GsmCellLocation gsmCellLocation2 = null;
         = 0;
        gsmCellLocation2 = null;
        gsmCellLocation2 = null;
        ?? r0 = 0;
        if (list != null) {
            if (!list.isEmpty()) {
                du duVarA = null;
                for (int i = 0; i < list.size(); i++) {
                    CellInfo cellInfo = list.get(i);
                    if (cellInfo != null) {
                        try {
                            duVarA = a(cellInfo);
                            if (duVarA != null) {
                                break;
                            }
                        } catch (Throwable unused) {
                            continue;
                        }
                    }
                }
                if (duVarA != null) {
                    try {
                        if (duVarA.k == 2) {
                            cdmaCellLocation = new CdmaCellLocation();
                            try {
                                cdmaCellLocation.setCellLocationData(duVarA.i, duVarA.e, duVarA.f, duVarA.g, duVarA.h);
                                cdmaCellLocation = cdmaCellLocation;
                            } catch (Throwable unused2) {
                            }
                        } else {
                            gsmCellLocation = new GsmCellLocation();
                            try {
                                gsmCellLocation.setLacAndCid(duVarA.c, duVarA.d);
                            } catch (Throwable unused3) {
                                gsmCellLocation2 = gsmCellLocation;
                                cdmaCellLocation = 0;
                                GsmCellLocation gsmCellLocation3 = gsmCellLocation2;
                                r0 = cdmaCellLocation;
                                gsmCellLocation = gsmCellLocation3;
                            }
                        }
                    } catch (Throwable unused4) {
                        cdmaCellLocation = gsmCellLocation2;
                    }
                    GsmCellLocation gsmCellLocation4 = gsmCellLocation2;
                    r0 = cdmaCellLocation;
                    gsmCellLocation = gsmCellLocation4;
                } else {
                    gsmCellLocation = null;
                }
                return r0 == 0 ? gsmCellLocation : r0;
            }
        }
        return null;
    }

    private static du a(int i, boolean z, int i2, int i3, int i4, int i5, int i6) {
        du duVar = new du(i, z);
        duVar.a = i2;
        duVar.b = i3;
        duVar.c = i4;
        duVar.d = i5;
        duVar.j = i6;
        return duVar;
    }

    private du a(CellInfo cellInfo) {
        du duVarA;
        int pci;
        boolean zIsRegistered = cellInfo.isRegistered();
        if (cellInfo instanceof CellInfoCdma) {
            duVarA = a((CellInfoCdma) cellInfo, zIsRegistered);
        } else if (cellInfo instanceof CellInfoGsm) {
            CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
            if (cellInfoGsm.getCellIdentity() == null) {
                return null;
            }
            CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
            if (!c(cellIdentity.getLac()) || !d(cellIdentity.getCid())) {
                return null;
            }
            duVarA = a(1, zIsRegistered, cellIdentity.getMcc(), cellIdentity.getMnc(), cellIdentity.getLac(), cellIdentity.getCid(), cellInfoGsm.getCellSignalStrength().getDbm());
        } else {
            if (cellInfo instanceof CellInfoWcdma) {
                CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
                if (cellInfoWcdma.getCellIdentity() == null) {
                    return null;
                }
                CellIdentityWcdma cellIdentity2 = cellInfoWcdma.getCellIdentity();
                if (!c(cellIdentity2.getLac()) || !d(cellIdentity2.getCid())) {
                    return null;
                }
                duVarA = a(4, zIsRegistered, cellIdentity2.getMcc(), cellIdentity2.getMnc(), cellIdentity2.getLac(), cellIdentity2.getCid(), cellInfoWcdma.getCellSignalStrength().getDbm());
                pci = cellIdentity2.getPsc();
            } else {
                if (!(cellInfo instanceof CellInfoLte)) {
                    return null;
                }
                CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
                if (cellInfoLte.getCellIdentity() == null) {
                    return null;
                }
                CellIdentityLte cellIdentity3 = cellInfoLte.getCellIdentity();
                if (!c(cellIdentity3.getTac()) || !d(cellIdentity3.getCi())) {
                    return null;
                }
                duVarA = a(3, zIsRegistered, cellIdentity3.getMcc(), cellIdentity3.getMnc(), cellIdentity3.getTac(), cellIdentity3.getCi(), cellInfoLte.getCellSignalStrength().getDbm());
                pci = cellIdentity3.getPci();
            }
            duVarA.o = pci;
        }
        return duVarA;
    }

    private du a(CellInfoCdma cellInfoCdma, boolean z) {
        int i;
        int i2;
        int i3;
        if (cellInfoCdma != null && cellInfoCdma.getCellIdentity() != null) {
            CellIdentityCdma cellIdentity = cellInfoCdma.getCellIdentity();
            if (cellIdentity.getSystemId() > 0 && cellIdentity.getNetworkId() >= 0 && cellIdentity.getBasestationId() >= 0) {
                CellIdentityCdma cellIdentity2 = cellInfoCdma.getCellIdentity();
                String[] strArrA = eo.a(this.d);
                try {
                    i = Integer.parseInt(strArrA[0]);
                    try {
                        i3 = Integer.parseInt(strArrA[1]);
                        i2 = i;
                    } catch (Throwable unused) {
                        i2 = i;
                        i3 = 0;
                    }
                } catch (Throwable unused2) {
                    i = 0;
                }
                du duVarA = a(2, z, i2, i3, 0, 0, cellInfoCdma.getCellSignalStrength().getCdmaDbm());
                duVarA.g = cellIdentity2.getSystemId();
                duVarA.h = cellIdentity2.getNetworkId();
                duVarA.i = cellIdentity2.getBasestationId();
                duVarA.e = cellIdentity2.getLatitude();
                duVarA.f = cellIdentity2.getLongitude();
                return duVarA;
            }
        }
        return null;
    }

    private static du a(NeighboringCellInfo neighboringCellInfo, String[] strArr) {
        try {
            du duVar = new du(1, false);
            duVar.a = Integer.parseInt(strArr[0]);
            duVar.b = Integer.parseInt(strArr[1]);
            duVar.c = el.b(neighboringCellInfo, "getLac", new Object[0]);
            duVar.d = neighboringCellInfo.getCid();
            duVar.j = eo.a(neighboringCellInfo.getRssi());
            return duVar;
        } catch (Throwable th) {
            ei.a(th, "CgiManager", "getGsm");
            return null;
        }
    }

    private synchronized void a(CellLocation cellLocation, String[] strArr, boolean z) {
        du duVarA;
        if (cellLocation != null) {
            if (this.d != null) {
                this.b.clear();
                if (b(cellLocation)) {
                    this.a = 1;
                    ArrayList<du> arrayList = this.b;
                    GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                    du duVar = new du(1, true);
                    duVar.a = eo.g(strArr[0]);
                    duVar.b = eo.g(strArr[1]);
                    duVar.c = gsmCellLocation.getLac();
                    duVar.d = gsmCellLocation.getCid();
                    duVar.j = this.o;
                    arrayList.add(duVar);
                    if (z) {
                        return;
                    }
                    if (Build.VERSION.SDK_INT <= 28) {
                        List<NeighboringCellInfo> list = (List) el.a(this.d, "getNeighboringCellInfo", new Object[0]);
                        if (list != null && !list.isEmpty()) {
                            for (NeighboringCellInfo neighboringCellInfo : list) {
                                if (neighboringCellInfo != null && a(neighboringCellInfo.getLac(), neighboringCellInfo.getCid()) && (duVarA = a(neighboringCellInfo, strArr)) != null && !this.b.contains(duVarA)) {
                                    this.b.add(duVarA);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(boolean z) {
        CellLocation cellLocation;
        boolean z2;
        String[] strArrA = eo.a(this.d);
        int iC = c(this.f);
        boolean z3 = true;
        if (iC == 1) {
            a(this.f, strArrA, z);
            return;
        }
        if (iC == 2 && (cellLocation = this.f) != null) {
            this.b.clear();
            try {
                if (this.q != null) {
                    try {
                        Field declaredField = cellLocation.getClass().getDeclaredField("mGsmCellLoc");
                        if (!declaredField.isAccessible()) {
                            declaredField.setAccessible(true);
                        }
                        GsmCellLocation gsmCellLocation = (GsmCellLocation) declaredField.get(cellLocation);
                        if (gsmCellLocation == null || !b(gsmCellLocation)) {
                            z2 = false;
                        } else {
                            a(gsmCellLocation, strArrA, z);
                            z2 = true;
                        }
                    } catch (Throwable unused) {
                    }
                    if (z2) {
                        return;
                    }
                }
                if (b(cellLocation)) {
                    this.a = 2;
                    du duVar = new du(2, true);
                    duVar.a = Integer.parseInt(strArrA[0]);
                    duVar.b = Integer.parseInt(strArrA[1]);
                    duVar.g = el.b(cellLocation, "getSystemId", new Object[0]);
                    duVar.h = el.b(cellLocation, "getNetworkId", new Object[0]);
                    duVar.i = el.b(cellLocation, "getBaseStationId", new Object[0]);
                    duVar.j = this.o;
                    duVar.e = el.b(cellLocation, "getBaseStationLatitude", new Object[0]);
                    int iB = el.b(cellLocation, "getBaseStationLongitude", new Object[0]);
                    duVar.f = iB;
                    int i = duVar.e;
                    if (i != iB || i <= 0) {
                        z3 = false;
                    }
                    if (i < 0 || iB < 0 || i == Integer.MAX_VALUE || iB == Integer.MAX_VALUE || z3) {
                        duVar.e = 0;
                        duVar.f = 0;
                    }
                    if (!this.b.contains(duVar)) {
                        this.b.add(duVar);
                    }
                }
            } catch (Throwable th) {
                ei.a(th, "CgiManager", "hdlCdmaLocChange");
            }
        }
    }

    public static boolean a(int i) {
        return i > 0 && i <= 15;
    }

    private static boolean a(int i, int i2) {
        return (i == -1 || i == 0 || i > 65535 || i2 == -1 || i2 == 0 || i2 == 65535 || i2 >= 268435455) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(int i) {
        ArrayList<du> arrayList;
        try {
            if (i == -113) {
                this.o = RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                return;
            }
            this.o = i;
            int i2 = this.a;
            if ((i2 == 1 || i2 == 2) && (arrayList = this.b) != null && !arrayList.isEmpty()) {
                try {
                    this.b.get(0).j = this.o;
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x00e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a6 A[Catch: all -> 0x0128, TRY_LEAVE, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000b, B:9:0x0011, B:11:0x001b, B:13:0x001f, B:14:0x0026, B:18:0x0036, B:25:0x0046, B:27:0x0050, B:28:0x0054, B:30:0x005a, B:31:0x0063, B:33:0x0071, B:34:0x007d, B:36:0x0082, B:41:0x008b, B:45:0x0093, B:44:0x0090, B:49:0x009c, B:51:0x00a6, B:82:0x0110, B:84:0x0114, B:86:0x0120), top: B:103:0x0001, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x00d6 A[Catch: all -> 0x0110, TryCatch #0 {all -> 0x0110, blocks: (B:52:0x00a9, B:54:0x00b1, B:56:0x00b5, B:57:0x00b9, B:58:0x00bd, B:66:0x00ce, B:69:0x00d6, B:71:0x00db, B:79:0x0101, B:81:0x0107, B:64:0x00c6), top: B:95:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x00db A[Catch: all -> 0x0110, TRY_LEAVE, TryCatch #0 {all -> 0x0110, blocks: (B:52:0x00a9, B:54:0x00b1, B:56:0x00b5, B:57:0x00b9, B:58:0x00bd, B:66:0x00ce, B:69:0x00d6, B:71:0x00db, B:79:0x0101, B:81:0x0107, B:64:0x00c6), top: B:95:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ea A[Catch: all -> 0x00fc, TRY_LEAVE, TryCatch #5 {all -> 0x00fc, blocks: (B:73:0x00e3, B:76:0x00ea), top: B:105:0x00e3 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0114 A[Catch: all -> 0x0128, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000b, B:9:0x0011, B:11:0x001b, B:13:0x001f, B:14:0x0026, B:18:0x0036, B:25:0x0046, B:27:0x0050, B:28:0x0054, B:30:0x005a, B:31:0x0063, B:33:0x0071, B:34:0x007d, B:36:0x0082, B:41:0x008b, B:45:0x0093, B:44:0x0090, B:49:0x009c, B:51:0x00a6, B:82:0x0110, B:84:0x0114, B:86:0x0120), top: B:103:0x0001, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0120 A[Catch: all -> 0x0128, TRY_LEAVE, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000b, B:9:0x0011, B:11:0x001b, B:13:0x001f, B:14:0x0026, B:18:0x0036, B:25:0x0046, B:27:0x0050, B:28:0x0054, B:30:0x005a, B:31:0x0063, B:33:0x0071, B:34:0x007d, B:36:0x0082, B:41:0x008b, B:45:0x0093, B:44:0x0090, B:49:0x009c, B:51:0x00a6, B:82:0x0110, B:84:0x0114, B:86:0x0120), top: B:103:0x0001, inners: #3 }] */
    @SuppressLint({"NewApi"})
    private synchronized void b(boolean z, boolean z2) {
        TelephonyManager telephonyManager;
        String networkOperator;
        TelephonyManager telephonyManager2;
        ArrayList<du> arrayList;
        dt dtVar;
        SecurityException e;
        List<CellInfo> allCellInfo;
        int size;
        CellInfo cellInfo;
        du duVarA;
        if (!this.j && this.d != null) {
            if (Build.VERSION.SDK_INT >= 29 && this.l.getApplicationInfo().targetSdkVersion >= 29) {
                if (this.t == null) {
                    this.t = new a();
                }
                this.d.requestCellInfoUpdate(ab.d(), this.t);
                if (z2 || z) {
                    for (int i = 0; !this.u && i < 20; i++) {
                        try {
                            Thread.sleep(5L);
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
            CellLocation cellLocationQ = q();
            if (!b(cellLocationQ)) {
                cellLocationQ = r();
            }
            if (b(cellLocationQ)) {
                this.f = cellLocationQ;
                this.s = eo.b();
            } else if (eo.b() - this.s > 60000) {
                this.f = null;
                this.b.clear();
                this.n.clear();
            }
        }
        if (!this.g && this.f == null && z2) {
            int i2 = 0;
            do {
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
                i2++;
                if (this.f != null) {
                    break;
                }
            } while (i2 < 50);
            this.g = true;
            if (b(this.f)) {
                a(z);
            }
            if (eo.c() >= 18) {
                arrayList = this.n;
                dtVar = this.p;
                allCellInfo = telephonyManager2.getAllCellInfo();
                this.i = null;
                if (allCellInfo != null) {
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    for (int i3 = 0; i3 < size; i3++) {
                        cellInfo = allCellInfo.get(i3);
                        if (cellInfo != null) {
                            duVarA = a(cellInfo);
                            if (duVarA == null) {
                                duVarA.l = (short) Math.min(WebSocketProtocol.s, dtVar.a(duVarA));
                                arrayList.add(duVarA);
                            }
                        }
                    }
                }
                if (arrayList != null) {
                    this.a |= 4;
                    dtVar.a(arrayList);
                }
            }
            telephonyManager = this.d;
            if (telephonyManager != null) {
                networkOperator = telephonyManager.getNetworkOperator();
                this.m = networkOperator;
                if (!TextUtils.isEmpty(networkOperator)) {
                    this.a |= 8;
                }
            }
        } else {
            this.g = true;
            if (b(this.f)) {
                a(z);
            }
            try {
                if (eo.c() >= 18 && (telephonyManager2 = this.d) != null) {
                    arrayList = this.n;
                    dtVar = this.p;
                    try {
                        allCellInfo = telephonyManager2.getAllCellInfo();
                        try {
                            this.i = null;
                        } catch (SecurityException e3) {
                            e = e3;
                            this.i = e.getMessage();
                        }
                    } catch (SecurityException e4) {
                        e = e4;
                        allCellInfo = null;
                    }
                    if (allCellInfo != null && (size = allCellInfo.size()) != 0) {
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        while (i3 < size) {
                            cellInfo = allCellInfo.get(i3);
                            if (cellInfo != null) {
                                try {
                                    duVarA = a(cellInfo);
                                    if (duVarA == null) {
                                        duVarA.l = (short) Math.min(WebSocketProtocol.s, dtVar.a(duVarA));
                                        arrayList.add(duVarA);
                                    }
                                } catch (Throwable unused2) {
                                }
                            }
                        }
                    }
                    if (arrayList != null && arrayList.size() > 0) {
                        this.a |= 4;
                        dtVar.a(arrayList);
                    }
                }
            } catch (Throwable unused3) {
            }
            telephonyManager = this.d;
            if (telephonyManager != null) {
                networkOperator = telephonyManager.getNetworkOperator();
                this.m = networkOperator;
                if (!TextUtils.isEmpty(networkOperator)) {
                    this.a |= 8;
                }
            }
        }
        throw th;
    }

    private boolean b(CellLocation cellLocation) {
        boolean zA = a(cellLocation);
        if (!zA) {
            this.a = 0;
        }
        return zA;
    }

    private int c(CellLocation cellLocation) {
        if (this.j || cellLocation == null) {
            return 0;
        }
        if (cellLocation instanceof GsmCellLocation) {
            return 1;
        }
        try {
            Class.forName("android.telephony.cdma.CdmaCellLocation");
            return 2;
        } catch (Throwable th) {
            ei.a(th, UtilsKt.TAG, "getCellLocT");
            return 0;
        }
    }

    public static /* synthetic */ void c(dv dvVar) {
        int iB;
        dvVar.h = dvVar.new b();
        try {
            iB = el.b("android.telephony.PhoneStateListener", "LISTEN_SIGNAL_STRENGTHS");
        } catch (Throwable unused) {
            iB = 0;
        }
        if (iB == 0) {
            try {
                dvVar.d.listen(dvVar.h, 16);
            } catch (Throwable unused2) {
            }
        } else {
            try {
                dvVar.d.listen(dvVar.h, iB | 16);
            } catch (Throwable unused3) {
            }
        }
    }

    private static boolean c(int i) {
        return (i == -1 || i == 0 || i > 65535) ? false : true;
    }

    private static boolean d(int i) {
        return (i == -1 || i == 0 || i == 65535 || i >= 268435455) ? false : true;
    }

    public static /* synthetic */ boolean d(dv dvVar) {
        dvVar.u = true;
        return true;
    }

    public static int j() {
        try {
            Class.forName("android.telephony.MSimTelephonyManager");
            r = 1;
        } catch (Throwable unused) {
        }
        if (r == 0) {
            try {
                Class.forName("android.telephony.TelephonyManager2");
                r = 2;
            } catch (Throwable unused2) {
            }
        }
        return r;
    }

    private CellLocation o() {
        TelephonyManager telephonyManager = this.d;
        if (telephonyManager != null) {
            try {
                CellLocation cellLocation = telephonyManager.getCellLocation();
                this.i = null;
                if (b(cellLocation)) {
                    this.f = cellLocation;
                    return cellLocation;
                }
            } catch (SecurityException e) {
                this.i = e.getMessage();
            } catch (Throwable th) {
                this.i = null;
                ei.a(th, "CgiManager", "getCellLocation");
            }
        }
        return null;
    }

    private synchronized void p() {
        int i = this.a & 3;
        if (i != 1) {
            if (i == 2 && this.b.isEmpty()) {
                this.a = 0;
            }
        } else if (this.b.isEmpty()) {
            this.a = 0;
        }
    }

    @SuppressLint({"NewApi"})
    private CellLocation q() {
        TelephonyManager telephonyManager = this.d;
        CellLocation cellLocationA = null;
        if (telephonyManager == null) {
            return null;
        }
        if (eo.c() >= 18) {
            try {
                cellLocationA = a(telephonyManager.getAllCellInfo());
            } catch (SecurityException e) {
                this.i = e.getMessage();
            }
        }
        if (cellLocationA != null) {
            return cellLocationA;
        }
        CellLocation cellLocationO = o();
        if (b(cellLocationO)) {
            return cellLocationO;
        }
        CellLocation cellLocationA2 = a(telephonyManager, "getCellLocationExt", 1);
        return cellLocationA2 != null ? cellLocationA2 : a(telephonyManager, "getCellLocationGemini", 1);
    }

    private CellLocation r() {
        if (!v) {
            v = true;
        }
        Object obj = this.q;
        CellLocation cellLocationA = null;
        if (obj == null) {
            return null;
        }
        try {
            Class<?> clsS = s();
            if (clsS.isInstance(obj)) {
                Object objCast = clsS.cast(obj);
                CellLocation cellLocationA2 = a(objCast, "getCellLocation", new Object[0]);
                if (cellLocationA2 != null) {
                    return cellLocationA2;
                }
                CellLocation cellLocationA3 = a(objCast, "getCellLocation", 1);
                if (cellLocationA3 != null) {
                    return cellLocationA3;
                }
                CellLocation cellLocationA4 = a(objCast, "getCellLocationGemini", 1);
                if (cellLocationA4 != null) {
                    return cellLocationA4;
                }
                cellLocationA = a(objCast, "getAllCellInfo", 1);
                if (cellLocationA != null) {
                    return cellLocationA;
                }
            }
        } catch (Throwable th) {
            ei.a(th, "CgiManager", "getSim2Cgi");
        }
        return cellLocationA;
    }

    private static Class<?> s() {
        String str;
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        int i = r;
        if (i == 0) {
            str = "android.telephony.TelephonyManager";
        } else if (i != 1) {
            str = i != 2 ? null : "android.telephony.TelephonyManager2";
        } else {
            str = "android.telephony.MSimTelephonyManager";
        }
        try {
            return systemClassLoader.loadClass(str);
        } catch (Throwable th) {
            ei.a(th, "CgiManager", "getSim2TmClass");
            return null;
        }
    }

    public final List<cv> a() {
        Object obj;
        ArrayList arrayList = new ArrayList();
        List<CellInfo> allCellInfo = this.d.getAllCellInfo();
        if (Build.VERSION.SDK_INT >= 17) {
            for (CellInfo cellInfo : allCellInfo) {
                if (cellInfo instanceof CellInfoCdma) {
                    CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
                    CellIdentityCdma cellIdentity = cellInfoCdma.getCellIdentity();
                    cw cwVar = new cw(cellInfo.isRegistered(), true);
                    cwVar.m = cellIdentity.getLatitude();
                    cwVar.n = cellIdentity.getLongitude();
                    cwVar.j = cellIdentity.getSystemId();
                    cwVar.k = cellIdentity.getNetworkId();
                    cwVar.l = cellIdentity.getBasestationId();
                    cwVar.d = cellInfoCdma.getCellSignalStrength().getAsuLevel();
                    cwVar.c = cellInfoCdma.getCellSignalStrength().getCdmaDbm();
                    obj = cwVar;
                } else if (cellInfo instanceof CellInfoGsm) {
                    CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
                    CellIdentityGsm cellIdentity2 = cellInfoGsm.getCellIdentity();
                    cx cxVar = new cx(cellInfo.isRegistered(), true);
                    cxVar.a = String.valueOf(cellIdentity2.getMcc());
                    cxVar.b = String.valueOf(cellIdentity2.getMnc());
                    cxVar.j = cellIdentity2.getLac();
                    cxVar.k = cellIdentity2.getCid();
                    cxVar.c = cellInfoGsm.getCellSignalStrength().getDbm();
                    cxVar.d = cellInfoGsm.getCellSignalStrength().getAsuLevel();
                    if (Build.VERSION.SDK_INT >= 24) {
                        cxVar.m = cellIdentity2.getArfcn();
                        cxVar.n = cellIdentity2.getBsic();
                    }
                    arrayList.add(cxVar);
                } else if (cellInfo instanceof CellInfoLte) {
                    CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
                    CellIdentityLte cellIdentity3 = cellInfoLte.getCellIdentity();
                    cy cyVar = new cy(cellInfo.isRegistered());
                    cyVar.a = String.valueOf(cellIdentity3.getMcc());
                    cyVar.b = String.valueOf(cellIdentity3.getMnc());
                    cyVar.l = cellIdentity3.getPci();
                    cyVar.d = cellInfoLte.getCellSignalStrength().getAsuLevel();
                    cyVar.k = cellIdentity3.getCi();
                    cyVar.m = cellIdentity3.getEarfcn();
                    cyVar.j = cellIdentity3.getTac();
                    cyVar.n = cellInfoLte.getCellSignalStrength().getTimingAdvance();
                    cyVar.c = cellInfoLte.getCellSignalStrength().getDbm();
                    obj = cyVar;
                    if (Build.VERSION.SDK_INT >= 24) {
                        cyVar.m = cellIdentity3.getEarfcn();
                        obj = cyVar;
                    }
                } else {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 18 && (cellInfo instanceof CellInfoWcdma)) {
                        CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
                        CellIdentityWcdma cellIdentity4 = cellInfoWcdma.getCellIdentity();
                        cz czVar = new cz(cellInfo.isRegistered(), true);
                        czVar.a = String.valueOf(cellIdentity4.getMcc());
                        czVar.b = String.valueOf(cellIdentity4.getMnc());
                        czVar.j = cellIdentity4.getLac();
                        czVar.k = cellIdentity4.getCid();
                        czVar.l = cellIdentity4.getPsc();
                        czVar.d = cellInfoWcdma.getCellSignalStrength().getAsuLevel();
                        czVar.c = cellInfoWcdma.getCellSignalStrength().getDbm();
                        if (i >= 24) {
                            czVar.m = cellIdentity4.getUarfcn();
                        }
                        arrayList.add(czVar);
                    }
                }
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void a(dn dnVar) {
        this.w = dnVar;
    }

    public final synchronized void a(boolean z, boolean z2) {
        try {
            try {
                boolean zA = eo.a(this.l);
                this.j = zA;
                if ((!zA && eo.b() - this.e >= 10000) || this.b.isEmpty()) {
                    b(z, z2);
                    this.e = eo.b();
                }
                if (this.j) {
                    i();
                } else {
                    p();
                }
            } catch (SecurityException e) {
                this.i = e.getMessage();
            }
        } catch (Throwable th) {
            ei.a(th, "CgiManager", "refresh");
        }
    }

    public final boolean a(CellLocation cellLocation) {
        String str;
        boolean z = false;
        if (cellLocation == null) {
            return false;
        }
        int iC = c(cellLocation);
        if (iC == 1) {
            try {
                GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                return a(gsmCellLocation.getLac(), gsmCellLocation.getCid());
            } catch (Throwable th) {
                th = th;
                str = "cgiUseful Cgi.I_GSM_T";
            }
        } else {
            if (iC != 2) {
                return true;
            }
            try {
                if (el.b(cellLocation, "getSystemId", new Object[0]) > 0 && el.b(cellLocation, "getNetworkId", new Object[0]) >= 0 && el.b(cellLocation, "getBaseStationId", new Object[0]) >= 0) {
                    z = true;
                }
                return z;
            } catch (Throwable th2) {
                th = th2;
                str = "cgiUseful Cgi.I_CDMA_T";
            }
        }
        ei.a(th, "CgiManager", str);
        return true;
    }

    public final synchronized ArrayList<du> b() {
        return this.b;
    }

    public final ArrayList<du> c() {
        return this.n;
    }

    public final synchronized du d() {
        if (this.j) {
            return null;
        }
        ArrayList<du> arrayList = this.b;
        if (arrayList.size() <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    public final int e() {
        return this.a;
    }

    public final int f() {
        return this.a & 3;
    }

    public final TelephonyManager g() {
        return this.d;
    }

    public final void h() {
        PhoneStateListener phoneStateListener;
        this.p.a();
        this.s = 0L;
        synchronized (this.y) {
            this.x = true;
        }
        TelephonyManager telephonyManager = this.d;
        if (telephonyManager != null && (phoneStateListener = this.h) != null) {
            try {
                telephonyManager.listen(phoneStateListener, 0);
            } catch (Throwable th) {
                ei.a(th, "CgiManager", "destroy");
            }
        }
        this.h = null;
        this.o = RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
        this.d = null;
        this.q = null;
    }

    public final synchronized void i() {
        this.i = null;
        this.f = null;
        this.a = 0;
        this.b.clear();
        this.n.clear();
    }

    public final String k() {
        return this.i;
    }

    public final String l() {
        return this.m;
    }

    public final synchronized String m() {
        if (this.j) {
            i();
        }
        StringBuilder sb = this.k;
        if (sb == null) {
            this.k = new StringBuilder();
        } else {
            sb.delete(0, sb.length());
        }
        if ((this.a & 3) == 1) {
            for (int i = 1; i < this.b.size(); i++) {
                StringBuilder sb2 = this.k;
                sb2.append(UpdateUtils.CMD_FILTER);
                sb2.append(this.b.get(i).b);
                StringBuilder sb3 = this.k;
                sb3.append(AESEncryptionHelper.SEPARATOR);
                sb3.append(this.b.get(i).c);
                StringBuilder sb4 = this.k;
                sb4.append(AESEncryptionHelper.SEPARATOR);
                sb4.append(this.b.get(i).d);
            }
        }
        if (this.k.length() > 0) {
            this.k.deleteCharAt(0);
        }
        return this.k.toString();
    }

    public final boolean n() {
        try {
            TelephonyManager telephonyManager = this.d;
            if (telephonyManager != null && (!TextUtils.isEmpty(telephonyManager.getSimOperator()) || !TextUtils.isEmpty(this.d.getSimCountryIso()))) {
                return true;
            }
        } catch (Throwable unused) {
        }
        try {
            int iA = eo.a(eo.c(this.l));
            return iA == 0 || iA == 4 || iA == 2 || iA == 5 || iA == 3;
        } catch (Throwable unused2) {
            return false;
        }
    }
}
