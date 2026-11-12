package com.garmin.android.apps.connectmobile.smartscale.model;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@JsonAdapter(WeightScaleServiceResponseDTODeserializer.class)
public class WeightScaleServiceResponseDTO extends s1 implements Parcelable, pd2.b {
    public static final Parcelable.Creator<WeightScaleServiceResponseDTO> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44399a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f44400b = null;

    public static class WeightScaleServiceResponseDTODeserializer implements JsonDeserializer<WeightScaleServiceResponseDTO>, JsonSerializer<WeightScaleServiceResponseDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final WeightScaleServiceResponseDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            try {
                WeightScaleServiceResponseDTO weightScaleServiceResponseDTO = new WeightScaleServiceResponseDTO();
                weightScaleServiceResponseDTO.k(new JSONObject(jsonElement.toString()));
                return weightScaleServiceResponseDTO;
            } catch (Exception e4) {
                i2.g(e4, "WeightScaleServiceResponseDTO");
                return null;
            }
        }

        @Override // com.google.gson.JsonSerializer
        public final JsonElement serialize(WeightScaleServiceResponseDTO weightScaleServiceResponseDTO, Type type, JsonSerializationContext jsonSerializationContext) {
            try {
                return (JsonElement) GsonUtil.f47253b.fromJson(weightScaleServiceResponseDTO.h().toString(), JsonElement.class);
            } catch (Exception e4) {
                i2.g(e4, "WeightScaleServiceResponseDTO");
                return null;
            }
        }
    }

    public class a implements Parcelable.Creator<WeightScaleServiceResponseDTO> {
        @Override // android.os.Parcelable.Creator
        public final WeightScaleServiceResponseDTO createFromParcel(Parcel parcel) {
            WeightScaleServiceResponseDTO weightScaleServiceResponseDTO = new WeightScaleServiceResponseDTO();
            weightScaleServiceResponseDTO.f44399a = parcel.readInt();
            weightScaleServiceResponseDTO.f44400b = parcel.readString();
            return weightScaleServiceResponseDTO;
        }

        @Override // android.os.Parcelable.Creator
        public final WeightScaleServiceResponseDTO[] newArray(int i14) {
            return new WeightScaleServiceResponseDTO[i14];
        }
    }

    public enum b {
        SUCCESS(0),
        /* JADX INFO: Fake field, exist only in values array */
        ERROR_PARAMETER_FORMAT(1),
        DUPLICATE_SHORT_NAME(2),
        /* JADX INFO: Fake field, exist only in values array */
        REACH_DEVICE_MAX_USER_NUMBER(3),
        /* JADX INFO: Fake field, exist only in values array */
        USER_CONNECTION_ERROR(4),
        /* JADX INFO: Fake field, exist only in values array */
        SERIAL_NUMBER_ERROR(5),
        /* JADX INFO: Fake field, exist only in values array */
        DEVICE_REGISTRATION_ERROR(6),
        /* JADX INFO: Fake field, exist only in values array */
        FAIL_TO_REMOVE_USER(7),
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN_REASON(999);


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final SparseArray<b> f44403d = new SparseArray<>(values().length);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f44405a;

        static {
            for (b bVar : values()) {
                f44403d.put(bVar.f44405a, bVar);
            }
        }

        b(int i14) {
            this.f44405a = i14;
        }
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
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reasonCode", this.f44399a);
            jSONObject.put("reasonMessage", this.f44400b);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f44399a = jSONObject.optInt("reasonCode");
            this.f44400b = s1.u(jSONObject, "reasonMessage");
        }
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("WeightScaleServiceResponseDTO [reasonCode=");
        sb3.append(this.f44399a);
        sb3.append(", reasonMessage=");
        return j.o(this.f44400b, "]", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.f44399a);
        parcel.writeString(this.f44400b);
    }
}
