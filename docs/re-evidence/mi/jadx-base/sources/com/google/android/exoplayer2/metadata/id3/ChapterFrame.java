package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.wlq;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new a();
    public static final String ID = "CHAP";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8001b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final Id3Frame[] g;

    public class a implements Parcelable.Creator<ChapterFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ChapterFrame createFromParcel(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ChapterFrame[] newArray(int i) {
            return new ChapterFrame[i];
        }
    }

    public ChapterFrame(String str, int i, int i2, long j, long j2, Id3Frame[] id3FrameArr) {
        super(ID);
        this.f8001b = str;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = id3FrameArr;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterFrame.class != obj.getClass()) {
            return false;
        }
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        return this.c == chapterFrame.c && this.d == chapterFrame.d && this.e == chapterFrame.e && this.f == chapterFrame.f && wlq.c(this.f8001b, chapterFrame.f8001b) && Arrays.equals(this.g, chapterFrame.g);
    }

    public int hashCode() {
        int i = (((((((527 + this.c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31;
        String str = this.f8001b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8001b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        parcel.writeInt(this.g.length);
        for (Id3Frame id3Frame : this.g) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterFrame(Parcel parcel) {
        super(ID);
        this.f8001b = (String) wlq.j(parcel.readString());
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readLong();
        this.f = parcel.readLong();
        int i = parcel.readInt();
        this.g = new Id3Frame[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.g[i2] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
