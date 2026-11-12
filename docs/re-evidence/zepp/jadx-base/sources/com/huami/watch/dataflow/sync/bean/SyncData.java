package com.huami.watch.dataflow.sync.bean;

import kotlin.text.Typography;

/* JADX INFO: loaded from: classes16.dex */
public class SyncData {
    private String data;
    private String dataType;
    private String sessionId;

    public String getData() {
        return this.data;
    }

    public String getDataType() {
        return this.dataType;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setDataType(String str) {
        this.dataType = str;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public String toString() {
        return "<SessionId: '" + this.sessionId + "', DataType: '" + this.dataType + "', Data: '" + this.data + '\'' + Typography.greater;
    }
}
