package com.xiaomi.hm.health.device.reset;

import androidx.annotation.StringRes;

/* JADX INFO: loaded from: classes18.dex */
public class DialogContent {
    private static final int d = -1;

    @StringRes
    private int a;

    @StringRes
    private int b;

    @StringRes
    private int c;

    public DialogContent(@StringRes int i) {
        this(i, -1, -1);
    }

    public int getLeft() {
        return this.b;
    }

    public int getRight() {
        return this.c;
    }

    public int getTitle() {
        return this.a;
    }

    public DialogContent(@StringRes int i, @StringRes int i2) {
        this(i, i2, -1);
    }

    public DialogContent(@StringRes int i, @StringRes int i2, @StringRes int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
