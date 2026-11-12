package k23;

import c53.c0;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import okhttp3.HttpUrl;
import p005kotlin.jvm.internal.z0;
import p13.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102480a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f102480a = iArr;
        }
    }

    public static final String a(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        c53.j jVarE = c53.q.e(x.f102481a, type);
        return ((Class) c0.n(jVarE)).getName() + d53.u.u(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, c0.f(jVarE));
    }

    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, o13.l] */
    public static final Type b(p pVar, boolean z14) {
        e f16153b = pVar.getF16153b();
        if (f16153b instanceof q) {
            if (!(f16153b instanceof p005kotlin.jvm.internal.u)) {
                return new u((q) f16153b);
            }
            p005kotlin.jvm.internal.u uVar = (p005kotlin.jvm.internal.u) f16153b;
            GenericDeclaration genericDeclaration = (GenericDeclaration) uVar.f105814b.getValue();
            if (genericDeclaration == null) {
                j20.x.k(pVar, "javaType is not supported for this type: ");
                return null;
            }
            TypeVariable<?>[] typeParameters = genericDeclaration.getTypeParameters();
            typeParameters.getClass();
            TypeVariable<?> typeVariable = null;
            boolean z15 = false;
            for (TypeVariable<?> typeVariable2 : typeParameters) {
                if (p005kotlin.jvm.internal.s.g(typeVariable2.getName(), ((z0) uVar).f105820c)) {
                    if (z15) {
                        vb.h.s("Array contains more than one matching element.");
                        return null;
                    }
                    z15 = true;
                    typeVariable = typeVariable2;
                }
            }
            if (z15) {
                typeVariable.getClass();
                return typeVariable;
            }
            n23.j.s("Array contains no element matching the predicate.");
            return null;
        }
        if (!(f16153b instanceof d)) {
            j20.x.k(pVar, "Unsupported type classifier: ");
            return null;
        }
        d dVar = (d) f16153b;
        Class clsV = z14 ? dh.b.v(dVar) : dh.b.u(dVar);
        List<r> listH = pVar.h();
        if (listH.isEmpty()) {
            return clsV;
        }
        if (!clsV.isArray()) {
            return c(listH, clsV);
        }
        if (clsV.getComponentType().isPrimitive()) {
            return clsV;
        }
        r rVar = (r) h0.K0(listH);
        if (rVar == null) {
            com.google.firebase.messaging.l.j(pVar, "kotlin.Array must have exactly one type argument: ");
            return null;
        }
        s sVar = rVar.f102463a;
        p pVar2 = rVar.f102464b;
        int i14 = sVar == null ? -1 : a.f102480a[sVar.ordinal()];
        if (i14 == -1 || i14 == 1) {
            return clsV;
        }
        if (i14 != 2 && i14 != 3) {
            u0.r();
            return null;
        }
        pVar2.getClass();
        Type typeB = b(pVar2, false);
        return typeB instanceof Class ? clsV : new k23.a(typeB);
    }

    public static final v c(List list, Class cls) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(d((r) it.next()));
            }
            return new v(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(p13.y.r(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList2.add(d((r) it3.next()));
            }
            return new v(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        v vVarC = c(list.subList(length, list.size()), declaringClass);
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(p13.y.r(listSubList, 10));
        Iterator it4 = listSubList.iterator();
        while (it4.hasNext()) {
            arrayList3.add(d((r) it4.next()));
        }
        return new v(cls, vVarC, arrayList3);
    }

    public static final Type d(r rVar) {
        s sVar = rVar.f102463a;
        if (sVar == null) {
            y.f102482c.getClass();
            return y.f102483d;
        }
        p pVar = rVar.f102464b;
        pVar.getClass();
        int i14 = a.f102480a[sVar.ordinal()];
        if (i14 == 1) {
            return new y(null, b(pVar, true));
        }
        if (i14 == 2) {
            return b(pVar, true);
        }
        if (i14 == 3) {
            return new y(b(pVar, true), null);
        }
        u0.r();
        return null;
    }
}
