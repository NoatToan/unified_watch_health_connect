package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.twitter.sdk.android.core.internal.CommonUtils;

/* JADX INFO: loaded from: classes18.dex */
public class TimeBasedFileRollOverRunnable implements Runnable {
    private final Context a;
    private final FileRollOverManager b;

    public TimeBasedFileRollOverRunnable(Context context, FileRollOverManager fileRollOverManager) {
        this.a = context;
        this.b = fileRollOverManager;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            CommonUtils.logControlled(this.a, "Performing time based file roll over.");
            if (this.b.rollFileOver()) {
                return;
            }
            this.b.cancelTimeBasedFileRollOver();
        } catch (Exception e) {
            CommonUtils.logControlledError(this.a, "Failed to roll over file", e);
        }
    }
}
