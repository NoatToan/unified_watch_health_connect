package com.xiaomi.hm.health.sleep.repository;

import androidx.p008lifecycle.FlowLiveDataConversions;
import androidx.p008lifecycle.LiveData;
import com.huami.sleep.datasource.ISleepStatisticDataSource;
import com.huami.sleep.statistic.dto.SleepAllInfo;
import com.xiaomi.hm.health.manager.SportDataManager;
import com.xiaomi.hm.health.model.summery.HMSummery;
import com.xiaomi.hm.health.sleep.converter.DataTypeConverter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J,\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/sleep/repository/SleepStatisticDataSourceImpl;", "Lcom/huami/sleep/datasource/ISleepStatisticDataSource;", "", "date", "", "dateToTime", "userId", "from", "to", "Landroidx/lifecycle/LiveData;", "", "Lcom/huami/sleep/statistic/dto/SleepAllInfo;", "getSleepInfo", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SleepStatisticDataSourceImpl implements ISleepStatisticDataSource {

    /* JADX INFO: renamed from: com.xiaomi.hm.health.sleep.repository.SleepStatisticDataSourceImpl$getSleepInfo$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/huami/sleep/statistic/dto/SleepAllInfo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.sleep.repository.SleepStatisticDataSourceImpl$getSleepInfo$1", f = "SleepStatisticDataSourceImpl.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<FlowCollector<? super List<? extends SleepAllInfo>>, Continuation<? super Unit>, Object> {
        public final /* synthetic */ ArrayList<HMSummery> $daySummery;
        public final /* synthetic */ long $from;
        public final /* synthetic */ long $to;
        private /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ SleepStatisticDataSourceImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ArrayList<HMSummery> arrayList, SleepStatisticDataSourceImpl sleepStatisticDataSourceImpl, long j, long j2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$daySummery = arrayList;
            this.this$0 = sleepStatisticDataSourceImpl;
            this.$from = j;
            this.$to = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$daySummery, this.this$0, this.$from, this.$to, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends SleepAllInfo>> flowCollector, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super List<SleepAllInfo>>) flowCollector, continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull FlowCollector<? super List<SleepAllInfo>> flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                ArrayList<HMSummery> arrayList = this.$daySummery;
                SleepStatisticDataSourceImpl sleepStatisticDataSourceImpl = this.this$0;
                long j = this.$from;
                long j2 = this.$to;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    long jDateToTime = sleepStatisticDataSourceImpl.dateToTime(((HMSummery) obj2).date);
                    boolean z = false;
                    if (j <= jDateToTime && jDateToTime <= j2) {
                        z = true;
                    }
                    if (Boxing.boxBoolean(z).booleanValue()) {
                        arrayList2.add(obj2);
                    }
                }
                DataTypeConverter dataTypeConverter = DataTypeConverter.INSTANCE;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(dataTypeConverter.convertSleepAllInfo((HMSummery) it2.next()));
                }
                this.label = 1;
                if (flowCollector.emit(arrayList3, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final long dateToTime(String date) {
        try {
            Date date2 = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).parse(date);
            if (date2 == null) {
                return 0L;
            }
            return date2.getTime();
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Override // com.huami.sleep.datasource.ISleepStatisticDataSource
    @NotNull
    public LiveData<List<SleepAllInfo>> getSleepInfo(@NotNull String userId, long from, long to) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(SportDataManager.getInstance().getDaySummery());
        return FlowLiveDataConversions.asLiveData$default(FlowKt.flow(new AnonymousClass1(arrayList, this, from, to, null)), (CoroutineContext) null, 0L, 3, (Object) null);
    }
}
