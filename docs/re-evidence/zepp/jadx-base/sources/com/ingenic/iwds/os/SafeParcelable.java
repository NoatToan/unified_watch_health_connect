package com.ingenic.iwds.os;

/* JADX INFO: loaded from: classes18.dex */
public interface SafeParcelable {
    public static final int CONTENTS_FILE_DESCRIPTOR = 1;
    public static final int PARCELABLE_WRITE_RETURN_VALUE = 1;

    public interface ClassLoaderCreator<T> extends Creator<T> {
        T createFromParcel(SafeParcel safeParcel, ClassLoader classLoader);
    }

    public interface Creator<T> {
        T createFromParcel(SafeParcel safeParcel);

        T[] newArray(int i);
    }

    int describeContents();

    void writeToParcel(SafeParcel safeParcel, int i);
}
