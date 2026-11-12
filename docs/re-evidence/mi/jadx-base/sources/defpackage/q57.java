package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.FloatRange;
import defpackage.fa2;

/* JADX INFO: loaded from: classes5.dex */
public abstract class q57<S extends fa2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public S f31128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b57 f31129b;

    public q57(S s) {
        this.f31128a = s;
    }

    public abstract void a(Canvas canvas, @FloatRange(from = 0.0d, to = 1.0d) float f);

    public abstract void b(Canvas canvas, Paint paint, @FloatRange(from = 0.0d, to = 1.0d) float f, @FloatRange(from = 0.0d, to = 1.0d) float f2, int i);

    public abstract void c(Canvas canvas, Paint paint);

    public abstract int d();

    public abstract int e();

    public void f(b57 b57Var) {
        this.f31129b = b57Var;
    }

    public void g(Canvas canvas, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.f31128a.e();
        a(canvas, f);
    }
}
