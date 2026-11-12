package com.huami.femalehealth.uilib.viewmodel;

import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.femalehealth.logiclib.repo.MenstruationRepo;
import com.huami.femalehealth.logiclib.vo.MenstruationVo;
import com.huami.tools.log.HMLog;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/huami/femalehealth/uilib/viewmodel/FHBaseViewModel$safeLaunch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.FemaleHealthViewModel$refreshSymptomLastDate$$inlined$safeLaunch$uilib_release$default$1", f = "FemaleHealthViewModel.kt", i = {}, l = {153}, m = "invokeSuspend", n = {}, s = {})
public final class FemaleHealthViewModel$refreshSymptomLastDate$$inlined$safeLaunch$uilib_release$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ FemaleHealthViewModel d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FemaleHealthViewModel$refreshSymptomLastDate$$inlined$safeLaunch$uilib_release$default$1(Continuation continuation, boolean z, FemaleHealthViewModel femaleHealthViewModel) {
        super(2, continuation);
        this.c = z;
        this.d = femaleHealthViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FemaleHealthViewModel$refreshSymptomLastDate$$inlined$safeLaunch$uilib_release$default$1 femaleHealthViewModel$refreshSymptomLastDate$$inlined$safeLaunch$uilib_release$default$1 = new FemaleHealthViewModel$refreshSymptomLastDate$$inlined$safeLaunch$uilib_release$default$1(continuation, this.c, this.d);
        femaleHealthViewModel$refreshSymptomLastDate$$inlined$safeLaunch$uilib_release$default$1.b = obj;
        return femaleHealthViewModel$refreshSymptomLastDate$$inlined$safeLaunch$uilib_release$default$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((FemaleHealthViewModel$refreshSymptomLastDate$$inlined$safeLaunch$uilib_release$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.c) {
                this.d.manager.updateFromCloud(10);
            }
            MenstruationRepo menstruationRepo = this.d.repo;
            Date time = DateHelper.INSTANCE.today().getTime();
            this.a = 1;
            obj = menstruationRepo.getLastMenstruation(time, true, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        List list = (List) obj;
        HMLog.info("xys_FemaleHealthViewModel", new FemaleHealthViewModel.b0(list));
        if (!list.isEmpty()) {
            this.d.symptomLastDate.postValue(((MenstruationVo) CollectionsKt.last(list)).getDate());
        } else {
            this.d.symptomLastDate.postValue(null);
        }
        this.d.statusJob = null;
        return Unit.INSTANCE;
    }
}
