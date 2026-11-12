package com.huami.watch.dataflow.sync.bean;

import com.google.gson.annotations.Expose;

/* JADX INFO: loaded from: classes16.dex */
public class BaseSportData {

    @Expose
    private boolean isSingle;

    public BaseSportData(boolean z) {
        this.isSingle = z;
    }

    public boolean isSingle() {
        return this.isSingle;
    }

    public void setSingle(boolean z) {
        this.isSingle = z;
    }
}
