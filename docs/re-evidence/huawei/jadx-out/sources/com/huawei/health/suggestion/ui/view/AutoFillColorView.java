package com.huawei.health.suggestion.ui.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.basefitnessadvice.R;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.qqf;
import defpackage.qqm;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import huawei.android.hwcolorpicker.HwColorPicker;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes9.dex */
public class AutoFillColorView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    View f10171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    View f10172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference<Context> f10173c;
    private String d;
    ImageView e;
    private boolean f;
    private boolean g;
    private Drawable h;
    private boolean i;
    private int j;
    private int n;

    public AutoFillColorView(Context context) {
        super(context);
        this.g = false;
        this.i = true;
        d(context, (AttributeSet) null);
    }

    public AutoFillColorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = false;
        this.i = true;
        d(context, attributeSet);
    }

    public AutoFillColorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = false;
        this.i = true;
        d(context, attributeSet);
    }

    private void d(Context context, AttributeSet attributeSet) {
        this.f10173c = new WeakReference<>(context);
        View.inflate(context, R.layout.auto_fill_color_view, this);
        this.e = (ImageView) findViewById(R.id.img_content);
        this.f10172b = findViewById(R.id.startView);
        this.f10171a = findViewById(R.id.coverView);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.AutoFillColorView);
            if (typedArrayObtainStyledAttributes.getDrawable(R.styleable.AutoFillColorView_contentImg) != null) {
                this.e.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(R.styleable.AutoFillColorView_contentImg));
            }
            ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                this.e.setLayoutParams(layoutParams);
            }
            int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.AutoFillColorView_contentWidth, 0);
            int layoutDimension2 = typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.AutoFillColorView_contentHeight, 0);
            if (layoutDimension != 0) {
                layoutParams.width = layoutDimension;
            }
            if (layoutDimension2 != 0) {
                layoutParams.height = layoutDimension2;
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (getVisibility() != i && i == 0 && !this.i) {
            b();
        }
        super.setVisibility(i);
    }

    private void b() {
        this.e.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.health.suggestion.ui.view.AutoFillColorView.4
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                AutoFillColorView.this.e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                AutoFillColorView.this.e();
            }
        });
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ImageView imageView = this.e;
        if (imageView == null) {
            LogUtil.j("Suggestion_AutoFillColorView", "onConfigurationChanged() failed with mImgContent is null ");
            return;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        } else {
            layoutParams.width = -1;
        }
        this.e.setLayoutParams(layoutParams);
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.g) {
            d(this.h, this.f);
        } else {
            e(this.d, this.f);
        }
    }

    public void d(Drawable drawable, boolean z) {
        WeakReference<Context> weakReference;
        if (this.e == null || (weakReference = this.f10173c) == null || weakReference.get() == null) {
            LogUtil.j("Suggestion_AutoFillColorView", "loadContentImage, The mImageContent or context is null, return.");
            return;
        }
        if (drawable == null) {
            LogUtil.j("Suggestion_AutoFillColorView", "the resourceDrawable is null");
            return;
        }
        this.h = drawable;
        this.f = z;
        this.g = true;
        this.i = false;
        a(drawable, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(final Drawable drawable, final boolean z) {
        Context context = this.f10173c.get();
        if (!HandlerExecutor.c()) {
            HandlerExecutor.b(new Runnable() { // from class: idf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37508a.a(drawable, z);
                }
            });
            return;
        }
        if ((context instanceof Activity) && ((Activity) context).isDestroyed()) {
            LogUtil.j("Suggestion_AutoFillColorView", "loadContentImage() activity isDestroyed");
        } else if (z) {
            qqf.e(drawable, new a(this));
        } else {
            qqf.e(drawable, this.e);
        }
    }

    public void e(final String str, final boolean z) {
        WeakReference<Context> weakReference;
        LogUtil.a("Suggestion_AutoFillColorView", "loadContentImage() url = ", str);
        if (this.e == null || (weakReference = this.f10173c) == null || weakReference.get() == null) {
            LogUtil.j("Suggestion_AutoFillColorView", "loadContentImage() mImageContent or context is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Suggestion_AutoFillColorView", "loadContentImage() url is empty");
            return;
        }
        this.d = str;
        this.f = z;
        this.g = false;
        this.i = false;
        final Context context = this.f10173c.get();
        post(new Runnable() { // from class: ide
            @Override // java.lang.Runnable
            public final void run() {
                this.f37506a.e(context, z, str);
            }
        });
    }

    public /* synthetic */ void e(Context context, boolean z, String str) {
        if ((context instanceof Activity) && ((Activity) context).isDestroyed()) {
            LogUtil.j("Suggestion_AutoFillColorView", "loadContentImage() activity isDestroyed");
        } else if (z) {
            qqf.b(str, new a(this));
        } else {
            qqf.e(str, this.e);
        }
    }

    static class a extends CustomTarget<Drawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<AutoFillColorView> f10175a;

        @Override // com.bumptech.glide.request.target.Target
        public void onLoadCleared(Drawable drawable) {
        }

        a(AutoFillColorView autoFillColorView) {
            this.f10175a = new WeakReference<>(autoFillColorView);
        }

        @Override // com.bumptech.glide.request.target.Target
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onResourceReady(Drawable drawable, Transition<? super Drawable> transition) {
            WeakReference<AutoFillColorView> weakReference = this.f10175a;
            if (weakReference == null) {
                return;
            }
            AutoFillColorView autoFillColorView = weakReference.get();
            if (autoFillColorView == null) {
                LogUtil.j("Suggestion_AutoFillColorView", "autoFillColorView == null");
                return;
            }
            try {
                autoFillColorView.d(drawable);
            } catch (OutOfMemoryError unused) {
                LogUtil.e("Suggestion_AutoFillColorView", "loadContentImage() OutOfMemoryError");
            } catch (RuntimeException e) {
                LogUtil.e("Suggestion_AutoFillColorView", "exception:", LogAnonymous.b(e));
            }
        }
    }

    public void d(Drawable drawable) {
        if (drawable == null) {
            LogUtil.j("Suggestion_AutoFillColorView", "fillColorBackground() drawable is null");
            return;
        }
        float fB = b(drawable);
        int height = this.e.getHeight();
        if (height == 0) {
            LogUtil.j("Suggestion_AutoFillColorView", "height == 0");
            if (getVisibility() == 0) {
                b();
                return;
            }
            return;
        }
        this.i = true;
        float width = (this.e.getWidth() * 1.0f) / height;
        int width2 = this.e.getWidth();
        if (fB >= width) {
            this.e.setImageDrawable(drawable);
            LogUtil.a("Suggestion_AutoFillColorView", "fillColorBackground() onGlobalLayout More Long");
            return;
        }
        if (fB >= width) {
            LogUtil.j("Suggestion_AutoFillColorView", "fillColorBackground is other condition");
        } else {
            ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.width = (int) (this.e.getHeight() * fB);
                this.e.setLayoutParams(layoutParams2);
                width2 = layoutParams2.width;
            }
        }
        int iC = c(drawable);
        if (this.f10172b.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) this.f10172b.getLayoutParams()).width = getMeasuredWidth() - width2;
        }
        this.f10172b.setBackgroundColor(iC);
        if (this.f10171a.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) this.f10171a.getLayoutParams()).width = width2 / 2;
        }
        d(drawable, iC);
    }

    private void d(Drawable drawable, int i) {
        GradientDrawable gradientDrawable;
        int iArgb = Color.argb(0, Color.red(i), Color.green(i), Color.blue(i));
        WeakReference<Context> weakReference = this.f10173c;
        if (weakReference == null || weakReference.get() == null) {
            LogUtil.j("Suggestion_AutoFillColorView", "setGradientDrawable() context is null");
            return;
        }
        if (LanguageUtil.ba(this.f10173c.get())) {
            gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{i, iArgb});
        } else {
            gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{i, iArgb});
        }
        this.f10171a.setBackground(gradientDrawable);
        this.e.setImageDrawable(drawable);
    }

    private int c(Drawable drawable) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        HwColorPicker.PickedColor pickedColorProcessBitmap = HwColorPicker.processBitmap(bitmapCreateBitmap, HwColorPicker.ClientType.Debug);
        this.j = pickedColorProcessBitmap.get(HwColorPicker.ResultType.MergedRgb1);
        this.n = pickedColorProcessBitmap.get(HwColorPicker.ResultType.MergedRgb2);
        int i = pickedColorProcessBitmap.get(HwColorPicker.ResultType.MergedNum1);
        int i2 = pickedColorProcessBitmap.get(HwColorPicker.ResultType.MergedNum2);
        float[] fArr = new float[3];
        float[] fArr2 = new float[3];
        Color.colorToHSV(this.j, fArr);
        Color.colorToHSV(this.n, fArr2);
        return qqm.a(fArr, fArr2, Boolean.valueOf(i - i2 > 5), qqm.b(fArr));
    }

    private float b(Drawable drawable) {
        int intrinsicHeight;
        if (drawable == null || (intrinsicHeight = drawable.getIntrinsicHeight()) == 0) {
            return 0.0f;
        }
        return (drawable.getIntrinsicWidth() * 1.0f) / intrinsicHeight;
    }

    public ImageView getContentImg() {
        ImageView imageView = this.e;
        return imageView != null ? imageView : (ImageView) findViewById(R.id.img_content);
    }
}
