package h4;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lh4/f;", "Lh4/d;", "", "horizontalBias", "verticalBias", "<init>", "(FF)V", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class f implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f81549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f81550c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lh4/f$a;", "Lh4/d$b;", "", "bias", "<init>", "(F)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class a implements d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f81551a;

        public a(float f14) {
            this.f81551a = f14;
        }

        @Override // h4.d.b
        public final int a(int i14, int i15, g6.o oVar) {
            return Math.round((1 + this.f81551a) * ((i15 - i14) / 2.0f));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.f81551a, ((a) obj).f81551a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f81551a);
        }

        public final String toString() {
            return q6.f.p(new StringBuilder("Horizontal(bias="), this.f81551a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public f(float f14, float f15) {
        this.f81549b = f14;
        this.f81550c = f15;
    }

    @Override // h4.d
    public final long a(long j8, long j14, g6.o oVar) {
        long j15 = (((long) (((int) (j14 >> 32)) - ((int) (j8 >> 32)))) << 32) | (((long) (((int) (j14 & 4294967295L)) - ((int) (j8 & 4294967295L)))) & 4294967295L);
        g6.m.a aVar = g6.m.f76012b;
        float f14 = 1;
        float f15 = (this.f81549b + f14) * (((int) (j15 >> 32)) / 2.0f);
        long jRound = (((long) Math.round((f14 + this.f81550c) * (((int) (j15 & 4294967295L)) / 2.0f))) & 4294967295L) | (((long) Math.round(f15)) << 32);
        g6.k.a aVar2 = g6.k.f76003b;
        return jRound;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Float.compare(this.f81549b, fVar.f81549b) == 0 && Float.compare(this.f81550c, fVar.f81550c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f81550c) + (Float.hashCode(this.f81549b) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BiasAbsoluteAlignment(horizontalBias=");
        sb3.append(this.f81549b);
        sb3.append(", verticalBias=");
        return q6.f.p(sb3, this.f81550c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
