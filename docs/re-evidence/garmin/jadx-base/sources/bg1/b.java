package bg1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006¨\u0006\b"}, d2 = {"Lbg1/b;", "Lbg1/a;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "b", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends bg1.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C0257b f17848m = new C0257b(null);
    public static final Parcelable.Creator<b> CREATOR = new a();

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"bg1/b$a", "Landroid/os/Parcelable$Creator;", "Lbg1/b;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Parcel parcel) {
        super(parcel);
        parcel.getClass();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        jSONObject.getClass();
        this.f17836a = jSONObject.optLong("userProfilePk");
        this.f17837b = jSONObject.optLong("segmentPk");
        this.f17838c = s1.u(jSONObject, "segmentName");
        this.f17839d = jSONObject.optInt("activityTypePk");
        this.f17840e = jSONObject.optBoolean("favorite");
        this.f17846k = jSONObject.optLong("bestElapsedTime");
        this.f17847l = jSONObject.optInt("bestUserRank");
        this.f17841f = s1.u(jSONObject, "segmentUuid");
        this.f17842g = jSONObject.optDouble("segmentDistance");
        this.f17844i = jSONObject.optInt("surfaceTypePk");
        this.f17845j = jSONObject.optInt("classificationPk");
        this.f17843h = s1.u(jSONObject, "userMostRecentCrossingDate");
    }

    @Override // bg1.a, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        super.writeToParcel(parcel, i14);
    }

    /* JADX INFO: renamed from: bg1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\n¨\u0006\u0016"}, d2 = {"Lbg1/b$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lbg1/b;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "USER_PROFILE_PK", "Ljava/lang/String;", "SEGMENT_PK", "SEGMENT_NAME", "ACTIVITY_TYPE_PK", "FAVORITE", "BEST_ELAPSED_TIME", "BEST_USER_RANK", "SEGMENT_UUID", "SEGMENT_DISTANCE", "USER_MOST_RECENT_CROSSING_DATE", "SURFACE_TYPE_PK", "CLASSIFICATION_PK", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0257b {
        public /* synthetic */ C0257b(j jVar) {
            this();
        }

        public static String a(String str, List list) throws JSONException {
            list.getClass();
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                bg1.a aVar = (bg1.a) it.next();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("deviceId", str);
                jSONObject.put("messageUrl", "course-service/leaderboard/fit/" + aVar.f17841f);
                jSONObject.put("messageType", "segment-leaders");
                jSONObject.put("messageName", aVar.f17838c);
                jSONObject.put("groupName", "Segments");
                jSONObject.put("priority", 0);
                jSONObject.put("fileType", "FIT");
                jSONObject.put("metaDataId", (Object) null);
                jSONArray.put(jSONObject);
            }
            String string = jSONArray.toString();
            string.getClass();
            return string;
        }

        private C0257b() {
        }
    }

    public b() {
    }
}
