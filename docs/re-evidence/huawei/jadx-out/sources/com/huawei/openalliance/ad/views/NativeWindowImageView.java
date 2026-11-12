package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.INativeAd;
import com.huawei.openalliance.ad.inter.data.ImageInfo;
import com.huawei.openalliance.ad.sn;
import com.huawei.openalliance.ad.utils.bd;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.views.gif.GifPlayView;
import com.huawei.openalliance.ad.views.interfaces.INativeWindowImageView;

/* JADX INFO: loaded from: classes41.dex */
public class NativeWindowImageView extends AutoScaleSizeRelativeLayout implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, bd.a, INativeWindowImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f20803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GifPlayView f20804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ProgressBar f20805c;
    private INativeAd d;
    private Drawable e;
    private Rect f;
    private Rect g;
    private float h;
    private int i;
    private boolean j;

    @Override // com.huawei.openalliance.ad.views.interfaces.INativeWindowImageView
    public void setNativeAd(INativeAd iNativeAd) {
        this.d = iNativeAd;
        if (iNativeAd != null) {
            for (ImageInfo imageInfo : iNativeAd.getImageInfos()) {
                if (imageInfo != null) {
                    String url = imageInfo.getUrl();
                    if (!dg.l(url)) {
                        bd.a(getContext(), url, this);
                        break;
                    }
                    sn snVar = new sn();
                    snVar.d(url);
                    snVar.c(imageInfo.getSha256());
                    snVar.b(imageInfo.isCheckSha256());
                    snVar.c(imageInfo.a());
                    snVar.b(Constants.NATIVE_WINDOW_SUB_DIR);
                    bd.a(getContext(), snVar, this);
                    break;
                }
            }
            requestLayout();
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.INativeWindowImageView
    public void setDisplayView(View view) {
        if (view != null) {
            this.j = false;
            this.f20803a = view;
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        e();
    }

    @Override // com.huawei.openalliance.ad.views.AutoScaleSizeRelativeLayout, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = getMeasuredWidth();
        this.f20804b.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (measuredWidth * this.h), 1073741824));
    }

    @Override // com.huawei.openalliance.ad.views.AutoScaleSizeRelativeLayout, android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        GifPlayView gifPlayView = this.f20804b;
        gifPlayView.layout(0, 0, gifPlayView.getMeasuredWidth(), this.f20804b.getMeasuredHeight());
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
    }

    @Override // com.huawei.openalliance.ad.utils.bd.a
    public void a(final Drawable drawable) {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.NativeWindowImageView.2
            @Override // java.lang.Runnable
            public void run() {
                NativeWindowImageView.this.e = drawable;
                NativeWindowImageView nativeWindowImageView = NativeWindowImageView.this;
                nativeWindowImageView.setImageDrawable(nativeWindowImageView.e);
            }
        });
    }

    @Override // com.huawei.openalliance.ad.utils.bd.a
    public void a() {
        hw.d("NativeWindowImageView", "load image fail");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageDrawable(Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof com.huawei.openalliance.ad.views.gif.b) {
                ((com.huawei.openalliance.ad.views.gif.b) drawable).a(new com.huawei.openalliance.ad.views.gif.d() { // from class: com.huawei.openalliance.ad.views.NativeWindowImageView.1
                    @Override // com.huawei.openalliance.ad.views.gif.d
                    public void b() {
                    }

                    @Override // com.huawei.openalliance.ad.views.gif.d
                    public void c() {
                    }

                    @Override // com.huawei.openalliance.ad.views.gif.d
                    public void a() {
                        NativeWindowImageView.this.k();
                    }
                });
            } else {
                k();
            }
            this.f20804b.setImageDrawable(drawable);
            this.f20805c.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        int intrinsicWidth = this.e.getIntrinsicWidth();
        int intrinsicHeight = this.e.getIntrinsicHeight();
        if (intrinsicHeight != 0 && intrinsicWidth != 0) {
            this.h = intrinsicHeight / intrinsicWidth;
        }
        e();
    }

    private void j() {
        int width = (int) (getWidth() * this.h);
        if (a(width)) {
            int iHeight = (this.f.height() - width) / 2;
            if (this.g.top - this.f.top <= iHeight) {
                this.i = 0;
            } else if (this.f.bottom - this.g.bottom <= iHeight) {
                this.i = this.g.height() - width;
            } else {
                this.i = (this.f.top + iHeight) - this.g.top;
            }
        }
    }

    private void i() {
        Rect rect = new Rect();
        getLocalVisibleRect(rect);
        Rect rect2 = new Rect();
        getGlobalVisibleRect(rect2);
        this.g.left = rect2.left - rect.left;
        Rect rect3 = this.g;
        rect3.right = rect3.left + getWidth();
        this.g.top = rect2.top - rect.top;
        Rect rect4 = this.g;
        rect4.bottom = rect4.top + getHeight();
    }

    private void h() {
        Object parent = this.f20803a.getParent();
        if (parent == null) {
            hw.d("NativeWindowImageView", "invalid parent obj");
        } else {
            ((View) parent).getGlobalVisibleRect(this.f);
        }
    }

    private void g() {
        if (this.e == null) {
            return;
        }
        this.f20804b.setScaleType(ImageView.ScaleType.MATRIX);
        int intrinsicWidth = this.e.getIntrinsicWidth();
        float width = intrinsicWidth != 0 ? getWidth() / intrinsicWidth : 1.0f;
        Matrix matrix = new Matrix();
        matrix.setScale(width, width);
        matrix.postTranslate(0.0f, this.i);
        this.f20804b.setImageMatrix(matrix);
        this.f20804b.invalidate();
    }

    private boolean f() {
        Rect rect = new Rect();
        getGlobalVisibleRect(rect);
        return rect.width() > 0 && rect.height() > 0;
    }

    private void e() {
        if (f()) {
            b();
            h();
            i();
            j();
            g();
        }
    }

    private void d() {
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this);
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }

    private void c() {
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.removeOnGlobalLayoutListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b() {
        ViewParent parent;
        if (this.j) {
            ViewParent parent2 = this.f20803a.getParent();
            while (true) {
                if (parent == 0 || a(parent)) {
                    parent = parent2;
                    break;
                } else {
                    parent = parent2;
                    parent = parent.getParent();
                }
            }
            if (a(parent)) {
                this.f20803a = (View) parent;
            }
        }
    }

    private boolean a(Object obj) {
        return obj instanceof PPSNativeView;
    }

    private boolean a(int i) {
        return this.f.height() >= i;
    }

    private void a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.hiad_window_image_layout, this);
        this.f20803a = this;
        this.f20804b = (GifPlayView) findViewById(R.id.window_image_content);
        this.f20805c = (ProgressBar) findViewById(R.id.window_image_progress);
        setRatio(Float.valueOf(1.7777778f));
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f = new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public NativeWindowImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.g = new Rect();
        this.h = 1.3007812f;
        this.i = 0;
        this.j = true;
        a(context);
    }

    public NativeWindowImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new Rect();
        this.h = 1.3007812f;
        this.i = 0;
        this.j = true;
        a(context);
    }

    public NativeWindowImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new Rect();
        this.h = 1.3007812f;
        this.i = 0;
        this.j = true;
        a(context);
    }

    public NativeWindowImageView(Context context) {
        super(context);
        this.g = new Rect();
        this.h = 1.3007812f;
        this.i = 0;
        this.j = true;
        a(context);
    }
}
