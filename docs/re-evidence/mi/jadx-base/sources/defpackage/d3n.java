package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import miuix.smooth.SmoothContainerDrawable2;

/* JADX INFO: loaded from: classes3.dex */
public class d3n extends SmoothContainerDrawable2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RectF f15052k = new RectF();
    public Path l = new Path();

    @Override // miuix.smooth.SmoothContainerDrawable2, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (Build.VERSION.SDK_INT < 30) {
            outline.setRoundRect(b(), d());
            return;
        }
        this.l.reset();
        Rect rectB = b();
        RectF rectF = this.f15052k;
        rectF.left = rectB.left;
        rectF.top = rectB.top;
        rectF.right = rectB.right;
        rectF.bottom = rectB.bottom;
        this.l.addRoundRect(rectF, d(), d(), Path.Direction.CW);
        outline.setPath(this.l);
    }
}
