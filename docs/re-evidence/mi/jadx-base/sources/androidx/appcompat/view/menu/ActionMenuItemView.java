package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.hbm;
import defpackage.q1a;
import defpackage.tip;
import defpackage.z5j;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionMenuItemView extends AppCompatTextView implements MenuView.ItemView, View.OnClickListener, ActionMenuView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f1476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f1477b;
    public Drawable c;
    public e.b d;
    public q1a e;
    public b f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1478k;

    public class a extends q1a {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // defpackage.q1a
        public hbm b() {
            b bVar = ActionMenuItemView.this.f;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // defpackage.q1a
        public boolean c() {
            hbm hbmVarB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.d;
            return bVar != null && bVar.f(actionMenuItemView.f1476a) && (hbmVarB = b()) != null && hbmVarB.isShowing();
        }
    }

    public static abstract class b {
        public abstract hbm a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean a() {
        return true;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return d();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean c() {
        return d() && this.f1476a.getIcon() == null;
    }

    public boolean d() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void e(g gVar, int i) {
        this.f1476a = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.e == null) {
            this.e = new a();
        }
    }

    public final boolean f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void g() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1477b);
        if (this.c != null && (!this.f1476a.B() || (!this.g && !this.h))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f1477b : null);
        CharSequence contentDescription = this.f1476a.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z3 ? null : this.f1476a.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f1476a.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            tip.a(this, z3 ? null : this.f1476a.getTitle());
        } else {
            tip.a(this, tooltipText);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public g getItemData() {
        return this.f1476a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.d;
        if (bVar != null) {
            bVar.f(this.f1476a);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.g = f();
        g();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean zD = d();
        if (zD && (i3 = this.j) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.i) : this.i;
        if (mode != 1073741824 && this.i > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (zD || this.c == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.c.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        q1a q1aVar;
        if (this.f1476a.hasSubMenu() && (q1aVar = this.e) != null && q1aVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.h != z) {
            this.h = z;
            g gVar = this.f1476a;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.c = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f1478k;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        g();
    }

    public void setItemInvoker(e.b bVar) {
        this.d = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.j = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(b bVar) {
        this.f = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1477b = charSequence;
        g();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.g = f();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z5j.v, i, 0);
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(z5j.w, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f1478k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.j = -1;
        setSaveEnabled(false);
    }
}
