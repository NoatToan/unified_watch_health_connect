package com.tencent.wcdb.support;

import android.util.Printer;

/* JADX INFO: loaded from: classes6.dex */
public class LogPrinter implements Printer {
    private final int mPriority;
    private final String mTag;

    public LogPrinter(int i, String str) {
        this.mPriority = i;
        this.mTag = str;
    }

    @Override // android.util.Printer
    public void println(String str) {
        Log.println(this.mPriority, this.mTag, str);
    }
}
