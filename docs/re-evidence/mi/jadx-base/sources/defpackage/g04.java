package defpackage;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes3.dex */
public class g04 {

    public static class a implements PrivilegedAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f18410a;

        public a(String str) {
            this.f18410a = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            try {
                return Class.forName(this.f18410a);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static Class a(Class cls, String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (Class) AccessController.doPrivileged(new a(str));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
