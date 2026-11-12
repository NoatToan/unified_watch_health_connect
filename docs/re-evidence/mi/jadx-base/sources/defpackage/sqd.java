package defpackage;

import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class sqd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sqd f33885a;

    static {
        sqd sqdVar;
        try {
            sqdVar = (sqd) h04.k(tqd.class, false);
        } catch (Throwable unused) {
            Logger.getLogger(sqd.class.getName()).warning("Unable to load JDK7 types (annotations, java.nio.file.Path): no Java7 support added");
            sqdVar = null;
        }
        f33885a = sqdVar;
    }

    public static sqd f() {
        return f33885a;
    }

    public abstract PropertyName a(AnnotatedParameter annotatedParameter);

    public abstract Boolean b(fd1 fd1Var);

    public abstract esd<?> c(Class<?> cls);

    public abstract eud<?> d(Class<?> cls);

    public abstract Boolean e(fd1 fd1Var);
}
