package com.xiaomi.continuity;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.j3s;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class ServiceName implements Parcelable {
    public static final Parcelable.Creator<ServiceName> CREATOR = new a();
    private String name;
    private String packageName;

    public class a implements Parcelable.Creator<ServiceName> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ServiceName createFromParcel(Parcel parcel) {
            return new ServiceName(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ServiceName[] newArray(int i) {
            return new ServiceName[i];
        }
    }

    public ServiceName(Parcel parcel) {
        this.packageName = parcel.readString();
        this.name = parcel.readString();
    }

    public static ServiceName parse(String str) {
        String[] strArrSplit;
        if (str == null || str.length() == 0 || (strArrSplit = str.split(":")) == null || strArrSplit.length == 0) {
            return null;
        }
        if (strArrSplit.length == 1) {
            if (strArrSplit[0].contains(":")) {
                return null;
            }
            return new ServiceName(strArrSplit[0]);
        }
        if (strArrSplit[0].contains(":") || strArrSplit[1].contains(":")) {
            return null;
        }
        return new ServiceName(strArrSplit[0], strArrSplit[1]);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServiceName serviceName = (ServiceName) obj;
        return Objects.equals(this.packageName, serviceName.packageName) && Objects.equals(this.name, serviceName.name);
    }

    public String getName() {
        return this.name;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int hashCode() {
        return Objects.hash(this.packageName, this.name);
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public String toMergeString() {
        StringBuilder sb;
        if (this.packageName == null) {
            sb = j3s.a(":");
        } else {
            sb = new StringBuilder();
            sb.append(this.packageName);
            sb.append(":");
        }
        sb.append(this.name);
        return sb.toString();
    }

    public String toString() {
        StringBuilder sbA = j3s.a("ServiceName{packageName='");
        sbA.append(this.packageName);
        sbA.append('\'');
        sbA.append(", name='");
        sbA.append(this.name);
        sbA.append('\'');
        sbA.append(AbstractJsonLexerKt.END_OBJ);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.packageName);
        parcel.writeString(this.name);
    }

    public ServiceName(String str) {
        this.name = str;
    }

    public ServiceName(String str, String str2) {
        this.packageName = str;
        this.name = str2;
    }
}
