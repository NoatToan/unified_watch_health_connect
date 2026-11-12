package sn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lsn2/b;", "Landroid/os/Parcelable;", "", "accessToken", "externalAccountId", "", "", "devices", "externalUserName", "accessTokenExpirationTSMillis", "userId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "f", "c", "Ljava/util/Set;", "getDevices", "()Ljava/util/Set;", "d", "getExternalUserName", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Long;", "()Ljava/lang/Long;", "getUserId", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("accessToken")
    private final String accessToken;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("externalAccountId")
    private final String externalAccountId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("devices")
    private final Set<Long> devices;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("externalUserId")
    private final String externalUserName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("accessTokenExpirationTS")
    private final Long accessTokenExpirationTSMillis;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userId")
    private final Long userId;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            LinkedHashSet linkedHashSet;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashSet = null;
            } else {
                int i14 = parcel.readInt();
                linkedHashSet = new LinkedHashSet(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    linkedHashSet.add(Long.valueOf(parcel.readLong()));
                }
            }
            return new b(string, string2, linkedHashSet, parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(String str, String str2, Set<Long> set, String str3, Long l14, Long l15) {
        this.accessToken = str;
        this.externalAccountId = str2;
        this.devices = set;
        this.externalUserName = str3;
        this.accessTokenExpirationTSMillis = l14;
        this.userId = l15;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getAccessTokenExpirationTSMillis() {
        return this.accessTokenExpirationTSMillis;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.accessToken, bVar.accessToken) && s.g(this.externalAccountId, bVar.externalAccountId) && s.g(this.devices, bVar.devices) && s.g(this.externalUserName, bVar.externalUserName) && s.g(this.accessTokenExpirationTSMillis, bVar.accessTokenExpirationTSMillis) && s.g(this.userId, bVar.userId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getExternalAccountId() {
        return this.externalAccountId;
    }

    public final int hashCode() {
        String str = this.accessToken;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.externalAccountId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Set<Long> set = this.devices;
        int iHashCode3 = (iHashCode2 + (set == null ? 0 : set.hashCode())) * 31;
        String str3 = this.externalUserName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l14 = this.accessTokenExpirationTSMillis;
        int iHashCode5 = (iHashCode4 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.userId;
        return iHashCode5 + (l15 != null ? l15.hashCode() : 0);
    }

    public final String toString() {
        String str = this.accessToken;
        String str2 = this.externalAccountId;
        Set<Long> set = this.devices;
        String str3 = this.externalUserName;
        Long l14 = this.accessTokenExpirationTSMillis;
        Long l15 = this.userId;
        StringBuilder sbI = p6.b.i("FitPayAccountDto(accessToken=", str, ", externalAccountId=", str2, ", devices=");
        sbI.append(set);
        sbI.append(", externalUserName=");
        sbI.append(str3);
        sbI.append(", accessTokenExpirationTSMillis=");
        sbI.append(l14);
        sbI.append(", userId=");
        sbI.append(l15);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.accessToken);
        parcel.writeString(this.externalAccountId);
        Set<Long> set = this.devices;
        if (set == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(set.size());
            Iterator<Long> it = set.iterator();
            while (it.hasNext()) {
                parcel.writeLong(it.next().longValue());
            }
        }
        parcel.writeString(this.externalUserName);
        Long l14 = this.accessTokenExpirationTSMillis;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Long l15 = this.userId;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
    }
}
