package n23;

import java.lang.reflect.Field;
import java.util.LinkedHashSet;
import org.apache.commons.io.IOUtils;

/* JADX INFO: loaded from: classes3.dex */
public class z2 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2.b f122672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f2 f122673b;

    public z2(f2.b bVar, f2 f2Var) {
        this.f122672a = bVar;
        this.f122673b = f2Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0077  */
    @Override // e23.a
    public final Object invoke() throws IllegalAccessException, NoSuchFieldException {
        Field declaredField;
        k23.l<Object>[] lVarArr = f2.b.f122443u;
        c33.f fVarB = this.f122672a.b();
        if (fVarB == null || !(c33.a.a(fVarB) == c33.b.OBJECT || c33.a.a(fVarB) == c33.b.COMPANION_OBJECT)) {
            return null;
        }
        c33.b bVarA = c33.a.a(fVarB);
        c33.b bVar = c33.b.COMPANION_OBJECT;
        f2 f2Var = this.f122673b;
        if (bVarA == bVar) {
            p005kotlin.reflect.jvm.internal.impl.builtins.a.f105828a.getClass();
            LinkedHashSet linkedHashSet = p005kotlin.reflect.jvm.internal.impl.builtins.a.f105829b;
            String str = fVarB.f24202b;
            if (str == null) {
                p005kotlin.jvm.internal.s.m("name");
                throw null;
            }
            if (p13.h0.R(linkedHashSet, b0.d(str).e())) {
                declaredField = f2Var.f122441d.getDeclaredField("INSTANCE");
            } else {
                Class<?> enclosingClass = f2Var.f122441d.getEnclosingClass();
                String str2 = fVarB.f24202b;
                if (str2 == null) {
                    p005kotlin.jvm.internal.s.m("name");
                    throw null;
                }
                if (d53.u.y(str2, ".", false)) {
                    vb.h.x("Local class is not supported: ".concat(str2));
                    return null;
                }
                String strD0 = d53.w.d0(IOUtils.DIR_SEPARATOR_UNIX, str2, str2);
                declaredField = enclosingClass.getDeclaredField(d53.w.d0('.', strD0, strD0));
            }
        } else {
            declaredField = f2Var.f122441d.getDeclaredField("INSTANCE");
        }
        Object obj = declaredField.get(null);
        obj.getClass();
        return obj;
    }
}
