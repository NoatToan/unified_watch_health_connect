package com.huami.watch.dataflow.sync.bean;

import kotlin.text.Typography;

/* JADX INFO: loaded from: classes16.dex */
public class SyncResult {
    public Object data;
    public boolean dataEmpty;
    public boolean needContinue;
    public boolean success;

    public String toString() {
        return "<Success: " + this.success + ", DataEmpty: " + this.dataEmpty + ", NeedContinue: " + this.needContinue + ", Data: " + this.data + Typography.greater;
    }
}
