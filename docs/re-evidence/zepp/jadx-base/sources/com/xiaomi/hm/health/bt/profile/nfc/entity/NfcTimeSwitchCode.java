package com.xiaomi.hm.health.bt.profile.nfc.entity;

import com.amap.api.maps.AMapException;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/nfc/entity/NfcTimeSwitchCode;", "", "", "value", LogUtil.I, "getValue", "()I", "", "des", "Ljava/lang/String;", "getDes", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "Companion", "NFC_SUCCESS", "NFC_GENERIC_ERROR", "NFC_UNKNOWN_CMD", "NFC_DATA_LOST", "NFC_MOLLOC_ERROR", "NFC_UNKNOWN_ERROR", "NFC_STORE_ERROR", "NFC_STORE_DATA_NOT", "NFC_SET_DUPLICATE_STORAGE", "NFC_SET_SAME_TIME", "NFC_SET_TIMEOUT", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public enum NfcTimeSwitchCode {
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


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String des;
    private final int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/nfc/entity/NfcTimeSwitchCode$Companion;", "", "", "code", "Lcom/xiaomi/hm/health/bt/profile/nfc/entity/NfcTimeSwitchCode;", "parseCode", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final NfcTimeSwitchCode parseCode(int code) {
            for (NfcTimeSwitchCode nfcTimeSwitchCode : NfcTimeSwitchCode.values()) {
                if (nfcTimeSwitchCode.getValue() == code) {
                    return nfcTimeSwitchCode;
                }
            }
            return null;
        }
    }

    NfcTimeSwitchCode(int i, String str) {
        this.value = i;
        this.des = str;
    }

    @NotNull
    public final String getDes() {
        return this.des;
    }

    public final int getValue() {
        return this.value;
    }
}
