package com.xiaomi.hm.health.bt.profile.auth.errorcode;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/auth/errorcode/OldAppAuthError;", "", "Lcom/xiaomi/hm/health/bt/profile/auth/errorcode/AuthError;", "", "code", LogUtil.I, "getCode", "()I", "", "desc", "Ljava/lang/String;", "getDesc", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "AUTH_FAIL", "SET_TIME_FAIL", "GET_DEVICE_INFO_FAIL", "AUTH_EXCEPTION", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public enum OldAppAuthError implements AuthError {
    AUTH_FAIL(1, "认证命令发送失败"),
    SET_TIME_FAIL(2, "写时间失败"),
    GET_DEVICE_INFO_FAIL(3, "读取设备信息失败"),
    AUTH_EXCEPTION(4, "认证流程异常退出");

    private final int code;

    @NotNull
    private final String desc;

    OldAppAuthError(int i, String str) {
        this.code = i;
        this.desc = str;
    }

    @Override // com.xiaomi.hm.health.bt.profile.auth.errorcode.AuthError
    public int getCode() {
        return this.code;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }
}
