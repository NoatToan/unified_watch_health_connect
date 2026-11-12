package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f4857i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f4858j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f4859k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f4860l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f4861m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinearLayout f4862n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f4863o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f4864p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f4865q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f4866r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4867t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f4868v;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m.b f4869a;

        public a(ActionBarContextView actionBarContextView, m.b bVar) {
            this.f4869a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            this.f4869a.a();
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        w0 w0VarG = w0.g(context, attributeSet, h.a.f80424d, i14, 0);
        setBackground(w0VarG.b(0));
        TypedArray typedArray = w0VarG.f5271b;
        this.f4865q = typedArray.getResourceId(5, 0);
        this.f4866r = typedArray.getResourceId(4, 0);
        this.f5028e = typedArray.getLayoutDimension(3, 0);
        this.f4868v = typedArray.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        w0VarG.h();
    }

    public final void f(m.b bVar) {
        View view2 = this.f4859k;
        if (view2 == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f4868v, (ViewGroup) this, false);
            this.f4859k = viewInflate;
            addView(viewInflate);
        } else if (view2.getParent() == null) {
            addView(this.f4859k);
        }
        View viewFindViewById = this.f4859k.findViewById(R.id.action_mode_close_button);
        this.f4860l = viewFindViewById;
        viewFindViewById.setOnClickListener(new a(this, bVar));
        androidx.appcompat.view.menu.h hVarC = bVar.c();
        c cVar = this.f5027d;
        if (cVar != null) {
            cVar.e();
            c.a aVar = cVar.f5049w;
            if (aVar != null && aVar.b()) {
                aVar.f4820j.dismiss();
            }
        }
        c cVar2 = new c(getContext());
        this.f5027d = cVar2;
        cVar2.f5041m = true;
        cVar2.f5042n = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        hVarC.addMenuPresenter(this.f5027d, this.f5025b);
        c cVar3 = this.f5027d;
        androidx.appcompat.view.menu.o oVar = cVar3.f4716h;
        if (oVar == null) {
            androidx.appcompat.view.menu.o oVar2 = (androidx.appcompat.view.menu.o) cVar3.f4712d.inflate(cVar3.f4714f, (ViewGroup) this, false);
            cVar3.f4716h = oVar2;
            oVar2.initialize(cVar3.f4711c);
            cVar3.updateMenuView(true);
        }
        androidx.appcompat.view.menu.o oVar3 = cVar3.f4716h;
        if (oVar != oVar3) {
            ((ActionMenuView) oVar3).setPresenter(cVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) oVar3;
        this.f5026c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f5026c, layoutParams);
    }

    public final void g() {
        if (this.f4862n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f4862n = linearLayout;
            this.f4863o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f4864p = (TextView) this.f4862n.findViewById(R.id.action_bar_subtitle);
            int i14 = this.f4865q;
            if (i14 != 0) {
                this.f4863o.setTextAppearance(getContext(), i14);
            }
            int i15 = this.f4866r;
            if (i15 != 0) {
                this.f4864p.setTextAppearance(getContext(), i15);
            }
        }
        this.f4863o.setText(this.f4857i);
        this.f4864p.setText(this.f4858j);
        boolean zIsEmpty = TextUtils.isEmpty(this.f4857i);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f4858j);
        this.f4864p.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f4862n.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f4862n.getParent() == null) {
            addView(this.f4862n);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f4858j;
    }

    public CharSequence getTitle() {
        return this.f4857i;
    }

    public final void h() {
        removeAllViews();
        this.f4861m = null;
        this.f5026c = null;
        this.f5027d = null;
        View view2 = this.f4860l;
        if (view2 != null) {
            view2.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f5027d;
        if (cVar != null) {
            cVar.e();
            c.a aVar = this.f5027d.f5049w;
            if (aVar == null || !aVar.b()) {
                return;
            }
            aVar.f4820j.dismiss();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        boolean z15 = getLayoutDirection() == 1;
        int paddingRight = z15 ? (i16 - i14) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i17 - i15) - getPaddingTop()) - getPaddingBottom();
        View view2 = this.f4859k;
        if (view2 != null && view2.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4859k.getLayoutParams();
            int i18 = z15 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i19 = z15 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i24 = z15 ? paddingRight - i18 : paddingRight + i18;
            int iD = androidx.appcompat.widget.a.d(i24, paddingTop, paddingTop2, this.f4859k, z15) + i24;
            paddingRight = z15 ? iD - i19 : iD + i19;
        }
        LinearLayout linearLayout = this.f4862n;
        if (linearLayout != null && this.f4861m == null && linearLayout.getVisibility() != 8) {
            paddingRight += androidx.appcompat.widget.a.d(paddingRight, paddingTop, paddingTop2, this.f4862n, z15);
        }
        View view3 = this.f4861m;
        if (view3 != null) {
            androidx.appcompat.widget.a.d(paddingRight, paddingTop, paddingTop2, view3, z15);
        }
        int paddingLeft = z15 ? getPaddingLeft() : (i16 - i14) - getPaddingRight();
        ActionMenuView actionMenuView = this.f5026c;
        if (actionMenuView != null) {
            androidx.appcompat.widget.a.d(paddingLeft, paddingTop, paddingTop2, actionMenuView, !z15);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i14, int i15) {
        if (View.MeasureSpec.getMode(i14) != 1073741824) {
            vb.h.z(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i15) == 0) {
            vb.h.z(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i14);
        int size2 = this.f5028e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i15);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view2 = this.f4859k;
        if (view2 != null) {
            int iC = androidx.appcompat.widget.a.c(view2, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4859k.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f5026c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = androidx.appcompat.widget.a.c(this.f5026c, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f4862n;
        if (linearLayout != null && this.f4861m == null) {
            if (this.f4867t) {
                this.f4862n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f4862n.getMeasuredWidth();
                boolean z14 = measuredWidth <= paddingLeft;
                if (z14) {
                    paddingLeft -= measuredWidth;
                }
                this.f4862n.setVisibility(z14 ? 0 : 8);
            } else {
                paddingLeft = androidx.appcompat.widget.a.c(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view3 = this.f4861m;
        if (view3 != null) {
            ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
            int i16 = layoutParams.width;
            int i17 = i16 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i16 >= 0) {
                paddingLeft = Math.min(i16, paddingLeft);
            }
            int i18 = layoutParams.height;
            int i19 = i18 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i18 >= 0) {
                iMin = Math.min(i18, iMin);
            }
            this.f4861m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i17), View.MeasureSpec.makeMeasureSpec(iMin, i19));
        }
        if (this.f5028e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i24 = 0;
        for (int i25 = 0; i25 < childCount; i25++) {
            int measuredHeight = getChildAt(i25).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i24) {
                i24 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i24);
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i14) {
        this.f5028e = i14;
    }

    public void setCustomView(View view2) {
        LinearLayout linearLayout;
        View view3 = this.f4861m;
        if (view3 != null) {
            removeView(view3);
        }
        this.f4861m = view2;
        if (view2 != null && (linearLayout = this.f4862n) != null) {
            removeView(linearLayout);
            this.f4862n = null;
        }
        if (view2 != null) {
            addView(view2);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f4858j = charSequence;
        g();
    }

    public void setTitle(CharSequence charSequence) {
        this.f4857i = charSequence;
        g();
        androidx.core.view.s0.s(this, charSequence);
    }

    public void setTitleOptional(boolean z14) {
        if (z14 != this.f4867t) {
            requestLayout();
        }
        this.f4867t = z14;
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i14) {
        super.setVisibility(i14);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }
}
