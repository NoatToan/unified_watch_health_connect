package c7;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: c7.a$a, reason: collision with other inner class name */
    public static class C0372a {
        private C0372a() {
        }

        public static ColorFilter a(int i14, Object obj) {
            return new BlendModeColorFilter(i14, (BlendMode) obj);
        }
    }

    private a() {
    }

    public static ColorFilter a(int i14, b bVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object objA = c.b.a(bVar);
            if (objA != null) {
                return C0372a.a(i14, objA);
            }
            return null;
        }
        PorterDuff.Mode modeA = c.a(bVar);
        if (modeA != null) {
            return new PorterDuffColorFilter(i14, modeA);
        }
        return null;
    }
}
