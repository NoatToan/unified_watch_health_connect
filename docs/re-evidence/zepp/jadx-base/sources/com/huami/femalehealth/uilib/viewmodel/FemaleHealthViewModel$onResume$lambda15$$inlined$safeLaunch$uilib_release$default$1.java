package com.huami.femalehealth.uilib.viewmodel;

import com.huami.femalehealth.logiclib.api.pojo.HistoryItemBean;
import com.huami.femalehealth.logiclib.helper.DateTriple;
import com.huami.femalehealth.logiclib.repo.MenstruationRepo;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.tools.log.HMLog;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.huami.femalehealth.uilib.viewmodel.FemaleHealthViewModel$onResume$lambda-15$$inlined$safeLaunch$uilib_release$default$1, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/huami/femalehealth/uilib/viewmodel/FHBaseViewModel$safeLaunch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.FemaleHealthViewModel$onResume$lambda-15$$inlined$safeLaunch$uilib_release$default$1", f = "FemaleHealthViewModel.kt", i = {0, 0}, l = {DataTypeSource.SPORT_TYPE_CHECKERS}, m = "invokeSuspend", n = {"start$iv", "start$iv"}, s = {"J$0", "J$1"})
public final class FemaleHealthViewModel$onResume$lambda15$$inlined$safeLaunch$uilib_release$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ FemaleHealthViewModel c;
    public final /* synthetic */ DateTriple d;
    public long e;
    public long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FemaleHealthViewModel$onResume$lambda15$$inlined$safeLaunch$uilib_release$default$1(Continuation continuation, FemaleHealthViewModel femaleHealthViewModel, DateTriple dateTriple) {
        super(2, continuation);
        this.c = femaleHealthViewModel;
        this.d = dateTriple;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FemaleHealthViewModel$onResume$lambda15$$inlined$safeLaunch$uilib_release$default$1 femaleHealthViewModel$onResume$lambda15$$inlined$safeLaunch$uilib_release$default$1 = new FemaleHealthViewModel$onResume$lambda15$$inlined$safeLaunch$uilib_release$default$1(continuation, this.c, this.d);
        femaleHealthViewModel$onResume$lambda15$$inlined$safeLaunch$uilib_release$default$1.b = obj;
        return femaleHealthViewModel$onResume$lambda15$$inlined$safeLaunch$uilib_release$default$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((FemaleHealthViewModel$onResume$lambda15$$inlined$safeLaunch$uilib_release$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        long jCurrentTimeMillis;
        long j;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            HMLog.info("xys_FemaleHealthViewModel", FemaleHealthViewModel.o.a);
            jCurrentTimeMillis = System.currentTimeMillis();
            CollectionsKt__CollectionsKt.emptyList();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            List<HistoryItemBean> listUpdateAllFromCloud = this.c.repo.updateAllFromCloud();
            HMLog.info("xys_FemaleHealthViewModel", new FemaleHealthViewModel.q(System.currentTimeMillis() - jCurrentTimeMillis2));
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            MenstruationRepo menstruationRepo = this.c.repo;
            this.e = jCurrentTimeMillis;
            this.f = jCurrentTimeMillis3;
            this.a = 1;
            if (menstruationRepo.syncDeviceFromNet(listUpdateAllFromCloud, true, false, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            j = jCurrentTimeMillis3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.f;
            jCurrentTimeMillis = this.e;
            ResultKt.throwOnFailure(obj);
        }
        HMLog.info("xys_FemaleHealthViewModel", new FemaleHealthViewModel.r(System.currentTimeMillis() - j));
        long jCurrentTimeMillis4 = System.currentTimeMillis();
        this.c.e(Dispatchers.getDefault(), this.d.getYear(), this.d.getMonth());
        HMLog.info("xys_FemaleHealthViewModel", new FemaleHealthViewModel.s(System.currentTimeMillis() - jCurrentTimeMillis4));
        HMLog.info("xys_FemaleHealthViewModel", new FemaleHealthViewModel.p(System.currentTimeMillis() - jCurrentTimeMillis));
        return Unit.INSTANCE;
    }
}
