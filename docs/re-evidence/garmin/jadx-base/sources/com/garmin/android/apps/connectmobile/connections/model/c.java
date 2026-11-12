package com.garmin.android.apps.connectmobile.connections.model;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class c extends s1 implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f31695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f31696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f31697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f31698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f31699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f31700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b12.b f31701g = b12.b.f14386g;

    public class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public c(Parcel parcel) {
        this.f31695a = parcel.readLong();
        this.f31696b = parcel.readString();
        this.f31697c = parcel.readString();
        this.f31698d = parcel.readString();
        this.f31699e = parcel.readString();
        this.f31700f = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f31695a = jSONObject.optLong("userProfilePk");
            this.f31696b = s1.u(jSONObject, "displayname");
            this.f31697c = s1.u(jSONObject, "fullname");
            this.f31698d = s1.u(jSONObject, "profileImageUrlLarge");
            this.f31699e = s1.u(jSONObject, "profileImageUrlMedium");
            this.f31700f = s1.u(jSONObject, "profileImageUrlSmall");
        }
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UserInfoDTO [mUserProfilePk=");
        sb3.append(this.f31695a);
        sb3.append(", mDisplayName=");
        sb3.append(this.f31696b);
        sb3.append(", mFullName=");
        sb3.append(this.f31697c);
        sb3.append(", mProfileImageUrlMedium=");
        sb3.append(this.f31699e);
        sb3.append(", mProfileImageUrlSmall=");
        return j.o(this.f31700f, "]", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeLong(this.f31695a);
        parcel.writeString(this.f31696b);
        parcel.writeString(this.f31697c);
        parcel.writeString(this.f31698d);
        parcel.writeString(this.f31699e);
        parcel.writeString(this.f31700f);
    }

    public c() {
    }
}
