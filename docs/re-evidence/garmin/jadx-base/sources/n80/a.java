package n80;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p6.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ln80/a;", "Landroid/os/Parcelable;", "", "macAddress", "deviceName", "productNumber", "", "bleScan", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C2402a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f124926e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f124929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f124930d;

    /* JADX INFO: renamed from: n80.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2402a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(String str, String str2, String str3, boolean z14, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? false : z14);
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
        return s.g(this.f124927a, aVar.f124927a) && s.g(this.f124928b, aVar.f124928b) && s.g(this.f124929c, aVar.f124929c) && this.f124930d == aVar.f124930d;
    }

    public final int hashCode() {
        int iHashCode = this.f124927a.hashCode() * 31;
        String str = this.f124928b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f124929c;
        return Boolean.hashCode(this.f124930d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return am.j.n(this.f124929c, ", bleScan=", ")", b.i("CompanionDeviceData(macAddress=", this.f124927a, ", deviceName=", this.f124928b, ", productNumber="), this.f124930d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f124927a);
        parcel.writeString(this.f124928b);
        parcel.writeString(this.f124929c);
        parcel.writeInt(this.f124930d ? 1 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String str, String str2) {
        this(str, str2, null, false, 12, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String str, String str2, String str3) {
        this(str, str2, str3, false, 8, null);
        str.getClass();
    }

    public a(String str, String str2, String str3, boolean z14) {
        str.getClass();
        this.f124927a = str;
        this.f124928b = str2;
        this.f124929c = str3;
        this.f124930d = z14;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String str) {
        this(str, null, null, false, 14, null);
        str.getClass();
    }
}
