package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.ber;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/ber/BerTagException;", "Ljava/lang/Exception;", "msg", "", "(Ljava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class BerTagException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BerTagException(@NotNull String msg) {
        super(msg);
        Intrinsics.checkNotNullParameter(msg, "msg");
    }
}
