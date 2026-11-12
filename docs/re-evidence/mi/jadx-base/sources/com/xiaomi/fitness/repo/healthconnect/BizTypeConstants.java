package com.xiaomi.fitness.repo.healthconnect;

import com.xiaomi.wearable.hm.ChangeListenerImpl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/repo/healthconnect/BizTypeConstants;", "", "<init>", "()V", "STEP", "", "HR", "CALORIE", "SPO2", "SLEEP", ChangeListenerImpl.SETTING_GROUP_TYPE_SPORT, "SPEED", "STEP_CADENCE", "ELEVATION", "DISTANCE", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BizTypeConstants {

    @NotNull
    public static final String CALORIE = "calorie";

    @NotNull
    public static final String DISTANCE = "distance";

    @NotNull
    public static final String ELEVATION = "elevation";

    @NotNull
    public static final String HR = "hr";

    @NotNull
    public static final BizTypeConstants INSTANCE = new BizTypeConstants();

    @NotNull
    public static final String SLEEP = "sleep";

    @NotNull
    public static final String SPEED = "speed";

    @NotNull
    public static final String SPO2 = "spo2";

    @NotNull
    public static final String SPORT = "sport";

    @NotNull
    public static final String STEP = "step";

    @NotNull
    public static final String STEP_CADENCE = "step_cadence";

    private BizTypeConstants() {
    }
}
