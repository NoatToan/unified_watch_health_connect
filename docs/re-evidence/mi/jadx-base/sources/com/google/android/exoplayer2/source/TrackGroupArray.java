package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class TrackGroupArray implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TrackGroup[] f8079b;
    public int c;
    public static final TrackGroupArray EMPTY = new TrackGroupArray(new TrackGroup[0]);
    public static final Parcelable.Creator<TrackGroupArray> CREATOR = new a();

    public class a implements Parcelable.Creator<TrackGroupArray> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrackGroupArray createFromParcel(Parcel parcel) {
            return new TrackGroupArray(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TrackGroupArray[] newArray(int i) {
            return new TrackGroupArray[i];
        }
    }

    public TrackGroupArray(TrackGroup... trackGroupArr) {
        this.f8079b = trackGroupArr;
        this.f8078a = trackGroupArr.length;
    }

    public TrackGroup a(int i) {
        return this.f8079b[i];
    }

    public int c(TrackGroup trackGroup) {
        for (int i = 0; i < this.f8078a; i++) {
            if (this.f8079b[i] == trackGroup) {
                return i;
            }
        }
        return -1;
    }

    public boolean d() {
        return this.f8078a == 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroupArray.class != obj.getClass()) {
            return false;
        }
        TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
        return this.f8078a == trackGroupArray.f8078a && Arrays.equals(this.f8079b, trackGroupArray.f8079b);
    }

    public int hashCode() {
        if (this.c == 0) {
            this.c = Arrays.hashCode(this.f8079b);
        }
        return this.c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8078a);
        for (int i2 = 0; i2 < this.f8078a; i2++) {
            parcel.writeParcelable(this.f8079b[i2], 0);
        }
    }

    public TrackGroupArray(Parcel parcel) {
        int i = parcel.readInt();
        this.f8078a = i;
        this.f8079b = new TrackGroup[i];
        for (int i2 = 0; i2 < this.f8078a; i2++) {
            this.f8079b[i2] = (TrackGroup) parcel.readParcelable(TrackGroup.class.getClassLoader());
        }
    }
}
