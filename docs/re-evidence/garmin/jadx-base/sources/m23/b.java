package m23;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Collection;
import k23.g;
import k23.l;
import n23.b4;
import n23.s4;
import n23.y3;
import o23.h;
import p005kotlin.jvm.internal.l0;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f116206a;

        static {
            int[] iArr = new int[r33.a.EnumC2820a.values().length];
            try {
                iArr[r33.a.EnumC2820a.FILE_FACADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r33.a.EnumC2820a.MULTIFILE_CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r33.a.EnumC2820a.MULTIFILE_CLASS_PART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f116206a = iArr;
        }
    }

    public static final g<?> a(Collection<? extends k23.c<?>> collection, Method method) {
        for (k23.c<?> cVar : collection) {
            if (cVar instanceof g) {
                g<?> gVar = (g) cVar;
                if (s.g(gVar.getF122483i(), method.getName()) && s.g(c(gVar), method)) {
                    return gVar;
                }
            }
        }
        for (k23.c<?> cVar2 : collection) {
            if (cVar2 instanceof g) {
                g<?> gVar2 = (g) cVar2;
                if (!s.g(gVar2.getF122483i(), method.getName()) && s.g(c(gVar2), method)) {
                    return gVar2;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    public static final Field b(l<?> lVar) {
        b4 b4Var;
        lVar.getClass();
        x33.c cVar = s4.f122608a;
        if (lVar instanceof b4) {
            b4Var = (b4) lVar;
        } else if (lVar instanceof l0) {
            k23.c cVarCompute = ((l0) lVar).compute();
            if (cVarCompute instanceof b4) {
                b4Var = (b4) cVarCompute;
            } else {
                b4Var = null;
            }
        } else {
            b4Var = null;
        }
        if (b4Var != null) {
            return b4Var.B();
        }
        return null;
    }

    public static final Method c(g<?> gVar) {
        h<?> hVarA;
        gVar.getClass();
        y3<?> y3VarA = s4.a(gVar);
        Member memberC = (y3VarA == null || (hVarA = y3VarA.A()) == null) ? null : hVarA.c();
        if (memberC instanceof Method) {
            return (Method) memberC;
        }
        return null;
    }
}
