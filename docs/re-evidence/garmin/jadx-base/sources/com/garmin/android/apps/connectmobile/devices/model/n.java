package com.garmin.android.apps.connectmobile.devices.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class n extends s1 implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f34267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f34268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f34269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f34270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f34271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f34272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f34273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f34274h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f34275i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f34276j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f34277k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f34278l;

    public class a implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        public final n createFromParcel(Parcel parcel) {
            return new n(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final n[] newArray(int i14) {
            return new n[i14];
        }
    }

    public n(Parcel parcel) {
        this.f34267a = parcel.readString();
        this.f34269c = parcel.readString();
        this.f34272f = parcel.readLong();
        this.f34274h = parcel.readString();
        this.f34278l = parcel.readLong();
        this.f34268b = parcel.readInt() == 1;
        this.f34270d = parcel.readInt() == 1;
        this.f34271e = parcel.readInt() == 1;
        this.f34273g = parcel.readInt() == 1;
        this.f34275i = parcel.readInt() == 1;
        this.f34276j = parcel.readInt() == 1;
        this.f34277k = parcel.readInt() == 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f34267a = s1.u(jSONObject, "currentTime");
            this.f34268b = jSONObject.optBoolean("thisDeviceAATOnThisAccount");
            this.f34269c = s1.u(jSONObject, "currentAATName");
            this.f34270d = jSONObject.optBoolean("activityTracker");
            this.f34271e = jSONObject.optBoolean("thisDeviceAATOnOtherAccount");
            this.f34272f = jSONObject.optLong("currentAATDeviceId");
            this.f34273g = jSONObject.optBoolean("aatOnThisAccount");
            this.f34274h = s1.u(jSONObject, "userDisplayName");
            this.f34275i = jSONObject.optBoolean("thisDeviceActiveWithCurrentUser");
            this.f34276j = jSONObject.optBoolean("previousAssociationWithOther");
            this.f34277k = jSONObject.optBoolean("otherDeviceActiveWithCurrentUser");
            this.f34278l = jSONObject.optLong("deviceId");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f34267a);
        parcel.writeString(this.f34269c);
        parcel.writeLong(this.f34272f);
        parcel.writeString(this.f34274h);
        parcel.writeLong(this.f34278l);
        parcel.writeInt(this.f34268b ? 1 : 0);
        parcel.writeInt(this.f34270d ? 1 : 0);
        parcel.writeInt(this.f34271e ? 1 : 0);
        parcel.writeInt(this.f34273g ? 1 : 0);
        parcel.writeInt(this.f34275i ? 1 : 0);
        parcel.writeInt(this.f34276j ? 1 : 0);
        parcel.writeInt(this.f34277k ? 1 : 0);
    }

    public n() {
    }
}
