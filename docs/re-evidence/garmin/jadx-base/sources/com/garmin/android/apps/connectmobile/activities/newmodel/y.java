package com.garmin.android.apps.connectmobile.activities.newmodel;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.annotations.SerializedName;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class y extends s1 implements Parcelable {
    public static final Parcelable.Creator<y> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("metricsIndex")
    private int f29697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("developerFieldNumber")
    private int f29698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(Action.KEY_ATTRIBUTE)
    private String f29699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("appID")
    private String f29700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("unit")
    private m0 f29701e;

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
        this.f29698b = -1;
        this.f29697a = parcel.readInt();
        this.f29699c = parcel.readString();
        this.f29701e = (m0) parcel.readParcelable(m0.class.getClassLoader());
        this.f29700d = parcel.readString();
        this.f29698b = parcel.readInt();
    }

    public final String C() {
        return this.f29700d;
    }

    public final int D() {
        return this.f29698b;
    }

    public final String F() {
        return this.f29699c;
    }

    public final int G() {
        return this.f29697a;
    }

    public final m0 H() {
        return this.f29701e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f29697a = jSONObject.optInt("metricsIndex");
            this.f29699c = s1.u(jSONObject, Action.KEY_ATTRIBUTE);
            if (!jSONObject.isNull("unit")) {
                m0 m0Var = new m0();
                this.f29701e = m0Var;
                m0Var.k(jSONObject.getJSONObject("unit"));
            }
            this.f29700d = s1.u(jSONObject, "appID");
            this.f29698b = jSONObject.optInt("developerFieldNumber", -1);
        }
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MetricDescriptorsDTO [metricsIndex=");
        sb3.append(this.f29697a);
        sb3.append(", key=");
        sb3.append(this.f29699c);
        sb3.append(", unit=");
        sb3.append(this.f29701e);
        sb3.append(", appId=");
        String str = this.f29700d;
        if (str == null) {
            str = "";
        }
        sb3.append(str);
        sb3.append(", developerFieldNumber=");
        return am.j.q(sb3, this.f29698b, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.f29697a);
        parcel.writeString(this.f29699c);
        parcel.writeParcelable(this.f29701e, 0);
        parcel.writeString(this.f29700d);
        parcel.writeInt(this.f29698b);
    }

    public y() {
        this.f29698b = -1;
    }

    public y(int i14, String str, m0 m0Var) {
        this.f29698b = -1;
        this.f29697a = i14;
        this.f29699c = str;
        this.f29701e = m0Var;
    }
}
