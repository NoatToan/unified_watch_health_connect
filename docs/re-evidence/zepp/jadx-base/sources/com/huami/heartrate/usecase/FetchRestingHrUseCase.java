package com.huami.heartrate.usecase;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.FlowLiveDataConversions;
import androidx.p008lifecycle.LiveData;
import com.huami.heartrate.dto.RestingHeartRate;
import com.huami.heartrate.repository.IHeartRateRepository;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/huami/heartrate/usecase/FetchRestingHrUseCase;", "", "", "dateFrom", "dateEnd", "Landroidx/lifecycle/LiveData;", "", "Lcom/huami/heartrate/dto/RestingHeartRate;", "fetchRestingHr", "Lcom/huami/heartrate/repository/IHeartRateRepository;", "a", "Lcom/huami/heartrate/repository/IHeartRateRepository;", "repository", "<init>", "(Lcom/huami/heartrate/repository/IHeartRateRepository;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class FetchRestingHrUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IHeartRateRepository repository;

    public FetchRestingHrUseCase(@NotNull IHeartRateRepository iHeartRateRepository) {
        this.repository = iHeartRateRepository;
    }

    @NotNull
    public final LiveData<List<RestingHeartRate>> fetchRestingHr(long dateFrom, long dateEnd) {
        final Flow<List<RestingHeartRate>> flowFetchRestingHr = this.repository.fetchRestingHr(dateFrom, dateEnd);
        return FlowLiveDataConversions.asLiveData$default(FlowKt.flowOn(new Flow<List<? extends RestingHeartRate>>() { // from class: com.huami.heartrate.usecase.FetchRestingHrUseCase$fetchRestingHr$$inlined$map$1

            /* JADX INFO: renamed from: com.huami.heartrate.usecase.FetchRestingHrUseCase$fetchRestingHr$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<List<? extends RestingHeartRate>> {
                public final /* synthetic */ FlowCollector a;
                public final /* synthetic */ FetchRestingHrUseCase$fetchRestingHr$$inlined$map$1 b;

                /* JADX INFO: renamed from: com.huami.heartrate.usecase.FetchRestingHrUseCase$fetchRestingHr$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "value", "Lkotlin/coroutines/Continuation;", "", "continuation", "", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1", "emit"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.heartrate.usecase.FetchRestingHrUseCase$fetchRestingHr$$inlined$map$1$2", f = "FetchRestingHrUseCase.kt", i = {}, l = {135}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object a;
                    public int b;
                    public Object c;
                    public Object d;
                    public Object e;
                    public Object f;
                    public Object g;
                    public Object h;
                    public Object i;
                    public Object j;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, FetchRestingHrUseCase$fetchRestingHr$$inlined$map$1 fetchRestingHrUseCase$fetchRestingHr$$inlined$map$1) {
                    this.a = flowCollector;
                    this.b = fetchRestingHrUseCase$fetchRestingHr$$inlined$map$1;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(List<? extends RestingHeartRate> list, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    ArrayList arrayList;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj = anonymousClass1.a;
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.b;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = this.a;
                        List<? extends RestingHeartRate> list2 = list;
                        if (list2 == null) {
                            arrayList = null;
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : list2) {
                                if (Boxing.boxBoolean(((RestingHeartRate) obj2).getRestingHeartRate() > 0).booleanValue()) {
                                    arrayList2.add(obj2);
                                }
                            }
                            arrayList = arrayList2;
                        }
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super List<? extends RestingHeartRate>> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowFetchRestingHr.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, Dispatchers.getIO()), (CoroutineContext) null, 0L, 3, (Object) null);
    }
}
