package o23;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.h0;
import p13.u0;
import p13.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\u0010\u0011BA\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lo23/a;", "Lo23/h;", "", "Ljava/lang/Class;", "jClass", "", "", "parameterNames", "Lo23/a$a;", "callMode", "Lo23/a$b;", "origin", "Ljava/lang/reflect/Method;", "methods", "<init>", "(Ljava/lang/Class;Ljava/util/List;Lo23/a$a;Lo23/a$b;Ljava/util/List;)V", "a", "b", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f128686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f128687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumC2467a f128688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Method> f128689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f128690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f128691f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f128692g;

    /* JADX INFO: renamed from: o23.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo23/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum EnumC2467a {
        CALL_BY_NAME,
        POSITIONAL_CALL
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo23/a$b;", "", "<init>", "(Ljava/lang/String;I)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        JAVA,
        KOTLIN
    }

    public a(Class<?> cls, List<String> list, EnumC2467a enumC2467a, b bVar, List<Method> list2) {
        cls.getClass();
        list.getClass();
        enumC2467a.getClass();
        bVar.getClass();
        list2.getClass();
        this.f128686a = cls;
        this.f128687b = list;
        this.f128688c = enumC2467a;
        this.f128689d = list2;
        ArrayList arrayList = new ArrayList(y.r(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Method) it.next()).getGenericReturnType());
        }
        this.f128690e = arrayList;
        List<Method> list3 = this.f128689d;
        ArrayList arrayList2 = new ArrayList(y.r(list3, 10));
        Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            Class<?> returnType = ((Method) it3.next()).getReturnType();
            returnType.getClass();
            Class<? extends Object> cls2 = z23.f.f202043c.get(returnType);
            if (cls2 != null) {
                returnType = cls2;
            }
            arrayList2.add(returnType);
        }
        this.f128691f = arrayList2;
        List<Method> list4 = this.f128689d;
        ArrayList arrayList3 = new ArrayList(y.r(list4, 10));
        Iterator<T> it4 = list4.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((Method) it4.next()).getDefaultValue());
        }
        this.f128692g = arrayList3;
        if (this.f128688c == EnumC2467a.POSITIONAL_CALL && bVar == b.JAVA && !h0.y0(this.f128687b, "value").isEmpty()) {
            org.apache.commons.lang3.e.w("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
            throw null;
        }
    }

    @Override // o23.h
    public final /* bridge */ boolean a() {
        return false;
    }

    @Override // o23.h
    public final List<Type> b() {
        return this.f128690e;
    }

    @Override // o23.h
    public final /* bridge */ /* synthetic */ Member c() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    @Override // o23.h
    public final Object call(Object[] objArr) {
        String f16141b;
        objArr.getClass();
        ArrayList arrayList = this.f128690e;
        if (arrayList.size() != objArr.length) {
            StringBuilder sb3 = new StringBuilder("Callable expects ");
            sb3.append(arrayList.size());
            sb3.append(" arguments, but ");
            vb.h.s(am.j.q(sb3, objArr.length, " were provided."));
            return null;
        }
        ArrayList arrayList2 = new ArrayList(objArr.length);
        int length = objArr.length;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            List<String> list = this.f128687b;
            if (i14 >= length) {
                return f.a(this.f128686a, u0.l(h0.k1(list, arrayList2)), this.f128689d);
            }
            Object array = objArr[i14];
            int i16 = i15 + 1;
            ArrayList arrayList3 = this.f128691f;
            if (array == null && this.f128688c == EnumC2467a.CALL_BY_NAME) {
                array = this.f128692g.get(i15);
            } else {
                Class cls = (Class) arrayList3.get(i15);
                if (array instanceof Class) {
                    array = null;
                } else {
                    if (array instanceof k23.d) {
                        array = dh.b.u((k23.d) array);
                    } else if (array instanceof Object[]) {
                        Object[] objArr2 = (Object[]) array;
                        if (objArr2 instanceof Class[]) {
                            array = null;
                        } else if (objArr2 instanceof k23.d[]) {
                            k23.d[] dVarArr = (k23.d[]) array;
                            ArrayList arrayList4 = new ArrayList(dVarArr.length);
                            for (k23.d dVar : dVarArr) {
                                arrayList4.add(dh.b.u(dVar));
                            }
                            array = arrayList4.toArray(new Class[0]);
                        } else {
                            array = objArr2;
                        }
                    }
                    if (!cls.isInstance(array)) {
                        array = null;
                    }
                }
            }
            if (array == null) {
                String str = list.get(i15);
                Class cls2 = (Class) arrayList3.get(i15);
                k23.d dVarB = s.g(cls2, Class.class) ? s0.f105811a.b(k23.d.class) : (cls2.isArray() && s.g(cls2.getComponentType(), Class.class)) ? s0.f105811a.b(k23.d[].class) : s0.f105811a.b(cls2);
                String f16141b2 = dVarB.getF16141b();
                t0 t0Var = s0.f105811a;
                if (s.g(f16141b2, t0Var.b(Object[].class).getF16141b())) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(dVarB.getF16141b());
                    sb4.append('<');
                    Class<?> componentType = dh.b.u(dVarB).getComponentType();
                    componentType.getClass();
                    sb4.append(t0Var.b(componentType).getF16141b());
                    sb4.append('>');
                    f16141b = sb4.toString();
                } else {
                    f16141b = dVarB.getF16141b();
                }
                throw new IllegalArgumentException("Argument #" + i15 + ' ' + str + " is not of the required type " + f16141b);
            }
            arrayList2.add(array);
            i14++;
            i15 = i16;
        }
    }

    @Override // o23.h
    /* JADX INFO: renamed from: getReturnType */
    public final Type getF128710b() {
        return this.f128686a;
    }

    public /* synthetic */ a(Class cls, List list, EnumC2467a enumC2467a, b bVar, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 16) != 0) {
            list2 = new ArrayList(y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                list2.add(cls.getDeclaredMethod((String) it.next(), null));
            }
        }
        this(cls, list, enumC2467a, bVar, list2);
    }
}
