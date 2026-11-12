package com.garmin.android.apps.connectmobile.leaderboard.model;

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
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@JsonAdapter(AdHocChallengeInviteDTODeserializer.class)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\b\tB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0014\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengeInviteDTO;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "AdHocChallengeInviteDTODeserializer", "b", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AdHocChallengeInviteDTO extends s1 implements Parcelable {
    public static final Parcelable.Creator<AdHocChallengeInviteDTO> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f38003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f38004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f38005c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengeInviteDTO$AdHocChallengeInviteDTODeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengeInviteDTO;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AdHocChallengeInviteDTODeserializer implements JsonDeserializer<AdHocChallengeInviteDTO>, JsonSerializer<AdHocChallengeInviteDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final AdHocChallengeInviteDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            jsonElement.getClass();
            type.getClass();
            jsonDeserializationContext.getClass();
            AdHocChallengeInviteDTO adHocChallengeInviteDTO = new AdHocChallengeInviteDTO();
            try {
                adHocChallengeInviteDTO.k(new JSONObject(jsonElement.toString()));
                return adHocChallengeInviteDTO;
            } catch (JSONException unused) {
                return null;
            }
        }

        @Override // com.google.gson.JsonSerializer
        public final JsonElement serialize(AdHocChallengeInviteDTO adHocChallengeInviteDTO, Type type, JsonSerializationContext jsonSerializationContext) {
            AdHocChallengeInviteDTO adHocChallengeInviteDTO2 = adHocChallengeInviteDTO;
            adHocChallengeInviteDTO2.getClass();
            type.getClass();
            jsonSerializationContext.getClass();
            try {
                return (JsonElement) GsonUtil.f47253b.fromJson(adHocChallengeInviteDTO2.C(), JsonElement.class);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengeInviteDTO$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengeInviteDTO;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdHocChallengeInviteDTO> {
        @Override // android.os.Parcelable.Creator
        public final AdHocChallengeInviteDTO createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new AdHocChallengeInviteDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AdHocChallengeInviteDTO[] newArray(int i14) {
            return new AdHocChallengeInviteDTO[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public AdHocChallengeInviteDTO(Parcel parcel) {
        parcel.getClass();
        this.f38003a = parcel.readString();
        this.f38004b = parcel.readString();
        this.f38005c = parcel.createStringArrayList();
    }

    public final String C() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adHocChallengeUuid", this.f38003a);
        jSONObject.put("invitorId", this.f38004b);
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = this.f38005c;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                ArrayList arrayList2 = this.f38005c;
                arrayList2.getClass();
                jSONArray.put(arrayList2.get(i14));
            }
        }
        jSONObject.put("inviteeIds", jSONArray);
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            this.f38003a = s1.u(jSONObject, "adHocChallengeUuid");
            this.f38004b = s1.u(jSONObject, "invitorId");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("inviteeIds");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                int length = jSONArrayOptJSONArray.length();
                for (int i14 = 0; i14 < length; i14++) {
                    String string = jSONArrayOptJSONArray.getString(i14);
                    string.getClass();
                    arrayList.add(string);
                }
                this.f38005c = arrayList;
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f38003a);
        parcel.writeString(this.f38004b);
        parcel.writeStringList(this.f38005c);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengeInviteDTO$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengeInviteDTO;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "AD_HOC_CHALLENGE_UUID_PK", "Ljava/lang/String;", "INVITOR_ID_PK", "INVITEE_IDS_PK", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public AdHocChallengeInviteDTO() {
    }
}
