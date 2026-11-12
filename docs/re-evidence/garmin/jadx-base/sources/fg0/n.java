package fg0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000f¨\u0006\u001a"}, d2 = {"Lfg0/n;", "Landroid/os/Parcelable;", "", "eventsProviderKey", "eventsProviderName", "Lgg0/j;", "verifiedStatus", "logoURL", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lgg0/j;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "setEventsProviderKey", "(Ljava/lang/String;)V", "d", "setEventsProviderName", "c", "Lgg0/j;", "g", "()Lgg0/j;", "setVerifiedStatus", "(Lgg0/j;)V", "f", "setLogoURL", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventsProviderKey")
    private String eventsProviderKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventsProviderName")
    private String eventsProviderName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("verifiedStatus")
    private gg0.j verifiedStatus;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("logoURL")
    private String logoURL;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        public final n createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new n(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : gg0.j.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final n[] newArray(int i14) {
            return new n[i14];
        }
    }

    public /* synthetic */ n(String str, String str2, gg0.j jVar, String str3, int i14, p005kotlin.jvm.internal.j jVar2) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : jVar, (i14 & 8) != 0 ? null : str3);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEventsProviderKey() {
        return this.eventsProviderKey;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getEventsProviderName() {
        return this.eventsProviderName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return p005kotlin.jvm.internal.s.g(this.eventsProviderKey, nVar.eventsProviderKey) && p005kotlin.jvm.internal.s.g(this.eventsProviderName, nVar.eventsProviderName) && this.verifiedStatus == nVar.verifiedStatus && p005kotlin.jvm.internal.s.g(this.logoURL, nVar.logoURL);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getLogoURL() {
        return this.logoURL;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final gg0.j getVerifiedStatus() {
        return this.verifiedStatus;
    }

    public final int hashCode() {
        String str = this.eventsProviderKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.eventsProviderName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        gg0.j jVar = this.verifiedStatus;
        int iHashCode3 = (iHashCode2 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        String str3 = this.logoURL;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.eventsProviderKey;
        String str2 = this.eventsProviderName;
        gg0.j jVar = this.verifiedStatus;
        String str3 = this.logoURL;
        StringBuilder sbI = p6.b.i("EventProviderDTO(eventsProviderKey=", str, ", eventsProviderName=", str2, ", verifiedStatus=");
        sbI.append(jVar);
        sbI.append(", logoURL=");
        sbI.append(str3);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.eventsProviderKey);
        parcel.writeString(this.eventsProviderName);
        gg0.j jVar = this.verifiedStatus;
        if (jVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(jVar.name());
        }
        parcel.writeString(this.logoURL);
    }

    public n(String str, String str2, gg0.j jVar, String str3) {
        this.eventsProviderKey = str;
        this.eventsProviderName = str2;
        this.verifiedStatus = jVar;
        this.logoURL = str3;
    }

    public n() {
        this(null, null, null, null, 15, null);
    }
}
