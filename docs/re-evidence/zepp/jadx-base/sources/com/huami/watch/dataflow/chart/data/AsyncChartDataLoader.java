package com.huami.watch.dataflow.chart.data;

import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes16.dex */
public class AsyncChartDataLoader extends ChartDataLoader {
    private Executor a = Executors.newSingleThreadExecutor();
    private ArrayList<b> b = new ArrayList<>();

    public class b extends AsyncTask<Integer, Void, ChartDataLoader.ItemData> {
        private boolean a;

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ChartDataLoader.ItemData doInBackground(Integer... numArr) {
            ChartDataLoader.ItemData itemDataLoadData = AsyncChartDataLoader.this.mCallback.loadData(numArr[0].intValue(), this.a);
            itemDataLoadData.index = numArr[0].intValue();
            AsyncChartDataLoader.this.mItemsData.put(numArr[0].intValue(), itemDataLoadData);
            return itemDataLoadData;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(ChartDataLoader.ItemData itemData) {
            AsyncChartDataLoader.this.mCallback.onDataLoaded(itemData, this.a);
            AsyncChartDataLoader.this.b.remove(this);
        }

        @Override // android.os.AsyncTask
        public void onCancelled() {
            AsyncChartDataLoader.this.b.remove(this);
        }

        private b(boolean z) {
            this.a = z;
        }
    }

    @Override // com.huami.watch.dataflow.chart.data.ChartDataLoader
    public void cancel() {
        if (!this.b.isEmpty()) {
            for (b bVar : this.b) {
                if (!bVar.isCancelled()) {
                    bVar.cancel(false);
                }
            }
        }
        this.b.clear();
    }

    @Override // com.huami.watch.dataflow.chart.data.ChartDataLoader
    public boolean isCancelled() {
        if (this.b.isEmpty()) {
            return false;
        }
        Iterator<b> it2 = this.b.iterator();
        while (it2.hasNext()) {
            if (it2.next().isCancelled()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.huami.watch.dataflow.chart.data.ChartDataLoader
    public void loadItemData(int i, boolean z) {
        b bVar = new b(z);
        bVar.executeOnExecutor(this.a, Integer.valueOf(i));
        this.b.add(bVar);
    }
}
