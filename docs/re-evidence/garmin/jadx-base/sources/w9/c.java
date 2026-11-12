package w9;

import androidx.core.view.j;
import androidx.lifecycle.u1;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw9/c;", "", "<init>", "()V", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f183567a = new c();

    private c() {
    }

    public static u1 a(Class cls) throws InvocationTargetException {
        cls.getClass();
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                kg.f.n(j.h(cls, "Cannot create an instance of "));
                return null;
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                objNewInstance.getClass();
                return (u1) objNewInstance;
            } catch (IllegalAccessException e4) {
                q2.v(j.h(cls, "Cannot create an instance of "), e4);
                return null;
            } catch (InstantiationException e14) {
                q2.v(j.h(cls, "Cannot create an instance of "), e14);
                return null;
            }
        } catch (NoSuchMethodException e15) {
            q2.v(j.h(cls, "Cannot create an instance of "), e15);
            return null;
        }
    }
}
