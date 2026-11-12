package com.garmin.android.apps.connectmobile.courses.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.List;
import m63.a1;
import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.x;
import m63.y1;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002;\u0019By\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014B{\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0010\u0010\u0018R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001a\u001a\u0004\b,\u0010\u001c\"\u0004\b-\u0010\u001eR$\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010#\u001a\u0004\b/\u0010%\"\u0004\b0\u0010'R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u00101\u001a\u0004\b(\u00102\"\u0004\b3\u00104R*\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u00101\u001a\u0004\b.\u00102\"\u0004\b:\u00104¨\u0006<"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/CourseSegmentDTO;", "Landroid/os/Parcelable;", "", "courseId", "geoRoutePk", "", "bearing", "coordinateSystem", "originalCoordinateSystem", "distanceInMeters", "", "numberOfPoints", "", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "points", "sortOrder", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Lm63/u1;)V", "a", "Ljava/lang/String;", "getCourseId", "()Ljava/lang/String;", "g", "(Ljava/lang/String;)V", "b", "getGeoRoutePk", IntegerTokenConverter.CONVERTER_KEY, "c", "Ljava/lang/Double;", "getBearing", "()Ljava/lang/Double;", "setBearing", "(Ljava/lang/Double;)V", "d", "getCoordinateSystem", "setCoordinateSystem", JWKParameterNames.RSA_EXPONENT, "getOriginalCoordinateSystem", "setOriginalCoordinateSystem", "f", "getDistanceInMeters", "h", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "j", "(Ljava/lang/Integer;)V", "Ljava/util/List;", "getPoints", "()Ljava/util/List;", "setPoints", "(Ljava/util/List;)V", JWKParameterNames.OCT_KEY_VALUE, "CREATOR", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class CourseSegmentDTO implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f32792j = {null, null, null, null, null, null, null, m.a(n.PUBLICATION, new k01.a(25)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseId")
    private String courseId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("geoRoutePk")
    private String geoRoutePk;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bearing")
    private Double bearing;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("coordinateSystem")
    private String coordinateSystem;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("originalCoordinateSystem")
    private String originalCoordinateSystem;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("distanceInMeters")
    private Double distanceInMeters;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("numberOfPoints")
    private Integer numberOfPoints;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("points")
    private transient List<GeoPointDTO> points;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sortOrder")
    private Integer sortOrder;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/courses/model/CourseSegmentDTO.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/courses/model/CourseSegmentDTO;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<CourseSegmentDTO> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32802a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f32802a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.courses.model.CourseSegmentDTO", aVar, 9);
            m1Var.j("courseId", true);
            m1Var.j("geoRoutePk", true);
            m1Var.j("bearing", true);
            m1Var.j("coordinateSystem", true);
            m1Var.j("originalCoordinateSystem", true);
            m1Var.j("distanceInMeters", true);
            m1Var.j("numberOfPoints", true);
            m1Var.j("points", true);
            m1Var.j("sortOrder", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            l<i63.c<Object>>[] lVarArr = CourseSegmentDTO.f32792j;
            y1 y1Var = y1.f117048a;
            i63.c<?> cVarD = j63.a.d(y1Var);
            i63.c<?> cVarD2 = j63.a.d(y1Var);
            x xVar = x.f117036a;
            i63.c<?> cVarD3 = j63.a.d(xVar);
            i63.c<?> cVarD4 = j63.a.d(y1Var);
            i63.c<?> cVarD5 = j63.a.d(y1Var);
            i63.c<?> cVarD6 = j63.a.d(xVar);
            m0 m0Var = m0.f116981a;
            return new i63.c[]{cVarD, cVarD2, cVarD3, cVarD4, cVarD5, cVarD6, j63.a.d(m0Var), j63.a.d(lVarArr[7].getValue()), j63.a.d(m0Var)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<i63.c<Object>>[] lVarArr = CourseSegmentDTO.f32792j;
            int i14 = l63.c.f110557a;
            Integer num = null;
            boolean z14 = true;
            List list = null;
            int i15 = 0;
            String str = null;
            String str2 = null;
            Double d14 = null;
            String str3 = null;
            String str4 = null;
            Double d15 = null;
            Integer num2 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        str = (String) cVarC.v(eVar2, 0, y1.f117048a, str);
                        i15 |= 1;
                        break;
                    case 1:
                        str2 = (String) cVarC.v(eVar2, 1, y1.f117048a, str2);
                        i15 |= 2;
                        break;
                    case 2:
                        d14 = (Double) cVarC.v(eVar2, 2, x.f117036a, d14);
                        i15 |= 4;
                        break;
                    case 3:
                        str3 = (String) cVarC.v(eVar2, 3, y1.f117048a, str3);
                        i15 |= 8;
                        break;
                    case 4:
                        str4 = (String) cVarC.v(eVar2, 4, y1.f117048a, str4);
                        i15 |= 16;
                        break;
                    case 5:
                        d15 = (Double) cVarC.v(eVar2, 5, x.f117036a, d15);
                        i15 |= 32;
                        break;
                    case 6:
                        num2 = (Integer) cVarC.v(eVar2, 6, m0.f116981a, num2);
                        i15 |= 64;
                        break;
                    case 7:
                        list = (List) cVarC.v(eVar2, 7, lVarArr[7].getValue(), list);
                        i15 |= 128;
                        break;
                    case 8:
                        num = (Integer) cVarC.v(eVar2, 8, m0.f116981a, num);
                        i15 |= 256;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            cVarC.b(eVar2);
            return new CourseSegmentDTO(i15, str, str2, d14, str3, str4, d15, num2, list, num, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            CourseSegmentDTO courseSegmentDTO = (CourseSegmentDTO) obj;
            courseSegmentDTO.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            CourseSegmentDTO.m(courseSegmentDTO, dVarC, eVar);
            dVarC.b(eVar);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CourseSegmentDTO(Parcel parcel) {
        parcel.getClass();
        String string = parcel.readString();
        String string2 = parcel.readString();
        Class cls = Double.TYPE;
        Object value = parcel.readValue(cls.getClassLoader());
        Double d14 = value instanceof Double ? (Double) value : null;
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        Object value2 = parcel.readValue(cls.getClassLoader());
        Double d15 = value2 instanceof Double ? (Double) value2 : null;
        Class cls2 = Integer.TYPE;
        Object value3 = parcel.readValue(cls2.getClassLoader());
        Integer num = value3 instanceof Integer ? (Integer) value3 : null;
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(GeoPointDTO.CREATOR);
        Object value4 = parcel.readValue(cls2.getClassLoader());
        this(string, string2, d14, string3, string4, d15, num, arrayListCreateTypedArrayList, value4 instanceof Integer ? (Integer) value4 : null);
    }

    public static CourseSegmentDTO b(CourseSegmentDTO courseSegmentDTO, Integer num) {
        String str = courseSegmentDTO.courseId;
        String str2 = courseSegmentDTO.geoRoutePk;
        Double d14 = courseSegmentDTO.bearing;
        String str3 = courseSegmentDTO.coordinateSystem;
        String str4 = courseSegmentDTO.originalCoordinateSystem;
        Double d15 = courseSegmentDTO.distanceInMeters;
        Integer num2 = courseSegmentDTO.numberOfPoints;
        List<GeoPointDTO> list = courseSegmentDTO.points;
        courseSegmentDTO.getClass();
        return new CourseSegmentDTO(str, str2, d14, str3, str4, d15, num2, list, num);
    }

    public static final /* synthetic */ void m(CourseSegmentDTO courseSegmentDTO, l63.d dVar, k63.e eVar) {
        Integer num;
        Integer num2;
        Double dValueOf = Double.valueOf(0.0d);
        if (dVar.C(eVar) || courseSegmentDTO.courseId != null) {
            dVar.d(eVar, 0, y1.f117048a, courseSegmentDTO.courseId);
        }
        if (dVar.C(eVar) || courseSegmentDTO.geoRoutePk != null) {
            dVar.d(eVar, 1, y1.f117048a, courseSegmentDTO.geoRoutePk);
        }
        if (dVar.C(eVar) || !s.g(courseSegmentDTO.bearing, dValueOf)) {
            dVar.d(eVar, 2, x.f117036a, courseSegmentDTO.bearing);
        }
        if (dVar.C(eVar) || courseSegmentDTO.coordinateSystem != null) {
            dVar.d(eVar, 3, y1.f117048a, courseSegmentDTO.coordinateSystem);
        }
        if (dVar.C(eVar) || courseSegmentDTO.originalCoordinateSystem != null) {
            dVar.d(eVar, 4, y1.f117048a, courseSegmentDTO.originalCoordinateSystem);
        }
        if (dVar.C(eVar) || !s.g(courseSegmentDTO.distanceInMeters, dValueOf)) {
            dVar.d(eVar, 5, x.f117036a, courseSegmentDTO.distanceInMeters);
        }
        if (dVar.C(eVar) || (num2 = courseSegmentDTO.numberOfPoints) == null || num2.intValue() != 0) {
            dVar.d(eVar, 6, m0.f116981a, courseSegmentDTO.numberOfPoints);
        }
        if (dVar.C(eVar) || courseSegmentDTO.points != null) {
            dVar.d(eVar, 7, f32792j[7].getValue(), courseSegmentDTO.points);
        }
        if (dVar.C(eVar) || (num = courseSegmentDTO.sortOrder) == null || num.intValue() != 0) {
            dVar.d(eVar, 8, m0.f116981a, courseSegmentDTO.sortOrder);
        }
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getNumberOfPoints() {
        return this.numberOfPoints;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseSegmentDTO)) {
            return false;
        }
        CourseSegmentDTO courseSegmentDTO = (CourseSegmentDTO) obj;
        return s.g(this.courseId, courseSegmentDTO.courseId) && s.g(this.geoRoutePk, courseSegmentDTO.geoRoutePk) && s.g(this.bearing, courseSegmentDTO.bearing) && s.g(this.coordinateSystem, courseSegmentDTO.coordinateSystem) && s.g(this.originalCoordinateSystem, courseSegmentDTO.originalCoordinateSystem) && s.g(this.distanceInMeters, courseSegmentDTO.distanceInMeters) && s.g(this.numberOfPoints, courseSegmentDTO.numberOfPoints) && s.g(this.points, courseSegmentDTO.points) && s.g(this.sortOrder, courseSegmentDTO.sortOrder);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getSortOrder() {
        return this.sortOrder;
    }

    public final void g(String str) {
        this.courseId = str;
    }

    public final void h(Double d14) {
        this.distanceInMeters = d14;
    }

    public final int hashCode() {
        String str = this.courseId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.geoRoutePk;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d14 = this.bearing;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str3 = this.coordinateSystem;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.originalCoordinateSystem;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d15 = this.distanceInMeters;
        int iHashCode6 = (iHashCode5 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Integer num = this.numberOfPoints;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        List<GeoPointDTO> list = this.points;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.sortOrder;
        return iHashCode8 + (num2 != null ? num2.hashCode() : 0);
    }

    public final void i(String str) {
        this.geoRoutePk = str;
    }

    public final void j(Integer num) {
        this.numberOfPoints = num;
    }

    public final void k(Integer num) {
        this.sortOrder = num;
    }

    public final String toString() {
        String str = this.courseId;
        String str2 = this.geoRoutePk;
        Double d14 = this.bearing;
        String str3 = this.coordinateSystem;
        String str4 = this.originalCoordinateSystem;
        Double d15 = this.distanceInMeters;
        Integer num = this.numberOfPoints;
        List<GeoPointDTO> list = this.points;
        Integer num2 = this.sortOrder;
        StringBuilder sbI = p6.b.i("CourseSegmentDTO(courseId=", str, ", geoRoutePk=", str2, ", bearing=");
        b71.i.u(sbI, d14, ", coordinateSystem=", str3, ", originalCoordinateSystem=");
        b71.i.x(sbI, str4, ", distanceInMeters=", d15, ", numberOfPoints=");
        sbI.append(num);
        sbI.append(", points=");
        sbI.append(list);
        sbI.append(", sortOrder=");
        return f3.i(sbI, num2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.courseId);
        parcel.writeString(this.geoRoutePk);
        parcel.writeValue(this.bearing);
        parcel.writeString(this.coordinateSystem);
        parcel.writeString(this.originalCoordinateSystem);
        parcel.writeValue(this.distanceInMeters);
        parcel.writeValue(this.numberOfPoints);
        parcel.writeTypedList(this.points);
        parcel.writeValue(this.sortOrder);
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.courses.model.CourseSegmentDTO$CREATOR, reason: from kotlin metadata */
    @a1
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/CourseSegmentDTO$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/courses/model/CourseSegmentDTO;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<CourseSegmentDTO> {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final CourseSegmentDTO createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new CourseSegmentDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CourseSegmentDTO[] newArray(int i14) {
            return new CourseSegmentDTO[i14];
        }

        public final i63.c<CourseSegmentDTO> serializer() {
            return a.f32802a;
        }

        private Companion() {
        }
    }

    public CourseSegmentDTO(String str, String str2, Double d14, String str3, String str4, Double d15, Integer num, List<GeoPointDTO> list, Integer num2) {
        this.courseId = str;
        this.geoRoutePk = str2;
        this.bearing = d14;
        this.coordinateSystem = str3;
        this.originalCoordinateSystem = str4;
        this.distanceInMeters = d15;
        this.numberOfPoints = num;
        this.points = list;
        this.sortOrder = num2;
    }

    public /* synthetic */ CourseSegmentDTO(int i14, String str, String str2, Double d14, String str3, String str4, Double d15, Integer num, List list, Integer num2, u1 u1Var) {
        Double dValueOf = Double.valueOf(0.0d);
        if ((i14 & 1) == 0) {
            this.courseId = null;
        } else {
            this.courseId = str;
        }
        if ((i14 & 2) == 0) {
            this.geoRoutePk = null;
        } else {
            this.geoRoutePk = str2;
        }
        if ((i14 & 4) == 0) {
            this.bearing = dValueOf;
        } else {
            this.bearing = d14;
        }
        if ((i14 & 8) == 0) {
            this.coordinateSystem = null;
        } else {
            this.coordinateSystem = str3;
        }
        if ((i14 & 16) == 0) {
            this.originalCoordinateSystem = null;
        } else {
            this.originalCoordinateSystem = str4;
        }
        if ((i14 & 32) == 0) {
            this.distanceInMeters = dValueOf;
        } else {
            this.distanceInMeters = d15;
        }
        if ((i14 & 64) == 0) {
            this.numberOfPoints = 0;
        } else {
            this.numberOfPoints = num;
        }
        if ((i14 & 128) == 0) {
            this.points = null;
        } else {
            this.points = list;
        }
        if ((i14 & 256) == 0) {
            this.sortOrder = 0;
        } else {
            this.sortOrder = num2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CourseSegmentDTO(String str, String str2, Double d14, String str3, String str4, Double d15, Integer num, List list, Integer num2, int i14, p005kotlin.jvm.internal.j jVar) {
        Double dValueOf = Double.valueOf(0.0d);
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? dValueOf : d14, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? dValueOf : d15, (i14 & 64) != 0 ? 0 : num, (i14 & 128) != 0 ? null : list, (i14 & 256) != 0 ? 0 : num2);
    }

    public CourseSegmentDTO() {
        this((String) null, (String) null, (Double) null, (String) null, (String) null, (Double) null, (Integer) null, (List) null, (Integer) null, 511, (p005kotlin.jvm.internal.j) null);
    }
}
