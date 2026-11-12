package com.garmin.android.apps.connectmobile.group.service.model;

import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.s1;
import com.garmin.android.apps.connectmobile.t1;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.mapbox.maps.MapboxMap;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@JsonAdapter(GroupSearchDeserializer.class)
public class GroupSearchResultDTO extends s1 implements t1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f36393a;

    public static class GroupSearchDeserializer implements JsonDeserializer<GroupSearchResultDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final GroupSearchResultDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            try {
                GroupSearchResultDTO groupSearchResultDTO = new GroupSearchResultDTO();
                groupSearchResultDTO.k(new JSONObject(jsonElement.getAsJsonObject().toString()));
                return groupSearchResultDTO;
            } catch (JSONException unused) {
                return null;
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.t1.a
    public final boolean b(ArrayList arrayList, ArrayList arrayList2) throws JSONException {
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            t1.d dVar = (t1.d) it.next();
            if (dVar.f45035a.equals("GroupSearch")) {
                if (!dVar.f45036b) {
                    return false;
                }
                JSONObject jSONObject = dVar.f45038c;
                if (jSONObject != null) {
                    s1.u(jSONObject, "effectiveKeyword");
                    s1.u(jSONObject, "originalKeyword");
                    jSONObject.optInt(MapboxMap.QFE_LIMIT);
                    jSONObject.optInt(TtmlNode.START);
                    JSONArray jSONArray = jSONObject.getJSONArray("groupDTOs");
                    if (jSONArray != null) {
                        this.f36393a = GroupDTO.C(jSONArray);
                    }
                }
            }
        }
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            t1.a(new String[]{"GroupSearch"}, null, jSONObject, this);
        }
    }
}
