package miuix.popupwidget.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.c;
import defpackage.alb;
import defpackage.cti;
import defpackage.dyq;
import defpackage.fwi;
import defpackage.hmi;
import miuix.view.HapticCompat;

/* JADX INFO: loaded from: classes3.dex */
public class GuidePopupWindow extends ArrowPopupWindow {
    public LinearLayout g;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f26784k;
    public Runnable l;

    public class a extends androidx.core.view.a {
        public a() {
        }

        public final boolean a(AccessibilityEvent accessibilityEvent) {
            int eventType = accessibilityEvent.getEventType();
            return eventType == 256 || eventType == 65536;
        }

        @Override // androidx.core.view.a
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            boolean zDispatchPopulateAccessibilityEvent = super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            if (a(accessibilityEvent)) {
                GuidePopupWindow.this.a(true);
            }
            return zDispatchPopulateAccessibilityEvent;
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            if (a(accessibilityEvent)) {
                GuidePopupWindow.this.a(true);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GuidePopupWindow.this.a(true);
        }
    }

    public GuidePopupWindow(Context context) {
        super(context);
        this.j = 0;
        this.l = new b();
    }

    @Override // miuix.popupwidget.widget.ArrowPopupWindow
    public void j() {
        super.j();
        this.h = 5000;
        setFocusable(true);
        LinearLayout linearLayout = (LinearLayout) h().inflate(fwi.c, (ViewGroup) null, false);
        this.g = linearLayout;
        setContentView(linearLayout);
        this.f26773a.z(false);
        u();
    }

    @Override // miuix.popupwidget.widget.ArrowPopupWindow
    public void s(View view, int i, int i2) {
        if (this.f26784k) {
            x(view);
        } else {
            super.s(view, i, i2);
        }
    }

    public final boolean t() {
        return b() == 32 || b() == 64;
    }

    public final void u() {
        this.g.setImportantForAccessibility(1);
        this.g.setFocusableInTouchMode(true);
        c.r0(this.g, new a());
    }

    public void v(View view, int i, int i2, boolean z) {
        l(z);
        s(view, i, i2);
        if (z) {
            this.f26773a.postDelayed(this.l, this.h);
        }
        if (HapticCompat.c("2.0")) {
            return;
        }
        HapticCompat.performHapticFeedback(view, alb.o);
    }

