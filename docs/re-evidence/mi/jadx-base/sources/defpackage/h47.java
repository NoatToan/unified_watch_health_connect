package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes6.dex */
public class h47 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s7d f19673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g47 f19674b;
    public abf c;
    public fm1 d;

    public h47() {
        s7d s7dVar = new s7d();
        this.f19673a = s7dVar;
        this.f19674b = new g47(s7dVar);
        this.c = new abf();
        this.d = new fm1(this.f19673a);
    }

    public void a(Canvas canvas) {
        this.f19674b.a(canvas);
    }

    public s7d b() {
        if (this.f19673a == null) {
            this.f19673a = new s7d();
        }
        return this.f19673a;
    }

    public void c(Context context, AttributeSet attributeSet) {
        this.d.c(context, attributeSet);
    }

    public Pair<Integer, Integer> d(int i, int i2) {
        return this.c.a(this.f19673a, i, i2);
    }

    public void e(g47.b bVar) {
        this.f19674b.e(bVar);
    }

    public void f(MotionEvent motionEvent) {
        this.f19674b.f(motionEvent);
    }

    public void g(gnq gnqVar) {
        this.f19674b.g(gnqVar);
    }
}
