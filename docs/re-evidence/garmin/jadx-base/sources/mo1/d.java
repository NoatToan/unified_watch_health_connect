package mo1;

import am.c2;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import r1.q2;
import v.e0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\b&\u0010%R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010\f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010-\u001a\u0004\b2\u0010/\"\u0004\b3\u00101R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010\u0017\u001a\u0004\b4\u0010\u0019R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\u0017\u001a\u0004\b5\u0010\u0019R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010\u0017\u001a\u0004\b6\u0010\u0019R$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b7\u0010\u0019\"\u0004\b8\u0010\u001bR$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b?\u0010\u0019¨\u0006@"}, d2 = {"Lmo1/d;", "Landroid/os/Parcelable;", "", "uuid", "", "conversationPK", "createdDate", "lastUpdatedDate", "", "likedByUser", "", "numberOfComments", "numberOfLikes", "ownerDisplayName", "ownerFullName", "ownerProfilePk", "resourceId", "Lam/c2;", "resourceType", "userGroupPk", "<init>", "(Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;ZIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lam/c2;Ljava/lang/String;)V", "a", "Ljava/lang/String;", JWKParameterNames.OCT_KEY_VALUE, "()Ljava/lang/String;", "s", "(Ljava/lang/String;)V", "b", "J", "d", "()J", "m", "(J)V", "c", "Ljava/lang/Long;", "getCreatedDate", "()Ljava/lang/Long;", "getLastUpdatedDate", JWKParameterNames.RSA_EXPONENT, "Z", "f", "()Z", "o", "(Z)V", "I", "g", "()I", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "(I)V", "h", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "getOwnerDisplayName", IntegerTokenConverter.CONVERTER_KEY, "j", "getResourceId", "setResourceId", "l", "Lam/c2;", "getResourceType", "()Lam/c2;", "setResourceType", "(Lam/c2;)V", "getUserGroupPk", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("conversationUuid")
    private String uuid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("conversationPk")
    private long conversationPK;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createdDate")
    private final Long createdDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastUpdatedDate")
    private final Long lastUpdatedDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("likedByUser")
    private boolean likedByUser;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("numberOfComments")
    private int numberOfComments;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("numberOfLikes")
    private int numberOfLikes;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ownerDisplayName")
    private final String ownerDisplayName;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ownerFullName")
    private final String ownerFullName;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ownerProfilePk")
    private final String ownerProfilePk;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("resourceId")
    private String resourceId;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("resourceType")
    private c2 resourceType;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userGroupPk")
    private final String userGroupPk;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            long j8 = parcel.readLong();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            boolean z14 = parcel.readInt() != 0;
            int i14 = parcel.readInt();
            Long l14 = lValueOf2;
            boolean z15 = z14;
            int i15 = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            c2 c2VarValueOf = null;
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                c2VarValueOf = c2.valueOf(parcel.readString());
            }
            return new d(string, j8, lValueOf, l14, z15, i14, i15, string2, string3, string4, string5, c2VarValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public /* synthetic */ d(String str, long j8, Long l14, Long l15, boolean z14, int i14, int i15, String str2, String str3, String str4, String str5, c2 c2Var, String str6, int i16, j jVar) {
        this((i16 & 1) != 0 ? null : str, (i16 & 2) != 0 ? 0L : j8, (i16 & 4) != 0 ? null : l14, (i16 & 8) != 0 ? null : l15, (i16 & 16) != 0 ? false : z14, (i16 & 32) != 0 ? 0 : i14, (i16 & 64) == 0 ? i15 : 0, (i16 & 128) != 0 ? null : str2, (i16 & 256) != 0 ? null : str3, (i16 & 512) != 0 ? null : str4, (i16 & 1024) != 0 ? null : str5, (i16 & 2048) != 0 ? null : c2Var, (i16 & 4096) != 0 ? null : str6);
    }

    public static d b(d dVar, int i14) {
        String str = dVar.uuid;
        long j8 = dVar.conversationPK;
        Long l14 = dVar.createdDate;
        Long l15 = dVar.lastUpdatedDate;
        boolean z14 = dVar.likedByUser;
        int i15 = dVar.numberOfLikes;
        String str2 = dVar.ownerDisplayName;
        String str3 = dVar.ownerFullName;
        String str4 = dVar.ownerProfilePk;
        String str5 = dVar.resourceId;
        c2 c2Var = dVar.resourceType;
        String str6 = dVar.userGroupPk;
        dVar.getClass();
        return new d(str, j8, l14, l15, z14, i14, i15, str2, str3, str4, str5, c2Var, str6);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getConversationPK() {
        return this.conversationPK;
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
        return s.g(this.uuid, dVar.uuid) && this.conversationPK == dVar.conversationPK && s.g(this.createdDate, dVar.createdDate) && s.g(this.lastUpdatedDate, dVar.lastUpdatedDate) && this.likedByUser == dVar.likedByUser && this.numberOfComments == dVar.numberOfComments && this.numberOfLikes == dVar.numberOfLikes && s.g(this.ownerDisplayName, dVar.ownerDisplayName) && s.g(this.ownerFullName, dVar.ownerFullName) && s.g(this.ownerProfilePk, dVar.ownerProfilePk) && s.g(this.resourceId, dVar.resourceId) && this.resourceType == dVar.resourceType && s.g(this.userGroupPk, dVar.userGroupPk);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getLikedByUser() {
        return this.likedByUser;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getNumberOfComments() {
        return this.numberOfComments;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getNumberOfLikes() {
        return this.numberOfLikes;
    }

    public final int hashCode() {
        String str = this.uuid;
        int iE = q6.f.e((str == null ? 0 : str.hashCode()) * 31, 31, this.conversationPK);
        Long l14 = this.createdDate;
        int iHashCode = (iE + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.lastUpdatedDate;
        int iD = q2.d(this.numberOfLikes, q2.d(this.numberOfComments, q6.f.g((iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31, 31, this.likedByUser), 31), 31);
        String str2 = this.ownerDisplayName;
        int iHashCode2 = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ownerFullName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ownerProfilePk;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.resourceId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        c2 c2Var = this.resourceType;
        int iHashCode6 = (iHashCode5 + (c2Var == null ? 0 : c2Var.hashCode())) * 31;
        String str6 = this.userGroupPk;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getOwnerFullName() {
        return this.ownerFullName;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getOwnerProfilePk() {
        return this.ownerProfilePk;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    public final void m(long j8) {
        this.conversationPK = j8;
    }

    public final void o(boolean z14) {
        this.likedByUser = z14;
    }

    public final void q(int i14) {
        this.numberOfComments = i14;
    }

    public final void r(int i14) {
        this.numberOfLikes = i14;
    }

    public final void s(String str) {
        this.uuid = str;
    }

    public final String toString() {
        String str = this.uuid;
        long j8 = this.conversationPK;
        Long l14 = this.createdDate;
        Long l15 = this.lastUpdatedDate;
        boolean z14 = this.likedByUser;
        int i14 = this.numberOfComments;
        int i15 = this.numberOfLikes;
        String str2 = this.ownerDisplayName;
        String str3 = this.ownerFullName;
        String str4 = this.ownerProfilePk;
        String str5 = this.resourceId;
        c2 c2Var = this.resourceType;
        String str6 = this.userGroupPk;
        StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(j8, "ConversationDTO(uuid=", str, ", conversationPK=");
        sbJ.append(", createdDate=");
        sbJ.append(l14);
        sbJ.append(", lastUpdatedDate=");
        sbJ.append(l15);
        sbJ.append(", likedByUser=");
        sbJ.append(z14);
        sbJ.append(", numberOfComments=");
        sbJ.append(i14);
        sbJ.append(", numberOfLikes=");
        sbJ.append(i15);
        sbJ.append(", ownerDisplayName=");
        sbJ.append(str2);
        sn.a.t(sbJ, ", ownerFullName=", str3, ", ownerProfilePk=", str4);
        sbJ.append(", resourceId=");
        sbJ.append(str5);
        sbJ.append(", resourceType=");
        sbJ.append(c2Var);
        return e0.h(sbJ, ", userGroupPk=", str6, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.uuid);
        parcel.writeLong(this.conversationPK);
        Long l14 = this.createdDate;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Long l15 = this.lastUpdatedDate;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeInt(this.likedByUser ? 1 : 0);
        parcel.writeInt(this.numberOfComments);
        parcel.writeInt(this.numberOfLikes);
        parcel.writeString(this.ownerDisplayName);
        parcel.writeString(this.ownerFullName);
        parcel.writeString(this.ownerProfilePk);
        parcel.writeString(this.resourceId);
        c2 c2Var = this.resourceType;
        if (c2Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(c2Var.name());
        }
        parcel.writeString(this.userGroupPk);
    }

    public d(String str, long j8, Long l14, Long l15, boolean z14, int i14, int i15, String str2, String str3, String str4, String str5, c2 c2Var, String str6) {
        this.uuid = str;
        this.conversationPK = j8;
        this.createdDate = l14;
        this.lastUpdatedDate = l15;
        this.likedByUser = z14;
        this.numberOfComments = i14;
        this.numberOfLikes = i15;
        this.ownerDisplayName = str2;
        this.ownerFullName = str3;
        this.ownerProfilePk = str4;
        this.resourceId = str5;
        this.resourceType = c2Var;
        this.userGroupPk = str6;
    }

    public d() {
        this(null, 0L, null, null, false, 0, 0, null, null, null, null, null, null, 8191, null);
    }
}
