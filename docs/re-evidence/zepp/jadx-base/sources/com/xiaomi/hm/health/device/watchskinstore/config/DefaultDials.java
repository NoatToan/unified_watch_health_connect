package com.xiaomi.hm.health.device.watchskinstore.config;

import com.huami.devicex.R;
import com.xiaomi.hm.health.device.watch_skin.IDialProcessor;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0016J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0002H\u0016¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinstore/config/DefaultDials;", "Lcom/xiaomi/hm/health/device/watchskinstore/config/DeviceDialsConfig;", "", "deviceBmpType", "", "hasRound", "", "gridWidth", "gridHeight", "linearWidth", "linearHeight", "deviceDetailWidth", "deviceDetailHeight", "largeContainerWidth", "largeContainerHeight", "largeDetailWidth", "largeDetailHeight", "largeMarginTop", "deviceImageRes", "placeHolderRes", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DefaultDials implements DeviceDialsConfig {
    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    public int deviceBmpType() {
        return IDialProcessor.INSTANCE.getBG_TYPE_BMP_565();
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    @Nullable
    public Float deviceCropRoundPx() {
        return DeviceDialsConfig.DefaultImpls.deviceCropRoundPx(this);
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    public float deviceDetailHeight() {
        return 201.0f;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    public float deviceDetailWidth() {
        return 100.0f;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    public int deviceImageRes() {
        return R.drawable.watch_skin_detail_mi;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    public float gridHeight() {
        return 140.0f;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    public float gridWidth() {
        return 70.0f;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    public boolean hasRound() {
        return true;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    public float largeContainerHeight() {
        return 482.0f;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    public float largeContainerWidth() {
        return 160.0f;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    public float largeDetailHeight() {
        return 193.0f;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    public float largeDetailWidth() {
        return 96.0f;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    public boolean largeHasRound() {
        return DeviceDialsConfig.DefaultImpls.largeHasRound(this);
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    public float largeMarginTop() {
        return 124.0f;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    @Nullable
    public Float largeRound() {
        return DeviceDialsConfig.DefaultImpls.largeRound(this);
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    public float linearHeight() {
        return 140.0f;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    public float linearWidth() {
        return 70.0f;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    public int placeHolderRes() {
        return R.drawable.icon_default_cinco_dial_list;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    public float round() {
        return DeviceDialsConfig.DefaultImpls.round(this);
    }
}
