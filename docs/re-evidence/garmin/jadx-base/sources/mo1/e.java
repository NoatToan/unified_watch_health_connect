package mo1;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.DateDeserializer;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b&\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b)\u0010\u001fR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b*\u0010\u001fR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b+\u00101R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b/\u00104R\u001a\u0010\u0013\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b6\u0010.R\u001a\u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b7\u00109R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u00100\u001a\u0004\b;\u00101R\u001a\u0010\u0017\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010,\u001a\u0004\b2\u0010.R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010\u001d\u001a\u0004\b=\u0010\u001fR \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u00100\u001a\u0004\b>\u00101¨\u0006?"}, d2 = {"Lmo1/e;", "Landroid/os/Parcelable;", "", "conversationCommentUuid", "", "conversationCommentPk", "conversationUuid", "userProfilePk", "authorDisplayName", "authorFullName", "authorImageUrl", "", "authorPro", TtmlNode.TAG_BODY, "", "Lmo1/a;", "commentBlockList", "Ljava/util/Date;", "createDate", "updated", "", "numberOfLikes", "authorRoles", "likedByUser", "resourceId", "likerFullNames", "<init>", "(Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/util/Date;ZILjava/util/List;ZLjava/lang/String;Ljava/util/List;)V", "a", "Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "b", "J", "getConversationCommentPk", "()J", "c", "getConversationUuid", "d", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, JWKParameterNames.RSA_EXPONENT, "f", "g", "h", "Z", "getAuthorPro", "()Z", "j", "Ljava/util/List;", "()Ljava/util/List;", JWKParameterNames.OCT_KEY_VALUE, "Ljava/util/Date;", "()Ljava/util/Date;", "l", "o", "m", "I", "()I", JWKParameterNames.RSA_MODULUS, "getAuthorRoles", "p", "getResourceId", "getLikerFullNames", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("conversationCommentUuid")
    private final String conversationCommentUuid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("conversationCommentPk")
    private final long conversationCommentPk;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("conversationUuid")
    private final String conversationUuid;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePk")
    private final long userProfilePk;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("authorDisplayName")
    private final String authorDisplayName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("authorFullName")
    private final String authorFullName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("authorImageUrl")
    private final String authorImageUrl;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("authorPro")
    private final boolean authorPro;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.TAG_BODY)
    private final String body;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("commentBlockList")
    private final List<mo1.a> commentBlockList;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createDate")
    @JsonAdapter(DateDeserializer.class)
    private final Date createDate;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("updated")
    private final boolean updated;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("numberOfLikes")
    private final int numberOfLikes;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("authorRoles")
    private final List<String> authorRoles;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("likedByUser")
    private final boolean likedByUser;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("resourceId")
    private final String resourceId;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("likerFullNames")
    private final List<String> likerFullNames;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            String string = parcel.readString();
            long j8 = parcel.readLong();
            String string2 = parcel.readString();
            long j14 = parcel.readLong();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            boolean z14 = false;
            if (parcel.readInt() != 0) {
                z14 = true;
            }
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iD = 0;
                while (iD != i14) {
                    iD = u0.d(e.class, parcel, arrayList2, iD, 1);
                    string = string;
                }
                arrayList = arrayList2;
            }
            return new e(string, j8, string2, j14, string3, string4, string5, z14, string6, arrayList, (Date) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt(), parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public e(String str, long j8, String str2, long j14, String str3, String str4, String str5, boolean z14, String str6, List<mo1.a> list, Date date, boolean z15, int i14, List<String> list2, boolean z16, String str7, List<String> list3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str6.getClass();
        date.getClass();
        str7.getClass();
        list3.getClass();
        this.conversationCommentUuid = str;
        this.conversationCommentPk = j8;
        this.conversationUuid = str2;
        this.userProfilePk = j14;
        this.authorDisplayName = str3;
        this.authorFullName = str4;
        this.authorImageUrl = str5;
        this.authorPro = z14;
        this.body = str6;
        this.commentBlockList = list;
        this.createDate = date;
        this.updated = z15;
        this.numberOfLikes = i14;
        this.authorRoles = list2;
        this.likedByUser = z16;
        this.resourceId = str7;
        this.likerFullNames = list3;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAuthorDisplayName() {
        return this.authorDisplayName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getAuthorFullName() {
        return this.authorFullName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.conversationCommentUuid, eVar.conversationCommentUuid) && this.conversationCommentPk == eVar.conversationCommentPk && s.g(this.conversationUuid, eVar.conversationUuid) && this.userProfilePk == eVar.userProfilePk && s.g(this.authorDisplayName, eVar.authorDisplayName) && s.g(this.authorFullName, eVar.authorFullName) && s.g(this.authorImageUrl, eVar.authorImageUrl) && this.authorPro == eVar.authorPro && s.g(this.body, eVar.body) && s.g(this.commentBlockList, eVar.commentBlockList) && s.g(this.createDate, eVar.createDate) && this.updated == eVar.updated && this.numberOfLikes == eVar.numberOfLikes && s.g(this.authorRoles, eVar.authorRoles) && this.likedByUser == eVar.likedByUser && s.g(this.resourceId, eVar.resourceId) && s.g(this.likerFullNames, eVar.likerFullNames);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getAuthorImageUrl() {
        return this.authorImageUrl;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    public final List<mo1.a> h() {
        return this.commentBlockList;
    }

    public final int hashCode() {
        int iJ = wr.g.j(q6.f.e(wr.g.j(q6.f.e(this.conversationCommentUuid.hashCode() * 31, 31, this.conversationCommentPk), 31, this.conversationUuid), 31, this.userProfilePk), 31, this.authorDisplayName);
        String str = this.authorFullName;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.authorImageUrl;
        int iJ2 = wr.g.j(q6.f.g((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.authorPro), 31, this.body);
        List<mo1.a> list = this.commentBlockList;
        int iD = q2.d(this.numberOfLikes, q6.f.g((this.createDate.hashCode() + ((iJ2 + (list == null ? 0 : list.hashCode())) * 31)) * 31, 31, this.updated), 31);
        List<String> list2 = this.authorRoles;
        return this.likerFullNames.hashCode() + wr.g.j(q6.f.g((iD + (list2 != null ? list2.hashCode() : 0)) * 31, 31, this.likedByUser), 31, this.resourceId);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getConversationCommentUuid() {
        return this.conversationCommentUuid;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Date getCreateDate() {
        return this.createDate;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getLikedByUser() {
        return this.likedByUser;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getNumberOfLikes() {
        return this.numberOfLikes;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getUpdated() {
        return this.updated;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final long getUserProfilePk() {
        return this.userProfilePk;
    }

    public final String toString() {
        String str = this.conversationCommentUuid;
        long j8 = this.conversationCommentPk;
        String str2 = this.conversationUuid;
        long j14 = this.userProfilePk;
        String str3 = this.authorDisplayName;
        String str4 = this.authorFullName;
        String str5 = this.authorImageUrl;
        boolean z14 = this.authorPro;
        String str6 = this.body;
        List<mo1.a> list = this.commentBlockList;
        Date date = this.createDate;
        boolean z15 = this.updated;
        int i14 = this.numberOfLikes;
        List<String> list2 = this.authorRoles;
        boolean z16 = this.likedByUser;
        String str7 = this.resourceId;
        List<String> list3 = this.likerFullNames;
        StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(j8, "ConversationHighlightedCommentDTO(conversationCommentUuid=", str, ", conversationCommentPk=");
        j.y(sbJ, ", conversationUuid=", str2, ", userProfilePk=");
        p6.b.k(j14, ", authorDisplayName=", str3, sbJ);
        sn.a.t(sbJ, ", authorFullName=", str4, ", authorImageUrl=", str5);
        sbJ.append(", authorPro=");
        sbJ.append(z14);
        sbJ.append(", body=");
        sbJ.append(str6);
        sbJ.append(", commentBlockList=");
        sbJ.append(list);
        sbJ.append(", createDate=");
        sbJ.append(date);
        sbJ.append(", updated=");
        sbJ.append(z15);
        sbJ.append(", numberOfLikes=");
        sbJ.append(i14);
        sbJ.append(", authorRoles=");
        sbJ.append(list2);
        sbJ.append(", likedByUser=");
        sbJ.append(z16);
        sbJ.append(", resourceId=");
        sbJ.append(str7);
        sbJ.append(", likerFullNames=");
        sbJ.append(list3);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.conversationCommentUuid);
        parcel.writeLong(this.conversationCommentPk);
        parcel.writeString(this.conversationUuid);
        parcel.writeLong(this.userProfilePk);
        parcel.writeString(this.authorDisplayName);
        parcel.writeString(this.authorFullName);
        parcel.writeString(this.authorImageUrl);
        parcel.writeInt(this.authorPro ? 1 : 0);
        parcel.writeString(this.body);
        List<mo1.a> list = this.commentBlockList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                parcel.writeParcelable((Parcelable) itO.next(), i14);
            }
        }
        parcel.writeSerializable(this.createDate);
        parcel.writeInt(this.updated ? 1 : 0);
        parcel.writeInt(this.numberOfLikes);
        parcel.writeStringList(this.authorRoles);
        parcel.writeInt(this.likedByUser ? 1 : 0);
        parcel.writeString(this.resourceId);
        parcel.writeStringList(this.likerFullNames);
    }

    public /* synthetic */ e(String str, long j8, String str2, long j14, String str3, String str4, String str5, boolean z14, String str6, List list, Date date, boolean z15, int i14, List list2, boolean z16, String str7, List list3, int i15, p005kotlin.jvm.internal.j jVar) {
        this(str, j8, str2, j14, str3, (i15 & 32) != 0 ? null : str4, (i15 & 64) != 0 ? null : str5, z14, str6, list, date, z15, i14, list2, z16, str7, list3);
    }
}
