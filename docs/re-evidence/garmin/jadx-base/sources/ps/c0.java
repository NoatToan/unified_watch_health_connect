package ps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000f¨\u0006\u0019"}, d2 = {"Lps/c0;", "Landroid/os/Parcelable;", "", "appID", "Lps/e0;", "fitContributionsDTO", "iconUrl", "", "internalVersionNumber", "name", "<init>", "(Ljava/lang/String;Lps/e0;Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lps/e0;", "c", "f", "d", "I", "getInternalVersionNumber", "()I", JWKParameterNames.RSA_EXPONENT, "g", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c0 implements Parcelable {
    public static final Parcelable.Creator<c0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.RequestFieldKey.APP_ID)
    private final String appID;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fitContributionsJSON")
    private final e0 fitContributionsDTO;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("iconUrl")
    private final String iconUrl;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("internalVersionNumber")
    private final int internalVersionNumber;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    private final String name;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c0> {
        @Override // android.os.Parcelable.Creator
        public final c0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c0(parcel.readString(), parcel.readInt() == 0 ? null : e0.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final c0[] newArray(int i14) {
            return new c0[i14];
        }
    }

    public /* synthetic */ c0(String str, e0 e0Var, String str2, int i14, String str3, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : e0Var, (i15 & 4) != 0 ? null : str2, (i15 & 8) != 0 ? 0 : i14, (i15 & 16) != 0 ? null : str3);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAppID() {
        return this.appID;
    }

    public final ArrayList d() {
        List<d0> listB;
        String str;
        String str2;
        String str3;
        e0 e0Var = this.fitContributionsDTO;
        if (e0Var == null || (listB = e0Var.b()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(p13.y.r(listB, 10));
        for (d0 d0Var : listB) {
            String strH = ((bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null)).H();
            Map<String, String> map = this.fitContributionsDTO.d().get("default");
            Map<String, String> map2 = this.fitContributionsDTO.d().get(strH);
            if (map2 == null || (str = map2.get(d0Var.getChartTitle())) == null) {
                str = map != null ? map.get(d0Var.getChartTitle()) : null;
            }
            if (map2 == null || (str2 = map2.get(d0Var.getCom.google.firebase.messaging.Constants.ScionAnalytics.PARAM_LABEL java.lang.String())) == null) {
                str2 = map != null ? map.get(d0Var.getCom.google.firebase.messaging.Constants.ScionAnalytics.PARAM_LABEL java.lang.String()) : null;
            }
            if (map2 == null || (str3 = map2.get(d0Var.getUnitLabel())) == null) {
                str3 = map != null ? map.get(d0Var.getUnitLabel()) : null;
            }
            arrayList.add(d0.b(d0Var, str, str2, str3));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return p005kotlin.jvm.internal.s.g(this.appID, c0Var.appID) && p005kotlin.jvm.internal.s.g(this.fitContributionsDTO, c0Var.fitContributionsDTO) && p005kotlin.jvm.internal.s.g(this.iconUrl, c0Var.iconUrl) && this.internalVersionNumber == c0Var.internalVersionNumber && p005kotlin.jvm.internal.s.g(this.name, c0Var.name);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        String str = this.appID;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        e0 e0Var = this.fitContributionsDTO;
        int iHashCode2 = (iHashCode + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        String str2 = this.iconUrl;
        int iD = q2.d(this.internalVersionNumber, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.name;
        return iD + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.appID;
        e0 e0Var = this.fitContributionsDTO;
        String str2 = this.iconUrl;
        int i14 = this.internalVersionNumber;
        String str3 = this.name;
        StringBuilder sb3 = new StringBuilder("ConnectIQAppDTO(appID=");
        sb3.append(str);
        sb3.append(", fitContributionsDTO=");
        sb3.append(e0Var);
        sb3.append(", iconUrl=");
        q6.f.q(i14, str2, ", internalVersionNumber=", ", name=", sb3);
        return am.j.o(str3, ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.appID);
        e0 e0Var = this.fitContributionsDTO;
        if (e0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            e0Var.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.iconUrl);
        parcel.writeInt(this.internalVersionNumber);
        parcel.writeString(this.name);
    }

    public c0(String str, e0 e0Var, String str2, int i14, String str3) {
        this.appID = str;
        this.fitContributionsDTO = e0Var;
        this.iconUrl = str2;
        this.internalVersionNumber = i14;
        this.name = str3;
    }

    public c0() {
        this(null, null, null, 0, null, 31, null);
    }
}
