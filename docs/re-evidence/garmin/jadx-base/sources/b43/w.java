package b43;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import p13.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class w {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <H> Collection<H> a(Collection<? extends H> collection, e23.l<? super H, ? extends t23.a> lVar) {
        collection.getClass();
        lVar.getClass();
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        z43.j.f202430c.getClass();
        z43.j jVarA = z43.j.b.a();
        while (!linkedList.isEmpty()) {
            Object objB0 = h0.b0(linkedList);
            z43.j.f202430c.getClass();
            z43.j jVarA2 = z43.j.b.a();
            ArrayList<a0.f> arrayListI = p005kotlin.reflect.jvm.internal.impl.resolve.b.i(objB0, linkedList, lVar, new v(jVarA2));
            if (arrayListI.size() == 1 && jVarA2.isEmpty()) {
                Object objH0 = h0.H0(arrayListI);
                objH0.getClass();
                jVarA.add(objH0);
            } else {
                a0.g gVar = (Object) p005kotlin.reflect.jvm.internal.impl.resolve.b.u(arrayListI, lVar);
                t23.a aVarInvoke = lVar.invoke(gVar);
                for (a0.f fVar : arrayListI) {
                    fVar.getClass();
                    if (!p005kotlin.reflect.jvm.internal.impl.resolve.b.m(aVarInvoke, lVar.invoke(fVar))) {
                        jVarA2.add(fVar);
                    }
                }
                if (!jVarA2.isEmpty()) {
                    jVarA.addAll(jVarA2);
                }
                jVarA.add(gVar);
            }
        }
        return jVarA;
    }
}
