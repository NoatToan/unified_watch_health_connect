package com.xiaomi.smarthome.core.server.internal.bluetooth.blecore;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class BleNetRequest implements Parcelable {
    public static final Parcelable.Creator<BleNetRequest> CREATOR = new Parcelable.Creator<BleNetRequest>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetRequest.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BleNetRequest createFromParcel(Parcel parcel) {
            return new BleNetRequest(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BleNetRequest[] newArray(int i) {
            return new BleNetRequest[i];
        }
    };
    public static final String METHOD_GET = "GET";
    public static final String METHOD_POST = "POST";
    private String mMethod;
    private String mPath;
    private List<BleKeyValuePair> mQueryParams;

    public static class Builder {
        private String method;
        private String path;
        private List<BleKeyValuePair> queryParams = new ArrayList(8);

        public Builder addQueries(List<BleKeyValuePair> list) {
            if (list == null) {
                throw new IllegalArgumentException("queries == null");
            }
            this.queryParams = list;
            return this;
        }

        public BleNetRequest build() {
            return new BleNetRequest(this);
        }

        public Builder method(String str) {
            if (str == null) {
                throw new IllegalArgumentException("method == null");
            }
            this.method = str;
            return this;
        }

        public Builder path(String str) {
            if (str == null) {
                throw new IllegalArgumentException("url == null");
            }
            this.path = str;
            return this;
        }
    }

    public BleNetRequest(Builder builder) {
        this.mMethod = builder.method;
        this.mPath = builder.path;
        this.mQueryParams = builder.queryParams;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getMethod() {
        return this.mMethod;
    }

    public String getPath() {
        return this.mPath;
    }

    public List<BleKeyValuePair> getQueryParams() {
        return this.mQueryParams;
    }

    public String toString() {
        return "path:" + this.mPath + " method:" + this.mMethod + " params:" + this.mQueryParams;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mMethod);
        parcel.writeString(this.mPath);
        parcel.writeTypedList(this.mQueryParams);
    }

    public BleNetRequest(Parcel parcel) {
        this.mMethod = parcel.readString();
        this.mPath = parcel.readString();
        this.mQueryParams = parcel.createTypedArrayList(BleKeyValuePair.CREATOR);
    }
}
