package k2;

import ch.qos.logback.core.CoreConstants;
import g6.o;
import o4.b1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lk2/h;", "Lk2/a;", "Lk2/b;", "topStart", "topEnd", "bottomEnd", "bottomStart", "<init>", "(Lk2/b;Lk2/b;Lk2/b;Lk2/b;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h extends a {
    public h(b bVar, b bVar2, b bVar3, b bVar4) {
        super(bVar, bVar2, bVar3, bVar4);
    }

    @Override // k2.a
    public final a b(b bVar, b bVar2, b bVar3, b bVar4) {
        return new h(bVar, bVar2, bVar3, bVar4);
    }

    @Override // k2.a
    public final b1 d(long j8, float f14, float f15, float f16, float f17, o oVar) {
        if (f14 + f15 + f16 + f17 == 0.0f) {
            return new b1.b(n4.h.c(j8));
        }
        n4.d dVarC = n4.h.c(j8);
        o oVar2 = o.Ltr;
        float f18 = oVar == oVar2 ? f14 : f15;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f18)) << 32) | (((long) Float.floatToRawIntBits(f18)) & 4294967295L);
        n4.a.C2318a c2318a = n4.a.f123535b;
        float f19 = oVar == oVar2 ? f15 : f14;
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f19)) & 4294967295L) | (((long) Float.floatToRawIntBits(f19)) << 32);
        float f22 = oVar == oVar2 ? f16 : f17;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f22)) << 32) | (((long) Float.floatToRawIntBits(f22)) & 4294967295L);
        float f24 = oVar == oVar2 ? f17 : f16;
        return new b1.c(n4.f.a(dVarC, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(f24)) << 32) | (((long) Float.floatToRawIntBits(f24)) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.g(this.f102398a, hVar.f102398a) && s.g(this.f102399b, hVar.f102399b) && s.g(this.f102400c, hVar.f102400c) && s.g(this.f102401d, hVar.f102401d);
    }

    public final int hashCode() {
        return this.f102401d.hashCode() + ((this.f102400c.hashCode() + ((this.f102399b.hashCode() + (this.f102398a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f102398a + ", topEnd = " + this.f102399b + ", bottomEnd = " + this.f102400c + ", bottomStart = " + this.f102401d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
