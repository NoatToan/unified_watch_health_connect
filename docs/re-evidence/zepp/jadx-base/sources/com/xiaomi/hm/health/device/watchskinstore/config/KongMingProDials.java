package com.xiaomi.hm.health.device.watchskinstore.config;

import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.lib.view.ViewUtils;
import com.ingenic.iwds.HardwareList;
import com.xiaomi.hm.health.device.watch_skin.IDialProcessor;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0002H\u0016¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinstore/config/KongMingProDials;", "Lcom/xiaomi/hm/health/device/watchskinstore/config/DeviceDialsConfig;", "", "deviceBmpType", "", "hasRound", "", HardwareList.VALUE_LCD_EXTERIOR_ROUND, "gridWidth", "gridHeight", "linearWidth", "linearHeight", "deviceDetailWidth", "deviceDetailHeight", "deviceCropRoundPx", "()Ljava/lang/Float;", "largeContainerWidth", "largeContainerHeight", "largeDetailWidth", "largeDetailHeight", "largeMarginTop", "largeRound", "deviceImageRes", "placeHolderRes", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class KongMingProDials implements DeviceDialsConfig {
    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    public int deviceBmpType() {
        return IDialProcessor.INSTANCE.getBG_TYPE_BMP_565();
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    @Nullable
    public Float deviceCropRoundPx() {
        return Float.valueOf(ViewUtils.dp2px(DeviceXFunctionsKt.getContext(), deviceDetailWidth() / 2));
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    public float deviceDetailHeight() {
        return 192.0f;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    public float deviceDetailWidth() {
        return 60.0f;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    public int deviceImageRes() {
        return R.drawable.watch_skin_detail_kongming_pro;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    public float gridHeight() {
        return 192.0f;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    public float gridWidth() {
        return 60.0f;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    public boolean hasRound() {
        return true;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    public float largeContainerHeight() {
        return 520.0f;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    public float largeContainerWidth() {
        return 320.0f;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    public float largeDetailHeight() {
        return 352.0f;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    public float largeDetailWidth() {
        return 110.0f;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    public boolean largeHasRound() {
        return DeviceDialsConfig.DefaultImpls.largeHasRound(this);
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    public float largeMarginTop() {
        return 84.0f;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    @Nullable
    public Float largeRound() {
        return Float.valueOf(ViewUtils.dp2px(DeviceXFunctionsKt.getContext(), largeDetailWidth() / 2));
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    public float linearHeight() {
        return 192.0f;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    public float linearWidth() {
        return 60.0f;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    public int placeHolderRes() {
        return R.drawable.icon_kongmingpro_dial_default_bg;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig
    public float round() {
        return gridWidth() / 2;
    }
}
