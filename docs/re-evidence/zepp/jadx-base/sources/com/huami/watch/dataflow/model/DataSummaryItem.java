package com.huami.watch.dataflow.model;

/* JADX INFO: loaded from: classes16.dex */
public abstract class DataSummaryItem implements Dated {
    public String date;

    @Override // com.huami.watch.dataflow.model.Dated
    public String getDate() {
        return this.date;
    }

    public void setDate(String str) {
        this.date = str;
    }
}
