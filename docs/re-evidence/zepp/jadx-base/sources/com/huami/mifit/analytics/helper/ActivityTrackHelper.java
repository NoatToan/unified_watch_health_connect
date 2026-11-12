package com.huami.mifit.analytics.helper;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B.\u0012%\b\u0002\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004R3\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/mifit/analytics/helper/ActivityTrackHelper;", "", "", "a", "", "onActivityResumed", "onActivityPaused", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "duration", "Lkotlin/jvm/functions/Function1;", "durationTracker", "b", "Ljava/lang/Long;", "pageStartTime", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "analytics_release"}, k = 1, mv = {1, 5, 1})
public final class ActivityTrackHelper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final Function1<Long, Unit> durationTracker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Long pageStartTime;

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityTrackHelper() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityTrackHelper(@Nullable Function1<? super Long, Unit> function1) {
        this.durationTracker = function1;
    }

    private final long a() {
        return System.currentTimeMillis();
    }

    public final void onActivityPaused() {
        Long l = this.pageStartTime;
        if (l == null) {
            return;
        }
        long jA = a() - l.longValue();
        Function1<Long, Unit> function1 = this.durationTracker;
        if (function1 != null) {
            function1.invoke(Long.valueOf(jA));
        }
        this.pageStartTime = null;
    }

    public final void onActivityResumed() {
        this.pageStartTime = Long.valueOf(a());
    }

    public /* synthetic */ ActivityTrackHelper(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }
}
