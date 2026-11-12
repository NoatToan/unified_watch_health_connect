package com.huami.stress.domain.usecase;

import com.huami.stress.domain.model.SingleStress;
import com.huami.stress.domain.repository.SingleStressRepository;
import com.tekartik.sqflite.Constant;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/huami/stress/domain/usecase/GetSingleStressByDay;", "", "Ljava/util/Calendar;", "calendar", "", "Lcom/huami/stress/domain/model/SingleStress;", Constant.METHOD_EXECUTE, "(Ljava/util/Calendar;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/stress/domain/repository/SingleStressRepository;", "a", "Lcom/huami/stress/domain/repository/SingleStressRepository;", "repository", "<init>", "(Lcom/huami/stress/domain/repository/SingleStressRepository;)V", "domain_release"}, k = 1, mv = {1, 5, 1})
public final class GetSingleStressByDay {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SingleStressRepository repository;

    public GetSingleStressByDay(@NotNull SingleStressRepository singleStressRepository) {
        this.repository = singleStressRepository;
    }

    @Nullable
    public final Object execute(@NotNull Calendar calendar, @NotNull Continuation<? super List<SingleStress>> continuation) {
        return this.repository.getSingleStressListByDay(calendar, continuation);
    }
}
