package com.huami.account.service.lifecycle;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/huami/account/service/lifecycle/LogoutStateType;", "", "", "type", "fromType", LogUtil.I, "getType", "()I", "<init>", "(Ljava/lang/String;II)V", "BY_USER", "TOKEN_EXPIRE", "MUTEX", "CANCELLATION", "FORCE", "BY_USER_LOGIN_MI", "BOOT", "UNKNOWN", "service_release"}, k = 1, mv = {1, 5, 1})
public enum LogoutStateType {
    BY_USER(1),
    TOKEN_EXPIRE(2),
    MUTEX(3),
    CANCELLATION(4),
    FORCE(5),
    BY_USER_LOGIN_MI(6),
    BOOT(7),
    UNKNOWN(-1);

    private final int type;

    LogoutStateType(int i) {
        this.type = i;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001d  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    @NotNull
    public final LogoutStateType fromType(int type) {
        for (LogoutStateType logoutStateType : values()) {
            if (logoutStateType.getType() == type) {
                if (logoutStateType == null) {
                    return UNKNOWN;
                }
                return logoutStateType;
            }
        }
        logoutStateType = null;
        if (logoutStateType == null) {
            return UNKNOWN;
        }
        return logoutStateType;
    }

    public final int getType() {
        return this.type;
    }
}
