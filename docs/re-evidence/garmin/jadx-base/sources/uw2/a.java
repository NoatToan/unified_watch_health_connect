package uw2;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Luw2/a;", "Landroid/os/Parcelable;", "", "name", "Luw2/b;", "security", "password", "", "passwordIsHex", "<init>", "(Ljava/lang/String;Luw2/b;Ljava/lang/String;Z)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C3240a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f173023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f173024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f173025d;

    /* JADX INFO: renamed from: uw2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C3240a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readString(), b.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(String str, b bVar, String str2, boolean z14) {
        str.getClass();
        bVar.getClass();
        this.f173022a = str;
        this.f173023b = bVar;
        this.f173024c = str2;
        this.f173025d = z14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f173022a, aVar.f173022a) && this.f173023b == aVar.f173023b && s.g(this.f173024c, aVar.f173024c) && this.f173025d == aVar.f173025d;
    }

    public final int hashCode() {
        int iHashCode = (this.f173023b.hashCode() + (this.f173022a.hashCode() * 31)) * 31;
        String str = this.f173024c;
        return Boolean.hashCode(this.f173025d) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("WifiNetwork(name=");
        sb3.append(this.f173022a);
        sb3.append(", security=");
        sb3.append(this.f173023b);
        sb3.append(", password=");
        return j.n(this.f173024c, ", passwordIsHex=", ")", sb3, this.f173025d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f173022a);
        parcel.writeString(this.f173023b.name());
        parcel.writeString(this.f173024c);
        parcel.writeInt(this.f173025d ? 1 : 0);
    }

    public /* synthetic */ a(String str, b bVar, String str2, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, bVar, str2, (i14 & 8) != 0 ? false : z14);
    }
}
