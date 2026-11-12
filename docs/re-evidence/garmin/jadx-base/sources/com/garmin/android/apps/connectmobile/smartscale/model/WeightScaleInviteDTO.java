package com.garmin.android.apps.connectmobile.smartscale.model;

import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@JsonAdapter(WeightScaleInviteDeserializer.class)
public class WeightScaleInviteDTO extends s1 {

    public static class WeightScaleInviteDeserializer implements JsonDeserializer<WeightScaleInviteDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final WeightScaleInviteDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            WeightScaleInviteDTO weightScaleInviteDTO = new WeightScaleInviteDTO();
            try {
                weightScaleInviteDTO.m(jsonElement.toString());
                return weightScaleInviteDTO;
            } catch (JSONException e4) {
                i2.g(e4, "WeightScaleInviteDTO");
                return null;
            }
        }
    }

    public WeightScaleInviteDTO() {
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            jSONObject.optLong("deviceInviteId");
            jSONObject.optLong("deviceId");
            jSONObject.optLong("invitorId");
            jSONObject.optLong("inviteeId");
            s1.u(jSONObject, "invitorName");
            s1.u(jSONObject, "invitorDisplayName");
            jSONObject.optBoolean("requestViewed", false);
            jSONObject.optLong("inviteDate", -1L);
            s1.u(jSONObject, "invitorProfilePicURL");
            s1.u(jSONObject, "invitorProfilePicURLMedium");
            s1.u(jSONObject, "applicationKey");
            s1.u(jSONObject, "productDisplayName");
            s1.u(jSONObject, "productImageUrl");
            String strU = s1.u(jSONObject, "deviceInviteStatus");
            if (strU != null) {
                try {
                    d.valueOf(strU);
                } catch (IllegalArgumentException unused) {
                    i2.i("WeightScaleInviteDTO", "JSON value [" + strU + "] not defined in DeviceInviteStatus.java!");
                }
            }
        }
    }

    public WeightScaleInviteDTO(long j8, long j14, long j15, long j16, String str, String str2, d dVar, boolean z14) {
    }

    public WeightScaleInviteDTO(long j8, long j14, long j15, long j16, String str, String str2, d dVar, boolean z14, String str3, String str4, String str5) {
    }
}
