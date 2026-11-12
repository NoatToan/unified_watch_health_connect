package com.xiaomi.hm.health.relation.chart.data;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes21.dex */
public class ChartDataLoader {
    public LoadCallback mCallback;
    public boolean mIsCancelled;
    public SparseArray<ItemData> mItemsData = new SparseArray<>();

    public static class ItemData {
        public int index;
    }

    public interface LoadCallback {
        boolean hasData(int i);

        ItemData loadData(int i);

        void onDataLoaded(ItemData itemData);

        void onToItem(int i);
    }

    public void cancel() {
        this.mIsCancelled = true;
    }

    public void clearData() {
        this.mItemsData.clear();
    }

    public ItemData getItemData(int i) {
        return this.mItemsData.get(i);
    }

    public LoadCallback getLoadCallback() {
        return this.mCallback;
    }

    public void loadItemData(int i) {
        this.mIsCancelled = false;
        ItemData itemDataLoadData = this.mCallback.loadData(i);
        itemDataLoadData.index = i;
        this.mItemsData.put(i, itemDataLoadData);
        if (this.mIsCancelled) {
            return;
        }
        this.mCallback.onDataLoaded(itemDataLoadData);
    }

    public void onToItem(int i) {
        this.mCallback.onToItem(i);
    }

    public void setLoadCallback(LoadCallback loadCallback) {
        this.mCallback = loadCallback;
    }
}
