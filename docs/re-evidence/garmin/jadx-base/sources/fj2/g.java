package fj2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lfj2/g;", "Landroid/os/Parcelable;", "", "name", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reason")
    private final String reason;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new g(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    public /* synthetic */ g(String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final nj2.a.b d() {
        String str = this.name;
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1459599807:
                if (str.equals("lastName")) {
                    return nj2.a.b.LAST_NAME;
                }
                return null;
            case -1192969641:
                if (str.equals("phoneNumber")) {
                    return nj2.a.b.PHONE_NUMBER;
                }
                return null;
            case 3053931:
                if (str.equals("city")) {
                    return nj2.a.b.CITY;
                }
                return null;
            case 109757585:
                if (str.equals(RemoteConfigConstants.ResponseFieldKey.STATE)) {
                    return nj2.a.b.STATE_OR_PROVINCE;
                }
                return null;
            case 132835675:
                if (str.equals("firstName")) {
                    return nj2.a.b.FIRST_NAME;
                }
                return null;
            case 246422313:
                if (str.equals("addressLine1")) {
                    return nj2.a.b.ADDRESS_LINE_1;
                }
                return null;
            case 246422314:
                if (str.equals("addressLine2")) {
                    return nj2.a.b.ADDRESS_LINE_2;
                }
                return null;
            case 957831062:
                if (str.equals("country")) {
                    return nj2.a.b.COUNTRY_REGION;
                }
                return null;
            case 2011152728:
                if (str.equals("postalCode")) {
                    return nj2.a.b.POSTAL_CODE;
                }
                return null;
            default:
                return null;
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
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.name, gVar.name) && s.g(this.reason, gVar.reason);
    }

    public final int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.reason;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return e0.g("InvalidField(name=", this.name, ", reason=", this.reason, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.name);
        parcel.writeString(this.reason);
    }

    public g(String str, String str2) {
        this.name = str;
        this.reason = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
