package com.huami.devicestylepower;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u0017\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0017\u0010\b\u001a\u00020\u0005*\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/huami/devicestylepower/DeviceStyle;", "", "getSingleBatteryRatio", "(Lcom/huami/devicestylepower/DeviceStyle;)I", "singleBatteryRatio", "", "getEarPhoneIsConnected", "(Lcom/huami/devicestylepower/DeviceStyle;)Z", "earPhoneIsConnected", "deviceStylePower_release"}, k = 2, mv = {1, 5, 1})
public final class DeviceStyleKt {
    public static final boolean getEarPhoneIsConnected(@NotNull DeviceStyle deviceStyle) {
        if (deviceStyle instanceof DeviceStyle.Chopin) {
            DeviceStyle.Chopin chopin = (DeviceStyle.Chopin) deviceStyle;
            if (chopin.getLeftElectricityRatio() < 0 || chopin.getRightElectricityRatio() < 0) {
                return false;
            }
        } else if (deviceStyle instanceof DeviceStyle.Mozart) {
            DeviceStyle.Mozart mozart = (DeviceStyle.Mozart) deviceStyle;
            if (mozart.getLeftElectricityRatio() < 0 && mozart.getRightElectricityRatio() < 0) {
                return false;
            }
        }
        return true;
    }

    public static final int getSingleBatteryRatio(@NotNull DeviceStyle deviceStyle) {
        if (deviceStyle instanceof DeviceStyle.Square) {
            return ((DeviceStyle.Square) deviceStyle).getElectricityRatio();
        }
        if (deviceStyle instanceof DeviceStyle.Circle) {
            return ((DeviceStyle.Circle) deviceStyle).getElectricityRatio();
        }
        if (deviceStyle instanceof DeviceStyle.Bracelet) {
            return ((DeviceStyle.Bracelet) deviceStyle).getElectricityRatio();
        }
        if (deviceStyle instanceof DeviceStyle.Venice) {
            return ((DeviceStyle.Venice) deviceStyle).getElectricityRatio();
        }
        if (deviceStyle instanceof DeviceStyle.Weight) {
            return ((DeviceStyle.Weight) deviceStyle).getElectricityRatio();
        }
        return 0;
    }
}
