package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.e2;
import androidx.camera.core.impl.t2;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class ExtraCroppingQuirk implements e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f5379a;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5380a;

        static {
            int[] iArr = new int[t2.d.values().length];
            f5380a = iArr;
            try {
                iArr[t2.d.PRIV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5380a[t2.d.YUV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5380a[t2.d.JPEG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        HashMap map = new HashMap();
        f5379a = map;
        map.put("SM-T580", null);
        map.put("SM-J710MN", new Range(21, 26));
        map.put("SM-A320FL", null);
        map.put("SM-G570M", null);
        map.put("SM-G610F", null);
        map.put("SM-G610M", new Range(21, 26));
    }

    public static Size f(t2.d dVar) {
        if (!g()) {
            return null;
        }
        int i14 = a.f5380a[dVar.ordinal()];
        if (i14 == 1) {
            return new Size(1920, 1080);
        }
        if (i14 == 2) {
            return new Size(1280, 720);
        }
        if (i14 != 3) {
            return null;
        }
        return new Size(3264, 1836);
    }

    public static boolean g() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String str = Build.MODEL;
        Locale locale = Locale.US;
        String upperCase = str.toUpperCase(locale);
        HashMap map = f5379a;
        if (!map.containsKey(upperCase)) {
            return false;
        }
        Range range = (Range) map.get(str.toUpperCase(locale));
        if (range == null) {
            return true;
        }
        return range.contains(Integer.valueOf(Build.VERSION.SDK_INT));
    }
}
