package com.xiaomi.continuity.netbus;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.j3s;

/* JADX INFO: loaded from: classes7.dex */
public class RequestConnectionResultData implements Parcelable {
    public static final Parcelable.Creator<RequestConnectionResultData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11220a;

    public class a implements Parcelable.Creator<RequestConnectionResultData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RequestConnectionResultData createFromParcel(Parcel parcel) {
            return new RequestConnectionResultData(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RequestConnectionResultData[] newArray(int i) {
            return new RequestConnectionResultData[i];
        }
    }

    public RequestConnectionResultData() {
    }

    public RequestConnectionResultData(Parcel parcel) {
        this.f11220a = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sbA = j3s.a("RequestConnectionResultData{mConnectionId=");
        sbA.append(this.f11220a);
        sbA.append("}");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11220a);
    }

    public /* synthetic */ RequestConnectionResultData(Parcel parcel, a aVar) {
        this(parcel);
    }
}
