package com.st.android.nfc_extensions;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class ServiceEntry implements Parcelable {
    public static final Parcelable.Creator<ServiceEntry> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10614b;
    public Integer c;
    public Boolean d;
    public Boolean e;
    public ComponentName f;

    public class a implements Parcelable.Creator<ServiceEntry> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ServiceEntry createFromParcel(Parcel parcel) {
            return new ServiceEntry(getClass().getClassLoader() != null ? (ComponentName) parcel.readParcelable(getClass().getClassLoader()) : null, parcel.readString(), parcel.readString(), Integer.valueOf(parcel.readInt()), new Boolean(parcel.readInt() != 0), new Boolean(parcel.readInt() != 0));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ServiceEntry[] newArray(int i) {
            return new ServiceEntry[i];
        }
    }

    public ServiceEntry(ComponentName componentName, String str, String str2, Integer num, Boolean bool, Boolean bool2) {
        this.f = componentName;
        this.f10613a = str;
        this.f10614b = str2;
        this.c = num;
        this.d = bool;
        this.e = bool2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10613a);
        parcel.writeString(this.f10614b);
        parcel.writeInt(this.c.intValue());
        if (this.d.booleanValue()) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
        }
        if (this.e.booleanValue()) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeParcelable(this.f, i);
    }
}
