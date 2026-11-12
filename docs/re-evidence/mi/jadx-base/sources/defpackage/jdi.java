package defpackage;

import java.security.AccessControlException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class jdi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f22672a = new ThreadLocal();

    public static class a implements PrivilegedAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f22673a;

        public a(String str) {
            this.f22673a = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            Map map = (Map) jdi.f22672a.get();
            return map != null ? map.get(this.f22673a) : System.getProperty(this.f22673a);
        }
    }

    public static String b(String str) {
        return (String) AccessController.doPrivileged(new a(str));
    }

    public static boolean c(String str) {
        try {
            String strB = b(str);
            if (strB != null) {
                return "true".equals(olo.f(strB));
            }
        } catch (AccessControlException unused) {
        }
        return false;
    }
}
