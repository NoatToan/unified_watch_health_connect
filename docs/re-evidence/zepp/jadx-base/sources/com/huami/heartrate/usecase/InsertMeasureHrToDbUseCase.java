package com.huami.heartrate.usecase;

import com.huami.heartrate.repository.IHeartRateRepository;
import com.huami.heartrate.repository.entity.HeartRateEntity;
import com.huami.watch.companion.dataflow.Constant;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/huami/heartrate/usecase/InsertMeasureHrToDbUseCase;", "Lorg/koin/core/component/KoinComponent;", "", "Lcom/huami/heartrate/repository/entity/HeartRateEntity;", "heartRateList", "", "insertHeartRateList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", Constant.KEY_HR_VALUE, com.tekartik.sqflite.Constant.METHOD_INSERT, "(Lcom/huami/heartrate/repository/entity/HeartRateEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/heartrate/repository/IHeartRateRepository;", "a", "Lcom/huami/heartrate/repository/IHeartRateRepository;", "repository", "<init>", "(Lcom/huami/heartrate/repository/IHeartRateRepository;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class InsertMeasureHrToDbUseCase implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IHeartRateRepository repository;

    public InsertMeasureHrToDbUseCase(@NotNull IHeartRateRepository iHeartRateRepository) {
        this.repository = iHeartRateRepository;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Nullable
    public final Object insert(@NotNull HeartRateEntity heartRateEntity, @NotNull Continuation<? super Unit> continuation) {
        this.repository.insertHeartRate(heartRateEntity);
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object insertHeartRateList(@NotNull List<HeartRateEntity> list, @NotNull Continuation<? super Unit> continuation) {
        Object objInsertHeartRateList = this.repository.insertHeartRateList(list, continuation);
        return objInsertHeartRateList == a.getCOROUTINE_SUSPENDED() ? objInsertHeartRateList : Unit.INSTANCE;
    }
}
