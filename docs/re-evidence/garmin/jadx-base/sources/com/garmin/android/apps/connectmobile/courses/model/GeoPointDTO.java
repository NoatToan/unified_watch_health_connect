package com.garmin.android.apps.connectmobile.courses.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import m63.e0;
import m63.m1;
import m63.u1;
import m63.x;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 $2\u00020\u0001:\u0002\u0019\u0016B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0002\u0010\tB)\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\rB\u0011\b\u0014\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0002\u0010\u0010BC\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0002\u0010\u0015R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0011\u0010\u001d\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010!\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b \u0010\u001cR\u0011\u0010#\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001c¨\u0006%"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "Landroid/os/Parcelable;", "<init>", "()V", "", "latitude", "longitude", "(DD)V", "elevation", "(DDLjava/lang/Double;)V", "distance", "(DDDD)V", "geoPointDTO", "(Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;)V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lm63/u1;)V", "a", "Ljava/lang/Double;", "b", "c", "d", "getLatitudeAsPrimitive", "()D", "latitudeAsPrimitive", "getLongitudeAsPrimitive", "longitudeAsPrimitive", "getElevationAsPrimitive", "elevationAsPrimitive", "getDistanceAsPrimitive", "distanceAsPrimitive", "Companion", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final class GeoPointDTO implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("latitude")
    public Double latitude;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("longitude")
    public Double longitude;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("elevation")
    public Double elevation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("distance")
    public Double distance;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f32803e = 8;
    public static final Parcelable.Creator<GeoPointDTO> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/courses/model/GeoPointDTO.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<GeoPointDTO> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32808a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f32808a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO", aVar, 4);
            m1Var.j("latitude", true);
            m1Var.j("longitude", true);
            m1Var.j("elevation", true);
            m1Var.j("distance", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            x xVar = x.f117036a;
            return new i63.c[]{j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            Double d14 = null;
            Double d15 = null;
            Double d16 = null;
            Double d17 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    d14 = (Double) cVarC.v(eVar2, 0, x.f117036a, d14);
                    i15 |= 1;
                } else if (iE == 1) {
                    d15 = (Double) cVarC.v(eVar2, 1, x.f117036a, d15);
                    i15 |= 2;
                } else if (iE == 2) {
                    d16 = (Double) cVarC.v(eVar2, 2, x.f117036a, d16);
                    i15 |= 4;
                } else {
                    if (iE != 3) {
                        hb.a.o(iE);
                        return null;
                    }
                    d17 = (Double) cVarC.v(eVar2, 3, x.f117036a, d17);
                    i15 |= 8;
                }
            }
            cVarC.b(eVar2);
            return new GeoPointDTO(i15, d14, d15, d16, d17, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF116202c() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            GeoPointDTO geoPointDTO = (GeoPointDTO) obj;
            geoPointDTO.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            if (dVarC.C(eVar) || geoPointDTO.latitude != null) {
                dVarC.d(eVar, 0, x.f117036a, geoPointDTO.latitude);
            }
            if (dVarC.C(eVar) || geoPointDTO.longitude != null) {
                dVarC.d(eVar, 1, x.f117036a, geoPointDTO.longitude);
            }
            if (dVarC.C(eVar) || geoPointDTO.elevation != null) {
                dVarC.d(eVar, 2, x.f117036a, geoPointDTO.elevation);
            }
            if (dVarC.C(eVar) || geoPointDTO.distance != null) {
                dVarC.d(eVar, 3, x.f117036a, geoPointDTO.distance);
            }
            dVarC.b(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/courses/model/GeoPointDTO$b", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<GeoPointDTO> {
        @Override // android.os.Parcelable.Creator
        public final GeoPointDTO createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new GeoPointDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final GeoPointDTO[] newArray(int i14) {
            return new GeoPointDTO[i14];
        }
    }

    public GeoPointDTO(Parcel parcel) {
        Double dValueOf = Double.valueOf(0.0d);
        parcel.getClass();
        this.latitude = parcel.readByte() == 0 ? dValueOf : Double.valueOf(parcel.readDouble());
        this.longitude = parcel.readByte() == 0 ? dValueOf : Double.valueOf(parcel.readDouble());
        this.elevation = parcel.readByte() == 0 ? dValueOf : Double.valueOf(parcel.readDouble());
        this.distance = parcel.readByte() != 0 ? Double.valueOf(parcel.readDouble()) : dValueOf;
    }

    public final boolean b() {
        Double d14;
        Double d15 = this.latitude;
        return (d15 == null || this.longitude == null || d15 == null || Double.isNaN(d15.doubleValue()) || (d14 = this.longitude) == null || Double.isNaN(d14.doubleValue())) ? false : true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final double getDistanceAsPrimitive() {
        Double d14 = this.distance;
        if (d14 != null) {
            return d14.doubleValue();
        }
        return Double.NaN;
    }

    public final double getElevationAsPrimitive() {
        Double d14 = this.elevation;
        if (d14 != null) {
            return d14.doubleValue();
        }
        return Double.NaN;
    }

    public final double getLatitudeAsPrimitive() {
        Double d14 = this.latitude;
        if (d14 != null) {
            return d14.doubleValue();
        }
        return Double.NaN;
    }

    public final double getLongitudeAsPrimitive() {
        Double d14 = this.longitude;
        if (d14 != null) {
            return d14.doubleValue();
        }
        return Double.NaN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        if (this.latitude == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            Double d14 = this.latitude;
            parcel.writeDouble(d14 != null ? d14.doubleValue() : 0.0d);
        }
        if (this.longitude == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            Double d15 = this.longitude;
            parcel.writeDouble(d15 != null ? d15.doubleValue() : 0.0d);
        }
        if (this.elevation == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            Double d16 = this.elevation;
            if (d16 != null) {
                parcel.writeDouble(d16.doubleValue());
            }
        }
        if (this.distance == null) {
            parcel.writeByte((byte) 0);
            return;
        }
        parcel.writeByte((byte) 1);
        Double d17 = this.distance;
        if (d17 != null) {
            parcel.writeDouble(d17.doubleValue());
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO$c;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "serializer", "()Li63/c;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static double a(double d14, double d15, double d16, double d17, double d18, double d19) {
            double radians = Math.toRadians(d15 - d14);
            double radians2 = Math.toRadians(d17 - d16);
            double d24 = 2;
            double d25 = radians / d24;
            double d26 = radians2 / d24;
            double dSin = (Math.sin(d26) * Math.sin(d26) * Math.cos(Math.toRadians(d15)) * Math.cos(Math.toRadians(d14))) + (Math.sin(d25) * Math.sin(d25));
            return Math.sqrt(Math.pow(d18 - d19, 2.0d) + Math.pow(((double) 6371) * Math.atan2(Math.sqrt(dSin), Math.sqrt(((double) 1) - dSin)) * d24 * ((double) 1000), 2.0d));
        }

        public static double b(GeoPointDTO geoPointDTO, GeoPointDTO geoPointDTO2) {
            Double d14;
            Double d15;
            if (geoPointDTO == null || geoPointDTO2 == null || !geoPointDTO.b() || (d14 = geoPointDTO.elevation) == null || Double.isNaN(d14.doubleValue()) || !geoPointDTO2.b() || (d15 = geoPointDTO2.elevation) == null || Double.isNaN(d15.doubleValue())) {
                return 0.0d;
            }
            Double d16 = geoPointDTO.latitude;
            d16.getClass();
            double dDoubleValue = d16.doubleValue();
            Double d17 = geoPointDTO2.latitude;
            d17.getClass();
            double dDoubleValue2 = d17.doubleValue();
            Double d18 = geoPointDTO.longitude;
            d18.getClass();
            double dDoubleValue3 = d18.doubleValue();
            Double d19 = geoPointDTO2.longitude;
            d19.getClass();
            double dDoubleValue4 = d19.doubleValue();
            Double d24 = geoPointDTO.elevation;
            d24.getClass();
            double dDoubleValue5 = d24.doubleValue();
            Double d25 = geoPointDTO2.elevation;
            d25.getClass();
            return a(dDoubleValue, dDoubleValue2, dDoubleValue3, dDoubleValue4, dDoubleValue5, d25.doubleValue());
        }

        public final i63.c<GeoPointDTO> serializer() {
            return a.f32808a;
        }

        private Companion() {
        }
    }

    public GeoPointDTO() {
    }

    public GeoPointDTO(double d14, double d15) {
        this.latitude = Double.valueOf(d14);
        this.longitude = Double.valueOf(d15);
    }

    public GeoPointDTO(double d14, double d15, Double d16) {
        this.latitude = Double.valueOf(d14);
        this.longitude = Double.valueOf(d15);
        this.elevation = d16;
    }

    public GeoPointDTO(double d14, double d15, double d16, double d17) {
        this.latitude = Double.valueOf(d14);
        this.longitude = Double.valueOf(d15);
        this.elevation = Double.valueOf(d16);
        this.distance = Double.valueOf(d17);
    }

    public GeoPointDTO(GeoPointDTO geoPointDTO) {
        geoPointDTO.getClass();
        this.latitude = geoPointDTO.latitude;
        this.longitude = geoPointDTO.longitude;
        this.elevation = geoPointDTO.elevation;
        this.distance = geoPointDTO.distance;
    }

    public /* synthetic */ GeoPointDTO(int i14, Double d14, Double d15, Double d16, Double d17, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.latitude = null;
        } else {
            this.latitude = d14;
        }
        if ((i14 & 2) == 0) {
            this.longitude = null;
        } else {
            this.longitude = d15;
        }
        if ((i14 & 4) == 0) {
            this.elevation = null;
        } else {
            this.elevation = d16;
        }
        if ((i14 & 8) == 0) {
            this.distance = null;
        } else {
            this.distance = d17;
        }
    }
}
