package com.xiaomi.fitness.sport.utils;

import com.xiaomi.fit.data.common.data.sport.util.FitnessSportTypeUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.LocationExtKt;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import defpackage.c1j;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005\u001a\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003¨\u0006\t"}, d2 = {"updateSportAdviseBasedOnWeather", "", "aqiValue", "", "weatherCode", "(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;", "needsToRequestWeather", "", DailyRecordKey.sportType, "sport_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class GlobalSportTabExtKt {
    public static final boolean needsToRequestWeather(int i) {
        return FitnessSportTypeUtils.INSTANCE.supportGpsSport(i) && LocationExtKt.isGpsEnable(ApplicationExtKt.getApplication()) && PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.ACCESS_FINE_LOCATION");
    }

    @Nullable
    public static final String updateSportAdviseBasedOnWeather(@Nullable Integer num, @Nullable Integer num2) {
        int i;
        if (num == null || num2 == null) {
            return null;
        }
        if (num.intValue() < 100) {
            i = (num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 2) ? c1j.W : c1j.X;
        } else {
            i = c1j.Y;
        }
        return ResourceExtKt.getString(i);
    }
}
