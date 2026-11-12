package com.huami.chart.listener;

import com.huami.chart.util.Index;

/* JADX INFO: loaded from: classes6.dex */
public interface ITouchListener {
    void onDown(Index index);

    void onTouchOutOfRange();

    void onUp(Index index);
}
