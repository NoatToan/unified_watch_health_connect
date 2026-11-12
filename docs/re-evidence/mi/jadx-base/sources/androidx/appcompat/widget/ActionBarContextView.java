package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.menu.e;
import androidx.core.view.c;
import defpackage.cqi;
import defpackage.eyq;
import defpackage.lwq;
import defpackage.mwi;
import defpackage.qii;
import defpackage.tz;
import defpackage.xfp;
import defpackage.z5j;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionBarContextView extends tz {
    public CharSequence i;
    public CharSequence j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f1524k;
    public View l;
    public View m;
    public LinearLayout n;
    public TextView o;
    public TextView p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1525r;
    public boolean s;
    public int t;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ActionMode f1526a;

        public a(ActionMode actionMode) {
            this.f1526a = actionMode;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f1526a.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    @Override // defpackage.tz
    public /* bridge */ /* synthetic */ lwq f(int i, long j) {
        return super.f(i, j);
    }

    public void g() {
        if (this.f1524k == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // defpackage.tz
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // defpackage.tz
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.j;
    }

    public CharSequence getTitle() {
        return this.i;
    }

    public void h(ActionMode actionMode) {
        View view = this.f1524k;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.t, (ViewGroup) this, false);
            this.f1524k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f1524k);
        }
        View viewFindViewById = this.f1524k.findViewById(cqi.i);
        this.l = viewFindViewById;
        viewFindViewById.setOnClickListener(new a(actionMode));
        e eVar = (e) actionMode.e();
        ActionMenuPresenter actionMenuPresenter = this.d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.x();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.d = actionMenuPresenter2;
        actionMenuPresenter2.I(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.c(this.d, this.f35193b);
        ActionMenuView actionMenuView = (ActionMenuView) this.d.n(this);
        this.c = actionMenuView;
        c.v0(actionMenuView, null);
        addView(this.c, layoutParams);
    }

    public final void i() {
        if (this.n == null) {
            LayoutInflater.from(getContext()).inflate(mwi.f27291a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.n = linearLayout;
            this.o = (TextView) linearLayout.findViewById(cqi.e);
            this.p = (TextView) this.n.findViewById(cqi.d);
            if (this.q != 0) {
                this.o.setTextAppearance(getContext(), this.q);
            }
            if (this.f1525r != 0) {
                this.p.setTextAppearance(getContext(), this.f1525r);
            }
        }
        this.o.setText(this.i);
        this.p.setText(this.j);
        boolean z = !TextUtils.isEmpty(this.i);
        boolean z2 = !TextUtils.isEmpty(this.j);
        this.p.setVisibility(z2 ? 0 : 8);
        this.n.setVisibility((z || z2) ? 0 : 8);
        if (this.n.getParent() == null) {
            addView(this.n);
        }
    }

    public boolean j() {
        return this.s;
    }

    public void k() {
        removeAllViews();
        this.m = null;
        this.c = null;
        this.d = null;
        View view = this.l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        ActionMenuPresenter actionMenuPresenter = this.d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.J();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.A();
            this.d.B();
        }
    }

    @Override // defpackage.tz, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean zB = eyq.b(this);
        int paddingRight = zB ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1524k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1524k.getLayoutParams();
            int i5 = zB ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = zB ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iD = tz.d(paddingRight, i5, zB);
            paddingRight = tz.d(iD + e(this.f1524k, iD, paddingTop, paddingTop2, zB), i6, zB);
        }
        int iE = paddingRight;
        LinearLayout linearLayout = this.n;
        if (linearLayout != null && this.m == null && linearLayout.getVisibility() != 8) {
            iE += e(this.n, iE, paddingTop, paddingTop2, zB);
        }
        int i7 = iE;
        View view2 = this.m;
        if (view2 != null) {
            e(view2, i7, paddingTop, paddingTop2, zB);
        }
        int paddingLeft = zB ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zB);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f1524k;
        if (view != null) {
            int iC = c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1524k.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.c, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.n;
        if (linearLayout != null && this.m == null) {
            if (this.s) {
                this.n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.n.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.n.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // defpackage.tz, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // defpackage.tz
    public void setContentHeight(int i) {
        this.e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.m;
        if (view2 != null) {
            removeView(view2);
        }
        this.m = view;
        if (view != null && (linearLayout = this.n) != null) {
            removeView(linearLayout);
            this.n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.j = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        i();
        c.u0(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.s) {
            requestLayout();
        }
        this.s = z;
    }

    @Override // defpackage.tz, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, qii.f31550k);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        xfp xfpVarV = xfp.v(context, attributeSet, z5j.y, i, 0);
        c.v0(this, xfpVarV.g(z5j.z));
        this.q = xfpVarV.n(z5j.D, 0);
        this.f1525r = xfpVarV.n(z5j.C, 0);
        this.e = xfpVarV.m(z5j.B, 0);
        this.t = xfpVarV.n(z5j.A, mwi.d);
        xfpVarV.w();
    }
}
