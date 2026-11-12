package defpackage;

import org.eclipse.californium.core.network.stack.CongestionControlLayer;
import org.eclipse.californium.core.network.stack.RemoteEndpoint;
import org.eclipse.californium.elements.config.Configuration;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class zxj extends CongestionControlLayer {
    private static final Logger e = aaex.a((Class<?>) zxj.class);

    public zxj(String str, Configuration configuration) {
        super(str, configuration);
    }

    @Override // org.eclipse.californium.core.network.stack.CongestionControlLayer
    public RemoteEndpoint createRemoteEndpoint(Object obj) {
        return new e(obj, this.defaultReliabilityLayerParameters.c(), this.defaultReliabilityLayerParameters.f());
    }

    static class e extends RemoteEndpoint {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long[] f54734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f54735b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f54736c;
        private long d;
        private float e;
        private int f;
        private float i;

        private e(Object obj, int i, int i2) {
            super(obj, i, i2, true);
            this.f54734a = new long[2];
        }

        private void d(long j) {
            a(j);
            updateRTO((long) (j * 1.75d));
        }

        private void b(long j) {
            a(j);
            float fAbs = Math.abs((j - this.f54736c) / j);
            this.i = fAbs;
            this.e = Math.min(Math.max(fAbs * 2.0f, this.e * 0.9583333f), 1.0f);
            this.d = Math.max(j, this.f54736c);
            this.f54735b = b() + 100;
            long jMax = Math.max(Math.max((long) Math.max(getRTO() * 0.9583333f, (this.e + 1.0f) * this.d), this.d + 100), this.f54735b);
            e();
            this.f54736c = j;
            updateRTO(jMax);
        }

        @Override // org.eclipse.californium.core.network.stack.RemoteEndpoint
        public void processRttMeasurement(RemoteEndpoint.RtoType rtoType, long j) {
            synchronized (this) {
                if (rtoType != RemoteEndpoint.RtoType.STRONG) {
                    return;
                }
                if (initialRto()) {
                    d(j);
                } else {
                    b(j);
                }
            }
        }

        private void a(long j) {
            synchronized (this.f54734a) {
                long[] jArr = this.f54734a;
                int i = this.f;
                int i2 = i + 1;
                this.f = i2;
                jArr[i] = j;
                if (i2 >= jArr.length) {
                    this.f = 0;
                }
            }
        }

        private long b() {
            long jMax;
            synchronized (this.f54734a) {
                jMax = -1;
                for (long j : this.f54734a) {
                    jMax = Math.max(jMax, j);
                }
            }
            return jMax;
        }

        private void e() {
            zxj.e.trace("Delta: {}, D: {}, B: {}, RTT_max: {}", Float.valueOf(this.i), Float.valueOf(0.9583333f), Float.valueOf(this.e), Long.valueOf(this.d));
        }
    }
}
