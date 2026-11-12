package com.huami.ecg.core.model.constant;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u001e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b)\u0010*J\u0016\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u0016\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u0016\u0010\u0015\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\tR\u0016\u0010\u0016\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\tR\u0016\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u0016\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u0016\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u0016\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u0016\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\fR\u001c\u0010\u001f\u001a\u00020\u00078\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u001c\u0010\t\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\"\u001a\u00020\u00078\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b \u0010\t\u001a\u0004\b!\u0010\u001eR\u001c\u0010%\u001a\u00020\u00078\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b#\u0010\t\u001a\u0004\b$\u0010\u001eR\u001c\u0010(\u001a\u00020\u00078\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b&\u0010\t\u001a\u0004\b'\u0010\u001e¨\u0006+"}, d2 = {"Lcom/huami/ecg/core/model/constant/EcgConst;", "", "", SessionDescription.p, "", "isECGWatchFamily", "getEcgDataSeconds", "", "LANGUAGE_ZH", "Ljava/lang/String;", "LANGUAGE_EN", "DEFAULT_ECG_SAMPLING_RATE", LogUtil.I, "", "ECG_CARDIAC_LENGTH", "J", "ECG_FULL_MEASURE_SECOND_TIME", "DEFAULT_PPG_SAMPLING_RATE", "DEFAULT_AF_PPG_LENGTH", "MIN_RR_PEAKS", "ECG_NOISY_PERCENT", "JHM_NB_VER", "JHM_NB_OPEN", "CINCO_FT_VER", "CINCO_RES_VER", "MI_FT_VER", "JHM_FT_VER", "JHM_RES_VER", "a", "getHB_FW_VER", "()Ljava/lang/String;", "HB_FW_VER", "b", "getHB1S_FW_VER", "HB1S_FW_VER", "c", "getHBAI_FW_VER", "HBAI_FW_VER", GoogleApiAvailabilityLight.a, "getJHM_FW_VER", "JHM_FW_VER", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class EcgConst {
    public static final int CINCO_FT_VER = 1;
    public static final int CINCO_RES_VER = 33;
    public static final int DEFAULT_AF_PPG_LENGTH = 7600;
    public static final int DEFAULT_ECG_SAMPLING_RATE = 250;
    public static final int DEFAULT_PPG_SAMPLING_RATE = 100;
    public static final long ECG_CARDIAC_LENGTH = 58500;
    public static final int ECG_FULL_MEASURE_SECOND_TIME = 234;
    public static final int ECG_NOISY_PERCENT = 50;
    public static final int JHM_FT_VER = 8;

    @NotNull
    public static final String JHM_NB_OPEN = "V1.0.7.30";

    @NotNull
    public static final String JHM_NB_VER = "V1.9.0.2";
    public static final int JHM_RES_VER = 13;

    @NotNull
    public static final String LANGUAGE_EN = "en";

    @NotNull
    public static final String LANGUAGE_ZH = "zh_CN";
    public static final int MIN_RR_PEAKS = 15;
    public static final int MI_FT_VER = 1;
    public static final EcgConst INSTANCE = new EcgConst();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String HB_FW_VER = "V2.0.3.12";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String HB1S_FW_VER = "V2.0.4.22";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String HBAI_FW_VER = "V1.0.2.60";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String JHM_FW_VER = "V1.0.8.33";

    private EcgConst() {
    }

    public final int getEcgDataSeconds(int length, boolean isECGWatchFamily) {
        return isECGWatchFamily ? (length / 250) / 4 : (length / 250) / 2;
    }

    @NotNull
    public final String getHB1S_FW_VER() {
        return HB1S_FW_VER;
    }

    @NotNull
    public final String getHBAI_FW_VER() {
        return HBAI_FW_VER;
    }

    @NotNull
    public final String getHB_FW_VER() {
        return HB_FW_VER;
    }

    @NotNull
    public final String getJHM_FW_VER() {
        return JHM_FW_VER;
    }
}
