package com.garmin.android.apps.connectmobile.connections.groups.services.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@JsonAdapter(GroupAnnouncementDeserializer.class)
public class GroupAnnouncementDTO extends s1 implements Parcelable {
    public static final Parcelable.Creator<GroupAnnouncementDTO> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f31502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f31503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f31504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f31505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f31506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f31507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f31508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f31509h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f31510i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f f31511j;

    public static class GroupAnnouncementDeserializer implements JsonDeserializer<GroupAnnouncementDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final GroupAnnouncementDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            try {
                GroupAnnouncementDTO groupAnnouncementDTO = new GroupAnnouncementDTO();
                groupAnnouncementDTO.k(new JSONObject(jsonElement.toString()));
                return groupAnnouncementDTO;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public class a implements Parcelable.Creator<GroupAnnouncementDTO> {
        @Override // android.os.Parcelable.Creator
        public final GroupAnnouncementDTO createFromParcel(Parcel parcel) {
            return new GroupAnnouncementDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupAnnouncementDTO[] newArray(int i14) {
            return new GroupAnnouncementDTO[i14];
        }
    }

    public GroupAnnouncementDTO(Parcel parcel) {
        this.f31502a = parcel.readString();
        this.f31503b = parcel.readString();
        this.f31504c = parcel.readString();
        this.f31505d = parcel.readString();
        this.f31506e = parcel.readLong();
        this.f31507f = parcel.readLong();
        this.f31508g = parcel.readLong();
        this.f31509h = parcel.readString();
        this.f31510i = parcel.readString();
        C((String) parcel.readValue(String.class.getClassLoader()));
    }

    public final void C(String str) {
        try {
            if (str != null) {
                this.f31511j = f.valueOf(str);
            } else {
                this.f31511j = null;
            }
        } catch (Exception unused) {
            this.f31511j = null;
            i2.h("Unsupported group role type: " + str);
        }
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
        GroupAnnouncementDTO groupAnnouncementDTO = (GroupAnnouncementDTO) obj;
        if (Objects.equals(this.f31502a, groupAnnouncementDTO.f31502a) && Objects.equals(this.f31503b, groupAnnouncementDTO.f31503b) && Objects.equals(this.f31504c, groupAnnouncementDTO.f31504c) && Objects.equals(this.f31505d, groupAnnouncementDTO.f31505d) && this.f31506e == groupAnnouncementDTO.f31506e && this.f31507f == groupAnnouncementDTO.f31507f && this.f31508g == groupAnnouncementDTO.f31508g && Objects.equals(this.f31509h, groupAnnouncementDTO.f31509h) && Objects.equals(this.f31510i, groupAnnouncementDTO.f31510i)) {
            return Objects.equals(this.f31511j, groupAnnouncementDTO.f31511j);
        }
        return false;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f31502a = s1.u(jSONObject, "announcementId");
            this.f31503b = s1.u(jSONObject, "groupId");
            this.f31504c = s1.u(jSONObject, "title");
            this.f31505d = s1.u(jSONObject, "message");
            this.f31506e = jSONObject.optLong("expireDate");
            this.f31507f = jSONObject.optLong("announcementDate");
            this.f31508g = jSONObject.optLong("userProfileId");
            this.f31509h = s1.u(jSONObject, "fullName");
            this.f31510i = jSONObject.optString("profileImageMedium");
            C(jSONObject.optString("groupRole"));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f31502a);
        parcel.writeString(this.f31503b);
        parcel.writeString(this.f31504c);
        parcel.writeString(this.f31505d);
        parcel.writeLong(this.f31506e);
        parcel.writeLong(this.f31507f);
        parcel.writeLong(this.f31508g);
        parcel.writeString(this.f31509h);
        parcel.writeString(this.f31510i);
        f fVar = this.f31511j;
        parcel.writeValue(fVar != null ? fVar.name() : null);
    }

    public GroupAnnouncementDTO() {
    }
}
