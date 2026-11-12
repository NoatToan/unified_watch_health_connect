package defpackage;

import com.amap.api.services.core.AMapException;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lbm;", "", "", "code", "I", PluginDeviceInfo.FDESC, "()I", "", "message", "Ljava/lang/String;", PluginDeviceInfo.FICONON, "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public enum bm {
    UNKNOW(0, AMapException.AMAP_CLIENT_UNKNOWN_ERROR),
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
    COUNTDOWN_ALIVE(35, "倒计时"),
    ESIM_ACTIVATING(36, "eSIM开卡中"),
    RECORDER_ALIVE(37, "录音"),
    PHONE_CALL_ALIVE(38, "蓝牙电话"),
    HTTP_OTA_RUNNING(39, "HTTP OTA 进行中"),
    POWER_SAVING_MODE_ON(40, "省电模式已打开"),
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


    @NotNull
    public static final a v = new a(null);
    public final int t;

    @NotNull
    public final String u;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lbm$a;", "", "", "code", "Lbm;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
        @NotNull
        public final bm a(int code) {
            for (bm bmVar : bm.values()) {
                if (bmVar.getT() == code) {
                    if (bmVar == null) {
                        return bm.UNKNOW;
                    }
                    return bmVar;
                }
            }
            bmVar = null;
            if (bmVar == null) {
                return bm.UNKNOW;
            }
            return bmVar;
        }
    }

    bm(int i, String str) {
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
