package com.xiaomi.hm.health.bt.utils;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/hm/health/bt/utils/HMHealthDeviceConstant;", "", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HMHealthDeviceConstant {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int DEFAULT_AF_PPG_LENGTH = 7600;
    public static final int DEFAULT_ECG_SAMPLING_RATE = 250;
    public static final int DEFAULT_PPG_SAMPLING_RATE = 100;

    @NotNull
    public static final String JHS_NB_OPEN = "V1.0.7.30";

    @NotNull
    public static final String JHS_NB_VER = "V1.9.0.2";
    public static final boolean NB_IMSI = false;

    @NotNull
    public static final String OMRON_J750L_MODEL_NUMBER = "J750L";

    @NotNull
    public static final String OMRON_MANUFACTURER = "OMRONHEALTHCARE";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0016\u0010\u0013\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/bt/utils/HMHealthDeviceConstant$Companion;", "", "", SessionDescription.p, "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "getEcgDataSeconds", "DEFAULT_AF_PPG_LENGTH", LogUtil.I, "DEFAULT_ECG_SAMPLING_RATE", "DEFAULT_PPG_SAMPLING_RATE", "", "JHS_NB_OPEN", "Ljava/lang/String;", "JHS_NB_VER", "", "NB_IMSI", "Z", "OMRON_J750L_MODEL_NUMBER", "OMRON_MANUFACTURER", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getEcgDataSeconds(int length, @NotNull HMDeviceSource source) {
            return (source == HMDeviceSource.MILI_JIUHUASHAN || source == HMDeviceSource.MILI_JIUHUASHAN_PRO) ? (length / 250) / 4 : (length / 250) / 2;
        }
    }
}
