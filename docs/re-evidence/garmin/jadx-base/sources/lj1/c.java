package lj1;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Llj1/c;", "Landroid/os/Parcelable;", "", "displayName", "bleMacAddr", "btcMacAddr", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f113051c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(String str, String str2, String str3, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f113049a, cVar.f113049a) && s.g(this.f113050b, cVar.f113050b) && s.g(this.f113051c, cVar.f113051c);
    }

    public final int hashCode() {
        int iHashCode = this.f113049a.hashCode() * 31;
        String str = this.f113050b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f113051c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return am.j.o(this.f113051c, ")", p6.b.i("RemovedDeviceDTO(displayName=", this.f113049a, ", bleMacAddr=", this.f113050b, ", btcMacAddr="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f113049a);
        parcel.writeString(this.f113050b);
        parcel.writeString(this.f113051c);
    }

    public c(String str, String str2, String str3) {
        str.getClass();
        this.f113049a = str;
        this.f113050b = str2;
        this.f113051c = str3;
    }
}
