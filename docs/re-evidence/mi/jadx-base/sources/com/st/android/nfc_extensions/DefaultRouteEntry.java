package com.st.android.nfc_extensions;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public class DefaultRouteEntry implements Parcelable {
    public static final Parcelable.Creator<DefaultRouteEntry> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10612b;

    public class a implements Parcelable.Creator<DefaultRouteEntry> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DefaultRouteEntry createFromParcel(Parcel parcel) {
            return new DefaultRouteEntry(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DefaultRouteEntry[] newArray(int i) {
            return new DefaultRouteEntry[i];
        }
    }

    public DefaultRouteEntry(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("DefaultRouteEntry(constructor) - name: ");
        sb.append(str);
        sb.append(", loc: ");
        sb.append(str2);
        this.f10611a = str;
        this.f10612b = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10611a);
        parcel.writeString(this.f10612b);
    }
}
