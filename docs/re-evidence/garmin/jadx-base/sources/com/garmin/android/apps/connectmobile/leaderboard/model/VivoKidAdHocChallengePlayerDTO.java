package com.garmin.android.apps.connectmobile.leaderboard.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@JsonAdapter(VivoKidAdHocChallengePlayerDTODeserializer.class)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0007\bB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/VivoKidAdHocChallengePlayerDTO;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengePlayerDTO;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "VivoKidAdHocChallengePlayerDTODeserializer", "b", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VivoKidAdHocChallengePlayerDTO extends AdHocChallengePlayerDTO {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f38050p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f38049q = new b(null);
    public static final Parcelable.Creator<VivoKidAdHocChallengePlayerDTO> CREATOR = new a();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/VivoKidAdHocChallengePlayerDTO$VivoKidAdHocChallengePlayerDTODeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/VivoKidAdHocChallengePlayerDTO;", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class VivoKidAdHocChallengePlayerDTODeserializer implements JsonDeserializer<VivoKidAdHocChallengePlayerDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final VivoKidAdHocChallengePlayerDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            com.nimbusds.jose.shaded.gson.internal.a.p(jsonElement, type, jsonDeserializationContext);
            try {
                VivoKidAdHocChallengePlayerDTO vivoKidAdHocChallengePlayerDTO = new VivoKidAdHocChallengePlayerDTO();
                vivoKidAdHocChallengePlayerDTO.k(new JSONObject(jsonElement.toString()));
                return vivoKidAdHocChallengePlayerDTO;
            } catch (JSONException unused) {
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/model/VivoKidAdHocChallengePlayerDTO$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/VivoKidAdHocChallengePlayerDTO;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VivoKidAdHocChallengePlayerDTO> {
        @Override // android.os.Parcelable.Creator
        public final VivoKidAdHocChallengePlayerDTO createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new VivoKidAdHocChallengePlayerDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final VivoKidAdHocChallengePlayerDTO[] newArray(int i14) {
            return new VivoKidAdHocChallengePlayerDTO[i14];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VivoKidAdHocChallengePlayerDTO(Parcel parcel) {
        super(parcel);
        parcel.getClass();
        this.f38050p = parcel.readInt();
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengePlayerDTO, com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            super.k(jSONObject);
            this.f38050p = jSONObject.optInt("avatarId", -1);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengePlayerDTO, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        super.writeToParcel(parcel, i14);
        parcel.writeInt(this.f38050p);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/VivoKidAdHocChallengePlayerDTO$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/VivoKidAdHocChallengePlayerDTO;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "AVATAR_ID", "Ljava/lang/String;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static ArrayList a(JSONArray jSONArray) throws JSONException {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i14 = 0; i14 < length; i14++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i14);
                    VivoKidAdHocChallengePlayerDTO vivoKidAdHocChallengePlayerDTO = new VivoKidAdHocChallengePlayerDTO();
                    vivoKidAdHocChallengePlayerDTO.k(jSONObject);
                    arrayList.add(vivoKidAdHocChallengePlayerDTO);
                }
            }
            return arrayList;
        }

        private b() {
        }
    }

    public VivoKidAdHocChallengePlayerDTO() {
    }
}
