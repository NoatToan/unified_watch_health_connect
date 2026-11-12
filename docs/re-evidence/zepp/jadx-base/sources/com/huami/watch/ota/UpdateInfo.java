package com.huami.watch.ota;

import android.os.Parcel;
import android.os.Parcelable;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes16.dex */
public class UpdateInfo implements Parcelable {
    public static final Parcelable.Creator<UpdateInfo> CREATOR = new a();
    public static final String FORCE_UPDATE_FALSE = "false";
    public static final String FORCE_UPDATE_TRUE = "true";
    private static final String a = "UpdateInfo";
    public String alert_interval;
    public String description;
    public String force_update;
    public String index;
    public String md5;
    public String size;
    public String url;
    public String version_from;
    public String version_to;

    public class a implements Parcelable.Creator<UpdateInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UpdateInfo createFromParcel(Parcel parcel) {
            return new UpdateInfo(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public UpdateInfo[] newArray(int i) {
            return new UpdateInfo[i];
        }
    }

    public /* synthetic */ UpdateInfo(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static UpdateInfo createFromString(String str) {
        if (str.equals("")) {
            return null;
        }
        UpdateInfo updateInfo = new UpdateInfo();
        String[] strArrSplit = str.split(";");
        try {
            updateInfo.index = strArrSplit[0];
            updateInfo.version_from = strArrSplit[1];
            updateInfo.version_to = strArrSplit[2];
            updateInfo.description = strArrSplit[3];
            updateInfo.url = strArrSplit[4];
            updateInfo.size = strArrSplit[5];
            updateInfo.md5 = strArrSplit[6];
            updateInfo.force_update = strArrSplit[7];
            updateInfo.alert_interval = strArrSplit[8];
            return updateInfo;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void dump() {
        Log.i(a, "=========UpdateInfo===========", new Object[0]);
        Log.i(a, "index\t\t\t:" + this.index, new Object[0]);
        Log.i(a, "version_from\t:" + this.version_from, new Object[0]);
        Log.i(a, "version_to\t:" + this.version_to, new Object[0]);
        Log.i(a, "description\t:" + this.description, new Object[0]);
        Log.i(a, "url\t\t\t:" + this.url, new Object[0]);
        Log.i(a, "size\t\t\t:" + this.size, new Object[0]);
        Log.i(a, "md5\t\t\t:" + this.md5, new Object[0]);
        Log.i(a, "force_update\t:" + this.force_update, new Object[0]);
        Log.i(a, "alert_interval :" + this.alert_interval, new Object[0]);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.index + ";");
        sb.append(this.version_from + ";");
        sb.append(this.version_to + ";");
        sb.append(this.description + ";");
        sb.append(this.url + ";");
        sb.append(this.size + ";");
        sb.append(this.md5 + ";");
        sb.append(this.force_update + ";");
        sb.append(this.alert_interval + ";");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.index);
        parcel.writeString(this.version_from);
        parcel.writeString(this.version_to);
        parcel.writeString(this.description);
        parcel.writeString(this.url);
        parcel.writeString(this.size);
        parcel.writeString(this.md5);
        parcel.writeString(this.force_update);
        parcel.writeString(this.alert_interval);
    }

    public UpdateInfo() {
    }

    private UpdateInfo(Parcel parcel) {
        this.index = parcel.readString();
        this.version_from = parcel.readString();
        this.version_to = parcel.readString();
        this.description = parcel.readString();
        this.url = parcel.readString();
        this.size = parcel.readString();
        this.md5 = parcel.readString();
        this.force_update = parcel.readString();
        this.alert_interval = parcel.readString();
    }
}
