package com.garmin.android.apps.connectmobile.segments.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@JsonAdapter(SegmentsSummaryListDeserializer.class)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\t\nB\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/data/model/SegmentsSummaryListDTO;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "Lpd2/b;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "SegmentsSummaryListDeserializer", "b", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SegmentsSummaryListDTO extends s1 implements Parcelable, pd2.b {
    public static final Parcelable.Creator<SegmentsSummaryListDTO> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f41248b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/data/model/SegmentsSummaryListDTO$SegmentsSummaryListDeserializer;", "Lcom/google/gson/JsonSerializer;", "Lcom/garmin/android/apps/connectmobile/segments/data/model/SegmentsSummaryListDTO;", "Lcom/google/gson/JsonDeserializer;", "<init>", "()V", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SegmentsSummaryListDeserializer implements JsonSerializer<SegmentsSummaryListDTO>, JsonDeserializer<SegmentsSummaryListDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final SegmentsSummaryListDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            com.nimbusds.jose.shaded.gson.internal.a.p(jsonElement, type, jsonDeserializationContext);
            try {
                SegmentsSummaryListDTO segmentsSummaryListDTO = new SegmentsSummaryListDTO();
                segmentsSummaryListDTO.k(new JSONObject(jsonElement.toString()));
                return segmentsSummaryListDTO;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // com.google.gson.JsonSerializer
        public final JsonElement serialize(SegmentsSummaryListDTO segmentsSummaryListDTO, Type type, JsonSerializationContext jsonSerializationContext) {
            segmentsSummaryListDTO.getClass();
            type.getClass();
            jsonSerializationContext.getClass();
            try {
                return (JsonElement) GsonUtil.f47253b.fromJson((String) null, JsonElement.class);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/segments/data/model/SegmentsSummaryListDTO$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/segments/data/model/SegmentsSummaryListDTO;", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SegmentsSummaryListDTO> {
        @Override // android.os.Parcelable.Creator
        public final SegmentsSummaryListDTO createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new SegmentsSummaryListDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SegmentsSummaryListDTO[] newArray(int i14) {
            return new SegmentsSummaryListDTO[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public SegmentsSummaryListDTO(Parcel parcel) {
        parcel.getClass();
        this.f41247a = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        this.f41248b = arrayList;
        parcel.readTypedList(arrayList, bg1.b.CREATOR);
    }

    @Override // pd2.b
    public final boolean d(String str) {
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // pd2.b
    public final String h() {
        throw null;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) throws JSONException {
        jSONObject.getClass();
        this.f41247a = jSONObject.optInt("segmentTotalCount");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("segmentUserDTOList");
        if (jSONArrayOptJSONArray != null) {
            this.f41248b = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i14 = 0; i14 < length; i14++) {
                bg1.b bVar = new bg1.b();
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i14);
                jSONObject2.getClass();
                bVar.k(jSONObject2);
                ArrayList arrayList = this.f41248b;
                if (arrayList != null) {
                    arrayList.add(bVar);
                }
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f41247a);
        parcel.writeTypedList(this.f41248b);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/data/model/SegmentsSummaryListDTO$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/segments/data/model/SegmentsSummaryListDTO;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "SEGMENTS_TOTAL_COUNT", "Ljava/lang/String;", "SEGMENT_USER_LIST", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    public SegmentsSummaryListDTO() {
    }
}
