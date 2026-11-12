package com.huami.watch.dataflow.sync.bean;

import androidx.annotation.NonNull;
import com.google.gson.annotations.Expose;
import com.huami.watch.dataflow.model.health.bean.HealthRawDataItem;
import com.huami.watch.dataflow.model.health.bean.HealthRawHRItem;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.TimeUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes16.dex */
public class HealthData {

    @NonNull
    @Expose
    public List<Item> items = new ArrayList();

    @NonNull
    @Expose(serialize = false)
    public List<HealthRawHRItem> hrItems = new ArrayList();

    public static class Item {

        @Expose(serialize = false)
        public String data;

        @Expose(serialize = false)
        public HealthRawDataItem dataItem;

        @Expose
        public long lastSyncTime;

        @Expose(serialize = false)
        public String paiData;

        public String getData() {
            return this.data;
        }

        public HealthRawDataItem getDataItem() {
            return this.dataItem;
        }

        public long getLastSyncTime() {
            return this.lastSyncTime;
        }

        public void setData(String str) {
            this.data = str;
        }

        public void setDataItem(HealthRawDataItem healthRawDataItem) {
            this.dataItem = healthRawDataItem;
        }

        public void setLastSyncTime(long j) {
            this.lastSyncTime = j;
        }

        public String toString() {
            return "<LastSyncTime : " + this.lastSyncTime + ", " + TimeUtil.formatDateTime(this.lastSyncTime * 1000) + ", Data: '" + this.data + "', DataItem: '" + this.dataItem + '\'' + Typography.greater;
        }
    }

    public String toString() {
        return "<Items: " + ArraysUtil.toString(this.items) + ", HRItems: " + ArraysUtil.toString(this.hrItems) + Typography.greater;
    }
}
