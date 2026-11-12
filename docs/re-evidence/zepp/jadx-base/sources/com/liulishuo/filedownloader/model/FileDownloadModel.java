package com.liulishuo.filedownloader.model;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.liulishuo.filedownloader.util.FileDownloadUtils;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes18.dex */
public class FileDownloadModel implements Parcelable {
    public static final String CONNECTION_COUNT = "connectionCount";
    public static final Parcelable.Creator<FileDownloadModel> CREATOR = new a();
    public static final int DEFAULT_CALLBACK_PROGRESS_TIMES = 100;
    public static final String ERR_MSG = "errMsg";
    public static final String ETAG = "etag";
    public static final String FILENAME = "filename";
    public static final String ID = "_id";
    public static final String PATH = "path";
    public static final String PATH_AS_DIRECTORY = "pathAsDirectory";
    public static final String SOFAR = "sofar";
    public static final String STATUS = "status";
    public static final String TOTAL = "total";
    public static final int TOTAL_VALUE_IN_CHUNKED_RESOURCE = -1;
    public static final String URL = "url";
    private int a;
    private String b;
    private String c;
    private boolean d;
    private String e;
    private final AtomicInteger f;
    private final AtomicLong g;
    private long h;
    private String i;
    private String j;
    private int k;
    private boolean l;

    public static class a implements Parcelable.Creator<FileDownloadModel> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FileDownloadModel createFromParcel(Parcel parcel) {
            return new FileDownloadModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FileDownloadModel[] newArray(int i) {
            return new FileDownloadModel[i];
        }
    }

    public FileDownloadModel() {
        this.g = new AtomicLong();
        this.f = new AtomicInteger();
    }

    public void deleteTargetFile() {
        String targetFilePath = getTargetFilePath();
        if (targetFilePath != null) {
            File file = new File(targetFilePath);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public void deleteTaskFiles() {
        deleteTempFile();
        deleteTargetFile();
    }

    public void deleteTempFile() {
        String tempFilePath = getTempFilePath();
        if (tempFilePath != null) {
            File file = new File(tempFilePath);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getConnectionCount() {
        return this.k;
    }

    public String getETag() {
        return this.j;
    }

    public String getErrMsg() {
        return this.i;
    }

    public String getFilename() {
        return this.e;
    }

    public int getId() {
        return this.a;
    }

    public String getPath() {
        return this.c;
    }

    public long getSoFar() {
        return this.g.get();
    }

    public byte getStatus() {
        return (byte) this.f.get();
    }

    public String getTargetFilePath() {
        return FileDownloadUtils.getTargetFilePath(getPath(), isPathAsDirectory(), getFilename());
    }

    public String getTempFilePath() {
        if (getTargetFilePath() == null) {
            return null;
        }
        return FileDownloadUtils.getTempPath(getTargetFilePath());
    }

    public long getTotal() {
        return this.h;
    }

    public String getUrl() {
        return this.b;
    }

    public void increaseSoFar(long j) {
        this.g.addAndGet(j);
    }

    public boolean isChunked() {
        return this.h == -1;
    }

    public boolean isLargeFile() {
        return this.l;
    }

    public boolean isPathAsDirectory() {
        return this.d;
    }

    public void resetConnectionCount() {
        this.k = 1;
    }

    public void setConnectionCount(int i) {
        this.k = i;
    }

    public void setETag(String str) {
        this.j = str;
    }

    public void setErrMsg(String str) {
        this.i = str;
    }

    public void setFilename(String str) {
        this.e = str;
    }

    public void setId(int i) {
        this.a = i;
    }

    public void setPath(String str, boolean z) {
        this.c = str;
        this.d = z;
    }

    public void setSoFar(long j) {
        this.g.set(j);
    }

    public void setStatus(byte b) {
        this.f.set(b);
    }

    public void setTotal(long j) {
        this.l = j > ParserMinimalBase.MAX_INT_L;
        this.h = j;
    }

    public void setUrl(String str) {
        this.b = str;
    }

    public ContentValues toContentValues() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", Integer.valueOf(getId()));
        contentValues.put("url", getUrl());
        contentValues.put("path", getPath());
        contentValues.put("status", Byte.valueOf(getStatus()));
        contentValues.put(SOFAR, Long.valueOf(getSoFar()));
        contentValues.put("total", Long.valueOf(getTotal()));
        contentValues.put(ERR_MSG, getErrMsg());
        contentValues.put(ETAG, getETag());
        contentValues.put(CONNECTION_COUNT, Integer.valueOf(getConnectionCount()));
        contentValues.put(PATH_AS_DIRECTORY, Boolean.valueOf(isPathAsDirectory()));
        if (isPathAsDirectory() && getFilename() != null) {
            contentValues.put(FILENAME, getFilename());
        }
        return contentValues;
    }

    public String toString() {
        return FileDownloadUtils.formatString("id[%d], url[%s], path[%s], status[%d], sofar[%s], total[%d], etag[%s], %s", Integer.valueOf(this.a), this.b, this.c, Integer.valueOf(this.f.get()), this.g, Long.valueOf(this.h), this.j, super.toString());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeString(this.e);
        parcel.writeByte((byte) this.f.get());
        parcel.writeLong(this.g.get());
        parcel.writeLong(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeInt(this.k);
        parcel.writeByte(this.l ? (byte) 1 : (byte) 0);
    }

    public FileDownloadModel(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readByte() != 0;
        this.e = parcel.readString();
        this.f = new AtomicInteger(parcel.readByte());
        this.g = new AtomicLong(parcel.readLong());
        this.h = parcel.readLong();
        this.i = parcel.readString();
        this.j = parcel.readString();
        this.k = parcel.readInt();
        this.l = parcel.readByte() != 0;
    }
}
