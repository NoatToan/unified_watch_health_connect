package com.xiaomi.fitness.nfc.sdk;

import com.miui.tsmclient.util.ILogger;
import defpackage.syo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/nfc/sdk/Logger;", "Lcom/miui/tsmclient/util/ILogger;", "<init>", "()V", "sendLog", "", "msg", "", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Logger implements ILogger {

    @NotNull
    public static final Logger INSTANCE = new Logger();

    private Logger() {
    }

    @Override // com.miui.tsmclient.util.ILogger
    public void sendLog(@Nullable String msg) {
        syo.a(msg);
    }
}
