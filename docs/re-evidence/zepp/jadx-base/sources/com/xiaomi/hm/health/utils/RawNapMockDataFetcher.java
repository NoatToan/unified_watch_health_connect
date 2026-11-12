package com.xiaomi.hm.health.utils;

import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.dataprocess.StageSleep;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\t\u001a\u00020\bH&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/utils/RawNapMockDataFetcher;", "", "", "date", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/dataprocess/StageSleep;", "Lkotlin/collections/ArrayList;", "getData", "", Constants.ENABLED, "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "getSleepInfo", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public interface RawNapMockDataFetcher {
    boolean enabled();

    @NotNull
    ArrayList<StageSleep> getData(@NotNull String date);

    @NotNull
    SleepInfo getSleepInfo(@NotNull String date);
}
