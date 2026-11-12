package com.garmin.android.apps.connectmobile.leaderboard.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/i;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "b", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f38189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f[] f38190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f38187d = new b(null);
    public static final Parcelable.Creator<i> CREATOR = new a();

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/model/i$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/i;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    public i(Parcel parcel) {
        parcel.getClass();
        ClassLoader classLoader = i.class.getClassLoader();
        this.f38188a = parcel.readInt();
        this.f38189b = parcel.readString();
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        if (parcelableArray != null) {
            this.f38190c = (f[]) Arrays.copyOf(parcelableArray, parcelableArray.length, f[].class);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return am.j.o(Arrays.toString(this.f38190c), "]", wr.g.r(this.f38188a, "AutoChallengeListDTO [reasonCode=", ", reasonMessage=", this.f38189b, ", challenges="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f38188a);
        parcel.writeString(this.f38189b);
        parcel.writeParcelableArray(this.f38190c, 0);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/i$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/i;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "EXTRA_CHALLENGE_LIST_DATA", "Ljava/lang/String;", "REASON_CODE", "REASON_MESSAGE", "CHALLENGE_DTOS", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static i a(JSONObject jSONObject) throws JSONException {
            JSONArray jSONArray;
            int i14;
            int i15;
            int i16;
            i iVar = new i();
            if (!jSONObject.isNull("reasonCode")) {
                iVar.f38188a = jSONObject.getInt("reasonCode");
            }
            if (!jSONObject.isNull("reasonMessage")) {
                iVar.f38189b = jSONObject.getString("reasonMessage");
            }
            if (!jSONObject.isNull("challengeDTOs")) {
                f.b bVar = f.f38135l;
                JSONArray jSONArray2 = jSONObject.getJSONArray("challengeDTOs");
                jSONArray2.getClass();
                bVar.getClass();
                f[] fVarArr = new f[jSONArray2.length()];
                int length = jSONArray2.length();
                int i17 = 0;
                while (i17 < length) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i17);
                    jSONObject2.getClass();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
                    f fVar = new f();
                    if (!jSONObject2.isNull("challengeId")) {
                        fVar.f38136a = jSONObject2.getString("challengeId");
                    }
                    if (!jSONObject2.isNull("challengeTimezoneDTO")) {
                        l.b bVar2 = l.f38231e;
                        JSONObject jSONObject3 = jSONObject2.getJSONObject("challengeTimezoneDTO");
                        jSONObject3.getClass();
                        bVar2.getClass();
                        l lVar = new l();
                        if (!jSONObject3.isNull(TtmlNode.ATTR_ID)) {
                            lVar.f38232a = jSONObject3.getString(TtmlNode.ATTR_ID);
                        }
                        if (!jSONObject3.isNull(Action.KEY_ATTRIBUTE)) {
                            lVar.f38233b = jSONObject3.getString(Action.KEY_ATTRIBUTE);
                        }
                        if (!jSONObject3.isNull("gmtOffset")) {
                            lVar.f38234c = jSONObject3.getDouble("gmtOffset");
                        }
                        if (!jSONObject3.isNull("dstOffset")) {
                            lVar.f38235d = jSONObject3.getDouble("dstOffset");
                        }
                        fVar.f38137b = lVar;
                    }
                    if (!jSONObject2.isNull("challengeTypeDTO")) {
                        m.b bVar3 = m.f38236b;
                        JSONObject jSONObject4 = jSONObject2.getJSONObject("challengeTypeDTO");
                        jSONObject4.getClass();
                        bVar3.getClass();
                        m mVar = new m();
                        if (!jSONObject4.isNull(Action.KEY_ATTRIBUTE)) {
                            mVar.f38237a = jSONObject4.getString(Action.KEY_ATTRIBUTE);
                        }
                        fVar.f38138c = mVar;
                    }
                    if (!jSONObject2.isNull("challengeLevelDTO")) {
                        h.b bVar4 = h.f38168g;
                        JSONObject jSONObject5 = jSONObject2.getJSONObject("challengeLevelDTO");
                        jSONObject5.getClass();
                        bVar4.getClass();
                        h hVar = new h();
                        if (!jSONObject5.isNull(TtmlNode.ATTR_ID)) {
                            hVar.f38169a = jSONObject5.getString(TtmlNode.ATTR_ID);
                        }
                        if (!jSONObject5.isNull(Action.KEY_ATTRIBUTE)) {
                            hVar.f38170b = jSONObject5.getString(Action.KEY_ATTRIBUTE);
                        }
                        if (!jSONObject5.isNull("expectedStepCount")) {
                            hVar.f38171c = jSONObject5.getInt("expectedStepCount");
                        }
                        if (!jSONObject5.isNull("minimumStepCount")) {
                            hVar.f38172d = jSONObject5.getInt("minimumStepCount");
                        }
                        if (!jSONObject5.isNull("maximumStepCount")) {
                            hVar.f38173e = jSONObject5.getInt("maximumStepCount");
                        }
                        if (!jSONObject5.isNull("activityLevel")) {
                            hVar.f38174f = jSONObject5.getInt("activityLevel");
                        }
                        fVar.f38139d = hVar;
                    }
                    if (!jSONObject2.isNull("formatLocaleDTO")) {
                        g.b bVar5 = g.f38158d;
                        JSONObject jSONObject6 = jSONObject2.getJSONObject("formatLocaleDTO");
                        jSONObject6.getClass();
                        bVar5.getClass();
                        g gVar = new g();
                        if (!jSONObject6.isNull(TtmlNode.ATTR_ID)) {
                            gVar.f38159a = jSONObject6.getString(TtmlNode.ATTR_ID);
                        }
                        if (!jSONObject6.isNull(Action.KEY_ATTRIBUTE)) {
                            gVar.f38160b = jSONObject6.getString(Action.KEY_ATTRIBUTE);
                        }
                        if (!jSONObject6.isNull("supported")) {
                            gVar.f38161c = jSONObject6.getBoolean("supported");
                        }
                        fVar.f38140e = gVar;
                    }
                    if (!jSONObject2.isNull("startTimeInTimezone")) {
                        fVar.f38141f = simpleDateFormat.parse(jSONObject2.getString("startTimeInTimezone"));
                    }
                    if (!jSONObject2.isNull("endTimeInTimezone")) {
                        fVar.f38142g = simpleDateFormat.parse(jSONObject2.getString("endTimeInTimezone"));
                    }
                    if (!jSONObject2.isNull("evalTimeInTimezone")) {
                        fVar.f38143h = simpleDateFormat.parse(jSONObject2.getString("evalTimeInTimezone"));
                    }
                    if (!jSONObject2.isNull("challengeStatusDTO")) {
                        k.b bVar6 = k.f38227c;
                        JSONObject jSONObject7 = jSONObject2.getJSONObject("challengeStatusDTO");
                        jSONObject7.getClass();
                        bVar6.getClass();
                        k kVar = new k();
                        if (!jSONObject7.isNull(TtmlNode.ATTR_ID)) {
                            kVar.f38228a = jSONObject7.getString(TtmlNode.ATTR_ID);
                        }
                        if (!jSONObject7.isNull(Action.KEY_ATTRIBUTE)) {
                            kVar.f38229b = jSONObject7.getString(Action.KEY_ATTRIBUTE);
                        }
                        fVar.f38144i = kVar;
                    }
                    if (jSONObject2.isNull("players")) {
                        jSONArray = jSONArray2;
                        i14 = length;
                        i15 = i17;
                    } else {
                        j.b bVar7 = j.f38209l;
                        JSONArray jSONArray3 = jSONObject2.getJSONArray("players");
                        jSONArray3.getClass();
                        bVar7.getClass();
                        int length2 = jSONArray3.length();
                        j[] jVarArr = new j[length2];
                        int length3 = jSONArray3.length();
                        int i18 = 0;
                        while (i18 < length3) {
                            JSONObject jSONObject8 = jSONArray3.getJSONObject(i18);
                            jSONObject8.getClass();
                            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
                            j jVar = new j();
                            if (!jSONObject8.isNull("userProfileId")) {
                                jVar.f38210a = jSONObject8.getString("userProfileId");
                            }
                            if (!jSONObject8.isNull("playerName")) {
                                jVar.f38211b = jSONObject8.getString("playerName");
                            }
                            if (!jSONObject8.isNull("playerNameURL")) {
                                jVar.f38212c = jSONObject8.getString("playerNameURL");
                            }
                            if (!jSONObject8.isNull("playerFullName")) {
                                jVar.f38213d = jSONObject8.getString("playerFullName");
                            }
                            JSONArray jSONArray4 = jSONArray2;
                            if (jSONObject8.isNull("dailyStepCounts")) {
                                i16 = length3;
                            } else {
                                z.b bVar8 = z.f38379c;
                                JSONArray jSONArray5 = jSONObject8.getJSONArray("dailyStepCounts");
                                jSONArray5.getClass();
                                bVar8.getClass();
                                z[] zVarArr = new z[jSONArray5.length()];
                                int length4 = jSONArray5.length();
                                int i19 = 0;
                                while (i19 < length4) {
                                    int i24 = length4;
                                    JSONObject jSONObject9 = jSONArray5.getJSONObject(i19);
                                    jSONObject9.getClass();
                                    JSONArray jSONArray6 = jSONArray5;
                                    int i25 = i19;
                                    SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
                                    z zVar = new z();
                                    int i26 = length3;
                                    if (!jSONObject9.isNull("date")) {
                                        zVar.f38380a = simpleDateFormat3.parse(jSONObject9.getString("date"));
                                    }
                                    if (!jSONObject9.isNull("totalSteps")) {
                                        zVar.f38381b = jSONObject9.getInt("totalSteps");
                                    }
                                    zVarArr[i25] = zVar;
                                    i19 = i25 + 1;
                                    length4 = i24;
                                    jSONArray5 = jSONArray6;
                                    length3 = i26;
                                }
                                i16 = length3;
                                jVar.f38214e = zVarArr;
                            }
                            if (!jSONObject8.isNull("totalSteps")) {
                                jVar.f38215f = jSONObject8.getInt("totalSteps");
                            }
                            if (!jSONObject8.isNull("lastSyncTime")) {
                                jVar.f38216g = simpleDateFormat2.parse(jSONObject8.getString("lastSyncTime"));
                            }
                            if (!jSONObject8.isNull("currentRanking")) {
                                jVar.f38217h = jSONObject8.getInt("currentRanking");
                            }
                            if (!jSONObject8.isNull("isWinner")) {
                                jVar.f38218i = jSONObject8.getBoolean("isWinner");
                            }
                            if (!jSONObject8.isNull("isNewMember")) {
                                jVar.f38219j = jSONObject8.getBoolean("isNewMember");
                            }
                            jVarArr[i18] = jVar;
                            i18++;
                            length = length;
                            jSONArray2 = jSONArray4;
                            i17 = i17;
                            jSONArray3 = jSONArray3;
                            length3 = i16;
                        }
                        jSONArray = jSONArray2;
                        i14 = length;
                        i15 = i17;
                        fVar.f38145j = jVarArr;
                        f12.l.f68084a.getClass();
                        String strU1 = f12.l.a.a().U1();
                        for (int i27 = 0; i27 < length2; i27++) {
                            j jVar2 = jVarArr[i27];
                            if (p005kotlin.jvm.internal.s.g(jVar2 != null ? jVar2.f38210a : null, strU1)) {
                                fVar.f38146k = i27 + 1;
                                break;
                            }
                        }
                    }
                    fVarArr[i15] = fVar;
                    i17 = i15 + 1;
                    length = i14;
                    jSONArray2 = jSONArray;
                }
                iVar.f38190c = fVarArr;
            }
            return iVar;
        }

        private b() {
        }
    }

    public i() {
    }
}
