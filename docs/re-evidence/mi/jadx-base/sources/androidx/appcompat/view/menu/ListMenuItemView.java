package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import defpackage.cqi;
import defpackage.mwi;
import defpackage.qii;
import defpackage.xfp;
import defpackage.z5j;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ListMenuItemView extends LinearLayout implements MenuView.ItemView, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f1481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f1482b;
    public RadioButton c;
    public TextView d;
    public CheckBox e;
    public TextView f;
    public ImageView g;
    public ImageView h;
    public LinearLayout i;
    public Drawable j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1483k;
    public Context l;
    public boolean m;
    public Drawable n;
    public boolean o;
    public LayoutInflater p;
    public boolean q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, qii.G);
    }

    private LayoutInflater getInflater() {
        if (this.p == null) {
            this.p = LayoutInflater.from(getContext());
        }
        return this.p;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean a() {
        return false;
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.h.getLayoutParams();
        rect.top += this.h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final void b(View view) {
        c(view, -1);
    }

    public final void c(View view, int i) {
        LinearLayout linearLayout = this.i;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    public final void d() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(mwi.j, (ViewGroup) this, false);
        this.e = checkBox;
        b(checkBox);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void e(g gVar, int i) {
        this.f1481a = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    public final void f() {
        ImageView imageView = (ImageView) getInflater().inflate(mwi.f27293k, (ViewGroup) this, false);
        this.f1482b = imageView;
        c(imageView, 0);
    }

    public final void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(mwi.m, (ViewGroup) this, false);
        this.c = radioButton;
        b(radioButton);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public g getItemData() {
        return this.f1481a;
    }

    public void h(boolean z, char c) {
        int i = (z && this.f1481a.A()) ? 0 : 8;
        if (i == 0) {
            this.f.setText(this.f1481a.h());
        }
        if (this.f.getVisibility() != i) {
            this.f.setVisibility(i);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        androidx.core.view.c.v0(this, this.j);
        TextView textView = (TextView) findViewById(cqi.R);
        this.d = textView;
        int i = this.f1483k;
        if (i != -1) {
            textView.setTextAppearance(this.l, i);
        }
        this.f = (TextView) findViewById(cqi.K);
        ImageView imageView = (ImageView) findViewById(cqi.N);
        this.g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.n);
        }
        this.h = (ImageView) findViewById(cqi.u);
        this.i = (LinearLayout) findViewById(cqi.m);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f1482b != null && this.m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1482b.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.c == null && this.e == null) {
            return;
        }
        if (this.f1481a.m()) {
            if (this.c == null) {
                g();
            }
            compoundButton = this.c;
            view = this.e;
        } else {
            if (this.e == null) {
                d();
            }
            compoundButton = this.e;
            view = this.c;
        }
        if (z) {
            compoundButton.setChecked(this.f1481a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f1481a.m()) {
            if (this.c == null) {
                g();
            }
            compoundButton = this.c;
        } else {
            if (this.e == null) {
                d();
            }
            compoundButton = this.e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.q = z;
        this.m = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility((this.o || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f1481a.z() || this.q;
        if (z || this.m) {
            ImageView imageView = this.f1482b;
            if (imageView == null && drawable == null && !this.m) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.m) {
                this.f1482b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f1482b;
            if (!z) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f1482b.getVisibility() != 0) {
                this.f1482b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.d.getVisibility() != 8) {
                this.d.setVisibility(8);
            }
        } else {
            this.d.setText(charSequence);
            if (this.d.getVisibility() != 0) {
                this.d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        xfp xfpVarV = xfp.v(getContext(), attributeSet, z5j.d2, i, 0);
        this.j = xfpVarV.g(z5j.f2);
        this.f1483k = xfpVarV.n(z5j.e2, -1);
        this.m = xfpVarV.a(z5j.g2, false);
        this.l = context;
        this.n = xfpVarV.g(z5j.h2);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, qii.D, 0);
        this.o = typedArrayObtainStyledAttributes.hasValue(0);
        xfpVarV.w();
        typedArrayObtainStyledAttributes.recycle();
    }
}
