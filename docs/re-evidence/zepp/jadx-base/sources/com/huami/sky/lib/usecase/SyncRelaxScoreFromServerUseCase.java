package com.huami.sky.lib.usecase;

import com.huami.sky.lib.repo.SkyRepository;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/sky/lib/usecase/SyncRelaxScoreFromServerUseCase;", "", "", "startTime", "endTime", "", Constant.METHOD_EXECUTE, "Lcom/huami/sky/lib/repo/SkyRepository;", "a", "Lcom/huami/sky/lib/repo/SkyRepository;", "repository", "<init>", "(Lcom/huami/sky/lib/repo/SkyRepository;)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final class SyncRelaxScoreFromServerUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SkyRepository repository;

    public SyncRelaxScoreFromServerUseCase(@NotNull SkyRepository skyRepository) {
        this.repository = skyRepository;
    }

    public final void execute(long startTime, long endTime) {
        this.repository.saveRelaxScoreFromServer(startTime, endTime);
    }
}
