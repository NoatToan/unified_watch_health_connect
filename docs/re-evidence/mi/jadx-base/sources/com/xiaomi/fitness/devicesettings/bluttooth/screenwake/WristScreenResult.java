package com.xiaomi.fitness.devicesettings.bluttooth.screenwake;

import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.settingitem.LiftWristBrightView;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0013\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0005R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/screenwake/WristScreenResult;", "", "resultCode", "", "<init>", "(I)V", DeviceSettingConfigKey.KEY_LIFTWRISTBRIGHTVIEW, "Lcom/xiaomi/fitness/settingitem/settingitem/LiftWristBrightView;", "(Lcom/xiaomi/fitness/settingitem/settingitem/LiftWristBrightView;)V", "getResultCode", "()I", "setResultCode", "getLiftWristBrightView", "()Lcom/xiaomi/fitness/settingitem/settingitem/LiftWristBrightView;", "setLiftWristBrightView", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WristScreenResult {

    @Nullable
    private LiftWristBrightView liftWristBrightView;
    private int resultCode;

    public WristScreenResult(int i) {
        this.resultCode = i;
    }

    @Nullable
    public final LiftWristBrightView getLiftWristBrightView() {
        return this.liftWristBrightView;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public final void setLiftWristBrightView(@Nullable LiftWristBrightView liftWristBrightView) {
        this.liftWristBrightView = liftWristBrightView;
    }

    public final void setResultCode(int i) {
        this.resultCode = i;
    }

    public WristScreenResult(@Nullable LiftWristBrightView liftWristBrightView) {
        this.liftWristBrightView = liftWristBrightView;
    }
}
