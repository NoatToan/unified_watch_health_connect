package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.wlq;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new a();
    public static final String ID = "CTOC";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8002b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final Id3Frame[] f;

    public class a implements Parcelable.Creator<ChapterTocFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ChapterTocFrame createFromParcel(Parcel parcel) {
            return new ChapterTocFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ChapterTocFrame[] newArray(int i) {
            return new ChapterTocFrame[i];
        }
    }

    public ChapterTocFrame(String str, boolean z, boolean z2, String[] strArr, Id3Frame[] id3FrameArr) {
        super(ID);
        this.f8002b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = id3FrameArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        return this.c == chapterTocFrame.c && this.d == chapterTocFrame.d && wlq.c(this.f8002b, chapterTocFrame.f8002b) && Arrays.equals(this.e, chapterTocFrame.e) && Arrays.equals(this.f, chapterTocFrame.f);
    }

    public int hashCode() {
        int i = (((527 + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f8002b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8002b);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.e);
        parcel.writeInt(this.f.length);
        for (Id3Frame id3Frame : this.f) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterTocFrame(Parcel parcel) {
        super(ID);
        this.f8002b = (String) wlq.j(parcel.readString());
        this.c = parcel.readByte() != 0;
        this.d = parcel.readByte() != 0;
        this.e = (String[]) wlq.j(parcel.createStringArray());
        int i = parcel.readInt();
        this.f = new Id3Frame[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f[i2] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
