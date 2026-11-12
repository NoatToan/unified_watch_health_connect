package com.loc;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: classes18.dex */
public final class dn implements dj {
    private static long k;
    public Context a;
    public ct d;
    public aw e;
    private Handler g;
    private LocationManager h;
    private a i;
    private ArrayList<bz> f = new ArrayList<>();
    public dw b = null;
    public dv c = null;
    private volatile boolean j = false;

    public static class a implements LocationListener {
        private dn a;

        public a(dn dnVar) {
            this.a = dnVar;
        }

        public final void a() {
            this.a = null;
        }

        public final void a(dn dnVar) {
            this.a = dnVar;
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            try {
                dn dnVar = this.a;
                if (dnVar != null) {
                    dnVar.a(location);
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
    }

    public class b implements Runnable {
        private int b;
        private Location c;

        public b(int i) {
            this.b = 0;
            this.b = i;
        }

        public b(dn dnVar, Location location) {
            this(1);
            this.c = location;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = this.b;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        dn.this.f();
                        return;
                    }
                    return;
                }
                ao aoVarA = null;
                try {
                    long unused = dn.k = System.currentTimeMillis();
                    if (dn.this.e.f.c()) {
                        aoVarA = ao.a(new File(dn.this.e.a), dn.this.e.b);
                        ArrayList arrayList = new ArrayList();
                        byte[] bArrE = dn.e();
                        if (bArrE == null) {
                            try {
                                aoVarA.close();
                                return;
                            } catch (Throwable unused2) {
                                return;
                            }
                        }
                        List listB = dn.b(aoVarA, dn.this.e, arrayList, bArrE);
                        if (listB != null && listB.size() != 0) {
                            dn.this.e.f.a(true);
                            if (ct.a(u.b(ct.a(dx.a(bArrE), o.b(bArrE, ct.a(), u.c()), listB)))) {
                                dn.a(aoVarA, arrayList);
                            }
                        }
                        try {
                            aoVarA.close();
                            return;
                        } catch (Throwable unused3) {
                            return;
                        }
                    }
                    if (aoVarA != null) {
                        try {
                            aoVarA.close();
                            return;
                        } catch (Throwable unused4) {
                            return;
                        }
                    }
                    return;
                } catch (Throwable th) {
                    try {
                        ab.b(th, "leg", "uts");
                        if (aoVarA != null) {
                            try {
                                return;
                            } catch (Throwable unused5) {
                                return;
                            }
                        }
                        return;
                    } finally {
                        if (aoVarA != null) {
                            try {
                                aoVarA.close();
                            } catch (Throwable unused6) {
                            }
                        }
                    }
                }
            }
            try {
                if (this.c != null && dn.this.j) {
                    Bundle extras = this.c.getExtras();
                    int i2 = extras != null ? extras.getInt("satellites") : 0;
                    if (eo.a(this.c, i2)) {
                        return;
                    }
                    dw dwVar = dn.this.b;
                    if (dwVar != null && !dwVar.r) {
                        dwVar.f();
                    }
                    ArrayList<dc> arrayListA = dn.this.b.a();
                    List<cv> listA = dn.this.c.a();
                    bx.a aVar = new bx.a();
                    db dbVar = new db();
                    dbVar.i = this.c.getAccuracy();
                    dbVar.f = this.c.getAltitude();
                    dbVar.d = this.c.getLatitude();
                    dbVar.h = this.c.getBearing();
                    dbVar.e = this.c.getLongitude();
                    dbVar.j = this.c.isFromMockProvider();
                    dbVar.a = this.c.getProvider();
                    dbVar.g = this.c.getSpeed();
                    dbVar.l = (byte) i2;
                    dbVar.b = System.currentTimeMillis();
                    dbVar.c = this.c.getTime();
                    dbVar.k = this.c.getTime();
                    aVar.a = dbVar;
                    aVar.b = arrayListA;
                    WifiInfo wifiInfoC = dn.this.b.c();
                    if (wifiInfoC != null) {
                        aVar.c = dc.a(wifiInfoC.getBSSID());
                    }
                    aVar.d = dw.w;
                    aVar.f = this.c.getTime();
                    aVar.g = (byte) n.p(dn.this.a);
                    aVar.h = n.u(dn.this.a);
                    dn dnVar = dn.this;
                    aVar.e = dnVar.b.q;
                    aVar.j = eo.a(dnVar.a);
                    aVar.i = listA;
                    bz bzVarA = ct.a(aVar);
                    if (bzVarA == null) {
                        return;
                    }
                    synchronized (dn.this.f) {
                        dn.this.f.add(bzVarA);
                        if (dn.this.f.size() >= 5) {
                            try {
                                ab.d().submit(dn.this.new b(3));
                            } catch (Throwable unused7) {
                            }
                        }
                    }
                    dn.this.d();
                }
            } catch (Throwable th2) {
                ei.a(th2, "cl", "coll");
            }
        }
    }

