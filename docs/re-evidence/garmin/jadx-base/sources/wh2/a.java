package wh2;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lwh2/a;", "Landroid/os/Parcelable;", "", "name", "Lwh2/c;", "security", "password", "", "passwordIsHex", "<init>", "(Ljava/lang/String;Lwh2/c;Ljava/lang/String;Z)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C3436a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f185261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f185262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f185263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f185264d;

    /* JADX INFO: renamed from: wh2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C3436a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readString(), c.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(String str, c cVar, String str2, boolean z14) {
        str.getClass();
        cVar.getClass();
        this.f185261a = str;
        this.f185262b = cVar;
        this.f185263c = str2;
        this.f185264d = z14;
    }

    public static a b(a aVar, String str, c cVar, String str2, boolean z14, int i14) {
        if ((i14 & 1) != 0) {
            str = aVar.f185261a;
        }
        if ((i14 & 2) != 0) {
            cVar = aVar.f185262b;
        }
        if ((i14 & 4) != 0) {
            str2 = aVar.f185263c;
        }
        if ((i14 & 8) != 0) {
            z14 = aVar.f185264d;
        }
        aVar.getClass();
        str.getClass();
        cVar.getClass();
        return new a(str, cVar, str2, z14);
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
        return s.g(this.f185261a, aVar.f185261a) && this.f185262b == aVar.f185262b && s.g(this.f185263c, aVar.f185263c) && this.f185264d == aVar.f185264d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    public final int hashCode() {
        int iHashCode = (this.f185262b.hashCode() + (this.f185261a.hashCode() * 31)) * 31;
        String str = this.f185263c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z14 = this.f185264d;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        return iHashCode2 + r14;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("WifiNetwork(name=");
        sb3.append(this.f185261a);
        sb3.append(", security=");
        sb3.append(this.f185262b);
        sb3.append(", password=");
        return j.n(this.f185263c, ", passwordIsHex=", ")", sb3, this.f185264d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f185261a);
        parcel.writeString(this.f185262b.name());
        parcel.writeString(this.f185263c);
        parcel.writeInt(this.f185264d ? 1 : 0);
    }

    public /* synthetic */ a(String str, c cVar, String str2, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, cVar, str2, (i14 & 8) != 0 ? false : z14);
    }
}
