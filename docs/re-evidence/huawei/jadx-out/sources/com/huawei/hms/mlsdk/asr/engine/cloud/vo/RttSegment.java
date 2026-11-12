package com.huawei.hms.mlsdk.asr.engine.cloud.vo;

import java.io.Serializable;

/* JADX INFO: loaded from: classes34.dex */
public class RttSegment implements Serializable {
    private static final long serialVersionUID = 8352771809015182681L;
    private String endTime;
    private String startTime;
    private String text;

    public RttSegment() {
    }

    public String getEndTime() {
        return this.endTime;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getText() {
        return this.text;
    }

    public void setEndTime(String str) {
        this.endTime = str;
    }

    public void setStartTime(String str) {
        this.startTime = str;
    }

    public void setText(String str) {
        this.text = str;
    }

    public String toString() {
        return "MLSpeechRealTimeTranscriptionResult[startTime= " + this.startTime + ", endTime= " + this.endTime + ", text= " + this.text + "]";
    }

    public RttSegment(String str, String str2, String str3) {
        this.startTime = str;
        this.endTime = str2;
        this.text = str3;
    }
}
