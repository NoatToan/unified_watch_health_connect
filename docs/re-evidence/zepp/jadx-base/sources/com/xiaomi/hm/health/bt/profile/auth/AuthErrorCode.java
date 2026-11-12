package com.xiaomi.hm.health.bt.profile.auth;

import com.alipay.sdk.m.f0.c;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.ecg.core.model.constant.MeasureStateValue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#¨\u0006$"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/auth/AuthErrorCode;", "", "", "code", LogUtil.I, "getCode", "()I", "", "desc", "Ljava/lang/String;", "getDesc", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "Companion", MeasureStateValue.OTHER, c.p, "INVALID_STATE", "UNKNOWN_COMMAND", "OPERATION_FAILED", "SPORT_ONGOING", "INVALID_PARAMETER", "KEY_NOT_FOUND", "SIGNATURE_VERIFY_FAILED", "API_LEVEL_UNSUFFICIENT", "PROTECT_BINDING_ON", "LOCAL_BIND_FORBIDDEN", "CANNOT_SAVE_KEY", "USER_REJECTED", "GENERATE_PUBLIC_KEY_HASH_FAILED", "AES_ENCRYPTION_FAILED", "NO_MEMORY", "BINDING_AES_CIPHERTEXT_MISMATCH", "AUTHORIZE_AES_CIPHERTEXT_MISMATCH", "GENERATE_ECDH_PRIVATE_KEY_FAILED", "GENERATE_ECDH_SHARED_SECRET_FAILED", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public enum AuthErrorCode {
    OTHER(0, "其它"),
    SUCCESS(1, "成功"),
    INVALID_STATE(2, "状态机错误"),
    UNKNOWN_COMMAND(3, "未知命令"),
    OPERATION_FAILED(4, "操作失败"),
    SPORT_ONGOING(5, "运动中"),
    INVALID_PARAMETER(6, "参数错误"),
    KEY_NOT_FOUND(7, "找不到KEY"),
    SIGNATURE_VERIFY_FAILED(8, "签名校验失败"),
    API_LEVEL_UNSUFFICIENT(9, "API LEVEL不满足"),
    PROTECT_BINDING_ON(65, "绑定保护已开启"),
    LOCAL_BIND_FORBIDDEN(129, "禁止本地绑定方式，需要使用云授权"),
    CANNOT_SAVE_KEY(32, "保存KEY失败"),
    USER_REJECTED(33, "用户拒绝"),
    GENERATE_PUBLIC_KEY_HASH_FAILED(34, "生成公钥HASH失败"),
    AES_ENCRYPTION_FAILED(35, "AES加密失败"),
    NO_MEMORY(36, "没有内存、申请内存失败"),
    BINDING_AES_CIPHERTEXT_MISMATCH(37, "绑定AES,KEY对应的密文不匹配"),
    AUTHORIZE_AES_CIPHERTEXT_MISMATCH(38, "授权AES,KEY对应的密文不匹配"),
    GENERATE_ECDH_PRIVATE_KEY_FAILED(39, "生成密钥失败"),
    GENERATE_ECDH_SHARED_SECRET_FAILED(40, "生成共享密钥失败");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int code;

    @NotNull
    private final String desc;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/auth/AuthErrorCode$Companion;", "", "", "code", "Lcom/xiaomi/hm/health/bt/profile/auth/AuthErrorCode;", "fromValue", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001d  */
        /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
        @NotNull
        public final AuthErrorCode fromValue(int code) {
            for (AuthErrorCode authErrorCode : AuthErrorCode.values()) {
                if (authErrorCode.getCode() == code) {
                    if (authErrorCode == null) {
                        return AuthErrorCode.OTHER;
                    }
                    return authErrorCode;
                }
            }
            authErrorCode = null;
            if (authErrorCode == null) {
                return AuthErrorCode.OTHER;
            }
            return authErrorCode;
        }
    }

    AuthErrorCode(int i, String str) {
        this.code = i;
        this.desc = str;
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }
}
