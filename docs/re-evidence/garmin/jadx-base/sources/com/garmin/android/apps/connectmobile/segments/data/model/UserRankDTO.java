package com.garmin.android.apps.connectmobile.segments.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@JsonAdapter(UserRankDTODeserializer.class)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\b\tB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0014\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/data/model/UserRankDTO;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "UserRankDTODeserializer", "b", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class UserRankDTO extends s1 implements Parcelable {
    public static final Parcelable.Creator<UserRankDTO> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f41250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f41251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f41252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f41253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f41254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f41255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f41256h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f41257i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f41258j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f41259k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f41260l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f41261m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f41262n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f41263o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f41264p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f41265q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f41266r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f41267t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f41268v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f41269w;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/data/model/UserRankDTO$UserRankDTODeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/segments/data/model/UserRankDTO;", "<init>", "()V", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UserRankDTODeserializer implements JsonDeserializer<UserRankDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final UserRankDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            com.nimbusds.jose.shaded.gson.internal.a.p(jsonElement, type, jsonDeserializationContext);
            try {
                UserRankDTO userRankDTO = new UserRankDTO();
                userRankDTO.k(new JSONObject(jsonElement.toString()));
                return userRankDTO;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/segments/data/model/UserRankDTO$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/segments/data/model/UserRankDTO;", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserRankDTO> {
        @Override // android.os.Parcelable.Creator
        public final UserRankDTO createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new UserRankDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final UserRankDTO[] newArray(int i14) {
            return new UserRankDTO[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public UserRankDTO(Parcel parcel) {
        parcel.getClass();
        this.f41249a = parcel.readInt();
        this.f41250b = parcel.readLong();
        this.f41251c = parcel.readLong();
        this.f41252d = parcel.readString();
        this.f41253e = parcel.readString();
        this.f41254f = parcel.readLong();
        this.f41255g = parcel.readLong();
        this.f41256h = parcel.readString();
        this.f41257i = parcel.readString();
        this.f41258j = parcel.readLong();
        this.f41259k = parcel.readLong();
        this.f41260l = parcel.readString();
        this.f41261m = parcel.readString();
        this.f41262n = parcel.readLong();
        this.f41263o = parcel.readInt();
        this.f41264p = parcel.readLong();
        this.f41265q = parcel.readString();
        this.f41266r = parcel.readString();
        this.f41267t = parcel.readLong();
        this.f41268v = parcel.readInt() != 0;
        this.f41269w = parcel.createTypedArrayList(SegmentLeaderboardRowDTO.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) throws JSONException {
        jSONObject.getClass();
        this.f41249a = jSONObject.optInt("bestUserRank");
        this.f41250b = jSONObject.optLong("bestElapsedTime");
        this.f41251c = jSONObject.optLong("leaderElapsedTime");
        this.f41252d = s1.u(jSONObject, "leaderImageUrl");
        this.f41253e = s1.u(jSONObject, "leaderDisplayName");
        this.f41254f = jSONObject.optLong("leaderUserProfilePk");
        this.f41255g = jSONObject.optLong("secondPlaceElapsedTime");
        this.f41256h = s1.u(jSONObject, "secondPlaceImageUrl");
        this.f41257i = s1.u(jSONObject, "secondPlaceDisplayName");
        this.f41258j = jSONObject.optLong("secondPlaceUserProfilePk");
        this.f41259k = jSONObject.optLong("thirdPlaceElapsedTime");
        this.f41260l = s1.u(jSONObject, "thirdPlaceImageUrl");
        this.f41261m = s1.u(jSONObject, "thirdPlaceDisplayName");
        this.f41262n = jSONObject.optLong("thirdPlaceUserProfilePk");
        this.f41263o = jSONObject.optInt("lastUserRank");
        this.f41264p = jSONObject.optLong("lastElapsedTime");
        this.f41265q = s1.u(jSONObject, "lastImageUrl");
        this.f41266r = s1.u(jSONObject, "lastDisplayName");
        this.f41267t = jSONObject.optLong("lastUserProfilePk");
        if (jSONObject.isNull("leaderboardRowDTOList")) {
            return;
        }
        SegmentLeaderboardRowDTO.b bVar = SegmentLeaderboardRowDTO.f41224y;
        JSONArray jSONArray = jSONObject.getJSONArray("leaderboardRowDTOList");
        jSONArray.getClass();
        bVar.getClass();
        SegmentLeaderboardRowDTO[] segmentLeaderboardRowDTOArrB = SegmentLeaderboardRowDTO.b.b(jSONArray);
        List listAsList = Arrays.asList(Arrays.copyOf(segmentLeaderboardRowDTOArrB, segmentLeaderboardRowDTOArrB.length));
        if (!listAsList.isEmpty()) {
            this.f41269w = h0.Z(listAsList);
            return;
        }
        if (jSONObject.isNull("leaderboardIncNonPublicList")) {
            return;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray("leaderboardIncNonPublicList");
        jSONArray2.getClass();
        SegmentLeaderboardRowDTO[] segmentLeaderboardRowDTOArrB2 = SegmentLeaderboardRowDTO.b.b(jSONArray2);
        List listAsList2 = Arrays.asList(Arrays.copyOf(segmentLeaderboardRowDTOArrB2, segmentLeaderboardRowDTOArrB2.length));
        listAsList2.getClass();
        this.f41269w = h0.Z(listAsList2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f41249a);
        parcel.writeLong(this.f41250b);
        parcel.writeLong(this.f41251c);
        parcel.writeString(this.f41252d);
        parcel.writeString(this.f41253e);
        parcel.writeLong(this.f41254f);
        parcel.writeLong(this.f41255g);
        parcel.writeString(this.f41256h);
        parcel.writeString(this.f41257i);
        parcel.writeLong(this.f41258j);
        parcel.writeLong(this.f41259k);
        parcel.writeString(this.f41260l);
        parcel.writeString(this.f41261m);
        parcel.writeLong(this.f41262n);
        parcel.writeInt(this.f41263o);
        parcel.writeLong(this.f41264p);
        parcel.writeString(this.f41265q);
        parcel.writeString(this.f41266r);
        parcel.writeLong(this.f41267t);
        parcel.writeInt(this.f41268v ? 1 : 0);
        parcel.writeTypedList(this.f41269w);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\nR\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\nR\u0014\u0010\u0019\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\nR\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\nR\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\nR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\nR\u0014\u0010\u001d\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\nR\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/data/model/UserRankDTO$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/segments/data/model/UserRankDTO;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "BEST_USER_RANK", "Ljava/lang/String;", "BEST_ELAPSED_TIME", "LEADER_ELAPSED_TIME", "LEADER_IMAGE_URL", "LEADER_DISPLAY_NAME", "LEADER_USER_PROFILE_PK", "SECOND_PLACE_ELAPSED_TIME", "SECOND_PLACE_IMAGE_URL", "SECOND_PLACE_DISPLAY_NAME", "SECOND_PLACE_USER_PROFILE_PK", "THIRD_PLACE_ELAPSED_TIME", "THIRD_PLACE_IMAGE_URL", "THIRD_PLACE_DISPLAY_NAME", "THIRD_PLACE_USER_PROFILE_PK", "LAST_USER_RANK", "LAST_ELAPSED_TIME", "LAST_IMAGE_URL", "LAST_DISPLAY_NAME", "LAST_USER_PROFILE_PK", "LEADERBOARD_ROW_DTO_LIST", "LEADERBOARD_ROW_INC_NONPUBLIC_LIST", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    public UserRankDTO() {
    }
}
