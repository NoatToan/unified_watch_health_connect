package com.garmin.android.apps.connectmobile.badges.service.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
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
import uu.i0;

/* JADX INFO: loaded from: classes7.dex */
@JsonAdapter(SimpleBadgeDeserializer.class)
public class SimpleBadgeDTO extends s1 implements Parcelable, e10.a<String, g> {
    public static final Parcelable.Creator<SimpleBadgeDTO> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f30531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f30532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f30533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f30534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f30535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f30536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f30537h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f30538i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f30539j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g f30540k;

    public static class SimpleBadgeDeserializer implements JsonDeserializer<SimpleBadgeDTO>, JsonSerializer<SimpleBadgeDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final SimpleBadgeDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            try {
                SimpleBadgeDTO simpleBadgeDTO = new SimpleBadgeDTO();
                simpleBadgeDTO.k(new JSONObject(jsonElement.toString()));
                return simpleBadgeDTO;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // com.google.gson.JsonSerializer
        public final JsonElement serialize(SimpleBadgeDTO simpleBadgeDTO, Type type, JsonSerializationContext jsonSerializationContext) {
            try {
                return (JsonElement) GsonUtil.f47253b.fromJson(simpleBadgeDTO.h(), JsonElement.class);
            } catch (Exception e4) {
                i2.e(a2.BADGES, "SimpleBadgeDTO", e4);
                return null;
            }
        }
    }

    public class a implements Parcelable.Creator<SimpleBadgeDTO> {
        @Override // android.os.Parcelable.Creator
        public final SimpleBadgeDTO createFromParcel(Parcel parcel) {
            return new SimpleBadgeDTO(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SimpleBadgeDTO[] newArray(int i14) {
            return new SimpleBadgeDTO[i14];
        }
    }

    private SimpleBadgeDTO(Parcel parcel) {
        this.f30530a = parcel.readInt();
        this.f30531b = parcel.readString();
        this.f30532c = parcel.readString();
        this.f30533d = parcel.readString();
        this.f30534e = parcel.readString();
        this.f30535f = parcel.readInt();
        this.f30536g = parcel.readInt();
        this.f30537h = parcel.readString();
        this.f30538i = parcel.readString();
        this.f30539j = parcel.readByte() != 0;
        this.f30540k = (g) parcel.readParcelable(g.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // e10.a
    /* JADX INFO: renamed from: f */
    public final String getBadgeKey() {
        return this.f30531b;
    }

    @Override // e10.a
    public final void g(g gVar) {
        this.f30540k = gVar;
    }

    public final String h() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("badgeId", this.f30530a);
            jSONObject.put("badgeKey", this.f30531b);
            jSONObject.put("badgeUuid", this.f30532c);
            jSONObject.put("badgeName", this.f30533d);
            jSONObject.put("badgeCategoryId", this.f30535f);
            jSONObject.put("badgeDifficultyId", this.f30536g);
            jSONObject.put("earnedByMe", this.f30539j);
            return jSONObject.toString();
        } catch (JSONException e4) {
            i2.e(a2.BADGES, "SimpleBadgeDTO", e4);
            return "";
        }
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        this.f30530a = jSONObject.optInt("badgeId");
        this.f30531b = s1.u(jSONObject, "badgeKey");
        this.f30532c = s1.u(jSONObject, "badgeUuid");
        this.f30533d = s1.u(jSONObject, "badgeName");
        this.f30535f = jSONObject.optInt("badgeCategoryId");
        this.f30536g = jSONObject.optInt("badgeDifficultyId");
        this.f30537h = i0.c(this.f30530a, this.f30532c, i0.g(), false);
        this.f30538i = i0.b(this.f30530a, this.f30532c);
        this.f30539j = jSONObject.optBoolean("earnedByMe", true);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.f30530a);
        parcel.writeString(this.f30531b);
        parcel.writeString(this.f30532c);
        parcel.writeString(this.f30533d);
        parcel.writeString(this.f30534e);
        parcel.writeInt(this.f30535f);
        parcel.writeInt(this.f30536g);
        parcel.writeString(this.f30537h);
        parcel.writeString(this.f30538i);
        parcel.writeByte(this.f30539j ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f30540k, i14);
    }

    public SimpleBadgeDTO() {
    }

    public /* synthetic */ SimpleBadgeDTO(Parcel parcel, int i14) {
        this(parcel);
    }
}
