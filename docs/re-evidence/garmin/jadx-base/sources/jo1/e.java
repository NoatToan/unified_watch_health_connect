package jo1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.social.conversation.model.DateDeserializer;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.x;
import p13.y;
import tn.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b#\u0010\"R\u001a\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010(R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010 \u001a\u0004\b3\u0010\"R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010 \u001a\u0004\b0\u0010\"R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010 \u001a\u0004\b4\u0010\"R\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010&\u001a\u0004\b6\u0010(R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010 \u001a\u0004\b8\u0010\"R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010 \u001a\u0004\b9\u0010\"R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b)\u0010<R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010=\u001a\u0004\b,\u0010>R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b2\u0010AR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010B\u001a\u0004\bC\u0010DR*\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010E\u001a\u0004\b5\u0010F\"\u0004\bG\u0010H¨\u0006I"}, d2 = {"Ljo1/e;", "Landroid/os/Parcelable;", "", "uuid", "newsPostType", "", "userGroupPk", TtmlNode.TAG_BODY, "rulePk", "Ljava/util/Date;", "createdDate", "lastUpdatedDate", "displayName", "firstName", "lastName", "userProfilePk", "profileImageUrlMedium", "profileImageUrlSmall", "Lmo1/d;", "conversationDTO", "Lmo1/g;", "conversationLikersDTO", "Lmo1/e;", "highlightedCommentDTO", "", "hasImages", "", "Ljo1/f;", "postImages", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lmo1/d;Lmo1/g;Lmo1/e;Ljava/lang/Boolean;Ljava/util/List;)V", "a", "Ljava/lang/String;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "()Ljava/lang/String;", "b", "getNewsPostType", "c", "J", "o", "()J", "d", JWKParameterNames.RSA_EXPONENT, "getRulePk", "f", "Ljava/util/Date;", "getCreatedDate", "()Ljava/util/Date;", "g", "j", "h", "getDisplayName", IntegerTokenConverter.CONVERTER_KEY, JWKParameterNames.OCT_KEY_VALUE, JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "l", "m", "getProfileImageUrlSmall", JWKParameterNames.RSA_MODULUS, "Lmo1/d;", "()Lmo1/d;", "Lmo1/g;", "()Lmo1/g;", "p", "Lmo1/e;", "()Lmo1/e;", "Ljava/lang/Boolean;", "getHasImages", "()Ljava/lang/Boolean;", "Ljava/util/List;", "()Ljava/util/List;", "s", "(Ljava/util/List;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("uuid")
    private final String uuid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("newsPostType")
    private final String newsPostType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userGroupPk")
    private final long userGroupPk;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.TAG_BODY)
    private final String body;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("rulePk")
    private final long rulePk;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createdDate")
    @JsonAdapter(DateDeserializer.class)
    private final Date createdDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastUpdatedDate")
    @JsonAdapter(DateDeserializer.class)
    private final Date lastUpdatedDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayName")
    private final String displayName;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("firstName")
    private final String firstName;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastName")
    private final String lastName;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePk")
    private final long userProfilePk;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrlMedium")
    private final String profileImageUrlMedium;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrlSmall")
    private final String profileImageUrlSmall;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("conversationDTO")
    private final mo1.d conversationDTO;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("conversationLikersDTO")
    private final mo1.g conversationLikersDTO;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("highlightedCommentDTO")
    private final mo1.e highlightedCommentDTO;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasImages")
    private final Boolean hasImages;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("postImages")
    private List<f> postImages;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            long j8 = parcel.readLong();
            String string3 = parcel.readString();
            long j14 = parcel.readLong();
            Date date = (Date) parcel.readSerializable();
            Date date2 = (Date) parcel.readSerializable();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            long j15 = parcel.readLong();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            mo1.d dVar = (mo1.d) parcel.readParcelable(e.class.getClassLoader());
            ArrayList arrayList = null;
            mo1.g gVarCreateFromParcel = parcel.readInt() == 0 ? null : mo1.g.CREATOR.createFromParcel(parcel);
            mo1.e eVarCreateFromParcel = parcel.readInt() == 0 ? null : mo1.e.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(f.CREATOR, parcel, arrayList2, iA, 1);
                    i14 = i14;
                }
                arrayList = arrayList2;
            }
            return new e(string, string2, j8, string3, j14, date, date2, string4, string5, string6, j15, string7, string8, dVar, gVarCreateFromParcel, eVarCreateFromParcel, boolValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public /* synthetic */ e(String str, String str2, long j8, String str3, long j14, Date date, Date date2, String str4, String str5, String str6, long j15, String str7, String str8, mo1.d dVar, mo1.g gVar, mo1.e eVar, Boolean bool, List list, int i14, j jVar) {
        this(str, str2, j8, (i14 & 8) != 0 ? null : str3, j14, date, date2, str4, (i14 & 256) != 0 ? null : str5, (i14 & 512) != 0 ? null : str6, j15, (i14 & 2048) != 0 ? null : str7, (i14 & 4096) != 0 ? null : str8, (i14 & 8192) != 0 ? null : dVar, (i14 & 16384) != 0 ? null : gVar, (32768 & i14) != 0 ? null : eVar, (65536 & i14) != 0 ? null : bool, (i14 & 131072) != 0 ? null : list);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final mo1.d getConversationDTO() {
        return this.conversationDTO;
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
        return s.g(this.uuid, eVar.uuid) && s.g(this.newsPostType, eVar.newsPostType) && this.userGroupPk == eVar.userGroupPk && s.g(this.body, eVar.body) && this.rulePk == eVar.rulePk && s.g(this.createdDate, eVar.createdDate) && s.g(this.lastUpdatedDate, eVar.lastUpdatedDate) && s.g(this.displayName, eVar.displayName) && s.g(this.firstName, eVar.firstName) && s.g(this.lastName, eVar.lastName) && this.userProfilePk == eVar.userProfilePk && s.g(this.profileImageUrlMedium, eVar.profileImageUrlMedium) && s.g(this.profileImageUrlSmall, eVar.profileImageUrlSmall) && s.g(this.conversationDTO, eVar.conversationDTO) && s.g(this.conversationLikersDTO, eVar.conversationLikersDTO) && s.g(this.highlightedCommentDTO, eVar.highlightedCommentDTO) && s.g(this.hasImages, eVar.hasImages) && s.g(this.postImages, eVar.postImages);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final mo1.g getConversationLikersDTO() {
        return this.conversationLikersDTO;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final mo1.e getHighlightedCommentDTO() {
        return this.highlightedCommentDTO;
    }

    public final int hashCode() {
        int iE = q6.f.e(wr.g.j(this.uuid.hashCode() * 31, 31, this.newsPostType), 31, this.userGroupPk);
        String str = this.body;
        int iJ = wr.g.j((this.lastUpdatedDate.hashCode() + ((this.createdDate.hashCode() + q6.f.e((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.rulePk)) * 31)) * 31, 31, this.displayName);
        String str2 = this.firstName;
        int iHashCode = (iJ + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int iE2 = q6.f.e((iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.userProfilePk);
        String str4 = this.profileImageUrlMedium;
        int iHashCode2 = (iE2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.profileImageUrlSmall;
        int iHashCode3 = (iHashCode2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        mo1.d dVar = this.conversationDTO;
        int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        mo1.g gVar = this.conversationLikersDTO;
        int iHashCode5 = (iHashCode4 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        mo1.e eVar = this.highlightedCommentDTO;
        int iHashCode6 = (iHashCode5 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Boolean bool = this.hasImages;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<f> list = this.postImages;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Date getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }

    public final List<f> k() {
        return this.postImages;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getProfileImageUrlMedium() {
        return this.profileImageUrlMedium;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final long getUserGroupPk() {
        return this.userGroupPk;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final long getUserProfilePk() {
        return this.userProfilePk;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    public final void s(ArrayList arrayList) {
        this.postImages = arrayList;
    }

    public final List<wg0.c> t() {
        List<f> list = this.postImages;
        if (list == null) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        int i14 = 0;
        for (Object obj : list) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            arrayList.add(new wg0.c(i14, ge1.b.a0((f) obj)));
            i14 = i15;
        }
        return arrayList;
    }

    public final String toString() {
        String str = this.uuid;
        String str2 = this.newsPostType;
        long j8 = this.userGroupPk;
        String str3 = this.body;
        long j14 = this.rulePk;
        Date date = this.createdDate;
        Date date2 = this.lastUpdatedDate;
        String str4 = this.displayName;
        String str5 = this.firstName;
        String str6 = this.lastName;
        long j15 = this.userProfilePk;
        String str7 = this.profileImageUrlMedium;
        String str8 = this.profileImageUrlSmall;
        mo1.d dVar = this.conversationDTO;
        mo1.g gVar = this.conversationLikersDTO;
        mo1.e eVar = this.highlightedCommentDTO;
        Boolean bool = this.hasImages;
        List<f> list = this.postImages;
        StringBuilder sbI = p6.b.i("NewsPostDTO(uuid=", str, ", newsPostType=", str2, ", userGroupPk=");
        p6.b.k(j8, ", body=", str3, sbI);
        j20.x.j(j14, ", rulePk=", ", createdDate=", sbI);
        sbI.append(date);
        sbI.append(", lastUpdatedDate=");
        sbI.append(date2);
        sbI.append(", displayName=");
        sn.a.t(sbI, str4, ", firstName=", str5, ", lastName=");
        e5.s(j15, str6, ", userProfilePk=", sbI);
        sn.a.t(sbI, ", profileImageUrlMedium=", str7, ", profileImageUrlSmall=", str8);
        sbI.append(", conversationDTO=");
        sbI.append(dVar);
        sbI.append(", conversationLikersDTO=");
        sbI.append(gVar);
        sbI.append(", highlightedCommentDTO=");
        sbI.append(eVar);
        sbI.append(", hasImages=");
        sbI.append(bool);
        sbI.append(", postImages=");
        sbI.append(list);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.uuid);
        parcel.writeString(this.newsPostType);
        parcel.writeLong(this.userGroupPk);
        parcel.writeString(this.body);
        parcel.writeLong(this.rulePk);
        parcel.writeSerializable(this.createdDate);
        parcel.writeSerializable(this.lastUpdatedDate);
        parcel.writeString(this.displayName);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeLong(this.userProfilePk);
        parcel.writeString(this.profileImageUrlMedium);
        parcel.writeString(this.profileImageUrlSmall);
        parcel.writeParcelable(this.conversationDTO, i14);
        mo1.g gVar = this.conversationLikersDTO;
        if (gVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gVar.writeToParcel(parcel, i14);
        }
        mo1.e eVar = this.highlightedCommentDTO;
        if (eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar.writeToParcel(parcel, i14);
        }
        Boolean bool = this.hasImages;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            k.m(parcel, 1, bool);
        }
        List<f> list = this.postImages;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            ((f) itO.next()).writeToParcel(parcel, i14);
        }
    }

    public e(String str, String str2, long j8, String str3, long j14, Date date, Date date2, String str4, String str5, String str6, long j15, String str7, String str8, mo1.d dVar, mo1.g gVar, mo1.e eVar, Boolean bool, List<f> list) {
        str.getClass();
        str2.getClass();
        date.getClass();
        date2.getClass();
        str4.getClass();
        this.uuid = str;
        this.newsPostType = str2;
        this.userGroupPk = j8;
        this.body = str3;
        this.rulePk = j14;
        this.createdDate = date;
        this.lastUpdatedDate = date2;
        this.displayName = str4;
        this.firstName = str5;
        this.lastName = str6;
        this.userProfilePk = j15;
        this.profileImageUrlMedium = str7;
        this.profileImageUrlSmall = str8;
        this.conversationDTO = dVar;
        this.conversationLikersDTO = gVar;
        this.highlightedCommentDTO = eVar;
        this.hasImages = bool;
        this.postImages = list;
    }
}
