package com.xiaomi.fitness.medal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/medal/MedalConstant;", "", "<init>", "()V", "MEDAL_SID", "", "BASE_HOST", "HEALTH_PATH", "HEALTH_HOST", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MedalConstant {

    @NotNull
    public static final String BASE_HOST = "watch.iot.mi.com";

    @NotNull
    public static final String HEALTH_HOST = "https://watch.iot.mi.com/";

    @NotNull
    public static final String HEALTH_PATH = "cgi-op/api/v1/miwear/";

    @NotNull
    public static final MedalConstant INSTANCE = new MedalConstant();

    @NotNull
    public static final String MEDAL_SID = "miothealth";

    private MedalConstant() {
    }
}
