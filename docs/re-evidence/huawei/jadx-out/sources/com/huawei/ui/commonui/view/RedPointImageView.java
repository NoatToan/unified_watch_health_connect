package com.huawei.ui.commonui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.internal.view.SupportMenu;
import com.huawei.ui.commonui.R;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes16.dex */
public class RedPointImageView extends ImageView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23999c;
    private Bitmap d;
    private Paint e;

    public RedPointImageView(Context context) {
        super(context);
        this.f23999c = false;
        b();
    }

    public RedPointImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23999c = false;
        b();
    }

    private void b() {
        Paint paint = new Paint();
        this.e = paint;
        paint.setStyle(Paint.Style.FILL);
        this.e.setColor(SupportMenu.CATEGORY_MASK);
        this.e.setAntiAlias(true);
        this.d = d(getContext(), R.drawable.settings_red_point_bg);
    }

    private static Bitmap d(Context context, int i) {
        Drawable drawable = context.getResources().getDrawable(i);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f23998b) {
            if (this.f23999c) {
                float width = (getWidth() / 2) + (this.d.getWidth() * 2);
                if (LanguageUtil.ba(getContext())) {
                    width = (getWidth() / 2) - (this.d.getWidth() * 2);
                }
                canvas.drawCircle(width, (this.d.getHeight() / 2.0f) + (this.d.getWidth() * 2), this.d.getWidth() / 2.0f, this.e);
                return;
            }
            float width2 = getWidth() - (this.d.getWidth() / 2.0f);
            if (LanguageUtil.ba(getContext())) {
                width2 = this.d.getWidth() / 2.0f;
            }
            canvas.drawCircle(width2, this.d.getHeight() / 2.0f, this.d.getWidth() / 2.0f, this.e);
        }
    }

    public void a(boolean z) {
        this.f23998b = z;
        postInvalidate();
    }

    public void e(boolean z) {
        this.f23999c = z;
        postInvalidate();
    }
}
