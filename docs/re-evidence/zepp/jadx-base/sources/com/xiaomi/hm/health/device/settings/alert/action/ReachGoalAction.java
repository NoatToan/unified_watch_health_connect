package com.xiaomi.hm.health.device.settings.alert.action;

import com.huami.devicex.R;
import com.xiaomi.hm.health.device.settings.alert.ItemAction;
import com.xiaomi.hm.health.ui.smartplay.ReachGoalRemindActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/alert/action/ReachGoalAction;", "Lcom/xiaomi/hm/health/device/settings/alert/ItemAction;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class ReachGoalAction extends ItemAction {

    @NotNull
    public static final ReachGoalAction INSTANCE = new ReachGoalAction();

    private ReachGoalAction() {
        super(Integer.valueOf(R.id.action_to_reachGoalRemindActivity), ReachGoalRemindActivity.class);
    }
}
