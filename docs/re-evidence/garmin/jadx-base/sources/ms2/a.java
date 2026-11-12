package ms2;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
public interface a extends Parcelable {

    /* JADX INFO: renamed from: ms2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lms2/a$a;", "Lms2/a;", "", "drawableRes", "<init>", "(I)V", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C2286a implements a {
        public static final Parcelable.Creator<C2286a> CREATOR = new C2287a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f120494a;

        /* JADX INFO: renamed from: ms2.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2287a implements Parcelable.Creator<C2286a> {
            @Override // android.os.Parcelable.Creator
            public final C2286a createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new C2286a(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final C2286a[] newArray(int i14) {
                return new C2286a[i14];
            }
        }

        public C2286a(int i14) {
            this.f120494a = i14;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2286a) && this.f120494a == ((C2286a) obj).f120494a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f120494a);
        }

        public final String toString() {
            return e0.f(this.f120494a, "AppAsset(drawableRes=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(this.f120494a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lms2/a$b;", "Lms2/a;", "", "url", "<init>", "(Ljava/lang/String;)V", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements a {
        public static final Parcelable.Creator<b> CREATOR = new C2288a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f120495a;

        /* JADX INFO: renamed from: ms2.a$b$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2288a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new b(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        public b(String str) {
            str.getClass();
            this.f120495a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f120495a.equals(((b) obj).f120495a);
        }

        public final int hashCode() {
            return this.f120495a.hashCode();
        }

        public final String toString() {
            return j.m("Url(url=", this.f120495a, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f120495a);
        }
    }
}