    public void w(View view, boolean z) {
        v(view, 0, 0, z);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x012d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0134  */
    /* JADX WARN: Code duplicated, block: B:39:0x013a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0141  */
    /* JADX WARN: Code duplicated, block: B:43:0x0150  */
    /* JADX WARN: Code duplicated, block: B:44:0x015c  */
    public final void x(View view) {
        int measuredHeight;
        DisplayMetrics displayMetrics;
        FrameLayout.LayoutParams layoutParams;
        int i;
        int i2;
        int i3;
        int i4;
        int popupElevation;
        int popupElevation2;
        int measuredHeight2;
        int i5;
        int i6;
        super.p(-2);
        super.q(-2);
        this.f26773a.setAnchor(view);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int measuredWidth = iArr[0];
        int i7 = iArr[1];
        int[] iArrC = this.f26773a.C(b());
        int dimensionPixelOffset = f().getResources().getDimensionPixelOffset(hmi.f20241k);
        int dimensionPixelOffset2 = f().getResources().getDimensionPixelOffset(hmi.m);
        int dimensionPixelOffset3 = f().getResources().getDimensionPixelOffset(hmi.f20240b);
        int dimensionPixelOffset4 = f().getResources().getDimensionPixelOffset(hmi.c);
        int dimensionPixelOffset5 = f().getResources().getDimensionPixelOffset(hmi.l);
        int iB = b();
        if (iB == 32) {
            int i8 = this.e;
            measuredWidth = (i8 == 1 || (i8 == 2 && dyq.e(view))) ? measuredWidth - (((dimensionPixelOffset3 + (dimensionPixelOffset * 2)) + this.j) + iArrC[1]) : measuredWidth + (view.getMeasuredWidth() - dimensionPixelOffset3);
            measuredHeight = (iArrC[0] - view.getMeasuredHeight()) / 2;
        } else {
            if (iB != 64) {
                switch (iB) {
                    case 8:
                        measuredWidth -= ((((dimensionPixelOffset3 * 2) + (dimensionPixelOffset * 2)) + this.j) - view.getMeasuredWidth()) / 2;
                        measuredHeight2 = view.getMeasuredHeight();
                        i7 += measuredHeight2 - dimensionPixelOffset4;
                        break;
                    case 9:
                    case 10:
                        measuredHeight2 = view.getMeasuredHeight();
                        i7 += measuredHeight2 - dimensionPixelOffset4;
                        break;
                    default:
                        switch (iB) {
                            case 16:
                                measuredWidth -= ((((dimensionPixelOffset3 * 2) + (dimensionPixelOffset * 2)) + this.j) - view.getMeasuredWidth()) / 2;
                                i5 = this.i;
                                i6 = iArrC[0];
                                break;
                            case 17:
                            case 18:
                                i5 = this.i;
                                i6 = iArrC[0];
                                break;
                        }
                        measuredHeight = i5 + i6 + dimensionPixelOffset4 + dimensionPixelOffset2;
                        break;
                }
                displayMetrics = f().getResources().getDisplayMetrics();
                LinearLayout linearLayout = (LinearLayout) this.f26773a.findViewById(cti.f14703a);
                layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
                i = displayMetrics.heightPixels;
                i2 = this.i;
                i3 = dimensionPixelOffset4 * 2;
                i4 = dimensionPixelOffset2 * 2;
                if (i >= (i2 * 5) + iArrC[0] + i3 + i4) {
                    layoutParams.setMargins(dimensionPixelOffset5, i2 * 2, dimensionPixelOffset5, i2 * 2);
                } else {
                    if (t()) {
                        popupElevation = this.f26773a.getPopupElevation();
                    } else {
                        popupElevation = this.f26773a.getPopupElevation() + iArrC[0];
                    }
                    if (t()) {
                        popupElevation2 = ((((displayMetrics.heightPixels - this.i) - iArrC[0]) - i3) - i4) / 2;
                    } else {
                        popupElevation2 = this.f26773a.getPopupElevation();
                    }
                    layoutParams.setMargins(dimensionPixelOffset5, popupElevation2, dimensionPixelOffset5, popupElevation);
                }
                linearLayout.setLayoutParams(layoutParams);
                showAtLocation(view, 8388659, measuredWidth - layoutParams.leftMargin, i7 - layoutParams.topMargin);
                this.f26773a.setAutoDismiss(c());
                this.f26773a.v();
            }
            int i9 = this.e;
            measuredWidth = (i9 == 1 || (i9 == 2 && dyq.e(view))) ? measuredWidth + (view.getMeasuredWidth() - dimensionPixelOffset3) : measuredWidth - (((dimensionPixelOffset3 + (dimensionPixelOffset * 2)) + this.j) + iArrC[1]);
            measuredHeight = (iArrC[0] - view.getMeasuredHeight()) / 2;
        }
        i7 -= measuredHeight;
        displayMetrics = f().getResources().getDisplayMetrics();
        LinearLayout linearLayout2 = (LinearLayout) this.f26773a.findViewById(cti.f14703a);
        layoutParams = (FrameLayout.LayoutParams) linearLayout2.getLayoutParams();
        i = displayMetrics.heightPixels;
        i2 = this.i;
        i3 = dimensionPixelOffset4 * 2;
        i4 = dimensionPixelOffset2 * 2;
        if (i >= (i2 * 5) + iArrC[0] + i3 + i4) {
            layoutParams.setMargins(dimensionPixelOffset5, i2 * 2, dimensionPixelOffset5, i2 * 2);
        } else {
            if (t()) {
                popupElevation = this.f26773a.getPopupElevation();
            } else {
                popupElevation = this.f26773a.getPopupElevation() + iArrC[0];
            }
            if (t()) {
                popupElevation2 = ((((displayMetrics.heightPixels - this.i) - iArrC[0]) - i3) - i4) / 2;
            } else {
                popupElevation2 = this.f26773a.getPopupElevation();
            }
            layoutParams.setMargins(dimensionPixelOffset5, popupElevation2, dimensionPixelOffset5, popupElevation);
        }
        linearLayout2.setLayoutParams(layoutParams);
        showAtLocation(view, 8388659, measuredWidth - layoutParams.leftMargin, i7 - layoutParams.topMargin);
        this.f26773a.setAutoDismiss(c());
        this.f26773a.v();
    }

    public GuidePopupWindow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = 0;
        this.l = new b();
    }

    public GuidePopupWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = 0;
        this.l = new b();
    }
}
