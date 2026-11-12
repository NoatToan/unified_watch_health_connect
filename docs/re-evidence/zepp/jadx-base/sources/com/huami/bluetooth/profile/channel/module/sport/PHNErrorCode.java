package com.huami.bluetooth.profile.channel.module.sport;

import com.alipay.sdk.m.f0.c;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sport/PHNErrorCode;", "", "", "code", LogUtil.I, "getCode", "()I", "", "desc", "Ljava/lang/String;", "getDesc", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "Companion", "UNKNOWN", c.p, "INVALID_PARAM", "INVALID_COMMAND", "DEVICE_NO_PHN", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public enum PHNErrorCode {
    UNKNOWN(-1, "未知错误"),
    SUCCESS(0, "成功"),
    INVALID_PARAM(1, "无效参数"),
    INVALID_COMMAND(2, "无效命令"),
    DEVICE_NO_PHN(3, "设备上无PHN计划");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int code;

    @NotNull
    private final String desc;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sport/PHNErrorCode$Companion;", "", "", "code", "Lcom/huami/bluetooth/profile/channel/module/sport/PHNErrorCode;", "toErrorCode", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001d  */
        /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
        @NotNull
        public final PHNErrorCode toErrorCode(int code) {
            for (PHNErrorCode pHNErrorCode : PHNErrorCode.values()) {
                if (pHNErrorCode.getCode() == code) {
                    if (pHNErrorCode == null) {
                        return PHNErrorCode.UNKNOWN;
                    }
                    return pHNErrorCode;
                }
            }
            pHNErrorCode = null;
            if (pHNErrorCode == null) {
                return PHNErrorCode.UNKNOWN;
            }
            return pHNErrorCode;
        }
    }

    PHNErrorCode(int i, String str) {
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
