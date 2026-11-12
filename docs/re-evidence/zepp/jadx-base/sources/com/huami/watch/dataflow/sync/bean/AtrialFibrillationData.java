package com.huami.watch.dataflow.sync.bean;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes16.dex */
public class AtrialFibrillationData {

    @SerializedName("acc_info")
    public AccInfo accInfo;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.ACTIVE)
    public int active;

    @SerializedName("afResult")
    public int afResult;

    @SerializedName("eventType")
    public String eventType;

    @SerializedName("flag")
    public int flag;

    @SerializedName("ppg_info")
    public PpgInfo ppgInfo;

    @SerializedName("rawdata")
    public String rawdata;

    @SerializedName("time")
    public long time;

    public static class AccInfo {

        @SerializedName("acc_data_length")
        public int accDataLength;

        @SerializedName("acc_rawdata")
        public String accRawData;

        @SerializedName("acc_rr_type")
        public int accRrType;

        @SerializedName("deviceSource")
        public int deviceSource;

        @SerializedName("HwVer")
        public String hwVer;

        @SerializedName("rom_version")
        public String romVersion;

        public String toString() {
            return "AccInfo{accRawData='" + this.accRawData + "', accDataLength=" + this.accDataLength + ", deviceSource=" + this.deviceSource + ", hwVer='" + this.hwVer + "', romVersion='" + this.romVersion + "', accRrType=" + this.accRrType + '}';
        }
    }

    public static class PpgInfo {

        @SerializedName("deviceSource")
        public int deviceSource;

        @SerializedName("eventType")
        public String eventType;

        @SerializedName("HwVer")
        public String hwVer;

        @SerializedName("ppg_data_length")
        public long ppgDataLength;

        @SerializedName("ppg_rr_type")
        public int ppgRrType;

        @SerializedName("rom_version")
        public String romVersion;

        public String toString() {
            return "PpgInfo{eventType='" + this.eventType + "', deviceSource=" + this.deviceSource + ", ppgDataLength=" + this.ppgDataLength + ", hwVer='" + this.hwVer + "', romVersion='" + this.romVersion + "', ppgRrType='" + this.ppgRrType + "'}";
        }
    }

    public String toString() {
        return "AtrialFibrillationData{time=" + this.time + ", active=" + this.active + ", rawdata='" + this.rawdata + "', eventType='" + this.eventType + "', afResult='" + this.afResult + "', flag='" + this.flag + "', ppgInfo=" + this.ppgInfo + "', accInfo=" + this.accInfo + "'}";
    }
}
