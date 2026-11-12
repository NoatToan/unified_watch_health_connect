package l90;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ll90/d;", "Landroid/os/Parcelable;", "", "deviceUnitId", "", "deviceProductNumber", "deviceApplicationKey", "", "qrCodePairing", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Z)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f111537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f111539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f111540d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public d(Long l14, String str, String str2, boolean z14) {
        this.f111537a = l14;
        this.f111538b = str;
        this.f111539c = str2;
        this.f111540d = z14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f111537a, dVar.f111537a) && s.g(this.f111538b, dVar.f111538b) && s.g(this.f111539c, dVar.f111539c) && this.f111540d == dVar.f111540d;
    }

    public final int hashCode() {
        Long l14 = this.f111537a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.f111538b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f111539c;
        return Boolean.hashCode(this.f111540d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return am.j.n(this.f111539c, ", qrCodePairing=", ")", b71.i.j("DeviceFilterInfo(deviceUnitId=", ", deviceProductNumber=", this.f111538b, this.f111537a, ", deviceApplicationKey="), this.f111540d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.f111537a;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.f111538b);
        parcel.writeString(this.f111539c);
        parcel.writeInt(this.f111540d ? 1 : 0);
    }

    public /* synthetic */ d(Long l14, String str, String str2, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(l14, str, str2, (i14 & 8) != 0 ? false : z14);
    }
}
