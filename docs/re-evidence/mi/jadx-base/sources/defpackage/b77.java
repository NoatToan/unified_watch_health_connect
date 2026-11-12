package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class b77 extends ClassLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3879a = th2.class.getName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?>[] f3880b;

    static {
        Class cls = Integer.TYPE;
        f3880b = new Class[]{String.class, byte[].class, cls, cls};
    }

    public b77(ClassLoader classLoader) {
        super(classLoader);
    }

    public Class<?> a(String str, byte[] bArr) throws ClassFormatError {
        try {
            Method declaredMethod = ClassLoader.class.getDeclaredMethod("defineClass", f3880b);
            declaredMethod.setAccessible(true);
            return (Class) declaredMethod.invoke(getParent(), str, bArr, 0, Integer.valueOf(bArr.length));
        } catch (Exception unused) {
            return defineClass(str, bArr, 0, bArr.length);
        }
    }

    @Override // java.lang.ClassLoader
    public synchronized Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
        if (str.equals(f3879a)) {
            return th2.class;
        }
        return super.loadClass(str, z);
    }
}
