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
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.a1;
import androidx.appcompat.widget.f0;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements o.a, View.OnClickListener, ActionMenuView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f4659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f4660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f4661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h.b f4662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f4663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f4664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4666h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f4667i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4668j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f4669k;

    public class a extends f0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.f0
        public final q b() {
            b bVar = ActionMenuItemView.this.f4664f;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.f0
        public final boolean c() {
            q qVarB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            h.b bVar = actionMenuItemView.f4662d;
            return bVar != null && bVar.a(actionMenuItemView.f4659a) && (qVarB = b()) != null && qVarB.a();
        }
    }

    public static abstract class b {
        public abstract l a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        Resources resources = context.getResources();
        this.f4665g = c();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f80423c, i14, 0);
        this.f4667i = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f4669k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f4668j = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean a() {
        return !TextUtils.isEmpty(getText()) && this.f4659a.getIcon() == null;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean c() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i14 = configuration.screenWidthDp;
        int i15 = configuration.screenHeightDp;
        if (i14 < 480) {
            return (i14 >= 640 && i15 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void d() {
        boolean z14 = true;
        boolean z15 = !TextUtils.isEmpty(this.f4660b);
        if (this.f4661c != null && ((this.f4659a.f4797y & 4) != 4 || (!this.f4665g && !this.f4666h))) {
            z14 = false;
        }
        boolean z16 = z15 & z14;
        setText(z16 ? this.f4660b : null);
        CharSequence charSequence = this.f4659a.f4789q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z16 ? null : this.f4659a.f4777e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f4659a.f4790r;
        if (TextUtils.isEmpty(charSequence2)) {
            a1.a(this, z16 ? null : this.f4659a.f4777e);
        } else {
            a1.a(this, charSequence2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.o.a
    public j getItemData() {
        return this.f4659a;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public final void initialize(j jVar, int i14) {
        this.f4659a = jVar;
        setIcon(jVar.getIcon());
        setTitle(jVar.getTitleCondensed());
        setId(jVar.f4773a);
        setVisibility(jVar.isVisible() ? 0 : 8);
        setEnabled(jVar.isEnabled());
        if (jVar.hasSubMenu() && this.f4663e == null) {
            this.f4663e = new a();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        h.b bVar = this.f4662d;
        if (bVar != null) {
            bVar.a(this.f4659a);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f4665g = c();
        d();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i14, int i15) {
        int i16;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i16 = this.f4668j) >= 0) {
            super.setPadding(i16, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i14, i15);
        int mode = View.MeasureSpec.getMode(i14);
        int size = View.MeasureSpec.getSize(i14);
        int measuredWidth = getMeasuredWidth();
        int i17 = this.f4667i;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i17) : i17;
        if (mode != 1073741824 && i17 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i15);
        }
        if (!zIsEmpty || this.f4661c == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f4661c.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.f4659a.hasSubMenu() && (aVar = this.f4663e) != null && aVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z14) {
    }

    public void setChecked(boolean z14) {
    }

    public void setExpandedFormat(boolean z14) {
        if (this.f4666h != z14) {
            this.f4666h = z14;
            j jVar = this.f4659a;
            if (jVar != null) {
                jVar.f4786n.onItemActionRequestChanged(jVar);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f4661c = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i14 = this.f4669k;
            if (intrinsicWidth > i14) {
                intrinsicHeight = (int) (intrinsicHeight * (i14 / intrinsicWidth));
                intrinsicWidth = i14;
            }
            if (intrinsicHeight > i14) {
                intrinsicWidth = (int) (intrinsicWidth * (i14 / intrinsicHeight));
            } else {
                i14 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i14);
        }
        setCompoundDrawables(drawable, null, null, null);
        d();
    }

    public void setItemInvoker(h.b bVar) {
        this.f4662d = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i14, int i15, int i16, int i17) {
        this.f4668j = i14;
        super.setPadding(i14, i15, i16, i17);
    }

    public void setPopupCallback(b bVar) {
        this.f4664f = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f4660b = charSequence;
        d();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }
}
