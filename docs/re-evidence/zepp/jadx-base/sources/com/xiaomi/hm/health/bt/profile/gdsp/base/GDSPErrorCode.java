package com.xiaomi.hm.health.bt.profile.gdsp.base;

import com.alipay.sdk.m.f0.c;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.ecg.core.model.constant.MeasureStateValue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!¨\u0006\""}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPErrorCode;", "", "", "code", LogUtil.I, "getCode", "()I", "", "desc", "Ljava/lang/String;", "getDesc", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "Companion", "UNKNOWN", "NO_CONNECTION", "NO_DATA", c.p, "UNKNOWN_COMMAND", "INVALID_PARAMETER", "OPERATION_FAILED", "INVALID_STATE", "PACKET_INDEX_ERROR", MeasureStateValue.BUSY, "CRC_MISMATCH", "CANCEL", "CONTENT_PARSING_ERROR", "UNAUTHORIZED", "COMPRESS_FAILED", "DECOMPRESS_FAILED", "MUSIC_ALIVE", "SPEECH_ALIVE", "TIMEOUT", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public enum GDSPErrorCode {
    UNKNOWN(-3, "未知错误"),
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


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int code;

    @NotNull
    private final String desc;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPErrorCode$Companion;", "", "", "value", "Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPErrorCode;", "fromValue", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001d  */
        /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
        @NotNull
        public final GDSPErrorCode fromValue(int value) {
            for (GDSPErrorCode gDSPErrorCode : GDSPErrorCode.values()) {
                if (gDSPErrorCode.getCode() == value) {
                    if (gDSPErrorCode == null) {
                        return GDSPErrorCode.SUCCESS;
                    }
                    return gDSPErrorCode;
                }
            }
            gDSPErrorCode = null;
            if (gDSPErrorCode == null) {
                return GDSPErrorCode.SUCCESS;
            }
            return gDSPErrorCode;
        }
    }

    GDSPErrorCode(int i, String str) {
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

    /* synthetic */ GDSPErrorCode(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str);
    }
}
