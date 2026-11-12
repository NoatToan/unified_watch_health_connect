package com.garmin.android.apps.connectmobile.leaderboard.model;

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
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@JsonAdapter(AdHocChallengeDeserializer.class)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\b\tB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0014\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengeDTO;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "AdHocChallengeDeserializer", "b", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class AdHocChallengeDTO extends s1 implements Parcelable {
    public static final Parcelable.Creator<AdHocChallengeDTO> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f37990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f37991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f37992f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f37993g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f37994h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f37995i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f37996j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f37997k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AdHocChallengePlayerDTO f37998l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f37999m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f38000n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<? extends AdHocChallengePlayerDTO> f38001o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f38002p;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengeDTO$AdHocChallengeDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengeDTO;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AdHocChallengeDeserializer implements JsonDeserializer<AdHocChallengeDTO>, JsonSerializer<AdHocChallengeDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final AdHocChallengeDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            com.nimbusds.jose.shaded.gson.internal.a.p(jsonElement, type, jsonDeserializationContext);
            try {
                AdHocChallengeDTO adHocChallengeDTO = new AdHocChallengeDTO();
                adHocChallengeDTO.k(new JSONObject(jsonElement.toString()));
                return adHocChallengeDTO;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // com.google.gson.JsonSerializer
        public final JsonElement serialize(AdHocChallengeDTO adHocChallengeDTO, Type type, JsonSerializationContext jsonSerializationContext) {
            AdHocChallengeDTO adHocChallengeDTO2 = adHocChallengeDTO;
            adHocChallengeDTO2.getClass();
            type.getClass();
            jsonSerializationContext.getClass();
            try {
                return (JsonElement) GsonUtil.f47253b.fromJson(adHocChallengeDTO2.D(), JsonElement.class);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengeDTO$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengeDTO;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdHocChallengeDTO> {
        @Override // android.os.Parcelable.Creator
        public final AdHocChallengeDTO createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new AdHocChallengeDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AdHocChallengeDTO[] newArray(int i14) {
            return new AdHocChallengeDTO[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public AdHocChallengeDTO(Parcel parcel) {
        parcel.getClass();
        this.f37996j = -1;
        List<? extends AdHocChallengePlayerDTO> list = p13.j0.f134944a;
        this.f38001o = list;
        this.f37987a = parcel.readInt();
        this.f37988b = parcel.readInt();
        this.f37989c = parcel.readInt();
        this.f37990d = parcel.readString();
        this.f37991e = parcel.readString();
        this.f37992f = parcel.readString();
        this.f37993g = parcel.readString();
        this.f37994h = parcel.readString();
        this.f37995i = parcel.readString();
        this.f37996j = parcel.readInt();
        this.f37997k = parcel.readLong();
        this.f37998l = (AdHocChallengePlayerDTO) parcel.readParcelable(getClass().getClassLoader());
        this.f37999m = parcel.readInt();
        this.f38000n = parcel.readInt();
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(AdHocChallengePlayerDTO.CREATOR);
        this.f38001o = arrayListCreateTypedArrayList != null ? arrayListCreateTypedArrayList : list;
        this.f38002p = parcel.createTypedArrayList(com.garmin.android.apps.connectmobile.leaderboard.model.b.CREATOR);
    }

    public final v C() {
        v.a aVar = v.f38356b;
        Integer numValueOf = Integer.valueOf(this.f37988b);
        aVar.getClass();
        return v.a.a(numValueOf);
    }

    public final String D() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("socialChallengeType", this.f37987a);
            jSONObject.put("socialChallengeStatusId", this.f37988b);
            jSONObject.put("socialChallengeActivityTypeId", this.f37989c);
            jSONObject.put("adHocChallengeName", this.f37990d);
            jSONObject.put("adHocChallengeDesc", this.f37991e);
            jSONObject.put("ownerUserProfileId", this.f37992f);
            jSONObject.put("uuid", this.f37993g);
            jSONObject.put("startDate", this.f37994h);
            jSONObject.put("endDate", this.f37995i);
            jSONObject.put("durationTypeId", this.f37996j);
            jSONObject.put("userRanking", this.f37997k);
            JSONArray jSONArray = new JSONArray();
            int size = this.f38001o.size();
            for (int i14 = 0; i14 < size; i14++) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("userProfileId", this.f38001o.get(i14).f38007a);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("players", jSONArray);
            if (this.f38002p != null) {
                JSONArray jSONArray2 = new JSONArray();
                ArrayList arrayList = this.f38002p;
                arrayList.getClass();
                int size2 = arrayList.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    ArrayList arrayList2 = this.f38002p;
                    arrayList2.getClass();
                    jSONArray2.put(((com.garmin.android.apps.connectmobile.leaderboard.model.b) arrayList2.get(i15)).D());
                }
                jSONObject.put("alternateChallengeAwards", jSONArray2);
            }
        } catch (JSONException e4) {
            i2.a aVar = i2.f36769a;
            aVar.getClass();
            i2.a.b(a2.CHALLENGES, "AdHocChallengeDTO", "Error while converting to JSON object: " + e4);
        }
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public void k(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            this.f37987a = jSONObject.optInt("socialChallengeType");
            this.f37988b = jSONObject.optInt("socialChallengeStatusId");
            this.f37989c = jSONObject.optInt("socialChallengeActivityTypeId");
            this.f37990d = s1.u(jSONObject, "adHocChallengeName");
            this.f37991e = s1.u(jSONObject, "adHocChallengeDesc");
            this.f37992f = s1.u(jSONObject, "ownerUserProfileId");
            this.f37993g = s1.u(jSONObject, "uuid");
            this.f37994h = s1.u(jSONObject, "startDate");
            this.f37995i = s1.u(jSONObject, "endDate");
            this.f37996j = jSONObject.optInt("durationTypeId");
            this.f37997k = jSONObject.optLong("userRanking");
            this.f37999m = jSONObject.optInt("playerCount");
            this.f38000n = jSONObject.optInt("inviteeCount");
            if (jSONObject.has("user") && !jSONObject.isNull("user")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("user");
                AdHocChallengePlayerDTO adHocChallengePlayerDTO = new AdHocChallengePlayerDTO();
                this.f37998l = adHocChallengePlayerDTO;
                adHocChallengePlayerDTO.k(jSONObject2);
            }
            AdHocChallengePlayerDTO.b bVar = AdHocChallengePlayerDTO.f38006o;
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("players");
            bVar.getClass();
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i14 = 0; i14 < length; i14++) {
                    JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i14);
                    AdHocChallengePlayerDTO adHocChallengePlayerDTO2 = new AdHocChallengePlayerDTO();
                    adHocChallengePlayerDTO2.k(jSONObject3);
                    arrayList.add(adHocChallengePlayerDTO2);
                }
            }
            this.f38001o = arrayList;
            com.garmin.android.apps.connectmobile.leaderboard.model.b.C0675b c0675b = com.garmin.android.apps.connectmobile.leaderboard.model.b.f38076f;
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("alternateChallengeAwards");
            c0675b.getClass();
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray2 != null) {
                int length2 = jSONArrayOptJSONArray2.length();
                for (int i15 = 0; i15 < length2; i15++) {
                    JSONObject jSONObject4 = jSONArrayOptJSONArray2.getJSONObject(i15);
                    com.garmin.android.apps.connectmobile.leaderboard.model.b bVar2 = new com.garmin.android.apps.connectmobile.leaderboard.model.b();
                    bVar2.k(jSONObject4);
                    arrayList2.add(bVar2);
                }
            }
            this.f38002p = arrayList2;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f37987a);
        parcel.writeInt(this.f37988b);
        parcel.writeInt(this.f37989c);
        parcel.writeString(this.f37990d);
        parcel.writeString(this.f37991e);
        parcel.writeString(this.f37992f);
        parcel.writeString(this.f37993g);
        parcel.writeString(this.f37994h);
        parcel.writeString(this.f37995i);
        parcel.writeInt(this.f37996j);
        parcel.writeLong(this.f37997k);
        parcel.writeParcelable(this.f37998l, 0);
        parcel.writeInt(this.f37999m);
        parcel.writeInt(this.f38000n);
        parcel.writeTypedList(this.f38001o);
        parcel.writeTypedList(this.f38002p);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\nR\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u0014\u0010\u0018\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\nR\u0014\u0010\u0019\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengeDTO$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengeDTO;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "SOCIAL_CHALLENGE_TYPE_PK", "Ljava/lang/String;", "SOCIAL_CHALLENGE_STATUS_ID_PK", "SOCIAL_CHALLENGE_ACTIVITY_TYPE_ID_PK", "AD_HOC_CHALLENGE_NAME_PK", "AD_HOC_CHALLENGE_DESC_PK", "OWNER_USER_PROFILE_ID_PK", "UUID_PK", "START_DATE_PK", "END_DATE_PK", "DURATION_TYPE_ID_PK", "USER_RANKING_PK", "CURRENT_USER_PK", "PARTICIPANTS_COUNT_PK", "INVITE_COUNT_PK", "PLAYERS_PK", "ALTERNATE_CHALLENGE_AWARDS_PK", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public AdHocChallengeDTO() {
        this.f37996j = -1;
        this.f38001o = p13.j0.f134944a;
    }
}
