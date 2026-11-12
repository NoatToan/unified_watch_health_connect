package com.garmin.android.apps.connectmobile.courses.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.UUID;
import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.x;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b#\b\u0007\u0018\u0000 E2\u00020\u0001:\u0002-&B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\nB\u0011\b\u0014\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0002\u0010\rB\u001d\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0002\u0010\u0010B±\u0001\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0013\u0012\b\u0010!\u001a\u0004\u0018\u00010\b\u0012\b\u0010\"\u001a\u0004\u0018\u00010\b\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b\u0002\u0010%R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b(\u0010,R$\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010'\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R$\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010,\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b6\u00105R$\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u00105\u001a\u0004\b6\u00108\"\u0004\b9\u0010:R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b;\u00105R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b<\u00105R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b=\u0010,R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b*\u0010>R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b?\u0010>R(\u0010 \u001a\u0004\u0018\u00010\u00132\b\u0010@\u001a\u0004\u0018\u00010\u00138\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b2\u0010'\u001a\u0004\bA\u0010)R(\u0010!\u001a\u0004\u0018\u00010\b2\b\u0010@\u001a\u0004\u0018\u00010\b8\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\bB\u0010,\u001a\u0004\bC\u00101R(\u0010\"\u001a\u0004\u0018\u00010\b2\b\u0010@\u001a\u0004\u0018\u00010\b8\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b9\u0010,\u001a\u0004\bD\u00101¨\u0006F"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/g;", "Landroid/os/Parcelable;", "<init>", "()V", "point", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;)V", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "geoPoint", "", "name", "(Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;Ljava/lang/String;)V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "Lcom/google/android/gms/maps/model/LatLng;", FirebaseAnalytics.Param.LOCATION, "(Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLng;)V", "", "seen0", "", "coursePointId", "coursePk", "coursePointType", "", "lat", "lon", "distance", "elevation", "derivedElevation", "note", "cutoffDuration", "restDuration", "timestamp", "createdDate", "modifiedDate", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lm63/u1;)V", "a", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", JWKParameterNames.OCT_KEY_VALUE, "(Ljava/lang/Long;)V", "Ljava/lang/String;", "c", "getCoursePk", "setCoursePk", "d", "()Ljava/lang/String;", "m", "(Ljava/lang/String;)V", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Double;", "f", "g", "()Ljava/lang/Double;", "o", "(Ljava/lang/Double;)V", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "Ljava/lang/Integer;", "l", "value", "getTimestamp", JWKParameterNames.RSA_MODULUS, "getCreatedDate", "getModifiedDate", "Companion", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final class g implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("coursePointId")
    private Long coursePointId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    public String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("coursePk")
    private Long coursePk;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("coursePointType")
    private String coursePointType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lat")
    public Double lat;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lon")
    public Double lon;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("distance")
    private Double distance;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("elevation")
    public Double elevation;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("derivedElevation")
    public Double derivedElevation;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("note")
    public String note;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cutoffDuration")
    public Integer cutoffDuration;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("restDuration")
    public Integer restDuration;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timestamp")
    private Long timestamp;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createdDate")
    private String createdDate;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("modifiedDate")
    private String modifiedDate;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<g> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/courses/model/CoursePointDTO.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32944a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f32944a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.courses.model.CoursePointDTO", aVar, 15);
            m1Var.j("coursePointId", true);
            m1Var.j("name", true);
            m1Var.j("coursePk", true);
            m1Var.j("coursePointType", true);
            m1Var.j("lat", true);
            m1Var.j("lon", true);
            m1Var.j("distance", true);
            m1Var.j("elevation", true);
            m1Var.j("derivedElevation", true);
            m1Var.j("note", true);
            m1Var.j("cutoffDuration", true);
            m1Var.j("restDuration", true);
            m1Var.j("timestamp", true);
            m1Var.j("createdDate", true);
            m1Var.j("modifiedDate", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            v0 v0Var = v0.f117027a;
            i63.c<?> cVarD = j63.a.d(v0Var);
            y1 y1Var = y1.f117048a;
            i63.c<?> cVarD2 = j63.a.d(y1Var);
            i63.c<?> cVarD3 = j63.a.d(v0Var);
            i63.c<?> cVarD4 = j63.a.d(y1Var);
            x xVar = x.f117036a;
            i63.c<?> cVarD5 = j63.a.d(xVar);
            i63.c<?> cVarD6 = j63.a.d(xVar);
            i63.c<?> cVarD7 = j63.a.d(xVar);
            i63.c<?> cVarD8 = j63.a.d(xVar);
            i63.c<?> cVarD9 = j63.a.d(xVar);
            i63.c<?> cVarD10 = j63.a.d(y1Var);
            m0 m0Var = m0.f116981a;
            return new i63.c[]{cVarD, cVarD2, cVarD3, cVarD4, cVarD5, cVarD6, cVarD7, cVarD8, cVarD9, cVarD10, j63.a.d(m0Var), j63.a.d(m0Var), j63.a.d(v0Var), j63.a.d(y1Var), j63.a.d(y1Var)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            Long l14;
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            Integer num = null;
            Integer num2 = null;
            String str = null;
            Long l15 = null;
            Double d14 = null;
            int i15 = 0;
            String str2 = null;
            String str3 = null;
            Long l16 = null;
            String str4 = null;
            Double d15 = null;
            Double d16 = null;
            Double d17 = null;
            Double d18 = null;
            boolean z14 = true;
            Long l17 = null;
            String str5 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        num = num;
                        str4 = str4;
                        z14 = false;
                        num2 = num2;
                        str4 = str4;
                        num = num;
                        break;
                    case 0:
                        l14 = l16;
                        l17 = (Long) cVarC.v(eVar2, 0, v0.f117027a, l17);
                        i15 |= 1;
                        num2 = num2;
                        l16 = l14;
                        str4 = str4;
                        num = num;
                        break;
                    case 1:
                        l14 = l16;
                        str5 = (String) cVarC.v(eVar2, 1, y1.f117048a, str5);
                        i15 |= 2;
                        l16 = l14;
                        str4 = str4;
                        num = num;
                        break;
                    case 2:
                        num = num;
                        str4 = str4;
                        l16 = (Long) cVarC.v(eVar2, 2, v0.f117027a, l16);
                        i15 |= 4;
                        str4 = str4;
                        num = num;
                        break;
                    case 3:
                        num = num;
                        str4 = (String) cVarC.v(eVar2, 3, y1.f117048a, str4);
                        i15 |= 8;
                        l16 = l16;
                        num = num;
                        break;
                    case 4:
                        d15 = (Double) cVarC.v(eVar2, 4, x.f117036a, d15);
                        i15 |= 16;
                        l16 = l16;
                        str4 = str4;
                        break;
                    case 5:
                        d16 = (Double) cVarC.v(eVar2, 5, x.f117036a, d16);
                        i15 |= 32;
                        l16 = l16;
                        str4 = str4;
                        break;
                    case 6:
                        d17 = (Double) cVarC.v(eVar2, 6, x.f117036a, d17);
                        i15 |= 64;
                        l16 = l16;
                        str4 = str4;
                        break;
                    case 7:
                        d18 = (Double) cVarC.v(eVar2, 7, x.f117036a, d18);
                        i15 |= 128;
                        l16 = l16;
                        str4 = str4;
                        break;
                    case 8:
                        d14 = (Double) cVarC.v(eVar2, 8, x.f117036a, d14);
                        i15 |= 256;
                        l16 = l16;
                        str4 = str4;
                        break;
                    case 9:
                        str = (String) cVarC.v(eVar2, 9, y1.f117048a, str);
                        i15 |= 512;
                        l16 = l16;
                        str4 = str4;
                        break;
                    case 10:
                        num2 = (Integer) cVarC.v(eVar2, 10, m0.f116981a, num2);
                        i15 |= 1024;
                        l16 = l16;
                        str4 = str4;
                        break;
                    case 11:
                        num = (Integer) cVarC.v(eVar2, 11, m0.f116981a, num);
                        i15 |= 2048;
                        l16 = l16;
                        str4 = str4;
                        break;
                    case 12:
                        l15 = (Long) cVarC.v(eVar2, 12, v0.f117027a, l15);
                        i15 |= 4096;
                        l16 = l16;
                        str4 = str4;
                        break;
                    case 13:
                        str2 = (String) cVarC.v(eVar2, 13, y1.f117048a, str2);
                        i15 |= 8192;
                        l16 = l16;
                        str4 = str4;
                        break;
                    case 14:
                        str3 = (String) cVarC.v(eVar2, 14, y1.f117048a, str3);
                        i15 |= 16384;
                        l16 = l16;
                        str4 = str4;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            Integer num3 = num;
            Long l18 = l16;
            String str6 = str4;
            Long l19 = l17;
            String str7 = str5;
            cVarC.b(eVar2);
            return new g(i15, l19, str7, l18, str6, d15, d16, d17, d18, d14, str, num2, num3, l15, str2, str3, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF116202c() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            g gVar = (g) obj;
            gVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            g.q(gVar, dVarC, eVar);
            dVarC.b(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/courses/model/g$b", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32945a;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[f.MARKER_MILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.MARKER_KILOMETER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.MARKER_HALF_MARATHON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f32945a = iArr;
        }
    }

    public g(Parcel parcel) {
        parcel.getClass();
        this.coursePointId = Long.valueOf(Math.abs(UUID.randomUUID().getMostSignificantBits()));
        this.coursePointType = "GENERIC";
        this.coursePointId = parcel.readByte() == 0 ? null : Long.valueOf(parcel.readLong());
        this.name = parcel.readString();
        this.coursePk = parcel.readByte() == 0 ? null : Long.valueOf(parcel.readLong());
        this.coursePointType = parcel.readString();
        this.lat = j(parcel);
        this.lon = j(parcel);
        this.distance = j(parcel);
        this.elevation = j(parcel);
        this.derivedElevation = j(parcel);
        this.note = parcel.readString();
        int i14 = parcel.readInt();
        if (i14 > -1) {
            this.cutoffDuration = Integer.valueOf(i14);
        }
        int i15 = parcel.readInt();
        if (i15 > -1) {
            this.restDuration = Integer.valueOf(i15);
        }
        this.timestamp = parcel.readByte() != 0 ? Long.valueOf(parcel.readLong()) : null;
        this.createdDate = parcel.readString();
        this.modifiedDate = parcel.readString();
    }

    public static Double j(Parcel parcel) {
        if (parcel.readByte() == 0) {
            return null;
        }
        return Double.valueOf(parcel.readDouble());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    public static final /* synthetic */ void q(g gVar, l63.d dVar, k63.e eVar) {
        if (dVar.C(eVar)) {
            dVar.d(eVar, 0, v0.f117027a, gVar.coursePointId);
        } else {
            Long l14 = gVar.coursePointId;
            long jAbs = Math.abs(UUID.randomUUID().getMostSignificantBits());
            if (l14 == null || l14.longValue() != jAbs) {
                dVar.d(eVar, 0, v0.f117027a, gVar.coursePointId);
            }
        }
        if (dVar.C(eVar) || gVar.name != null) {
            dVar.d(eVar, 1, y1.f117048a, gVar.name);
        }
        if (dVar.C(eVar) || gVar.coursePk != null) {
            dVar.d(eVar, 2, v0.f117027a, gVar.coursePk);
        }
        if (dVar.C(eVar) || !s.g(gVar.coursePointType, "GENERIC")) {
            dVar.d(eVar, 3, y1.f117048a, gVar.coursePointType);
        }
        if (dVar.C(eVar) || gVar.lat != null) {
            dVar.d(eVar, 4, x.f117036a, gVar.lat);
        }
        if (dVar.C(eVar) || gVar.lon != null) {
            dVar.d(eVar, 5, x.f117036a, gVar.lon);
        }
        if (dVar.C(eVar) || gVar.distance != null) {
            dVar.d(eVar, 6, x.f117036a, gVar.distance);
        }
        if (dVar.C(eVar) || gVar.elevation != null) {
            dVar.d(eVar, 7, x.f117036a, gVar.elevation);
        }
        if (dVar.C(eVar) || gVar.derivedElevation != null) {
            dVar.d(eVar, 8, x.f117036a, gVar.derivedElevation);
        }
        if (dVar.C(eVar) || gVar.note != null) {
            dVar.d(eVar, 9, y1.f117048a, gVar.note);
        }
        if (dVar.C(eVar) || gVar.cutoffDuration != null) {
            dVar.d(eVar, 10, m0.f116981a, gVar.cutoffDuration);
        }
        if (dVar.C(eVar) || gVar.restDuration != null) {
            dVar.d(eVar, 11, m0.f116981a, gVar.restDuration);
        }
        if (dVar.C(eVar) || gVar.timestamp != null) {
            dVar.d(eVar, 12, v0.f117027a, gVar.timestamp);
        }
        if (dVar.C(eVar) || gVar.createdDate != null) {
            dVar.d(eVar, 13, y1.f117048a, gVar.createdDate);
        }
        if (!dVar.C(eVar) && gVar.modifiedDate == null) {
            return;
        }
        dVar.d(eVar, 14, y1.f117048a, gVar.modifiedDate);
    }

    public static void r(Parcel parcel, Double d14) {
        if (d14 == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeDouble(d14.doubleValue());
        }
    }

    public static void s(Parcel parcel, Long l14) {
        if (l14 == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(l14.longValue());
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getCoursePointId() {
        return this.coursePointId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCoursePointType() {
        return this.coursePointType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!g.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        g gVar = (g) obj;
        return s.g(this.coursePointId, gVar.coursePointId) && s.g(this.coursePk, gVar.coursePk) && s.d(this.lat, gVar.lat) && s.d(this.lon, gVar.lon) && s.d(this.distance, gVar.distance) && s.d(this.elevation, gVar.elevation) && s.d(this.derivedElevation, gVar.derivedElevation) && s.g(this.cutoffDuration, gVar.cutoffDuration) && s.g(this.restDuration, gVar.restDuration) && s.g(this.timestamp, gVar.timestamp) && s.g(this.name, gVar.name) && s.g(this.coursePointType, gVar.coursePointType) && s.g(this.note, gVar.note) && s.g(this.createdDate, gVar.createdDate) && s.g(this.modifiedDate, gVar.modifiedDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getDistance() {
        return this.distance;
    }

    public final boolean g() {
        f.a aVar = f.f32898h;
        String str = this.coursePointType;
        aVar.getClass();
        int i14 = d.f32945a[f.a.a(str).ordinal()];
        return i14 == 1 || i14 == 2 || i14 == 3;
    }

    public final boolean h(g gVar) {
        if (gVar != null) {
            Double d14 = gVar.lat;
            Double d15 = gVar.lon;
            if (d14 != null && d15 != null && s.d(d14, this.lat) && s.d(d15, this.lon)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Long l14 = this.coursePointId;
        int iHashCode = 0;
        int iHashCode2 = ((l14 == null || l14 == null) ? 0 : l14.hashCode()) * 31;
        String str = this.name;
        int iHashCode3 = (iHashCode2 + ((str == null || str == null) ? 0 : str.hashCode())) * 31;
        Long l15 = this.coursePk;
        int iHashCode4 = (iHashCode3 + ((l15 == null || l15 == null) ? 0 : l15.hashCode())) * 31;
        String str2 = this.coursePointType;
        int iHashCode5 = (iHashCode4 + ((str2 == null || str2 == null) ? 0 : str2.hashCode())) * 31;
        Double d14 = this.lat;
        int iHashCode6 = (iHashCode5 + ((d14 == null || d14 == null) ? 0 : d14.hashCode())) * 31;
        Double d15 = this.lon;
        int iHashCode7 = (iHashCode6 + ((d15 == null || d15 == null) ? 0 : d15.hashCode())) * 31;
        Double d16 = this.distance;
        int iHashCode8 = (iHashCode7 + ((d16 == null || d16 == null) ? 0 : d16.hashCode())) * 31;
        Double d17 = this.elevation;
        int iHashCode9 = (iHashCode8 + ((d17 == null || d17 == null) ? 0 : d17.hashCode())) * 31;
        Double d18 = this.derivedElevation;
        int iHashCode10 = (iHashCode9 + ((d18 == null || d18 == null) ? 0 : d18.hashCode())) * 31;
        String str3 = this.note;
        int iHashCode11 = (iHashCode10 + ((str3 == null || str3 == null) ? 0 : str3.hashCode())) * 31;
        Integer num = this.cutoffDuration;
        int iHashCode12 = (iHashCode11 + ((num == null || num == null) ? 0 : num.hashCode())) * 31;
        Integer num2 = this.restDuration;
        int iHashCode13 = (iHashCode12 + ((num2 == null || num2 == null) ? 0 : num2.hashCode())) * 31;
        Long l16 = this.timestamp;
        int iHashCode14 = (iHashCode13 + ((l16 == null || l16 == null) ? 0 : l16.hashCode())) * 31;
        String str4 = this.createdDate;
        int iHashCode15 = (iHashCode14 + ((str4 == null || str4 == null) ? 0 : str4.hashCode())) * 31;
        String str5 = this.modifiedDate;
        if (str5 != null && str5 != null) {
            iHashCode = str5.hashCode();
        }
        return iHashCode15 + iHashCode;
    }

    public final boolean i(LatLng latLng) {
        Double d14;
        return (latLng == null || (d14 = this.lat) == null || this.lon == null || !s.c(d14, latLng.latitude) || !s.c(this.lon, latLng.longitude)) ? false : true;
    }

    public final void k() {
        this.coursePointId = null;
    }

    public final void m(String str) {
        this.coursePointType = str;
    }

    public final void o(Double d14) {
        this.distance = d14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        s(parcel, this.coursePointId);
        parcel.writeString(this.name);
        s(parcel, this.coursePk);
        parcel.writeString(this.coursePointType);
        r(parcel, this.lat);
        r(parcel, this.lon);
        r(parcel, this.distance);
        r(parcel, this.elevation);
        r(parcel, this.derivedElevation);
        parcel.writeString(this.note);
        Integer num = this.cutoffDuration;
        parcel.writeInt(num != null ? num.intValue() : -1);
        Integer num2 = this.restDuration;
        parcel.writeInt(num2 != null ? num2.intValue() : -1);
        s(parcel, this.timestamp);
        parcel.writeString(this.createdDate);
        parcel.writeString(this.modifiedDate);
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.courses.model.g$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/g$c;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "serializer", "()Li63/c;", "", "TYPE_GENERIC", "Ljava/lang/String;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<g> serializer() {
            return a.f32944a;
        }

        private Companion() {
        }
    }

    public g() {
        this.coursePointId = Long.valueOf(Math.abs(UUID.randomUUID().getMostSignificantBits()));
        this.coursePointType = "GENERIC";
    }

    public g(g gVar) {
        this.coursePointId = Long.valueOf(Math.abs(UUID.randomUUID().getMostSignificantBits()));
        this.coursePointType = "GENERIC";
        if (gVar != null) {
            this.coursePointId = gVar.coursePointId;
            this.name = gVar.name;
            this.coursePk = gVar.coursePk;
            this.coursePointType = gVar.coursePointType;
            this.lat = gVar.lat;
            this.lon = gVar.lon;
            this.distance = gVar.distance;
            this.elevation = gVar.elevation;
            this.derivedElevation = gVar.derivedElevation;
            this.note = gVar.note;
            this.cutoffDuration = gVar.cutoffDuration;
            this.restDuration = gVar.restDuration;
            this.timestamp = gVar.timestamp;
            this.createdDate = gVar.createdDate;
            this.modifiedDate = gVar.modifiedDate;
        }
    }

    public g(GeoPointDTO geoPointDTO, String str) {
        geoPointDTO.getClass();
        this.coursePointId = Long.valueOf(Math.abs(UUID.randomUUID().getMostSignificantBits()));
        this.coursePointType = "GENERIC";
        this.name = str;
        this.elevation = geoPointDTO.elevation;
        this.lat = geoPointDTO.latitude;
        this.lon = geoPointDTO.longitude;
        this.distance = geoPointDTO.distance;
    }

    public /* synthetic */ g(int i14, Long l14, String str, Long l15, String str2, Double d14, Double d15, Double d16, Double d17, Double d18, String str3, Integer num, Integer num2, Long l16, String str4, String str5, u1 u1Var) {
        this.coursePointId = (i14 & 1) == 0 ? Long.valueOf(Math.abs(UUID.randomUUID().getMostSignificantBits())) : l14;
        if ((i14 & 2) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i14 & 4) == 0) {
            this.coursePk = null;
        } else {
            this.coursePk = l15;
        }
        if ((i14 & 8) == 0) {
            this.coursePointType = "GENERIC";
        } else {
            this.coursePointType = str2;
        }
        if ((i14 & 16) == 0) {
            this.lat = null;
        } else {
            this.lat = d14;
        }
        if ((i14 & 32) == 0) {
            this.lon = null;
        } else {
            this.lon = d15;
        }
        if ((i14 & 64) == 0) {
            this.distance = null;
        } else {
            this.distance = d16;
        }
        if ((i14 & 128) == 0) {
            this.elevation = null;
        } else {
            this.elevation = d17;
        }
        if ((i14 & 256) == 0) {
            this.derivedElevation = null;
        } else {
            this.derivedElevation = d18;
        }
        if ((i14 & 512) == 0) {
            this.note = null;
        } else {
            this.note = str3;
        }
        if ((i14 & 1024) == 0) {
            this.cutoffDuration = null;
        } else {
            this.cutoffDuration = num;
        }
        if ((i14 & 2048) == 0) {
            this.restDuration = null;
        } else {
            this.restDuration = num2;
        }
        if ((i14 & 4096) == 0) {
            this.timestamp = null;
        } else {
            this.timestamp = l16;
        }
        if ((i14 & 8192) == 0) {
            this.createdDate = null;
        } else {
            this.createdDate = str4;
        }
        if ((i14 & 16384) == 0) {
            this.modifiedDate = null;
        } else {
            this.modifiedDate = str5;
        }
    }

    public g(String str, LatLng latLng) {
        this.coursePointId = Long.valueOf(Math.abs(UUID.randomUUID().getMostSignificantBits()));
        this.name = str;
        this.coursePointType = "GENERIC";
        if (latLng != null) {
            this.lat = Double.valueOf(latLng.latitude);
            this.lon = Double.valueOf(latLng.longitude);
        }
    }
}
