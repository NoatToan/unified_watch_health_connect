package com.huami.femalehealth.uilib.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import com.huami.femalehealth.logiclib.api.pojo.HistoryDetailBean;
import com.huami.femalehealth.logiclib.api.pojo.HistoryDetailBeanKt;
import com.huami.femalehealth.logiclib.calculation.AidKt;
import com.huami.femalehealth.logiclib.dto.Degree;
import com.huami.femalehealth.logiclib.helper.DateTriple;
import com.huami.femalehealth.logiclib.repo.MenstruationRepo;
import com.huami.femalehealth.logiclib.vo.MenstruationVo;
import com.huami.tools.log.HMLog;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/huami/femalehealth/uilib/viewmodel/FHBaseViewModel$safeLaunch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.FemaleHealthViewModel$refreshCardStatus$$inlined$safeLaunch$uilib_release$default$1", f = "FemaleHealthViewModel.kt", i = {0}, l = {150}, m = "invokeSuspend", n = {"$this$refreshCardStatus_u24lambda_u2d33_u24lambda_u2d32"}, s = {"L$1"})
public final class FemaleHealthViewModel$refreshCardStatus$$inlined$safeLaunch$uilib_release$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ DateTriple c;
    public final /* synthetic */ FemaleHealthViewModel d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FemaleHealthViewModel$refreshCardStatus$$inlined$safeLaunch$uilib_release$default$1(Continuation continuation, DateTriple dateTriple, FemaleHealthViewModel femaleHealthViewModel) {
        super(2, continuation);
        this.c = dateTriple;
        this.d = femaleHealthViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FemaleHealthViewModel$refreshCardStatus$$inlined$safeLaunch$uilib_release$default$1 femaleHealthViewModel$refreshCardStatus$$inlined$safeLaunch$uilib_release$default$1 = new FemaleHealthViewModel$refreshCardStatus$$inlined$safeLaunch$uilib_release$default$1(continuation, this.c, this.d);
        femaleHealthViewModel$refreshCardStatus$$inlined$safeLaunch$uilib_release$default$1.b = obj;
        return femaleHealthViewModel$refreshCardStatus$$inlined$safeLaunch$uilib_release$default$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((FemaleHealthViewModel$refreshCardStatus$$inlined$safeLaunch$uilib_release$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        DateTriple dateTriple;
        String id;
        Object objPrevious;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DateTriple dateTriple2 = this.c;
            if (dateTriple2 != null) {
                MenstruationRepo menstruationRepo = this.d.repo;
                Date date = AidKt.toDate(dateTriple2);
                this.b = dateTriple2;
                this.e = dateTriple2;
                this.a = 1;
                Object lastMenstruation = menstruationRepo.getLastMenstruation(date, this);
                if (lastMenstruation == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dateTriple = dateTriple2;
                obj = lastMenstruation;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dateTriple = (DateTriple) this.e;
        ResultKt.throwOnFailure(obj);
        MenstruationVo menstruationVo = (MenstruationVo) CollectionsKt.firstOrNull((List) obj);
        if (menstruationVo != null && (id = menstruationVo.getId()) != null) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = this.d.statusCatch.get(id);
            HMLog.info("xys_FemaleHealthViewModel", new FemaleHealthViewModel.y(this.c, objectRef));
            if (objectRef.element == 0) {
                MutableLiveData<Triple<Degree, Degree, Degree>> statusLiveDate = this.d.getStatusLiveDate();
                Degree degree = Degree.UNSPECIFIED;
                statusLiveDate.postValue(new Triple<>(degree, degree, degree));
                this.d.repo.getCartStatus(id, new FemaleHealthViewModel.z(objectRef, this.d, id, dateTriple));
            } else {
                MutableLiveData<Triple<Degree, Degree, Degree>> statusLiveDate2 = this.d.getStatusLiveDate();
                List list = (List) objectRef.element;
                Triple<Degree, Degree, Degree> triple = null;
                if (list != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            objPrevious = null;
                            break;
                        }
                        objPrevious = listIterator.previous();
                    } while (!Boxing.boxBoolean(AidKt.resetZeroHour(((HistoryDetailBean) objPrevious).getMenstruationTime()) == AidKt.toMilli(dateTriple).getValue()).booleanValue());
                    HistoryDetailBean historyDetailBean = (HistoryDetailBean) objPrevious;
                    if (historyDetailBean != null) {
                        triple = HistoryDetailBeanKt.toTriple(historyDetailBean);
                    }
                }
                statusLiveDate2.postValue(triple);
            }
        }
        return Unit.INSTANCE;
    }
}
