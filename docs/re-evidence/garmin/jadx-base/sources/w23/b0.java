package w23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class b0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f181577a;

    public b0(c0 c0Var) {
        this.f181577a = c0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        k23.l<Object>[] lVarArr = c0.f181578h;
        c0 c0Var = this.f181577a;
        boolean zIsEmpty = c0Var.isEmpty();
        x33.c cVar = c0Var.f181580d;
        i0 i0Var = c0Var.f181579c;
        if (zIsEmpty) {
            return i43.l.b.f91061b;
        }
        List<t23.h0> listX = c0Var.x();
        ArrayList arrayList = new ArrayList(p13.y.r(listX, 10));
        Iterator<T> it = listX.iterator();
        while (it.hasNext()) {
            arrayList.add(((t23.h0) it.next()).i());
        }
        ArrayList arrayListD0 = p13.h0.D0(arrayList, new s0(i0Var, cVar));
        i43.b.a aVar = i43.b.f91022d;
        String str = "package view scope for " + cVar + " in " + i0Var.getName();
        aVar.getClass();
        return i43.b.a.a(str, arrayListD0);
    }
}
