package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class wzo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f38524a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f38525b = -1;
    public static int c = -1;
    public static final int[] d = {R.attr.state_single, R.attr.state_first, R.attr.state_middle, R.attr.state_last};
    public static final int[] e = {R.attr.state_single};
    public static final int[] f = {R.attr.state_first};
    public static final int[] g = {R.attr.state_middle};
    public static final int[] h = {R.attr.state_last};

    public static int a(Context context, int i) {
        return context.getResources().getDimensionPixelSize(i);
    }

    public static void b(View view, int i, int i2) {
        int[] iArr;
        if (view == null || i2 == 0) {
            return;
        }
        Drawable background = view.getBackground();
        if ((background instanceof StateListDrawable) && vzo.b((StateListDrawable) background, d)) {
            vzo vzoVar = new vzo(background);
            view.setBackground(vzoVar);
            background = vzoVar;
        }
        if (background instanceof vzo) {
            vzo vzoVar2 = (vzo) background;
            if (i2 == 1) {
                iArr = e;
            } else if (i == 0) {
                iArr = f;
            } else {
                iArr = i == i2 - 1 ? h : g;
            }
            vzoVar2.d(iArr);
        }
    }

    public static void c(View view, int i, int i2) {
        b(view, i, i2);
        d(view, i, i2);
    }

    public static void d(View view, int i, int i2) {
        int i3;
        int i4;
        if (view == null || i2 == 0) {
            return;
        }
        Context context = view.getContext();
        int paddingStart = view.getPaddingStart();
        view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        view.getPaddingBottom();
        int iA = a(context, dmi.W);
        if (i2 != 1) {
            if (f38524a == -1) {
                f38524a = a(context, dmi.a0);
            }
            if (f38525b == -1) {
                f38525b = a(context, dmi.Y);
            }
            if (i == 0) {
                i3 = f38525b;
                i4 = f38524a;
                iA = a(context, dmi.V);
            } else if (i == i2 - 1) {
                i3 = f38524a;
                i4 = f38525b;
                iA = a(context, dmi.X);
            } else {
                i3 = f38524a;
            }
            view.setMinimumHeight(iA);
            view.setPaddingRelative(paddingStart, i3, paddingEnd, i4);
        }
        if (c == -1) {
            c = a(context, dmi.Z);
        }
        i3 = c;
        i4 = i3;
        view.setMinimumHeight(iA);
        view.setPaddingRelative(paddingStart, i3, paddingEnd, i4);
    }
}
