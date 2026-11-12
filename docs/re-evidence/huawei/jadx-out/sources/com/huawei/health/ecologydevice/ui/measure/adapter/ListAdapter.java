package com.huawei.health.ecologydevice.ui.measure.adapter;

import android.widget.BaseAdapter;
import defpackage.dru;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ListAdapter extends BaseAdapter {
    private ArrayList<dru> mProductList = null;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public void setProductList(ArrayList<dru> arrayList) {
        this.mProductList = arrayList;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.mProductList.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        ArrayList<dru> arrayList = this.mProductList;
        if (arrayList == null || i >= arrayList.size()) {
            return null;
        }
        return this.mProductList.get(i);
    }
}
