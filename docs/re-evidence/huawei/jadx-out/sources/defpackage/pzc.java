package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes15.dex */
public class pzc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Field f46004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Method f46005c;
    private Constructor d;
    Class<?> e;

    pzc() {
    }

    public static pzc c(Class<?> cls) {
        pzc pzcVar = new pzc();
        pzcVar.e = cls;
        return pzcVar;
    }

    protected Object a(Object obj) throws c {
        if (obj == null || this.e.isInstance(obj)) {
            return obj;
        }
        throw new c("Caller [" + obj + "] is not a instance of type [" + this.e + "]!");
    }

    protected void b(Object obj, Member member, String str) throws c {
        if (member == null) {
            throw new c(str + " was null!");
        }
        if (obj == null && !Modifier.isStatic(member.getModifiers())) {
            throw new c("Need a caller!");
        }
        a(obj);
    }

    public pzc c(String str) throws c {
        try {
            Field fieldA = a(str);
            this.f46004b = fieldA;
            fieldA.setAccessible(true);
            this.d = null;
            this.f46005c = null;
            return this;
        } catch (Throwable th) {
            throw new c("Oops!", th);
        }
    }

    protected Field a(String str) throws NoSuchFieldException {
        try {
            return this.e.getField(str);
        } catch (NoSuchFieldException e) {
            for (Class<?> superclass = this.e; superclass != null; superclass = superclass.getSuperclass()) {
                try {
                    return superclass.getDeclaredField(str);
                } catch (NoSuchFieldException unused) {
                }
            }
            throw e;
        }
    }

    public pzc c(Object obj, Object obj2) throws c {
        b(obj, this.f46004b, "Field");
        try {
            this.f46004b.set(obj, obj2);
            return this;
        } catch (Throwable th) {
            throw new c("Oops!", th);
        }
    }

    public static class c extends Exception {
        public c(String str) {
            super(str);
        }

        public c(String str, Throwable th) {
            super(str, th);
        }
    }
}
