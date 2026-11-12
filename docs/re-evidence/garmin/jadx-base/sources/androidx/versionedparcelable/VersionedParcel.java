package androidx.versionedparcelable;

import android.os.Parcelable;
import de.b;
import de.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p1.a;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
public abstract class VersionedParcel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<String, Method> f11265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a<String, Method> f11266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a<String, Class> f11267c;

    public static class ParcelException extends RuntimeException {
        public ParcelException(Throwable th3) {
            super(th3);
        }
    }

    public VersionedParcel(a<String, Method> aVar, a<String, Method> aVar2, a<String, Class> aVar3) {
        this.f11265a = aVar;
        this.f11266b = aVar2;
        this.f11267c = aVar3;
    }

    public abstract b a();

    public final Class b(Class<? extends c> cls) throws ClassNotFoundException {
        String name = cls.getName();
        a<String, Class> aVar = this.f11267c;
        Class cls2 = aVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(com.nimbusds.jose.shaded.gson.internal.a.h(cls.getPackage().getName(), ".", cls.getSimpleName(), "Parcelizer"), false, cls.getClassLoader());
        aVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException {
        a<String, Method> aVar = this.f11265a;
        Method method = aVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
        aVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        a<String, Method> aVar = this.f11266b;
        Method method = aVar.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, VersionedParcel.class);
        aVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e();

    public abstract byte[] f();

    public abstract CharSequence g();

    public abstract boolean h(int i14);

    public abstract int i();

    public final int j(int i14, int i15) {
        return !h(i15) ? i14 : i();
    }

    public abstract <T extends Parcelable> T k();

    public abstract String l();

    public final <T extends c> T m() {
        String strL = l();
        if (strL == null) {
            return null;
        }
        try {
            return (T) c(strL).invoke(null, a());
        } catch (ClassNotFoundException e4) {
            q2.v("VersionedParcel encountered ClassNotFoundException", e4);
            return null;
        } catch (IllegalAccessException e14) {
            q2.v("VersionedParcel encountered IllegalAccessException", e14);
            return null;
        } catch (NoSuchMethodException e15) {
            q2.v("VersionedParcel encountered NoSuchMethodException", e15);
            return null;
        } catch (InvocationTargetException e16) {
            if (e16.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e16.getCause());
            }
            q2.v("VersionedParcel encountered InvocationTargetException", e16);
            return null;
        }
    }

    public abstract void n(int i14);

    public abstract void o(boolean z14);

    public abstract void p(byte[] bArr);

    public abstract void q(CharSequence charSequence);

    public abstract void r(int i14);

    public final void s(int i14, int i15) {
        n(i15);
        r(i14);
    }

    public abstract void t(Parcelable parcelable);

    public abstract void u(String str);

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(c cVar) {
        if (cVar == null) {
            u(null);
            return;
        }
        try {
            u(b(cVar.getClass()).getName());
            b bVarA = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, bVarA);
                bVarA.w();
            } catch (ClassNotFoundException e4) {
                q2.v("VersionedParcel encountered ClassNotFoundException", e4);
            } catch (IllegalAccessException e14) {
                q2.v("VersionedParcel encountered IllegalAccessException", e14);
            } catch (NoSuchMethodException e15) {
                q2.v("VersionedParcel encountered NoSuchMethodException", e15);
            } catch (InvocationTargetException e16) {
                if (e16.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e16.getCause());
                }
                q2.v("VersionedParcel encountered InvocationTargetException", e16);
            }
        } catch (ClassNotFoundException e17) {
            q2.v(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e17);
        }
    }
}
