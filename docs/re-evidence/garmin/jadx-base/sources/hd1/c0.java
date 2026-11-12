package hd1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.i2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class c0 extends q implements Parcelable {
    public static final Parcelable.Creator<c0> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f83372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f83373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f83374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f83375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f83376f;

    public class a implements Parcelable.Creator<c0> {
        @Override // android.os.Parcelable.Creator
        public final c0 createFromParcel(Parcel parcel) {
            return new c0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final c0[] newArray(int i14) {
            return new c0[i14];
        }
    }

    public c0(Parcel parcel) {
        this.f83372b = parcel.readInt();
        this.f83373c = parcel.readInt();
        this.f83374d = parcel.readInt();
        this.f83375e = parcel.readInt();
        this.f83376f = parcel.readInt();
        this.f83396a = parcel.readLong();
    }

    public final void b(JSONObject jSONObject) {
        this.f83372b = jSONObject.optInt("totalDailyMinutes", -1);
        this.f83373c = jSONObject.optInt("dailyModerateMinutes", -1);
        this.f83374d = jSONObject.optInt("dailyVigorousMinutes", -1);
        this.f83375e = jSONObject.optInt("totalWeeklyMinutes", -1);
        this.f83376f = jSONObject.optInt("weeklyGoal", -1);
        this.f83396a = jSONObject.optLong("lastUpdated", -1L);
    }

    @Override // pd2.b
    public final boolean d(String str) {
        try {
            b(new JSONObject(str));
            return true;
        } catch (JSONException e4) {
            i2.g(e4, "RealTimeIntensityMinutesDTO");
            return false;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // pd2.b
    public final String h() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("totalDailyMinutes", this.f83372b);
            jSONObject.put("dailyModerateMinutes", this.f83373c);
            jSONObject.put("dailyVigorousMinutes", this.f83374d);
            jSONObject.put("totalWeeklyMinutes", this.f83375e);
            jSONObject.put("weeklyGoal", this.f83376f);
            jSONObject.put("lastUpdated", this.f83396a);
        } catch (JSONException e4) {
            i2.g(e4, "RealTimeIntensityMinutesDTO");
        }
        return jSONObject.toString();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RealTimeIntensityMinutesDTO{lastUpdated=");
        sb3.append(this.f83396a);
        sb3.append(", totalDailyMinutes=");
        sb3.append(this.f83372b);
        sb3.append(", dailyModerateMinutes=");
        sb3.append(this.f83373c);
        sb3.append(", dailyVigorousMinutes=");
        sb3.append(this.f83374d);
        sb3.append(", totalWeeklyMinutes=");
        sb3.append(this.f83375e);
        sb3.append(", weeklyGoal=");
        return ds.e0.j(sb3, this.f83376f, CoreConstants.CURLY_RIGHT);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.f83372b);
        parcel.writeInt(this.f83373c);
        parcel.writeInt(this.f83374d);
        parcel.writeInt(this.f83375e);
        parcel.writeInt(this.f83376f);
        parcel.writeLong(this.f83396a);
    }

    public c0() {
        this.f83372b = -1;
        this.f83373c = -1;
        this.f83374d = -1;
        this.f83375e = -1;
        this.f83376f = -1;
        this.f83396a = -1L;
    }

    public c0(int i14, int i15, int i16, int i17, int i18, long j8) {
        this.f83372b = i14;
        this.f83373c = i15;
        this.f83374d = i16;
        this.f83375e = i17;
        this.f83376f = i18;
        this.f83396a = j8;
    }
}
