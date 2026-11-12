package com.garmin.android.apps.connectmobile.segments.data.model;

import android.os.Parcel;
import android.os.Parcelable;
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

/* JADX INFO: loaded from: classes9.dex */
@JsonAdapter(SegmentLeaderboardDTODeserializer.class)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0007\bB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/data/model/SegmentLeaderboardDTO;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "SegmentLeaderboardDTODeserializer", "b", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SegmentLeaderboardDTO implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f41221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f41222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<SegmentLeaderboardRowDTO> f41223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f41219e = new b(null);
    public static final Parcelable.Creator<SegmentLeaderboardDTO> CREATOR = new a();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/data/model/SegmentLeaderboardDTO$SegmentLeaderboardDTODeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/segments/data/model/SegmentLeaderboardDTO;", "<init>", "()V", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SegmentLeaderboardDTODeserializer implements JsonDeserializer<SegmentLeaderboardDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final SegmentLeaderboardDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            com.nimbusds.jose.shaded.gson.internal.a.p(jsonElement, type, jsonDeserializationContext);
            try {
                b bVar = SegmentLeaderboardDTO.f41219e;
                JSONObject jSONObject = new JSONObject(jsonElement.toString());
                bVar.getClass();
                return b.a(jSONObject);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/segments/data/model/SegmentLeaderboardDTO$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/segments/data/model/SegmentLeaderboardDTO;", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SegmentLeaderboardDTO> {
        @Override // android.os.Parcelable.Creator
        public final SegmentLeaderboardDTO createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new SegmentLeaderboardDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SegmentLeaderboardDTO[] newArray(int i14) {
            return new SegmentLeaderboardDTO[i14];
        }
    }

    public SegmentLeaderboardDTO(Parcel parcel) {
        List<SegmentLeaderboardRowDTO> list;
        parcel.getClass();
        ClassLoader classLoader = SegmentLeaderboardDTO.class.getClassLoader();
        this.f41220a = parcel.readInt();
        this.f41221b = parcel.readLong();
        this.f41222c = parcel.readString();
        int i14 = parcel.readInt();
        if (i14 > 0) {
            if (this.f41223d == null) {
                this.f41223d = new ArrayList();
            }
            for (int i15 = 0; i15 < i14; i15++) {
                SegmentLeaderboardRowDTO segmentLeaderboardRowDTO = (SegmentLeaderboardRowDTO) parcel.readParcelable(classLoader);
                if (segmentLeaderboardRowDTO != null && (list = this.f41223d) != null) {
                    list.add(segmentLeaderboardRowDTO);
                }
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f41220a);
        parcel.writeLong(this.f41221b);
        parcel.writeString(this.f41222c);
        List<SegmentLeaderboardRowDTO> list = this.f41223d;
        if (list != null) {
            list.getClass();
            if (!list.isEmpty()) {
                List<SegmentLeaderboardRowDTO> list2 = this.f41223d;
                list2.getClass();
                int size = list2.size();
                parcel.writeInt(size);
                for (int i15 = 0; i15 < size; i15++) {
                    List<SegmentLeaderboardRowDTO> list3 = this.f41223d;
                    list3.getClass();
                    parcel.writeParcelable(list3.get(i15), 0);
                }
                return;
            }
        }
        parcel.writeInt(0);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/data/model/SegmentLeaderboardDTO$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/segments/data/model/SegmentLeaderboardDTO;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "USER_BEST_RANK", "Ljava/lang/String;", "USER_BEST_TIME", "ACTIVITY_ID_WITH_BEST_TIME", "LEADERBOARD_ROW_DTO_LIST", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        public static SegmentLeaderboardDTO a(JSONObject jSONObject) throws JSONException {
            SegmentLeaderboardDTO segmentLeaderboardDTO = new SegmentLeaderboardDTO();
            segmentLeaderboardDTO.f41220a = jSONObject.optInt("bestUserRank");
            segmentLeaderboardDTO.f41221b = jSONObject.optLong("bestElapsedTime");
            segmentLeaderboardDTO.f41222c = jSONObject.optString("activityIdWithBestTime");
            if (!jSONObject.isNull("leaderboardRowDTOList")) {
                SegmentLeaderboardRowDTO.b bVar = SegmentLeaderboardRowDTO.f41224y;
                JSONArray jSONArray = jSONObject.getJSONArray("leaderboardRowDTOList");
                jSONArray.getClass();
                bVar.getClass();
                SegmentLeaderboardRowDTO[] segmentLeaderboardRowDTOArrB = SegmentLeaderboardRowDTO.b.b(jSONArray);
                segmentLeaderboardDTO.f41223d = Arrays.asList(Arrays.copyOf(segmentLeaderboardRowDTOArrB, segmentLeaderboardRowDTOArrB.length));
            }
            return segmentLeaderboardDTO;
        }

        private b() {
        }
    }

    public SegmentLeaderboardDTO() {
    }
}
