package com.garmin.android.framework.widget;

import a7.b;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.preference.CheckBoxPreference;
import bd.h;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes8.dex */
public class SwitchPreferenceCompat extends CheckBoxPreference {
    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        H();
    }

    public final void H() {
        this.T = R.layout.switch_preference_compat;
        if (this.E) {
            this.E = false;
            i();
        }
    }

    @Override // androidx.preference.CheckBoxPreference, androidx.preference.Preference
    public final void m(h hVar) {
        super.m(hVar);
        ((TextView) hVar.d(android.R.id.title)).setTextColor(b.getColorStateList(this.f10147a, R.color.gcm_text_primary_selector));
        hVar.f17505d = true;
        hVar.f17506e = true;
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14, i15);
        H();
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        H();
    }

    public SwitchPreferenceCompat(Context context) {
        super(context);
        H();
    }
}
