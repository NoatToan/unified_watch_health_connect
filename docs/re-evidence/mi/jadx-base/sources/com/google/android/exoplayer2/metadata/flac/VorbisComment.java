package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import defpackage.wlq;

/* JADX INFO: loaded from: classes4.dex */
public final class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7994b;

    public class a implements Parcelable.Creator<VorbisComment> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public VorbisComment createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public VorbisComment[] newArray(int i) {
            return new VorbisComment[i];
        }
    }

    public VorbisComment(String str, String str2) {
        this.f7993a = str;
        this.f7994b = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || VorbisComment.class != obj.getClass()) {
            return false;
        }
        VorbisComment vorbisComment = (VorbisComment) obj;
        return this.f7993a.equals(vorbisComment.f7993a) && this.f7994b.equals(vorbisComment.f7994b);
    }

    public int hashCode() {
        return ((527 + this.f7993a.hashCode()) * 31) + this.f7994b.hashCode();
    }

    public String toString() {
        String str = this.f7993a;
        String str2 = this.f7994b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb.append("VC: ");
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7993a);
        parcel.writeString(this.f7994b);
    }

    public VorbisComment(Parcel parcel) {
        this.f7993a = (String) wlq.j(parcel.readString());
        this.f7994b = (String) wlq.j(parcel.readString());
    }
}
