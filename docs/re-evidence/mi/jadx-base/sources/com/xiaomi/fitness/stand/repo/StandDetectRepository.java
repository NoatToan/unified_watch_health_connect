package com.xiaomi.fitness.stand.repo;

import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.api.repository.IStandRepository;
import com.xiaomi.fit.fitness.export.api.repository.IStepRepository;
import com.xiaomi.fit.fitness.export.data.item.StepItem;
import com.xiaomi.fit.fitness.export.data.item.ValidStandItem;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.stand.repo.StandDetectRepository;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aJ\"\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u001d2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aJ\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aJ\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aJ\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0013\u0010\u0014¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/stand/repo/StandDetectRepository;", "", "<init>", "()V", "repoProvider", "Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider;", "standRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IStandRepository;", "getStandRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IStandRepository;", "standRepo$delegate", "Lkotlin/Lazy;", "stepRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IStepRepository;", "getStepRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IStepRepository;", "stepRepo$delegate", "dbGetter", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "getDbGetter", "()Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "dbGetter$delegate", "getStandRecordsSync", "", "Lcom/xiaomi/fit/fitness/export/data/item/ValidStandItem;", "startTime", "", "endTime", "getStandRecords", "Lkotlinx/coroutines/flow/Flow;", "getStepRecords", "Lcom/xiaomi/fit/fitness/export/data/item/StepItem;", "getSportRecords", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "insertStandRecord", "", "record", "stand-detect_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StandDetectRepository {

    @NotNull
    private final IRepositoryProvider repoProvider = FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE);

    /* JADX INFO: renamed from: standRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy standRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: l9o
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StandDetectRepository.standRepo_delegate$lambda$0(this.f24808a);
        }
    });

    /* JADX INFO: renamed from: stepRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy stepRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: m9o
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StandDetectRepository.stepRepo_delegate$lambda$1(this.f25923a);
        }
    });

    /* JADX INFO: renamed from: dbGetter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy dbGetter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: n9o
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StandDetectRepository.dbGetter_delegate$lambda$2();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.stand.repo.StandDetectRepository$insertStandRecord$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.stand.repo.StandDetectRepository$insertStandRecord$1", f = "StandDetectRepository.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ValidStandItem $record;
        int label;
        final /* synthetic */ StandDetectRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ValidStandItem validStandItem, StandDetectRepository standDetectRepository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$record = validStandItem;
            this.this$0 = standDetectRepository;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$record, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.$record.setSid(DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentPhoneSid());
                IStandRepository standRepo = this.this$0.getStandRepo();
                ValidStandItem validStandItem = this.$record;
                this.label = 1;
                if (standRepo.addRecord(validStandItem, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDataGetter dbGetter_delegate$lambda$2() {
        return FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE);
    }

    private final FitnessDataGetter getDbGetter() {
        return (FitnessDataGetter) this.dbGetter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IStandRepository getStandRepo() {
        return (IStandRepository) this.standRepo.getValue();
    }

    private final IStepRepository getStepRepo() {
        return (IStepRepository) this.stepRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IStandRepository standRepo_delegate$lambda$0(StandDetectRepository this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (IStandRepository) this$0.repoProvider.getRepository(IStandRepository.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IStepRepository stepRepo_delegate$lambda$1(StandDetectRepository this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (IStepRepository) this$0.repoProvider.getRepository(IStepRepository.class);
    }

    @NotNull
    public final List<SportBasicReport> getSportRecords(long startTime, long endTime) {
        return getDbGetter().getSportReport(startTime, endTime);
    }

    @NotNull
    public final Flow<List<ValidStandItem>> getStandRecords(long startTime, long endTime) {
        return getStandRepo().queryStandRecords(startTime, endTime);
    }

    @NotNull
    public final List<ValidStandItem> getStandRecordsSync(long startTime, long endTime) {
        return getStandRepo().queryStandRecordsSync(startTime, endTime);
    }

    @NotNull
    public final List<StepItem> getStepRecords(long startTime, long endTime) {
        return getStepRepo().queryStepRecordsSync(startTime, endTime);
    }

    public final void insertStandRecord(@NotNull ValidStandItem record) {
        Intrinsics.checkNotNullParameter(record, "record");
        AnyExtKt.io$default(null, new AnonymousClass1(record, this, null), 1, null);
    }
}
