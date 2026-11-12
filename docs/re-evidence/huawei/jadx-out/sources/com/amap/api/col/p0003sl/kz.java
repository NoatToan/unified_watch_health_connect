package com.amap.api.col.p0003sl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.amap.api.maps.AMapException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class kz extends kt {
    private static kz f;
    private ma g;
    private Handler h;

    public static kz b() {
        return a(true);
    }

    public static kz c() {
        return a(false);
    }

    private static kz a(boolean z) {
        kz kzVar;
        synchronized (kz.class) {
            try {
                kz kzVar2 = f;
                if (kzVar2 == null) {
                    f = new kz(z);
                } else if (z && kzVar2.g == null) {
                    kzVar2.g = ma.a(new lz.a().a("amap-netmanger-threadpool-%d").b());
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            kzVar = f;
        }
        return kzVar;
    }

    private kz(boolean z) {
        if (z) {
            try {
                this.g = ma.a(new lz.a().a("amap-netmanger-threadpool-%d").b());
            } catch (Throwable th) {
                jv.c(th, "NetManger", "NetManger1");
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

    @Deprecated
    public static Map<String, String> d(la laVar, boolean z) throws ik {
        d(laVar);
        laVar.setHttpProtocol(z ? la.c.HTTPS : la.c.HTTP);
        Map<String, String> mapA = null;
        long jElapsedRealtime = 0;
        boolean z2 = false;
        if (b(laVar)) {
            boolean zC = c(laVar);
            try {
                jElapsedRealtime = SystemClock.elapsedRealtime();
                mapA = a(laVar, a(laVar, zC), c(laVar, zC));
            } catch (ik e) {
                if (!zC) {
                    throw e;
                }
                z2 = true;
            }
        }
        return mapA == null ? a(laVar, b(laVar, z2), a(laVar, jElapsedRealtime)) : mapA;
    }

    private static Map<String, String> a(la laVar, la.b bVar, int i) throws ik {
        try {
            d(laVar);
            laVar.setDegradeType(bVar);
            laVar.setReal_max_timeout(i);
            return new kx().a(laVar);
        } catch (ik e) {
            throw e;
        } catch (Throwable th) {
            th.printStackTrace();
            throw new ik(AMapException.ERROR_UNKNOWN);
        }
    }

    @Deprecated
    private static lb e(la laVar, boolean z) throws ik {
        d(laVar);
        laVar.setHttpProtocol(z ? la.c.HTTPS : la.c.HTTP);
        lb lbVarB = null;
        long jElapsedRealtime = 0;
        boolean z2 = false;
        if (b(laVar)) {
            boolean zC = c(laVar);
            try {
                jElapsedRealtime = SystemClock.elapsedRealtime();
                lbVarB = b(laVar, a(laVar, zC), c(laVar, zC));
            } catch (ik e) {
                if ((e.f() == 21 && laVar.getDegradeAbility() == la.a.INTERRUPT_IO) || !zC) {
                    throw e;
                }
                z2 = true;
            }
        }
        return (lbVarB == null || lbVarB.f3037a == null || lbVarB.f3037a.length <= 0) ? b(laVar, b(laVar, z2), a(laVar, jElapsedRealtime)) : lbVarB;
    }

    public static lb e(la laVar) throws ik {
        return e(laVar, laVar.isHttps());
    }

    private static lb b(la laVar, la.b bVar, int i) throws ik {
        try {
            d(laVar);
            laVar.setDegradeType(bVar);
            laVar.setReal_max_timeout(i);
            return new kx().b(laVar);
        } catch (ik e) {
            throw e;
        } catch (Throwable th) {
            th.printStackTrace();
            throw new ik(AMapException.ERROR_UNKNOWN);
        }
    }

    static final class a extends Handler {
        /* synthetic */ a(Looper looper, byte b2) {
            this(looper);
        }

        private a(Looper looper) {
            super(looper);
        }

        public a() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            try {
                int i = message.what;
                if (i == 0) {
                    Object obj = message.obj;
                } else {
                    if (i != 1) {
                        return;
                    }
                    Object obj2 = message.obj;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
