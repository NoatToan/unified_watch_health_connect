package com.huami.watch.dataflow.sync.bean;

import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class RrPeakData {

    @SerializedName("afResult")
    public AfResult afResult;

    @SerializedName("deviceSource")
    public int deviceSource;

    @SerializedName("rrPeak")
    public RrPeak rrPeak;

    @SerializedName("time")
    public long time;

    public class AfResult {

        @SerializedName("fwVer")
        public String fwVer;

        @SerializedName("resultMap")
        public Map<String, Integer> resultMap = new HashMap();

        @SerializedName("timeZone")
        public int timeZone;

        public AfResult() {
        }
    }

    public class RrPeak {

        @SerializedName("fwVer")
        public String fwVer;

        @SerializedName("generatedTime")
        public long generatedTime;

        @SerializedName("lastRrPackageTime")
        public long lastRrPackageTime;

        @SerializedName("rawData")
        public String rawData;

        @SerializedName("type")
        public int type;

        public RrPeak() {
        }
    }
}
