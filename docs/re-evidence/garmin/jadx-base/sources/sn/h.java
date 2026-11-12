package sn;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import d53.u;
import g22.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import ps.r1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eBÏ\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010)R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b0\u0010)R$\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010'\u001a\u0004\b.\u0010)\"\u0004\b1\u00102R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010'\u001a\u0004\b4\u0010)\"\u0004\b5\u00102R$\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u0010'\u001a\u0004\b7\u0010)\"\u0004\b8\u00102R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\b3\u0010A\"\u0004\bB\u0010CR\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010E\u001a\u0004\bI\u0010GR\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010E\u001a\u0004\bK\u0010G¨\u0006L"}, d2 = {"Lsn/h;", "Landroid/os/Parcelable;", "", "userProfilePk", "Lsn/c;", "activityUuid", "", "calendarDate", "startTimestampGMT", "endTimestampGMT", "startTimestampLocal", "endTimestampLocal", "activityName", "wellnessActivityType", "notes", "", "rulePK", "Lsn/f;", "deviceMetaData", "", "Lsn/g;", "summaryTypeDataList", "Lps/r1;", "timeInZoneList", "Lsn/i;", "contentList", "Lsn/b;", "chartData", "<init>", "(JLsn/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lsn/f;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lsn/b;)V", "a", "J", "getUserProfilePk", "()J", "b", "Lsn/c;", "g", "()Lsn/c;", "c", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "d", "getStartTimestampGMT", JWKParameterNames.RSA_EXPONENT, "getEndTimestampGMT", "f", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "getEndTimestampLocal", "F", "(Ljava/lang/String;)V", IntegerTokenConverter.CONVERTER_KEY, "getWellnessActivityType", "setWellnessActivityType", "j", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "setNotes", JWKParameterNames.OCT_KEY_VALUE, "Ljava/lang/Integer;", "getRulePK", "()Ljava/lang/Integer;", "setRulePK", "(Ljava/lang/Integer;)V", "l", "Lsn/f;", "()Lsn/f;", "setDeviceMetaData", "(Lsn/f;)V", "m", "Ljava/util/List;", "A", "()Ljava/util/List;", JWKParameterNames.RSA_MODULUS, "getTimeInZoneList", "o", "getContentList", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f160385q;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePk")
    private final long userProfilePk;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityUuid")
    private final c activityUuid;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private final String calendarDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTimestampGMT")
    private final String startTimestampGMT;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endTimestampGMT")
    private final String endTimestampGMT;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTimestampLocal")
    private final String startTimestampLocal;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endTimestampLocal")
    private final String endTimestampLocal;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityName")
    private String activityName;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("wellnessActivityType")
    private String wellnessActivityType;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("notes")
    private String notes;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("rulePK")
    private Integer rulePK;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceMetaData")
    private f deviceMetaData;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("summaryTypeDataList")
    private final List<g> summaryTypeDataList;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timeInZoneList")
    private final List<r1> timeInZoneList;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("contentList")
    private final List<i> contentList;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public sn.b f160401p;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            parcel.getClass();
            long j8 = parcel.readLong();
            c cVarCreateFromParcel = c.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            f fVarCreateFromParcel = parcel.readInt() == 0 ? null : f.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(g.CREATOR, parcel, arrayList, iA, 1);
                    cVarCreateFromParcel = cVarCreateFromParcel;
                }
            }
            c cVar = cVarCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i15);
                int iA2 = 0;
                while (iA2 != i15) {
                    iA2 = kg.f.a(r1.CREATOR, parcel, arrayList4, iA2, 1);
                    i15 = i15;
                }
                arrayList2 = arrayList4;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i16 = parcel.readInt();
                arrayList3 = new ArrayList(i16);
                int iA3 = 0;
                while (iA3 != i16) {
                    iA3 = kg.f.a(i.CREATOR, parcel, arrayList3, iA3, 1);
                    i16 = i16;
                    string = string;
                }
            }
            return new h(j8, cVar, string, string2, string3, string4, string5, string6, string7, string8, numValueOf, fVarCreateFromParcel, arrayList, arrayList2, arrayList3, parcel.readInt() == 0 ? null : sn.b.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
        f160385q = 8;
    }

    public /* synthetic */ h(long j8, c cVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, f fVar, List list, List list2, List list3, sn.b bVar, int i14, j jVar) {
        this(j8, cVar, str, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : str3, (i14 & 32) != 0 ? null : str4, (i14 & 64) != 0 ? null : str5, (i14 & 128) != 0 ? null : str6, (i14 & 256) != 0 ? null : str7, (i14 & 512) != 0 ? null : str8, (i14 & 1024) != 0 ? null : num, (i14 & 2048) != 0 ? null : fVar, (i14 & 4096) != 0 ? null : list, (i14 & 8192) != 0 ? null : list2, (i14 & 16384) != 0 ? null : list3, (i14 & 32768) != 0 ? null : bVar);
    }

    public static h b(h hVar, String str, String str2, int i14) {
        long j8 = hVar.userProfilePk;
        c cVar = hVar.activityUuid;
        String str3 = hVar.calendarDate;
        String str4 = hVar.startTimestampGMT;
        String str5 = hVar.endTimestampGMT;
        String str6 = hVar.startTimestampLocal;
        String str7 = hVar.endTimestampLocal;
        String str8 = (i14 & 128) != 0 ? hVar.activityName : str;
        String str9 = hVar.wellnessActivityType;
        String str10 = (i14 & 512) != 0 ? hVar.notes : str2;
        Integer num = hVar.rulePK;
        String str11 = str10;
        String str12 = str8;
        f fVar = hVar.deviceMetaData;
        List<g> list = hVar.summaryTypeDataList;
        List<r1> list2 = hVar.timeInZoneList;
        List<i> list3 = hVar.contentList;
        sn.b bVar = hVar.f160401p;
        hVar.getClass();
        cVar.getClass();
        str3.getClass();
        return new h(j8, cVar, str3, str4, str5, str6, str7, str12, str9, str11, num, fVar, list, list2, list3, bVar);
    }

    public final List<g> A() {
        return this.summaryTypeDataList;
    }

    public final String C() {
        return this.activityUuid.getUuid();
    }

    public final boolean D() {
        return u.q(this.wellnessActivityType, "ECG", true);
    }

    public final void F(String str) {
        this.activityName = str;
    }

    public final String d() {
        return this.activityUuid.getUuid();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.userProfilePk == hVar.userProfilePk && s.g(this.activityUuid, hVar.activityUuid) && s.g(this.calendarDate, hVar.calendarDate) && s.g(this.startTimestampGMT, hVar.startTimestampGMT) && s.g(this.endTimestampGMT, hVar.endTimestampGMT) && s.g(this.startTimestampLocal, hVar.startTimestampLocal) && s.g(this.endTimestampLocal, hVar.endTimestampLocal) && s.g(this.activityName, hVar.activityName) && s.g(this.wellnessActivityType, hVar.wellnessActivityType) && s.g(this.notes, hVar.notes) && s.g(this.rulePK, hVar.rulePK) && s.g(this.deviceMetaData, hVar.deviceMetaData) && s.g(this.summaryTypeDataList, hVar.summaryTypeDataList) && s.g(this.timeInZoneList, hVar.timeInZoneList) && s.g(this.contentList, hVar.contentList) && s.g(this.f160401p, hVar.f160401p);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getActivityName() {
        return this.activityName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final c getActivityUuid() {
        return this.activityUuid;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getCalendarDate() {
        return this.calendarDate;
    }

    public final int hashCode() {
        int iJ = wr.g.j((this.activityUuid.hashCode() + (Long.hashCode(this.userProfilePk) * 31)) * 31, 31, this.calendarDate);
        String str = this.startTimestampGMT;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.endTimestampGMT;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.startTimestampLocal;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.endTimestampLocal;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.activityName;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.wellnessActivityType;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.notes;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.rulePK;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        f fVar = this.deviceMetaData;
        int iHashCode9 = (iHashCode8 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        List<g> list = this.summaryTypeDataList;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List<r1> list2 = this.timeInZoneList;
        int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<i> list3 = this.contentList;
        int iHashCode12 = (iHashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        sn.b bVar = this.f160401p;
        return iHashCode12 + (bVar != null ? bVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final f getDeviceMetaData() {
        return this.deviceMetaData;
    }

    public final DateTime j() {
        return k.q(this.endTimestampLocal, "yyyy-MM-dd'T'HH:mm:ss.SSS", null);
    }

    public final DateTime k() {
        return k.q(this.endTimestampGMT, "yyyy-MM-dd'T'HH:mm:ss.SSS", DateTimeZone.UTC);
    }

    public final g m() {
        List<g> list = this.summaryTypeDataList;
        Object obj = null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (((g) obj2).g()) {
                obj = obj2;
                break;
            }
        }
        return (g) obj;
    }

    public final LocalDate o() {
        return k.w(this.calendarDate, "yyyy-MM-dd");
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    public final g r() {
        List<g> list = this.summaryTypeDataList;
        Object obj = null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (((g) obj2).k()) {
                obj = obj2;
                break;
            }
        }
        return (g) obj;
    }

    public final g s() {
        List<g> list = this.summaryTypeDataList;
        Object obj = null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (((g) obj2).h()) {
                obj = obj2;
                break;
            }
        }
        return (g) obj;
    }

    public final DateTime t() {
        return k.q(this.startTimestampLocal, "yyyy-MM-dd'T'HH:mm:ss.SSS", null);
    }

    public final String toString() {
        long j8 = this.userProfilePk;
        c cVar = this.activityUuid;
        String str = this.calendarDate;
        String str2 = this.startTimestampGMT;
        String str3 = this.endTimestampGMT;
        String str4 = this.startTimestampLocal;
        String str5 = this.endTimestampLocal;
        String str6 = this.activityName;
        String str7 = this.wellnessActivityType;
        String str8 = this.notes;
        Integer num = this.rulePK;
        f fVar = this.deviceMetaData;
        List<g> list = this.summaryTypeDataList;
        List<r1> list2 = this.timeInZoneList;
        List<i> list3 = this.contentList;
        sn.b bVar = this.f160401p;
        StringBuilder sb3 = new StringBuilder("WellnessActivityDTO(userProfilePk=");
        sb3.append(j8);
        sb3.append(", activityUuid=");
        sb3.append(cVar);
        sn.a.t(sb3, ", calendarDate=", str, ", startTimestampGMT=", str2);
        sn.a.t(sb3, ", endTimestampGMT=", str3, ", startTimestampLocal=", str4);
        sn.a.t(sb3, ", endTimestampLocal=", str5, ", activityName=", str6);
        sn.a.t(sb3, ", wellnessActivityType=", str7, ", notes=", str8);
        sb3.append(", rulePK=");
        sb3.append(num);
        sb3.append(", deviceMetaData=");
        sb3.append(fVar);
        sb3.append(", summaryTypeDataList=");
        sb3.append(list);
        sb3.append(", timeInZoneList=");
        sb3.append(list2);
        sb3.append(", contentList=");
        sb3.append(list3);
        sb3.append(", chartData=");
        sb3.append(bVar);
        sb3.append(")");
        return sb3.toString();
    }

    public final DateTime u() {
        return k.q(this.startTimestampGMT, "yyyy-MM-dd'T'HH:mm:ss.SSS", DateTimeZone.UTC);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.userProfilePk);
        this.activityUuid.writeToParcel(parcel, i14);
        parcel.writeString(this.calendarDate);
        parcel.writeString(this.startTimestampGMT);
        parcel.writeString(this.endTimestampGMT);
        parcel.writeString(this.startTimestampLocal);
        parcel.writeString(this.endTimestampLocal);
        parcel.writeString(this.activityName);
        parcel.writeString(this.wellnessActivityType);
        parcel.writeString(this.notes);
        Integer num = this.rulePK;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        f fVar = this.deviceMetaData;
        if (fVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fVar.writeToParcel(parcel, i14);
        }
        List<g> list = this.summaryTypeDataList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((g) itO.next()).writeToParcel(parcel, i14);
            }
        }
        List<r1> list2 = this.timeInZoneList;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                ((r1) itO2.next()).writeToParcel(parcel, i14);
            }
        }
        List<i> list3 = this.contentList;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO3 = u0.o(parcel, list3, 1);
            while (itO3.hasNext()) {
                ((i) itO3.next()).writeToParcel(parcel, i14);
            }
        }
        sn.b bVar = this.f160401p;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar.writeToParcel(parcel, i14);
        }
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final String getStartTimestampLocal() {
        return this.startTimestampLocal;
    }

    public final g z() {
        List<g> list = this.summaryTypeDataList;
        Object obj = null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (((g) obj2).m()) {
                obj = obj2;
                break;
            }
        }
        return (g) obj;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lsn/h$a;", "", "<init>", "()V", "", "HEALTH_MONITORING", "Ljava/lang/String;", "ECG", "HEALTH_ACTIVITY_TYPE_KEY", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(long j8, c cVar, String str, String str2) {
        this(j8, cVar, str, str2, null, null, null, null, null, null, null, null, null, null, null, null, 65520, null);
        cVar.getClass();
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(long j8, c cVar, String str, String str2, String str3) {
        this(j8, cVar, str, str2, str3, null, null, null, null, null, null, null, null, null, null, null, 65504, null);
        cVar.getClass();
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(long j8, c cVar, String str, String str2, String str3, String str4) {
        this(j8, cVar, str, str2, str3, str4, null, null, null, null, null, null, null, null, null, null, 65472, null);
        cVar.getClass();
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(long j8, c cVar, String str, String str2, String str3, String str4, String str5) {
        this(j8, cVar, str, str2, str3, str4, str5, null, null, null, null, null, null, null, null, null, 65408, null);
        cVar.getClass();
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(long j8, c cVar, String str, String str2, String str3, String str4, String str5, String str6) {
        this(j8, cVar, str, str2, str3, str4, str5, str6, null, null, null, null, null, null, null, null, 65280, null);
        cVar.getClass();
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(long j8, c cVar, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(j8, cVar, str, str2, str3, str4, str5, str6, str7, null, null, null, null, null, null, null, 65024, null);
        cVar.getClass();
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(long j8, c cVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this(j8, cVar, str, str2, str3, str4, str5, str6, str7, str8, null, null, null, null, null, null, 64512, null);
        cVar.getClass();
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(long j8, c cVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num) {
        this(j8, cVar, str, str2, str3, str4, str5, str6, str7, str8, num, null, null, null, null, null, 63488, null);
        cVar.getClass();
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(long j8, c cVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, f fVar) {
        this(j8, cVar, str, str2, str3, str4, str5, str6, str7, str8, num, fVar, null, null, null, null, 61440, null);
        cVar.getClass();
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(long j8, c cVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, f fVar, List<g> list) {
        this(j8, cVar, str, str2, str3, str4, str5, str6, str7, str8, num, fVar, list, null, null, null, 57344, null);
        cVar.getClass();
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(long j8, c cVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, f fVar, List<g> list, List<r1> list2) {
        this(j8, cVar, str, str2, str3, str4, str5, str6, str7, str8, num, fVar, list, list2, null, null, 49152, null);
        cVar.getClass();
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(long j8, c cVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, f fVar, List<g> list, List<r1> list2, List<i> list3) {
        this(j8, cVar, str, str2, str3, str4, str5, str6, str7, str8, num, fVar, list, list2, list3, null, 32768, null);
        cVar.getClass();
        str.getClass();
    }

    public h(long j8, c cVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, f fVar, List<g> list, List<r1> list2, List<i> list3, sn.b bVar) {
        cVar.getClass();
        str.getClass();
        this.userProfilePk = j8;
        this.activityUuid = cVar;
        this.calendarDate = str;
        this.startTimestampGMT = str2;
        this.endTimestampGMT = str3;
        this.startTimestampLocal = str4;
        this.endTimestampLocal = str5;
        this.activityName = str6;
        this.wellnessActivityType = str7;
        this.notes = str8;
        this.rulePK = num;
        this.deviceMetaData = fVar;
        this.summaryTypeDataList = list;
        this.timeInZoneList = list2;
        this.contentList = list3;
        this.f160401p = bVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(long j8, c cVar, String str) {
        this(j8, cVar, str, null, null, null, null, null, null, null, null, null, null, null, null, null, 65528, null);
        cVar.getClass();
        str.getClass();
    }
}
