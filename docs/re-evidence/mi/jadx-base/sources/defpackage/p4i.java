package defpackage;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes4.dex */
public class p4i extends Animation implements v9e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f29991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f29992b;
    public float c;
    public float d;
    public float e;
    public int f;
    public int g;
    public int h;
    public int i;

    public p4i(View view, int i, int i2, int i3, int i4) {
        this.f29991a = view;
        b(i, i2, i3, i4);
    }

    @Override // defpackage.v9e
    public void a(int i, int i2, int i3, int i4) {
        b(i, i2, i3, i4);
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f, Transformation transformation) {
        float f2 = this.f29992b + (this.d * f);
        float f3 = this.c + (this.e * f);
        this.f29991a.layout(Math.round(f2), Math.round(f3), Math.round(f2 + this.f + (this.h * f)), Math.round(f3 + this.g + (this.i * f)));
    }

    public final void b(int i, int i2, int i3, int i4) {
        this.f29992b = this.f29991a.getX() - this.f29991a.getTranslationX();
        this.c = this.f29991a.getY() - this.f29991a.getTranslationY();
        this.f = this.f29991a.getWidth();
        int height = this.f29991a.getHeight();
        this.g = height;
        this.d = i - this.f29992b;
        this.e = i2 - this.c;
        this.h = i3 - this.f;
        this.i = i4 - height;
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return true;
    }
}
