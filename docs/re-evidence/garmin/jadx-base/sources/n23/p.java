package n23;

import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes3.dex */
public class p implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f122558a = new p();

    @Override // e23.l
    public final Object invoke(Object obj) {
        Class cls = (Class) obj;
        cls.getClass();
        if (Modifier.isStatic(cls.getModifiers())) {
            return null;
        }
        return cls.getDeclaringClass();
    }
}
