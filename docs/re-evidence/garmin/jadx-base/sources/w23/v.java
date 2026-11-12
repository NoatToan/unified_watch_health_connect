package w23;

import java.util.Collection;
import java.util.Iterator;
import p43.a2;

/* JADX INFO: loaded from: classes3.dex */
public class v implements e23.a<Collection<t23.v>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a2 f181717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f181718b;

    public v(x xVar, a2 a2Var) {
        this.f181718b = xVar;
        this.f181717a = a2Var;
    }

    @Override // e23.a
    public final Collection<t23.v> invoke() {
        z43.i iVar = new z43.i();
        Iterator<? extends t23.v> it = this.f181718b.o().iterator();
        while (it.hasNext()) {
            iVar.add(it.next().b(this.f181717a));
        }
        return iVar;
    }
}
