package com.xiaomi.fitness.heartrate.finger;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/heartrate/finger/MiuiHeartRateCode;", "", "<init>", "()V", "DESCRIPTOR", "", "HEARTBEAT_RATE_SEND_CMD", "", "HEARTBEAT_RATE_REGISTER", "HEARTBEAT_RATE_UNREGISTER", "HEARTBEAT_RATE_DATA", "getCodeName", "code", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiuiHeartRateCode {

    @NotNull
    public static final String DESCRIPTOR = "com.android.app.HeartRate";
    public static final int HEARTBEAT_RATE_DATA = 16777212;
    public static final int HEARTBEAT_RATE_REGISTER = 16777214;
    public static final int HEARTBEAT_RATE_SEND_CMD = 16777215;
    public static final int HEARTBEAT_RATE_UNREGISTER = 16777213;

    @NotNull
    public static final MiuiHeartRateCode INSTANCE = new MiuiHeartRateCode();

    private MiuiHeartRateCode() {
    }

    @NotNull
    public final String getCodeName(int code) {
        switch (code) {
            case HEARTBEAT_RATE_DATA /* 16777212 */:
                return "HEARTBEAT_RATE_DATA";
            case HEARTBEAT_RATE_UNREGISTER /* 16777213 */:
                return "HEARTBEAT_RATE_UNREGISTER";
            case HEARTBEAT_RATE_REGISTER /* 16777214 */:
                return "HEARTBEAT_RATE_REGISTER";
            case 16777215:
                return "HEARTBEAT_RATE_SEND_CMD";
            default:
                return "unknown code:" + code;
        }
    }
}
