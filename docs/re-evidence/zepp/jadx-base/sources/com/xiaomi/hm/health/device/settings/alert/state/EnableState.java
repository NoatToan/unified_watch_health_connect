package com.xiaomi.hm.health.device.settings.alert.state;

import android.content.Context;
import com.huami.devicex.R;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.device.settings.alert.State;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H&R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/alert/state/EnableState;", "Lcom/xiaomi/hm/health/device/settings/alert/State;", "", "description", "", "isEnable", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public abstract class EnableState implements State {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    public EnableState(@NotNull Context context) {
        this.context = context;
    }

    @Override // com.xiaomi.hm.health.device.settings.alert.State
    @NotNull
    public String description() {
        return this.context.getString(isEnable() ? R.string.alert_enable : R.string.alert_disable);
    }

    public abstract boolean isEnable();
}
