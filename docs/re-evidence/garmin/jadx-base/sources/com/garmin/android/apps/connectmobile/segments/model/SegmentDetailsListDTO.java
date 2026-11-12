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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@JsonAdapter(SegmentDetailsListDTODeserializer.class)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\b\tB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/model/SegmentDetailsListDTO;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "SegmentDetailsListDTODeserializer", "b", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SegmentDetailsListDTO extends s1 implements Parcelable {
    public static final Parcelable.Creator<SegmentDetailsListDTO> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<SegmentDetailsDTO> f41284a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/model/SegmentDetailsListDTO$SegmentDetailsListDTODeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/segments/model/SegmentDetailsListDTO;", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SegmentDetailsListDTODeserializer implements JsonDeserializer<SegmentDetailsListDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final SegmentDetailsListDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            com.nimbusds.jose.shaded.gson.internal.a.p(jsonElement, type, jsonDeserializationContext);
            try {
                SegmentDetailsListDTO segmentDetailsListDTO = new SegmentDetailsListDTO();
                segmentDetailsListDTO.k(new JSONObject(jsonElement.toString()));
                return segmentDetailsListDTO;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/segments/model/SegmentDetailsListDTO$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/segments/model/SegmentDetailsListDTO;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SegmentDetailsListDTO> {
        @Override // android.os.Parcelable.Creator
        public final SegmentDetailsListDTO createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new SegmentDetailsListDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SegmentDetailsListDTO[] newArray(int i14) {
            return new SegmentDetailsListDTO[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public SegmentDetailsListDTO(Parcel parcel) {
        parcel.getClass();
        ArrayList<SegmentDetailsDTO> arrayList = new ArrayList<>();
        this.f41284a = arrayList;
        parcel.readTypedList(arrayList, SegmentDetailsDTO.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) throws JSONException {
        jSONObject.getClass();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("segments");
        if (jSONArrayOptJSONArray != null) {
            this.f41284a = new ArrayList<>();
            int length = jSONArrayOptJSONArray.length();
            for (int i14 = 0; i14 < length; i14++) {
                SegmentDetailsDTO segmentDetailsDTO = new SegmentDetailsDTO();
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i14);
                jSONObject2.getClass();
                segmentDetailsDTO.k(jSONObject2);
                ArrayList<SegmentDetailsDTO> arrayList = this.f41284a;
                arrayList.getClass();
                arrayList.add(segmentDetailsDTO);
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeTypedList(this.f41284a);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/model/SegmentDetailsListDTO$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/segments/model/SegmentDetailsListDTO;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "SEGMENTS", "Ljava/lang/String;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    public SegmentDetailsListDTO() {
    }
}
