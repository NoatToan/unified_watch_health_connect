package b0;

import androidx.camera.core.impl.r1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f14048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f14049d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet<p> f14050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14051b;

    static {
        a aVar = new a();
        aVar.a(0);
        f14048c = new t(aVar.f14052a, null);
        a aVar2 = new a();
        aVar2.a(1);
        f14049d = new t(aVar2.f14052a, null);
    }

    public t(LinkedHashSet<p> linkedHashSet, String str) {
        this.f14050a = linkedHashSet;
        this.f14051b = str;
    }

    public final List a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator<p> it = this.f14050a.iterator();
        while (it.hasNext()) {
            arrayList2 = it.next().a(Collections.unmodifiableList(arrayList2));
        }
        arrayList2.retainAll(arrayList);
        return arrayList2;
    }

    public final Integer b() {
        Integer num = null;
        for (p pVar : this.f14050a) {
            if (pVar instanceof r1) {
                Integer numValueOf = Integer.valueOf(((r1) pVar).f5731b);
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    vb.h.z("Multiple conflicting lens facing requirements exist.");
                    return null;
                }
            }
        }
        return num;
    }

    public final androidx.camera.core.impl.l0 c(LinkedHashSet<androidx.camera.core.impl.l0> linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator<androidx.camera.core.impl.l0> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b());
        }
        List listA = a(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (androidx.camera.core.impl.l0 l0Var : linkedHashSet) {
            if (listA.contains(l0Var.b())) {
                linkedHashSet2.add(l0Var);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            return (androidx.camera.core.impl.l0) it3.next();
        }
        StringBuilder sb3 = new StringBuilder("Cams:");
        sb3.append(linkedHashSet.size());
        Iterator<androidx.camera.core.impl.l0> it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            androidx.camera.core.impl.k0 k0VarC = it4.next().c();
            sb3.append(" Id:" + k0VarC.q() + "  Lens:" + k0VarC.b());
        }
        String string = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        LinkedHashSet<p> linkedHashSet3 = this.f14050a;
        sb4.append("PhyId:" + this.f14051b + "  Filters:" + linkedHashSet3.size());
        for (p pVar : linkedHashSet3) {
            sb4.append(" Id:");
            pVar.getClass();
            sb4.append(p.f14043a);
            if (pVar instanceof r1) {
                sb4.append(" LensFilter:");
                sb4.append(((r1) pVar).f5731b);
            }
        }
        vb.h.s(androidx.room.a0.j("No available camera can be found. ", string, StringUtils.SPACE, sb4.toString()));
        return null;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashSet<p> f14052a;

        public a() {
            this.f14052a = new LinkedHashSet<>();
        }

        public final void a(int i14) {
            k7.h.f(i14 != -1, "The specified lens facing is invalid.");
            this.f14052a.add(new r1(i14));
        }

        private a(LinkedHashSet<p> linkedHashSet) {
            this.f14052a = new LinkedHashSet<>(linkedHashSet);
        }
    }
}
