package y23;

import d53.u;
import h33.o;
import z23.d0;
import z23.t;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassLoader f194346a;

    public d(ClassLoader classLoader) {
        classLoader.getClass();
        this.f194346a = classLoader;
    }

    @Override // h33.o
    public final t a(o.a aVar) {
        Class<?> cls;
        x33.b bVar = aVar.f81482a;
        x33.c cVar = bVar.f188591a;
        String strW = u.w(bVar.f188592b.f188596a.f188600a, '.', '$');
        if (!cVar.f188596a.c()) {
            strW = cVar.f188596a.f188600a + '.' + strW;
        }
        try {
            cls = Class.forName(strW, false, this.f194346a);
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls != null) {
            return new t(cls);
        }
        return null;
    }

    @Override // h33.o
    public final d0 b(x33.c cVar) {
        cVar.getClass();
        return new d0(cVar);
    }

    @Override // h33.o
    public final void c(x33.c cVar) {
        cVar.getClass();
    }
}
