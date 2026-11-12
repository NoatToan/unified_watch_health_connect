package com.huami.network.hmnetwork.exception;

/* JADX INFO: loaded from: classes6.dex */
public class GettingTokenInUIThreadException extends Exception {
    public GettingTokenInUIThreadException() {
        super("Getting token must be in thread, not in the UI thread");
    }
}
