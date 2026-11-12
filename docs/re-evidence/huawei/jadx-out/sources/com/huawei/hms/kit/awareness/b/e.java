package com.huawei.hms.kit.awareness.b;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: loaded from: classes34.dex */
public class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new Parcelable.Creator<e>() { // from class: com.huawei.hms.kit.awareness.b.e.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i) {
            return new e[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f13902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f13903c;
    private final String d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13901a);
        parcel.writeString(this.f13902b);
        parcel.writeInt(this.f13903c);
        parcel.writeString(this.d);
    }

    public String toString() {
        return "CpInfo{mAppId='" + this.f13901a + "', mApiKey='" + this.f13902b + "', mUid=" + this.f13903c + ", mRegionCode='" + this.d + "'}";
    }

    public int hashCode() {
        String str = this.f13901a;
        String str2 = this.f13902b;
        int i = this.f13903c;
        return Objects.hash(str, str2, Integer.valueOf(i), this.d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f13903c == eVar.f13903c && Objects.equals(this.f13901a, eVar.f13901a) && Objects.equals(this.f13902b, eVar.f13902b) && Objects.equals(this.d, eVar.d);
    }

    public String e() {
        return this.d;
    }

    public int d() {
        return this.f13903c;
    }

    public String c() {
        return this.f13902b;
    }

    public String b() {
        return this.f13901a;
    }

    public e(String str, String str2, int i, String str3) {
        this.f13901a = str;
        this.f13902b = str2;
        this.f13903c = i;
        this.d = str3;
    }

    protected e(Parcel parcel) {
        this.f13901a = parcel.readString();
        this.f13902b = parcel.readString();
        this.f13903c = parcel.readInt();
        this.d = parcel.readString();
    }

    public e() {
        this.f13901a = "";
        this.f13902b = "";
        this.f13903c = -1;
        this.d = "";
    }
}
