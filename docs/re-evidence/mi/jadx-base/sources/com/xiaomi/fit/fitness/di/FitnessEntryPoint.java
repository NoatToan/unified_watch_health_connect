package com.xiaomi.fit.fitness.di;

import com.google.gson.Gson;
import com.xiaomi.fitness.repo.curse.CurseRepo;
import com.xiaomi.fitness.repo.summary.SportSummaryRepo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/fit/fitness/di/FitnessEntryPoint;", "", "getSportSummaryRepo", "Lcom/xiaomi/fitness/repo/summary/SportSummaryRepo;", "getCurseRepo", "Lcom/xiaomi/fitness/repo/curse/CurseRepo;", "getGson", "Lcom/google/gson/Gson;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FitnessEntryPoint {
    @NotNull
    CurseRepo getCurseRepo();

    @NotNull
    Gson getGson();

    @NotNull
    SportSummaryRepo getSportSummaryRepo();
}
