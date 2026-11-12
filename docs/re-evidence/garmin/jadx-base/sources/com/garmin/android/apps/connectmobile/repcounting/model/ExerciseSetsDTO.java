package com.garmin.android.apps.connectmobile.repcounting.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@JsonAdapter(ExerciseSetsDeserializer.class)
public class ExerciseSetsDTO extends s1 implements Parcelable {
    public static final Parcelable.Creator<ExerciseSetsDTO> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e[] f41089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f41090b;

    public static class ExerciseSetsDeserializer implements JsonDeserializer<ExerciseSetsDTO>, JsonSerializer<ExerciseSetsDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final ExerciseSetsDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            try {
                ExerciseSetsDTO exerciseSetsDTO = new ExerciseSetsDTO();
                exerciseSetsDTO.k(new JSONObject(jsonElement.toString()));
                return exerciseSetsDTO;
            } catch (Exception e4) {
                i2.g(e4, "ExerciseSetsDTO");
                return null;
            }
        }

        @Override // com.google.gson.JsonSerializer
        public final JsonElement serialize(ExerciseSetsDTO exerciseSetsDTO, Type type, JsonSerializationContext jsonSerializationContext) {
            ExerciseSetsDTO exerciseSetsDTO2 = exerciseSetsDTO;
            try {
                return (JsonElement) GsonUtil.f47253b.fromJson(exerciseSetsDTO2.D(exerciseSetsDTO2.f41090b), JsonElement.class);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public class a implements Parcelable.Creator<ExerciseSetsDTO> {
        @Override // android.os.Parcelable.Creator
        public final ExerciseSetsDTO createFromParcel(Parcel parcel) {
            return new ExerciseSetsDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ExerciseSetsDTO[] newArray(int i14) {
            return new ExerciseSetsDTO[i14];
        }
    }

    public ExerciseSetsDTO(ExerciseSetsDTO exerciseSetsDTO) {
        if (exerciseSetsDTO == null) {
            return;
        }
        this.f41090b = exerciseSetsDTO.f41090b;
        e[] eVarArr = exerciseSetsDTO.f41089a;
        if (eVarArr == null) {
            return;
        }
        this.f41089a = new e[eVarArr.length];
        int i14 = 0;
        while (true) {
            e[] eVarArr2 = this.f41089a;
            if (i14 >= eVarArr2.length) {
                return;
            }
            eVarArr2[i14] = new e(exerciseSetsDTO.f41089a[i14]);
            i14++;
        }
    }

    public final void C(ArrayList arrayList) {
        this.f41089a = (e[]) arrayList.toArray(new e[arrayList.size()]);
    }

    public final String D(long j8) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject.put("activityId", j8);
            for (e eVar : this.f41089a) {
                jSONArray.put(eVar.o0());
            }
            jSONObject.put("exerciseSets", jSONArray);
        } catch (JSONException e4) {
            i2.i("ExerciseSetsDTO", "toJson: " + e4.getMessage());
        }
        return jSONObject.toString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ExerciseSetsDTO exerciseSetsDTO = (ExerciseSetsDTO) obj;
            if (this.f41090b == exerciseSetsDTO.f41090b && Arrays.equals(this.f41089a, exerciseSetsDTO.f41089a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Objects.hash(Long.valueOf(this.f41090b)) * 31) + Arrays.hashCode(this.f41089a);
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject.has("activityId")) {
            this.f41090b = jSONObject.getLong("activityId");
        }
        if (!jSONObject.has("exerciseSets") || jSONObject.isNull("exerciseSets")) {
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("exerciseSets");
        e[] eVarArr = new e[jSONArray.length()];
        for (int i14 = 0; i14 < jSONArray.length(); i14++) {
            e eVar = new e();
            eVar.k(jSONArray.getJSONObject(i14));
            eVarArr[i14] = eVar;
        }
        this.f41089a = eVarArr;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ExerciseSetsDTO{mExercisesSet=");
        sb3.append(Arrays.toString(this.f41089a));
        sb3.append(", mActivityId=");
        return a0.l(sb3, this.f41090b, CoreConstants.CURLY_RIGHT);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeLong(this.f41090b);
        parcel.writeTypedArray(this.f41089a, 0);
    }

    public ExerciseSetsDTO(Parcel parcel) {
        this.f41090b = parcel.readLong();
        this.f41089a = (e[]) parcel.createTypedArray(e.CREATOR);
    }

    public ExerciseSetsDTO(e[] eVarArr) {
        this.f41089a = (e[]) Arrays.copyOf(eVarArr, eVarArr.length);
    }

    public ExerciseSetsDTO() {
        this.f41089a = new e[0];
    }
}
