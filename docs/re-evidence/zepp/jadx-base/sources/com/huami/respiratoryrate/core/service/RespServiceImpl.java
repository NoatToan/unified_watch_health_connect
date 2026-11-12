package com.huami.respiratoryrate.core.service;

import com.huami.respiratoryrate.core.data.local.entity.RespRateEntity;
import com.huami.respiratoryrate.core.koin.RespRateKoinScopeKt;
import com.huami.respiratoryrate.core.usecase.GetDataUseCase;
import com.huami.respiratoryrate.core.usecase.LoadDataUseCase;
import com.huami.respiratoryrate.service.IRespiratoryRateService;
import com.huami.respiratoryrate.service.RespiratoryRate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/huami/respiratoryrate/core/service/RespServiceImpl;", "Lcom/huami/respiratoryrate/service/IRespiratoryRateService;", "", "from", "to", "", "Lcom/huami/respiratoryrate/service/RespiratoryRate;", "getRespRateList", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/respiratoryrate/core/usecase/LoadDataUseCase;", "a", "Lcom/huami/respiratoryrate/core/usecase/LoadDataUseCase;", "loadDataUseCase", "Lcom/huami/respiratoryrate/core/usecase/GetDataUseCase;", "b", "Lcom/huami/respiratoryrate/core/usecase/GetDataUseCase;", "getDataUseCase", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1})
public final class RespServiceImpl implements IRespiratoryRateService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LoadDataUseCase loadDataUseCase = (LoadDataUseCase) RespRateKoinScopeKt.getRespRateKoinScope().get(Reflection.getOrCreateKotlinClass(LoadDataUseCase.class), null, null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final GetDataUseCase getDataUseCase = (GetDataUseCase) RespRateKoinScopeKt.getRespRateKoinScope().get(Reflection.getOrCreateKotlinClass(GetDataUseCase.class), null, null);

    @Override // com.huami.respiratoryrate.service.IRespiratoryRateService
    @Nullable
    public Object getRespRateList(long j, long j2, @NotNull Continuation<? super List<RespiratoryRate>> continuation) {
        List<RespRateEntity> listExecute = this.getDataUseCase.execute(j, j2);
        if (listExecute.isEmpty()) {
            listExecute = this.loadDataUseCase.execute(j, j2);
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listExecute, 10));
        for (RespRateEntity respRateEntity : listExecute) {
            arrayList.add(new RespiratoryRate(respRateEntity.getRespRate(), respRateEntity.getRespRateTime(), respRateEntity.getOffset(), respRateEntity.getUserId()));
        }
        return arrayList;
    }
}
