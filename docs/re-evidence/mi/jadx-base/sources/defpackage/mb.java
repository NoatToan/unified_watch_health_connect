package defpackage;

import com.amap.api.services.core.AMapException;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lmb;", "", "", "code", "I", PluginDeviceInfo.FDESC, "()I", "", "desc", "Ljava/lang/String;", PluginDeviceInfo.FICONON, "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public enum mb {
    UNKNOWN(-3, AMapException.AMAP_CLIENT_UNKNOWN_ERROR),
    NO_CONNECTION(-2, "蓝牙未连接"),
    NO_DATA(-1, "无数据"),
    SUCCESS(1, "成功"),
    UNKNOWN_COMMAND(2, "未知命令"),
    INVALID_PARAMETER(3, "未知参数"),
    OPERATION_FAILED(4, "操作失败"),
    INVALID_STATE(5, "未知状态"),
    PACKET_INDEX_ERROR(6, "数据包号错误"),
    BUSY(7, "状态忙"),
    CRC_MISMATCH(8, "CRC不匹配"),
    CANCEL(9, "app取消传输"),
    CONTENT_PARSING_ERROR(10, "内容解析错误"),
    UNAUTHORIZED(11, "未授权"),
    COMPRESS_FAILED(12, "压缩失败"),
    DECOMPRESS_FAILED(13, "解压缩失败"),
    MUSIC_ALIVE(48, "音乐运行中"),
    SPEECH_ALIVE(49, "语音运行中"),
    TIMEOUT(50, "超时");


    @NotNull
    public static final a v = new a(null);
    public final int t;

    @NotNull
    public final String u;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lmb$a;", "", "", "value", "Lmb;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
        @NotNull
        public final mb a(int value) {
            for (mb mbVar : mb.values()) {
                if (mbVar.getT() == value) {
                    if (mbVar == null) {
                        return mb.SUCCESS;
                    }
                    return mbVar;
                }
            }
            mbVar = null;
            if (mbVar == null) {
                return mb.SUCCESS;
            }
            return mbVar;
        }
    }

    mb(int i, String str) {
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
