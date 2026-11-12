package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class xh2 implements zud<Object> {
    @Override // defpackage.zud
    public <E> void a(E e, Appendable appendable, vpd vpdVar) throws IOException {
        Method declaredMethod;
        Object objInvoke;
        Class<?> type;
        try {
            vpdVar.n(appendable);
            boolean z = false;
            for (Class<?> superclass = e.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
                for (Field field : superclass.getDeclaredFields()) {
                    int modifiers = field.getModifiers();
                    if ((modifiers & 152) <= 0) {
                        if ((modifiers & 1) > 0) {
                            objInvoke = field.get(e);
                        } else {
                            try {
                                declaredMethod = superclass.getDeclaredMethod(wpd.a(field.getName()), new Class[0]);
                            } catch (Exception unused) {
                                declaredMethod = null;
                            }
                            if (declaredMethod == null && ((type = field.getType()) == Boolean.TYPE || type == Boolean.class)) {
                                declaredMethod = superclass.getDeclaredMethod(wpd.b(field.getName()), new Class[0]);
                            }
                            if (declaredMethod != null) {
                                objInvoke = declaredMethod.invoke(e, new Object[0]);
                            }
                        }
                        if (objInvoke != null || !vpdVar.g()) {
                            if (z) {
                                vpdVar.m(appendable);
                            } else {
                                z = true;
                            }
                            yud.g(field.getName(), objInvoke, appendable, vpdVar);
                        }
                    }
                }
            }
            vpdVar.o(appendable);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
