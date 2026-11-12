package f2;

import f5.k2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lf2/d;", "Lf2/m0;", "Lkotlin/Function2;", "Lg6/c;", "Lg6/a;", "Lf2/l0;", "calculation", "<init>", "(Le23/p;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.p<g6.c, g6.a, l0> f68187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f68188b = g6.b.b(0, 0, 15);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f68189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l0 f68190d;

    /* JADX WARN: Multi-variable type inference failed */
    public d(e23.p<? super g6.c, ? super g6.a, l0> pVar) {
        this.f68187a = pVar;
    }

    @Override // f2.m0
    public final l0 a(g2.s0 s0Var, long j8) {
        k2 k2Var = s0Var.f75213b;
        if (this.f68190d != null && g6.a.d(this.f68188b, j8) && this.f68189c == k2Var.getF75991a()) {
            l0 l0Var = this.f68190d;
            l0Var.getClass();
            return l0Var;
        }
        this.f68188b = j8;
        this.f68189c = k2Var.getF75991a();
        l0 l0VarInvoke = this.f68187a.invoke(s0Var, g6.a.a(j8));
        this.f68190d = l0VarInvoke;
        return l0VarInvoke;
    }
}
