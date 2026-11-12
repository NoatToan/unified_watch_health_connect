package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import androidx.annotation.RequiresApi;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gz6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayCutout f19487a;

    @RequiresApi(28)
    public static class a {
        public static DisplayCutout a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        public static List<Rect> b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        public static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        public static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        public static int e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        public static int f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    public gz6(DisplayCutout displayCutout) {
        this.f19487a = displayCutout;
    }

    public static gz6 e(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new gz6(displayCutout);
    }

    public int a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.c(this.f19487a);
        }
        return 0;
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.d(this.f19487a);
        }
        return 0;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.e(this.f19487a);
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.f(this.f19487a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gz6.class != obj.getClass()) {
            return false;
        }
        return l4h.a(this.f19487a, ((gz6) obj).f19487a);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f19487a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f19487a + "}";
    }
}
