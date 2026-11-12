package vh;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvh/n;", "Lvh/g0;", TtmlNode.LEFT, "Lvh/g0$b;", "element", "<init>", "(Lvh/g0;Lvh/g0$b;)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class n implements g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f178356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0.b f178357c;

    public n(g0 g0Var, g0.b bVar) {
        g0Var.getClass();
        bVar.getClass();
        this.f178356b = g0Var;
        this.f178357c = bVar;
    }

    @Override // vh.g0
    public final g0 a(g0.c<?> cVar) {
        cVar.getClass();
        g0.b bVar = this.f178357c;
        g0.b bVarB = bVar.b(cVar);
        g0 g0Var = this.f178356b;
        if (bVarB != null) {
            return g0Var;
        }
        g0 g0VarA = g0Var.a(cVar);
        if (g0VarA == g0Var) {
            return this;
        }
        return g0VarA == c0.f178279b ? bVar : new n(g0VarA, bVar);
    }

    @Override // vh.g0
    public final <E extends g0.b> E b(g0.c<E> cVar) {
        cVar.getClass();
        n nVar = this;
        while (true) {
            E e4 = (E) nVar.f178357c.b(cVar);
            if (e4 != null) {
                return e4;
            }
            g0 g0Var = nVar.f178356b;
            if (!(g0Var instanceof n)) {
                return (E) g0Var.b(cVar);
            }
            nVar = (n) g0Var;
        }
    }

    @Override // vh.g0
    public final g0 c(g0 g0Var) {
        g0Var.getClass();
        return g0Var == c0.f178279b ? this : (g0) g0Var.fold(this, h0.f178325a);
    }

    @Override // vh.g0
    public final <R> R fold(R r14, e23.p<? super R, ? super g0.b, ? extends R> pVar) {
        pVar.getClass();
        return pVar.invoke((Object) this.f178356b.fold(r14, pVar), this.f178357c);
    }
}
