package com.huawei.ohos.localability.base.form;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: loaded from: classes40.dex */
class b implements Parcelable {
    public static final Parcelable.Creator<b> d = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f18097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f18098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f18099c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f18098b);
        parcel.writeString(this.f18099c);
        parcel.writeString(this.f18097a);
    }

    public int hashCode() {
        return Objects.hash(this.f18097a, this.f18098b, this.f18099c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(this.f18097a, bVar.f18097a) && Objects.equals(this.f18098b, bVar.f18098b) && Objects.equals(this.f18099c, bVar.f18099c);
    }

    public b(String str, String str2, String str3) {
        this.f18097a = str;
        this.f18098b = str2;
        this.f18099c = str3;
    }

    public b(Parcel parcel) {
        this.f18097a = "";
        this.f18098b = "";
        this.f18099c = "";
        this.f18098b = parcel.readString();
        this.f18099c = parcel.readString();
        this.f18097a = parcel.readString();
    }

    static final class d implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i) {
            if (i >= 0) {
                return new b[i];
            }
            return null;
        }

        d() {
        }
    }

    public b() {
        this.f18097a = "";
        this.f18098b = "";
        this.f18099c = "";
    }
}
