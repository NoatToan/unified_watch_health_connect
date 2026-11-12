package com.xmlywind.volley.toolbox;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.xmlywind.volley.s;

/* JADX INFO: loaded from: classes22.dex */
public class NetworkImageView extends ImageView {
    private String a;
    private int b;
    private int c;
    private k d;
    private k.c e;

    /* JADX INFO: renamed from: com.xmlywind.volley.toolbox.NetworkImageView$1, reason: invalid class name */
    public class AnonymousClass1 implements k.d {
        public final /* synthetic */ boolean a;

        public AnonymousClass1(boolean z) {
            this.a = z;
        }

        @Override // com.xmlywind.volley.toolbox.k.d
        public void a(final k.c cVar, boolean z) {
            if (z && this.a) {
                NetworkImageView.this.post(new Runnable() { // from class: com.xmlywind.volley.toolbox.NetworkImageView.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass1.this.a(cVar, false);
                    }
                });
                return;
            }
            if (cVar.b() != null) {
                NetworkImageView.this.setImageBitmap(cVar.b());
            } else if (NetworkImageView.this.b != 0) {
                NetworkImageView networkImageView = NetworkImageView.this;
                networkImageView.setImageResource(networkImageView.b);
            }
        }

        @Override // com.xmlywind.volley.n.a
        public void onErrorResponse(s sVar) {
            if (NetworkImageView.this.c != 0) {
                NetworkImageView networkImageView = NetworkImageView.this;
                networkImageView.setImageResource(networkImageView.c);
            }
        }
    }

    public NetworkImageView(Context context) {
        this(context, null);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private void a() {
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
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:38:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    public void a(boolean z) {
        boolean z2;
        boolean z3;
        k.c cVar;
        int i;
        k.c cVar2;
        int width = getWidth();
        int height = getHeight();
        ImageView.ScaleType scaleType = getScaleType();
        if (getLayoutParams() != null) {
            z2 = getLayoutParams().width == -2;
            z3 = getLayoutParams().height == -2;
            boolean z4 = !z2 && z3;
            if (width == 0 || height != 0 || z4) {
                if (TextUtils.isEmpty(this.a)) {
                    cVar2 = this.e;
                    if (cVar2 != null) {
                        cVar2.a();
                        this.e = null;
                    }
                    a();
                    return;
                }
                cVar = this.e;
                if (cVar != null && cVar.c() != null) {
                    if (!this.e.c().equals(this.a)) {
                        return;
                    }
                    this.e.a();
                    a();
                }
                if (z2) {
                    width = 0;
                }
                if (z3) {
                    i = 0;
                } else {
                    i = height;
                }
                this.e = this.d.a(this.a, new AnonymousClass1(z), width, i, scaleType);
            }
            return;
        }
        z2 = false;
        if (z2) {
        }
        if (width == 0) {
        }
        if (TextUtils.isEmpty(this.a)) {
            cVar2 = this.e;
            if (cVar2 != null) {
                cVar2.a();
                this.e = null;
            }
            a();
            return;
        }
        cVar = this.e;
        if (cVar != null) {
            if (!this.e.c().equals(this.a)) {
                return;
            }
            this.e.a();
            a();
        }
        if (z2) {
            width = 0;
        }
        if (z3) {
            i = 0;
        } else {
            i = height;
        }
        this.e = this.d.a(this.a, new AnonymousClass1(z), width, i, scaleType);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        k.c cVar = this.e;
        if (cVar != null) {
            cVar.a();
            setImageBitmap(null);
            this.e = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a(true);
    }

    public void setDefaultImageResId(int i) {
        this.b = i;
    }

    public void setErrorImageResId(int i) {
        this.c = i;
    }
}
