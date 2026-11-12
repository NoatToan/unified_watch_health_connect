package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.SwitchCompat;
import defpackage.g7i;
import defpackage.mii;
import defpackage.p3j;
import defpackage.p5q;
import defpackage.vpi;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    private final a mListener;
    private CharSequence mSwitchOff;
    private CharSequence mSwitchOn;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (SwitchPreferenceCompat.this.callChangeListener(Boolean.valueOf(z))) {
                SwitchPreferenceCompat.this.setChecked(z);
            } else {
                compoundButton.setChecked(!z);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mListener = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p3j.d1, i, i2);
        setSummaryOn(p5q.o(typedArrayObtainStyledAttributes, p3j.l1, p3j.e1));
        setSummaryOff(p5q.o(typedArrayObtainStyledAttributes, p3j.k1, p3j.f1));
        setSwitchTextOn(p5q.o(typedArrayObtainStyledAttributes, p3j.n1, p3j.h1));
        setSwitchTextOff(p5q.o(typedArrayObtainStyledAttributes, p3j.m1, p3j.i1));
        setDisableDependentsState(p5q.b(typedArrayObtainStyledAttributes, p3j.j1, p3j.g1, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void syncSwitchView(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.mChecked);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.mSwitchOn);
            switchCompat.setTextOff(this.mSwitchOff);
            switchCompat.setOnCheckedChangeListener(this.mListener);
        }
    }

    private void syncViewIfAccessibilityEnabled(View view) {
        if (((AccessibilityManager) getContext().getSystemService("accessibility")).isEnabled()) {
            syncSwitchView(view.findViewById(vpi.i));
            syncSummaryView(view.findViewById(R.id.summary));
        }
    }

    public CharSequence getSwitchTextOff() {
        return this.mSwitchOff;
    }

    public CharSequence getSwitchTextOn() {
        return this.mSwitchOn;
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(g7i g7iVar) {
        super.onBindViewHolder(g7iVar);
        syncSwitchView(g7iVar.a(vpi.i));
        syncSummaryView(g7iVar);
    }

    @Override // androidx.preference.Preference
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void performClick(View view) {
        super.performClick(view);
        syncViewIfAccessibilityEnabled(view);
    }

    public void setSwitchTextOff(CharSequence charSequence) {
        this.mSwitchOff = charSequence;
        notifyChanged();
    }

    public void setSwitchTextOn(CharSequence charSequence) {
        this.mSwitchOn = charSequence;
        notifyChanged();
    }

    public void setSwitchTextOff(int i) {
        setSwitchTextOff(getContext().getString(i));
    }

    public void setSwitchTextOn(int i) {
        setSwitchTextOn(getContext().getString(i));
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, mii.l);
    }

    public SwitchPreferenceCompat(Context context) {
        this(context, null);
    }
}
