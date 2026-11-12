package com.huami.bloodpressure_ui.day;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModelKt;
import com.huami.bloodpressure_core.dc.local.BloodPressureDbVo;
import com.huami.bloodpressure_core.ext.TimeFormatEx;
import com.huami.bloodpressure_ui.base.BaseBloodPressureViewModel;
import com.huami.bloodpressure_ui.chart.BloodPressureEmptyStyleStatus;
import com.huami.bloodpressure_ui.usercase.BloodPressureLogicRepoUserCase;
import com.loc.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.math.c;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0016R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR$\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R'\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/huami/bloodpressure_ui/day/BloodPressureDayViewModel;", "Lcom/huami/bloodpressure_ui/base/BaseBloodPressureViewModel;", "", "timeStr", "", "b", "", "currentTimeStamp", "a", "timeStamp", "loadData", "Lcom/huami/bloodpressure_ui/usercase/BloodPressureLogicRepoUserCase;", "h", "Lcom/huami/bloodpressure_ui/usercase/BloodPressureLogicRepoUserCase;", "iBloodPressureLogicRepo", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/huami/bloodpressure_core/dc/local/BloodPressureDbVo;", "i", "Landroidx/lifecycle/MutableLiveData;", "_chartList", z.j, "getChartList", "()Landroidx/lifecycle/MutableLiveData;", "chartList", "<init>", "(Lcom/huami/bloodpressure_ui/usercase/BloodPressureLogicRepoUserCase;)V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureDayViewModel extends BaseBloodPressureViewModel {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final BloodPressureLogicRepoUserCase iBloodPressureLogicRepo;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<BloodPressureDbVo>> _chartList;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<BloodPressureDbVo>> chartList;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u008a@"}, d2 = {"", "Lcom/huami/bloodpressure_core/dc/local/BloodPressureDbVo;", "dataList", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodpressure_ui.day.BloodPressureDayViewModel$initDayFlow$1", f = "BloodPressureDayViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<List<? extends BloodPressureDbVo>, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, Continuation<? super a> continuation) {
            super(2, continuation);
            this.d = j;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable List<BloodPressureDbVo> list, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = BloodPressureDayViewModel.this.new a(this.d, continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object next;
            Object next2;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List list = (List) this.b;
            int iIntValue = 0;
            if (list == null || list.isEmpty()) {
                BloodPressureDayViewModel.this.get_headStatus().postValue(new BloodPressureEmptyStyleStatus(TimeFormatEx.INSTANCE.formatTimeYMD(this.d), false, null, 6, null));
                BloodPressureDayViewModel.this.get_analyseList().postValue(null);
                BloodPressureDayViewModel.this._chartList.postValue(null);
            } else {
                Iterator it2 = list.iterator();
                int iIntValue2 = 0;
                while (it2.hasNext()) {
                    iIntValue2 += Boxing.boxInt(((BloodPressureDbVo) it2.next()).getSbp()).intValue();
                }
                int iRoundToInt = c.roundToInt(iIntValue2 / list.size());
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    iIntValue += Boxing.boxInt(((BloodPressureDbVo) it3.next()).getDbp()).intValue();
                }
                int iRoundToInt2 = c.roundToInt(iIntValue / list.size());
                Iterator it4 = list.iterator();
                if (it4.hasNext()) {
                    next = it4.next();
                    if (it4.hasNext()) {
                        Integer numBoxInt = Boxing.boxInt(((BloodPressureDbVo) next).getSbp());
                        do {
                            Object next3 = it4.next();
                            Integer numBoxInt2 = Boxing.boxInt(((BloodPressureDbVo) next3).getSbp());
                            if (numBoxInt.compareTo(numBoxInt2) < 0) {
                                next = next3;
                                numBoxInt = numBoxInt2;
                            }
                        } while (it4.hasNext());
                    }
                } else {
                    next = null;
                }
                BloodPressureDbVo bloodPressureDbVo = (BloodPressureDbVo) next;
                Integer numBoxInt3 = bloodPressureDbVo == null ? null : Boxing.boxInt(bloodPressureDbVo.getSbp());
                Iterator it5 = list.iterator();
                if (it5.hasNext()) {
                    next2 = it5.next();
                    if (it5.hasNext()) {
                        Integer numBoxInt4 = Boxing.boxInt(((BloodPressureDbVo) next2).getDbp());
                        do {
                            Object next4 = it5.next();
                            Integer numBoxInt5 = Boxing.boxInt(((BloodPressureDbVo) next4).getDbp());
                            if (numBoxInt4.compareTo(numBoxInt5) < 0) {
                                next2 = next4;
                                numBoxInt4 = numBoxInt5;
                            }
                        } while (it5.hasNext());
                    }
                } else {
                    next2 = null;
                }
                BloodPressureDbVo bloodPressureDbVo2 = (BloodPressureDbVo) next2;
                Integer numBoxInt6 = bloodPressureDbVo2 != null ? Boxing.boxInt(bloodPressureDbVo2.getDbp()) : null;
                MutableLiveData mutableLiveData = BloodPressureDayViewModel.this.get_analyseList();
                ArrayList arrayList = new ArrayList();
                arrayList.add(Boxing.boxInt(iRoundToInt));
                arrayList.add(Boxing.boxInt(iRoundToInt2));
                arrayList.add(numBoxInt3);
                arrayList.add(numBoxInt6);
                Unit unit = Unit.INSTANCE;
                mutableLiveData.setValue(arrayList);
                BloodPressureDayViewModel.this._chartList.postValue(list);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodpressure_ui.day.BloodPressureDayViewModel$loadNightData$1", f = "BloodPressureDayViewModel.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BloodPressureDayViewModel.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BloodPressureLogicRepoUserCase bloodPressureLogicRepoUserCase = BloodPressureDayViewModel.this.iBloodPressureLogicRepo;
                String str = this.c;
                this.a = 1;
                if (bloodPressureLogicRepoUserCase.getRemoteNightData(str, 1, this) == coroutine_suspended) {
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
    }

    public BloodPressureDayViewModel(@NotNull BloodPressureLogicRepoUserCase bloodPressureLogicRepoUserCase) {
        this.iBloodPressureLogicRepo = bloodPressureLogicRepoUserCase;
        MutableLiveData<List<BloodPressureDbVo>> mutableLiveData = new MutableLiveData<>();
        this._chartList = mutableLiveData;
        this.chartList = mutableLiveData;
    }

    private final void a(long currentTimeStamp) {
        FlowKt.launchIn(FlowKt.onEach(FlowKt.flowOn(this.iBloodPressureLogicRepo.getDayDataByTimeStamp(currentTimeStamp), Dispatchers.getIO()), new a(currentTimeStamp, null)), ViewModelKt.getViewModelScope(this));
    }

    private final void b(String timeStr) {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new b(timeStr, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<List<BloodPressureDbVo>> getChartList() {
        return this.chartList;
    }

    @Override // com.huami.bloodpressure_ui.base.BaseBloodPressureViewModel
    public void loadData(long timeStamp) {
        a(timeStamp);
        b(TimeFormatEx.INSTANCE.formatTimeYMDInter(timeStamp));
    }
}
