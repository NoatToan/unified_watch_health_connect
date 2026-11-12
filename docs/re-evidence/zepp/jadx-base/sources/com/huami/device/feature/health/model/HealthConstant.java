package com.huami.device.feature.health.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004¨\u0006\u000f"}, d2 = {"Lcom/huami/device/feature/health/model/HealthConstant;", "", "", "MILI_ANETO_SOURCE", LogUtil.I, "VALUE_CLOSE", "FREQ_1", "FREQ_5", "FREQ_10", "FREQ_30", "FREQ_SMART", "HR_ALERT_ENABLE_MIN_HR_FREQ", "HR_ALERT_ENABLE_MIN_HR_FREQ_HUAMIOS", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
public final class HealthConstant {
    public static final int FREQ_1 = 1;
    public static final int FREQ_10 = 10;
    public static final int FREQ_30 = 30;
    public static final int FREQ_5 = 5;
    public static final int FREQ_SMART = 255;
    public static final int HR_ALERT_ENABLE_MIN_HR_FREQ = 10;
    public static final int HR_ALERT_ENABLE_MIN_HR_FREQ_HUAMIOS = 1;

    @NotNull
    public static final HealthConstant INSTANCE = new HealthConstant();
    public static final int MILI_ANETO_SOURCE = 65;
    public static final int VALUE_CLOSE = 0;

    private HealthConstant() {
    }
}
