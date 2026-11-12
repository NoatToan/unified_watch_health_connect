package com.huami.step.repo;

import android.text.TextUtils;
import androidx.arch.core.util.Function;
import androidx.p008lifecycle.CoroutineLiveDataKt;
import androidx.p008lifecycle.FlowLiveDataConversions;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.LiveDataScope;
import androidx.p008lifecycle.Transformations;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.hmchartui.utils.CommonTimeUtils;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.step.koin.IStepOriginData;
import com.huami.step.koin.KoinExtKt;
import com.huami.step.model.StepInfo;
import com.huami.step.model.StepOriginData;
import com.huami.step.model.StepTimeLineInfo;
import com.huami.step.model.StepsInTime;
import com.huami.step.service.StepEntry;
import com.huami.step.utils.StepTimeUtils;
import com.huami.watch.companion.mediac.Command;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002J$\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\u0006\u0010\u0012\u001a\u00020\rH\u0002J(\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bH\u0016J&\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000bH\u0016J$\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00040\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0016J$\u0010 \u001a\u00020\u00182\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014¨\u0006#"}, d2 = {"Lcom/huami/step/repo/StepInfoRepositoryImpl;", "Lcom/huami/step/repo/StepInfoRepository;", "Lcom/huami/step/model/StepOriginData;", "dateData", "", "Lcom/huami/step/model/StepTimeLineInfo;", "c", "list", "Lcom/huami/step/service/StepEntry;", "a", "", "", SportAnalytics.ParamValue.MapButtonType.MAP, "", "time", "Lcom/huami/step/model/StepInfo;", GoogleApiAvailabilityLight.a, "b", "startTime", "e", "", "timeType", "userId", "Landroidx/lifecycle/LiveData;", "Lcom/huami/step/model/StepsInTime;", "getStepsInTimeRange", "getStepsStage", "Ljava/util/Date;", "start", "end", "Lkotlinx/coroutines/flow/Flow;", "getDayOfSteps", "parseStepsData", "<init>", "()V", "step_release"}, k = 1, mv = {1, 5, 1})
public final class StepInfoRepositoryImpl implements StepInfoRepository {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.step.repo.StepInfoRepositoryImpl$getDayOfSteps$2", f = "StepInfoRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<FlowCollector<?>, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector<?> flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Landroidx/lifecycle/LiveDataScope;", "Lcom/huami/step/model/StepsInTime;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.step.repo.StepInfoRepositoryImpl$getStepsInTimeRange$2", f = "StepInfoRepositoryImpl.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<LiveDataScope<StepsInTime>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ long d;
        public final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, int i, Continuation<? super b> continuation) {
            super(2, continuation);
            this.d = j;
            this.e = i;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull LiveDataScope<StepsInTime> liveDataScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = StepInfoRepositoryImpl.this.new b(this.d, this.e, continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LiveDataScope liveDataScope = (LiveDataScope) this.b;
                StepsInTime stepsData = StepInfoRepositoryImpl.this.parseStepsData(new ArrayList(), this.d, this.e);
                this.a = 1;
                if (liveDataScope.emit(stepsData, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, d2 = {"Landroidx/lifecycle/LiveDataScope;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.step.repo.StepInfoRepositoryImpl$getStepsStage$2", f = "StepInfoRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<LiveDataScope<? extends Object>, Continuation<? super Unit>, Object> {
        public int a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull LiveDataScope<? extends Object> liveDataScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            new ArrayList();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<StepEntry> a(List<StepOriginData> list) {
        ArrayList<StepOriginData> arrayList = new ArrayList();
        for (Object obj : list) {
            if (!TextUtils.isEmpty(((StepOriginData) obj).getSummary())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (StepOriginData stepOriginData : arrayList) {
            StepEntry stepEntry = null;
            try {
                Date date = StepTimeUtils.INSTANCE.parseDate(stepOriginData.getDate());
                long time = date == null ? 0L : date.getTime();
                JSONObject jSONObjectOptJSONObject = new JSONObject(stepOriginData.getSummary()).optJSONObject(StepsInfo.KEY_STEP_INFO);
                if (jSONObjectOptJSONObject != null) {
                    stepEntry = new StepEntry(time, jSONObjectOptJSONObject.optInt("ttl"), jSONObjectOptJSONObject.optInt("dis"), jSONObjectOptJSONObject.optInt("cal"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (stepEntry != null) {
                arrayList2.add(stepEntry);
            }
        }
        return arrayList2;
    }

    private final List<StepInfo> b(StepOriginData dateData) {
        ArrayList arrayList = new ArrayList();
        try {
            CommonTimeUtils commonTimeUtils = CommonTimeUtils.INSTANCE;
            Date date = StepTimeUtils.INSTANCE.parseDate(dateData.getDate());
            long dayStartTime = commonTimeUtils.getDayStartTime(date == null ? 0L : date.getTime());
            JSONArray jSONArray = new JSONArray(dateData.getStageStepsSummary());
            StepInfo stepInfo = new StepInfo();
            stepInfo.setTime(dayStartTime);
            int length = jSONArray.length() / 24;
            int length2 = jSONArray.length();
            if (length2 > 0) {
                int i = 0;
                int i2 = 0;
                while (true) {
                    int i3 = i + 1;
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    stepInfo.setDistance(stepInfo.getDistance() + jSONObject.optInt("dis"));
                    stepInfo.setCal(stepInfo.getCal() + jSONObject.optInt("cal"));
                    stepInfo.setSteps(stepInfo.getSteps() + jSONObject.optInt("step"));
                    stepInfo.setWalkTime(stepInfo.getWalkTime() + jSONObject.optInt("count"));
                    i2++;
                    if (i2 == length) {
                        arrayList.add(stepInfo.clone());
                        stepInfo = new StepInfo();
                        stepInfo.setTime(((StepInfo) CollectionsKt.last((List) arrayList)).getTime() + ((long) 3600000));
                        i2 = 0;
                    }
                    if (i3 >= length2) {
                        break;
                    }
                    i = i3;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<StepTimeLineInfo> c(StepOriginData dateData) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(dateData.getSummary()).optJSONObject(StepsInfo.KEY_STEP_INFO);
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject == null ? null : jSONObjectOptJSONObject.optJSONArray(StepsInfo.KEY_STAGE);
            if (jSONArrayOptJSONArray != null) {
                int i = 0;
                int length = jSONArrayOptJSONArray.length();
                if (length > 0) {
                    while (true) {
                        int i2 = i + 1;
                        JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                        StepTimeLineInfo stepTimeLineInfo = new StepTimeLineInfo();
                        stepTimeLineInfo.setStartTime(jSONObject.optInt("start"));
                        stepTimeLineInfo.setEndTime(jSONObject.optInt(Command.STOP));
                        int endTime = stepTimeLineInfo.getEndTime() - stepTimeLineInfo.getStartTime();
                        stepTimeLineInfo.setDurationHour(endTime / 60);
                        stepTimeLineInfo.setDurationMin(endTime % 60);
                        stepTimeLineInfo.setStep(jSONObject.optInt("step"));
                        stepTimeLineInfo.setCalorie(jSONObject.optInt("cal"));
                        stepTimeLineInfo.setDistance(jSONObject.optInt("dis"));
                        stepTimeLineInfo.setMode(jSONObject.optInt("mode"));
                        arrayList.add(stepTimeLineInfo);
                        if (i2 >= length) {
                            break;
                        }
                        i = i2;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    private final StepInfo d(Map<String, StepOriginData> map, long time) {
        StepInfo stepInfo = new StepInfo();
        stepInfo.setTime(time);
        StepOriginData stepOriginData = map.get(StepTimeUtils.INSTANCE.formatDate(time));
        if (stepOriginData != null) {
            try {
                JSONObject jSONObjectOptJSONObject = new JSONObject(stepOriginData.getSummary()).optJSONObject(StepsInfo.KEY_STEP_INFO);
                if (jSONObjectOptJSONObject != null) {
                    stepInfo.setSteps(jSONObjectOptJSONObject.optInt("ttl"));
                    stepInfo.setCal(jSONObjectOptJSONObject.optInt("cal"));
                    stepInfo.setDistance(jSONObjectOptJSONObject.optInt("dis"));
                    stepInfo.setRunTime(jSONObjectOptJSONObject.optInt(StepsInfo.KEY_STEP_RUN_TIME));
                    stepInfo.setWalkTime(jSONObjectOptJSONObject.optInt(StepsInfo.KEY_STEP_WALK_TIME));
                    stepInfo.setRunCal(jSONObjectOptJSONObject.optInt(StepsInfo.KEY_STEP_RUN_CALORIES));
                    stepInfo.setRunDistance(jSONObjectOptJSONObject.optInt(StepsInfo.KEY_STEP_RUN_DISTANCE));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return stepInfo;
    }

    private final StepInfo e(List<StepInfo> list, long startTime) {
        StepInfo stepInfo = new StepInfo();
        stepInfo.setTime(startTime);
        if (!list.isEmpty()) {
            for (StepInfo stepInfo2 : list) {
                stepInfo.setCal(stepInfo.getCal() + stepInfo2.getCal());
                stepInfo.setDistance(stepInfo.getDistance() + stepInfo2.getDistance());
                stepInfo.setRunCal(stepInfo.getRunCal() + stepInfo2.getRunCal());
                stepInfo.setRunDistance(stepInfo.getRunDistance() + stepInfo2.getRunDistance());
                stepInfo.setRunTime(stepInfo.getRunTime() + stepInfo2.getRunTime());
                stepInfo.setSteps(stepInfo.getSteps() + stepInfo2.getSteps());
                stepInfo.setWalkTime(stepInfo.getWalkTime() + stepInfo2.getWalkTime());
                if (stepInfo2.getSteps() > 0) {
                    if (stepInfo2.getDaysHasData() >= 1) {
                        stepInfo.setDaysHasData(stepInfo.getDaysHasData() + stepInfo2.getDaysHasData());
                    } else {
                        stepInfo.setDaysHasData(stepInfo.getDaysHasData() + 1);
                    }
                }
            }
        }
        return stepInfo;
    }

    @Override // com.huami.step.repo.StepInfoRepository
    @NotNull
    public Flow<List<StepEntry>> getDayOfSteps(@NotNull Date start, @NotNull Date end) {
        LiveData<List<StepOriginData>> stepOriginData;
        LiveData map;
        StepTimeUtils stepTimeUtils = StepTimeUtils.INSTANCE;
        String date = stepTimeUtils.formatDate(start.getTime());
        String date2 = stepTimeUtils.formatDate(end.getTime());
        IStepOriginData stepOriginData2 = KoinExtKt.getStepOriginData();
        Flow<List<StepEntry>> flowAsFlow = (stepOriginData2 == null || (stepOriginData = stepOriginData2.getStepOriginData("", date, date2)) == null || (map = Transformations.map(stepOriginData, new Function<List<? extends StepOriginData>, List<? extends StepEntry>>() { // from class: com.huami.step.repo.StepInfoRepositoryImpl$getDayOfSteps$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final List<? extends StepEntry> apply(List<? extends StepOriginData> list) {
                List<? extends StepOriginData> list2 = list;
                List<? extends StepEntry> listA = list2 == null ? null : this.a.a(list2);
                return listA == null ? CollectionsKt__CollectionsKt.emptyList() : listA;
            }
        })) == null) ? null : FlowLiveDataConversions.asFlow(map);
        return flowAsFlow == null ? FlowKt.flow(new a(null)) : flowAsFlow;
    }

    @Override // com.huami.step.repo.StepInfoRepository
    @Nullable
    public LiveData<StepsInTime> getStepsInTimeRange(long startTime, final int timeType, @NotNull String userId) {
        LiveData<List<StepOriginData>> stepOriginData;
        CommonTimeUtils commonTimeUtils = CommonTimeUtils.INSTANCE;
        final long startTime2 = commonTimeUtils.getStartTime(startTime, timeType);
        StepTimeUtils stepTimeUtils = StepTimeUtils.INSTANCE;
        String date = stepTimeUtils.formatDate(startTime2);
        String date2 = stepTimeUtils.formatDate(commonTimeUtils.getEndTime(startTime, timeType));
        if (KoinExtKt.getStepOriginData() == null) {
            return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new b(startTime, timeType, null), 3, (Object) null);
        }
        IStepOriginData stepOriginData2 = KoinExtKt.getStepOriginData();
        if (stepOriginData2 == null || (stepOriginData = stepOriginData2.getStepOriginData(userId, date, date2)) == null) {
            return null;
        }
        return Transformations.map(stepOriginData, new Function<List<? extends StepOriginData>, StepsInTime>() { // from class: com.huami.step.repo.StepInfoRepositoryImpl$getStepsInTimeRange$$inlined$map$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // androidx.arch.core.util.Function
            public final StepsInTime apply(List<? extends StepOriginData> list) {
                return this.a.parseStepsData(list, startTime2, timeType);
            }
        });
    }

    @Override // com.huami.step.repo.StepInfoRepository
    @Nullable
    public LiveData<List<StepTimeLineInfo>> getStepsStage(long startTime, @NotNull String userId) {
        LiveData<List<StepOriginData>> stepOriginData;
        long dayStartTime = CommonTimeUtils.INSTANCE.getDayStartTime(startTime);
        StepTimeUtils stepTimeUtils = StepTimeUtils.INSTANCE;
        String date = stepTimeUtils.formatDate(dayStartTime);
        String date2 = stepTimeUtils.formatDate(startTime);
        if (KoinExtKt.getStepOriginData() == null) {
            return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new c(null), 3, (Object) null);
        }
        IStepOriginData stepOriginData2 = KoinExtKt.getStepOriginData();
        if (stepOriginData2 == null || (stepOriginData = stepOriginData2.getStepOriginData(userId, date, date2)) == null) {
            return null;
        }
        return Transformations.map(stepOriginData, new Function<List<? extends StepOriginData>, List<? extends StepTimeLineInfo>>() { // from class: com.huami.step.repo.StepInfoRepositoryImpl$getStepsStage$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final List<? extends StepTimeLineInfo> apply(List<? extends StepOriginData> list) {
                List<? extends StepOriginData> list2 = list;
                return (list2 == null || !(list2.isEmpty() ^ true)) ? new ArrayList() : this.a.c((StepOriginData) CollectionsKt.first((List) list2));
            }
        });
    }

    @NotNull
    public final StepsInTime parseStepsData(@NotNull List<StepOriginData> list, long startTime, int timeType) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (StepOriginData stepOriginData : list) {
            linkedHashMap.put(stepOriginData.getDate(), stepOriginData);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(startTime);
        switch (timeType) {
            case 17:
                int i = 1;
                do {
                    i++;
                    arrayList.add(d(linkedHashMap, calendar.getTimeInMillis()));
                    calendar.add(6, 1);
                } while (i <= 7);
                break;
            case 18:
                int i2 = calendar.get(2);
                for (int i3 = i2; i2 == i3; i3 = calendar.get(2)) {
                    arrayList.add(d(linkedHashMap, calendar.getTimeInMillis()));
                    calendar.add(6, 1);
                }
                break;
            case 19:
                int i4 = calendar.get(1);
                int i5 = calendar.get(2);
                ArrayList arrayList2 = new ArrayList();
                int i6 = i4;
                while (i4 == i6) {
                    arrayList2.add(d(linkedHashMap, calendar.getTimeInMillis()));
                    calendar.add(6, 1);
                    i6 = calendar.get(1);
                    if (calendar.get(2) != i5) {
                        arrayList.add(e(arrayList2, CommonTimeUtils.INSTANCE.offsetMonth(calendar.getTimeInMillis(), 1, false)));
                        arrayList2.clear();
                        i5 = calendar.get(2);
                    }
                }
                break;
            default:
                if (list.size() == 1) {
                    arrayList.addAll(b((StepOriginData) CollectionsKt.first((List) list)));
                }
                break;
        }
        return new StepsInTime(e(arrayList, startTime), arrayList);
    }
}
