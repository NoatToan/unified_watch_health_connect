package com.huawei.phoneservice.feedback.mvp.base;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.huawei.phoneservice.faq.base.util.p;
import com.huawei.phoneservice.feedback.R;

/* JADX INFO: loaded from: classes13.dex */
public class FeedbackNoMoreDrawable extends Drawable implements FeedbackFootOverScrollListView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TextPaint f21670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f21671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f21672c;
    private Paint d;
    private String e;
    private Drawable f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private boolean t;
    private int x;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
        this.f21670a.setColorFilter(colorFilter);
        this.f.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.d.setAlpha(i);
        this.f21670a.setAlpha(i);
        this.f.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) this.f21671b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f21671b;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        c(bounds.width());
        float fMax = Math.max(this.x, bounds.top);
        canvas.save();
        bounds.top = (int) fMax;
        canvas.clipRect(bounds);
        canvas.translate(0.0f, fMax);
        float f = this.o;
        float f2 = this.k;
        float f3 = this.n;
        canvas.drawLine(f - f2, f3, f, f3, this.d);
        float f4 = this.l;
        float f5 = this.s;
        canvas.drawLine(f4, f5, f4 + this.k, f5, this.d);
        canvas.translate(this.p, this.r);
        this.f.draw(canvas);
        canvas.translate(-this.p, -this.r);
        StaticLayout staticLayout = new StaticLayout(this.e, this.f21670a, (int) this.g, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        float height = (this.f21671b / 2.0f) - (staticLayout.getHeight() / 2.0f);
        canvas.translate(this.q, height);
        staticLayout.draw(canvas);
        canvas.translate(-this.q, -height);
        canvas.translate(0.0f, -fMax);
        canvas.restore();
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.FeedbackFootOverScrollListView.a
    public void a(int i, int i2, int i3, int i4) {
        Resources resources;
        int i5;
        if (i2 > 0) {
            this.x = i2;
        }
        if (this.f21672c.getResources().getConfiguration().orientation == 1) {
            resources = this.f21672c.getResources();
            i5 = R.dimen.feedback_sdk_nomoredate_line_width;
        } else {
            resources = this.f21672c.getResources();
            i5 = R.dimen.feedback_sdk_nomoredate_line_width_pad;
        }
        this.k = resources.getDimension(i5);
    }

    private void c(int i) {
        float f = this.j;
        float f2 = this.h;
        float f3 = this.g;
        float f4 = i / 2.0f;
        float f5 = ((f2 + f) + f3) / 2.0f;
        float f6 = this.i;
        float f7 = (f4 - f5) - f6;
        this.o = f7;
        float f8 = this.f21671b / 2.0f;
        float f9 = f8 - (this.m / 2.0f);
        this.n = f9;
        float f10 = f4 + f5 + f6;
        this.l = f10;
        this.s = f9;
        if (this.t) {
            this.p = (f10 - f6) - f;
            this.q = f7 + f6;
        } else {
            this.p = f7 + f6;
            this.q = (f10 - f6) - f3;
        }
        this.r = f8 - (f / 2.0f);
    }

    public FeedbackNoMoreDrawable(Context context) {
        this.f21672c = context;
        this.m = context.getResources().getDimension(R.dimen.feedback_sdk_nomoredate_line_height);
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setStrokeWidth(this.m);
        this.d.setColor(context.getResources().getColor(R.color.feedback_sdk_list_item_hint_text_color_normal));
        TextPaint textPaint = new TextPaint();
        this.f21670a = textPaint;
        textPaint.setColor(context.getResources().getColor(R.color.feedback_sdk_label_assist_text_color_normal));
        this.f21670a.setAntiAlias(true);
        this.f21670a.setTextSize(context.getResources().getDimension(R.dimen.feedback_sdk_nomoredate_txt_font_size));
        this.f21671b = context.getResources().getDimension(R.dimen.feedback_sdk_nomoredate_img_size) + (context.getResources().getDimension(R.dimen.feedback_sdk_nomoredate_img_margin_top_bottom) * 2.0f);
        this.f = context.getResources().getDrawable(R.drawable.feedback_ic_smile_gray);
        float dimension = context.getResources().getDimension(R.dimen.feedback_sdk_nomoredate_img_size);
        this.j = dimension;
        int i = (int) dimension;
        this.f.setBounds(0, 0, i, i);
        this.i = context.getResources().getDimension(R.dimen.feedback_sdk_nomoredate_img_margin_start_end);
        this.h = context.getResources().getDimension(R.dimen.feedback_sdk_nomoredate_txt_margin_start);
        this.k = context.getResources().getDimension(R.dimen.feedback_sdk_nomoredate_line_width);
        String string = context.getResources().getString(R.string.feedback_sdk_nomore_data);
        this.e = string;
        this.g = this.f21670a.measureText(string);
        this.t = p.e(context);
        this.x = com.huawei.phoneservice.faq.base.util.d.e(context);
    }
}
