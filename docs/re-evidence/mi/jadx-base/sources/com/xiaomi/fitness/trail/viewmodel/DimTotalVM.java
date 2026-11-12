package com.xiaomi.fitness.trail.viewmodel;

import android.os.Bundle;
import androidx.collection.ArrayMap;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fit.data.common.data.annotation.SportCategory;
import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportCategoryData;
import com.xiaomi.fit.data.common.data.sport.SportSummary;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.api.SportSummaryApi;
import com.xiaomi.fit.fitness.export.api.SportSummaryApiKt;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.trail.data.DimTotalData;
import com.xiaomi.fitness.trail.data.RecordUtilKt;
import com.xiaomi.fitness.trail.data.SportPercent;
import com.xiaomi.fitness.trail.diving.DivingRepository;
import com.xiaomi.fitness.trail.viewmodel.DimTotalVM;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
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
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0015J\u0018\u0010&\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00152\b\b\u0002\u0010'\u001a\u00020(J\f\u0010)\u001a\u00020$*\u00020*H\u0002J\u0012\u0010+\u001a\u00020$2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0014\u0010.\u001a\u00020$2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J(\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001501002\u000e\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001020\u0014J\u000e\u00108\u001a\u00020$2\u0006\u00109\u001a\u00020\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR&\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00140\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\"R!\u00104\u001a\b\u0012\u0004\u0012\u00020(0\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b5\u0010\u0010¨\u0006:"}, d2 = {"Lcom/xiaomi/fitness/trail/viewmodel/DimTotalVM;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "api", "Lcom/xiaomi/fit/fitness/export/api/SportSummaryApi;", "<init>", "(Lcom/xiaomi/fit/fitness/export/api/SportSummaryApi;)V", "dataGetter", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "getDataGetter", "()Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "setDataGetter", "(Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;)V", "emitter", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/trail/data/DimTotalData;", "getEmitter", "()Landroidx/lifecycle/MutableLiveData;", "tasks", "Lkotlinx/coroutines/Job;", "categoryList", "", "", "cacheMap", "Landroidx/collection/ArrayMap;", "divingRepository", "Lcom/xiaomi/fitness/trail/diving/DivingRepository;", "getDivingRepository", "()Lcom/xiaomi/fitness/trail/diving/DivingRepository;", "setDivingRepository", "(Lcom/xiaomi/fitness/trail/diving/DivingRepository;)V", "divingReportListLiveData", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "getDivingReportListLiveData", "setDivingReportListLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "getAllSportReportByCategory", "", "category", "getSummaryData", "force", "", "genReport", "Lcom/xiaomi/fit/data/common/data/sport/SportSummary$MaxData;", "attach", "savedInstanceState", "Landroid/os/Bundle;", "setCategoryList", "getDivingPointDetailMapLiveData", "Landroidx/lifecycle/LiveData;", "", "", "idList", "deleteResult", "getDeleteResult", "deleteResult$delegate", "Lkotlin/Lazy;", "deleteDivingRecord", "report", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDimTotalVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DimTotalVM.kt\ncom/xiaomi/fitness/trail/viewmodel/DimTotalVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,156:1\n774#2:157\n865#2,2:158\n827#2:160\n855#2,2:161\n*S KotlinDebug\n*F\n+ 1 DimTotalVM.kt\ncom/xiaomi/fitness/trail/viewmodel/DimTotalVM\n*L\n137#1:157\n137#1:158,2\n152#1:160\n152#1:161,2\n*E\n"})
public final class DimTotalVM extends AbsViewModel {

    @NotNull
    private final SportSummaryApi api;

    @NotNull
    private final ArrayMap<String, DimTotalData> cacheMap;
    private List<String> categoryList;
    public FitnessDataGetter dataGetter;

