package kotlinx.coroutines.selects;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.notification.TransportUri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.time.ExperimentalTime;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aN\u0010\u000b\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0007ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001aG\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001f\b\u0004\u0010\r\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0002\b\fH\u0086Hø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000e\u0010\u000f\"\"\u0010\u0016\u001a\u00020\u00068\u0000@\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\"\"\u0010\u001a\u001a\u00020\u00068\u0000@\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u0012\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0018\u0010\u0013\"\u001c\u0010\u001d\u001a\u00020\u00068\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u0012\u0004\b\u001c\u0010\u0015\"\u001c\u0010 \u001a\u00020\u00068\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u0012\u0004\b\u001f\u0010\u0015\"\u001c\u0010%\u001a\u00020!8\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\"\u0010#\u0012\u0004\b$\u0010\u0015\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"R", "Lkotlinx/coroutines/selects/SelectBuilder;", "Lkotlin/time/Duration;", "timeout", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", TransportUri.ACTION_BLOCK, "", "onTimeout-8Mi8wO0", "(Lkotlinx/coroutines/selects/SelectBuilder;JLkotlin/jvm/functions/Function1;)V", "onTimeout", "Lkotlin/ExtensionFunctionType;", "builder", "select", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Ljava/lang/Object;", "getNOT_SELECTED", "()Ljava/lang/Object;", "getNOT_SELECTED$annotations", "()V", "NOT_SELECTED", "b", "getALREADY_SELECTED", "getALREADY_SELECTED$annotations", "ALREADY_SELECTED", "c", "getUNDECIDED$annotations", "UNDECIDED", GoogleApiAvailabilityLight.a, "getRESUMED$annotations", "RESUMED", "Lkotlinx/coroutines/selects/SeqNumber;", "e", "Lkotlinx/coroutines/selects/SeqNumber;", "getSelectOpSequenceNumber$annotations", "selectOpSequenceNumber", "kotlinx-coroutines-core"}, k = 2, mv = {1, 5, 1})
public final class SelectKt {

    @NotNull
    private static final Object a = new Symbol("NOT_SELECTED");

    @NotNull
    private static final Object b = new Symbol("ALREADY_SELECTED");

    @NotNull
    private static final Object c = new Symbol("UNDECIDED");

    @NotNull
    private static final Object d = new Symbol("RESUMED");

    @NotNull
    private static final SeqNumber e = new SeqNumber();

    private static /* synthetic */ void a() {
    }

    private static /* synthetic */ void b() {
    }

    private static /* synthetic */ void c() {
    }

    private static final <R> Object d(Function1<? super SelectBuilder<? super R>, Unit> function1, Continuation<? super R> continuation) throws Throwable {
        InlineMarker.mark(0);
        SelectInstance selectInstance = new SelectInstance(continuation);
        try {
            function1.invoke(selectInstance);
        } catch (Throwable th) {
            selectInstance.handleBuilderException(th);
        }
        Object result = selectInstance.getResult();
        if (result == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        InlineMarker.mark(1);
        return result;
    }

    @NotNull
    public static final Object getALREADY_SELECTED() {
        return b;
    }

    public static /* synthetic */ void getALREADY_SELECTED$annotations() {
    }

    @NotNull
    public static final Object getNOT_SELECTED() {
        return a;
    }

    public static /* synthetic */ void getNOT_SELECTED$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ExperimentalTime
    @ExperimentalCoroutinesApi
    /* JADX INFO: renamed from: onTimeout-8Mi8wO0, reason: not valid java name */
    public static final <R> void m4481onTimeout8Mi8wO0(@NotNull SelectBuilder<? super R> selectBuilder, long j, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1) {
        selectBuilder.onTimeout(DelayKt.m4425toDelayMillisLRDsOJo(j), function1);
    }

    @Nullable
    public static final <R> Object select(@NotNull Function1<? super SelectBuilder<? super R>, Unit> function1, @NotNull Continuation<? super R> continuation) throws Throwable {
        SelectInstance selectInstance = new SelectInstance(continuation);
        try {
            function1.invoke(selectInstance);
        } catch (Throwable th) {
            selectInstance.handleBuilderException(th);
        }
        Object result = selectInstance.getResult();
        if (result == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
