package bm2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.maps.android.BuildConfig;

/* JADX INFO: loaded from: classes11.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0274a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f18889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f18891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f18892g;

    /* JADX INFO: renamed from: bm2.a$a, reason: collision with other inner class name */
    public class C0274a implements Parcelable.Creator<a> {
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
        this.f18890e = -1L;
        this.f18891f = -1L;
        this.f18886a = parcel.readString();
        this.f18887b = parcel.readString();
        this.f18889d = parcel.readString();
        this.f18888c = parcel.readString();
        this.f18892g = parcel.readInt();
        this.f18890e = parcel.readLong();
        this.f18891f = parcel.readLong();
    }

    public final boolean b() {
        return (this.f18892g & 16) == 16;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f18886a.equalsIgnoreCase(((a) obj).f18886a);
        }
        return false;
    }

    public final String toString() {
        try {
            StringBuilder sb3 = new StringBuilder("BLEDevice.toString():\n  friendlyName:");
            String str = this.f18887b;
            String str2 = BuildConfig.TRAVIS;
            if (str == null) {
                str = BuildConfig.TRAVIS;
            }
            sb3.append(str);
            sb3.append("\n  macAddress:");
            String str3 = this.f18886a;
            if (str3 == null) {
                str3 = BuildConfig.TRAVIS;
            }
            sb3.append(str3);
            sb3.append("\n  unitId:");
            sb3.append(this.f18891f);
            sb3.append("\n  passkey:");
            String str4 = this.f18889d;
            if (str4 == null) {
                str4 = BuildConfig.TRAVIS;
            }
            sb3.append(str4);
            sb3.append("\n  productNumber:");
            String str5 = this.f18888c;
            if (str5 != null) {
                str2 = str5;
            }
            sb3.append(str2);
            sb3.append("\n  areFurtherCredentialsNeeded:");
            sb3.append(TextUtils.isEmpty(this.f18889d));
            sb3.append("\n  isGDIAuthenticationEnabled:");
            sb3.append(b());
            sb3.append("\n  serviceDataOptions:");
            sb3.append(this.f18892g);
            sb3.append("\n");
            return sb3.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f18886a);
        parcel.writeString(this.f18887b);
        parcel.writeString(this.f18889d);
        parcel.writeString(this.f18888c);
        parcel.writeInt(this.f18892g);
        parcel.writeLong(this.f18890e);
        parcel.writeLong(this.f18891f);
    }

    public a(String str, String str2, int i14, int i15) {
        this.f18890e = -1L;
        this.f18891f = -1L;
        this.f18886a = str;
        this.f18887b = str2;
        this.f18888c = String.valueOf(i14);
        this.f18892g = i15;
    }

    public a(String str, String str2, String str3, int i14, String str4, long j8, long j14) {
        this.f18890e = -1L;
        this.f18891f = -1L;
        this.f18886a = str;
        this.f18887b = TextUtils.isEmpty(str2) ? str : str2;
        this.f18889d = str3;
        this.f18892g = i14;
        this.f18888c = str4;
        this.f18890e = j8;
        this.f18891f = j14;
    }
}
