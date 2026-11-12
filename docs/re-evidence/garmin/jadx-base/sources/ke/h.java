package ke;

import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes7.dex */
public class h {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f104535a = new k(b.f104536a.getWebkitToCompatConverter());

        private a() {
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f104536a;

        static {
            i cVar;
            try {
                cVar = new j((WebViewProviderFactoryBoundaryInterface) d73.a.a(WebViewProviderFactoryBoundaryInterface.class, h.a()));
            } catch (ClassNotFoundException unused) {
                cVar = new c();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e4) {
                o2.c.p(e4);
                return;
            }
            f104536a = cVar;
        }

        private b() {
        }
    }

    private h() {
    }

    public static InvocationHandler a() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, WebView.getWebViewClassLoader()).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }
}
