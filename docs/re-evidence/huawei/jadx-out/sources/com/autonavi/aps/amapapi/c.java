package com.autonavi.aps.amapapi;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.core.view.MotionEventCompat;
import com.amap.api.col.p0003sl.il;
import com.amap.api.col.p0003sl.ip;
import com.amap.api.col.p0003sl.iq;
import com.amap.api.col.p0003sl.iy;
import com.amap.api.col.p0003sl.jt;
import com.amap.api.col.p0003sl.jv;
import com.amap.api.col.p0003sl.kj;
import com.amap.api.col.p0003sl.kq;
import com.amap.api.col.p0003sl.kt;
import com.amap.api.col.p0003sl.lb;
import com.amap.api.col.p0003sl.ld;
import com.amap.api.col.p0003sl.le;
import com.amap.api.col.p0003sl.lk;
import com.amap.api.col.p0003sl.lu;
import com.amap.api.col.p0003sl.lw;
import com.amap.api.col.p0003sl.ma;
import com.amap.api.col.p0003sl.mb;
import com.amap.api.col.p0003sl.mj;
import com.amap.api.col.p0003sl.ml;
import com.amap.api.col.p0003sl.nf;
import com.amap.api.col.p0003sl.ni;
import com.amap.api.col.p0003sl.no;
import com.amap.api.col.p0003sl.np;
import com.amap.api.col.p0003sl.nt;
import com.amap.api.col.p0003sl.nu;
import com.amap.api.col.p0003sl.nv;
import com.autonavi.aps.amapapi.restruct.e;
import com.autonavi.aps.amapapi.restruct.h;
import com.autonavi.aps.amapapi.restruct.k;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements nv {
    private static long k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f3919a;
    nf d;
    ld e;
    private Handler g;
    private LocationManager h;
    private a i;
    private ArrayList<ml> f = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    k f3920b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    e f3921c = null;
    private volatile boolean j = false;

    static /* synthetic */ byte[] f() {
        return a(128);
    }

    c(Context context) {
        this.f3919a = null;
        this.f3919a = context;
        ld ldVar = new ld();
        this.e = ldVar;
        lk.a(this.f3919a, ldVar, jt.k, 100, 1024000, "0");
        ld ldVar2 = this.e;
        int i = com.autonavi.aps.amapapi.utils.b.g;
        boolean z = com.autonavi.aps.amapapi.utils.b.e;
        int i2 = com.autonavi.aps.amapapi.utils.b.f;
        ldVar2.f = new lw(context, i, "kKey", new lu(context, z, i2, i2 * 10, "carrierLocKey"));
        this.e.e = new kj();
    }

    static final class a implements LocationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c f3923a;

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i, Bundle bundle) {
        }

        a(c cVar) {
            this.f3923a = cVar;
        }

        final void a(c cVar) {
            this.f3923a = cVar;
        }

        final void a() {
            this.f3923a = null;
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            try {
                c cVar = this.f3923a;
                if (cVar != null) {
                    cVar.a(location);
                }
            } catch (Throwable unused) {
            }
        }
    }

    final void a() {
        LocationManager locationManager;
        if (com.autonavi.aps.amapapi.utils.k.m(this.f3919a)) {
            new Object[]{"Cl | dl -- c_perm_spc"};
            com.autonavi.aps.amapapi.utils.e.a();
            return;
        }
        try {
            a aVar = this.i;
            if (aVar != null && (locationManager = this.h) != null) {
                locationManager.removeUpdates(aVar);
            }
            a aVar2 = this.i;
            if (aVar2 != null) {
                aVar2.a();
            }
            if (this.j) {
                g();
                this.f3920b.a((c) null);
                this.f3921c.a((c) null);
                this.f3921c = null;
                this.f3920b = null;
                this.g = null;
                this.j = false;
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "clm", "stc");
        }
    }

    public final void a(e eVar, k kVar, Handler handler) {
        LocationManager locationManager;
        new Object[]{"Cl | dl -- sc"};
        com.autonavi.aps.amapapi.utils.e.a();
        if (this.j || eVar == null || kVar == null || handler == null) {
            return;
        }
        if (com.autonavi.aps.amapapi.utils.k.m(this.f3919a)) {
            new Object[]{"Cl | dl -- c_perm_sc"};
            com.autonavi.aps.amapapi.utils.e.a();
            return;
        }
        this.j = true;
        this.f3921c = eVar;
        this.f3920b = kVar;
        kVar.a(this);
        this.f3921c.a(this);
        this.g = handler;
        try {
            if (this.h == null && handler != null) {
                this.h = (LocationManager) this.f3919a.getSystemService("location");
            }
            if (this.i == null) {
                this.i = new a(this);
            }
            this.i.a(this);
            a aVar = this.i;
            if (aVar != null && (locationManager = this.h) != null) {
                locationManager.requestLocationUpdates("passive", 1000L, -1.0f, aVar);
            }
            if (this.d == null) {
                nf nfVar = new nf("6.4.9", il.f(this.f3919a), "S128DF1572465B890OE3F7A13167KLEI", il.c(this.f3919a), this);
                this.d = nfVar;
                nfVar.a(ip.k()).b(ip.f(this.f3919a)).c(ip.a(this.f3919a)).d(ip.e(this.f3919a)).e(ip.n()).f(ip.f()).g(Build.MODEL).h(Build.MANUFACTURER).i(Build.BRAND).a(Build.VERSION.SDK_INT).j(Build.VERSION.RELEASE).a(np.a(ip.h())).k(ip.h());
                nf.b();
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "col", "init");
        }
    }

    public final void b() {
        try {
            com.autonavi.aps.amapapi.utils.e.a();
            Handler handler = this.g;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.autonavi.aps.amapapi.c.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            if (c.this.d == null || c.this.f3920b == null) {
                                return;
                            }
                            nf.b(c.this.f3920b.a());
                        } catch (Throwable th) {
                            com.autonavi.aps.amapapi.utils.c.a(th, "cl", "upwr");
                        }
                    }
                });
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "cl", "upw");
        }
    }

    public final void c() {
        e eVar;
        try {
            com.autonavi.aps.amapapi.utils.e.a();
            if (this.d == null || (eVar = this.f3921c) == null) {
                return;
            }
            nf.a(eVar.a());
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "cl", "upc");
        }
    }

    final class b extends mb {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Location f3926c;

        b(int i) {
            this.f3925b = i;
        }

        b(c cVar, Location location) {
            this(1);
            this.f3926c = location;
        }

        private void a() {
            try {
                com.autonavi.aps.amapapi.utils.e.a();
                if (this.f3926c != null && c.this.j) {
                    if (com.autonavi.aps.amapapi.utils.k.m(c.this.f3919a)) {
                        com.autonavi.aps.amapapi.utils.e.a();
                        return;
                    }
                    Bundle extras = this.f3926c.getExtras();
                    int i = extras != null ? extras.getInt("satellites") : 0;
                    if (com.autonavi.aps.amapapi.utils.k.a(this.f3926c, i)) {
                        return;
                    }
                    if (c.this.f3920b != null && !c.this.f3920b.s) {
                        c.this.f3920b.f();
                    }
                    ArrayList<np> arrayListA = c.this.f3920b.a();
                    List<ni> listA = c.this.f3921c.a();
                    mj.a aVar = new mj.a();
                    no noVar = new no();
                    noVar.i = this.f3926c.getAccuracy();
                    noVar.f = this.f3926c.getAltitude();
                    noVar.d = this.f3926c.getLatitude();
                    noVar.h = this.f3926c.getBearing();
                    noVar.e = this.f3926c.getLongitude();
                    noVar.j = this.f3926c.isFromMockProvider();
                    noVar.f3228a = this.f3926c.getProvider();
                    noVar.g = this.f3926c.getSpeed();
                    noVar.l = (byte) i;
                    noVar.f3229b = System.currentTimeMillis();
                    noVar.f3230c = this.f3926c.getTime();
                    noVar.k = this.f3926c.getTime();
                    aVar.f3201a = noVar;
                    aVar.f3202b = arrayListA;
                    WifiInfo wifiInfoC = c.this.f3920b.c();
                    if (wifiInfoC != null) {
                        aVar.f3203c = np.a(h.a(wifiInfoC));
                    }
                    aVar.d = k.z;
                    aVar.f = this.f3926c.getTime();
                    aVar.g = (byte) ip.i(c.this.f3919a);
                    aVar.h = ip.n(c.this.f3919a);
                    aVar.e = c.this.f3920b.l();
                    aVar.j = com.autonavi.aps.amapapi.utils.k.a(c.this.f3919a);
                    aVar.i = listA;
                    ml mlVarA = nf.a(aVar);
                    if (mlVarA == null) {
                        return;
                    }
                    synchronized (c.this.f) {
                        c.this.f.add(mlVarA);
                        if (c.this.f.size() >= 5) {
                            c.this.e();
                        }
                    }
                    c.this.d();
                }
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, "cl", "coll");
            }
        }

        /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
        private void b() {
            List listB;
            new Object[]{"Cl | dl -- duts"};
            com.autonavi.aps.amapapi.utils.e.a();
            if (!com.autonavi.aps.amapapi.utils.k.m(c.this.f3919a)) {
                kq kqVarA = null;
                try {
                    try {
                        long unused = c.k = System.currentTimeMillis();
                        if (c.this.e.f.d()) {
                            kqVarA = kq.a(new File(c.this.e.f3040a), c.this.e.f3041b);
                            ArrayList arrayList = new ArrayList();
                            byte[] bArrF = c.f();
                            if (bArrF != null && (listB = c.b(kqVarA, c.this.e, arrayList, bArrF)) != null && listB.size() != 0) {
                                c.this.e.f.a_(true);
                                if (nf.a(iy.b(nf.a(com.autonavi.aps.amapapi.security.a.a(bArrF), iq.b(bArrF, nf.a(), iy.c()), listB)))) {
                                    c.b(kqVarA, arrayList);
                                }
                                if (kqVarA == null) {
                                    return;
                                }
                            }
                        } else if (kqVarA == null) {
                            return;
                        }
                        kqVarA.close();
                        return;
                    } catch (Throwable unused2) {
                        return;
                    }
                } catch (Throwable th) {
                    try {
                        jv.c(th, "leg", "uts");
                        if (kqVarA != null) {
                            kqVarA.close();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        if (kqVarA != null) {
                            try {
                                kqVarA.close();
                            } catch (Throwable unused3) {
                            }
                        }
                        throw th2;
                    }
                }
            }
            new Object[]{"Cl | dl -- c_perm_duts"};
            com.autonavi.aps.amapapi.utils.e.a();
        }

        @Override // com.amap.api.col.p0003sl.mb
        public final void runTask() {
            int i = this.f3925b;
            if (i == 1) {
                a();
            } else if (i == 2) {
                b();
            } else if (i == 3) {
                c.this.g();
            }
        }
    }

    public final void a(Location location) {
        try {
            Handler handler = this.g;
            if (handler != null) {
                handler.post(new b(this, location));
            }
        } catch (Throwable th) {
            jv.c(th, "cl", "olcc");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        try {
            com.autonavi.aps.amapapi.utils.e.a();
            if (com.autonavi.aps.amapapi.utils.k.m(this.f3919a)) {
                com.autonavi.aps.amapapi.utils.e.a();
                return;
            }
            ArrayList<ml> arrayList = this.f;
            if (arrayList != null && arrayList.size() != 0) {
                ArrayList<ml> arrayList2 = new ArrayList();
                synchronized (this.f) {
                    arrayList2.addAll(this.f);
                    this.f.clear();
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArrA = a(256);
                if (bArrA == null) {
                    return;
                }
                byteArrayOutputStream.write(c(bArrA.length));
                byteArrayOutputStream.write(bArrA);
                for (ml mlVar : arrayList2) {
                    byte[] bArrB = mlVar.b();
                    if (bArrB.length >= 10 && bArrB.length <= 65535) {
                        byte[] bArrB2 = iq.b(bArrA, bArrB, iy.c());
                        byteArrayOutputStream.write(c(bArrB2.length));
                        byteArrayOutputStream.write(bArrB2);
                        byteArrayOutputStream.write(b(mlVar.a()));
                    }
                }
                le.a(Long.toString(System.currentTimeMillis()), byteArrayOutputStream.toByteArray(), this.e);
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "clm", "wtD");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(kq kqVar, List<String> list) {
        if (kqVar != null) {
            try {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    kqVar.c(it.next());
                }
                kqVar.close();
            } catch (Throwable th) {
                jv.c(th, "aps", "dlo");
            }
        }
    }

    public final void d() {
        try {
            if (com.autonavi.aps.amapapi.utils.k.m(this.f3919a)) {
                com.autonavi.aps.amapapi.utils.e.a();
            } else {
                if (System.currentTimeMillis() - k < 60000) {
                    return;
                }
                ma.a().a(new b(2));
            }
        } catch (Throwable unused) {
        }
    }

    public final void e() {
        try {
            ma.a().a(new b(3));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:102:0x0101 A[EXC_TOP_SPLITTER, PHI: r5 r9 r16
      0x0101: PHI (r5v3 int) = (r5v4 int), (r5v5 int) binds: [B:68:0x00ff, B:54:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      0x0101: PHI (r9v1 com.amap.api.col.3sl.kq$b) = (r9v2 com.amap.api.col.3sl.kq$b), (r9v3 com.amap.api.col.3sl.kq$b) binds: [B:68:0x00ff, B:54:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      0x0101: PHI (r16v3 java.lang.String[]) = (r16v4 java.lang.String[]), (r16v6 java.lang.String[]) binds: [B:68:0x00ff, B:54:0x00d3] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x00e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static List<ml> b(kq kqVar, ld ldVar, List<String> list, byte[] bArr) {
        String[] list2;
        String[] strArr;
        kq.b bVarA;
        ArrayList arrayList = new ArrayList();
        try {
            File fileB = kqVar.b();
            if (fileB != null && fileB.exists() && (list2 = fileB.list()) != null) {
                int length = list2.length;
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    String str = list2[i2];
                    if (str.contains(".0")) {
                        InputStream inputStreamA = null;
                        try {
                            String str2 = str.split("\\.")[i];
                            try {
                                bVarA = kqVar.a(str2);
                                if (bVarA != null) {
                                    try {
                                        inputStreamA = bVarA.a();
                                        if (inputStreamA == null) {
                                            if (inputStreamA != null) {
                                                try {
                                                    inputStreamA.close();
                                                } catch (Throwable unused) {
                                                }
                                            }
                                            if (bVarA != null) {
                                                bVarA.close();
                                            }
                                        } else {
                                            byte[] bArr2 = new byte[2];
                                            inputStreamA.read(bArr2);
                                            int iB = com.autonavi.aps.amapapi.utils.k.b(bArr2);
                                            if (iB == 0 || iB > 65535) {
                                                if (inputStreamA != null) {
                                                    try {
                                                        inputStreamA.close();
                                                    } catch (Throwable unused2) {
                                                    }
                                                }
                                                if (bVarA == null) {
                                                    break;
                                                }
                                                try {
                                                    bVarA.close();
                                                    break;
                                                } catch (Throwable unused3) {
                                                    break;
                                                }
                                            }
                                            byte[] bArr3 = new byte[iB];
                                            inputStreamA.read(bArr3);
                                            byte[] bArr4 = new byte[2];
                                            int length2 = i;
                                            while (inputStreamA.read(bArr4) >= 0) {
                                                try {
                                                    byte[] bArr5 = new byte[com.autonavi.aps.amapapi.utils.k.b(bArr4)];
                                                    inputStreamA.read(bArr5);
                                                    byte[] bArrA = iq.a(bArr3, bArr5, iy.c());
                                                    length2 += bArrA.length;
                                                    byte[] bArr6 = new byte[4];
                                                    inputStreamA.read(bArr6);
                                                    strArr = list2;
                                                    try {
                                                        arrayList.add(new ml(a(bArr6), iq.b(bArr, iy.b(bArrA), iy.c())));
                                                        list2 = strArr;
                                                    } catch (Throwable unused4) {
                                                        if (inputStreamA != null) {
                                                            try {
                                                                inputStreamA.close();
                                                            } catch (Throwable unused5) {
                                                            }
                                                        }
                                                        if (bVarA != null) {
                                                            try {
                                                                bVarA.close();
                                                            } catch (Throwable unused6) {
                                                            }
                                                        }
                                                        i2++;
                                                        list2 = strArr;
                                                        i = 0;
                                                    }
                                                } catch (Throwable unused7) {
                                                    strArr = list2;
                                                }
                                            }
                                            strArr = list2;
                                            i3 += length2;
                                            try {
                                                list.add(str2);
                                                try {
                                                    if (i3 > ldVar.f.a()) {
                                                        if (inputStreamA != null) {
                                                            try {
                                                                inputStreamA.close();
                                                            } catch (Throwable unused8) {
                                                            }
                                                        }
                                                        if (bVarA == null) {
                                                            break;
                                                        }
                                                        bVarA.close();
                                                        break;
                                                    }
                                                    if (inputStreamA != null) {
                                                        try {
                                                            inputStreamA.close();
                                                        } catch (Throwable unused9) {
                                                        }
                                                    }
                                                    if (bVarA != null) {
                                                        bVarA.close();
                                                    }
                                                } catch (Throwable unused10) {
                                                    if (inputStreamA != null) {
                                                        inputStreamA.close();
                                                    }
                                                    if (bVarA != null) {
                                                        bVarA.close();
                                                    }
                                                }
                                            } catch (Throwable unused11) {
                                            }
                                        }
                                    } catch (Throwable unused12) {
                                        strArr = list2;
                                    }
                                } else if (bVarA != null) {
                                    try {
                                        bVarA.close();
                                    } catch (Throwable unused13) {
                                    }
                                }
                            } catch (Throwable unused14) {
                                strArr = list2;
                                bVarA = null;
                                if (inputStreamA != null) {
                                    inputStreamA.close();
                                }
                                if (bVarA != null) {
                                    bVarA.close();
                                }
                                i2++;
                                list2 = strArr;
                                i = 0;
                            }
                        } catch (Throwable unused15) {
                        }
                        i2++;
                        list2 = strArr;
                        i = 0;
                    }
                    strArr = list2;
                    i2++;
                    list2 = strArr;
                    i = 0;
                }
            }
        } catch (Throwable th) {
            jv.c(th, "aps", "upc");
        }
        return arrayList;
    }

    @Override // com.amap.api.col.p0003sl.nv
    public final nu a(nt ntVar) {
        try {
            com.autonavi.aps.amapapi.trans.b bVar = new com.autonavi.aps.amapapi.trans.b();
            bVar.a(ntVar.f3238b);
            bVar.a(ntVar.f3237a);
            bVar.a(ntVar.d);
            kt.a();
            lb lbVarA = kt.a(bVar);
            nu nuVar = new nu();
            nuVar.f3242c = lbVarA.f3037a;
            nuVar.f3241b = lbVarA.f3038b;
            nuVar.f3240a = 200;
            return nuVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static byte[] a(int i) {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            if (keyGenerator == null) {
                return null;
            }
            keyGenerator.init(i);
            return keyGenerator.generateKey().getEncoded();
        } catch (Throwable unused) {
            return null;
        }
    }

    private static int a(byte[] bArr) {
        return ((bArr[0] & 255) << 24) | (bArr[3] & 255) | ((bArr[2] & 255) << 8) | ((bArr[1] & 255) << 16);
    }

    private static byte[] b(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    private static byte[] c(int i) {
        return new byte[]{(byte) ((i & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8), (byte) (i & 255)};
    }
}
