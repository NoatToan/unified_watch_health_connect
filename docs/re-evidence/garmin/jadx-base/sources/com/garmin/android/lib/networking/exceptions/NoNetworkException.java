package com.garmin.android.lib.networking.exceptions;

import java.io.IOException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/lib/networking/exceptions/NoNetworkException;", "Ljava/io/IOException;", "<init>", "()V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NoNetworkException extends IOException {
    public NoNetworkException() {
        super("No network available");
    }
}
