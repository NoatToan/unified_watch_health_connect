package com.huami.pai.ext;

import androidx.exifinterface.media.ExifInterface;
import com.huami.pai.vo.PAIDataVoMin;
import it.sauronsoftware.ftp4j.FTPCodes;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.e;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.pai.ext.PaiDataVoMinExKt$mapWithPai$$inlined$transform$1", f = "PaiDataVoMinEx.kt", i = {}, l = {FTPCodes.NAME_SYSTEM_TIME}, m = "invokeSuspend", n = {}, s = {})
public final class PaiDataVoMinExKt$mapWithPai$$inlined$transform$1 extends SuspendLambda implements Function2<FlowCollector<? super Map<String, PAIDataVoMin>>, Continuation<? super Unit>, Object> {
    private FlowCollector a;
    public Object b;
    public Object c;
    public int d;
    public final /* synthetic */ Flow e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaiDataVoMinExKt$mapWithPai$$inlined$transform$1(Flow flow, Continuation continuation) {
        super(2, continuation);
        this.e = flow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        PaiDataVoMinExKt$mapWithPai$$inlined$transform$1 paiDataVoMinExKt$mapWithPai$$inlined$transform$1 = new PaiDataVoMinExKt$mapWithPai$$inlined$transform$1(this.e, continuation);
        paiDataVoMinExKt$mapWithPai$$inlined$transform$1.a = (FlowCollector) obj;
        return paiDataVoMinExKt$mapWithPai$$inlined$transform$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Map<String, PAIDataVoMin>> flowCollector, Continuation<? super Unit> continuation) {
        return ((PaiDataVoMinExKt$mapWithPai$$inlined$transform$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final FlowCollector flowCollector = this.a;
            Flow flow = this.e;
            FlowCollector<List<PAIDataVoMin>> flowCollector2 = new FlowCollector<List<PAIDataVoMin>>() { // from class: com.huami.pai.ext.PaiDataVoMinExKt$mapWithPai$$inlined$transform$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(List<PAIDataVoMin> list, @NotNull Continuation continuation) {
                    FlowCollector flowCollector3 = flowCollector;
                    List<PAIDataVoMin> list2 = list;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(e.coerceAtLeast(q.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10)), 16));
                    for (Object obj2 : list2) {
                        linkedHashMap.put(PaiDataVoMinExKt.realDateStr((PAIDataVoMin) obj2), obj2);
                    }
                    Object objEmit = flowCollector3.emit(r.toMutableMap(linkedHashMap), continuation);
                    return objEmit == a.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
                }
            };
            this.d = 1;
            if (flow.collect(flowCollector2, this) == coroutine_suspended) {
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
