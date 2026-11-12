package com.xiaomi.hm.health.device.equalizer;

import com.xiaomi.hm.health.bt.classic.EqEntity;
import com.xiaomi.hm.health.bt.classic.EqUnit;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0000*\u00020\u0001\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0004\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0004\"\u0016\u0010\t\u001a\u00020\u00018\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "", "toBoltByte", "toBoltInt", "Lcom/xiaomi/hm/health/bt/classic/EqEntity;", "", "gains", "", "isClose", "TYPE_CLOSE", "B", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class EqualizerViewModelKt {
    public static final byte TYPE_CLOSE = -1;

    @NotNull
    public static final int[] gains(@NotNull EqEntity eqEntity) {
        ArrayList<EqUnit> eqUnits = eqEntity.getEqUnits();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(eqUnits, 10));
        Iterator<T> it2 = eqUnits.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(toBoltInt(((EqUnit) it2.next()).getGain())));
        }
        return CollectionsKt___CollectionsKt.toIntArray(arrayList);
    }

    public static final boolean isClose(@NotNull EqEntity eqEntity) {
        int[] iArrGains = gains(eqEntity);
        int length = iArrGains.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                return true;
            }
            if (iArrGains[i] != 0) {
                return false;
            }
            i++;
        }
    }

    public static final byte toBoltByte(int i) {
        if (i < 0) {
            i = ((byte) (-i)) | (-128);
        }
        return (byte) i;
    }

    public static final int toBoltInt(byte b) {
        return ((byte) (b & (-128))) == -128 ? -((byte) (b & 127)) : b;
    }
}
