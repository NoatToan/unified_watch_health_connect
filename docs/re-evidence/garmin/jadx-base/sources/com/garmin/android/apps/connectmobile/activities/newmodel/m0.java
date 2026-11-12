package com.garmin.android.apps.connectmobile.activities.newmodel;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.s1;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class m0 extends s1 implements Parcelable {
    public static final Parcelable.Creator<m0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(TtmlNode.ATTR_ID)
    private int f29590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(Action.KEY_ATTRIBUTE)
    private String f29591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("factor")
    private double f29592c;

    public class a implements Parcelable.Creator<m0> {
        @Override // android.os.Parcelable.Creator
        public final m0 createFromParcel(Parcel parcel) {
            return new m0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final m0[] newArray(int i14) {
            return new m0[i14];
        }
    }

    public m0(Parcel parcel) {
        this.f29590a = parcel.readInt();
        this.f29591b = parcel.readString();
        this.f29592c = parcel.readDouble();
    }

    public final String C() {
        return this.f29591b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f29590a = jSONObject.optInt(TtmlNode.ATTR_ID);
            this.f29591b = s1.u(jSONObject, Action.KEY_ATTRIBUTE);
            this.f29592c = jSONObject.optDouble("factor");
        }
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UnitMetricsDTO [id=");
        sb3.append(this.f29590a);
        sb3.append(", key=");
        sb3.append(this.f29591b);
        sb3.append(", factor=");
        return c22.t.d(this.f29592c, "]", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.f29590a);
        parcel.writeString(this.f29591b);
        parcel.writeDouble(this.f29592c);
    }

    public m0() {
    }
}
