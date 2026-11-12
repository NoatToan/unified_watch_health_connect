package androidx.work.multiprocess.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkTypeConverters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public class ParcelableWorkInfo implements Parcelable {
    private final WorkInfo mWorkInfo;
    private static final String[] sEMPTY = new String[0];
    public static final Parcelable.Creator<ParcelableWorkInfo> CREATOR = new Parcelable.Creator<ParcelableWorkInfo>() { // from class: androidx.work.multiprocess.parcelable.ParcelableWorkInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableWorkInfo createFromParcel(Parcel parcel) {
            return new ParcelableWorkInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableWorkInfo[] newArray(int i) {
            return new ParcelableWorkInfo[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ParcelableWorkInfo(WorkInfo workInfo) {
        this.mWorkInfo = workInfo;
    }

    protected ParcelableWorkInfo(Parcel parcel) {
        this.mWorkInfo = new WorkInfo(UUID.fromString(parcel.readString()), WorkTypeConverters.intToState(parcel.readInt()), new HashSet(Arrays.asList(parcel.createStringArray())), new ParcelableData(parcel).getData(), new ParcelableData(parcel).getData(), parcel.readInt(), parcel.readInt());
    }

    public WorkInfo getWorkInfo() {
        return this.mWorkInfo;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mWorkInfo.getId().toString());
        parcel.writeInt(WorkTypeConverters.stateToInt(this.mWorkInfo.getState()));
        new ParcelableData(this.mWorkInfo.getOutputData()).writeToParcel(parcel, i);
        parcel.writeStringArray((String[]) new ArrayList(this.mWorkInfo.getTags()).toArray(sEMPTY));
        new ParcelableData(this.mWorkInfo.getProgress()).writeToParcel(parcel, i);
        parcel.writeInt(this.mWorkInfo.getRunAttemptCount());
        parcel.writeInt(this.mWorkInfo.getGeneration());
    }
}
