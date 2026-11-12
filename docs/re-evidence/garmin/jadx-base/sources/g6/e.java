package g6;

import ch.qos.logback.core.CoreConstants;
import o53.f0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lg6/e;", "Lg6/c;", "", "density", "fontScale", "Lh6/a;", "converter", "<init>", "(FFLh6/a;)V", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f75991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f75992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h6.a f75993c;

    public e(float f14, float f15, h6.a aVar) {
        this.f75991a = f14;
        this.f75992b = f15;
        this.f75993c = aVar;
    }

    @Override // g6.i
    public final float H0(long j8) {
        long jC = q.c(j8);
        r.f76022b.getClass();
        if (!r.b(jC, r.f76023c)) {
            vb.h.z("Only Sp can convert to Px");
            return 0.0f;
        }
        float fA = this.f75993c.a(q.d(j8));
        f.a aVar = f.f75994b;
        return fA;
    }

    @Override // g6.i
    public final long Y(float f14) {
        return f0.H(this.f75993c.b(f14), 4294967296L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f75991a, eVar.f75991a) == 0 && Float.compare(this.f75992b, eVar.f75992b) == 0 && p005kotlin.jvm.internal.s.g(this.f75993c, eVar.f75993c);
    }

    @Override // g6.c
    /* JADX INFO: renamed from: getDensity, reason: from getter */
    public final float getF94881a() {
        return this.f75991a;
    }

    public final int hashCode() {
        return this.f75993c.hashCode() + q6.f.d(this.f75992b, Float.hashCode(this.f75991a) * 31, 31);
    }

    @Override // g6.i
    /* JADX INFO: renamed from: r0, reason: from getter */
    public final float getF94882b() {
        return this.f75992b;
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f75991a + ", fontScale=" + this.f75992b + ", converter=" + this.f75993c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
