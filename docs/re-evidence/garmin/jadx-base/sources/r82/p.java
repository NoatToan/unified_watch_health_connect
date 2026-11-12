package r82;

import o13.z;
import o4.d0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B¥\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lr82/p;", "T", "", "Li53/c;", "list", "", "firstIndex", "Lkotlin/Function1;", "", "formatText", "Lkotlin/Function0;", "", "beforeContent", "afterContent", "Lg6/f;", "itemHeight", "", "topDividerVisible", "bottomDividerVisible", "Lo4/d0;", "dividerColor", "Lh4/d$b;", "horizontalAlignment", "onSelect", "<init>", "(Li53/c;ILe23/l;Le23/p;Le23/p;FZZLo4/d0;Lh4/d$b;Le23/l;Lkotlin/jvm/internal/j;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.c<T> f151304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f151305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.l<T, String> f151306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.p<p3.m, Integer, Unit> f151307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e23.p<p3.m, Integer, Unit> f151308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f151309f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f151310g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f151311h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d0 f151312i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h4.d.b f151313j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e23.l<Integer, Unit> f151314k;

    /* JADX WARN: Illegal instructions before constructor call */
    public p(i53.c cVar, int i14, e23.l lVar, e23.p pVar, e23.p pVar2, float f14, boolean z14, boolean z15, d0 d0Var, h4.d.b bVar, e23.l lVar2, int i15, p005kotlin.jvm.internal.j jVar) {
        float f15;
        h4.d.b bVar2;
        int i16 = (i15 & 2) != 0 ? 0 : i14;
        e23.l lVar3 = (i15 & 4) != 0 ? null : lVar;
        e23.p pVar3 = (i15 & 8) != 0 ? null : pVar;
        e23.p pVar4 = (i15 & 16) != 0 ? null : pVar2;
        if ((i15 & 32) != 0) {
            g6.f.a aVar = g6.f.f75994b;
            f15 = 52;
        } else {
            f15 = f14;
        }
        boolean z16 = (i15 & 64) != 0 ? true : z14;
        boolean z17 = (i15 & 128) != 0 ? true : z15;
        d0 d0Var2 = (i15 & 256) != 0 ? null : d0Var;
        if ((i15 & 512) != 0) {
            h4.d.f81522a.getClass();
            bVar2 = h4.d.a.f81537o;
        } else {
            bVar2 = bVar;
        }
        this(cVar, i16, lVar3, pVar3, pVar4, f15, z16, z17, d0Var2, bVar2, (i15 & 1024) != 0 ? new e(5) : lVar2, null);
    }

    public static p a(p pVar, e23.p pVar2) {
        i53.c<T> cVar = pVar.f151304a;
        int i14 = pVar.f151305b;
        e23.l<T, String> lVar = pVar.f151306c;
        e23.p<p3.m, Integer, Unit> pVar3 = pVar.f151307d;
        float f14 = pVar.f151309f;
        boolean z14 = pVar.f151310g;
        boolean z15 = pVar.f151311h;
        d0 d0Var = pVar.f151312i;
        h4.d.b bVar = pVar.f151313j;
        e23.l<Integer, Unit> lVar2 = pVar.f151314k;
        pVar.getClass();
        cVar.getClass();
        bVar.getClass();
        lVar2.getClass();
        return new p(cVar, i14, lVar, pVar3, pVar2, f14, z14, z15, d0Var, bVar, lVar2, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return p005kotlin.jvm.internal.s.g(this.f151304a, pVar.f151304a) && this.f151305b == pVar.f151305b && p005kotlin.jvm.internal.s.g(this.f151306c, pVar.f151306c) && p005kotlin.jvm.internal.s.g(this.f151307d, pVar.f151307d) && p005kotlin.jvm.internal.s.g(this.f151308e, pVar.f151308e) && g6.f.c(this.f151309f, pVar.f151309f) && this.f151310g == pVar.f151310g && this.f151311h == pVar.f151311h && p005kotlin.jvm.internal.s.g(this.f151312i, pVar.f151312i) && p005kotlin.jvm.internal.s.g(this.f151313j, pVar.f151313j) && p005kotlin.jvm.internal.s.g(this.f151314k, pVar.f151314k);
    }

    public final int hashCode() {
        int iD = q2.d(this.f151305b, this.f151304a.hashCode() * 31, 31);
        int iHashCode = 0;
        e23.l<T, String> lVar = this.f151306c;
        int iHashCode2 = (iD + (lVar == null ? 0 : lVar.hashCode())) * 31;
        e23.p<p3.m, Integer, Unit> pVar = this.f151307d;
        int iHashCode3 = (iHashCode2 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        e23.p<p3.m, Integer, Unit> pVar2 = this.f151308e;
        int iHashCode4 = (iHashCode3 + (pVar2 == null ? 0 : pVar2.hashCode())) * 31;
        g6.f.a aVar = g6.f.f75994b;
        int iG = q6.f.g(q6.f.g(q6.f.d(this.f151309f, iHashCode4, 31), 31, this.f151310g), 31, this.f151311h);
        d0 d0Var = this.f151312i;
        if (d0Var != null) {
            long j8 = d0Var.f128833a;
            z.a aVar2 = z.f128618b;
            iHashCode = Long.hashCode(j8);
        }
        return this.f151314k.hashCode() + ((this.f151313j.hashCode() + ((iG + iHashCode) * 31)) * 31);
    }

    public final String toString() {
        String strD = g6.f.d(this.f151309f);
        StringBuilder sb3 = new StringBuilder("PickerConfiguration(list=");
        sb3.append(this.f151304a);
        sb3.append(", firstIndex=");
        sb3.append(this.f151305b);
        sb3.append(", formatText=");
        sb3.append(this.f151306c);
        sb3.append(", beforeContent=");
        sb3.append(this.f151307d);
        sb3.append(", afterContent=");
        sb3.append(this.f151308e);
        sb3.append(", itemHeight=");
        sb3.append(strD);
        sb3.append(", topDividerVisible=");
        kg.f.q(", bottomDividerVisible=", ", dividerColor=", sb3, this.f151310g, this.f151311h);
        sb3.append(this.f151312i);
        sb3.append(", horizontalAlignment=");
        sb3.append(this.f151313j);
        sb3.append(", onSelect=");
        sb3.append(this.f151314k);
        sb3.append(")");
        return sb3.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private p(i53.c<? extends T> cVar, int i14, e23.l<? super T, String> lVar, e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, float f14, boolean z14, boolean z15, d0 d0Var, h4.d.b bVar, e23.l<? super Integer, Unit> lVar2) {
        cVar.getClass();
        bVar.getClass();
        lVar2.getClass();
        this.f151304a = cVar;
        this.f151305b = i14;
        this.f151306c = lVar;
        this.f151307d = pVar;
        this.f151308e = pVar2;
        this.f151309f = f14;
        this.f151310g = z14;
        this.f151311h = z15;
        this.f151312i = d0Var;
        this.f151313j = bVar;
        this.f151314k = lVar2;
    }

    public /* synthetic */ p(i53.c cVar, int i14, e23.l lVar, e23.p pVar, e23.p pVar2, float f14, boolean z14, boolean z15, d0 d0Var, h4.d.b bVar, e23.l lVar2, p005kotlin.jvm.internal.j jVar) {
        this(cVar, i14, lVar, pVar, pVar2, f14, z14, z15, d0Var, bVar, lVar2);
    }
}
