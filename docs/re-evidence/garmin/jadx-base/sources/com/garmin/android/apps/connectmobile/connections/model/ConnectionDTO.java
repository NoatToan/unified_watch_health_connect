package com.garmin.android.apps.connectmobile.connections.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.s1;
import com.garmin.android.apps.connectmobile.userprofile.model.j;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.l;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes7.dex */
@JsonAdapter(ConnectionDeserializer.class)
@Deprecated
public class ConnectionDTO extends s1 implements Comparable<ConnectionDTO>, Parcelable, Cloneable {
    public static final Parcelable.Creator<ConnectionDTO> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f31654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f31655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f31656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f31657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f31658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f31659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f31660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f31661h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Long f31662i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f31663j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.connections.model.a f31664k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f31665l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f31666m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f31667n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f31668o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public j f31669p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f31670q;

    public static class ConnectionDeserializer implements JsonDeserializer<ConnectionDTO> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Logger f31671a;

        static {
            int i14 = gt2.c.f79010a;
            f31671a = gt2.b.f79005a.h("ConnectionDeserializer");
        }

        @Override // com.google.gson.JsonDeserializer
        public final ConnectionDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            try {
                JSONObject jSONObject = new JSONObject(jsonElement.toString());
                ConnectionDTO connectionDTO = new ConnectionDTO();
                connectionDTO.k(jSONObject);
                return connectionDTO;
            } catch (Exception e4) {
                f31671a.error("Failed to deserialize connection : ", (Throwable) e4);
                return null;
            }
        }
    }

    public static class ConnectionStatusDeserializer implements JsonDeserializer<com.garmin.android.apps.connectmobile.connections.model.a> {
        @Override // com.google.gson.JsonDeserializer
        public final com.garmin.android.apps.connectmobile.connections.model.a deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            return com.garmin.android.apps.connectmobile.connections.model.a.a(jsonElement.getAsInt());
        }
    }

    public class a implements Parcelable.Creator<ConnectionDTO> {
        @Override // android.os.Parcelable.Creator
        public final ConnectionDTO createFromParcel(Parcel parcel) {
            return new ConnectionDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ConnectionDTO[] newArray(int i14) {
            return new ConnectionDTO[i14];
        }
    }

    public class b implements Comparator<ConnectionDTO> {
        @Override // java.util.Comparator
        public final int compare(ConnectionDTO connectionDTO, ConnectionDTO connectionDTO2) {
            ConnectionDTO connectionDTO3 = connectionDTO;
            ConnectionDTO connectionDTO4 = connectionDTO2;
            com.garmin.android.apps.connectmobile.connections.model.a aVar = connectionDTO3.f31664k;
            com.garmin.android.apps.connectmobile.connections.model.a aVar2 = com.garmin.android.apps.connectmobile.connections.model.a.CONNECTED;
            int iCompareTo = Integer.valueOf(aVar == aVar2 ? 0 : 1).compareTo(Integer.valueOf(connectionDTO4.f31664k == aVar2 ? 0 : 1));
            return iCompareTo != 0 ? iCompareTo : connectionDTO3.C().toUpperCase(Locale.getDefault()).compareTo(connectionDTO4.C().toUpperCase(Locale.getDefault()));
        }
    }

    static {
        new b();
    }

    public ConnectionDTO(Parcel parcel) {
        this.f31664k = com.garmin.android.apps.connectmobile.connections.model.a.NOT_FRIEND;
        this.f31654a = parcel.readString();
        this.f31655b = parcel.readString();
        this.f31656c = parcel.readString();
        this.f31657d = parcel.readString();
        this.f31658e = parcel.readString();
        this.f31659f = parcel.readString();
        this.f31660g = parcel.readString();
        this.f31667n = parcel.readInt();
        this.f31661h = parcel.readString();
        this.f31662i = (Long) parcel.readValue(getClass().getClassLoader());
        this.f31664k = com.garmin.android.apps.connectmobile.connections.model.a.a(parcel.readInt());
        this.f31665l = parcel.createStringArrayList();
        this.f31668o = parcel.readInt();
        this.f31669p = (j) parcel.readParcelable(j.class.getClassLoader());
        this.f31670q = parcel.readInt() != 0;
    }

    public final String C() {
        if (!TextUtils.isEmpty(this.f31656c)) {
            return this.f31656c;
        }
        if (TextUtils.isEmpty(this.f31655b)) {
            return null;
        }
        return this.f31655b;
    }

    public final Object clone() {
        try {
            return (ConnectionDTO) super.clone();
        } catch (ClassCastException unused) {
            l.n(this, "Fix me developer! The cloned object cannot be cast to ConnectionDTO. ");
            return null;
        } catch (CloneNotSupportedException unused2) {
            l.n(this, "Fix me developer! The class to be cloned is not Cloneable. ");
            return null;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(ConnectionDTO connectionDTO) {
        ConnectionDTO connectionDTO2 = connectionDTO;
        if (this == connectionDTO2) {
            return 0;
        }
        String strC = C();
        if (strC == null) {
            strC = "zzzzzz";
        }
        String upperCase = strC.toUpperCase(Locale.getDefault());
        String strC2 = connectionDTO2.C();
        if (strC2 == null) {
            strC2 = "zzzzzzz";
        }
        return upperCase.compareTo(strC2.toUpperCase(Locale.getDefault()));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConnectionDTO connectionDTO = (ConnectionDTO) obj;
        return this.f31663j == connectionDTO.f31663j && this.f31667n == connectionDTO.f31667n && this.f31668o == connectionDTO.f31668o && Objects.equals(this.f31654a, connectionDTO.f31654a) && Objects.equals(this.f31655b, connectionDTO.f31655b) && Objects.equals(this.f31656c, connectionDTO.f31656c) && Objects.equals(this.f31657d, connectionDTO.f31657d) && Objects.equals(this.f31658e, connectionDTO.f31658e) && Objects.equals(this.f31659f, connectionDTO.f31659f) && Objects.equals(this.f31660g, connectionDTO.f31660g) && Objects.equals(this.f31661h, connectionDTO.f31661h) && Objects.equals(this.f31662i, connectionDTO.f31662i) && this.f31664k == connectionDTO.f31664k && Objects.equals(this.f31665l, connectionDTO.f31665l) && Objects.equals(this.f31666m, connectionDTO.f31666m) && Boolean.valueOf(this.f31670q).equals(Boolean.valueOf(connectionDTO.f31670q));
    }

    /* JADX WARN: Code duplicated, block: B:49:0x014e  */
    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        ArrayList arrayList;
        if (jSONObject != null) {
            this.f31654a = s1.u(jSONObject, "userId");
            this.f31655b = s1.u(jSONObject, "displayName");
            this.f31656c = s1.u(jSONObject, "fullName");
            this.f31657d = s1.u(jSONObject, FirebaseAnalytics.Param.LOCATION);
            this.f31660g = s1.u(jSONObject, "profileImageUrlSmall");
            this.f31659f = s1.u(jSONObject, "profileImageUrlMedium");
            this.f31658e = s1.u(jSONObject, "profileImageUrlLarge");
            this.f31667n = jSONObject.optInt("userLevel", 1);
            this.f31661h = s1.u(jSONObject, "connectionRequestId");
            this.f31662i = s1.t(jSONObject, "connectionRequestorId");
            this.f31663j = jSONObject.optBoolean("requestViewed");
            this.f31664k = com.garmin.android.apps.connectmobile.connections.model.a.a(jSONObject.optInt("connectionStatus"));
            if (!jSONObject.isNull("userConnectionStatus")) {
                this.f31664k = com.garmin.android.apps.connectmobile.connections.model.a.a(jSONObject.optInt("userConnectionStatus"));
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("userRoles");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i14 = 0; i14 < jSONArrayOptJSONArray.length(); i14++) {
                    arrayList2.add(jSONArrayOptJSONArray.getString(i14));
                }
                this.f31665l = arrayList2;
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("deviceInvitations");
            if (jSONArrayOptJSONArray2 != null) {
                com.garmin.android.apps.connectmobile.smartscale.model.b.f44427q.getClass();
                ArrayList arrayList3 = new ArrayList();
                int length = jSONArrayOptJSONArray2.length();
                for (int i15 = 0; i15 < length; i15++) {
                    arrayList3.add((com.garmin.android.apps.connectmobile.smartscale.model.b) GsonUtil.f47253b.fromJson(String.valueOf(jSONArrayOptJSONArray2.getJSONObject(i15)), com.garmin.android.apps.connectmobile.smartscale.model.b.class));
                }
                com.garmin.android.apps.connectmobile.smartscale.model.b[] bVarArr = (com.garmin.android.apps.connectmobile.smartscale.model.b[]) arrayList3.toArray(new com.garmin.android.apps.connectmobile.smartscale.model.b[0]);
                if (bVarArr == null || bVarArr.length <= 0) {
                    arrayList = null;
                } else if (bVarArr.length == 1) {
                    arrayList = new ArrayList();
                    arrayList.add(bVarArr[0]);
                } else {
                    Arrays.sort(bVarArr, Collections.reverseOrder(new com.garmin.android.apps.connectmobile.smartscale.model.c()));
                    arrayList = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    for (com.garmin.android.apps.connectmobile.smartscale.model.b bVar : bVarArr) {
                        if (bVar.getDeviceInviteStatus() == com.garmin.android.apps.connectmobile.smartscale.model.d.INVITED || bVar.getDeviceInviteStatus() == com.garmin.android.apps.connectmobile.smartscale.model.d.BLOCKED) {
                            arrayList.add(bVar);
                        } else if (bVar.getDeviceInviteStatus() == com.garmin.android.apps.connectmobile.smartscale.model.d.ACCEPTED) {
                            arrayList4.add(bVar);
                        } else if (bVar.getDeviceInviteStatus() == com.garmin.android.apps.connectmobile.smartscale.model.d.DECLINED) {
                            arrayList5.add(bVar);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        if (!arrayList4.isEmpty()) {
                            arrayList = arrayList4;
                        } else if (arrayList5.isEmpty()) {
                            arrayList = null;
                        } else {
                            arrayList = arrayList5;
                        }
                    }
                }
                this.f31666m = arrayList;
            }
            this.f31668o = jSONObject.optInt("mutualConnectionCount");
            if (jSONObject.opt("profileImageUrls") instanceof JSONObject) {
                this.f31669p = (j) GsonUtil.f47253b.fromJson(jSONObject.getJSONObject("profileImageUrls").toString(), j.class);
            }
            Boolean boolValueOf = Boolean.FALSE;
            if (!jSONObject.isNull("wheelchairModeEnabled")) {
                boolValueOf = Boolean.valueOf(jSONObject.optBoolean("wheelchairModeEnabled", false));
            }
            this.f31670q = boolValueOf.booleanValue();
        }
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ConnectionDTO [mUserId=");
        sb3.append(this.f31654a);
        sb3.append(", mDisplayName=");
        sb3.append(this.f31655b);
        sb3.append(", mFullName=");
        sb3.append(this.f31656c);
        sb3.append(", mLocation=");
        sb3.append(this.f31657d);
        sb3.append(", mProfileImageUrlMedium=");
        sb3.append(this.f31659f);
        sb3.append(", mProfileImageUrlSmall=");
        sb3.append(this.f31660g);
        sb3.append(", mConnectionRequestId=");
        sb3.append(this.f31661h);
        sb3.append(", mConnectionRequestorId=");
        sb3.append(this.f31662i);
        sb3.append(", mRequestViewed=");
        sb3.append(this.f31663j);
        sb3.append(", mUserConnectionStatus=");
        sb3.append(this.f31664k);
        sb3.append(", mUserRoles=");
        sb3.append(this.f31665l);
        sb3.append(", deviceInviteDTOList=");
        sb3.append(this.f31666m);
        sb3.append(", mMutualConnectionCount=");
        sb3.append(this.f31668o);
        sb3.append(", mWheelchairModeEnabled=");
        return hb.a.k(sb3, this.f31670q, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f31654a);
        parcel.writeString(this.f31655b);
        parcel.writeString(this.f31656c);
        parcel.writeString(this.f31657d);
        parcel.writeString(this.f31658e);
        parcel.writeString(this.f31659f);
        parcel.writeString(this.f31660g);
        parcel.writeInt(this.f31667n);
        parcel.writeString(this.f31661h);
        parcel.writeValue(this.f31662i);
        parcel.writeInt(this.f31664k.f31685a);
        parcel.writeStringList(this.f31665l);
        parcel.writeInt(this.f31668o);
        parcel.writeParcelable(this.f31669p, i14);
        parcel.writeInt(this.f31670q ? 1 : 0);
    }

    public ConnectionDTO() {
        this.f31664k = com.garmin.android.apps.connectmobile.connections.model.a.NOT_FRIEND;
    }
}
