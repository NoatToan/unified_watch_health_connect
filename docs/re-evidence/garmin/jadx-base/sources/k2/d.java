package k2;

import ch.qos.logback.core.CoreConstants;
import g6.o;
import o4.b1;
import o4.j;
import o4.m;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lk2/d;", "Lk2/a;", "Lk2/b;", "topStart", "topEnd", "bottomEnd", "bottomStart", "<init>", "(Lk2/b;Lk2/b;Lk2/b;Lk2/b;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d extends a {
    public d(b bVar, b bVar2, b bVar3, b bVar4) {
        super(bVar, bVar2, bVar3, bVar4);
    }

    @Override // k2.a
    public final a b(b bVar, b bVar2, b bVar3, b bVar4) {
        return new d(bVar, bVar2, bVar3, bVar4);
    }

    @Override // k2.a
    public final b1 d(long j8, float f14, float f15, float f16, float f17, o oVar) {
        if (f14 + f15 + f17 + f16 == 0.0f) {
            return new b1.b(n4.h.c(j8));
        }
        j jVarA = m.a();
        o oVar2 = o.Ltr;
        float f18 = oVar == oVar2 ? f14 : f15;
        jVarA.a(0.0f, f18);
        jVarA.c(f18, 0.0f);
        if (oVar == oVar2) {
            f14 = f15;
        }
        int i14 = (int) (j8 >> 32);
        jVarA.c(Float.intBitsToFloat(i14) - f14, 0.0f);
        jVarA.c(Float.intBitsToFloat(i14), f14);
        float f19 = oVar == oVar2 ? f16 : f17;
        int i15 = (int) (j8 & 4294967295L);
        jVarA.c(Float.intBitsToFloat(i14), Float.intBitsToFloat(i15) - f19);
        jVarA.c(Float.intBitsToFloat(i14) - f19, Float.intBitsToFloat(i15));
        if (oVar == oVar2) {
            f16 = f17;
        }
        jVarA.c(f16, Float.intBitsToFloat(i15));
        jVarA.c(0.0f, Float.intBitsToFloat(i15) - f16);
        jVarA.close();
        return new b1.a(jVarA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f102398a, dVar.f102398a) && s.g(this.f102399b, dVar.f102399b) && s.g(this.f102400c, dVar.f102400c) && s.g(this.f102401d, dVar.f102401d);
    }

    public final int hashCode() {
        return this.f102401d.hashCode() + ((this.f102400c.hashCode() + ((this.f102399b.hashCode() + (this.f102398a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CutCornerShape(topStart = " + this.f102398a + ", topEnd = " + this.f102399b + ", bottomEnd = " + this.f102400c + ", bottomStart = " + this.f102401d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
