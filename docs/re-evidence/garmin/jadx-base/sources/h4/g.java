package h4;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lh4/g;", "Lh4/d;", "", "horizontalBias", "verticalBias", "<init>", "(FF)V", "a", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class g implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f81552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f81553c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lh4/g$a;", "Lh4/d$b;", "", "bias", "<init>", "(F)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class a implements d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f81554a;

        public a(float f14) {
            this.f81554a = f14;
        }

        @Override // h4.d.b
        public final int a(int i14, int i15, g6.o oVar) {
            float f14 = (i15 - i14) / 2.0f;
            g6.o oVar2 = g6.o.Ltr;
            float f15 = this.f81554a;
            if (oVar != oVar2) {
                f15 *= -1;
            }
            return Math.round((1 + f15) * f14);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.f81554a, ((a) obj).f81554a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f81554a);
        }

        public final String toString() {
            return q6.f.p(new StringBuilder("Horizontal(bias="), this.f81554a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lh4/g$b;", "Lh4/d$c;", "", "bias", "<init>", "(F)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class b implements d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f81555a;

        public b(float f14) {
            this.f81555a = f14;
        }

        @Override // h4.d.c
        public final int a(int i14, int i15) {
            return Math.round((1 + this.f81555a) * ((i15 - i14) / 2.0f));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.f81555a, ((b) obj).f81555a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f81555a);
        }

        public final String toString() {
            return q6.f.p(new StringBuilder("Vertical(bias="), this.f81555a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public g(float f14, float f15) {
        this.f81552b = f14;
        this.f81553c = f15;
    }

    @Override // h4.d
    public final long a(long j8, long j14, g6.o oVar) {
        float f14 = (((int) (j14 >> 32)) - ((int) (j8 >> 32))) / 2.0f;
        float f15 = (((int) (j14 & 4294967295L)) - ((int) (j8 & 4294967295L))) / 2.0f;
        g6.o oVar2 = g6.o.Ltr;
        float f16 = this.f81552b;
        if (oVar != oVar2) {
            f16 *= -1;
        }
        float f17 = 1;
        float f18 = (f16 + f17) * f14;
        long jRound = (((long) Math.round((f17 + this.f81553c) * f15)) & 4294967295L) | (((long) Math.round(f18)) << 32);
        g6.k.a aVar = g6.k.f76003b;
        return jRound;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.f81552b, gVar.f81552b) == 0 && Float.compare(this.f81553c, gVar.f81553c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f81553c) + (Float.hashCode(this.f81552b) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BiasAlignment(horizontalBias=");
        sb3.append(this.f81552b);
        sb3.append(", verticalBias=");
        return q6.f.p(sb3, this.f81553c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
