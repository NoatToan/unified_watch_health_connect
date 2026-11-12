package miuix.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Checkable;
import androidx.preference.Preference;
import defpackage.eii;
import defpackage.k9h;
import defpackage.n5j;

/* JADX INFO: loaded from: classes3.dex */
public class RadioSetPreferenceCategory extends androidx.preference.PreferenceCategory implements Checkable {
    public k9h i;
    public k9h j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f26847k;
    public boolean l;
    public String m;
    public RadioButtonPreference n;

    public class a implements k9h {
        public a() {
        }

        @Override // defpackage.k9h
        public void a(Preference preference) {
            if (preference instanceof RadioButtonPreference) {
                RadioSetPreferenceCategory.this.setChecked(((RadioButtonPreference) preference).isChecked());
            }
            if (RadioSetPreferenceCategory.this.i != null) {
                RadioSetPreferenceCategory.this.i.a(preference);
            }
        }

        @Override // defpackage.k9h
        public boolean b(Preference preference, Object obj) {
            if (RadioSetPreferenceCategory.this.i != null) {
                return RadioSetPreferenceCategory.this.i.b(preference, obj);
            }
            return true;
        }
    }

    public RadioSetPreferenceCategory(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.j = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n5j.S1, i, i2);
        this.m = typedArrayObtainStyledAttributes.getString(n5j.T1);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.PreferenceGroup
    public boolean h(Preference preference) {
        String str = this.m;
        if (str == null) {
            if (n() == 0) {
                if (!(preference instanceof RadioButtonPreference)) {
                    throw new IllegalArgumentException("The first preference must be RadioButtonPreference, if primary key is empty");
                }
                RadioButtonPreference radioButtonPreference = (RadioButtonPreference) preference;
                this.n = radioButtonPreference;
                radioButtonPreference.setOnPreferenceChangeInternalListener(this.j);
            }
        } else if (str.equals(preference.getKey())) {
            RadioButtonPreference radioButtonPreference2 = this.n;
            if (radioButtonPreference2 != null && radioButtonPreference2 != preference) {
                throw new IllegalArgumentException("must not have two primary preference");
            }
            if (!(preference instanceof RadioButtonPreference)) {
                throw new IllegalArgumentException("Primary preference must be RadioButtonPreference");
            }
            RadioButtonPreference radioButtonPreference3 = (RadioButtonPreference) preference;
            this.n = radioButtonPreference3;
            radioButtonPreference3.setOnPreferenceChangeInternalListener(this.j);
        }
        return super.h(preference);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f26847k;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f26847k == z && this.l) {
            return;
        }
        this.f26847k = z;
        this.l = true;
    }

    public void setOnPreferenceChangeInternalListener(k9h k9hVar) {
        this.i = k9hVar;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    public RadioButtonPreference z() {
        return this.n;
    }

    public RadioSetPreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public RadioSetPreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eii.o);
    }

    public RadioSetPreferenceCategory(Context context) {
        this(context, null);
    }
}
