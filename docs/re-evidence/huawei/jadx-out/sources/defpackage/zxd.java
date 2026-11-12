package defpackage;

import androidx.media3.common.C;
import java.util.concurrent.TimeUnit;
import org.eclipse.californium.core.network.stack.CongestionControlLayer;
import org.eclipse.californium.core.network.stack.RemoteEndpoint;
import org.eclipse.californium.elements.config.Configuration;
import org.eclipse.californium.elements.util.ClockUtil;

/* JADX INFO: loaded from: classes20.dex */
public class zxd extends CongestionControlLayer {
    private final boolean e;

    @Override // org.eclipse.californium.core.network.stack.CongestionControlLayer
    public float calculateVBF(long j, float f) {
        if (j > C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS) {
            return 1.5f;
        }
        if (j < 1000) {
            return 3.0f;
        }
        return f;
    }

    public zxd(String str, Configuration configuration, boolean z) {
        super(str, configuration);
        this.e = z;
        setDithering(true);
    }

    @Override // org.eclipse.californium.core.network.stack.CongestionControlLayer
    public RemoteEndpoint createRemoteEndpoint(Object obj) {
        return new c(obj, this.defaultReliabilityLayerParameters.c(), this.defaultReliabilityLayerParameters.f(), this.e, null);
    }

    static class c extends RemoteEndpoint {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private zxk f54721a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private zxk f54722c;
        private long d;
        private final boolean e;

        /* synthetic */ c(Object obj, int i, int i2, boolean z, AnonymousClass3 anonymousClass3) {
            this(obj, i, i2, z);
        }

        private c(Object obj, int i, int i2, boolean z) {
            super(obj, i, i2, true);
            this.e = z;
            long j = i;
            this.f54722c = new zxk(1, j);
            this.f54721a = new zxk(4, j);
            this.d = ClockUtil.c();
        }

        @Override // org.eclipse.californium.core.network.stack.RemoteEndpoint
        public void processRttMeasurement(RemoteEndpoint.RtoType rtoType, long j) {
            long jB;
            double d;
            synchronized (this) {
                if (!this.e || rtoType == RemoteEndpoint.RtoType.STRONG) {
                    int i = AnonymousClass3.f54720c[rtoType.ordinal()];
                    if (i == 1) {
                        jB = this.f54722c.b(j);
                        d = 0.25d;
                    } else {
                        if (i != 2) {
                            return;
                        }
                        jB = this.f54721a.b(j);
                        d = 0.5d;
                    }
                    updateRTO(Math.round((jB * d) + ((1.0d - d) * getRTO())));
                    this.d = ClockUtil.c();
                }
            }
        }

        @Override // org.eclipse.californium.core.network.stack.RemoteEndpoint
        public void checkAging() {
            synchronized (this) {
                long jA = a(TimeUnit.MILLISECONDS);
                long rto = getRTO();
                while (true) {
                    if (rto < 1000) {
                        long j = 16 * rto;
                        if (jA > j) {
                            jA -= j;
                            rto *= 2;
                            updateRTO(rto);
                            this.d = ClockUtil.c();
                        }
                    }
                    if (rto <= C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS) {
                        break;
                    }
                    long j2 = 4 * rto;
                    if (jA <= j2) {
                        break;
                    }
                    jA -= j2;
                    rto = (rto / 2) + 1000;
                    updateRTO(rto);
                    this.d = ClockUtil.c();
                }
            }
        }

        private long a(TimeUnit timeUnit) {
            return timeUnit.convert(ClockUtil.c() - this.d, TimeUnit.NANOSECONDS);
        }
    }

    /* JADX INFO: renamed from: zxd$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f54720c;

        static {
            int[] iArr = new int[RemoteEndpoint.RtoType.values().length];
            f54720c = iArr;
            try {
                iArr[RemoteEndpoint.RtoType.WEAK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54720c[RemoteEndpoint.RtoType.STRONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
