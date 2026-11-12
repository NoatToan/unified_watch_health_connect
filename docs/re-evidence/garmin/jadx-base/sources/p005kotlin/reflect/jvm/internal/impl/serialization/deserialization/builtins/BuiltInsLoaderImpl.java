package p005kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import e23.l;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import l43.b0;
import l43.f;
import l43.m;
import l43.o;
import l43.w;
import l43.x;
import m43.b;
import o43.n;
import p005kotlin.jvm.internal.q;
import p005kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;
import p13.j0;
import t23.c0;
import t23.g0;
import t23.i0;
import t23.l0;
import x33.c;

/* JADX INFO: loaded from: classes3.dex */
public final class BuiltInsLoaderImpl implements BuiltInsLoader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f105961b = new b();

    public static final /* synthetic */ class a extends q implements l<String, InputStream> {
        public a(Object obj) {
            super(1, obj, b.class, "loadResource", "loadResource(Ljava/lang/String;)Ljava/io/InputStream;", 0);
        }

        @Override // e23.l
        public final InputStream invoke(String str) {
            String str2 = str;
            str2.getClass();
            ((b) this.receiver).getClass();
            return b.a(str2);
        }
    }

    public final i0 createBuiltInPackageFragmentProvider(n nVar, c0 c0Var, Set<c> set, Iterable<? extends v23.b> iterable, v23.c cVar, v23.a aVar, boolean z14, l<? super String, ? extends InputStream> lVar) throws IOException {
        p005kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a aVarA;
        nVar.getClass();
        c0Var.getClass();
        set.getClass();
        iterable.getClass();
        cVar.getClass();
        aVar.getClass();
        lVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (c cVar2 : set) {
            m43.a.f116638q.getClass();
            InputStream inputStreamInvoke = lVar.invoke(m43.a.a(cVar2));
            if (inputStreamInvoke != null) {
                p005kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a.f105962m.getClass();
                aVarA = p005kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a.C2041a.a(cVar2, nVar, c0Var, inputStreamInvoke, z14);
            } else {
                aVarA = null;
            }
            if (aVarA != null) {
                arrayList.add(aVarA);
            }
        }
        l0 l0Var = new l0(arrayList);
        g0 g0Var = new g0(nVar, c0Var);
        o.a aVar2 = o.a.f110075a;
        l43.q qVar = new l43.q(l0Var);
        m43.a aVar3 = m43.a.f116638q;
        f fVar = new f(c0Var, g0Var, aVar3);
        b0.a aVar4 = b0.a.f109987a;
        w.a aVar5 = w.f110117a;
        aVar5.getClass();
        b33.a.C0220a c0220a = b33.a.C0220a.f15678a;
        x.a aVar6 = x.a.f110119a;
        m.f110048a.getClass();
        l43.n nVar2 = new l43.n(nVar, c0Var, aVar2, qVar, fVar, l0Var, aVar4, aVar5, c0220a, aVar6, iterable, g0Var, m.a.f110050b, aVar, cVar, aVar3.f102882a, null, new h43.b(nVar, j0.f134944a), null, null, 851968, null);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((p005kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a) it.next()).E0(nVar2);
        }
        return l0Var;
    }

    @Override // p005kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader
    public i0 createPackageFragmentProvider(n nVar, c0 c0Var, Iterable<? extends v23.b> iterable, v23.c cVar, v23.a aVar, boolean z14) {
        nVar.getClass();
        c0Var.getClass();
        iterable.getClass();
        cVar.getClass();
        aVar.getClass();
        return createBuiltInPackageFragmentProvider(nVar, c0Var, p005kotlin.reflect.jvm.internal.impl.builtins.f.f105866r, iterable, cVar, aVar, z14, new a(this.f105961b));
    }
}
