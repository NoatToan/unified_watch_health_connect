package r1;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lr1/z1;", "", "", "friction", "Lg6/c;", "density", "<init>", "(FLg6/c;)V", "a", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f149325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g6.c f149326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f149327c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lr1/z1$a;", "", "", "initialVelocity", "distance", "", "duration", "<init>", "(FFJ)V", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f149328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f149329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f149330c;

        public a(float f14, float f15, long j8) {
            this.f149328a = f14;
            this.f149329b = f15;
            this.f149330c = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f149328a, aVar.f149328a) == 0 && Float.compare(this.f149329b, aVar.f149329b) == 0 && this.f149330c == aVar.f149330c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f149330c) + q6.f.d(this.f149329b, Float.hashCode(this.f149328a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("FlingInfo(initialVelocity=");
            sb3.append(this.f149328a);
            sb3.append(", distance=");
            sb3.append(this.f149329b);
            sb3.append(", duration=");
            return androidx.room.a0.l(sb3, this.f149330c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public z1(float f14, g6.c cVar) {
        this.f149325a = f14;
        this.f149326b = cVar;
        float f75991a = cVar.getF75991a();
        float f15 = a2.f148977a;
        this.f149327c = f75991a * 386.0878f * 160.0f * 0.84f;
    }

    public final a a(float f14) {
        double dB = b(f14);
        double d14 = a2.f148977a;
        double d15 = d14 - 1.0d;
        return new a(f14, (float) (Math.exp((d14 / d15) * dB) * ((double) (this.f149325a * this.f149327c))), (long) (Math.exp(dB / d15) * 1000.0d));
    }

    public final double b(float f14) {
        r1.a aVar = r1.a.f148963a;
        float f15 = this.f149325a * this.f149327c;
        aVar.getClass();
        return Math.log(((double) (Math.abs(f14) * 0.35f)) / ((double) f15));
    }
}
