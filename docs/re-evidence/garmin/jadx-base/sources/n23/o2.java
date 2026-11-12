package n23;

import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public class o2 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2.b f122550a;

    public o2(f2.b bVar) {
        this.f122550a = bVar;
    }

    @Override // e23.a
    public final Object invoke() {
        k23.l<Object>[] lVarArr = f2.b.f122443u;
        f2.b bVar = this.f122550a;
        c4.a aVar = bVar.f122455n;
        k23.l<Object>[] lVarArr2 = f2.b.f122443u;
        k23.l<Object> lVar = lVarArr2[11];
        Object objInvoke = aVar.invoke();
        objInvoke.getClass();
        c4.a aVar2 = bVar.f122457p;
        k23.l<Object> lVar2 = lVarArr2[13];
        Object objInvoke2 = aVar2.invoke();
        objInvoke2.getClass();
        return p13.h0.C0((Collection) objInvoke, (Collection) objInvoke2);
    }
}
