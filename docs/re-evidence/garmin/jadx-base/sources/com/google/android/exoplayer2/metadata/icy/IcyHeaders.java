package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.v;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new Parcelable.Creator<IcyHeaders>() { // from class: com.google.android.exoplayer2.metadata.icy.IcyHeaders.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IcyHeaders createFromParcel(Parcel parcel) {
            return new IcyHeaders(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IcyHeaders[] newArray(int i14) {
            return new IcyHeaders[i14];
        }
    };
    public static final String REQUEST_HEADER_ENABLE_METADATA_NAME = "Icy-MetaData";
    public static final String REQUEST_HEADER_ENABLE_METADATA_VALUE = "1";
    private static final String RESPONSE_HEADER_BITRATE = "icy-br";
    private static final String RESPONSE_HEADER_GENRE = "icy-genre";
    private static final String RESPONSE_HEADER_METADATA_INTERVAL = "icy-metaint";
    private static final String RESPONSE_HEADER_NAME = "icy-name";
    private static final String RESPONSE_HEADER_PUB = "icy-pub";
    private static final String RESPONSE_HEADER_URL = "icy-url";
    private static final String TAG = "IcyHeaders";
    public final int bitrate;
    public final String genre;
    public final boolean isPublic;
    public final int metadataInterval;
    public final String name;
    public final String url;

    public IcyHeaders(Parcel parcel) {
        this.bitrate = parcel.readInt();
        this.genre = parcel.readString();
        this.name = parcel.readString();
        this.url = parcel.readString();
        this.isPublic = Util.readBoolean(parcel);
        this.metadataInterval = parcel.readInt();
    }

    public static IcyHeaders parse(Map<String, List<String>> map) {
        boolean z14;
        int i14;
        String str;
        String str2;
        boolean zEquals;
        int i15;
        List<String> list = map.get(RESPONSE_HEADER_BITRATE);
        boolean z15 = true;
        int i16 = -1;
        if (list != null) {
            String str3 = list.get(0);
            try {
                i15 = Integer.parseInt(str3) * 1000;
                if (i15 > 0) {
                    z14 = true;
                } else {
                    try {
                        String strValueOf = String.valueOf(str3);
                        Log.w(TAG, strValueOf.length() != 0 ? "Invalid bitrate: ".concat(strValueOf) : new String("Invalid bitrate: "));
                        z14 = false;
                        i15 = -1;
                    } catch (NumberFormatException unused) {
                        String strValueOf2 = String.valueOf(str3);
                        Log.w(TAG, strValueOf2.length() != 0 ? "Invalid bitrate header: ".concat(strValueOf2) : new String("Invalid bitrate header: "));
                        z14 = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i15 = -1;
            }
            i14 = i15;
        } else {
            z14 = false;
            i14 = -1;
        }
        List<String> list2 = map.get(RESPONSE_HEADER_GENRE);
        String str4 = null;
        if (list2 != null) {
            str4 = list2.get(0);
            z14 = true;
        }
        List<String> list3 = map.get(RESPONSE_HEADER_NAME);
        if (list3 != null) {
            str = list3.get(0);
            z14 = true;
        } else {
            str = str4;
        }
        List<String> list4 = map.get(RESPONSE_HEADER_URL);
        if (list4 != null) {
            str2 = list4.get(0);
            z14 = true;
        } else {
            str2 = str4;
        }
        List<String> list5 = map.get(RESPONSE_HEADER_PUB);
        if (list5 != null) {
            zEquals = list5.get(0).equals(REQUEST_HEADER_ENABLE_METADATA_VALUE);
            z14 = true;
        } else {
            zEquals = false;
        }
        List<String> list6 = map.get(RESPONSE_HEADER_METADATA_INTERVAL);
        if (list6 != null) {
            String str5 = list6.get(0);
            try {
                int i17 = Integer.parseInt(str5);
                if (i17 > 0) {
                    i16 = i17;
                } else {
                    try {
                        String strValueOf3 = String.valueOf(str5);
                        Log.w(TAG, strValueOf3.length() != 0 ? "Invalid metadata interval: ".concat(strValueOf3) : new String("Invalid metadata interval: "));
                        z15 = z14;
                    } catch (NumberFormatException unused3) {
                        i16 = i17;
                        String strValueOf4 = String.valueOf(str5);
                        Log.w(TAG, strValueOf4.length() != 0 ? "Invalid metadata interval: ".concat(strValueOf4) : new String("Invalid metadata interval: "));
                    }
                }
                z14 = z15;
            } catch (NumberFormatException unused4) {
            }
        }
        return z14 ? new IcyHeaders(i14, str4, str, str2, zEquals, i16) : null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && IcyHeaders.class == obj.getClass()) {
            IcyHeaders icyHeaders = (IcyHeaders) obj;
            if (this.bitrate == icyHeaders.bitrate && Util.areEqual(this.genre, icyHeaders.genre) && Util.areEqual(this.name, icyHeaders.name) && Util.areEqual(this.url, icyHeaders.url) && this.isPublic == icyHeaders.isPublic && this.metadataInterval == icyHeaders.metadataInterval) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i14 = (527 + this.bitrate) * 31;
        String str = this.genre;
        int iHashCode = (i14 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.url;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.isPublic ? 1 : 0)) * 31) + this.metadataInterval;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void populateMediaMetadata(MediaMetadata.Builder builder) {
        String str = this.name;
        if (str != null) {
            builder.setStation(str);
        }
        String str2 = this.genre;
        if (str2 != null) {
            builder.setGenre(str2);
        }
    }

    public String toString() {
        String str = this.name;
        String str2 = this.genre;
        int i14 = this.bitrate;
        int i15 = this.metadataInterval;
        StringBuilder sbD = v.d(v.a(v.a(80, str), str2), "IcyHeaders: name=\"", str, "\", genre=\"", str2);
        sbD.append("\", bitrate=");
        sbD.append(i14);
        sbD.append(", metadataInterval=");
        sbD.append(i15);
        return sbD.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.bitrate);
        parcel.writeString(this.genre);
        parcel.writeString(this.name);
        parcel.writeString(this.url);
        Util.writeBoolean(parcel, this.isPublic);
        parcel.writeInt(this.metadataInterval);
    }

    public IcyHeaders(int i14, String str, String str2, String str3, boolean z14, int i15) {
        Assertions.checkArgument(i15 == -1 || i15 > 0);
        this.bitrate = i14;
        this.genre = str;
        this.name = str2;
        this.url = str3;
        this.isPublic = z14;
        this.metadataInterval = i15;
    }
}
