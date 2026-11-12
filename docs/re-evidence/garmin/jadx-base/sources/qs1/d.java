package qs1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b<\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010 \u001a\u00020\u001d\u0012\b\b\u0002\u0010!\u001a\u00020\u001d¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u00104\u001a\u0004\b5\u00106R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010/\u001a\u0004\b8\u00101R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b=\u0010?R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010%\u001a\u0004\bA\u0010'R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010%\u001a\u0004\bC\u0010'R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010%\u001a\u0004\b@\u0010'R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010/\u001a\u0004\b9\u00101R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010/\u001a\u0004\b7\u00101R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010%\u001a\u0004\bB\u0010'R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010%\u001a\u0004\bH\u0010'R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010/\u001a\u0004\bN\u00101R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010>\u001a\u0004\bT\u0010?R\u001a\u0010 \u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\b.\u0010WR\u001a\u0010!\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010V\u001a\u0004\bX\u0010W¨\u0006Y"}, d2 = {"Lqs1/d;", "Landroid/os/Parcelable;", "", "curatedCourseId", "connectCourseId", "Lqs1/i;", "curatedStartLocation", "", "courseName", "courseNameUriComponent", "Lqs1/h;", "locationDTO", "courseType", "", "courseRating", "", "courseDifficulty", "durationMinSeconds", "durationMaxSeconds", "Lqs1/b;", "coverImage", "courseDistanceCM", "courseDescription", "courseCustomDescription", "", "tags", "courseElevationGainCM", "courseElevationLossCM", "courseWKT", "", "favorite", "tripReportCount", "closed", "underReview", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Lqs1/i;Ljava/lang/String;Ljava/lang/String;Lqs1/h;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Lqs1/b;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;ZZ)V", "a", "Ljava/lang/Long;", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "()Ljava/lang/Long;", "b", "f", "c", "Lqs1/i;", "z", "()Lqs1/i;", "d", "Ljava/lang/String;", "o", "()Ljava/lang/String;", JWKParameterNames.RSA_EXPONENT, JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "Lqs1/h;", "F", "()Lqs1/h;", "g", "s", "h", "Ljava/lang/Float;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "()Ljava/lang/Float;", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "j", "C", JWKParameterNames.OCT_KEY_VALUE, "A", "l", "Lqs1/b;", "u", "()Lqs1/b;", "m", JWKParameterNames.RSA_MODULUS, "p", "Ljava/util/List;", "G", "()Ljava/util/List;", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "v", "Ljava/lang/Boolean;", "D", "()Ljava/lang/Boolean;", "w", "H", "x", "Z", "()Z", "I", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("curatedCourseId")
    private final Long curatedCourseId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("connectCourseId")
    private final Long connectCourseId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseStartLocation")
    private final i curatedStartLocation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseName")
    private final String courseName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseNameUriComponent")
    private final String courseNameUriComponent;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("locationDTO")
    private final h locationDTO;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseTypeDTO")
    private final String courseType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseRating")
    private final Float courseRating;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseDifficulty")
    private final Integer courseDifficulty;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("durationMinSeconds")
    private final Long durationMinSeconds;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("durationMaxSeconds")
    private final Long durationMaxSeconds;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("coverImage")
    private final b coverImage;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseDistanceCM")
    private final Long courseDistanceCM;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseDescription")
    private final String courseDescription;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseCustomDescription")
    private final String courseCustomDescription;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tags")
    private final List<String> tags;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseElevationGainCM")
    private final Long courseElevationGainCM;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseElevationLossCM")
    private final Long courseElevationLossCM;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseWKT")
    private final String courseWKT;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("favorite")
    private final Boolean favorite;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tripReportCount")
    private final Integer tripReportCount;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @SerializedName("closed")
    private final boolean closed;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @SerializedName("underReview")
    private final boolean underReview;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean bool;
            parcel.getClass();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            i iVarCreateFromParcel = parcel.readInt() == 0 ? null : i.CREATOR.createFromParcel(parcel);
            Long l14 = lValueOf;
            Long l15 = lValueOf2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            h hVarCreateFromParcel = parcel.readInt() == 0 ? null : h.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf4 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            b bVarCreateFromParcel = parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel);
            Long lValueOf5 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Float f14 = fValueOf;
            Long l16 = lValueOf3;
            String string4 = parcel.readString();
            Integer num = numValueOf;
            Long l17 = lValueOf4;
            Long l18 = lValueOf5;
            String string5 = parcel.readString();
            Integer numValueOf2 = null;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            Long lValueOf6 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf7 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string6 = parcel.readString();
            boolean z14 = false;
            boolean z15 = true;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                z14 = true;
            }
            if (parcel.readInt() != 0) {
                bool = boolValueOf;
            } else {
                bool = boolValueOf;
                z15 = false;
            }
            return new d(l14, l15, iVarCreateFromParcel, string, string2, hVarCreateFromParcel, string3, f14, num, l16, l17, bVarCreateFromParcel, l18, string4, string5, arrayListCreateStringArrayList, lValueOf6, lValueOf7, string6, bool, numValueOf2, z14, z15);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public /* synthetic */ d(Long l14, Long l15, i iVar, String str, String str2, h hVar, String str3, Float f14, Integer num, Long l16, Long l17, b bVar, Long l18, String str4, String str5, List list, Long l19, Long l24, String str6, Boolean bool, Integer num2, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : l15, (i14 & 4) != 0 ? null : iVar, (i14 & 8) != 0 ? null : str, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? null : hVar, (i14 & 64) != 0 ? null : str3, (i14 & 128) != 0 ? null : f14, (i14 & 256) != 0 ? null : num, (i14 & 512) != 0 ? null : l16, (i14 & 1024) != 0 ? null : l17, (i14 & 2048) != 0 ? null : bVar, (i14 & 4096) != 0 ? null : l18, (i14 & 8192) != 0 ? null : str4, (i14 & 16384) != 0 ? null : str5, (i14 & 32768) != 0 ? null : list, (i14 & 65536) != 0 ? null : l19, (i14 & 131072) != 0 ? null : l24, (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : str6, (i14 & 524288) != 0 ? null : bool, (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num2, (i14 & 2097152) != 0 ? false : z14, (i14 & 4194304) != 0 ? false : z15);
    }

    public static d b(d dVar, Boolean bool) {
        return new d(dVar.curatedCourseId, dVar.connectCourseId, dVar.curatedStartLocation, dVar.courseName, dVar.courseNameUriComponent, dVar.locationDTO, dVar.courseType, dVar.courseRating, dVar.courseDifficulty, dVar.durationMinSeconds, dVar.durationMaxSeconds, dVar.coverImage, dVar.courseDistanceCM, dVar.courseDescription, dVar.courseCustomDescription, dVar.tags, dVar.courseElevationGainCM, dVar.courseElevationLossCM, dVar.courseWKT, bool, dVar.tripReportCount, dVar.closed, dVar.underReview);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final Long getDurationMaxSeconds() {
        return this.durationMaxSeconds;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final Long getDurationMinSeconds() {
        return this.durationMinSeconds;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final Boolean getFavorite() {
        return this.favorite;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final h getLocationDTO() {
        return this.locationDTO;
    }

    public final List<String> G() {
        return this.tags;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final Integer getTripReportCount() {
        return this.tripReportCount;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final boolean getUnderReview() {
        return this.underReview;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
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
        return p005kotlin.jvm.internal.s.g(this.curatedCourseId, dVar.curatedCourseId) && p005kotlin.jvm.internal.s.g(this.connectCourseId, dVar.connectCourseId) && p005kotlin.jvm.internal.s.g(this.curatedStartLocation, dVar.curatedStartLocation) && p005kotlin.jvm.internal.s.g(this.courseName, dVar.courseName) && p005kotlin.jvm.internal.s.g(this.courseNameUriComponent, dVar.courseNameUriComponent) && p005kotlin.jvm.internal.s.g(this.locationDTO, dVar.locationDTO) && p005kotlin.jvm.internal.s.g(this.courseType, dVar.courseType) && p005kotlin.jvm.internal.s.g(this.courseRating, dVar.courseRating) && p005kotlin.jvm.internal.s.g(this.courseDifficulty, dVar.courseDifficulty) && p005kotlin.jvm.internal.s.g(this.durationMinSeconds, dVar.durationMinSeconds) && p005kotlin.jvm.internal.s.g(this.durationMaxSeconds, dVar.durationMaxSeconds) && p005kotlin.jvm.internal.s.g(this.coverImage, dVar.coverImage) && p005kotlin.jvm.internal.s.g(this.courseDistanceCM, dVar.courseDistanceCM) && p005kotlin.jvm.internal.s.g(this.courseDescription, dVar.courseDescription) && p005kotlin.jvm.internal.s.g(this.courseCustomDescription, dVar.courseCustomDescription) && p005kotlin.jvm.internal.s.g(this.tags, dVar.tags) && p005kotlin.jvm.internal.s.g(this.courseElevationGainCM, dVar.courseElevationGainCM) && p005kotlin.jvm.internal.s.g(this.courseElevationLossCM, dVar.courseElevationLossCM) && p005kotlin.jvm.internal.s.g(this.courseWKT, dVar.courseWKT) && p005kotlin.jvm.internal.s.g(this.favorite, dVar.favorite) && p005kotlin.jvm.internal.s.g(this.tripReportCount, dVar.tripReportCount) && this.closed == dVar.closed && this.underReview == dVar.underReview;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getConnectCourseId() {
        return this.connectCourseId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getCourseCustomDescription() {
        return this.courseCustomDescription;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getCourseDescription() {
        return this.courseDescription;
    }

    public final int hashCode() {
        Long l14 = this.curatedCourseId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Long l15 = this.connectCourseId;
        int iHashCode2 = (iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31;
        i iVar = this.curatedStartLocation;
        int iHashCode3 = (iHashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        String str = this.courseName;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.courseNameUriComponent;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        h hVar = this.locationDTO;
        int iHashCode6 = (iHashCode5 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        String str3 = this.courseType;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f14 = this.courseRating;
        int iHashCode8 = (iHashCode7 + (f14 == null ? 0 : f14.hashCode())) * 31;
        Integer num = this.courseDifficulty;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Long l16 = this.durationMinSeconds;
        int iHashCode10 = (iHashCode9 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Long l17 = this.durationMaxSeconds;
        int iHashCode11 = (iHashCode10 + (l17 == null ? 0 : l17.hashCode())) * 31;
        b bVar = this.coverImage;
        int iHashCode12 = (iHashCode11 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Long l18 = this.courseDistanceCM;
        int iHashCode13 = (iHashCode12 + (l18 == null ? 0 : l18.hashCode())) * 31;
        String str4 = this.courseDescription;
        int iHashCode14 = (iHashCode13 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.courseCustomDescription;
        int iHashCode15 = (iHashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list = this.tags;
        int iHashCode16 = (iHashCode15 + (list == null ? 0 : list.hashCode())) * 31;
        Long l19 = this.courseElevationGainCM;
        int iHashCode17 = (iHashCode16 + (l19 == null ? 0 : l19.hashCode())) * 31;
        Long l24 = this.courseElevationLossCM;
        int iHashCode18 = (iHashCode17 + (l24 == null ? 0 : l24.hashCode())) * 31;
        String str6 = this.courseWKT;
        int iHashCode19 = (iHashCode18 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.favorite;
        int iHashCode20 = (iHashCode19 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.tripReportCount;
        return Boolean.hashCode(this.underReview) + q6.f.g((iHashCode20 + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.closed);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Integer getCourseDifficulty() {
        return this.courseDifficulty;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Long getCourseDistanceCM() {
        return this.courseDistanceCM;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Long getCourseElevationGainCM() {
        return this.courseElevationGainCM;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Long getCourseElevationLossCM() {
        return this.courseElevationLossCM;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getCourseName() {
        return this.courseName;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getCourseNameUriComponent() {
        return this.courseNameUriComponent;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Float getCourseRating() {
        return this.courseRating;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getCourseType() {
        return this.courseType;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getCourseWKT() {
        return this.courseWKT;
    }

    public final String toString() {
        Long l14 = this.curatedCourseId;
        Long l15 = this.connectCourseId;
        i iVar = this.curatedStartLocation;
        String str = this.courseName;
        String str2 = this.courseNameUriComponent;
        h hVar = this.locationDTO;
        String str3 = this.courseType;
        Float f14 = this.courseRating;
        Integer num = this.courseDifficulty;
        Long l16 = this.durationMinSeconds;
        Long l17 = this.durationMaxSeconds;
        b bVar = this.coverImage;
        Long l18 = this.courseDistanceCM;
        String str4 = this.courseDescription;
        String str5 = this.courseCustomDescription;
        List<String> list = this.tags;
        Long l19 = this.courseElevationGainCM;
        Long l24 = this.courseElevationLossCM;
        String str6 = this.courseWKT;
        Boolean bool = this.favorite;
        Integer num2 = this.tripReportCount;
        boolean z14 = this.closed;
        boolean z15 = this.underReview;
        StringBuilder sbJ = f3.j(l14, l15, "CuratedCourseDTO(curatedCourseId=", ", connectCourseId=", ", curatedStartLocation=");
        sbJ.append(iVar);
        sbJ.append(", courseName=");
        sbJ.append(str);
        sbJ.append(", courseNameUriComponent=");
        sbJ.append(str2);
        sbJ.append(", locationDTO=");
        sbJ.append(hVar);
        sbJ.append(", courseType=");
        sbJ.append(str3);
        sbJ.append(", courseRating=");
        sbJ.append(f14);
        sbJ.append(", courseDifficulty=");
        sbJ.append(num);
        sbJ.append(", durationMinSeconds=");
        sbJ.append(l16);
        sbJ.append(", durationMaxSeconds=");
        sbJ.append(l17);
        sbJ.append(", coverImage=");
        sbJ.append(bVar);
        sbJ.append(", courseDistanceCM=");
        b71.i.q(l18, ", courseDescription=", str4, ", courseCustomDescription=", sbJ);
        e0.o(str5, ", tags=", ", courseElevationGainCM=", sbJ, list);
        kg.f.s(sbJ, l19, ", courseElevationLossCM=", l24, ", courseWKT=");
        b71.i.w(sbJ, str6, ", favorite=", bool, ", tripReportCount=");
        sbJ.append(num2);
        sbJ.append(", closed=");
        sbJ.append(z14);
        sbJ.append(", underReview=");
        return hb.a.k(sbJ, z15, ")");
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final b getCoverImage() {
        return this.coverImage;
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
        Long l15 = this.connectCourseId;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        i iVar = this.curatedStartLocation;
        if (iVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.courseName);
        parcel.writeString(this.courseNameUriComponent);
        h hVar = this.locationDTO;
        if (hVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.courseType);
        Float f14 = this.courseRating;
        if (f14 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f14.floatValue());
        }
        Integer num = this.courseDifficulty;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Long l16 = this.durationMinSeconds;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l16);
        }
        Long l17 = this.durationMaxSeconds;
        if (l17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l17);
        }
        b bVar = this.coverImage;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar.writeToParcel(parcel, i14);
        }
        Long l18 = this.courseDistanceCM;
        if (l18 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l18);
        }
        parcel.writeString(this.courseDescription);
        parcel.writeString(this.courseCustomDescription);
        parcel.writeStringList(this.tags);
        Long l19 = this.courseElevationGainCM;
        if (l19 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l19);
        }
        Long l24 = this.courseElevationLossCM;
        if (l24 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l24);
        }
        parcel.writeString(this.courseWKT);
        Boolean bool = this.favorite;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Integer num2 = this.tripReportCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        parcel.writeInt(this.closed ? 1 : 0);
        parcel.writeInt(this.underReview ? 1 : 0);
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final Long getCuratedCourseId() {
        return this.curatedCourseId;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final i getCuratedStartLocation() {
        return this.curatedStartLocation;
    }

    public d(Long l14, Long l15, i iVar, String str, String str2, h hVar, String str3, Float f14, Integer num, Long l16, Long l17, b bVar, Long l18, String str4, String str5, List<String> list, Long l19, Long l24, String str6, Boolean bool, Integer num2, boolean z14, boolean z15) {
        this.curatedCourseId = l14;
        this.connectCourseId = l15;
        this.curatedStartLocation = iVar;
        this.courseName = str;
        this.courseNameUriComponent = str2;
        this.locationDTO = hVar;
        this.courseType = str3;
        this.courseRating = f14;
        this.courseDifficulty = num;
        this.durationMinSeconds = l16;
        this.durationMaxSeconds = l17;
        this.coverImage = bVar;
        this.courseDistanceCM = l18;
        this.courseDescription = str4;
        this.courseCustomDescription = str5;
        this.tags = list;
        this.courseElevationGainCM = l19;
        this.courseElevationLossCM = l24;
        this.courseWKT = str6;
        this.favorite = bool;
        this.tripReportCount = num2;
        this.closed = z14;
        this.underReview = z15;
    }

    public d() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 8388607, null);
    }
}
