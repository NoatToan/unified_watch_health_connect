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
public class ListPreference extends DialogPreference {
    public CharSequence[] g;
    public CharSequence[] h;
    public String i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2710k;

    public static final class a implements Preference.f<ListPreference> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static a f2712a;

        public static a b() {
            if (f2712a == null) {
                f2712a = new a();
            }
            return f2712a;
        }

        @Override // androidx.preference.Preference.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(ListPreference listPreference) {
            return TextUtils.isEmpty(listPreference.p()) ? listPreference.getContext().getString(e0j.c) : listPreference.p();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p3j.y, i, i2);
        this.g = p5q.q(typedArrayObtainStyledAttributes, p3j.B, p3j.z);
        this.h = p5q.q(typedArrayObtainStyledAttributes, p3j.C, p3j.A);
        int i3 = p3j.D;
        if (p5q.b(typedArrayObtainStyledAttributes, i3, i3, false)) {
            setSummaryProvider(a.b());
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, p3j.J, i, i2);
        this.j = p5q.o(typedArrayObtainStyledAttributes2, p3j.r0, p3j.R);
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public CharSequence getSummary() {
        if (getSummaryProvider() != null) {
            return getSummaryProvider().a(this);
        }
        CharSequence charSequenceP = p();
        CharSequence summary = super.getSummary();
        String str = this.j;
        if (str == null) {
            return summary;
        }
        Object[] objArr = new Object[1];
        if (charSequenceP == null) {
            charSequenceP = "";
        }
        objArr[0] = charSequenceP;
        String str2 = String.format(str, objArr);
        return TextUtils.equals(str2, summary) ? summary : str2;
    }

    public int n(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.h) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.h[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence[] o() {
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
        w(savedState.f2711a);
    }

    @Override // androidx.preference.Preference
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (isPersistent()) {
            return parcelableOnSaveInstanceState;
        }
        SavedState savedState = new SavedState(parcelableOnSaveInstanceState);
        savedState.f2711a = s();
        return savedState;
    }

    @Override // androidx.preference.Preference
    public void onSetInitialValue(Object obj) {
        w(getPersistedString((String) obj));
    }

    public CharSequence p() {
        CharSequence[] charSequenceArr;
        int iU = u();
        if (iU < 0 || (charSequenceArr = this.g) == null) {
            return null;
        }
        return charSequenceArr[iU];
    }

    public CharSequence[] r() {
        return this.h;
    }

    public String s() {
        return this.i;
    }

    @Override // androidx.preference.Preference
    public void setSummary(CharSequence charSequence) {
        super.setSummary(charSequence);
        if (charSequence == null) {
            this.j = null;
        } else {
            this.j = charSequence.toString();
        }
    }

    public final int u() {
        return n(this.i);
    }

    public void w(String str) {
        boolean z = !TextUtils.equals(this.i, str);
        if (z || !this.f2710k) {
            this.i = str;
            this.f2710k = true;
            persistString(str);
            if (z) {
                notifyChanged();
            }
        }
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f2711a;

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
            this.f2711a = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f2711a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p5q.a(context, mii.f26216b, R.attr.dialogPreferenceStyle));
    }
}
