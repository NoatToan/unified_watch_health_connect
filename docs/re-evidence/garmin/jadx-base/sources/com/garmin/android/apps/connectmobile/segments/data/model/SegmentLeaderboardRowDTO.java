package com.garmin.android.apps.connectmobile.segments.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@JsonAdapter(SegmentLeaderboardRowDTODeserializer.class)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0007\bB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/data/model/SegmentLeaderboardRowDTO;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "SegmentLeaderboardRowDTODeserializer", "b", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SegmentLeaderboardRowDTO implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f41225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f41226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f41227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f41228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f41229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f41230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f41231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f41232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f41233i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f41234j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public double f41235k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f41236l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f41237m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f41238n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f41239o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f41240p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f41241q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f41242r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f41243t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f41244v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f41245w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f41246x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final b f41224y = new b(null);
    public static final Parcelable.Creator<SegmentLeaderboardRowDTO> CREATOR = new a();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/data/model/SegmentLeaderboardRowDTO$SegmentLeaderboardRowDTODeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/segments/data/model/SegmentLeaderboardRowDTO;", "<init>", "()V", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SegmentLeaderboardRowDTODeserializer implements JsonDeserializer<SegmentLeaderboardRowDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final SegmentLeaderboardRowDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            com.nimbusds.jose.shaded.gson.internal.a.p(jsonElement, type, jsonDeserializationContext);
            try {
                b bVar = SegmentLeaderboardRowDTO.f41224y;
                JSONObject jSONObject = new JSONObject(jsonElement.toString());
                bVar.getClass();
                return b.a(jSONObject);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/segments/data/model/SegmentLeaderboardRowDTO$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/segments/data/model/SegmentLeaderboardRowDTO;", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SegmentLeaderboardRowDTO> {
        @Override // android.os.Parcelable.Creator
        public final SegmentLeaderboardRowDTO createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new SegmentLeaderboardRowDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SegmentLeaderboardRowDTO[] newArray(int i14) {
            return new SegmentLeaderboardRowDTO[i14];
        }
    }

    public SegmentLeaderboardRowDTO(Parcel parcel) {
        parcel.getClass();
        this.f41225a = parcel.readLong();
        this.f41226b = parcel.readString();
        this.f41227c = parcel.readDouble();
        this.f41228d = parcel.readString();
        this.f41229e = parcel.readString();
        this.f41230f = parcel.readDouble();
        this.f41231g = parcel.readDouble();
        this.f41232h = parcel.readDouble();
        this.f41233i = parcel.readInt();
        this.f41234j = parcel.readString();
        this.f41235k = parcel.readDouble();
        this.f41236l = parcel.readLong();
        this.f41237m = parcel.readString();
        this.f41238n = parcel.readInt() == 1;
        this.f41239o = parcel.readInt();
        this.f41240p = parcel.readString();
        this.f41241q = parcel.readString();
        this.f41243t = parcel.readLong();
        this.f41244v = parcel.readLong();
        this.f41245w = parcel.readLong();
        this.f41242r = parcel.readString();
        this.f41246x = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.f41225a);
        parcel.writeString(this.f41226b);
        parcel.writeDouble(this.f41227c);
        parcel.writeString(this.f41228d);
        parcel.writeString(this.f41229e);
        parcel.writeDouble(this.f41230f);
        parcel.writeDouble(this.f41231g);
        parcel.writeDouble(this.f41232h);
        parcel.writeInt(this.f41233i);
        parcel.writeString(this.f41234j);
        parcel.writeDouble(this.f41235k);
        parcel.writeLong(this.f41236l);
        parcel.writeString(this.f41237m);
        parcel.writeInt(this.f41238n ? 1 : 0);
        parcel.writeInt(this.f41239o);
        parcel.writeString(this.f41240p);
        parcel.writeString(this.f41241q);
        parcel.writeLong(this.f41243t);
        parcel.writeLong(this.f41244v);
        parcel.writeLong(this.f41245w);
        parcel.writeString(this.f41242r);
        parcel.writeString(this.f41246x);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\nR\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\nR\u0014\u0010\u0019\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\nR\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\nR\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\nR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\nR\u0014\u0010\u001d\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\nR\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\nR\u0014\u0010\u001f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\nR\u0014\u0010 \u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\n¨\u0006!"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/data/model/SegmentLeaderboardRowDTO$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/segments/data/model/SegmentLeaderboardRowDTO;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "DATE_FORMAT", "Ljava/lang/String;", "GEO_ACTIVITY_PK", "UUID", "MATCH_SEQUENCE", "TIME_ENTERED", "TIME_EXITED", "AVERAGE_HEART_RATE", "AVERAGE_CADENCE", "AVERAGE_POWER", "WIND_DIRECTION", "WIND_DIRECTION_COMPASS_POINT", "WIND_SPEED", "ACTIVITY_ID", "SEGMENT_UUID", "FAVORITE", "RANK", "IMAGE_URL", "DISPLAY_NAME", "FULL_NAME", "SOCIAL_PROFILE_PK", "USER_PROFILE_PK", "ELAPSED_MILLISECONDS", "ACTIVITY_PRIVACY", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        public static SegmentLeaderboardRowDTO a(JSONObject jSONObject) {
            SegmentLeaderboardRowDTO segmentLeaderboardRowDTO = new SegmentLeaderboardRowDTO();
            segmentLeaderboardRowDTO.f41225a = jSONObject.optLong("geoActivityPk");
            segmentLeaderboardRowDTO.f41226b = jSONObject.optString("uuid");
            segmentLeaderboardRowDTO.f41227c = jSONObject.optDouble("matchSequence");
            segmentLeaderboardRowDTO.f41228d = jSONObject.optString("timeEntered");
            segmentLeaderboardRowDTO.f41229e = jSONObject.optString("timeExited");
            segmentLeaderboardRowDTO.f41230f = jSONObject.optDouble("averageHeartRate");
            segmentLeaderboardRowDTO.f41231g = jSONObject.optDouble("averageCadence");
            segmentLeaderboardRowDTO.f41232h = jSONObject.optDouble("averagePower");
            segmentLeaderboardRowDTO.f41233i = jSONObject.optInt("windDirection");
            segmentLeaderboardRowDTO.f41234j = jSONObject.optString("windDirectionCompassPoint");
            segmentLeaderboardRowDTO.f41235k = jSONObject.optDouble("windSpeed");
            segmentLeaderboardRowDTO.f41236l = jSONObject.optLong("activityID");
            segmentLeaderboardRowDTO.f41237m = jSONObject.optString("segmentUUID");
            segmentLeaderboardRowDTO.f41238n = jSONObject.optBoolean("favorite");
            segmentLeaderboardRowDTO.f41239o = jSONObject.optInt("rank");
            segmentLeaderboardRowDTO.f41240p = jSONObject.optString("imageUrl");
            segmentLeaderboardRowDTO.f41241q = jSONObject.optString("displayName");
            segmentLeaderboardRowDTO.f41243t = jSONObject.optLong("socialProfilePk");
            segmentLeaderboardRowDTO.f41244v = jSONObject.optLong("userProfilePk");
            segmentLeaderboardRowDTO.f41245w = jSONObject.optLong("elapsedMilliseconds");
            segmentLeaderboardRowDTO.f41242r = jSONObject.isNull("fullName") ? null : jSONObject.optString("fullName");
            String strOptString = jSONObject.optString("activityPrivacy");
            strOptString.getClass();
            segmentLeaderboardRowDTO.f41246x = strOptString;
            return segmentLeaderboardRowDTO;
        }

        public static SegmentLeaderboardRowDTO[] b(JSONArray jSONArray) throws JSONException {
            SegmentLeaderboardRowDTO[] segmentLeaderboardRowDTOArr = new SegmentLeaderboardRowDTO[jSONArray.length()];
            int length = jSONArray.length();
            for (int i14 = 0; i14 < length; i14++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i14);
                jSONObject.getClass();
                segmentLeaderboardRowDTOArr[i14] = a(jSONObject);
            }
            return segmentLeaderboardRowDTOArr;
        }

        private b() {
        }
    }

    public SegmentLeaderboardRowDTO() {
    }
}
