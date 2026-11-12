package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2366b;
    public final boolean c;
    public final int d;
    public final int e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final Bundle j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f2367k;
    public final int l;
    public Bundle m;

    public class a implements Parcelable.Creator<FragmentState> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }
    }

    public FragmentState(Fragment fragment) {
        this.f2365a = fragment.getClass().getName();
        this.f2366b = fragment.mWho;
        this.c = fragment.mFromLayout;
        this.d = fragment.mFragmentId;
        this.e = fragment.mContainerId;
        this.f = fragment.mTag;
        this.g = fragment.mRetainInstance;
        this.h = fragment.mRemoving;
        this.i = fragment.mDetached;
        this.j = fragment.mArguments;
        this.f2367k = fragment.mHidden;
        this.l = fragment.mMaxState.ordinal();
    }

    public Fragment a(d dVar, ClassLoader classLoader) {
        Fragment fragmentA = dVar.a(classLoader, this.f2365a);
        Bundle bundle = this.j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        fragmentA.setArguments(this.j);
        fragmentA.mWho = this.f2366b;
        fragmentA.mFromLayout = this.c;
        fragmentA.mRestored = true;
        fragmentA.mFragmentId = this.d;
        fragmentA.mContainerId = this.e;
        fragmentA.mTag = this.f;
        fragmentA.mRetainInstance = this.g;
        fragmentA.mRemoving = this.h;
        fragmentA.mDetached = this.i;
        fragmentA.mHidden = this.f2367k;
        fragmentA.mMaxState = Lifecycle.State.values()[this.l];
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            fragmentA.mSavedFragmentState = bundle2;
        } else {
            fragmentA.mSavedFragmentState = new Bundle();
        }
        return fragmentA;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f2365a);
        sb.append(" (");
        sb.append(this.f2366b);
        sb.append(")}:");
        if (this.c) {
            sb.append(" fromLayout");
        }
        if (this.e != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.e));
        }
        String str = this.f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f);
        }
        if (this.g) {
            sb.append(" retainInstance");
        }
        if (this.h) {
            sb.append(" removing");
        }
        if (this.i) {
            sb.append(" detached");
        }
        if (this.f2367k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2365a);
        parcel.writeString(this.f2366b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeBundle(this.j);
        parcel.writeInt(this.f2367k ? 1 : 0);
        parcel.writeBundle(this.m);
        parcel.writeInt(this.l);
    }

    public FragmentState(Parcel parcel) {
        this.f2365a = parcel.readString();
        this.f2366b = parcel.readString();
        this.c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.j = parcel.readBundle();
        this.f2367k = parcel.readInt() != 0;
        this.m = parcel.readBundle();
        this.l = parcel.readInt();
    }
}
