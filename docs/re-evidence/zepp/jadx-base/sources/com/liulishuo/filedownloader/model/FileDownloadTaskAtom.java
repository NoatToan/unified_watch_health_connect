package com.liulishuo.filedownloader.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.liulishuo.filedownloader.util.FileDownloadUtils;

/* JADX INFO: loaded from: classes18.dex */
public class FileDownloadTaskAtom implements Parcelable {
    public static final Parcelable.Creator<FileDownloadTaskAtom> CREATOR = new a();
    private String a;
    private String b;
    private long c;
    private int d;

    public static class a implements Parcelable.Creator<FileDownloadTaskAtom> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FileDownloadTaskAtom createFromParcel(Parcel parcel) {
            return new FileDownloadTaskAtom(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FileDownloadTaskAtom[] newArray(int i) {
            return new FileDownloadTaskAtom[i];
        }
    }

    public FileDownloadTaskAtom(String str, String str2, long j) {
        setUrl(str);
        setPath(str2);
        setTotalBytes(j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getId() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int iGenerateId = FileDownloadUtils.generateId(getUrl(), getPath());
        this.d = iGenerateId;
        return iGenerateId;
    }

    public String getPath() {
        return this.b;
    }

    public long getTotalBytes() {
        return this.c;
    }

    public String getUrl() {
        return this.a;
    }

    public void setPath(String str) {
        this.b = str;
    }

    public void setTotalBytes(long j) {
        this.c = j;
    }

    public void setUrl(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
    }

    public FileDownloadTaskAtom(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readLong();
    }
}
