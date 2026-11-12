package n23;

import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public class q2 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2.b f122576a;

    public q2(f2.b bVar) {
        this.f122576a = bVar;
    }

    @Override // e23.a
    public final Object invoke() {
        f2.b bVar = this.f122576a;
        c4.a aVar = bVar.f122458q;
        k23.l<Object>[] lVarArr = f2.b.f122443u;
        k23.l<Object> lVar = lVarArr[14];
        Object objInvoke = aVar.invoke();
        objInvoke.getClass();
        c4.a aVar2 = bVar.f122459r;
        k23.l<Object> lVar2 = lVarArr[15];
        Object objInvoke2 = aVar2.invoke();
        objInvoke2.getClass();
        return p13.h0.C0((Collection) objInvoke, (Collection) objInvoke2);
    }
}
