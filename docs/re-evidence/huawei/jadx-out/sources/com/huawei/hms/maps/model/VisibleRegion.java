package com.huawei.hms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import java.util.Arrays;

/* JADX INFO: loaded from: classes34.dex */
public class VisibleRegion implements Parcelable {
    public static final Parcelable.Creator<VisibleRegion> CREATOR = new maa();
    public final LatLng farLeft;
    public final LatLng farRight;
    public final LatLngBounds latLngBounds;
    public final LatLng nearLeft;
    public final LatLng nearRight;

    class maa implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public VisibleRegion createFromParcel(Parcel parcel) {
            return new VisibleRegion(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public VisibleRegion[] newArray(int i) {
            return new VisibleRegion[i];
        }

        maa() {
        }
    }

    protected VisibleRegion(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        Parcelable.Creator<LatLng> creator = LatLng.CREATOR;
        this.farLeft = (LatLng) parcelReader.readParcelable(2, creator, null);
        this.farRight = (LatLng) parcelReader.readParcelable(3, creator, null);
        this.latLngBounds = (LatLngBounds) parcelReader.readParcelable(4, LatLngBounds.CREATOR, null);
        this.nearLeft = (LatLng) parcelReader.readParcelable(5, creator, null);
        this.nearRight = (LatLng) parcelReader.readParcelable(6, creator, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VisibleRegion(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.nearLeft = latLng;
        this.farLeft = latLng3;
        this.nearRight = latLng2;
        this.farRight = latLng4;
        this.latLngBounds = latLngBounds;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int iBeginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeParcelable(2, this.farLeft, i, false);
        parcelWrite.writeParcelable(3, this.farRight, i, false);
        parcelWrite.writeParcelable(4, this.latLngBounds, i, false);
        parcelWrite.writeParcelable(5, this.nearLeft, i, false);
        parcelWrite.writeParcelable(6, this.nearRight, i, false);
        parcelWrite.finishObjectHeader(iBeginObjectHeader);
    }

    public String toString() {
        return "VisibleRegion{farLeft=" + this.farLeft + ", farRight=" + this.farRight + ", latLngBounds=" + this.latLngBounds + ", nearLeft=" + this.nearLeft + ", nearRight=" + this.nearRight + '}';
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.nearLeft, this.nearRight, this.farLeft, this.farRight, this.latLngBounds});
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VisibleRegion) {
            VisibleRegion visibleRegion = (VisibleRegion) obj;
            boolean z = this.nearLeft.equals(visibleRegion.nearLeft) && this.nearRight.equals(visibleRegion.nearRight);
            boolean z2 = this.farRight.equals(visibleRegion.farRight) && this.latLngBounds.equals(visibleRegion.latLngBounds);
            if (z && z2) {
                return true;
            }
        }
        return false;
    }
}
