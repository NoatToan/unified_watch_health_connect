package com.garmin.android.apps.connectmobile.leaderboard.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@JsonAdapter(AdHocChallengePlayerDTODeserializer.class)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u000b\fB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0013\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0003\u0010\u0007B\u0011\b\u0014\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0003\u0010\n¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengePlayerDTO;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "", "userProfileId", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "AdHocChallengePlayerDTODeserializer", "b", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class AdHocChallengePlayerDTO extends s1 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f38007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f38008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f38009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f38010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f38011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f38012f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f38013g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f38014h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f38015i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public double f38016j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f38017k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Boolean f38018l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b12.b f38019m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b12.b f38020n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f38006o = new b(null);
    public static final Parcelable.Creator<AdHocChallengePlayerDTO> CREATOR = new a();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengePlayerDTO$AdHocChallengePlayerDTODeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengePlayerDTO;", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AdHocChallengePlayerDTODeserializer implements JsonDeserializer<AdHocChallengePlayerDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final AdHocChallengePlayerDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            jsonElement.getClass();
            type.getClass();
            jsonDeserializationContext.getClass();
            AdHocChallengePlayerDTO adHocChallengePlayerDTO = new AdHocChallengePlayerDTO();
            try {
                adHocChallengePlayerDTO.k(new JSONObject(jsonElement.toString()));
                return adHocChallengePlayerDTO;
            } catch (JSONException unused) {
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengePlayerDTO$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengePlayerDTO;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdHocChallengePlayerDTO> {
        @Override // android.os.Parcelable.Creator
        public final AdHocChallengePlayerDTO createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new AdHocChallengePlayerDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AdHocChallengePlayerDTO[] newArray(int i14) {
            return new AdHocChallengePlayerDTO[i14];
        }
    }

    public AdHocChallengePlayerDTO(Parcel parcel) {
        parcel.getClass();
        b12.b bVar = b12.b.f14386g;
        this.f38019m = bVar;
        this.f38020n = bVar;
        this.f38007a = parcel.readString();
        this.f38008b = parcel.readDouble();
        this.f38009c = parcel.readString();
        this.f38010d = parcel.readLong();
        this.f38011e = parcel.readString();
        this.f38012f = parcel.readString();
        this.f38013g = parcel.readString();
        this.f38014h = parcel.readString();
        this.f38015i = parcel.readByte() != 0;
        this.f38016j = parcel.readDouble();
        this.f38017k = parcel.readByte() == 1;
        this.f38018l = Boolean.valueOf(parcel.readByte() == 1);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f38007a = jSONObject.optString("userProfileId");
            this.f38008b = jSONObject.optDouble("totalNumber");
            this.f38009c = s1.u(jSONObject, "lastSyncTime");
            this.f38010d = jSONObject.optInt("ranking");
            this.f38011e = s1.u(jSONObject, "profileImageSmall");
            this.f38012f = s1.u(jSONObject, "profileImageMedium");
            this.f38013g = s1.u(jSONObject, "fullName");
            this.f38014h = s1.u(jSONObject, "displayName");
            this.f38015i = jSONObject.optBoolean("isProUser");
            this.f38016j = jSONObject.optDouble("todayNumber");
            this.f38017k = jSONObject.optBoolean("isAcceptedChallenge");
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f38007a);
        parcel.writeDouble(this.f38008b);
        parcel.writeString(this.f38009c);
        parcel.writeLong(this.f38010d);
        parcel.writeString(this.f38011e);
        parcel.writeString(this.f38012f);
        parcel.writeString(this.f38013g);
        parcel.writeString(this.f38014h);
        parcel.writeByte(this.f38015i ? (byte) 1 : (byte) 0);
        parcel.writeDouble(this.f38016j);
        parcel.writeByte(this.f38017k ? (byte) 1 : (byte) 0);
        parcel.writeByte(p005kotlin.jvm.internal.s.g(this.f38018l, Boolean.TRUE) ? (byte) 1 : (byte) 0);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengePlayerDTO$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengePlayerDTO;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "TAG", "Ljava/lang/String;", "USER_PROFILE_ID_PK", "TOTAL_NUMBER_PK", "LAST_SYNC_TIME_PK", "RANKING_PK", "PROFILE_IMAGE_SMALL_PK", "PROFILE_IMAGE_MEDIUM_PK", "FULL_NAME_PK", "DISPLAY_NAME_PK", "IS_PRO_USER_PK", "TODAY_NUMBER_PK", "IS_ACCEPTED_CHALLENGE_PK", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public AdHocChallengePlayerDTO(String str) {
        b12.b bVar = b12.b.f14386g;
        this.f38019m = bVar;
        this.f38020n = bVar;
        this.f38007a = str;
    }

    public AdHocChallengePlayerDTO() {
        b12.b bVar = b12.b.f14386g;
        this.f38019m = bVar;
        this.f38020n = bVar;
    }
}
