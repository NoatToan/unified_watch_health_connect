package n23;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.reflect.full.IllegalCallableAccessException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ln23/p0;", "R", "Ln23/y3;", "Ln23/v3;", "<init>", "()V", "Lt23/b;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;", "descriptor", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class p0<R> implements v3, y3<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4.a<List<Annotation>> f122559a = new c4.a<>(null, new d0(this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c4.a<ArrayList<k23.k>> f122560b = new c4.a<>(null, new g0(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c4.a<ArrayList<k23.k>> f122561c = new c4.a<>(null, new h0(this));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c4.a<b53.l> f122562d = new c4.a<>(null, new i0(this));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c4.a<List<t3>> f122563e = new c4.a<>(null, new j0(this));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c4.a<Object[]> f122564f = new c4.a<>(null, new k0(this));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f122565g = o13.m.a(o13.n.PUBLICATION, new l0(this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((k23.k) t7).getName(), ((k23.k) t14).getName());
        }
    }

    public static Object c(k23.p pVar) {
        Class clsU = dh.b.u(g8.i.I(pVar));
        if (clsU.isArray()) {
            Object objNewInstance = Array.newInstance(clsU.getComponentType(), 0);
            objNewInstance.getClass();
            return objNewInstance;
        }
        throw new w3("Cannot instantiate the default empty array of type " + clsU.getSimpleName() + ", because it is not an array type");
    }

    public final boolean C() {
        return p005kotlin.jvm.internal.s.g(getF122483i(), "<init>") && getF122482h().j().isAnnotation();
    }

    @Override // k23.c
    public final R call(Object... objArr) throws IllegalCallableAccessException {
        objArr.getClass();
        try {
            return (R) A().call(objArr);
        } catch (IllegalAccessException e4) {
            throw new IllegalCallableAccessException(e4);
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, o13.l] */
    @Override // k23.c
    public final R callBy(Map<k23.k, ? extends Object> map) throws IllegalCallableAccessException {
        Object objC;
        map.getClass();
        boolean z14 = false;
        if (C()) {
            List<k23.k> parameters = getParameters();
            ArrayList arrayList = new ArrayList(p13.y.r(parameters, 10));
            for (k23.k kVar : parameters) {
                if (map.containsKey(kVar)) {
                    objC = map.get(kVar);
                    if (objC == null) {
                        j20.x.i(41, "Annotation argument value cannot be null (", kVar);
                        return null;
                    }
                } else if (kVar.d()) {
                    objC = null;
                } else {
                    if (!kVar.a()) {
                        com.google.firebase.messaging.l.j(kVar, "No argument provided for a required parameter: ");
                        return null;
                    }
                    objC = c(kVar.getType());
                }
                arrayList.add(objC);
            }
            o23.h<?> hVarF = f();
            if (hVarF == null) {
                j.r(e(), "This callable does not support a default call: ");
                return null;
            }
            try {
                return (R) hVarF.call(arrayList.toArray(new Object[0]));
            } catch (IllegalAccessException e4) {
                throw new IllegalCallableAccessException(e4);
            }
        }
        List<k23.k> parameters2 = getParameters();
        if (parameters2.isEmpty()) {
            try {
                return (R) A().call(isSuspend() ? new t13.d[]{null} : new t13.d[0]);
            } catch (IllegalAccessException e14) {
                throw new IllegalCallableAccessException(e14);
            }
        }
        int size = (isSuspend() ? 1 : 0) + parameters2.size();
        Object[] objArr = (Object[]) this.f122564f.invoke().clone();
        if (isSuspend()) {
            objArr[parameters2.size()] = null;
        }
        boolean zBooleanValue = ((Boolean) this.f122565g.getValue()).booleanValue();
        int i14 = 0;
        for (k23.k kVar2 : parameters2) {
            int iJ = zBooleanValue ? j(kVar2) : 1;
            if (map.containsKey(kVar2)) {
                objArr[kVar2.getIndex()] = map.get(kVar2);
            } else if (kVar2.d()) {
                if (zBooleanValue) {
                    int i15 = i14 + iJ;
                    for (int i16 = i14; i16 < i15; i16++) {
                        int i17 = (i16 / 32) + size;
                        Object obj = objArr[i17];
                        obj.getClass();
                        objArr[i17] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i16 % 32)));
                    }
                } else {
                    int i18 = (i14 / 32) + size;
                    Object obj2 = objArr[i18];
                    obj2.getClass();
                    objArr[i18] = Integer.valueOf(((Integer) obj2).intValue() | (1 << (i14 % 32)));
                }
                z14 = true;
            } else if (!kVar2.a()) {
                com.google.firebase.messaging.l.j(kVar2, "No argument provided for a required parameter: ");
                return null;
            }
            if (kVar2.getKind() == k23.k.a.VALUE) {
                i14 += iJ;
            }
        }
        if (!z14) {
            try {
                return (R) A().call(Arrays.copyOf(objArr, size));
            } catch (IllegalAccessException e15) {
                throw new IllegalCallableAccessException(e15);
            }
        }
        o23.h<?> hVarF2 = f();
        if (hVarF2 == null) {
            j.r(e(), "This callable does not support a default call: ");
            return null;
        }
        try {
            return (R) hVarF2.call(objArr);
        } catch (IllegalAccessException e16) {
            throw new IllegalCallableAccessException(e16);
        }
    }

    public abstract t23.b e();

    @Override // k23.b
    public final List<Annotation> getAnnotations() {
        List<Annotation> listInvoke = this.f122559a.invoke();
        listInvoke.getClass();
        return listInvoke;
    }

    @Override // k23.c
    public final List<k23.k> getParameters() {
        ArrayList<k23.k> arrayListInvoke = this.f122561c.invoke();
        arrayListInvoke.getClass();
        return arrayListInvoke;
    }

    @Override // k23.c
    public final k23.p getReturnType() {
        b53.l lVarInvoke = this.f122562d.invoke();
        lVarInvoke.getClass();
        return lVarInvoke;
    }

    @Override // k23.c
    public final List<k23.q> getTypeParameters() {
        List<t3> listInvoke = this.f122563e.invoke();
        listInvoke.getClass();
        return listInvoke;
    }

    @Override // k23.c
    public final k23.t getVisibility() {
        t23.r visibility = e().getVisibility();
        visibility.getClass();
        x33.c cVar = s4.f122608a;
        if (visibility.equals(t23.q.f162050e)) {
            return k23.t.PUBLIC;
        }
        if (visibility.equals(t23.q.f162048c)) {
            return k23.t.PROTECTED;
        }
        if (visibility.equals(t23.q.f162049d)) {
            return k23.t.INTERNAL;
        }
        if (visibility.equals(t23.q.f162046a) || visibility.equals(t23.q.f162047b)) {
            return k23.t.PRIVATE;
        }
        return null;
    }

    @Override // k23.c
    public final boolean isAbstract() {
        return e().g() == t23.a0.ABSTRACT;
    }

    @Override // k23.c
    public final boolean isFinal() {
        return e().g() == t23.a0.FINAL;
    }

    @Override // k23.c
    public final boolean isOpen() {
        return e().g() == t23.a0.OPEN;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final int j(k23.k kVar) {
        if (!((Boolean) this.f122565g.getValue()).booleanValue()) {
            vb.h.s("Check if parametersNeedMFVCFlattening is true before");
            return 0;
        }
        if (!s4.f(kVar.getType())) {
            return 1;
        }
        ArrayList arrayListZ = gl.b.z(p43.y1.a(kVar.getType().f16127b));
        arrayListZ.getClass();
        return arrayListZ.size();
    }

    @Override // n23.y3
    public final List<k23.k> v() {
        ArrayList<k23.k> arrayListInvoke = this.f122560b.invoke();
        arrayListInvoke.getClass();
        return arrayListInvoke;
    }
}
