package com.huami.watch.dataflow.sync.bean;

import com.google.gson.annotations.Expose;
import com.huami.watch.util.TimeUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public class HeartRateData {

    @Expose
    private List<Item> items = new ArrayList();

    @Expose
    private long syncTime;

    public static class Item {

        @Expose(serialize = false)
        private String data;

        @Expose
        private long generatedTime;

        public Item(long j, String str) {
            this.generatedTime = j;
            this.data = str;
        }

        public String getData() {
            return this.data;
        }

        public long getGeneratedTime() {
            return this.generatedTime;
        }

        public void setData(String str) {
            this.data = str;
        }

        public void setGeneratedTime(long j) {
            this.generatedTime = j;
        }

        @NotNull
        public String toString() {
            return "<GeneratedTime : " + this.generatedTime + ", " + TimeUtil.formatDateTime(this.generatedTime * 1000) + ", Data: '" + this.data + '\'' + Typography.greater;
        }
    }

    public List<Item> getItems() {
        return this.items;
    }

    public long getSyncTime() {
        return this.syncTime;
    }

    public void setItems(List<Item> list) {
        this.items = list;
    }

    public void setSyncTime(long j) {
        this.syncTime = j;
    }
}
