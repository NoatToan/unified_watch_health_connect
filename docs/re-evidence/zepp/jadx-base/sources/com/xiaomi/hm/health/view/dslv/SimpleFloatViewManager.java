package com.xiaomi.hm.health.view.dslv;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

/* JADX INFO: loaded from: classes22.dex */
public class SimpleFloatViewManager implements DragSortListView.FloatViewManager {
    private Bitmap a;
    private ImageView b;
    private int c = -16777216;
    private ListView d;

    public SimpleFloatViewManager(ListView listView) {
        this.d = listView;
    }

    @Override // com.xiaomi.hm.health.view.dslv.DragSortListView.FloatViewManager
    public View onCreateFloatView(int i) {
        ListView listView = this.d;
        View childAt = listView.getChildAt((i + listView.getHeaderViewsCount()) - this.d.getFirstVisiblePosition());
        if (childAt == null) {
            return null;
        }
        childAt.setPressed(false);
        childAt.setDrawingCacheEnabled(true);
        this.a = Bitmap.createBitmap(childAt.getDrawingCache());
        childAt.setDrawingCacheEnabled(false);
        if (this.b == null) {
            this.b = new ImageView(this.d.getContext());
        }
        this.b.setBackgroundColor(this.c);
        this.b.setPadding(0, 0, 0, 0);
        this.b.setImageBitmap(this.a);
        this.b.setLayoutParams(new ViewGroup.LayoutParams(childAt.getWidth(), childAt.getHeight()));
        return this.b;
    }

    @Override // com.xiaomi.hm.health.view.dslv.DragSortListView.FloatViewManager
    public void onDestroyFloatView(View view) {
        ((ImageView) view).setImageDrawable(null);
        this.a.recycle();
        this.a = null;
    }

    @Override // com.xiaomi.hm.health.view.dslv.DragSortListView.FloatViewManager
    public void onDragFloatView(View view, Point point, Point point2) {
    }

    public void setBackgroundColor(int i) {
        this.c = i;
    }
}
