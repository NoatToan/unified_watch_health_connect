package com.huami.phn.coach.usecase;

import com.huami.phn.core.source.LocalDataSource;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/phn/coach/usecase/CleanAllLocalDataUseCase;", "", "", Constant.METHOD_EXECUTE, "Lcom/huami/phn/core/source/LocalDataSource;", "a", "Lcom/huami/phn/core/source/LocalDataSource;", "local", "<init>", "(Lcom/huami/phn/core/source/LocalDataSource;)V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class CleanAllLocalDataUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LocalDataSource local;

    public CleanAllLocalDataUseCase(@NotNull LocalDataSource localDataSource) {
        this.local = localDataSource;
    }

    public final void execute() {
        this.local.clearDBData();
    }
}
