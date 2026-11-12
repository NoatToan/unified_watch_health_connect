package com.garmin.android.apps.connectmobile.courses.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import u62.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001:\u0002@AB\u0097\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b%\u0010+R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\u001f\u0010.R\u001a\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b0\u0010.R\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010-\u001a\u0004\b,\u0010.R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010-\u001a\u0004\b/\u0010.R$\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u00102\u001a\u0004\b1\u00104\"\u0004\b7\u00106R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u0015\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010-\u001a\u0004\b<\u0010.R\u001a\u0010\u0016\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010-\u001a\u0004\b>\u0010.R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u00109\u001a\u0004\b?\u0010;¨\u0006B"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;", "Landroid/os/Parcelable;", "", "courseClimbId", "gmapClimbId", "", "gmapClimbFileId", "Lcom/garmin/android/apps/connectmobile/courses/model/c;", "climbSurfaceTypePreference", "Lcom/garmin/android/apps/connectmobile/courses/model/b;", "category", "", "avgGrade", "maxGrade", "distance", "elevationGain", "pavedPercentage", "pavedDistance", "", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "polylineDTO", "startDistance", "startElevation", "Lk30/f;", "sections", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/courses/model/c;Lcom/garmin/android/apps/connectmobile/courses/model/b;DDDDLjava/lang/Double;Ljava/lang/Double;Ljava/util/List;DDLjava/util/List;)V", "a", "Ljava/lang/Long;", "getCourseClimbId", "()Ljava/lang/Long;", "b", IntegerTokenConverter.CONVERTER_KEY, "c", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "d", "Lcom/garmin/android/apps/connectmobile/courses/model/c;", "getClimbSurfaceTypePreference", "()Lcom/garmin/android/apps/connectmobile/courses/model/c;", JWKParameterNames.RSA_EXPONENT, "Lcom/garmin/android/apps/connectmobile/courses/model/b;", "()Lcom/garmin/android/apps/connectmobile/courses/model/b;", "f", "D", "()D", "g", "getMaxGrade", "j", "Ljava/lang/Double;", JWKParameterNames.OCT_KEY_VALUE, "()Ljava/lang/Double;", "s", "(Ljava/lang/Double;)V", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "l", "Ljava/util/List;", "m", "()Ljava/util/List;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, JWKParameterNames.RSA_MODULUS, "getStartElevation", "o", "ClimbSurfaceTypeAdapter", "ClimbCategoryTypeAdapter", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ClimbDTO implements Parcelable {
    public static final Parcelable.Creator<ClimbDTO> CREATOR = new a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f32776p = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseClimbId")
    private final Long courseClimbId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gmapClimbId")
    private final Long gmapClimbId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gmapClimbFileId")
    private final String gmapClimbFileId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("climbSurfaceTypePreference")
    @JsonAdapter(ClimbSurfaceTypeAdapter.class)
    private final c climbSurfaceTypePreference;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("category")
    @JsonAdapter(ClimbCategoryTypeAdapter.class)
    private final b category;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgGrade")
    private final double avgGrade;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxGrade")
    private final double maxGrade;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("distance")
    private final double distance;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("elevationGain")
    private final double elevationGain;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pavedPercentage")
    private Double pavedPercentage;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private Double pavedDistance;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("polylineDTO")
    private final List<GeoPointDTO> polylineDTO;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startDistance")
    private final double startDistance;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startElevation")
    private final double startElevation;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sections")
    private final List<k30.f> sections;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO$ClimbCategoryTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/garmin/android/apps/connectmobile/courses/model/b;", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ClimbCategoryTypeAdapter extends TypeAdapter<b> {
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final b read2(JsonReader jsonReader) {
            Object next;
            jsonReader.getClass();
            b.a aVar = b.f32818d;
            String strNextString = jsonReader.nextString();
            strNextString.getClass();
            aVar.getClass();
            Iterator<T> it = b.f32827m.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (s.g(((b) next).f32828a, strNextString)) {
                    return (b) next;
                }
            }
            next = null;
            return (b) next;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, b bVar) {
            b bVar2 = bVar;
            jsonWriter.getClass();
            bVar2.getClass();
            jsonWriter.value(bVar2.f32828a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO$ClimbSurfaceTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/garmin/android/apps/connectmobile/courses/model/c;", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ClimbSurfaceTypeAdapter extends TypeAdapter<c> {
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final c read2(JsonReader jsonReader) {
            Object next;
            jsonReader.getClass();
            c.a aVar = c.f32831c;
            String strNextString = jsonReader.nextString();
            strNextString.getClass();
            aVar.getClass();
            Iterator<T> it = c.f32836h.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (s.g(((c) next).f32837a, strNextString)) {
                    return (c) next;
                }
            }
            next = null;
            return (c) next;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, c cVar) {
            c cVar2 = cVar;
            jsonWriter.getClass();
            cVar2.getClass();
            jsonWriter.value(cVar2.f32837a);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ClimbDTO> {
        @Override // android.os.Parcelable.Creator
        public final ClimbDTO createFromParcel(Parcel parcel) {
            parcel.getClass();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            c cVarValueOf = parcel.readInt() == 0 ? null : c.valueOf(parcel.readString());
            b bVarValueOf = b.valueOf(parcel.readString());
            double d14 = parcel.readDouble();
            double d15 = parcel.readDouble();
            double d16 = parcel.readDouble();
            double d17 = parcel.readDouble();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null;
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            Long l14 = lValueOf;
            int iA = 0;
            while (iA != i14) {
                iA = kg.f.a(GeoPointDTO.CREATOR, parcel, arrayList, iA, 1);
                i14 = i14;
            }
            double d18 = parcel.readDouble();
            double d19 = parcel.readDouble();
            int i15 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i15);
            int iA2 = 0;
            while (true) {
                ArrayList arrayList3 = arrayList;
                if (iA2 == i15) {
                    return new ClimbDTO(l14, lValueOf2, string, cVarValueOf, bVarValueOf, d14, d15, d16, d17, dValueOf, dValueOf2, arrayList3, d18, d19, arrayList2);
                }
                iA2 = kg.f.a(k30.f.CREATOR, parcel, arrayList2, iA2, 1);
                arrayList = arrayList3;
                i15 = i15;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final ClimbDTO[] newArray(int i14) {
            return new ClimbDTO[i14];
        }
    }

    public ClimbDTO(Long l14, Long l15, String str, c cVar, b bVar, double d14, double d15, double d16, double d17, Double d18, Double d19, List<GeoPointDTO> list, double d24, double d25, List<k30.f> list2) {
        bVar.getClass();
        list.getClass();
        list2.getClass();
        this.courseClimbId = l14;
        this.gmapClimbId = l15;
        this.gmapClimbFileId = str;
        this.climbSurfaceTypePreference = cVar;
        this.category = bVar;
        this.avgGrade = d14;
        this.maxGrade = d15;
        this.distance = d16;
        this.elevationGain = d17;
        this.pavedPercentage = d18;
        this.pavedDistance = d19;
        this.polylineDTO = list;
        this.startDistance = d24;
        this.startElevation = d25;
        this.sections = list2;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getAvgGrade() {
        return this.avgGrade;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getCategory() {
        return this.category;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClimbDTO)) {
            return false;
        }
        ClimbDTO climbDTO = (ClimbDTO) obj;
        return s.g(this.courseClimbId, climbDTO.courseClimbId) && s.g(this.gmapClimbId, climbDTO.gmapClimbId) && s.g(this.gmapClimbFileId, climbDTO.gmapClimbFileId) && this.climbSurfaceTypePreference == climbDTO.climbSurfaceTypePreference && this.category == climbDTO.category && Double.compare(this.avgGrade, climbDTO.avgGrade) == 0 && Double.compare(this.maxGrade, climbDTO.maxGrade) == 0 && Double.compare(this.distance, climbDTO.distance) == 0 && Double.compare(this.elevationGain, climbDTO.elevationGain) == 0 && s.g(this.pavedPercentage, climbDTO.pavedPercentage) && s.g(this.pavedDistance, climbDTO.pavedDistance) && s.g(this.polylineDTO, climbDTO.polylineDTO) && Double.compare(this.startDistance, climbDTO.startDistance) == 0 && Double.compare(this.startElevation, climbDTO.startElevation) == 0 && s.g(this.sections, climbDTO.sections);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final double getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final double getElevationGain() {
        return this.elevationGain;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getGmapClimbFileId() {
        return this.gmapClimbFileId;
    }

    public final int hashCode() {
        Long l14 = this.courseClimbId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Long l15 = this.gmapClimbId;
        int iHashCode2 = (iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str = this.gmapClimbFileId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        c cVar = this.climbSurfaceTypePreference;
        int iB = org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b((this.category.hashCode() + ((iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31)) * 31, 31, this.avgGrade), 31, this.maxGrade), 31, this.distance), 31, this.elevationGain);
        Double d14 = this.pavedPercentage;
        int iHashCode4 = (iB + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.pavedDistance;
        return this.sections.hashCode() + org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(u0.b((iHashCode4 + (d15 != null ? d15.hashCode() : 0)) * 31, 31, this.polylineDTO), 31, this.startDistance), 31, this.startElevation);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Long getGmapClimbId() {
        return this.gmapClimbId;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Double getPavedDistance() {
        return this.pavedDistance;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Double getPavedPercentage() {
        return this.pavedPercentage;
    }

    public final List<GeoPointDTO> m() {
        return this.polylineDTO;
    }

    public final List<k30.f> o() {
        return this.sections;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final double getStartDistance() {
        return this.startDistance;
    }

    public final void r(Double d14) {
        this.pavedDistance = d14;
    }

    public final void s(Double d14) {
        this.pavedPercentage = d14;
    }

    public final String toString() {
        Long l14 = this.courseClimbId;
        Long l15 = this.gmapClimbId;
        String str = this.gmapClimbFileId;
        c cVar = this.climbSurfaceTypePreference;
        b bVar = this.category;
        double d14 = this.avgGrade;
        double d15 = this.maxGrade;
        double d16 = this.distance;
        double d17 = this.elevationGain;
        Double d18 = this.pavedPercentage;
        Double d19 = this.pavedDistance;
        List<GeoPointDTO> list = this.polylineDTO;
        double d24 = this.startDistance;
        double d25 = this.startElevation;
        List<k30.f> list2 = this.sections;
        StringBuilder sbJ = f3.j(l14, l15, "ClimbDTO(courseClimbId=", ", gmapClimbId=", ", gmapClimbFileId=");
        sbJ.append(str);
        sbJ.append(", climbSurfaceTypePreference=");
        sbJ.append(cVar);
        sbJ.append(", category=");
        sbJ.append(bVar);
        sbJ.append(", avgGrade=");
        sbJ.append(d14);
        am.j.x(sbJ, ", maxGrade=", d15, ", distance=");
        sbJ.append(d16);
        am.j.x(sbJ, ", elevationGain=", d17, ", pavedPercentage=");
        b71.i.p(d18, d19, ", pavedDistance=", ", polylineDTO=", sbJ);
        sbJ.append(list);
        sbJ.append(", startDistance=");
        sbJ.append(d24);
        am.j.x(sbJ, ", startElevation=", d25, ", sections=");
        return z.c(sbJ, list2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.courseClimbId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Long l15 = this.gmapClimbId;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeString(this.gmapClimbFileId);
        c cVar = this.climbSurfaceTypePreference;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(cVar.name());
        }
        parcel.writeString(this.category.name());
        parcel.writeDouble(this.avgGrade);
        parcel.writeDouble(this.maxGrade);
        parcel.writeDouble(this.distance);
        parcel.writeDouble(this.elevationGain);
        Double d14 = this.pavedPercentage;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.pavedDistance;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Iterator itE = kg.f.e(this.polylineDTO, parcel);
        while (itE.hasNext()) {
            ((GeoPointDTO) itE.next()).writeToParcel(parcel, i14);
        }
        parcel.writeDouble(this.startDistance);
        parcel.writeDouble(this.startElevation);
        Iterator itE2 = kg.f.e(this.sections, parcel);
        while (itE2.hasNext()) {
            ((k30.f) itE2.next()).writeToParcel(parcel, i14);
        }
    }
}
