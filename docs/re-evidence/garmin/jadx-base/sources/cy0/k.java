package cy0;

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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u001a\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\u001a\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010 R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010)\u001a\u0004\b'\u0010+R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b#\u0010+R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010 \u001a\u0004\b2\u0010\"R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b,\u00104¨\u00065"}, d2 = {"Lcy0/k;", "Landroid/os/Parcelable;", "Lcy0/r;", "uuid", "", "userId", "", "name", "summary", "startDate", "endDate", "", "Lcy0/o;", "images", "accessControlRule", "", "shareLiveTrack", "courseIds", "activityIds", "processingStartTimeStamp", "inaccessibleCourses", "<init>", "(Lcy0/r;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;)V", "a", "Lcy0/r;", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "()Lcy0/r;", "b", "Ljava/lang/Long;", "s", "()Ljava/lang/Long;", "c", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "d", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, JWKParameterNames.RSA_EXPONENT, JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "f", "g", "Ljava/util/List;", "h", "()Ljava/util/List;", IntegerTokenConverter.CONVERTER_KEY, "Z", "o", "()Z", JWKParameterNames.OCT_KEY_VALUE, "l", "m", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("multiDayActivityUUID")
    private final r uuid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userId")
    private final Long userId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    private final String name;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("summary")
    private final String summary;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startDate")
    private final String startDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endDate")
    private final String endDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("images")
    private final List<o> images;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("accessControlRule")
    private final String accessControlRule;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("shareLiveTrack")
    private final boolean shareLiveTrack;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseIds")
    private final List<Long> courseIds;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityIds")
    private final List<Long> activityIds;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("processingStartTimestamp")
    private final String processingStartTimeStamp;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("inaccessibleCourses")
    private final Boolean inaccessibleCourses;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            parcel.getClass();
            r rVarCreateFromParcel = parcel.readInt() == 0 ? null : r.CREATOR.createFromParcel(parcel);
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(o.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            String string5 = parcel.readString();
            boolean z14 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    arrayList4.add(Long.valueOf(parcel.readLong()));
                }
                arrayList2 = arrayList4;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i17 = parcel.readInt();
                arrayList3 = new ArrayList(i17);
                for (int i18 = 0; i18 != i17; i18++) {
                    arrayList3.add(Long.valueOf(parcel.readLong()));
                }
            }
            return new k(rVarCreateFromParcel, lValueOf, string, string2, string3, string4, arrayList, string5, z14, arrayList2, arrayList3, parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i14) {
            return new k[i14];
        }
    }

    public /* synthetic */ k(r rVar, Long l14, String str, String str2, String str3, String str4, List list, String str5, boolean z14, List list2, List list3, String str6, Boolean bool, int i14, p005kotlin.jvm.internal.j jVar) {
        this(rVar, l14, str, str2, str3, str4, list, str5, (i14 & 256) != 0 ? false : z14, (i14 & 512) != 0 ? null : list2, (i14 & 1024) != 0 ? null : list3, str6, bool);
    }

    public static k b(k kVar, String str, String str2, String str3, String str4, String str5, boolean z14, List list, List list2, int i14) {
        r rVar = kVar.uuid;
        Long l14 = kVar.userId;
        String str6 = (i14 & 4) != 0 ? kVar.name : str;
        String str7 = (i14 & 8) != 0 ? kVar.summary : str2;
        String str8 = (i14 & 16) != 0 ? kVar.startDate : str3;
        String str9 = (i14 & 32) != 0 ? kVar.endDate : str4;
        List<o> list3 = kVar.images;
        String str10 = (i14 & 128) != 0 ? kVar.accessControlRule : str5;
        boolean z15 = (i14 & 256) != 0 ? kVar.shareLiveTrack : z14;
        List list4 = (i14 & 512) != 0 ? kVar.courseIds : list;
        List list5 = (i14 & 1024) != 0 ? kVar.activityIds : list2;
        String str11 = kVar.processingStartTimeStamp;
        Boolean bool = kVar.inaccessibleCourses;
        kVar.getClass();
        str6.getClass();
        str8.getClass();
        str9.getClass();
        return new k(rVar, l14, str6, str7, str8, str9, list3, str10, z15, list4, list5, str11, bool);
    }

    public final List<Long> d() {
        return this.activityIds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return p005kotlin.jvm.internal.s.g(this.uuid, kVar.uuid) && p005kotlin.jvm.internal.s.g(this.userId, kVar.userId) && p005kotlin.jvm.internal.s.g(this.name, kVar.name) && p005kotlin.jvm.internal.s.g(this.summary, kVar.summary) && p005kotlin.jvm.internal.s.g(this.startDate, kVar.startDate) && p005kotlin.jvm.internal.s.g(this.endDate, kVar.endDate) && p005kotlin.jvm.internal.s.g(this.images, kVar.images) && p005kotlin.jvm.internal.s.g(this.accessControlRule, kVar.accessControlRule) && this.shareLiveTrack == kVar.shareLiveTrack && p005kotlin.jvm.internal.s.g(this.courseIds, kVar.courseIds) && p005kotlin.jvm.internal.s.g(this.activityIds, kVar.activityIds) && p005kotlin.jvm.internal.s.g(this.processingStartTimeStamp, kVar.processingStartTimeStamp) && p005kotlin.jvm.internal.s.g(this.inaccessibleCourses, kVar.inaccessibleCourses);
    }

    public final List<Long> f() {
        return this.courseIds;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    public final List<o> h() {
        return this.images;
    }

    public final int hashCode() {
        r rVar = this.uuid;
        int iHashCode = (rVar == null ? 0 : rVar.hashCode()) * 31;
        Long l14 = this.userId;
        int iJ = wr.g.j((iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31, 31, this.name);
        String str = this.summary;
        int iJ2 = wr.g.j(wr.g.j((iJ + (str == null ? 0 : str.hashCode())) * 31, 31, this.startDate), 31, this.endDate);
        List<o> list = this.images;
        int iHashCode2 = (iJ2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.accessControlRule;
        int iG = q6.f.g((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.shareLiveTrack);
        List<Long> list2 = this.courseIds;
        int iHashCode3 = (iG + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Long> list3 = this.activityIds;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str3 = this.processingStartTimeStamp;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.inaccessibleCourses;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Boolean getInaccessibleCourses() {
        return this.inaccessibleCourses;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final sy0.m k() {
        Object next;
        String str = this.accessControlRule;
        sy0.m.a aVar = sy0.m.f161251d;
        sy0.m mVar = sy0.m.ONLY_ME;
        aVar.getClass();
        mVar.getClass();
        if (str != null) {
            Iterator<T> it = sy0.m.f161255h.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p005kotlin.jvm.internal.s.g(((sy0.m) next).f161256a, str));
            sy0.m mVar2 = (sy0.m) next;
            if (mVar2 != null) {
                return mVar2;
            }
        }
        return mVar;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getProcessingStartTimeStamp() {
        return this.processingStartTimeStamp;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getShareLiveTrack() {
        return this.shareLiveTrack;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Long getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final r getUuid() {
        return this.uuid;
    }

    public final String toString() {
        r rVar = this.uuid;
        Long l14 = this.userId;
        String str = this.name;
        String str2 = this.summary;
        String str3 = this.startDate;
        String str4 = this.endDate;
        List<o> list = this.images;
        String str5 = this.accessControlRule;
        boolean z14 = this.shareLiveTrack;
        List<Long> list2 = this.courseIds;
        List<Long> list3 = this.activityIds;
        String str6 = this.processingStartTimeStamp;
        Boolean bool = this.inaccessibleCourses;
        StringBuilder sb3 = new StringBuilder("MultiDayActivityDTO(uuid=");
        sb3.append(rVar);
        sb3.append(", userId=");
        sb3.append(l14);
        sb3.append(", name=");
        sn.a.t(sb3, str, ", summary=", str2, ", startDate=");
        sn.a.t(sb3, str3, ", endDate=", str4, ", images=");
        o2.c.n(", accessControlRule=", str5, ", shareLiveTrack=", sb3, list);
        sb3.append(z14);
        sb3.append(", courseIds=");
        sb3.append(list2);
        sb3.append(", activityIds=");
        o2.c.n(", processingStartTimeStamp=", str6, ", inaccessibleCourses=", sb3, list3);
        return p6.b.f(sb3, bool, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        r rVar = this.uuid;
        if (rVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rVar.writeToParcel(parcel, i14);
        }
        Long l14 = this.userId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.name);
        parcel.writeString(this.summary);
        parcel.writeString(this.startDate);
        parcel.writeString(this.endDate);
        List<o> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((o) itO.next()).writeToParcel(parcel, i14);
            }
        }
        parcel.writeString(this.accessControlRule);
        parcel.writeInt(this.shareLiveTrack ? 1 : 0);
        List<Long> list2 = this.courseIds;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                parcel.writeLong(((Number) itO2.next()).longValue());
            }
        }
        List<Long> list3 = this.activityIds;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO3 = u0.o(parcel, list3, 1);
            while (itO3.hasNext()) {
                parcel.writeLong(((Number) itO3.next()).longValue());
            }
        }
        parcel.writeString(this.processingStartTimeStamp);
        Boolean bool = this.inaccessibleCourses;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
    }

    public k(r rVar, Long l14, String str, String str2, String str3, String str4, List<o> list, String str5, boolean z14, List<Long> list2, List<Long> list3, String str6, Boolean bool) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str3, str4);
        this.uuid = rVar;
        this.userId = l14;
        this.name = str;
        this.summary = str2;
        this.startDate = str3;
        this.endDate = str4;
        this.images = list;
        this.accessControlRule = str5;
        this.shareLiveTrack = z14;
        this.courseIds = list2;
        this.activityIds = list3;
        this.processingStartTimeStamp = str6;
        this.inaccessibleCourses = bool;
    }
}
