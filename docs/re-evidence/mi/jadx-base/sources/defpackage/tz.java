package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class tz extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f35192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f35193b;
    public ActionMenuView c;
    public ActionMenuPresenter d;
    public int e;
    public lwq f;
    public boolean g;
    public boolean h;

    public class a implements nwq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f35194a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f35195b;

        public a() {
        }

        @Override // defpackage.nwq
        public void a(View view) {
            this.f35194a = true;
        }

        @Override // defpackage.nwq
        public void b(View view) {
            if (this.f35194a) {
                return;
            }
            tz tzVar = tz.this;
            tzVar.f = null;
            tz.super.setVisibility(this.f35195b);
        }

        @Override // defpackage.nwq
        public void c(View view) {
            tz.super.setVisibility(0);
            this.f35194a = false;
        }

        public a d(lwq lwqVar, int i) {
            tz.this.f = lwqVar;
            this.f35195b = i;
            return this;
        }
    }

    public tz(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int d(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public int c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    public int e(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public lwq f(int i, long j) {
        lwq lwqVar = this.f;
        if (lwqVar != null) {
            lwqVar.c();
        }
        if (i != 0) {
            lwq lwqVarB = c.e(this).b(0.0f);
            lwqVarB.f(j);
            lwqVarB.h(this.f35192a.d(lwqVarB, i));
            return lwqVarB;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        lwq lwqVarB2 = c.e(this).b(1.0f);
        lwqVarB2.f(j);
        lwqVarB2.h(this.f35192a.d(lwqVarB2, i));
        return lwqVarB2;
    }

    public int getAnimatedVisibility() {
        return this.f != null ? this.f35192a.f35195b : getVisibility();
    }

    public int getContentHeight() {
        return this.e;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, z5j.f40915a, qii.c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(z5j.j, 0));
        typedArrayObtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.E(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.h = false;
        }
        if (!this.h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = false;
        }
        if (!this.g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.e = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            lwq lwqVar = this.f;
            if (lwqVar != null) {
                lwqVar.c();
            }
            super.setVisibility(i);
        }
    }

    public tz(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35192a = new a();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(qii.f31548a, typedValue, true) && typedValue.resourceId != 0) {
            this.f35193b = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f35193b = context;
        }
    }
}
