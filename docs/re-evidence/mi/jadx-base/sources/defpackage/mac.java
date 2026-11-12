package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class mac extends dzo {

    public static class b extends fzo<mac> {
        public b(ylb ylbVar, apr aprVar) {
            super(ylbVar, aprVar);
        }

        public static b y(ylb ylbVar, apr aprVar) {
            return new b(ylbVar, aprVar);
        }

        public void A(int i) {
            i().Q(c.advanceWidthMax.f25944a, i);
        }

        public void B(int i) {
            i().Q(c.numberOfHMetrics.f25944a, i);
        }

        @Override // xz9.a
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public mac o(jgj jgjVar) {
            return new mac(u(), jgjVar);
        }

        public int z() {
            return g().v(c.numberOfHMetrics.f25944a);
        }
    }

    public enum c {
        version(0),
        Ascender(4),
        Descender(6),
        LineGap(8),
        advanceWidthMax(10),
        minLeftSideBearing(12),
        minRightSideBearing(14),
        xMaxExtent(16),
        caretSlopeRise(18),
        caretSlopeRun(20),
        caretOffset(22),
        metricDataFormat(32),
        numberOfHMetrics(34);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f25944a;

        c(int i) {
            this.f25944a = i;
        }
    }

    public mac(ylb ylbVar, jgj jgjVar) {
        super(ylbVar, jgjVar);
    }
}
