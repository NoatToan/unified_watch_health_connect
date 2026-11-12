package miuix.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.Checkable;
import androidx.preference.Preference;
import defpackage.eii;
import defpackage.k9h;
import defpackage.n5j;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class MultiChoicePreferenceCategory extends androidx.preference.PreferenceCategory {
    public CharSequence[] i;
    public CharSequence[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence[] f26827k;
    public Set<String> l;
    public Context m;
    public b n;
    public boolean o;
    public k9h p;

    public class a implements k9h {
        public a() {
        }

        @Override // defpackage.k9h
        public void a(Preference preference) {
            b bVarG = MultiChoicePreferenceCategory.this.G(preference);
            HashSet hashSet = new HashSet(MultiChoicePreferenceCategory.this.l);
            if (bVarG.isChecked()) {
                if (hashSet.contains(bVarG.b())) {
                    return;
                } else {
                    hashSet.add(bVarG.b());
                }
            } else if (!hashSet.contains(bVarG.b())) {
                return;
            } else {
                hashSet.remove(bVarG.b());
            }
            MultiChoicePreferenceCategory.this.H(hashSet);
        }

        @Override // defpackage.k9h
        public boolean b(Preference preference, Object obj) {
            Preference.d onPreferenceClickListener = MultiChoicePreferenceCategory.this.getOnPreferenceClickListener();
            if (onPreferenceClickListener == null) {
                return true;
            }
            MultiChoicePreferenceCategory.this.J(preference, obj);
            onPreferenceClickListener.a(MultiChoicePreferenceCategory.this);
            return true;
        }
    }

    public static abstract class b implements Checkable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Checkable f26830a;

        public b(Checkable checkable) {
            this.f26830a = checkable;
        }

        public abstract Preference a();

        public abstract String b();

        @Override // android.widget.Checkable
        public boolean isChecked() {
            return this.f26830a.isChecked();
        }

        @Override // android.widget.Checkable
        public void setChecked(boolean z) {
            this.f26830a.setChecked(z);
        }

        public abstract void setOnPreferenceChangeInternalListener(k9h k9hVar);

        @Override // android.widget.Checkable
        public void toggle() {
            setChecked(!isChecked());
        }
    }

    public static class c extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public MultiChoicePreference f26831b;

        public c(MultiChoicePreference multiChoicePreference) {
            super(multiChoicePreference);
            this.f26831b = multiChoicePreference;
        }

        @Override // miuix.preference.MultiChoicePreferenceCategory.b
        public Preference a() {
            return this.f26831b;
        }

        @Override // miuix.preference.MultiChoicePreferenceCategory.b
        public String b() {
            return this.f26831b.i();
        }

        @Override // miuix.preference.MultiChoicePreferenceCategory.b
        public void setOnPreferenceChangeInternalListener(k9h k9hVar) {
            this.f26831b.setOnPreferenceChangeInternalListener(k9hVar);
        }
    }

    public MultiChoicePreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eii.c);
    }

    private void C() {
        int length = this.i.length;
        for (int i = 0; i < length; i++) {
            String str = (String) this.i[i];
            String str2 = (String) this.f26827k[i];
            MultiChoicePreference multiChoicePreference = new MultiChoicePreference(this.m);
            multiChoicePreference.setTitle(str);
            multiChoicePreference.m(str2);
            CharSequence[] charSequenceArr = this.j;
            if (charSequenceArr != null) {
                multiChoicePreference.setSummary((String) charSequenceArr[i]);
            }
            h(multiChoicePreference);
        }
    }

    public final boolean B(Object obj, Preference preference) {
        return preference.getOnPreferenceChangeListener() == null || preference.getOnPreferenceChangeListener().a(preference, obj);
    }

    public boolean D() {
        return this.o;
    }

    public Set<String> E() {
        return this.l;
    }

    public final void F() {
        C();
    }

    public final b G(Preference preference) {
        if (preference instanceof MultiChoicePreference) {
            return new c((MultiChoicePreference) preference);
        }
        throw new IllegalArgumentException("Only SingleChoicePreference can be added to MultiChoicePreferenceCategory");
    }

    public void H(Set<String> set) {
        this.l.clear();
        this.l.addAll(set);
        persistStringSet(set);
        notifyChanged();
    }

    public void I(Preference preference) {
        G(preference).toggle();
    }

    public final void J(Preference preference, Object obj) {
        Preference parent = preference.getParent() instanceof RadioSetPreferenceCategory ? preference.getParent() : preference;
        b bVar = this.n;
        if ((bVar == null || parent != bVar.a()) && B(obj, parent)) {
            I(preference);
        }
    }

    @Override // androidx.preference.PreferenceGroup
    public boolean h(Preference preference) {
        b bVarG = G(preference);
        boolean zH = super.h(preference);
        if (zH) {
            bVarG.setOnPreferenceChangeInternalListener(this.p);
        }
        if (this.l.contains(((MultiChoicePreference) preference).i())) {
            bVarG.setChecked(true);
        }
        return zH;
    }

    @Override // androidx.preference.PreferenceGroup, androidx.preference.Preference
    public void onAttached() {
        super.onAttached();
        F();
    }

    @Override // androidx.preference.PreferenceGroup, androidx.preference.Preference
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        H(savedState.f26828a);
    }

    @Override // androidx.preference.PreferenceGroup, androidx.preference.Preference
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (isPersistent()) {
            return parcelableOnSaveInstanceState;
        }
        SavedState savedState = new SavedState(parcelableOnSaveInstanceState);
        savedState.f26828a = E();
        return savedState;
    }

    @Override // androidx.preference.Preference
    public void onSetInitialValue(Object obj) {
        H(getPersistedStringSet((Set) obj));
    }

    @Override // androidx.preference.PreferenceGroup
    public boolean r(Preference preference) {
        return super.r(preference);
    }

    public MultiChoicePreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MultiChoicePreferenceCategory(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.l = new HashSet();
        this.n = null;
        this.p = new a();
        this.m = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n5j.L, i, i2);
        this.i = typedArrayObtainStyledAttributes.getTextArray(n5j.M);
        this.f26827k = typedArrayObtainStyledAttributes.getTextArray(n5j.N);
        this.j = typedArrayObtainStyledAttributes.getTextArray(n5j.P);
        this.o = typedArrayObtainStyledAttributes.getBoolean(n5j.O, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Set<String> f26828a;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            int i = parcel.readInt();
            this.f26828a = new HashSet();
            String[] strArr = new String[i];
            parcel.readStringArray(strArr);
            Collections.addAll(this.f26828a, strArr);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f26828a.size());
            Set<String> set = this.f26828a;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
