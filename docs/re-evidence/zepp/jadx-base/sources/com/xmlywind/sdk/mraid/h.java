package com.xmlywind.sdk.mraid;

import android.content.Context;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes22.dex */
class h {
    private final Context a;
    private final Rect b = new Rect();
    private final Rect c = new Rect();
    private final Rect d = new Rect();
    private final Rect e = new Rect();
    private final Rect f = new Rect();
    private final Rect g = new Rect();
    private final Rect h = new Rect();
    private final Rect i = new Rect();
    private final float j;

    public h(Context context, float f) {
        this.a = context.getApplicationContext();
        this.j = f;
    }

    private void a(Rect rect, Rect rect2) {
        rect2.set(com.xmlywind.sdk.common.utils.c.a(rect.left, this.a), com.xmlywind.sdk.common.utils.c.a(rect.top, this.a), com.xmlywind.sdk.common.utils.c.a(rect.right, this.a), com.xmlywind.sdk.common.utils.c.a(rect.bottom, this.a));
    }

    public Rect a() {
        return this.c;
    }

    public void a(int i, int i2) {
        this.b.set(0, 0, i, i2);
        a(this.b, this.c);
    }

    public void a(int i, int i2, int i3, int i4) {
        this.d.set(i, i2, i3 + i, i4 + i2);
        a(this.d, this.e);
    }

    public Rect b() {
        return this.e;
    }

    public void b(int i, int i2, int i3, int i4) {
        this.f.set(i, i2, i3 + i, i4 + i2);
        a(this.f, this.g);
    }

    public Rect c() {
        return this.g;
    }

    public void c(int i, int i2, int i3, int i4) {
        this.h.set(i, i2, i3 + i, i4 + i2);
        a(this.h, this.i);
    }

    public Rect d() {
        return this.i;
    }
}
