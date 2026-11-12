package com.facebook.drawee.view;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: com.facebook.drawee.view.a$a, reason: collision with other inner class name */
    public static class C0150a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7111b;
    }

    public static boolean a(int i) {
        return i == 0 || i == -2;
    }

    public static void b(C0150a c0150a, float f, ViewGroup.LayoutParams layoutParams, int i, int i2) {
        if (f <= 0.0f || layoutParams == null) {
            return;
        }
        if (a(layoutParams.height)) {
            c0150a.f7111b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c0150a.f7110a) - i) / f) + i2), c0150a.f7111b), 1073741824);
        } else if (a(layoutParams.width)) {
            c0150a.f7110a = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c0150a.f7111b) - i2) * f) + i), c0150a.f7110a), 1073741824);
        }
    }
}
