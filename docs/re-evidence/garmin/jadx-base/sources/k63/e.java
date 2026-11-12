package k63;

import java.lang.annotation.Annotation;
import java.util.List;
import p13.j0;

/* JADX INFO: loaded from: classes3.dex */
public interface e {
    default boolean b() {
        return false;
    }

    int c();

    String d(int i14);

    List<Annotation> e(int i14);

    String f();

    int g(String str);

    default List<Annotation> getAnnotations() {
        return j0.f134944a;
    }

    l getKind();

    e h(int i14);

    boolean i(int i14);

    default boolean isInline() {
        return false;
    }
}
