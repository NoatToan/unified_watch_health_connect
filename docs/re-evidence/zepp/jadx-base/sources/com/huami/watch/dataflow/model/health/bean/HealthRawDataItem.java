package com.huami.watch.dataflow.model.health.bean;

import java.util.Arrays;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
public class HealthRawDataItem {
    private String deviceId;
    private int lastSyncTime;
    private MetaData[] metadata;

    public static class MetaData {
        private String date;
        private int source;
        private String summary;
        private MetaDataValue[] values;

        public String getDate() {
            return this.date;
        }

        public int getSource() {
            return this.source;
        }

        public String getSummary() {
            return this.summary;
        }

        public MetaDataValue[] getValues() {
            return this.values;
        }

        public void setDate(String str) {
            this.date = str;
        }

        public void setSource(int i) {
            this.source = i;
        }

        public void setSummary(String str) {
            this.summary = str;
        }

        public void setValues(MetaDataValue[] metaDataValueArr) {
            this.values = metaDataValueArr;
        }

        public String toString() {
            return "<Date : " + this.date + ", Source : " + this.source + "\n\tSummary : " + this.summary + "\n\tValues : " + Arrays.toString(this.values) + SearchCriteria.GT;
        }
    }

    public static class MetaDataValue {
        private String did;
        private String heartRateData;
        private int start;
        private int stop;
        private String tz;
        private String value;

        public String getDId() {
            return this.did;
        }

        public String getHeartRateData() {
            return this.heartRateData;
        }

        public int getStart() {
            return this.start;
        }

        public int getStop() {
            return this.stop;
        }

        public String getTz() {
            return this.tz;
        }

        public String getValue() {
            return this.value;
        }

        public void setDId(String str) {
            this.did = str;
        }

        public void setHeartRateData(String str) {
            this.heartRateData = str;
        }

        public void setStart(int i) {
            this.start = i;
        }

        public void setStop(int i) {
            this.stop = i;
        }

        public void setTz(String str) {
            this.tz = str;
        }

        public void setValue(String str) {
            this.value = str;
        }

        public String toString() {
            return "<Start : " + this.start + ", Stop : " + this.stop + ", DID : " + this.did + "\n\t\tValue : " + this.value + "\n\t\tHeartRateData : " + this.heartRateData + "\n\t\tTimezone: " + this.tz + SearchCriteria.GT;
        }
    }

    public String getDId() {
        return this.deviceId;
    }

    public int getLastSyncTime() {
        return this.lastSyncTime;
    }

    public MetaData[] getMetadata() {
        return this.metadata;
    }

    public void setDId(String str) {
        this.deviceId = str;
    }

    public void setLastSyncTime(int i) {
        this.lastSyncTime = i;
    }

    public void setMetadata(MetaData[] metaDataArr) {
        this.metadata = metaDataArr;
    }

    public String toString() {
        return "<LastSyncTime : " + this.lastSyncTime + ", DID : " + this.deviceId + "\nMetaData :" + Arrays.toString(this.metadata) + SearchCriteria.GT;
    }
}
