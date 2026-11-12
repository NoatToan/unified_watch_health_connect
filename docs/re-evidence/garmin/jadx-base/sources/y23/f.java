package y23;

import d53.u;
import java.io.InputStream;
import q33.v;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassLoader f194350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m43.b f194351b;

    public f(ClassLoader classLoader) {
        classLoader.getClass();
        this.f194350a = classLoader;
        this.f194351b = new m43.b();
    }

    @Override // l43.a0
    public final InputStream a(x33.c cVar) {
        cVar.getClass();
        x33.f fVar = p005kotlin.reflect.jvm.internal.impl.builtins.f.f105859k;
        fVar.getClass();
        if (!cVar.f188596a.h(fVar)) {
            return null;
        }
        m43.a.f116638q.getClass();
        String strA = m43.a.a(cVar);
        this.f194351b.getClass();
        return m43.b.a(strA);
    }

    @Override // q33.v
    public final v.a.C2679a b(x33.b bVar, u33.c cVar) {
        Class<?> cls;
        bVar.getClass();
        cVar.getClass();
        String strW = u.w(bVar.f188592b.f188596a.f188600a, '.', '$');
        x33.c cVar2 = bVar.f188591a;
        if (!cVar2.f188596a.c()) {
            strW = cVar2 + '.' + strW;
        }
        try {
            cls = Class.forName(strW, false, this.f194350a);
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        e.f194347c.getClass();
        e eVarA = e.a.a(cls);
        if (eVarA != null) {
            return new v.a.C2679a(eVarA, null, 2, null);
        }
        return null;
    }

    @Override // q33.v
    public final v.a.C2679a c(o33.f fVar, u33.c cVar) {
        String str;
        Class<?> cls;
        fVar.getClass();
        cVar.getClass();
        x33.c cVarC = fVar.c();
        if (cVarC == null || (str = cVarC.f188596a.f188600a) == null) {
            return null;
        }
        try {
            cls = Class.forName(str, false, this.f194350a);
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        e.f194347c.getClass();
        e eVarA = e.a.a(cls);
        if (eVarA != null) {
            return new v.a.C2679a(eVarA, null, 2, null);
        }
        return null;
    }
}
