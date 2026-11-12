package miuix.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.core.view.c;
import defpackage.alb;
import defpackage.eii;
import defpackage.g7i;
import defpackage.k9h;
import defpackage.m80;
import defpackage.n5j;
import miuix.view.HapticCompat;

/* JADX INFO: loaded from: classes3.dex */
public class MultiChoicePreference extends BaseCheckBoxPreference implements Checkable {
    public boolean f;
    public k9h g;
    public View h;
    public String i;

    public class a extends androidx.core.view.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f26825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f26826b;

        public a(View view, View view2) {
            this.f26825a = view;
            this.f26826b = view2;
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
            super.onInitializeAccessibilityNodeInfo(view, m80Var);
            m80Var.j0(true);
            m80Var.g0(true);
            m80Var.h0(MultiChoicePreference.this.isChecked());
            m80Var.i0(CheckBox.class.getName());
            StringBuilder sb = new StringBuilder();
            View view2 = this.f26825a;
            if (view2 != null && view2.getVisibility() == 0) {
                View view3 = this.f26825a;
                if (view3 instanceof TextView) {
                    sb.append(((TextView) view3).getText());
                }
            }
            View view4 = this.f26826b;
            if (view4 != null && view4.getVisibility() == 0 && (this.f26826b instanceof TextView)) {
                if (sb.length() > 0) {
                    sb.append(" ");
                }
                sb.append(((TextView) this.f26826b).getText());
            }
            if (sb.length() > 0) {
                m80Var.m0(sb.toString());
            }
        }
    }

    public MultiChoicePreference(Context context) {
        this(context, null);
    }

    private void k(View view, View view2) {
        if (view != null) {
            view.setImportantForAccessibility(2);
        }
        if (view2 != null) {
            view2.setImportantForAccessibility(2);
        }
        c.r0(this.h, new a(view, view2));
    }

    private void l(CompoundButton compoundButton, boolean z) {
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
                animatedVectorDrawable.stop();
            }
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

    public void m(String str) {
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
            l((CompoundButton) viewFindViewById3, this.f);
            this.f = false;
        }
        if (b()) {
            if (viewFindViewById3 != null) {
                viewFindViewById3.setImportantForAccessibility(2);
            }
            k(viewFindViewById, viewFindViewById2);
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

    public MultiChoicePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eii.g);
    }

    public MultiChoicePreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MultiChoicePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n5j.J, i, i2);
        this.i = typedArrayObtainStyledAttributes.getString(n5j.K);
        typedArrayObtainStyledAttributes.recycle();
    }
}
