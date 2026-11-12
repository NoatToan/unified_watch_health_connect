package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.g1;
import androidx.core.view.h1;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0074a f5024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f5025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ActionMenuView f5026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f5027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g1 f5029f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5030g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5031h;

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    public class C0074a implements h1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f5032a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5033b;

        public C0074a() {
        }

        @Override // androidx.core.view.h1
        public final void a() {
            a.super.setVisibility(0);
            this.f5032a = false;
        }

        @Override // androidx.core.view.h1
        public final void onAnimationCancel() {
            this.f5032a = true;
        }

        @Override // androidx.core.view.h1
        public final void onAnimationEnd() {
            if (this.f5032a) {
                return;
            }
            a aVar = a.this;
            aVar.f5029f = null;
            a.super.setVisibility(this.f5033b);
        }
    }

    public a(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.f5024a = new C0074a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f5025b = context;
        } else {
            this.f5025b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int c(View view2, int i14, int i15) {
        view2.measure(View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE), i15);
        return Math.max(0, i14 - view2.getMeasuredWidth());
    }

    public static int d(int i14, int i15, int i16, View view2, boolean z14) {
        int measuredWidth = view2.getMeasuredWidth();
        int measuredHeight = view2.getMeasuredHeight();
        int iA = am.j.a(i16, measuredHeight, 2, i15);
        if (z14) {
            view2.layout(i14 - measuredWidth, iA, i14, measuredHeight + iA);
        } else {
            view2.layout(i14, iA, i14 + measuredWidth, measuredHeight + iA);
        }
        return z14 ? -measuredWidth : measuredWidth;
    }

    public final g1 e(int i14, long j8) {
        g1 g1Var = this.f5029f;
        if (g1Var != null) {
            g1Var.b();
        }
        C0074a c0074a = this.f5024a;
        if (i14 != 0) {
            g1 g1VarC = androidx.core.view.s0.c(this);
            g1VarC.a(0.0f);
            g1VarC.c(j8);
            a.this.f5029f = g1VarC;
            c0074a.f5033b = i14;
            g1VarC.d(c0074a);
            return g1VarC;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        g1 g1VarC2 = androidx.core.view.s0.c(this);
        g1VarC2.a(1.0f);
        g1VarC2.c(j8);
        a.this.f5029f = g1VarC2;
        c0074a.f5033b = i14;
        g1VarC2.d(c0074a);
        return g1VarC2;
    }

    public int getAnimatedVisibility() {
        return this.f5029f != null ? this.f5024a.f5033b : getVisibility();
    }

    public int getContentHeight() {
        return this.f5028e;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, h.a.f80421a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        c cVar = this.f5027d;
        if (cVar != null) {
            cVar.f5045q = m.a.a(cVar.f4710b).b();
            androidx.appcompat.view.menu.h hVar = cVar.f4711c;
            if (hVar != null) {
                hVar.onItemsChanged(true);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f5031h = false;
        }
        if (!this.f5031h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f5031h = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f5031h = false;
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f5030g = false;
        }
        if (!this.f5030g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f5030g = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f5030g = false;
        return true;
    }

    public void setContentHeight(int i14) {
        this.f5028e = i14;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i14) {
        if (i14 != getVisibility()) {
            g1 g1Var = this.f5029f;
            if (g1Var != null) {
                g1Var.b();
            }
            super.setVisibility(i14);
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context) {
        this(context, null);
    }
}
