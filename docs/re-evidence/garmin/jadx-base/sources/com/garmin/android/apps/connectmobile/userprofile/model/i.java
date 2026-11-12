package com.garmin.android.apps.connectmobile.userprofile.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/model/i;", "Landroid/os/Parcelable;", "", "profileImageUrlLarge", "profileImageUrlMedium", "profileImageUrlSmall", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lorg/json/JSONObject;", "json", "(Lorg/json/JSONObject;)V", "Lcom/google/gson/JsonObject;", "(Lcom/google/gson/JsonObject;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "getProfileImageUrlMedium", "c", "getProfileImageUrlSmall", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrlLarge")
    private final String profileImageUrlLarge;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrlMedium")
    private final String profileImageUrlMedium;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrlSmall")
    private final String profileImageUrlSmall;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new i(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i(JsonObject jsonObject) {
        jsonObject.getClass();
        JsonElement jsonElementH = jg.b.H(jsonObject, "profileImageUrlLarge");
        String asString = jsonElementH != null ? jsonElementH.getAsString() : null;
        JsonElement jsonElementH2 = jg.b.H(jsonObject, "profileImageUrlMedium");
        String asString2 = jsonElementH2 != null ? jsonElementH2.getAsString() : null;
        JsonElement jsonElementH3 = jg.b.H(jsonObject, "profileImageUrlSmall");
        this(asString, asString2, jsonElementH3 != null ? jsonElementH3.getAsString() : null);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getProfileImageUrlLarge() {
        return this.profileImageUrlLarge;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return s.g(this.profileImageUrlLarge, iVar.profileImageUrlLarge) && s.g(this.profileImageUrlMedium, iVar.profileImageUrlMedium) && s.g(this.profileImageUrlSmall, iVar.profileImageUrlSmall);
    }

    public final int hashCode() {
        String str = this.profileImageUrlLarge;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.profileImageUrlMedium;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.profileImageUrlSmall;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return am.j.o(this.profileImageUrlSmall, ")", p6.b.i("ProfileImageUrlDTO(profileImageUrlLarge=", this.profileImageUrlLarge, ", profileImageUrlMedium=", this.profileImageUrlMedium, ", profileImageUrlSmall="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.profileImageUrlLarge);
        parcel.writeString(this.profileImageUrlMedium);
        parcel.writeString(this.profileImageUrlSmall);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(JSONObject jSONObject) {
        this(jSONObject.optString("profileImageUrlLarge"), jSONObject.optString("profileImageUrlMedium"), jSONObject.optString("profileImageUrlSmall"));
        jSONObject.getClass();
    }

    public i(String str, String str2, String str3) {
        this.profileImageUrlLarge = str;
        this.profileImageUrlMedium = str2;
        this.profileImageUrlSmall = str3;
    }
}
