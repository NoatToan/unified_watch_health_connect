package com.garmin.pairing.setup.connection;

import java.util.concurrent.CancellationException;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/pairing/setup/connection/DisconnectCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "gattStatus", "", "<init>", "(I)V", "device-setup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DisconnectCancellationException extends CancellationException {
    public DisconnectCancellationException(int i14) {
        super(e0.f(i14, "Device disconnected: gatt status[", "]"));
    }
}
