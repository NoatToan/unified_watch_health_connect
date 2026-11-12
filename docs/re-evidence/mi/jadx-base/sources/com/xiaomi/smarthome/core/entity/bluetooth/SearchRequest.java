package com.xiaomi.smarthome.core.entity.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearchRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public class SearchRequest implements Parcelable {
    public static final Parcelable.Creator<SearchRequest> CREATOR = new Parcelable.Creator<SearchRequest>() { // from class: com.xiaomi.smarthome.core.entity.bluetooth.SearchRequest.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SearchRequest createFromParcel(Parcel parcel) {
            return new SearchRequest(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SearchRequest[] newArray(int i) {
            return new SearchRequest[i];
        }
    };
    protected List<SearchTask> tasks;

    public static class Builder {
        private List<SearchTask> tasks = new ArrayList();

        public SearchRequest build() {
            SearchRequest searchRequest = new SearchRequest();
            searchRequest.setTasks(this.tasks);
            return searchRequest;
        }

        public Builder searchBluetoothClassicDevice(int i) {
            SearchTask searchTask = new SearchTask();
            searchTask.setSearchType(1);
            searchTask.setSearchDuration(i);
            this.tasks.add(searchTask);
            return this;
        }

        public Builder searchBluetoothLeDevice(int i) {
            return searchBluetoothLeDevice(i, (UUID[]) null);
        }

        public Builder searchBluetoothLeDevice(int i, UUID[] uuidArr) {
            SearchTask searchTask = new SearchTask();
            searchTask.setSearchType(2);
            searchTask.setSearchDuration(i);
            searchTask.setUuids(uuidArr);
            this.tasks.add(searchTask);
            return this;
        }

        public Builder searchBluetoothClassicDevice(int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                searchBluetoothClassicDevice(i);
            }
            return this;
        }

        public Builder searchBluetoothLeDevice(int i, int i2) {
            return searchBluetoothLeDevice(i, i2, null);
        }

        public Builder searchBluetoothLeDevice(int i, int i2, UUID[] uuidArr) {
            for (int i3 = 0; i3 < i2; i3++) {
                searchBluetoothLeDevice(i, uuidArr);
            }
            return this;
        }
    }

    public SearchRequest(List<SearchTask> list) {
        this.tasks = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<SearchTask> getTasks() {
        return this.tasks;
    }

    public void setTasks(List<SearchTask> list) {
        this.tasks = list;
    }

    public BluetoothSearchRequest transform() {
        BluetoothSearchRequest.Builder builder = new BluetoothSearchRequest.Builder();
        List<SearchTask> list = this.tasks;
        if (list != null) {
            for (SearchTask searchTask : list) {
                if (searchTask.getSearchType() == 2) {
                    builder.searchBluetoothLeDevice(searchTask.getSearchDuration());
                } else if (searchTask.getSearchType() == 1) {
                    builder.searchBluetoothClassicDevice(searchTask.getSearchDuration());
                }
            }
        }
        return builder.build();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.tasks);
    }

    public SearchRequest() {
    }

    public SearchRequest(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.tasks = arrayList;
        parcel.readTypedList(arrayList, SearchTask.CREATOR);
    }
}
