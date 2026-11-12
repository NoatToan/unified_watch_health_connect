package com.xiaomi.clientreport.data;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class PerfClientReport extends a {
    private static final long e = -1;
    public int code;
    public long perfCounts = -1;
    public long perfLatencies = -1;

    public static PerfClientReport getBlankInstance() {
        return new PerfClientReport();
    }

    @Override // com.xiaomi.clientreport.data.a
    public JSONObject toJson() {
        return null;
    }

    @Override // com.xiaomi.clientreport.data.a
    public String toJsonString() {
        return super.toJsonString();
    }
}
