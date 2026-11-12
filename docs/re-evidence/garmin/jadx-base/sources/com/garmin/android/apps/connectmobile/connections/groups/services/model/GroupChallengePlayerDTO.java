package com.garmin.android.apps.connectmobile.connections.groups.services.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@JsonAdapter(GroupChallengePlayerDTODeserializer.class)
public class GroupChallengePlayerDTO extends s1 implements Parcelable {
    public static final Parcelable.Creator<GroupChallengePlayerDTO> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f31537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f31538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f31539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f31540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f31541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f31542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f31543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f31544h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f31545i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f31546j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public double f31547k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b12.b f31548l = b12.b.f14386g;

    public static class GroupChallengePlayerDTODeserializer implements JsonDeserializer<GroupChallengePlayerDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final GroupChallengePlayerDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            try {
                GroupChallengePlayerDTO groupChallengePlayerDTO = new GroupChallengePlayerDTO();
                groupChallengePlayerDTO.k(new JSONObject(jsonElement.toString()));
                return groupChallengePlayerDTO;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public class a implements Parcelable.Creator<GroupChallengePlayerDTO> {
        @Override // android.os.Parcelable.Creator
        public final GroupChallengePlayerDTO createFromParcel(Parcel parcel) {
            return new GroupChallengePlayerDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupChallengePlayerDTO[] newArray(int i14) {
            return new GroupChallengePlayerDTO[i14];
        }
    }

    public GroupChallengePlayerDTO(Parcel parcel) {
        this.f31537a = parcel.readString();
        this.f31538b = parcel.readString();
        this.f31539c = parcel.readString();
        this.f31540d = parcel.readString();
        this.f31541e = parcel.readString();
        this.f31547k = parcel.readDouble();
        this.f31542f = parcel.readDouble();
        this.f31543g = parcel.readString();
        this.f31544h = parcel.readInt();
        this.f31545i = parcel.readInt();
        this.f31546j = parcel.readInt() == 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f31537a = s1.u(jSONObject, "userProfileId");
            this.f31538b = s1.u(jSONObject, "fullName");
            this.f31539c = s1.u(jSONObject, "displayName");
            this.f31540d = s1.u(jSONObject, "profileImageSmall");
            this.f31541e = s1.u(jSONObject, "profileImageMedium");
            this.f31547k = jSONObject.optDouble("todayNumber");
            this.f31542f = jSONObject.optDouble("totalNumber");
            this.f31543g = s1.u(jSONObject, "lastSyncTime");
            this.f31544h = jSONObject.optInt("ranking");
            this.f31545i = jSONObject.optInt("userIndex");
            this.f31546j = jSONObject.optInt("isProUser") == 1;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f31537a);
        parcel.writeString(this.f31538b);
        parcel.writeString(this.f31539c);
        parcel.writeString(this.f31540d);
        parcel.writeString(this.f31541e);
        parcel.writeDouble(this.f31547k);
        parcel.writeDouble(this.f31542f);
        parcel.writeString(this.f31543g);
        parcel.writeInt(this.f31544h);
        parcel.writeInt(this.f31545i);
        parcel.writeInt(this.f31546j ? 1 : 0);
    }

    public GroupChallengePlayerDTO() {
    }
}
