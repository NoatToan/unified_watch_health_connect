package com.xiaomi.fitness.statistics.page;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0007J\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/statistics/page/AutoTrackPageManager;", "", "<init>", "()V", "pageVisibleTimeMap", "", "", "", "currentActPageName", "getCurrentActPageName", "()Ljava/lang/String;", "setCurrentActPageName", "(Ljava/lang/String;)V", "currentFragmentName", "getCurrentFragmentName", "setCurrentFragmentName", "onPageVisible", "", "pageName", "timeSec", "getPageVisibleTimeSec", "(Ljava/lang/String;)Ljava/lang/Long;", "onPageInvisible", "statistics_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AutoTrackPageManager {

    @Nullable
    private static String currentActPageName;

    @Nullable
    private static String currentFragmentName;

    @NotNull
    public static final AutoTrackPageManager INSTANCE = new AutoTrackPageManager();

    @NotNull
    private static final Map<String, Long> pageVisibleTimeMap = new LinkedHashMap();

    private AutoTrackPageManager() {
    }

    @Nullable
    public final String getCurrentActPageName() {
        return currentActPageName;
    }

    @Nullable
    public final String getCurrentFragmentName() {
        return currentFragmentName;
    }

    @Nullable
    public final Long getPageVisibleTimeSec(@NotNull String pageName) {
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        return pageVisibleTimeMap.get(pageName);
    }

    public final void onPageInvisible(@NotNull String pageName) {
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        pageVisibleTimeMap.remove(pageName);
    }

    public final void onPageVisible(@NotNull String pageName, long timeSec) {
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        pageVisibleTimeMap.put(pageName, Long.valueOf(timeSec));
    }

    public final void setCurrentActPageName(@Nullable String str) {
        currentActPageName = str;
    }

    public final void setCurrentFragmentName(@Nullable String str) {
        currentFragmentName = str;
    }
}
