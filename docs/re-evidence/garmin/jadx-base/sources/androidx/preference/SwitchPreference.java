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
import b7.j;
import bd.h;
import bd.i;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    public final a P0;
    public final String Q0;
    public final String R0;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            Boolean boolValueOf = Boolean.valueOf(z14);
            SwitchPreference switchPreference = SwitchPreference.this;
            if (switchPreference.a(boolValueOf)) {
                switchPreference.E(z14);
            } else {
                compoundButton.setChecked(!z14);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14, i15);
        this.P0 = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f17518l, i14, i15);
        String string = typedArrayObtainStyledAttributes.getString(7);
        this.L0 = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        if (this.K0) {
            i();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(6);
        this.M0 = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        if (!this.K0) {
            i();
        }
        String string3 = typedArrayObtainStyledAttributes.getString(9);
        this.Q0 = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        i();
        String string4 = typedArrayObtainStyledAttributes.getString(8);
        this.R0 = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        i();
        this.O0 = typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G(View view2) {
        boolean z14 = view2 instanceof Switch;
        if (z14) {
            ((Switch) view2).setOnCheckedChangeListener(null);
        }
        if (view2 instanceof Checkable) {
            ((Checkable) view2).setChecked(this.K0);
        }
        if (z14) {
            Switch r14 = (Switch) view2;
            r14.setTextOn(this.Q0);
            r14.setTextOff(this.R0);
            r14.setOnCheckedChangeListener(this.P0);
        }
    }

    @Override // androidx.preference.Preference
    public final void m(h hVar) {
        super.m(hVar);
        G(hVar.d(R.id.switch_widget));
        F(hVar.d(R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void t(View view2) {
        super.t(view2);
        if (((AccessibilityManager) this.f10147a.getSystemService("accessibility")).isEnabled()) {
            G(view2.findViewById(R.id.switch_widget));
            F(view2.findViewById(R.id.summary));
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i14) {
        this(context, attributeSet, i14, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j.a(com.garmin.android.apps.connectmobile.R.attr.switchPreferenceStyle, R.attr.switchPreferenceStyle, context));
    }

    public SwitchPreference(Context context) {
        this(context, null);
    }
}
