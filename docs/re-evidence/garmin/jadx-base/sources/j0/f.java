package j0;

import android.content.Context;
import android.os.Build;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    public static class a {
        private a() {
        }

        public static Context a(Context context, String str) {
            return context.createAttributionContext(str);
        }

        public static String b(Context context) {
            return context.getAttributionTag();
        }
    }

    public static class b {
        private b() {
        }

        public static Context a(int i14, Context context) {
            return context.createDeviceContext(i14);
        }

        public static int b(Context context) {
            return context.getDeviceId();
        }
    }

    private f() {
    }

    public static Context a(Context context) {
        int iB;
        Context applicationContext = context.getApplicationContext();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 34 && (iB = b.b(context)) != b.b(applicationContext)) {
            applicationContext = b.a(iB, applicationContext);
        }
        if (i14 >= 30) {
            String strB = a.b(context);
            if (!Objects.equals(strB, a.b(applicationContext))) {
                return a.a(applicationContext, strB);
            }
        }
        return applicationContext;
    }
}
