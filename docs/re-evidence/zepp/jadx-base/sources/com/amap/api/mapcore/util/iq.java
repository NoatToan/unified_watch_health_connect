package com.amap.api.mapcore.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.amap.api.maps.AMapException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class iq extends ik {
    private static iq c;
    private jq d;
    private Handler e;

    public static class a extends Handler {
        public /* synthetic */ a(Looper looper, byte b) {
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

        private a(Looper looper) {
            super(looper);
        }

        public a() {
        }
    }

    private iq(boolean z) {
        if (z) {
            try {
                this.d = jq.b();
            } catch (Throwable th) {
                hn.c(th, "NetManger", "NetManger1");
                th.printStackTrace();
                return;
            }
        }
        if (Looper.myLooper() == null) {
            this.e = new a(Looper.getMainLooper(), (byte) 0);
        } else {
            this.e = new a();
        }
    }

    private static synchronized iq a(boolean z) {
        try {
            iq iqVar = c;
            if (iqVar == null) {
                c = new iq(z);
            } else if (z && iqVar.d == null) {
                iqVar.d = jq.b();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            if (gn.c() == null) {
                gn.a(ha.a());
            }
        } catch (Throwable unused) {
        }
        return c;
    }

    public static iq b() {
        return a(true);
    }

    public static iq c() {
        return a(false);
    }

    @Deprecated
    public static Map<String, String> e(ir irVar, boolean z) throws gi {
        ik.e(irVar);
        irVar.setHttpProtocol(z ? ir.c.HTTPS : ir.c.HTTP);
        Map<String, String> mapA = null;
        long jElapsedRealtime = 0;
        boolean z2 = false;
        if (ik.c(irVar)) {
            boolean zD = ik.d(irVar);
            try {
                jElapsedRealtime = SystemClock.elapsedRealtime();
                mapA = a(irVar, ik.b(irVar, zD), ik.d(irVar, zD));
            } catch (gi e) {
                if (!zD) {
                    throw e;
                }
                z2 = true;
            }
        }
        if (mapA != null) {
            return mapA;
        }
        try {
            return a(irVar, ik.c(irVar, z2), ik.a(irVar, jElapsedRealtime));
        } catch (gi e2) {
            throw e2;
        }
    }

    @Deprecated
    private static is f(ir irVar, boolean z) throws gi {
        byte[] bArr;
        ik.e(irVar);
        irVar.setHttpProtocol(z ? ir.c.HTTPS : ir.c.HTTP);
        is isVarB = null;
        long jElapsedRealtime = 0;
        boolean z2 = false;
        if (ik.c(irVar)) {
            boolean zD = ik.d(irVar);
            try {
                jElapsedRealtime = SystemClock.elapsedRealtime();
                isVarB = b(irVar, ik.b(irVar, zD), ik.d(irVar, zD));
            } catch (gi e) {
                if ((e.f() == 21 && irVar.getDegradeAbility() == ir.a.INTERRUPT_IO) || !zD) {
                    throw e;
                }
                z2 = true;
            }
        }
        if (isVarB != null && (bArr = isVarB.a) != null && bArr.length > 0) {
            return isVarB;
        }
        try {
            return b(irVar, ik.c(irVar, z2), ik.a(irVar, jElapsedRealtime));
        } catch (gi e2) {
            throw e2;
        }
    }

    private static is b(ir irVar, ir.b bVar, int i) throws gi {
        try {
            ik.e(irVar);
            irVar.setDegradeType(bVar);
            irVar.setReal_max_timeout(i);
            return new io().b(irVar);
        } catch (gi e) {
            throw e;
        } catch (Throwable th) {
            th.printStackTrace();
            throw new gi(AMapException.ERROR_UNKNOWN);
        }
    }

    @Override // com.amap.api.mapcore.util.ik
    @Deprecated
    public final byte[] a(ir irVar) throws gi {
        try {
            is isVarA = ik.a(irVar, false);
            if (isVarA != null) {
                return isVarA.a;
            }
            return null;
        } catch (gi e) {
            throw e;
        } catch (Throwable th) {
            th.printStackTrace();
            hn.e().b(th, "NetManager", "makeSyncPostRequest");
            throw new gi(AMapException.ERROR_UNKNOWN);
        }
    }

    public static is f(ir irVar) throws gi {
        return f(irVar, irVar.isHttps());
    }

    private static Map<String, String> a(ir irVar, ir.b bVar, int i) throws gi {
        try {
            ik.e(irVar);
            irVar.setDegradeType(bVar);
            irVar.setReal_max_timeout(i);
            return new io().a(irVar);
        } catch (gi e) {
            throw e;
        } catch (Throwable th) {
            th.printStackTrace();
            throw new gi(AMapException.ERROR_UNKNOWN);
        }
    }
}
