package androidx.fragment.app;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TabHost;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<a> f2368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f2369b;
    public FragmentManager c;
    public int d;
    public TabHost.OnTabChangeListener e;
    public a f;
    public boolean g;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f2370a;

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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f2370a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f2370a);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f2370a = parcel.readString();
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<?> f2372b;
        public final Bundle c;
        public Fragment d;
    }

    @Deprecated
    public FragmentTabHost(Context context) {
        super(context, null);
        this.f2368a = new ArrayList<>();
        c(context, null);
    }

    public final k a(String str, k kVar) {
        Fragment fragment;
        a aVarB = b(str);
        if (this.f != aVarB) {
            if (kVar == null) {
                kVar = this.c.o();
            }
            a aVar = this.f;
            if (aVar != null && (fragment = aVar.d) != null) {
                kVar.q(fragment);
            }
            if (aVarB != null) {
                Fragment fragment2 = aVarB.d;
                if (fragment2 == null) {
                    Fragment fragmentA = this.c.x0().a(this.f2369b.getClassLoader(), aVarB.f2372b.getName());
                    aVarB.d = fragmentA;
                    fragmentA.setArguments(aVarB.c);
                    kVar.c(this.d, aVarB.d, aVarB.f2371a);
                } else {
                    kVar.k(fragment2);
                }
            }
            this.f = aVarB;
        }
        return kVar;
    }

    public final a b(String str) {
        int size = this.f2368a.size();
        for (int i = 0; i < size; i++) {
            a aVar = this.f2368a.get(i);
            if (aVar.f2371a.equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    public final void c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.inflatedId}, 0, 0);
        this.d = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.f2368a.size();
        k kVarO = null;
        for (int i = 0; i < size; i++) {
            a aVar = this.f2368a.get(i);
            Fragment fragmentL0 = this.c.l0(aVar.f2371a);
            aVar.d = fragmentL0;
            if (fragmentL0 != null && !fragmentL0.isDetached()) {
                if (aVar.f2371a.equals(currentTabTag)) {
                    this.f = aVar;
                } else {
                    if (kVarO == null) {
                        kVarO = this.c.o();
                    }
                    kVarO.q(aVar.d);
                }
            }
        }
        this.g = true;
        k kVarA = a(currentTabTag, kVarO);
        if (kVarA != null) {
            kVarA.l();
            this.c.g0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.g = false;
    }

    @Override // android.view.View
    @Deprecated
    public void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f2370a);
    }

    @Override // android.view.View
    @Deprecated
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2370a = getCurrentTabTag();
        return savedState;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @Deprecated
    public void onTabChanged(String str) {
        k kVarA;
        if (this.g && (kVarA = a(str, null)) != null) {
            kVarA.l();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.e;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.e = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Deprecated
    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2368a = new ArrayList<>();
        c(context, attributeSet);
    }
}
