package com.xiaomi.fitness.sport_manager.state;

import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.sport_manager.utils.UserInfo;
import com.xiaomi.wearable.gpsalgorithm.FitnessSportAlgo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u0011R\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/state/RouteMatchManager;", "", "<init>", "()V", "mSportAlgo", "Lcom/xiaomi/wearable/gpsalgorithm/FitnessSportAlgo;", "kotlin.jvm.PlatformType", "Lcom/xiaomi/wearable/gpsalgorithm/FitnessSportAlgo;", "startRouteMatch", "", "progressRouteMatch", "location", "Lcom/xiaomi/fit/data/common/data/sport/Location;", "getRouteMatchResult", "", "routeMatchLoadStandardRoute", "list", "", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RouteMatchManager {

    @NotNull
    public static final RouteMatchManager INSTANCE = new RouteMatchManager();
    private static final FitnessSportAlgo mSportAlgo = FitnessSportAlgo.getInstance(UserInfo.INSTANCE.getUserProfile());

    private RouteMatchManager() {
    }

    public final int getRouteMatchResult() {
        return mSportAlgo.getRouteMatchResult();
    }

    public final void progressRouteMatch(@Nullable Location location) {
        if (AppUtil.INSTANCE.isPlayChannel()) {
            return;
        }
        mSportAlgo.progressRouteMatch(location);
    }

    public final void routeMatchLoadStandardRoute(@NotNull List<? extends Location> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        if (AppUtil.INSTANCE.isPlayChannel()) {
            return;
        }
        mSportAlgo.setStandardRoute(list);
    }

    public final void startRouteMatch() {
        if (AppUtil.INSTANCE.isPlayChannel()) {
            return;
        }
        mSportAlgo.startRouteMatch();
    }
}
