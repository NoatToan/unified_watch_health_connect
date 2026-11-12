package com.huami.lib.view.quickadapter;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public interface IExpandable<T> {
    int getLevel();

    List<T> getSubItems();

    boolean isExpanded();

    void setExpanded(boolean z);
}
