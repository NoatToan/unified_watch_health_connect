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
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import defpackage.p3j;
import defpackage.p5q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleArrayMap<String, Long> f2742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f2743b;
    public final List<Preference> c;
    public boolean d;
    public int e;
    public boolean f;
    public int g;
    public final Runnable h;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                PreferenceGroup.this.f2742a.clear();
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface b {
    }

    public interface c {
        int b(Preference preference);

        int e(String str);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f2742a = new SimpleArrayMap<>();
        this.f2743b = new Handler(Looper.getMainLooper());
        this.d = true;
        this.e = 0;
        this.f = false;
        this.g = Integer.MAX_VALUE;
        this.h = new a();
        this.c = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p3j.E0, i, i2);
        int i3 = p3j.G0;
        this.d = p5q.b(typedArrayObtainStyledAttributes, i3, i3, true);
        if (typedArrayObtainStyledAttributes.hasValue(p3j.F0)) {
            int i4 = p3j.F0;
            u(p5q.d(typedArrayObtainStyledAttributes, i4, i4, Integer.MAX_VALUE));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void dispatchRestoreInstanceState(Bundle bundle) {
        super.dispatchRestoreInstanceState(bundle);
        int iN = n();
        for (int i = 0; i < iN; i++) {
            m(i).dispatchRestoreInstanceState(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public void dispatchSaveInstanceState(Bundle bundle) {
        super.dispatchSaveInstanceState(bundle);
        int iN = n();
        for (int i = 0; i < iN; i++) {
            m(i).dispatchSaveInstanceState(bundle);
        }
    }

    public void e(Preference preference) {
        h(preference);
    }

    public boolean h(Preference preference) {
        long jD;
        if (this.c.contains(preference)) {
            return true;
        }
        if (preference.getKey() != null) {
            PreferenceGroup parent = this;
            while (parent.getParent() != null) {
                parent = parent.getParent();
            }
            String key = preference.getKey();
            if (parent.i(key) != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Found duplicated key: \"");
                sb.append(key);
                sb.append("\". This can cause unintended behaviour, please use unique keys for every preference.");
            }
        }
        if (preference.getOrder() == Integer.MAX_VALUE) {
            if (this.d) {
                int i = this.e;
                this.e = i + 1;
                preference.setOrder(i);
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).w(this.d);
            }
        }
        int iBinarySearch = Collections.binarySearch(this.c, preference);
        if (iBinarySearch < 0) {
            iBinarySearch = (iBinarySearch * (-1)) - 1;
        }
        if (!p(preference)) {
            return false;
        }
        synchronized (this) {
            this.c.add(iBinarySearch, preference);
        }
        androidx.preference.b preferenceManager = getPreferenceManager();
        String key2 = preference.getKey();
        if (key2 == null || !this.f2742a.containsKey(key2)) {
            jD = preferenceManager.d();
        } else {
            jD = this.f2742a.get(key2).longValue();
            this.f2742a.remove(key2);
        }
        preference.onAttachedToHierarchy(preferenceManager, jD);
        preference.assignParent(this);
        if (this.f) {
            preference.onAttached();
        }
        notifyHierarchyChanged();
        return true;
    }

    public <T extends Preference> T i(CharSequence charSequence) {
        T t;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(getKey(), charSequence)) {
            return this;
        }
        int iN = n();
        for (int i = 0; i < iN; i++) {
            PreferenceGroup preferenceGroup = (T) m(i);
            if (TextUtils.equals(preferenceGroup.getKey(), charSequence)) {
                return preferenceGroup;
            }
            if ((preferenceGroup instanceof PreferenceGroup) && (t = (T) preferenceGroup.i(charSequence)) != null) {
                return t;
            }
        }
        return null;
    }

    public int k() {
        return this.g;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public b l() {
        return null;
    }

    public Preference m(int i) {
        return this.c.get(i);
    }

    public int n() {
        return this.c.size();
    }

    @Override // androidx.preference.Preference
    public void notifyDependencyChange(boolean z) {
        super.notifyDependencyChange(z);
        int iN = n();
        for (int i = 0; i < iN; i++) {
            m(i).onParentChanged(this, z);
        }
    }

    public boolean o() {
        return true;
    }

    @Override // androidx.preference.Preference
    public void onAttached() {
        super.onAttached();
        this.f = true;
        int iN = n();
        for (int i = 0; i < iN; i++) {
            m(i).onAttached();
        }
    }

    @Override // androidx.preference.Preference
    public void onDetached() {
        super.onDetached();
        this.f = false;
        int iN = n();
        for (int i = 0; i < iN; i++) {
            m(i).onDetached();
        }
    }

    @Override // androidx.preference.Preference
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.g = savedState.f2744a;
        super.onRestoreInstanceState(savedState.getSuperState());
    }

    @Override // androidx.preference.Preference
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.g);
    }

    public boolean p(Preference preference) {
        preference.onParentChanged(this, shouldDisableDependents());
        return true;
    }

    public boolean r(Preference preference) {
        boolean zS = s(preference);
        notifyHierarchyChanged();
        return zS;
    }

    public final boolean s(Preference preference) {
        boolean zRemove;
        synchronized (this) {
            try {
                preference.onPrepareForRemoval();
                if (preference.getParent() == this) {
                    preference.assignParent(null);
                }
                zRemove = this.c.remove(preference);
                if (zRemove) {
                    String key = preference.getKey();
                    if (key != null) {
                        this.f2742a.put(key, Long.valueOf(preference.getId()));
                        this.f2743b.removeCallbacks(this.h);
                        this.f2743b.post(this.h);
                    }
                    if (this.f) {
                        preference.onDetached();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zRemove;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setOnExpandButtonClickListener(b bVar) {
    }

    public void u(int i) {
        if (i != Integer.MAX_VALUE && !hasKey()) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" should have a key defined if it contains an expandable preference");
        }
        this.g = i;
    }

    public void w(boolean z) {
        this.d = z;
    }

    public void x() {
        synchronized (this) {
            Collections.sort(this.c);
        }
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2744a;

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
            this.f2744a = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2744a);
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f2744a = i;
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
