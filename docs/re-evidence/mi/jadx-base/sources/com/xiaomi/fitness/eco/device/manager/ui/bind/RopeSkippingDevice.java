package com.xiaomi.fitness.eco.device.manager.ui.bind;

import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice;
import com.xiaomi.fitness.habit.ui.HabitShareActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/ui/bind/RopeSkippingDevice;", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDevice;", "<init>", "()V", HabitShareActivity.KEY_BIG_ICON, "", "getBigIcon", "()Ljava/lang/String;", "setBigIcon", "(Ljava/lang/String;)V", "isCurrent", "", "()Z", "setCurrent", "(Z)V", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class RopeSkippingDevice extends EcoDevice {

    @Nullable
    private String bigIcon;
    private boolean isCurrent;

    public RopeSkippingDevice() {
        super(null, 0, null, null, null, null, null, 0, null, 0, false, null, null, null, 16383, null);
    }

    @Nullable
    public final String getBigIcon() {
        return this.bigIcon;
    }

    /* JADX INFO: renamed from: isCurrent, reason: from getter */
    public final boolean getIsCurrent() {
        return this.isCurrent;
    }

    public final void setBigIcon(@Nullable String str) {
        this.bigIcon = str;
    }

    public final void setCurrent(boolean z) {
        this.isCurrent = z;
    }
}
