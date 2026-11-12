package k2;

import g6.o;
import o4.b1;
import o4.r1;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lk2/a;", "Lo4/r1;", "", "Lk2/b;", "topStart", "topEnd", "bottomEnd", "bottomStart", "<init>", "(Lk2/b;Lk2/b;Lk2/b;Lk2/b;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class a implements r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f102398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f102399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f102400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f102401d;

    public a(b bVar, b bVar2, b bVar3, b bVar4) {
        this.f102398a = bVar;
        this.f102399b = bVar2;
        this.f102400c = bVar3;
        this.f102401d = bVar4;
    }

    public static /* synthetic */ a c(a aVar, b bVar, b bVar2, b bVar3, b bVar4, int i14) {
        if ((i14 & 1) != 0) {
            bVar = aVar.f102398a;
        }
        if ((i14 & 2) != 0) {
            bVar2 = aVar.f102399b;
        }
        if ((i14 & 4) != 0) {
            bVar3 = aVar.f102400c;
        }
        if ((i14 & 8) != 0) {
            bVar4 = aVar.f102401d;
        }
        return aVar.b(bVar, bVar2, bVar3, bVar4);
    }

    @Override // o4.r1
    public final b1 a(long j8, o oVar, g6.c cVar) {
        float fA = this.f102398a.a(cVar, j8);
        float fA2 = this.f102399b.a(cVar, j8);
        float fA3 = this.f102400c.a(cVar, j8);
        float fA4 = this.f102401d.a(cVar, j8);
        float f14 = n4.g.f(j8);
        float f15 = fA + fA4;
        if (f15 > f14) {
            float f16 = f14 / f15;
            fA *= f16;
            fA4 *= f16;
        }
        float f17 = fA2 + fA3;
        if (f17 > f14) {
            float f18 = f14 / f17;
            fA2 *= f18;
            fA3 *= f18;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            StringBuilder sbI = e0.i("Corner size in Px can't be negative(topStart = ", fA, ", topEnd = ", fA2, ", bottomEnd = ");
            sbI.append(fA3);
            sbI.append(", bottomStart = ");
            sbI.append(fA4);
            sbI.append(")!");
            b2.e.a(sbI.toString());
        }
        return d(j8, fA, fA2, fA3, fA4, oVar);
    }

    public abstract a b(b bVar, b bVar2, b bVar3, b bVar4);

    public abstract b1 d(long j8, float f14, float f15, float f16, float f17, o oVar);
}
