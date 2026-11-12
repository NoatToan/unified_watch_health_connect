package com.android.volley.toolbox;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.volley.VolleyError;

/* JADX INFO: loaded from: classes2.dex */
public class NetworkImageView extends ImageView {
    private String a;
    private int b;
    private int c;
    private ImageLoader d;
    private ImageLoader.ImageContainer e;

    public class a implements ImageLoader.ImageListener {
        public final /* synthetic */ boolean a;

        /* JADX INFO: renamed from: com.android.volley.toolbox.NetworkImageView$a$a, reason: collision with other inner class name */
        public class RunnableC0113a implements Runnable {
            public final /* synthetic */ ImageLoader.ImageContainer a;

            public RunnableC0113a(ImageLoader.ImageContainer imageContainer) {
                this.a = imageContainer;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.onResponse(this.a, false);
            }
        }

        public a(boolean z) {
            this.a = z;
        }

        @Override // com.android.volley.Response.ErrorListener
        public void onErrorResponse(VolleyError volleyError) {
            if (NetworkImageView.this.c != 0) {
                NetworkImageView networkImageView = NetworkImageView.this;
                networkImageView.setImageResource(networkImageView.c);
            }
        }

        @Override // com.android.volley.toolbox.ImageLoader.ImageListener
        public void onResponse(ImageLoader.ImageContainer imageContainer, boolean z) {
            if (z && this.a) {
                NetworkImageView.this.post(new RunnableC0113a(imageContainer));
                return;
            }
            if (imageContainer.getBitmap() != null) {
                NetworkImageView.this.setImageBitmap(imageContainer.getBitmap());
            } else if (NetworkImageView.this.b != 0) {
                NetworkImageView networkImageView = NetworkImageView.this;
                networkImageView.setImageResource(networkImageView.b);
            }
        }
    }

    public NetworkImageView(Context context) {
        this(context, null);
    }

    private void d() {
        int i = this.b;
        if (i != 0) {
            setImageResource(i);
        } else {
            setImageBitmap(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    public void c(boolean z) {
        boolean z2;
        boolean z3;
        ImageLoader.ImageContainer imageContainer;
        int i;
        ImageLoader.ImageContainer imageContainer2;
        int width = getWidth();
        int height = getHeight();
        ImageView.ScaleType scaleType = getScaleType();
        if (getLayoutParams() != null) {
            z2 = getLayoutParams().width == -2;
            z3 = getLayoutParams().height == -2;
            boolean z4 = !z2 && z3;
            if (width == 0 || height != 0 || z4) {
                if (TextUtils.isEmpty(this.a)) {
                    imageContainer2 = this.e;
                    if (imageContainer2 != null) {
                        imageContainer2.cancelRequest();
                        this.e = null;
                    }
                    d();
                    return;
                }
                imageContainer = this.e;
                if (imageContainer != null && imageContainer.getRequestUrl() != null) {
                    if (this.e.getRequestUrl().equals(this.a)) {
                        return;
                    }
                    this.e.cancelRequest();
                    d();
                }
                if (z2) {
                    width = 0;
                }
                if (z3) {
                    i = 0;
                } else {
                    i = height;
                }
                this.e = this.d.get(this.a, new a(z), width, i, scaleType);
            }
            return;
        }
        z2 = false;
        if (z2) {
        }
        if (width == 0) {
        }
        if (TextUtils.isEmpty(this.a)) {
            imageContainer2 = this.e;
            if (imageContainer2 != null) {
                imageContainer2.cancelRequest();
                this.e = null;
            }
            d();
            return;
        }
        imageContainer = this.e;
        if (imageContainer != null) {
            if (this.e.getRequestUrl().equals(this.a)) {
                return;
            }
            this.e.cancelRequest();
            d();
        }
        if (z2) {
            width = 0;
        }
        if (z3) {
            i = 0;
        } else {
            i = height;
        }
        this.e = this.d.get(this.a, new a(z), width, i, scaleType);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        ImageLoader.ImageContainer imageContainer = this.e;
        if (imageContainer != null) {
            imageContainer.cancelRequest();
            setImageBitmap(null);
            this.e = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        c(true);
    }

    public void setDefaultImageResId(int i) {
        this.b = i;
    }

    public void setErrorImageResId(int i) {
        this.c = i;
    }

    public void setImageUrl(String str, ImageLoader imageLoader) {
        this.a = str;
        this.d = imageLoader;
        c(false);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
