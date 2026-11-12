package androidx.work.multiprocess.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ParcelableWorkRequests implements Parcelable {
    public static final Parcelable.Creator<ParcelableWorkRequests> CREATOR = new Parcelable.Creator<ParcelableWorkRequests>() { // from class: androidx.work.multiprocess.parcelable.ParcelableWorkRequests.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableWorkRequests createFromParcel(Parcel parcel) {
            return new ParcelableWorkRequests(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableWorkRequests[] newArray(int i) {
            return new ParcelableWorkRequests[i];
        }
    };
    private final List<WorkRequest> mRequests;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ParcelableWorkRequests(List<WorkRequest> list) {
        this.mRequests = list;
    }

    protected ParcelableWorkRequests(Parcel parcel) {
        Parcelable[] parcelableArray = parcel.readParcelableArray(getClass().getClassLoader());
        this.mRequests = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            this.mRequests.add(((ParcelableWorkRequest) parcelable).getWorkRequest());
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ParcelableWorkRequest[] parcelableWorkRequestArr = new ParcelableWorkRequest[this.mRequests.size()];
        for (int i2 = 0; i2 < this.mRequests.size(); i2++) {
            parcelableWorkRequestArr[i2] = new ParcelableWorkRequest(this.mRequests.get(i2));
        }
        parcel.writeParcelableArray(parcelableWorkRequestArr, i);
    }

    public List<WorkRequest> getRequests() {
        return this.mRequests;
    }
}
