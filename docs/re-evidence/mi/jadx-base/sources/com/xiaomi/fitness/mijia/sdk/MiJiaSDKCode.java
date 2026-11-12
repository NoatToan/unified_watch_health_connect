package com.xiaomi.fitness.mijia.sdk;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/mijia/sdk/MiJiaSDKCode;", "", "<init>", "()V", "ERROR_NET_COMMON_ERR", "", "ERROR_SERVER_ERR", "ERROR_DEVICE_HAS_BOUND", "mijia-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiJiaSDKCode {
    public static final int ERROR_DEVICE_HAS_BOUND = -17;
    public static final int ERROR_NET_COMMON_ERR = 10001;
    public static final int ERROR_SERVER_ERR = 10002;

    @NotNull
    public static final MiJiaSDKCode INSTANCE = new MiJiaSDKCode();

    private MiJiaSDKCode() {
    }
}
