package com.garmin.feature.garminpay.providers.felica.exception;

import org.joda.time.Duration;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/exception/ServerInMaintenanceAlertException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "timeToMaintenance", "Lorg/joda/time/Duration;", "<init>", "(Lorg/joda/time/Duration;)V", "getTimeToMaintenance", "()Lorg/joda/time/Duration;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ServerInMaintenanceAlertException extends Exception {
    public static final int $stable = 8;
    private final Duration timeToMaintenance;

    public ServerInMaintenanceAlertException(Duration duration) {
        duration.getClass();
        this.timeToMaintenance = duration;
    }

    public final Duration getTimeToMaintenance() {
        return this.timeToMaintenance;
    }
}
