package com.ximalaya.ting.android.sdkdownloader.downloadutil.viewholder;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import java.util.List;
import org.cybergarage.upnp.std.av.server.ContentDirectory;

/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractAdapter<T> extends BaseAdapter {
    public Context context;
    public LayoutInflater layoutInflater;
    public List<T> listData;

    public AbstractAdapter(Context context, List<T> list) {
        this.context = context;
        this.listData = list;
        this.layoutInflater = LayoutInflater.from(context);
    }

    private boolean a(String str) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        Log.e(ContentDirectory.ERROR, "不能在线程中调用" + str + "方法" + getClass().getName());
        return false;
    }

    public void addListData(List<T> list) {
        List<T> list2 = this.listData;
        if (list2 == null) {
            this.listData = list;
        } else {
            list2.addAll(list);
        }
        notifyDataSetChanged();
    }

    public void addListDataWithoutNotify(List<T> list) {
        List<T> list2 = this.listData;
        if (list2 == null) {
            this.listData = list;
        } else {
            list2.addAll(list);
        }
    }

    public void clear() {
        List<T> list = this.listData;
        if (list != null) {
            list.clear();
            notifyDataSetChanged();
        }
    }

    public boolean containItem(T t) {
        List<T> list = this.listData;
        if (list == null) {
            return false;
        }
        return list.contains(t);
    }

    public void deleteListData(int i) {
        List<T> list = this.listData;
        if (list == null || list.size() <= i) {
            return;
        }
        this.listData.remove(i);
        notifyDataSetChanged();
    }

    public void deleteListDatas(List<T> list) {
        List<T> list2 = this.listData;
        if (list2 != null) {
            list2.removeAll(list);
            notifyDataSetChanged();
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<T> list = this.listData;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (this.listData == null || getCount() <= 0 || i >= this.listData.size()) {
            return null;
        }
        return this.listData.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public List<T> getListData() {
        return this.listData;
    }

    public int indexOf(T t) {
        List<T> list = this.listData;
        if (list != null) {
            return list.indexOf(t);
        }
        return -1;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        if (a("notifyDataSetChanged")) {
            super.notifyDataSetChanged();
        }
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        if (a("notifyDataSetInvalidated")) {
            super.notifyDataSetInvalidated();
        }
    }

    public void setListData(List<T> list) {
        this.listData = list;
    }

    public void updateItem(T t) {
        int iIndexOf;
        List<T> list = this.listData;
        if (list != null && (iIndexOf = list.indexOf(t)) >= 0) {
            this.listData.set(iIndexOf, t);
        }
    }

    public void deleteListData(T t) {
        List<T> list = this.listData;
        if (list != null) {
            list.remove(t);
            notifyDataSetChanged();
        }
    }
}
