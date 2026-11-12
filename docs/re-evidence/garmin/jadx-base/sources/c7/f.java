package c7;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    public static class a {
        private a() {
        }

        public static void a(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    private f() {
    }

    public static void a(Paint paint, b bVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.a(paint, bVar != null ? c.b.a(bVar) : null);
        } else if (bVar == null) {
            paint.setXfermode(null);
        } else {
            PorterDuff.Mode modeA = c.a(bVar);
            paint.setXfermode(modeA != null ? new PorterDuffXfermode(modeA) : null);
        }
    }
}
