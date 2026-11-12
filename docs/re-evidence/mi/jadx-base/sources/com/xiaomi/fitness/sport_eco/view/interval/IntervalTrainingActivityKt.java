package com.xiaomi.fitness.sport_eco.view.interval;

import android.app.Application;
import android.content.Intent;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.sport_eco.SportConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"startIntervalTraining", "", "localSportType", "", "sport-eco_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class IntervalTrainingActivityKt {
    public static final void startIntervalTraining(@NotNull String localSportType) {
        Intrinsics.checkNotNullParameter(localSportType, "localSportType");
        Application app = AppUtil.getApp();
        Intent intent = new Intent(app, (Class<?>) IntervalTrainingActivity.class);
        intent.putExtra(SportConstants.KEY_GYM_MODE_TYPE, localSportType);
        intent.addFlags(268435456);
        app.startActivity(intent);
    }
}
