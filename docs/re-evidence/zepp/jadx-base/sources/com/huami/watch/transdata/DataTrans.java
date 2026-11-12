package com.huami.watch.transdata;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes16.dex */
public class DataTrans implements Parcelable {
    public static final Parcelable.Creator<DataTrans> CREATOR = new a();
    public static final String HEADERS_DATA_TYPE = "dataType";
    public static final String HEADERS_SESSION_ID = "sessionId";
    public static final String HEADERS_SUB_TYPE = "subType";
    private byte[] a;
    private String b;
    private HashMap<String, String> c;
    private int d;

    public static final class a implements Parcelable.Creator<DataTrans> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DataTrans createFromParcel(Parcel parcel) {
            return new DataTrans(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DataTrans[] newArray(int i) {
            return new DataTrans[i];
        }
    }

    public DataTrans(Parcel parcel) {
        this.a = parcel.createByteArray();
        this.b = parcel.readString();
        this.d = parcel.readInt();
        this.c = parcel.readHashMap(HashMap.class.getClassLoader());
    }

    public DataTrans(String str, int i) {
        this.b = str;
        this.d = i;
    }

    public DataTrans(byte[] bArr, String str, int i) {
        this.a = getDataWithGZip(bArr);
        this.b = str;
        this.d = i;
    }

    public static byte[] unZipData(byte[] bArr) {
        return ZipUtil.unZip(bArr);
    }

    public void addHeader(String str, String str2) {
        if (this.c == null) {
            this.c = new HashMap<>();
        }
        this.c.put(str, str2);
    }

    public HashMap<String, String> addPublicHeaders(String str) {
        addHeader("dataType", this.b);
        addHeader("subType", String.valueOf(this.d));
        addHeader("sessionId", str);
        return this.c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte[] getData() {
        return this.a;
    }

    public byte[] getDataWithGZip(byte[] bArr) {
        if (bArr != null) {
            return ZipUtil.gZip(bArr);
        }
        return null;
    }

    public byte[] getDataWithZip(byte[] bArr) {
        if (bArr != null) {
            return ZipUtil.zip(bArr);
        }
        return null;
    }

    public HashMap<String, String> getHeaders() {
        return this.c;
    }

    public LinkedHashMap getSendHeaders() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap<String, String> map = this.c;
        if (map != null && map.size() > 0) {
            linkedHashMap.putAll(this.c);
        }
        return linkedHashMap;
    }

    public void setData(byte[] bArr) {
        setData(bArr, true);
    }

    public void setData(byte[] bArr, boolean z) {
        if (z) {
            this.a = getDataWithGZip(bArr);
        } else {
            this.a = bArr;
        }
    }

    public void setDataType(String str) {
        this.b = str;
    }

    public void setSubType(int i) {
        this.d = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.d);
        parcel.writeMap(this.c);
    }
}
