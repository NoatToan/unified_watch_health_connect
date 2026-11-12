package com.amap.api.mapcore.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.CellSignalStrengthNr;
import android.telephony.NeighboringCellInfo;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import com.huami.web.container.utils.UtilsKt;
import com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo;
import com.xiaomi.hm.health.training.utils.AndroidManufacturerUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"NewApi"})
public final class lh {
    private static int r = 0;
    private static boolean v = false;
    public int a;
    public TelephonyManager d;
    public CellLocation f;
    public String i;
    private Context l;
    private lf p;
    private Object q;

    @SuppressLint({"NewApi"})
    private TelephonyManager.CellInfoCallback t;
    private le w;
    public ArrayList<lg> b = new ArrayList<>();
    public ArrayList<ky> c = new ArrayList<>();
    private String m = null;
    private ArrayList<lg> n = new ArrayList<>();
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
            try {
                lh.d(lh.this);
                CellLocation cellLocationA = lh.this.a(list);
                if (cellLocationA != null) {
                    lh lhVar = lh.this;
                    lhVar.f = cellLocationA;
                    lhVar.g = true;
                    lhVar.k();
                    lh.this.s = ki.b();
                }
                lh.this.i();
            } catch (SecurityException e) {
                lh.this.i = e.getMessage();
            } catch (Throwable th) {
                ke.a(th, "Cgi", "cellInfo");
            }
        }
    }

    public class b extends PhoneStateListener {
        public b() {
        }

        @Override // android.telephony.PhoneStateListener
        public final void onCellInfoChanged(List<CellInfo> list) {
            try {
                if (lh.this.w != null) {
                    lh.this.w.a();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.telephony.PhoneStateListener
        public final void onCellLocationChanged(CellLocation cellLocation) {
            try {
                if (lh.this.a(cellLocation)) {
                    lh lhVar = lh.this;
                    lhVar.f = cellLocation;
                    lhVar.g = true;
                    lhVar.k();
                    lh.this.s = ki.b();
                    lh.this.i();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.telephony.PhoneStateListener
        public final void onServiceStateChanged(ServiceState serviceState) {
            try {
                int state = serviceState.getState();
                if (state == 0) {
                    lh.this.a();
                } else {
                    if (state != 1) {
                        return;
                    }
                    lh.this.e();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.telephony.PhoneStateListener
        public final void onSignalStrengthChanged(int i) {
            int iA = RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
            try {
                int i2 = lh.this.a;
                if (i2 == 1 || i2 == 2) {
                    iA = ki.a(i);
                }
                lh.this.b(iA);
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
                int i = lh.this.a;
                if (i == 1) {
                    iA = ki.a(signalStrength.getGsmSignalStrength());
                } else if (i == 2) {
                    iA = signalStrength.getCdmaDbm();
                }
                lh.this.b(iA);
                if (lh.this.w != null) {
                    lh.this.w.a();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public lh(Context context) {
        Object objA;
        this.a = 0;
        this.d = null;
        this.p = null;
        this.i = null;
        this.l = context;
        this.d = (TelephonyManager) ki.a(context, "phone");
        TelephonyManager telephonyManager = this.d;
        if (telephonyManager != null) {
            try {
                this.a = c(telephonyManager.getCellLocation());
            } catch (SecurityException e) {
                this.i = e.getMessage();
            } catch (Throwable th) {
                this.i = null;
                ke.a(th, "CgiManager", "CgiManager");
                this.a = 0;
            }
            try {
                int i = r;
                if (i != 1) {
                    objA = ki.a(i != 2 ? this.l : this.l, "phone2");
                } else {
                    objA = ki.a(this.l, "phone_msim");
                }
                this.q = objA;
            } catch (Throwable unused) {
            }
            hn.d().submit(new Runnable() { // from class: com.amap.api.mapcore.util.lh.1
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (lh.this.y) {
                        if (!lh.this.x) {
                            lh.c(lh.this);
                        }
                    }
                }
            });
        }
        this.p = new lf();
    }

    private CellLocation a(Object obj, String str, Object... objArr) {
        if (obj == null) {
            return null;
        }
        try {
            Object objA = kg.a(obj, str, objArr);
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
                lg lgVarA = null;
                for (int i = 0; i < list.size(); i++) {
                    CellInfo cellInfo = list.get(i);
                    if (cellInfo != null) {
                        try {
                            lgVarA = a(cellInfo);
                            if (lgVarA != null) {
                                break;
                            }
                        } catch (Throwable unused) {
                            continue;
                        }
                    }
                }
                if (lgVarA != null) {
                    try {
                        if (lgVarA.l == 2) {
                            cdmaCellLocation = new CdmaCellLocation();
                            try {
                                cdmaCellLocation.setCellLocationData(lgVarA.j, lgVarA.f, lgVarA.g, lgVarA.h, lgVarA.i);
                                cdmaCellLocation = cdmaCellLocation;
                            } catch (Throwable unused2) {
                            }
                        } else {
                            gsmCellLocation = new GsmCellLocation();
                            try {
                                gsmCellLocation.setLacAndCid(lgVarA.c, lgVarA.d);
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

    private static lg a(int i, boolean z, int i2, int i3, int i4, int i5, int i6) {
        lg lgVar = new lg(i, z);
        lgVar.a = i2;
        lgVar.b = i3;
        lgVar.c = i4;
        lgVar.d = i5;
        lgVar.k = i6;
        return lgVar;
    }

    private lg a(CellInfo cellInfo) {
        boolean zIsRegistered = cellInfo.isRegistered();
        if (cellInfo instanceof CellInfoCdma) {
            return a((CellInfoCdma) cellInfo, zIsRegistered);
        }
        if (cellInfo instanceof CellInfoGsm) {
            return a((CellInfoGsm) cellInfo, zIsRegistered);
        }
        if (cellInfo instanceof CellInfoWcdma) {
            return a((CellInfoWcdma) cellInfo, zIsRegistered);
        }
        if (cellInfo instanceof CellInfoLte) {
            return a((CellInfoLte) cellInfo, zIsRegistered);
        }
        if (Build.VERSION.SDK_INT < 29 || !(cellInfo instanceof CellInfoNr)) {
            return null;
        }
        return a((CellInfoNr) cellInfo, zIsRegistered);
    }

    private lg a(CellInfoCdma cellInfoCdma, boolean z) {
        int i;
        int i2;
        int i3;
        if (cellInfoCdma != null && cellInfoCdma.getCellIdentity() != null) {
            CellIdentityCdma cellIdentity = cellInfoCdma.getCellIdentity();
            if (cellIdentity.getSystemId() > 0 && cellIdentity.getNetworkId() >= 0 && cellIdentity.getBasestationId() >= 0) {
                CellIdentityCdma cellIdentity2 = cellInfoCdma.getCellIdentity();
                String[] strArrA = ki.a(this.d);
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
                lg lgVarA = a(2, z, i2, i3, 0, 0, cellInfoCdma.getCellSignalStrength().getCdmaDbm());
                lgVarA.h = cellIdentity2.getSystemId();
                lgVarA.i = cellIdentity2.getNetworkId();
                lgVarA.j = cellIdentity2.getBasestationId();
                lgVarA.f = cellIdentity2.getLatitude();
                lgVarA.g = cellIdentity2.getLongitude();
                return lgVarA;
            }
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    private static lg a(CellInfoGsm cellInfoGsm, boolean z) {
        if (cellInfoGsm != null && cellInfoGsm.getCellIdentity() != null) {
            CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
            if (c(cellIdentity.getLac()) && d(cellIdentity.getCid())) {
                lg lgVarA = a(1, z, cellIdentity.getMcc(), cellIdentity.getMnc(), cellIdentity.getLac(), cellIdentity.getCid(), cellInfoGsm.getCellSignalStrength().getDbm());
                lgVarA.p = cellInfoGsm.getCellIdentity().getBsic();
                lgVarA.q = cellInfoGsm.getCellIdentity().getArfcn();
                lgVarA.r = cellInfoGsm.getCellSignalStrength().getTimingAdvance();
                return lgVarA;
            }
        }
        return null;
    }

    private static lg a(CellInfoLte cellInfoLte, boolean z) {
        if (cellInfoLte != null && cellInfoLte.getCellIdentity() != null) {
            CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
            if (c(cellIdentity.getTac()) && d(cellIdentity.getCi())) {
                lg lgVarA = a(3, z, cellIdentity.getMcc(), cellIdentity.getMnc(), cellIdentity.getTac(), cellIdentity.getCi(), cellInfoLte.getCellSignalStrength().getDbm());
                lgVarA.p = cellIdentity.getPci();
                lgVarA.q = cellIdentity.getEarfcn();
                lgVarA.r = cellInfoLte.getCellSignalStrength().getTimingAdvance();
                return lgVarA;
            }
        }
        return null;
    }

    private static lg a(CellInfoNr cellInfoNr, boolean z) {
        int i;
        int i2;
        int i3;
        if (cellInfoNr == null || cellInfoNr.getCellIdentity() == null) {
            return null;
        }
        CellIdentityNr cellIdentityNr = (CellIdentityNr) cellInfoNr.getCellIdentity();
        int tac = cellIdentityNr.getTac();
        if (tac == Integer.MAX_VALUE && AndroidManufacturerUtils.MANUFACTURE_HUAWEI.equals(Build.MANUFACTURER)) {
            try {
                tac = kg.b(cellIdentityNr, "getHwTac", new Object[0]);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        long nci = cellIdentityNr.getNci();
        try {
            i = Integer.parseInt(cellIdentityNr.getMccString());
            try {
                i2 = i;
                i3 = Integer.parseInt(cellIdentityNr.getMncString());
            } catch (Throwable th2) {
                th = th2;
                th.printStackTrace();
                i2 = i;
                i3 = 0;
            }
        } catch (Throwable th3) {
            th = th3;
            i = 0;
        }
        lg lgVarA = a(5, z, i2, i3, cellIdentityNr.getTac(), 0, ((CellSignalStrengthNr) cellInfoNr.getCellSignalStrength()).getSsRsrp());
        lgVarA.e = nci;
        if (tac > 16777215) {
            lgVarA.c = 65535;
        } else if (tac > 65535) {
            lgVarA.c = 65535;
            lgVarA.r = tac;
        } else {
            lgVarA.c = tac;
        }
        lgVarA.p = cellIdentityNr.getPci();
        lgVarA.q = cellIdentityNr.getNrarfcn();
        return lgVarA;
    }

    private static lg a(CellInfoWcdma cellInfoWcdma, boolean z) {
        if (cellInfoWcdma != null && cellInfoWcdma.getCellIdentity() != null) {
            CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();
            if (c(cellIdentity.getLac()) && d(cellIdentity.getCid())) {
                lg lgVarA = a(4, z, cellIdentity.getMcc(), cellIdentity.getMnc(), cellIdentity.getLac(), cellIdentity.getCid(), cellInfoWcdma.getCellSignalStrength().getDbm());
                lgVarA.p = cellIdentity.getPsc();
                lgVarA.q = cellInfoWcdma.getCellIdentity().getUarfcn();
                return lgVarA;
            }
        }
        return null;
    }

    private static lg a(NeighboringCellInfo neighboringCellInfo, String[] strArr) {
        try {
            lg lgVar = new lg(1, false);
            lgVar.a = Integer.parseInt(strArr[0]);
            lgVar.b = Integer.parseInt(strArr[1]);
            lgVar.c = kg.b(neighboringCellInfo, "getLac", new Object[0]);
            lgVar.d = neighboringCellInfo.getCid();
            lgVar.k = ki.a(neighboringCellInfo.getRssi());
            return lgVar;
        } catch (Throwable th) {
            ke.a(th, "CgiManager", "getGsm");
            return null;
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
        ArrayList<lg> arrayList;
        try {
            if (i == -113) {
                this.o = RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                return;
            }
            this.o = i;
            int i2 = this.a;
            if ((i2 == 1 || i2 == 2) && (arrayList = this.b) != null && !arrayList.isEmpty()) {
                try {
                    this.b.get(0).k = this.o;
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
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
            ke.a(th, UtilsKt.TAG, "getCellLocT");
            return 0;
        }
    }

    public static /* synthetic */ void c(lh lhVar) {
        int iB;
        lhVar.h = lhVar.new b();
        try {
            iB = kg.b("android.telephony.PhoneStateListener", "LISTEN_SIGNAL_STRENGTHS");
        } catch (Throwable unused) {
            iB = 0;
        }
        if (iB == 0) {
            try {
                lhVar.d.listen(lhVar.h, 16);
            } catch (Throwable unused2) {
            }
        } else {
            try {
                lhVar.d.listen(lhVar.h, iB | 16);
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

    public static /* synthetic */ boolean d(lh lhVar) {
        lhVar.u = true;
        return true;
    }

    private CellLocation g() {
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
                ke.a(th, "CgiManager", "getCellLocation");
            }
        }
        return null;
    }

    private synchronized void h() {
        int i = this.a & 3;
        if (i != 1) {
            if (i == 2 && this.b.isEmpty()) {
                this.a = 0;
            }
        } else if (this.b.isEmpty()) {
            this.a = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        ArrayList<lg> arrayList = this.n;
        if (arrayList != null && arrayList.size() > 0) {
            this.a |= 4;
        }
        TelephonyManager telephonyManager = this.d;
        if (telephonyManager != null) {
            String networkOperator = telephonyManager.getNetworkOperator();
            this.m = networkOperator;
            if (TextUtils.isEmpty(networkOperator)) {
                return;
            }
            this.a |= 8;
        }
    }

    @SuppressLint({"NewApi"})
    private synchronized void j() {
        TelephonyManager telephonyManager;
        SecurityException e;
        List<CellInfo> allCellInfo;
        int size;
        if (!this.j && this.d != null) {
            if (Build.VERSION.SDK_INT >= 29 && this.l.getApplicationInfo().targetSdkVersion >= 29) {
                if (this.t == null) {
                    this.t = new a();
                }
                this.d.requestCellInfoUpdate(hn.d(), this.t);
            }
            CellLocation cellLocationL = l();
            if (!b(cellLocationL)) {
                cellLocationL = m();
            }
            if (b(cellLocationL)) {
                this.f = cellLocationL;
                this.s = ki.b();
            } else if (ki.b() - this.s > 60000) {
                this.f = null;
                this.b.clear();
                this.n.clear();
            }
        }
        this.g = true;
        if (b(this.f)) {
            k();
        }
        try {
            if (ki.c() >= 18 && (telephonyManager = this.d) != null) {
                ArrayList<lg> arrayList = this.n;
                lf lfVar = this.p;
                try {
                    allCellInfo = telephonyManager.getAllCellInfo();
                    try {
                        this.i = null;
                    } catch (SecurityException e2) {
                        e = e2;
                        this.i = e.getMessage();
                    }
                } catch (SecurityException e3) {
                    e = e3;
                    allCellInfo = null;
                }
                if (allCellInfo != null && (size = allCellInfo.size()) != 0) {
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    for (int i = 0; i < size; i++) {
                        CellInfo cellInfo = allCellInfo.get(i);
                        if (cellInfo != null) {
                            try {
                                lg lgVarA = a(cellInfo);
                                if (lgVarA != null) {
                                    lgVarA.m = (short) Math.min(WebSocketProtocol.s, lfVar.a(lgVarA));
                                    arrayList.add(lgVarA);
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
                if (arrayList != null && arrayList.size() > 0) {
                    this.a |= 4;
                    lfVar.a(arrayList);
                }
            }
        } catch (Throwable unused2) {
        }
        TelephonyManager telephonyManager2 = this.d;
        if (telephonyManager2 != null) {
            String networkOperator = telephonyManager2.getNetworkOperator();
            this.m = networkOperator;
            if (!TextUtils.isEmpty(networkOperator)) {
                this.a |= 8;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void k() {
        CellLocation cellLocation;
        boolean z;
        String[] strArrA = ki.a(this.d);
        int iC = c(this.f);
        boolean z2 = true;
        if (iC == 1) {
            a(this.f, strArrA);
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
                            z = false;
                        } else {
                            a(gsmCellLocation, strArrA);
                            z = true;
                        }
                    } catch (Throwable unused) {
                    }
                    if (z) {
                        return;
                    }
                }
                if (b(cellLocation)) {
                    this.a = 2;
                    lg lgVar = new lg(2, true);
                    lgVar.a = Integer.parseInt(strArrA[0]);
                    lgVar.b = Integer.parseInt(strArrA[1]);
                    lgVar.h = kg.b(cellLocation, "getSystemId", new Object[0]);
                    lgVar.i = kg.b(cellLocation, "getNetworkId", new Object[0]);
                    lgVar.j = kg.b(cellLocation, "getBaseStationId", new Object[0]);
                    lgVar.k = this.o;
                    lgVar.f = kg.b(cellLocation, "getBaseStationLatitude", new Object[0]);
                    int iB = kg.b(cellLocation, "getBaseStationLongitude", new Object[0]);
                    lgVar.g = iB;
                    int i = lgVar.f;
                    if (i != iB || i <= 0) {
                        z2 = false;
                    }
                    if (i < 0 || iB < 0 || i == Integer.MAX_VALUE || iB == Integer.MAX_VALUE || z2) {
                        lgVar.f = 0;
                        lgVar.g = 0;
                    }
                    if (!this.b.contains(lgVar)) {
                        this.b.add(lgVar);
                    }
                }
            } catch (Throwable th) {
                ke.a(th, "CgiManager", "hdlCdmaLocChange");
            }
        }
    }

    @SuppressLint({"NewApi"})
    private CellLocation l() {
        TelephonyManager telephonyManager = this.d;
        CellLocation cellLocationA = null;
        if (telephonyManager == null) {
            return null;
        }
        if (ki.c() >= 18) {
            try {
                cellLocationA = a(telephonyManager.getAllCellInfo());
            } catch (SecurityException e) {
                this.i = e.getMessage();
            }
        }
        if (cellLocationA != null) {
            return cellLocationA;
        }
        CellLocation cellLocationG = g();
        if (b(cellLocationG)) {
            return cellLocationG;
        }
        CellLocation cellLocationA2 = a(telephonyManager, "getCellLocationExt", 1);
        return cellLocationA2 != null ? cellLocationA2 : a(telephonyManager, "getCellLocationGemini", 1);
    }

    private CellLocation m() {
        if (!v) {
            v = true;
        }
        Object obj = this.q;
        CellLocation cellLocationA = null;
        if (obj == null) {
            return null;
        }
        try {
            Class<?> clsN = n();
            if (clsN.isInstance(obj)) {
                Object objCast = clsN.cast(obj);
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
            ke.a(th, "CgiManager", "getSim2Cgi");
        }
        return cellLocationA;
    }

    private static Class<?> n() {
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
            ke.a(th, "CgiManager", "getSim2TmClass");
            return null;
        }
    }

    public final synchronized void a() {
        try {
            try {
                boolean zA = ki.a(this.l);
                this.j = zA;
                if ((!zA && ki.b() - this.e >= 10000) || this.b.isEmpty()) {
                    j();
                    this.e = ki.b();
                }
                if (this.j) {
                    e();
                } else {
                    h();
                }
                i();
            } catch (Throwable th) {
                throw th;
            }
        } catch (SecurityException e) {
            this.i = e.getMessage();
        } catch (Throwable th2) {
            ke.a(th2, "CgiManager", "refresh");
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
                if (kg.b(cellLocation, "getSystemId", new Object[0]) > 0 && kg.b(cellLocation, "getNetworkId", new Object[0]) >= 0 && kg.b(cellLocation, "getBaseStationId", new Object[0]) >= 0) {
                    z = true;
                }
                return z;
            } catch (Throwable th2) {
                th = th2;
                str = "cgiUseful Cgi.I_CDMA_T";
            }
        }
        ke.a(th, "CgiManager", str);
        return true;
    }

    public final synchronized ArrayList<lg> b() {
        return this.b;
    }

    public final ArrayList<lg> c() {
        return this.n;
    }

    public final void d() {
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
                ke.a(th, "CgiManager", "destroy");
            }
        }
        this.h = null;
        this.o = RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
        this.d = null;
        this.q = null;
    }

    public final synchronized void e() {
        this.i = null;
        this.f = null;
        this.a = 0;
        this.b.clear();
        this.n.clear();
    }

    public final String f() {
        return this.m;
    }

    private synchronized void a(CellLocation cellLocation, String[] strArr) {
        lg lgVarA;
        if (cellLocation != null) {
            if (this.d != null) {
                this.b.clear();
                if (b(cellLocation)) {
                    this.a = 1;
                    ArrayList<lg> arrayList = this.b;
                    GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                    lg lgVar = new lg(1, true);
                    lgVar.a = ki.d(strArr[0]);
                    lgVar.b = ki.d(strArr[1]);
                    lgVar.c = gsmCellLocation.getLac();
                    lgVar.d = gsmCellLocation.getCid();
                    lgVar.k = this.o;
                    arrayList.add(lgVar);
                    if (Build.VERSION.SDK_INT <= 28) {
                        List<NeighboringCellInfo> list = (List) kg.a(this.d, "getNeighboringCellInfo", new Object[0]);
                        if (list != null && !list.isEmpty()) {
                            for (NeighboringCellInfo neighboringCellInfo : list) {
                                if (neighboringCellInfo != null && a(neighboringCellInfo.getLac(), neighboringCellInfo.getCid()) && (lgVarA = a(neighboringCellInfo, strArr)) != null && !this.b.contains(lgVarA)) {
                                    this.b.add(lgVarA);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
