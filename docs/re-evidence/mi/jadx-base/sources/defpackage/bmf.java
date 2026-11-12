package defpackage;

import android.net.Uri;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class bmf {
    public static boolean a(Uri uri) {
        return c(uri) && uri.getPathSegments().contains("picker");
    }

    public static boolean b(Uri uri) {
        return c(uri) && !f(uri);
    }

    public static boolean c(Uri uri) {
        return uri != null && MiuiCursorConstants.CONTENT.equals(uri.getScheme()) && Feature.MEDIA.equals(uri.getAuthority());
    }

    public static boolean d(Uri uri) {
        return c(uri) && f(uri);
    }

    public static boolean e(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    public static boolean f(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
