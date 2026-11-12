package z23;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.IOUtils;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<k23.d<? extends Object>> f202041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<Class<? extends Object>, Class<? extends Object>> f202042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<Class<? extends Object>, Class<? extends Object>> f202043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map<Class<? extends o13.h<?>>, Integer> f202044d;

    static {
        t0 t0Var = s0.f105811a;
        int i14 = 0;
        List<k23.d<? extends Object>> listK = p13.x.k(t0Var.b(Boolean.TYPE), t0Var.b(Byte.TYPE), t0Var.b(Character.TYPE), t0Var.b(Double.TYPE), t0Var.b(Float.TYPE), t0Var.b(Integer.TYPE), t0Var.b(Long.TYPE), t0Var.b(Short.TYPE));
        f202041a = listK;
        ArrayList arrayList = new ArrayList(p13.y.r(listK, 10));
        Iterator<T> it = listK.iterator();
        while (it.hasNext()) {
            k23.d dVar = (k23.d) it.next();
            arrayList.add(new o13.p(dh.b.v(dVar), dh.b.w(dVar)));
        }
        f202042b = u0.l(arrayList);
        List<k23.d<? extends Object>> list = f202041a;
        ArrayList arrayList2 = new ArrayList(p13.y.r(list, 10));
        Iterator<T> it3 = list.iterator();
        while (it3.hasNext()) {
            k23.d dVar2 = (k23.d) it3.next();
            arrayList2.add(new o13.p(dh.b.w(dVar2), dh.b.v(dVar2)));
        }
        f202043c = u0.l(arrayList2);
        List listK2 = p13.x.k(e23.a.class, e23.l.class, e23.p.class, e23.q.class, e23.r.class, e23.s.class, e23.t.class, e23.u.class, e23.v.class, e23.w.class, e23.b.class, e23.c.class, e23.d.class, e23.e.class, e23.f.class, e23.g.class, e23.h.class, e23.i.class, e23.j.class, e23.k.class, e23.m.class, e23.n.class, e23.o.class);
        ArrayList arrayList3 = new ArrayList(p13.y.r(listK2, 10));
        for (Object obj : listK2) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                p13.x.q();
                throw null;
            }
            arrayList3.add(new o13.p((Class) obj, Integer.valueOf(i14)));
            i14 = i15;
        }
        f202044d = u0.l(arrayList3);
    }

    public static final x33.b a(Class<?> cls) {
        cls.getClass();
        if (cls.isPrimitive()) {
            vb.h.s(androidx.core.view.j.h(cls, "Can't compute ClassId for primitive type: "));
            return null;
        }
        if (cls.isArray()) {
            vb.h.s(androidx.core.view.j.h(cls, "Can't compute ClassId for array type: "));
            return null;
        }
        if (cls.getEnclosingMethod() != null || cls.getEnclosingConstructor() != null || cls.getSimpleName().length() == 0) {
            x33.c cVar = new x33.c(cls.getName());
            x33.c cVarB = cVar.b();
            x33.c.a aVar = x33.c.f188594c;
            x33.f fVarG = cVar.f188596a.g();
            aVar.getClass();
            return new x33.b(cVarB, x33.c.a.a(fVarG), true);
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return a(declaringClass).d(x33.f.e(cls.getSimpleName()));
        }
        x33.b.a aVar2 = x33.b.f188590d;
        x33.c cVar2 = new x33.c(cls.getName());
        aVar2.getClass();
        return x33.b.a.b(cVar2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String b(Class<?> cls) {
        cls.getClass();
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String strReplace = cls.getName().replace('.', IOUtils.DIR_SEPARATOR_UNIX);
                strReplace.getClass();
                return strReplace;
            }
            StringBuilder sb3 = new StringBuilder("L");
            String strReplace2 = cls.getName().replace('.', IOUtils.DIR_SEPARATOR_UNIX);
            strReplace2.getClass();
            sb3.append(strReplace2);
            sb3.append(';');
            return sb3.toString();
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return "S";
                }
                break;
        }
        vb.h.s(androidx.core.view.j.h(cls, "Unsupported primitive type: "));
        return null;
    }

    public static final List<Type> c(Type type) {
        type.getClass();
        if (!(type instanceof ParameterizedType)) {
            return p13.j0.f134944a;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return c53.c0.s(c53.c0.k(c53.q.e(d.f202036a, type), e.f202038a));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        actualTypeArguments.getClass();
        return p13.u.i0(actualTypeArguments);
    }

    public static final ClassLoader d(Class<?> cls) {
        cls.getClass();
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        systemClassLoader.getClass();
        return systemClassLoader;
    }
}
