package x1;

import e23.p;
import g6.o;
import p004k6.c0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import w3.x;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nB/\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\f¨\u0006\r"}, d2 = {"Lx1/h;", "Lk6/c0;", "Lkotlin/Function0;", "Lg6/k;", "anchorPositionBlock", "Lkotlin/Function2;", "Lg6/l;", "", "onPositionCalculated", "<init>", "(Le23/a;Le23/p;)V", "anchorPosition", "(JLe23/p;Lkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.a<g6.k> f188344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p<g6.k, g6.l, Unit> f188345b;

    private h(long j8, p<? super g6.k, ? super g6.l, Unit> pVar) {
        this(new a90.b(j8, 17), pVar);
    }

    @Override // p004k6.c0
    public final long a(g6.l lVar, long j8, o oVar, long j14) {
        long j15 = this.f188344a.invoke().f76005a;
        long jH = (((long) x.h(lVar.f76008a + ((int) (j15 >> 32)), (int) (j14 >> 32), (int) (j8 >> 32), oVar == o.Ltr)) << 32) | (4294967295L & ((long) x.h(lVar.f76009b + ((int) (j15 & 4294967295L)), (int) (j14 & 4294967295L), (int) (j8 & 4294967295L), true)));
        p<g6.k, g6.l, Unit> pVar = this.f188345b;
        if (pVar != null) {
            pVar.invoke(g6.k.a(j15), lg.d.e(jH, j14));
        }
        return jH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(e23.a<g6.k> aVar, p<? super g6.k, ? super g6.l, Unit> pVar) {
        this.f188344a = aVar;
        this.f188345b = pVar;
    }

    public /* synthetic */ h(e23.a aVar, p pVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((e23.a<g6.k>) aVar, (p<? super g6.k, ? super g6.l, Unit>) ((i14 & 2) != 0 ? null : pVar));
    }

    public /* synthetic */ h(long j8, p pVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, (i14 & 2) != 0 ? null : pVar, null);
    }

    public /* synthetic */ h(long j8, p pVar, p005kotlin.jvm.internal.j jVar) {
        this(j8, (p<? super g6.k, ? super g6.l, Unit>) pVar);
    }
}
