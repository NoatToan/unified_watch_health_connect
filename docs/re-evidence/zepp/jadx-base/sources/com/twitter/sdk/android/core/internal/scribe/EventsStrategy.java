package com.twitter.sdk.android.core.internal.scribe;

/* JADX INFO: loaded from: classes18.dex */
public interface EventsStrategy<T> extends FileRollOverManager, EventsManager<T> {
    FilesSender getFilesSender();
}
