package uh;

import java.util.Collection;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;
import r53.i;
import vh.e;
import vh.f;
import vh.g0;
import vh.n0;
import vh.n0.a;
import vh.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0003B\u001f\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Luh/a;", "Lvh/n0$a;", "D", "", "Luh/b;", "apolloClient", "Lvh/n0;", "operation", "<init>", "(Luh/b;Lvh/n0;)V", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class a<D extends n0.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f171096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0<D> f171097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g0 f171098c;

    public a(b bVar, n0<D> n0Var) {
        bVar.getClass();
        n0Var.getClass();
        this.f171096a = bVar;
        this.f171097b = n0Var;
        this.f171098c = g0.f178322a;
    }

    public final i<f<D>> a() {
        e.a aVar = new e.a(this.f171097b);
        g0 g0Var = this.f171098c;
        g0Var.getClass();
        aVar.f178299c = g0Var;
        aVar.f178300d = null;
        aVar.f178301e = null;
        aVar.f178302f = null;
        aVar.f178303g = null;
        aVar.f178304h = null;
        aVar.f178305i = null;
        e<D> eVarB = aVar.b();
        b bVar = this.f171096a;
        List<wh.e> list = bVar.f171105g;
        c cVar = bVar.f171110l;
        z zVar = bVar.f171100b;
        cVar.getClass();
        g0 g0VarC = g0.b.a.d(zVar, cVar).c(bVar.f171103e);
        g0 g0Var2 = eVarB.f178290c;
        g0 g0VarC2 = g0VarC.c(g0Var2);
        e.a aVar2 = new e.a(eVarB.f178288a);
        aVar2.a(cVar);
        aVar2.a(zVar);
        aVar2.a(g0VarC2);
        aVar2.a(g0Var2);
        aVar2.f178300d = bVar.f171104f;
        aVar2.f178302f = bVar.f171106h;
        aVar2.f178303g = bVar.f171107i;
        aVar2.f178304h = bVar.f171108j;
        List<wh.e> list2 = eVarB.f178292e;
        if (list2 != null) {
            list = list2;
        }
        aVar2.f178301e = list;
        wh.f fVar = eVarB.f178291d;
        if (fVar != null) {
            aVar2.f178300d = fVar;
        }
        Boolean bool = eVarB.f178293f;
        if (bool != null) {
            aVar2.f178302f = bool;
        }
        Boolean bool2 = eVarB.f178294g;
        if (bool2 != null) {
            aVar2.f178303g = bool2;
        }
        Boolean bool3 = eVarB.f178295h;
        if (bool3 != null) {
            aVar2.f178304h = bool3;
        }
        Boolean bool4 = eVarB.f178296i;
        if (bool4 != null) {
            String strValueOf = String.valueOf(bool4);
            Collection collection = aVar2.f178301e;
            if (collection == null) {
                collection = j0.f134944a;
            }
            aVar2.f178301e = h0.D0(collection, new wh.e("X-APOLLO-CAN-BE-BATCHED", strValueOf));
        }
        return new ki.c(h0.D0(bVar.f171102d, bVar.f171111m), 0).a(aVar2.b());
    }
}
