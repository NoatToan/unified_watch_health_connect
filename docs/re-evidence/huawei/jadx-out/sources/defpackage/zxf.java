package defpackage;

import org.eclipse.californium.core.network.stack.CongestionControlLayer;
import org.eclipse.californium.core.network.stack.RemoteEndpoint;
import org.eclipse.californium.elements.config.Configuration;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class zxf extends CongestionControlLayer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f54723a = aaex.a((Class<?>) zxf.class);

    public zxf(String str, Configuration configuration) {
        super(str, configuration);
    }

    @Override // org.eclipse.californium.core.network.stack.CongestionControlLayer
    public RemoteEndpoint createRemoteEndpoint(Object obj) {
        return new d(obj, this.defaultReliabilityLayerParameters.c(), this.defaultReliabilityLayerParameters.f());
    }

    static class d extends RemoteEndpoint {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f54724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f54725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f54726c;
        private long e;

        private d(Object obj, int i, int i2) {
            super(obj, i, i2, true);
        }

        private void e(long j) {
            this.e = j;
            long j2 = j / 2;
            this.f54726c = j2;
            long jMax = Math.max(j2, 50L);
            this.f54724a = jMax;
            this.f54725b = jMax;
            long j3 = this.e;
            d();
            updateRTO(j3 + (jMax * 4));
        }

        private void a(long j) {
            long j2 = this.e;
            long jRound = j2 + Math.round((j - j2) * 0.125d);
            this.e = jRound;
            long j3 = this.f54726c;
            if (j < jRound - j3) {
                this.f54726c = Math.round((j3 * 0.96875d) + (Math.abs(j - jRound) * 0.03125d));
            } else {
                this.f54726c = Math.round(j3 * 0.75d) + Math.round(Math.abs(j - this.e) * 0.25d);
            }
            long j4 = this.f54726c;
            if (j4 > this.f54724a) {
                this.f54724a = j4;
                if (j4 > this.f54725b) {
                    this.f54725b = j4;
                }
            }
            long j5 = this.f54724a;
            long j6 = this.f54725b;
            if (j5 < j6) {
                this.f54725b = Math.round((j6 * 0.75d) + (j5 * 0.25d));
            }
            this.f54724a = 50L;
            long j7 = this.e;
            long j8 = this.f54725b;
            d();
            updateRTO(j7 + (j8 * 4));
        }

        @Override // org.eclipse.californium.core.network.stack.RemoteEndpoint
        public void processRttMeasurement(RemoteEndpoint.RtoType rtoType, long j) {
            synchronized (this) {
                if (rtoType != RemoteEndpoint.RtoType.STRONG) {
                    return;
                }
                if (initialRto()) {
                    e(j);
                } else {
                    a(j);
                }
            }
        }

        private void d() {
            zxf.f54723a.trace("SRTT: {}, RTTVAR: {}, mdev: {}, mdev_max: {}", Long.valueOf(this.e), Long.valueOf(this.f54725b), Long.valueOf(this.f54726c), Long.valueOf(this.f54724a));
        }
    }
}
