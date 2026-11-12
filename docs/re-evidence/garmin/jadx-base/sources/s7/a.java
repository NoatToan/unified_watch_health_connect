package s7;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public abstract class a implements Parcelable {
    private final Parcelable mSuperState;
    public static final a EMPTY_STATE = new C2980a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* JADX INFO: renamed from: s7.a$a, reason: collision with other inner class name */
    public class C2980a extends a {
        public C2980a() {
            super((C2980a) null);
        }
    }

    public a(Parcelable parcelable) {
        if (parcelable != null) {
            this.mSuperState = parcelable == EMPTY_STATE ? null : parcelable;
        } else {
            h.s("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Parcelable getSuperState() {
        return this.mSuperState;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        parcel.writeParcelable(this.mSuperState, i14);
    }

    public class b implements Parcelable.ClassLoaderCreator<a> {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable(null) == null) {
                return a.EMPTY_STATE;
            }
            h.z("superState must be null");
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i14) {
            return new a[i14];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.EMPTY_STATE;
            }
            h.z("superState must be null");
            return null;
        }
    }

    private a() {
        this.mSuperState = null;
    }

    public /* synthetic */ a(C2980a c2980a) {
        this();
    }

    public a(Parcel parcel) {
        this(parcel, null);
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.mSuperState = parcelable == null ? EMPTY_STATE : parcelable;
    }
}
