package com.xiaomi.hm.health.bt.profile.dfu;

import com.alipay.sdk.m.f0.c;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.ecg.core.model.constant.MeasureStateValue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b1\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7¨\u00068"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/dfu/MyDfuError;", "", "", "code", LogUtil.I, "getCode", "()I", "", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "Companion", "UNKNOW", c.p, "INVALID_STATE", "EXCEEDS_LIMIT", "CRC_ERR", "PACKET_MISSING", "FORMAT_ERROR", MeasureStateValue.BUSY, "R_TIMEOUT", "R_SEQ_ERR", "DISCONNECT", "IN_SPORT", "TIMING", "BATTERY_LOW", "MUSIC_ALIVE", "XIAOAI_ALIVE", "ECG_ALIVE", "TP_UPGRADING", "SIG_NO_HEAD", "SIG_HEAD_FMT_ERR", "SIG_PNP_NOT_MATCH", "SIG_VERIFY_FAIL", "GPS_UPGRADE_FAILED", "MODEM_UPGRADE_FAILED", "EXTERNAL_RESOURCE_UPGRADE_FAILED", "FIRMWARE_INTERNAL_ERROR", "UNSUPPORT_FILE_TYPE", "UNSUPPORT_SUB_FILE_TYPE", "SUB_FILE_ORDER_ERROR", "OPEN_FILE_FAILED", "READ_WRITE_FILE_FAILED", "DECOMPRESS_FAILED", "OPEN_SOURCE_FILE_FAILED", "TRANSFER_ERROR", "TRANSFER_NO_CONTINUE_RESPONSE", "IAP_FAILED", "WRITE_TRUNK_FAILED", "TRANSFER_LENGTH_ERROR", "COMMAND_SEND_FAILED", "RESPONSE_IS_NULL", "FILE_NOT_FOUND", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public enum MyDfuError {
    UNKNOW(0, "未知错误"),
    SUCCESS(1, "成功"),
    INVALID_STATE(2, "无效参数或状态"),
    EXCEEDS_LIMIT(4, "文件大小超出范围"),
    CRC_ERR(5, "CRC校验错误"),
    PACKET_MISSING(7, "传输过程丢包"),
    FORMAT_ERROR(8, "文件格式错误"),
    BUSY(9, "固件忙"),
    R_TIMEOUT(10, "超时，如长时间未收到数据包"),
    R_SEQ_ERR(11, "状态机错误"),
    DISCONNECT(14, "断开连接"),
    IN_SPORT(32, "设备在运动状态，不可升级"),
    TIMING(33, "设备在计时中，不可升级"),
    BATTERY_LOW(34, "电量低"),
    MUSIC_ALIVE(48, "设备正在播放音乐，不可升级"),
    XIAOAI_ALIVE(49, "正在使用小爱，不可升级"),
    ECG_ALIVE(50, "设备正在测量ECG，不可升级"),
    TP_UPGRADING(51, "TP升级中"),
    SIG_NO_HEAD(64, "签名固件头丢失，一般为固件文件问题或者制定了错误的固件类型"),
    SIG_HEAD_FMT_ERR(65, "固件头格式错误，需要检查所使用的固件文件"),
    SIG_PNP_NOT_MATCH(66, "签名固件PNP不匹配，检查固件文件是否正确或者找固件团队提供过渡固件"),
    SIG_VERIFY_FAIL(67, "固件签名校验失败，联系固件团队提供正确签名的固件"),
    GPS_UPGRADE_FAILED(68, "GPS升级失败，首先确认使用GPS固件是否正确或损坏，其次导出固件日志联系固件团队分析"),
    MODEM_UPGRADE_FAILED(69, "Modem升级失败，首先确认使用Modem固件是否正确或损坏，其次导出固件日志联系固件团队分析"),
    EXTERNAL_RESOURCE_UPGRADE_FAILED(70, "外部资源升级失败，首先确认使用Modem固件是否正确或损坏，其次导出固件日志联系固件团队分析"),
    FIRMWARE_INTERNAL_ERROR(80, "固件内部错误"),
    UNSUPPORT_FILE_TYPE(81, "不支持的文件类型"),
    UNSUPPORT_SUB_FILE_TYPE(82, "不支持的子文件类型"),
    SUB_FILE_ORDER_ERROR(83, "子文件顺序错误"),
    OPEN_FILE_FAILED(84, "打开文件失败"),
    READ_WRITE_FILE_FAILED(85, "读写文件失败"),
    DECOMPRESS_FAILED(86, "解压缩失败"),
    OPEN_SOURCE_FILE_FAILED(87, "打开资源（如表盘）文件失败"),
    TRANSFER_ERROR(-1, "升级过程中写数据失败,可能是连接断开/命令超时等"),
    TRANSFER_NO_CONTINUE_RESPONSE(-2, "传输过过程中无来自固件继续传输响应"),
    IAP_FAILED(88, "在应用编程失败"),
    WRITE_TRUNK_FAILED(-3, "数据块写入失败"),
    TRANSFER_LENGTH_ERROR(-4, "传输长度计算出现不一致，App发送固件数据超时或者丢包导致"),
    COMMAND_SEND_FAILED(-5, "指令发送失败"),
    RESPONSE_IS_NULL(-6, "校验或升级命令没有收到回复，大概率是固件看门狗重启后连接断开导致"),
    FILE_NOT_FOUND(-7, "固件文件未找到");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int code;

    @NotNull
    private final String message;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/dfu/MyDfuError$Companion;", "", "", "code", "Lcom/xiaomi/hm/health/bt/profile/dfu/MyDfuError;", "fromValue", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001d  */
        /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
        @NotNull
        public final MyDfuError fromValue(int code) {
            for (MyDfuError myDfuError : MyDfuError.values()) {
                if (myDfuError.getCode() == code) {
                    if (myDfuError == null) {
                        return MyDfuError.UNKNOW;
                    }
                    return myDfuError;
                }
            }
            myDfuError = null;
            if (myDfuError == null) {
                return MyDfuError.UNKNOW;
            }
            return myDfuError;
        }
    }

    MyDfuError(int i, String str) {
        this.code = i;
        this.message = str;
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }
}
