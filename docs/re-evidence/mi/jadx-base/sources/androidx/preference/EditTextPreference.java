package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import defpackage.e0j;
import defpackage.mii;
import defpackage.p3j;
import defpackage.p5q;

/* JADX INFO: loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    public String g;

    public interface a {
    }

    public static final class b implements Preference.f<EditTextPreference> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static b f2707a;

        public static b b() {
            if (f2707a == null) {
                f2707a = new b();
            }
            return f2707a;
        }

        @Override // androidx.preference.Preference.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(EditTextPreference editTextPreference) {
            return TextUtils.isEmpty(editTextPreference.o()) ? editTextPreference.getContext().getString(e0j.c) : editTextPreference.o();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p3j.w, i, i2);
        int i3 = p3j.x;
        if (p5q.b(typedArrayObtainStyledAttributes, i3, i3, false)) {
            setSummaryProvider(b.b());
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public a n() {
        return null;
    }

    public String o() {
        return this.g;
    }

    @Override // androidx.preference.Preference
    public Object onGetDefaultValue(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        p(savedState.f2706a);
    }

    @Override // androidx.preference.Preference
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (isPersistent()) {
            return parcelableOnSaveInstanceState;
        }
        SavedState savedState = new SavedState(parcelableOnSaveInstanceState);
        savedState.f2706a = o();
        return savedState;
    }

    @Override // androidx.preference.Preference
    public void onSetInitialValue(Object obj) {
        p(getPersistedString((String) obj));
    }

    public void p(String str) {
        boolean zShouldDisableDependents = shouldDisableDependents();
        this.g = str;
        persistString(str);
        boolean zShouldDisableDependents2 = shouldDisableDependents();
        if (zShouldDisableDependents2 != zShouldDisableDependents) {
            notifyDependencyChange(zShouldDisableDependents2);
        }
        notifyChanged();
    }

    public void setOnBindEditTextListener(a aVar) {
    }

    @Override // androidx.preference.Preference
    public boolean shouldDisableDependents() {
        return TextUtils.isEmpty(this.g) || super.shouldDisableDependents();
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f2706a;

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
            this.f2706a = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f2706a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p5q.a(context, mii.d, R.attr.editTextPreferenceStyle));
    }
}
