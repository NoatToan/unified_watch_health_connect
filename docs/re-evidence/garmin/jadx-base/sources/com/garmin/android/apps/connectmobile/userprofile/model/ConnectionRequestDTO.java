package com.garmin.android.apps.connectmobile.userprofile.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@JsonAdapter(ConnectionRequestJsonAdapter.class)
public class ConnectionRequestDTO extends s1 implements Parcelable {
    public static final Parcelable.Creator<ConnectionRequestDTO> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f46812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f46813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f46814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f46815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f46816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f46817g;

    public static class ConnectionRequestJsonAdapter implements JsonDeserializer<ConnectionRequestDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final ConnectionRequestDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            try {
                ConnectionRequestDTO connectionRequestDTO = new ConnectionRequestDTO();
                connectionRequestDTO.k(new JSONObject(jsonElement.toString()));
                return connectionRequestDTO;
            } catch (JSONException e4) {
                i2.f36769a.getClass();
                i2.a.d(a2.GENERAL, e4);
                return null;
            }
        }
    }

    public class a implements Parcelable.Creator<ConnectionRequestDTO> {
        @Override // android.os.Parcelable.Creator
        public final ConnectionRequestDTO createFromParcel(Parcel parcel) {
            return new ConnectionRequestDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ConnectionRequestDTO[] newArray(int i14) {
            return new ConnectionRequestDTO[i14];
        }
    }

    public enum b {
        /* JADX INFO: Fake field, exist only in values array */
        CREATED("Created"),
        /* JADX INFO: Fake field, exist only in values array */
        ACCEPTED("Accepted"),
        /* JADX INFO: Fake field, exist only in values array */
        DECLINED("Declined"),
        /* JADX INFO: Fake field, exist only in values array */
        CANCELLED("Cancelled"),
        /* JADX INFO: Fake field, exist only in values array */
        FOLLOWING("Following"),
        /* JADX INFO: Fake field, exist only in values array */
        BLOCKING("Blocking"),
        /* JADX INFO: Fake field, exist only in values array */
        BLOCKED("Blocked");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46819a;

        b(String str) {
            this.f46819a = str;
        }
    }

    public ConnectionRequestDTO(Parcel parcel) {
        this.f46811a = parcel.readInt();
        this.f46817g = parcel.readLong();
        this.f46816f = parcel.readLong();
        this.f46814d = b.values()[parcel.readInt()];
        this.f46813c = parcel.readLong();
        this.f46812b = parcel.readLong();
        this.f46815e = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.f46811a = jSONObject.optInt(TtmlNode.ATTR_ID);
        this.f46812b = jSONObject.optLong("requestEndTime");
        this.f46813c = jSONObject.optLong("requestStartTime");
        String strOptString = jSONObject.optString("requestStatus", "");
        for (b bVar : b.values()) {
            if (bVar.f46819a.equals(strOptString)) {
                this.f46814d = bVar;
                this.f46816f = jSONObject.optLong("requestorId");
                this.f46817g = jSONObject.optLong("requesteeId");
                this.f46815e = jSONObject.optBoolean("requestViewed");
            }
        }
        bVar = null;
        this.f46814d = bVar;
        this.f46816f = jSONObject.optLong("requestorId");
        this.f46817g = jSONObject.optLong("requesteeId");
        this.f46815e = jSONObject.optBoolean("requestViewed");
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ConnectionRequestDTO{id=");
        sb3.append(this.f46811a);
        sb3.append(", requestEndTime=");
        sb3.append(this.f46812b);
        sb3.append(", requestStartTime=");
        sb3.append(this.f46813c);
        sb3.append(", requestStatus=");
        sb3.append(this.f46814d);
        sb3.append(", requestViewed=");
        sb3.append(this.f46815e);
        sb3.append(", requestorId=");
        sb3.append(this.f46816f);
        sb3.append(", requesteeId=");
        return a0.l(sb3, this.f46817g, CoreConstants.CURLY_RIGHT);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.f46811a);
        parcel.writeLong(this.f46816f);
        parcel.writeLong(this.f46817g);
        parcel.writeInt(this.f46814d.ordinal());
        parcel.writeLong(this.f46813c);
        parcel.writeLong(this.f46812b);
        parcel.writeInt(this.f46815e ? 1 : 0);
    }

    public ConnectionRequestDTO() {
    }
}
