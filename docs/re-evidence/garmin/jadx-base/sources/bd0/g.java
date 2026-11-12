package bd0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public enum g implements Parcelable {
    DEVICE_FOUND,
    SCAN_FINISHED;

    public static final Parcelable.Creator<g> CREATOR = new Parcelable.Creator<g>() { // from class: bd0.g.a
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            return g.values()[parcel.readInt()];
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(ordinal());
    }
}
