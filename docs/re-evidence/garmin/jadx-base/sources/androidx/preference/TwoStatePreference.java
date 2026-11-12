package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {
    public boolean K0;
    public CharSequence L0;
    public CharSequence M0;
    public boolean N0;
    public boolean O0;

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i14) {
        this(context, attributeSet, i14, 0);
    }

    @Override // androidx.preference.Preference
    public final boolean B() {
        boolean z14 = this.O0;
        boolean z15 = this.K0;
        if (!z14) {
            z15 = !z15;
        }
        return z15 || super.B();
    }

    public final void E(boolean z14) {
        boolean z15 = this.K0 != z14;
        if (z15 || !this.N0) {
            this.K0 = z14;
            this.N0 = true;
            if (C()) {
                boolean z16 = !z14;
                if (C()) {
                    z16 = this.f10148b.d().getBoolean(this.f10159l, z16);
                }
                if (z14 != z16) {
                    SharedPreferences.Editor editorC = this.f10148b.c();
                    editorC.putBoolean(this.f10159l, z14);
                    if (!this.f10148b.f17492e) {
                        editorC.apply();
                    }
                }
            }
            if (z15) {
                j(B());
                i();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    public final void F(View view2) {
        boolean z14;
        int i14;
        CharSequence charSequenceG;
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            if (!this.K0 || TextUtils.isEmpty(this.L0)) {
                if (this.K0 || TextUtils.isEmpty(this.M0)) {
                    z14 = true;
                } else {
                    textView.setText(this.M0);
                }
                if (z14) {
                    charSequenceG = g();
                    if (!TextUtils.isEmpty(charSequenceG)) {
                        textView.setText(charSequenceG);
                        z14 = false;
                    }
                }
                i14 = z14 ? 8 : 0;
                if (i14 != textView.getVisibility()) {
                    textView.setVisibility(i14);
                }
            }
            textView.setText(this.L0);
            z14 = false;
            if (z14) {
                charSequenceG = g();
                if (!TextUtils.isEmpty(charSequenceG)) {
                    textView.setText(charSequenceG);
                    z14 = false;
                }
            }
            if (z14) {
            }
            if (i14 != textView.getVisibility()) {
                textView.setVisibility(i14);
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void n() {
        boolean z14 = !this.K0;
        if (a(Boolean.valueOf(z14))) {
            E(z14);
        }
    }

    @Override // androidx.preference.Preference
    public final Object p(TypedArray typedArray, int i14) {
        return Boolean.valueOf(typedArray.getBoolean(i14, false));
    }

    @Override // androidx.preference.Preference
    public final void q(Parcelable parcelable) {
        if (!parcelable.getClass().equals(a.class)) {
            super.q(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.q(aVar.getSuperState());
        E(aVar.f10183a);
    }

    @Override // androidx.preference.Preference
    public final Parcelable r() {
        super.r();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f10166t) {
            return absSavedState;
        }
        a aVar = new a(absSavedState);
        aVar.f10183a = this.K0;
        return aVar;
    }

    @Override // androidx.preference.Preference
    public final void s(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (C()) {
            zBooleanValue = this.f10148b.d().getBoolean(this.f10159l, zBooleanValue);
        }
        E(zBooleanValue);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14, i15);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(Context context) {
        this(context, null);
    }

    public static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0139a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f10183a;

        /* JADX INFO: renamed from: androidx.preference.TwoStatePreference$a$a, reason: collision with other inner class name */
        public class C0139a implements Parcelable.Creator<a> {
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
            this.f10183a = parcel.readInt() == 1;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            super.writeToParcel(parcel, i14);
            parcel.writeInt(this.f10183a ? 1 : 0);
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
