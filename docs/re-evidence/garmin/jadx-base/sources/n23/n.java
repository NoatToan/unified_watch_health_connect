package n23;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes3.dex */
public class n implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f122537a = new n();

    @Override // e23.l
    public final Object invoke(Object obj) {
        TypeVariable typeVariable = (TypeVariable) obj;
        typeVariable.getClass();
        Type[] bounds = typeVariable.getBounds();
        bounds.getClass();
        Object objE = p13.u.E(bounds);
        if (objE instanceof TypeVariable) {
            return (TypeVariable) objE;
        }
        return null;
    }
}
