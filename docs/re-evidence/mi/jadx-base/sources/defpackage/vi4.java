package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class vi4 {

    @RequiresApi(30)
    public static class a {
        public static Context a(Context context, String str) {
            return context.createAttributionContext(str);
        }

        public static String b(Context context) {
            return context.getAttributionTag();
        }
    }

    public static Context a(Context context) {
        String strB;
        Context applicationContext = context.getApplicationContext();
        return (Build.VERSION.SDK_INT < 30 || (strB = a.b(context)) == null) ? applicationContext : a.a(applicationContext, strB);
    }

    public static Application b(Context context) {
        for (Context contextA = a(context); contextA instanceof ContextWrapper; contextA = c((ContextWrapper) contextA)) {
            if (contextA instanceof Application) {
                return (Application) contextA;
            }
        }
        return null;
    }

    public static Context c(ContextWrapper contextWrapper) {
        String strB;
        Context baseContext = contextWrapper.getBaseContext();
        return (Build.VERSION.SDK_INT < 30 || (strB = a.b(contextWrapper)) == null) ? baseContext : a.a(baseContext, strB);
    }
}
