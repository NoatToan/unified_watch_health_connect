package com.huami.moving.utils.ext;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.moving.datacenter.SportType;
import com.huami.moving.ui.utils.SportTypeIdentifier;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\"\u0016\u0010\u0003\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0016\u0010\u0005\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0017\u0010\t\u001a\u00020\u0000*\u00020\u00068F@\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0019\u0010\f\u001a\u0004\u0018\u00010\u0000*\u00020\u00068F@\u0006¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u0017\u0010\u000e\u001a\u00020\u0000*\u00020\u00068F@\u0006¢\u0006\u0006\u001a\u0004\b\r\u0010\b\"\u0017\u0010\u0011\u001a\u00020\u0000*\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"", "a", LogUtil.I, "UNIT_METRIC", "b", "UNIT_IMPERIAL", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "getRevisedUnit", "(Lcom/xiaomi/hm/health/databases/model/Trackrecord;)I", "revisedUnit", "getRevisedDistance", "(Lcom/xiaomi/hm/health/databases/model/Trackrecord;)Ljava/lang/Integer;", "revisedDistance", "getCompatibleType", "compatibleType", "getSportType", "(I)I", "sportType", "moving_release"}, k = 2, mv = {1, 5, 1})
public final class TrackrecordKt {
    private static final int a = 0;
    private static final int b = 1;

    public static final int getCompatibleType(@NotNull Trackrecord trackrecord) {
        return getSportType(trackrecord.getType().intValue());
    }

    @Nullable
    public static final Integer getRevisedDistance(@NotNull Trackrecord trackrecord) {
        if (getCompatibleType(trackrecord) != SportType.SwimmingPool.INSTANCE.getType() || trackrecord.getDistance() == null || trackrecord.getSwimPoolLength() == null || trackrecord.getSwimTurns() == null) {
            return trackrecord.getDistance();
        }
        int iIntValue = trackrecord.getSwimPoolLength().intValue() * trackrecord.getSwimTurns().intValue();
        return iIntValue > trackrecord.getDistance().intValue() ? Integer.valueOf(iIntValue) : trackrecord.getDistance();
    }

    public static final int getRevisedUnit(@NotNull Trackrecord trackrecord) {
        Integer unit;
        if (getCompatibleType(trackrecord) != SportType.SwimmingPool.INSTANCE.getType() || (unit = trackrecord.getUnit()) == null || unit.intValue() != 0 || trackrecord.getDistance() == null || trackrecord.getSwimPoolLength() == null || trackrecord.getSwimTurns() == null) {
            return trackrecord.getUnit().intValue();
        }
        return (trackrecord.getSwimPoolLength().intValue() * trackrecord.getSwimTurns().intValue() > trackrecord.getDistance().intValue() ? 1 : trackrecord.getUnit()).intValue();
    }

    public static final int getSportType(int i) {
        boolean z = false;
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new SportType[]{SportType.TreadmillNormal.INSTANCE, SportType.RouteRun.INSTANCE});
        if (!(listListOf instanceof Collection) || !listListOf.isEmpty()) {
            Iterator it2 = listListOf.iterator();
            while (it2.hasNext()) {
                if (((SportType) it2.next()).getType() == i) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            return SportType.Treadmill.INSTANCE.getType();
        }
        return SportTypeIdentifier.isChildSportType(i) ? i - 1000 : i;
    }
}
