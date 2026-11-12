package com.garmin.android.apps.connectmobile.smartscale.model;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c22.k;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.annotations.JsonAdapter;
import com.google.maps.android.BuildConfig;
import java.lang.reflect.Type;
import java.util.TimeZone;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
@JsonAdapter(WeightScaleUserInfoDTODeserializer.class)
public class WeightScaleUserInfoDTO extends s1 implements Parcelable, pd2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f44407a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f44408b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f44409c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f44410d = b.MALE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Double f44411e = Double.valueOf(170.0d);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Double f44412f = Double.valueOf(68039.0d);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f44413g = D();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Boolean f44414h = Boolean.FALSE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Integer f44415i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f44416j = TimeZone.getDefault().getID();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final DateTimeFormatter f44406k = DateTimeFormat.forPattern("yyyy-MM-dd");
    public static final Parcelable.Creator<WeightScaleUserInfoDTO> CREATOR = new a();

    public static class WeightScaleUserInfoDTODeserializer implements JsonDeserializer<WeightScaleUserInfoDTO>, JsonSerializer<WeightScaleUserInfoDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final WeightScaleUserInfoDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            try {
                WeightScaleUserInfoDTO weightScaleUserInfoDTO = new WeightScaleUserInfoDTO();
                weightScaleUserInfoDTO.k(new JSONObject(jsonElement.toString()));
                return weightScaleUserInfoDTO;
            } catch (Exception e4) {
                i2.g(e4, "WeightScaleUserInfoDTO");
                return null;
            }
        }

        @Override // com.google.gson.JsonSerializer
        public final JsonElement serialize(WeightScaleUserInfoDTO weightScaleUserInfoDTO, Type type, JsonSerializationContext jsonSerializationContext) {
            try {
                return (JsonElement) GsonUtil.f47253b.fromJson(weightScaleUserInfoDTO.h(), JsonElement.class);
            } catch (Exception e4) {
                i2.g(e4, "WeightScaleUserInfoDTO");
                return null;
            }
        }
    }

    public class a implements Parcelable.Creator<WeightScaleUserInfoDTO> {
        @Override // android.os.Parcelable.Creator
        public final WeightScaleUserInfoDTO createFromParcel(Parcel parcel) {
            WeightScaleUserInfoDTO weightScaleUserInfoDTO = new WeightScaleUserInfoDTO();
            weightScaleUserInfoDTO.f44407a = parcel.readLong();
            weightScaleUserInfoDTO.f44408b = parcel.readLong();
            weightScaleUserInfoDTO.I(parcel.readString());
            String string = parcel.readString();
            b bVarValueOf = b.MALE;
            try {
                if (!TextUtils.isEmpty(string)) {
                    bVarValueOf = b.valueOf(string);
                }
            } catch (Exception unused) {
            }
            weightScaleUserInfoDTO.f44410d = bVarValueOf;
            weightScaleUserInfoDTO.H(Double.valueOf(parcel.readDouble()));
            weightScaleUserInfoDTO.M(Double.valueOf(parcel.readDouble()));
            weightScaleUserInfoDTO.G(parcel.readString());
            weightScaleUserInfoDTO.f44414h = Boolean.valueOf(parcel.readByte() == 1);
            weightScaleUserInfoDTO.F(Integer.valueOf(parcel.readInt()));
            String string2 = parcel.readString();
            if (TextUtils.isEmpty(string2)) {
                string2 = TimeZone.getDefault().getID();
            }
            weightScaleUserInfoDTO.f44416j = string2;
            return weightScaleUserInfoDTO;
        }

        @Override // android.os.Parcelable.Creator
        public final WeightScaleUserInfoDTO[] newArray(int i14) {
            return new WeightScaleUserInfoDTO[i14];
        }
    }

    public enum b {
        MALE,
        /* JADX INFO: Fake field, exist only in values array */
        FEMALE
    }

    public static String D() {
        k kVar = (k) KoinJavaComponent.get(k.class);
        f12.b bVar = (f12.b) KoinJavaComponent.get(f12.b.class);
        if (!kVar.f() || bVar.f()) {
            return f44406k.print(631173600000L);
        }
        return null;
    }

    public final LocalDate C() {
        try {
            String str = this.f44413g;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return f44406k.parseLocalDate(str);
        } catch (IllegalArgumentException | UnsupportedOperationException e4) {
            i2.i("WeightScaleUserInfoDTO", e4.toString());
            return null;
        }
    }

    public final void F(Integer num) {
        if (num.intValue() < 0 || num.intValue() > 10) {
            this.f44415i = 5;
        } else {
            this.f44415i = num;
        }
    }

    public final void G(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f44413g = D();
            return;
        }
        int iIndexOf = str.indexOf("T");
        if (iIndexOf > -1) {
            this.f44413g = str.substring(0, iIndexOf);
        } else {
            this.f44413g = str;
        }
    }

    public final void H(Double d14) {
        if (d14.doubleValue() > 0.0d) {
            this.f44411e = d14;
        } else {
            this.f44411e = Double.valueOf(170.0d);
        }
    }

    public final void I(String str) {
        if (str != null && BuildConfig.TRAVIS.equalsIgnoreCase(str.trim())) {
            str = null;
        }
        this.f44409c = str;
    }

    public final void M(Double d14) {
        if (d14.doubleValue() > 0.0d) {
            this.f44412f = d14;
        } else {
            this.f44412f = Double.valueOf(68039.0d);
        }
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
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userProfileId", this.f44407a);
            jSONObject.put("deviceId", this.f44408b);
            jSONObject.put("shortName", this.f44409c);
            b bVar = this.f44410d;
            jSONObject.put("gender", bVar == null ? null : bVar.name());
            jSONObject.put("height", this.f44411e);
            jSONObject.put("weight", this.f44412f);
            if (this.f44413g == null) {
                str = null;
            } else {
                str = this.f44413g + "T00:00:00.0";
            }
            jSONObject.put("birthdate", str);
            jSONObject.put("isPrimaryUser", this.f44414h);
            Integer num = this.f44415i;
            if (num != null && num.intValue() != -1) {
                jSONObject.put("activityClass", this.f44415i);
            }
            if (!TextUtils.isEmpty(this.f44416j)) {
                jSONObject.put("timeZoneKey", this.f44416j);
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        i2.d("WeightScaleUserInfoDTO", "loadFromJson: " + jSONObject);
        if (jSONObject != null) {
            if (jSONObject.has("userProfileId")) {
                this.f44407a = jSONObject.optLong("userProfileId", -1L);
            }
            if (jSONObject.has("deviceId")) {
                this.f44408b = jSONObject.optLong("deviceId", -1L);
            }
            if (jSONObject.has("shortName")) {
                I(s1.u(jSONObject, "shortName"));
            }
            if (jSONObject.has("gender")) {
                String strU = s1.u(jSONObject, "gender");
                b bVarValueOf = b.MALE;
                try {
                    if (!TextUtils.isEmpty(strU)) {
                        bVarValueOf = b.valueOf(strU);
                    }
                } catch (Exception unused) {
                }
                this.f44410d = bVarValueOf;
            }
            if (jSONObject.has("height")) {
                H(Double.valueOf(jSONObject.optDouble("height")));
            }
            if (jSONObject.has("weight")) {
                M(Double.valueOf(jSONObject.optDouble("weight")));
            }
            if (jSONObject.has("birthdate")) {
                G(s1.u(jSONObject, "birthdate"));
            }
            if (jSONObject.has("isPrimaryUser")) {
                this.f44414h = Boolean.valueOf(jSONObject.optBoolean("isPrimaryUser"));
            }
            if (jSONObject.has("activityClass")) {
                F(Integer.valueOf(jSONObject.optInt("activityClass", -1)));
            }
            if (jSONObject.has("timeZoneKey")) {
                String strU2 = s1.u(jSONObject, "timeZoneKey");
                if (TextUtils.isEmpty(strU2)) {
                    strU2 = TimeZone.getDefault().getID();
                }
                this.f44416j = strU2;
            }
        }
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("WeightScaleUserInfoDTO [userProfileId=");
        sb3.append(this.f44407a);
        sb3.append(", deviceId=");
        sb3.append(this.f44408b);
        sb3.append(", shortName=");
        sb3.append(this.f44409c);
        sb3.append(", gender=");
        b bVar = this.f44410d;
        sb3.append(bVar == null ? null : bVar.name());
        sb3.append(", height (cm)=");
        sb3.append(this.f44411e);
        sb3.append(", weight (gram)=");
        sb3.append(this.f44412f);
        sb3.append(", birthdate=");
        sb3.append(this.f44413g);
        sb3.append(", isPrimaryUser=");
        sb3.append(this.f44414h);
        sb3.append(", activityClass=");
        sb3.append(this.f44415i);
        sb3.append(", timeZoneKey=");
        return j.o(this.f44416j, "]", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeLong(this.f44407a);
        parcel.writeLong(this.f44408b);
        parcel.writeString(this.f44409c);
        b bVar = this.f44410d;
        parcel.writeString(bVar == null ? null : bVar.name());
        parcel.writeDouble(this.f44411e.doubleValue());
        parcel.writeDouble(this.f44412f.doubleValue());
        parcel.writeString(this.f44413g);
        parcel.writeByte(this.f44414h.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f44415i.intValue());
        parcel.writeString(this.f44416j);
    }
}
