package com.huami.watch.util;

import android.os.SystemClock;
import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public abstract class SingleClickListener implements View.OnClickListener {
    private long a;
    public int defaultInterval;

    public SingleClickListener() {
        this(1000);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (SystemClock.elapsedRealtime() - this.a < this.defaultInterval) {
            return;
        }
        this.a = SystemClock.elapsedRealtime();
        performClick(view);
    }

    public abstract void performClick(View view);

    public SingleClickListener(int i) {
        this.a = 0L;
        this.defaultInterval = i;
    }
}
