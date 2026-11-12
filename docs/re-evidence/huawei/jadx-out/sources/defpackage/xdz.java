package defpackage;

import android.graphics.Rect;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes20.dex */
public class xdz {
    public static Rect b() {
        Rect rectD = d();
        return rectD == null ? c() : rectD;
    }

    private static Rect c() {
        try {
            Object objInvoke = Class.forName("com.huawei.android.view.ExtDisplaySizeUtilEx").getMethod("getDisplaySafeInsets", new Class[0]).invoke(null, new Object[0]);
            if (objInvoke instanceof Rect) {
                return (Rect) objInvoke;
            }
            Log.e("HwDisplaySizeUtil", "getDisplaySafeInsets: object is not Rect");
            return new Rect();
        } catch (ClassNotFoundException unused) {
            Log.e("HwDisplaySizeUtil", "getDisplaySafeInsets: class not found");
        } catch (IllegalAccessException unused2) {
            Log.e("HwDisplaySizeUtil", "getDisplaySafeInsets: illegal access exception");
        } catch (NoSuchMethodException unused3) {
            Log.e("HwDisplaySizeUtil", "getDisplaySafeInsets: method not found");
        } catch (InvocationTargetException unused4) {
            Log.e("HwDisplaySizeUtil", "getDisplaySafeInsets: invocation target exception");
        }
    }

    private static Rect d() {
        try {
            Object objInvoke = Class.forName("com.huawei.android.app.WindowManagerEx").getMethod("getDisplaySideSafeInsets", new Class[0]).invoke(null, new Object[0]);
            if (objInvoke instanceof Rect) {
                return (Rect) objInvoke;
            }
            Log.e("HwDisplaySizeUtil", "getDisplaySideSafeInsets: object is not Rect");
            return null;
        } catch (ClassNotFoundException unused) {
            Log.e("HwDisplaySizeUtil", "getDisplaySideSafeInsets: class not found");
        } catch (IllegalAccessException unused2) {
            Log.e("HwDisplaySizeUtil", "getDisplaySideSafeInsets: illegal access exception");
        } catch (NoSuchMethodException unused3) {
            Log.e("HwDisplaySizeUtil", "getDisplaySideSafeInsets: method not found");
        } catch (InvocationTargetException unused4) {
            Log.e("HwDisplaySizeUtil", "getDisplaySideSafeInsets: invocation target exception");
        }
    }
}
