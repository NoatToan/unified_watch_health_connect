package com.duokan.airkan.common.aidl;

import android.bluetooth.BluetoothAdapter;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.miui.tsmclient.entity.digitalkey.ProductList;
import com.xiaomi.ai.android.utils.NetworkUtils;
import defpackage.jpe;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class ParcelDeviceData implements Parcelable, Comparable<ParcelDeviceData> {
    public static final Parcelable.Creator<ParcelDeviceData> CREATOR = new a();
    public static int D = 3;
    public static final int KDeviceAirKan = 1;
    public static final int KDeviceBTSpeaker = 2;
    public boolean A;
    public String B;
    public String C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f7034b;
    public String c;
    public String d;
    public int e;
    public int f;
    public int g;
    public String h;
    public String i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f7035k;
    public int l;
    public String m;
    public String n;
    public String o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f7036r;
    public String s;
    public String t;
    public int u;
    public String v;
    public String w;
    public long x;
    public FindDeviceWay y;
    public boolean z;

    public enum FindDeviceWay {
        WIFI(NetworkUtils.NETWORK_TYPE_WIFI),
        BLE(ProductList.ProductInfo.BLE_TYPE),
        SERVER("SERVER"),
        SCAN_QR("QR"),
        INPUT_IP("IP");

        private final String mText;

        FindDeviceWay(String str) {
            this.mText = str;
        }

        public String getText() {
            return this.mText;
        }
    }

    public class a implements Parcelable.Creator<ParcelDeviceData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelDeviceData createFromParcel(Parcel parcel) {
            return new ParcelDeviceData(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelDeviceData[] newArray(int i) {
            return new ParcelDeviceData[i];
        }
    }

    public /* synthetic */ ParcelDeviceData(Parcel parcel, a aVar) {
        this(parcel);
    }

    public final void a() {
        if (BluetoothAdapter.checkBluetoothAddress(this.C)) {
            return;
        }
        this.C = this.C.toUpperCase();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(ParcelDeviceData parcelDeviceData) {
        if (parcelDeviceData != null) {
            return -((int) (this.x - parcelDeviceData.x));
        }
        return 0;
    }

    public final void d() {
        String str = this.d;
        if (str != null && str.length() != 0) {
            int i = 0;
            while (true) {
                int iCharAt = this.d.charAt(i) + i + 1;
                if (iCharAt > this.d.length()) {
                    jpe.k("MdnsextraText", "invalid extra data");
                    return;
                }
                try {
                    String strSubstring = this.d.substring(i + 1, iCharAt);
                    String[] strArrSplit = strSubstring.split("=");
                    if (strArrSplit == null || strArrSplit.length != 2) {
                        jpe.k("MdnsextraText", "invalid segment");
                    } else if ("btmac".equalsIgnoreCase(strArrSplit[0]) && !TextUtils.isEmpty(strArrSplit[1])) {
                        this.C = strArrSplit[1];
                        a();
                        return;
                    } else {
                        jpe.k("MdnsextraText", "not known field:" + strSubstring);
                    }
                    if (iCharAt < this.d.length()) {
                        i = iCharAt;
                    }
                } catch (IndexOutOfBoundsException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
        jpe.h("MdnsextraText", "no extra data");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e(Parcel parcel) {
        this.f7033a = parcel.readString();
        this.f7034b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        if (D < 0) {
            if (parcel.dataAvail() == 1) {
                D = 1;
            } else if (parcel.dataAvail() == 10) {
                D = 2;
            } else if (parcel.dataAvail() == 12) {
                D = 3;
            } else if (parcel.dataAvail() == 15) {
                D = 4;
            } else if (parcel.dataAvail() == 16) {
                D = 5;
            } else {
                D = 0;
            }
        }
        jpe.b("parcelDeviceData", "parceldd dataavail: " + parcel.dataAvail());
        if (D >= 1) {
            this.e = parcel.readInt();
        }
        if (D >= 2) {
            this.f = parcel.readInt();
            this.g = parcel.readInt();
            this.h = parcel.readString();
            this.i = parcel.readString();
            this.j = parcel.readString();
            this.f7035k = parcel.readString();
            this.l = parcel.readInt();
            this.m = parcel.readString();
            this.n = parcel.readString();
        }
        if (D >= 3) {
            this.o = parcel.readString();
            this.p = parcel.readInt();
        }
        if (D >= 4) {
            this.q = parcel.readInt();
            this.f7036r = parcel.readString();
            this.s = parcel.readString();
        }
        if (D >= 5) {
            this.t = parcel.readString();
        }
        this.x = parcel.readLong();
        this.C = parcel.readString();
    }

    public void h(FindDeviceWay findDeviceWay) {
        this.y = findDeviceWay;
    }

    public String toString() {
        return "ParcelDeviceData{mName='" + this.f7033a + "', mType='" + this.f7034b + "', ip='" + this.c + "', extraText='" + this.d + "', platformID=" + this.e + ", isOnline=" + this.f + ", isLocal=" + this.g + ", mMac='" + this.h + "', ssid='" + this.i + "', bssid='" + this.j + "', wifikeyset='" + this.f7035k + "', bindType=" + this.l + ", mbinderAlias='" + this.m + "', rid='" + this.n + "', tvapmac='" + this.o + "', operator=" + this.p + ", wol=" + this.q + ", mVer='" + this.f7036r + "', aMac='" + this.s + "', milinkVer='" + this.t + "', mVC=" + this.u + ", deviceId='" + this.v + "', bssidMd5='" + this.w + "', lastConnctTimestamp=" + this.x + ", mFindDeviceWay=" + this.y + ", isReconnect=" + this.z + ", isAutoConnect=" + this.A + ", extraInfo='" + this.B + "', mBtMac='" + this.C + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7033a);
        parcel.writeString(this.f7034b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.f7035k);
        parcel.writeInt(this.l);
        parcel.writeString(this.m);
        parcel.writeString(this.n);
        parcel.writeString(this.o);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        parcel.writeString(this.f7036r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeLong(this.x);
        parcel.writeString(this.C);
    }

    public ParcelDeviceData() {
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = 1;
        this.h = null;
        this.i = "";
        this.j = "";
        this.f7035k = "";
        this.l = 1;
        this.m = "";
        this.n = "-1";
        this.o = "";
        this.p = 0;
        this.q = 0;
        this.f7036r = null;
        this.s = null;
        this.t = "16777494";
        this.u = 0;
        h(FindDeviceWay.WIFI);
    }

    public ParcelDeviceData(String str, String str2, String str3, String str4) {
        this.e = 0;
        this.f = 0;
        this.g = 1;
        this.i = "";
        this.j = "";
        this.f7035k = "";
        this.l = 1;
        this.n = "-1";
        this.o = "";
        this.p = 0;
        this.q = 0;
        this.f7036r = null;
        this.s = null;
        this.t = "16777494";
        this.u = 0;
        this.f7033a = str;
        this.f7034b = str2;
        this.c = str3;
        this.d = str4;
        this.h = "";
        this.m = str;
        d();
        h(FindDeviceWay.WIFI);
    }

    public ParcelDeviceData(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        this.f = 0;
        this.g = 1;
        this.i = "";
        this.j = "";
        this.f7035k = "";
        this.l = 1;
        this.o = "";
        this.p = 0;
        this.q = 0;
        this.f7036r = null;
        this.s = null;
        this.t = "16777494";
        this.u = 0;
        this.f7033a = str;
        this.f7034b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.h = str5;
        this.n = str6;
        this.m = str;
        d();
        h(FindDeviceWay.WIFI);
    }

    public ParcelDeviceData(Parcel parcel) {
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = 1;
        this.h = null;
        this.i = "";
        this.j = "";
        this.f7035k = "";
        this.l = 1;
        this.m = "";
        this.n = "-1";
        this.o = "";
        this.p = 0;
        this.q = 0;
        this.f7036r = null;
        this.s = null;
        this.t = "16777494";
        this.u = 0;
        e(parcel);
    }
}
