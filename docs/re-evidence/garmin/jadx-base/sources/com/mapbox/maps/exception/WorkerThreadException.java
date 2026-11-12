package com.mapbox.maps.exception;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/mapbox/maps/exception/WorkerThreadException;", "Ljava/lang/RuntimeException;", "()V", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class WorkerThreadException extends RuntimeException {
    public WorkerThreadException() {
        super("The exception that is thrown when an application attempts to \nperform a map operation on a worker thread.");
    }
}
