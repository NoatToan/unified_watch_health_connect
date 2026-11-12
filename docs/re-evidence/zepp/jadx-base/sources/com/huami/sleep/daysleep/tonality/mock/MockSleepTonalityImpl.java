package com.huami.sleep.daysleep.tonality.mock;

import com.huami.sky.service.RelaxData;
import com.huami.sky.service.RelaxScore;
import com.huami.sleep.daysleep.tonality.ITonalityDataInterface;
import com.huami.sleep.daysleep.tonality.bean.QueryTonalityBean;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.math.c;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ#\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/huami/sleep/daysleep/tonality/mock/MockSleepTonalityImpl;", "Lcom/huami/sleep/daysleep/tonality/ITonalityDataInterface;", "Lcom/huami/sleep/daysleep/tonality/bean/QueryTonalityBean;", "queryTonalityBean", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/sky/service/RelaxData;", "getSleepTonalityOriginalData", "(Lcom/huami/sleep/daysleep/tonality/bean/QueryTonalityBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class MockSleepTonalityImpl implements ITonalityDataInterface {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "randomCount = " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/sky/service/RelaxData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.daysleep.tonality.mock.MockSleepTonalityImpl$getSleepTonalityOriginalData$3", f = "MockSleepTonalityImpl.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<FlowCollector<? super RelaxData>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ RelaxData c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(RelaxData relaxData, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = relaxData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(this.c, continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector<? super RelaxData> flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.b;
                RelaxData relaxData = this.c;
                this.a = 1;
                if (flowCollector.emit(relaxData, this) == coroutine_suspended) {
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

    @Override // com.huami.sleep.daysleep.tonality.ITonalityDataInterface
    @Nullable
    public Object getSleepTonalityOriginalData(@NotNull QueryTonalityBean queryTonalityBean, @NotNull Continuation<? super Flow<RelaxData>> continuation) {
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"白噪音频", "爵士", "欧美流行"});
        ArrayList arrayList = new ArrayList();
        long baseSleepTime = queryTonalityBean.getBaseSleepTime();
        long j = baseSleepTime - ((long) 10800000);
        arrayList.add(new RelaxScore(20, j));
        arrayList.add(new RelaxScore(30, baseSleepTime - ((long) 10200000)));
        arrayList.add(new RelaxScore(35, baseSleepTime - ((long) 9600000)));
        arrayList.add(new RelaxScore(25, baseSleepTime - ((long) 8880000)));
        arrayList.add(new RelaxScore(40, baseSleepTime - ((long) 8280000)));
        arrayList.add(new RelaxScore(62, baseSleepTime - ((long) 7380000)));
        arrayList.add(new RelaxScore(70, baseSleepTime - ((long) 6180000)));
        arrayList.add(new RelaxScore(75, baseSleepTime - ((long) 4980000)));
        arrayList.add(new RelaxScore(71, baseSleepTime - ((long) 4380000)));
        arrayList.add(new RelaxScore(50, baseSleepTime - ((long) 3480000)));
        arrayList.add(new RelaxScore(50, baseSleepTime - ((long) 2880000)));
        arrayList.add(new RelaxScore(54, baseSleepTime - ((long) 1980000)));
        long j2 = baseSleepTime - ((long) 1200000);
        arrayList.add(new RelaxScore(60, j2));
        boolean z = false;
        if (j <= j2 && j <= j) {
            z = true;
        }
        if (z) {
            HMLog.info("MockSleepTonalityImpl", new a(c.roundToInt((Math.random() * ((double) 50)) + ((double) 20))));
            arrayList.add(new RelaxScore(20, j));
        }
        return FlowKt.flowOn(FlowKt.flow(new b(new RelaxData(listListOf, arrayList, null), null)), Dispatchers.getIO());
    }
}
