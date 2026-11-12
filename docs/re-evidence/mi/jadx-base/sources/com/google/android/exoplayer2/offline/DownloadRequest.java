package com.google.android.exoplayer2.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.wlq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f8043b;
    public final String c;
    public final List<StreamKey> d;
    public final byte[] e;
    public final String f;
    public final byte[] g;

    public static class UnsupportedRequestException extends IOException {
    }

    public class a implements Parcelable.Creator<DownloadRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DownloadRequest createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DownloadRequest[] newArray(int i) {
            return new DownloadRequest[i];
        }
    }

    public DownloadRequest(Parcel parcel) {
        this.f8042a = (String) wlq.j(parcel.readString());
        this.f8043b = Uri.parse((String) wlq.j(parcel.readString()));
        this.c = parcel.readString();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.d = Collections.unmodifiableList(arrayList);
        this.e = parcel.createByteArray();
        this.f = parcel.readString();
        this.g = (byte[]) wlq.j(parcel.createByteArray());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        return this.f8042a.equals(downloadRequest.f8042a) && this.f8043b.equals(downloadRequest.f8043b) && wlq.c(this.c, downloadRequest.c) && this.d.equals(downloadRequest.d) && Arrays.equals(this.e, downloadRequest.e) && wlq.c(this.f, downloadRequest.f) && Arrays.equals(this.g, downloadRequest.g);
    }

    public final int hashCode() {
        int iHashCode = ((this.f8042a.hashCode() * 961) + this.f8043b.hashCode()) * 31;
        String str = this.c;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + Arrays.hashCode(this.e)) * 31;
        String str2 = this.f;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.g);
    }

    public String toString() {
        String str = this.c;
        String str2 = this.f8042a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8042a);
        parcel.writeString(this.f8043b.toString());
        parcel.writeString(this.c);
        parcel.writeInt(this.d.size());
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            parcel.writeParcelable(this.d.get(i2), 0);
        }
        parcel.writeByteArray(this.e);
        parcel.writeString(this.f);
        parcel.writeByteArray(this.g);
    }
}
