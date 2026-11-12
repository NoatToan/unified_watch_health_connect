package defpackage;

import com.amap.api.services.core.AMapException;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.api.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lk9;", "", "", "code", c.f13755a, PluginDeviceInfo.FDESC, "()B", "", "desc", "<init>", "(Ljava/lang/String;IBLjava/lang/String;)V", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public enum k9 {
    SUCCESS((byte) 1, "命令执行成功"),
    CODE_FAIL((byte) 2, "命令执行失败"),
    INVALID_PARAMETER((byte) 3, "参数错误"),
    NOT_ENOUGH_MEMORY((byte) 4, "内存空间不足"),
    MESSAGE_PARSE_FAILED((byte) 5, "消息解析失败"),
    UNKNOWN_ERROR((byte) 6, AMapException.AMAP_CLIENT_UNKNOWN_ERROR),
    NETWORK_ERROR((byte) 7, "网络错误"),
    IMAGE_TRANSFER_FAILED((byte) 8, "图片传输失败"),
    IMAGE_FORMAT_FAILED((byte) 9, "图片格式转换错误"),
    FILE_TRANSFER_INIT_ERROR((byte) 10, "文件传输通道获取失败");


    @NotNull
    public static final a v = new a(null);
    public final byte t;

    @NotNull
    public final String u;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lk9$a;", "", "", "code", "Lk9;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
        @NotNull
        public final k9 a(byte code) {
            for (k9 k9Var : k9.values()) {
                if (k9Var.getT() == code) {
                    if (k9Var == null) {
                        return k9.UNKNOWN_ERROR;
                    }
                    return k9Var;
                }
            }
            k9Var = null;
            if (k9Var == null) {
                return k9.UNKNOWN_ERROR;
            }
            return k9Var;
        }
    }

    k9(byte b2, String str) {
        this.t = b2;
        this.u = str;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final byte getT() {
        return this.t;
    }
}
