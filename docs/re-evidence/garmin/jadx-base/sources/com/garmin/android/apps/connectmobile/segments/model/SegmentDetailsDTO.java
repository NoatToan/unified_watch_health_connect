package com.garmin.android.apps.connectmobile.segments.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@JsonAdapter(SegmentDetailsDTODeserializer.class)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0007\bB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0014\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/model/SegmentDetailsDTO;", "Lbg1/a;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "SegmentDetailsDTODeserializer", "b", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SegmentDetailsDTO extends bg1.a {
    public static final Parcelable.Creator<SegmentDetailsDTO> CREATOR;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f41274m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f41275n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f41276o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public double f41277p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public double f41278q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public double f41279r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f41280t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f41281v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f41282w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList f41283x;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/model/SegmentDetailsDTO$SegmentDetailsDTODeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/segments/model/SegmentDetailsDTO;", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SegmentDetailsDTODeserializer implements JsonDeserializer<SegmentDetailsDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final SegmentDetailsDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            com.nimbusds.jose.shaded.gson.internal.a.p(jsonElement, type, jsonDeserializationContext);
            try {
                SegmentDetailsDTO segmentDetailsDTO = new SegmentDetailsDTO();
                segmentDetailsDTO.m(jsonElement.toString());
                return segmentDetailsDTO;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/segments/model/SegmentDetailsDTO$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/segments/model/SegmentDetailsDTO;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SegmentDetailsDTO> {
        @Override // android.os.Parcelable.Creator
        public final SegmentDetailsDTO createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new SegmentDetailsDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SegmentDetailsDTO[] newArray(int i14) {
            return new SegmentDetailsDTO[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentDetailsDTO(Parcel parcel) {
        super(parcel);
        parcel.getClass();
        this.f41274m = parcel.readLong();
        this.f41275n = parcel.readInt();
        this.f41276o = parcel.readInt();
        this.f41277p = parcel.readDouble();
        this.f41278q = parcel.readDouble();
        this.f41279r = parcel.readDouble();
        this.f41280t = parcel.readString();
        this.f41281v = parcel.readString();
        this.f41282w = parcel.readString();
        this.f41283x = parcel.createTypedArrayList(com.garmin.android.apps.connectmobile.segments.model.a.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        jSONObject.getClass();
        this.f17837b = jSONObject.optLong("segmentPk");
        this.f17841f = s1.u(jSONObject, "uuid");
        this.f17838c = s1.u(jSONObject, "name");
        this.f17836a = jSONObject.optLong("ownerPk");
        this.f41274m = jSONObject.optLong("activityId");
        this.f17839d = jSONObject.optInt("activityTypePk");
        this.f17844i = jSONObject.optInt("surfaceTypePk");
        this.f17845j = jSONObject.optInt("classificationPk");
        this.f41275n = jSONObject.optInt("uniqueActivitiesForSegment");
        this.f41276o = jSONObject.optInt("uniqueUsersForSegment");
        this.f41277p = jSONObject.optDouble("ascent");
        this.f41278q = jSONObject.optDouble("descent");
        this.f17842g = jSONObject.optDouble("distance");
        this.f41279r = jSONObject.optDouble("grade");
        this.f41280t = jSONObject.optString("description");
        this.f41281v = jSONObject.optString("updateDate");
        this.f41282w = jSONObject.optString("createDate");
        this.f17840e = jSONObject.optBoolean("favorite");
        if (jSONObject.isNull("geoPoints")) {
            return;
        }
        com.garmin.android.apps.connectmobile.segments.model.a.b bVar = com.garmin.android.apps.connectmobile.segments.model.a.f41340f;
        JSONArray jSONArray = jSONObject.getJSONArray("geoPoints");
        jSONArray.getClass();
        bVar.getClass();
        int length = jSONArray.length();
        com.garmin.android.apps.connectmobile.segments.model.a[] aVarArr = new com.garmin.android.apps.connectmobile.segments.model.a[length];
        int length2 = jSONArray.length();
        for (int i14 = 0; i14 < length2; i14++) {
            com.garmin.android.apps.connectmobile.segments.model.a aVar = new com.garmin.android.apps.connectmobile.segments.model.a();
            JSONObject jSONObject2 = jSONArray.getJSONObject(i14);
            jSONObject2.getClass();
            aVar.k(jSONObject2);
            aVarArr[i14] = aVar;
        }
        List listAsList = Arrays.asList(Arrays.copyOf(aVarArr, length));
        listAsList.getClass();
        this.f41283x = h0.Z(h0.b1(listAsList));
    }

    @Override // bg1.a, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        super.writeToParcel(parcel, i14);
        parcel.writeLong(this.f41274m);
        parcel.writeInt(this.f41275n);
        parcel.writeInt(this.f41276o);
        parcel.writeDouble(this.f41277p);
        parcel.writeDouble(this.f41278q);
        parcel.writeDouble(this.f41279r);
        parcel.writeString(this.f41280t);
        parcel.writeString(this.f41281v);
        parcel.writeString(this.f41282w);
        parcel.writeTypedList(this.f41283x);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\nR\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\nR\u0014\u0010\u0019\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\nR\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\nR\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\nR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\nR\u0014\u0010\u001d\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\nR\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/model/SegmentDetailsDTO$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/segments/model/SegmentDetailsDTO;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "TAG", "Ljava/lang/String;", "DATE_FORMAT", "SEGMENT_PK", "UUID", "NAME", "OWNER_PK", "ACTIVITY_ID", "ACTIVITY_TYPE_PK", "SURFACE_TYPE_PK", "CLASSIFICATION_PK", "UNIQUE_ACTIVITIES_FOR_SEGMENT", "UNIQUE_USERS_FOR_SEGMENT", "ASCENT", "DESCENT", "DISTANCE", "GRADE", "DESCRIPTION", "UPDATE_DATE", "CREATE_DATE", "FAVORITE", "GEO_POINTS", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    public SegmentDetailsDTO() {
    }
}
