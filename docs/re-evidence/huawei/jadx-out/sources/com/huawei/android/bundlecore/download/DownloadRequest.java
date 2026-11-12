package com.huawei.android.bundlecore.download;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.haf.bundle.AppBundleDownloader;

/* JADX INFO: loaded from: classes22.dex */
public final class DownloadRequest implements AppBundleDownloader.DownloadRequest, Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new Parcelable.Creator<DownloadRequest>() { // from class: com.huawei.android.bundlecore.download.DownloadRequest.3
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public DownloadRequest createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public DownloadRequest[] newArray(int i) {
            return new DownloadRequest[i];
        }
    };
    private final String mFileDir;
    private final String mFileName;
    private final int mFileNum;
    private final String mModuleName;
    private final String mUrl;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private DownloadRequest(Parcel parcel) {
        this.mUrl = parcel.readString();
        this.mFileDir = parcel.readString();
        this.mFileName = parcel.readString();
        this.mModuleName = parcel.readString();
        this.mFileNum = parcel.readInt();
    }

    private DownloadRequest(d dVar) {
        this.mUrl = dVar.f5092c;
        this.mFileDir = dVar.d;
        this.mFileName = dVar.f5091b;
        this.mModuleName = dVar.f5090a;
        this.mFileNum = dVar.e;
    }

    public static d newBuilder() {
        return new d();
    }

    @Override // com.huawei.haf.bundle.AppBundleDownloader.DownloadRequest
    public String getUrl() {
        return this.mUrl;
    }

    @Override // com.huawei.haf.bundle.AppBundleDownloader.DownloadRequest
    public String getFileDir() {
        return this.mFileDir;
    }

    @Override // com.huawei.haf.bundle.AppBundleDownloader.DownloadRequest
    public String getFileName() {
        return this.mFileName;
    }

    @Override // com.huawei.haf.bundle.AppBundleDownloader.DownloadRequest
    public String getModuleName() {
        return this.mModuleName;
    }

    @Override // com.huawei.haf.bundle.AppBundleDownloader.DownloadRequest
    public int getFileNum() {
        return this.mFileNum;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mUrl);
        parcel.writeString(this.mFileDir);
        parcel.writeString(this.mFileName);
        parcel.writeString(this.mModuleName);
        parcel.writeInt(this.mFileNum);
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f5090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f5091b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f5092c;
        private String d;
        private int e;

        public d c(String str) {
            this.f5092c = str;
            return this;
        }

        public d a(String str) {
            this.d = str;
            return this;
        }

        public d b(String str) {
            this.f5091b = str;
            return this;
        }

        public d d(String str) {
            this.f5090a = str;
            return this;
        }

        public d c(int i) {
            this.e = i;
            return this;
        }

        public DownloadRequest e() {
            return new DownloadRequest(this);
        }
    }
}
