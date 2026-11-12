package com.twitter.sdk.android.core.internal.scribe;

import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public interface FileRollOverManager {
    void cancelTimeBasedFileRollOver();

    boolean rollFileOver() throws IOException;

    void scheduleTimeBasedRollOverIfNeeded();
}
