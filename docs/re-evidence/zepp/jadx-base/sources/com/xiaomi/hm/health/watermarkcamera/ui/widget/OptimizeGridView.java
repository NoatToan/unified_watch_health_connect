package com.xiaomi.hm.health.watermarkcamera.ui.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class OptimizeGridView extends GridView {

    public interface a<T> {
        T a();

        void b(List<T> list);

        boolean c(T t);

        List<T> getItems();
    }

    public OptimizeGridView(Context context) {
        super(context);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onMeasure(int i, int i2) {
        int count;
        super.onMeasure(i, i2);
        int numColumns = getNumColumns();
        if (numColumns != -1) {
            ListAdapter adapter = getAdapter();
            if ((adapter instanceof a) && (count = adapter.getCount() % numColumns) != 0) {
                int i3 = numColumns - count;
                a aVar = (a) adapter;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(aVar.getItems());
                for (int i4 = 0; i4 < i3; i4++) {
                    arrayList.add(aVar.a());
                }
                aVar.b(arrayList);
            }
        }
    }

    public OptimizeGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OptimizeGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
