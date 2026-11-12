package a43;

import java.lang.reflect.Field;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes3.dex */
public class o implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f1169a;

    public o(w wVar) {
        this.f1169a = wVar;
    }

    @Override // e23.a
    public final Object invoke() throws IllegalAccessException {
        int i14 = w.f1179g;
        v vVar = v.f1178a;
        w wVar = this.f1169a;
        wVar.getClass();
        vVar.getClass();
        c0 c0Var = wVar.f1180e;
        c0Var.getClass();
        c0 c0Var2 = new c0();
        Field[] declaredFields = c0.class.getDeclaredFields();
        declaredFields.getClass();
        for (Field field : declaredFields) {
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(c0Var);
                g23.c cVar = obj instanceof g23.c ? (g23.c) obj : null;
                if (cVar != null) {
                    String name = field.getName();
                    name.getClass();
                    d53.u.y(name, "is", false);
                    k23.d dVarB = s0.f105811a.b(c0.class);
                    String name2 = field.getName();
                    String name3 = field.getName();
                    name3.getClass();
                    if (name3.length() > 0) {
                        name3 = Character.toUpperCase(name3.charAt(0)) + name3.substring(1);
                    }
                    field.set(c0Var2, c0Var2.o(cVar.getValue(c0Var, new p005kotlin.jvm.internal.i0(dVarB, name2, "get".concat(name3)))));
                }
            }
        }
        vVar.invoke(c0Var2);
        c0Var2.f1109a = true;
        return new w(c0Var2);
    }
}