    public dn(Context context) {
        this.a = null;
        this.a = context;
        aw awVar = new aw();
        this.e = awVar;
        bc.a(this.a, awVar, z.k, 100, 1024000, "0");
        aw awVar2 = this.e;
        int i = eh.l;
        boolean z = eh.j;
        int i2 = eh.k;
        awVar2.f = new bo(context, i, "kKey", new bm(context, z, i2, i2 * 10, "carrierLocKey"));
        this.e.e = new am();
    }

    public static /* synthetic */ void a(ao aoVar, List list) {
        if (aoVar != null) {
            try {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    aoVar.c((String) it2.next());
                }
                aoVar.close();
            } catch (Throwable th) {
                ab.b(th, "aps", "dlo");
            }
        }
    }

    private static byte[] a(int i) {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(com.huami.network.hmnetwork.utils.a.a);
            if (keyGenerator == null) {
                return null;
            }
            keyGenerator.init(i);
            return keyGenerator.generateKey().getEncoded();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<bz> b(ao aoVar, aw awVar, List<String> list, byte[] bArr) {
        String str;
        ao.b bVarA;
        InputStream inputStreamA;
        ArrayList arrayList = new ArrayList();
        try {
            File fileB = aoVar.b();
            if (fileB != null && fileB.exists()) {
                String[] list2 = fileB.list();
                int length = list2.length;
                char c = 0;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    String str2 = list2[i];
                    if (str2.contains(".0") && (bVarA = aoVar.a((str = str2.split("\\.")[c]))) != null && (inputStreamA = bVarA.a()) != null) {
                        char c2 = 2;
                        byte[] bArr2 = new byte[2];
                        inputStreamA.read(bArr2);
                        int iB = eo.b(bArr2);
                        if (iB != 0 && iB <= 65535) {
                            byte[] bArr3 = new byte[iB];
                            inputStreamA.read(bArr3);
                            byte[] bArr4 = new byte[2];
                            int length2 = 0;
                            while (inputStreamA.read(bArr4) >= 0) {
                                byte[] bArr5 = new byte[eo.b(bArr4)];
                                inputStreamA.read(bArr5);
                                byte[] bArrA = o.a(bArr3, bArr5, u.c());
                                length2 += bArrA.length;
                                byte[] bArr6 = new byte[4];
                                inputStreamA.read(bArr6);
                                arrayList.add(new bz(((bArr6[c2] & 255) << 8) | (bArr6[3] & 255) | ((bArr6[1] & 255) << 16) | ((bArr6[0] & 255) << 24), o.b(bArr, u.b(bArrA), u.c())));
                                c2 = 2;
                            }
                            i2 += length2;
                            list.add(str);
                            if (i2 > awVar.f.b()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i++;
                    c = 0;
                }
                return arrayList;
            }
        } catch (Throwable th) {
            ab.b(th, "aps", "upc");
        }
        return arrayList;
    }

    private static byte[] b(int i) {
        return new byte[]{(byte) ((i & 65280) >> 8), (byte) (i & 255)};
    }

    public static /* synthetic */ byte[] e() {
        return a(128);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        try {
            ArrayList<bz> arrayList = this.f;
            if (arrayList != null && arrayList.size() != 0) {
                ArrayList<bz> arrayList2 = new ArrayList();
                synchronized (this.f) {
                    arrayList2.addAll(this.f);
                    this.f.clear();
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArrA = a(256);
                if (bArrA == null) {
                    return;
                }
                byteArrayOutputStream.write(b(bArrA.length));
                byteArrayOutputStream.write(bArrA);
                for (bz bzVar : arrayList2) {
                    byte[] bArrB = bzVar.b();
                    if (bArrB.length >= 10 && bArrB.length <= 65535) {
                        byte[] bArrB2 = o.b(bArrA, bArrB, u.c());
                        byteArrayOutputStream.write(b(bArrB2.length));
                        byteArrayOutputStream.write(bArrB2);
                        int iA = bzVar.a();
                        byteArrayOutputStream.write(new byte[]{(byte) ((iA >> 24) & 255), (byte) ((iA >> 16) & 255), (byte) ((iA >> 8) & 255), (byte) (iA & 255)});
                    }
                }
                ax.a(Long.toString(System.currentTimeMillis()), byteArrayOutputStream.toByteArray(), this.e);
            }
        } catch (Throwable th) {
            ei.a(th, "clm", "wtD");
        }
    }

    @Override // com.loc.dj
    public final di a(dh dhVar) {
        try {
            ec ecVar = new ec();
            ecVar.a(dhVar.b);
            ecVar.a(dhVar.a);
            ecVar.a(dhVar.d);
            aq.a();
            av avVarC = aq.c(ecVar);
            di diVar = new di();
            diVar.c = avVarC.a;
            diVar.b = avVarC.b;
            diVar.a = 200;
            return diVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void a() {
        LocationManager locationManager;
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
                f();
                this.b.a((dn) null);
                this.c.a((dn) null);
                this.c = null;
                this.b = null;
                this.g = null;
                this.j = false;
            }
        } catch (Throwable th) {
            ei.a(th, "clm", "stc");
        }
    }

    public final void a(Location location) {
        try {
            Handler handler = this.g;
            if (handler != null) {
                handler.post(new b(this, location));
            }
        } catch (Throwable th) {
            ab.b(th, "cl", "olcc");
        }
    }

    public final void a(dv dvVar, dw dwVar, Handler handler) {
        LocationManager locationManager;
        if (this.j || dvVar == null || dwVar == null || handler == null) {
            return;
        }
        this.j = true;
        this.c = dvVar;
        this.b = dwVar;
        dwVar.a(this);
        this.c.a(this);
        this.g = handler;
        try {
            if (this.h == null) {
                this.h = (LocationManager) this.a.getSystemService("location");
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
                ct ctVar = new ct("5.0.0", k.f(this.a), "S128DF1572465B890OE3F7A13167KLEI", k.c(this.a), this);
                this.d = ctVar;
                ctVar.a(n.w(this.a)).b(n.h(this.a)).c(n.a(this.a)).d(n.g(this.a)).e(n.z(this.a)).f(n.i(this.a)).g(Build.MODEL).h(Build.MANUFACTURER).i(Build.BRAND).a(Build.VERSION.SDK_INT).j(Build.VERSION.RELEASE).a(dc.a(n.m(this.a))).k(n.m(this.a));
            }
        } catch (Throwable th) {
            ei.a(th, "col", PointCategory.INIT);
        }
    }

    public final void b() {
        try {
            Handler handler = this.g;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.loc.dn.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        dw dwVar;
                        try {
                            dn dnVar = dn.this;
                            if (dnVar.d == null || (dwVar = dnVar.b) == null) {
                                return;
                            }
                            ct.b(dwVar.a());
                        } catch (Throwable th) {
                            ei.a(th, "cl", "upwr");
                        }
                    }
                });
            }
        } catch (Throwable th) {
            ei.a(th, "cl", "upw");
        }
    }

    public final void c() {
        dv dvVar;
        try {
            if (this.d == null || (dvVar = this.c) == null) {
                return;
            }
            ct.a(dvVar.a());
        } catch (Throwable th) {
            ei.a(th, "cl", "upc");
        }
    }

    public final void d() {
        try {
            if (System.currentTimeMillis() - k < 60000) {
                return;
            }
            ab.d().submit(new b(2));
        } catch (Throwable unused) {
        }
    }
}
