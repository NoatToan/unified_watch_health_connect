package com.xiaomi.hm.health.view.dslv;

import android.content.Context;
import android.database.Cursor;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.cursoradapter.widget.CursorAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes22.dex */
public abstract class DragSortCursorAdapter extends CursorAdapter implements DragSortListView.DragSortListener {
    public static final int REMOVED = -1;
    private SparseIntArray a;
    private ArrayList<Integer> b;

    public DragSortCursorAdapter(Context context, Cursor cursor) {
        super(context, cursor);
        this.a = new SparseIntArray();
        this.b = new ArrayList<>();
    }

    private void a() {
        ArrayList arrayList = new ArrayList();
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (this.a.keyAt(i) == this.a.valueAt(i)) {
                arrayList.add(Integer.valueOf(this.a.keyAt(i)));
            }
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            this.a.delete(((Integer) arrayList.get(i2)).intValue());
        }
    }

    private void b() {
        this.a.clear();
        this.b.clear();
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public void changeCursor(Cursor cursor) {
        super.changeCursor(cursor);
        b();
    }

    @Override // com.xiaomi.hm.health.view.dslv.DragSortListView.DragListener
    public void drag(int i, int i2) {
    }

    @Override // com.xiaomi.hm.health.view.dslv.DragSortListView.DropListener
    public void drop(int i, int i2) {
        if (i != i2) {
            int i3 = this.a.get(i, i);
            if (i > i2) {
                while (i > i2) {
                    SparseIntArray sparseIntArray = this.a;
                    int i4 = i - 1;
                    sparseIntArray.put(i, sparseIntArray.get(i4, i4));
                    i--;
                }
            } else {
                while (i < i2) {
                    SparseIntArray sparseIntArray2 = this.a;
                    int i5 = i + 1;
                    sparseIntArray2.put(i, sparseIntArray2.get(i5, i5));
                    i = i5;
                }
            }
            this.a.put(i2, i3);
            a();
            notifyDataSetChanged();
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.Adapter
    public int getCount() {
        return super.getCount() - this.b.size();
    }

    public int getCursorPosition(int i) {
        return this.a.get(i, i);
    }

    public ArrayList<Integer> getCursorPositions() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < getCount(); i++) {
            arrayList.add(Integer.valueOf(this.a.get(i, i)));
        }
        return arrayList;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return super.getDropDownView(this.a.get(i, i), view, viewGroup);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.Adapter
    public Object getItem(int i) {
        return super.getItem(this.a.get(i, i));
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.Adapter
    public long getItemId(int i) {
        return super.getItemId(this.a.get(i, i));
    }

    public int getListPosition(int i) {
        if (this.b.contains(Integer.valueOf(i))) {
            return -1;
        }
        int iIndexOfValue = this.a.indexOfValue(i);
        return iIndexOfValue < 0 ? i : this.a.keyAt(iIndexOfValue);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        return super.getView(this.a.get(i, i), view, viewGroup);
    }

    @Override // com.xiaomi.hm.health.view.dslv.DragSortListView.RemoveListener
    public void remove(int i) {
        int i2 = this.a.get(i, i);
        if (!this.b.contains(Integer.valueOf(i2))) {
            this.b.add(Integer.valueOf(i2));
        }
        int count = getCount();
        while (i < count) {
            SparseIntArray sparseIntArray = this.a;
            int i3 = i + 1;
            sparseIntArray.put(i, sparseIntArray.get(i3, i3));
            i = i3;
        }
        this.a.delete(count);
        a();
        notifyDataSetChanged();
    }

    public void reset() {
        b();
        notifyDataSetChanged();
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public Cursor swapCursor(Cursor cursor) {
        Cursor cursorSwapCursor = super.swapCursor(cursor);
        b();
        return cursorSwapCursor;
    }

    public DragSortCursorAdapter(Context context, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.a = new SparseIntArray();
        this.b = new ArrayList<>();
    }

    public DragSortCursorAdapter(Context context, Cursor cursor, int i) {
        super(context, cursor, i);
        this.a = new SparseIntArray();
        this.b = new ArrayList<>();
    }
}
