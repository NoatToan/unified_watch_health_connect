package com.huami.chart.listener;

import com.huami.chart.util.Index;

/* JADX INFO: loaded from: classes6.dex */
public interface IScrollListener {
    void offset(float f);

    void onScrollCurrentIndex(Index index);

    void onStartIndex(Index index);

    void onStopIndex(Index index);
}
