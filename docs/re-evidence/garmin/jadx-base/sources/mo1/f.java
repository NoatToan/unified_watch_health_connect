package mo1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.userprofile.model.ConnectionRequestDTO;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0017\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010\u0016R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0014\u001a\u0004\b#\u0010\u0016\"\u0004\b%\u0010\u001fR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b0\u00104¨\u00065"}, d2 = {"Lmo1/f;", "Landroid/os/Parcelable;", "", "uuid", "", "createdDate", "displayName", "fullName", "conversationLikePk", "userProfilePk", "profileImageUrl", "Lcom/garmin/android/apps/connectmobile/userprofile/model/ConnectionRequestDTO;", "connectionRequestDTO", "", "userConnectionStatus", "Lb12/b;", "userProfileImageData", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/userprofile/model/ConnectionRequestDTO;Ljava/lang/Integer;Lb12/b;)V", "a", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "b", "Ljava/lang/Long;", "getCreatedDate", "()Ljava/lang/Long;", "c", "getDisplayName", "d", "setFullName", "(Ljava/lang/String;)V", JWKParameterNames.RSA_EXPONENT, "J", "()J", "f", "g", IntegerTokenConverter.CONVERTER_KEY, "Lcom/garmin/android/apps/connectmobile/userprofile/model/ConnectionRequestDTO;", "getConnectionRequestDTO", "()Lcom/garmin/android/apps/connectmobile/userprofile/model/ConnectionRequestDTO;", "setConnectionRequestDTO", "(Lcom/garmin/android/apps/connectmobile/userprofile/model/ConnectionRequestDTO;)V", "Ljava/lang/Integer;", "getUserConnectionStatus", "()Ljava/lang/Integer;", "setUserConnectionStatus", "(Ljava/lang/Integer;)V", "j", "Lb12/b;", "getUserProfileImageData", "()Lb12/b;", "(Lb12/b;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("conversationUuid")
    private final String uuid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createdDate")
    private final Long createdDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayName")
    private final String displayName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fullName")
    private String fullName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("conversationLikePk")
    private final long conversationLikePk;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePk")
    private final String userProfilePk;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrl")
    private String profileImageUrl;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("connectionRequest")
    private ConnectionRequestDTO connectionRequestDTO;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userConnectionStatus")
    private Integer userConnectionStatus;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfileImageData")
    private b12.b userProfileImageData;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            Long lValueOf;
            Integer num;
            parcel.getClass();
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf = null;
                num = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
                num = null;
            }
            String string2 = parcel.readString();
            Integer num2 = num;
            String string3 = parcel.readString();
            long j8 = parcel.readLong();
            String string4 = parcel.readString();
            Integer numValueOf = num2;
            String string5 = parcel.readString();
            ConnectionRequestDTO connectionRequestDTO = (ConnectionRequestDTO) parcel.readParcelable(f.class.getClassLoader());
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new f(string, lValueOf, string2, string3, j8, string4, string5, connectionRequestDTO, numValueOf, (b12.b) parcel.readParcelable(f.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public /* synthetic */ f(String str, Long l14, String str2, String str3, long j8, String str4, String str5, ConnectionRequestDTO connectionRequestDTO, Integer num, b12.b bVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : l14, (i14 & 4) != 0 ? "" : str2, (i14 & 8) != 0 ? "" : str3, (i14 & 16) != 0 ? 0L : j8, (i14 & 32) != 0 ? null : str4, (i14 & 64) != 0 ? null : str5, (i14 & 128) != 0 ? null : connectionRequestDTO, (i14 & 256) != 0 ? null : num, (i14 & 512) != 0 ? b12.b.f14386g : bVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getConversationLikePk() {
        return this.conversationLikePk;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.uuid, fVar.uuid) && s.g(this.createdDate, fVar.createdDate) && s.g(this.displayName, fVar.displayName) && s.g(this.fullName, fVar.fullName) && this.conversationLikePk == fVar.conversationLikePk && s.g(this.userProfilePk, fVar.userProfilePk) && s.g(this.profileImageUrl, fVar.profileImageUrl) && s.g(this.connectionRequestDTO, fVar.connectionRequestDTO) && s.g(this.userConnectionStatus, fVar.userConnectionStatus) && s.g(this.userProfileImageData, fVar.userProfileImageData);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getUserProfilePk() {
        return this.userProfilePk;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    public final int hashCode() {
        String str = this.uuid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l14 = this.createdDate;
        int iE = q6.f.e(wr.g.j(wr.g.j((iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31, 31, this.displayName), 31, this.fullName), 31, this.conversationLikePk);
        String str2 = this.userProfilePk;
        int iHashCode2 = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.profileImageUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ConnectionRequestDTO connectionRequestDTO = this.connectionRequestDTO;
        int iHashCode4 = (iHashCode3 + (connectionRequestDTO == null ? 0 : connectionRequestDTO.hashCode())) * 31;
        Integer num = this.userConnectionStatus;
        return this.userProfileImageData.hashCode() + ((iHashCode4 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final void i(String str) {
        this.profileImageUrl = str;
    }

    public final void j(b12.b bVar) {
        this.userProfileImageData = bVar;
    }

    public final String toString() {
        String str = this.uuid;
        Long l14 = this.createdDate;
        String str2 = this.displayName;
        String str3 = this.fullName;
        long j8 = this.conversationLikePk;
        String str4 = this.userProfilePk;
        String str5 = this.profileImageUrl;
        ConnectionRequestDTO connectionRequestDTO = this.connectionRequestDTO;
        Integer num = this.userConnectionStatus;
        b12.b bVar = this.userProfileImageData;
        StringBuilder sb3 = new StringBuilder("ConversationLikeDTO(uuid=");
        sb3.append(str);
        sb3.append(", createdDate=");
        sb3.append(l14);
        sb3.append(", displayName=");
        sn.a.t(sb3, str2, ", fullName=", str3, ", conversationLikePk=");
        p6.b.k(j8, ", userProfilePk=", str4, sb3);
        sb3.append(", profileImageUrl=");
        sb3.append(str5);
        sb3.append(", connectionRequestDTO=");
        sb3.append(connectionRequestDTO);
        sb3.append(", userConnectionStatus=");
        sb3.append(num);
        sb3.append(", userProfileImageData=");
        sb3.append(bVar);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.uuid);
        Long l14 = this.createdDate;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.displayName);
        parcel.writeString(this.fullName);
        parcel.writeLong(this.conversationLikePk);
        parcel.writeString(this.userProfilePk);
        parcel.writeString(this.profileImageUrl);
        parcel.writeParcelable(this.connectionRequestDTO, i14);
        Integer num = this.userConnectionStatus;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeParcelable(this.userProfileImageData, i14);
    }

    public f(String str, Long l14, String str2, String str3, long j8, String str4, String str5, ConnectionRequestDTO connectionRequestDTO, Integer num, b12.b bVar) {
        str2.getClass();
        str3.getClass();
        bVar.getClass();
        this.uuid = str;
        this.createdDate = l14;
        this.displayName = str2;
        this.fullName = str3;
        this.conversationLikePk = j8;
        this.userProfilePk = str4;
        this.profileImageUrl = str5;
        this.connectionRequestDTO = connectionRequestDTO;
        this.userConnectionStatus = num;
        this.userProfileImageData = bVar;
    }

    public f() {
        this(null, null, null, null, 0L, null, null, null, null, null, 1023, null);
    }
}
