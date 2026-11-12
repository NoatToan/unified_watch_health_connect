package com.xiaomi.fitness.medal.di;

import com.xiaomi.fitness.medal.export.IPopMedalListRepo;
import com.xiaomi.fitness.medal.repository.PopMedalListRepo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/medal/di/PopMedalListRepoModule;", "", "<init>", "()V", "bindPopMedalListRepo", "Lcom/xiaomi/fitness/medal/export/IPopMedalListRepo;", "repo", "Lcom/xiaomi/fitness/medal/repository/PopMedalListRepo;", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PopMedalListRepoModule {
    @NotNull
    public abstract IPopMedalListRepo bindPopMedalListRepo(@NotNull PopMedalListRepo repo);
}
