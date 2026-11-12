package defpackage;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lrn;", "", "Lnbt;", "", "code", "", "desc", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public enum rn implements nbt {
    AUTH_FAIL(1, "认证命令发送失败"),
    SET_TIME_FAIL(2, "写时间失败"),
    GET_DEVICE_INFO_FAIL(3, "读取设备信息失败"),
    AUTH_EXCEPTION(4, "认证流程异常退出");

    public final int t;

    @NotNull
    public final String u;

    rn(int i, String str) {
        this.t = i;
        this.u = str;
    }
}
