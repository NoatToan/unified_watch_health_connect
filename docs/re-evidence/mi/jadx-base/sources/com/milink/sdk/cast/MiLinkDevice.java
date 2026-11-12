package com.milink.sdk.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.milink.sdk.client.MiLinkCastClient;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public class MiLinkDevice implements Parcelable {
    public static final Parcelable.Creator<MiLinkDevice> CREATOR = new Parcelable.Creator<MiLinkDevice>() { // from class: com.milink.sdk.cast.MiLinkDevice.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MiLinkDevice createFromParcel(Parcel parcel) {
            return new MiLinkDevice(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MiLinkDevice[] newArray(int i) {
            return new MiLinkDevice[i];
        }
    };
    public static final String TYPE_AIRKAN = "airkan";
    public static final String TYPE_DLNA_AIRKAN = "dlna.airkan";
    public static final String TYPE_DLNA_SPEAKER = "dlna.speaker";
    public static final String TYPE_DLNA_TV = "dlna.tv";
    public static final String TYPE_LELINK = "lelink";
    public static final String TYPE_MIPLAY = "miplay";
    public static final String TYPE_MIPLAY_DATA = "miplay.data";
    public static final String TYPE_MIRACAST = "miracast";
    public static final String TYPE_UNKNOWN = "unknown";
    private String bleMac;
    private String idHash;
    private String ip;
    private String key;
    private String name;
    private String p2pMac;
    private int state = 0;
    private String type;
    private String wifiMac;

    public MiLinkDevice() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getBleMac() {
        return this.bleMac;
    }

    public String getIdHash() {
        return this.idHash;
    }

    public String getIp() {
        return this.ip;
    }

    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    public String getP2pMac() {
        return this.p2pMac;
    }

    public int getState() {
        return this.state;
    }

    public String getType() {
        return this.type;
    }

    public String getWifiMac() {
        return this.wifiMac;
    }

    public void readFromParcel(Parcel parcel) {
        this.key = parcel.readString();
        this.name = parcel.readString();
        this.type = parcel.readString();
        this.ip = parcel.readString();
        this.p2pMac = parcel.readString();
        this.wifiMac = parcel.readString();
        this.bleMac = parcel.readString();
        if (parcel.dataAvail() >= 8) {
            this.idHash = parcel.readString();
            this.state = parcel.readInt();
        }
    }

    public void setBleMac(String str) {
        this.bleMac = str;
    }

    public void setIdHash(String str) {
        this.idHash = str;
    }

    public void setIp(String str) {
        this.ip = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setP2pMac(String str) {
        this.p2pMac = str;
    }

    public void setState(int i) {
        this.state = i;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setWifiMac(String str) {
        this.wifiMac = str;
    }

    public String toString() {
        return "MiLinkDevice{key=" + this.key + ", name=" + this.name + ", type=" + this.type + ", ip'" + this.ip + ", p2pMac=" + this.p2pMac + ", wifiMac=" + this.wifiMac + ", bleMac=" + this.bleMac + ", idHash=" + this.idHash + ", state=" + this.state + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.key);
        parcel.writeString(this.name);
        parcel.writeString(this.type);
        parcel.writeString(this.ip);
        parcel.writeString(this.p2pMac);
        parcel.writeString(this.wifiMac);
        parcel.writeString(this.bleMac);
        if (MiLinkCastClient.VERSION_CODE >= 12040818) {
            parcel.writeString(this.idHash);
            parcel.writeInt(this.state);
        }
    }

    public MiLinkDevice(Parcel parcel) {
        readFromParcel(parcel);
    }
}
