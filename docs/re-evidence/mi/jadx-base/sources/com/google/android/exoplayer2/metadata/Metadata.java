package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.n;
import defpackage.wlq;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Entry[] f7985a;

    public interface Entry extends Parcelable {
        default byte[] N() {
            return null;
        }

        default Format U() {
            return null;
        }

        default void y(n.b bVar) {
        }
    }

    public class a implements Parcelable.Creator<Metadata> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Metadata createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Metadata[] newArray(int i) {
            return new Metadata[i];
        }
    }

    public Metadata(Entry... entryArr) {
        this.f7985a = entryArr;
    }

    public Metadata a(Entry... entryArr) {
        return entryArr.length == 0 ? this : new Metadata((Entry[]) wlq.z0(this.f7985a, entryArr));
    }

    public Metadata c(Metadata metadata) {
        return metadata == null ? this : a(metadata.f7985a);
    }

    public Entry d(int i) {
        return this.f7985a[i];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f7985a.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f7985a, ((Metadata) obj).f7985a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f7985a);
    }

    public String toString() {
        String strValueOf = String.valueOf(Arrays.toString(this.f7985a));
        return strValueOf.length() != 0 ? "entries=".concat(strValueOf) : new String("entries=");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7985a.length);
        for (Entry entry : this.f7985a) {
            parcel.writeParcelable(entry, 0);
        }
    }

    public Metadata(List<? extends Entry> list) {
        this.f7985a = (Entry[]) list.toArray(new Entry[0]);
    }

    public Metadata(Parcel parcel) {
        this.f7985a = new Entry[parcel.readInt()];
        int i = 0;
        while (true) {
            Entry[] entryArr = this.f7985a;
            if (i >= entryArr.length) {
                return;
            }
            entryArr[i] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
            i++;
        }
    }
}
