package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.annotation.RestrictTo;
import defpackage.g7i;
import defpackage.mii;
import defpackage.p3j;
import defpackage.p5q;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f2753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f2754b;
    public CharSequence c;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (SwitchPreference.this.callChangeListener(Boolean.valueOf(z))) {
                SwitchPreference.this.setChecked(z);
            } else {
                compoundButton.setChecked(!z);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f2753a = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p3j.S0, i, i2);
        setSummaryOn(p5q.o(typedArrayObtainStyledAttributes, p3j.a1, p3j.T0));
        setSummaryOff(p5q.o(typedArrayObtainStyledAttributes, p3j.Z0, p3j.U0));
        setSwitchTextOn(p5q.o(typedArrayObtainStyledAttributes, p3j.c1, p3j.W0));
        setSwitchTextOff(p5q.o(typedArrayObtainStyledAttributes, p3j.b1, p3j.X0));
        setDisableDependentsState(p5q.b(typedArrayObtainStyledAttributes, p3j.Y0, p3j.V0, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void syncSwitchView(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.mChecked);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.f2754b);
            r4.setTextOff(this.c);
            r4.setOnCheckedChangeListener(this.f2753a);
        }
    }

    private void syncViewIfAccessibilityEnabled(View view) {
        if (((AccessibilityManager) getContext().getSystemService("accessibility")).isEnabled()) {
            syncSwitchView(view.findViewById(R.id.switch_widget));
            syncSummaryView(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(g7i g7iVar) {
        super.onBindViewHolder(g7iVar);
        syncSwitchView(g7iVar.a(R.id.switch_widget));
        syncSummaryView(g7iVar);
    }

    @Override // androidx.preference.Preference
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void performClick(View view) {
        super.performClick(view);
        syncViewIfAccessibilityEnabled(view);
    }

    public void setSwitchTextOff(CharSequence charSequence) {
        this.c = charSequence;
        notifyChanged();
    }

    public void setSwitchTextOn(CharSequence charSequence) {
        this.f2754b = charSequence;
        notifyChanged();
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p5q.a(context, mii.m, R.attr.switchPreferenceStyle));
    }

    public SwitchPreference(Context context) {
        this(context, null);
    }
}
