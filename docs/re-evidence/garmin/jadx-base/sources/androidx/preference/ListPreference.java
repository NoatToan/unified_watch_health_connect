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
public class ListPreference extends DialogPreference {
    public final CharSequence[] Q0;
    public final CharSequence[] R0;
    public String S0;
    public String T0;
    public boolean U0;

    public static final class b implements Preference.f<ListPreference> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static b f10145a;

        private b() {
        }

        public static b b() {
            if (f10145a == null) {
                f10145a = new b();
            }
            return f10145a;
        }

        @Override // androidx.preference.Preference.f
        public final CharSequence a(Preference preference) {
            ListPreference listPreference = (ListPreference) preference;
            CharSequence[] charSequenceArr = listPreference.Q0;
            int iE = listPreference.E(listPreference.S0);
            if (TextUtils.isEmpty((iE < 0 || charSequenceArr == null) ? null : charSequenceArr[iE])) {
                return listPreference.f10147a.getString(R.string.not_set);
            }
            int iE2 = listPreference.E(listPreference.S0);
            if (iE2 < 0 || charSequenceArr == null) {
                return null;
            }
            return charSequenceArr[iE2];
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14, i15);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f17511e, i14, i15);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.Q0 = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.R0 = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        if (typedArrayObtainStyledAttributes.getBoolean(4, typedArrayObtainStyledAttributes.getBoolean(4, false))) {
            this.I0 = b.b();
            i();
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, i.f17513g, i14, i15);
        String string = typedArrayObtainStyledAttributes2.getString(33);
        this.T0 = string == null ? typedArrayObtainStyledAttributes2.getString(7) : string;
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final int E(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.R0) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public final void F(String str) {
        boolean zEquals = TextUtils.equals(this.S0, str);
        if (zEquals && this.U0) {
            return;
        }
        this.S0 = str;
        this.U0 = true;
        u(str);
        if (zEquals) {
            return;
        }
        i();
    }

    @Override // androidx.preference.Preference
    public final CharSequence g() {
        CharSequence[] charSequenceArr;
        Preference.f fVar = this.I0;
        if (fVar != null) {
            return fVar.a(this);
        }
        int iE = E(this.S0);
        CharSequence charSequence = (iE < 0 || (charSequenceArr = this.Q0) == null) ? null : charSequenceArr[iE];
        CharSequence charSequenceG = super.g();
        String str = this.T0;
        if (str != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            String str2 = String.format(str, charSequence);
            if (!TextUtils.equals(str2, charSequenceG)) {
                return str2;
            }
        }
        return charSequenceG;
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
        F(aVar.f10144a);
    }

    @Override // androidx.preference.Preference
    public final Parcelable r() {
        super.r();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f10166t) {
            return absSavedState;
        }
        a aVar = new a(absSavedState);
        aVar.f10144a = this.S0;
        return aVar;
    }

    @Override // androidx.preference.Preference
    public final void s(Object obj) {
        F(e((String) obj));
    }

    @Override // androidx.preference.Preference
    public final void y(CharSequence charSequence) {
        super.y(charSequence);
        if (charSequence == null) {
            this.T0 = null;
        } else {
            this.T0 = ((String) charSequence).toString();
        }
    }

    public static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0137a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f10144a;

        /* JADX INFO: renamed from: androidx.preference.ListPreference$a$a, reason: collision with other inner class name */
        public class C0137a implements Parcelable.Creator<a> {
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
            this.f10144a = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            super.writeToParcel(parcel, i14);
            parcel.writeString(this.f10144a);
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i14) {
        this(context, attributeSet, i14, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j.a(R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle, context));
    }

    public ListPreference(Context context) {
        this(context, null);
    }
}
