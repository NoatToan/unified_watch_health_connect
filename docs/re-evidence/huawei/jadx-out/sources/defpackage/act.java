package defpackage;

import com.fasterxml.jackson.databind.util.Annotations;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes21.dex */
public final class act implements Annotations {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected HashMap<Class<?>, Annotation> f271c;

    public act() {
    }

    public static act c(Class<?> cls, Annotation annotation) {
        HashMap map = new HashMap(4);
        map.put(cls, annotation);
        return new act(map);
    }

    public act(HashMap<Class<?>, Annotation> map) {
        this.f271c = map;
    }

    @Override // com.fasterxml.jackson.databind.util.Annotations
    public <A extends Annotation> A get(Class<A> cls) {
        HashMap<Class<?>, Annotation> map = this.f271c;
        if (map == null) {
            return null;
        }
        return (A) map.get(cls);
    }

    @Override // com.fasterxml.jackson.databind.util.Annotations
    public boolean has(Class<?> cls) {
        HashMap<Class<?>, Annotation> map = this.f271c;
        if (map == null) {
            return false;
        }
        return map.containsKey(cls);
    }

    @Override // com.fasterxml.jackson.databind.util.Annotations
    public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
        if (this.f271c != null) {
            for (Class<? extends Annotation> cls : clsArr) {
                if (this.f271c.containsKey(cls)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Iterable<Annotation> b() {
        HashMap<Class<?>, Annotation> map = this.f271c;
        if (map == null || map.size() == 0) {
            return Collections.EMPTY_LIST;
        }
        return this.f271c.values();
    }

    public static act c(act actVar, act actVar2) {
        HashMap<Class<?>, Annotation> map;
        HashMap<Class<?>, Annotation> map2;
        if (actVar == null || (map = actVar.f271c) == null || map.isEmpty()) {
            return actVar2;
        }
        if (actVar2 == null || (map2 = actVar2.f271c) == null || map2.isEmpty()) {
            return actVar;
        }
        HashMap map3 = new HashMap();
        for (Annotation annotation : actVar2.f271c.values()) {
            map3.put(annotation.annotationType(), annotation);
        }
        for (Annotation annotation2 : actVar.f271c.values()) {
            map3.put(annotation2.annotationType(), annotation2);
        }
        return new act(map3);
    }

    @Override // com.fasterxml.jackson.databind.util.Annotations
    public int size() {
        HashMap<Class<?>, Annotation> map = this.f271c;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public boolean d(Annotation annotation) {
        return e(annotation);
    }

    public String toString() {
        HashMap<Class<?>, Annotation> map = this.f271c;
        if (map == null) {
            return "[null]";
        }
        return map.toString();
    }

    protected final boolean e(Annotation annotation) {
        if (this.f271c == null) {
            this.f271c = new HashMap<>();
        }
        Annotation annotationPut = this.f271c.put(annotation.annotationType(), annotation);
        return annotationPut == null || !annotationPut.equals(annotation);
    }
}
