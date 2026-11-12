package com.huawei.hms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.common.util.Objects;

/* JADX INFO: loaded from: classes34.dex */
@Deprecated
public class StreetViewSource implements Parcelable {
    public static final int TYPE_DEFAULT = 0;
    public static final int TYPE_OUTDOOR = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f14280a;
    public static final StreetViewSource DEFAULT = new StreetViewSource(0);
    public static final StreetViewSource OUTDOOR = new StreetViewSource(1);
    public static final Parcelable.Creator<StreetViewSource> CREATOR = new maa();

    class maa implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StreetViewSource createFromParcel(Parcel parcel) {
            return new StreetViewSource(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StreetViewSource[] newArray(int i) {
            return new StreetViewSource[i];
        }

        maa() {
        }
    }

    public StreetViewSource(int i) {
        this.f14280a = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected StreetViewSource(Parcel parcel) {
        this.f14280a = new ParcelReader(parcel).readInt(2, 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int iBeginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeInt(2, this.f14280a);
        parcelWrite.finishObjectHeader(iBeginObjectHeader);
    }

    public final String toString() {
        return "Type is:" + this.f14280a;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f14280a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StreetViewSource) && this.f14280a == ((StreetViewSource) obj).f14280a;
    }
}
