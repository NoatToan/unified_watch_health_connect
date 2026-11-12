package com.autonavi.aps.amapapi;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.amap.api.col.p0003sl.b1;
import com.amap.api.col.p0003sl.j1;
import com.amap.api.col.p0003sl.ni;
import com.autonavi.aps.amapapi.restruct.e;
import com.autonavi.aps.amapapi.restruct.h;
import com.autonavi.aps.amapapi.restruct.k;
import com.xiaomi.onetrack.util.z;
import defpackage.b6t;
import defpackage.bbt;
import defpackage.cbt;
import defpackage.e0t;
import defpackage.f7t;
import defpackage.gbt;
import defpackage.h0t;
import defpackage.h6t;
import defpackage.hbt;
import defpackage.ibt;
import defpackage.j0t;
import defpackage.j4t;
import defpackage.k2t;
import defpackage.m2t;
import defpackage.p0t;
import defpackage.q4t;
import defpackage.q7t;
import defpackage.s6t;
import defpackage.u6t;
import defpackage.v5t;
import defpackage.wat;
import defpackage.y7t;
import defpackage.z5t;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements ibt {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static long f6830k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f6831a;
    wat d;
    z5t e;
    private Handler g;
    private LocationManager h;
    private a i;
    private ArrayList<y7t> f = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    k f6832b = null;
    e c = null;
    private volatile boolean j = false;

    public static class a implements LocationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c f6834a;

        public a(c cVar) {
            this.f6834a = cVar;
        }

        public final void a(c cVar) {
            this.f6834a = cVar;
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            try {
                c cVar = this.f6834a;
                if (cVar != null) {
                    cVar.a(location);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i, Bundle bundle) {
        }

        public final void a() {
            this.f6834a = null;
        }
    }

    public c(Context context) {
        this.f6831a = null;
        this.f6831a = context;
        z5t z5tVar = new z5t();
        this.e = z5tVar;
        h6t.f(this.f6831a, z5tVar, k2t.h, 100, 1024000, "0");
        z5t z5tVar2 = this.e;
        int i = com.autonavi.aps.amapapi.utils.b.g;
        boolean z = com.autonavi.aps.amapapi.utils.b.e;
        int i2 = com.autonavi.aps.amapapi.utils.b.f;
        z5tVar2.f = new u6t(context, i, "kKey", new s6t(context, z, i2, i2 * 10, "carrierLocKey"));
        this.e.e = new j4t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(q4t q4tVar, List<String> list) {
        if (q4tVar != null) {
            try {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    q4tVar.M(it.next());
                }
                q4tVar.close();
            } catch (Throwable th) {
                m2t.r(th, "aps", "dlo");
            }
        }
    }

    public static /* synthetic */ byte[] f() {
        return a(128);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        try {
            com.autonavi.aps.amapapi.utils.e.a();
            if (com.autonavi.aps.amapapi.utils.k.m(this.f6831a)) {
                com.autonavi.aps.amapapi.utils.e.a();
                return;
            }
            ArrayList<y7t> arrayList = this.f;
            if (arrayList != null && arrayList.size() != 0) {
                ArrayList<y7t> arrayList2 = new ArrayList();
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
                for (y7t y7tVar : arrayList2) {
                    byte[] bArrB = y7tVar.b();
                    if (bArrB.length >= 10 && bArrB.length <= 65535) {
                        byte[] bArrH = j0t.h(bArrA, bArrB, p0t.u());
                        byteArrayOutputStream.write(c(bArrH.length));
                        byteArrayOutputStream.write(bArrH);
                        byteArrayOutputStream.write(b(y7tVar.a()));
                    }
                }
                b6t.b(Long.toString(System.currentTimeMillis()), byteArrayOutputStream.toByteArray(), this.e);
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "clm", "wtD");
        }
    }

    public final void d() {
        try {
            if (com.autonavi.aps.amapapi.utils.k.m(this.f6831a)) {
                com.autonavi.aps.amapapi.utils.e.a();
            } else {
                if (System.currentTimeMillis() - f6830k < 60000) {
                    return;
                }
                j1.h().b(new b(2));
            }
        } catch (Throwable unused) {
        }
    }

    public final void e() {
        try {
            j1.h().b(new b(3));
        } catch (Throwable unused) {
        }
    }

    public class b extends f7t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f6836b;
        private Location c;

        public b(int i) {
            this.f6836b = i;
        }

        private void a() {
            try {
                com.autonavi.aps.amapapi.utils.e.a();
                if (this.c != null && c.this.j) {
                    if (com.autonavi.aps.amapapi.utils.k.m(c.this.f6831a)) {
                        com.autonavi.aps.amapapi.utils.e.a();
                        return;
                    }
                    Bundle extras = this.c.getExtras();
                    int i = extras != null ? extras.getInt("satellites") : 0;
                    if (com.autonavi.aps.amapapi.utils.k.a(this.c, i)) {
                        return;
                    }
                    k kVar = c.this.f6832b;
                    if (kVar != null && !kVar.s) {
                        kVar.f();
                    }
                    ArrayList<cbt> arrayListA = c.this.f6832b.a();
                    List<ni> listA = c.this.c.a();
                    q7t.a aVar = new q7t.a();
                    bbt bbtVar = new bbt();
                    bbtVar.i = this.c.getAccuracy();
                    bbtVar.f = this.c.getAltitude();
                    bbtVar.d = this.c.getLatitude();
                    bbtVar.h = this.c.getBearing();
                    bbtVar.e = this.c.getLongitude();
                    bbtVar.j = this.c.isFromMockProvider();
                    bbtVar.f868a = this.c.getProvider();
                    bbtVar.g = this.c.getSpeed();
                    bbtVar.l = (byte) i;
                    bbtVar.f869b = System.currentTimeMillis();
                    bbtVar.c = this.c.getTime();
                    bbtVar.f4039k = this.c.getTime();
                    aVar.f31207a = bbtVar;
                    aVar.f31208b = arrayListA;
                    WifiInfo wifiInfoC = c.this.f6832b.c();
                    if (wifiInfoC != null) {
                        aVar.c = cbt.a(h.a(wifiInfoC));
                    }
                    aVar.d = k.z;
                    aVar.f = this.c.getTime();
                    aVar.g = (byte) h0t.I(c.this.f6831a);
                    aVar.h = h0t.S(c.this.f6831a);
                    aVar.e = c.this.f6832b.l();
                    aVar.j = com.autonavi.aps.amapapi.utils.k.a(c.this.f6831a);
                    aVar.i = listA;
                    y7t y7tVarA = wat.a(aVar);
                    if (y7tVarA == null) {
                        return;
                    }
                    synchronized (c.this.f) {
                        try {
                            c.this.f.add(y7tVarA);
                            if (c.this.f.size() >= 5) {
                                c.this.e();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    c.this.d();
                }
            } catch (Throwable th2) {
                com.autonavi.aps.amapapi.utils.c.a(th2, "cl", "coll");
            }
        }

        private void b() {
            com.autonavi.aps.amapapi.utils.e.a();
            if (com.autonavi.aps.amapapi.utils.k.m(c.this.f6831a)) {
                com.autonavi.aps.amapapi.utils.e.a();
                return;
            }
            q4t q4tVarC = null;
            try {
                long unused = c.f6830k = System.currentTimeMillis();
                if (c.this.e.f.e()) {
                    q4tVarC = q4t.c(new File(c.this.e.f40930a), c.this.e.f40931b);
                    ArrayList arrayList = new ArrayList();
                    byte[] bArrF = c.f();
                    if (bArrF == null) {
                        try {
                            q4tVarC.close();
                            return;
                        } catch (Throwable unused2) {
                            return;
                        }
                    }
                    List listB = c.b(q4tVarC, c.this.e, arrayList, bArrF);
                    if (listB != null && listB.size() != 0) {
                        c.this.e.f.c(true);
                        if (wat.f(p0t.s(wat.h(com.autonavi.aps.amapapi.security.a.a(bArrF), j0t.h(bArrF, wat.g(), p0t.u()), listB)))) {
                            c.b(q4tVarC, arrayList);
                        }
                    }
                    try {
                        q4tVarC.close();
                        return;
                    } catch (Throwable unused3) {
                        return;
                    }
                }
                if (q4tVarC != null) {
                    try {
                        q4tVarC.close();
                    } catch (Throwable unused4) {
                    }
                }
            } catch (Throwable th) {
                try {
                    m2t.r(th, "leg", "uts");
                } finally {
                    if (q4tVarC != null) {
                        try {
                            q4tVarC.close();
                        } catch (Throwable unused5) {
                        }
                    }
                }
            }
        }

        @Override // defpackage.f7t
        public final void runTask() {
            int i = this.f6836b;
            if (i == 1) {
                a();
            } else if (i == 2) {
                b();
            } else if (i == 3) {
                c.this.g();
            }
        }

        public b(c cVar, Location location) {
            this(1);
            this.c = location;
        }
    }

    public final void c() {
        e eVar;
        try {
            com.autonavi.aps.amapapi.utils.e.a();
            if (this.d == null || (eVar = this.c) == null) {
                return;
            }
            wat.e(eVar.a());
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "cl", "upc");
        }
    }

    public final void a() {
        LocationManager locationManager;
        if (com.autonavi.aps.amapapi.utils.k.m(this.f6831a)) {
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
                this.f6832b.a((c) null);
                this.c.a((c) null);
                this.c = null;
                this.f6832b = null;
                this.g = null;
                this.j = false;
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "clm", "stc");
        }
    }

    private static byte[] c(int i) {
        return new byte[]{(byte) ((i & 65280) >> 8), (byte) (i & 255)};
    }

    public final void b() {
        try {
            com.autonavi.aps.amapapi.utils.e.a();
            Handler handler = this.g;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.autonavi.aps.amapapi.c.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        k kVar;
                        try {
                            c cVar = c.this;
                            if (cVar.d == null || (kVar = cVar.f6832b) == null) {
                                return;
                            }
                            wat.k(kVar.a());
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:105:0x00d5 A[EXC_TOP_SPLITTER, PHI: r5 r9 r16
      0x00d5: PHI (r5v3 int) = (r5v4 int), (r5v5 int), (r5v5 int) binds: [B:60:0x00f7, B:75:0x00d5, B:50:0x00d2] A[DONT_GENERATE, DONT_INLINE]
      0x00d5: PHI (r9v1 q4t$e) = (r9v2 q4t$e), (r9v3 q4t$e), (r9v3 q4t$e) binds: [B:60:0x00f7, B:75:0x00d5, B:50:0x00d2] A[DONT_GENERATE, DONT_INLINE]
      0x00d5: PHI (r16v3 java.lang.String[]) = (r16v4 java.lang.String[]), (r16v6 java.lang.String[]), (r16v6 java.lang.String[]) binds: [B:60:0x00f7, B:75:0x00d5, B:50:0x00d2] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static List<y7t> b(q4t q4tVar, z5t z5tVar, List<String> list, byte[] bArr) {
        String[] list2;
        String[] strArr;
        q4t.e eVarB;
        ArrayList arrayList = new ArrayList();
        try {
            File fileY = q4tVar.y();
            if (fileY == null || !fileY.exists() || (list2 = fileY.list()) == null) {
                return arrayList;
            }
            int length = list2.length;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                String str = list2[i2];
                if (str.contains(".0")) {
                    InputStream inputStreamA = null;
                    try {
                        String str2 = str.split(z.f14007a)[i];
                        try {
                            eVarB = q4tVar.b(str2);
                            try {
                                if (eVarB != null) {
                                    try {
                                        inputStreamA = eVarB.a();
                                        if (inputStreamA != null) {
                                            byte[] bArr2 = new byte[2];
                                            inputStreamA.read(bArr2);
                                            int iB = com.autonavi.aps.amapapi.utils.k.b(bArr2);
                                            if (iB != 0 && iB <= 65535) {
                                                byte[] bArr3 = new byte[iB];
                                                inputStreamA.read(bArr3);
                                                byte[] bArr4 = new byte[2];
                                                int length2 = i;
                                                while (inputStreamA.read(bArr4) >= 0) {
                                                    try {
                                                        byte[] bArr5 = new byte[com.autonavi.aps.amapapi.utils.k.b(bArr4)];
                                                        inputStreamA.read(bArr5);
                                                        byte[] bArrE = j0t.e(bArr3, bArr5, p0t.u());
                                                        length2 += bArrE.length;
                                                        byte[] bArr6 = new byte[4];
                                                        inputStreamA.read(bArr6);
                                                        strArr = list2;
                                                        try {
                                                            arrayList.add(new y7t(a(bArr6), j0t.h(bArr, p0t.s(bArrE), p0t.u())));
                                                            list2 = strArr;
                                                        } catch (Throwable unused) {
                                                            if (inputStreamA != null) {
                                                                try {
                                                                    inputStreamA.close();
                                                                } catch (Throwable unused2) {
                                                                }
                                                            }
                                                            if (eVarB != null) {
                                                                try {
                                                                    eVarB.close();
                                                                } catch (Throwable unused3) {
                                                                }
                                                            }
                                                            i2++;
                                                            list2 = strArr;
                                                            i = 0;
                                                        }
                                                    } catch (Throwable unused4) {
                                                        strArr = list2;
                                                    }
                                                }
                                                strArr = list2;
                                                i3 += length2;
                                                try {
                                                    list.add(str2);
                                                    try {
                                                        if (i3 <= z5tVar.f.a()) {
                                                            try {
                                                                inputStreamA.close();
                                                            } catch (Throwable unused5) {
                                                            }
                                                            eVarB.close();
                                                            i2++;
                                                            list2 = strArr;
                                                            i = 0;
                                                        }
                                                    } catch (Throwable unused6) {
                                                        if (inputStreamA != null) {
                                                            inputStreamA.close();
                                                        }
                                                        if (eVarB != null) {
                                                        }
                                                        i2++;
                                                        list2 = strArr;
                                                        i = 0;
                                                    }
                                                } catch (Throwable unused7) {
                                                }
                                            }
                                            try {
                                                inputStreamA.close();
                                            } catch (Throwable unused8) {
                                            }
                                            try {
                                                eVarB.close();
                                                break;
                                            } catch (Throwable unused9) {
                                                break;
                                            }
                                        }
                                        if (inputStreamA != null) {
                                            try {
                                                inputStreamA.close();
                                            } catch (Throwable unused10) {
                                            }
                                        }
                                    } catch (Throwable unused11) {
                                        strArr = list2;
                                    }
                                    if (inputStreamA != null) {
                                        inputStreamA.close();
                                    }
                                    if (eVarB != null) {
                                        eVarB.close();
                                    }
                                    i2++;
                                    list2 = strArr;
                                    i = 0;
                                } else if (eVarB != null) {
                                }
                                eVarB.close();
                            } catch (Throwable unused12) {
                            }
                        } catch (Throwable unused13) {
                            strArr = list2;
                            eVarB = null;
                        }
                    } catch (Throwable unused14) {
                    }
                }
                strArr = list2;
                i2++;
                list2 = strArr;
                i = 0;
            }
            return arrayList;
        } catch (Throwable th) {
            m2t.r(th, "aps", "upc");
        }
        return arrayList;
    }

    public final void a(e eVar, k kVar, Handler handler) {
        LocationManager locationManager;
        com.autonavi.aps.amapapi.utils.e.a();
        if (this.j || eVar == null || kVar == null || handler == null) {
            return;
        }
        if (com.autonavi.aps.amapapi.utils.k.m(this.f6831a)) {
            com.autonavi.aps.amapapi.utils.e.a();
            return;
        }
        this.j = true;
        this.c = eVar;
        this.f6832b = kVar;
        kVar.a(this);
        this.c.a(this);
        this.g = handler;
        try {
            if (this.h == null) {
                this.h = (LocationManager) this.f6831a.getSystemService("location");
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
                wat watVar = new wat("6.4.9", e0t.k(this.f6831a), "S128DF1572465B890OE3F7A13167KLEI", e0t.g(this.f6831a), this);
                this.d = watVar;
                watVar.d(h0t.N()).i(h0t.D(this.f6831a)).l(h0t.n(this.f6831a)).m(h0t.B(this.f6831a)).n(h0t.R()).o(h0t.C()).p(Build.MODEL).q(Build.MANUFACTURER).r(Build.BRAND).b(Build.VERSION.SDK_INT).s(Build.VERSION.RELEASE).c(cbt.a(h0t.G())).t(h0t.G());
                wat.j();
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "col", "init");
        }
    }

    private static byte[] b(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public final void a(Location location) {
        try {
            Handler handler = this.g;
            if (handler != null) {
                handler.post(new b(this, location));
            }
        } catch (Throwable th) {
            m2t.r(th, "cl", "olcc");
        }
    }

    @Override // defpackage.ibt
    public final hbt a(gbt gbtVar) {
        try {
            com.autonavi.aps.amapapi.trans.b bVar = new com.autonavi.aps.amapapi.trans.b();
            bVar.a(gbtVar.f18819b);
            bVar.a(gbtVar.f18818a);
            bVar.a(gbtVar.d);
            b1.b();
            v5t v5tVarD = b1.d(bVar);
            hbt hbtVar = new hbt();
            hbtVar.c = v5tVarD.f36513a;
            hbtVar.f19921b = v5tVarD.f36514b;
            hbtVar.f19920a = 200;
            return hbtVar;
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
}
