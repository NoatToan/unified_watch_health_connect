package com.garmin.android.apps.connectmobile.workouts.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@JsonAdapter(TrainingPlanSearchResultsDeserializer.class)
public class TrainingPlanSearchResultsDTO extends s1 implements Parcelable {
    public static final Parcelable.Creator<TrainingPlanSearchResultsDTO> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f48038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b0 f48039b;

    public static class TrainingPlanSearchResultsDeserializer implements JsonDeserializer<TrainingPlanSearchResultsDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final TrainingPlanSearchResultsDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            try {
                TrainingPlanSearchResultsDTO trainingPlanSearchResultsDTO = new TrainingPlanSearchResultsDTO();
                trainingPlanSearchResultsDTO.k(new JSONObject(jsonElement.toString()));
                return trainingPlanSearchResultsDTO;
            } catch (Exception e4) {
                i2.g(e4, "TrainingPlanSearchResultsDTO");
                return null;
            }
        }
    }

    public class a implements Parcelable.Creator<TrainingPlanSearchResultsDTO> {
        @Override // android.os.Parcelable.Creator
        public final TrainingPlanSearchResultsDTO createFromParcel(Parcel parcel) {
            return new TrainingPlanSearchResultsDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final TrainingPlanSearchResultsDTO[] newArray(int i14) {
            return new TrainingPlanSearchResultsDTO[i14];
        }
    }

    public TrainingPlanSearchResultsDTO(Parcel parcel) {
        int i14 = parcel.readInt();
        this.f48038a = new ArrayList();
        for (int i15 = 0; i15 < i14; i15++) {
            this.f48038a.add((a0) parcel.readParcelable(a0.class.getClassLoader()));
        }
        this.f48039b = (b0) parcel.readParcelable(b0.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (!jSONObject.isNull("trainingPlanList")) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("trainingPlanList");
            this.f48038a = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i14 = 0; i14 < length; i14++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i14);
                if (jSONObjectOptJSONObject != null) {
                    a0 a0Var = new a0();
                    a0Var.k(jSONObjectOptJSONObject);
                    this.f48038a.add(a0Var);
                }
            }
        }
        if (jSONObject.isNull("searchFilter")) {
            return;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("searchFilter");
        b0 b0Var = new b0();
        this.f48039b = b0Var;
        b0Var.k(jSONObjectOptJSONObject2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.f48038a.size());
        Iterator it = this.f48038a.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((a0) it.next(), i14);
        }
        parcel.writeParcelable(this.f48039b, 0);
    }

    public TrainingPlanSearchResultsDTO() {
    }
}
