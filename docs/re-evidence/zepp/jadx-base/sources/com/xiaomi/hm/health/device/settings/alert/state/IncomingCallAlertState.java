package com.xiaomi.hm.health.device.settings.alert.state;

import android.content.Context;
import com.huami.devicex.R;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.device.settings.alert.State;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/alert/state/IncomingCallAlertState;", "Lcom/xiaomi/hm/health/device/settings/alert/State;", "", "description", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lkotlin/Function0;", "Lcom/xiaomi/hm/health/model/account/HMMiliConfig;", "b", "Lkotlin/jvm/functions/Function0;", "config", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class IncomingCallAlertState implements State {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<HMMiliConfig> config;

    /* JADX WARN: Multi-variable type inference failed */
    public IncomingCallAlertState(@NotNull Context context, @NotNull Function0<? extends HMMiliConfig> function0) {
        this.context = context;
        this.config = function0;
    }

    @Override // com.xiaomi.hm.health.device.settings.alert.State
    @NotNull
    public String description() {
        HMMiliConfig hMMiliConfigInvoke = this.config.invoke();
        boolean zIsInComingCallEnabled = hMMiliConfigInvoke.isInComingCallEnabled();
        boolean zIsPhoneNotifyDelayEnable = hMMiliConfigInvoke.isPhoneNotifyDelayEnable();
        if (zIsInComingCallEnabled && zIsPhoneNotifyDelayEnable) {
            return this.context.getString(R.string.incoming_call_alert_tips, String.valueOf(hMMiliConfigInvoke.getInComingCallNotifyTime()));
        }
        return zIsInComingCallEnabled ? this.context.getString(R.string.alert_enable) : this.context.getString(R.string.alert_disable);
    }
}
