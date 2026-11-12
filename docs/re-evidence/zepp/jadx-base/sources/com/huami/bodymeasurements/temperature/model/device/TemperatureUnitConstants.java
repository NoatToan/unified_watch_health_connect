package com.huami.bodymeasurements.temperature.model.device;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/device/TemperatureUnitConstants;", "", "", "TEMP_UNIT_C", LogUtil.I, "TEMP_UNIT_F", "<init>", "()V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final class TemperatureUnitConstants {

    @NotNull
    public static final TemperatureUnitConstants INSTANCE = new TemperatureUnitConstants();
    public static final int TEMP_UNIT_C = 0;
    public static final int TEMP_UNIT_F = 1;

    private TemperatureUnitConstants() {
    }
}
