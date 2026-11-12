package defpackage;

import android.graphics.Canvas;
import android.os.Build;
import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes44.dex */
public class xer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Method f52796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Method f52797b;
    private static final Method d;
    private static final Method e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f52798c;

    static {
        if (Build.VERSION.SDK_INT >= 28) {
            f52796a = xeh.c("isDeviceSupport", (Class[]) null, "huawei.android.widget.effect.engine.HwShadowEngine");
            f52797b = xeh.c("setEnable", new Class[]{Boolean.TYPE}, "huawei.android.widget.effect.engine.HwShadowEngine");
            d = xeh.c("isEnable", (Class[]) null, "huawei.android.widget.effect.engine.HwShadowEngine");
            e = xeh.c("renderShadow", new Class[]{Canvas.class}, "huawei.android.widget.effect.engine.HwShadowEngine");
            return;
        }
        f52796a = null;
        f52797b = null;
        d = null;
        e = null;
    }

    private static boolean a(Object obj) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    public void a(Canvas canvas) {
        Object obj;
        Method method = e;
        if (method == null || (obj = this.f52798c) == null) {
            return;
        }
        xeh.c(obj, method, new Object[]{canvas});
    }

    public boolean d() {
        Object obj;
        Method method = d;
        if (method == null || (obj = this.f52798c) == null) {
            return false;
        }
        return a(xeh.c(obj, method));
    }

    public xer(ViewGroup viewGroup, int i) {
        Class<?> cls;
        Object obj = null;
        try {
            cls = Class.forName("huawei.android.widget.effect.engine.HwShadowEngine$ShadowType");
            try {
                Object[] enumConstants = cls.getEnumConstants();
                int i2 = i - 1;
                if (enumConstants != null && i2 >= 0 && i2 < enumConstants.length) {
                    obj = enumConstants[i2];
                }
            } catch (ClassNotFoundException unused) {
                Log.e("HwShadowEngine", "ShadowType class not found");
            }
        } catch (ClassNotFoundException unused2) {
            cls = null;
        }
        if (cls == null || obj == null) {
            return;
        }
        try {
            Constructor<?> constructor = Class.forName("huawei.android.widget.effect.engine.HwShadowEngine").getConstructor(ViewGroup.class, cls);
            constructor.setAccessible(true);
            this.f52798c = constructor.newInstance(viewGroup, obj);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused3) {
            Log.e("HwShadowEngine", "HwShadowEngine init failed");
        }
    }
}
