package vy2;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import n23.c4;
import n23.q3;
import n23.s4;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvy2/e;", "Lxy2/k;", "Luy2/c;", "Lvy2/i;", "Lcom/garmin/uisynthesizer/synthesize/execution/ExecutionInterceptor;", "<init>", "()V", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements xy2.k<uy2.c, i> {
    /* JADX WARN: Code duplicated, block: B:37:0x00ce  */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, o13.l] */
    @Override // xy2.k
    public final uy2.c a(xy2.d<uy2.c, i> dVar) {
        k23.g<?> gVarA;
        q3 q3Var;
        Object next;
        k23.g<?> gVarA2;
        r33.a aVar;
        Method method = dVar.f192723b.f180851c;
        if (Modifier.isStatic(method.getModifiers())) {
            y23.e.a aVar2 = y23.e.f194347c;
            Class<?> declaringClass = method.getDeclaringClass();
            declaringClass.getClass();
            aVar2.getClass();
            y23.e eVarA = y23.e.a.a(declaringClass);
            Method declaredMethod = null;
            r33.a.EnumC2820a enumC2820a = (eVarA == null || (aVar = eVarA.f194349b) == null) ? null : aVar.f150095a;
            int i14 = enumC2820a == null ? -1 : m23.b.a.f116206a[enumC2820a.ordinal()];
            if (i14 == 1 || i14 == 2 || i14 == 3) {
                Class<?> declaringClass2 = method.getDeclaringClass();
                declaringClass2.getClass();
                q3Var = new q3(declaringClass2);
            } else {
                q3Var = null;
            }
            if (q3Var != null) {
                c4.a aVar3 = ((q3.a) q3Var.f122579e.getValue()).f122584f;
                k23.l<Object> lVar = q3.a.f122580g[2];
                Object objInvoke = aVar3.invoke();
                objInvoke.getClass();
                gVarA = m23.b.a((Collection) objInvoke, method);
            } else {
                Class<?> declaringClass3 = method.getDeclaringClass();
                declaringClass3.getClass();
                Iterator<T> it = s0.f105811a.b(declaringClass3).o().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((k23.d) next).z());
                k23.d dVar2 = (k23.d) next;
                if (dVar2 != null) {
                    Class clsU = dh.b.u(dVar2);
                    String name = method.getName();
                    name.getClass();
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    Class[] clsArr = (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length);
                    x33.c cVar = s4.f122608a;
                    try {
                        declaredMethod = clsU.getDeclaredMethod(name, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                    } catch (NoSuchMethodException unused) {
                    }
                    if (declaredMethod == null || (gVarA2 = m23.b.a(l23.f.b(dVar2), declaredMethod)) == null) {
                        Class<?> declaringClass4 = method.getDeclaringClass();
                        declaringClass4.getClass();
                        gVarA = m23.b.a(l23.f.b(s0.f105811a.b(declaringClass4)), method);
                    } else {
                        gVarA = gVarA2;
                    }
                } else {
                    Class<?> declaringClass5 = method.getDeclaringClass();
                    declaringClass5.getClass();
                    gVarA = m23.b.a(l23.f.b(s0.f105811a.b(declaringClass5)), method);
                }
            }
        } else {
            Class<?> declaringClass6 = method.getDeclaringClass();
            declaringClass6.getClass();
            gVarA = m23.b.a(l23.f.b(s0.f105811a.b(declaringClass6)), method);
        }
        return (gVarA == null || !gVarA.isSuspend()) ? dVar.a() : new uy2.c.a((e23.a<? extends Object>) new vv0.n(6, this, dVar));
    }
}
