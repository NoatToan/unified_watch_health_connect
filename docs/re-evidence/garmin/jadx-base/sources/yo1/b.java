package yo1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\"\u0010\u0016¨\u0006#"}, d2 = {"Lyo1/b;", "Landroid/os/Parcelable;", "", "awardTypeId", "", "title", "description", "imageURI", "imageLargeURI", "", "winnerUserPk", "", "winningValue", "winningValueUnit", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JDLjava/lang/String;)V", "a", "I", "b", "()I", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "c", "d", "g", JWKParameterNames.RSA_EXPONENT, "f", "J", IntegerTokenConverter.CONVERTER_KEY, "()J", "D", "j", "()D", JWKParameterNames.OCT_KEY_VALUE, "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f198415i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("awardTypeId")
    private final int awardTypeId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("title")
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("description")
    private final String description;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("imageURI")
    private final String imageURI;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("imageLargeURI")
    private final String imageLargeURI;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("winnerUserPk")
    private final long winnerUserPk;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("winningValue")
    private final double winningValue;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("winningValueUnit")
    private final String winningValueUnit;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readDouble(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(int i14, String str, String str2, String str3, String str4, long j8, double d14, String str5) {
        str.getClass();
        str3.getClass();
        this.awardTypeId = i14;
        this.title = str;
        this.description = str2;
        this.imageURI = str3;
        this.imageLargeURI = str4;
        this.winnerUserPk = j8;
        this.winningValue = d14;
        this.winningValueUnit = str5;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getAwardTypeId() {
        return this.awardTypeId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDescription() {
        return this.description;
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
        return this.awardTypeId == bVar.awardTypeId && s.g(this.title, bVar.title) && s.g(this.description, bVar.description) && s.g(this.imageURI, bVar.imageURI) && s.g(this.imageLargeURI, bVar.imageLargeURI) && this.winnerUserPk == bVar.winnerUserPk && Double.compare(this.winningValue, bVar.winningValue) == 0 && s.g(this.winningValueUnit, bVar.winningValueUnit);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getImageLargeURI() {
        return this.imageLargeURI;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getImageURI() {
        return this.imageURI;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iJ = wr.g.j(Integer.hashCode(this.awardTypeId) * 31, 31, this.title);
        String str = this.description;
        int iJ2 = wr.g.j((iJ + (str == null ? 0 : str.hashCode())) * 31, 31, this.imageURI);
        String str2 = this.imageLargeURI;
        int iB = org.apache.commons.lang3.e.b(q6.f.e((iJ2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.winnerUserPk), 31, this.winningValue);
        String str3 = this.winningValueUnit;
        return iB + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getWinnerUserPk() {
        return this.winnerUserPk;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final double getWinningValue() {
        return this.winningValue;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getWinningValueUnit() {
        return this.winningValueUnit;
    }

    public final String toString() {
        int i14 = this.awardTypeId;
        String str = this.title;
        String str2 = this.description;
        String str3 = this.imageURI;
        String str4 = this.imageLargeURI;
        long j8 = this.winnerUserPk;
        double d14 = this.winningValue;
        String str5 = this.winningValueUnit;
        StringBuilder sbR = wr.g.r(i14, "SocialGroupRideAwardDTO(awardTypeId=", ", title=", str, ", description=");
        sn.a.t(sbR, str2, ", imageURI=", str3, ", imageLargeURI=");
        e5.s(j8, str4, ", winnerUserPk=", sbR);
        am.j.x(sbR, ", winningValue=", d14, ", winningValueUnit=");
        return am.j.o(str5, ")", sbR);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.awardTypeId);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.imageURI);
        parcel.writeString(this.imageLargeURI);
        parcel.writeLong(this.winnerUserPk);
        parcel.writeDouble(this.winningValue);
        parcel.writeString(this.winningValueUnit);
    }
}
