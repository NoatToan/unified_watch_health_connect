package androidx.transition;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f11174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f11175b;

    public class a extends Property<View, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public final Float get(View view2) {
            return Float.valueOf(x.f11174a.a(view2));
        }

        @Override // android.util.Property
        public final void set(View view2, Float f14) {
            float fFloatValue = f14.floatValue();
            x.f11174a.b(fFloatValue, view2);
        }
    }

    public class b extends Property<View, Rect> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public final Rect get(View view2) {
            return view2.getClipBounds();
        }

        @Override // android.util.Property
        public final void set(View view2, Rect rect) {
            view2.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f11174a = new c0();
        } else {
            f11174a = new b0();
        }
        f11175b = new a(Float.class, "translationAlpha");
        new b(Rect.class, "clipBounds");
    }

    private x() {
    }

    public static void a(View view2, int i14, int i15, int i16, int i17) {
        f11174a.f(view2, i14, i15, i16, i17);
    }

    public static void b(int i14, View view2) {
        f11174a.c(i14, view2);
    }
}
