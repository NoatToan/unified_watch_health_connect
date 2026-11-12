package com.xiaomi.smarthome.core.entity.net;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class NetRequest implements Parcelable {
    public static final Parcelable.Creator<NetRequest> CREATOR = new Parcelable.Creator<NetRequest>() { // from class: com.xiaomi.smarthome.core.entity.net.NetRequest.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NetRequest createFromParcel(Parcel parcel) {
            return new NetRequest(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NetRequest[] newArray(int i) {
            return new NetRequest[i];
        }
    };
    public static final String METHOD_GET = "GET";
    public static final String METHOD_POST = "POST";
    private List<KeyValuePair> mFilePaths;
    private List<KeyValuePair> mHeaders;
    private String mMethod;
    private String mPath;
    private String mPrefix;
    private List<KeyValuePair> mQueryParams;

    public static class Builder {
        private String method;
        private String path;
        private String prefix;
        private List<KeyValuePair> headers = new ArrayList(8);
        private List<KeyValuePair> queryParams = new ArrayList(8);
        private List<KeyValuePair> filePaths = new ArrayList(4);

        public Builder addFilePaths(List<KeyValuePair> list) {
            if (list == null) {
                throw new IllegalArgumentException("filePaths == null");
            }
            this.filePaths = list;
            return this;
        }

        public Builder addHeaders(List<KeyValuePair> list) {
            if (list == null) {
                throw new IllegalArgumentException("headers == null");
            }
            this.headers = list;
            return this;
        }

        public Builder addQueries(List<KeyValuePair> list) {
            if (list == null) {
                throw new IllegalArgumentException("queries == null");
            }
            this.queryParams = list;
            return this;
        }

        public NetRequest build() {
            return new NetRequest(this);
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

        public Builder prefix(String str) {
            if (str == null) {
                throw new IllegalArgumentException("prefix == null");
            }
            this.prefix = str;
            return this;
        }
    }

    public NetRequest(Builder builder) {
        this.mMethod = builder.method;
        this.mPath = builder.path;
        this.mPrefix = builder.prefix;
        this.mHeaders = builder.headers;
        this.mQueryParams = builder.queryParams;
        this.mFilePaths = builder.filePaths;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<KeyValuePair> getFilePaths() {
        return this.mFilePaths;
    }

    public List<KeyValuePair> getHeaders() {
        return this.mHeaders;
    }

    public String getMethod() {
        return this.mMethod;
    }

    public String getPath() {
        return this.mPath;
    }

    public String getPrefix() {
        return this.mPrefix;
    }

    public List<KeyValuePair> getQueryParams() {
        return this.mQueryParams;
    }

    public String toFullString() {
        return "prefix:" + this.mPrefix + "path:" + this.mPath + " method:" + this.mMethod + " params:" + this.mQueryParams + " headers:" + this.mHeaders + " filepaths:" + this.mFilePaths;
    }

    public String toString() {
        return "prefix:" + this.mPrefix + "path:" + this.mPath + " method:" + this.mMethod + " params:" + this.mQueryParams;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mMethod);
        parcel.writeString(this.mPath);
        parcel.writeString(this.mPrefix);
        parcel.writeTypedList(this.mHeaders);
        parcel.writeTypedList(this.mQueryParams);
        parcel.writeTypedList(this.mFilePaths);
    }

    public NetRequest(Parcel parcel) {
        this.mMethod = parcel.readString();
        this.mPath = parcel.readString();
        this.mPrefix = parcel.readString();
        Parcelable.Creator<KeyValuePair> creator = KeyValuePair.CREATOR;
        this.mHeaders = parcel.createTypedArrayList(creator);
        this.mQueryParams = parcel.createTypedArrayList(creator);
        this.mFilePaths = parcel.createTypedArrayList(creator);
    }
}
