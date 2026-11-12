package com.huami.mifit.analytics.helper;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\t\u001a\u00020\b*\u00020\u00002%\b\u0002\u0010\u0007\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0001¨\u0006\n"}, d2 = {"Landroid/app/Activity;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "duration", "", "durationTracker", "Lcom/huami/mifit/analytics/helper/ActivityTrackHelper;", "trackHelper", "analytics_release"}, k = 2, mv = {1, 5, 1})
public final class ActivityTrackHelperKt {
    @NotNull
    public static final ActivityTrackHelper trackHelper(@NotNull Activity activity, @Nullable Function1<? super Long, Unit> function1) {
        return new ActivityTrackHelper(function1);
    }

    public static /* synthetic */ ActivityTrackHelper trackHelper$default(Activity activity, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return trackHelper(activity, function1);
    }
}
