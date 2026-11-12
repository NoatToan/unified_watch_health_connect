package com.xiaomi.fitness.sport_eco.utils;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/utils/ViewUtil;", "", "<init>", "()V", "lastStartTime", "", "spaceTime", "", "isFastStart", "", "()Z", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ViewUtil {

    @NotNull
    public static final ViewUtil INSTANCE = new ViewUtil();
    private static long lastStartTime = 0;
    private static final int spaceTime = 1000;

    private ViewUtil() {
    }

    public final boolean isFastStart() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = jCurrentTimeMillis - lastStartTime <= 1000;
        lastStartTime = jCurrentTimeMillis;
        return z;
    }
}
