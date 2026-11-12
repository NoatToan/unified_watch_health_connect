package com.huami.bluetooth.profile.ecf.data;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.utils.ByteUtilsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000\u001a\u0012\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u0000H\u0000\u001a\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004*\u0004\u0018\u00010\u0000H\u0000\"\u0016\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\t\"\u0016\u0010\n\u001a\u00020\u00078\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\t\"\u0016\u0010\u000b\u001a\u00020\u00078\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\t\"\u0016\u0010\f\u001a\u00020\u00078\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"", "Lcom/huami/bluetooth/profile/ecf/data/Equalizer;", "toEqualizer", "", "Lcom/huami/bluetooth/profile/ecf/data/EqUnit;", "toEqUnitList", "toEqUnit", "", "EQ_TYPE_BYTES", LogUtil.I, "EQ_CHANNEL_BYTES", "EQ_HZ_BYTES", "EQ_UNIT_BYTES", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class EqualizerKt {
    public static final int EQ_CHANNEL_BYTES = 4;
    public static final int EQ_HZ_BYTES = 1;
    public static final int EQ_TYPE_BYTES = 1;
    public static final int EQ_UNIT_BYTES = 5;

    @Nullable
    public static final EqUnit toEqUnit(@Nullable byte[] bArr) {
        if (bArr != null && bArr.length >= 5) {
            return new EqUnit(ByteUtilsKt.toInt$default(bArr, 0, 0, 3, null), bArr[4]);
        }
        return null;
    }

    @NotNull
    public static final List<EqUnit> toEqUnitList(@NotNull byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        int length = bArr.length / 5;
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                int i3 = i * 5;
                EqUnit eqUnit = toEqUnit(ArraysKt___ArraysJvmKt.copyOfRange(bArr, i3, i3 + 5));
                if (eqUnit != null) {
                    arrayList.add(eqUnit);
                }
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return arrayList;
    }

    @Nullable
    public static final Equalizer toEqualizer(@Nullable byte[] bArr) {
        if (bArr != null && bArr.length >= 1) {
            return new Equalizer(bArr[0], toEqUnitList(ArraysKt___ArraysJvmKt.copyOfRange(bArr, 1, bArr.length)), null, 4, null);
        }
        return null;
    }
}
