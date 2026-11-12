package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.TextView;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes4.dex */
public class cpa extends d8p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f14586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractDraweeControllerBuilder f14587b;
    public final i57<zxa> c;
    public final Object d;
    public int e;
    public int f;
    public Uri g;
    public int h;
    public ReadableMap i;
    public TextView j;

    public cpa(Resources resources, int i, int i2, int i3, Uri uri, ReadableMap readableMap, AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, Object obj) {
        this.c = new i57<>(aya.u(resources).a());
        this.f14587b = abstractDraweeControllerBuilder;
        this.d = obj;
        this.f = i3;
        this.g = uri == null ? Uri.EMPTY : uri;
        this.i = readableMap;
        this.h = (int) exh.c(i2);
        this.e = (int) exh.c(i);
    }

    @Override // defpackage.d8p
    public Drawable a() {
        return this.f14586a;
    }

    @Override // defpackage.d8p
    public int b() {
        return this.e;
    }

    @Override // defpackage.d8p
    public void c() {
        this.c.j();
    }

    @Override // defpackage.d8p
    public void d() {
        this.c.k();
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.f14586a == null) {
            this.c.n(this.f14587b.w().b(this.c.f()).y(this.d).A(aej.w(ImageRequestBuilder.r(this.g), this.i)).build());
            this.f14587b.w();
            Drawable drawableH = this.c.h();
            this.f14586a = drawableH;
            drawableH.setBounds(0, 0, this.h, this.e);
            int i6 = this.f;
            if (i6 != 0) {
                this.f14586a.setColorFilter(i6, PorterDuff.Mode.SRC_IN);
            }
            this.f14586a.setCallback(this.j);
        }
        canvas.save();
        canvas.translate(f, ((i4 + ((int) paint.descent())) - (((int) (paint.descent() - paint.ascent())) / 2)) - ((this.f14586a.getBounds().bottom - this.f14586a.getBounds().top) / 2));
        this.f14586a.draw(canvas);
        canvas.restore();
    }

    @Override // defpackage.d8p
    public void e() {
        this.c.j();
    }

    @Override // defpackage.d8p
    public void f() {
        this.c.k();
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i3 = -this.e;
            fontMetricsInt.ascent = i3;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i3;
            fontMetricsInt.bottom = 0;
        }
        return this.h;
    }

    @Override // defpackage.d8p
    public void h(TextView textView) {
        this.j = textView;
    }
}
