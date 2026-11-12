package com.huami.bluetooth.profile.ecf.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, d2 = {"", "Lcom/huami/bluetooth/profile/ecf/data/NoiseControl;", "toNoiseControl", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class NoiseControlKt {
    @Nullable
    public static final NoiseControl toNoiseControl(@NotNull byte[] bArr) {
        if (!(bArr.length > 1)) {
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return new NoiseControl(NoiseControlType.INSTANCE.parseMode(Integer.valueOf(bArr[0] & 255)), NoiseReductionMode.INSTANCE.parseMode(Integer.valueOf(bArr[1] & 255)));
    }
}
