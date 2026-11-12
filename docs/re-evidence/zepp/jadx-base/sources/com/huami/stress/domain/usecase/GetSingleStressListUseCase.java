package com.huami.stress.domain.usecase;

import com.huami.stress.domain.model.SingleStress;
import com.huami.stress.domain.repository.SingleStressRepository;
import com.huami.stress.domain.utils.LogTagUtilsKt;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/huami/stress/domain/usecase/GetSingleStressListUseCase;", "", "", "Lcom/huami/stress/domain/model/SingleStress;", Constant.METHOD_EXECUTE, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/stress/domain/repository/SingleStressRepository;", "a", "Lcom/huami/stress/domain/repository/SingleStressRepository;", "mRepository", "<init>", "(Lcom/huami/stress/domain/repository/SingleStressRepository;)V", "domain_release"}, k = 1, mv = {1, 5, 1})
public final class GetSingleStressListUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SingleStressRepository mRepository;

    public GetSingleStressListUseCase(@NotNull SingleStressRepository singleStressRepository) {
        this.mRepository = singleStressRepository;
    }

    @Nullable
    public final Object execute(@NotNull Continuation<? super List<SingleStress>> continuation) {
        HMLog.i(LogTagUtilsKt.getTAG(this), "GetSingleStressListUseCase execute", new Object[0]);
        return this.mRepository.getSingleStressListFromLocal(continuation);
    }
}
