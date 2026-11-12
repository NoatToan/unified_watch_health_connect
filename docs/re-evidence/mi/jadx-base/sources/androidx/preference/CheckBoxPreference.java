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
import defpackage.g7i;
import defpackage.mii;
import defpackage.p3j;
import defpackage.p5q;

/* JADX INFO: loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f2701a;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (CheckBoxPreference.this.callChangeListener(Boolean.valueOf(z))) {
                CheckBoxPreference.this.setChecked(z);
            } else {
                compoundButton.setChecked(!z);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.mChecked);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f2701a);
        }
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(g7i g7iVar) {
        super.onBindViewHolder(g7iVar);
        e(g7iVar.a(R.id.checkbox));
        syncSummaryView(g7iVar);
    }

    @Override // androidx.preference.Preference
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void performClick(View view) {
        super.performClick(view);
        syncViewIfAccessibilityEnabled(view);
    }

    public final void syncViewIfAccessibilityEnabled(View view) {
        if (((AccessibilityManager) getContext().getSystemService("accessibility")).isEnabled()) {
            e(view.findViewById(R.id.checkbox));
            syncSummaryView(view.findViewById(R.id.summary));
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f2701a = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p3j.c, i, i2);
        setSummaryOn(p5q.o(typedArrayObtainStyledAttributes, p3j.i, p3j.d));
        setSummaryOff(p5q.o(typedArrayObtainStyledAttributes, p3j.h, p3j.e));
        setDisableDependentsState(p5q.b(typedArrayObtainStyledAttributes, p3j.g, p3j.f, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p5q.a(context, mii.f26215a, R.attr.checkBoxPreferenceStyle));
    }

    public CheckBoxPreference(Context context) {
        this(context, null);
    }
}
