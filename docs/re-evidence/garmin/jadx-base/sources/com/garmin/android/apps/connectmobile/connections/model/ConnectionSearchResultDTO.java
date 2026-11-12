package com.garmin.android.apps.connectmobile.connections.model;

import am.j;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.maps.MapboxMap;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@JsonAdapter(ConnectionSearchResultDTODeserializer.class)
public class ConnectionSearchResultDTO extends s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("profileList")
    private List<ConnectionDTO> f31672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("originalKeyword")
    private String f31673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("effectiveKeyword")
    private String f31674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName(TtmlNode.START)
    private int f31675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName(MapboxMap.QFE_LIMIT)
    private int f31676e;

    public static class ConnectionSearchResultDTODeserializer implements JsonDeserializer<ConnectionSearchResultDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final ConnectionSearchResultDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            try {
                ConnectionSearchResultDTO connectionSearchResultDTO = new ConnectionSearchResultDTO();
                if (!jsonElement.toString().isEmpty()) {
                    connectionSearchResultDTO.k(new JSONObject(jsonElement.toString()));
                }
                return connectionSearchResultDTO;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public final List<ConnectionDTO> C() {
        return this.f31672a;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("profileList");
            Parcelable.Creator<ConnectionDTO> creator = ConnectionDTO.CREATOR;
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i14 = 0; i14 < jSONArrayOptJSONArray.length(); i14++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i14);
                    ConnectionDTO connectionDTO = new ConnectionDTO();
                    connectionDTO.k(jSONObject2);
                    arrayList.add(connectionDTO);
                }
            }
            this.f31672a = arrayList;
            this.f31673b = s1.u(jSONObject, "originalKeyword");
            this.f31674c = s1.u(jSONObject, "effectiveKeyword");
            this.f31675d = jSONObject.optInt(TtmlNode.START);
            this.f31676e = jSONObject.optInt(MapboxMap.QFE_LIMIT);
        }
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ConnectionSearchListDTO [mUserConnections=");
        sb3.append(this.f31672a);
        sb3.append(", mOriginalKeyword=");
        sb3.append(this.f31673b);
        sb3.append(", mEffectiveKeyword=");
        sb3.append(this.f31674c);
        sb3.append(", mStart=");
        sb3.append(this.f31675d);
        sb3.append(", mLimit=");
        return j.q(sb3, this.f31676e, "]");
    }
}
