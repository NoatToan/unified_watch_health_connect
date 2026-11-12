package defpackage;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ly;", "", "Lnbt;", "", "code", "", "desc", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public enum y implements nbt {
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

    public final int t;

    @NotNull
    public final String u;

    y(int i, String str) {
        this.t = i;
        this.u = str;
    }
}
