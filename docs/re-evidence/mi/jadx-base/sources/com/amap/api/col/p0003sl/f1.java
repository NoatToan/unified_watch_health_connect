package com.amap.api.col.p0003sl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.amap.api.maps.AMapException;
import defpackage.m2t;
import defpackage.v5t;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class f1 extends b1 {
    public static f1 i;
    public j1 g;
    public Handler h;

    public static class a extends Handler {
        public /* synthetic */ a(Looper looper, byte b2) {
            this(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            try {
                int i = message.what;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        public a(Looper looper) {
            super(looper);
        }

        public a() {
        }
    }

    public f1(boolean z) {
        if (z) {
            try {
                this.g = j1.i(new h1.b().c("amap-netmanger-threadpool-%d").h());
            } catch (Throwable th) {
                m2t.r(th, "NetManger", "NetManger1");
                th.printStackTrace();
                return;
            }
        }
        if (Looper.myLooper() == null) {
            this.h = new a(Looper.getMainLooper(), (byte) 0);
        } else {
            this.h = new a();
        }
    }

    public static synchronized f1 l(boolean z) {
        try {
            f1 f1Var = i;
            if (f1Var == null) {
                i = new f1(z);
            } else if (z && f1Var.g == null) {
                f1Var.g = j1.i(new h1.b().c("amap-netmanger-threadpool-%d").h());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return i;
    }

    public static Map<String, String> m(la laVar, la.b bVar, int i2) throws ik {
        try {
            b1.k(laVar);
            laVar.setDegradeType(bVar);
            laVar.setReal_max_timeout(i2);
            return new d1().i(laVar);
        } catch (ik e) {
            throw e;
        } catch (Throwable th) {
            th.printStackTrace();
            throw new ik(AMapException.ERROR_UNKNOWN);
        }
    }

    public static f1 n() {
        return l(true);
    }

    public static v5t o(la laVar, la.b bVar, int i2) throws ik {
        try {
            b1.k(laVar);
            laVar.setDegradeType(bVar);
            laVar.setReal_max_timeout(i2);
            return new d1().r(laVar);
        } catch (ik e) {
            throw e;
        } catch (Throwable th) {
            th.printStackTrace();
            throw new ik(AMapException.ERROR_UNKNOWN);
        }
    }

    public static f1 p() {
        return l(false);
    }

    @Deprecated
    public static Map<String, String> q(la laVar, boolean z) throws ik {
        b1.k(laVar);
        laVar.setHttpProtocol(z ? la.c.HTTPS : la.c.HTTP);
        Map<String, String> mapM = null;
        long jElapsedRealtime = 0;
        boolean z2 = false;
        if (b1.g(laVar)) {
            boolean zI = b1.i(laVar);
            try {
                jElapsedRealtime = SystemClock.elapsedRealtime();
                mapM = m(laVar, b1.c(laVar, zI), b1.h(laVar, zI));
            } catch (ik e) {
                if (!zI) {
                    throw e;
                }
                z2 = true;
            }
        }
        return mapM == null ? m(laVar, b1.f(laVar, z2), b1.a(laVar, jElapsedRealtime)) : mapM;
    }

    public static v5t r(la laVar) throws ik {
        return s(laVar, laVar.isHttps());
    }

    @Deprecated
    public static v5t s(la laVar, boolean z) throws ik {
        byte[] bArr;
        b1.k(laVar);
        laVar.setHttpProtocol(z ? la.c.HTTPS : la.c.HTTP);
        v5t v5tVarO = null;
        long jElapsedRealtime = 0;
        boolean z2 = false;
        if (b1.g(laVar)) {
            boolean zI = b1.i(laVar);
            try {
                jElapsedRealtime = SystemClock.elapsedRealtime();
                v5tVarO = o(laVar, b1.c(laVar, zI), b1.h(laVar, zI));
            } catch (ik e) {
                if ((e.f() == 21 && laVar.getDegradeAbility() == la.a.INTERRUPT_IO) || !zI) {
                    throw e;
                }
                z2 = true;
            }
        }
        return (v5tVarO == null || (bArr = v5tVarO.f36513a) == null || bArr.length <= 0) ? o(laVar, b1.f(laVar, z2), b1.a(laVar, jElapsedRealtime)) : v5tVarO;
    }
}
