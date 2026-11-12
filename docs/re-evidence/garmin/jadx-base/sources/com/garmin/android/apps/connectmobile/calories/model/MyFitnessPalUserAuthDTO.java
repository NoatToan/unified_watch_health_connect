package com.garmin.android.apps.connectmobile.calories.model;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
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
import v.h;
import wr.g;

/* JADX INFO: loaded from: classes7.dex */
@JsonAdapter(MyFitnessPalUserAuthDTODeserializer.class)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u000f\u0010B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005B\u0013\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB\u0011\b\u0014\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0004\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calories/model/MyFitnessPalUserAuthDTO;", "Lcom/garmin/android/apps/connectmobile/s1;", "Lpd2/b;", "Landroid/os/Parcelable;", "<init>", "()V", "", "authCode", "(Ljava/lang/String;)V", "", "isLinked", "(Z)V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "MyFitnessPalUserAuthDTODeserializer", "b", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class MyFitnessPalUserAuthDTO extends s1 implements pd2.b, Parcelable {
    public static final Parcelable.Creator<MyFitnessPalUserAuthDTO> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f31235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f31236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f31237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f31238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f31239f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calories/model/MyFitnessPalUserAuthDTO$MyFitnessPalUserAuthDTODeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/calories/model/MyFitnessPalUserAuthDTO;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class MyFitnessPalUserAuthDTODeserializer implements JsonDeserializer<MyFitnessPalUserAuthDTO>, JsonSerializer<MyFitnessPalUserAuthDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final MyFitnessPalUserAuthDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            com.nimbusds.jose.shaded.gson.internal.a.p(jsonElement, type, jsonDeserializationContext);
            try {
                MyFitnessPalUserAuthDTO myFitnessPalUserAuthDTO = new MyFitnessPalUserAuthDTO();
                myFitnessPalUserAuthDTO.k(new JSONObject(jsonElement.toString()));
                return myFitnessPalUserAuthDTO;
            } catch (Exception e4) {
                i2.a.i(i2.f36769a, "MyFitnessPalUserAuthDTO", e4);
                return null;
            }
        }

        @Override // com.google.gson.JsonSerializer
        public final JsonElement serialize(MyFitnessPalUserAuthDTO myFitnessPalUserAuthDTO, Type type, JsonSerializationContext jsonSerializationContext) {
            MyFitnessPalUserAuthDTO myFitnessPalUserAuthDTO2 = myFitnessPalUserAuthDTO;
            myFitnessPalUserAuthDTO2.getClass();
            type.getClass();
            jsonSerializationContext.getClass();
            try {
                return (JsonElement) GsonUtil.f47253b.fromJson(myFitnessPalUserAuthDTO2.h(), JsonElement.class);
            } catch (Exception e4) {
                i2.a.i(i2.f36769a, "MyFitnessPalUserAuthDTO", e4);
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/calories/model/MyFitnessPalUserAuthDTO$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/calories/model/MyFitnessPalUserAuthDTO;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MyFitnessPalUserAuthDTO> {
        @Override // android.os.Parcelable.Creator
        public final MyFitnessPalUserAuthDTO createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new MyFitnessPalUserAuthDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MyFitnessPalUserAuthDTO[] newArray(int i14) {
            return new MyFitnessPalUserAuthDTO[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public MyFitnessPalUserAuthDTO(Parcel parcel) {
        parcel.getClass();
        this.f31234a = 1;
        this.f31234a = parcel.readInt();
        this.f31235b = parcel.readString();
        this.f31236c = parcel.readString();
        this.f31237d = parcel.readInt() == 1;
        this.f31238e = parcel.readInt();
        this.f31239f = parcel.readInt();
    }

    public final boolean C() {
        return this.f31238e == 1;
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
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", this.f31234a);
            jSONObject.put("authorizationDate", this.f31235b);
            jSONObject.put("authorizationCode", this.f31236c);
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, this.f31237d);
            jSONObject.put("linkStatus", this.f31238e);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        jSONObject.getClass();
        if (jSONObject.has("status")) {
            if (jSONObject.isNull("status")) {
                this.f31234a = 0;
            } else {
                this.f31234a = jSONObject.getInt("status");
            }
            this.f31239f++;
        }
        if (jSONObject.has("authorizationDate")) {
            this.f31235b = jSONObject.getString("authorizationDate");
            this.f31239f++;
        }
        if (jSONObject.has("authorizationCode")) {
            this.f31236c = jSONObject.getString("authorizationCode");
            this.f31239f++;
        }
        if (jSONObject.has(AppMeasurementSdk.ConditionalUserProperty.ACTIVE)) {
            this.f31237d = jSONObject.getBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE);
            this.f31239f++;
        }
        if (jSONObject.has("linkStatus")) {
            this.f31238e = jSONObject.getInt("linkStatus");
            this.f31239f++;
        }
    }

    public final String toString() {
        int i14 = this.f31234a;
        String str = this.f31235b;
        String str2 = this.f31236c;
        boolean z14 = this.f31237d;
        int i15 = this.f31238e;
        StringBuilder sbR = g.r(i14, "UserAuth [status=", ", authDate=", str, ", authCode=");
        h.C(str2, ", active=", ", linkStatus=", sbR, z14);
        return j.q(sbR, i15, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f31234a);
        parcel.writeString(this.f31235b);
        parcel.writeString(this.f31236c);
        parcel.writeInt(this.f31237d ? 1 : 0);
        parcel.writeInt(this.f31238e);
        parcel.writeInt(this.f31239f);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calories/model/MyFitnessPalUserAuthDTO$b;", "", "<init>", "()V", "", "IS_LINKED_STATUS_CODE", "I", "", "TAG", "Ljava/lang/String;", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/calories/model/MyFitnessPalUserAuthDTO;", "CREATOR", "Landroid/os/Parcelable$Creator;", "KEY_STATUS", "KEY_AUTH_DATE", "KEY_AUTH_CODE", "KEY_ACTIVE", "KEY_LINK_STATUS", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public MyFitnessPalUserAuthDTO(String str) {
        this.f31234a = 1;
        this.f31236c = str;
    }

    public MyFitnessPalUserAuthDTO(boolean z14) {
        this.f31234a = 1;
        if (z14) {
            this.f31238e = 1;
        }
    }

    public MyFitnessPalUserAuthDTO() {
        this.f31234a = 1;
    }
}
