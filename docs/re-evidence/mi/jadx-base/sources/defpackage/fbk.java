package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import org.apache.commons.lang3.builder.ToStringStyle;

/* JADX INFO: loaded from: classes3.dex */
public class fbk extends mgp {
    public boolean e;
    public boolean f;
    public String[] g;
    public Class<?> h;

    public <T> fbk(T t, ToStringStyle toStringStyle, StringBuffer stringBuffer, Class<? super T> cls, boolean z, boolean z2) {
        super(t, toStringStyle, stringBuffer);
        this.e = false;
        this.f = false;
        this.h = null;
        o(cls);
        n(z);
        m(z2);
    }

    public static String p(Object obj, ToStringStyle toStringStyle) {
        return q(obj, toStringStyle, false, false, null);
    }

    public static <T> String q(T t, ToStringStyle toStringStyle, boolean z, boolean z2, Class<? super T> cls) {
        return new fbk(t, toStringStyle, null, cls, z, z2).toString();
    }

    public boolean f(Field field) {
        if (field.getName().indexOf(36) != -1) {
            return false;
        }
        if (Modifier.isTransient(field.getModifiers()) && !k()) {
            return false;
        }
        if (Modifier.isStatic(field.getModifiers()) && !j()) {
            return false;
        }
        String[] strArr = this.g;
        return strArr == null || Arrays.binarySearch(strArr, field.getName()) < 0;
    }

    public void g(Class<?> cls) {
        if (cls.isArray()) {
            l(c());
            return;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        AccessibleObject.setAccessible(declaredFields, true);
        for (Field field : declaredFields) {
            String name = field.getName();
            if (f(field)) {
                try {
                    a(name, i(field));
                } catch (IllegalAccessException e) {
                    throw new InternalError("Unexpected IllegalAccessException: " + e.getMessage());
                }
            }
        }
    }

    public Class<?> h() {
        return this.h;
    }

    public Object i(Field field) throws IllegalAccessException, IllegalArgumentException {
        return field.get(c());
    }

    public boolean j() {
        return this.e;
    }

    public boolean k() {
        return this.f;
    }

    public fbk l(Object obj) {
        e().reflectionAppendArrayDetail(d(), null, obj);
        return this;
    }

    public void m(boolean z) {
        this.e = z;
    }

    public void n(boolean z) {
        this.f = z;
    }

    public void o(Class<?> cls) {
        Object objC;
        if (cls != null && (objC = c()) != null && !cls.isInstance(objC)) {
            throw new IllegalArgumentException("Specified class is not a superclass of the object");
        }
        this.h = cls;
    }

    @Override // defpackage.mgp
    public String toString() {
        if (c() == null) {
            return e().getNullText();
        }
        Class<?> superclass = c().getClass();
        g(superclass);
        while (superclass.getSuperclass() != null && superclass != h()) {
            superclass = superclass.getSuperclass();
            g(superclass);
        }
        return super.toString();
    }
}
