package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import b7.j;
import bd.h;
import bd.i;

/* JADX INFO: loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    public final a P0;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            Boolean boolValueOf = Boolean.valueOf(z14);
            CheckBoxPreference checkBoxPreference = CheckBoxPreference.this;
            if (checkBoxPreference.a(boolValueOf)) {
                checkBoxPreference.E(z14);
            } else {
                compoundButton.setChecked(!z14);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14, i15);
        this.P0 = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f17508b, i14, i15);
        String string = typedArrayObtainStyledAttributes.getString(5);
        this.L0 = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        if (this.K0) {
            i();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(4);
        this.M0 = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        if (!this.K0) {
            i();
        }
        this.O0 = typedArrayObtainStyledAttributes.getBoolean(3, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G(View view2) {
        boolean z14 = view2 instanceof CompoundButton;
        if (z14) {
            ((CompoundButton) view2).setOnCheckedChangeListener(null);
        }
        if (view2 instanceof Checkable) {
            ((Checkable) view2).setChecked(this.K0);
        }
        if (z14) {
            ((CompoundButton) view2).setOnCheckedChangeListener(this.P0);
        }
    }

    @Override // androidx.preference.Preference
    public void m(h hVar) {
        super.m(hVar);
        G(hVar.d(R.id.checkbox));
        F(hVar.d(R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void t(View view2) {
        super.t(view2);
        if (((AccessibilityManager) this.f10147a.getSystemService("accessibility")).isEnabled()) {
            G(view2.findViewById(R.id.checkbox));
            F(view2.findViewById(R.id.summary));
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i14) {
        this(context, attributeSet, i14, 0);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j.a(com.garmin.android.apps.connectmobile.R.attr.checkBoxPreferenceStyle, R.attr.checkBoxPreferenceStyle, context));
    }

    public CheckBoxPreference(Context context) {
        this(context, null);
    }
}
