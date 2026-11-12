package com.xiaomi.hm.health.device.settings.alert.type;

import com.huami.devicex.R;
import com.xiaomi.hm.health.device.settings.alert.Type;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/alert/type/ReachGoal;", "Lcom/xiaomi/hm/health/device/settings/alert/Type;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class ReachGoal extends Type {

    @NotNull
    public static final ReachGoal INSTANCE = new ReachGoal();

    private ReachGoal() {
        super(R.string.reach_goal, R.drawable.reach_goal_alert_icon);
    }
}
