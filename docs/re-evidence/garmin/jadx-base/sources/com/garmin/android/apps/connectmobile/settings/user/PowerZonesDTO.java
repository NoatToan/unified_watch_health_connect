package com.garmin.android.apps.connectmobile.settings.user;

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
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@JsonAdapter(PowerZonesDeserializer.class)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\b\tB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/user/PowerZonesDTO;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "PowerZonesDeserializer", "b", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PowerZonesDTO extends s1 implements Parcelable {
    public static final Parcelable.Creator<PowerZonesDTO> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f43986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f43992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f43993h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f43994i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f43995j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f43996k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f43997l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f43998m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f43999n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f44000o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f44001p;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/user/PowerZonesDTO$PowerZonesDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/settings/user/PowerZonesDTO;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PowerZonesDeserializer implements JsonDeserializer<PowerZonesDTO>, JsonSerializer<PowerZonesDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final PowerZonesDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            com.nimbusds.jose.shaded.gson.internal.a.p(jsonElement, type, jsonDeserializationContext);
            try {
                PowerZonesDTO powerZonesDTO = new PowerZonesDTO();
                powerZonesDTO.k(new JSONObject(jsonElement.toString()));
                return powerZonesDTO;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // com.google.gson.JsonSerializer
        public final JsonElement serialize(PowerZonesDTO powerZonesDTO, Type type, JsonSerializationContext jsonSerializationContext) {
            PowerZonesDTO powerZonesDTO2 = powerZonesDTO;
            powerZonesDTO2.getClass();
            type.getClass();
            jsonSerializationContext.getClass();
            try {
                return (JsonElement) GsonUtil.f47253b.fromJson(powerZonesDTO2.C().toString(), JsonElement.class);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/settings/user/PowerZonesDTO$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/settings/user/PowerZonesDTO;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PowerZonesDTO> {
        @Override // android.os.Parcelable.Creator
        public final PowerZonesDTO createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new PowerZonesDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PowerZonesDTO[] newArray(int i14) {
            return new PowerZonesDTO[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public PowerZonesDTO(Parcel parcel) {
        parcel.getClass();
        this.f43986a = parcel.readString();
        this.f43987b = parcel.readInt();
        this.f43988c = parcel.readInt();
        this.f43989d = parcel.readInt();
        this.f43990e = parcel.readInt();
        this.f43991f = parcel.readInt();
        this.f43992g = parcel.readInt();
        this.f43993h = parcel.readInt();
        this.f43994i = parcel.readInt();
        this.f43995j = parcel.readInt();
        this.f43996k = parcel.readInt();
        this.f43997l = parcel.readInt();
        this.f43998m = parcel.readInt();
        this.f43999n = parcel.readInt();
        this.f44000o = parcel.readInt();
        this.f44001p = parcel.readInt();
    }

    public final JSONObject C() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sport", this.f43986a);
        jSONObject.put("functionalThresholdPower", this.f43987b);
        jSONObject.put("zone1Floor", this.f43988c);
        jSONObject.put("zone2Floor", this.f43989d);
        jSONObject.put("zone3Floor", this.f43990e);
        jSONObject.put("zone4Floor", this.f43991f);
        jSONObject.put("zone5Floor", this.f43992g);
        jSONObject.put("zone6Floor", this.f43993h);
        jSONObject.put("zone7Floor", this.f43994i);
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f43986a = jSONObject.getString("sport");
            this.f43987b = jSONObject.optInt("functionalThresholdPower", 0);
            this.f43988c = jSONObject.optInt("zone1Floor", 0);
            this.f43989d = jSONObject.optInt("zone2Floor", 0);
            this.f43990e = jSONObject.optInt("zone3Floor", 0);
            this.f43991f = jSONObject.optInt("zone4Floor", 0);
            this.f43992g = jSONObject.optInt("zone5Floor", 0);
            this.f43993h = jSONObject.optInt("zone6Floor", 0);
            this.f43994i = jSONObject.optInt("zone7Floor", 0);
            ok1.a.c(this);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f43986a);
        parcel.writeInt(this.f43987b);
        parcel.writeInt(this.f43988c);
        parcel.writeInt(this.f43989d);
        parcel.writeInt(this.f43990e);
        parcel.writeInt(this.f43991f);
        parcel.writeInt(this.f43992g);
        parcel.writeInt(this.f43993h);
        parcel.writeInt(this.f43994i);
        parcel.writeInt(this.f43995j);
        parcel.writeInt(this.f43996k);
        parcel.writeInt(this.f43997l);
        parcel.writeInt(this.f43998m);
        parcel.writeInt(this.f43999n);
        parcel.writeInt(this.f44000o);
        parcel.writeInt(this.f44001p);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/user/PowerZonesDTO$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/settings/user/PowerZonesDTO;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "JSON_KEY_SPORT", "Ljava/lang/String;", "JSON_KEY_FUNCTIONAL_THRESHOLD", "JSON_KEY_ZONE_0_FLOOR", "JSON_KEY_ZONE_1_FLOOR", "JSON_KEY_ZONE_2_FLOOR", "JSON_KEY_ZONE_3_FLOOR", "JSON_KEY_ZONE_4_FLOOR", "JSON_KEY_ZONE_5_FLOOR", "JSON_KEY_ZONE_6_FLOOR", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    public PowerZonesDTO() {
    }
}
