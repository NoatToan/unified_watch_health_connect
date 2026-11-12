package wi1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.s1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class a extends s1 implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C3440a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f185483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f185484b;

    /* JADX INFO: renamed from: wi1.a$a, reason: collision with other inner class name */
    public class C3440a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(Parcel parcel) {
        this.f185483a = "default_activity_visibility_flag";
        this.f185484b = 0;
        this.f185483a = parcel.readString();
        this.f185484b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f185483a = s1.u(jSONObject, Action.KEY_ATTRIBUTE);
            this.f185484b = jSONObject.optInt("value", 0);
        }
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActivitySummary [ KEY = ");
        sb3.append(this.f185483a);
        sb3.append(", VALUE = ");
        return am.j.q(sb3, this.f185484b, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f185483a);
        parcel.writeInt(this.f185484b);
    }

    public a(int i14) {
        this.f185483a = "default_activity_visibility_flag";
        this.f185484b = i14;
    }

    public a() {
        this.f185483a = "default_activity_visibility_flag";
        this.f185484b = 0;
    }
}
