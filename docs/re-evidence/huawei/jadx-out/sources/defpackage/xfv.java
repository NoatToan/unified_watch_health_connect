package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.util.Log;

/* JADX INFO: loaded from: classes44.dex */
public class xfv extends BitmapDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f52848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f52849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f52850c;
    private int d;
    private int e;
    private float j;

    public void a(int i, int i2) {
        this.f52848a = i;
        this.f52849b = i2;
    }

    public void c(int i, int i2) {
        this.d = i;
        this.e = i2;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (canvas == null) {
            Log.e("AnimDrawable", "draw: canvas is null");
            return;
        }
        canvas.save();
        canvas.clipRect(this.d, this.e, canvas.getWidth(), canvas.getHeight());
        canvas.translate(this.f52848a + this.d, this.f52849b + this.e);
        canvas.scale(this.f52850c, this.j);
        super.draw(canvas);
        canvas.restore();
    }
}
