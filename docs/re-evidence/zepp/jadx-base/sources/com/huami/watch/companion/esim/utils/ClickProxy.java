package com.huami.watch.companion.esim.utils;

import android.view.View;

/* JADX INFO: loaded from: classes16.dex */
public class ClickProxy implements View.OnClickListener {
    private View.OnClickListener a;
    private long b = 0;
    private long c = 1000;

    public ClickProxy(View.OnClickListener onClickListener) {
        this.a = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (System.currentTimeMillis() - this.b >= this.c) {
            this.a.onClick(view);
            this.b = System.currentTimeMillis();
        }
    }
}
