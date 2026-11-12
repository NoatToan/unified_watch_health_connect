package com.huawei.uikit.hwfloatingactionbutton.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.huawei.hwfabengine.FloatingActionButtonAnimationListener;
import com.huawei.uikit.hwfloatingactionbutton.R;
import com.huawei.uikit.hwtextview.widget.HwTextView;
import defpackage.nix;
import defpackage.xes;
import defpackage.xfs;
import defpackage.xft;
import java.util.Arrays;

/* JADX INFO: loaded from: classes44.dex */
public class HwFloatingActionButton extends FloatingActionButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f29491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f29492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private xes f29493c;
    private int[] d;
    private boolean e;
    private float f;
    private String g;
    private FloatingActionButtonAnimationListener h;
    private nix i;
    private float j;
    private final FloatingActionButtonAnimationListener m;

    class d implements FloatingActionButtonAnimationListener {
        d() {
        }

        @Override // com.huawei.hwfabengine.FloatingActionButtonAnimationListener
        public void onAnimationEnd() {
            if (HwFloatingActionButton.this.h != null) {
                HwFloatingActionButton.this.h.onAnimationEnd();
            }
        }

        @Override // com.huawei.hwfabengine.FloatingActionButtonAnimationListener
        public void onAnimationUpdate(float f) {
            if (HwFloatingActionButton.this.h != null) {
                HwFloatingActionButton.this.h.onAnimationUpdate(f);
            }
            HwFloatingActionButton.this.setAnimatorValue(f);
        }
    }

    public HwFloatingActionButton(Context context) {
        this(context, null);
    }

    public static HwFloatingActionButton c(Context context) {
        Object objC = xft.c(context, xft.b(context, HwFloatingActionButton.class, xft.d(context, 1, 1)), HwFloatingActionButton.class);
        if (objC instanceof HwFloatingActionButton) {
            return (HwFloatingActionButton) objC;
        }
        return null;
    }

    private HwTextView getLabelView() {
        if (getTag(R.id.hwfab_label) instanceof HwTextView) {
            return (HwTextView) getTag(R.id.hwfab_label);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnimatorValue(float f) {
        this.f = f;
        invalidate();
    }

    public String getTitle() {
        return this.g;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton, android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b(getParent());
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        c(canvas);
        super.onDraw(canvas);
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        if (this.i == null) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.i.b();
        } else if (action == 1 || action == 3) {
            this.i.e();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        c(z);
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        if (drawable2 instanceof nix) {
            ((nix) drawable2).a((FloatingActionButtonAnimationListener) null);
        }
        if (drawable instanceof nix) {
            nix nixVar = (nix) drawable;
            this.i = nixVar;
            this.h = nixVar.c();
            this.i.a(this.m);
        }
        super.setImageDrawable(drawable);
    }

    public void setShadowColors(int[] iArr) {
        if (iArr == null || iArr.length != this.d.length) {
            return;
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        this.d = iArrCopyOf;
        if (iArrCopyOf[0] == 0 || iArrCopyOf[1] == 0) {
            return;
        }
        this.e = true;
        a(iArrCopyOf);
    }

    public void setTitle(String str) {
        this.g = str;
        HwTextView labelView = getLabelView();
        if (labelView != null) {
            labelView.setText(this.g);
            labelView.setAutoTextInfo(9, 1, 2);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return this.f29493c == drawable || super.verifyDrawable(drawable);
    }

    public HwFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwFloatingActionButtonStyle);
    }

    public HwFloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(e(context, i), attributeSet, i);
        this.e = false;
        this.d = new int[]{0, 0};
        this.f29492b = new int[]{0, 0};
        this.f29491a = new int[]{0, 0};
        this.j = 0.0f;
        this.f = 1.0f;
        this.m = new d();
        a(super.getContext(), attributeSet, i);
    }

    private static Context e(Context context, int i) {
        return xfs.c(context, i, R.style.Theme_Emui_HwFloatingActionButton);
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwFloatingActionButton, i, R.style.Widget_Emui_HwFloatingActionButton);
        this.g = typedArrayObtainStyledAttributes.getString(R.styleable.HwFloatingActionButton_hwFabTitleString);
        e(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void e(TypedArray typedArray) {
        this.d[0] = typedArray.getColor(R.styleable.HwFloatingActionButton_hwFabShadowStartColor, 0);
        this.d[1] = typedArray.getColor(R.styleable.HwFloatingActionButton_hwFabShadowEndColor, 0);
        int[] iArr = this.d;
        if (iArr[0] == 0 || iArr[1] == 0) {
            return;
        }
        this.e = true;
        a(iArr);
        this.f29492b[0] = typedArray.getColor(R.styleable.HwFloatingActionButton_hwFabDisabledShadowStartColor, 0);
        this.f29492b[1] = typedArray.getColor(R.styleable.HwFloatingActionButton_hwFabDisabledShadowEndColor, 0);
    }

    private void a(int[] iArr) {
        int i = iArr[0];
        int[] iArr2 = this.f29491a;
        if (i == iArr2[0] || iArr[1] == iArr2[1]) {
            return;
        }
        this.f29493c = new xes(iArr, 4, 19);
        this.f29491a = Arrays.copyOf(iArr, iArr.length);
        int customSize = (int) ((getCustomSize() + 38) * this.f);
        this.f29493c.setBounds(new Rect(0, 0, customSize, customSize));
    }

    private void c(Canvas canvas) {
        int customSize;
        Bitmap bitmapE;
        int i;
        int i2;
        if (this.e && (bitmapE = e(this.f29493c, (customSize = (int) ((getCustomSize() + 38) * this.f)), customSize)) != null) {
            int width = getWidth() >> 1;
            int height = getHeight() >> 1;
            if (this.j != 0.0f) {
                canvas.translate(width, height);
                canvas.rotate(-this.j);
                i = width;
                i2 = height;
            } else {
                i = 0;
                i2 = 0;
            }
            float f = this.f;
            int i3 = (int) (((f - 1.0f) * customSize) / 2.0f);
            canvas.drawBitmap(bitmapE, ((0 - ((int) (f * 19.0f))) - i3) - i, (0 - i3) - i2, (Paint) null);
            float f2 = this.j;
            if (f2 != 0.0f) {
                canvas.rotate(f2);
                canvas.translate(-width, -height);
            }
        }
    }

    private Bitmap e(Drawable drawable, int i, int i2) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, i2, i);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    private void b(ViewParent viewParent) {
        if (viewParent != null && (viewParent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) viewParent;
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
    }

    private void c(boolean z) {
        if (this.e) {
            if (z) {
                a(this.d);
            } else {
                a(this.f29492b);
            }
        }
    }
}
