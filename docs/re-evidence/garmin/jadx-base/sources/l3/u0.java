package l3;

import ch.qos.logback.core.CoreConstants;
import i3.y7;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ll3/u0;", "Lk6/c0;", "Lg6/g;", "contentOffset", "Lg6/c;", "density", "", "verticalMargin", "Lkotlin/Function2;", "Lg6/l;", "", "onPositionCalculated", "<init>", "(JLg6/c;ILe23/p;Lkotlin/jvm/internal/j;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class u0 implements p004k6.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f109425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g6.c f109426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f109427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.p<g6.l, g6.l, Unit> f109428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f109429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f109430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m2 f109431g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m2 f109432h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e f109433i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f109434j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e f109435k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n2 f109436l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n2 f109437m;

    /* JADX WARN: Multi-variable type inference failed */
    private u0(long j8, g6.c cVar, int i14, e23.p<? super g6.l, ? super g6.l, Unit> pVar) {
        this.f109425a = j8;
        this.f109426b = cVar;
        this.f109427c = i14;
        this.f109428d = pVar;
        int iF0 = cVar.f0(g6.g.b(j8));
        g1.f109252a.getClass();
        h4.d.a aVar = h4.d.f81522a;
        aVar.getClass();
        h4.g.a aVar2 = h4.d.a.f81536n;
        this.f109429e = new d(aVar2, aVar2, iF0);
        aVar.getClass();
        h4.g.a aVar3 = h4.d.a.f81538p;
        this.f109430f = new d(aVar3, aVar3, iF0);
        h4.a aVar4 = h4.a.f81516a;
        aVar4.getClass();
        this.f109431g = new m2(h4.a.f81519d, 0);
        aVar4.getClass();
        this.f109432h = new m2(h4.a.f81520e, 0);
        int iF1 = cVar.f0(g6.g.c(j8));
        aVar.getClass();
        h4.g.b bVar = h4.d.a.f81533k;
        h4.g.b bVar2 = h4.d.a.f81535m;
        this.f109433i = new e(bVar, bVar2, iF1);
        aVar.getClass();
        this.f109434j = new e(bVar2, bVar, iF1);
        aVar.getClass();
        this.f109435k = new e(h4.d.a.f81534l, bVar, iF1);
        aVar.getClass();
        this.f109436l = new n2(bVar, i14);
        aVar.getClass();
        this.f109437m = new n2(bVar2, i14);
    }

    @Override // p004k6.c0
    public final long a(g6.l lVar, long j8, g6.o oVar, long j14) {
        g6.l lVar2;
        long j15;
        char c14;
        int iA;
        int i14;
        int i15;
        long jA = lVar.a();
        g6.k.a aVar = g6.k.f76003b;
        char c15 = ' ';
        int i16 = (int) (j8 >> 32);
        boolean z14 = true;
        List listK = p13.x.k(this.f109429e, this.f109430f, ((int) (jA >> 32)) < i16 / 2 ? this.f109431g : this.f109432h);
        int size = listK.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size) {
                lVar2 = lVar;
                j15 = j8;
                c14 = c15;
                iA = 0;
                break;
            }
            g1.a aVar2 = (g1.a) listK.get(i17);
            int i18 = (int) (j14 >> c15);
            int i19 = size;
            c14 = c15;
            j15 = j8;
            int i24 = i17;
            lVar2 = lVar;
            iA = aVar2.a(lVar2, j15, i18, oVar);
            if (i24 == listK.size() - 1 || (iA >= 0 && i18 + iA <= i16)) {
                break;
            }
            i17 = i24 + 1;
            size = i19;
            c15 = c14;
        }
        int i25 = (int) (j15 & 4294967295L);
        List listK2 = p13.x.k(this.f109433i, this.f109434j, this.f109435k, ((int) (lVar2.a() & 4294967295L)) < i25 / 2 ? this.f109436l : this.f109437m);
        int size2 = listK2.size();
        int i26 = 0;
        while (i26 < size2) {
            boolean z15 = z14;
            int i27 = (int) (j14 & 4294967295L);
            int iA2 = ((g1.b) listK2.get(i26)).a(lVar2, j15, i27);
            if (i26 == listK2.size() - 1 || (iA2 >= (i15 = this.f109427c) && i27 + iA2 <= i25 - i15)) {
                i14 = iA2;
                long j16 = (((long) iA) << c14) | (((long) i14) & 4294967295L);
                this.f109428d.invoke(lVar2, lg.d.e(j16, j14));
                return j16;
            }
            i26++;
            z14 = z15;
        }
        i14 = 0;
        long j17 = (((long) iA) << c14) | (((long) i14) & 4294967295L);
        this.f109428d.invoke(lVar2, lg.d.e(j17, j14));
        return j17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        long j8 = u0Var.f109425a;
        int i14 = g6.g.f75998b;
        return this.f109425a == j8 && p005kotlin.jvm.internal.s.g(this.f109426b, u0Var.f109426b) && this.f109427c == u0Var.f109427c && p005kotlin.jvm.internal.s.g(this.f109428d, u0Var.f109428d);
    }

    public final int hashCode() {
        int i14 = g6.g.f75998b;
        return this.f109428d.hashCode() + q2.d(this.f109427c, (this.f109426b.hashCode() + (Long.hashCode(this.f109425a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) g6.g.d(this.f109425a)) + ", density=" + this.f109426b + ", verticalMargin=" + this.f109427c + ", onPositionCalculated=" + this.f109428d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ u0(long j8, g6.c cVar, int i14, e23.p pVar, p005kotlin.jvm.internal.j jVar) {
        this(j8, cVar, i14, pVar);
    }

    public u0(long j8, g6.c cVar, int i14, e23.p pVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this(j8, cVar, (i15 & 4) != 0 ? cVar.f0(y7.f90417a) : i14, (i15 & 8) != 0 ? new ky0.c(17) : pVar, null);
    }
}
