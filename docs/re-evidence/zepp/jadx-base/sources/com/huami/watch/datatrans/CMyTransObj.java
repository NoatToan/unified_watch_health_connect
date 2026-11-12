package com.huami.watch.datatrans;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes16.dex */
public class CMyTransObj implements Parcelable {
    public static final Parcelable.Creator<CMyTransObj> CREATOR = new a();
    public Bundle mBundle;
    public String mUrl;

    public class a implements Parcelable.Creator<CMyTransObj> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CMyTransObj createFromParcel(Parcel parcel) {
            return new CMyTransObj(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CMyTransObj[] newArray(int i) {
            return new CMyTransObj[i];
        }
    }

    public CMyTransObj() {
        this.mUrl = "";
        this.mBundle = new Bundle();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mUrl);
        HashMap map = new HashMap();
        for (String str : this.mBundle.keySet()) {
            map.put(str, this.mBundle.get(str));
        }
        parcel.writeMap(map);
    }

    public CMyTransObj(Parcel parcel) {
        this.mUrl = "";
        this.mBundle = new Bundle();
        this.mUrl = parcel.readString();
        HashMap hashMap = parcel.readHashMap(HashMap.class.getClassLoader());
        Bundle bundle = new Bundle();
        for (String str : hashMap.keySet()) {
            Object obj = hashMap.get(str);
            if (obj instanceof Byte) {
                bundle.putByte(str, ((Byte) obj).byteValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof String) {
                bundle.putString(str, (String) obj);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Float) obj).floatValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof String[]) {
                bundle.putStringArray(str, (String[]) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            }
        }
        this.mBundle = bundle;
    }
}
