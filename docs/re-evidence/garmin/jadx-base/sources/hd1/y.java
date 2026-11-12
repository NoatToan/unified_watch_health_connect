package hd1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.i2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class y extends q implements Parcelable {
    public static final Parcelable.Creator<y> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f83432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f83433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f83434d;

    public class a implements Parcelable.Creator<y> {
        @Override // android.os.Parcelable.Creator
        public final y createFromParcel(Parcel parcel) {
            return new y(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final y[] newArray(int i14) {
            return new y[i14];
        }
    }

    public y(Parcel parcel) {
        this.f83432b = parcel.readInt();
        this.f83433c = parcel.readInt();
        this.f83434d = parcel.readInt();
        this.f83396a = parcel.readLong();
    }

    @Override // pd2.b
    public final boolean d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f83432b = jSONObject.optInt("floorsClimbed", -1);
            this.f83433c = jSONObject.optInt("floorsDescended", -1);
            this.f83434d = jSONObject.optInt("floorsClimbedGoal", -1);
            this.f83396a = jSONObject.optLong("lastUpdated", -1L);
            return true;
        } catch (JSONException e4) {
            i2.g(e4, "RealTimeFloorsDTO");
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
            jSONObject.put("floorsClimbed", this.f83432b);
            jSONObject.put("floorsDescended", this.f83433c);
            jSONObject.put("floorsClimbedGoal", this.f83434d);
            jSONObject.put("lastUpdated", this.f83396a);
        } catch (JSONException e4) {
            i2.g(e4, "RealTimeFloorsDTO");
        }
        return jSONObject.toString();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RealTimeFloorsDTO{lastUpdated=");
        sb3.append(this.f83396a);
        sb3.append(", floorsClimbed=");
        sb3.append(this.f83432b);
        sb3.append(", floorsDescended=");
        sb3.append(this.f83433c);
        sb3.append(", floorsClimbedGoal=");
        return ds.e0.j(sb3, this.f83434d, CoreConstants.CURLY_RIGHT);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.f83432b);
        parcel.writeInt(this.f83433c);
        parcel.writeInt(this.f83434d);
        parcel.writeLong(this.f83396a);
    }

    public y() {
        this.f83432b = -1;
        this.f83433c = -1;
        this.f83434d = -1;
        this.f83396a = -1L;
    }

    public y(int i14, int i15, int i16, long j8) {
        this.f83432b = i14;
        this.f83433c = i15;
        this.f83434d = i16;
        this.f83396a = j8;
    }
}
