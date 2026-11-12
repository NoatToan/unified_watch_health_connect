package miuix.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.Checkable;
import androidx.preference.Preference;
import defpackage.eii;
import defpackage.k9h;
import defpackage.n5j;

/* JADX INFO: loaded from: classes3.dex */
public class SingleChoicePreferenceCategory extends androidx.preference.PreferenceCategory {
    public CharSequence[] i;
    public CharSequence[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence[] f26852k;
    public int l;
    public String m;
    public boolean n;
    public Context o;
    public c p;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public k9h f26853r;

    public class a implements k9h {
        public a() {
        }

        @Override // defpackage.k9h
        public void a(Preference preference) {
            c cVarL = SingleChoicePreferenceCategory.this.L(preference);
            SingleChoicePreferenceCategory.this.Q(cVarL);
            SingleChoicePreferenceCategory.this.P(cVarL);
            SingleChoicePreferenceCategory singleChoicePreferenceCategory = SingleChoicePreferenceCategory.this;
            singleChoicePreferenceCategory.R(cVarL, singleChoicePreferenceCategory.l);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.k9h
        public boolean b(Preference preference, Object obj) {
            boolean zIsChecked = ((Checkable) preference).isChecked();
            Preference.d onPreferenceClickListener = SingleChoicePreferenceCategory.this.getOnPreferenceClickListener();
            if (onPreferenceClickListener != null) {
                SingleChoicePreferenceCategory.this.F(preference, obj);
                onPreferenceClickListener.a(SingleChoicePreferenceCategory.this);
            }
            return !zIsChecked;
        }
    }

    public static class b extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SingleChoicePreference f26856b;

        public b(SingleChoicePreference singleChoicePreference) {
            super(singleChoicePreference);
            this.f26856b = singleChoicePreference;
        }

        @Override // miuix.preference.SingleChoicePreferenceCategory.c
        public Preference a() {
            return this.f26856b;
        }

        @Override // miuix.preference.SingleChoicePreferenceCategory.c
        public String b() {
            return this.f26856b.i();
        }

        @Override // miuix.preference.SingleChoicePreferenceCategory.c
        public void setOnPreferenceChangeInternalListener(k9h k9hVar) {
            this.f26856b.setOnPreferenceChangeInternalListener(k9hVar);
        }
    }

    public static abstract class c implements Checkable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Checkable f26857a;

        public c(Checkable checkable) {
            this.f26857a = checkable;
        }

        public abstract Preference a();

        public abstract String b();

        @Override // android.widget.Checkable
        public boolean isChecked() {
            return this.f26857a.isChecked();
        }

        @Override // android.widget.Checkable
        public void setChecked(boolean z) {
            this.f26857a.setChecked(z);
        }

        public abstract void setOnPreferenceChangeInternalListener(k9h k9hVar);

        @Override // android.widget.Checkable
        public void toggle() {
            setChecked(!isChecked());
        }
    }

