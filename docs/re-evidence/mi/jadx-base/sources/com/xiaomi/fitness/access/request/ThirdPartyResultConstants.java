package com.xiaomi.fitness.access.request;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\t\u001a\u00020\n*\u00020\u0005J\n\u0010\u000b\u001a\u00020\n*\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/access/request/ThirdPartyResultConstants;", "", "<init>", "()V", "BIND_RESULT_FAILURE", "", "BIND_RESULT_SUCCESS", "BIND_STATUS_NOT_BOUND", "BIND_STATUS_ALREADY_BOUND", "getResultName", "", "getStatusName", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ThirdPartyResultConstants {
    public static final int BIND_RESULT_FAILURE = 0;
    public static final int BIND_RESULT_SUCCESS = 1;
    public static final int BIND_STATUS_ALREADY_BOUND = 1;
    public static final int BIND_STATUS_NOT_BOUND = 0;

    @NotNull
    public static final ThirdPartyResultConstants INSTANCE = new ThirdPartyResultConstants();

    private ThirdPartyResultConstants() {
    }

    @NotNull
    public final String getResultName(int i) {
        if (i != 0) {
            return i != 1 ? "UNKNOWN_RESULT" : "BIND_RESULT_SUCCESS";
        }
        return "BIND_RESULT_FAILURE";
    }

    @NotNull
    public final String getStatusName(int i) {
        if (i != 0) {
            return i != 1 ? "UNKNOWN_STATUS" : "BIND_STATUS_ALREADY_BOUND";
        }
        return "BIND_STATUS_NOT_BOUND";
    }
}
