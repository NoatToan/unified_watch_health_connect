package com.autonavi.aps.amapapi.restruct;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
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
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.telephony.TelephonyManager$CellInfoCallback;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.j1;
import com.amap.api.col.p0003sl.ni;
import com.amap.api.col.p0003sl.nj;
import com.amap.api.col.p0003sl.nk;
import com.amap.api.col.p0003sl.nl;
import com.amap.api.col.p0003sl.nm;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.cns;
import defpackage.qms;
import defpackage.tms;
import defpackage.vms;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"NewApi"})
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    TelephonyManager f6859b;
    SignalStrength d;
    private Context h;
    private c m;

    @SuppressLint({"NewApi"})
    private TelephonyManager$CellInfoCallback q;
    private com.autonavi.aps.amapapi.c x;
    private boolean i = false;
    private boolean j = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList<d> f6858a = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f6860k = null;
    private ArrayList<d> l = new ArrayList<>();
    private long n = 0;
    PhoneStateListener c = null;
    private boolean o = false;
    private Object p = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f6861r = false;
    boolean e = false;
    StringBuilder f = null;
    private String s = null;
    private String t = null;
    String g = null;
    private volatile boolean u = true;
    private volatile boolean v = true;
    private volatile boolean w = false;

    @SuppressLint({"NewApi"})
    public class a extends TelephonyManager$CellInfoCallback {
        public a() {
        }

        public final void onCellInfo(List<CellInfo> list) {
            try {
                com.autonavi.aps.amapapi.utils.e.a();
                StringBuilder sb = new StringBuilder("noLocReqCgiEnable:");
                sb.append(e.this.v);
                sb.append(" isStartLocation:");
                sb.append(e.this.u);
                com.autonavi.aps.amapapi.utils.e.a();
                if ((e.this.v || e.this.u) && com.autonavi.aps.amapapi.utils.k.b() - e.this.n >= 500) {
                    e.d(e.this);
                    e.this.a(e.this.v());
                    e.this.a(list);
                    e.this.n = com.autonavi.aps.amapapi.utils.k.b();
                }
            } catch (SecurityException e) {
                e.this.g = e.getMessage();
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, "Cgi", "cellInfo");
            }
        }
    }

    public class b extends PhoneStateListener {
        public b() {
        }

        @Override // android.telephony.PhoneStateListener
        public final void onCellInfoChanged(List<CellInfo> list) {
            try {
                com.autonavi.aps.amapapi.utils.e.a();
                StringBuilder sb = new StringBuilder("noLocReqCgiEnable:");
                sb.append(e.this.v);
                sb.append(" isStartLocation:");
                sb.append(e.this.u);
                com.autonavi.aps.amapapi.utils.e.a();
                if (e.this.v || e.this.u) {
                    if (e.this.x != null) {
                        e.this.x.c();
                    }
                    if (com.autonavi.aps.amapapi.utils.k.b() - e.this.n < 500) {
                        return;
                    }
                    e.this.a(e.this.v());
                    e.this.a(list);
                    e.this.n = com.autonavi.aps.amapapi.utils.k.b();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // android.telephony.PhoneStateListener
        public final void onCellLocationChanged(CellLocation cellLocation) {
            com.autonavi.aps.amapapi.utils.e.a();
            StringBuilder sb = new StringBuilder("noLocReqCgiEnable:");
            sb.append(e.this.v);
            sb.append(" isStartLocation:");
            sb.append(e.this.u);
            com.autonavi.aps.amapapi.utils.e.a();
            if ((e.this.v || e.this.u) && com.autonavi.aps.amapapi.utils.k.b() - e.this.n >= 500) {
                try {
                    e.this.a(cellLocation);
                    e.this.a(e.this.w());
                    e.this.n = com.autonavi.aps.amapapi.utils.k.b();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }

        @Override // android.telephony.PhoneStateListener
        public final void onDataConnectionStateChanged(int i) {
            super.onDataConnectionStateChanged(i);
            com.autonavi.aps.amapapi.utils.e.a();
        }

        @Override // android.telephony.PhoneStateListener
        public final void onServiceStateChanged(ServiceState serviceState) {
            try {
                com.autonavi.aps.amapapi.utils.e.a();
                StringBuilder sb = new StringBuilder("noLocReqCgiEnable:");
                sb.append(e.this.v);
                sb.append(" isStartLocation:");
                sb.append(e.this.u);
                com.autonavi.aps.amapapi.utils.e.a();
                if (e.this.v || e.this.u) {
                    int state = serviceState.getState();
                    if (state == 0) {
                        e.this.a(false, false);
                    } else {
                        if (state != 1) {
                            return;
                        }
                        e.this.j();
                    }
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.telephony.PhoneStateListener
        public final void onSignalStrengthChanged(int i) {
            super.onSignalStrengthChanged(i);
            com.autonavi.aps.amapapi.utils.e.a();
        }

        @Override // android.telephony.PhoneStateListener
        public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
            com.autonavi.aps.amapapi.utils.e.a();
            StringBuilder sb = new StringBuilder("noLocReqCgiEnable:");
            sb.append(e.this.v);
            sb.append(" isStartLocation:");
            sb.append(e.this.u);
            com.autonavi.aps.amapapi.utils.e.a();
            if (signalStrength == null) {
                return;
            }
            e eVar = e.this;
            eVar.d = signalStrength;
            if (eVar.v || e.this.u) {
                try {
                    if (e.this.x != null) {
                        e.this.x.c();
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public e(Context context, Handler handler) {
        this.f6859b = null;
        this.m = null;
        com.autonavi.aps.amapapi.utils.e.a();
        this.h = context;
        if (this.f6859b == null) {
            this.f6859b = (TelephonyManager) com.autonavi.aps.amapapi.utils.k.a(context, "phone");
        }
        o();
        c cVar = new c(context, "cellAge", handler);
        this.m = cVar;
        cVar.a();
    }

    public static boolean a(int i) {
        return i > 0 && i <= 15;
    }

    private static int b(int i) {
        return (i * 2) - 113;
    }

    public static /* synthetic */ boolean d(e eVar) {
        eVar.f6861r = true;
        return true;
    }

    private void o() {
        if (this.f6859b == null) {
            return;
        }
        p();
    }

    private void p() {
        try {
            if (this.c == null) {
                this.c = new b();
            }
            int i = Build.VERSION.SDK_INT;
            int i2 = 336;
            if (i < 31) {
                com.autonavi.aps.amapapi.utils.e.b();
            } else if (this.h.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
                this.t = "hasFineLocPerm";
                com.autonavi.aps.amapapi.utils.e.b();
            } else {
                this.t = "hasNoFineLocPerm";
                com.autonavi.aps.amapapi.utils.e.b();
                i2 = 320;
            }
            if (i >= 31) {
                boolean z = this.h.checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
                boolean z2 = this.h.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
                if (z && z2) {
                    i2 |= 1024;
                }
                com.autonavi.aps.amapapi.utils.e.b();
                this.s = z ? "hasReadPhoneStatePerm" : "hasNoReadPhoneStatePerm";
                this.t = z2 ? "hasFineLocPerm" : "hasNoFineLocPerm";
                com.autonavi.aps.amapapi.utils.e.b();
            } else {
                com.autonavi.aps.amapapi.utils.e.b();
                i2 |= 1024;
            }
            PhoneStateListener phoneStateListener = this.c;
            if (phoneStateListener != null) {
                this.f6859b.listen(phoneStateListener, i2);
                this.w = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int q() {
        d dVarE = e();
        if (dVarE != null) {
            return dVarE.l;
        }
        return 0;
    }

    private CellLocation r() {
        TelephonyManager telephonyManager = this.f6859b;
        if (telephonyManager != null) {
            try {
                CellLocation cellLocation = telephonyManager.getCellLocation();
                com.autonavi.aps.amapapi.utils.e.a();
                this.g = null;
                return cellLocation;
            } catch (SecurityException e) {
                this.g = e.getMessage();
            } catch (Throwable th) {
                this.g = null;
                com.autonavi.aps.amapapi.utils.c.a(th, "CgiManager", "getCellLocation");
            }
        }
        return null;
    }

    private List<CellInfo> s() {
        TelephonyManager telephonyManager = this.f6859b;
        if (telephonyManager == null) {
            return null;
        }
        List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
        com.autonavi.aps.amapapi.utils.e.a();
        return allCellInfo;
    }

    private boolean t() {
        return !this.e && com.autonavi.aps.amapapi.utils.k.b() - this.n >= 45000;
    }

    private void u() {
        PhoneStateListener phoneStateListener;
        TelephonyManager telephonyManager = this.f6859b;
        if (telephonyManager != null && (phoneStateListener = this.c) != null) {
            try {
                telephonyManager.listen(phoneStateListener, 0);
                this.w = false;
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, "CgiManager", "destroy");
            }
        }
        this.c = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CellLocation v() {
        if (this.f6859b == null) {
            return null;
        }
        return r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public List<CellInfo> w() {
        List<CellInfo> listS;
        try {
            if (com.autonavi.aps.amapapi.utils.k.c() < 18 || this.f6859b == null) {
                return null;
            }
            try {
                listS = s();
                try {
                    this.g = null;
                } catch (SecurityException e) {
                    e = e;
                    this.g = e.getMessage();
                }
            } catch (SecurityException e2) {
                e = e2;
                listS = null;
            }
            return listS;
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "Cgi", "getNewCells");
            return null;
        }
    }

    public final int h() {
        return q() & 3;
    }

    public final TelephonyManager i() {
        return this.f6859b;
    }

    public final synchronized void j() {
        this.g = null;
        this.f6858a.clear();
        this.l.clear();
        this.i = false;
        this.j = false;
    }

    public final String k() {
        return this.g;
    }

    public final String l() {
        return this.f6860k;
    }

    public final synchronized String m() {
        try {
            if (this.e) {
                j();
            }
            StringBuilder sb = this.f;
            if (sb == null) {
                this.f = new StringBuilder();
            } else {
                sb.delete(0, sb.length());
            }
            if (h() == 1) {
                for (int i = 1; i < this.f6858a.size(); i++) {
                    StringBuilder sb2 = this.f;
                    sb2.append(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX);
                    sb2.append(this.f6858a.get(i).f6855b);
                    StringBuilder sb3 = this.f;
                    sb3.append("|");
                    sb3.append(this.f6858a.get(i).c);
                    StringBuilder sb4 = this.f;
                    sb4.append("|");
                    sb4.append(this.f6858a.get(i).d);
                }
            }
            for (int i2 = 1; i2 < this.l.size(); i2++) {
                d dVar = this.l.get(i2);
                int i3 = dVar.l;
                if (i3 == 1 || i3 == 3 || i3 == 4 || i3 == 5) {
                    StringBuilder sb5 = this.f;
                    sb5.append(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX);
                    sb5.append(dVar.l);
                    StringBuilder sb6 = this.f;
                    sb6.append("|");
                    sb6.append(dVar.f6854a);
                    StringBuilder sb7 = this.f;
                    sb7.append("|");
                    sb7.append(dVar.f6855b);
                    StringBuilder sb8 = this.f;
                    sb8.append("|");
                    sb8.append(dVar.c);
                    StringBuilder sb9 = this.f;
                    sb9.append("|");
                    sb9.append(dVar.a());
                } else if (i3 == 2) {
                    StringBuilder sb10 = this.f;
                    sb10.append(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX);
                    sb10.append(dVar.l);
                    StringBuilder sb11 = this.f;
                    sb11.append("|");
                    sb11.append(dVar.f6854a);
                    StringBuilder sb12 = this.f;
                    sb12.append("|");
                    sb12.append(dVar.h);
                    StringBuilder sb13 = this.f;
                    sb13.append("|");
                    sb13.append(dVar.i);
                    StringBuilder sb14 = this.f;
                    sb14.append("|");
                    sb14.append(dVar.j);
                }
            }
            if (this.f.length() > 0) {
                this.f.deleteCharAt(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f.toString();
    }

    public final boolean n() {
        try {
            TelephonyManager telephonyManager = this.f6859b;
            if (telephonyManager != null && (!TextUtils.isEmpty(telephonyManager.getSimOperator()) || !TextUtils.isEmpty(this.f6859b.getSimCountryIso()))) {
                return true;
            }
        } catch (Throwable unused) {
        }
        try {
            int iA = com.autonavi.aps.amapapi.utils.k.a(com.autonavi.aps.amapapi.utils.k.c(this.h));
            return iA == 0 || iA == 4 || iA == 2 || iA == 5 || iA == 3;
        } catch (Throwable unused2) {
            return false;
        }
    }

    public final synchronized ArrayList<d> c() {
        ArrayList<d> arrayList;
        arrayList = new ArrayList<>();
        ArrayList<d> arrayList2 = this.f6858a;
        if (arrayList2 != null) {
            Iterator<d> it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().clone());
            }
        }
        return arrayList;
    }

    public final synchronized ArrayList<d> d() {
        ArrayList<d> arrayList;
        arrayList = new ArrayList<>();
        ArrayList<d> arrayList2 = this.l;
        if (arrayList2 != null) {
            Iterator<d> it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().clone());
            }
        }
        return arrayList;
    }

    public final synchronized d e() {
        if (this.e) {
            return null;
        }
        ArrayList<d> arrayList = this.f6858a;
        if (arrayList.size() <= 0) {
            return null;
        }
        return arrayList.get(0).clone();
    }

    public final synchronized d f() {
        if (this.e) {
            return null;
        }
        ArrayList<d> arrayList = this.l;
        if (arrayList.size() <= 0) {
            return null;
        }
        for (d dVar : arrayList) {
            if (dVar.n) {
                return dVar.clone();
            }
        }
        return arrayList.get(0).clone();
    }

    public final int g() {
        return q() | (this.i ? 4 : 0) | (this.j ? 8 : 0);
    }

    public final void b() {
        String str;
        String str2;
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                if (this.h.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
                    str = "hasFineLocPerm";
                } else {
                    str = "hasNoFineLocPerm";
                }
                if (this.h.checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                    str2 = "hasReadPhoneStatePerm";
                } else {
                    str2 = "hasNoReadPhoneStatePerm";
                }
                boolean z = (TextUtils.isEmpty(this.t) || this.t.equals(str)) ? false : true;
                if ((TextUtils.isEmpty(this.s) || this.s.equals(str2)) && !z) {
                    return;
                }
                com.autonavi.aps.amapapi.utils.e.b();
                p();
            }
        } catch (Throwable unused) {
            com.autonavi.aps.amapapi.utils.e.b();
        }
    }

    public final List<ni> a() {
        ArrayList arrayList = new ArrayList();
        List<CellInfo> listS = s();
        if (listS != null) {
            for (CellInfo cellInfo : listS) {
                if (cellInfo instanceof CellInfoCdma) {
                    CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
                    CellIdentityCdma cellIdentity = cellInfoCdma.getCellIdentity();
                    nj njVar = new nj(cellInfo.isRegistered(), true);
                    njVar.m = cellIdentity.getLatitude();
                    njVar.n = cellIdentity.getLongitude();
                    njVar.j = cellIdentity.getSystemId();
                    njVar.f6217k = cellIdentity.getNetworkId();
                    njVar.l = cellIdentity.getBasestationId();
                    njVar.d = cellInfoCdma.getCellSignalStrength().getAsuLevel();
                    njVar.c = cellInfoCdma.getCellSignalStrength().getCdmaDbm();
                    arrayList.add(njVar);
                } else if (cellInfo instanceof CellInfoGsm) {
                    CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
                    CellIdentityGsm cellIdentity2 = cellInfoGsm.getCellIdentity();
                    nk nkVar = new nk(cellInfo.isRegistered(), true);
                    nkVar.f6215a = String.valueOf(cellIdentity2.getMcc());
                    nkVar.f6216b = String.valueOf(cellIdentity2.getMnc());
                    nkVar.j = cellIdentity2.getLac();
                    nkVar.f6218k = cellIdentity2.getCid();
                    nkVar.c = cellInfoGsm.getCellSignalStrength().getDbm();
                    nkVar.d = cellInfoGsm.getCellSignalStrength().getAsuLevel();
                    nkVar.m = cellIdentity2.getArfcn();
                    nkVar.n = cellIdentity2.getBsic();
                    arrayList.add(nkVar);
                } else if (cellInfo instanceof CellInfoLte) {
                    CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
                    CellIdentityLte cellIdentity3 = cellInfoLte.getCellIdentity();
                    nl nlVar = new nl(cellInfo.isRegistered());
                    nlVar.f6215a = String.valueOf(cellIdentity3.getMcc());
                    nlVar.f6216b = String.valueOf(cellIdentity3.getMnc());
                    nlVar.l = cellIdentity3.getPci();
                    nlVar.d = cellInfoLte.getCellSignalStrength().getAsuLevel();
                    nlVar.f6219k = cellIdentity3.getCi();
                    nlVar.j = cellIdentity3.getTac();
                    nlVar.n = cellInfoLte.getCellSignalStrength().getTimingAdvance();
                    nlVar.c = cellInfoLte.getCellSignalStrength().getDbm();
                    nlVar.m = cellIdentity3.getEarfcn();
                    arrayList.add(nlVar);
                } else if (cellInfo instanceof CellInfoWcdma) {
                    CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
                    CellIdentityWcdma cellIdentity4 = cellInfoWcdma.getCellIdentity();
                    nm nmVar = new nm(cellInfo.isRegistered(), true);
                    nmVar.f6215a = String.valueOf(cellIdentity4.getMcc());
                    nmVar.f6216b = String.valueOf(cellIdentity4.getMnc());
                    nmVar.j = cellIdentity4.getLac();
                    nmVar.f6220k = cellIdentity4.getCid();
                    nmVar.l = cellIdentity4.getPsc();
                    nmVar.d = cellInfoWcdma.getCellSignalStrength().getAsuLevel();
                    nmVar.c = cellInfoWcdma.getCellSignalStrength().getDbm();
                    nmVar.m = cellIdentity4.getUarfcn();
                    arrayList.add(nmVar);
                }
            }
        }
        return arrayList;
    }

    public final void c(boolean z) {
        this.v = z;
    }

    public final void b(boolean z) {
        this.u = z;
        if (this.v) {
            return;
        }
        if (z && !this.w) {
            p();
        } else {
            if (z || !this.w) {
                return;
            }
            u();
        }
    }

    @SuppressLint({"NewApi"})
    private void b(boolean z, boolean z2) {
        if (!this.e && this.f6859b != null && Build.VERSION.SDK_INT >= 29 && this.h.getApplicationInfo().targetSdkVersion >= 29) {
            if (this.q == null) {
                this.q = new a();
            }
            try {
                this.f6859b.requestCellInfoUpdate(j1.h().f(), this.q);
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, "Cgi", "refreshCgi");
            }
            if (z2 || z) {
                for (int i = 0; !this.f6861r && i < 20; i++) {
                    try {
                        Thread.sleep(5L);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        this.j = false;
        TelephonyManager telephonyManager = this.f6859b;
        if (telephonyManager != null) {
            String networkOperator = telephonyManager.getNetworkOperator();
            this.f6860k = networkOperator;
            if (!TextUtils.isEmpty(networkOperator)) {
                this.j = true;
            }
        }
        this.n = com.autonavi.aps.amapapi.utils.k.b();
    }

    public final void a(boolean z, boolean z2) {
        try {
            this.e = com.autonavi.aps.amapapi.utils.k.a(this.h);
            if (t()) {
                b(z, z2);
                a(v());
                a(w());
            }
            if (this.e) {
                j();
            }
        } catch (SecurityException e) {
            this.g = e.getMessage();
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "CgiManager", "refresh");
        }
    }

    public final void a(boolean z) {
        this.m.a(z);
        this.n = 0L;
        synchronized (this.p) {
            this.o = true;
        }
        u();
        this.d = null;
        this.f6859b = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(CellLocation cellLocation) {
        try {
            String[] strArrA = com.autonavi.aps.amapapi.utils.k.a(this.f6859b);
            this.f6858a.clear();
            if (cellLocation instanceof GsmCellLocation) {
                GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                d dVar = new d(1, true);
                dVar.f6854a = com.autonavi.aps.amapapi.utils.k.e(strArrA[0]);
                dVar.f6855b = com.autonavi.aps.amapapi.utils.k.e(strArrA[1]);
                dVar.c = gsmCellLocation.getLac();
                dVar.d = gsmCellLocation.getCid();
                SignalStrength signalStrength = this.d;
                if (signalStrength != null) {
                    int gsmSignalStrength = signalStrength.getGsmSignalStrength();
                    dVar.s = gsmSignalStrength == 99 ? Integer.MAX_VALUE : b(gsmSignalStrength);
                }
                dVar.f6857r = false;
                this.m.a(dVar);
                this.f6858a.add(dVar);
                return;
            }
            if (cellLocation instanceof CdmaCellLocation) {
                CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
                d dVar2 = new d(2, true);
                dVar2.f6854a = Integer.parseInt(strArrA[0]);
                dVar2.f6855b = Integer.parseInt(strArrA[1]);
                dVar2.f = cdmaCellLocation.getBaseStationLatitude();
                dVar2.g = cdmaCellLocation.getBaseStationLongitude();
                dVar2.h = cdmaCellLocation.getSystemId();
                dVar2.i = cdmaCellLocation.getNetworkId();
                dVar2.j = cdmaCellLocation.getBaseStationId();
                SignalStrength signalStrength2 = this.d;
                if (signalStrength2 != null) {
                    dVar2.s = signalStrength2.getCdmaDbm();
                }
                dVar2.f6857r = false;
                this.m.a(dVar2);
                this.f6858a.add(dVar2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(List<CellInfo> list) {
        d dVarA;
        try {
            ArrayList<d> arrayList = this.l;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (list != null && list.size() > 0) {
                for (int i = 0; i < list.size(); i++) {
                    CellInfo cellInfo = list.get(i);
                    if (cellInfo != null) {
                        boolean zIsRegistered = cellInfo.isRegistered();
                        if (cellInfo instanceof CellInfoCdma) {
                            dVarA = a((CellInfoCdma) cellInfo, zIsRegistered);
                        } else if (cellInfo instanceof CellInfoGsm) {
                            dVarA = a((CellInfoGsm) cellInfo, zIsRegistered);
                        } else if (cellInfo instanceof CellInfoWcdma) {
                            dVarA = a((CellInfoWcdma) cellInfo, zIsRegistered);
                        } else if (cellInfo instanceof CellInfoLte) {
                            dVarA = a((CellInfoLte) cellInfo, zIsRegistered);
                        } else {
                            dVarA = (Build.VERSION.SDK_INT < 29 || !qms.a(cellInfo)) ? null : a(vms.a(cellInfo), zIsRegistered);
                        }
                        if (dVarA != null) {
                            this.m.a(dVarA);
                            dVarA.m = (short) Math.min(WebSocketProtocol.PAYLOAD_SHORT_MAX, this.m.e(dVarA));
                            dVarA.f6857r = true;
                            this.l.add(dVarA);
                        }
                    }
                }
                this.i = false;
                ArrayList<d> arrayList2 = this.l;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    this.i = true;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @SuppressLint({"NewApi"})
    private static d a(CellInfoGsm cellInfoGsm, boolean z) {
        if (cellInfoGsm == null || cellInfoGsm.getCellIdentity() == null) {
            return null;
        }
        CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
        d dVarA = a(1, z, cellIdentity.getMcc(), cellIdentity.getMnc(), cellIdentity.getLac(), cellIdentity.getCid(), cellInfoGsm.getCellSignalStrength().getDbm());
        dVarA.o = cellInfoGsm.getCellIdentity().getBsic();
        dVarA.p = cellInfoGsm.getCellIdentity().getArfcn();
        dVarA.q = cellInfoGsm.getCellSignalStrength().getTimingAdvance();
        dVarA.s = cellInfoGsm.getCellSignalStrength().getDbm();
        return dVarA;
    }

    private static d a(CellInfoWcdma cellInfoWcdma, boolean z) {
        if (cellInfoWcdma == null || cellInfoWcdma.getCellIdentity() == null) {
            return null;
        }
        CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();
        d dVarA = a(4, z, cellIdentity.getMcc(), cellIdentity.getMnc(), cellIdentity.getLac(), cellIdentity.getCid(), cellInfoWcdma.getCellSignalStrength().getDbm());
        dVarA.o = cellIdentity.getPsc();
        dVarA.p = cellInfoWcdma.getCellIdentity().getUarfcn();
        dVarA.s = cellInfoWcdma.getCellSignalStrength().getDbm();
        return dVarA;
    }

    private static d a(CellInfoLte cellInfoLte, boolean z) {
        if (cellInfoLte == null || cellInfoLte.getCellIdentity() == null) {
            return null;
        }
        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
        d dVarA = a(3, z, cellIdentity.getMcc(), cellIdentity.getMnc(), cellIdentity.getTac(), cellIdentity.getCi(), cellInfoLte.getCellSignalStrength().getDbm());
        dVarA.o = cellIdentity.getPci();
        dVarA.p = cellIdentity.getEarfcn();
        dVarA.q = cellInfoLte.getCellSignalStrength().getTimingAdvance();
        dVarA.s = cellInfoLte.getCellSignalStrength().getDbm();
        return dVarA;
    }

    private static d a(CellInfoNr cellInfoNr, boolean z) {
        int i;
        if (cellInfoNr == null || cellInfoNr.getCellIdentity() == null) {
            return null;
        }
        CellIdentityNr cellIdentityNrA = cns.a(cellInfoNr.getCellIdentity());
        int tac = cellIdentityNrA.getTac();
        int i2 = 0;
        if (tac == Integer.MAX_VALUE && "HUAWEI".equals(Build.MANUFACTURER)) {
            try {
                tac = com.autonavi.aps.amapapi.utils.g.b(cellIdentityNrA, "getHwTac", new Object[0]);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        long nci = cellIdentityNrA.getNci();
        try {
            i = Integer.parseInt(cellIdentityNrA.getMccString());
            try {
                i2 = Integer.parseInt(cellIdentityNrA.getMncString());
            } catch (Throwable th2) {
                th = th2;
                th.printStackTrace();
            }
        } catch (Throwable th3) {
            th = th3;
            i = 0;
        }
        d dVarA = a(5, z, i, i2, cellIdentityNrA.getTac(), 0, tms.a(cellInfoNr.getCellSignalStrength()).getSsRsrp());
        dVarA.e = nci;
        if (tac > 16777215) {
            dVarA.c = 65535;
        } else if (tac > 65535) {
            dVarA.c = 65535;
            dVarA.q = tac;
        } else {
            dVarA.c = tac;
        }
        dVarA.o = cellIdentityNrA.getPci();
        dVarA.p = cellIdentityNrA.getNrarfcn();
        dVarA.s = cellInfoNr.getCellSignalStrength().getDbm();
        return dVarA;
    }

    private d a(CellInfoCdma cellInfoCdma, boolean z) {
        int i;
        if (cellInfoCdma != null && cellInfoCdma.getCellIdentity() != null) {
            CellIdentityCdma cellIdentity = cellInfoCdma.getCellIdentity();
            if (cellIdentity.getSystemId() > 0 && cellIdentity.getNetworkId() >= 0 && cellIdentity.getBasestationId() >= 0) {
                CellIdentityCdma cellIdentity2 = cellInfoCdma.getCellIdentity();
                String[] strArrA = com.autonavi.aps.amapapi.utils.k.a(this.f6859b);
                int i2 = 0;
                try {
                    i = Integer.parseInt(strArrA[0]);
                    try {
                        i2 = Integer.parseInt(strArrA[1]);
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                    i = 0;
                }
                d dVarA = a(2, z, i, i2, 0, 0, cellInfoCdma.getCellSignalStrength().getCdmaDbm());
                dVarA.h = cellIdentity2.getSystemId();
                dVarA.i = cellIdentity2.getNetworkId();
                dVarA.j = cellIdentity2.getBasestationId();
                dVarA.f = cellIdentity2.getLatitude();
                dVarA.g = cellIdentity2.getLongitude();
                dVarA.s = cellInfoCdma.getCellSignalStrength().getCdmaDbm();
                return dVarA;
            }
        }
        return null;
    }

    private static d a(int i, boolean z, int i2, int i3, int i4, int i5, int i6) {
        d dVar = new d(i, z);
        dVar.f6854a = i2;
        dVar.f6855b = i3;
        dVar.c = i4;
        dVar.d = i5;
        dVar.f6856k = i6;
        return dVar;
    }

    public final void a(com.autonavi.aps.amapapi.c cVar) {
        this.x = cVar;
    }
}
