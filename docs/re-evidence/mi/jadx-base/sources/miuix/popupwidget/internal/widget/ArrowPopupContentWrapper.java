package miuix.popupwidget.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import defpackage.api;

/* JADX INFO: loaded from: classes3.dex */
public class ArrowPopupContentWrapper extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Paint f26747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bitmap f26748b;
    public Bitmap c;
    public Bitmap d;
    public Bitmap e;

    public ArrowPopupContentWrapper(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        super.dispatchDraw(canvas);
        canvas.drawBitmap(this.f26748b, getPaddingLeft(), getPaddingTop(), this.f26747a);
        canvas.drawBitmap(this.c, (getWidth() - this.c.getWidth()) - getPaddingRight(), getPaddingTop(), this.f26747a);
        canvas.drawBitmap(this.d, getPaddingLeft(), (getHeight() - this.d.getHeight()) - getPaddingBottom(), this.f26747a);
        canvas.drawBitmap(this.e, (getWidth() - this.e.getWidth()) - getPaddingRight(), (getHeight() - this.e.getHeight()) - getPaddingBottom(), this.f26747a);
        canvas.restore();
    }

    public ArrowPopupContentWrapper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ArrowPopupContentWrapper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.f26747a = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f26747a.setAntiAlias(true);
        Resources resources = getResources();
        this.f26748b = BitmapFactory.decodeResource(resources, api.f3328a);
        this.c = BitmapFactory.decodeResource(resources, api.f3329b);
        this.d = BitmapFactory.decodeResource(resources, api.c);
        this.e = BitmapFactory.decodeResource(resources, api.d);
    }
}
