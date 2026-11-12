package com.huami.sky.lib.usecase;

import com.huami.sky.lib.entity.UserRelaxScore;
import com.huami.sky.lib.repo.SkyRepository;
import com.tekartik.sqflite.Constant;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/sky/lib/usecase/GetRelaxScoreUseCase;", "", "", "startTime", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/huami/sky/lib/entity/UserRelaxScore;", Constant.METHOD_EXECUTE, "Lcom/huami/sky/lib/repo/SkyRepository;", "a", "Lcom/huami/sky/lib/repo/SkyRepository;", "repository", "<init>", "(Lcom/huami/sky/lib/repo/SkyRepository;)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final class GetRelaxScoreUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SkyRepository repository;

    public GetRelaxScoreUseCase(@NotNull SkyRepository skyRepository) {
        this.repository = skyRepository;
    }

    @NotNull
    public final Flow<List<UserRelaxScore>> execute(long startTime) {
        return this.repository.getRelaxScoreFromLocal(startTime);
    }
}
