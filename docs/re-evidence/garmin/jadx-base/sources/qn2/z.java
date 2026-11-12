package qn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lqn2/z;", "Lpn2/d;", "", "walletAppName", "walletAppVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getWalletAppName", "()Ljava/lang/String;", "setWalletAppName", "(Ljava/lang/String;)V", "b", "getWalletAppVersion", "setWalletAppVersion", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class z implements pn2.d {
    public static final Parcelable.Creator<z> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("walletAppName")
    private String walletAppName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("walletAppVersion")
    private String walletAppVersion;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<z> {
        @Override // android.os.Parcelable.Creator
        public final z createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new z(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final z[] newArray(int i14) {
            return new z[i14];
        }
    }

    public z(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.walletAppName = str;
        this.walletAppVersion = str2;
        int length = str.length();
        if (1 > length || length >= 256) {
            vb.h.x(am.j.h(this.walletAppName.length(), "walletAppName length(1-255): "));
            throw null;
        }
        int length2 = this.walletAppVersion.length();
        if (1 > length2 || length2 >= 256) {
            vb.h.x(am.j.h(this.walletAppVersion.length(), "walletAppVersion length(1-255): "));
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return p005kotlin.jvm.internal.s.g(this.walletAppName, zVar.walletAppName) && p005kotlin.jvm.internal.s.g(this.walletAppVersion, zVar.walletAppVersion);
    }

    public final int hashCode() {
        return this.walletAppVersion.hashCode() + (this.walletAppName.hashCode() * 31);
    }

    public final String toString() {
        return e0.g("FNWalletAppInfoDto(walletAppName='", this.walletAppName, "', walletAppVersion='", this.walletAppVersion, "')");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.walletAppName);
        parcel.writeString(this.walletAppVersion);
    }
}
