package miuix.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.core.view.c;
import defpackage.alb;
import defpackage.bpi;
import defpackage.daj;
import defpackage.eii;
import defpackage.g7i;
import defpackage.hm1;
import defpackage.imi;
import defpackage.jrk;
import defpackage.k9h;
import defpackage.m80;
import defpackage.n5j;
import defpackage.pwk;
import defpackage.q6i;
import defpackage.qz9;
import defpackage.zhi;
import miuix.view.HapticCompat;

/* JADX INFO: loaded from: classes3.dex */
public class SingleChoicePreference extends BaseCheckBoxPreference implements Checkable, qz9, q6i {
    public boolean f;
    public k9h g;
    public View h;
    public String i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Context f26849k;
    public int l;
    public Runnable m;
    public CompoundButton n;

    public class a extends androidx.core.view.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f26850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f26851b;

        public a(View view, View view2) {
            this.f26850a = view;
            this.f26851b = view2;
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
            super.onInitializeAccessibilityNodeInfo(view, m80Var);
            m80Var.g0(true);
            m80Var.h0(SingleChoicePreference.this.isChecked());
            StringBuilder sb = new StringBuilder();
            View view2 = this.f26850a;
            if (view2 instanceof TextView) {
                view2.setImportantForAccessibility(2);
                sb.append(((TextView) this.f26850a).getText());
            }
            View view3 = this.f26851b;
            if (view3 instanceof TextView) {
                view3.setImportantForAccessibility(2);
                if (sb.length() > 0) {
                    sb.append(" ");
                }
                sb.append(((TextView) this.f26851b).getText());
            }
            if (sb.length() > 0) {
                m80Var.m0(sb.toString());
            }
            m80Var.i0(RadioButton.class.getName());
            m80Var.j0(true ^ SingleChoicePreference.this.isChecked());
            if (SingleChoicePreference.this.isChecked()) {
                m80Var.a0(m80.a.i);
            }
        }
    }

    public SingleChoicePreference(Context context) {
        this(context, null);
    }

    @Override // miuix.preference.BaseCheckBoxPreference, defpackage.qz9
    public boolean a() {
        return k() || this.j;
    }

    @Override // defpackage.q6i
    public void c(g7i g7iVar, int i) {
        if (this.j) {
            return;
        }
        int dimension = ((int) this.f26849k.getResources().getDimension(imi.g)) + i;
        ((LayerDrawable) this.h.getBackground()).setLayerInset(0, dimension, 0, dimension, 0);
        Drawable foreground = this.h.getForeground();
        if (foreground instanceof LayerDrawable) {
            ((LayerDrawable) foreground).setLayerInset(0, dimension, 0, dimension, 0);
        }
    }

    @Override // androidx.preference.Preference
    public boolean callChangeListener(Object obj) {
        k9h k9hVar = this.g;
        boolean z = (k9hVar == null || k9hVar.b(this, obj)) && super.callChangeListener(obj);
        if (!z && this.f) {
            this.f = false;
        }
        return z;
    }

    public String i() {
        return this.i;
    }

    public final boolean k() {
        return -1 == this.l;
    }

    public final void l(View view, View view2) {
        c.r0(this.h, new a(view, view2));
    }

    public final void m(CompoundButton compoundButton, boolean z) {
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable instanceof StateListDrawable) {
            Drawable current = buttonDrawable.getCurrent();
            if (current instanceof AnimatedVectorDrawable) {
                AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) current;
                if (z) {
                    if (animatedVectorDrawable.isRunning()) {
                        animatedVectorDrawable.stop();
                        animatedVectorDrawable.reset();
                    }
                    animatedVectorDrawable.start();
                    return;
                }
                if (animatedVectorDrawable.isRunning()) {
                    return;
                }
                animatedVectorDrawable.start();
                daj dajVar = new daj(animatedVectorDrawable);
                this.m = dajVar;
                compoundButton.post(dajVar);
            }
        }
    }

    public void n(String str) {
        this.i = str;
    }

    @Override // androidx.preference.Preference
    public void notifyChanged() {
        super.notifyChanged();
        k9h k9hVar = this.g;
        if (k9hVar != null) {
            k9hVar.a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.preference.BaseCheckBoxPreference, androidx.preference.CheckBoxPreference, androidx.preference.Preference
    public void onBindViewHolder(g7i g7iVar) {
        super.onBindViewHolder(g7iVar);
        View view = g7iVar.itemView;
        this.h = view;
        if (!k() && !this.j) {
            Context context = getContext();
            int i = hm1.d(getContext(), zhi.F, true) ? bpi.c : bpi.f4460b;
            Drawable drawableF = jrk.f(context.getResources(), bpi.f4459a, context.getTheme());
            Drawable drawableF2 = jrk.f(context.getResources(), i, context.getTheme());
            view.setBackground(drawableF);
            view.setForeground(drawableF2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.h.getLayoutParams();
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, 0, marginLayoutParams.rightMargin, (int) (context.getResources().getDisplayMetrics().density * 12.0f));
        }
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById instanceof Checkable) {
            ((Checkable) viewFindViewById).setChecked(isChecked());
        }
        View viewFindViewById2 = view.findViewById(R.id.summary);
        if (viewFindViewById2 instanceof Checkable) {
            ((Checkable) viewFindViewById2).setChecked(isChecked());
        }
        View viewFindViewById3 = view.findViewById(R.id.checkbox);
        if (viewFindViewById3 != null && (viewFindViewById3 instanceof CompoundButton) && isChecked()) {
            CompoundButton compoundButton = (CompoundButton) viewFindViewById3;
            this.n = compoundButton;
            m(compoundButton, this.f);
            this.f = false;
        }
        if (b()) {
            if (viewFindViewById3 != null) {
                viewFindViewById3.setImportantForAccessibility(2);
            }
            l(viewFindViewById, viewFindViewById2);
        }
    }

    @Override // androidx.preference.TwoStatePreference, androidx.preference.Preference
    public void onClick() {
        View view;
        this.f = true;
        super.onClick();
        if (!this.f || (view = this.h) == null) {
            return;
        }
        HapticCompat.performHapticFeedbackAsync(view, alb.A, alb.f);
    }

    @Override // androidx.preference.Preference
    public void onDetached() {
        super.onDetached();
        CompoundButton compoundButton = this.n;
        if (compoundButton != null) {
            compoundButton.removeCallbacks(this.m);
            this.n = null;
        }
        this.m = null;
    }

    @Override // androidx.preference.TwoStatePreference, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
    }

    public void setOnPreferenceChangeInternalListener(k9h k9hVar) {
        this.g = k9hVar;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    public SingleChoicePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eii.z);
    }

    public SingleChoicePreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SingleChoicePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f26849k = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n5j.J, i, i2);
        this.i = typedArrayObtainStyledAttributes.getString(n5j.K);
        boolean z = true;
        int iJ = hm1.j(context, eii.n, 1);
        this.l = iJ;
        if (iJ != 2 && (pwk.a() <= 1 || this.l != 1)) {
            z = false;
        }
        this.j = z;
        typedArrayObtainStyledAttributes.recycle();
    }
}
