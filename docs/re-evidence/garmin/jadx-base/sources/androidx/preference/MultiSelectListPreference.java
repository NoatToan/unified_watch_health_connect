package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import b7.j;
import bd.i;
import com.garmin.android.apps.connectmobile.R;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    public final CharSequence[] Q0;
    public final CharSequence[] R0;
    public final HashSet S0;

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14, i15);
        this.S0 = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f17512f, i14, i15);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.Q0 = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.R0 = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void E(Set<String> set) {
        HashSet hashSet = this.S0;
        hashSet.clear();
        hashSet.addAll(set);
        if (C()) {
            if (!set.equals(C() ? this.f10148b.d().getStringSet(this.f10159l, null) : null)) {
                SharedPreferences.Editor editorC = this.f10148b.c();
                editorC.putStringSet(this.f10159l, set);
                if (!this.f10148b.f17492e) {
                    editorC.apply();
                }
            }
        }
        i();
    }

    @Override // androidx.preference.Preference
    public final Object p(TypedArray typedArray, int i14) {
        CharSequence[] textArray = typedArray.getTextArray(i14);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    public final void q(Parcelable parcelable) {
        if (!parcelable.getClass().equals(a.class)) {
            super.q(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.q(aVar.getSuperState());
        E(aVar.f10146a);
    }

    @Override // androidx.preference.Preference
    public final Parcelable r() {
        super.r();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f10166t) {
            return absSavedState;
        }
        a aVar = new a(absSavedState);
        aVar.f10146a = this.S0;
        return aVar;
    }

    @Override // androidx.preference.Preference
    public final void s(Object obj) {
        Set<String> stringSet = (Set) obj;
        if (C()) {
            stringSet = this.f10148b.d().getStringSet(this.f10159l, stringSet);
        }
        E(stringSet);
    }

    public static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0138a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public HashSet f10146a;

        /* JADX INFO: renamed from: androidx.preference.MultiSelectListPreference$a$a, reason: collision with other inner class name */
        public class C0138a implements Parcelable.Creator<a> {
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
            int i14 = parcel.readInt();
            this.f10146a = new HashSet();
            String[] strArr = new String[i14];
            parcel.readStringArray(strArr);
            Collections.addAll(this.f10146a, strArr);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            super.writeToParcel(parcel, i14);
            parcel.writeInt(this.f10146a.size());
            HashSet hashSet = this.f10146a;
            parcel.writeStringArray((String[]) hashSet.toArray(new String[hashSet.size()]));
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i14) {
        this(context, attributeSet, i14, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j.a(R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle, context));
    }

    public MultiSelectListPreference(Context context) {
        this(context, null);
    }
}
