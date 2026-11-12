package com.xiaomi.fitness.heartrate.finger;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/heartrate/finger/DelmarConstants;", "", "<init>", "()V", "HEARTBEAT_RATE_CMD_PRE_HEART_RATE_DETECT", "", "HEARTBEAT_RATE_CMD_HEART_RATE_FINGER_DOWN", "HEARTBEAT_RATE_CMD_HEART_RATE_FINGER_UP", "HEARTBEAT_RATE_CMD_POST_HEART_RATE_DETECT", "HEARTBEAT_RATE_CMD_DUMP_HEART_RATE_RESULT", "HEARTBEAT_RATE_CMD_CANCEL", "HEARTBEAT_RATE_CMD_NOTIFY_UI_READY", "HEARTBEAT_RATE_CMD_NOTIFY_UI_DISAPPEAR", "getCmdName", "", "cmd", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DelmarConstants {
    public static final int HEARTBEAT_RATE_CMD_CANCEL = 400006;
    public static final int HEARTBEAT_RATE_CMD_DUMP_HEART_RATE_RESULT = 400005;
    public static final int HEARTBEAT_RATE_CMD_HEART_RATE_FINGER_DOWN = 400002;
    public static final int HEARTBEAT_RATE_CMD_HEART_RATE_FINGER_UP = 400003;
    public static final int HEARTBEAT_RATE_CMD_NOTIFY_UI_DISAPPEAR = 400101;
    public static final int HEARTBEAT_RATE_CMD_NOTIFY_UI_READY = 400100;
    public static final int HEARTBEAT_RATE_CMD_POST_HEART_RATE_DETECT = 400004;
    public static final int HEARTBEAT_RATE_CMD_PRE_HEART_RATE_DETECT = 400001;

    @NotNull
    public static final DelmarConstants INSTANCE = new DelmarConstants();

    private DelmarConstants() {
    }

    @NotNull
    public final String getCmdName(int cmd) {
        switch (cmd) {
            case 400001:
                return "PRE_DETECT";
            case 400002:
                return "↓↓↓↓-FINGER_DOWN";
            case 400003:
                return "↑↑↑↑-FINGER_UP";
            case 400004:
                return "POST_DETECT";
            case 400005:
                return "DUMP_RESULT";
            case 400006:
                return "CANCEL";
            default:
                switch (cmd) {
                    case HEARTBEAT_RATE_CMD_NOTIFY_UI_READY /* 400100 */:
                        return "→→→→-UI_READY";
                    case HEARTBEAT_RATE_CMD_NOTIFY_UI_DISAPPEAR /* 400101 */:
                        return "←←←←-UI_DISAPPEAR";
                    default:
                        return "unknown cmd:" + cmd;
                }
        }
    }
}
