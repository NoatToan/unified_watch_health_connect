package n23;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public class v2 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2 f122643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f2.b f122644b;

    public v2(f2 f2Var, f2.b bVar) {
        this.f122643a = f2Var;
        this.f122644b = bVar;
    }

    @Override // e23.a
    public final Object invoke() {
        k23.l<Object>[] lVarArr = f2.b.f122443u;
        f2 f2Var = this.f122643a;
        if (f2Var.f122441d.isAnonymousClass()) {
            return null;
        }
        x33.b bVarS = f2Var.S();
        if (!bVarS.f188593c) {
            String strB = bVarS.f().b();
            strB.getClass();
            return strB;
        }
        Class<T> cls = f2Var.f122441d;
        this.f122644b.getClass();
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return d53.w.c0(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int iG = d53.w.G('$', 0, 6, simpleName);
            return iG == -1 ? simpleName : simpleName.substring(iG + 1, simpleName.length());
        }
        return d53.w.c0(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }
}