    /* JADX INFO: renamed from: deleteResult$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deleteResult;

    @NotNull
    private MutableLiveData<List<SportBasicReport>> divingReportListLiveData;
    public DivingRepository divingRepository;

    @NotNull
    private final MutableLiveData<DimTotalData> emitter;

    @Nullable
    private Job tasks;

    /* JADX INFO: renamed from: com.xiaomi.fitness.trail.viewmodel.DimTotalVM$getAllSportReportByCategory$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.trail.viewmodel.DimTotalVM$getAllSportReportByCategory$1", f = "DimTotalVM.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nDimTotalVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DimTotalVM.kt\ncom/xiaomi/fitness/trail/viewmodel/DimTotalVM$getAllSportReportByCategory$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,156:1\n1062#2:157\n*S KotlinDebug\n*F\n+ 1 DimTotalVM.kt\ncom/xiaomi/fitness/trail/viewmodel/DimTotalVM$getAllSportReportByCategory$1\n*L\n58#1:157\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $category;
        final /* synthetic */ long $startTimeInSec;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, long j, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$category = str;
            this.$startTimeInSec = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DimTotalVM.this.new AnonymousClass1(this.$category, this.$startTimeInSec, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FitnessDataGetter dataGetter = DimTotalVM.this.getDataGetter();
                String str = this.$category;
                long j = this.$startTimeInSec;
                long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
                this.label = 1;
                obj = dataGetter.getSportReportByCategory(str, j, jCurrentTimeMillis, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            DimTotalVM.this.getDivingReportListLiveData().postValue(CollectionsKt___CollectionsKt.sortedWith((List) obj, new Comparator() { // from class: com.xiaomi.fitness.trail.viewmodel.DimTotalVM$getAllSportReportByCategory$1$invokeSuspend$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((SportBasicReport) t2).getStartTime()), Long.valueOf(((SportBasicReport) t).getStartTime()));
                }
            }));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.trail.viewmodel.DimTotalVM$getDivingPointDetailMapLiveData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "", "", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.trail.viewmodel.DimTotalVM$getDivingPointDetailMapLiveData$1", f = "DimTotalVM.kt", i = {}, l = {142, 142}, m = "invokeSuspend", n = {}, s = {})
    public static final class C32401 extends SuspendLambda implements Function2<LiveDataScope<Map<Integer, ? extends String>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<Integer> $idList;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32401(List<Integer> list, Continuation<? super C32401> continuation) {
            super(2, continuation);
            this.$idList = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C32401 c32401 = DimTotalVM.this.new C32401(this.$idList, continuation);
            c32401.L$0 = obj;
            return c32401;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(LiveDataScope<Map<Integer, String>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C32401) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.L$0;
            DivingRepository divingRepository = DimTotalVM.this.getDivingRepository();
            List<Integer> list = this.$idList;
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = divingRepository.getDivingPointDetailMap(list, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(LiveDataScope<Map<Integer, ? extends String>> liveDataScope, Continuation<? super Unit> continuation) {
            return invoke2((LiveDataScope<Map<Integer, String>>) liveDataScope, continuation);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.trail.viewmodel.DimTotalVM$getSummaryData$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.trail.viewmodel.DimTotalVM$getSummaryData$2", f = "DimTotalVM.kt", i = {0}, l = {74}, m = "invokeSuspend", n = {"data"}, s = {"L$0"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $category;
        Object L$0;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.trail.viewmodel.DimTotalVM$getSummaryData$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.trail.viewmodel.DimTotalVM$getSummaryData$2$1", f = "DimTotalVM.kt", i = {0, 1}, l = {77, 78}, m = "invokeSuspend", n = {"specificListTask", SportDataTypeKt.DIMEN_TOTAL}, s = {"L$0", "L$0"})
        @SourceDebugExtension({"SMAP\nDimTotalVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DimTotalVM.kt\ncom/xiaomi/fitness/trail/viewmodel/DimTotalVM$getSummaryData$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,156:1\n774#2:157\n865#2,2:158\n1863#2,2:161\n1062#2:163\n1#3:160\n*S KotlinDebug\n*F\n+ 1 DimTotalVM.kt\ncom/xiaomi/fitness/trail/viewmodel/DimTotalVM$getSummaryData$2$1\n*L\n81#1:157\n81#1:158,2\n85#1:161,2\n97#1:163\n*E\n"})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $category;
            final /* synthetic */ DimTotalData $data;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DimTotalVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DimTotalData dimTotalData, DimTotalVM dimTotalVM, String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$data = dimTotalData;
                this.this$0 = dimTotalVM;
                this.$category = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final int invokeSuspend$lambda$6(SportPercent sportPercent, SportPercent sportPercent2) {
                return sportPercent.getIntPercent() != sportPercent2.getIntPercent() ? sportPercent2.getIntPercent() - sportPercent.getIntPercent() : (int) (sportPercent2.getTime() - sportPercent.getTime());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final int invokeSuspend$lambda$7(Function2 function2, Object obj, Object obj2) {
                return ((Number) function2.invoke(obj, obj2)).intValue();
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$data, this.this$0, this.$category, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            /* JADX WARN: Code duplicated, block: B:107:0x0105 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:110:0x00dd A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:19:0x006f  */
            /* JADX WARN: Code duplicated, block: B:20:0x0072  */
            /* JADX WARN: Code duplicated, block: B:22:0x0075  */
            /* JADX WARN: Code duplicated, block: B:24:0x007f  */
            /* JADX WARN: Code duplicated, block: B:27:0x0090  */
            /* JADX WARN: Code duplicated, block: B:43:0x00c8 A[LOOP:1: B:41:0x00c2->B:43:0x00c8, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:47:0x00e3  */
            /* JADX WARN: Code duplicated, block: B:53:0x013d A[LOOP:3: B:51:0x0137->B:53:0x013d, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:56:0x0155 A[LOOP:4: B:55:0x0153->B:56:0x0155, LOOP_END] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Deferred deferredAsync$default;
                Object objAwait;
                Object objAwait2;
                SportSummary sportSummary;
                List list;
                SportSummary.SummaryData summaryData;
                SportSummary.SummaryData summaryData2;
                SportSummary.MaxData maxData;
                SportSummary.SummaryData summaryData3;
                SportSummary.MaxData maxData2;
                SportSummary.SummaryData summaryData4;
                SportSummary.MaxData maxData3;
                SportSummary.SummaryData summaryData5;
                SportSummary.MaxData maxData4;
                SportSummary.SummaryData summaryData6;
                SportSummary.MaxData maxData5;
                SportSummary.SummaryData summaryData7;
                SportSummary.MaxData maxData6;
                long j;
                Iterator it;
                ArrayList arrayList;
                Iterator it2;
                int i;
                int intPercent;
                int iMin;
                float f;
                int i2;
                SportCategoryData sportCategory;
                String str;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.label;
                if (i3 != 0) {
                    if (i3 == 1) {
                        deferredAsync$default = (Deferred) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        objAwait = obj;
                    } else {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sportSummary = (SportSummary) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        objAwait2 = obj;
                    }
                    list = (List) objAwait2;
                    if (sportSummary != null) {
                        summaryData = sportSummary.info;
                    } else {
                        summaryData = null;
                    }
                    if (summaryData != null) {
                        j = 0;
                        if (sportSummary.info.total_duration > 0) {
                            ArrayList<SportSummary> arrayList2 = new ArrayList();
                            for (Object obj2 : list) {
                                SportSummary sportSummary2 = (SportSummary) obj2;
                                str = sportSummary2.key.category;
                                if (str == null && str.length() != 0) {
                                    SportSummary.SummaryData summaryData8 = sportSummary2.info;
                                    if ((summaryData8 != null ? Boxing.boxLong(summaryData8.total_duration) : null) != null && sportSummary2.info.total_duration > 0) {
                                        arrayList2.add(obj2);
                                    }
                                }
                            }
                            it = arrayList2.iterator();
                            while (it.hasNext()) {
                                j += ((SportSummary) it.next()).info.total_duration;
                            }
                            arrayList = new ArrayList();
                            for (SportSummary sportSummary3 : arrayList2) {
                                f = (sportSummary3.info.total_duration * 100.0f) / j;
                                i2 = (int) f;
                                SportCategory.Companion companion = SportCategory.INSTANCE;
                                String category = sportSummary3.key.category;
                                Intrinsics.checkNotNullExpressionValue(category, "category");
                                sportCategory = companion.getSportCategory(category);
                                if (sportCategory != null) {
                                    arrayList.add(new SportPercent(ResourceExtKt.getString(sportCategory.getNameRes()), i2, f - i2, RecordUtilKt.formatDuration(sportSummary3.info.total_duration), sportSummary3.info.total_duration));
                                }
                            }
                            CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.xiaomi.fitness.trail.viewmodel.DimTotalVM$getSummaryData$2$1$invokeSuspend$$inlined$sortedByDescending$1
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.Comparator
                                public final int compare(T t, T t2) {
                                    return ComparisonsKt__ComparisonsKt.compareValues(Float.valueOf(((SportPercent) t2).getDecimal()), Float.valueOf(((SportPercent) t).getDecimal()));
                                }
                            });
                            it2 = arrayList.iterator();
                            intPercent = 0;
                            while (it2.hasNext()) {
                                intPercent += ((SportPercent) it2.next()).getIntPercent();
                            }
                            iMin = Math.min(100 - intPercent, arrayList.size());
                            for (i = 0; i < iMin; i++) {
                                ((SportPercent) arrayList.get(i)).getIntPercent();
                            }
                            final Function2 function2 = new Function2() { // from class: com.xiaomi.fitness.trail.viewmodel.a
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    return Integer.valueOf(DimTotalVM.AnonymousClass2.AnonymousClass1.invokeSuspend$lambda$6((SportPercent) obj3, (SportPercent) obj4));
                                }
                            };
                            List<SportPercent> listSortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.xiaomi.fitness.trail.viewmodel.b
                                @Override // java.util.Comparator
                                public final int compare(Object obj3, Object obj4) {
                                    return DimTotalVM.AnonymousClass2.AnonymousClass1.invokeSuspend$lambda$7(function2, obj3, obj4);
                                }
                            });
                            this.$data.setSummary(sportSummary);
                            this.$data.setDurationList(listSortedWith);
                        }
                    }
                    if (sportSummary != null && (summaryData7 = sportSummary.info) != null && (maxData6 = summaryData7.max_avg_pace) != null) {
                        this.this$0.genReport(maxData6);
                    }
                    if (sportSummary != null && (summaryData6 = sportSummary.info) != null && (maxData5 = summaryData6.max_avg_speed) != null) {
                        this.this$0.genReport(maxData5);
                    }
                    if (sportSummary != null && (summaryData5 = sportSummary.info) != null && (maxData4 = summaryData5.max_calorie) != null) {
                        this.this$0.genReport(maxData4);
                    }
                    if (sportSummary != null && (summaryData4 = sportSummary.info) != null && (maxData3 = summaryData4.max_distance) != null) {
                        this.this$0.genReport(maxData3);
                    }
                    if (sportSummary != null && (summaryData3 = sportSummary.info) != null && (maxData2 = summaryData3.max_duration) != null) {
                        this.this$0.genReport(maxData2);
                    }
                    if (sportSummary != null || (summaryData2 = sportSummary.info) == null || (maxData = summaryData2.max_accessory_count) == null) {
                        return null;
                    }
                    this.this$0.genReport(maxData);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new DimTotalVM$getSummaryData$2$1$totalTask$1(this.this$0, this.$category, null), 3, null);
                deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new DimTotalVM$getSummaryData$2$1$specificListTask$1(this.this$0, null), 3, null);
                this.L$0 = deferredAsync$default;
                this.label = 1;
                objAwait = deferredAsync$default2.await(this);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
                SportSummary sportSummary4 = (SportSummary) objAwait;
                this.L$0 = sportSummary4;
                this.label = 2;
                objAwait2 = deferredAsync$default.await(this);
                if (objAwait2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                sportSummary = sportSummary4;
                list = (List) objAwait2;
                if (sportSummary != null) {
                    summaryData = sportSummary.info;
                } else {
                    summaryData = null;
                }
                if (summaryData != null) {
                    j = 0;
                    if (sportSummary.info.total_duration > 0) {
                        ArrayList<SportSummary> arrayList3 = new ArrayList();
                        while (r2.hasNext()) {
                            SportSummary sportSummary5 = (SportSummary) obj2;
                            str = sportSummary5.key.category;
                            if (str == null) {
                            }
                        }
                        it = arrayList3.iterator();
                        while (it.hasNext()) {
                            j += ((SportSummary) it.next()).info.total_duration;
                        }
                        arrayList = new ArrayList();
                        while (r3.hasNext()) {
                            f = (sportSummary3.info.total_duration * 100.0f) / j;
                            i2 = (int) f;
                            SportCategory.Companion companion2 = SportCategory.INSTANCE;
                            String category2 = sportSummary3.key.category;
                            Intrinsics.checkNotNullExpressionValue(category2, "category");
                            sportCategory = companion2.getSportCategory(category2);
                            if (sportCategory != null) {
                                arrayList.add(new SportPercent(ResourceExtKt.getString(sportCategory.getNameRes()), i2, f - i2, RecordUtilKt.formatDuration(sportSummary3.info.total_duration), sportSummary3.info.total_duration));
                            }
                        }
                        CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.xiaomi.fitness.trail.viewmodel.DimTotalVM$getSummaryData$2$1$invokeSuspend$$inlined$sortedByDescending$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t, T t2) {
                                return ComparisonsKt__ComparisonsKt.compareValues(Float.valueOf(((SportPercent) t2).getDecimal()), Float.valueOf(((SportPercent) t).getDecimal()));
                            }
                        });
                        it2 = arrayList.iterator();
                        intPercent = 0;
                        while (it2.hasNext()) {
                            intPercent += ((SportPercent) it2.next()).getIntPercent();
                        }
                        iMin = Math.min(100 - intPercent, arrayList.size());
                        while (i < iMin) {
                            ((SportPercent) arrayList.get(i)).getIntPercent();
                        }
                        final Function2 function3 = new Function2() { // from class: com.xiaomi.fitness.trail.viewmodel.a
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                return Integer.valueOf(DimTotalVM.AnonymousClass2.AnonymousClass1.invokeSuspend$lambda$6((SportPercent) obj3, (SportPercent) obj4));
                            }
                        };
                        List<SportPercent> listSortedWith2 = CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.xiaomi.fitness.trail.viewmodel.b
                            @Override // java.util.Comparator
                            public final int compare(Object obj3, Object obj4) {
                                return DimTotalVM.AnonymousClass2.AnonymousClass1.invokeSuspend$lambda$7(function3, obj3, obj4);
                            }
                        });
                        this.$data.setSummary(sportSummary);
                        this.$data.setDurationList(listSortedWith2);
                    }
                }
                if (sportSummary != null) {
                    this.this$0.genReport(maxData6);
                }
                if (sportSummary != null) {
                    this.this$0.genReport(maxData5);
                }
                if (sportSummary != null) {
                    this.this$0.genReport(maxData4);
                }
                if (sportSummary != null) {
                    this.this$0.genReport(maxData3);
                }
                if (sportSummary != null) {
                    this.this$0.genReport(maxData2);
                }
                return sportSummary != null ? null : null;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$category = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DimTotalVM.this.new AnonymousClass2(this.$category, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            DimTotalData dimTotalData;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DimTotalData dimTotalData2 = new DimTotalData(null, null);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(dimTotalData2, DimTotalVM.this, this.$category, null);
                this.L$0 = dimTotalData2;
                this.label = 1;
                if (BuildersKt.withContext(io2, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dimTotalData = dimTotalData2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dimTotalData = (DimTotalData) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            DimTotalVM.this.cacheMap.put(this.$category, dimTotalData);
            DimTotalVM.this.getEmitter().setValue(dimTotalData);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public DimTotalVM(@NotNull SportSummaryApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
        this.emitter = new MutableLiveData<>();
        this.cacheMap = new ArrayMap<>();
        this.divingReportListLiveData = new MutableLiveData<>();
        this.deleteResult = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: hw6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DimTotalVM.deleteResult_delegate$lambda$3();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData deleteResult_delegate$lambda$3() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void genReport(SportSummary.MaxData maxData) {
        SportSummary.MaxKey maxKey = maxData.key;
        if (maxKey != null) {
            FitnessDataGetter dataGetter = getDataGetter();
            String sid = maxKey.sid;
            Intrinsics.checkNotNullExpressionValue(sid, "sid");
            String key = maxKey.key;
            Intrinsics.checkNotNullExpressionValue(key, "key");
            SportBasicReport theSportReport = dataGetter.getTheSportReport(sid, key, maxKey.time);
            long j = maxKey.time;
            int i = maxData.dataType;
            String sid2 = theSportReport != null ? theSportReport.getSid() : null;
            Logger.d("SRecordTotalVM", "genReport: time = " + j + ", type = " + i + ", report = " + theSportReport + ", reportSid = " + sid2 + ", maxSid = " + maxKey.sid);
            maxData.report = theSportReport;
        }
    }

    public static /* synthetic */ void getSummaryData$default(DimTotalVM dimTotalVM, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        dimTotalVM.getSummaryData(str, z);
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void deleteDivingRecord(@NotNull SportBasicReport report) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(report, "report");
        boolean zDeleteSportReport = FitnessDataExtKt.getInstance(FitnessDataRecorder.INSTANCE).deleteSportReport(report);
        getDeleteResult().postValue(Boolean.valueOf(zDeleteSportReport));
        List<SportBasicReport> value = this.divingReportListLiveData.getValue();
        if (value != null) {
            arrayList = new ArrayList();
            for (Object obj : value) {
                if (((SportBasicReport) obj).getStartTime() != report.getStartTime()) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        MutableLiveData<List<SportBasicReport>> mutableLiveData = this.divingReportListLiveData;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        mutableLiveData.setValue(arrayList);
        Logger.i("delete sport record: " + zDeleteSportReport, new Object[0]);
    }

    public final void getAllSportReportByCategory(@NotNull String category) {
        Intrinsics.checkNotNullParameter(category, "category");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(category, FitnessDateUtils.changeToDestZeroTimeOneDay(SportSummaryApiKt.DEFAULT_START_0TZ_SEC, 0, FitnessDateUtils.getCurrentTZOffsetInSec()), null), 2, null);
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

    @NotNull
    public final LiveData<Map<Integer, String>> getDivingPointDetailMapLiveData(@NotNull List<Integer> idList) {
        Intrinsics.checkNotNullParameter(idList, "idList");
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C32401(idList, null), 3, (Object) null);
    }

    @NotNull
    public final MutableLiveData<List<SportBasicReport>> getDivingReportListLiveData() {
        return this.divingReportListLiveData;
    }

    @NotNull
    public final DivingRepository getDivingRepository() {
        DivingRepository divingRepository = this.divingRepository;
        if (divingRepository != null) {
            return divingRepository;
        }
        Intrinsics.throwUninitializedPropertyAccessException("divingRepository");
        return null;
    }

    @NotNull
    public final MutableLiveData<DimTotalData> getEmitter() {
        return this.emitter;
    }

    public final void getSummaryData(@NotNull String category, boolean force) {
        DimTotalData dimTotalData;
        Intrinsics.checkNotNullParameter(category, "category");
        Job job = this.tasks;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        if (force || (dimTotalData = this.cacheMap.get(category)) == null) {
            this.tasks = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass2(category, null), 3, null);
        } else {
            this.emitter.setValue(dimTotalData);
        }
    }

    public final void setCategoryList(@NotNull List<String> categoryList) {
        Intrinsics.checkNotNullParameter(categoryList, "categoryList");
        ArrayList arrayList = new ArrayList();
        for (Object obj : categoryList) {
            if (!Intrinsics.areEqual((String) obj, "sport_stats_all")) {
                arrayList.add(obj);
            }
        }
        this.categoryList = arrayList;
    }

    public final void setDataGetter(@NotNull FitnessDataGetter fitnessDataGetter) {
        Intrinsics.checkNotNullParameter(fitnessDataGetter, "<set-?>");
        this.dataGetter = fitnessDataGetter;
    }

    public final void setDivingReportListLiveData(@NotNull MutableLiveData<List<SportBasicReport>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.divingReportListLiveData = mutableLiveData;
    }

    public final void setDivingRepository(@NotNull DivingRepository divingRepository) {
        Intrinsics.checkNotNullParameter(divingRepository, "<set-?>");
        this.divingRepository = divingRepository;
    }
}
