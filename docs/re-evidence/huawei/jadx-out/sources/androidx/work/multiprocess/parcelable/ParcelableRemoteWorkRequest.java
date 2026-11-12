package androidx.work.multiprocess.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.WorkerParameters;

/* JADX INFO: loaded from: classes4.dex */
public class ParcelableRemoteWorkRequest implements Parcelable {
    public static final Parcelable.Creator<ParcelableRemoteWorkRequest> CREATOR = new Parcelable.Creator<ParcelableRemoteWorkRequest>() { // from class: androidx.work.multiprocess.parcelable.ParcelableRemoteWorkRequest.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableRemoteWorkRequest createFromParcel(Parcel parcel) {
            return new ParcelableRemoteWorkRequest(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableRemoteWorkRequest[] newArray(int i) {
            return new ParcelableRemoteWorkRequest[i];
        }
    };
    private final ParcelableWorkerParameters mParcelableWorkerParameters;
    private final String mWorkerClassName;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ParcelableRemoteWorkRequest(String str, WorkerParameters workerParameters) {
        this.mWorkerClassName = str;
        this.mParcelableWorkerParameters = new ParcelableWorkerParameters(workerParameters);
    }

    protected ParcelableRemoteWorkRequest(Parcel parcel) {
        this.mWorkerClassName = parcel.readString();
        this.mParcelableWorkerParameters = new ParcelableWorkerParameters(parcel);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mWorkerClassName);
        this.mParcelableWorkerParameters.writeToParcel(parcel, i);
    }

    public String getWorkerClassName() {
        return this.mWorkerClassName;
    }

    public ParcelableWorkerParameters getParcelableWorkerParameters() {
        return this.mParcelableWorkerParameters;
    }
}
