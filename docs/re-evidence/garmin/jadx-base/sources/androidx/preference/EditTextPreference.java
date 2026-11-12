package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import b7.j;
import bd.i;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    public String Q0;

    public static final class b implements Preference.f<EditTextPreference> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static b f10143a;

        private b() {
        }

        public static b b() {
            if (f10143a == null) {
                f10143a = new b();
            }
            return f10143a;
        }

        @Override // androidx.preference.Preference.f
        public final CharSequence a(Preference preference) {
            EditTextPreference editTextPreference = (EditTextPreference) preference;
            return TextUtils.isEmpty(editTextPreference.Q0) ? editTextPreference.f10147a.getString(R.string.not_set) : editTextPreference.Q0;
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14, i15);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f17510d, i14, i15);
        if (typedArrayObtainStyledAttributes.getBoolean(0, typedArrayObtainStyledAttributes.getBoolean(0, false))) {
            this.I0 = b.b();
            i();
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final boolean B() {
        return TextUtils.isEmpty(this.Q0) || super.B();
    }

    public final void E(String str) {
        boolean zB = B();
        this.Q0 = str;
        u(str);
        boolean zB2 = B();
        if (zB2 != zB) {
            j(zB2);
        }
        i();
    }

    @Override // androidx.preference.Preference
    public final Object p(TypedArray typedArray, int i14) {
        return typedArray.getString(i14);
    }

    @Override // androidx.preference.Preference
    public final void q(Parcelable parcelable) {
        if (!parcelable.getClass().equals(a.class)) {
            super.q(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.q(aVar.getSuperState());
        E(aVar.f10142a);
    }

    @Override // androidx.preference.Preference
    public final Parcelable r() {
        super.r();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f10166t) {
            return absSavedState;
        }
        a aVar = new a(absSavedState);
        aVar.f10142a = this.Q0;
        return aVar;
    }

    @Override // androidx.preference.Preference
    public final void s(Object obj) {
        E(e((String) obj));
    }

    public static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0136a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f10142a;

        /* JADX INFO: renamed from: androidx.preference.EditTextPreference$a$a, reason: collision with other inner class name */
        public class C0136a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i14) {
                return new a[i14];
            }
        }

        public a(Parcel parcel) {
            super(parcel);
            this.f10142a = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            super.writeToParcel(parcel, i14);
            parcel.writeString(this.f10142a);
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i14) {
        this(context, attributeSet, i14, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j.a(R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle, context));
    }

    public EditTextPreference(Context context) {
        this(context, null);
    }
}
