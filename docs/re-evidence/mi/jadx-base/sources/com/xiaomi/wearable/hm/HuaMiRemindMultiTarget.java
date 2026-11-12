package com.xiaomi.wearable.hm;

import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b%\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u001c\u0010\u0016\"\u0004\b\u001d\u0010\u0018R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R\u001e\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010\u0013R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b$\u0010\u0016\"\u0004\b%\u0010\u0018R\u001e\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b&\u0010\u0011\"\u0004\b'\u0010\u0013R\u001e\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b(\u0010\u0016\"\u0004\b)\u0010\u0018¨\u0006*"}, d2 = {"Lcom/xiaomi/wearable/hm/HuaMiRemindMultiTarget;", "Ljava/io/Serializable;", "stepRemind", "", "stepTarget", "", "calorieRemind", "calorieTarget", "sleepRemind", "sleepTarget", DeviceSettingConfigKey.KEY_STAND_REMIND, "standTarget", "activityRemind", "activityTarget", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;)V", "getStepRemind", "()Ljava/lang/Boolean;", "setStepRemind", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getStepTarget", "()Ljava/lang/Long;", "setStepTarget", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getCalorieRemind", "setCalorieRemind", "getCalorieTarget", "setCalorieTarget", "getSleepRemind", "setSleepRemind", "getSleepTarget", "setSleepTarget", "getStandRemind", "setStandRemind", "getStandTarget", "setStandTarget", "getActivityRemind", "setActivityRemind", "getActivityTarget", "setActivityTarget", "huami-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HuaMiRemindMultiTarget implements Serializable {

    @Nullable
    private Boolean activityRemind;

    @Nullable
    private Long activityTarget;

    @Nullable
    private Boolean calorieRemind;

    @Nullable
    private Long calorieTarget;

    @Nullable
    private Boolean sleepRemind;

    @Nullable
    private Long sleepTarget;

    @Nullable
    private Boolean standRemind;

    @Nullable
    private Long standTarget;

    @Nullable
    private Boolean stepRemind;

    @Nullable
    private Long stepTarget;

    public HuaMiRemindMultiTarget() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @Nullable
    public final Boolean getActivityRemind() {
        return this.activityRemind;
    }

    @Nullable
    public final Long getActivityTarget() {
        return this.activityTarget;
    }

    @Nullable
    public final Boolean getCalorieRemind() {
        return this.calorieRemind;
    }

    @Nullable
    public final Long getCalorieTarget() {
        return this.calorieTarget;
    }

    @Nullable
    public final Boolean getSleepRemind() {
        return this.sleepRemind;
    }

    @Nullable
    public final Long getSleepTarget() {
        return this.sleepTarget;
    }

    @Nullable
    public final Boolean getStandRemind() {
        return this.standRemind;
    }

    @Nullable
    public final Long getStandTarget() {
        return this.standTarget;
    }

    @Nullable
    public final Boolean getStepRemind() {
        return this.stepRemind;
    }

    @Nullable
    public final Long getStepTarget() {
        return this.stepTarget;
    }

    public final void setActivityRemind(@Nullable Boolean bool) {
        this.activityRemind = bool;
    }

    public final void setActivityTarget(@Nullable Long l) {
        this.activityTarget = l;
    }

    public final void setCalorieRemind(@Nullable Boolean bool) {
        this.calorieRemind = bool;
    }

    public final void setCalorieTarget(@Nullable Long l) {
        this.calorieTarget = l;
    }

    public final void setSleepRemind(@Nullable Boolean bool) {
        this.sleepRemind = bool;
    }

    public final void setSleepTarget(@Nullable Long l) {
        this.sleepTarget = l;
    }

    public final void setStandRemind(@Nullable Boolean bool) {
        this.standRemind = bool;
    }

    public final void setStandTarget(@Nullable Long l) {
        this.standTarget = l;
    }

    public final void setStepRemind(@Nullable Boolean bool) {
        this.stepRemind = bool;
    }

    public final void setStepTarget(@Nullable Long l) {
        this.stepTarget = l;
    }

    public HuaMiRemindMultiTarget(@Nullable Boolean bool, @Nullable Long l, @Nullable Boolean bool2, @Nullable Long l2, @Nullable Boolean bool3, @Nullable Long l3, @Nullable Boolean bool4, @Nullable Long l4, @Nullable Boolean bool5, @Nullable Long l5) {
        this.stepRemind = bool;
        this.stepTarget = l;
        this.calorieRemind = bool2;
        this.calorieTarget = l2;
        this.sleepRemind = bool3;
        this.sleepTarget = l3;
        this.standRemind = bool4;
        this.standTarget = l4;
        this.activityRemind = bool5;
        this.activityTarget = l5;
    }

    public /* synthetic */ HuaMiRemindMultiTarget(Boolean bool, Long l, Boolean bool2, Long l2, Boolean bool3, Long l3, Boolean bool4, Long l4, Boolean bool5, Long l5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? null : bool3, (i & 32) != 0 ? null : l3, (i & 64) != 0 ? null : bool4, (i & 128) != 0 ? null : l4, (i & 256) != 0 ? null : bool5, (i & 512) == 0 ? l5 : null);
    }
}
