package com.garmin.android.apps.connectmobile.courses.model;

import am.x0;
import am.y0;
import am.z0;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import m63.u1;
import m63.y1;
import o13.l;
import o13.m;
import o13.n;
import org.joda.time.DateTime;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import to.o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b5\b\u0007\u0018\u0000 d2\u00020\u00012\u00020\u0002:\u000283B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007B\u0011\b\u0014\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0003\u0010\nB\u0089\u0002\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0018\u001a\u00020\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u000f\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u000b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020\u001d\u0012\u0006\u0010\"\u001a\u00020\u001d\u0012\u0006\u0010#\u001a\u00020\u001d\u0012\u0006\u0010%\u001a\u00020$\u0012\b\u0010&\u001a\u0004\u0018\u00010\r\u0012\b\u0010'\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010(\u001a\u00020$\u0012\b\u0010)\u001a\u0004\u0018\u00010\r\u0012\b\u0010*\u001a\u0004\u0018\u00010\r\u0012\b\u0010+\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,\u0012\u0006\u0010/\u001a\u00020\u000f\u0012\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b\u0003\u00102R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b5\u00106R$\u0010\u0011\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u000f8\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b8\u00106\u001a\u0004\b9\u0010:R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b=\u00104R$\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b>\u00104\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0016\u0010\u0018\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bC\u00106R\"\u0010\u0019\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bD\u00106\u001a\u0004\bE\u0010:\"\u0004\bF\u0010GR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010\u001f\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bL\u0010KR\u0016\u0010 \u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bM\u0010KR\u0016\u0010!\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bN\u0010KR\u0016\u0010\"\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bO\u0010KR\"\u0010#\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bP\u0010K\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bU\u0010VR$\u0010&\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bW\u00104\u001a\u0004\bX\u0010@\"\u0004\bY\u0010BR$\u0010'\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bZ\u00104\u001a\u0004\b[\u0010@\"\u0004\b\\\u0010BR\u0016\u0010(\u001a\u00020$8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b]\u0010VR\u0018\u0010)\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b^\u00104R\u0018\u0010*\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b_\u00104R\u0018\u0010+\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b`\u00104R\u001c\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010/\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bc\u00106¨\u0006e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/d;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "detail", "(Lcom/garmin/android/apps/connectmobile/courses/model/e;)V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "", "seen0", "", "courseId", "", "userProfileId", "userGroupId", "Lcom/garmin/android/apps/connectmobile/courses/model/a;", "activityTypeDTO", "Lam/x0;", "activityTypeEnum", "courseName", "courseDescription", "createdDate", "updatedDate", "Lcom/garmin/android/apps/connectmobile/courses/model/j;", "privacyRule", "privacyTypeId", "", "distanceInMeters", "elevationGainInMeters", "elevationLossInMeters", "startLatitude", "startLongitude", "speedInMetersPerSecond", "", "isPublic", "createdDateFormatted", "updatedDateFormatted", "isFavorite", "coordinateSystem", "originalCoordinateSystem", "consumer", "", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "intervalMarkers", "powerGuideId", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;JJLcom/garmin/android/apps/connectmobile/courses/model/a;Lam/x0;Ljava/lang/String;Ljava/lang/String;JJLcom/garmin/android/apps/connectmobile/courses/model/j;IDDDDDDZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;JLm63/u1;)V", "a", "Ljava/lang/String;", "b", "J", "value", "c", "getUserGroupId", "()J", "d", "Lcom/garmin/android/apps/connectmobile/courses/model/a;", "f", "g", "getCourseDescription", "()Ljava/lang/String;", "setCourseDescription", "(Ljava/lang/String;)V", "h", IntegerTokenConverter.CONVERTER_KEY, "getUpdatedDate", "setUpdatedDate", "(J)V", "j", "Lcom/garmin/android/apps/connectmobile/courses/model/j;", "l", "D", "m", JWKParameterNames.RSA_MODULUS, "o", "p", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "getSpeedInMetersPerSecond", "()D", "setSpeedInMetersPerSecond", "(D)V", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "Z", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "getCreatedDateFormatted", "setCreatedDateFormatted", "v", "getUpdatedDateFormatted", "setUpdatedDateFormatted", "w", "x", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "z", "A", "Ljava/util/List;", "B", "Companion", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final class d extends s1 implements Parcelable {
    public static final l<i63.c<Object>>[] C;
    public static final Parcelable.Creator<d> CREATOR;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private final List<g> intervalMarkers;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    public long powerGuideId;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseId")
    public String courseId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfileId")
    public long userProfileId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userGroupId")
    private long userGroupId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityType")
    private com.garmin.android.apps.connectmobile.courses.model.a activityTypeDTO;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x0 f32844e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseName")
    public String courseName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseDescription")
    private String courseDescription;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createdDate")
    public long createdDate;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("updatedDate")
    private long updatedDate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("privacyRule")
    private j privacyRule;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f32850k;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("distanceInMeters")
    public double distanceInMeters;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("elevationGainInMeters")
    public double elevationGainInMeters;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("elevationLossInMeters")
    public double elevationLossInMeters;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startLatitude")
    public double startLatitude;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startLongitude")
    public double startLongitude;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("speedInMetersPerSecond")
    private double speedInMetersPerSecond;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("public")
    private boolean isPublic;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createdDateFormatted")
    private String createdDateFormatted;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("updatedDateFormatted")
    private String updatedDateFormatted;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @SerializedName("favorite")
    public boolean isFavorite;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @SerializedName("coordinateSystem")
    private String coordinateSystem;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @SerializedName("originalCoordinateSystem")
    private String originalCoordinateSystem;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @SerializedName("consumer")
    public String consumer;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/courses/model/d$b", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/courses/model/d;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    static {
        n nVar = n.PUBLICATION;
        C = new l[]{null, null, null, null, m.a(nVar, new k01.a(19)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, m.a(nVar, new k01.a(20)), null};
        CREATOR = new b();
    }

    public d(e eVar) {
        Integer sortOrder;
        Integer parentTypeId;
        eVar.getClass();
        this.f32844e = x0.f4346x;
        this.courseId = eVar.courseId;
        try {
            String str = eVar.userProfilePk;
            this.userProfileId = str != null ? Long.parseLong(str) : -1L;
        } catch (NumberFormatException e4) {
            sn.a.s("Invalid number format: ", e4.getMessage(), i2.f36769a, a2.COURSES, "CourseDTO");
        }
        try {
            String str2 = eVar.userGroupPk;
            this.userGroupId = str2 != null ? Long.parseLong(str2) : -1L;
        } catch (NumberFormatException e14) {
            sn.a.s("Invalid number format: ", e14.getMessage(), i2.f36769a, a2.COURSES, "CourseDTO");
        }
        this.f32844e = eVar.g();
        this.activityTypeDTO = new com.garmin.android.apps.connectmobile.courses.model.a();
        o oVarF = ((y0) KoinJavaComponent.get$default(y0.class, null, null, 6, null)).f(this.f32844e);
        if (oVarF != null) {
            com.garmin.android.apps.connectmobile.courses.model.a aVar = this.activityTypeDTO;
            if (aVar != null) {
                aVar.typeId = oVarF.getTypeId();
            }
            com.garmin.android.apps.connectmobile.courses.model.a aVar2 = this.activityTypeDTO;
            if (aVar2 != null) {
                aVar2.typeKey = oVarF.j();
            }
            com.garmin.android.apps.connectmobile.courses.model.a aVar3 = this.activityTypeDTO;
            int iIntValue = 0;
            if (aVar3 != null) {
                aVar3.parentTypeId = (oVarF.getParentTypeId() == null || (parentTypeId = oVarF.getParentTypeId()) == null) ? 0 : parentTypeId.intValue();
            }
            com.garmin.android.apps.connectmobile.courses.model.a aVar4 = this.activityTypeDTO;
            if (aVar4 != null) {
                if (oVarF.getSortOrder() != null && (sortOrder = oVarF.getSortOrder()) != null) {
                    iIntValue = sortOrder.intValue();
                }
                aVar4.sortOrder = iIntValue;
            }
        }
        this.courseName = eVar.courseName;
        this.courseDescription = eVar.description;
        try {
            this.createdDate = DateTime.parse(eVar.createDate).getMillis();
        } catch (Exception e15) {
            sn.a.s("Invalid date format: ", e15.getMessage(), i2.f36769a, a2.COURSES, "CourseDTO");
        }
        try {
            this.updatedDate = DateTime.parse(eVar.updateDate).getMillis();
        } catch (Exception e16) {
            sn.a.s("Invalid date format: ", e16.getMessage(), i2.f36769a, a2.COURSES, "CourseDTO");
        }
        this.privacyRule = new j();
        boolean zE0 = eVar.e0();
        this.isPublic = zE0;
        this.f32850k = (zE0 ? AccessibleControlRule.b.f32775c : AccessibleControlRule.a.f32774c).f32772a;
        j jVar = this.privacyRule;
        if (jVar != null) {
            jVar.d((zE0 ? AccessibleControlRule.b.f32775c : AccessibleControlRule.a.f32774c).f32772a);
        }
        this.distanceInMeters = eVar.q();
        this.elevationGainInMeters = eVar.r();
        this.elevationLossInMeters = eVar.s();
        GeoPointDTO geoPointDTOD = eVar.D();
        if (geoPointDTOD != null) {
            Double d14 = geoPointDTOD.latitude;
            this.startLatitude = d14 != null ? d14.doubleValue() : 0.0d;
            Double d15 = geoPointDTOD.longitude;
            this.startLongitude = d15 != null ? d15.doubleValue() : 0.0d;
        }
        this.speedInMetersPerSecond = eVar.A();
        this.createdDateFormatted = eVar.createDate;
        this.updatedDateFormatted = eVar.updateDate;
        this.isFavorite = eVar.isFavorite;
        this.coordinateSystem = eVar.h().name();
        this.originalCoordinateSystem = eVar.z().name();
        this.consumer = eVar.consumer;
    }

    public static final /* synthetic */ void G(d dVar, l63.d dVar2, k63.e eVar) {
        if (dVar2.C(eVar) || dVar.courseId != null) {
            dVar2.d(eVar, 0, y1.f117048a, dVar.courseId);
        }
        if (dVar2.C(eVar) || dVar.userProfileId != 0) {
            dVar2.z(eVar, 1, dVar.userProfileId);
        }
        if (dVar2.C(eVar) || dVar.userGroupId != 0) {
            dVar2.z(eVar, 2, dVar.userGroupId);
        }
        if (dVar2.C(eVar) || dVar.activityTypeDTO != null) {
            dVar2.d(eVar, 3, com.garmin.android.apps.connectmobile.courses.model.a.C0539a.f32817a, dVar.activityTypeDTO);
        }
        boolean zC = dVar2.C(eVar);
        l<i63.c<Object>>[] lVarArr = C;
        if (zC || dVar.f32844e != x0.f4346x) {
            dVar2.e(eVar, 4, lVarArr[4].getValue(), dVar.f32844e);
        }
        if (dVar2.C(eVar) || dVar.courseName != null) {
            dVar2.d(eVar, 5, y1.f117048a, dVar.courseName);
        }
        if (dVar2.C(eVar) || dVar.courseDescription != null) {
            dVar2.d(eVar, 6, y1.f117048a, dVar.courseDescription);
        }
        if (dVar2.C(eVar) || dVar.createdDate != 0) {
            dVar2.z(eVar, 7, dVar.createdDate);
        }
        if (dVar2.C(eVar) || dVar.updatedDate != 0) {
            dVar2.z(eVar, 8, dVar.updatedDate);
        }
        if (dVar2.C(eVar) || dVar.privacyRule != null) {
            dVar2.d(eVar, 9, j.a.f32988a, dVar.privacyRule);
        }
        if (dVar2.C(eVar) || dVar.f32850k != 0) {
            dVar2.v(10, dVar.f32850k, eVar);
        }
        if (dVar2.C(eVar) || Double.compare(dVar.distanceInMeters, 0.0d) != 0) {
            dVar2.B(eVar, 11, dVar.distanceInMeters);
        }
        if (dVar2.C(eVar) || Double.compare(dVar.elevationGainInMeters, 0.0d) != 0) {
            dVar2.B(eVar, 12, dVar.elevationGainInMeters);
        }
        if (dVar2.C(eVar) || Double.compare(dVar.elevationLossInMeters, 0.0d) != 0) {
            dVar2.B(eVar, 13, dVar.elevationLossInMeters);
        }
        if (dVar2.C(eVar) || Double.compare(dVar.startLatitude, 0.0d) != 0) {
            dVar2.B(eVar, 14, dVar.startLatitude);
        }
        if (dVar2.C(eVar) || Double.compare(dVar.startLongitude, 0.0d) != 0) {
            dVar2.B(eVar, 15, dVar.startLongitude);
        }
        if (dVar2.C(eVar) || Double.compare(dVar.speedInMetersPerSecond, 0.0d) != 0) {
            dVar2.B(eVar, 16, dVar.speedInMetersPerSecond);
        }
        if (dVar2.C(eVar) || dVar.isPublic) {
            dVar2.n(eVar, 17, dVar.isPublic);
        }
        if (dVar2.C(eVar) || dVar.createdDateFormatted != null) {
            dVar2.d(eVar, 18, y1.f117048a, dVar.createdDateFormatted);
        }
        if (dVar2.C(eVar) || dVar.updatedDateFormatted != null) {
            dVar2.d(eVar, 19, y1.f117048a, dVar.updatedDateFormatted);
        }
        if (dVar2.C(eVar) || dVar.isFavorite) {
            dVar2.n(eVar, 20, dVar.isFavorite);
        }
        if (dVar2.C(eVar) || dVar.coordinateSystem != null) {
            dVar2.d(eVar, 21, y1.f117048a, dVar.coordinateSystem);
        }
        if (dVar2.C(eVar) || dVar.originalCoordinateSystem != null) {
            dVar2.d(eVar, 22, y1.f117048a, dVar.originalCoordinateSystem);
        }
        if (dVar2.C(eVar) || dVar.consumer != null) {
            dVar2.d(eVar, 23, y1.f117048a, dVar.consumer);
        }
        if (dVar2.C(eVar) || dVar.intervalMarkers != null) {
            dVar2.d(eVar, 24, lVarArr[24].getValue(), dVar.intervalMarkers);
        }
        if (!dVar2.C(eVar) && dVar.powerGuideId == 0) {
            return;
        }
        dVar2.z(eVar, 25, dVar.powerGuideId);
    }

    public final x0 C() {
        com.garmin.android.apps.connectmobile.courses.model.a aVar = this.activityTypeDTO;
        if (aVar != null) {
            return z0.l(x0.f4346x, aVar != null ? aVar.typeKey : null);
        }
        return this.f32844e;
    }

    public final com.garmin.android.library.mapsdkadapter.i.b D() {
        com.garmin.android.library.mapsdkadapter.i.b bVarValueOf;
        try {
            String str = this.coordinateSystem;
            if (str != null && (bVarValueOf = com.garmin.android.library.mapsdkadapter.i.b.valueOf(str)) != null) {
                return bVarValueOf;
            }
            return com.garmin.android.library.mapsdkadapter.i.b.WGS84;
        } catch (IllegalArgumentException unused) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.COURSES;
            aVar.getClass();
            i2.a.p(a2Var, "CourseDTO", "Coordinate System not available, default: WGS-84");
            return com.garmin.android.library.mapsdkadapter.i.b.WGS84;
        }
    }

    public final boolean F() {
        if (this.isPublic) {
            return true;
        }
        int i14 = this.f32850k;
        AccessibleControlRule.b bVar = AccessibleControlRule.b.f32775c;
        if (i14 == bVar.f32772a) {
            return true;
        }
        j jVar = this.privacyRule;
        return jVar != null && jVar.getTypeId() == bVar.f32772a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        jSONObject.getClass();
        this.courseId = jSONObject.optString("courseId");
        this.userProfileId = jSONObject.optLong("userProfileId");
        this.userGroupId = jSONObject.optLong("userGroupId");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("activityType");
        jSONObjectOptJSONObject.getClass();
        this.f32844e = z0.l(x0.f4346x, new o(jSONObjectOptJSONObject).getTypeKey());
        this.courseName = jSONObject.optString("courseName");
        this.courseDescription = jSONObject.optString("courseDescription");
        this.createdDate = jSONObject.optLong("createdDate");
        this.updatedDate = jSONObject.optLong("updatedDate");
        this.isFavorite = jSONObject.optBoolean("favorite");
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("privacyRule");
        if (jSONObjectOptJSONObject2 != null) {
            this.f32850k = jSONObjectOptJSONObject2.optInt("typeId");
        }
        this.distanceInMeters = jSONObject.optDouble("distanceInMeters");
        this.elevationGainInMeters = jSONObject.optDouble("elevationGainInMeters");
        this.elevationLossInMeters = jSONObject.optDouble("elevationLossInMeters");
        this.startLatitude = jSONObject.optDouble("startLatitude");
        this.startLongitude = jSONObject.optDouble("startLongitude");
        this.speedInMetersPerSecond = jSONObject.optDouble("speedInMetersPerSecond");
        this.isPublic = jSONObject.optBoolean("public");
        this.createdDateFormatted = jSONObject.optString("createdDateFormatted");
        this.updatedDateFormatted = jSONObject.optString("updatedDateFormatted");
        try {
            String strOptString = jSONObject.optString("coordinateSystem");
            strOptString.getClass();
            com.garmin.android.library.mapsdkadapter.i.b bVarValueOf = com.garmin.android.library.mapsdkadapter.i.b.valueOf(strOptString);
            bVarValueOf.getClass();
            this.coordinateSystem = bVarValueOf.name();
        } catch (IllegalArgumentException unused) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.COURSES;
            aVar.getClass();
            i2.a.p(a2Var, "CourseDTO", "Coordinate System not available, set default: WGS-84");
            com.garmin.android.library.mapsdkadapter.i.b bVar = com.garmin.android.library.mapsdkadapter.i.b.WGS84;
            bVar.getClass();
            this.coordinateSystem = bVar.name();
        }
        try {
            String strOptString2 = jSONObject.optString("originalCoordinateSystem");
            strOptString2.getClass();
            com.garmin.android.library.mapsdkadapter.i.b bVarValueOf2 = com.garmin.android.library.mapsdkadapter.i.b.valueOf(strOptString2);
            bVarValueOf2.getClass();
            this.originalCoordinateSystem = bVarValueOf2.name();
        } catch (IllegalArgumentException unused2) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.COURSES;
            aVar2.getClass();
            i2.a.p(a2Var2, "CourseDTO", "Coordinate System not available, set default: WGS-84");
            com.garmin.android.library.mapsdkadapter.i.b bVar2 = com.garmin.android.library.mapsdkadapter.i.b.WGS84;
            bVar2.getClass();
            this.originalCoordinateSystem = bVar2.name();
        }
        this.consumer = jSONObject.optString("consumer");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.courseId);
        parcel.writeLong(this.userProfileId);
        parcel.writeLong(this.userGroupId);
        parcel.writeParcelable(this.activityTypeDTO, i14);
        parcel.writeString(this.courseName);
        parcel.writeString(this.courseDescription);
        parcel.writeLong(this.createdDate);
        parcel.writeLong(this.updatedDate);
        parcel.writeParcelable(this.privacyRule, i14);
        parcel.writeInt(this.f32850k);
        parcel.writeDouble(this.distanceInMeters);
        parcel.writeDouble(this.elevationGainInMeters);
        parcel.writeDouble(this.elevationLossInMeters);
        parcel.writeDouble(this.startLatitude);
        parcel.writeDouble(this.startLongitude);
        parcel.writeDouble(this.speedInMetersPerSecond);
        parcel.writeByte(this.isPublic ? (byte) 1 : (byte) 0);
        parcel.writeString(this.createdDateFormatted);
        parcel.writeString(this.updatedDateFormatted);
        parcel.writeByte(this.isFavorite ? (byte) 1 : (byte) 0);
        parcel.writeString(this.coordinateSystem);
        parcel.writeString(this.originalCoordinateSystem);
        parcel.writeString(this.consumer);
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.courses.model.d$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\nR\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\nR\u0014\u0010\u0019\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\nR\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\nR\u0014\u0010\u001b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\nR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\nR\u0014\u0010\u001d\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\nR\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\nR\u0014\u0010\u001f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\nR\u0014\u0010 \u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\nR\u0014\u0010!\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\nR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\"8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/d$c;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/d;", "serializer", "()Li63/c;", "", "TAG", "Ljava/lang/String;", "COURSE_ID", "USER_PROFILE_ID", "USER_GROUP_ID", "ACTIVITY_TYPE", "COURSE_NAME", "COURSE_DESCRIPTION", "CREATE_DATE", "UPDATE_DATE", "PRIVACY_RULE", "PRIVACY_TYPE_ID", "DISTANCE_IN_METERS", "ELEVATION_GAIN_IN_METERS", "ELEVATION_LOSS_IN_METERS", "START_LATITUDE", "START_LONGITUDE", "SPEED_IN_METERS_PER_SECOND", "PUBLIC", "CREATED_DATE_FORMATTED", "UPDATED_DATE_FORMATTED", "FAVORITE", "COORDINATE_SYSTEM", "ORIGINAL_COORDINATE_SYSTEM", "CONSUMER", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<d> serializer() {
            return a.f32864a;
        }

        private Companion() {
        }
    }

    public d() {
        this.f32844e = x0.f4346x;
    }

    public /* synthetic */ d(int i14, String str, long j8, long j14, com.garmin.android.apps.connectmobile.courses.model.a aVar, x0 x0Var, String str2, String str3, long j15, long j16, j jVar, int i15, double d14, double d15, double d16, double d17, double d18, double d19, boolean z14, String str4, String str5, boolean z15, String str6, String str7, String str8, List list, long j17, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.courseId = null;
        } else {
            this.courseId = str;
        }
        if ((i14 & 2) == 0) {
            this.userProfileId = 0L;
        } else {
            this.userProfileId = j8;
        }
        if ((i14 & 4) == 0) {
            this.userGroupId = 0L;
        } else {
            this.userGroupId = j14;
        }
        if ((i14 & 8) == 0) {
            this.activityTypeDTO = null;
        } else {
            this.activityTypeDTO = aVar;
        }
        this.f32844e = (i14 & 16) == 0 ? x0.f4346x : x0Var;
        if ((i14 & 32) == 0) {
            this.courseName = null;
        } else {
            this.courseName = str2;
        }
        if ((i14 & 64) == 0) {
            this.courseDescription = null;
        } else {
            this.courseDescription = str3;
        }
        if ((i14 & 128) == 0) {
            this.createdDate = 0L;
        } else {
            this.createdDate = j15;
        }
        if ((i14 & 256) == 0) {
            this.updatedDate = 0L;
        } else {
            this.updatedDate = j16;
        }
        if ((i14 & 512) == 0) {
            this.privacyRule = null;
        } else {
            this.privacyRule = jVar;
        }
        if ((i14 & 1024) == 0) {
            this.f32850k = 0;
        } else {
            this.f32850k = i15;
        }
        if ((i14 & 2048) == 0) {
            this.distanceInMeters = 0.0d;
        } else {
            this.distanceInMeters = d14;
        }
        if ((i14 & 4096) == 0) {
            this.elevationGainInMeters = 0.0d;
        } else {
            this.elevationGainInMeters = d15;
        }
        if ((i14 & 8192) == 0) {
            this.elevationLossInMeters = 0.0d;
        } else {
            this.elevationLossInMeters = d16;
        }
        if ((i14 & 16384) == 0) {
            this.startLatitude = 0.0d;
        } else {
            this.startLatitude = d17;
        }
        if ((32768 & i14) == 0) {
            this.startLongitude = 0.0d;
        } else {
            this.startLongitude = d18;
        }
        this.speedInMetersPerSecond = (65536 & i14) != 0 ? d19 : 0.0d;
        if ((131072 & i14) == 0) {
            this.isPublic = false;
        } else {
            this.isPublic = z14;
        }
        if ((262144 & i14) == 0) {
            this.createdDateFormatted = null;
        } else {
            this.createdDateFormatted = str4;
        }
        if ((524288 & i14) == 0) {
            this.updatedDateFormatted = null;
        } else {
            this.updatedDateFormatted = str5;
        }
        if ((1048576 & i14) == 0) {
            this.isFavorite = false;
        } else {
            this.isFavorite = z15;
        }
        if ((2097152 & i14) == 0) {
            this.coordinateSystem = null;
        } else {
            this.coordinateSystem = str6;
        }
        if ((4194304 & i14) == 0) {
            this.originalCoordinateSystem = null;
        } else {
            this.originalCoordinateSystem = str7;
        }
        if ((8388608 & i14) == 0) {
            this.consumer = null;
        } else {
            this.consumer = str8;
        }
        if ((16777216 & i14) == 0) {
            this.intervalMarkers = null;
        } else {
            this.intervalMarkers = list;
        }
        if ((i14 & 33554432) == 0) {
            this.powerGuideId = 0L;
        } else {
            this.powerGuideId = j17;
        }
    }

    public d(Parcel parcel) {
        parcel.getClass();
        this.f32844e = x0.f4346x;
        this.courseId = parcel.readString();
        this.userProfileId = parcel.readLong();
        this.userGroupId = parcel.readLong();
        this.activityTypeDTO = (com.garmin.android.apps.connectmobile.courses.model.a) parcel.readParcelable(com.garmin.android.apps.connectmobile.courses.model.a.class.getClassLoader());
        this.courseName = parcel.readString();
        this.courseDescription = parcel.readString();
        this.createdDate = parcel.readLong();
        this.updatedDate = parcel.readLong();
        this.privacyRule = (j) parcel.readParcelable(j.class.getClassLoader());
        this.f32850k = parcel.readInt();
        this.distanceInMeters = parcel.readDouble();
        this.elevationGainInMeters = parcel.readDouble();
        this.elevationLossInMeters = parcel.readDouble();
        this.startLatitude = parcel.readDouble();
        this.startLongitude = parcel.readDouble();
        this.speedInMetersPerSecond = parcel.readDouble();
        this.isPublic = parcel.readByte() != 0;
        this.createdDateFormatted = parcel.readString();
        this.updatedDateFormatted = parcel.readString();
        this.isFavorite = parcel.readByte() != 0;
        this.coordinateSystem = parcel.readString();
        this.originalCoordinateSystem = parcel.readString();
        this.consumer = parcel.readString();
    }
}
