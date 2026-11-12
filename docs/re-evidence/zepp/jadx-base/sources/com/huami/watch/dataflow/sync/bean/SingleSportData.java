package com.huami.watch.dataflow.sync.bean;

import com.google.gson.annotations.Expose;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes16.dex */
public class SingleSportData extends BaseSportData {

    @Expose(serialize = false)
    private String detail;

    @Expose(serialize = false)
    private String summary;

    @Expose
    private long trackid;

    public SingleSportData() {
        super(true);
    }

    public String getDetail() {
        return this.detail;
    }

    public String getSummary() {
        return this.summary;
    }

    public long getTrackid() {
        return this.trackid;
    }

    public void setDetail(String str) {
        this.detail = str;
    }

    public void setSummary(String str) {
        this.summary = str;
    }

    public void setTrackid(long j) {
        this.trackid = j;
    }

    public String toString() {
        return "<Trackid: " + this.trackid + ", Detail: '" + this.detail + "', \nSummary: '" + this.summary + '\'' + Typography.greater;
    }
}
