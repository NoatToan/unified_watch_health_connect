package com.garmin.android.apps.connectmobile.golf.truswing.model;

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
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@JsonAdapter(SwingSessionDeserializer.class)
public class SwingSessionDTO extends s1 implements Parcelable {
    public static final Parcelable.Creator<SwingSessionDTO> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f35882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f35883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f35884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f35885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f35887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<SwingDTO> f35888g;

    public static class SwingSessionDeserializer implements JsonDeserializer<SwingSessionDTO>, JsonSerializer<SwingSessionDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final SwingSessionDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            try {
                SwingSessionDTO swingSessionDTO = new SwingSessionDTO();
                swingSessionDTO.k(new JSONObject(jsonElement.toString()));
                return swingSessionDTO;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // com.google.gson.JsonSerializer
        public final JsonElement serialize(SwingSessionDTO swingSessionDTO, Type type, JsonSerializationContext jsonSerializationContext) {
            try {
                return (JsonElement) GsonUtil.f47253b.fromJson(swingSessionDTO.C().toString(), JsonElement.class);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public class a implements Parcelable.Creator<SwingSessionDTO> {
        @Override // android.os.Parcelable.Creator
        public final SwingSessionDTO createFromParcel(Parcel parcel) {
            return new SwingSessionDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SwingSessionDTO[] newArray(int i14) {
            return new SwingSessionDTO[i14];
        }
    }

    public SwingSessionDTO(Parcel parcel) {
        this.f35888g = new ArrayList();
        this.f35882a = parcel.readLong();
        this.f35883b = parcel.readString();
        this.f35884c = parcel.readString();
        this.f35885d = parcel.readString();
        this.f35886e = parcel.readInt();
        this.f35887f = parcel.readString();
        this.f35888g = parcel.readArrayList(SwingDTO.class.getClassLoader());
    }

    public final JSONObject C() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("swingSessionId", this.f35882a);
        jSONObject.put("customerId", this.f35883b);
        jSONObject.put("displayName", this.f35884c);
        jSONObject.put("date", this.f35885d);
        jSONObject.put("swingCount", this.f35886e);
        jSONObject.put("notes", this.f35887f);
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f35882a = jSONObject.optLong("swingSessionId");
            this.f35883b = s1.u(jSONObject, "customerId");
            this.f35884c = s1.u(jSONObject, "displayName");
            this.f35885d = s1.u(jSONObject, "date");
            this.f35886e = jSONObject.optInt("swingCount");
            this.f35887f = s1.u(jSONObject, "notes");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("swings");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i14 = 0; i14 < jSONArrayOptJSONArray.length(); i14++) {
                    SwingDTO swingDTO = new SwingDTO();
                    swingDTO.k(jSONArrayOptJSONArray.optJSONObject(i14));
                    arrayList.add(swingDTO);
                }
            }
            this.f35888g = arrayList;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeLong(this.f35882a);
        parcel.writeString(this.f35883b);
        parcel.writeString(this.f35884c);
        parcel.writeString(this.f35885d);
        parcel.writeInt(this.f35886e);
        parcel.writeString(this.f35887f);
        parcel.writeList(this.f35888g);
    }

    public SwingSessionDTO(long j8, String str, String str2, String str3, int i14, String str4, List<SwingDTO> list) {
        new ArrayList();
        this.f35882a = j8;
        this.f35883b = str;
        this.f35884c = str2;
        this.f35885d = str3;
        this.f35886e = i14;
        this.f35887f = str4;
        this.f35888g = list;
    }

    public SwingSessionDTO() {
        this.f35888g = new ArrayList();
    }
}
