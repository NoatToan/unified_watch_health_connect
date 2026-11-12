package com.xiaomi.fitness.trail.viewmodel;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ScopeExtKt;
import androidx.lifecycle.ViewModelKt;
import com.mi.health.course.export.CourseApi;
import com.mi.health.course.export.data.CourseInfo;
import com.mi.health.course.export.data.CourseInfoList;
import com.mi.health.course.export.data.ReqItem;
import com.mi.health.course.export.data.ReqItemList;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.scope.AndroidScope;
import com.xiaomi.fitness.trail.viewmodel.RecordListVM;
import com.xiaomi.fitness.training_plan_export.manager.ITrainingManager;
import com.xiaomi.fitness.training_plan_export.manager.TrainingManagerExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005J\u000e\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#J\u001e\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u000e\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u0010J\u0012\u0010.\u001a\u00020\u001e2\b\u0010/\u001a\u0004\u0018\u000100H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR'\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR!\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0014\u001a\u0004\b*\u0010\u0012¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/trail/viewmodel/RecordListVM;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "startSec", "", "endSec", "dataGetter", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "getDataGetter", "()Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "setDataGetter", "(Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;)V", "resultEmitter", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "getResultEmitter", "()Landroidx/lifecycle/MutableLiveData;", "resultEmitter$delegate", "Lkotlin/Lazy;", "task", "Lkotlinx/coroutines/Job;", "api", "Lcom/mi/health/course/export/CourseApi;", "getApi", "()Lcom/mi/health/course/export/CourseApi;", "setApi", "(Lcom/mi/health/course/export/CourseApi;)V", "setPeriod", "", "startMills", "endMills", "getRecord", "category", "", "reqCourseInfo", "ids", "Lcom/mi/health/course/export/data/ReqItemList;", "data", "deleteResult", "", "getDeleteResult", "deleteResult$delegate", "deleteRecord", "report", "attach", "savedInstanceState", "Landroid/os/Bundle;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecordListVM extends AbsViewModel {
    public CourseApi api;
    public FitnessDataGetter dataGetter;
    private long endSec;
    private long startSec;

    @Nullable
    private Job task;

    /* JADX INFO: renamed from: resultEmitter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy resultEmitter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: s7k
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RecordListVM.resultEmitter_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: deleteResult$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deleteResult = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: t7k
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RecordListVM.deleteResult_delegate$lambda$2();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.trail.viewmodel.RecordListVM$getRecord$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.trail.viewmodel.RecordListVM$getRecord$1", f = "RecordListVM.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nRecordListVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordListVM.kt\ncom/xiaomi/fitness/trail/viewmodel/RecordListVM$getRecord$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,130:1\n1863#2,2:131\n*S KotlinDebug\n*F\n+ 1 RecordListVM.kt\ncom/xiaomi/fitness/trail/viewmodel/RecordListVM$getRecord$1\n*L\n68#1:131,2\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $category;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$category = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RecordListVM.this.new AnonymousClass1(this.$category, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:41:0x00f2  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objWithContext;
            ArrayList arrayList;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Logger.d("SRecordListVM", "getRecord: 111");
                CoroutineDispatcher io2 = Dispatchers.getIO();
                RecordListVM$getRecord$1$ret$1 recordListVM$getRecord$1$ret$1 = new RecordListVM$getRecord$1$ret$1(this.$category, RecordListVM.this, null);
                this.label = 1;
                objWithContext = BuildersKt.withContext(io2, recordListVM$getRecord$1$ret$1, this);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objWithContext = obj;
            }
            List<SportBasicReport> list = (List) objWithContext;
            if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
                RecordListVM.this.getResultEmitter().setValue(list);
                return Unit.INSTANCE;
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            ReqItemList reqItemList = new ReqItemList(new ArrayList());
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SportBasicReport sportBasicReport = (SportBasicReport) it.next();
                Integer cloudCourseSource = sportBasicReport.getCloudCourseSource();
                int iIntValue = cloudCourseSource != null ? cloudCourseSource.intValue() : 0;
                Long cloudCourseId = sportBasicReport.getCloudCourseId();
                long jLongValue = cloudCourseId != null ? cloudCourseId.longValue() : 0L;
                if (jLongValue <= 0) {
                    arrayList = arrayList3;
                } else if (iIntValue == 0) {
                    arrayList = arrayList3;
                    if (sportBasicReport.getTrainingPlanId() != null) {
                        Long trainingPlanId = sportBasicReport.getTrainingPlanId();
                        Intrinsics.checkNotNull(trainingPlanId);
                        if (trainingPlanId.longValue() <= 0 || !TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE).isCourseIdInAbilityRange(jLongValue)) {
                            arrayList2.add(String.valueOf(jLongValue));
                        } else {
                            arrayList5.add(String.valueOf(jLongValue));
                        }
                    } else {
                        arrayList2.add(String.valueOf(jLongValue));
                    }
                } else if (iIntValue != 1) {
                    if (iIntValue == 2) {
                        arrayList4.add(String.valueOf(jLongValue));
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = arrayList3;
                    arrayList.add(String.valueOf(jLongValue));
                }
                arrayList3 = arrayList;
            }
            ArrayList arrayList6 = arrayList3;
            ReqItem reqItem = new ReqItem(0, arrayList2);
            ReqItem reqItem2 = new ReqItem(1, arrayList6);
            ReqItem reqItem3 = new ReqItem(2, arrayList4);
            ReqItem reqItem4 = new ReqItem(3, arrayList5);
            ListExtKt.add(reqItemList.getReqItems(), reqItem);
            ListExtKt.add(reqItemList.getReqItems(), reqItem2);
            ListExtKt.add(reqItemList.getReqItems(), reqItem3);
            ListExtKt.add(reqItemList.getReqItems(), reqItem4);
            Logger.i("SRecordListVM", "getRecord: ret = " + list + ", reqListItem = " + reqItemList);
            if (!reqItemList.getReqItems().isEmpty()) {
                RecordListVM.this.reqCourseInfo(reqItemList, list);
            } else {
                RecordListVM.this.getResultEmitter().setValue(list);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.trail.viewmodel.RecordListVM$reqCourseInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.trail.viewmodel.RecordListVM$reqCourseInfo$1", f = "RecordListVM.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nRecordListVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordListVM.kt\ncom/xiaomi/fitness/trail/viewmodel/RecordListVM$reqCourseInfo$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1863#2:131\n1864#2:133\n1#3:132\n*S KotlinDebug\n*F\n+ 1 RecordListVM.kt\ncom/xiaomi/fitness/trail/viewmodel/RecordListVM$reqCourseInfo$1\n*L\n107#1:131\n107#1:133\n*E\n"})
    public static final class C32411 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<SportBasicReport> $data;
        final /* synthetic */ ReqItemList $ids;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32411(ReqItemList reqItemList, List<SportBasicReport> list, Continuation<? super C32411> continuation) {
            super(2, continuation);
            this.$ids = reqItemList;
            this.$data = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RecordListVM.this.new C32411(this.$ids, this.$data, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object next;
            Long cloudCourseId;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CourseApi api = RecordListVM.this.getApi();
                ReqItemList reqItemList = this.$ids;
                this.label = 1;
                obj = api.getCourseInfos(reqItemList, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            List<CourseInfo> list = ((CourseInfoList) obj).getList();
            List<CourseInfo> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                RecordListVM.this.getResultEmitter().setValue(this.$data);
            } else {
                for (SportBasicReport sportBasicReport : this.$data) {
                    Long cloudCourseId2 = sportBasicReport.getCloudCourseId();
                    if ((cloudCourseId2 != null ? cloudCourseId2.longValue() : 0L) > 0) {
                        Iterator<T> it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            cloudCourseId = sportBasicReport.getCloudCourseId();
                            Intrinsics.checkNotNull(cloudCourseId);
                        } while (!Intrinsics.areEqual(String.valueOf(cloudCourseId.longValue()), ((CourseInfo) next).getCourseId()));
                        CourseInfo courseInfo = (CourseInfo) next;
                        String courseName = courseInfo != null ? courseInfo.getCourseName() : null;
                        if (courseName != null && courseName.length() != 0) {
                            sportBasicReport.setCourseName(courseName);
                        }
                    }
                }
                RecordListVM.this.getResultEmitter().setValue(this.$data);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData deleteResult_delegate$lambda$2() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reqCourseInfo(ReqItemList ids, final List<SportBasicReport> data) {
        Logger.d("SRecordListVM", "reqCourseInfo: " + ids);
        ScopeExtKt.scopeNetLife$default(this, null, new C32411(ids, data, null), 1, null).m503catch(new Function2() { // from class: r7k
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RecordListVM.reqCourseInfo$lambda$1(this.f32293a, data, (AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reqCourseInfo$lambda$1(RecordListVM this$0, List data, AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(data, "$data");
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.getResultEmitter().setValue(data);
        Logger.e("SRecordListVM", "reqCourseInfo: " + it.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData resultEmitter_delegate$lambda$0() {
        return new MutableLiveData();
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void deleteRecord(@NotNull SportBasicReport report) {
        Intrinsics.checkNotNullParameter(report, "report");
        boolean zDeleteSportReport = FitnessDataExtKt.getInstance(FitnessDataRecorder.INSTANCE).deleteSportReport(report);
        getDeleteResult().postValue(Boolean.valueOf(zDeleteSportReport));
        Logger.i("delete sport record: " + zDeleteSportReport, new Object[0]);
    }

    @NotNull
    public final CourseApi getApi() {
        CourseApi courseApi = this.api;
        if (courseApi != null) {
            return courseApi;
        }
        Intrinsics.throwUninitializedPropertyAccessException("api");
        return null;
    }

    @NotNull
    public final FitnessDataGetter getDataGetter() {
        FitnessDataGetter fitnessDataGetter = this.dataGetter;
        if (fitnessDataGetter != null) {
            return fitnessDataGetter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dataGetter");
        return null;
    }

    @NotNull
    public final MutableLiveData<Boolean> getDeleteResult() {
        return (MutableLiveData) this.deleteResult.getValue();
    }

    public final void getRecord(@NotNull String category) {
        Intrinsics.checkNotNullParameter(category, "category");
        Job job = this.task;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Logger.d("SRecordListVM", "getRecord: category = " + category + ", startSec = " + this.startSec + ", endSec = " + this.endSec);
        this.task = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(category, null), 3, null);
    }

    @NotNull
    public final MutableLiveData<List<SportBasicReport>> getResultEmitter() {
        return (MutableLiveData) this.resultEmitter.getValue();
    }

    public final void setApi(@NotNull CourseApi courseApi) {
        Intrinsics.checkNotNullParameter(courseApi, "<set-?>");
        this.api = courseApi;
    }

    public final void setDataGetter(@NotNull FitnessDataGetter fitnessDataGetter) {
        Intrinsics.checkNotNullParameter(fitnessDataGetter, "<set-?>");
        this.dataGetter = fitnessDataGetter;
    }

    public final void setPeriod(long startMills, long endMills) {
        this.startSec = startMills / 1000;
        this.endSec = endMills / 1000;
    }
}
