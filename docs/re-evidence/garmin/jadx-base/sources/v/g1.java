package v;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.Size;
import android.view.Display;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import androidx.camera.core.impl.t2;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.firebase.messaging.Constants;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class g1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Size f173808e = new Size(1920, 1080);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Size f173809f = new Size(320, PsExtractor.VIDEO_STREAM_MASK);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Size f173810g = new Size(640, 480);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f173811h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile g1 f173812i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayManager f173813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Size f173814b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y.j f173815c = new y.j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y.c f173816d = new y.c();

    private g1(Context context) {
        this.f173813a = (DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
    }

    public static g1 b(Context context) {
        if (f173812i == null) {
            synchronized (f173811h) {
                try {
                    if (f173812i == null) {
                        f173812i = new g1(context);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return f173812i;
    }

    public static Display d(Display[] displayArr, boolean z14) {
        Display display = null;
        int i14 = -1;
        for (Display display2 : displayArr) {
            if (!z14 || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i15 = point.x * point.y;
                if (i15 > i14) {
                    display = display2;
                    i14 = i15;
                }
            }
        }
        return display;
    }

    public final Size a() {
        Size sizeF;
        Point point = new Point();
        c(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        Size size2 = q0.c.f141971a;
        if (size.getHeight() * size.getWidth() < q0.c.a(f173809f)) {
            size = this.f173816d.f192940a != null ? (Size) SmallDisplaySizeQuirk.f5403a.get(Build.MODEL.toUpperCase(Locale.US)) : null;
            if (size == null) {
                size = f173810g;
            }
        }
        if (size.getHeight() > size.getWidth()) {
            size = new Size(size.getHeight(), size.getWidth());
        }
        int height = size.getHeight() * size.getWidth();
        Size size3 = f173808e;
        if (height > size3.getHeight() * size3.getWidth()) {
            size = size3;
        }
        if (this.f173815c.f192947a != null && (sizeF = ExtraCroppingQuirk.f(t2.d.PRIV)) != null) {
            if (sizeF.getHeight() * sizeF.getWidth() > size.getHeight() * size.getWidth()) {
                return sizeF;
            }
        }
        return size;
    }

    public final Display c(boolean z14) {
        Display[] displays = this.f173813a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display displayD = d(displays, z14);
        if (displayD == null && z14) {
            displayD = d(displays, false);
        }
        if (displayD != null) {
            return displayD;
        }
        vb.h.s("No display can be found from the input display manager!");
        return null;
    }

    public final Size e() {
        if (this.f173814b != null) {
            return this.f173814b;
        }
        this.f173814b = a();
        return this.f173814b;
    }
}
