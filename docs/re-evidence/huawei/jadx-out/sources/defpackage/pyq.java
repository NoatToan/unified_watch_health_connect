package defpackage;

import android.view.View;
import com.huawei.skinner.theme.ThemeServiceInterceptor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class pyq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static pyq f45984b = new pyq();
    private final Map<Class<? extends View>, ThemeServiceInterceptor> e = new HashMap();

    private pyq() {
    }

    public static pyq b() {
        return f45984b;
    }

    public ThemeServiceInterceptor e(Class<? extends View> cls) {
        ThemeServiceInterceptor themeServiceInterceptor = this.e.get(cls);
        if (themeServiceInterceptor != null) {
            return themeServiceInterceptor;
        }
        Class<? extends View> superclass = cls.getSuperclass();
        if (superclass != Object.class) {
            return e(superclass);
        }
        return null;
    }
}
