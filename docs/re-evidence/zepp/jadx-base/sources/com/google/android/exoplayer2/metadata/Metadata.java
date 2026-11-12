package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new a();
    private final Entry[] a;

    public interface Entry extends Parcelable {
        @Nullable
        byte[] getWrappedMetadataBytes();

        @Nullable
        Format getWrappedMetadataFormat();

        void populateMediaMetadata(MediaMetadata.Builder builder);
    }

    public class a implements Parcelable.Creator<Metadata> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Metadata createFromParcel(Parcel in) {
            return new Metadata(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Metadata[] newArray(int size) {
            return new Metadata[size];
        }
    }

    public Metadata(Entry... entries) {
        this.a = entries;
    }

    public Metadata copyWithAppendedEntries(Entry... entriesToAppend) {
        return entriesToAppend.length == 0 ? this : new Metadata((Entry[]) Util.nullSafeArrayConcatenation(this.a, entriesToAppend));
    }

    public Metadata copyWithAppendedEntriesFrom(@Nullable Metadata other) {
        return other == null ? this : copyWithAppendedEntries(other.a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((Metadata) obj).a);
    }

    public Entry get(int index) {
        return this.a[index];
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public int length() {
        return this.a.length;
    }

    public String toString() {
        String strValueOf = String.valueOf(Arrays.toString(this.a));
        return strValueOf.length() != 0 ? "entries=".concat(strValueOf) : new String("entries=");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.a.length);
        for (Entry entry : this.a) {
            dest.writeParcelable(entry, 0);
        }
    }

    public Metadata(List<? extends Entry> entries) {
        this.a = (Entry[]) entries.toArray(new Entry[0]);
    }

    public Metadata(Parcel in) {
        this.a = new Entry[in.readInt()];
        int i = 0;
        while (true) {
            Entry[] entryArr = this.a;
            if (i >= entryArr.length) {
                return;
            }
            entryArr[i] = (Entry) in.readParcelable(Entry.class.getClassLoader());
            i++;
        }
    }
}
