package com.xiaomi.ai.edge.resourcesmanager.beans;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class DownloadFileInfo implements Parcelable {
    public static final Parcelable.Creator<DownloadFileInfo> CREATOR = new a();
    public static final int RESULT_CODE_CORE_VERSION_NOT_MATCH = 207;
    public static final int RESULT_CODE_DEVICE_ID_IN_BLACK_LIST = 202;
    public static final int RESULT_CODE_DEVICE_ID_NOT_IN_WHITE_LIST = 203;
    public static final int RESULT_CODE_FILE_NOT_EXISTED = 201;
    public static final int RESULT_CODE_LARGE_SIZE = 0;
    public static final int RESULT_CODE_NOT_VERSION_TO_MATCH = 209;
    public static final int RESULT_CODE_OCCUR_EXCEPTION = 1;
    public static final int RESULT_CODE_OS_VERSION_NOT_MATCH = 206;
    public static final int RESULT_CODE_PHONE_NAME_VERSION_NOT_MATCH = 208;
    public static final int RESULT_CODE_PKG_NOT_MATCH = 204;
    public static final int RESULT_CODE_PKG_VERSION_NOT_MATCH = 205;
    public static final int RESULT_CODE_REQUEST_INFO_ERROR = 3;
    public static final int RESULT_CODE_RESOURCE_DELETED = -3;
    public static final int RESULT_CODE_RESOURCE_VERSION_ERROR = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11041b;
    public long c;
    public String d;
    public int e;
    public boolean f;
    public String g;
    public String h;
    public int i;
    public int j;

    public static class a implements Parcelable.Creator<DownloadFileInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DownloadFileInfo createFromParcel(Parcel parcel) {
            return new DownloadFileInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DownloadFileInfo[] newArray(int i) {
            return new DownloadFileInfo[i];
        }
    }

    public DownloadFileInfo() {
        this.e = -1;
        this.i = -1;
        this.j = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "fileName = " + this.h + "\ndownloadResultSucc = " + this.f + "\ndownloadFailReason = " + this.g + "\nprocess = " + this.j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11040a);
        parcel.writeString(this.f11041b);
        parcel.writeString(this.d);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.e);
        parcel.writeLong(this.c);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
    }

    public DownloadFileInfo(Parcel parcel) {
        this.e = -1;
        this.i = -1;
        this.j = 0;
        this.f11040a = parcel.readString();
        this.f11041b = parcel.readString();
        this.d = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.e = parcel.readInt();
        this.c = parcel.readLong();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.f = parcel.readByte() != 0;
    }
}
