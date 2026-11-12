package com.xiaomi.hm.health.utils;

import com.huami.nfc.base.PayResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"", "kg", "", "convertKgToBleUnit", PayResponse.CODE_BLE_ERROR_PREFIX, "convertBleUnitToKg", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class UnitFunctionsKt {
    public static final float convertBleUnitToKg(int i) {
        return i / 200.0f;
    }

    public static final int convertKgToBleUnit(float f) {
        return (int) (f * 200);
    }
}
