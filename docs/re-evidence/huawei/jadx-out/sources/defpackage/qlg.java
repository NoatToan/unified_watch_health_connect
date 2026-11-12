package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes16.dex */
class qlg extends BitmapDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f46430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f46431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46432c;
    private float e;

    qlg(View view, float f, float f2) {
        super(view.getResources(), d(view));
        qle qleVar = (qle) view.getTag();
        this.e = qleVar.g().top;
        this.f46432c = qleVar.g().left;
        this.f46430a = f;
        this.f46431b = f2;
        setBounds(qleVar.g().left, qleVar.g().top, qleVar.g().right, qleVar.g().bottom);
    }

    void d(MotionEvent motionEvent) {
        int y = (int) ((this.e - this.f46430a) + motionEvent.getY());
        int x = (int) ((this.f46432c - this.f46431b) + motionEvent.getX());
        setBounds(x, y, getIntrinsicWidth() + x, getIntrinsicHeight() + y);
    }

    static Bitmap d(View view) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }
}
