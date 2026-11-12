package com.huawei.ui.commonui.tablewidget;

import android.view.View;

/* JADX INFO: loaded from: classes16.dex */
public interface ViewHolder {
    int getColumnIndex();

    int getItemType();

    View getItemView();

    int getRowIndex();

    void setColumnIndex(int i);

    void setItemType(int i);

    void setRowIndex(int i);
}
