package androidx.work.multiprocess.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.Configuration;
import androidx.work.Data;
import androidx.work.ForegroundUpdater;
import androidx.work.ProgressUpdater;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.utils.WorkForegroundUpdater;
import androidx.work.impl.utils.WorkProgressUpdater;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public class ParcelableWorkerParameters implements Parcelable {
    public static final Parcelable.Creator<ParcelableWorkerParameters> CREATOR = new Parcelable.Creator<ParcelableWorkerParameters>() { // from class: androidx.work.multiprocess.parcelable.ParcelableWorkerParameters.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableWorkerParameters createFromParcel(Parcel parcel) {
            return new ParcelableWorkerParameters(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableWorkerParameters[] newArray(int i) {
            return new ParcelableWorkerParameters[i];
        }
    };
    private final Data mData;
    private final int mGeneration;
    private final UUID mId;
    private final int mRunAttemptCount;
    private final WorkerParameters.RuntimeExtras mRuntimeExtras;
    private final Set<String> mTags;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ParcelableWorkerParameters(WorkerParameters workerParameters) {
        this.mId = workerParameters.getId();
        this.mData = workerParameters.getInputData();
        this.mTags = workerParameters.getTags();
        this.mRuntimeExtras = workerParameters.getRuntimeExtras();
        this.mRunAttemptCount = workerParameters.getRunAttemptCount();
        this.mGeneration = workerParameters.getGeneration();
    }

    public ParcelableWorkerParameters(Parcel parcel) {
        this.mId = UUID.fromString(parcel.readString());
        this.mData = new ParcelableData(parcel).getData();
        this.mTags = new HashSet(parcel.createStringArrayList());
        this.mRuntimeExtras = new ParcelableRuntimeExtras(parcel).getRuntimeExtras();
        this.mRunAttemptCount = parcel.readInt();
        this.mGeneration = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId.toString());
        new ParcelableData(this.mData).writeToParcel(parcel, i);
        parcel.writeStringList(new ArrayList(this.mTags));
        new ParcelableRuntimeExtras(this.mRuntimeExtras).writeToParcel(parcel, i);
        parcel.writeInt(this.mRunAttemptCount);
        parcel.writeInt(this.mGeneration);
    }

    public UUID getId() {
        return this.mId;
    }

    public Data getData() {
        return this.mData;
    }

    public int getRunAttemptCount() {
        return this.mRunAttemptCount;
    }

    public Set<String> getTags() {
        return this.mTags;
    }

    public WorkerParameters toWorkerParameters(WorkManagerImpl workManagerImpl) {
        Configuration configuration = workManagerImpl.getConfiguration();
        WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        TaskExecutor workTaskExecutor = workManagerImpl.getWorkTaskExecutor();
        return toWorkerParameters(configuration, workTaskExecutor, new WorkProgressUpdater(workDatabase, workTaskExecutor), new WorkForegroundUpdater(workDatabase, workManagerImpl.getProcessor(), workTaskExecutor));
    }

    public WorkerParameters toWorkerParameters(Configuration configuration, TaskExecutor taskExecutor, ProgressUpdater progressUpdater, ForegroundUpdater foregroundUpdater) {
        return new WorkerParameters(this.mId, this.mData, this.mTags, this.mRuntimeExtras, this.mRunAttemptCount, this.mGeneration, configuration.getExecutor(), taskExecutor, configuration.getWorkerFactory(), progressUpdater, foregroundUpdater);
    }
}
