package l33;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class o0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f109794a;

    public o0(u0 u0Var) {
        this.f109794a = u0Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.l
    public final Object invoke(Object obj) {
        x33.f fVar = (x33.f) obj;
        k23.l<Object>[] lVarArr = u0.f109809m;
        fVar.getClass();
        u0 u0Var = this.f109794a;
        LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) ((o43.e.k) u0Var.f109814f).invoke(fVar));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : linkedHashSet) {
            String strA = q33.b0.a((t23.x0) obj2, 2);
            Object arrayList = linkedHashMap.get(strA);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strA, arrayList);
            }
            ((List) arrayList).add(obj2);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                Collection collectionA = b43.w.a(list, t0.f109806a);
                linkedHashSet.removeAll(list);
                linkedHashSet.addAll(collectionA);
            }
        }
        u0Var.m(linkedHashSet, fVar);
        k33.i iVar = u0Var.f109810b;
        return p13.h0.b1(iVar.f102785a.f102768r.c(iVar, linkedHashSet));
    }
}
