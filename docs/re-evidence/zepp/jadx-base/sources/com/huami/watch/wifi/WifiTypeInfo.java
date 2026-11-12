package com.huami.watch.wifi;

import android.os.Parcel;
import android.os.Parcelable;
import com.huami.watch.transport.SafeParcelable;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes11.dex */
public class WifiTypeInfo implements SafeParcelable {
    public static final Parcelable.Creator<WifiTypeInfo> CREATOR = new a();
    public String anonymousId;
    public int eapType;
    public String id;
    public String password;
    public int phase2Type;
    public String ssid;
    public int ssidType;

    public static final class Eap {
        public static final int AKA = 5;
        public static final int NONE = -1;
        public static final int PEAP = 0;
        public static final int PWD = 3;
        public static final int SIM = 4;
        public static final int TLS = 1;
        public static final int TTLS = 2;
        public static final String[] strings = {"PEAP", "TLS", "TTLS", "PWD", "SIM", "AKA"};

        private Eap() {
        }
    }

    public static final class Phase2 {
        public static final int GTC = 4;
        public static final int MSCHAP = 2;
        public static final int MSCHAPV2 = 3;
        public static final int NONE = 0;
        public static final int PAP = 1;
        private static final String a = "auth=";
        public static final String[] strings = {"EMPTY", "PAP", "MSCHAP", "MSCHAPV2", "GTC"};

        private Phase2() {
        }
    }

    public static final class Type {
        public static final int EAP = 3;
        public static final int NONE = 0;
        public static final int UNKNOWN = -1;
        public static final int WEP = 1;
        public static final int WPA = 2;
        public static final String[] strings = {"None", "TLS", "TTLS", "PWD", "SIM", "AKA"};

        private Type() {
        }
    }

    public class a implements Parcelable.Creator<WifiTypeInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WifiTypeInfo createFromParcel(Parcel parcel) {
            return new WifiTypeInfo(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public WifiTypeInfo[] newArray(int i) {
            return new WifiTypeInfo[i];
        }
    }

    public /* synthetic */ WifiTypeInfo(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return SearchCriteria.LT + "wifi info ssid:" + this.ssid + " ssid_type:" + this.ssidType + " password:" + this.password + " eap_type:" + this.eapType + " phase2_type:" + this.phase2Type + " id:" + this.id + " anonymousId:" + this.anonymousId + SearchCriteria.GT;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssid);
        parcel.writeInt(this.ssidType);
        parcel.writeString(this.password);
        parcel.writeInt(this.eapType);
        parcel.writeInt(this.phase2Type);
        parcel.writeString(this.id);
        parcel.writeString(this.anonymousId);
    }

    public WifiTypeInfo() {
        this.ssid = "";
        this.ssidType = -1;
        this.password = "";
        this.eapType = -1;
        this.phase2Type = 0;
        this.id = "";
        this.anonymousId = "";
    }

    private WifiTypeInfo(Parcel parcel) {
        this.ssid = "";
        this.ssidType = -1;
        this.password = "";
        this.eapType = -1;
        this.phase2Type = 0;
        this.id = "";
        this.anonymousId = "";
        this.ssid = parcel.readString();
        this.ssidType = parcel.readInt();
        this.password = parcel.readString();
        this.eapType = parcel.readInt();
        this.phase2Type = parcel.readInt();
        this.id = parcel.readString();
        this.anonymousId = parcel.readString();
    }
}
