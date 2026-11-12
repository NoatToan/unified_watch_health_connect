package com.huami.widget.wheelview.adapters;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractWheelAdapter implements WheelViewAdapter {
    private List<DataSetObserver> a;

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public View getEmptyItem(View view, ViewGroup viewGroup) {
        return null;
    }

    public void notifyDataChangedEvent() {
        List<DataSetObserver> list = this.a;
        if (list != null) {
            Iterator<DataSetObserver> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().onChanged();
            }
        }
    }

    public void notifyDataInvalidatedEvent() {
        List<DataSetObserver> list = this.a;
        if (list != null) {
            Iterator<DataSetObserver> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().onInvalidated();
            }
        }
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        if (this.a == null) {
            this.a = new LinkedList();
        }
        this.a.add(dataSetObserver);
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        List<DataSetObserver> list = this.a;
        if (list != null) {
            list.remove(dataSetObserver);
        }
    }
}
