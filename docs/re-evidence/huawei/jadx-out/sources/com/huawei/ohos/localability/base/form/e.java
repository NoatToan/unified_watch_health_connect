package com.huawei.ohos.localability.base.form;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes40.dex */
class e implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f18102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f18103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f18104c;
    private Set<String> d;
    private String e;

    static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public e[] newArray(int i) {
            if (i >= 0) {
                return new e[i];
            }
            return null;
        }
    }

    public e(Parcel parcel) {
        String[] strArr;
        this.f18102a = parcel.readString();
        parcel.readInt();
        b bVarCreateFromParcel = null;
        this.d = null;
        if (parcel.readInt() == 1) {
            int i = parcel.readInt();
            if (i < 0 || i > 512000) {
                strArr = new String[0];
            } else {
                strArr = new String[i];
                for (int i2 = 0; i2 < i; i2++) {
                    strArr[i2] = parcel.readString();
                }
            }
            this.d = new HashSet(Arrays.asList(strArr));
        }
        this.f18103b = parcel.readInt();
        this.f18104c = null;
        if (parcel.readInt() != 1) {
            this.f18104c = bVarCreateFromParcel;
        } else if (parcel.readInt() != 0) {
            bVarCreateFromParcel = b.d.createFromParcel(parcel);
            this.f18104c = bVarCreateFromParcel;
        }
        parcel.readInt();
        this.e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f18102a);
        parcel.writeInt(-1);
        parcel.writeInt(-1);
        parcel.writeInt(this.f18103b);
        if (this.f18104c == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(1);
            this.f18104c.writeToParcel(parcel, 0);
        }
        parcel.writeInt(-1);
        parcel.writeString(this.e);
        parcel.writeInt(-1);
    }

    public int hashCode() {
        String str = this.f18102a;
        int iHashCode = str != null ? str.hashCode() : 0;
        b bVar = this.f18104c;
        if (bVar != null) {
            iHashCode += bVar.hashCode();
        }
        Set<String> set = this.d;
        if (set != null) {
            iHashCode += set.hashCode();
        }
        String str2 = this.e;
        return str2 != null ? str2.hashCode() + iHashCode : iHashCode;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Objects.equals(this.f18102a, eVar.f18102a) && Objects.equals(this.e, eVar.e) && Objects.equals(this.f18104c, eVar.f18104c) && Objects.equals(this.d, eVar.d);
    }

    public e() {
        this.f18103b = 0;
    }
}
