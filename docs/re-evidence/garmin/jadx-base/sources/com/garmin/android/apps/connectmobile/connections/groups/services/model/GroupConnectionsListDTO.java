package com.garmin.android.apps.connectmobile.connections.groups.services.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.s1;
import com.garmin.android.apps.connectmobile.t1;
import com.garmin.android.apps.connectmobile.userprofile.model.ProfileInfoJsonAdapter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p92.y;

/* JADX INFO: loaded from: classes7.dex */
@JsonAdapter(Deserializer.class)
public class GroupConnectionsListDTO extends s1 implements Parcelable, t1.a {
    public static final Parcelable.Creator<GroupConnectionsListDTO> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f31549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f31551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f31552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f31553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f31554f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f31555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f31556h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f31557i;

    public static class Deserializer implements JsonDeserializer<GroupConnectionsListDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final GroupConnectionsListDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            try {
                GroupConnectionsListDTO groupConnectionsListDTO = new GroupConnectionsListDTO();
                groupConnectionsListDTO.k(new JSONObject(jsonElement.toString()));
                return groupConnectionsListDTO;
            } catch (JSONException e4) {
                y.f136664a.getClass();
                y.a.d("GroupConnectionsListDTO", e4);
                return null;
            }
        }
    }

    public class a implements Parcelable.Creator<GroupConnectionsListDTO> {
        @Override // android.os.Parcelable.Creator
        public final GroupConnectionsListDTO createFromParcel(Parcel parcel) {
            return new GroupConnectionsListDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupConnectionsListDTO[] newArray(int i14) {
            return new GroupConnectionsListDTO[i14];
        }
    }

    public GroupConnectionsListDTO(Parcel parcel) {
        new HashMap();
        ArrayList arrayList = new ArrayList();
        this.f31549a = arrayList;
        parcel.readTypedList(arrayList, b.CREATOR);
        this.f31550b = parcel.readString();
        this.f31551c = parcel.readInt() == 1;
        this.f31552d = parcel.readString();
        this.f31553e = parcel.readInt();
        this.f31554f = parcel.readString();
        this.f31555g = parcel.readInt() == 1;
        this.f31556h = parcel.readString();
        this.f31557i = parcel.readInt();
    }

    @Override // com.garmin.android.apps.connectmobile.t1.a
    public final boolean b(ArrayList arrayList, ArrayList arrayList2) throws JSONException {
        ArrayList arrayList3;
        JSONArray jSONArray;
        if (arrayList2.isEmpty()) {
            return true;
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            t1.c cVar = (t1.c) it.next();
            int i14 = 0;
            if (cVar.f45035a.equals("GroupMembers")) {
                if (!cVar.f45036b) {
                    return false;
                }
                JSONArray jSONArray2 = cVar.f45037c;
                if (jSONArray2 != null) {
                    b.f31611q.getClass();
                    ArrayList arrayList4 = new ArrayList(jSONArray2.length());
                    int length = jSONArray2.length();
                    while (i14 < length) {
                        JSONObject jSONObject = jSONArray2.getJSONObject(i14);
                        if (jSONObject != null) {
                            b bVar = new b(null, null, null, null, null, null, null, null, null, null, null, 0, null, false, null, 32767, null);
                            bVar.k(jSONObject);
                            arrayList4.add(bVar);
                        }
                        i14++;
                    }
                    this.f31549a = arrayList4;
                }
            } else if (cVar.f45035a.equals("GroupConnections") && (arrayList3 = this.f31549a) != null && !arrayList3.isEmpty() && (jSONArray = cVar.f45037c) != null) {
                HashMap map = new HashMap(jSONArray.length());
                while (i14 < jSONArray.length()) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i14);
                    if (jSONObject2 != null) {
                        c cVar2 = new c();
                        cVar2.k(jSONObject2);
                        String userProfileId = cVar2.getUserProfileId();
                        if (!TextUtils.isEmpty(userProfileId)) {
                            map.put(userProfileId, cVar2);
                        }
                    }
                    i14++;
                }
                for (b bVar2 : this.f31549a) {
                    String userProfileId2 = bVar2.getUserProfileId();
                    if (!TextUtils.isEmpty(userProfileId2)) {
                        c cVar3 = (c) map.get(userProfileId2);
                        cVar3.getClass();
                        bVar2.f31625m = cVar3;
                    }
                }
            }
        }
        ArrayList arrayList5 = this.f31549a;
        if (arrayList5 == null || arrayList5.isEmpty()) {
            return true;
        }
        for (b bVar3 : this.f31549a) {
            if (bVar3.f31625m == null) {
                c cVar4 = new c();
                cVar4.D(com.garmin.android.apps.connectmobile.connections.model.a.NOT_FRIEND);
                bVar3.f31625m = cVar4;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject != null) {
            t1.a(null, new String[]{"GroupMembers", "GroupConnections"}, jSONObject, this);
            if (!jSONObject.has("profileInfos") || jSONObject.isNull("profileInfos") || (jSONObjectOptJSONObject = jSONObject.optJSONObject("profileInfos")) == null) {
                return;
            }
            JsonElement string = JsonParser.parseString(jSONObjectOptJSONObject.toString());
            new ProfileInfoJsonAdapter();
            ProfileInfoJsonAdapter.a(string);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeTypedList(this.f31549a);
        parcel.writeString(this.f31550b);
        parcel.writeInt(this.f31551c ? 1 : 0);
        parcel.writeString(this.f31552d);
        parcel.writeInt(this.f31553e);
        parcel.writeString(this.f31554f);
        parcel.writeInt(this.f31555g ? 1 : 0);
        parcel.writeString(this.f31556h);
        parcel.writeInt(this.f31557i);
    }

    public GroupConnectionsListDTO() {
        new HashMap();
    }
}
