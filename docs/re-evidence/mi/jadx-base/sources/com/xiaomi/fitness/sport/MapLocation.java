package com.xiaomi.fitness.sport;

import com.xiaomi.fit.data.common.data.sport.Location;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0004\u001a\u00020\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00050\u0007¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sport/MapLocation;", "", "<init>", "()V", "startLocation", "", "locationCallback", "Lkotlin/Function1;", "Lcom/xiaomi/fit/data/common/data/sport/Location;", "Lkotlin/ParameterName;", "name", "location", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MapLocation {
    public final void startLocation(@NotNull Function1<? super Location, Unit> locationCallback) {
        Intrinsics.checkNotNullParameter(locationCallback, "locationCallback");
    }
}
