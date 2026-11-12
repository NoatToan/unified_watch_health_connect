package com.xiaomi.hm.health.bt.profile.auth.errorcode;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/auth/errorcode/AppAuthError;", "", "Lcom/xiaomi/hm/health/bt/profile/auth/errorcode/AuthError;", "", "code", LogUtil.I, "getCode", "()I", "", "desc", "Ljava/lang/String;", "getDesc", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "KEY_ERROR", "START_LOCAL_BIND_FAIL", "START_CLOUD_BIND_FAIL", "REQUEST_RANDOM_FAIL", "ENCRYPT_FAIL", "AUTHORIZE_FAIL", "GENERATE_RANDOM_FAIL", "GENERATE_SHA_256_FAIL", "GET_SIGN_FAIL", "GENERATE_SEC_FAIL", "LOCAL_ENCRYPT", "VERIFY_SIGNATURE_FAIL", "VERIFY_NOT_RESPONSE", "PROFILE_INIT_FAIL", "SEND_NO_RESPONSE_KEY_FAIL", "MD5_FAIL", "SET_TIME_FAIL", "GET_DEVICE_INFO_FAIL", "AUTH_EXCEPTION", "NO_AUTH_IMPL", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public enum AppAuthError implements AuthError {
    KEY_ERROR(1, "Key为空或不正确"),
    START_LOCAL_BIND_FAIL(2, "开始本地绑定失败"),
    START_CLOUD_BIND_FAIL(3, "开始云验签绑定失败"),
    REQUEST_RANDOM_FAIL(4, "获取随机数失败"),
    ENCRYPT_FAIL(5, "加密失败"),
    AUTHORIZE_FAIL(6, "认证命令失败"),
    GENERATE_RANDOM_FAIL(7, "生成随机数失败"),
    GENERATE_SHA_256_FAIL(8, "生成SHA256失败"),
    GET_SIGN_FAIL(9, "获取签名数据失败"),
    GENERATE_SEC_FAIL(10, "生成共享安全Key失败"),
    LOCAL_ENCRYPT(11, "本地加密失败"),
    VERIFY_SIGNATURE_FAIL(12, "发送Verify命令失败"),
    VERIFY_NOT_RESPONSE(13, "Verify命令无回复"),
    PROFILE_INIT_FAIL(14, "Profile初始化失败"),
    SEND_NO_RESPONSE_KEY_FAIL(15, "发送无响应Key失败"),
    MD5_FAIL(16, "MD5操作失败"),
    SET_TIME_FAIL(17, "写时间失败"),
    GET_DEVICE_INFO_FAIL(18, "读取设备信息失败"),
    AUTH_EXCEPTION(19, "认证流程异常退出"),
    NO_AUTH_IMPL(20, "找不到合适的认证实现");

    private final int code;

    @NotNull
    private final String desc;

    AppAuthError(int i, String str) {
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
