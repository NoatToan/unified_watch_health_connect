package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import bd.f;
import bd.i;
import java.util.ArrayList;
import java.util.Collections;
import p1.k1;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    public final k1<String, Long> K0;
    public final Handler L0;
    public final ArrayList M0;
    public boolean N0;
    public int O0;
    public boolean P0;
    public int Q0;
    public final a R0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this) {
                PreferenceGroup.this.K0.clear();
            }
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14, i15);
        this.K0 = new k1<>();
        this.L0 = new Handler(Looper.getMainLooper());
        this.N0 = true;
        this.O0 = 0;
        this.P0 = false;
        this.Q0 = Integer.MAX_VALUE;
        this.R0 = new a();
        this.M0 = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f17515i, i14, i15);
        this.N0 = typedArrayObtainStyledAttributes.getBoolean(2, typedArrayObtainStyledAttributes.getBoolean(2, true));
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            int i16 = typedArrayObtainStyledAttributes.getInt(1, typedArrayObtainStyledAttributes.getInt(1, Integer.MAX_VALUE));
            if (i16 != Integer.MAX_VALUE) {
                TextUtils.isEmpty(this.f10159l);
            }
            this.Q0 = i16;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void E(Preference preference) {
        long jLongValue;
        if (this.M0.contains(preference)) {
            return;
        }
        if (preference.f10159l != null) {
            PreferenceGroup preferenceGroup = this;
            while (true) {
                PreferenceGroup preferenceGroup2 = preferenceGroup.Z;
                if (preferenceGroup2 == null) {
                    break;
                } else {
                    preferenceGroup = preferenceGroup2;
                }
            }
            preferenceGroup.F(preference.f10159l);
        }
        int i14 = preference.f10153g;
        if (i14 == Integer.MAX_VALUE) {
            if (this.N0) {
                int i15 = this.O0;
                this.O0 = i15 + 1;
                if (i15 != i14) {
                    preference.f10153g = i15;
                    c cVar = preference.X;
                    if (cVar != null) {
                        Handler handler = cVar.f10210e;
                        c.a aVar = cVar.f10211f;
                        handler.removeCallbacks(aVar);
                        handler.post(aVar);
                    }
                }
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).N0 = this.N0;
            }
        }
        int iBinarySearch = Collections.binarySearch(this.M0, preference);
        if (iBinarySearch < 0) {
            iBinarySearch = (iBinarySearch * (-1)) - 1;
        }
        boolean zB = B();
        if (preference.f10170y == zB) {
            preference.f10170y = !zB;
            preference.j(preference.B());
            preference.i();
        }
        synchronized (this) {
            this.M0.add(iBinarySearch, preference);
        }
        f fVar = this.f10148b;
        String str = preference.f10159l;
        if (str == null || !this.K0.containsKey(str)) {
            synchronized (fVar) {
                jLongValue = fVar.f17489b;
                fVar.f17489b = 1 + jLongValue;
            }
        } else {
            jLongValue = this.K0.get(str).longValue();
            this.K0.remove(str);
        }
        preference.f10149c = jLongValue;
        preference.f10150d = true;
        try {
            preference.l(fVar);
            preference.f10150d = false;
            if (preference.Z != null) {
                h.z("This preference already has a parent. You must remove the existing parent before assigning a new one.");
                return;
            }
            preference.Z = this;
            if (this.P0) {
                preference.k();
            }
            c cVar2 = this.X;
            if (cVar2 != null) {
                Handler handler2 = cVar2.f10210e;
                c.a aVar2 = cVar2.f10211f;
                handler2.removeCallbacks(aVar2);
                handler2.post(aVar2);
            }
        } catch (Throwable th3) {
            preference.f10150d = false;
            throw th3;
        }
    }

    public final <T extends Preference> T F(CharSequence charSequence) {
        T t7;
        if (charSequence == null) {
            h.s("Key cannot be null");
            return null;
        }
        if (TextUtils.equals(this.f10159l, charSequence)) {
            return this;
        }
        int size = this.M0.size();
        for (int i14 = 0; i14 < size; i14++) {
            PreferenceGroup preferenceGroup = (T) G(i14);
            if (TextUtils.equals(preferenceGroup.f10159l, charSequence)) {
                return preferenceGroup;
            }
            if ((preferenceGroup instanceof PreferenceGroup) && (t7 = (T) preferenceGroup.F(charSequence)) != null) {
                return t7;
            }
        }
        return null;
    }

    public final Preference G(int i14) {
        return (Preference) this.M0.get(i14);
    }

    public final void H(Preference preference) {
        synchronized (this) {
            try {
                preference.D();
                if (preference.Z == this) {
                    preference.Z = null;
                }
                if (this.M0.remove(preference)) {
                    String str = preference.f10159l;
                    if (str != null) {
                        this.K0.put(str, Long.valueOf(preference.d()));
                        this.L0.removeCallbacks(this.R0);
                        this.L0.post(this.R0);
                    }
                    if (this.P0) {
                        preference.o();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        c cVar = this.X;
        if (cVar != null) {
            Handler handler = cVar.f10210e;
            c.a aVar = cVar.f10211f;
            handler.removeCallbacks(aVar);
            handler.post(aVar);
        }
    }

    @Override // androidx.preference.Preference
    public final void b(Bundle bundle) {
        super.b(bundle);
        int size = this.M0.size();
        for (int i14 = 0; i14 < size; i14++) {
            G(i14).b(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void c(Bundle bundle) {
        super.c(bundle);
        int size = this.M0.size();
        for (int i14 = 0; i14 < size; i14++) {
            G(i14).c(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void j(boolean z14) {
        super.j(z14);
        int size = this.M0.size();
        for (int i14 = 0; i14 < size; i14++) {
            Preference preferenceG = G(i14);
            if (preferenceG.f10170y == z14) {
                preferenceG.f10170y = !z14;
                preferenceG.j(preferenceG.B());
                preferenceG.i();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void k() {
        super.k();
        this.P0 = true;
        int size = this.M0.size();
        for (int i14 = 0; i14 < size; i14++) {
            G(i14).k();
        }
    }

    @Override // androidx.preference.Preference
    public final void o() {
        D();
        this.P0 = false;
        int size = this.M0.size();
        for (int i14 = 0; i14 < size; i14++) {
            G(i14).o();
        }
    }

    @Override // androidx.preference.Preference
    public final void q(Parcelable parcelable) {
        if (!parcelable.getClass().equals(b.class)) {
            super.q(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        this.Q0 = bVar.f10175a;
        super.q(bVar.getSuperState());
    }

    @Override // androidx.preference.Preference
    public final Parcelable r() {
        super.r();
        return new b(AbsSavedState.EMPTY_STATE, this.Q0);
    }

    public static class b extends Preference.b {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10175a;

        public class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        public b(Parcel parcel) {
            super(parcel);
            this.f10175a = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            super.writeToParcel(parcel, i14);
            parcel.writeInt(this.f10175a);
        }

        public b(Parcelable parcelable, int i14) {
            super(parcelable);
            this.f10175a = i14;
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i14) {
        this(context, attributeSet, i14, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
