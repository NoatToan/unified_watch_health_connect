package org.eclipse.californium.core.network;

/* JADX INFO: loaded from: classes20.dex */
public interface MessageIdTracker {
    public static final int TOTAL_NO_OF_MIDS = 65536;

    int getNextMessageId();
}
