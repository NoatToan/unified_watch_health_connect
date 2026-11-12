package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import com.huami.nfc.bus.NoticesEntity;
import com.huami.tools.analytics.DbUtils;
import defpackage.a05;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a4\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a4\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b¢\u0006\u0004\b\t\u0010\b\u001a-\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b\u001a\u001a\u0010\u000e\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\f0\u00022\u0006\u0010\r\u001a\u00020\fH\u0000\u001a6\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000\"\u001c\u0010\u001c\u001a\u00020\u00178\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001a\u0010\u001b\"\u001c\u0010\u001f\u001a\u00020\u00178\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u0012\u0004\b\u001e\u0010\u001b¨\u0006 "}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "value", "Lkotlinx/coroutines/flow/MutableStateFlow;", "MutableStateFlow", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlin/Function1;", "function", "updateAndGet", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "getAndUpdate", "", "update", "", "delta", "increment", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlin/coroutines/CoroutineContext;", DbUtils.Const.Table.CONTEXT, "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlinx/coroutines/flow/Flow;", "fuseStateFlow", "Lkotlinx/coroutines/internal/Symbol;", "a", "Lkotlinx/coroutines/internal/Symbol;", "getNONE$annotations", "()V", NoticesEntity.LOOP_TYPE_NONE, "b", "getPENDING$annotations", "PENDING", "kotlinx-coroutines-core"}, k = 2, mv = {1, 5, 1})
public final class StateFlowKt {

    @NotNull
    private static final Symbol a = new Symbol(NoticesEntity.LOOP_TYPE_NONE);

    @NotNull
    private static final Symbol b = new Symbol("PENDING");

    @NotNull
    public static final <T> MutableStateFlow<T> MutableStateFlow(T t) {
        if (t == null) {
            t = (T) NullSurrogateKt.NULL;
        }
        return new m(t);
    }

    private static /* synthetic */ void a() {
    }

    private static /* synthetic */ void b() {
    }

    @NotNull
    public static final <T> Flow<T> fuseStateFlow(@NotNull StateFlow<? extends T> stateFlow, @NotNull CoroutineContext coroutineContext, int i, @NotNull BufferOverflow bufferOverflow) {
        if (DebugKt.getASSERTIONS_ENABLED()) {
            if (!(i != -1)) {
                throw new AssertionError();
            }
        }
        return (((i >= 0 && i <= 1) || i == -2) && bufferOverflow == BufferOverflow.DROP_OLDEST) ? stateFlow : SharedFlowKt.fuseSharedFlow(stateFlow, coroutineContext, i, bufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
    public static final <T> T getAndUpdate(@NotNull MutableStateFlow<T> mutableStateFlow, @NotNull Function1<? super T, ? extends T> function1) {
        ?? r0;
        do {
            r0 = (Object) mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(r0, function1.invoke(r0)));
        return r0;
    }

    public static final void increment(@NotNull MutableStateFlow<Integer> mutableStateFlow, int i) {
        Integer value;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, Integer.valueOf(value.intValue() + i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void update(@NotNull MutableStateFlow<T> mutableStateFlow, @NotNull Function1<? super T, ? extends T> function1) {
        a05 a05Var;
        do {
            a05Var = (Object) mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(a05Var, function1.invoke(a05Var)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T updateAndGet(@NotNull MutableStateFlow<T> mutableStateFlow, @NotNull Function1<? super T, ? extends T> function1) {
        a05 a05Var;
        T tInvoke;
        do {
            a05Var = (Object) mutableStateFlow.getValue();
            tInvoke = function1.invoke(a05Var);
        } while (!mutableStateFlow.compareAndSet(a05Var, tInvoke));
        return tInvoke;
    }
}
