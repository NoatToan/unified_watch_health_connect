package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.view.c;

/* JADX INFO: loaded from: classes.dex */
public class byq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ryq f4732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Property<View, Float> f4733b;
    public static final Property<View, Rect> c;

    public class a extends Property<View, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(byq.c(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f) {
            byq.h(view, f.floatValue());
        }
    }

    public class b extends Property<View, Rect> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return c.t(view);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            c.y0(view, rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f4732a = new qyq();
        } else {
            f4732a = new pyq();
        }
        f4733b = new a(Float.class, "translationAlpha");
        c = new b(Rect.class, "clipBounds");
    }

    public static void a(View view) {
        f4732a.a(view);
    }

    public static dwq b(View view) {
        return new bwq(view);
    }

    public static float c(View view) {
        return f4732a.b(view);
    }

    public static vkr d(View view) {
        return new ukr(view);
    }

    public static void e(View view) {
        f4732a.c(view);
    }

    public static void f(View view, Matrix matrix) {
        f4732a.d(view, matrix);
    }

    public static void g(View view, int i, int i2, int i3, int i4) {
        f4732a.e(view, i, i2, i3, i4);
    }

    public static void h(View view, float f) {
        f4732a.f(view, f);
    }

    public static void i(View view, int i) {
        f4732a.g(view, i);
    }

    public static void j(View view, Matrix matrix) {
        f4732a.h(view, matrix);
    }

    public static void k(View view, Matrix matrix) {
        f4732a.i(view, matrix);
    }
}
