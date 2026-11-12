package m0;

import androidx.camera.core.impl.j2;
import androidx.camera.core.impl.x0;

/* JADX INFO: loaded from: classes.dex */
public interface m<T> extends j2 {
    public static final androidx.camera.core.impl.h K = x0.a.a(String.class, "camerax.core.target.name");
    public static final androidx.camera.core.impl.h L = x0.a.a(Class.class, "camerax.core.target.class");

    default String J() {
        return (String) e(K);
    }

    default String j(String str) {
        return (String) f(K, str);
    }
}
