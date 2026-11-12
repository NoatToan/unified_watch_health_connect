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
public class RadioButtonPreferenceCategory extends androidx.preference.PreferenceCategory {
    public d i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f26843k;
    public k9h l;

    public class a implements k9h {
        public a() {
        }

        @Override // defpackage.k9h
        public void a(Preference preference) {
            d dVarG = RadioButtonPreferenceCategory.this.G(preference);
            RadioButtonPreferenceCategory.this.K(dVarG);
            RadioButtonPreferenceCategory.this.J(dVarG);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.k9h
        public boolean b(Preference preference, Object obj) {
            boolean zIsChecked = ((Checkable) preference).isChecked();
            Preference.d onPreferenceClickListener = RadioButtonPreferenceCategory.this.getOnPreferenceClickListener();
            if (onPreferenceClickListener != null) {
                RadioButtonPreferenceCategory.this.D(preference, obj);
                onPreferenceClickListener.a(RadioButtonPreferenceCategory.this);
            }
            return !zIsChecked;
        }
    }

    public class b extends d {
        public RadioSetPreferenceCategory c;

        public b(RadioSetPreferenceCategory radioSetPreferenceCategory) {
            super(radioSetPreferenceCategory);
            this.c = radioSetPreferenceCategory;
        }

        @Override // miuix.preference.RadioButtonPreferenceCategory.d
        public Preference a() {
            return this.c;
        }

        @Override // miuix.preference.RadioButtonPreferenceCategory.d, android.widget.Checkable
        public void setChecked(boolean z) {
            super.setChecked(z);
            if (this.c.z() != null) {
                this.c.z().setChecked(z);
            }
        }

        @Override // miuix.preference.RadioButtonPreferenceCategory.d
        public void setOnPreferenceChangeInternalListener(k9h k9hVar) {
            this.c.setOnPreferenceChangeInternalListener(k9hVar);
        }
    }

    public class c extends d {
        public RadioButtonPreference c;

        public c(RadioButtonPreference radioButtonPreference) {
            super(radioButtonPreference);
            this.c = radioButtonPreference;
        }

        @Override // miuix.preference.RadioButtonPreferenceCategory.d
        public Preference a() {
            return this.c;
        }

        @Override // miuix.preference.RadioButtonPreferenceCategory.d
        public void setOnPreferenceChangeInternalListener(k9h k9hVar) {
            this.c.setOnPreferenceChangeInternalListener(k9hVar);
        }
    }

    public abstract class d implements Checkable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Checkable f26845a;

        public d(Checkable checkable) {
            this.f26845a = checkable;
        }

        public abstract Preference a();

        @Override // android.widget.Checkable
        public boolean isChecked() {
            return this.f26845a.isChecked();
        }

        @Override // android.widget.Checkable
        public void setChecked(boolean z) {
            this.f26845a.setChecked(z);
        }

        public abstract void setOnPreferenceChangeInternalListener(k9h k9hVar);

        @Override // android.widget.Checkable
        public void toggle() {
            setChecked(!isChecked());
        }
    }

    public RadioButtonPreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = null;
        this.j = -1;
        this.l = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n5j.Q1);
        this.f26843k = typedArrayObtainStyledAttributes.getBoolean(n5j.R1, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private boolean C(Object obj, Preference preference) {
        return preference.getOnPreferenceChangeListener() == null || preference.getOnPreferenceChangeListener().a(preference, obj);
    }

    public final void D(Preference preference, Object obj) {
        Preference parent = preference.getParent() instanceof RadioSetPreferenceCategory ? preference.getParent() : preference;
        d dVar = this.i;
        if ((dVar == null || parent != dVar.a()) && C(obj, parent)) {
            H(preference);
        }
    }

    public final void E() {
        d dVar = this.i;
        if (dVar != null) {
            dVar.setChecked(false);
        }
        this.i = null;
        this.j = -1;
    }

    public boolean F() {
        return this.f26843k;
    }

    public final d G(Preference preference) {
        if (preference instanceof RadioButtonPreference) {
            return preference.getParent() instanceof RadioSetPreferenceCategory ? new b((RadioSetPreferenceCategory) preference.getParent()) : new c((RadioButtonPreference) preference);
        }
        if (preference instanceof RadioSetPreferenceCategory) {
            return new b((RadioSetPreferenceCategory) preference);
        }
        throw new IllegalArgumentException("Only RadioButtonPreference or RadioSetPreferenceCategory can be added to RadioButtonPreferenceCategory");
    }

    public void H(Preference preference) {
        if (preference == null) {
            E();
            return;
        }
        d dVarG = G(preference);
        if (dVarG.isChecked()) {
            return;
        }
        I(dVarG);
        K(dVarG);
        J(dVarG);
    }

    public final void I(d dVar) {
        dVar.setChecked(true);
    }

    public final void J(d dVar) {
        if (dVar.isChecked()) {
            int iN = n();
            for (int i = 0; i < iN; i++) {
                if (m(i) == dVar.a()) {
                    this.j = i;
                    return;
                }
            }
        }
    }

    public final void K(d dVar) {
        if (dVar.isChecked()) {
            d dVar2 = this.i;
            if (dVar2 != null && dVar2.a() != dVar.a()) {
                this.i.setChecked(false);
            }
            this.i = dVar;
        }
    }

    @Override // androidx.preference.PreferenceGroup
    public boolean h(Preference preference) {
        d dVarG = G(preference);
        boolean zH = super.h(preference);
        if (zH) {
            dVarG.setOnPreferenceChangeInternalListener(this.l);
        }
        if (dVarG.isChecked()) {
            if (this.i != null) {
                throw new IllegalStateException("Already has a checked item, please check state of new add preference");
            }
            this.i = dVarG;
        }
        return zH;
    }

    @Override // androidx.preference.PreferenceGroup
    public boolean r(Preference preference) {
        d dVarG = G(preference);
        boolean zR = super.r(preference);
        if (zR) {
            dVarG.setOnPreferenceChangeInternalListener(null);
            if (dVarG.isChecked()) {
                dVarG.setChecked(false);
                this.j = -1;
                this.i = null;
            }
        }
        return zR;
    }

    public RadioButtonPreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eii.p);
    }

    public RadioButtonPreferenceCategory(Context context) {
        this(context, null);
    }
}
