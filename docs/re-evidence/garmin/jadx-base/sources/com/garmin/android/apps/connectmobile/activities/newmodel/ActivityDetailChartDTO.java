package com.garmin.android.apps.connectmobile.activities.newmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@JsonAdapter(ActivityDetailChartDTODeserializer.class)
public class ActivityDetailChartDTO extends com.garmin.android.apps.connectmobile.activities.newmodel.a {
    public static final Parcelable.Creator<ActivityDetailChartDTO> CREATOR = new a();

    public static class ActivityDetailChartDTODeserializer implements JsonDeserializer<ActivityDetailChartDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final ActivityDetailChartDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            try {
                ActivityDetailChartDTO activityDetailChartDTO = new ActivityDetailChartDTO();
                activityDetailChartDTO.m(jsonElement.toString());
                return activityDetailChartDTO;
            } catch (Exception e4) {
                a2 a2Var = a2.GENERAL;
                String str = "ActivityDetailChartDTO deserialization failed: " + e4.getMessage();
                i2.f36769a.getClass();
                i2.a.e(a2Var, str);
                return null;
            }
        }
    }

    public class a implements Parcelable.Creator<ActivityDetailChartDTO> {
        @Override // android.os.Parcelable.Creator
        public final ActivityDetailChartDTO createFromParcel(Parcel parcel) {
            return new ActivityDetailChartDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ActivityDetailChartDTO[] newArray(int i14) {
            return new ActivityDetailChartDTO[i14];
        }
    }

    public interface b {
        double c(int i14, List<com.garmin.android.apps.connectmobile.activities.newmodel.b> list, int i15, double d14, double d15, double d16);
    }

    public ActivityDetailChartDTO() {
    }

    public ActivityDetailChartDTO(Parcel parcel) {
        super(parcel);
    }
}
