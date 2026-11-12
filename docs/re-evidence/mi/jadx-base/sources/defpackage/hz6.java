package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;
import androidx.annotation.RequiresApi;
import com.miui.tsmclient.util.Constants;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class hz6 {
    public static final Size d = new Size(1920, Constants.FHD_WIDTH);
    public static final Object e = new Object();
    public static volatile hz6 f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayManager f20616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Size f20617b = null;
    public final o9f c = new o9f();

    public hz6(Context context) {
        this.f20616a = (DisplayManager) context.getSystemService("display");
    }

    public static hz6 b(Context context) {
        if (f == null) {
            synchronized (e) {
                try {
                    if (f == null) {
                        f = new hz6(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    public final Size a() {
        Point point = new Point();
        c().getRealSize(point);
        Size size = point.x > point.y ? new Size(point.x, point.y) : new Size(point.y, point.x);
        int width = size.getWidth() * size.getHeight();
        Size size2 = d;
        if (width > size2.getWidth() * size2.getHeight()) {
            size = size2;
        }
        return this.c.a(size);
    }

    public Display c() {
        Display[] displays = this.f20616a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display display = null;
        int i = -1;
        for (Display display2 : displays) {
            if (display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i2 = point.x;
                int i3 = point.y;
                if (i2 * i3 > i) {
                    display = display2;
                    i = i2 * i3;
                }
            }
        }
        if (display != null) {
            return display;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    public Size d() {
        if (this.f20617b != null) {
            return this.f20617b;
        }
        this.f20617b = a();
        return this.f20617b;
    }

    public void e() {
        this.f20617b = a();
    }
}
