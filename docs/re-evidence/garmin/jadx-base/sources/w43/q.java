package w43;

import java.util.Collection;
import java.util.Iterator;
import p43.f2;
import p43.n0;
import p43.v0;

/* JADX INFO: loaded from: classes3.dex */
public class q implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f182023a = new q();

    @Override // e23.l
    public final Object invoke(Object obj) {
        v0 v0VarP;
        f2 f2VarY;
        n0 returnType;
        t23.v vVar = (t23.v) obj;
        s sVar = s.f182025a;
        vVar.getClass();
        t23.l lVarD = vVar.d();
        lVarD.getClass();
        if (lVarD instanceof t23.e) {
            x33.f fVar = p005kotlin.reflect.jvm.internal.impl.builtins.d.f105832e;
            if (p005kotlin.reflect.jvm.internal.impl.builtins.d.b((t23.e) lVarD, kotlin.reflect.jvm.internal.impl.builtins.f.a.f105869b)) {
                return null;
            }
        }
        Collection<? extends t23.b> collectionO = vVar.o();
        collectionO.getClass();
        Collection<? extends t23.b> collection = collectionO;
        if (!collection.isEmpty()) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                t23.l lVarD2 = ((t23.v) it.next()).d();
                lVarD2.getClass();
                if (lVarD2 instanceof t23.e) {
                    x33.f fVar2 = p005kotlin.reflect.jvm.internal.impl.builtins.d.f105832e;
                    if (p005kotlin.reflect.jvm.internal.impl.builtins.d.b((t23.e) lVarD2, kotlin.reflect.jvm.internal.impl.builtins.f.a.f105869b)) {
                        return null;
                    }
                }
            }
        }
        t23.l lVarD3 = vVar.d();
        t23.e eVar = lVarD3 instanceof t23.e ? (t23.e) lVarD3 : null;
        if (eVar != null) {
            if (!b43.j.e(eVar)) {
                eVar = null;
            }
            if (eVar != null && (v0VarP = eVar.p()) != null && (f2VarY = o72.t.Y(v0VarP)) != null && (returnType = vVar.getReturnType()) != null && p005kotlin.jvm.internal.s.g(vVar.getName(), t.f182030d)) {
                x33.f fVar3 = p005kotlin.reflect.jvm.internal.impl.builtins.d.f105832e;
                if ((p005kotlin.reflect.jvm.internal.impl.builtins.d.C(returnType, kotlin.reflect.jvm.internal.impl.builtins.f.a.f105883i) || p005kotlin.reflect.jvm.internal.impl.builtins.d.F(returnType)) && vVar.f().size() == 1) {
                    n0 type = vVar.f().get(0).getType();
                    type.getClass();
                    if (p005kotlin.jvm.internal.s.g(o72.t.Y(type), f2VarY) && vVar.S().isEmpty() && vVar.I() == null) {
                        return null;
                    }
                }
            }
        }
        StringBuilder sb3 = new StringBuilder("must override ''equals()'' in Any");
        t23.l lVarD4 = vVar.d();
        lVarD4.getClass();
        if (b43.j.e(lVarD4)) {
            a43.w wVar = a43.n.f1165c;
            t23.l lVarD5 = vVar.d();
            lVarD5.getClass();
            v0 v0VarP2 = ((t23.e) lVarD5).p();
            v0VarP2.getClass();
            sb3.append(" or define ''equals(other: " + wVar.W(o72.t.Y(v0VarP2)) + "): Boolean''");
        }
        return sb3.toString();
    }
}
