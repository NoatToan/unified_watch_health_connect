package ps;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b8\b\u0087\b\u0018\u00002\u00020\u0001Bë\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010.\u001a\u0004\b5\u00100R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u00106\u001a\u0004\b7\u00108R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00109\u001a\u0004\b:\u0010;R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b@\u00100R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010A\u001a\u0004\bB\u0010CR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010*\u001a\u0004\bE\u0010,R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u00101\u001a\u0004\bG\u00103R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010H\u001a\u0004\bI\u0010JR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010O\u001a\u0004\bP\u0010QR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010*\u001a\u0004\bS\u0010,R\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010T\u001a\u0004\bU\u0010VR\u001c\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010W\u001a\u0004\bD\u0010X¨\u0006Y"}, d2 = {"Lps/r;", "Landroid/os/Parcelable;", "Lps/a;", "accessControlRuleDTO", "", "activityId", "", "activityName", "", "Lps/w;", "ciqMeasurementDTOs", "description", "Lps/k0;", "diveInfoDTO", "Lps/p0;", "eventTypeDTO", "", "isMultiSportParent", "locationName", "Lps/a1;", "metadataDTO", "parentId", "Lps/o1;", "splitSummaries", "Lps/q1;", "summaryDTO", "Lps/s1;", "timezoneUnitDTO", "Lto/o;", "typeDTO", "userProfileId", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/o0;", "videoGameInfoDTO", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/p;", "deviceDisplayUnitsDTO", "<init>", "(Lps/a;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lps/k0;Lps/p0;Ljava/lang/Boolean;Ljava/lang/String;Lps/a1;Ljava/lang/Long;Ljava/util/List;Lps/q1;Lps/s1;Lto/o;Ljava/lang/Long;Lcom/garmin/android/apps/connectmobile/activities/newmodel/o0;Lcom/garmin/android/apps/connectmobile/activities/newmodel/p;)V", "a", "Lps/a;", "d", "()Lps/a;", "b", "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", "c", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "Ljava/util/List;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", JWKParameterNames.RSA_EXPONENT, "j", "Lps/k0;", "m", "()Lps/k0;", "Lps/p0;", "o", "()Lps/p0;", "h", "Ljava/lang/Boolean;", "C", "()Ljava/lang/Boolean;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "Lps/a1;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "()Lps/a1;", JWKParameterNames.OCT_KEY_VALUE, "s", "l", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "Lps/q1;", "u", "()Lps/q1;", JWKParameterNames.RSA_MODULUS, "Lps/s1;", "getTimezoneUnitDTO", "()Lps/s1;", "Lto/o;", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "()Lto/o;", "p", "z", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/o0;", "A", "()Lcom/garmin/android/apps/connectmobile/activities/newmodel/o0;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/p;", "()Lcom/garmin/android/apps/connectmobile/activities/newmodel/p;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new a();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f140175t = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("accessControlRuleDTO")
    private final ps.a accessControlRuleDTO;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityId")
    private final Long activityId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityName")
    private final String activityName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("connectIQMeasurements")
    private final List<w> ciqMeasurementDTOs;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("description")
    private final String description;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("diveInfo")
    private final k0 diveInfoDTO;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventTypeDTO")
    private final p0 eventTypeDTO;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isMultiSportParent")
    private final Boolean isMultiSportParent;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("locationName")
    private final String locationName;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("metadataDTO")
    private final a1 metadataDTO;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("parentId")
    private final Long parentId;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("splitSummaries")
    private final List<o1> splitSummaries;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("summaryDTO")
    private final q1 summaryDTO;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timeZoneUnitDTO")
    private final s1 timezoneUnitDTO;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityTypeDTO")
    private final to.o typeDTO;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfileId")
    private final Long userProfileId;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("videoGameInfo")
    private final com.garmin.android.apps.connectmobile.activities.newmodel.o0 videoGameInfoDTO;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceDisplayUnitsDTO")
    private final com.garmin.android.apps.connectmobile.activities.newmodel.p deviceDisplayUnitsDTO;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<r> {
        @Override // android.os.Parcelable.Creator
        public final r createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            ArrayList arrayList2;
            parcel.getClass();
            ps.a aVarCreateFromParcel = parcel.readInt() == 0 ? null : ps.a.CREATOR.createFromParcel(parcel);
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            int iA = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA2 = 0;
                while (iA2 != i14) {
                    iA2 = kg.f.a(w.CREATOR, parcel, arrayList, iA2, 1);
                }
            }
            String string2 = parcel.readString();
            k0 k0VarCreateFromParcel = parcel.readInt() == 0 ? null : k0.CREATOR.createFromParcel(parcel);
            p0 p0VarCreateFromParcel = parcel.readInt() == 0 ? null : p0.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string3 = parcel.readString();
            a1 a1VarCreateFromParcel = parcel.readInt() == 0 ? null : a1.CREATOR.createFromParcel(parcel);
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i15);
                while (iA != i15) {
                    iA = kg.f.a(o1.CREATOR, parcel, arrayList3, iA, 1);
                    string2 = string2;
                }
                arrayList2 = arrayList3;
            }
            return new r(aVarCreateFromParcel, lValueOf, string, arrayList, string2, k0VarCreateFromParcel, p0VarCreateFromParcel, boolValueOf, string3, a1VarCreateFromParcel, lValueOf2, arrayList2, parcel.readInt() == 0 ? null : q1.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : s1.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : to.o.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : com.garmin.android.apps.connectmobile.activities.newmodel.o0.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : com.garmin.android.apps.connectmobile.activities.newmodel.p.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final r[] newArray(int i14) {
            return new r[i14];
        }
    }

    public /* synthetic */ r(ps.a aVar, Long l14, String str, List list, String str2, k0 k0Var, p0 p0Var, Boolean bool, String str3, a1 a1Var, Long l15, List list2, q1 q1Var, s1 s1Var, to.o oVar, Long l16, com.garmin.android.apps.connectmobile.activities.newmodel.o0 o0Var, com.garmin.android.apps.connectmobile.activities.newmodel.p pVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : aVar, (i14 & 2) != 0 ? null : l14, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : list, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? null : k0Var, (i14 & 64) != 0 ? null : p0Var, (i14 & 128) != 0 ? null : bool, (i14 & 256) != 0 ? null : str3, (i14 & 512) != 0 ? null : a1Var, (i14 & 1024) != 0 ? null : l15, (i14 & 2048) != 0 ? null : list2, (i14 & 4096) != 0 ? null : q1Var, (i14 & 8192) != 0 ? null : s1Var, (i14 & 16384) != 0 ? null : oVar, (i14 & 32768) != 0 ? null : l16, (i14 & 65536) != 0 ? null : o0Var, (i14 & 131072) != 0 ? null : pVar);
    }

    public static r b(r rVar, ps.a aVar, String str, String str2, a1 a1Var, q1 q1Var, int i14) {
        return new r((i14 & 1) != 0 ? rVar.accessControlRuleDTO : aVar, rVar.activityId, (i14 & 4) != 0 ? rVar.activityName : str, rVar.ciqMeasurementDTOs, (i14 & 16) != 0 ? rVar.description : str2, rVar.diveInfoDTO, rVar.eventTypeDTO, rVar.isMultiSportParent, rVar.locationName, (i14 & 512) != 0 ? rVar.metadataDTO : a1Var, rVar.parentId, rVar.splitSummaries, (i14 & 4096) != 0 ? rVar.summaryDTO : q1Var, rVar.timezoneUnitDTO, rVar.typeDTO, rVar.userProfileId, rVar.videoGameInfoDTO, rVar.deviceDisplayUnitsDTO);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final com.garmin.android.apps.connectmobile.activities.newmodel.o0 getVideoGameInfoDTO() {
        return this.videoGameInfoDTO;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final Boolean getIsMultiSportParent() {
        return this.isMultiSportParent;
    }

    public final boolean D() {
        List<String> listK;
        a1 a1Var = this.metadataDTO;
        if (a1Var != null && (listK = a1Var.k()) != null) {
            int i14 = 0;
            int i15 = 0;
            for (String str : listK) {
                am.z0 z0Var = am.z0.f4390a;
                if (am.z0.b(am.x0.f4308n, str) || am.z0.b(am.x0.f4312o, str) || (am.z0.b(am.x0.f4324r, str) && i14 < 4)) {
                    i14++;
                } else {
                    if (!am.z0.Y(str) || i15 >= 3) {
                        return false;
                    }
                    i15++;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ps.a getAccessControlRuleDTO() {
        return this.accessControlRuleDTO;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return p005kotlin.jvm.internal.s.g(this.accessControlRuleDTO, rVar.accessControlRuleDTO) && p005kotlin.jvm.internal.s.g(this.activityId, rVar.activityId) && p005kotlin.jvm.internal.s.g(this.activityName, rVar.activityName) && p005kotlin.jvm.internal.s.g(this.ciqMeasurementDTOs, rVar.ciqMeasurementDTOs) && p005kotlin.jvm.internal.s.g(this.description, rVar.description) && p005kotlin.jvm.internal.s.g(this.diveInfoDTO, rVar.diveInfoDTO) && p005kotlin.jvm.internal.s.g(this.eventTypeDTO, rVar.eventTypeDTO) && p005kotlin.jvm.internal.s.g(this.isMultiSportParent, rVar.isMultiSportParent) && p005kotlin.jvm.internal.s.g(this.locationName, rVar.locationName) && p005kotlin.jvm.internal.s.g(this.metadataDTO, rVar.metadataDTO) && p005kotlin.jvm.internal.s.g(this.parentId, rVar.parentId) && p005kotlin.jvm.internal.s.g(this.splitSummaries, rVar.splitSummaries) && p005kotlin.jvm.internal.s.g(this.summaryDTO, rVar.summaryDTO) && p005kotlin.jvm.internal.s.g(this.timezoneUnitDTO, rVar.timezoneUnitDTO) && p005kotlin.jvm.internal.s.g(this.typeDTO, rVar.typeDTO) && p005kotlin.jvm.internal.s.g(this.userProfileId, rVar.userProfileId) && p005kotlin.jvm.internal.s.g(this.videoGameInfoDTO, rVar.videoGameInfoDTO) && p005kotlin.jvm.internal.s.g(this.deviceDisplayUnitsDTO, rVar.deviceDisplayUnitsDTO);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getActivityId() {
        return this.activityId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getActivityName() {
        return this.activityName;
    }

    public final am.x0 h() {
        Object obj;
        w13.c cVar = am.x0.H3;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        while (true) {
            obj = null;
            if (!bVarN.hasNext()) {
                break;
            }
            Object next = bVarN.next();
            String str = ((am.x0) next).f4358a;
            to.o oVar = this.typeDTO;
            if (p005kotlin.jvm.internal.s.g(str, oVar != null ? oVar.j() : null)) {
                obj = next;
                break;
            }
        }
        am.x0 x0Var = (am.x0) obj;
        return x0Var == null ? am.x0.f4346x : x0Var;
    }

    public final int hashCode() {
        ps.a aVar = this.accessControlRuleDTO;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        Long l14 = this.activityId;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str = this.activityName;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<w> list = this.ciqMeasurementDTOs;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        k0 k0Var = this.diveInfoDTO;
        int iHashCode6 = (iHashCode5 + (k0Var == null ? 0 : k0Var.hashCode())) * 31;
        p0 p0Var = this.eventTypeDTO;
        int iHashCode7 = (iHashCode6 + (p0Var == null ? 0 : p0Var.hashCode())) * 31;
        Boolean bool = this.isMultiSportParent;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.locationName;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        a1 a1Var = this.metadataDTO;
        int iHashCode10 = (iHashCode9 + (a1Var == null ? 0 : a1Var.hashCode())) * 31;
        Long l15 = this.parentId;
        int iHashCode11 = (iHashCode10 + (l15 == null ? 0 : l15.hashCode())) * 31;
        List<o1> list2 = this.splitSummaries;
        int iHashCode12 = (iHashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        q1 q1Var = this.summaryDTO;
        int iHashCode13 = (iHashCode12 + (q1Var == null ? 0 : q1Var.hashCode())) * 31;
        s1 s1Var = this.timezoneUnitDTO;
        int iHashCode14 = (iHashCode13 + (s1Var == null ? 0 : s1Var.hashCode())) * 31;
        to.o oVar = this.typeDTO;
        int iHashCode15 = (iHashCode14 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        Long l16 = this.userProfileId;
        int iHashCode16 = (iHashCode15 + (l16 == null ? 0 : l16.hashCode())) * 31;
        com.garmin.android.apps.connectmobile.activities.newmodel.o0 o0Var = this.videoGameInfoDTO;
        int iHashCode17 = (iHashCode16 + (o0Var == null ? 0 : o0Var.hashCode())) * 31;
        com.garmin.android.apps.connectmobile.activities.newmodel.p pVar = this.deviceDisplayUnitsDTO;
        return iHashCode17 + (pVar != null ? pVar.hashCode() : 0);
    }

    public final List<w> i() {
        return this.ciqMeasurementDTOs;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final com.garmin.android.apps.connectmobile.activities.newmodel.p getDeviceDisplayUnitsDTO() {
        return this.deviceDisplayUnitsDTO;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final k0 getDiveInfoDTO() {
        return this.diveInfoDTO;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final p0 getEventTypeDTO() {
        return this.eventTypeDTO;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getLocationName() {
        return this.locationName;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final a1 getMetadataDTO() {
        return this.metadataDTO;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Long getParentId() {
        return this.parentId;
    }

    public final List<o1> t() {
        return this.splitSummaries;
    }

    public final String toString() {
        ps.a aVar = this.accessControlRuleDTO;
        Long l14 = this.activityId;
        String str = this.activityName;
        List<w> list = this.ciqMeasurementDTOs;
        String str2 = this.description;
        k0 k0Var = this.diveInfoDTO;
        p0 p0Var = this.eventTypeDTO;
        Boolean bool = this.isMultiSportParent;
        String str3 = this.locationName;
        a1 a1Var = this.metadataDTO;
        Long l15 = this.parentId;
        List<o1> list2 = this.splitSummaries;
        q1 q1Var = this.summaryDTO;
        s1 s1Var = this.timezoneUnitDTO;
        to.o oVar = this.typeDTO;
        Long l16 = this.userProfileId;
        com.garmin.android.apps.connectmobile.activities.newmodel.o0 o0Var = this.videoGameInfoDTO;
        com.garmin.android.apps.connectmobile.activities.newmodel.p pVar = this.deviceDisplayUnitsDTO;
        StringBuilder sb3 = new StringBuilder("ActivitySummaryDTO(accessControlRuleDTO=");
        sb3.append(aVar);
        sb3.append(", activityId=");
        sb3.append(l14);
        sb3.append(", activityName=");
        v.e0.o(str, ", ciqMeasurementDTOs=", ", description=", sb3, list);
        sb3.append(str2);
        sb3.append(", diveInfoDTO=");
        sb3.append(k0Var);
        sb3.append(", eventTypeDTO=");
        sb3.append(p0Var);
        sb3.append(", isMultiSportParent=");
        sb3.append(bool);
        sb3.append(", locationName=");
        sb3.append(str3);
        sb3.append(", metadataDTO=");
        sb3.append(a1Var);
        sb3.append(", parentId=");
        sb3.append(l15);
        sb3.append(", splitSummaries=");
        sb3.append(list2);
        sb3.append(", summaryDTO=");
        sb3.append(q1Var);
        sb3.append(", timezoneUnitDTO=");
        sb3.append(s1Var);
        sb3.append(", typeDTO=");
        sb3.append(oVar);
        sb3.append(", userProfileId=");
        sb3.append(l16);
        sb3.append(", videoGameInfoDTO=");
        sb3.append(o0Var);
        sb3.append(", deviceDisplayUnitsDTO=");
        sb3.append(pVar);
        sb3.append(")");
        return sb3.toString();
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final q1 getSummaryDTO() {
        return this.summaryDTO;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        ps.a aVar = this.accessControlRuleDTO;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aVar.writeToParcel(parcel, i14);
        }
        Long l14 = this.activityId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.activityName);
        List<w> list = this.ciqMeasurementDTOs;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = lc.u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((w) itO.next()).writeToParcel(parcel, i14);
            }
        }
        parcel.writeString(this.description);
        k0 k0Var = this.diveInfoDTO;
        if (k0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            k0Var.writeToParcel(parcel, i14);
        }
        p0 p0Var = this.eventTypeDTO;
        if (p0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            p0Var.writeToParcel(parcel, i14);
        }
        Boolean bool = this.isMultiSportParent;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        parcel.writeString(this.locationName);
        a1 a1Var = this.metadataDTO;
        if (a1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            a1Var.writeToParcel(parcel, i14);
        }
        Long l15 = this.parentId;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        List<o1> list2 = this.splitSummaries;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = lc.u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                ((o1) itO2.next()).writeToParcel(parcel, i14);
            }
        }
        q1 q1Var = this.summaryDTO;
        if (q1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            q1Var.writeToParcel(parcel, i14);
        }
        s1 s1Var = this.timezoneUnitDTO;
        if (s1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            s1Var.writeToParcel(parcel, i14);
        }
        to.o oVar = this.typeDTO;
        if (oVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            oVar.writeToParcel(parcel, i14);
        }
        Long l16 = this.userProfileId;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l16);
        }
        com.garmin.android.apps.connectmobile.activities.newmodel.o0 o0Var = this.videoGameInfoDTO;
        if (o0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            o0Var.writeToParcel(parcel, i14);
        }
        com.garmin.android.apps.connectmobile.activities.newmodel.p pVar = this.deviceDisplayUnitsDTO;
        if (pVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pVar.writeToParcel(parcel, i14);
        }
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final to.o getTypeDTO() {
        return this.typeDTO;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final Long getUserProfileId() {
        return this.userProfileId;
    }

    public r(ps.a aVar, Long l14, String str, List<w> list, String str2, k0 k0Var, p0 p0Var, Boolean bool, String str3, a1 a1Var, Long l15, List<o1> list2, q1 q1Var, s1 s1Var, to.o oVar, Long l16, com.garmin.android.apps.connectmobile.activities.newmodel.o0 o0Var, com.garmin.android.apps.connectmobile.activities.newmodel.p pVar) {
        this.accessControlRuleDTO = aVar;
        this.activityId = l14;
        this.activityName = str;
        this.ciqMeasurementDTOs = list;
        this.description = str2;
        this.diveInfoDTO = k0Var;
        this.eventTypeDTO = p0Var;
        this.isMultiSportParent = bool;
        this.locationName = str3;
        this.metadataDTO = a1Var;
        this.parentId = l15;
        this.splitSummaries = list2;
        this.summaryDTO = q1Var;
        this.timezoneUnitDTO = s1Var;
        this.typeDTO = oVar;
        this.userProfileId = l16;
        this.videoGameInfoDTO = o0Var;
        this.deviceDisplayUnitsDTO = pVar;
    }

    public r() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    }
}
