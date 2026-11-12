package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class c0 implements Parcelable {
    public static final Parcelable.Creator<c0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f7152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f7153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f7154i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f7155j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f7156k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f7157l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f7158m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f7159n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f7160o;

    public class a implements Parcelable.Creator<c0> {
        @Override // android.os.Parcelable.Creator
        public final c0 createFromParcel(Parcel parcel) {
            return new c0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final c0[] newArray(int i14) {
            return new c0[i14];
        }
    }

    public c0(Parcel parcel) {
        this.f7146a = parcel.readString();
        this.f7147b = parcel.readString();
        this.f7148c = parcel.readInt() != 0;
        this.f7149d = parcel.readInt() != 0;
        this.f7150e = parcel.readInt();
        this.f7151f = parcel.readInt();
        this.f7152g = parcel.readString();
        this.f7153h = parcel.readInt() != 0;
        this.f7154i = parcel.readInt() != 0;
        this.f7155j = parcel.readInt() != 0;
        this.f7156k = parcel.readInt() != 0;
        this.f7157l = parcel.readInt();
        this.f7158m = parcel.readString();
        this.f7159n = parcel.readInt();
        this.f7160o = parcel.readInt() != 0;
    }

    public final Fragment b(q qVar, ClassLoader classLoader) {
        Fragment fragmentInstantiate = qVar.instantiate(classLoader, this.f7146a);
        fragmentInstantiate.mWho = this.f7147b;
        fragmentInstantiate.mFromLayout = this.f7148c;
        fragmentInstantiate.mInDynamicContainer = this.f7149d;
        fragmentInstantiate.mRestored = true;
        fragmentInstantiate.mFragmentId = this.f7150e;
        fragmentInstantiate.mContainerId = this.f7151f;
        fragmentInstantiate.mTag = this.f7152g;
        fragmentInstantiate.mRetainInstance = this.f7153h;
        fragmentInstantiate.mRemoving = this.f7154i;
        fragmentInstantiate.mDetached = this.f7155j;
        fragmentInstantiate.mHidden = this.f7156k;
        fragmentInstantiate.mMaxState = androidx.lifecycle.b0.b.values()[this.f7157l];
        fragmentInstantiate.mTargetWho = this.f7158m;
        fragmentInstantiate.mTargetRequestCode = this.f7159n;
        fragmentInstantiate.mUserVisibleHint = this.f7160o;
        return fragmentInstantiate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder(128);
        sb3.append("FragmentState{");
        sb3.append(this.f7146a);
        sb3.append(" (");
        sb3.append(this.f7147b);
        sb3.append(")}:");
        if (this.f7148c) {
            sb3.append(" fromLayout");
        }
        if (this.f7149d) {
            sb3.append(" dynamicContainer");
        }
        int i14 = this.f7151f;
        if (i14 != 0) {
            sb3.append(" id=0x");
            sb3.append(Integer.toHexString(i14));
        }
        String str = this.f7152g;
        if (str != null && !str.isEmpty()) {
            sb3.append(" tag=");
            sb3.append(str);
        }
        if (this.f7153h) {
            sb3.append(" retainInstance");
        }
        if (this.f7154i) {
            sb3.append(" removing");
        }
        if (this.f7155j) {
            sb3.append(" detached");
        }
        if (this.f7156k) {
            sb3.append(" hidden");
        }
        String str2 = this.f7158m;
        if (str2 != null) {
            sb3.append(" targetWho=");
            sb3.append(str2);
            sb3.append(" targetRequestCode=");
            sb3.append(this.f7159n);
        }
        if (this.f7160o) {
            sb3.append(" userVisibleHint");
        }
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f7146a);
        parcel.writeString(this.f7147b);
        parcel.writeInt(this.f7148c ? 1 : 0);
        parcel.writeInt(this.f7149d ? 1 : 0);
        parcel.writeInt(this.f7150e);
        parcel.writeInt(this.f7151f);
        parcel.writeString(this.f7152g);
        parcel.writeInt(this.f7153h ? 1 : 0);
        parcel.writeInt(this.f7154i ? 1 : 0);
        parcel.writeInt(this.f7155j ? 1 : 0);
        parcel.writeInt(this.f7156k ? 1 : 0);
        parcel.writeInt(this.f7157l);
        parcel.writeString(this.f7158m);
        parcel.writeInt(this.f7159n);
        parcel.writeInt(this.f7160o ? 1 : 0);
    }

    public c0(Fragment fragment) {
        this.f7146a = fragment.getClass().getName();
        this.f7147b = fragment.mWho;
        this.f7148c = fragment.mFromLayout;
        this.f7149d = fragment.mInDynamicContainer;
        this.f7150e = fragment.mFragmentId;
        this.f7151f = fragment.mContainerId;
        this.f7152g = fragment.mTag;
        this.f7153h = fragment.mRetainInstance;
        this.f7154i = fragment.mRemoving;
        this.f7155j = fragment.mDetached;
        this.f7156k = fragment.mHidden;
        this.f7157l = fragment.mMaxState.ordinal();
        this.f7158m = fragment.mTargetWho;
        this.f7159n = fragment.mTargetRequestCode;
        this.f7160o = fragment.mUserVisibleHint;
    }
}
