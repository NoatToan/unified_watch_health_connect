package com.xiaomi.hm.health.device.settings.alert.state;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/alert/state/ReachGoalAlertState;", "Lcom/xiaomi/hm/health/device/settings/alert/state/EnableState;", "", "isEnable", "Lkotlin/Function0;", "Lcom/xiaomi/hm/health/model/account/HMMiliConfig;", "b", "Lkotlin/jvm/functions/Function0;", "config", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class ReachGoalAlertState extends EnableState {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<HMMiliConfig> config;

    /* JADX WARN: Multi-variable type inference failed */
    public ReachGoalAlertState(@NotNull Context context, @NotNull Function0<? extends HMMiliConfig> function0) {
        super(context);
        this.config = function0;
    }

    @Override // com.xiaomi.hm.health.device.settings.alert.state.EnableState
    public boolean isEnable() {
        return this.config.invoke().isGoalRemind();
    }
}
