package com.huami.watch.dataflow.chart.data;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes16.dex */
public class ChartDataLoader {
    public LoadCallback mCallback;
    public boolean mIsCancelled;
    public SparseArray<ItemData> mItemsData = new SparseArray<>();

    public static class ItemData {
        public int index;
        public boolean isAllZeroData = true;
    }

    public interface LoadCallback {
        boolean hasData(int i);

        ItemData loadData(int i, boolean z);

        void onDataLoaded(ItemData itemData, boolean z);

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

    public boolean hasItemData(int i) {
        return this.mCallback.hasData(i);
    }

    public boolean isCancelled() {
        return this.mIsCancelled;
    }

    public void loadItemData(int i, boolean z) {
        this.mIsCancelled = false;
        ItemData itemDataLoadData = this.mCallback.loadData(i, false);
        itemDataLoadData.index = i;
        this.mItemsData.put(i, itemDataLoadData);
        if (this.mIsCancelled) {
            return;
        }
        this.mCallback.onDataLoaded(itemDataLoadData, false);
    }

    public void onToItem(int i) {
        this.mCallback.onToItem(i);
    }

    public void putItemData(int i, ItemData itemData) {
        this.mItemsData.put(i, itemData);
    }

    public void setLoadCallback(LoadCallback loadCallback) {
        this.mCallback = loadCallback;
    }
}
