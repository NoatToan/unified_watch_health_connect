package com.garmin.android.apps.connectmobile.leaderboard.model;

import com.garmin.android.apps.connectmobile.s1;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@JsonAdapter(SocialChallengeDeserializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/SocialChallengeDTO;", "Lcom/garmin/android/apps/connectmobile/s1;", "<init>", "()V", "SocialChallengeDeserializer", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SocialChallengeDTO extends s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f38042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f38043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f38044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f38045g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f38047i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f38046h = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f38048j = new ArrayList();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/SocialChallengeDTO$SocialChallengeDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/SocialChallengeDTO;", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SocialChallengeDeserializer implements JsonDeserializer<SocialChallengeDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final SocialChallengeDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            com.nimbusds.jose.shaded.gson.internal.a.p(jsonElement, type, jsonDeserializationContext);
            try {
                SocialChallengeDTO socialChallengeDTO = new SocialChallengeDTO();
                socialChallengeDTO.k(new JSONObject(jsonElement.toString()));
                return socialChallengeDTO;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static {
        new a(null);
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f38039a = jSONObject.optInt("socialChallengeType", -1);
            this.f38040b = jSONObject.optInt("socialChallengeStatusId", -1);
            this.f38041c = jSONObject.optInt("socialChallengeActivityTypeId", -1);
            this.f38042d = s1.u(jSONObject, "challengeName");
            this.f38043e = s1.u(jSONObject, "uuid");
            this.f38044f = s1.u(jSONObject, "startDate");
            this.f38045g = s1.u(jSONObject, "endDate");
            this.f38047i = jSONObject.optInt("currentPlayerType", -1);
            VivoKidAdHocChallengePlayerDTO.b bVar = VivoKidAdHocChallengePlayerDTO.f38049q;
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("players");
            bVar.getClass();
            this.f38048j = VivoKidAdHocChallengePlayerDTO.b.a(jSONArrayOptJSONArray);
            ArrayList arrayList = this.f38046h;
            arrayList.clear();
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("teams");
            if (jSONArrayOptJSONArray2 != null) {
                int length = jSONArrayOptJSONArray2.length();
                for (int i14 = 0; i14 < length; i14++) {
                    arrayList.add((j0) GsonUtil.f47253b.fromJson(jSONArrayOptJSONArray2.getJSONObject(i14).toString(), j0.class));
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/SocialChallengeDTO$a;", "", "<init>", "()V", "", "SOCIAL_CHALLENGE_TYPE_PK", "Ljava/lang/String;", "SOCIAL_CHALLENGE_STATUS_ID_PK", "SOCIAL_CHALLENGE_ACTIVITY_TYPE_ID_PK", "CHALLENGE_NAME_PK", "CHALLENGE_UUID_PK", "CHALLENGE_START_DATE", "CHALLENGE_END_DATE", "CHALLENGE_TEAM_LIST", "PLAYERS_PK", "CURRENT_PLAYER_TYPE", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
