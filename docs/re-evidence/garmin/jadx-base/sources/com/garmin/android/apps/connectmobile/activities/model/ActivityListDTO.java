package com.garmin.android.apps.connectmobile.activities.model;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.garmin.android.apps.connectmobile.userprofile.model.ProfileInfoJsonAdapter;
import com.garmin.android.apps.connectmobile.userprofile.model.l;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.annotations.JsonAdapter;
import com.mapbox.maps.MapboxMap;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pd2.b;
import to.e;
import to.g;

/* JADX INFO: loaded from: classes7.dex */
@JsonAdapter(ActivityListDeserializer.class)
public class ActivityListDTO extends s1 implements Parcelable, b {
    public static final Parcelable.Creator<ActivityListDTO> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<ActivityListItemDTO> f29242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f29243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f29244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap f29246e = new HashMap();

    public static class ActivityListDeserializer implements JsonDeserializer<ActivityListDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final ActivityListDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            try {
                ActivityListDTO activityListDTO = new ActivityListDTO();
                activityListDTO.k(new JSONObject(jsonElement.toString()));
                return activityListDTO;
            } catch (Exception e4) {
                i2.g(e4, "ActivityListDTO");
                return null;
            }
        }
    }

    public class a implements Parcelable.Creator<ActivityListDTO> {
        @Override // android.os.Parcelable.Creator
        public final ActivityListDTO createFromParcel(Parcel parcel) {
            return new ActivityListDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ActivityListDTO[] newArray(int i14) {
            return new ActivityListDTO[i14];
        }
    }

    public ActivityListDTO(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        int i14 = parcel.readInt();
        if (i14 > 0) {
            if (this.f29242a == null) {
                this.f29242a = new ArrayList<>();
            }
            for (int i15 = 0; i15 < i14; i15++) {
                this.f29242a.add((ActivityListItemDTO) parcel.readParcelable(classLoader));
            }
        }
        this.f29243b = (e) parcel.readParcelable(classLoader);
        this.f29244c = (g) parcel.readParcelable(classLoader);
        this.f29245d = parcel.readInt();
        parcel.readMap(this.f29246e, l.class.getClassLoader());
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
        if (jSONObject == null) {
            return;
        }
        if (jSONObject.has("activityList") && !jSONObject.isNull("activityList")) {
            this.f29242a = new ArrayList<>();
            JSONArray jSONArray = jSONObject.getJSONArray("activityList");
            for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                ActivityListItemDTO activityListItemDTO = new ActivityListItemDTO();
                activityListItemDTO.k(jSONArray.getJSONObject(i14));
                this.f29242a.add(activityListItemDTO);
            }
        }
        if (jSONObject.has("filter") && !jSONObject.isNull("filter")) {
            e eVar = new e();
            eVar.k(jSONObject.getJSONObject("filter"));
            this.f29243b = eVar;
        }
        if (jSONObject.has("pagination") && !jSONObject.isNull("pagination")) {
            new g();
            JSONObject jSONObject2 = jSONObject.getJSONObject("pagination");
            jSONObject2.getClass();
            g gVar = new g(0, 0, 3, null);
            if (jSONObject2.has(TtmlNode.START) && !jSONObject2.isNull(TtmlNode.START)) {
                gVar = g.b(gVar, jSONObject2.getInt(TtmlNode.START), 0, 2);
            }
            if (jSONObject2.has(MapboxMap.QFE_LIMIT) && !jSONObject2.isNull(MapboxMap.QFE_LIMIT)) {
                gVar = g.b(gVar, 0, jSONObject2.getInt(MapboxMap.QFE_LIMIT), 1);
            }
            this.f29244c = gVar;
        }
        if (jSONObject.has("daysLimit") && !jSONObject.isNull("daysLimit")) {
            this.f29245d = jSONObject.getInt("daysLimit");
        }
        if (!(jSONObject.opt("profileInfos") instanceof JSONObject) || jSONObject.getJSONObject("profileInfos").names() == null) {
            return;
        }
        JsonElement string = JsonParser.parseString(jSONObject.getJSONObject("profileInfos").toString());
        new ProfileInfoJsonAdapter();
        this.f29246e = ProfileInfoJsonAdapter.a(string);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActivitiesListDTO [activityList=");
        sb3.append(this.f29242a);
        sb3.append(", filter=");
        sb3.append(this.f29243b);
        sb3.append(", pagination=");
        sb3.append(this.f29244c);
        sb3.append(", daysLimit=");
        return j.q(sb3, this.f29245d, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        ArrayList<ActivityListItemDTO> arrayList = this.f29242a;
        if (arrayList == null || arrayList.isEmpty()) {
            parcel.writeInt(0);
        } else {
            int size = this.f29242a.size();
            parcel.writeInt(size);
            for (int i15 = 0; i15 < size; i15++) {
                parcel.writeParcelable(this.f29242a.get(i15), 0);
            }
        }
        parcel.writeParcelable(this.f29243b, 0);
        parcel.writeParcelable(this.f29244c, 0);
        parcel.writeInt(this.f29245d);
        parcel.writeMap(this.f29246e);
    }

    public ActivityListDTO() {
    }
}
