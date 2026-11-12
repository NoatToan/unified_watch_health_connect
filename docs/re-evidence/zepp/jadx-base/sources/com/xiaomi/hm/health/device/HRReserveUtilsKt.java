package com.xiaomi.hm.health.device;

import com.huami.watch.companion.account.UserInfoManager;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0006\u0010\b\u001a\u00020\u0007\u001a\u0006\u0010\t\u001a\u00020\u0004\u001a\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007\u001a\u0006\u0010\u000b\u001a\u00020\u0000¨\u0006\f"}, d2 = {"", "percents", "", "percentsToBytes", "", "sections", "sectionsToBytes", "", "getMaxHR", "getDefaultHeartRegionValue", "maxHeart", "getDefaultHeartRegionPercent", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class HRReserveUtilsKt {
    @NotNull
    public static final float[] getDefaultHeartRegionPercent() {
        return new float[]{0.5f, 0.6f, 0.7f, 0.8f, 0.9f, 1.0f};
    }

    @NotNull
    public static final int[] getDefaultHeartRegionValue() {
        return getDefaultHeartRegionValue(getMaxHR());
    }

    @NotNull
    public static final int[] getDefaultHeartRegionValue(int i) {
        double d = i;
        return new int[]{(int) (0.5d * d), (int) (0.6d * d), (int) (0.7d * d), (int) (0.8d * d), (int) (d * 0.9d), i};
    }

    public static final int getMaxHR() {
        return 220 - UserInfoManager.get().getBirthday().getAge();
    }

    @NotNull
    public static final byte[] percentsToBytes(@NotNull float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Byte.valueOf((byte) (f * 100)));
        }
        return CollectionsKt___CollectionsKt.toByteArray(arrayList);
    }

    @NotNull
    public static final byte[] sectionsToBytes(@NotNull int[] iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Byte.valueOf((byte) i));
        }
        return CollectionsKt___CollectionsKt.toByteArray(arrayList);
    }
}
