package com.tencent.mmkv;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class ParcelableMMKV implements Parcelable {
    public static final Parcelable.Creator<ParcelableMMKV> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10717b;
    public int c;
    public String d;

    public class a implements Parcelable.Creator<ParcelableMMKV> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableMMKV createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            Parcelable.Creator creator = ParcelFileDescriptor.CREATOR;
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) creator.createFromParcel(parcel);
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) creator.createFromParcel(parcel);
            String string2 = parcel.readString();
            if (parcelFileDescriptor == null || parcelFileDescriptor2 == null) {
                return null;
            }
            return new ParcelableMMKV(string, parcelFileDescriptor.detachFd(), parcelFileDescriptor2.detachFd(), string2, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableMMKV[] newArray(int i) {
            return new ParcelableMMKV[i];
        }
    }

    public /* synthetic */ ParcelableMMKV(String str, int i, int i2, String str2, a aVar) {
        this(str, i, i2, str2);
    }

    public MMKV a() {
        int i;
        int i2 = this.f10717b;
        if (i2 < 0 || (i = this.c) < 0) {
            return null;
        }
        return MMKV.E(this.f10716a, i2, i, this.d);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeString(this.f10716a);
            ParcelFileDescriptor parcelFileDescriptorFromFd = ParcelFileDescriptor.fromFd(this.f10717b);
            ParcelFileDescriptor parcelFileDescriptorFromFd2 = ParcelFileDescriptor.fromFd(this.c);
            int i2 = i | 1;
            parcelFileDescriptorFromFd.writeToParcel(parcel, i2);
            parcelFileDescriptorFromFd2.writeToParcel(parcel, i2);
            String str = this.d;
            if (str != null) {
                parcel.writeString(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ParcelableMMKV(MMKV mmkv) {
        this.f10717b = -1;
        this.c = -1;
        this.d = null;
        this.f10716a = mmkv.mmapID();
        this.f10717b = mmkv.ashmemFD();
        this.c = mmkv.ashmemMetaFD();
        this.d = mmkv.cryptKey();
    }

    public ParcelableMMKV(String str, int i, int i2, String str2) {
        this.f10716a = str;
        this.f10717b = i;
        this.c = i2;
        this.d = str2;
    }
}
