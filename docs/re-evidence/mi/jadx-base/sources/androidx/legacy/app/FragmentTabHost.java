package androidx.legacy.app;

import android.R;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
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
    public final ArrayList<a> f2568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f2569b;
    public FragmentManager c;
    public int d;
    public TabHost.OnTabChangeListener e;
    public a f;
    public boolean g;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f2570a;

        public static class a implements Parcelable.Creator<SavedState> {
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
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f2570a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f2570a);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f2570a = parcel.readString();
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<?> f2572b;
        public final Bundle c;
        public Fragment d;
    }

    @Deprecated
    public FragmentTabHost(Context context) {
        super(context, null);
        this.f2568a = new ArrayList<>();
        b(context, null);
    }

    public final FragmentTransaction a(String str, FragmentTransaction fragmentTransaction) {
        Fragment fragment;
        a aVar = null;
        for (int i = 0; i < this.f2568a.size(); i++) {
            a aVar2 = this.f2568a.get(i);
            if (aVar2.f2571a.equals(str)) {
                aVar = aVar2;
            }
        }
        if (aVar == null) {
            throw new IllegalStateException("No tab known for tag " + str);
        }
        if (this.f != aVar) {
            if (fragmentTransaction == null) {
                fragmentTransaction = this.c.beginTransaction();
            }
            a aVar3 = this.f;
            if (aVar3 != null && (fragment = aVar3.d) != null) {
                fragmentTransaction.detach(fragment);
            }
            Fragment fragment2 = aVar.d;
            if (fragment2 == null) {
                Fragment fragmentInstantiate = Fragment.instantiate(this.f2569b, aVar.f2572b.getName(), aVar.c);
                aVar.d = fragmentInstantiate;
                fragmentTransaction.add(this.d, fragmentInstantiate, aVar.f2571a);
            } else {
                fragmentTransaction.attach(fragment2);
            }
            this.f = aVar;
        }
        return fragmentTransaction;
    }

    public final void b(Context context, AttributeSet attributeSet) {
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
        FragmentTransaction fragmentTransactionBeginTransaction = null;
        for (int i = 0; i < this.f2568a.size(); i++) {
            a aVar = this.f2568a.get(i);
            Fragment fragmentFindFragmentByTag = this.c.findFragmentByTag(aVar.f2571a);
            aVar.d = fragmentFindFragmentByTag;
            if (fragmentFindFragmentByTag != null && !fragmentFindFragmentByTag.isDetached()) {
                if (aVar.f2571a.equals(currentTabTag)) {
                    this.f = aVar;
                } else {
                    if (fragmentTransactionBeginTransaction == null) {
                        fragmentTransactionBeginTransaction = this.c.beginTransaction();
                    }
                    fragmentTransactionBeginTransaction.detach(aVar.d);
                }
            }
        }
        this.g = true;
        FragmentTransaction fragmentTransactionA = a(currentTabTag, fragmentTransactionBeginTransaction);
        if (fragmentTransactionA != null) {
            fragmentTransactionA.commit();
            this.c.executePendingTransactions();
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
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f2570a);
    }

    @Override // android.view.View
    @Deprecated
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2570a = getCurrentTabTag();
        return savedState;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @Deprecated
    public void onTabChanged(String str) {
        FragmentTransaction fragmentTransactionA;
        if (this.g && (fragmentTransactionA = a(str, null)) != null) {
            fragmentTransactionA.commit();
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
        this.f2568a = new ArrayList<>();
        b(context, attributeSet);
    }
}
