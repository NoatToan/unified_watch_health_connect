package com.garmin.feature.garminpay.providers.felica.exception;

import org.joda.time.LocalTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/exception/ServerInMaintenanceException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "startTime", "Lorg/joda/time/LocalTime;", "endTime", "<init>", "(Lorg/joda/time/LocalTime;Lorg/joda/time/LocalTime;)V", "getStartTime", "()Lorg/joda/time/LocalTime;", "getEndTime", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ServerInMaintenanceException extends Exception {
    public static final int $stable = 8;
    private final LocalTime endTime;
    private final LocalTime startTime;

    public ServerInMaintenanceException(LocalTime localTime, LocalTime localTime2) {
        localTime.getClass();
        localTime2.getClass();
        this.startTime = localTime;
        this.endTime = localTime2;
    }

    public final LocalTime getEndTime() {
        return this.endTime;
    }

    public final LocalTime getStartTime() {
        return this.startTime;
    }
}
