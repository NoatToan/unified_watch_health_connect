package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class nac extends dzo {
    public int c;
    public int d;

    public static class b extends fzo<nac> {
        public int h;
        public int i;

        public b(ylb ylbVar, apr aprVar) {
            super(ylbVar, aprVar);
            this.h = -1;
            this.i = -1;
        }

        public static b y(ylb ylbVar, apr aprVar) {
            return new b(ylbVar, aprVar);
        }

        public void A(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("Number of metrics can't be negative.");
            }
            this.h = i;
            x().c = i;
        }

        @Override // xz9.a
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public nac o(jgj jgjVar) {
            return new nac(u(), jgjVar, this.h, this.i);
        }

        public void z(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("Number of glyphs can't be negative.");
            }
            this.i = i;
            x().d = i;
        }
    }

    public enum c {
        hMetricsStart(0),
        hMetricsSize(4),
        hMetricsAdvanceWidth(0),
        hMetricsLeftSideBearing(2),
        LeftSideBearingSize(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f27709a;

        c(int i) {
            this.f27709a = i;
        }
    }

    public int o(int i) {
        int i2 = this.c;
        return i < i2 ? q(i) : q(i2 - 1);
    }

    public int q(int i) {
        if (i > this.c) {
            throw new IndexOutOfBoundsException();
        }
        return this.f39611a.v(c.hMetricsStart.f27709a + (i * c.hMetricsSize.f27709a) + c.hMetricsAdvanceWidth.f27709a);
    }

    public int r(int i) {
        if (i > this.c) {
            throw new IndexOutOfBoundsException();
        }
        return this.f39611a.r(c.hMetricsStart.f27709a + (i * c.hMetricsSize.f27709a) + c.hMetricsLeftSideBearing.f27709a);
    }

    public int t(int i) {
        int i2 = this.c;
        return i < i2 ? r(i) : u(i - i2);
    }

    public int u(int i) {
        if (i > v()) {
            throw new IndexOutOfBoundsException();
        }
        return this.f39611a.r(c.hMetricsStart.f27709a + (this.c * c.hMetricsSize.f27709a) + (i * c.LeftSideBearingSize.f27709a));
    }

    public int v() {
        return this.d - this.c;
    }

    public nac(ylb ylbVar, jgj jgjVar, int i, int i2) {
        super(ylbVar, jgjVar);
        this.c = i;
        this.d = i2;
    }
}
