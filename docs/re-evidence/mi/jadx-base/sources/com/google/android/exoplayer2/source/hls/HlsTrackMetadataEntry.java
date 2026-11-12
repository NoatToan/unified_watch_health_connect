package com.google.android.exoplayer2.source.hls;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class HlsTrackMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<HlsTrackMetadataEntry> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8142b;
    public final List<VariantInfo> c;

    public class a implements Parcelable.Creator<HlsTrackMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HlsTrackMetadataEntry createFromParcel(Parcel parcel) {
            return new HlsTrackMetadataEntry(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public HlsTrackMetadataEntry[] newArray(int i) {
            return new HlsTrackMetadataEntry[i];
        }
    }

    public HlsTrackMetadataEntry(String str, String str2, List<VariantInfo> list) {
        this.f8141a = str;
        this.f8142b = str2;
        this.c = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || HlsTrackMetadataEntry.class != obj.getClass()) {
            return false;
        }
        HlsTrackMetadataEntry hlsTrackMetadataEntry = (HlsTrackMetadataEntry) obj;
        return TextUtils.equals(this.f8141a, hlsTrackMetadataEntry.f8141a) && TextUtils.equals(this.f8142b, hlsTrackMetadataEntry.f8142b) && this.c.equals(hlsTrackMetadataEntry.c);
    }

    public int hashCode() {
        String str = this.f8141a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f8142b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.c.hashCode();
    }

    public String toString() {
        String string;
        String str = this.f8141a;
        if (str != null) {
            String str2 = this.f8142b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
            sb.append(" [");
            sb.append(str);
            sb.append(", ");
            sb.append(str2);
            sb.append("]");
            string = sb.toString();
        } else {
            string = "";
        }
        String strValueOf = String.valueOf(string);
        return strValueOf.length() != 0 ? "HlsTrackMetadataEntry".concat(strValueOf) : new String("HlsTrackMetadataEntry");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8141a);
        parcel.writeString(this.f8142b);
        int size = this.c.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeParcelable(this.c.get(i2), 0);
        }
    }

    public HlsTrackMetadataEntry(Parcel parcel) {
        this.f8141a = parcel.readString();
        this.f8142b = parcel.readString();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add((VariantInfo) parcel.readParcelable(VariantInfo.class.getClassLoader()));
        }
        this.c = Collections.unmodifiableList(arrayList);
    }

    public static final class VariantInfo implements Parcelable {
        public static final Parcelable.Creator<VariantInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8144b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        public class a implements Parcelable.Creator<VariantInfo> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public VariantInfo createFromParcel(Parcel parcel) {
                return new VariantInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public VariantInfo[] newArray(int i) {
                return new VariantInfo[i];
            }
        }

        public VariantInfo(int i, int i2, String str, String str2, String str3, String str4) {
            this.f8143a = i;
            this.f8144b = i2;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || VariantInfo.class != obj.getClass()) {
                return false;
            }
            VariantInfo variantInfo = (VariantInfo) obj;
            return this.f8143a == variantInfo.f8143a && this.f8144b == variantInfo.f8144b && TextUtils.equals(this.c, variantInfo.c) && TextUtils.equals(this.d, variantInfo.d) && TextUtils.equals(this.e, variantInfo.e) && TextUtils.equals(this.f, variantInfo.f);
        }

        public int hashCode() {
            int i = ((this.f8143a * 31) + this.f8144b) * 31;
            String str = this.c;
            int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.d;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.e;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f8143a);
            parcel.writeInt(this.f8144b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
        }

        public VariantInfo(Parcel parcel) {
            this.f8143a = parcel.readInt();
            this.f8144b = parcel.readInt();
            this.c = parcel.readString();
            this.d = parcel.readString();
            this.e = parcel.readString();
            this.f = parcel.readString();
        }
    }
}
