package miuix.appcompat.internal.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRadioButton;
import defpackage.awi;
import defpackage.g5j;
import defpackage.vsi;

/* JADX INFO: loaded from: classes3.dex */
public class ListMenuItemView extends LinearLayout implements i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f26494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AppCompatImageView f26495b;
    public AppCompatRadioButton c;
    public TextView d;
    public AppCompatCheckBox e;
    public TextView f;
    public View g;
    public Drawable h;
    public int i;
    public Context j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f26496k;
    public Context l;
    public LayoutInflater m;
    public boolean n;

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.l = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g5j.A1, i, 0);
        this.h = typedArrayObtainStyledAttributes.getDrawable(g5j.C1);
        this.i = typedArrayObtainStyledAttributes.getResourceId(g5j.B1, -1);
        this.f26496k = typedArrayObtainStyledAttributes.getBoolean(g5j.D1, false);
        this.j = context;
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.m == null) {
            this.m = LayoutInflater.from(this.l);
        }
        return this.m;
    }

    @Override // miuix.appcompat.internal.view.menu.i.a
    public boolean a() {
        return false;
    }

    @Override // miuix.appcompat.internal.view.menu.i.a
    public void b(f fVar, int i) {
        this.f26494a = fVar;
        setVisibility(fVar.isVisible() ? 0 : 8);
        setTitle(fVar.h(this));
        setCheckable(fVar.isCheckable());
        f(fVar.D(), fVar.e());
        setIcon(fVar.getIcon());
        setEnabled(fVar.isEnabled());
    }

    public final void c() {
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) getInflater().inflate(awi.A, (ViewGroup) this, false);
        this.e = appCompatCheckBox;
        addView(appCompatCheckBox);
    }

    public final void d() {
        AppCompatImageView appCompatImageView = (AppCompatImageView) getInflater().inflate(awi.B, (ViewGroup) this, false);
        this.f26495b = appCompatImageView;
        addView(appCompatImageView, 0);
    }

    public final void e() {
        AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) getInflater().inflate(awi.C, (ViewGroup) this, false);
        this.c = appCompatRadioButton;
        addView(appCompatRadioButton, 0);
    }

    public void f(boolean z, char c) {
        int i = (z && this.f26494a.D()) ? 0 : 8;
        if (i == 0) {
            this.f.setText(this.f26494a.f());
        }
        if (this.f.getVisibility() != i) {
            this.f.setVisibility(i);
        }
    }

    @Override // miuix.appcompat.internal.view.menu.i.a
    public f getItemData() {
        return this.f26494a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.h);
        TextView textView = (TextView) findViewById(vsi.o0);
        this.d = textView;
        int i = this.i;
        if (i != -1) {
            textView.setTextAppearance(this.j, i);
        }
        this.f = (TextView) findViewById(vsi.d0);
        this.g = getChildAt(0);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f26495b != null && this.f26496k) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f26495b.getLayoutParams();
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
        if (this.f26494a.n()) {
            if (this.c == null) {
                e();
            }
            compoundButton = this.c;
            view = this.e;
        } else {
            if (this.e == null) {
                c();
            }
            compoundButton = this.e;
            view = this.c;
        }
        if (z) {
            compoundButton.setChecked(this.f26494a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        AppCompatCheckBox appCompatCheckBox = this.e;
        if (appCompatCheckBox != null) {
            appCompatCheckBox.setVisibility(8);
        }
        AppCompatRadioButton appCompatRadioButton = this.c;
        if (appCompatRadioButton != null) {
            appCompatRadioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f26494a.n()) {
            if (this.c == null) {
                e();
            }
            compoundButton = this.c;
        } else {
            if (this.e == null) {
                c();
            }
            compoundButton = this.e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.n = z;
        this.f26496k = z;
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f26494a.C() || this.n;
        if (z || this.f26496k) {
            AppCompatImageView appCompatImageView = this.f26495b;
            if (appCompatImageView == null && drawable == null && !this.f26496k) {
                return;
            }
            if (appCompatImageView == null) {
                d();
            }
            if (drawable == null && !this.f26496k) {
                this.f26495b.setVisibility(8);
                return;
            }
            AppCompatImageView appCompatImageView2 = this.f26495b;
            if (!z) {
                drawable = null;
            }
            appCompatImageView2.setImageDrawable(drawable);
            if (this.f26495b.getVisibility() != 0) {
                this.f26495b.setVisibility(0);
            }
        }
    }

    @Override // miuix.appcompat.internal.view.menu.i.a
    public void setItemInvoker(d.c cVar) {
        throw new UnsupportedOperationException();
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

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
