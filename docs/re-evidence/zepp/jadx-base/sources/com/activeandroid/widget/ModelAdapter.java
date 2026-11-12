package com.activeandroid.widget;

import android.content.Context;
import android.widget.ArrayAdapter;
import com.activeandroid.Model;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ModelAdapter<T extends Model> extends ArrayAdapter<T> {
    public ModelAdapter(Context context, int i) {
        super(context, i);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public long getItemId(int i) {
        T item = getItem(i);
        if (item != null) {
            return item.getId().longValue();
        }
        return -1L;
    }

    public void setData(Collection<? extends T> collection) {
        clear();
        if (collection != null) {
            Iterator<? extends T> it2 = collection.iterator();
            while (it2.hasNext()) {
                add(it2.next());
            }
        }
    }

    public ModelAdapter(Context context, int i, int i2) {
        super(context, i, i2);
    }

    public ModelAdapter(Context context, int i, List<T> list) {
        super(context, i, list);
    }

    public ModelAdapter(Context context, int i, int i2, List<T> list) {
        super(context, i, i2, list);
    }
}
