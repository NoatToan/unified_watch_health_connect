package com.xiaomi.smarthome.core.entity.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public class SearchTask implements Parcelable {
    public static final Parcelable.Creator<SearchTask> CREATOR = new Parcelable.Creator<SearchTask>() { // from class: com.xiaomi.smarthome.core.entity.bluetooth.SearchTask.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SearchTask createFromParcel(Parcel parcel) {
            return new SearchTask(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SearchTask[] newArray(int i) {
            return new SearchTask[i];
        }
    };
    private int searchDuration;
    private int searchType;
    private UUID[] uuids;

    public SearchTask() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getSearchDuration() {
        return this.searchDuration;
    }

    public int getSearchType() {
        return this.searchType;
    }

    public UUID[] getUuids() {
        return this.uuids;
    }

    public void setSearchDuration(int i) {
        this.searchDuration = i;
    }

    public void setSearchType(int i) {
        this.searchType = i;
    }

    public void setUuids(UUID[] uuidArr) {
        this.uuids = uuidArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Serializable, java.util.UUID[]] */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.searchType);
        parcel.writeInt(this.searchDuration);
        parcel.writeSerializable(this.uuids);
    }

    public SearchTask(Parcel parcel) {
        this.searchType = parcel.readInt();
        this.searchDuration = parcel.readInt();
        this.uuids = (UUID[]) parcel.readSerializable();
    }
}
