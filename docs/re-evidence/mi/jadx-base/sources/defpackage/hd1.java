package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class hd1 implements ld1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<Class<?>, Annotation> f19942a;

    public hd1() {
    }

    public hd1(HashMap<Class<?>, Annotation> map) {
        this.f19942a = map;
    }

    public static hd1 d(hd1 hd1Var, hd1 hd1Var2) {
        HashMap<Class<?>, Annotation> map;
        HashMap<Class<?>, Annotation> map2;
        if (hd1Var == null || (map = hd1Var.f19942a) == null || map.isEmpty()) {
            return hd1Var2;
        }
        if (hd1Var2 == null || (map2 = hd1Var2.f19942a) == null || map2.isEmpty()) {
            return hd1Var;
        }
        HashMap map3 = new HashMap();
        for (Annotation annotation : hd1Var2.f19942a.values()) {
            map3.put(annotation.annotationType(), annotation);
        }
        for (Annotation annotation2 : hd1Var.f19942a.values()) {
            map3.put(annotation2.annotationType(), annotation2);
        }
        return new hd1(map3);
    }

    public static hd1 e(Class<?> cls, Annotation annotation) {
        HashMap map = new HashMap(4);
        map.put(cls, annotation);
        return new hd1(map);
    }

    public final boolean a(Annotation annotation) {
        if (this.f19942a == null) {
            this.f19942a = new HashMap<>();
        }
        Annotation annotationPut = this.f19942a.put(annotation.annotationType(), annotation);
        return annotationPut == null || !annotationPut.equals(annotation);
    }

    public boolean b(Annotation annotation) {
        return a(annotation);
    }

    public Iterable<Annotation> c() {
        HashMap<Class<?>, Annotation> map = this.f19942a;
        return (map == null || map.size() == 0) ? Collections.emptyList() : this.f19942a.values();
    }

    @Override // defpackage.ld1
    public <A extends Annotation> A get(Class<A> cls) {
        HashMap<Class<?>, Annotation> map = this.f19942a;
        if (map == null) {
            return null;
        }
        return (A) map.get(cls);
    }

    @Override // defpackage.ld1
    public boolean has(Class<?> cls) {
        HashMap<Class<?>, Annotation> map = this.f19942a;
        if (map == null) {
            return false;
        }
        return map.containsKey(cls);
    }

    @Override // defpackage.ld1
    public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
        if (this.f19942a != null) {
            for (Class<? extends Annotation> cls : clsArr) {
                if (this.f19942a.containsKey(cls)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ld1
    public int size() {
        HashMap<Class<?>, Annotation> map = this.f19942a;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public String toString() {
        HashMap<Class<?>, Annotation> map = this.f19942a;
        return map == null ? "[null]" : map.toString();
    }
}
