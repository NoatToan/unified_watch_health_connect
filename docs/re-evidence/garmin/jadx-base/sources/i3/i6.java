package i3;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\u001a\b\u0002\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Li3/i6;", "Lk6/c0;", "Lg6/c;", "density", "", "topWindowInsets", "Lp3/x3;", "", "keyboardSignalState", "verticalMargin", "Lkotlin/Function2;", "Lg6/l;", "onPositionCalculated", "<init>", "(Lg6/c;ILp3/x3;ILe23/p;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i6 implements p004k6.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g6.c f88399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p3.x3<Unit> f88401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.p<g6.l, g6.l, Unit> f88402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l3.d f88403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l3.d f88404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l3.m2 f88405g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l3.m2 f88406h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l3.e f88407i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l3.e f88408j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l3.n2 f88409k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l3.n2 f88410l;

    /* JADX WARN: Multi-variable type inference failed */
    public i6(g6.c cVar, int i14, p3.x3<Unit> x3Var, int i15, e23.p<? super g6.l, ? super g6.l, Unit> pVar) {
        this.f88399a = cVar;
        this.f88400b = i14;
        this.f88401c = x3Var;
        this.f88402d = pVar;
        l3.g1.f109252a.getClass();
        h4.d.a aVar = h4.d.f81522a;
        aVar.getClass();
        h4.g.a aVar2 = h4.d.a.f81536n;
        this.f88403e = new l3.d(aVar2, aVar2, 0);
        aVar.getClass();
        h4.g.a aVar3 = h4.d.a.f81538p;
        this.f88404f = new l3.d(aVar3, aVar3, 0);
        h4.a aVar4 = h4.a.f81516a;
        aVar4.getClass();
        this.f88405g = new l3.m2(h4.a.f81519d, 0);
        aVar4.getClass();
        this.f88406h = new l3.m2(h4.a.f81520e, 0);
        aVar.getClass();
        h4.g.b bVar = h4.d.a.f81533k;
        h4.g.b bVar2 = h4.d.a.f81535m;
        this.f88407i = new l3.e(bVar, bVar2, 0);
        aVar.getClass();
        this.f88408j = new l3.e(bVar2, bVar, 0);
        aVar.getClass();
        this.f88409k = new l3.n2(bVar, i15);
        aVar.getClass();
        this.f88410l = new l3.n2(bVar2, i15);
    }

    @Override // p004k6.c0
    public final long a(g6.l lVar, long j8, g6.o oVar, long j14) {
        g6.l lVar2;
        char c14;
        long j15;
        int iA;
        p3.x3<Unit> x3Var = this.f88401c;
        if (x3Var != null) {
            x3Var.getF182175a();
        }
        char c15 = ' ';
        long j16 = 4294967295L;
        long j17 = (((long) ((int) (j8 >> 32))) << 32) | (((long) (((int) (j8 & 4294967295L)) + this.f88400b)) & 4294967295L);
        g6.m.a aVar = g6.m.f76012b;
        long jA = lVar.a();
        g6.k.a aVar2 = g6.k.f76003b;
        int i14 = (int) (j17 >> 32);
        int i15 = 0;
        List listK = p13.x.k(this.f88403e, this.f88404f, ((int) (jA >> 32)) < i14 / 2 ? this.f88405g : this.f88406h);
        int size = listK.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size) {
                lVar2 = lVar;
                c14 = c15;
                j15 = j16;
                iA = 0;
                break;
            }
            c14 = c15;
            j15 = j16;
            int i17 = (int) (j14 >> c14);
            int i18 = size;
            int i19 = i16;
            lVar2 = lVar;
            List list = listK;
            iA = ((l3.g1.a) listK.get(i16)).a(lVar2, j17, i17, oVar);
            if (i19 == list.size() - 1 || (iA >= 0 && i17 + iA <= i14)) {
                break;
            }
            i16 = i19 + 1;
            listK = list;
            size = i18;
            c15 = c14;
            j16 = j15;
        }
        int i24 = (int) (j17 & j15);
        List listK2 = p13.x.k(this.f88407i, this.f88408j, ((int) (lVar2.a() & j15)) < i24 / 2 ? this.f88409k : this.f88410l);
        int size2 = listK2.size();
        for (int i25 = 0; i25 < size2; i25++) {
            int i26 = (int) (j14 & j15);
            int iA2 = ((l3.g1.b) listK2.get(i25)).a(lVar2, j17, i26);
            if (i25 == listK2.size() - 1 || (iA2 >= 0 && i26 + iA2 <= i24)) {
                i15 = iA2;
                break;
            }
        }
        long j18 = (((long) iA) << c14) | (((long) i15) & j15);
        this.f88402d.invoke(lVar2, lg.d.e(j18, j14));
        return j18;
    }

    public i6(g6.c cVar, int i14, p3.x3 x3Var, int i15, e23.p pVar, int i16, p005kotlin.jvm.internal.j jVar) {
        this(cVar, i14, (i16 & 4) != 0 ? null : x3Var, (i16 & 8) != 0 ? cVar.f0(y7.f90417a) : i15, (i16 & 16) != 0 ? new ho2.o(14) : pVar);
    }
}
