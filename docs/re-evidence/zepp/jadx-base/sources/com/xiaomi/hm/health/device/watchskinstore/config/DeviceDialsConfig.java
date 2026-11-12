package com.xiaomi.hm.health.device.watchskinstore.config;

import com.ingenic.iwds.HardwareList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0013\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\u0006H&J\b\u0010\u000b\u001a\u00020\u0006H&J\b\u0010\f\u001a\u00020\u0006H&J\b\u0010\r\u001a\u00020\u0006H&J\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0006H&J\b\u0010\u0011\u001a\u00020\u0006H&J\b\u0010\u0012\u001a\u00020\u0006H&J\b\u0010\u0013\u001a\u00020\u0006H&J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ\b\u0010\u0016\u001a\u00020\u0006H&J\b\u0010\u0017\u001a\u00020\u0002H&J\b\u0010\u0018\u001a\u00020\u0002H&¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinstore/config/DeviceDialsConfig;", "", "", "deviceBmpType", "", "hasRound", "", HardwareList.VALUE_LCD_EXTERIOR_ROUND, "gridWidth", "gridHeight", "linearWidth", "linearHeight", "deviceDetailWidth", "deviceDetailHeight", "deviceCropRoundPx", "()Ljava/lang/Float;", "largeContainerWidth", "largeContainerHeight", "largeDetailWidth", "largeDetailHeight", "largeHasRound", "largeRound", "largeMarginTop", "deviceImageRes", "placeHolderRes", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface DeviceDialsConfig {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @Nullable
        public static Float deviceCropRoundPx(@NotNull DeviceDialsConfig deviceDialsConfig) {
            return null;
        }

        public static boolean largeHasRound(@NotNull DeviceDialsConfig deviceDialsConfig) {
            return false;
        }

        @Nullable
        public static Float largeRound(@NotNull DeviceDialsConfig deviceDialsConfig) {
            return null;
        }

        public static float round(@NotNull DeviceDialsConfig deviceDialsConfig) {
            return 5.0f;
        }
    }

    int deviceBmpType();

    @Nullable
    Float deviceCropRoundPx();

    float deviceDetailHeight();

    float deviceDetailWidth();

    int deviceImageRes();

    float gridHeight();

    float gridWidth();

    boolean hasRound();

    float largeContainerHeight();

    float largeContainerWidth();

    float largeDetailHeight();

    float largeDetailWidth();

    boolean largeHasRound();

    float largeMarginTop();

    @Nullable
    Float largeRound();

    float linearHeight();

    float linearWidth();

    int placeHolderRes();

    float round();
}
