package com.scwang.smartrefresh.layout.api;

import android.view.View;

/* JADX INFO: loaded from: classes18.dex */
public interface ScrollBoundaryDecider {
    boolean canLoadmore(View view);

    boolean canRefresh(View view);
}
