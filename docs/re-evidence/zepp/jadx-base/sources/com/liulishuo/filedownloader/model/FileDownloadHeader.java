package com.liulishuo.filedownloader.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes18.dex */
public class FileDownloadHeader implements Parcelable {
    public static final Parcelable.Creator<FileDownloadHeader> CREATOR = new a();
    private HashMap<String, List<String>> a;

    public static class a implements Parcelable.Creator<FileDownloadHeader> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FileDownloadHeader createFromParcel(Parcel parcel) {
            return new FileDownloadHeader(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FileDownloadHeader[] newArray(int i) {
            return new FileDownloadHeader[i];
        }
    }

    public FileDownloadHeader() {
    }

    public void add(String str, String str2) {
        Objects.requireNonNull(str, "name == null");
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        Objects.requireNonNull(str2, "value == null");
        if (this.a == null) {
            this.a = new HashMap<>();
        }
        List<String> arrayList = this.a.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.a.put(str, arrayList);
        }
        if (arrayList.contains(str2)) {
            return;
        }
        arrayList.add(str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public HashMap<String, List<String>> getHeaders() {
        return this.a;
    }

    public void removeAll(String str) {
        HashMap<String, List<String>> map = this.a;
        if (map == null) {
            return;
        }
        map.remove(str);
    }

    public String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.a);
    }

    public FileDownloadHeader(Parcel parcel) {
        this.a = parcel.readHashMap(String.class.getClassLoader());
    }

    public void add(String str) {
        String[] strArrSplit = str.split(":");
        add(strArrSplit[0].trim(), strArrSplit[1].trim());
    }
}
