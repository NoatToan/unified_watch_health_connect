package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import defpackage.rk1;
import defpackage.toe;
import defpackage.wlq;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new a();
    public static final String REQUEST_HEADER_ENABLE_METADATA_NAME = "Icy-MetaData";
    public static final String REQUEST_HEADER_ENABLE_METADATA_VALUE = "1";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7996b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;

    public class a implements Parcelable.Creator<IcyHeaders> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IcyHeaders createFromParcel(Parcel parcel) {
            return new IcyHeaders(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public IcyHeaders[] newArray(int i) {
            return new IcyHeaders[i];
        }
    }

    public IcyHeaders(int i, String str, String str2, String str3, boolean z, int i2) {
        rk1.a(i2 == -1 || i2 > 0);
        this.f7995a = i;
        this.f7996b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = i2;
    }

    public static IcyHeaders a(Map<String, List<String>> map) {
        boolean z;
        int i;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i2;
        List<String> list = map.get("icy-br");
        boolean z2 = true;
        int i3 = -1;
        if (list != null) {
            String str4 = list.get(0);
            try {
                i2 = Integer.parseInt(str4) * 1000;
                if (i2 > 0) {
                    z = true;
                } else {
                    try {
                        String strValueOf = String.valueOf(str4);
                        toe.h("IcyHeaders", strValueOf.length() != 0 ? "Invalid bitrate: ".concat(strValueOf) : new String("Invalid bitrate: "));
                        z = false;
                        i2 = -1;
                    } catch (NumberFormatException unused) {
                        String strValueOf2 = String.valueOf(str4);
                        toe.h("IcyHeaders", strValueOf2.length() != 0 ? "Invalid bitrate header: ".concat(strValueOf2) : new String("Invalid bitrate header: "));
                        z = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i2 = -1;
            }
            i = i2;
        } else {
            z = false;
            i = -1;
        }
        List<String> list2 = map.get("icy-genre");
        if (list2 != null) {
            str = list2.get(0);
            z = true;
        } else {
            str = null;
        }
        List<String> list3 = map.get("icy-name");
        if (list3 != null) {
            str2 = list3.get(0);
            z = true;
        } else {
            str2 = null;
        }
        List<String> list4 = map.get("icy-url");
        if (list4 != null) {
            str3 = list4.get(0);
            z = true;
        } else {
            str3 = null;
        }
        List<String> list5 = map.get("icy-pub");
        if (list5 != null) {
            zEquals = list5.get(0).equals("1");
            z = true;
        } else {
            zEquals = false;
        }
        List<String> list6 = map.get("icy-metaint");
        if (list6 != null) {
            String str5 = list6.get(0);
            try {
                int i4 = Integer.parseInt(str5);
                if (i4 > 0) {
                    i3 = i4;
                } else {
                    try {
                        String strValueOf3 = String.valueOf(str5);
                        toe.h("IcyHeaders", strValueOf3.length() != 0 ? "Invalid metadata interval: ".concat(strValueOf3) : new String("Invalid metadata interval: "));
                        z2 = z;
                    } catch (NumberFormatException unused3) {
                        i3 = i4;
                        String strValueOf4 = String.valueOf(str5);
                        toe.h("IcyHeaders", strValueOf4.length() != 0 ? "Invalid metadata interval: ".concat(strValueOf4) : new String("Invalid metadata interval: "));
                    }
                }
                z = z2;
            } catch (NumberFormatException unused4) {
            }
        }
        if (z) {
            return new IcyHeaders(i, str, str2, str3, zEquals, i3);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyHeaders.class != obj.getClass()) {
            return false;
        }
        IcyHeaders icyHeaders = (IcyHeaders) obj;
        return this.f7995a == icyHeaders.f7995a && wlq.c(this.f7996b, icyHeaders.f7996b) && wlq.c(this.c, icyHeaders.c) && wlq.c(this.d, icyHeaders.d) && this.e == icyHeaders.e && this.f == icyHeaders.f;
    }

    public int hashCode() {
        int i = (527 + this.f7995a) * 31;
        String str = this.f7996b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f;
    }

    public String toString() {
        String str = this.c;
        String str2 = this.f7996b;
        int i = this.f7995a;
        int i2 = this.f;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 80 + String.valueOf(str2).length());
        sb.append("IcyHeaders: name=\"");
        sb.append(str);
        sb.append("\", genre=\"");
        sb.append(str2);
        sb.append("\", bitrate=");
        sb.append(i);
        sb.append(", metadataInterval=");
        sb.append(i2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7995a);
        parcel.writeString(this.f7996b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        wlq.X0(parcel, this.e);
        parcel.writeInt(this.f);
    }

    public IcyHeaders(Parcel parcel) {
        this.f7995a = parcel.readInt();
        this.f7996b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = wlq.F0(parcel);
        this.f = parcel.readInt();
    }
}
