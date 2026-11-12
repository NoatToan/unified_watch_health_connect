package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.g1;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TypedValue f4951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TypedValue f4952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f4953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TypedValue f4954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TypedValue f4955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TypedValue f4956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f4957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f4958h;

    public interface a {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.f4957g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f4955e == null) {
            this.f4955e = new TypedValue();
        }
        return this.f4955e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f4956f == null) {
            this.f4956f = new TypedValue();
        }
        return this.f4956f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f4953c == null) {
            this.f4953c = new TypedValue();
        }
        return this.f4953c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f4954d == null) {
            this.f4954d = new TypedValue();
        }
        return this.f4954d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f4951a == null) {
            this.f4951a = new TypedValue();
        }
        return this.f4951a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f4952b == null) {
            this.f4952b = new TypedValue();
        }
        return this.f4952b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f4958h;
        if (aVar != null) {
            aVar.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f4958h;
        if (aVar != null) {
            i.f fVar = ((i.h) aVar).f86634a;
            a0 a0Var = fVar.f86590r;
            if (a0Var != null) {
                a0Var.i();
            }
            if (fVar.f86595y != null) {
                fVar.f86584l.getDecorView().removeCallbacks(fVar.f86596z);
                if (fVar.f86595y.isShowing()) {
                    try {
                        fVar.f86595y.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                fVar.f86595y = null;
            }
            g1 g1Var = fVar.A;
            if (g1Var != null) {
                g1Var.b();
            }
            androidx.appcompat.view.menu.h hVar = fVar.Q(0).f86623h;
            if (hVar != null) {
                hVar.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i14, int i15) {
        int iMakeMeasureSpec;
        boolean z14;
        int iMakeMeasureSpec2;
        int i16;
        int i17;
        float fraction;
        int i18;
        int i19;
        float fraction2;
        int i24;
        int i25;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z15 = true;
        boolean z16 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i14);
        int mode2 = View.MeasureSpec.getMode(i15);
        Rect rect = this.f4957g;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i14;
            z14 = false;
        } else {
            TypedValue typedValue = z16 ? this.f4954d : this.f4953c;
            if (typedValue == null || (i24 = typedValue.type) == 0) {
                iMakeMeasureSpec = i14;
                z14 = false;
            } else {
                if (i24 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i24 == 6) {
                        int i26 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i26, i26);
                    } else {
                        i25 = 0;
                    }
                    if (i25 > 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i25 - (rect.left + rect.right), View.MeasureSpec.getSize(i14)), 1073741824);
                        z14 = true;
                    } else {
                        iMakeMeasureSpec = i14;
                        z14 = false;
                    }
                }
                i25 = (int) fraction3;
                if (i25 > 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i25 - (rect.left + rect.right), View.MeasureSpec.getSize(i14)), 1073741824);
                    z14 = true;
                } else {
                    iMakeMeasureSpec = i14;
                    z14 = false;
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i15;
        } else {
            TypedValue typedValue2 = z16 ? this.f4955e : this.f4956f;
            if (typedValue2 == null || (i18 = typedValue2.type) == 0) {
                iMakeMeasureSpec2 = i15;
            } else {
                if (i18 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i18 == 6) {
                        int i27 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i27, i27);
                    } else {
                        i19 = 0;
                    }
                    if (i19 > 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i19 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i15)), 1073741824);
                    } else {
                        iMakeMeasureSpec2 = i15;
                    }
                }
                i19 = (int) fraction2;
                if (i19 > 0) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i19 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i15)), 1073741824);
                } else {
                    iMakeMeasureSpec2 = i15;
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z14 || mode != Integer.MIN_VALUE) {
            z15 = false;
        } else {
            TypedValue typedValue3 = z16 ? this.f4952b : this.f4951a;
            if (typedValue3 == null || (i16 = typedValue3.type) == 0) {
                z15 = false;
            } else {
                if (i16 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i16 == 6) {
                        int i28 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i28, i28);
                    } else {
                        i17 = 0;
                    }
                    if (i17 > 0) {
                        i17 -= rect.left + rect.right;
                    }
                    if (measuredWidth < i17) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i17, 1073741824);
                    } else {
                        z15 = false;
                    }
                }
                i17 = (int) fraction;
                if (i17 > 0) {
                    i17 -= rect.left + rect.right;
                }
                if (measuredWidth < i17) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i17, 1073741824);
                } else {
                    z15 = false;
                }
            }
        }
        if (z15) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    public void setAttachListener(a aVar) {
        this.f4958h = aVar;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }
}
