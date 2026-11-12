package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public class m8f {
    public static tl4 a(int i) {
        if (i != 0) {
            return i != 1 ? b() : new ef5();
        }
        return new txk();
    }

    public static tl4 b() {
        return new txk();
    }

    public static s08 c() {
        return new s08();
    }

    public static void d(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof l8f) {
            ((l8f) background).a0(f);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof l8f) {
            f(view, (l8f) background);
        }
    }

    public static void f(View view, l8f l8fVar) {
        if (l8fVar.S()) {
            l8fVar.f0(ayq.i(view));
        }
    }
}
