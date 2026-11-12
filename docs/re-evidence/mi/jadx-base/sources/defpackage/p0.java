package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lp0;", "", "", "code", "I", PluginDeviceInfo.FDESC, "()I", "", "desc", "Ljava/lang/String;", PluginDeviceInfo.FICONON, "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public enum p0 {
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


    @NotNull
    public static final a v = new a(null);
    public final int t;

    @NotNull
    public final String u;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lp0$a;", "", "", "code", "Lp0;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
        @NotNull
        public final p0 a(int code) {
            for (p0 p0Var : p0.values()) {
                if (p0Var.getT() == code) {
                    if (p0Var == null) {
                        return p0.OTHER;
                    }
                    return p0Var;
                }
            }
            p0Var = null;
            if (p0Var == null) {
                return p0.OTHER;
            }
            return p0Var;
        }
    }

    p0(int i, String str) {
        this.t = i;
        this.u = str;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getT() {
        return this.t;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getU() {
        return this.u;
    }
}
