package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class q9f extends dzo {

    public static class b extends fzo<q9f> {
        public b(ylb ylbVar, apr aprVar) {
            super(ylbVar, aprVar);
        }

        public static b y(ylb ylbVar, apr aprVar) {
            return new b(ylbVar, aprVar);
        }

        public void A(int i) {
            i().Q(c.numGlyphs.f31258a, i);
        }

        @Override // xz9.a
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public q9f o(jgj jgjVar) {
            return new q9f(u(), jgjVar);
        }

        public int z() {
            return g().v(c.numGlyphs.f31258a);
        }
    }

    public enum c {
        version(0),
        numGlyphs(4),
        maxPoints(6),
        maxContours(8),
        maxCompositePoints(10),
        maxCompositeContours(12),
        maxZones(14),
        maxTwilightPoints(16),
        maxStorage(18),
        maxFunctionDefs(20),
        maxInstructionDefs(22),
        maxStackElements(24),
        maxSizeOfInstructions(26),
        maxComponentElements(28),
        maxComponentDepth(30);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f31258a;

        c(int i) {
            this.f31258a = i;
        }
    }

    public int l() {
        return this.f39611a.v(c.numGlyphs.f31258a);
    }

    public q9f(ylb ylbVar, jgj jgjVar) {
        super(ylbVar, jgjVar);
    }
}
