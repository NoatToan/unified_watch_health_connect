package com.garmin.android.apps.connectmobile.connections.groups.services.model;

import com.garmin.android.apps.connectmobile.s1;
import com.garmin.android.apps.connectmobile.t1;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@JsonAdapter(GroupListDeserializer.class)
public class GroupListDTO extends s1 implements t1.a, pd2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f31606a;

    public static class GroupListDeserializer implements JsonDeserializer<GroupListDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final GroupListDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            try {
                GroupListDTO groupListDTO = new GroupListDTO();
                groupListDTO.k(new JSONObject(jsonElement.getAsJsonObject().toString()));
                return groupListDTO;
            } catch (JSONException unused) {
                return null;
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.t1.a
    public final boolean b(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2.isEmpty()) {
            return true;
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            t1.c cVar = (t1.c) it.next();
            if (cVar.f45035a.equals("Groups")) {
                if (!cVar.f45036b) {
                    return false;
                }
                JSONArray jSONArray = cVar.f45037c;
                if (jSONArray != null) {
                    this.f31606a = GroupDTO.C(jSONArray);
                }
            }
        }
        return true;
    }

    @Override // pd2.b
    public final boolean d(String str) {
        throw null;
    }

    @Override // pd2.b
    public final String h() {
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = this.f31606a;
            if (arrayList != null && !arrayList.isEmpty()) {
                int size = this.f31606a.size();
                for (int i14 = 0; i14 < size; i14++) {
                    jSONArray.put(new JSONObject(((GroupDTO) this.f31606a.get(i14)).F()));
                }
            }
            return t1.b(jSONArray);
        } catch (JSONException unused) {
            return "";
        }
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            t1.a(null, new String[]{"Groups"}, jSONObject, this);
        }
    }
}
