package defpackage;

import com.amap.api.maps.AMapException;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Ltm;", "", "", "value", "I", PluginDeviceInfo.FDESC, "()I", "", "des", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public enum tm {
    NFC_SUCCESS(0, "成功"),
    NFC_GENERIC_ERROR(1, "通用错误"),
    NFC_UNKNOWN_CMD(24, "未知的指令"),
    NFC_DATA_LOST(25, "数据丢失"),
    NFC_MOLLOC_ERROR(32, "固件没有运行空间molloc失败"),
    NFC_UNKNOWN_ERROR(50, AMapException.ERROR_UNKNOWN),
    NFC_STORE_ERROR(51, "存储失败"),
    NFC_STORE_DATA_NOT(52, "未存储数据"),
    NFC_SET_DUPLICATE_STORAGE(53, "重复存储"),
    NFC_SET_SAME_TIME(66, "定时时间相同"),
    NFC_SET_TIMEOUT(255, "设置超时");


    @NotNull
    public static final a v = new a(null);
    public final int t;

    @NotNull
    public final String u;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltm$a;", "", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    tm(int i, String str) {
        this.t = i;
        this.u = str;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getT() {
        return this.t;
    }
}
