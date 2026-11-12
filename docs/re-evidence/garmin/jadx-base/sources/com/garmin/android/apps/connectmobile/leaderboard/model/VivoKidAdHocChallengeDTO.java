package com.garmin.android.apps.connectmobile.leaderboard.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@JsonAdapter(VivoKidAdHocChallengeDTODeserializer.class)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0007\bB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0014\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0002\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/VivoKidAdHocChallengeDTO;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengeDTO;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "VivoKidAdHocChallengeDTODeserializer", "b", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VivoKidAdHocChallengeDTO extends AdHocChallengeDTO {
    public static final Parcelable.Creator<VivoKidAdHocChallengeDTO> CREATOR;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/VivoKidAdHocChallengeDTO$VivoKidAdHocChallengeDTODeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/VivoKidAdHocChallengeDTO;", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class VivoKidAdHocChallengeDTODeserializer implements JsonDeserializer<VivoKidAdHocChallengeDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final VivoKidAdHocChallengeDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            com.nimbusds.jose.shaded.gson.internal.a.p(jsonElement, type, jsonDeserializationContext);
            try {
                VivoKidAdHocChallengeDTO vivoKidAdHocChallengeDTO = new VivoKidAdHocChallengeDTO();
                vivoKidAdHocChallengeDTO.k(new JSONObject(jsonElement.toString()));
                return vivoKidAdHocChallengeDTO;
            } catch (JSONException e4) {
                i2.a.c(i2.f36769a, "VivoKidAdHocChallengeDTO", "Error deserializing json " + e4);
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/model/VivoKidAdHocChallengeDTO$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/VivoKidAdHocChallengeDTO;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VivoKidAdHocChallengeDTO> {
        @Override // android.os.Parcelable.Creator
        public final VivoKidAdHocChallengeDTO createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new VivoKidAdHocChallengeDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final VivoKidAdHocChallengeDTO[] newArray(int i14) {
            return new VivoKidAdHocChallengeDTO[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VivoKidAdHocChallengeDTO(Parcel parcel) {
        super(parcel);
        parcel.getClass();
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengeDTO, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengeDTO, com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            super.k(jSONObject);
            this.f37990d = s1.u(jSONObject, "challengeName");
            this.f37991e = s1.u(jSONObject, "challengeDesc");
            this.f37992f = s1.u(jSONObject, "ownerUserProfileId");
            if (jSONObject.has("user") && !jSONObject.isNull("user")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("user");
                VivoKidAdHocChallengePlayerDTO vivoKidAdHocChallengePlayerDTO = new VivoKidAdHocChallengePlayerDTO();
                vivoKidAdHocChallengePlayerDTO.k(jSONObject2);
                this.f37998l = vivoKidAdHocChallengePlayerDTO;
            }
            VivoKidAdHocChallengePlayerDTO.b bVar = VivoKidAdHocChallengePlayerDTO.f38049q;
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("players");
            bVar.getClass();
            this.f38001o = VivoKidAdHocChallengePlayerDTO.b.a(jSONArrayOptJSONArray);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/VivoKidAdHocChallengeDTO$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "AD_HOC_CHALLENGE_NAME_PK", "AD_HOC_CHALLENGE_DESC_PK", "OWNER_USER_PROFILE_ID_PK", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/VivoKidAdHocChallengeDTO;", "CREATOR", "Landroid/os/Parcelable$Creator;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public VivoKidAdHocChallengeDTO() {
    }
}