    public SingleChoicePreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eii.c);
    }

    private boolean E(Object obj, Preference preference) {
        return preference.getOnPreferenceChangeListener() == null || preference.getOnPreferenceChangeListener().a(preference, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(Preference preference, Object obj) {
        Preference parent = preference.getParent() instanceof RadioSetPreferenceCategory ? preference.getParent() : preference;
        c cVar = this.p;
        if ((cVar == null || parent != cVar.a()) && E(obj, parent)) {
            M(preference);
        }
    }

    private void G() {
        c cVar = this.p;
        if (cVar != null) {
            cVar.setChecked(false);
        }
        this.p = null;
        this.l = -1;
    }

    private void H() {
        CharSequence[] charSequenceArr = this.i;
        if (charSequenceArr != null) {
            int length = charSequenceArr.length;
            for (int i = 0; i < length; i++) {
                String str = (String) this.i[i];
                String str2 = (String) this.j[i];
                SingleChoicePreference singleChoicePreference = new SingleChoicePreference(this.o);
                singleChoicePreference.setTitle(str);
                singleChoicePreference.n(str2);
                CharSequence[] charSequenceArr2 = this.f26852k;
                if (charSequenceArr2 != null) {
                    singleChoicePreference.setSummary((String) charSequenceArr2[i]);
                }
                h(singleChoicePreference);
            }
        }
    }

    private void K() {
        H();
    }

    public boolean I() {
        return this.q;
    }

    public String J() {
        return this.m;
    }

    public final c L(Preference preference) {
        if (preference instanceof SingleChoicePreference) {
            return new b((SingleChoicePreference) preference);
        }
        throw new IllegalArgumentException("Only SingleChoicePreference can be added to SingleChoicePreference2");
    }

    public void M(Preference preference) {
        if (preference == null) {
            G();
            return;
        }
        c cVarL = L(preference);
        if (cVarL.isChecked()) {
            return;
        }
        N(cVarL);
        Q(cVarL);
        P(cVarL);
        R(cVarL, this.l);
    }

    public final void N(c cVar) {
        cVar.setChecked(true);
    }

    public void O(String str) {
        boolean z = !TextUtils.equals(this.m, str);
        if (z || !this.n) {
            this.m = str;
            this.n = true;
            persistString(str);
            if (z) {
                notifyChanged();
            }
        }
    }

    public final void P(c cVar) {
        if (cVar.isChecked()) {
            int iN = n();
            for (int i = 0; i < iN; i++) {
                if (m(i) == cVar.a()) {
                    this.l = i;
                    return;
                }
            }
        }
    }

    public final void Q(c cVar) {
        if (cVar.isChecked()) {
            c cVar2 = this.p;
            if (cVar2 != null && cVar2.a() != cVar.a()) {
                this.p.setChecked(false);
            }
            this.p = cVar;
        }
    }

    public final void R(c cVar, int i) {
        if (cVar.isChecked()) {
            O(cVar.b());
        }
    }

    @Override // androidx.preference.PreferenceGroup
    public boolean h(Preference preference) {
        c cVarL = L(preference);
        boolean zH = super.h(preference);
        if (zH) {
            cVarL.setOnPreferenceChangeInternalListener(this.f26853r);
        }
        if (cVarL.isChecked()) {
            if (this.p != null) {
                throw new IllegalStateException("Already has a checked item, please check state of new add preference");
            }
            this.p = cVarL;
        }
        if (TextUtils.equals(this.m, cVarL.b())) {
            cVarL.setChecked(true);
        }
        return zH;
    }

    @Override // androidx.preference.PreferenceGroup, androidx.preference.Preference
    public void onAttached() {
        super.onAttached();
        K();
    }

    @Override // androidx.preference.PreferenceGroup, androidx.preference.Preference
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        O(savedState.f26854a);
    }

    @Override // androidx.preference.PreferenceGroup, androidx.preference.Preference
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (isPersistent()) {
            return parcelableOnSaveInstanceState;
        }
        SavedState savedState = new SavedState(parcelableOnSaveInstanceState);
        savedState.f26854a = J();
        return savedState;
    }

    @Override // androidx.preference.Preference
    public void onSetInitialValue(Object obj) {
        O(getPersistedString((String) obj));
    }

    @Override // androidx.preference.PreferenceGroup
    public boolean r(Preference preference) {
        return super.r(preference);
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f26854a;

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
            this.f26854a = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f26854a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SingleChoicePreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SingleChoicePreferenceCategory(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.l = -1;
        this.p = null;
        this.f26853r = new a();
        this.o = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n5j.L, i, i2);
        this.i = typedArrayObtainStyledAttributes.getTextArray(n5j.M);
        this.j = typedArrayObtainStyledAttributes.getTextArray(n5j.N);
        this.f26852k = typedArrayObtainStyledAttributes.getTextArray(n5j.P);
        this.q = typedArrayObtainStyledAttributes.getBoolean(n5j.O, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
