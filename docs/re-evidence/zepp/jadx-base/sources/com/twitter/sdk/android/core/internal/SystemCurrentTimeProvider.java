package com.twitter.sdk.android.core.internal;

/* JADX INFO: loaded from: classes18.dex */
public class SystemCurrentTimeProvider implements CurrentTimeProvider {
    @Override // com.twitter.sdk.android.core.internal.CurrentTimeProvider
    public long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }
}
