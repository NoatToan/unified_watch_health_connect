package com.xiaomi.fit.fitness.di;

import com.google.gson.Gson;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.repo.curse.CurseRepo;
import com.xiaomi.fitness.repo.summary.SportSummaryRepo;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "sportSummaryRepo", "Lcom/xiaomi/fitness/repo/summary/SportSummaryRepo;", "getSportSummaryRepo", "()Lcom/xiaomi/fitness/repo/summary/SportSummaryRepo;", "curseRepo", "Lcom/xiaomi/fitness/repo/curse/CurseRepo;", "getCurseRepo", "()Lcom/xiaomi/fitness/repo/curse/CurseRepo;", "fitness-data-core_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FitnessDataSingleModuleKt {

    @NotNull
    private static final Gson gson = ((FitnessEntryPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), FitnessEntryPoint.class)).getGson();

    @NotNull
    private static final SportSummaryRepo sportSummaryRepo = ((FitnessEntryPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), FitnessEntryPoint.class)).getSportSummaryRepo();

    @NotNull
    private static final CurseRepo curseRepo = ((FitnessEntryPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), FitnessEntryPoint.class)).getCurseRepo();

    @NotNull
    public static final CurseRepo getCurseRepo() {
        return curseRepo;
    }

    @NotNull
    public static final Gson getGson() {
        return gson;
    }

    @NotNull
    public static final SportSummaryRepo getSportSummaryRepo() {
        return sportSummaryRepo;
    }
}
