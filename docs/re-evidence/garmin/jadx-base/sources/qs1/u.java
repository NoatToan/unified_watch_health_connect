package qs1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001Bï\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010-\u001a\u0004\b0\u0010/R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010)\u001a\u0004\b9\u0010+R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010)\u001a\u0004\b;\u0010+R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u00101\u001a\u0004\b(\u00103R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010\u001d\u001a\u0004\b>\u0010\u001fR\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u00101\u001a\u0004\b<\u00103R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010-\u001a\u0004\b4\u0010/R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b,\u0010+R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010!\u001a\u0004\b8\u0010#¨\u0006@"}, d2 = {"Lqs1/u;", "Landroid/os/Parcelable;", "", "curatedCourseId", "", "submitAnonymously", "activityDateMs", "submissionDateMs", "activityId", "", "reviewComment", "", "rating", "difficulty", "", "tags", "requesterOwned", "userName", "profileImage", "courseConditions", "tripReportId", "Lqs1/b;", "images", "helpfulRatingCount", "courseName", "hidden", "<init>", "(Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)V", "a", "Ljava/lang/Long;", "h", "()Ljava/lang/Long;", "b", "Ljava/lang/Boolean;", "getSubmitAnonymously", "()Ljava/lang/Boolean;", "c", "d", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, JWKParameterNames.RSA_EXPONENT, "f", "Ljava/lang/String;", "s", "()Ljava/lang/String;", "g", "Ljava/lang/Integer;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "()Ljava/lang/Integer;", IntegerTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "u", "()Ljava/util/List;", "j", "Z", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "()Z", JWKParameterNames.OCT_KEY_VALUE, "z", "l", "o", "m", JWKParameterNames.RSA_MODULUS, JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "p", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class u implements Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("curatedCourseId")
    private final Long curatedCourseId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("submitAnonymously")
    private final Boolean submitAnonymously;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityDateMs")
    private final Long activityDateMs;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("submissionDateMs")
    private final Long submissionDateMs;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityId")
    private final Long activityId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reviewComment")
    private final String reviewComment;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("rating")
    private final Integer rating;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("difficulty")
    private final Integer difficulty;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tags")
    private final List<String> tags;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("requesterOwned")
    private final boolean requesterOwned;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileName")
    private final String userName;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageMedium")
    private final String profileImage;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseConditions")
    private final List<String> courseConditions;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tripReportId")
    private final Long tripReportId;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("images")
    private final List<b> images;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("helpfulRatingCount")
    private final Integer helpfulRatingCount;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseName")
    private final String courseName;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hidden")
    private final Boolean hidden;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<u> {
        @Override // android.os.Parcelable.Creator
        public final u createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            Boolean boolValueOf2;
            parcel.getClass();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf4 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            boolean z14 = parcel.readInt() != 0;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            Long lValueOf5 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(b.CREATOR, parcel, arrayList, iA, 1);
                    lValueOf = lValueOf;
                    boolValueOf = boolValueOf;
                    i14 = i14;
                }
            }
            Boolean bool = boolValueOf;
            Long l14 = lValueOf;
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new u(l14, bool, lValueOf2, lValueOf3, lValueOf4, string, numValueOf, numValueOf2, arrayListCreateStringArrayList, z14, string2, string3, arrayListCreateStringArrayList2, lValueOf5, arrayList, numValueOf3, string4, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final u[] newArray(int i14) {
            return new u[i14];
        }
    }

    public /* synthetic */ u(Long l14, Boolean bool, Long l15, Long l16, Long l17, String str, Integer num, Integer num2, List list, boolean z14, String str2, String str3, List list2, Long l18, List list3, Integer num3, String str4, Boolean bool2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : bool, (i14 & 4) != 0 ? null : l15, (i14 & 8) != 0 ? null : l16, (i14 & 16) != 0 ? null : l17, (i14 & 32) != 0 ? null : str, (i14 & 64) != 0 ? null : num, (i14 & 128) != 0 ? null : num2, (i14 & 256) != 0 ? null : list, (i14 & 512) != 0 ? false : z14, (i14 & 1024) != 0 ? null : str2, (i14 & 2048) != 0 ? null : str3, (i14 & 4096) != 0 ? null : list2, (i14 & 8192) != 0 ? null : l18, (i14 & 16384) != 0 ? null : list3, (i14 & 32768) != 0 ? null : num3, (i14 & 65536) != 0 ? null : str4, (i14 & 131072) != 0 ? Boolean.FALSE : bool2);
    }

    public final boolean A() {
        return this.userName == null && this.profileImage == null;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getActivityDateMs() {
        return this.activityDateMs;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getActivityId() {
        return this.activityId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return p005kotlin.jvm.internal.s.g(this.curatedCourseId, uVar.curatedCourseId) && p005kotlin.jvm.internal.s.g(this.submitAnonymously, uVar.submitAnonymously) && p005kotlin.jvm.internal.s.g(this.activityDateMs, uVar.activityDateMs) && p005kotlin.jvm.internal.s.g(this.submissionDateMs, uVar.submissionDateMs) && p005kotlin.jvm.internal.s.g(this.activityId, uVar.activityId) && p005kotlin.jvm.internal.s.g(this.reviewComment, uVar.reviewComment) && p005kotlin.jvm.internal.s.g(this.rating, uVar.rating) && p005kotlin.jvm.internal.s.g(this.difficulty, uVar.difficulty) && p005kotlin.jvm.internal.s.g(this.tags, uVar.tags) && this.requesterOwned == uVar.requesterOwned && p005kotlin.jvm.internal.s.g(this.userName, uVar.userName) && p005kotlin.jvm.internal.s.g(this.profileImage, uVar.profileImage) && p005kotlin.jvm.internal.s.g(this.courseConditions, uVar.courseConditions) && p005kotlin.jvm.internal.s.g(this.tripReportId, uVar.tripReportId) && p005kotlin.jvm.internal.s.g(this.images, uVar.images) && p005kotlin.jvm.internal.s.g(this.helpfulRatingCount, uVar.helpfulRatingCount) && p005kotlin.jvm.internal.s.g(this.courseName, uVar.courseName) && p005kotlin.jvm.internal.s.g(this.hidden, uVar.hidden);
    }

    public final List<String> f() {
        return this.courseConditions;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getCourseName() {
        return this.courseName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Long getCuratedCourseId() {
        return this.curatedCourseId;
    }

    public final int hashCode() {
        Long l14 = this.curatedCourseId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Boolean bool = this.submitAnonymously;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l15 = this.activityDateMs;
        int iHashCode3 = (iHashCode2 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.submissionDateMs;
        int iHashCode4 = (iHashCode3 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Long l17 = this.activityId;
        int iHashCode5 = (iHashCode4 + (l17 == null ? 0 : l17.hashCode())) * 31;
        String str = this.reviewComment;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.rating;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.difficulty;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<String> list = this.tags;
        int iG = q6.f.g((iHashCode8 + (list == null ? 0 : list.hashCode())) * 31, 31, this.requesterOwned);
        String str2 = this.userName;
        int iHashCode9 = (iG + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.profileImage;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list2 = this.courseConditions;
        int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l18 = this.tripReportId;
        int iHashCode12 = (iHashCode11 + (l18 == null ? 0 : l18.hashCode())) * 31;
        List<b> list3 = this.images;
        int iHashCode13 = (iHashCode12 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num3 = this.helpfulRatingCount;
        int iHashCode14 = (iHashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.courseName;
        int iHashCode15 = (iHashCode14 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.hidden;
        return iHashCode15 + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Integer getDifficulty() {
        return this.difficulty;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Integer getHelpfulRatingCount() {
        return this.helpfulRatingCount;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Boolean getHidden() {
        return this.hidden;
    }

    public final List<b> m() {
        return this.images;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getProfileImage() {
        return this.profileImage;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Integer getRating() {
        return this.rating;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getRequesterOwned() {
        return this.requesterOwned;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getReviewComment() {
        return this.reviewComment;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Long getSubmissionDateMs() {
        return this.submissionDateMs;
    }

    public final String toString() {
        Long l14 = this.curatedCourseId;
        Boolean bool = this.submitAnonymously;
        Long l15 = this.activityDateMs;
        Long l16 = this.submissionDateMs;
        Long l17 = this.activityId;
        String str = this.reviewComment;
        Integer num = this.rating;
        Integer num2 = this.difficulty;
        List<String> list = this.tags;
        boolean z14 = this.requesterOwned;
        String str2 = this.userName;
        String str3 = this.profileImage;
        List<String> list2 = this.courseConditions;
        Long l18 = this.tripReportId;
        List<b> list3 = this.images;
        Integer num3 = this.helpfulRatingCount;
        String str4 = this.courseName;
        Boolean bool2 = this.hidden;
        StringBuilder sb3 = new StringBuilder("TrailReviewDTO(curatedCourseId=");
        sb3.append(l14);
        sb3.append(", submitAnonymously=");
        sb3.append(bool);
        sb3.append(", activityDateMs=");
        kg.f.s(sb3, l15, ", submissionDateMs=", l16, ", activityId=");
        b71.i.q(l17, ", reviewComment=", str, ", rating=", sb3);
        j20.x.m(sb3, num, ", difficulty=", num2, ", tags=");
        sb3.append(list);
        sb3.append(", requesterOwned=");
        sb3.append(z14);
        sb3.append(", userName=");
        sn.a.t(sb3, str2, ", profileImage=", str3, ", courseConditions=");
        sb3.append(list2);
        sb3.append(", tripReportId=");
        sb3.append(l18);
        sb3.append(", images=");
        sb3.append(list3);
        sb3.append(", helpfulRatingCount=");
        sb3.append(num3);
        sb3.append(", courseName=");
        sb3.append(str4);
        sb3.append(", hidden=");
        sb3.append(bool2);
        sb3.append(")");
        return sb3.toString();
    }

    public final List<String> u() {
        return this.tags;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.curatedCourseId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Boolean bool = this.submitAnonymously;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Long l15 = this.activityDateMs;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        Long l16 = this.submissionDateMs;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l16);
        }
        Long l17 = this.activityId;
        if (l17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l17);
        }
        parcel.writeString(this.reviewComment);
        Integer num = this.rating;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.difficulty;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        parcel.writeStringList(this.tags);
        parcel.writeInt(this.requesterOwned ? 1 : 0);
        parcel.writeString(this.userName);
        parcel.writeString(this.profileImage);
        parcel.writeStringList(this.courseConditions);
        Long l18 = this.tripReportId;
        if (l18 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l18);
        }
        List<b> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((b) itO.next()).writeToParcel(parcel, i14);
            }
        }
        Integer num3 = this.helpfulRatingCount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        parcel.writeString(this.courseName);
        Boolean bool2 = this.hidden;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final Long getTripReportId() {
        return this.tripReportId;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    public u(Long l14, Boolean bool, Long l15, Long l16, Long l17, String str, Integer num, Integer num2, List<String> list, boolean z14, String str2, String str3, List<String> list2, Long l18, List<b> list3, Integer num3, String str4, Boolean bool2) {
        this.curatedCourseId = l14;
        this.submitAnonymously = bool;
        this.activityDateMs = l15;
        this.submissionDateMs = l16;
        this.activityId = l17;
        this.reviewComment = str;
        this.rating = num;
        this.difficulty = num2;
        this.tags = list;
        this.requesterOwned = z14;
        this.userName = str2;
        this.profileImage = str3;
        this.courseConditions = list2;
        this.tripReportId = l18;
        this.images = list3;
        this.helpfulRatingCount = num3;
        this.courseName = str4;
        this.hidden = bool2;
    }

    public u() {
        this(null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 262143, null);
    }
}
