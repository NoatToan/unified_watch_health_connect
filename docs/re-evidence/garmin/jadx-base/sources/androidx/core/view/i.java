package androidx.core.view;

import android.graphics.Insets;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayCutout f6455a;

    public static class a {
        private a() {
        }

        public static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4);
        }
    }

    public static class b {
        private b() {
        }

        public static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
        }

        public static Insets b(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    public static class c {
        private c() {
        }

        public static Path a(DisplayCutout displayCutout) {
            return displayCutout.getCutoutPath();
        }
    }

    public static class d {
        private d() {
        }

        public static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2, Path path) {
            DisplayCutout.Builder waterfallInsets = new DisplayCutout.Builder().setSafeInsets(insets).setWaterfallInsets(insets2);
            if (rect != null) {
                waterfallInsets.setBoundingRectLeft(rect);
            }
            if (rect2 != null) {
                waterfallInsets.setBoundingRectTop(rect2);
            }
            if (rect3 != null) {
                waterfallInsets.setBoundingRectRight(rect3);
            }
            if (rect4 != null) {
                waterfallInsets.setBoundingRectBottom(rect4);
            }
            if (path != null) {
                waterfallInsets.setCutoutPath(path);
            }
            return waterfallInsets.build();
        }
    }

    public i(c7.e eVar, Rect rect, Rect rect2, Rect rect3, Rect rect4, c7.e eVar2) {
        this(a(eVar, rect, rect2, rect3, rect4, eVar2, null));
    }

    public static DisplayCutout a(c7.e eVar, Rect rect, Rect rect2, Rect rect3, Rect rect4, c7.e eVar2, Path path) {
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            return d.a(eVar.e(), rect, rect2, rect3, rect4, eVar2.e(), path);
        }
        if (i14 >= 30) {
            return b.a(eVar.e(), rect, rect2, rect3, rect4, eVar2.e());
        }
        if (i14 >= 29) {
            return a.a(eVar.e(), rect, rect2, rect3, rect4);
        }
        Rect rect5 = new Rect(eVar.f25190a, eVar.f25191b, eVar.f25192c, eVar.f25193d);
        ArrayList arrayList = new ArrayList();
        if (rect != null) {
            arrayList.add(rect);
        }
        if (rect2 != null) {
            arrayList.add(rect2);
        }
        if (rect3 != null) {
            arrayList.add(rect3);
        }
        if (rect4 != null) {
            arrayList.add(rect4);
        }
        return new DisplayCutout(rect5, arrayList);
    }

    public static i c(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new i(displayCutout);
    }

    public final c7.e b() {
        return Build.VERSION.SDK_INT >= 30 ? c7.e.d(b.b(this.f6455a)) : c7.e.f25189e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f6455a, ((i) obj).f6455a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f6455a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f6455a + StringSubstitutor.DEFAULT_VAR_END;
    }

    public i(c7.e eVar, Rect rect, Rect rect2, Rect rect3, Rect rect4, c7.e eVar2, Path path) {
        this(a(eVar, rect, rect2, rect3, rect4, eVar2, path));
    }

    private i(DisplayCutout displayCutout) {
        this.f6455a = displayCutout;
    }

    public i(Rect rect, List<Rect> list) {
        this(new DisplayCutout(rect, list));
    }
}
