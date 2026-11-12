package com.xiaomi.hm.health.view.dslv;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes22.dex */
public abstract class ResourceDragSortCursorAdapter extends DragSortCursorAdapter {
    private int c;
    private int d;
    private LayoutInflater e;

    @Deprecated
    public ResourceDragSortCursorAdapter(Context context, int i, Cursor cursor) {
        super(context, cursor);
        this.d = i;
        this.c = i;
        this.e = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public View newDropDownView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.e.inflate(this.d, viewGroup, false);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.e.inflate(this.c, viewGroup, false);
    }

    public void setDropDownViewResource(int i) {
        this.d = i;
    }

    public void setViewResource(int i) {
        this.c = i;
    }

    public ResourceDragSortCursorAdapter(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.d = i;
        this.c = i;
        this.e = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public ResourceDragSortCursorAdapter(Context context, int i, Cursor cursor, int i2) {
        super(context, cursor, i2);
        this.d = i;
        this.c = i;
        this.e = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
