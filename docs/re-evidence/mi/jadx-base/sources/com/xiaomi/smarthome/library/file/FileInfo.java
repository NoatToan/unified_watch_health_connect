package com.xiaomi.smarthome.library.file;

import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class FileInfo implements Parcelable {
    public static final Parcelable.Creator<FileInfo> CREATOR = new Parcelable.Creator<FileInfo>() { // from class: com.xiaomi.smarthome.library.file.FileInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FileInfo createFromParcel(Parcel parcel) {
            FileInfo fileInfo = new FileInfo();
            fileInfo.mIsLocal = parcel.readByte() != 0;
            fileInfo.mIsDirectory = parcel.readByte() != 0;
            fileInfo.mCount = parcel.readInt();
            fileInfo.mPath = parcel.readString();
            fileInfo.mName = parcel.readString();
            fileInfo.mSize = parcel.readLong();
            fileInfo.mModifiedDate = parcel.readLong();
            fileInfo.mIsHidden = parcel.readByte() != 0;
            fileInfo.mHasThumb = parcel.readByte() != 0;
            fileInfo.mSyncStatus = parcel.readString();
            return fileInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FileInfo[] newArray(int i) {
            return new FileInfo[i];
        }
    };
    private int mCount;
    private boolean mHasThumb;
    private boolean mIsDirectory;
    private boolean mIsHidden;
    private boolean mIsLocal;
    private boolean mIsShared;
    private long mModifiedDate;
    private String mName;
    private String mPath;
    private long mSize;
    private String mSyncStatus;

    public static FileInfo getFileInfo(Cursor cursor) {
        if (cursor == null || cursor.getCount() == 0) {
            return null;
        }
        return getFileInfo(cursor.getString(1));
    }

    public static FileInfo parseFromJson(String str, JSONObject jSONObject) throws JSONException {
        FileInfo fileInfo = new FileInfo();
        fileInfo.mIsLocal = false;
        fileInfo.mName = jSONObject.getString("name");
        if (jSONObject.getInt("type") == 1) {
            fileInfo.mIsDirectory = true;
        }
        fileInfo.mModifiedDate = jSONObject.getLong("modifyTime") * 1000;
        fileInfo.mCount = jSONObject.getInt("itemsCount");
        fileInfo.mSize = jSONObject.getLong(MediaStoreUtil.MediaInfo.SIZE);
        fileInfo.mHasThumb = jSONObject.optBoolean("canHasThumb");
        fileInfo.mIsHidden = jSONObject.optBoolean("ishidden");
        fileInfo.mIsShared = jSONObject.optBoolean("isShared");
        String str2 = File.separator;
        if (str.endsWith(str2)) {
            fileInfo.mPath = str + fileInfo.mName;
        } else {
            fileInfo.mPath = str + str2 + fileInfo.mName;
        }
        return fileInfo;
    }

    public int count() {
        return this.mCount;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean hasThumb() {
        return this.mHasThumb;
    }

    public boolean isDirectory() {
        return this.mIsDirectory;
    }

    public boolean isHidden() {
        return this.mIsHidden;
    }

    public boolean isLocal() {
        return this.mIsLocal;
    }

    public boolean isShared() {
        return this.mIsShared;
    }

    public long modifiedDate() {
        return this.mModifiedDate;
    }

    public String name() {
        return this.mName;
    }

    public String path() {
        return this.mPath;
    }

    public void setCount(int i) {
        this.mCount = i;
    }

    public void setHasThumb(boolean z) {
        this.mHasThumb = z;
    }

    public void setIsDirectory(boolean z) {
        this.mIsDirectory = z;
    }

    public void setIsHidden(boolean z) {
        this.mIsHidden = z;
    }

    public void setIsLocal(boolean z) {
        this.mIsLocal = z;
    }

    public void setIsShared(boolean z) {
        this.mIsShared = z;
    }

    public void setModifiedDate(long j) {
        this.mModifiedDate = j;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setPath(String str) {
        this.mPath = str;
    }

    public void setSize(long j) {
        this.mSize = j;
    }

    public void setSyncStatus(String str) {
        this.mSyncStatus = str;
    }

    public long size() {
        return this.mSize;
    }

    public String syncStatus() {
        return this.mSyncStatus;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.mIsLocal ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mIsDirectory ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mCount);
        parcel.writeString(this.mPath);
        parcel.writeString(this.mName);
        parcel.writeLong(this.mSize);
        parcel.writeLong(this.mModifiedDate);
        parcel.writeByte(this.mIsHidden ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mHasThumb ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mSyncStatus);
    }

    public static FileInfo getFileInfo(String str) {
        File file = new File(str);
        if (file.exists()) {
            return getFileInfo(file);
        }
        return null;
    }

    public static FileInfo getFileInfo(File file) {
        if (file == null || !file.exists()) {
            return null;
        }
        FileInfo fileInfo = new FileInfo();
        fileInfo.setIsLocal(true);
        fileInfo.setIsDirectory(file.isDirectory());
        fileInfo.setCount(FileUtil.getFileCount(file));
        fileInfo.setPath(file.getAbsolutePath());
        fileInfo.setName(FileUtil.getNameFromFilePath(file.getAbsolutePath()));
        fileInfo.setSize(file.length());
        fileInfo.setModifiedDate(file.lastModified());
        fileInfo.setIsHidden(file.isHidden());
        fileInfo.setIsShared(false);
        String extensionFromFileName = FileUtil.getExtensionFromFileName(fileInfo.name());
        if (!extensionFromFileName.equalsIgnoreCase("jpg") && !extensionFromFileName.equalsIgnoreCase("jpeg") && !extensionFromFileName.equalsIgnoreCase("gif") && !extensionFromFileName.equalsIgnoreCase("png") && !extensionFromFileName.equals("bmp") && !extensionFromFileName.equalsIgnoreCase("wbmp")) {
            fileInfo.setHasThumb(false);
        } else {
            fileInfo.setHasThumb(true);
        }
        return fileInfo;
    }
}
