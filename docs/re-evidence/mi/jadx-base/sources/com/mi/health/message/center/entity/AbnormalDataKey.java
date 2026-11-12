package com.mi.health.message.center.entity;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/mi/health/message/center/entity/AbnormalDataKey;", "", "<init>", "()V", "ABNORMAL_HEART_BEAT", "", "ABNORMAL_HIGH_HEART_RATE", "ABNORMAL_LOW_HEART_RATE", "ABNORMAL_LOW_SPO2", "message-center_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AbnormalDataKey {

    @NotNull
    public static final String ABNORMAL_HEART_BEAT = "abnormal_heart_beat";

    @NotNull
    public static final String ABNORMAL_HIGH_HEART_RATE = "high_heart_rate";

    @NotNull
    public static final String ABNORMAL_LOW_HEART_RATE = "high_heart_rate";

    @NotNull
    public static final String ABNORMAL_LOW_SPO2 = "low_spo2";

    @NotNull
    public static final AbnormalDataKey INSTANCE = new AbnormalDataKey();

    private AbnormalDataKey() {
    }
}
