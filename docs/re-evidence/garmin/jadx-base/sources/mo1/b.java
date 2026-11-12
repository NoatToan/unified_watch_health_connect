package mo1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.userprofile.model.ConnectionRequestDTO;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b(\b\u0017\u0018\u00002\u00020\u0001Bw\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0014\u001a\u0004\b$\u0010\u0016R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b%\u0010\u001fR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b\u000e\u0010.\"\u0004\b/\u00100R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u00067"}, d2 = {"Lmo1/b;", "Landroid/os/Parcelable;", "", "uuid", "", "createdDate", "displayName", "fullName", "conversationCommentLikePk", "userProfilePk", "profileImageUrl", "Lcom/garmin/android/apps/connectmobile/userprofile/model/ConnectionRequestDTO;", "connectionRequestDTO", "", "isUserPremium", "", "userConnectionStatus", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/userprofile/model/ConnectionRequestDTO;ZLjava/lang/Integer;)V", "a", "Ljava/lang/String;", "getUuid", "()Ljava/lang/String;", "b", "Ljava/lang/Long;", "getCreatedDate", "()Ljava/lang/Long;", "c", "getDisplayName", "d", "setFullName", "(Ljava/lang/String;)V", JWKParameterNames.RSA_EXPONENT, "J", "getConversationCommentLikePk", "()J", "f", "g", "h", "Lcom/garmin/android/apps/connectmobile/userprofile/model/ConnectionRequestDTO;", "getConnectionRequestDTO", "()Lcom/garmin/android/apps/connectmobile/userprofile/model/ConnectionRequestDTO;", "setConnectionRequestDTO", "(Lcom/garmin/android/apps/connectmobile/userprofile/model/ConnectionRequestDTO;)V", IntegerTokenConverter.CONVERTER_KEY, "Z", "()Z", "setUserPremium", "(Z)V", "j", "Ljava/lang/Integer;", "getUserConnectionStatus", "()Ljava/lang/Integer;", "setUserConnectionStatus", "(Ljava/lang/Integer;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("conversationCommentUuid")
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
    @SerializedName("conversationCommentLikePk")
    private final long conversationCommentLikePk;

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
    @SerializedName("isUserPremium")
    private boolean isUserPremium;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userConnectionStatus")
    private Integer userConnectionStatus;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            Long lValueOf;
            Integer num;
            boolean z14;
            Integer numValueOf;
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
            String string5 = parcel.readString();
            ConnectionRequestDTO connectionRequestDTO = (ConnectionRequestDTO) parcel.readParcelable(b.class.getClassLoader());
            boolean z15 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolean z16 = z15;
                numValueOf = num2;
                z14 = z16;
            } else {
                z14 = z15;
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new b(string, lValueOf, string2, string3, j8, string4, string5, connectionRequestDTO, z14, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(String str, Long l14, String str2, String str3, long j8, String str4, String str5, ConnectionRequestDTO connectionRequestDTO, boolean z14, Integer num, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : l14, (i14 & 4) != 0 ? "" : str2, (i14 & 8) != 0 ? "" : str3, (i14 & 16) != 0 ? 0L : j8, (i14 & 32) != 0 ? null : str4, (i14 & 64) != 0 ? null : str5, (i14 & 128) != 0 ? null : connectionRequestDTO, (i14 & 256) != 0 ? false : z14, (i14 & 512) != 0 ? null : num);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getUserProfilePk() {
        return this.userProfilePk;
    }

    public final void g(String str) {
        this.profileImageUrl = str;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
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
        parcel.writeLong(this.conversationCommentLikePk);
        parcel.writeString(this.userProfilePk);
        parcel.writeString(this.profileImageUrl);
        parcel.writeParcelable(this.connectionRequestDTO, i14);
        parcel.writeInt(this.isUserPremium ? 1 : 0);
        Integer num = this.userConnectionStatus;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
    }

    public b(String str, Long l14, String str2, String str3, long j8, String str4, String str5, ConnectionRequestDTO connectionRequestDTO, boolean z14, Integer num) {
        str2.getClass();
        str3.getClass();
        this.uuid = str;
        this.createdDate = l14;
        this.displayName = str2;
        this.fullName = str3;
        this.conversationCommentLikePk = j8;
        this.userProfilePk = str4;
        this.profileImageUrl = str5;
        this.connectionRequestDTO = connectionRequestDTO;
        this.isUserPremium = z14;
        this.userConnectionStatus = num;
    }

    public b() {
        this(null, null, null, null, 0L, null, null, null, false, null, 1023, null);
    }
}
